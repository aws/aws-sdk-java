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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filtering options for <i>ListGroupsForEntity</i> operation. This is only used as input to Operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListGroupsForEntityFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupsForEntityFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filters only group names that start with the provided name prefix.
     * </p>
     */
    private String groupNamePrefix;

    /**
     * <p>
     * Filters only group names that start with the provided name prefix.
     * </p>
     * 
     * @param groupNamePrefix
     *        Filters only group names that start with the provided name prefix.
     */

    public void setGroupNamePrefix(String groupNamePrefix) {
        this.groupNamePrefix = groupNamePrefix;
    }

    /**
     * <p>
     * Filters only group names that start with the provided name prefix.
     * </p>
     * 
     * @return Filters only group names that start with the provided name prefix.
     */

    public String getGroupNamePrefix() {
        return this.groupNamePrefix;
    }

    /**
     * <p>
     * Filters only group names that start with the provided name prefix.
     * </p>
     * 
     * @param groupNamePrefix
     *        Filters only group names that start with the provided name prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupsForEntityFilters withGroupNamePrefix(String groupNamePrefix) {
        setGroupNamePrefix(groupNamePrefix);
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
        if (getGroupNamePrefix() != null)
            sb.append("GroupNamePrefix: ").append(getGroupNamePrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGroupsForEntityFilters == false)
            return false;
        ListGroupsForEntityFilters other = (ListGroupsForEntityFilters) obj;
        if (other.getGroupNamePrefix() == null ^ this.getGroupNamePrefix() == null)
            return false;
        if (other.getGroupNamePrefix() != null && other.getGroupNamePrefix().equals(this.getGroupNamePrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupNamePrefix() == null) ? 0 : getGroupNamePrefix().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupsForEntityFilters clone() {
        try {
            return (ListGroupsForEntityFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.ListGroupsForEntityFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
