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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListGeofenceCollections" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGeofenceCollectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the geofence collections that exist in your AWS account.
     * </p>
     */
    private java.util.List<ListGeofenceCollectionsResponseEntry> entries;
    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the geofence collections that exist in your AWS account.
     * </p>
     * 
     * @return Lists the geofence collections that exist in your AWS account.
     */

    public java.util.List<ListGeofenceCollectionsResponseEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * Lists the geofence collections that exist in your AWS account.
     * </p>
     * 
     * @param entries
     *        Lists the geofence collections that exist in your AWS account.
     */

    public void setEntries(java.util.Collection<ListGeofenceCollectionsResponseEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<ListGeofenceCollectionsResponseEntry>(entries);
    }

    /**
     * <p>
     * Lists the geofence collections that exist in your AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        Lists the geofence collections that exist in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeofenceCollectionsResult withEntries(ListGeofenceCollectionsResponseEntry... entries) {
        if (this.entries == null) {
            setEntries(new java.util.ArrayList<ListGeofenceCollectionsResponseEntry>(entries.length));
        }
        for (ListGeofenceCollectionsResponseEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the geofence collections that exist in your AWS account.
     * </p>
     * 
     * @param entries
     *        Lists the geofence collections that exist in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeofenceCollectionsResult withEntries(java.util.Collection<ListGeofenceCollectionsResponseEntry> entries) {
        setEntries(entries);
        return this;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token indicating there are additional pages available. You can use the token in a following
     *        request to fetch the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     * 
     * @return A pagination token indicating there are additional pages available. You can use the token in a following
     *         request to fetch the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token indicating there are additional pages available. You can use the token in a following
     *        request to fetch the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeofenceCollectionsResult withNextToken(String nextToken) {
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
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries()).append(",");
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

        if (obj instanceof ListGeofenceCollectionsResult == false)
            return false;
        ListGeofenceCollectionsResult other = (ListGeofenceCollectionsResult) obj;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
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

        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGeofenceCollectionsResult clone() {
        try {
            return (ListGeofenceCollectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
