/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationcostprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/ListReportDefinitions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReportDefinitionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The retrieved reports.
     * </p>
     */
    private java.util.List<ReportDefinition> reportDefinitions;
    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The retrieved reports.
     * </p>
     * 
     * @return The retrieved reports.
     */

    public java.util.List<ReportDefinition> getReportDefinitions() {
        return reportDefinitions;
    }

    /**
     * <p>
     * The retrieved reports.
     * </p>
     * 
     * @param reportDefinitions
     *        The retrieved reports.
     */

    public void setReportDefinitions(java.util.Collection<ReportDefinition> reportDefinitions) {
        if (reportDefinitions == null) {
            this.reportDefinitions = null;
            return;
        }

        this.reportDefinitions = new java.util.ArrayList<ReportDefinition>(reportDefinitions);
    }

    /**
     * <p>
     * The retrieved reports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReportDefinitions(java.util.Collection)} or {@link #withReportDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param reportDefinitions
     *        The retrieved reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportDefinitionsResult withReportDefinitions(ReportDefinition... reportDefinitions) {
        if (this.reportDefinitions == null) {
            setReportDefinitions(new java.util.ArrayList<ReportDefinition>(reportDefinitions.length));
        }
        for (ReportDefinition ele : reportDefinitions) {
            this.reportDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The retrieved reports.
     * </p>
     * 
     * @param reportDefinitions
     *        The retrieved reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportDefinitionsResult withReportDefinitions(java.util.Collection<ReportDefinition> reportDefinitions) {
        setReportDefinitions(reportDefinitions);
        return this;
    }

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The value of the next token, if it exists. Null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more results.
     * </p>
     * 
     * @return The value of the next token, if it exists. Null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The value of the next token, if it exists. Null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The value of the next token, if it exists. Null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportDefinitionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getReportDefinitions() != null)
            sb.append("ReportDefinitions: ").append(getReportDefinitions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReportDefinitionsResult == false)
            return false;
        ListReportDefinitionsResult other = (ListReportDefinitionsResult) obj;
        if (other.getReportDefinitions() == null ^ this.getReportDefinitions() == null)
            return false;
        if (other.getReportDefinitions() != null && other.getReportDefinitions().equals(this.getReportDefinitions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportDefinitions() == null) ? 0 : getReportDefinitions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListReportDefinitionsResult clone() {
        try {
            return (ListReportDefinitionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
