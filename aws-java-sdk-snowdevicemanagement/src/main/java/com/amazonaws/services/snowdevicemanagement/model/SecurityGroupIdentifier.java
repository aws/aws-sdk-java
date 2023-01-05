/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the device's security group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/SecurityGroupIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityGroupIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The security group ID.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The security group name.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * The security group ID.
     * </p>
     * 
     * @param groupId
     *        The security group ID.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The security group ID.
     * </p>
     * 
     * @return The security group ID.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The security group ID.
     * </p>
     * 
     * @param groupId
     *        The security group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupIdentifier withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The security group name.
     * </p>
     * 
     * @param groupName
     *        The security group name.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The security group name.
     * </p>
     * 
     * @return The security group name.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The security group name.
     * </p>
     * 
     * @param groupName
     *        The security group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroupIdentifier withGroupName(String groupName) {
        setGroupName(groupName);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityGroupIdentifier == false)
            return false;
        SecurityGroupIdentifier other = (SecurityGroupIdentifier) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        return hashCode;
    }

    @Override
    public SecurityGroupIdentifier clone() {
        try {
            return (SecurityGroupIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowdevicemanagement.model.transform.SecurityGroupIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
