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
package com.amazonaws.services.codeconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/ListSyncConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSyncConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of repository sync definitions returned by the request.
     * </p>
     */
    private java.util.List<SyncConfiguration> syncConfigurations;
    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results of the operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of repository sync definitions returned by the request.
     * </p>
     * 
     * @return The list of repository sync definitions returned by the request.
     */

    public java.util.List<SyncConfiguration> getSyncConfigurations() {
        return syncConfigurations;
    }

    /**
     * <p>
     * The list of repository sync definitions returned by the request.
     * </p>
     * 
     * @param syncConfigurations
     *        The list of repository sync definitions returned by the request.
     */

    public void setSyncConfigurations(java.util.Collection<SyncConfiguration> syncConfigurations) {
        if (syncConfigurations == null) {
            this.syncConfigurations = null;
            return;
        }

        this.syncConfigurations = new java.util.ArrayList<SyncConfiguration>(syncConfigurations);
    }

    /**
     * <p>
     * The list of repository sync definitions returned by the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSyncConfigurations(java.util.Collection)} or {@link #withSyncConfigurations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param syncConfigurations
     *        The list of repository sync definitions returned by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncConfigurationsResult withSyncConfigurations(SyncConfiguration... syncConfigurations) {
        if (this.syncConfigurations == null) {
            setSyncConfigurations(new java.util.ArrayList<SyncConfiguration>(syncConfigurations.length));
        }
        for (SyncConfiguration ele : syncConfigurations) {
            this.syncConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of repository sync definitions returned by the request.
     * </p>
     * 
     * @param syncConfigurations
     *        The list of repository sync definitions returned by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncConfigurationsResult withSyncConfigurations(java.util.Collection<SyncConfiguration> syncConfigurations) {
        setSyncConfigurations(syncConfigurations);
        return this;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results of the operation.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that allows the operation to batch the next results of the operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results of the operation.
     * </p>
     * 
     * @return An enumeration token that allows the operation to batch the next results of the operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results of the operation.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that allows the operation to batch the next results of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSyncConfigurationsResult withNextToken(String nextToken) {
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
        if (getSyncConfigurations() != null)
            sb.append("SyncConfigurations: ").append(getSyncConfigurations()).append(",");
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

        if (obj instanceof ListSyncConfigurationsResult == false)
            return false;
        ListSyncConfigurationsResult other = (ListSyncConfigurationsResult) obj;
        if (other.getSyncConfigurations() == null ^ this.getSyncConfigurations() == null)
            return false;
        if (other.getSyncConfigurations() != null && other.getSyncConfigurations().equals(this.getSyncConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getSyncConfigurations() == null) ? 0 : getSyncConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSyncConfigurationsResult clone() {
        try {
            return (ListSyncConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
