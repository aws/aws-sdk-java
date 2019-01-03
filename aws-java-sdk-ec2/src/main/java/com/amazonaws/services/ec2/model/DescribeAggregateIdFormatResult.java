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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAggregateIdFormatResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether all resource types in the region are configured to use longer IDs. This value is only
     * <code>true</code> if all users are configured to use longer IDs for all resources types in the region.
     * </p>
     */
    private Boolean useLongIdsAggregated;
    /**
     * <p>
     * Information about each resource's ID format.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IdFormat> statuses;

    /**
     * <p>
     * Indicates whether all resource types in the region are configured to use longer IDs. This value is only
     * <code>true</code> if all users are configured to use longer IDs for all resources types in the region.
     * </p>
     * 
     * @param useLongIdsAggregated
     *        Indicates whether all resource types in the region are configured to use longer IDs. This value is only
     *        <code>true</code> if all users are configured to use longer IDs for all resources types in the region.
     */

    public void setUseLongIdsAggregated(Boolean useLongIdsAggregated) {
        this.useLongIdsAggregated = useLongIdsAggregated;
    }

    /**
     * <p>
     * Indicates whether all resource types in the region are configured to use longer IDs. This value is only
     * <code>true</code> if all users are configured to use longer IDs for all resources types in the region.
     * </p>
     * 
     * @return Indicates whether all resource types in the region are configured to use longer IDs. This value is only
     *         <code>true</code> if all users are configured to use longer IDs for all resources types in the region.
     */

    public Boolean getUseLongIdsAggregated() {
        return this.useLongIdsAggregated;
    }

    /**
     * <p>
     * Indicates whether all resource types in the region are configured to use longer IDs. This value is only
     * <code>true</code> if all users are configured to use longer IDs for all resources types in the region.
     * </p>
     * 
     * @param useLongIdsAggregated
     *        Indicates whether all resource types in the region are configured to use longer IDs. This value is only
     *        <code>true</code> if all users are configured to use longer IDs for all resources types in the region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAggregateIdFormatResult withUseLongIdsAggregated(Boolean useLongIdsAggregated) {
        setUseLongIdsAggregated(useLongIdsAggregated);
        return this;
    }

    /**
     * <p>
     * Indicates whether all resource types in the region are configured to use longer IDs. This value is only
     * <code>true</code> if all users are configured to use longer IDs for all resources types in the region.
     * </p>
     * 
     * @return Indicates whether all resource types in the region are configured to use longer IDs. This value is only
     *         <code>true</code> if all users are configured to use longer IDs for all resources types in the region.
     */

    public Boolean isUseLongIdsAggregated() {
        return this.useLongIdsAggregated;
    }

    /**
     * <p>
     * Information about each resource's ID format.
     * </p>
     * 
     * @return Information about each resource's ID format.
     */

    public java.util.List<IdFormat> getStatuses() {
        if (statuses == null) {
            statuses = new com.amazonaws.internal.SdkInternalList<IdFormat>();
        }
        return statuses;
    }

    /**
     * <p>
     * Information about each resource's ID format.
     * </p>
     * 
     * @param statuses
     *        Information about each resource's ID format.
     */

    public void setStatuses(java.util.Collection<IdFormat> statuses) {
        if (statuses == null) {
            this.statuses = null;
            return;
        }

        this.statuses = new com.amazonaws.internal.SdkInternalList<IdFormat>(statuses);
    }

    /**
     * <p>
     * Information about each resource's ID format.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatuses(java.util.Collection)} or {@link #withStatuses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param statuses
     *        Information about each resource's ID format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAggregateIdFormatResult withStatuses(IdFormat... statuses) {
        if (this.statuses == null) {
            setStatuses(new com.amazonaws.internal.SdkInternalList<IdFormat>(statuses.length));
        }
        for (IdFormat ele : statuses) {
            this.statuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about each resource's ID format.
     * </p>
     * 
     * @param statuses
     *        Information about each resource's ID format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAggregateIdFormatResult withStatuses(java.util.Collection<IdFormat> statuses) {
        setStatuses(statuses);
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
        if (getUseLongIdsAggregated() != null)
            sb.append("UseLongIdsAggregated: ").append(getUseLongIdsAggregated()).append(",");
        if (getStatuses() != null)
            sb.append("Statuses: ").append(getStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAggregateIdFormatResult == false)
            return false;
        DescribeAggregateIdFormatResult other = (DescribeAggregateIdFormatResult) obj;
        if (other.getUseLongIdsAggregated() == null ^ this.getUseLongIdsAggregated() == null)
            return false;
        if (other.getUseLongIdsAggregated() != null && other.getUseLongIdsAggregated().equals(this.getUseLongIdsAggregated()) == false)
            return false;
        if (other.getStatuses() == null ^ this.getStatuses() == null)
            return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUseLongIdsAggregated() == null) ? 0 : getUseLongIdsAggregated().hashCode());
        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAggregateIdFormatResult clone() {
        try {
            return (DescribeAggregateIdFormatResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
