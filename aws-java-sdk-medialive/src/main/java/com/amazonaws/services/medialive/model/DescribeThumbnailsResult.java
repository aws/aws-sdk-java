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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for DescribeThumbnailsResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeThumbnails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeThumbnailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<ThumbnailDetail> thumbnailDetails;

    /**
     * @return
     */

    public java.util.List<ThumbnailDetail> getThumbnailDetails() {
        return thumbnailDetails;
    }

    /**
     * @param thumbnailDetails
     */

    public void setThumbnailDetails(java.util.Collection<ThumbnailDetail> thumbnailDetails) {
        if (thumbnailDetails == null) {
            this.thumbnailDetails = null;
            return;
        }

        this.thumbnailDetails = new java.util.ArrayList<ThumbnailDetail>(thumbnailDetails);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThumbnailDetails(java.util.Collection)} or {@link #withThumbnailDetails(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param thumbnailDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThumbnailsResult withThumbnailDetails(ThumbnailDetail... thumbnailDetails) {
        if (this.thumbnailDetails == null) {
            setThumbnailDetails(new java.util.ArrayList<ThumbnailDetail>(thumbnailDetails.length));
        }
        for (ThumbnailDetail ele : thumbnailDetails) {
            this.thumbnailDetails.add(ele);
        }
        return this;
    }

    /**
     * @param thumbnailDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThumbnailsResult withThumbnailDetails(java.util.Collection<ThumbnailDetail> thumbnailDetails) {
        setThumbnailDetails(thumbnailDetails);
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
        if (getThumbnailDetails() != null)
            sb.append("ThumbnailDetails: ").append(getThumbnailDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeThumbnailsResult == false)
            return false;
        DescribeThumbnailsResult other = (DescribeThumbnailsResult) obj;
        if (other.getThumbnailDetails() == null ^ this.getThumbnailDetails() == null)
            return false;
        if (other.getThumbnailDetails() != null && other.getThumbnailDetails().equals(this.getThumbnailDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThumbnailDetails() == null) ? 0 : getThumbnailDetails().hashCode());
        return hashCode;
    }

    @Override
    public DescribeThumbnailsResult clone() {
        try {
            return (DescribeThumbnailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
