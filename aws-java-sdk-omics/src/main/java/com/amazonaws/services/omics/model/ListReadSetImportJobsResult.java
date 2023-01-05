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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetImportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReadSetImportJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of jobs.
     * </p>
     */
    private java.util.List<ImportReadSetJobItem> importJobs;
    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of jobs.
     * </p>
     * 
     * @return A list of jobs.
     */

    public java.util.List<ImportReadSetJobItem> getImportJobs() {
        return importJobs;
    }

    /**
     * <p>
     * A list of jobs.
     * </p>
     * 
     * @param importJobs
     *        A list of jobs.
     */

    public void setImportJobs(java.util.Collection<ImportReadSetJobItem> importJobs) {
        if (importJobs == null) {
            this.importJobs = null;
            return;
        }

        this.importJobs = new java.util.ArrayList<ImportReadSetJobItem>(importJobs);
    }

    /**
     * <p>
     * A list of jobs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImportJobs(java.util.Collection)} or {@link #withImportJobs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param importJobs
     *        A list of jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReadSetImportJobsResult withImportJobs(ImportReadSetJobItem... importJobs) {
        if (this.importJobs == null) {
            setImportJobs(new java.util.ArrayList<ImportReadSetJobItem>(importJobs.length));
        }
        for (ImportReadSetJobItem ele : importJobs) {
            this.importJobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of jobs.
     * </p>
     * 
     * @param importJobs
     *        A list of jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReadSetImportJobsResult withImportJobs(java.util.Collection<ImportReadSetJobItem> importJobs) {
        setImportJobs(importJobs);
        return this;
    }

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that's included if more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @return A pagination token that's included if more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReadSetImportJobsResult withNextToken(String nextToken) {
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

        if (obj instanceof ListReadSetImportJobsResult == false)
            return false;
        ListReadSetImportJobsResult other = (ListReadSetImportJobsResult) obj;
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
    public ListReadSetImportJobsResult clone() {
        try {
            return (ListReadSetImportJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
