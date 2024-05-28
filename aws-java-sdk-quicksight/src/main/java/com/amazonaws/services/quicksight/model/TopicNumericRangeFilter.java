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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter that filters topics based on the value of a numeric field. The filter includes only topics whose numeric
 * field value falls within the specified range.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopicNumericRangeFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicNumericRangeFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean value that indicates whether the endpoints of the numeric range are included in the filter. If set to
     * true, topics whose numeric field value is equal to the endpoint values will be included in the filter. If set to
     * false, topics whose numeric field value is equal to the endpoint values will be excluded from the filter.
     * </p>
     */
    private Boolean inclusive;
    /**
     * <p>
     * The constant used in a numeric range filter.
     * </p>
     */
    private TopicRangeFilterConstant constant;
    /**
     * <p>
     * An aggregation function that specifies how to calculate the value of a numeric field for a topic, Valid values
     * for this structure are <code>NO_AGGREGATION</code>, <code>SUM</code>, <code>AVERAGE</code>, <code>COUNT</code>,
     * <code>DISTINCT_COUNT</code>, <code>MAX</code>, <code>MEDIAN</code>, <code>MIN</code>, <code>STDEV</code>,
     * <code>STDEVP</code>, <code>VAR</code>, and <code>VARP</code>.
     * </p>
     */
    private String aggregation;

    /**
     * <p>
     * A Boolean value that indicates whether the endpoints of the numeric range are included in the filter. If set to
     * true, topics whose numeric field value is equal to the endpoint values will be included in the filter. If set to
     * false, topics whose numeric field value is equal to the endpoint values will be excluded from the filter.
     * </p>
     * 
     * @param inclusive
     *        A Boolean value that indicates whether the endpoints of the numeric range are included in the filter. If
     *        set to true, topics whose numeric field value is equal to the endpoint values will be included in the
     *        filter. If set to false, topics whose numeric field value is equal to the endpoint values will be excluded
     *        from the filter.
     */

    public void setInclusive(Boolean inclusive) {
        this.inclusive = inclusive;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the endpoints of the numeric range are included in the filter. If set to
     * true, topics whose numeric field value is equal to the endpoint values will be included in the filter. If set to
     * false, topics whose numeric field value is equal to the endpoint values will be excluded from the filter.
     * </p>
     * 
     * @return A Boolean value that indicates whether the endpoints of the numeric range are included in the filter. If
     *         set to true, topics whose numeric field value is equal to the endpoint values will be included in the
     *         filter. If set to false, topics whose numeric field value is equal to the endpoint values will be
     *         excluded from the filter.
     */

    public Boolean getInclusive() {
        return this.inclusive;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the endpoints of the numeric range are included in the filter. If set to
     * true, topics whose numeric field value is equal to the endpoint values will be included in the filter. If set to
     * false, topics whose numeric field value is equal to the endpoint values will be excluded from the filter.
     * </p>
     * 
     * @param inclusive
     *        A Boolean value that indicates whether the endpoints of the numeric range are included in the filter. If
     *        set to true, topics whose numeric field value is equal to the endpoint values will be included in the
     *        filter. If set to false, topics whose numeric field value is equal to the endpoint values will be excluded
     *        from the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicNumericRangeFilter withInclusive(Boolean inclusive) {
        setInclusive(inclusive);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the endpoints of the numeric range are included in the filter. If set to
     * true, topics whose numeric field value is equal to the endpoint values will be included in the filter. If set to
     * false, topics whose numeric field value is equal to the endpoint values will be excluded from the filter.
     * </p>
     * 
     * @return A Boolean value that indicates whether the endpoints of the numeric range are included in the filter. If
     *         set to true, topics whose numeric field value is equal to the endpoint values will be included in the
     *         filter. If set to false, topics whose numeric field value is equal to the endpoint values will be
     *         excluded from the filter.
     */

    public Boolean isInclusive() {
        return this.inclusive;
    }

    /**
     * <p>
     * The constant used in a numeric range filter.
     * </p>
     * 
     * @param constant
     *        The constant used in a numeric range filter.
     */

    public void setConstant(TopicRangeFilterConstant constant) {
        this.constant = constant;
    }

    /**
     * <p>
     * The constant used in a numeric range filter.
     * </p>
     * 
     * @return The constant used in a numeric range filter.
     */

    public TopicRangeFilterConstant getConstant() {
        return this.constant;
    }

    /**
     * <p>
     * The constant used in a numeric range filter.
     * </p>
     * 
     * @param constant
     *        The constant used in a numeric range filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicNumericRangeFilter withConstant(TopicRangeFilterConstant constant) {
        setConstant(constant);
        return this;
    }

    /**
     * <p>
     * An aggregation function that specifies how to calculate the value of a numeric field for a topic, Valid values
     * for this structure are <code>NO_AGGREGATION</code>, <code>SUM</code>, <code>AVERAGE</code>, <code>COUNT</code>,
     * <code>DISTINCT_COUNT</code>, <code>MAX</code>, <code>MEDIAN</code>, <code>MIN</code>, <code>STDEV</code>,
     * <code>STDEVP</code>, <code>VAR</code>, and <code>VARP</code>.
     * </p>
     * 
     * @param aggregation
     *        An aggregation function that specifies how to calculate the value of a numeric field for a topic, Valid
     *        values for this structure are <code>NO_AGGREGATION</code>, <code>SUM</code>, <code>AVERAGE</code>,
     *        <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MAX</code>, <code>MEDIAN</code>, <code>MIN</code>,
     *        <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>, and <code>VARP</code>.
     * @see NamedFilterAggType
     */

    public void setAggregation(String aggregation) {
        this.aggregation = aggregation;
    }

    /**
     * <p>
     * An aggregation function that specifies how to calculate the value of a numeric field for a topic, Valid values
     * for this structure are <code>NO_AGGREGATION</code>, <code>SUM</code>, <code>AVERAGE</code>, <code>COUNT</code>,
     * <code>DISTINCT_COUNT</code>, <code>MAX</code>, <code>MEDIAN</code>, <code>MIN</code>, <code>STDEV</code>,
     * <code>STDEVP</code>, <code>VAR</code>, and <code>VARP</code>.
     * </p>
     * 
     * @return An aggregation function that specifies how to calculate the value of a numeric field for a topic, Valid
     *         values for this structure are <code>NO_AGGREGATION</code>, <code>SUM</code>, <code>AVERAGE</code>,
     *         <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MAX</code>, <code>MEDIAN</code>, <code>MIN</code>,
     *         <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>, and <code>VARP</code>.
     * @see NamedFilterAggType
     */

    public String getAggregation() {
        return this.aggregation;
    }

    /**
     * <p>
     * An aggregation function that specifies how to calculate the value of a numeric field for a topic, Valid values
     * for this structure are <code>NO_AGGREGATION</code>, <code>SUM</code>, <code>AVERAGE</code>, <code>COUNT</code>,
     * <code>DISTINCT_COUNT</code>, <code>MAX</code>, <code>MEDIAN</code>, <code>MIN</code>, <code>STDEV</code>,
     * <code>STDEVP</code>, <code>VAR</code>, and <code>VARP</code>.
     * </p>
     * 
     * @param aggregation
     *        An aggregation function that specifies how to calculate the value of a numeric field for a topic, Valid
     *        values for this structure are <code>NO_AGGREGATION</code>, <code>SUM</code>, <code>AVERAGE</code>,
     *        <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MAX</code>, <code>MEDIAN</code>, <code>MIN</code>,
     *        <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>, and <code>VARP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamedFilterAggType
     */

    public TopicNumericRangeFilter withAggregation(String aggregation) {
        setAggregation(aggregation);
        return this;
    }

    /**
     * <p>
     * An aggregation function that specifies how to calculate the value of a numeric field for a topic, Valid values
     * for this structure are <code>NO_AGGREGATION</code>, <code>SUM</code>, <code>AVERAGE</code>, <code>COUNT</code>,
     * <code>DISTINCT_COUNT</code>, <code>MAX</code>, <code>MEDIAN</code>, <code>MIN</code>, <code>STDEV</code>,
     * <code>STDEVP</code>, <code>VAR</code>, and <code>VARP</code>.
     * </p>
     * 
     * @param aggregation
     *        An aggregation function that specifies how to calculate the value of a numeric field for a topic, Valid
     *        values for this structure are <code>NO_AGGREGATION</code>, <code>SUM</code>, <code>AVERAGE</code>,
     *        <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MAX</code>, <code>MEDIAN</code>, <code>MIN</code>,
     *        <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>, and <code>VARP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamedFilterAggType
     */

    public TopicNumericRangeFilter withAggregation(NamedFilterAggType aggregation) {
        this.aggregation = aggregation.toString();
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
        if (getInclusive() != null)
            sb.append("Inclusive: ").append(getInclusive()).append(",");
        if (getConstant() != null)
            sb.append("Constant: ").append("***Sensitive Data Redacted***").append(",");
        if (getAggregation() != null)
            sb.append("Aggregation: ").append(getAggregation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicNumericRangeFilter == false)
            return false;
        TopicNumericRangeFilter other = (TopicNumericRangeFilter) obj;
        if (other.getInclusive() == null ^ this.getInclusive() == null)
            return false;
        if (other.getInclusive() != null && other.getInclusive().equals(this.getInclusive()) == false)
            return false;
        if (other.getConstant() == null ^ this.getConstant() == null)
            return false;
        if (other.getConstant() != null && other.getConstant().equals(this.getConstant()) == false)
            return false;
        if (other.getAggregation() == null ^ this.getAggregation() == null)
            return false;
        if (other.getAggregation() != null && other.getAggregation().equals(this.getAggregation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInclusive() == null) ? 0 : getInclusive().hashCode());
        hashCode = prime * hashCode + ((getConstant() == null) ? 0 : getConstant().hashCode());
        hashCode = prime * hashCode + ((getAggregation() == null) ? 0 : getAggregation().hashCode());
        return hashCode;
    }

    @Override
    public TopicNumericRangeFilter clone() {
        try {
            return (TopicNumericRangeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopicNumericRangeFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
