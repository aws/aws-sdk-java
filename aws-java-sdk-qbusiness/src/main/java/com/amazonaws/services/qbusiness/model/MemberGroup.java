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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The sub groups that belong to a group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/MemberGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the sub group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The type of the sub group.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the sub group.
     * </p>
     * 
     * @param groupName
     *        The name of the sub group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the sub group.
     * </p>
     * 
     * @return The name of the sub group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the sub group.
     * </p>
     * 
     * @param groupName
     *        The name of the sub group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberGroup withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The type of the sub group.
     * </p>
     * 
     * @param type
     *        The type of the sub group.
     * @see MembershipType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the sub group.
     * </p>
     * 
     * @return The type of the sub group.
     * @see MembershipType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the sub group.
     * </p>
     * 
     * @param type
     *        The type of the sub group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipType
     */

    public MemberGroup withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the sub group.
     * </p>
     * 
     * @param type
     *        The type of the sub group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipType
     */

    public MemberGroup withType(MembershipType type) {
        this.type = type.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberGroup == false)
            return false;
        MemberGroup other = (MemberGroup) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public MemberGroup clone() {
        try {
            return (MemberGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.MemberGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
