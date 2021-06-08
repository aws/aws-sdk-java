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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An HTTP 200 response if the request succeeds, or an error message if the request fails.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListImportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImportJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the import job summaries.
     * </p>
     */
    private java.util.List<ImportJobSummary> importJobs;
    /**
     * <p>
     * A string token indicating that there might be additional import jobs available to be listed. Copy this token to a
     * subsequent call to <code>ListImportJobs</code> with the same parameters to retrieve the next page of import jobs.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the import job summaries.
     * </p>
     * 
     * @return A list of the import job summaries.
     */

    public java.util.List<ImportJobSummary> getImportJobs() {
        return importJobs;
    }

    /**
     * <p>
     * A list of the import job summaries.
     * </p>
     * 
     * @param importJobs
     *        A list of the import job summaries.
     */

    public void setImportJobs(java.util.Collection<ImportJobSummary> importJobs) {
        if (importJobs == null) {
            this.importJobs = null;
            return;
        }

        this.importJobs = new java.util.ArrayList<ImportJobSummary>(importJobs);
    }

    /**
     * <p>
     * A list of the import job summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImportJobs(java.util.Collection)} or {@link #withImportJobs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param importJobs
     *        A list of the import job summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportJobsResult withImportJobs(ImportJobSummary... importJobs) {
        if (this.importJobs == null) {
            setImportJobs(new java.util.ArrayList<ImportJobSummary>(importJobs.length));
        }
        for (ImportJobSummary ele : importJobs) {
            this.importJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the import job summaries.
     * </p>
     * 
     * @param importJobs
     *        A list of the import job summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportJobsResult withImportJobs(java.util.Collection<ImportJobSummary> importJobs) {
        setImportJobs(importJobs);
        return this;
    }

    /**
     * <p>
     * A string token indicating that there might be additional import jobs available to be listed. Copy this token to a
     * subsequent call to <code>ListImportJobs</code> with the same parameters to retrieve the next page of import jobs.
     * </p>
     * 
     * @param nextToken
     *        A string token indicating that there might be additional import jobs available to be listed. Copy this
     *        token to a subsequent call to <code>ListImportJobs</code> with the same parameters to retrieve the next
     *        page of import jobs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string token indicating that there might be additional import jobs available to be listed. Copy this token to a
     * subsequent call to <code>ListImportJobs</code> with the same parameters to retrieve the next page of import jobs.
     * </p>
     * 
     * @return A string token indicating that there might be additional import jobs available to be listed. Copy this
     *         token to a subsequent call to <code>ListImportJobs</code> with the same parameters to retrieve the next
     *         page of import jobs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string token indicating that there might be additional import jobs available to be listed. Copy this token to a
     * subsequent call to <code>ListImportJobs</code> with the same parameters to retrieve the next page of import jobs.
     * </p>
     * 
     * @param nextToken
     *        A string token indicating that there might be additional import jobs available to be listed. Copy this
     *        token to a subsequent call to <code>ListImportJobs</code> with the same parameters to retrieve the next
     *        page of import jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportJobsResult withNextToken(String nextToken) {
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
        if (getImportJobs() != null)
            sb.append("ImportJobs: ").append(getImportJobs()).append(",");
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

        if (obj instanceof ListImportJobsResult == false)
            return false;
        ListImportJobsResult other = (ListImportJobsResult) obj;
        if (other.getImportJobs() == null ^ this.getImportJobs() == null)
            return false;
        if (other.getImportJobs() != null && other.getImportJobs().equals(this.getImportJobs()) == false)
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

        hashCode = prime * hashCode + ((getImportJobs() == null) ? 0 : getImportJobs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImportJobsResult clone() {
        try {
            return (ListImportJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
