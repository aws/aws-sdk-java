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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the physical requirements for a connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/PhysicalConnectionRequirements"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhysicalConnectionRequirements implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subnet ID used by the connection.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The security group ID list used by the connection.
     * </p>
     */
    private java.util.List<String> securityGroupIdList;
    /**
     * <p>
     * The connection's Availability Zone. This field is redundant because the specified subnet implies the Availability
     * Zone to be used. Currently the field must be populated, but it will be deprecated in the future.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The subnet ID used by the connection.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID used by the connection.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID used by the connection.
     * </p>
     * 
     * @return The subnet ID used by the connection.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The subnet ID used by the connection.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID used by the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalConnectionRequirements withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The security group ID list used by the connection.
     * </p>
     * 
     * @return The security group ID list used by the connection.
     */

    public java.util.List<String> getSecurityGroupIdList() {
        return securityGroupIdList;
    }

    /**
     * <p>
     * The security group ID list used by the connection.
     * </p>
     * 
     * @param securityGroupIdList
     *        The security group ID list used by the connection.
     */

    public void setSecurityGroupIdList(java.util.Collection<String> securityGroupIdList) {
        if (securityGroupIdList == null) {
            this.securityGroupIdList = null;
            return;
        }

        this.securityGroupIdList = new java.util.ArrayList<String>(securityGroupIdList);
    }

    /**
     * <p>
     * The security group ID list used by the connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIdList(java.util.Collection)} or {@link #withSecurityGroupIdList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param securityGroupIdList
     *        The security group ID list used by the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalConnectionRequirements withSecurityGroupIdList(String... securityGroupIdList) {
        if (this.securityGroupIdList == null) {
            setSecurityGroupIdList(new java.util.ArrayList<String>(securityGroupIdList.length));
        }
        for (String ele : securityGroupIdList) {
            this.securityGroupIdList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security group ID list used by the connection.
     * </p>
     * 
     * @param securityGroupIdList
     *        The security group ID list used by the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalConnectionRequirements withSecurityGroupIdList(java.util.Collection<String> securityGroupIdList) {
        setSecurityGroupIdList(securityGroupIdList);
        return this;
    }

    /**
     * <p>
     * The connection's Availability Zone. This field is redundant because the specified subnet implies the Availability
     * Zone to be used. Currently the field must be populated, but it will be deprecated in the future.
     * </p>
     * 
     * @param availabilityZone
     *        The connection's Availability Zone. This field is redundant because the specified subnet implies the
     *        Availability Zone to be used. Currently the field must be populated, but it will be deprecated in the
     *        future.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The connection's Availability Zone. This field is redundant because the specified subnet implies the Availability
     * Zone to be used. Currently the field must be populated, but it will be deprecated in the future.
     * </p>
     * 
     * @return The connection's Availability Zone. This field is redundant because the specified subnet implies the
     *         Availability Zone to be used. Currently the field must be populated, but it will be deprecated in the
     *         future.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The connection's Availability Zone. This field is redundant because the specified subnet implies the Availability
     * Zone to be used. Currently the field must be populated, but it will be deprecated in the future.
     * </p>
     * 
     * @param availabilityZone
     *        The connection's Availability Zone. This field is redundant because the specified subnet implies the
     *        Availability Zone to be used. Currently the field must be populated, but it will be deprecated in the
     *        future.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalConnectionRequirements withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
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
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getSecurityGroupIdList() != null)
            sb.append("SecurityGroupIdList: ").append(getSecurityGroupIdList()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhysicalConnectionRequirements == false)
            return false;
        PhysicalConnectionRequirements other = (PhysicalConnectionRequirements) obj;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getSecurityGroupIdList() == null ^ this.getSecurityGroupIdList() == null)
            return false;
        if (other.getSecurityGroupIdList() != null && other.getSecurityGroupIdList().equals(this.getSecurityGroupIdList()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIdList() == null) ? 0 : getSecurityGroupIdList().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        return hashCode;
    }

    @Override
    public PhysicalConnectionRequirements clone() {
        try {
            return (PhysicalConnectionRequirements) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.PhysicalConnectionRequirementsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
