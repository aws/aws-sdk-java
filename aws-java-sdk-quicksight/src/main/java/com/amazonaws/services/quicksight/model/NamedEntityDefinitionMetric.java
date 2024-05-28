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
 * A structure that represents a metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NamedEntityDefinitionMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NamedEntityDefinitionMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregation of a named entity. Valid values for this structure are <code>SUM</code>, <code>MIN</code>,
     * <code>MAX</code>, <code>COUNT</code>, <code>AVERAGE</code>, <code>DISTINCT_COUNT</code>, <code>STDEV</code>,
     * <code>STDEVP</code>, <code>VAR</code>, <code>VARP</code>, <code>PERCENTILE</code>, <code>MEDIAN</code>, and
     * <code>CUSTOM</code>.
     * </p>
     */
    private String aggregation;
    /**
     * <p>
     * The additional parameters for an aggregation function.
     * </p>
     */
    private java.util.Map<String, String> aggregationFunctionParameters;

    /**
     * <p>
     * The aggregation of a named entity. Valid values for this structure are <code>SUM</code>, <code>MIN</code>,
     * <code>MAX</code>, <code>COUNT</code>, <code>AVERAGE</code>, <code>DISTINCT_COUNT</code>, <code>STDEV</code>,
     * <code>STDEVP</code>, <code>VAR</code>, <code>VARP</code>, <code>PERCENTILE</code>, <code>MEDIAN</code>, and
     * <code>CUSTOM</code>.
     * </p>
     * 
     * @param aggregation
     *        The aggregation of a named entity. Valid values for this structure are <code>SUM</code>, <code>MIN</code>,
     *        <code>MAX</code>, <code>COUNT</code>, <code>AVERAGE</code>, <code>DISTINCT_COUNT</code>,
     *        <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>, <code>VARP</code>, <code>PERCENTILE</code>,
     *        <code>MEDIAN</code>, and <code>CUSTOM</code>.
     * @see NamedEntityAggType
     */

    public void setAggregation(String aggregation) {
        this.aggregation = aggregation;
    }

    /**
     * <p>
     * The aggregation of a named entity. Valid values for this structure are <code>SUM</code>, <code>MIN</code>,
     * <code>MAX</code>, <code>COUNT</code>, <code>AVERAGE</code>, <code>DISTINCT_COUNT</code>, <code>STDEV</code>,
     * <code>STDEVP</code>, <code>VAR</code>, <code>VARP</code>, <code>PERCENTILE</code>, <code>MEDIAN</code>, and
     * <code>CUSTOM</code>.
     * </p>
     * 
     * @return The aggregation of a named entity. Valid values for this structure are <code>SUM</code>, <code>MIN</code>
     *         , <code>MAX</code>, <code>COUNT</code>, <code>AVERAGE</code>, <code>DISTINCT_COUNT</code>,
     *         <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>, <code>VARP</code>, <code>PERCENTILE</code>,
     *         <code>MEDIAN</code>, and <code>CUSTOM</code>.
     * @see NamedEntityAggType
     */

    public String getAggregation() {
        return this.aggregation;
    }

    /**
     * <p>
     * The aggregation of a named entity. Valid values for this structure are <code>SUM</code>, <code>MIN</code>,
     * <code>MAX</code>, <code>COUNT</code>, <code>AVERAGE</code>, <code>DISTINCT_COUNT</code>, <code>STDEV</code>,
     * <code>STDEVP</code>, <code>VAR</code>, <code>VARP</code>, <code>PERCENTILE</code>, <code>MEDIAN</code>, and
     * <code>CUSTOM</code>.
     * </p>
     * 
     * @param aggregation
     *        The aggregation of a named entity. Valid values for this structure are <code>SUM</code>, <code>MIN</code>,
     *        <code>MAX</code>, <code>COUNT</code>, <code>AVERAGE</code>, <code>DISTINCT_COUNT</code>,
     *        <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>, <code>VARP</code>, <code>PERCENTILE</code>,
     *        <code>MEDIAN</code>, and <code>CUSTOM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamedEntityAggType
     */

    public NamedEntityDefinitionMetric withAggregation(String aggregation) {
        setAggregation(aggregation);
        return this;
    }

    /**
     * <p>
     * The aggregation of a named entity. Valid values for this structure are <code>SUM</code>, <code>MIN</code>,
     * <code>MAX</code>, <code>COUNT</code>, <code>AVERAGE</code>, <code>DISTINCT_COUNT</code>, <code>STDEV</code>,
     * <code>STDEVP</code>, <code>VAR</code>, <code>VARP</code>, <code>PERCENTILE</code>, <code>MEDIAN</code>, and
     * <code>CUSTOM</code>.
     * </p>
     * 
     * @param aggregation
     *        The aggregation of a named entity. Valid values for this structure are <code>SUM</code>, <code>MIN</code>,
     *        <code>MAX</code>, <code>COUNT</code>, <code>AVERAGE</code>, <code>DISTINCT_COUNT</code>,
     *        <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>, <code>VARP</code>, <code>PERCENTILE</code>,
     *        <code>MEDIAN</code>, and <code>CUSTOM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamedEntityAggType
     */

    public NamedEntityDefinitionMetric withAggregation(NamedEntityAggType aggregation) {
        this.aggregation = aggregation.toString();
        return this;
    }

    /**
     * <p>
     * The additional parameters for an aggregation function.
     * </p>
     * 
     * @return The additional parameters for an aggregation function.
     */

    public java.util.Map<String, String> getAggregationFunctionParameters() {
        return aggregationFunctionParameters;
    }

    /**
     * <p>
     * The additional parameters for an aggregation function.
     * </p>
     * 
     * @param aggregationFunctionParameters
     *        The additional parameters for an aggregation function.
     */

    public void setAggregationFunctionParameters(java.util.Map<String, String> aggregationFunctionParameters) {
        this.aggregationFunctionParameters = aggregationFunctionParameters;
    }

    /**
     * <p>
     * The additional parameters for an aggregation function.
     * </p>
     * 
     * @param aggregationFunctionParameters
     *        The additional parameters for an aggregation function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamedEntityDefinitionMetric withAggregationFunctionParameters(java.util.Map<String, String> aggregationFunctionParameters) {
        setAggregationFunctionParameters(aggregationFunctionParameters);
        return this;
    }

    /**
     * Add a single AggregationFunctionParameters entry
     *
     * @see NamedEntityDefinitionMetric#withAggregationFunctionParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public NamedEntityDefinitionMetric addAggregationFunctionParametersEntry(String key, String value) {
        if (null == this.aggregationFunctionParameters) {
            this.aggregationFunctionParameters = new java.util.HashMap<String, String>();
        }
        if (this.aggregationFunctionParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.aggregationFunctionParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AggregationFunctionParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamedEntityDefinitionMetric clearAggregationFunctionParametersEntries() {
        this.aggregationFunctionParameters = null;
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
        if (getAggregation() != null)
            sb.append("Aggregation: ").append(getAggregation()).append(",");
        if (getAggregationFunctionParameters() != null)
            sb.append("AggregationFunctionParameters: ").append(getAggregationFunctionParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NamedEntityDefinitionMetric == false)
            return false;
        NamedEntityDefinitionMetric other = (NamedEntityDefinitionMetric) obj;
        if (other.getAggregation() == null ^ this.getAggregation() == null)
            return false;
        if (other.getAggregation() != null && other.getAggregation().equals(this.getAggregation()) == false)
            return false;
        if (other.getAggregationFunctionParameters() == null ^ this.getAggregationFunctionParameters() == null)
            return false;
        if (other.getAggregationFunctionParameters() != null
                && other.getAggregationFunctionParameters().equals(this.getAggregationFunctionParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregation() == null) ? 0 : getAggregation().hashCode());
        hashCode = prime * hashCode + ((getAggregationFunctionParameters() == null) ? 0 : getAggregationFunctionParameters().hashCode());
        return hashCode;
    }

    @Override
    public NamedEntityDefinitionMetric clone() {
        try {
            return (NamedEntityDefinitionMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NamedEntityDefinitionMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
