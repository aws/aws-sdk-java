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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListAttachments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAttachmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the list of attachments.
     * </p>
     */
    private java.util.List<Attachment> attachments;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Describes the list of attachments.
     * </p>
     * 
     * @return Describes the list of attachments.
     */

    public java.util.List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * Describes the list of attachments.
     * </p>
     * 
     * @param attachments
     *        Describes the list of attachments.
     */

    public void setAttachments(java.util.Collection<Attachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new java.util.ArrayList<Attachment>(attachments);
    }

    /**
     * <p>
     * Describes the list of attachments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        Describes the list of attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachmentsResult withAttachments(Attachment... attachments) {
        if (this.attachments == null) {
            setAttachments(new java.util.ArrayList<Attachment>(attachments.length));
        }
        for (Attachment ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the list of attachments.
     * </p>
     * 
     * @param attachments
     *        Describes the list of attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachmentsResult withAttachments(java.util.Collection<Attachment> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachmentsResult withNextToken(String nextToken) {
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
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments()).append(",");
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

        if (obj instanceof ListAttachmentsResult == false)
            return false;
        ListAttachmentsResult other = (ListAttachmentsResult) obj;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
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

        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAttachmentsResult clone() {
        try {
            return (ListAttachmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
