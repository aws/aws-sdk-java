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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRecoveryPointsByLegalHold"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecoveryPointsByLegalHoldRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is the ID of the legal hold.
     * </p>
     */
    private String legalHoldId;
    /**
     * <p>
     * This is the next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * This is the maximum number of resource list items to be returned.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * This is the ID of the legal hold.
     * </p>
     * 
     * @param legalHoldId
     *        This is the ID of the legal hold.
     */

    public void setLegalHoldId(String legalHoldId) {
        this.legalHoldId = legalHoldId;
    }

    /**
     * <p>
     * This is the ID of the legal hold.
     * </p>
     * 
     * @return This is the ID of the legal hold.
     */

    public String getLegalHoldId() {
        return this.legalHoldId;
    }

    /**
     * <p>
     * This is the ID of the legal hold.
     * </p>
     * 
     * @param legalHoldId
     *        This is the ID of the legal hold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByLegalHoldRequest withLegalHoldId(String legalHoldId) {
        setLegalHoldId(legalHoldId);
        return this;
    }

    /**
     * <p>
     * This is the next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        This is the next item following a partial list of returned resources. For example, if a request is made to
     *        return <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items
     *        in your list starting at the location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * This is the next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @return This is the next item following a partial list of returned resources. For example, if a request is made
     *         to return <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more
     *         items in your list starting at the location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * This is the next item following a partial list of returned resources. For example, if a request is made to return
     * <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        This is the next item following a partial list of returned resources. For example, if a request is made to
     *        return <code>maxResults</code> number of resources, <code>NextToken</code> allows you to return more items
     *        in your list starting at the location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByLegalHoldRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * This is the maximum number of resource list items to be returned.
     * </p>
     * 
     * @param maxResults
     *        This is the maximum number of resource list items to be returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * This is the maximum number of resource list items to be returned.
     * </p>
     * 
     * @return This is the maximum number of resource list items to be returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * This is the maximum number of resource list items to be returned.
     * </p>
     * 
     * @param maxResults
     *        This is the maximum number of resource list items to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByLegalHoldRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getLegalHoldId() != null)
            sb.append("LegalHoldId: ").append(getLegalHoldId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecoveryPointsByLegalHoldRequest == false)
            return false;
        ListRecoveryPointsByLegalHoldRequest other = (ListRecoveryPointsByLegalHoldRequest) obj;
        if (other.getLegalHoldId() == null ^ this.getLegalHoldId() == null)
            return false;
        if (other.getLegalHoldId() != null && other.getLegalHoldId().equals(this.getLegalHoldId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLegalHoldId() == null) ? 0 : getLegalHoldId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListRecoveryPointsByLegalHoldRequest clone() {
        return (ListRecoveryPointsByLegalHoldRequest) super.clone();
    }

}
