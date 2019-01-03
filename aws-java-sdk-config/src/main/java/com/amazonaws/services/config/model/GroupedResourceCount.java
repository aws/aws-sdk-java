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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The count of resources that are grouped by the group name.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GroupedResourceCount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupedResourceCount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the group that can be region, account ID, or resource type. For example, region1, region2 if the
     * region was chosen as <code>GroupByKey</code>.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The number of resources in the group.
     * </p>
     */
    private Long resourceCount;

    /**
     * <p>
     * The name of the group that can be region, account ID, or resource type. For example, region1, region2 if the
     * region was chosen as <code>GroupByKey</code>.
     * </p>
     * 
     * @param groupName
     *        The name of the group that can be region, account ID, or resource type. For example, region1, region2 if
     *        the region was chosen as <code>GroupByKey</code>.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group that can be region, account ID, or resource type. For example, region1, region2 if the
     * region was chosen as <code>GroupByKey</code>.
     * </p>
     * 
     * @return The name of the group that can be region, account ID, or resource type. For example, region1, region2 if
     *         the region was chosen as <code>GroupByKey</code>.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the group that can be region, account ID, or resource type. For example, region1, region2 if the
     * region was chosen as <code>GroupByKey</code>.
     * </p>
     * 
     * @param groupName
     *        The name of the group that can be region, account ID, or resource type. For example, region1, region2 if
     *        the region was chosen as <code>GroupByKey</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupedResourceCount withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The number of resources in the group.
     * </p>
     * 
     * @param resourceCount
     *        The number of resources in the group.
     */

    public void setResourceCount(Long resourceCount) {
        this.resourceCount = resourceCount;
    }

    /**
     * <p>
     * The number of resources in the group.
     * </p>
     * 
     * @return The number of resources in the group.
     */

    public Long getResourceCount() {
        return this.resourceCount;
    }

    /**
     * <p>
     * The number of resources in the group.
     * </p>
     * 
     * @param resourceCount
     *        The number of resources in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupedResourceCount withResourceCount(Long resourceCount) {
        setResourceCount(resourceCount);
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
        if (getResourceCount() != null)
            sb.append("ResourceCount: ").append(getResourceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupedResourceCount == false)
            return false;
        GroupedResourceCount other = (GroupedResourceCount) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getResourceCount() == null ^ this.getResourceCount() == null)
            return false;
        if (other.getResourceCount() != null && other.getResourceCount().equals(this.getResourceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getResourceCount() == null) ? 0 : getResourceCount().hashCode());
        return hashCode;
    }

    @Override
    public GroupedResourceCount clone() {
        try {
            return (GroupedResourceCount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.GroupedResourceCountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
