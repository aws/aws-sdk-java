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
 * Fleet configuration details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/FleetConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The customer managed fleets within a fleet configuration.
     * </p>
     */
    private CustomerManagedFleetConfiguration customerManaged;
    /**
     * <p>
     * The service managed Amazon EC2 instances for a fleet configuration.
     * </p>
     */
    private ServiceManagedEc2FleetConfiguration serviceManagedEc2;

    /**
     * <p>
     * The customer managed fleets within a fleet configuration.
     * </p>
     * 
     * @param customerManaged
     *        The customer managed fleets within a fleet configuration.
     */

    public void setCustomerManaged(CustomerManagedFleetConfiguration customerManaged) {
        this.customerManaged = customerManaged;
    }

    /**
     * <p>
     * The customer managed fleets within a fleet configuration.
     * </p>
     * 
     * @return The customer managed fleets within a fleet configuration.
     */

    public CustomerManagedFleetConfiguration getCustomerManaged() {
        return this.customerManaged;
    }

    /**
     * <p>
     * The customer managed fleets within a fleet configuration.
     * </p>
     * 
     * @param customerManaged
     *        The customer managed fleets within a fleet configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetConfiguration withCustomerManaged(CustomerManagedFleetConfiguration customerManaged) {
        setCustomerManaged(customerManaged);
        return this;
    }

    /**
     * <p>
     * The service managed Amazon EC2 instances for a fleet configuration.
     * </p>
     * 
     * @param serviceManagedEc2
     *        The service managed Amazon EC2 instances for a fleet configuration.
     */

    public void setServiceManagedEc2(ServiceManagedEc2FleetConfiguration serviceManagedEc2) {
        this.serviceManagedEc2 = serviceManagedEc2;
    }

    /**
     * <p>
     * The service managed Amazon EC2 instances for a fleet configuration.
     * </p>
     * 
     * @return The service managed Amazon EC2 instances for a fleet configuration.
     */

    public ServiceManagedEc2FleetConfiguration getServiceManagedEc2() {
        return this.serviceManagedEc2;
    }

    /**
     * <p>
     * The service managed Amazon EC2 instances for a fleet configuration.
     * </p>
     * 
     * @param serviceManagedEc2
     *        The service managed Amazon EC2 instances for a fleet configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetConfiguration withServiceManagedEc2(ServiceManagedEc2FleetConfiguration serviceManagedEc2) {
        setServiceManagedEc2(serviceManagedEc2);
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
        if (getCustomerManaged() != null)
            sb.append("CustomerManaged: ").append(getCustomerManaged()).append(",");
        if (getServiceManagedEc2() != null)
            sb.append("ServiceManagedEc2: ").append(getServiceManagedEc2());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetConfiguration == false)
            return false;
        FleetConfiguration other = (FleetConfiguration) obj;
        if (other.getCustomerManaged() == null ^ this.getCustomerManaged() == null)
            return false;
        if (other.getCustomerManaged() != null && other.getCustomerManaged().equals(this.getCustomerManaged()) == false)
            return false;
        if (other.getServiceManagedEc2() == null ^ this.getServiceManagedEc2() == null)
            return false;
        if (other.getServiceManagedEc2() != null && other.getServiceManagedEc2().equals(this.getServiceManagedEc2()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerManaged() == null) ? 0 : getCustomerManaged().hashCode());
        hashCode = prime * hashCode + ((getServiceManagedEc2() == null) ? 0 : getServiceManagedEc2().hashCode());
        return hashCode;
    }

    @Override
    public FleetConfiguration clone() {
        try {
            return (FleetConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.FleetConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
