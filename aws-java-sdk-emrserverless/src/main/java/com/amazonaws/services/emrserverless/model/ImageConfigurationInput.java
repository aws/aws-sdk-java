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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The image configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ImageConfigurationInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageConfigurationInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URI of an image in the Amazon ECR registry. This field is required when you create a new application. If you
     * leave this field blank in an update, Amazon EMR will remove the image configuration.
     * </p>
     */
    private String imageUri;

    /**
     * <p>
     * The URI of an image in the Amazon ECR registry. This field is required when you create a new application. If you
     * leave this field blank in an update, Amazon EMR will remove the image configuration.
     * </p>
     * 
     * @param imageUri
     *        The URI of an image in the Amazon ECR registry. This field is required when you create a new application.
     *        If you leave this field blank in an update, Amazon EMR will remove the image configuration.
     */

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    /**
     * <p>
     * The URI of an image in the Amazon ECR registry. This field is required when you create a new application. If you
     * leave this field blank in an update, Amazon EMR will remove the image configuration.
     * </p>
     * 
     * @return The URI of an image in the Amazon ECR registry. This field is required when you create a new application.
     *         If you leave this field blank in an update, Amazon EMR will remove the image configuration.
     */

    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * <p>
     * The URI of an image in the Amazon ECR registry. This field is required when you create a new application. If you
     * leave this field blank in an update, Amazon EMR will remove the image configuration.
     * </p>
     * 
     * @param imageUri
     *        The URI of an image in the Amazon ECR registry. This field is required when you create a new application.
     *        If you leave this field blank in an update, Amazon EMR will remove the image configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfigurationInput withImageUri(String imageUri) {
        setImageUri(imageUri);
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
        if (getImageUri() != null)
            sb.append("ImageUri: ").append(getImageUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageConfigurationInput == false)
            return false;
        ImageConfigurationInput other = (ImageConfigurationInput) obj;
        if (other.getImageUri() == null ^ this.getImageUri() == null)
            return false;
        if (other.getImageUri() != null && other.getImageUri().equals(this.getImageUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageUri() == null) ? 0 : getImageUri().hashCode());
        return hashCode;
    }

    @Override
    public ImageConfigurationInput clone() {
        try {
            return (ImageConfigurationInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.ImageConfigurationInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
