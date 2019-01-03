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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutMetricFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMetricFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * A name for the metric filter.
     * </p>
     */
    private String filterName;
    /**
     * <p>
     * A filter pattern for extracting metric data out of ingested log events.
     * </p>
     */
    private String filterPattern;
    /**
     * <p>
     * A collection of information that defines how metric data gets emitted.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricTransformation> metricTransformations;

    /**
     * Default constructor for PutMetricFilterRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public PutMetricFilterRequest() {
    }

    /**
     * Constructs a new PutMetricFilterRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param logGroupName
     *        The name of the log group.
     * @param filterName
     *        A name for the metric filter.
     * @param filterPattern
     *        A filter pattern for extracting metric data out of ingested log events.
     * @param metricTransformations
     *        A collection of information that defines how metric data gets emitted.
     */
    public PutMetricFilterRequest(String logGroupName, String filterName, String filterPattern, java.util.List<MetricTransformation> metricTransformations) {
        setLogGroupName(logGroupName);
        setFilterName(filterName);
        setFilterPattern(filterPattern);
        setMetricTransformations(metricTransformations);
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @return The name of the log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricFilterRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * A name for the metric filter.
     * </p>
     * 
     * @param filterName
     *        A name for the metric filter.
     */

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * <p>
     * A name for the metric filter.
     * </p>
     * 
     * @return A name for the metric filter.
     */

    public String getFilterName() {
        return this.filterName;
    }

    /**
     * <p>
     * A name for the metric filter.
     * </p>
     * 
     * @param filterName
     *        A name for the metric filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricFilterRequest withFilterName(String filterName) {
        setFilterName(filterName);
        return this;
    }

    /**
     * <p>
     * A filter pattern for extracting metric data out of ingested log events.
     * </p>
     * 
     * @param filterPattern
     *        A filter pattern for extracting metric data out of ingested log events.
     */

    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    /**
     * <p>
     * A filter pattern for extracting metric data out of ingested log events.
     * </p>
     * 
     * @return A filter pattern for extracting metric data out of ingested log events.
     */

    public String getFilterPattern() {
        return this.filterPattern;
    }

    /**
     * <p>
     * A filter pattern for extracting metric data out of ingested log events.
     * </p>
     * 
     * @param filterPattern
     *        A filter pattern for extracting metric data out of ingested log events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricFilterRequest withFilterPattern(String filterPattern) {
        setFilterPattern(filterPattern);
        return this;
    }

    /**
     * <p>
     * A collection of information that defines how metric data gets emitted.
     * </p>
     * 
     * @return A collection of information that defines how metric data gets emitted.
     */

    public java.util.List<MetricTransformation> getMetricTransformations() {
        if (metricTransformations == null) {
            metricTransformations = new com.amazonaws.internal.SdkInternalList<MetricTransformation>();
        }
        return metricTransformations;
    }

    /**
     * <p>
     * A collection of information that defines how metric data gets emitted.
     * </p>
     * 
     * @param metricTransformations
     *        A collection of information that defines how metric data gets emitted.
     */

    public void setMetricTransformations(java.util.Collection<MetricTransformation> metricTransformations) {
        if (metricTransformations == null) {
            this.metricTransformations = null;
            return;
        }

        this.metricTransformations = new com.amazonaws.internal.SdkInternalList<MetricTransformation>(metricTransformations);
    }

    /**
     * <p>
     * A collection of information that defines how metric data gets emitted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricTransformations(java.util.Collection)} or
     * {@link #withMetricTransformations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param metricTransformations
     *        A collection of information that defines how metric data gets emitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricFilterRequest withMetricTransformations(MetricTransformation... metricTransformations) {
        if (this.metricTransformations == null) {
            setMetricTransformations(new com.amazonaws.internal.SdkInternalList<MetricTransformation>(metricTransformations.length));
        }
        for (MetricTransformation ele : metricTransformations) {
            this.metricTransformations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of information that defines how metric data gets emitted.
     * </p>
     * 
     * @param metricTransformations
     *        A collection of information that defines how metric data gets emitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricFilterRequest withMetricTransformations(java.util.Collection<MetricTransformation> metricTransformations) {
        setMetricTransformations(metricTransformations);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getFilterName() != null)
            sb.append("FilterName: ").append(getFilterName()).append(",");
        if (getFilterPattern() != null)
            sb.append("FilterPattern: ").append(getFilterPattern()).append(",");
        if (getMetricTransformations() != null)
            sb.append("MetricTransformations: ").append(getMetricTransformations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMetricFilterRequest == false)
            return false;
        PutMetricFilterRequest other = (PutMetricFilterRequest) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getFilterName() == null ^ this.getFilterName() == null)
            return false;
        if (other.getFilterName() != null && other.getFilterName().equals(this.getFilterName()) == false)
            return false;
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null)
            return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false)
            return false;
        if (other.getMetricTransformations() == null ^ this.getMetricTransformations() == null)
            return false;
        if (other.getMetricTransformations() != null && other.getMetricTransformations().equals(this.getMetricTransformations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        hashCode = prime * hashCode + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode());
        hashCode = prime * hashCode + ((getMetricTransformations() == null) ? 0 : getMetricTransformations().hashCode());
        return hashCode;
    }

    @Override
    public PutMetricFilterRequest clone() {
        return (PutMetricFilterRequest) super.clone();
    }

}
