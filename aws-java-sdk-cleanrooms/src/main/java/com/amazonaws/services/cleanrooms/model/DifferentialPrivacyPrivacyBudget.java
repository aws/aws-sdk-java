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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configured epsilon value and the utility in terms of total aggregations, as well as the remaining
 * aggregations available.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DifferentialPrivacyPrivacyBudget"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DifferentialPrivacyPrivacyBudget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This information includes the configured epsilon value and the utility in terms of total aggregations, as well as
     * the remaining aggregations.
     * </p>
     */
    private java.util.List<DifferentialPrivacyPrivacyBudgetAggregation> aggregations;
    /**
     * <p>
     * The epsilon value that you configured.
     * </p>
     */
    private Integer epsilon;

    /**
     * <p>
     * This information includes the configured epsilon value and the utility in terms of total aggregations, as well as
     * the remaining aggregations.
     * </p>
     * 
     * @return This information includes the configured epsilon value and the utility in terms of total aggregations, as
     *         well as the remaining aggregations.
     */

    public java.util.List<DifferentialPrivacyPrivacyBudgetAggregation> getAggregations() {
        return aggregations;
    }

    /**
     * <p>
     * This information includes the configured epsilon value and the utility in terms of total aggregations, as well as
     * the remaining aggregations.
     * </p>
     * 
     * @param aggregations
     *        This information includes the configured epsilon value and the utility in terms of total aggregations, as
     *        well as the remaining aggregations.
     */

    public void setAggregations(java.util.Collection<DifferentialPrivacyPrivacyBudgetAggregation> aggregations) {
        if (aggregations == null) {
            this.aggregations = null;
            return;
        }

        this.aggregations = new java.util.ArrayList<DifferentialPrivacyPrivacyBudgetAggregation>(aggregations);
    }

    /**
     * <p>
     * This information includes the configured epsilon value and the utility in terms of total aggregations, as well as
     * the remaining aggregations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregations(java.util.Collection)} or {@link #withAggregations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param aggregations
     *        This information includes the configured epsilon value and the utility in terms of total aggregations, as
     *        well as the remaining aggregations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DifferentialPrivacyPrivacyBudget withAggregations(DifferentialPrivacyPrivacyBudgetAggregation... aggregations) {
        if (this.aggregations == null) {
            setAggregations(new java.util.ArrayList<DifferentialPrivacyPrivacyBudgetAggregation>(aggregations.length));
        }
        for (DifferentialPrivacyPrivacyBudgetAggregation ele : aggregations) {
            this.aggregations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This information includes the configured epsilon value and the utility in terms of total aggregations, as well as
     * the remaining aggregations.
     * </p>
     * 
     * @param aggregations
     *        This information includes the configured epsilon value and the utility in terms of total aggregations, as
     *        well as the remaining aggregations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DifferentialPrivacyPrivacyBudget withAggregations(java.util.Collection<DifferentialPrivacyPrivacyBudgetAggregation> aggregations) {
        setAggregations(aggregations);
        return this;
    }

    /**
     * <p>
     * The epsilon value that you configured.
     * </p>
     * 
     * @param epsilon
     *        The epsilon value that you configured.
     */

    public void setEpsilon(Integer epsilon) {
        this.epsilon = epsilon;
    }

    /**
     * <p>
     * The epsilon value that you configured.
     * </p>
     * 
     * @return The epsilon value that you configured.
     */

    public Integer getEpsilon() {
        return this.epsilon;
    }

    /**
     * <p>
     * The epsilon value that you configured.
     * </p>
     * 
     * @param epsilon
     *        The epsilon value that you configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DifferentialPrivacyPrivacyBudget withEpsilon(Integer epsilon) {
        setEpsilon(epsilon);
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
        if (getAggregations() != null)
            sb.append("Aggregations: ").append(getAggregations()).append(",");
        if (getEpsilon() != null)
            sb.append("Epsilon: ").append(getEpsilon());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DifferentialPrivacyPrivacyBudget == false)
            return false;
        DifferentialPrivacyPrivacyBudget other = (DifferentialPrivacyPrivacyBudget) obj;
        if (other.getAggregations() == null ^ this.getAggregations() == null)
            return false;
        if (other.getAggregations() != null && other.getAggregations().equals(this.getAggregations()) == false)
            return false;
        if (other.getEpsilon() == null ^ this.getEpsilon() == null)
            return false;
        if (other.getEpsilon() != null && other.getEpsilon().equals(this.getEpsilon()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregations() == null) ? 0 : getAggregations().hashCode());
        hashCode = prime * hashCode + ((getEpsilon() == null) ? 0 : getEpsilon().hashCode());
        return hashCode;
    }

    @Override
    public DifferentialPrivacyPrivacyBudget clone() {
        try {
            return (DifferentialPrivacyPrivacyBudget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.DifferentialPrivacyPrivacyBudgetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
