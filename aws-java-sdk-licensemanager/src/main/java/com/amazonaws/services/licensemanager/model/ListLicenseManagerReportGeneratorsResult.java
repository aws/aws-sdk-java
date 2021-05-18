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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseManagerReportGenerators"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLicenseManagerReportGeneratorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A report generator that creates periodic reports on your license configurations.
     * </p>
     */
    private java.util.List<ReportGenerator> reportGenerators;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A report generator that creates periodic reports on your license configurations.
     * </p>
     * 
     * @return A report generator that creates periodic reports on your license configurations.
     */

    public java.util.List<ReportGenerator> getReportGenerators() {
        return reportGenerators;
    }

    /**
     * <p>
     * A report generator that creates periodic reports on your license configurations.
     * </p>
     * 
     * @param reportGenerators
     *        A report generator that creates periodic reports on your license configurations.
     */

    public void setReportGenerators(java.util.Collection<ReportGenerator> reportGenerators) {
        if (reportGenerators == null) {
            this.reportGenerators = null;
            return;
        }

        this.reportGenerators = new java.util.ArrayList<ReportGenerator>(reportGenerators);
    }

    /**
     * <p>
     * A report generator that creates periodic reports on your license configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReportGenerators(java.util.Collection)} or {@link #withReportGenerators(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param reportGenerators
     *        A report generator that creates periodic reports on your license configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseManagerReportGeneratorsResult withReportGenerators(ReportGenerator... reportGenerators) {
        if (this.reportGenerators == null) {
            setReportGenerators(new java.util.ArrayList<ReportGenerator>(reportGenerators.length));
        }
        for (ReportGenerator ele : reportGenerators) {
            this.reportGenerators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A report generator that creates periodic reports on your license configurations.
     * </p>
     * 
     * @param reportGenerators
     *        A report generator that creates periodic reports on your license configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseManagerReportGeneratorsResult withReportGenerators(java.util.Collection<ReportGenerator> reportGenerators) {
        setReportGenerators(reportGenerators);
        return this;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @return Token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseManagerReportGeneratorsResult withNextToken(String nextToken) {
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
        if (getReportGenerators() != null)
            sb.append("ReportGenerators: ").append(getReportGenerators()).append(",");
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

        if (obj instanceof ListLicenseManagerReportGeneratorsResult == false)
            return false;
        ListLicenseManagerReportGeneratorsResult other = (ListLicenseManagerReportGeneratorsResult) obj;
        if (other.getReportGenerators() == null ^ this.getReportGenerators() == null)
            return false;
        if (other.getReportGenerators() != null && other.getReportGenerators().equals(this.getReportGenerators()) == false)
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

        hashCode = prime * hashCode + ((getReportGenerators() == null) ? 0 : getReportGenerators().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLicenseManagerReportGeneratorsResult clone() {
        try {
            return (ListLicenseManagerReportGeneratorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
