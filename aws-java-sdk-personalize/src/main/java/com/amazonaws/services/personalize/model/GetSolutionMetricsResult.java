/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/GetSolutionMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolutionMetricsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The same solution version ARN as specified in the request.
     * </p>
     */
    private String solutionVersionArn;
    /**
     * <p>
     * The metrics for the solution version.
     * </p>
     */
    private java.util.Map<String, Double> metrics;

    /**
     * <p>
     * The same solution version ARN as specified in the request.
     * </p>
     * 
     * @param solutionVersionArn
     *        The same solution version ARN as specified in the request.
     */

    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The same solution version ARN as specified in the request.
     * </p>
     * 
     * @return The same solution version ARN as specified in the request.
     */

    public String getSolutionVersionArn() {
        return this.solutionVersionArn;
    }

    /**
     * <p>
     * The same solution version ARN as specified in the request.
     * </p>
     * 
     * @param solutionVersionArn
     *        The same solution version ARN as specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolutionMetricsResult withSolutionVersionArn(String solutionVersionArn) {
        setSolutionVersionArn(solutionVersionArn);
        return this;
    }

    /**
     * <p>
     * The metrics for the solution version.
     * </p>
     * 
     * @return The metrics for the solution version.
     */

    public java.util.Map<String, Double> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * The metrics for the solution version.
     * </p>
     * 
     * @param metrics
     *        The metrics for the solution version.
     */

    public void setMetrics(java.util.Map<String, Double> metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * The metrics for the solution version.
     * </p>
     * 
     * @param metrics
     *        The metrics for the solution version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolutionMetricsResult withMetrics(java.util.Map<String, Double> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * Add a single Metrics entry
     *
     * @see GetSolutionMetricsResult#withMetrics
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetSolutionMetricsResult addMetricsEntry(String key, Double value) {
        if (null == this.metrics) {
            this.metrics = new java.util.HashMap<String, Double>();
        }
        if (this.metrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metrics.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolutionMetricsResult clearMetricsEntries() {
        this.metrics = null;
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
        if (getSolutionVersionArn() != null)
            sb.append("SolutionVersionArn: ").append(getSolutionVersionArn()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolutionMetricsResult == false)
            return false;
        GetSolutionMetricsResult other = (GetSolutionMetricsResult) obj;
        if (other.getSolutionVersionArn() == null ^ this.getSolutionVersionArn() == null)
            return false;
        if (other.getSolutionVersionArn() != null && other.getSolutionVersionArn().equals(this.getSolutionVersionArn()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSolutionVersionArn() == null) ? 0 : getSolutionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public GetSolutionMetricsResult clone() {
        try {
            return (GetSolutionMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
