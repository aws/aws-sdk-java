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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListReplicators" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReplicatorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the response of ListReplicators is truncated, it returns a NextToken in the response. This NextToken should be
     * sent in the subsequent request to ListReplicators.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List containing information of each of the replicators in the account.
     * </p>
     */
    private java.util.List<ReplicatorSummary> replicators;

    /**
     * <p>
     * If the response of ListReplicators is truncated, it returns a NextToken in the response. This NextToken should be
     * sent in the subsequent request to ListReplicators.
     * </p>
     * 
     * @param nextToken
     *        If the response of ListReplicators is truncated, it returns a NextToken in the response. This NextToken
     *        should be sent in the subsequent request to ListReplicators.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response of ListReplicators is truncated, it returns a NextToken in the response. This NextToken should be
     * sent in the subsequent request to ListReplicators.
     * </p>
     * 
     * @return If the response of ListReplicators is truncated, it returns a NextToken in the response. This NextToken
     *         should be sent in the subsequent request to ListReplicators.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response of ListReplicators is truncated, it returns a NextToken in the response. This NextToken should be
     * sent in the subsequent request to ListReplicators.
     * </p>
     * 
     * @param nextToken
     *        If the response of ListReplicators is truncated, it returns a NextToken in the response. This NextToken
     *        should be sent in the subsequent request to ListReplicators.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReplicatorsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List containing information of each of the replicators in the account.
     * </p>
     * 
     * @return List containing information of each of the replicators in the account.
     */

    public java.util.List<ReplicatorSummary> getReplicators() {
        return replicators;
    }

    /**
     * <p>
     * List containing information of each of the replicators in the account.
     * </p>
     * 
     * @param replicators
     *        List containing information of each of the replicators in the account.
     */

    public void setReplicators(java.util.Collection<ReplicatorSummary> replicators) {
        if (replicators == null) {
            this.replicators = null;
            return;
        }

        this.replicators = new java.util.ArrayList<ReplicatorSummary>(replicators);
    }

    /**
     * <p>
     * List containing information of each of the replicators in the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicators(java.util.Collection)} or {@link #withReplicators(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param replicators
     *        List containing information of each of the replicators in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReplicatorsResult withReplicators(ReplicatorSummary... replicators) {
        if (this.replicators == null) {
            setReplicators(new java.util.ArrayList<ReplicatorSummary>(replicators.length));
        }
        for (ReplicatorSummary ele : replicators) {
            this.replicators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List containing information of each of the replicators in the account.
     * </p>
     * 
     * @param replicators
     *        List containing information of each of the replicators in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReplicatorsResult withReplicators(java.util.Collection<ReplicatorSummary> replicators) {
        setReplicators(replicators);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getReplicators() != null)
            sb.append("Replicators: ").append(getReplicators());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReplicatorsResult == false)
            return false;
        ListReplicatorsResult other = (ListReplicatorsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReplicators() == null ^ this.getReplicators() == null)
            return false;
        if (other.getReplicators() != null && other.getReplicators().equals(this.getReplicators()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReplicators() == null) ? 0 : getReplicators().hashCode());
        return hashCode;
    }

    @Override
    public ListReplicatorsResult clone() {
        try {
            return (ListReplicatorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
