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
 * The name and ARN of a group.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupNameAndArn implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The group name.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The group ARN.
     * </p>
     */
    private String groupArn;

    /**
     * <p>
     * The group name.
     * </p>
     * 
     * @param groupName
     *        The group name.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The group name.
     * </p>
     * 
     * @return The group name.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The group name.
     * </p>
     * 
     * @param groupName
     *        The group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupNameAndArn withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The group ARN.
     * </p>
     * 
     * @param groupArn
     *        The group ARN.
     */

    public void setGroupArn(String groupArn) {
        this.groupArn = groupArn;
    }

    /**
     * <p>
     * The group ARN.
     * </p>
     * 
     * @return The group ARN.
     */

    public String getGroupArn() {
        return this.groupArn;
    }

    /**
     * <p>
     * The group ARN.
     * </p>
     * 
     * @param groupArn
     *        The group ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupNameAndArn withGroupArn(String groupArn) {
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

        if (obj instanceof GroupNameAndArn == false)
            return false;
        GroupNameAndArn other = (GroupNameAndArn) obj;
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
    public GroupNameAndArn clone() {
        try {
            return (GroupNameAndArn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.GroupNameAndArnMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
