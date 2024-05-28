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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information of the IP address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/IpAddressMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpAddressMember implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IP address.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The primary IP address.
     * </p>
     */
    private Boolean primary;
    /**
     * <p>
     * The type of allocation for the IP address.
     * </p>
     */
    private String allocationType;

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param ipAddress
     *        The IP address.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @return The IP address.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param ipAddress
     *        The IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressMember withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The primary IP address.
     * </p>
     * 
     * @param primary
     *        The primary IP address.
     */

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    /**
     * <p>
     * The primary IP address.
     * </p>
     * 
     * @return The primary IP address.
     */

    public Boolean getPrimary() {
        return this.primary;
    }

    /**
     * <p>
     * The primary IP address.
     * </p>
     * 
     * @param primary
     *        The primary IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressMember withPrimary(Boolean primary) {
        setPrimary(primary);
        return this;
    }

    /**
     * <p>
     * The primary IP address.
     * </p>
     * 
     * @return The primary IP address.
     */

    public Boolean isPrimary() {
        return this.primary;
    }

    /**
     * <p>
     * The type of allocation for the IP address.
     * </p>
     * 
     * @param allocationType
     *        The type of allocation for the IP address.
     * @see AllocationType
     */

    public void setAllocationType(String allocationType) {
        this.allocationType = allocationType;
    }

    /**
     * <p>
     * The type of allocation for the IP address.
     * </p>
     * 
     * @return The type of allocation for the IP address.
     * @see AllocationType
     */

    public String getAllocationType() {
        return this.allocationType;
    }

    /**
     * <p>
     * The type of allocation for the IP address.
     * </p>
     * 
     * @param allocationType
     *        The type of allocation for the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllocationType
     */

    public IpAddressMember withAllocationType(String allocationType) {
        setAllocationType(allocationType);
        return this;
    }

    /**
     * <p>
     * The type of allocation for the IP address.
     * </p>
     * 
     * @param allocationType
     *        The type of allocation for the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllocationType
     */

    public IpAddressMember withAllocationType(AllocationType allocationType) {
        this.allocationType = allocationType.toString();
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
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getPrimary() != null)
            sb.append("Primary: ").append(getPrimary()).append(",");
        if (getAllocationType() != null)
            sb.append("AllocationType: ").append(getAllocationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpAddressMember == false)
            return false;
        IpAddressMember other = (IpAddressMember) obj;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getPrimary() == null ^ this.getPrimary() == null)
            return false;
        if (other.getPrimary() != null && other.getPrimary().equals(this.getPrimary()) == false)
            return false;
        if (other.getAllocationType() == null ^ this.getAllocationType() == null)
            return false;
        if (other.getAllocationType() != null && other.getAllocationType().equals(this.getAllocationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPrimary() == null) ? 0 : getPrimary().hashCode());
        hashCode = prime * hashCode + ((getAllocationType() == null) ? 0 : getAllocationType().hashCode());
        return hashCode;
    }

    @Override
    public IpAddressMember clone() {
        try {
            return (IpAddressMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.IpAddressMemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
