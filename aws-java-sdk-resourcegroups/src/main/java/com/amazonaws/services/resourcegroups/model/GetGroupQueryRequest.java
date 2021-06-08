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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroupQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGroupQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Don't use this parameter. Use <code>Group</code> instead.
     * </p>
     */
    @Deprecated
    private String groupName;
    /**
     * <p>
     * The name or the ARN of the resource group to query.
     * </p>
     */
    private String group;

    /**
     * <p>
     * Don't use this parameter. Use <code>Group</code> instead.
     * </p>
     * 
     * @param groupName
     *        Don't use this parameter. Use <code>Group</code> instead.
     */
    @Deprecated
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * Don't use this parameter. Use <code>Group</code> instead.
     * </p>
     * 
     * @return Don't use this parameter. Use <code>Group</code> instead.
     */
    @Deprecated
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * Don't use this parameter. Use <code>Group</code> instead.
     * </p>
     * 
     * @param groupName
     *        Don't use this parameter. Use <code>Group</code> instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public GetGroupQueryRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The name or the ARN of the resource group to query.
     * </p>
     * 
     * @param group
     *        The name or the ARN of the resource group to query.
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name or the ARN of the resource group to query.
     * </p>
     * 
     * @return The name or the ARN of the resource group to query.
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The name or the ARN of the resource group to query.
     * </p>
     * 
     * @param group
     *        The name or the ARN of the resource group to query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupQueryRequest withGroup(String group) {
        setGroup(group);
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
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGroupQueryRequest == false)
            return false;
        GetGroupQueryRequest other = (GetGroupQueryRequest) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        return hashCode;
    }

    @Override
    public GetGroupQueryRequest clone() {
        return (GetGroupQueryRequest) super.clone();
    }

}
