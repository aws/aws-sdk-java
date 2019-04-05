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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListResourceDataSync" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceDataSyncResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of your current Resource Data Sync configurations and their statuses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceDataSyncItem> resourceDataSyncItems;
    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of your current Resource Data Sync configurations and their statuses.
     * </p>
     * 
     * @return A list of your current Resource Data Sync configurations and their statuses.
     */

    public java.util.List<ResourceDataSyncItem> getResourceDataSyncItems() {
        if (resourceDataSyncItems == null) {
            resourceDataSyncItems = new com.amazonaws.internal.SdkInternalList<ResourceDataSyncItem>();
        }
        return resourceDataSyncItems;
    }

    /**
     * <p>
     * A list of your current Resource Data Sync configurations and their statuses.
     * </p>
     * 
     * @param resourceDataSyncItems
     *        A list of your current Resource Data Sync configurations and their statuses.
     */

    public void setResourceDataSyncItems(java.util.Collection<ResourceDataSyncItem> resourceDataSyncItems) {
        if (resourceDataSyncItems == null) {
            this.resourceDataSyncItems = null;
            return;
        }

        this.resourceDataSyncItems = new com.amazonaws.internal.SdkInternalList<ResourceDataSyncItem>(resourceDataSyncItems);
    }

    /**
     * <p>
     * A list of your current Resource Data Sync configurations and their statuses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceDataSyncItems(java.util.Collection)} or
     * {@link #withResourceDataSyncItems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceDataSyncItems
     *        A list of your current Resource Data Sync configurations and their statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceDataSyncResult withResourceDataSyncItems(ResourceDataSyncItem... resourceDataSyncItems) {
        if (this.resourceDataSyncItems == null) {
            setResourceDataSyncItems(new com.amazonaws.internal.SdkInternalList<ResourceDataSyncItem>(resourceDataSyncItems.length));
        }
        for (ResourceDataSyncItem ele : resourceDataSyncItems) {
            this.resourceDataSyncItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of your current Resource Data Sync configurations and their statuses.
     * </p>
     * 
     * @param resourceDataSyncItems
     *        A list of your current Resource Data Sync configurations and their statuses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceDataSyncResult withResourceDataSyncItems(java.util.Collection<ResourceDataSyncItem> resourceDataSyncItems) {
        setResourceDataSyncItems(resourceDataSyncItems);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @return The token for the next set of items to return. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceDataSyncResult withNextToken(String nextToken) {
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
        if (getResourceDataSyncItems() != null)
            sb.append("ResourceDataSyncItems: ").append(getResourceDataSyncItems()).append(",");
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

        if (obj instanceof ListResourceDataSyncResult == false)
            return false;
        ListResourceDataSyncResult other = (ListResourceDataSyncResult) obj;
        if (other.getResourceDataSyncItems() == null ^ this.getResourceDataSyncItems() == null)
            return false;
        if (other.getResourceDataSyncItems() != null && other.getResourceDataSyncItems().equals(this.getResourceDataSyncItems()) == false)
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

        hashCode = prime * hashCode + ((getResourceDataSyncItems() == null) ? 0 : getResourceDataSyncItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceDataSyncResult clone() {
        try {
            return (ListResourceDataSyncResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
