/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains changes to an existing service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ServiceChange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceChange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description for the service.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create
     * when you register an instance.
     * </p>
     */
    private DnsConfigChange dnsConfig;

    private HealthCheckConfig healthCheckConfig;

    /**
     * <p>
     * A description for the service.
     * </p>
     * 
     * @param description
     *        A description for the service.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the service.
     * </p>
     * 
     * @return A description for the service.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the service.
     * </p>
     * 
     * @param description
     *        A description for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceChange withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create
     * when you register an instance.
     * </p>
     * 
     * @param dnsConfig
     *        A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to
     *        create when you register an instance.
     */

    public void setDnsConfig(DnsConfigChange dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create
     * when you register an instance.
     * </p>
     * 
     * @return A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to
     *         create when you register an instance.
     */

    public DnsConfigChange getDnsConfig() {
        return this.dnsConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create
     * when you register an instance.
     * </p>
     * 
     * @param dnsConfig
     *        A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to
     *        create when you register an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceChange withDnsConfig(DnsConfigChange dnsConfig) {
        setDnsConfig(dnsConfig);
        return this;
    }

    /**
     * @param healthCheckConfig
     */

    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    /**
     * @return
     */

    public HealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * @param healthCheckConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceChange withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        setHealthCheckConfig(healthCheckConfig);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDnsConfig() != null)
            sb.append("DnsConfig: ").append(getDnsConfig()).append(",");
        if (getHealthCheckConfig() != null)
            sb.append("HealthCheckConfig: ").append(getHealthCheckConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceChange == false)
            return false;
        ServiceChange other = (ServiceChange) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDnsConfig() == null ^ this.getDnsConfig() == null)
            return false;
        if (other.getDnsConfig() != null && other.getDnsConfig().equals(this.getDnsConfig()) == false)
            return false;
        if (other.getHealthCheckConfig() == null ^ this.getHealthCheckConfig() == null)
            return false;
        if (other.getHealthCheckConfig() != null && other.getHealthCheckConfig().equals(this.getHealthCheckConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDnsConfig() == null) ? 0 : getDnsConfig().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckConfig() == null) ? 0 : getHealthCheckConfig().hashCode());
        return hashCode;
    }

    @Override
    public ServiceChange clone() {
        try {
            return (ServiceChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.ServiceChangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
