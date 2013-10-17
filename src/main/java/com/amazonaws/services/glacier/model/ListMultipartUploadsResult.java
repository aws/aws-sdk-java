/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.glacier.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
public class ListMultipartUploadsResult implements Serializable {

    /**
     * A list of in-progress multipart uploads.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<UploadListElement> uploadsList;

    /**
     * An opaque string that represents where to continue pagination of the
     * results. You use the marker in a new List Multipart Uploads request to
     * obtain more uploads in the list. If there are no more uploads, this
     * value is <code>null</code>.
     */
    private String marker;

    /**
     * A list of in-progress multipart uploads.
     *
     * @return A list of in-progress multipart uploads.
     */
    public java.util.List<UploadListElement> getUploadsList() {
        if (uploadsList == null) {
              uploadsList = new com.amazonaws.internal.ListWithAutoConstructFlag<UploadListElement>();
              uploadsList.setAutoConstruct(true);
        }
        return uploadsList;
    }
    
    /**
     * A list of in-progress multipart uploads.
     *
     * @param uploadsList A list of in-progress multipart uploads.
     */
    public void setUploadsList(java.util.Collection<UploadListElement> uploadsList) {
        if (uploadsList == null) {
            this.uploadsList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<UploadListElement> uploadsListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UploadListElement>(uploadsList.size());
        uploadsListCopy.addAll(uploadsList);
        this.uploadsList = uploadsListCopy;
    }
    
    /**
     * A list of in-progress multipart uploads.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadsList A list of in-progress multipart uploads.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListMultipartUploadsResult withUploadsList(UploadListElement... uploadsList) {
        if (getUploadsList() == null) setUploadsList(new java.util.ArrayList<UploadListElement>(uploadsList.length));
        for (UploadListElement value : uploadsList) {
            getUploadsList().add(value);
        }
        return this;
    }
    
    /**
     * A list of in-progress multipart uploads.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadsList A list of in-progress multipart uploads.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListMultipartUploadsResult withUploadsList(java.util.Collection<UploadListElement> uploadsList) {
        if (uploadsList == null) {
            this.uploadsList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<UploadListElement> uploadsListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UploadListElement>(uploadsList.size());
            uploadsListCopy.addAll(uploadsList);
            this.uploadsList = uploadsListCopy;
        }

        return this;
    }

    /**
     * An opaque string that represents where to continue pagination of the
     * results. You use the marker in a new List Multipart Uploads request to
     * obtain more uploads in the list. If there are no more uploads, this
     * value is <code>null</code>.
     *
     * @return An opaque string that represents where to continue pagination of the
     *         results. You use the marker in a new List Multipart Uploads request to
     *         obtain more uploads in the list. If there are no more uploads, this
     *         value is <code>null</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An opaque string that represents where to continue pagination of the
     * results. You use the marker in a new List Multipart Uploads request to
     * obtain more uploads in the list. If there are no more uploads, this
     * value is <code>null</code>.
     *
     * @param marker An opaque string that represents where to continue pagination of the
     *         results. You use the marker in a new List Multipart Uploads request to
     *         obtain more uploads in the list. If there are no more uploads, this
     *         value is <code>null</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An opaque string that represents where to continue pagination of the
     * results. You use the marker in a new List Multipart Uploads request to
     * obtain more uploads in the list. If there are no more uploads, this
     * value is <code>null</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An opaque string that represents where to continue pagination of the
     *         results. You use the marker in a new List Multipart Uploads request to
     *         obtain more uploads in the list. If there are no more uploads, this
     *         value is <code>null</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListMultipartUploadsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUploadsList() != null) sb.append("UploadsList: " + getUploadsList() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListMultipartUploadsResult == false) return false;
        ListMultipartUploadsResult other = (ListMultipartUploadsResult)obj;
        
        if (other.getUploadsList() == null ^ this.getUploadsList() == null) return false;
        if (other.getUploadsList() != null && other.getUploadsList().equals(this.getUploadsList()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    