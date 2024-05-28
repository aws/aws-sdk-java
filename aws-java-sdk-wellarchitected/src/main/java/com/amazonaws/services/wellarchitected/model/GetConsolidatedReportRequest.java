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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetConsolidatedReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConsolidatedReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The format of the consolidated report.
     * </p>
     * <p>
     * For <code>PDF</code>, <code>Base64String</code> is returned. For <code>JSON</code>, <code>Metrics</code> is
     * returned.
     * </p>
     */
    private String format;
    /**
     * <p>
     * Set to <code>true</code> to have shared resources included in the report.
     * </p>
     */
    private Boolean includeSharedResources;

    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for this request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The format of the consolidated report.
     * </p>
     * <p>
     * For <code>PDF</code>, <code>Base64String</code> is returned. For <code>JSON</code>, <code>Metrics</code> is
     * returned.
     * </p>
     * 
     * @param format
     *        The format of the consolidated report.</p>
     *        <p>
     *        For <code>PDF</code>, <code>Base64String</code> is returned. For <code>JSON</code>, <code>Metrics</code>
     *        is returned.
     * @see ReportFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the consolidated report.
     * </p>
     * <p>
     * For <code>PDF</code>, <code>Base64String</code> is returned. For <code>JSON</code>, <code>Metrics</code> is
     * returned.
     * </p>
     * 
     * @return The format of the consolidated report.</p>
     *         <p>
     *         For <code>PDF</code>, <code>Base64String</code> is returned. For <code>JSON</code>, <code>Metrics</code>
     *         is returned.
     * @see ReportFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the consolidated report.
     * </p>
     * <p>
     * For <code>PDF</code>, <code>Base64String</code> is returned. For <code>JSON</code>, <code>Metrics</code> is
     * returned.
     * </p>
     * 
     * @param format
     *        The format of the consolidated report.</p>
     *        <p>
     *        For <code>PDF</code>, <code>Base64String</code> is returned. For <code>JSON</code>, <code>Metrics</code>
     *        is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFormat
     */

    public GetConsolidatedReportRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the consolidated report.
     * </p>
     * <p>
     * For <code>PDF</code>, <code>Base64String</code> is returned. For <code>JSON</code>, <code>Metrics</code> is
     * returned.
     * </p>
     * 
     * @param format
     *        The format of the consolidated report.</p>
     *        <p>
     *        For <code>PDF</code>, <code>Base64String</code> is returned. For <code>JSON</code>, <code>Metrics</code>
     *        is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFormat
     */

    public GetConsolidatedReportRequest withFormat(ReportFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to have shared resources included in the report.
     * </p>
     * 
     * @param includeSharedResources
     *        Set to <code>true</code> to have shared resources included in the report.
     */

    public void setIncludeSharedResources(Boolean includeSharedResources) {
        this.includeSharedResources = includeSharedResources;
    }

    /**
     * <p>
     * Set to <code>true</code> to have shared resources included in the report.
     * </p>
     * 
     * @return Set to <code>true</code> to have shared resources included in the report.
     */

    public Boolean getIncludeSharedResources() {
        return this.includeSharedResources;
    }

    /**
     * <p>
     * Set to <code>true</code> to have shared resources included in the report.
     * </p>
     * 
     * @param includeSharedResources
     *        Set to <code>true</code> to have shared resources included in the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConsolidatedReportRequest withIncludeSharedResources(Boolean includeSharedResources) {
        setIncludeSharedResources(includeSharedResources);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to have shared resources included in the report.
     * </p>
     * 
     * @return Set to <code>true</code> to have shared resources included in the report.
     */

    public Boolean isIncludeSharedResources() {
        return this.includeSharedResources;
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

    public GetConsolidatedReportRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for this request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for this request.
     * </p>
     * 
     * @return The maximum number of results to return for this request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConsolidatedReportRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getIncludeSharedResources() != null)
            sb.append("IncludeSharedResources: ").append(getIncludeSharedResources()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConsolidatedReportRequest == false)
            return false;
        GetConsolidatedReportRequest other = (GetConsolidatedReportRequest) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getIncludeSharedResources() == null ^ this.getIncludeSharedResources() == null)
            return false;
        if (other.getIncludeSharedResources() != null && other.getIncludeSharedResources().equals(this.getIncludeSharedResources()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getIncludeSharedResources() == null) ? 0 : getIncludeSharedResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetConsolidatedReportRequest clone() {
        return (GetConsolidatedReportRequest) super.clone();
    }

}
