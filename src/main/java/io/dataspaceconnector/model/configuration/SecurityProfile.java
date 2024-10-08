/*
 * Copyright 2020-2022 Fraunhofer Institute for Software and Systems Engineering
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.dataspaceconnector.model.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enumeration for security profiles.
 */
public enum SecurityProfile {

    /**
     * Security profile is base.
     */
    @JsonProperty("Base Security")
    BASE_SECURITY,

    /**
     * Security profile is trust plus.
     */
    @JsonProperty("Trust Plus Security")
    TRUST_PLUS_SECURITY,

    /**
     * Security profile is trust.
     */
    @JsonProperty("Trust Security")
    TRUST_SECURITY
}
