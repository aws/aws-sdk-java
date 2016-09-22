/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;

/**
 * <p>
 * An object representing an Amazon ECR image failure.
 * </p>
 */
public class ImageFailure implements Serializable, Cloneable {

    /**
     * <p>
     * The image ID associated with the failure.
     * </p>
     */
    private ImageIdentifier imageId;
    /**
     * <p>
     * The code associated with the failure.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * The reason for the failure.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The image ID associated with the failure.
     * </p>
     * 
     * @param imageId
     *        The image ID associated with the failure.
     */

    public void setImageId(ImageIdentifier imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The image ID associated with the failure.
     * </p>
     * 
     * @return The image ID associated with the failure.
     */

    public ImageIdentifier getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The image ID associated with the failure.
     * </p>
     * 
     * @param imageId
     *        The image ID associated with the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageFailure withImageId(ImageIdentifier imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The code associated with the failure.
     * </p>
     * 
     * @param failureCode
     *        The code associated with the failure.
     * @see ImageFailureCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The code associated with the failure.
     * </p>
     * 
     * @return The code associated with the failure.
     * @see ImageFailureCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The code associated with the failure.
     * </p>
     * 
     * @param failureCode
     *        The code associated with the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageFailureCode
     */

    public ImageFailure withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The code associated with the failure.
     * </p>
     * 
     * @param failureCode
     *        The code associated with the failure.
     * @see ImageFailureCode
     */

    public void setFailureCode(ImageFailureCode failureCode) {
        this.failureCode = failureCode.toString();
    }

    /**
     * <p>
     * The code associated with the failure.
     * </p>
     * 
     * @param failureCode
     *        The code associated with the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageFailureCode
     */

    public ImageFailure withFailureCode(ImageFailureCode failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        The reason for the failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     * 
     * @return The reason for the failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        The reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageFailure withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getFailureCode() != null)
            sb.append("FailureCode: " + getFailureCode() + ",");
        if (getFailureReason() != null)
            sb.append("FailureReason: " + getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageFailure == false)
            return false;
        ImageFailure other = (ImageFailure) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public ImageFailure clone() {
        try {
            return (ImageFailure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
