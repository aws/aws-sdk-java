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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListMetadataTransferJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMetadataTransferJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata transfer job summaries.
     * </p>
     */
    private java.util.List<MetadataTransferJobSummary> metadataTransferJobSummaries;
    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The metadata transfer job summaries.
     * </p>
     * 
     * @return The metadata transfer job summaries.
     */

    public java.util.List<MetadataTransferJobSummary> getMetadataTransferJobSummaries() {
        return metadataTransferJobSummaries;
    }

    /**
     * <p>
     * The metadata transfer job summaries.
     * </p>
     * 
     * @param metadataTransferJobSummaries
     *        The metadata transfer job summaries.
     */

    public void setMetadataTransferJobSummaries(java.util.Collection<MetadataTransferJobSummary> metadataTransferJobSummaries) {
        if (metadataTransferJobSummaries == null) {
            this.metadataTransferJobSummaries = null;
            return;
        }

        this.metadataTransferJobSummaries = new java.util.ArrayList<MetadataTransferJobSummary>(metadataTransferJobSummaries);
    }

    /**
     * <p>
     * The metadata transfer job summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetadataTransferJobSummaries(java.util.Collection)} or
     * {@link #withMetadataTransferJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param metadataTransferJobSummaries
     *        The metadata transfer job summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetadataTransferJobsResult withMetadataTransferJobSummaries(MetadataTransferJobSummary... metadataTransferJobSummaries) {
        if (this.metadataTransferJobSummaries == null) {
            setMetadataTransferJobSummaries(new java.util.ArrayList<MetadataTransferJobSummary>(metadataTransferJobSummaries.length));
        }
        for (MetadataTransferJobSummary ele : metadataTransferJobSummaries) {
            this.metadataTransferJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata transfer job summaries.
     * </p>
     * 
     * @param metadataTransferJobSummaries
     *        The metadata transfer job summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetadataTransferJobsResult withMetadataTransferJobSummaries(java.util.Collection<MetadataTransferJobSummary> metadataTransferJobSummaries) {
        setMetadataTransferJobSummaries(metadataTransferJobSummaries);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @return The string that specifies the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetadataTransferJobsResult withNextToken(String nextToken) {
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
        if (getMetadataTransferJobSummaries() != null)
            sb.append("MetadataTransferJobSummaries: ").append(getMetadataTransferJobSummaries()).append(",");
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

        if (obj instanceof ListMetadataTransferJobsResult == false)
            return false;
        ListMetadataTransferJobsResult other = (ListMetadataTransferJobsResult) obj;
        if (other.getMetadataTransferJobSummaries() == null ^ this.getMetadataTransferJobSummaries() == null)
            return false;
        if (other.getMetadataTransferJobSummaries() != null && other.getMetadataTransferJobSummaries().equals(this.getMetadataTransferJobSummaries()) == false)
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

        hashCode = prime * hashCode + ((getMetadataTransferJobSummaries() == null) ? 0 : getMetadataTransferJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMetadataTransferJobsResult clone() {
        try {
            return (ListMetadataTransferJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
