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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteImageVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteImageVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the image.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * The version to delete.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param imageName
     *        The name of the image.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @return The name of the image.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param imageName
     *        The name of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteImageVersionRequest withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * The version to delete.
     * </p>
     * 
     * @param version
     *        The version to delete.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version to delete.
     * </p>
     * 
     * @return The version to delete.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version to delete.
     * </p>
     * 
     * @param version
     *        The version to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteImageVersionRequest withVersion(Integer version) {
        setVersion(version);
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
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteImageVersionRequest == false)
            return false;
        DeleteImageVersionRequest other = (DeleteImageVersionRequest) obj;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public DeleteImageVersionRequest clone() {
        return (DeleteImageVersionRequest) super.clone();
    }

}
