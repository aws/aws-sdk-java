/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3;

import com.amazonaws.annotation.SdkInternalApi;


@SdkInternalApi
public final class EndpointParams {
    private String protocol;
    private String domain;
    private boolean dualStackEnabled;
    private boolean fipsEnabled;

    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the protocol
     *
     * @param protocol The new protocol value.
     * @return This object for method chaining.
     */
    public EndpointParams withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }


    public String getDomain() {
        return domain;
    }

    /**
     * Sets the domain
     *
     * @param domain The new domain value.
     * @return This object for method chaining.
     */
    public EndpointParams withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public boolean isDualStackEnabled() {
        return dualStackEnabled;
    }

    /**
     * Sets if dualStack is enabled or not
     *
     * @param dualStackEnabled The new dualStackEnabled value.
     * @return This object for method chaining.
     */
    public EndpointParams withDualStackEnabled(boolean dualStackEnabled) {
        this.dualStackEnabled = dualStackEnabled;
        return this;
    }

    public boolean isFipsEnabled() {
        return fipsEnabled;
    }

    /**
     * Sets if fipsEnabled is enabled or not
     *
     * @param fipsEnabled The new fipsEnabled value.
     * @return This object for method chaining.
     */
    public EndpointParams withFipsEnabled(boolean fipsEnabled) {
        this.fipsEnabled = fipsEnabled;
        return this;
    }
}
