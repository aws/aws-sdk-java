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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMultipartUploadsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of in-progress multipart uploads.
     * </p>
     */
    private java.util.List<UploadListElement> uploadsList;
    /**
     * <p>
     * An opaque string that represents where to continue pagination of the results. You use the marker in a new List
     * Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this value is
     * <code>null</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of in-progress multipart uploads.
     * </p>
     * 
     * @return A list of in-progress multipart uploads.
     */

    public java.util.List<UploadListElement> getUploadsList() {
        return uploadsList;
    }

    /**
     * <p>
     * A list of in-progress multipart uploads.
     * </p>
     * 
     * @param uploadsList
     *        A list of in-progress multipart uploads.
     */

    public void setUploadsList(java.util.Collection<UploadListElement> uploadsList) {
        if (uploadsList == null) {
            this.uploadsList = null;
            return;
        }

        this.uploadsList = new java.util.ArrayList<UploadListElement>(uploadsList);
    }

    /**
     * <p>
     * A list of in-progress multipart uploads.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUploadsList(java.util.Collection)} or {@link #withUploadsList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param uploadsList
     *        A list of in-progress multipart uploads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultipartUploadsResult withUploadsList(UploadListElement... uploadsList) {
        if (this.uploadsList == null) {
            setUploadsList(new java.util.ArrayList<UploadListElement>(uploadsList.length));
        }
        for (UploadListElement ele : uploadsList) {
            this.uploadsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of in-progress multipart uploads.
     * </p>
     * 
     * @param uploadsList
     *        A list of in-progress multipart uploads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultipartUploadsResult withUploadsList(java.util.Collection<UploadListElement> uploadsList) {
        setUploadsList(uploadsList);
        return this;
    }

    /**
     * <p>
     * An opaque string that represents where to continue pagination of the results. You use the marker in a new List
     * Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this value is
     * <code>null</code>.
     * </p>
     * 
     * @param marker
     *        An opaque string that represents where to continue pagination of the results. You use the marker in a new
     *        List Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this
     *        value is <code>null</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string that represents where to continue pagination of the results. You use the marker in a new List
     * Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this value is
     * <code>null</code>.
     * </p>
     * 
     * @return An opaque string that represents where to continue pagination of the results. You use the marker in a new
     *         List Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this
     *         value is <code>null</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An opaque string that represents where to continue pagination of the results. You use the marker in a new List
     * Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this value is
     * <code>null</code>.
     * </p>
     * 
     * @param marker
     *        An opaque string that represents where to continue pagination of the results. You use the marker in a new
     *        List Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this
     *        value is <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultipartUploadsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getUploadsList() != null)
            sb.append("UploadsList: ").append(getUploadsList()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMultipartUploadsResult == false)
            return false;
        ListMultipartUploadsResult other = (ListMultipartUploadsResult) obj;
        if (other.getUploadsList() == null ^ this.getUploadsList() == null)
            return false;
        if (other.getUploadsList() != null && other.getUploadsList().equals(this.getUploadsList()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUploadsList() == null) ? 0 : getUploadsList().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListMultipartUploadsResult clone() {
        try {
            return (ListMultipartUploadsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
