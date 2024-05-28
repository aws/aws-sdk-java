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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/GetImageFrame" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImageFrameRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The data store identifier.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The image set identifier.
     * </p>
     */
    private String imageSetId;
    /**
     * <p>
     * Information about the image frame (pixel data) identifier.
     * </p>
     */
    private ImageFrameInformation imageFrameInformation;

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @return The data store identifier.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImageFrameRequest withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The image set identifier.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier.
     */

    public void setImageSetId(String imageSetId) {
        this.imageSetId = imageSetId;
    }

    /**
     * <p>
     * The image set identifier.
     * </p>
     * 
     * @return The image set identifier.
     */

    public String getImageSetId() {
        return this.imageSetId;
    }

    /**
     * <p>
     * The image set identifier.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImageFrameRequest withImageSetId(String imageSetId) {
        setImageSetId(imageSetId);
        return this;
    }

    /**
     * <p>
     * Information about the image frame (pixel data) identifier.
     * </p>
     * 
     * @param imageFrameInformation
     *        Information about the image frame (pixel data) identifier.
     */

    public void setImageFrameInformation(ImageFrameInformation imageFrameInformation) {
        this.imageFrameInformation = imageFrameInformation;
    }

    /**
     * <p>
     * Information about the image frame (pixel data) identifier.
     * </p>
     * 
     * @return Information about the image frame (pixel data) identifier.
     */

    public ImageFrameInformation getImageFrameInformation() {
        return this.imageFrameInformation;
    }

    /**
     * <p>
     * Information about the image frame (pixel data) identifier.
     * </p>
     * 
     * @param imageFrameInformation
     *        Information about the image frame (pixel data) identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImageFrameRequest withImageFrameInformation(ImageFrameInformation imageFrameInformation) {
        setImageFrameInformation(imageFrameInformation);
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
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getImageSetId() != null)
            sb.append("ImageSetId: ").append(getImageSetId()).append(",");
        if (getImageFrameInformation() != null)
            sb.append("ImageFrameInformation: ").append(getImageFrameInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImageFrameRequest == false)
            return false;
        GetImageFrameRequest other = (GetImageFrameRequest) obj;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getImageSetId() == null ^ this.getImageSetId() == null)
            return false;
        if (other.getImageSetId() != null && other.getImageSetId().equals(this.getImageSetId()) == false)
            return false;
        if (other.getImageFrameInformation() == null ^ this.getImageFrameInformation() == null)
            return false;
        if (other.getImageFrameInformation() != null && other.getImageFrameInformation().equals(this.getImageFrameInformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getImageSetId() == null) ? 0 : getImageSetId().hashCode());
        hashCode = prime * hashCode + ((getImageFrameInformation() == null) ? 0 : getImageFrameInformation().hashCode());
        return hashCode;
    }

    @Override
    public GetImageFrameRequest clone() {
        return (GetImageFrameRequest) super.clone();
    }

}
