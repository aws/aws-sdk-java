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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListReportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReportJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about your report jobs in JSON format.
     * </p>
     */
    private java.util.List<ReportJob> reportJobs;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Details about your report jobs in JSON format.
     * </p>
     * 
     * @return Details about your report jobs in JSON format.
     */

    public java.util.List<ReportJob> getReportJobs() {
        return reportJobs;
    }

    /**
     * <p>
     * Details about your report jobs in JSON format.
     * </p>
     * 
     * @param reportJobs
     *        Details about your report jobs in JSON format.
     */

    public void setReportJobs(java.util.Collection<ReportJob> reportJobs) {
        if (reportJobs == null) {
            this.reportJobs = null;
            return;
        }

        this.reportJobs = new java.util.ArrayList<ReportJob>(reportJobs);
    }

    /**
     * <p>
     * Details about your report jobs in JSON format.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReportJobs(java.util.Collection)} or {@link #withReportJobs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param reportJobs
     *        Details about your report jobs in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportJobsResult withReportJobs(ReportJob... reportJobs) {
        if (this.reportJobs == null) {
            setReportJobs(new java.util.ArrayList<ReportJob>(reportJobs.length));
        }
        for (ReportJob ele : reportJobs) {
            this.reportJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about your report jobs in JSON format.
     * </p>
     * 
     * @param reportJobs
     *        Details about your report jobs in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportJobsResult withReportJobs(java.util.Collection<ReportJob> reportJobs) {
        setReportJobs(reportJobs);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReportJobsResult withNextToken(String nextToken) {
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
        if (getReportJobs() != null)
            sb.append("ReportJobs: ").append(getReportJobs()).append(",");
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

        if (obj instanceof ListReportJobsResult == false)
            return false;
        ListReportJobsResult other = (ListReportJobsResult) obj;
        if (other.getReportJobs() == null ^ this.getReportJobs() == null)
            return false;
        if (other.getReportJobs() != null && other.getReportJobs().equals(this.getReportJobs()) == false)
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

        hashCode = prime * hashCode + ((getReportJobs() == null) ? 0 : getReportJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListReportJobsResult clone() {
        try {
            return (ListReportJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
