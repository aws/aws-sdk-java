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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ListMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMetricsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metrics that match your request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Metric> metrics;
    /**
     * <p>
     * The token that marks the start of the next batch of returned results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * If you are using this operation in a monitoring account, this array contains the account IDs of the source
     * accounts where the metrics in the returned data are from.
     * </p>
     * <p>
     * This field is a 1:1 mapping between each metric that is returned and the ID of the owning account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> owningAccounts;

    /**
     * <p>
     * The metrics that match your request.
     * </p>
     * 
     * @return The metrics that match your request.
     */

    public java.util.List<Metric> getMetrics() {
        if (metrics == null) {
            metrics = new com.amazonaws.internal.SdkInternalList<Metric>();
        }
        return metrics;
    }

    /**
     * <p>
     * The metrics that match your request.
     * </p>
     * 
     * @param metrics
     *        The metrics that match your request.
     */

    public void setMetrics(java.util.Collection<Metric> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new com.amazonaws.internal.SdkInternalList<Metric>(metrics);
    }

    /**
     * <p>
     * The metrics that match your request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        The metrics that match your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricsResult withMetrics(Metric... metrics) {
        if (this.metrics == null) {
            setMetrics(new com.amazonaws.internal.SdkInternalList<Metric>(metrics.length));
        }
        for (Metric ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metrics that match your request.
     * </p>
     * 
     * @param metrics
     *        The metrics that match your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricsResult withMetrics(java.util.Collection<Metric> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * The token that marks the start of the next batch of returned results.
     * </p>
     * 
     * @param nextToken
     *        The token that marks the start of the next batch of returned results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that marks the start of the next batch of returned results.
     * </p>
     * 
     * @return The token that marks the start of the next batch of returned results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that marks the start of the next batch of returned results.
     * </p>
     * 
     * @param nextToken
     *        The token that marks the start of the next batch of returned results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * If you are using this operation in a monitoring account, this array contains the account IDs of the source
     * accounts where the metrics in the returned data are from.
     * </p>
     * <p>
     * This field is a 1:1 mapping between each metric that is returned and the ID of the owning account.
     * </p>
     * 
     * @return If you are using this operation in a monitoring account, this array contains the account IDs of the
     *         source accounts where the metrics in the returned data are from.</p>
     *         <p>
     *         This field is a 1:1 mapping between each metric that is returned and the ID of the owning account.
     */

    public java.util.List<String> getOwningAccounts() {
        if (owningAccounts == null) {
            owningAccounts = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return owningAccounts;
    }

    /**
     * <p>
     * If you are using this operation in a monitoring account, this array contains the account IDs of the source
     * accounts where the metrics in the returned data are from.
     * </p>
     * <p>
     * This field is a 1:1 mapping between each metric that is returned and the ID of the owning account.
     * </p>
     * 
     * @param owningAccounts
     *        If you are using this operation in a monitoring account, this array contains the account IDs of the source
     *        accounts where the metrics in the returned data are from.</p>
     *        <p>
     *        This field is a 1:1 mapping between each metric that is returned and the ID of the owning account.
     */

    public void setOwningAccounts(java.util.Collection<String> owningAccounts) {
        if (owningAccounts == null) {
            this.owningAccounts = null;
            return;
        }

        this.owningAccounts = new com.amazonaws.internal.SdkInternalList<String>(owningAccounts);
    }

    /**
     * <p>
     * If you are using this operation in a monitoring account, this array contains the account IDs of the source
     * accounts where the metrics in the returned data are from.
     * </p>
     * <p>
     * This field is a 1:1 mapping between each metric that is returned and the ID of the owning account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOwningAccounts(java.util.Collection)} or {@link #withOwningAccounts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param owningAccounts
     *        If you are using this operation in a monitoring account, this array contains the account IDs of the source
     *        accounts where the metrics in the returned data are from.</p>
     *        <p>
     *        This field is a 1:1 mapping between each metric that is returned and the ID of the owning account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricsResult withOwningAccounts(String... owningAccounts) {
        if (this.owningAccounts == null) {
            setOwningAccounts(new com.amazonaws.internal.SdkInternalList<String>(owningAccounts.length));
        }
        for (String ele : owningAccounts) {
            this.owningAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If you are using this operation in a monitoring account, this array contains the account IDs of the source
     * accounts where the metrics in the returned data are from.
     * </p>
     * <p>
     * This field is a 1:1 mapping between each metric that is returned and the ID of the owning account.
     * </p>
     * 
     * @param owningAccounts
     *        If you are using this operation in a monitoring account, this array contains the account IDs of the source
     *        accounts where the metrics in the returned data are from.</p>
     *        <p>
     *        This field is a 1:1 mapping between each metric that is returned and the ID of the owning account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricsResult withOwningAccounts(java.util.Collection<String> owningAccounts) {
        setOwningAccounts(owningAccounts);
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
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOwningAccounts() != null)
            sb.append("OwningAccounts: ").append(getOwningAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMetricsResult == false)
            return false;
        ListMetricsResult other = (ListMetricsResult) obj;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOwningAccounts() == null ^ this.getOwningAccounts() == null)
            return false;
        if (other.getOwningAccounts() != null && other.getOwningAccounts().equals(this.getOwningAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOwningAccounts() == null) ? 0 : getOwningAccounts().hashCode());
        return hashCode;
    }

    @Override
    public ListMetricsResult clone() {
        try {
            return (ListMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
