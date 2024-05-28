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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCrossAccountAttachments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCrossAccountAttachmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the cross-account attachments.
     * </p>
     */
    private java.util.List<Attachment> crossAccountAttachments;
    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the cross-account attachments.
     * </p>
     * 
     * @return Information about the cross-account attachments.
     */

    public java.util.List<Attachment> getCrossAccountAttachments() {
        return crossAccountAttachments;
    }

    /**
     * <p>
     * Information about the cross-account attachments.
     * </p>
     * 
     * @param crossAccountAttachments
     *        Information about the cross-account attachments.
     */

    public void setCrossAccountAttachments(java.util.Collection<Attachment> crossAccountAttachments) {
        if (crossAccountAttachments == null) {
            this.crossAccountAttachments = null;
            return;
        }

        this.crossAccountAttachments = new java.util.ArrayList<Attachment>(crossAccountAttachments);
    }

    /**
     * <p>
     * Information about the cross-account attachments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCrossAccountAttachments(java.util.Collection)} or
     * {@link #withCrossAccountAttachments(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param crossAccountAttachments
     *        Information about the cross-account attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrossAccountAttachmentsResult withCrossAccountAttachments(Attachment... crossAccountAttachments) {
        if (this.crossAccountAttachments == null) {
            setCrossAccountAttachments(new java.util.ArrayList<Attachment>(crossAccountAttachments.length));
        }
        for (Attachment ele : crossAccountAttachments) {
            this.crossAccountAttachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the cross-account attachments.
     * </p>
     * 
     * @param crossAccountAttachments
     *        Information about the cross-account attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrossAccountAttachmentsResult withCrossAccountAttachments(java.util.Collection<Attachment> crossAccountAttachments) {
        setCrossAccountAttachments(crossAccountAttachments);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @return The token for the next set of results. You receive this token from a previous call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrossAccountAttachmentsResult withNextToken(String nextToken) {
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
        if (getCrossAccountAttachments() != null)
            sb.append("CrossAccountAttachments: ").append(getCrossAccountAttachments()).append(",");
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

        if (obj instanceof ListCrossAccountAttachmentsResult == false)
            return false;
        ListCrossAccountAttachmentsResult other = (ListCrossAccountAttachmentsResult) obj;
        if (other.getCrossAccountAttachments() == null ^ this.getCrossAccountAttachments() == null)
            return false;
        if (other.getCrossAccountAttachments() != null && other.getCrossAccountAttachments().equals(this.getCrossAccountAttachments()) == false)
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

        hashCode = prime * hashCode + ((getCrossAccountAttachments() == null) ? 0 : getCrossAccountAttachments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCrossAccountAttachmentsResult clone() {
        try {
            return (ListCrossAccountAttachmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
