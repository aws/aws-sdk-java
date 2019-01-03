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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of resources
 * that match and don't match the specified criteria.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/InventoryGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InventoryGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of resources
     * that match the criteria. The <code>notMatchingCount</code> field displays the number of resources that don't
     * match the criteria.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InventoryFilter> filters;

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param name
     *        The name of the group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param name
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of resources
     * that match the criteria. The <code>notMatchingCount</code> field displays the number of resources that don't
     * match the criteria.
     * </p>
     * 
     * @return Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of
     *         resources that match the criteria. The <code>notMatchingCount</code> field displays the number of
     *         resources that don't match the criteria.
     */

    public java.util.List<InventoryFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<InventoryFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of resources
     * that match the criteria. The <code>notMatchingCount</code> field displays the number of resources that don't
     * match the criteria.
     * </p>
     * 
     * @param filters
     *        Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of
     *        resources that match the criteria. The <code>notMatchingCount</code> field displays the number of
     *        resources that don't match the criteria.
     */

    public void setFilters(java.util.Collection<InventoryFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<InventoryFilter>(filters);
    }

    /**
     * <p>
     * Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of resources
     * that match the criteria. The <code>notMatchingCount</code> field displays the number of resources that don't
     * match the criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of
     *        resources that match the criteria. The <code>notMatchingCount</code> field displays the number of
     *        resources that don't match the criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryGroup withFilters(InventoryFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<InventoryFilter>(filters.length));
        }
        for (InventoryFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of resources
     * that match the criteria. The <code>notMatchingCount</code> field displays the number of resources that don't
     * match the criteria.
     * </p>
     * 
     * @param filters
     *        Filters define the criteria for the group. The <code>matchingCount</code> field displays the number of
     *        resources that match the criteria. The <code>notMatchingCount</code> field displays the number of
     *        resources that don't match the criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryGroup withFilters(java.util.Collection<InventoryFilter> filters) {
        setFilters(filters);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryGroup == false)
            return false;
        InventoryGroup other = (InventoryGroup) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public InventoryGroup clone() {
        try {
            return (InventoryGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.InventoryGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
