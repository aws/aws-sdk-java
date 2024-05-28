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
package com.amazonaws.services.artifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/ListReports" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Pagination token to request the next page of resources.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of report resources.
     * </p>
     */
    private java.util.List<ReportSummary> reports;

    /**
     * <p>
     * Pagination token to request the next page of resources.
     * </p>
     * 
     * @param nextToken
     *        Pagination token to request the next page of resources.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token to request the next page of resources.
     * </p>
     * 
     * @return Pagination token to request the next page of resources.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token to request the next page of resources.
     * </p>
     * 
     * @param nextToken
     *        Pagination token to request the next page of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of report resources.
     * </p>
     * 
     * @return List of report resources.
     */

    public java.util.List<ReportSummary> getReports() {
        return reports;
    }

    /**
     * <p>
     * List of report resources.
     * </p>
     * 
     * @param reports
     *        List of report resources.
     */

    public void setReports(java.util.Collection<ReportSummary> reports) {
        if (reports == null) {
            this.reports = null;
            return;
        }

        this.reports = new java.util.ArrayList<ReportSummary>(reports);
    }

    /**
     * <p>
     * List of report resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReports(java.util.Collection)} or {@link #withReports(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param reports
     *        List of report resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportsResult withReports(ReportSummary... reports) {
        if (this.reports == null) {
            setReports(new java.util.ArrayList<ReportSummary>(reports.length));
        }
        for (ReportSummary ele : reports) {
            this.reports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of report resources.
     * </p>
     * 
     * @param reports
     *        List of report resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportsResult withReports(java.util.Collection<ReportSummary> reports) {
        setReports(reports);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getReports() != null)
            sb.append("Reports: ").append(getReports());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReportsResult == false)
            return false;
        ListReportsResult other = (ListReportsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReports() == null ^ this.getReports() == null)
            return false;
        if (other.getReports() != null && other.getReports().equals(this.getReports()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReports() == null) ? 0 : getReports().hashCode());
        return hashCode;
    }

    @Override
    public ListReportsResult clone() {
        try {
            return (ListReportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
