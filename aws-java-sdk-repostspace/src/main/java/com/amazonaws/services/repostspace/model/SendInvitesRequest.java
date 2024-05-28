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
package com.amazonaws.services.repostspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/SendInvites" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendInvitesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The array of identifiers for the users and groups.
     * </p>
     */
    private java.util.List<String> accessorIds;
    /**
     * <p>
     * The body of the invite.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The ID of the private re:Post.
     * </p>
     */
    private String spaceId;
    /**
     * <p>
     * The title of the invite.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The array of identifiers for the users and groups.
     * </p>
     * 
     * @return The array of identifiers for the users and groups.
     */

    public java.util.List<String> getAccessorIds() {
        return accessorIds;
    }

    /**
     * <p>
     * The array of identifiers for the users and groups.
     * </p>
     * 
     * @param accessorIds
     *        The array of identifiers for the users and groups.
     */

    public void setAccessorIds(java.util.Collection<String> accessorIds) {
        if (accessorIds == null) {
            this.accessorIds = null;
            return;
        }

        this.accessorIds = new java.util.ArrayList<String>(accessorIds);
    }

    /**
     * <p>
     * The array of identifiers for the users and groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessorIds(java.util.Collection)} or {@link #withAccessorIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accessorIds
     *        The array of identifiers for the users and groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendInvitesRequest withAccessorIds(String... accessorIds) {
        if (this.accessorIds == null) {
            setAccessorIds(new java.util.ArrayList<String>(accessorIds.length));
        }
        for (String ele : accessorIds) {
            this.accessorIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of identifiers for the users and groups.
     * </p>
     * 
     * @param accessorIds
     *        The array of identifiers for the users and groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendInvitesRequest withAccessorIds(java.util.Collection<String> accessorIds) {
        setAccessorIds(accessorIds);
        return this;
    }

    /**
     * <p>
     * The body of the invite.
     * </p>
     * 
     * @param body
     *        The body of the invite.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the invite.
     * </p>
     * 
     * @return The body of the invite.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The body of the invite.
     * </p>
     * 
     * @param body
     *        The body of the invite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendInvitesRequest withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The ID of the private re:Post.
     * </p>
     * 
     * @param spaceId
     *        The ID of the private re:Post.
     */

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    /**
     * <p>
     * The ID of the private re:Post.
     * </p>
     * 
     * @return The ID of the private re:Post.
     */

    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * <p>
     * The ID of the private re:Post.
     * </p>
     * 
     * @param spaceId
     *        The ID of the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendInvitesRequest withSpaceId(String spaceId) {
        setSpaceId(spaceId);
        return this;
    }

    /**
     * <p>
     * The title of the invite.
     * </p>
     * 
     * @param title
     *        The title of the invite.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the invite.
     * </p>
     * 
     * @return The title of the invite.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the invite.
     * </p>
     * 
     * @param title
     *        The title of the invite.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendInvitesRequest withTitle(String title) {
        setTitle(title);
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
        if (getAccessorIds() != null)
            sb.append("AccessorIds: ").append(getAccessorIds()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append("***Sensitive Data Redacted***").append(",");
        if (getSpaceId() != null)
            sb.append("SpaceId: ").append(getSpaceId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendInvitesRequest == false)
            return false;
        SendInvitesRequest other = (SendInvitesRequest) obj;
        if (other.getAccessorIds() == null ^ this.getAccessorIds() == null)
            return false;
        if (other.getAccessorIds() != null && other.getAccessorIds().equals(this.getAccessorIds()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getSpaceId() == null ^ this.getSpaceId() == null)
            return false;
        if (other.getSpaceId() != null && other.getSpaceId().equals(this.getSpaceId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessorIds() == null) ? 0 : getAccessorIds().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getSpaceId() == null) ? 0 : getSpaceId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public SendInvitesRequest clone() {
        return (SendInvitesRequest) super.clone();
    }

}
