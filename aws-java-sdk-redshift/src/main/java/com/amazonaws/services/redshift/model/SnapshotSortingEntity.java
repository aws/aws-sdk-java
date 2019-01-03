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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a sorting entity
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/SnapshotSortingEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotSortingEntity implements Serializable, Cloneable {

    /**
     * <p>
     * The category for sorting the snapshots.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * The order for listing the attributes.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The category for sorting the snapshots.
     * </p>
     * 
     * @param attribute
     *        The category for sorting the snapshots.
     * @see SnapshotAttributeToSortBy
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The category for sorting the snapshots.
     * </p>
     * 
     * @return The category for sorting the snapshots.
     * @see SnapshotAttributeToSortBy
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The category for sorting the snapshots.
     * </p>
     * 
     * @param attribute
     *        The category for sorting the snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotAttributeToSortBy
     */

    public SnapshotSortingEntity withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The category for sorting the snapshots.
     * </p>
     * 
     * @param attribute
     *        The category for sorting the snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotAttributeToSortBy
     */

    public SnapshotSortingEntity withAttribute(SnapshotAttributeToSortBy attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * The order for listing the attributes.
     * </p>
     * 
     * @param sortOrder
     *        The order for listing the attributes.
     * @see SortByOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order for listing the attributes.
     * </p>
     * 
     * @return The order for listing the attributes.
     * @see SortByOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order for listing the attributes.
     * </p>
     * 
     * @param sortOrder
     *        The order for listing the attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortByOrder
     */

    public SnapshotSortingEntity withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order for listing the attributes.
     * </p>
     * 
     * @param sortOrder
     *        The order for listing the attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortByOrder
     */

    public SnapshotSortingEntity withSortOrder(SortByOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotSortingEntity == false)
            return false;
        SnapshotSortingEntity other = (SnapshotSortingEntity) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotSortingEntity clone() {
        try {
            return (SnapshotSortingEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
