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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListSyncResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSyncResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The sync resources.
     * </p>
     */
    private java.util.List<SyncResourceSummary> syncResources;
    /**
     * <p>
     * The string that specifies the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The sync resources.
     * </p>
     * 
     * @return The sync resources.
     */

    public java.util.List<SyncResourceSummary> getSyncResources() {
        return syncResources;
    }

    /**
     * <p>
     * The sync resources.
     * </p>
     * 
     * @param syncResources
     *        The sync resources.
     */

    public void setSyncResources(java.util.Collection<SyncResourceSummary> syncResources) {
        if (syncResources == null) {
            this.syncResources = null;
            return;
        }

        this.syncResources = new java.util.ArrayList<SyncResourceSummary>(syncResources);
    }

    /**
     * <p>
     * The sync resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSyncResources(java.util.Collection)} or {@link #withSyncResources(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param syncResources
     *        The sync resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncResourcesResult withSyncResources(SyncResourceSummary... syncResources) {
        if (this.syncResources == null) {
            setSyncResources(new java.util.ArrayList<SyncResourceSummary>(syncResources.length));
        }
        for (SyncResourceSummary ele : syncResources) {
            this.syncResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sync resources.
     * </p>
     * 
     * @param syncResources
     *        The sync resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncResourcesResult withSyncResources(java.util.Collection<SyncResourceSummary> syncResources) {
        setSyncResources(syncResources);
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

    public ListSyncResourcesResult withNextToken(String nextToken) {
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
        if (getSyncResources() != null)
            sb.append("SyncResources: ").append(getSyncResources()).append(",");
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

        if (obj instanceof ListSyncResourcesResult == false)
            return false;
        ListSyncResourcesResult other = (ListSyncResourcesResult) obj;
        if (other.getSyncResources() == null ^ this.getSyncResources() == null)
            return false;
        if (other.getSyncResources() != null && other.getSyncResources().equals(this.getSyncResources()) == false)
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

        hashCode = prime * hashCode + ((getSyncResources() == null) ? 0 : getSyncResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSyncResourcesResult clone() {
        try {
            return (ListSyncResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
