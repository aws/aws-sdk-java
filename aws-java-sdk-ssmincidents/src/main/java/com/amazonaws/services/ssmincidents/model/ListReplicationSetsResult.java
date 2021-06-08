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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListReplicationSets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReplicationSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the list replication set.
     * </p>
     */
    private java.util.List<String> replicationSetArns;

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @return The pagination token to continue to the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReplicationSetsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the list replication set.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the list replication set.
     */

    public java.util.List<String> getReplicationSetArns() {
        return replicationSetArns;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the list replication set.
     * </p>
     * 
     * @param replicationSetArns
     *        The Amazon Resource Name (ARN) of the list replication set.
     */

    public void setReplicationSetArns(java.util.Collection<String> replicationSetArns) {
        if (replicationSetArns == null) {
            this.replicationSetArns = null;
            return;
        }

        this.replicationSetArns = new java.util.ArrayList<String>(replicationSetArns);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the list replication set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationSetArns(java.util.Collection)} or {@link #withReplicationSetArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param replicationSetArns
     *        The Amazon Resource Name (ARN) of the list replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReplicationSetsResult withReplicationSetArns(String... replicationSetArns) {
        if (this.replicationSetArns == null) {
            setReplicationSetArns(new java.util.ArrayList<String>(replicationSetArns.length));
        }
        for (String ele : replicationSetArns) {
            this.replicationSetArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the list replication set.
     * </p>
     * 
     * @param replicationSetArns
     *        The Amazon Resource Name (ARN) of the list replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReplicationSetsResult withReplicationSetArns(java.util.Collection<String> replicationSetArns) {
        setReplicationSetArns(replicationSetArns);
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
        if (getReplicationSetArns() != null)
            sb.append("ReplicationSetArns: ").append(getReplicationSetArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReplicationSetsResult == false)
            return false;
        ListReplicationSetsResult other = (ListReplicationSetsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReplicationSetArns() == null ^ this.getReplicationSetArns() == null)
            return false;
        if (other.getReplicationSetArns() != null && other.getReplicationSetArns().equals(this.getReplicationSetArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReplicationSetArns() == null) ? 0 : getReplicationSetArns().hashCode());
        return hashCode;
    }

    @Override
    public ListReplicationSetsResult clone() {
        try {
            return (ListReplicationSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
