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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ListImportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImportJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about the import jobs.
     * </p>
     */
    private java.util.List<ImportJobSummary> importJobSummaries;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about the import jobs.
     * </p>
     * 
     * @return Summary information about the import jobs.
     */

    public java.util.List<ImportJobSummary> getImportJobSummaries() {
        return importJobSummaries;
    }

    /**
     * <p>
     * Summary information about the import jobs.
     * </p>
     * 
     * @param importJobSummaries
     *        Summary information about the import jobs.
     */

    public void setImportJobSummaries(java.util.Collection<ImportJobSummary> importJobSummaries) {
        if (importJobSummaries == null) {
            this.importJobSummaries = null;
            return;
        }

        this.importJobSummaries = new java.util.ArrayList<ImportJobSummary>(importJobSummaries);
    }

    /**
     * <p>
     * Summary information about the import jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImportJobSummaries(java.util.Collection)} or {@link #withImportJobSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param importJobSummaries
     *        Summary information about the import jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportJobsResult withImportJobSummaries(ImportJobSummary... importJobSummaries) {
        if (this.importJobSummaries == null) {
            setImportJobSummaries(new java.util.ArrayList<ImportJobSummary>(importJobSummaries.length));
        }
        for (ImportJobSummary ele : importJobSummaries) {
            this.importJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the import jobs.
     * </p>
     * 
     * @param importJobSummaries
     *        Summary information about the import jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportJobsResult withImportJobSummaries(java.util.Collection<ImportJobSummary> importJobSummaries) {
        setImportJobSummaries(importJobSummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
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
        if (getImportJobSummaries() != null)
            sb.append("ImportJobSummaries: ").append(getImportJobSummaries()).append(",");
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
        if (other.getImportJobSummaries() == null ^ this.getImportJobSummaries() == null)
            return false;
        if (other.getImportJobSummaries() != null && other.getImportJobSummaries().equals(this.getImportJobSummaries()) == false)
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

        hashCode = prime * hashCode + ((getImportJobSummaries() == null) ? 0 : getImportJobSummaries().hashCode());
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
