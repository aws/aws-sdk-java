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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An entitlement that has been granted to you from other AWS accounts.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListedEntitlement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListedEntitlement implements Serializable, Cloneable, StructuredPojo {

    /** The ARN of the entitlement. */
    private String entitlementArn;
    /** The name of the entitlement. */
    private String entitlementName;

    /**
     * The ARN of the entitlement.
     * 
     * @param entitlementArn
     *        The ARN of the entitlement.
     */

    public void setEntitlementArn(String entitlementArn) {
        this.entitlementArn = entitlementArn;
    }

    /**
     * The ARN of the entitlement.
     * 
     * @return The ARN of the entitlement.
     */

    public String getEntitlementArn() {
        return this.entitlementArn;
    }

    /**
     * The ARN of the entitlement.
     * 
     * @param entitlementArn
     *        The ARN of the entitlement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedEntitlement withEntitlementArn(String entitlementArn) {
        setEntitlementArn(entitlementArn);
        return this;
    }

    /**
     * The name of the entitlement.
     * 
     * @param entitlementName
     *        The name of the entitlement.
     */

    public void setEntitlementName(String entitlementName) {
        this.entitlementName = entitlementName;
    }

    /**
     * The name of the entitlement.
     * 
     * @return The name of the entitlement.
     */

    public String getEntitlementName() {
        return this.entitlementName;
    }

    /**
     * The name of the entitlement.
     * 
     * @param entitlementName
     *        The name of the entitlement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedEntitlement withEntitlementName(String entitlementName) {
        setEntitlementName(entitlementName);
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
        if (getEntitlementArn() != null)
            sb.append("EntitlementArn: ").append(getEntitlementArn()).append(",");
        if (getEntitlementName() != null)
            sb.append("EntitlementName: ").append(getEntitlementName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListedEntitlement == false)
            return false;
        ListedEntitlement other = (ListedEntitlement) obj;
        if (other.getEntitlementArn() == null ^ this.getEntitlementArn() == null)
            return false;
        if (other.getEntitlementArn() != null && other.getEntitlementArn().equals(this.getEntitlementArn()) == false)
            return false;
        if (other.getEntitlementName() == null ^ this.getEntitlementName() == null)
            return false;
        if (other.getEntitlementName() != null && other.getEntitlementName().equals(this.getEntitlementName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntitlementArn() == null) ? 0 : getEntitlementArn().hashCode());
        hashCode = prime * hashCode + ((getEntitlementName() == null) ? 0 : getEntitlementName().hashCode());
        return hashCode;
    }

    @Override
    public ListedEntitlement clone() {
        try {
            return (ListedEntitlement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.ListedEntitlementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
