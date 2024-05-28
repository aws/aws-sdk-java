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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetUploadParts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReadSetUploadPartsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Next token returned in the response of a previous ListReadSetUploadParts call. Used to get the next page of
     * results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of upload parts.
     * </p>
     */
    private java.util.List<ReadSetUploadPartListItem> parts;

    /**
     * <p>
     * Next token returned in the response of a previous ListReadSetUploadParts call. Used to get the next page of
     * results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous ListReadSetUploadParts call. Used to get the next page
     *        of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous ListReadSetUploadParts call. Used to get the next page of
     * results.
     * </p>
     * 
     * @return Next token returned in the response of a previous ListReadSetUploadParts call. Used to get the next page
     *         of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous ListReadSetUploadParts call. Used to get the next page of
     * results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous ListReadSetUploadParts call. Used to get the next page
     *        of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReadSetUploadPartsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of upload parts.
     * </p>
     * 
     * @return An array of upload parts.
     */

    public java.util.List<ReadSetUploadPartListItem> getParts() {
        return parts;
    }

    /**
     * <p>
     * An array of upload parts.
     * </p>
     * 
     * @param parts
     *        An array of upload parts.
     */

    public void setParts(java.util.Collection<ReadSetUploadPartListItem> parts) {
        if (parts == null) {
            this.parts = null;
            return;
        }

        this.parts = new java.util.ArrayList<ReadSetUploadPartListItem>(parts);
    }

    /**
     * <p>
     * An array of upload parts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParts(java.util.Collection)} or {@link #withParts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param parts
     *        An array of upload parts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReadSetUploadPartsResult withParts(ReadSetUploadPartListItem... parts) {
        if (this.parts == null) {
            setParts(new java.util.ArrayList<ReadSetUploadPartListItem>(parts.length));
        }
        for (ReadSetUploadPartListItem ele : parts) {
            this.parts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of upload parts.
     * </p>
     * 
     * @param parts
     *        An array of upload parts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReadSetUploadPartsResult withParts(java.util.Collection<ReadSetUploadPartListItem> parts) {
        setParts(parts);
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
        if (getParts() != null)
            sb.append("Parts: ").append(getParts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReadSetUploadPartsResult == false)
            return false;
        ListReadSetUploadPartsResult other = (ListReadSetUploadPartsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getParts() == null ^ this.getParts() == null)
            return false;
        if (other.getParts() != null && other.getParts().equals(this.getParts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getParts() == null) ? 0 : getParts().hashCode());
        return hashCode;
    }

    @Override
    public ListReadSetUploadPartsResult clone() {
        try {
            return (ListReadSetUploadPartsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
