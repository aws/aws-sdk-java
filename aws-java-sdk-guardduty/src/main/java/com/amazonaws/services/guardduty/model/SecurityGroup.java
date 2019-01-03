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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Security groups associated with the EC2 instance.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/SecurityGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityGroup implements Serializable, Cloneable, StructuredPojo {

    /** EC2 instance's security group ID. */
    private String groupId;
    /** EC2 instance's security group name. */
    private String groupName;

    /**
     * EC2 instance's security group ID.
     * 
     * @param groupId
     *        EC2 instance's security group ID.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * EC2 instance's security group ID.
     * 
     * @return EC2 instance's security group ID.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * EC2 instance's security group ID.
     * 
     * @param groupId
     *        EC2 instance's security group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroup withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * EC2 instance's security group name.
     * 
     * @param groupName
     *        EC2 instance's security group name.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * EC2 instance's security group name.
     * 
     * @return EC2 instance's security group name.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * EC2 instance's security group name.
     * 
     * @param groupName
     *        EC2 instance's security group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityGroup withGroupName(String groupName) {
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

        if (obj instanceof SecurityGroup == false)
            return false;
        SecurityGroup other = (SecurityGroup) obj;
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
    public SecurityGroup clone() {
        try {
            return (SecurityGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.SecurityGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
