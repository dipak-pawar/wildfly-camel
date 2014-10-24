/*
 * #%L
 * Wildfly Camel :: Subsystem
 * %%
 * Copyright (C) 2013 - 2014 RedHat
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


package org.wildfly.extension.camel;

import org.apache.camel.CamelContext;

/**
 * An abstraction of {@link CamelContext} registration.
 *
 * The {@link CamelContextRegistry} is the entry point for {@link CamelContext} registration and lookup.
 *
 * @see {@link CamelContextRegistryService}
 *
 * @author Thomas.Diesler@jboss.com
 * @since 19-Apr-2013
 */
public interface CamelContextRegistry {

    /** Get the camel context for the given name */
    CamelContext getCamelContext(String name);

    /** Register the camel context in this registry */
    CamelContextRegistration registerCamelContext(CamelContext camelctx);

    /** The return handle for camel context registrations */
    interface CamelContextRegistration {

        CamelContext getCamelContext();

        void unregister();
    }
}