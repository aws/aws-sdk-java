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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListDiscoveredResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDiscoveredResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more discovered resources than the max result, return the next token to be passed to the next call
     * as a bookmark of where to start from.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Returned list of discovered resources associated with the given MigrationTask.
     * </p>
     */
    private java.util.List<DiscoveredResource> discoveredResourceList;

    /**
     * <p>
     * If there are more discovered resources than the max result, return the next token to be passed to the next call
     * as a bookmark of where to start from.
     * </p>
     * 
     * @param nextToken
     *        If there are more discovered resources than the max result, return the next token to be passed to the next
     *        call as a bookmark of where to start from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more discovered resources than the max result, return the next token to be passed to the next call
     * as a bookmark of where to start from.
     * </p>
     * 
     * @return If there are more discovered resources than the max result, return the next token to be passed to the
     *         next call as a bookmark of where to start from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more discovered resources than the max result, return the next token to be passed to the next call
     * as a bookmark of where to start from.
     * </p>
     * 
     * @param nextToken
     *        If there are more discovered resources than the max result, return the next token to be passed to the next
     *        call as a bookmark of where to start from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Returned list of discovered resources associated with the given MigrationTask.
     * </p>
     * 
     * @return Returned list of discovered resources associated with the given MigrationTask.
     */

    public java.util.List<DiscoveredResource> getDiscoveredResourceList() {
        return discoveredResourceList;
    }

    /**
     * <p>
     * Returned list of discovered resources associated with the given MigrationTask.
     * </p>
     * 
     * @param discoveredResourceList
     *        Returned list of discovered resources associated with the given MigrationTask.
     */

    public void setDiscoveredResourceList(java.util.Collection<DiscoveredResource> discoveredResourceList) {
        if (discoveredResourceList == null) {
            this.discoveredResourceList = null;
            return;
        }

        this.discoveredResourceList = new java.util.ArrayList<DiscoveredResource>(discoveredResourceList);
    }

    /**
     * <p>
     * Returned list of discovered resources associated with the given MigrationTask.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDiscoveredResourceList(java.util.Collection)} or
     * {@link #withDiscoveredResourceList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param discoveredResourceList
     *        Returned list of discovered resources associated with the given MigrationTask.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesResult withDiscoveredResourceList(DiscoveredResource... discoveredResourceList) {
        if (this.discoveredResourceList == null) {
            setDiscoveredResourceList(new java.util.ArrayList<DiscoveredResource>(discoveredResourceList.length));
        }
        for (DiscoveredResource ele : discoveredResourceList) {
            this.discoveredResourceList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returned list of discovered resources associated with the given MigrationTask.
     * </p>
     * 
     * @param discoveredResourceList
     *        Returned list of discovered resources associated with the given MigrationTask.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveredResourcesResult withDiscoveredResourceList(java.util.Collection<DiscoveredResource> discoveredResourceList) {
        setDiscoveredResourceList(discoveredResourceList);
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
        if (getDiscoveredResourceList() != null)
            sb.append("DiscoveredResourceList: ").append(getDiscoveredResourceList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDiscoveredResourcesResult == false)
            return false;
        ListDiscoveredResourcesResult other = (ListDiscoveredResourcesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDiscoveredResourceList() == null ^ this.getDiscoveredResourceList() == null)
            return false;
        if (other.getDiscoveredResourceList() != null && other.getDiscoveredResourceList().equals(this.getDiscoveredResourceList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDiscoveredResourceList() == null) ? 0 : getDiscoveredResourceList().hashCode());
        return hashCode;
    }

    @Override
    public ListDiscoveredResourcesResult clone() {
        try {
            return (ListDiscoveredResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
