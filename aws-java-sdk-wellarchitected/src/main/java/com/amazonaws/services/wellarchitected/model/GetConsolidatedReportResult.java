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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetConsolidatedReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConsolidatedReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metrics that make up the consolidated report.
     * </p>
     * <p>
     * Only returned when <code>JSON</code> format is requested.
     * </p>
     */
    private java.util.List<ConsolidatedReportMetric> metrics;

    private String nextToken;

    private String base64String;

    /**
     * <p>
     * The metrics that make up the consolidated report.
     * </p>
     * <p>
     * Only returned when <code>JSON</code> format is requested.
     * </p>
     * 
     * @return The metrics that make up the consolidated report.</p>
     *         <p>
     *         Only returned when <code>JSON</code> format is requested.
     */

    public java.util.List<ConsolidatedReportMetric> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * The metrics that make up the consolidated report.
     * </p>
     * <p>
     * Only returned when <code>JSON</code> format is requested.
     * </p>
     * 
     * @param metrics
     *        The metrics that make up the consolidated report.</p>
     *        <p>
     *        Only returned when <code>JSON</code> format is requested.
     */

    public void setMetrics(java.util.Collection<ConsolidatedReportMetric> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new java.util.ArrayList<ConsolidatedReportMetric>(metrics);
    }

    /**
     * <p>
     * The metrics that make up the consolidated report.
     * </p>
     * <p>
     * Only returned when <code>JSON</code> format is requested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        The metrics that make up the consolidated report.</p>
     *        <p>
     *        Only returned when <code>JSON</code> format is requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConsolidatedReportResult withMetrics(ConsolidatedReportMetric... metrics) {
        if (this.metrics == null) {
            setMetrics(new java.util.ArrayList<ConsolidatedReportMetric>(metrics.length));
        }
        for (ConsolidatedReportMetric ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metrics that make up the consolidated report.
     * </p>
     * <p>
     * Only returned when <code>JSON</code> format is requested.
     * </p>
     * 
     * @param metrics
     *        The metrics that make up the consolidated report.</p>
     *        <p>
     *        Only returned when <code>JSON</code> format is requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConsolidatedReportResult withMetrics(java.util.Collection<ConsolidatedReportMetric> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConsolidatedReportResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param base64String
     */

    public void setBase64String(String base64String) {
        this.base64String = base64String;
    }

    /**
     * @return
     */

    public String getBase64String() {
        return this.base64String;
    }

    /**
     * @param base64String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConsolidatedReportResult withBase64String(String base64String) {
        setBase64String(base64String);
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
        if (getBase64String() != null)
            sb.append("Base64String: ").append(getBase64String());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConsolidatedReportResult == false)
            return false;
        GetConsolidatedReportResult other = (GetConsolidatedReportResult) obj;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getBase64String() == null ^ this.getBase64String() == null)
            return false;
        if (other.getBase64String() != null && other.getBase64String().equals(this.getBase64String()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getBase64String() == null) ? 0 : getBase64String().hashCode());
        return hashCode;
    }

    @Override
    public GetConsolidatedReportResult clone() {
        try {
            return (GetConsolidatedReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
