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
 * The underlying resource query of a resource group. Resources that match query results are part of the group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GroupQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupQuery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a resource group that is associated with a specific resource query.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The resource query which determines which AWS resources are members of the associated resource group.
     * </p>
     */
    private ResourceQuery resourceQuery;

    /**
     * <p>
     * The name of a resource group that is associated with a specific resource query.
     * </p>
     * 
     * @param groupName
     *        The name of a resource group that is associated with a specific resource query.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of a resource group that is associated with a specific resource query.
     * </p>
     * 
     * @return The name of a resource group that is associated with a specific resource query.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of a resource group that is associated with a specific resource query.
     * </p>
     * 
     * @param groupName
     *        The name of a resource group that is associated with a specific resource query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupQuery withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The resource query which determines which AWS resources are members of the associated resource group.
     * </p>
     * 
     * @param resourceQuery
     *        The resource query which determines which AWS resources are members of the associated resource group.
     */

    public void setResourceQuery(ResourceQuery resourceQuery) {
        this.resourceQuery = resourceQuery;
    }

    /**
     * <p>
     * The resource query which determines which AWS resources are members of the associated resource group.
     * </p>
     * 
     * @return The resource query which determines which AWS resources are members of the associated resource group.
     */

    public ResourceQuery getResourceQuery() {
        return this.resourceQuery;
    }

    /**
     * <p>
     * The resource query which determines which AWS resources are members of the associated resource group.
     * </p>
     * 
     * @param resourceQuery
     *        The resource query which determines which AWS resources are members of the associated resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupQuery withResourceQuery(ResourceQuery resourceQuery) {
        setResourceQuery(resourceQuery);
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
        if (getResourceQuery() != null)
            sb.append("ResourceQuery: ").append(getResourceQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupQuery == false)
            return false;
        GroupQuery other = (GroupQuery) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getResourceQuery() == null ^ this.getResourceQuery() == null)
            return false;
        if (other.getResourceQuery() != null && other.getResourceQuery().equals(this.getResourceQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getResourceQuery() == null) ? 0 : getResourceQuery().hashCode());
        return hashCode;
    }

    @Override
    public GroupQuery clone() {
        try {
            return (GroupQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroups.model.transform.GroupQueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
