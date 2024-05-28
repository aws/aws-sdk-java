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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStorageConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStorageConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more storage configurations than <code>maxResults</code>, use <code>nextToken</code> in the request
     * to get the next set.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of the matching storage configurations.
     * </p>
     */
    private java.util.List<StorageConfigurationSummary> storageConfigurations;

    /**
     * <p>
     * If there are more storage configurations than <code>maxResults</code>, use <code>nextToken</code> in the request
     * to get the next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more storage configurations than <code>maxResults</code>, use <code>nextToken</code> in the
     *        request to get the next set.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more storage configurations than <code>maxResults</code>, use <code>nextToken</code> in the request
     * to get the next set.
     * </p>
     * 
     * @return If there are more storage configurations than <code>maxResults</code>, use <code>nextToken</code> in the
     *         request to get the next set.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more storage configurations than <code>maxResults</code>, use <code>nextToken</code> in the request
     * to get the next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more storage configurations than <code>maxResults</code>, use <code>nextToken</code> in the
     *        request to get the next set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageConfigurationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of the matching storage configurations.
     * </p>
     * 
     * @return List of the matching storage configurations.
     */

    public java.util.List<StorageConfigurationSummary> getStorageConfigurations() {
        return storageConfigurations;
    }

    /**
     * <p>
     * List of the matching storage configurations.
     * </p>
     * 
     * @param storageConfigurations
     *        List of the matching storage configurations.
     */

    public void setStorageConfigurations(java.util.Collection<StorageConfigurationSummary> storageConfigurations) {
        if (storageConfigurations == null) {
            this.storageConfigurations = null;
            return;
        }

        this.storageConfigurations = new java.util.ArrayList<StorageConfigurationSummary>(storageConfigurations);
    }

    /**
     * <p>
     * List of the matching storage configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageConfigurations(java.util.Collection)} or
     * {@link #withStorageConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param storageConfigurations
     *        List of the matching storage configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageConfigurationsResult withStorageConfigurations(StorageConfigurationSummary... storageConfigurations) {
        if (this.storageConfigurations == null) {
            setStorageConfigurations(new java.util.ArrayList<StorageConfigurationSummary>(storageConfigurations.length));
        }
        for (StorageConfigurationSummary ele : storageConfigurations) {
            this.storageConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the matching storage configurations.
     * </p>
     * 
     * @param storageConfigurations
     *        List of the matching storage configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageConfigurationsResult withStorageConfigurations(java.util.Collection<StorageConfigurationSummary> storageConfigurations) {
        setStorageConfigurations(storageConfigurations);
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
        if (getStorageConfigurations() != null)
            sb.append("StorageConfigurations: ").append(getStorageConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStorageConfigurationsResult == false)
            return false;
        ListStorageConfigurationsResult other = (ListStorageConfigurationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStorageConfigurations() == null ^ this.getStorageConfigurations() == null)
            return false;
        if (other.getStorageConfigurations() != null && other.getStorageConfigurations().equals(this.getStorageConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStorageConfigurations() == null) ? 0 : getStorageConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ListStorageConfigurationsResult clone() {
        try {
            return (ListStorageConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
