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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The ARN and group name of a group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GroupIdentifier" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a resource group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The ARN of a resource group.
     * </p>
     */
    private String groupArn;

    /**
     * <p>
     * The name of a resource group.
     * </p>
     * 
     * @param groupName
     *        The name of a resource group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of a resource group.
     * </p>
     * 
     * @return The name of a resource group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of a resource group.
     * </p>
     * 
     * @param groupName
     *        The name of a resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupIdentifier withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The ARN of a resource group.
     * </p>
     * 
     * @param groupArn
     *        The ARN of a resource group.
     */

    public void setGroupArn(String groupArn) {
        this.groupArn = groupArn;
    }

    /**
     * <p>
     * The ARN of a resource group.
     * </p>
     * 
     * @return The ARN of a resource group.
     */

    public String getGroupArn() {
        return this.groupArn;
    }

    /**
     * <p>
     * The ARN of a resource group.
     * </p>
     * 
     * @param groupArn
     *        The ARN of a resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupIdentifier withGroupArn(String groupArn) {
        setGroupArn(groupArn);
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
        if (getGroupArn() != null)
            sb.append("GroupArn: ").append(getGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupIdentifier == false)
            return false;
        GroupIdentifier other = (GroupIdentifier) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroupArn() == null ^ this.getGroupArn() == null)
            return false;
        if (other.getGroupArn() != null && other.getGroupArn().equals(this.getGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroupArn() == null) ? 0 : getGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public GroupIdentifier clone() {
        try {
            return (GroupIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroups.model.transform.GroupIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
