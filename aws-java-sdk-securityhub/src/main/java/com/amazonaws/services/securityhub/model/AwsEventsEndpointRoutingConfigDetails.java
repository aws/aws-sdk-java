/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about the routing configuration of the endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEventsEndpointRoutingConfigDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEventsEndpointRoutingConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The failover configuration for an endpoint. This includes what triggers failover and what happens when it's
     * triggered.
     * </p>
     */
    private AwsEventsEndpointRoutingConfigFailoverConfigDetails failoverConfig;

    /**
     * <p>
     * The failover configuration for an endpoint. This includes what triggers failover and what happens when it's
     * triggered.
     * </p>
     * 
     * @param failoverConfig
     *        The failover configuration for an endpoint. This includes what triggers failover and what happens when
     *        it's triggered.
     */

    public void setFailoverConfig(AwsEventsEndpointRoutingConfigFailoverConfigDetails failoverConfig) {
        this.failoverConfig = failoverConfig;
    }

    /**
     * <p>
     * The failover configuration for an endpoint. This includes what triggers failover and what happens when it's
     * triggered.
     * </p>
     * 
     * @return The failover configuration for an endpoint. This includes what triggers failover and what happens when
     *         it's triggered.
     */

    public AwsEventsEndpointRoutingConfigFailoverConfigDetails getFailoverConfig() {
        return this.failoverConfig;
    }

    /**
     * <p>
     * The failover configuration for an endpoint. This includes what triggers failover and what happens when it's
     * triggered.
     * </p>
     * 
     * @param failoverConfig
     *        The failover configuration for an endpoint. This includes what triggers failover and what happens when
     *        it's triggered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventsEndpointRoutingConfigDetails withFailoverConfig(AwsEventsEndpointRoutingConfigFailoverConfigDetails failoverConfig) {
        setFailoverConfig(failoverConfig);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFailoverConfig() != null)
            sb.append("FailoverConfig: ").append(getFailoverConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEventsEndpointRoutingConfigDetails == false)
            return false;
        AwsEventsEndpointRoutingConfigDetails other = (AwsEventsEndpointRoutingConfigDetails) obj;
        if (other.getFailoverConfig() == null ^ this.getFailoverConfig() == null)
            return false;
        if (other.getFailoverConfig() != null && other.getFailoverConfig().equals(this.getFailoverConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailoverConfig() == null) ? 0 : getFailoverConfig().hashCode());
        return hashCode;
    }

    @Override
    public AwsEventsEndpointRoutingConfigDetails clone() {
        try {
            return (AwsEventsEndpointRoutingConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEventsEndpointRoutingConfigDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
