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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetReportGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetReportGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The array of report groups returned by <code>BatchGetReportGroups</code>.
     * </p>
     */
    private java.util.List<ReportGroup> reportGroups;
    /**
     * <p>
     * An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a
     * <code>ReportGroup</code>.
     * </p>
     */
    private java.util.List<String> reportGroupsNotFound;

    /**
     * <p>
     * The array of report groups returned by <code>BatchGetReportGroups</code>.
     * </p>
     * 
     * @return The array of report groups returned by <code>BatchGetReportGroups</code>.
     */

    public java.util.List<ReportGroup> getReportGroups() {
        return reportGroups;
    }

    /**
     * <p>
     * The array of report groups returned by <code>BatchGetReportGroups</code>.
     * </p>
     * 
     * @param reportGroups
     *        The array of report groups returned by <code>BatchGetReportGroups</code>.
     */

    public void setReportGroups(java.util.Collection<ReportGroup> reportGroups) {
        if (reportGroups == null) {
            this.reportGroups = null;
            return;
        }

        this.reportGroups = new java.util.ArrayList<ReportGroup>(reportGroups);
    }

    /**
     * <p>
     * The array of report groups returned by <code>BatchGetReportGroups</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReportGroups(java.util.Collection)} or {@link #withReportGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param reportGroups
     *        The array of report groups returned by <code>BatchGetReportGroups</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetReportGroupsResult withReportGroups(ReportGroup... reportGroups) {
        if (this.reportGroups == null) {
            setReportGroups(new java.util.ArrayList<ReportGroup>(reportGroups.length));
        }
        for (ReportGroup ele : reportGroups) {
            this.reportGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of report groups returned by <code>BatchGetReportGroups</code>.
     * </p>
     * 
     * @param reportGroups
     *        The array of report groups returned by <code>BatchGetReportGroups</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetReportGroupsResult withReportGroups(java.util.Collection<ReportGroup> reportGroups) {
        setReportGroups(reportGroups);
        return this;
    }

    /**
     * <p>
     * An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a
     * <code>ReportGroup</code>.
     * </p>
     * 
     * @return An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a
     *         <code>ReportGroup</code>.
     */

    public java.util.List<String> getReportGroupsNotFound() {
        return reportGroupsNotFound;
    }

    /**
     * <p>
     * An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a
     * <code>ReportGroup</code>.
     * </p>
     * 
     * @param reportGroupsNotFound
     *        An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a
     *        <code>ReportGroup</code>.
     */

    public void setReportGroupsNotFound(java.util.Collection<String> reportGroupsNotFound) {
        if (reportGroupsNotFound == null) {
            this.reportGroupsNotFound = null;
            return;
        }

        this.reportGroupsNotFound = new java.util.ArrayList<String>(reportGroupsNotFound);
    }

    /**
     * <p>
     * An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a
     * <code>ReportGroup</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReportGroupsNotFound(java.util.Collection)} or {@link #withReportGroupsNotFound(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param reportGroupsNotFound
     *        An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a
     *        <code>ReportGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetReportGroupsResult withReportGroupsNotFound(String... reportGroupsNotFound) {
        if (this.reportGroupsNotFound == null) {
            setReportGroupsNotFound(new java.util.ArrayList<String>(reportGroupsNotFound.length));
        }
        for (String ele : reportGroupsNotFound) {
            this.reportGroupsNotFound.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a
     * <code>ReportGroup</code>.
     * </p>
     * 
     * @param reportGroupsNotFound
     *        An array of ARNs passed to <code>BatchGetReportGroups</code> that are not associated with a
     *        <code>ReportGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetReportGroupsResult withReportGroupsNotFound(java.util.Collection<String> reportGroupsNotFound) {
        setReportGroupsNotFound(reportGroupsNotFound);
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
        if (getReportGroups() != null)
            sb.append("ReportGroups: ").append(getReportGroups()).append(",");
        if (getReportGroupsNotFound() != null)
            sb.append("ReportGroupsNotFound: ").append(getReportGroupsNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetReportGroupsResult == false)
            return false;
        BatchGetReportGroupsResult other = (BatchGetReportGroupsResult) obj;
        if (other.getReportGroups() == null ^ this.getReportGroups() == null)
            return false;
        if (other.getReportGroups() != null && other.getReportGroups().equals(this.getReportGroups()) == false)
            return false;
        if (other.getReportGroupsNotFound() == null ^ this.getReportGroupsNotFound() == null)
            return false;
        if (other.getReportGroupsNotFound() != null && other.getReportGroupsNotFound().equals(this.getReportGroupsNotFound()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportGroups() == null) ? 0 : getReportGroups().hashCode());
        hashCode = prime * hashCode + ((getReportGroupsNotFound() == null) ? 0 : getReportGroupsNotFound().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetReportGroupsResult clone() {
        try {
            return (BatchGetReportGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
