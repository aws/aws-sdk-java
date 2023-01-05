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
 * Represents a condition that when matched will be added to the response of the operation. Irrespective of using any
 * filter criteria, an administrator account can view the scan entries for all of its member accounts. However, each
 * member account can view the scan entries only for their own account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/FilterCriterion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterCriterion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An enum value representing possible scan properties to match with given scan entries.
     * </p>
     */
    private String criterionKey;
    /**
     * <p>
     * Contains information about the condition.
     * </p>
     */
    private FilterCondition filterCondition;

    /**
     * <p>
     * An enum value representing possible scan properties to match with given scan entries.
     * </p>
     * 
     * @param criterionKey
     *        An enum value representing possible scan properties to match with given scan entries.
     * @see CriterionKey
     */

    public void setCriterionKey(String criterionKey) {
        this.criterionKey = criterionKey;
    }

    /**
     * <p>
     * An enum value representing possible scan properties to match with given scan entries.
     * </p>
     * 
     * @return An enum value representing possible scan properties to match with given scan entries.
     * @see CriterionKey
     */

    public String getCriterionKey() {
        return this.criterionKey;
    }

    /**
     * <p>
     * An enum value representing possible scan properties to match with given scan entries.
     * </p>
     * 
     * @param criterionKey
     *        An enum value representing possible scan properties to match with given scan entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CriterionKey
     */

    public FilterCriterion withCriterionKey(String criterionKey) {
        setCriterionKey(criterionKey);
        return this;
    }

    /**
     * <p>
     * An enum value representing possible scan properties to match with given scan entries.
     * </p>
     * 
     * @param criterionKey
     *        An enum value representing possible scan properties to match with given scan entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CriterionKey
     */

    public FilterCriterion withCriterionKey(CriterionKey criterionKey) {
        this.criterionKey = criterionKey.toString();
        return this;
    }

    /**
     * <p>
     * Contains information about the condition.
     * </p>
     * 
     * @param filterCondition
     *        Contains information about the condition.
     */

    public void setFilterCondition(FilterCondition filterCondition) {
        this.filterCondition = filterCondition;
    }

    /**
     * <p>
     * Contains information about the condition.
     * </p>
     * 
     * @return Contains information about the condition.
     */

    public FilterCondition getFilterCondition() {
        return this.filterCondition;
    }

    /**
     * <p>
     * Contains information about the condition.
     * </p>
     * 
     * @param filterCondition
     *        Contains information about the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriterion withFilterCondition(FilterCondition filterCondition) {
        setFilterCondition(filterCondition);
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
        if (getCriterionKey() != null)
            sb.append("CriterionKey: ").append(getCriterionKey()).append(",");
        if (getFilterCondition() != null)
            sb.append("FilterCondition: ").append(getFilterCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterCriterion == false)
            return false;
        FilterCriterion other = (FilterCriterion) obj;
        if (other.getCriterionKey() == null ^ this.getCriterionKey() == null)
            return false;
        if (other.getCriterionKey() != null && other.getCriterionKey().equals(this.getCriterionKey()) == false)
            return false;
        if (other.getFilterCondition() == null ^ this.getFilterCondition() == null)
            return false;
        if (other.getFilterCondition() != null && other.getFilterCondition().equals(this.getFilterCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCriterionKey() == null) ? 0 : getCriterionKey().hashCode());
        hashCode = prime * hashCode + ((getFilterCondition() == null) ? 0 : getFilterCondition().hashCode());
        return hashCode;
    }

    @Override
    public FilterCriterion clone() {
        try {
            return (FilterCriterion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.FilterCriterionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
