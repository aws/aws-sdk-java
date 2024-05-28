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
 * Information about the total number of aggregations, as well as the remaining aggregations.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DifferentialPrivacyPrivacyBudgetAggregation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DifferentialPrivacyPrivacyBudgetAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The different types of aggregation functions that you can perform.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The maximum number of aggregation functions that you can perform with the given privacy budget.
     * </p>
     */
    private Integer maxCount;
    /**
     * <p>
     * The remaining number of aggregation functions that can be run with the available privacy budget.
     * </p>
     */
    private Integer remainingCount;

    /**
     * <p>
     * The different types of aggregation functions that you can perform.
     * </p>
     * 
     * @param type
     *        The different types of aggregation functions that you can perform.
     * @see DifferentialPrivacyAggregationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The different types of aggregation functions that you can perform.
     * </p>
     * 
     * @return The different types of aggregation functions that you can perform.
     * @see DifferentialPrivacyAggregationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The different types of aggregation functions that you can perform.
     * </p>
     * 
     * @param type
     *        The different types of aggregation functions that you can perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DifferentialPrivacyAggregationType
     */

    public DifferentialPrivacyPrivacyBudgetAggregation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The different types of aggregation functions that you can perform.
     * </p>
     * 
     * @param type
     *        The different types of aggregation functions that you can perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DifferentialPrivacyAggregationType
     */

    public DifferentialPrivacyPrivacyBudgetAggregation withType(DifferentialPrivacyAggregationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of aggregation functions that you can perform with the given privacy budget.
     * </p>
     * 
     * @param maxCount
     *        The maximum number of aggregation functions that you can perform with the given privacy budget.
     */

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    /**
     * <p>
     * The maximum number of aggregation functions that you can perform with the given privacy budget.
     * </p>
     * 
     * @return The maximum number of aggregation functions that you can perform with the given privacy budget.
     */

    public Integer getMaxCount() {
        return this.maxCount;
    }

    /**
     * <p>
     * The maximum number of aggregation functions that you can perform with the given privacy budget.
     * </p>
     * 
     * @param maxCount
     *        The maximum number of aggregation functions that you can perform with the given privacy budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DifferentialPrivacyPrivacyBudgetAggregation withMaxCount(Integer maxCount) {
        setMaxCount(maxCount);
        return this;
    }

    /**
     * <p>
     * The remaining number of aggregation functions that can be run with the available privacy budget.
     * </p>
     * 
     * @param remainingCount
     *        The remaining number of aggregation functions that can be run with the available privacy budget.
     */

    public void setRemainingCount(Integer remainingCount) {
        this.remainingCount = remainingCount;
    }

    /**
     * <p>
     * The remaining number of aggregation functions that can be run with the available privacy budget.
     * </p>
     * 
     * @return The remaining number of aggregation functions that can be run with the available privacy budget.
     */

    public Integer getRemainingCount() {
        return this.remainingCount;
    }

    /**
     * <p>
     * The remaining number of aggregation functions that can be run with the available privacy budget.
     * </p>
     * 
     * @param remainingCount
     *        The remaining number of aggregation functions that can be run with the available privacy budget.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DifferentialPrivacyPrivacyBudgetAggregation withRemainingCount(Integer remainingCount) {
        setRemainingCount(remainingCount);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMaxCount() != null)
            sb.append("MaxCount: ").append(getMaxCount()).append(",");
        if (getRemainingCount() != null)
            sb.append("RemainingCount: ").append(getRemainingCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DifferentialPrivacyPrivacyBudgetAggregation == false)
            return false;
        DifferentialPrivacyPrivacyBudgetAggregation other = (DifferentialPrivacyPrivacyBudgetAggregation) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMaxCount() == null ^ this.getMaxCount() == null)
            return false;
        if (other.getMaxCount() != null && other.getMaxCount().equals(this.getMaxCount()) == false)
            return false;
        if (other.getRemainingCount() == null ^ this.getRemainingCount() == null)
            return false;
        if (other.getRemainingCount() != null && other.getRemainingCount().equals(this.getRemainingCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMaxCount() == null) ? 0 : getMaxCount().hashCode());
        hashCode = prime * hashCode + ((getRemainingCount() == null) ? 0 : getRemainingCount().hashCode());
        return hashCode;
    }

    @Override
    public DifferentialPrivacyPrivacyBudgetAggregation clone() {
        try {
            return (DifferentialPrivacyPrivacyBudgetAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.DifferentialPrivacyPrivacyBudgetAggregationMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
