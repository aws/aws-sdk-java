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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the result of a list uploads request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListUploads" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUploadsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the uploads.
     * </p>
     */
    private java.util.List<Upload> uploads;
    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the uploads.
     * </p>
     * 
     * @return Information about the uploads.
     */

    public java.util.List<Upload> getUploads() {
        return uploads;
    }

    /**
     * <p>
     * Information about the uploads.
     * </p>
     * 
     * @param uploads
     *        Information about the uploads.
     */

    public void setUploads(java.util.Collection<Upload> uploads) {
        if (uploads == null) {
            this.uploads = null;
            return;
        }

        this.uploads = new java.util.ArrayList<Upload>(uploads);
    }

    /**
     * <p>
     * Information about the uploads.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUploads(java.util.Collection)} or {@link #withUploads(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param uploads
     *        Information about the uploads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUploadsResult withUploads(Upload... uploads) {
        if (this.uploads == null) {
            setUploads(new java.util.ArrayList<Upload>(uploads.length));
        }
        for (Upload ele : uploads) {
            this.uploads.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the uploads.
     * </p>
     * 
     * @param uploads
     *        Information about the uploads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUploadsResult withUploads(java.util.Collection<Upload> uploads) {
        setUploads(uploads);
        return this;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        If the number of items that are returned is significantly large, this is an identifier that is also
     *        returned, which can be used in a subsequent call to this operation to return the next set of items in the
     *        list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @return If the number of items that are returned is significantly large, this is an identifier that is also
     *         returned, which can be used in a subsequent call to this operation to return the next set of items in the
     *         list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        If the number of items that are returned is significantly large, this is an identifier that is also
     *        returned, which can be used in a subsequent call to this operation to return the next set of items in the
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUploadsResult withNextToken(String nextToken) {
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
        if (getUploads() != null)
            sb.append("Uploads: ").append(getUploads()).append(",");
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

        if (obj instanceof ListUploadsResult == false)
            return false;
        ListUploadsResult other = (ListUploadsResult) obj;
        if (other.getUploads() == null ^ this.getUploads() == null)
            return false;
        if (other.getUploads() != null && other.getUploads().equals(this.getUploads()) == false)
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

        hashCode = prime * hashCode + ((getUploads() == null) ? 0 : getUploads().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListUploadsResult clone() {
        try {
            return (ListUploadsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
