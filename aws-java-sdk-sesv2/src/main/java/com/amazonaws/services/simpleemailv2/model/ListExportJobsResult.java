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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An HTTP 200 response if the request succeeds, or an error message if the request fails.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListExportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExportJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the export job summaries.
     * </p>
     */
    private java.util.List<ExportJobSummary> exportJobs;
    /**
     * <p>
     * A string token indicating that there might be additional export jobs available to be listed. Use this token to a
     * subsequent call to <code>ListExportJobs</code> with the same parameters to retrieve the next page of export jobs.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the export job summaries.
     * </p>
     * 
     * @return A list of the export job summaries.
     */

    public java.util.List<ExportJobSummary> getExportJobs() {
        return exportJobs;
    }

    /**
     * <p>
     * A list of the export job summaries.
     * </p>
     * 
     * @param exportJobs
     *        A list of the export job summaries.
     */

    public void setExportJobs(java.util.Collection<ExportJobSummary> exportJobs) {
        if (exportJobs == null) {
            this.exportJobs = null;
            return;
        }

        this.exportJobs = new java.util.ArrayList<ExportJobSummary>(exportJobs);
    }

    /**
     * <p>
     * A list of the export job summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportJobs(java.util.Collection)} or {@link #withExportJobs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exportJobs
     *        A list of the export job summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportJobsResult withExportJobs(ExportJobSummary... exportJobs) {
        if (this.exportJobs == null) {
            setExportJobs(new java.util.ArrayList<ExportJobSummary>(exportJobs.length));
        }
        for (ExportJobSummary ele : exportJobs) {
            this.exportJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the export job summaries.
     * </p>
     * 
     * @param exportJobs
     *        A list of the export job summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportJobsResult withExportJobs(java.util.Collection<ExportJobSummary> exportJobs) {
        setExportJobs(exportJobs);
        return this;
    }

    /**
     * <p>
     * A string token indicating that there might be additional export jobs available to be listed. Use this token to a
     * subsequent call to <code>ListExportJobs</code> with the same parameters to retrieve the next page of export jobs.
     * </p>
     * 
     * @param nextToken
     *        A string token indicating that there might be additional export jobs available to be listed. Use this
     *        token to a subsequent call to <code>ListExportJobs</code> with the same parameters to retrieve the next
     *        page of export jobs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string token indicating that there might be additional export jobs available to be listed. Use this token to a
     * subsequent call to <code>ListExportJobs</code> with the same parameters to retrieve the next page of export jobs.
     * </p>
     * 
     * @return A string token indicating that there might be additional export jobs available to be listed. Use this
     *         token to a subsequent call to <code>ListExportJobs</code> with the same parameters to retrieve the next
     *         page of export jobs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string token indicating that there might be additional export jobs available to be listed. Use this token to a
     * subsequent call to <code>ListExportJobs</code> with the same parameters to retrieve the next page of export jobs.
     * </p>
     * 
     * @param nextToken
     *        A string token indicating that there might be additional export jobs available to be listed. Use this
     *        token to a subsequent call to <code>ListExportJobs</code> with the same parameters to retrieve the next
     *        page of export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportJobsResult withNextToken(String nextToken) {
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
        if (getExportJobs() != null)
            sb.append("ExportJobs: ").append(getExportJobs()).append(",");
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

        if (obj instanceof ListExportJobsResult == false)
            return false;
        ListExportJobsResult other = (ListExportJobsResult) obj;
        if (other.getExportJobs() == null ^ this.getExportJobs() == null)
            return false;
        if (other.getExportJobs() != null && other.getExportJobs().equals(this.getExportJobs()) == false)
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

        hashCode = prime * hashCode + ((getExportJobs() == null) ? 0 : getExportJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExportJobsResult clone() {
        try {
            return (ListExportJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
