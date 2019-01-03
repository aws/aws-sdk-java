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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShareInvitations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceShareInvitationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the invitations.
     * </p>
     */
    private java.util.List<ResourceShareInvitation> resourceShareInvitations;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the invitations.
     * </p>
     * 
     * @return Information about the invitations.
     */

    public java.util.List<ResourceShareInvitation> getResourceShareInvitations() {
        return resourceShareInvitations;
    }

    /**
     * <p>
     * Information about the invitations.
     * </p>
     * 
     * @param resourceShareInvitations
     *        Information about the invitations.
     */

    public void setResourceShareInvitations(java.util.Collection<ResourceShareInvitation> resourceShareInvitations) {
        if (resourceShareInvitations == null) {
            this.resourceShareInvitations = null;
            return;
        }

        this.resourceShareInvitations = new java.util.ArrayList<ResourceShareInvitation>(resourceShareInvitations);
    }

    /**
     * <p>
     * Information about the invitations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceShareInvitations(java.util.Collection)} or
     * {@link #withResourceShareInvitations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceShareInvitations
     *        Information about the invitations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceShareInvitationsResult withResourceShareInvitations(ResourceShareInvitation... resourceShareInvitations) {
        if (this.resourceShareInvitations == null) {
            setResourceShareInvitations(new java.util.ArrayList<ResourceShareInvitation>(resourceShareInvitations.length));
        }
        for (ResourceShareInvitation ele : resourceShareInvitations) {
            this.resourceShareInvitations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the invitations.
     * </p>
     * 
     * @param resourceShareInvitations
     *        Information about the invitations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceShareInvitationsResult withResourceShareInvitations(java.util.Collection<ResourceShareInvitation> resourceShareInvitations) {
        setResourceShareInvitations(resourceShareInvitations);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceShareInvitationsResult withNextToken(String nextToken) {
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
        if (getResourceShareInvitations() != null)
            sb.append("ResourceShareInvitations: ").append(getResourceShareInvitations()).append(",");
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

        if (obj instanceof GetResourceShareInvitationsResult == false)
            return false;
        GetResourceShareInvitationsResult other = (GetResourceShareInvitationsResult) obj;
        if (other.getResourceShareInvitations() == null ^ this.getResourceShareInvitations() == null)
            return false;
        if (other.getResourceShareInvitations() != null && other.getResourceShareInvitations().equals(this.getResourceShareInvitations()) == false)
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

        hashCode = prime * hashCode + ((getResourceShareInvitations() == null) ? 0 : getResourceShareInvitations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceShareInvitationsResult clone() {
        try {
            return (GetResourceShareInvitationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
