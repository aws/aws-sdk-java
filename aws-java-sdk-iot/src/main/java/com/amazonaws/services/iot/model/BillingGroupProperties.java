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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties of a billing group.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BillingGroupProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the billing group.
     * </p>
     */
    private String billingGroupDescription;

    /**
     * <p>
     * The description of the billing group.
     * </p>
     * 
     * @param billingGroupDescription
     *        The description of the billing group.
     */

    public void setBillingGroupDescription(String billingGroupDescription) {
        this.billingGroupDescription = billingGroupDescription;
    }

    /**
     * <p>
     * The description of the billing group.
     * </p>
     * 
     * @return The description of the billing group.
     */

    public String getBillingGroupDescription() {
        return this.billingGroupDescription;
    }

    /**
     * <p>
     * The description of the billing group.
     * </p>
     * 
     * @param billingGroupDescription
     *        The description of the billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingGroupProperties withBillingGroupDescription(String billingGroupDescription) {
        setBillingGroupDescription(billingGroupDescription);
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
        if (getBillingGroupDescription() != null)
            sb.append("BillingGroupDescription: ").append(getBillingGroupDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BillingGroupProperties == false)
            return false;
        BillingGroupProperties other = (BillingGroupProperties) obj;
        if (other.getBillingGroupDescription() == null ^ this.getBillingGroupDescription() == null)
            return false;
        if (other.getBillingGroupDescription() != null && other.getBillingGroupDescription().equals(this.getBillingGroupDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBillingGroupDescription() == null) ? 0 : getBillingGroupDescription().hashCode());
        return hashCode;
    }

    @Override
    public BillingGroupProperties clone() {
        try {
            return (BillingGroupProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.BillingGroupPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
