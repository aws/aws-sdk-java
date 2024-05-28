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
 * Provides the sensitivity parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DifferentialPrivacySensitivityParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DifferentialPrivacySensitivityParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of aggregation function that was run.
     * </p>
     */
    private String aggregationType;
    /**
     * <p>
     * The aggregation expression that was run.
     * </p>
     */
    private String aggregationExpression;
    /**
     * <p>
     * The maximum number of rows contributed by a user in a SQL query.
     * </p>
     */
    private Integer userContributionLimit;
    /**
     * <p>
     * The lower bound of the aggregation expression.
     * </p>
     */
    private Float minColumnValue;
    /**
     * <p>
     * The upper bound of the aggregation expression.
     * </p>
     */
    private Float maxColumnValue;

    /**
     * <p>
     * The type of aggregation function that was run.
     * </p>
     * 
     * @param aggregationType
     *        The type of aggregation function that was run.
     * @see DifferentialPrivacyAggregationType
     */

    public void setAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
    }

    /**
     * <p>
     * The type of aggregation function that was run.
     * </p>
     * 
     * @return The type of aggregation function that was run.
     * @see DifferentialPrivacyAggregationType
     */

    public String getAggregationType() {
        return this.aggregationType;
    }

    /**
     * <p>
     * The type of aggregation function that was run.
     * </p>
     * 
     * @param aggregationType
     *        The type of aggregation function that was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DifferentialPrivacyAggregationType
     */

    public DifferentialPrivacySensitivityParameters withAggregationType(String aggregationType) {
        setAggregationType(aggregationType);
        return this;
    }

    /**
     * <p>
     * The type of aggregation function that was run.
     * </p>
     * 
     * @param aggregationType
     *        The type of aggregation function that was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DifferentialPrivacyAggregationType
     */

    public DifferentialPrivacySensitivityParameters withAggregationType(DifferentialPrivacyAggregationType aggregationType) {
        this.aggregationType = aggregationType.toString();
        return this;
    }

    /**
     * <p>
     * The aggregation expression that was run.
     * </p>
     * 
     * @param aggregationExpression
     *        The aggregation expression that was run.
     */

    public void setAggregationExpression(String aggregationExpression) {
        this.aggregationExpression = aggregationExpression;
    }

    /**
     * <p>
     * The aggregation expression that was run.
     * </p>
     * 
     * @return The aggregation expression that was run.
     */

    public String getAggregationExpression() {
        return this.aggregationExpression;
    }

    /**
     * <p>
     * The aggregation expression that was run.
     * </p>
     * 
     * @param aggregationExpression
     *        The aggregation expression that was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DifferentialPrivacySensitivityParameters withAggregationExpression(String aggregationExpression) {
        setAggregationExpression(aggregationExpression);
        return this;
    }

    /**
     * <p>
     * The maximum number of rows contributed by a user in a SQL query.
     * </p>
     * 
     * @param userContributionLimit
     *        The maximum number of rows contributed by a user in a SQL query.
     */

    public void setUserContributionLimit(Integer userContributionLimit) {
        this.userContributionLimit = userContributionLimit;
    }

    /**
     * <p>
     * The maximum number of rows contributed by a user in a SQL query.
     * </p>
     * 
     * @return The maximum number of rows contributed by a user in a SQL query.
     */

    public Integer getUserContributionLimit() {
        return this.userContributionLimit;
    }

    /**
     * <p>
     * The maximum number of rows contributed by a user in a SQL query.
     * </p>
     * 
     * @param userContributionLimit
     *        The maximum number of rows contributed by a user in a SQL query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DifferentialPrivacySensitivityParameters withUserContributionLimit(Integer userContributionLimit) {
        setUserContributionLimit(userContributionLimit);
        return this;
    }

    /**
     * <p>
     * The lower bound of the aggregation expression.
     * </p>
     * 
     * @param minColumnValue
     *        The lower bound of the aggregation expression.
     */

    public void setMinColumnValue(Float minColumnValue) {
        this.minColumnValue = minColumnValue;
    }

    /**
     * <p>
     * The lower bound of the aggregation expression.
     * </p>
     * 
     * @return The lower bound of the aggregation expression.
     */

    public Float getMinColumnValue() {
        return this.minColumnValue;
    }

    /**
     * <p>
     * The lower bound of the aggregation expression.
     * </p>
     * 
     * @param minColumnValue
     *        The lower bound of the aggregation expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DifferentialPrivacySensitivityParameters withMinColumnValue(Float minColumnValue) {
        setMinColumnValue(minColumnValue);
        return this;
    }

    /**
     * <p>
     * The upper bound of the aggregation expression.
     * </p>
     * 
     * @param maxColumnValue
     *        The upper bound of the aggregation expression.
     */

    public void setMaxColumnValue(Float maxColumnValue) {
        this.maxColumnValue = maxColumnValue;
    }

    /**
     * <p>
     * The upper bound of the aggregation expression.
     * </p>
     * 
     * @return The upper bound of the aggregation expression.
     */

    public Float getMaxColumnValue() {
        return this.maxColumnValue;
    }

    /**
     * <p>
     * The upper bound of the aggregation expression.
     * </p>
     * 
     * @param maxColumnValue
     *        The upper bound of the aggregation expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DifferentialPrivacySensitivityParameters withMaxColumnValue(Float maxColumnValue) {
        setMaxColumnValue(maxColumnValue);
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
        if (getAggregationType() != null)
            sb.append("AggregationType: ").append(getAggregationType()).append(",");
        if (getAggregationExpression() != null)
            sb.append("AggregationExpression: ").append(getAggregationExpression()).append(",");
        if (getUserContributionLimit() != null)
            sb.append("UserContributionLimit: ").append(getUserContributionLimit()).append(",");
        if (getMinColumnValue() != null)
            sb.append("MinColumnValue: ").append(getMinColumnValue()).append(",");
        if (getMaxColumnValue() != null)
            sb.append("MaxColumnValue: ").append(getMaxColumnValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DifferentialPrivacySensitivityParameters == false)
            return false;
        DifferentialPrivacySensitivityParameters other = (DifferentialPrivacySensitivityParameters) obj;
        if (other.getAggregationType() == null ^ this.getAggregationType() == null)
            return false;
        if (other.getAggregationType() != null && other.getAggregationType().equals(this.getAggregationType()) == false)
            return false;
        if (other.getAggregationExpression() == null ^ this.getAggregationExpression() == null)
            return false;
        if (other.getAggregationExpression() != null && other.getAggregationExpression().equals(this.getAggregationExpression()) == false)
            return false;
        if (other.getUserContributionLimit() == null ^ this.getUserContributionLimit() == null)
            return false;
        if (other.getUserContributionLimit() != null && other.getUserContributionLimit().equals(this.getUserContributionLimit()) == false)
            return false;
        if (other.getMinColumnValue() == null ^ this.getMinColumnValue() == null)
            return false;
        if (other.getMinColumnValue() != null && other.getMinColumnValue().equals(this.getMinColumnValue()) == false)
            return false;
        if (other.getMaxColumnValue() == null ^ this.getMaxColumnValue() == null)
            return false;
        if (other.getMaxColumnValue() != null && other.getMaxColumnValue().equals(this.getMaxColumnValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregationType() == null) ? 0 : getAggregationType().hashCode());
        hashCode = prime * hashCode + ((getAggregationExpression() == null) ? 0 : getAggregationExpression().hashCode());
        hashCode = prime * hashCode + ((getUserContributionLimit() == null) ? 0 : getUserContributionLimit().hashCode());
        hashCode = prime * hashCode + ((getMinColumnValue() == null) ? 0 : getMinColumnValue().hashCode());
        hashCode = prime * hashCode + ((getMaxColumnValue() == null) ? 0 : getMaxColumnValue().hashCode());
        return hashCode;
    }

    @Override
    public DifferentialPrivacySensitivityParameters clone() {
        try {
            return (DifferentialPrivacySensitivityParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.DifferentialPrivacySensitivityParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
