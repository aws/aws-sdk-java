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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetBatchImportJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBatchImportJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array containing the details of each batch import job.
     * </p>
     */
    private java.util.List<BatchImport> batchImports;
    /**
     * <p>
     * The next token for the subsequent resquest.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array containing the details of each batch import job.
     * </p>
     * 
     * @return An array containing the details of each batch import job.
     */

    public java.util.List<BatchImport> getBatchImports() {
        return batchImports;
    }

    /**
     * <p>
     * An array containing the details of each batch import job.
     * </p>
     * 
     * @param batchImports
     *        An array containing the details of each batch import job.
     */

    public void setBatchImports(java.util.Collection<BatchImport> batchImports) {
        if (batchImports == null) {
            this.batchImports = null;
            return;
        }

        this.batchImports = new java.util.ArrayList<BatchImport>(batchImports);
    }

    /**
     * <p>
     * An array containing the details of each batch import job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBatchImports(java.util.Collection)} or {@link #withBatchImports(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param batchImports
     *        An array containing the details of each batch import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBatchImportJobsResult withBatchImports(BatchImport... batchImports) {
        if (this.batchImports == null) {
            setBatchImports(new java.util.ArrayList<BatchImport>(batchImports.length));
        }
        for (BatchImport ele : batchImports) {
            this.batchImports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing the details of each batch import job.
     * </p>
     * 
     * @param batchImports
     *        An array containing the details of each batch import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBatchImportJobsResult withBatchImports(java.util.Collection<BatchImport> batchImports) {
        setBatchImports(batchImports);
        return this;
    }

    /**
     * <p>
     * The next token for the subsequent resquest.
     * </p>
     * 
     * @param nextToken
     *        The next token for the subsequent resquest.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token for the subsequent resquest.
     * </p>
     * 
     * @return The next token for the subsequent resquest.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token for the subsequent resquest.
     * </p>
     * 
     * @param nextToken
     *        The next token for the subsequent resquest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBatchImportJobsResult withNextToken(String nextToken) {
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
        if (getBatchImports() != null)
            sb.append("BatchImports: ").append(getBatchImports()).append(",");
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

        if (obj instanceof GetBatchImportJobsResult == false)
            return false;
        GetBatchImportJobsResult other = (GetBatchImportJobsResult) obj;
        if (other.getBatchImports() == null ^ this.getBatchImports() == null)
            return false;
        if (other.getBatchImports() != null && other.getBatchImports().equals(this.getBatchImports()) == false)
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

        hashCode = prime * hashCode + ((getBatchImports() == null) ? 0 : getBatchImports().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetBatchImportJobsResult clone() {
        try {
            return (GetBatchImportJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
