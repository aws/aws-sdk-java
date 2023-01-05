/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the criteria to be used in the filter for describing scan entries.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/FilterCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents a condition that when matched will be added to the response of the operation.
     * </p>
     */
    private java.util.List<FilterCriterion> filterCriterion;

    /**
     * <p>
     * Represents a condition that when matched will be added to the response of the operation.
     * </p>
     * 
     * @return Represents a condition that when matched will be added to the response of the operation.
     */

    public java.util.List<FilterCriterion> getFilterCriterion() {
        return filterCriterion;
    }

    /**
     * <p>
     * Represents a condition that when matched will be added to the response of the operation.
     * </p>
     * 
     * @param filterCriterion
     *        Represents a condition that when matched will be added to the response of the operation.
     */

    public void setFilterCriterion(java.util.Collection<FilterCriterion> filterCriterion) {
        if (filterCriterion == null) {
            this.filterCriterion = null;
            return;
        }

        this.filterCriterion = new java.util.ArrayList<FilterCriterion>(filterCriterion);
    }

    /**
     * <p>
     * Represents a condition that when matched will be added to the response of the operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterCriterion(java.util.Collection)} or {@link #withFilterCriterion(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param filterCriterion
     *        Represents a condition that when matched will be added to the response of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withFilterCriterion(FilterCriterion... filterCriterion) {
        if (this.filterCriterion == null) {
            setFilterCriterion(new java.util.ArrayList<FilterCriterion>(filterCriterion.length));
        }
        for (FilterCriterion ele : filterCriterion) {
            this.filterCriterion.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents a condition that when matched will be added to the response of the operation.
     * </p>
     * 
     * @param filterCriterion
     *        Represents a condition that when matched will be added to the response of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withFilterCriterion(java.util.Collection<FilterCriterion> filterCriterion) {
        setFilterCriterion(filterCriterion);
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
        if (getFilterCriterion() != null)
            sb.append("FilterCriterion: ").append(getFilterCriterion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterCriteria == false)
            return false;
        FilterCriteria other = (FilterCriteria) obj;
        if (other.getFilterCriterion() == null ^ this.getFilterCriterion() == null)
            return false;
        if (other.getFilterCriterion() != null && other.getFilterCriterion().equals(this.getFilterCriterion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterCriterion() == null) ? 0 : getFilterCriterion().hashCode());
        return hashCode;
    }

    @Override
    public FilterCriteria clone() {
        try {
            return (FilterCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.FilterCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
