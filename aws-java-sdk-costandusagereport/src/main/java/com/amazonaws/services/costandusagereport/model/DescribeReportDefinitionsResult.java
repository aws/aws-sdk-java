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
package com.amazonaws.services.costandusagereport.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * If the action is successful, the service sends back an HTTP 200 response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cur-2017-01-06/DescribeReportDefinitions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReportDefinitionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of AWS Cost and Usage reports owned by the account.
     * </p>
     */
    private java.util.List<ReportDefinition> reportDefinitions;

    private String nextToken;

    /**
     * <p>
     * A list of AWS Cost and Usage reports owned by the account.
     * </p>
     * 
     * @return A list of AWS Cost and Usage reports owned by the account.
     */

    public java.util.List<ReportDefinition> getReportDefinitions() {
        return reportDefinitions;
    }

    /**
     * <p>
     * A list of AWS Cost and Usage reports owned by the account.
     * </p>
     * 
     * @param reportDefinitions
     *        A list of AWS Cost and Usage reports owned by the account.
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
     * A list of AWS Cost and Usage reports owned by the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReportDefinitions(java.util.Collection)} or {@link #withReportDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param reportDefinitions
     *        A list of AWS Cost and Usage reports owned by the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReportDefinitionsResult withReportDefinitions(ReportDefinition... reportDefinitions) {
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
     * A list of AWS Cost and Usage reports owned by the account.
     * </p>
     * 
     * @param reportDefinitions
     *        A list of AWS Cost and Usage reports owned by the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReportDefinitionsResult withReportDefinitions(java.util.Collection<ReportDefinition> reportDefinitions) {
        setReportDefinitions(reportDefinitions);
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

    public DescribeReportDefinitionsResult withNextToken(String nextToken) {
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

        if (obj instanceof DescribeReportDefinitionsResult == false)
            return false;
        DescribeReportDefinitionsResult other = (DescribeReportDefinitionsResult) obj;
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
    public DescribeReportDefinitionsResult clone() {
        try {
            return (DescribeReportDefinitionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
