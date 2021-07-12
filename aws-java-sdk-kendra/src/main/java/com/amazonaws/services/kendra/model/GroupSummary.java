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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Group summary information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GroupSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the group you want group summary information on.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action.
     * </p>
     */
    private Long orderingId;

    /**
     * <p>
     * The identifier of the group you want group summary information on.
     * </p>
     * 
     * @param groupId
     *        The identifier of the group you want group summary information on.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The identifier of the group you want group summary information on.
     * </p>
     * 
     * @return The identifier of the group you want group summary information on.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The identifier of the group you want group summary information on.
     * </p>
     * 
     * @param groupId
     *        The identifier of the group you want group summary information on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupSummary withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action.
     * </p>
     * 
     * @param orderingId
     *        The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action.
     */

    public void setOrderingId(Long orderingId) {
        this.orderingId = orderingId;
    }

    /**
     * <p>
     * The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action.
     * </p>
     * 
     * @return The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action.
     */

    public Long getOrderingId() {
        return this.orderingId;
    }

    /**
     * <p>
     * The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action.
     * </p>
     * 
     * @param orderingId
     *        The timestamp identifier used for the latest <code>PUT</code> or <code>DELETE</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupSummary withOrderingId(Long orderingId) {
        setOrderingId(orderingId);
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
        if (getOrderingId() != null)
            sb.append("OrderingId: ").append(getOrderingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupSummary == false)
            return false;
        GroupSummary other = (GroupSummary) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getOrderingId() == null ^ this.getOrderingId() == null)
            return false;
        if (other.getOrderingId() != null && other.getOrderingId().equals(this.getOrderingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getOrderingId() == null) ? 0 : getOrderingId().hashCode());
        return hashCode;
    }

    @Override
    public GroupSummary clone() {
        try {
            return (GroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.GroupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
