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
package com.amazonaws.services.backupstorage.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/ListChunks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChunksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** List of chunks */
    private java.util.List<Chunk> chunkList;
    /** Pagination token */
    private String nextToken;

    /**
     * List of chunks
     * 
     * @return List of chunks
     */

    public java.util.List<Chunk> getChunkList() {
        return chunkList;
    }

    /**
     * List of chunks
     * 
     * @param chunkList
     *        List of chunks
     */

    public void setChunkList(java.util.Collection<Chunk> chunkList) {
        if (chunkList == null) {
            this.chunkList = null;
            return;
        }

        this.chunkList = new java.util.ArrayList<Chunk>(chunkList);
    }

    /**
     * List of chunks
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChunkList(java.util.Collection)} or {@link #withChunkList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param chunkList
     *        List of chunks
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChunksResult withChunkList(Chunk... chunkList) {
        if (this.chunkList == null) {
            setChunkList(new java.util.ArrayList<Chunk>(chunkList.length));
        }
        for (Chunk ele : chunkList) {
            this.chunkList.add(ele);
        }
        return this;
    }

    /**
     * List of chunks
     * 
     * @param chunkList
     *        List of chunks
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChunksResult withChunkList(java.util.Collection<Chunk> chunkList) {
        setChunkList(chunkList);
        return this;
    }

    /**
     * Pagination token
     * 
     * @param nextToken
     *        Pagination token
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Pagination token
     * 
     * @return Pagination token
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * Pagination token
     * 
     * @param nextToken
     *        Pagination token
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChunksResult withNextToken(String nextToken) {
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
        if (getChunkList() != null)
            sb.append("ChunkList: ").append(getChunkList()).append(",");
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

        if (obj instanceof ListChunksResult == false)
            return false;
        ListChunksResult other = (ListChunksResult) obj;
        if (other.getChunkList() == null ^ this.getChunkList() == null)
            return false;
        if (other.getChunkList() != null && other.getChunkList().equals(this.getChunkList()) == false)
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

        hashCode = prime * hashCode + ((getChunkList() == null) ? 0 : getChunkList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListChunksResult clone() {
        try {
            return (ListChunksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
