/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A security group associated with the network interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2NetworkInterfaceSecurityGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2NetworkInterfaceSecurityGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the security group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The ID of the security group.
     * </p>
     */
    private String groupId;

    /**
     * <p>
     * The name of the security group.
     * </p>
     * 
     * @param groupName
     *        The name of the security group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * 
     * @return The name of the security group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * 
     * @param groupName
     *        The name of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceSecurityGroup withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * 
     * @return The ID of the security group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceSecurityGroup withGroupId(String groupId) {
        setGroupId(groupId);
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2NetworkInterfaceSecurityGroup == false)
            return false;
        AwsEc2NetworkInterfaceSecurityGroup other = (AwsEc2NetworkInterfaceSecurityGroup) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2NetworkInterfaceSecurityGroup clone() {
        try {
            return (AwsEc2NetworkInterfaceSecurityGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2NetworkInterfaceSecurityGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
