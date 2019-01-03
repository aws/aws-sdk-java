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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CopyImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the image to copy.
     * </p>
     */
    private String sourceImageName;
    /**
     * <p>
     * The name that the image will have when it is copied to the destination.
     * </p>
     */
    private String destinationImageName;
    /**
     * <p>
     * The destination region to which the image will be copied. This parameter is required, even if you are copying an
     * image within the same region.
     * </p>
     */
    private String destinationRegion;
    /**
     * <p>
     * The description that the image will have when it is copied to the destination.
     * </p>
     */
    private String destinationImageDescription;

    /**
     * <p>
     * The name of the image to copy.
     * </p>
     * 
     * @param sourceImageName
     *        The name of the image to copy.
     */

    public void setSourceImageName(String sourceImageName) {
        this.sourceImageName = sourceImageName;
    }

    /**
     * <p>
     * The name of the image to copy.
     * </p>
     * 
     * @return The name of the image to copy.
     */

    public String getSourceImageName() {
        return this.sourceImageName;
    }

    /**
     * <p>
     * The name of the image to copy.
     * </p>
     * 
     * @param sourceImageName
     *        The name of the image to copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withSourceImageName(String sourceImageName) {
        setSourceImageName(sourceImageName);
        return this;
    }

    /**
     * <p>
     * The name that the image will have when it is copied to the destination.
     * </p>
     * 
     * @param destinationImageName
     *        The name that the image will have when it is copied to the destination.
     */

    public void setDestinationImageName(String destinationImageName) {
        this.destinationImageName = destinationImageName;
    }

    /**
     * <p>
     * The name that the image will have when it is copied to the destination.
     * </p>
     * 
     * @return The name that the image will have when it is copied to the destination.
     */

    public String getDestinationImageName() {
        return this.destinationImageName;
    }

    /**
     * <p>
     * The name that the image will have when it is copied to the destination.
     * </p>
     * 
     * @param destinationImageName
     *        The name that the image will have when it is copied to the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withDestinationImageName(String destinationImageName) {
        setDestinationImageName(destinationImageName);
        return this;
    }

    /**
     * <p>
     * The destination region to which the image will be copied. This parameter is required, even if you are copying an
     * image within the same region.
     * </p>
     * 
     * @param destinationRegion
     *        The destination region to which the image will be copied. This parameter is required, even if you are
     *        copying an image within the same region.
     */

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    /**
     * <p>
     * The destination region to which the image will be copied. This parameter is required, even if you are copying an
     * image within the same region.
     * </p>
     * 
     * @return The destination region to which the image will be copied. This parameter is required, even if you are
     *         copying an image within the same region.
     */

    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * <p>
     * The destination region to which the image will be copied. This parameter is required, even if you are copying an
     * image within the same region.
     * </p>
     * 
     * @param destinationRegion
     *        The destination region to which the image will be copied. This parameter is required, even if you are
     *        copying an image within the same region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withDestinationRegion(String destinationRegion) {
        setDestinationRegion(destinationRegion);
        return this;
    }

    /**
     * <p>
     * The description that the image will have when it is copied to the destination.
     * </p>
     * 
     * @param destinationImageDescription
     *        The description that the image will have when it is copied to the destination.
     */

    public void setDestinationImageDescription(String destinationImageDescription) {
        this.destinationImageDescription = destinationImageDescription;
    }

    /**
     * <p>
     * The description that the image will have when it is copied to the destination.
     * </p>
     * 
     * @return The description that the image will have when it is copied to the destination.
     */

    public String getDestinationImageDescription() {
        return this.destinationImageDescription;
    }

    /**
     * <p>
     * The description that the image will have when it is copied to the destination.
     * </p>
     * 
     * @param destinationImageDescription
     *        The description that the image will have when it is copied to the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyImageRequest withDestinationImageDescription(String destinationImageDescription) {
        setDestinationImageDescription(destinationImageDescription);
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
        if (getSourceImageName() != null)
            sb.append("SourceImageName: ").append(getSourceImageName()).append(",");
        if (getDestinationImageName() != null)
            sb.append("DestinationImageName: ").append(getDestinationImageName()).append(",");
        if (getDestinationRegion() != null)
            sb.append("DestinationRegion: ").append(getDestinationRegion()).append(",");
        if (getDestinationImageDescription() != null)
            sb.append("DestinationImageDescription: ").append(getDestinationImageDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyImageRequest == false)
            return false;
        CopyImageRequest other = (CopyImageRequest) obj;
        if (other.getSourceImageName() == null ^ this.getSourceImageName() == null)
            return false;
        if (other.getSourceImageName() != null && other.getSourceImageName().equals(this.getSourceImageName()) == false)
            return false;
        if (other.getDestinationImageName() == null ^ this.getDestinationImageName() == null)
            return false;
        if (other.getDestinationImageName() != null && other.getDestinationImageName().equals(this.getDestinationImageName()) == false)
            return false;
        if (other.getDestinationRegion() == null ^ this.getDestinationRegion() == null)
            return false;
        if (other.getDestinationRegion() != null && other.getDestinationRegion().equals(this.getDestinationRegion()) == false)
            return false;
        if (other.getDestinationImageDescription() == null ^ this.getDestinationImageDescription() == null)
            return false;
        if (other.getDestinationImageDescription() != null && other.getDestinationImageDescription().equals(this.getDestinationImageDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceImageName() == null) ? 0 : getSourceImageName().hashCode());
        hashCode = prime * hashCode + ((getDestinationImageName() == null) ? 0 : getDestinationImageName().hashCode());
        hashCode = prime * hashCode + ((getDestinationRegion() == null) ? 0 : getDestinationRegion().hashCode());
        hashCode = prime * hashCode + ((getDestinationImageDescription() == null) ? 0 : getDestinationImageDescription().hashCode());
        return hashCode;
    }

    @Override
    public CopyImageRequest clone() {
        return (CopyImageRequest) super.clone();
    }

}
