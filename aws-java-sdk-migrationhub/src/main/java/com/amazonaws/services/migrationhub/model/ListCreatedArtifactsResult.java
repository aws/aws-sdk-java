/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListCreatedArtifacts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCreatedArtifactsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more created artifacts than the max result, return the next token to be passed to the next call as a
     * bookmark of where to start from.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of created artifacts up to the maximum number of results specified in the request.
     * </p>
     */
    private java.util.List<CreatedArtifact> createdArtifactList;

    /**
     * <p>
     * If there are more created artifacts than the max result, return the next token to be passed to the next call as a
     * bookmark of where to start from.
     * </p>
     * 
     * @param nextToken
     *        If there are more created artifacts than the max result, return the next token to be passed to the next
     *        call as a bookmark of where to start from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more created artifacts than the max result, return the next token to be passed to the next call as a
     * bookmark of where to start from.
     * </p>
     * 
     * @return If there are more created artifacts than the max result, return the next token to be passed to the next
     *         call as a bookmark of where to start from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more created artifacts than the max result, return the next token to be passed to the next call as a
     * bookmark of where to start from.
     * </p>
     * 
     * @param nextToken
     *        If there are more created artifacts than the max result, return the next token to be passed to the next
     *        call as a bookmark of where to start from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCreatedArtifactsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of created artifacts up to the maximum number of results specified in the request.
     * </p>
     * 
     * @return List of created artifacts up to the maximum number of results specified in the request.
     */

    public java.util.List<CreatedArtifact> getCreatedArtifactList() {
        return createdArtifactList;
    }

    /**
     * <p>
     * List of created artifacts up to the maximum number of results specified in the request.
     * </p>
     * 
     * @param createdArtifactList
     *        List of created artifacts up to the maximum number of results specified in the request.
     */

    public void setCreatedArtifactList(java.util.Collection<CreatedArtifact> createdArtifactList) {
        if (createdArtifactList == null) {
            this.createdArtifactList = null;
            return;
        }

        this.createdArtifactList = new java.util.ArrayList<CreatedArtifact>(createdArtifactList);
    }

    /**
     * <p>
     * List of created artifacts up to the maximum number of results specified in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreatedArtifactList(java.util.Collection)} or {@link #withCreatedArtifactList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param createdArtifactList
     *        List of created artifacts up to the maximum number of results specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCreatedArtifactsResult withCreatedArtifactList(CreatedArtifact... createdArtifactList) {
        if (this.createdArtifactList == null) {
            setCreatedArtifactList(new java.util.ArrayList<CreatedArtifact>(createdArtifactList.length));
        }
        for (CreatedArtifact ele : createdArtifactList) {
            this.createdArtifactList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of created artifacts up to the maximum number of results specified in the request.
     * </p>
     * 
     * @param createdArtifactList
     *        List of created artifacts up to the maximum number of results specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCreatedArtifactsResult withCreatedArtifactList(java.util.Collection<CreatedArtifact> createdArtifactList) {
        setCreatedArtifactList(createdArtifactList);
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
        if (getCreatedArtifactList() != null)
            sb.append("CreatedArtifactList: ").append(getCreatedArtifactList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCreatedArtifactsResult == false)
            return false;
        ListCreatedArtifactsResult other = (ListCreatedArtifactsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCreatedArtifactList() == null ^ this.getCreatedArtifactList() == null)
            return false;
        if (other.getCreatedArtifactList() != null && other.getCreatedArtifactList().equals(this.getCreatedArtifactList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCreatedArtifactList() == null) ? 0 : getCreatedArtifactList().hashCode());
        return hashCode;
    }

    @Override
    public ListCreatedArtifactsResult clone() {
        try {
            return (ListCreatedArtifactsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
