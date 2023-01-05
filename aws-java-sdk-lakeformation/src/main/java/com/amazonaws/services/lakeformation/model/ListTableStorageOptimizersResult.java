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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListTableStorageOptimizers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTableStorageOptimizersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the storage optimizers associated with a table.
     * </p>
     */
    private java.util.List<StorageOptimizer> storageOptimizerList;
    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the storage optimizers associated with a table.
     * </p>
     * 
     * @return A list of the storage optimizers associated with a table.
     */

    public java.util.List<StorageOptimizer> getStorageOptimizerList() {
        return storageOptimizerList;
    }

    /**
     * <p>
     * A list of the storage optimizers associated with a table.
     * </p>
     * 
     * @param storageOptimizerList
     *        A list of the storage optimizers associated with a table.
     */

    public void setStorageOptimizerList(java.util.Collection<StorageOptimizer> storageOptimizerList) {
        if (storageOptimizerList == null) {
            this.storageOptimizerList = null;
            return;
        }

        this.storageOptimizerList = new java.util.ArrayList<StorageOptimizer>(storageOptimizerList);
    }

    /**
     * <p>
     * A list of the storage optimizers associated with a table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageOptimizerList(java.util.Collection)} or {@link #withStorageOptimizerList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param storageOptimizerList
     *        A list of the storage optimizers associated with a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableStorageOptimizersResult withStorageOptimizerList(StorageOptimizer... storageOptimizerList) {
        if (this.storageOptimizerList == null) {
            setStorageOptimizerList(new java.util.ArrayList<StorageOptimizer>(storageOptimizerList.length));
        }
        for (StorageOptimizer ele : storageOptimizerList) {
            this.storageOptimizerList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the storage optimizers associated with a table.
     * </p>
     * 
     * @param storageOptimizerList
     *        A list of the storage optimizers associated with a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableStorageOptimizersResult withStorageOptimizerList(java.util.Collection<StorageOptimizer> storageOptimizerList) {
        setStorageOptimizerList(storageOptimizerList);
        return this;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token for paginating the returned list of tokens, returned if the current segment of the
     *        list is not the last.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     * 
     * @return A continuation token for paginating the returned list of tokens, returned if the current segment of the
     *         list is not the last.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is
     * not the last.
     * </p>
     * 
     * @param nextToken
     *        A continuation token for paginating the returned list of tokens, returned if the current segment of the
     *        list is not the last.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableStorageOptimizersResult withNextToken(String nextToken) {
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
        if (getStorageOptimizerList() != null)
            sb.append("StorageOptimizerList: ").append(getStorageOptimizerList()).append(",");
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

        if (obj instanceof ListTableStorageOptimizersResult == false)
            return false;
        ListTableStorageOptimizersResult other = (ListTableStorageOptimizersResult) obj;
        if (other.getStorageOptimizerList() == null ^ this.getStorageOptimizerList() == null)
            return false;
        if (other.getStorageOptimizerList() != null && other.getStorageOptimizerList().equals(this.getStorageOptimizerList()) == false)
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

        hashCode = prime * hashCode + ((getStorageOptimizerList() == null) ? 0 : getStorageOptimizerList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTableStorageOptimizersResult clone() {
        try {
            return (ListTableStorageOptimizersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
