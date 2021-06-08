/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateUpdatedImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUpdatedImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Image image;
    /**
     * <p>
     * Indicates whether a new image can be created.
     * </p>
     */
    private Boolean canUpdateImage;

    /**
     * @param image
     */

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * @return
     */

    public Image getImage() {
        return this.image;
    }

    /**
     * @param image
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUpdatedImageResult withImage(Image image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * Indicates whether a new image can be created.
     * </p>
     * 
     * @param canUpdateImage
     *        Indicates whether a new image can be created.
     */

    public void setCanUpdateImage(Boolean canUpdateImage) {
        this.canUpdateImage = canUpdateImage;
    }

    /**
     * <p>
     * Indicates whether a new image can be created.
     * </p>
     * 
     * @return Indicates whether a new image can be created.
     */

    public Boolean getCanUpdateImage() {
        return this.canUpdateImage;
    }

    /**
     * <p>
     * Indicates whether a new image can be created.
     * </p>
     * 
     * @param canUpdateImage
     *        Indicates whether a new image can be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUpdatedImageResult withCanUpdateImage(Boolean canUpdateImage) {
        setCanUpdateImage(canUpdateImage);
        return this;
    }

    /**
     * <p>
     * Indicates whether a new image can be created.
     * </p>
     * 
     * @return Indicates whether a new image can be created.
     */

    public Boolean isCanUpdateImage() {
        return this.canUpdateImage;
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getCanUpdateImage() != null)
            sb.append("CanUpdateImage: ").append(getCanUpdateImage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUpdatedImageResult == false)
            return false;
        CreateUpdatedImageResult other = (CreateUpdatedImageResult) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getCanUpdateImage() == null ^ this.getCanUpdateImage() == null)
            return false;
        if (other.getCanUpdateImage() != null && other.getCanUpdateImage().equals(this.getCanUpdateImage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getCanUpdateImage() == null) ? 0 : getCanUpdateImage().hashCode());
        return hashCode;
    }

    @Override
    public CreateUpdatedImageResult clone() {
        try {
            return (CreateUpdatedImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
