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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration details for a service managed Amazon EC2 fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ServiceManagedEc2FleetConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceManagedEc2FleetConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon EC2 instance capabilities.
     * </p>
     */
    private ServiceManagedEc2InstanceCapabilities instanceCapabilities;
    /**
     * <p>
     * The Amazon EC2 market type.
     * </p>
     */
    private ServiceManagedEc2InstanceMarketOptions instanceMarketOptions;

    /**
     * <p>
     * The Amazon EC2 instance capabilities.
     * </p>
     * 
     * @param instanceCapabilities
     *        The Amazon EC2 instance capabilities.
     */

    public void setInstanceCapabilities(ServiceManagedEc2InstanceCapabilities instanceCapabilities) {
        this.instanceCapabilities = instanceCapabilities;
    }

    /**
     * <p>
     * The Amazon EC2 instance capabilities.
     * </p>
     * 
     * @return The Amazon EC2 instance capabilities.
     */

    public ServiceManagedEc2InstanceCapabilities getInstanceCapabilities() {
        return this.instanceCapabilities;
    }

    /**
     * <p>
     * The Amazon EC2 instance capabilities.
     * </p>
     * 
     * @param instanceCapabilities
     *        The Amazon EC2 instance capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceManagedEc2FleetConfiguration withInstanceCapabilities(ServiceManagedEc2InstanceCapabilities instanceCapabilities) {
        setInstanceCapabilities(instanceCapabilities);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 market type.
     * </p>
     * 
     * @param instanceMarketOptions
     *        The Amazon EC2 market type.
     */

    public void setInstanceMarketOptions(ServiceManagedEc2InstanceMarketOptions instanceMarketOptions) {
        this.instanceMarketOptions = instanceMarketOptions;
    }

    /**
     * <p>
     * The Amazon EC2 market type.
     * </p>
     * 
     * @return The Amazon EC2 market type.
     */

    public ServiceManagedEc2InstanceMarketOptions getInstanceMarketOptions() {
        return this.instanceMarketOptions;
    }

    /**
     * <p>
     * The Amazon EC2 market type.
     * </p>
     * 
     * @param instanceMarketOptions
     *        The Amazon EC2 market type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceManagedEc2FleetConfiguration withInstanceMarketOptions(ServiceManagedEc2InstanceMarketOptions instanceMarketOptions) {
        setInstanceMarketOptions(instanceMarketOptions);
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
        if (getInstanceCapabilities() != null)
            sb.append("InstanceCapabilities: ").append(getInstanceCapabilities()).append(",");
        if (getInstanceMarketOptions() != null)
            sb.append("InstanceMarketOptions: ").append(getInstanceMarketOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceManagedEc2FleetConfiguration == false)
            return false;
        ServiceManagedEc2FleetConfiguration other = (ServiceManagedEc2FleetConfiguration) obj;
        if (other.getInstanceCapabilities() == null ^ this.getInstanceCapabilities() == null)
            return false;
        if (other.getInstanceCapabilities() != null && other.getInstanceCapabilities().equals(this.getInstanceCapabilities()) == false)
            return false;
        if (other.getInstanceMarketOptions() == null ^ this.getInstanceMarketOptions() == null)
            return false;
        if (other.getInstanceMarketOptions() != null && other.getInstanceMarketOptions().equals(this.getInstanceMarketOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceCapabilities() == null) ? 0 : getInstanceCapabilities().hashCode());
        hashCode = prime * hashCode + ((getInstanceMarketOptions() == null) ? 0 : getInstanceMarketOptions().hashCode());
        return hashCode;
    }

    @Override
    public ServiceManagedEc2FleetConfiguration clone() {
        try {
            return (ServiceManagedEc2FleetConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.ServiceManagedEc2FleetConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
