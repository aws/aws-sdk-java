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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetReports" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetReportsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of ARNs that identify the <code>Report</code> objects to return.
     * </p>
     */
    private java.util.List<String> reportArns;

    /**
     * <p>
     * An array of ARNs that identify the <code>Report</code> objects to return.
     * </p>
     * 
     * @return An array of ARNs that identify the <code>Report</code> objects to return.
     */

    public java.util.List<String> getReportArns() {
        return reportArns;
    }

    /**
     * <p>
     * An array of ARNs that identify the <code>Report</code> objects to return.
     * </p>
     * 
     * @param reportArns
     *        An array of ARNs that identify the <code>Report</code> objects to return.
     */

    public void setReportArns(java.util.Collection<String> reportArns) {
        if (reportArns == null) {
            this.reportArns = null;
            return;
        }

        this.reportArns = new java.util.ArrayList<String>(reportArns);
    }

    /**
     * <p>
     * An array of ARNs that identify the <code>Report</code> objects to return.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReportArns(java.util.Collection)} or {@link #withReportArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param reportArns
     *        An array of ARNs that identify the <code>Report</code> objects to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetReportsRequest withReportArns(String... reportArns) {
        if (this.reportArns == null) {
            setReportArns(new java.util.ArrayList<String>(reportArns.length));
        }
        for (String ele : reportArns) {
            this.reportArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of ARNs that identify the <code>Report</code> objects to return.
     * </p>
     * 
     * @param reportArns
     *        An array of ARNs that identify the <code>Report</code> objects to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetReportsRequest withReportArns(java.util.Collection<String> reportArns) {
        setReportArns(reportArns);
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
        if (getReportArns() != null)
            sb.append("ReportArns: ").append(getReportArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetReportsRequest == false)
            return false;
        BatchGetReportsRequest other = (BatchGetReportsRequest) obj;
        if (other.getReportArns() == null ^ this.getReportArns() == null)
            return false;
        if (other.getReportArns() != null && other.getReportArns().equals(this.getReportArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportArns() == null) ? 0 : getReportArns().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetReportsRequest clone() {
        return (BatchGetReportsRequest) super.clone();
    }

}
