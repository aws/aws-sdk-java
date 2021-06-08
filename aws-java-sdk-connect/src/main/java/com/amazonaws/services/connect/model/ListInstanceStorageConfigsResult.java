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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListInstanceStorageConfigs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInstanceStorageConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A valid storage type.
     * </p>
     */
    private java.util.List<InstanceStorageConfig> storageConfigs;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A valid storage type.
     * </p>
     * 
     * @return A valid storage type.
     */

    public java.util.List<InstanceStorageConfig> getStorageConfigs() {
        return storageConfigs;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * 
     * @param storageConfigs
     *        A valid storage type.
     */

    public void setStorageConfigs(java.util.Collection<InstanceStorageConfig> storageConfigs) {
        if (storageConfigs == null) {
            this.storageConfigs = null;
            return;
        }

        this.storageConfigs = new java.util.ArrayList<InstanceStorageConfig>(storageConfigs);
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageConfigs(java.util.Collection)} or {@link #withStorageConfigs(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param storageConfigs
     *        A valid storage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstanceStorageConfigsResult withStorageConfigs(InstanceStorageConfig... storageConfigs) {
        if (this.storageConfigs == null) {
            setStorageConfigs(new java.util.ArrayList<InstanceStorageConfig>(storageConfigs.length));
        }
        for (InstanceStorageConfig ele : storageConfigs) {
            this.storageConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * 
     * @param storageConfigs
     *        A valid storage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstanceStorageConfigsResult withStorageConfigs(java.util.Collection<InstanceStorageConfig> storageConfigs) {
        setStorageConfigs(storageConfigs);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstanceStorageConfigsResult withNextToken(String nextToken) {
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
        if (getStorageConfigs() != null)
            sb.append("StorageConfigs: ").append(getStorageConfigs()).append(",");
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

        if (obj instanceof ListInstanceStorageConfigsResult == false)
            return false;
        ListInstanceStorageConfigsResult other = (ListInstanceStorageConfigsResult) obj;
        if (other.getStorageConfigs() == null ^ this.getStorageConfigs() == null)
            return false;
        if (other.getStorageConfigs() != null && other.getStorageConfigs().equals(this.getStorageConfigs()) == false)
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

        hashCode = prime * hashCode + ((getStorageConfigs() == null) ? 0 : getStorageConfigs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInstanceStorageConfigsResult clone() {
        try {
            return (ListInstanceStorageConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
