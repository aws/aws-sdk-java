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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetReports" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetReportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The array of <code>Report</code> objects returned by <code>BatchGetReports</code>.
     * </p>
     */
    private java.util.List<Report> reports;
    /**
     * <p>
     * An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a <code>Report</code>.
     * </p>
     */
    private java.util.List<String> reportsNotFound;

    /**
     * <p>
     * The array of <code>Report</code> objects returned by <code>BatchGetReports</code>.
     * </p>
     * 
     * @return The array of <code>Report</code> objects returned by <code>BatchGetReports</code>.
     */

    public java.util.List<Report> getReports() {
        return reports;
    }

    /**
     * <p>
     * The array of <code>Report</code> objects returned by <code>BatchGetReports</code>.
     * </p>
     * 
     * @param reports
     *        The array of <code>Report</code> objects returned by <code>BatchGetReports</code>.
     */

    public void setReports(java.util.Collection<Report> reports) {
        if (reports == null) {
            this.reports = null;
            return;
        }

        this.reports = new java.util.ArrayList<Report>(reports);
    }

    /**
     * <p>
     * The array of <code>Report</code> objects returned by <code>BatchGetReports</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReports(java.util.Collection)} or {@link #withReports(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param reports
     *        The array of <code>Report</code> objects returned by <code>BatchGetReports</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetReportsResult withReports(Report... reports) {
        if (this.reports == null) {
            setReports(new java.util.ArrayList<Report>(reports.length));
        }
        for (Report ele : reports) {
            this.reports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of <code>Report</code> objects returned by <code>BatchGetReports</code>.
     * </p>
     * 
     * @param reports
     *        The array of <code>Report</code> objects returned by <code>BatchGetReports</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetReportsResult withReports(java.util.Collection<Report> reports) {
        setReports(reports);
        return this;
    }

    /**
     * <p>
     * An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a <code>Report</code>.
     * </p>
     * 
     * @return An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a
     *         <code>Report</code>.
     */

    public java.util.List<String> getReportsNotFound() {
        return reportsNotFound;
    }

    /**
     * <p>
     * An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a <code>Report</code>.
     * </p>
     * 
     * @param reportsNotFound
     *        An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a
     *        <code>Report</code>.
     */

    public void setReportsNotFound(java.util.Collection<String> reportsNotFound) {
        if (reportsNotFound == null) {
            this.reportsNotFound = null;
            return;
        }

        this.reportsNotFound = new java.util.ArrayList<String>(reportsNotFound);
    }

    /**
     * <p>
     * An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a <code>Report</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReportsNotFound(java.util.Collection)} or {@link #withReportsNotFound(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param reportsNotFound
     *        An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a
     *        <code>Report</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetReportsResult withReportsNotFound(String... reportsNotFound) {
        if (this.reportsNotFound == null) {
            setReportsNotFound(new java.util.ArrayList<String>(reportsNotFound.length));
        }
        for (String ele : reportsNotFound) {
            this.reportsNotFound.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a <code>Report</code>.
     * </p>
     * 
     * @param reportsNotFound
     *        An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a
     *        <code>Report</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetReportsResult withReportsNotFound(java.util.Collection<String> reportsNotFound) {
        setReportsNotFound(reportsNotFound);
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
        if (getReports() != null)
            sb.append("Reports: ").append(getReports()).append(",");
        if (getReportsNotFound() != null)
            sb.append("ReportsNotFound: ").append(getReportsNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetReportsResult == false)
            return false;
        BatchGetReportsResult other = (BatchGetReportsResult) obj;
        if (other.getReports() == null ^ this.getReports() == null)
            return false;
        if (other.getReports() != null && other.getReports().equals(this.getReports()) == false)
            return false;
        if (other.getReportsNotFound() == null ^ this.getReportsNotFound() == null)
            return false;
        if (other.getReportsNotFound() != null && other.getReportsNotFound().equals(this.getReportsNotFound()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReports() == null) ? 0 : getReports().hashCode());
        hashCode = prime * hashCode + ((getReportsNotFound() == null) ? 0 : getReportsNotFound().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetReportsResult clone() {
        try {
            return (BatchGetReportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
