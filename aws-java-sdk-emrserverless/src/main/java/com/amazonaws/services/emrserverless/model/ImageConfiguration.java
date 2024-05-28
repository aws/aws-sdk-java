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
 * The applied image configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ImageConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The image URI.
     * </p>
     */
    private String imageUri;
    /**
     * <p>
     * The SHA256 digest of the image URI. This indicates which specific image the application is configured for. The
     * image digest doesn't exist until an application has started.
     * </p>
     */
    private String resolvedImageDigest;

    /**
     * <p>
     * The image URI.
     * </p>
     * 
     * @param imageUri
     *        The image URI.
     */

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    /**
     * <p>
     * The image URI.
     * </p>
     * 
     * @return The image URI.
     */

    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * <p>
     * The image URI.
     * </p>
     * 
     * @param imageUri
     *        The image URI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfiguration withImageUri(String imageUri) {
        setImageUri(imageUri);
        return this;
    }

    /**
     * <p>
     * The SHA256 digest of the image URI. This indicates which specific image the application is configured for. The
     * image digest doesn't exist until an application has started.
     * </p>
     * 
     * @param resolvedImageDigest
     *        The SHA256 digest of the image URI. This indicates which specific image the application is configured for.
     *        The image digest doesn't exist until an application has started.
     */

    public void setResolvedImageDigest(String resolvedImageDigest) {
        this.resolvedImageDigest = resolvedImageDigest;
    }

    /**
     * <p>
     * The SHA256 digest of the image URI. This indicates which specific image the application is configured for. The
     * image digest doesn't exist until an application has started.
     * </p>
     * 
     * @return The SHA256 digest of the image URI. This indicates which specific image the application is configured
     *         for. The image digest doesn't exist until an application has started.
     */

    public String getResolvedImageDigest() {
        return this.resolvedImageDigest;
    }

    /**
     * <p>
     * The SHA256 digest of the image URI. This indicates which specific image the application is configured for. The
     * image digest doesn't exist until an application has started.
     * </p>
     * 
     * @param resolvedImageDigest
     *        The SHA256 digest of the image URI. This indicates which specific image the application is configured for.
     *        The image digest doesn't exist until an application has started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfiguration withResolvedImageDigest(String resolvedImageDigest) {
        setResolvedImageDigest(resolvedImageDigest);
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
            sb.append("ImageUri: ").append(getImageUri()).append(",");
        if (getResolvedImageDigest() != null)
            sb.append("ResolvedImageDigest: ").append(getResolvedImageDigest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageConfiguration == false)
            return false;
        ImageConfiguration other = (ImageConfiguration) obj;
        if (other.getImageUri() == null ^ this.getImageUri() == null)
            return false;
        if (other.getImageUri() != null && other.getImageUri().equals(this.getImageUri()) == false)
            return false;
        if (other.getResolvedImageDigest() == null ^ this.getResolvedImageDigest() == null)
            return false;
        if (other.getResolvedImageDigest() != null && other.getResolvedImageDigest().equals(this.getResolvedImageDigest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageUri() == null) ? 0 : getImageUri().hashCode());
        hashCode = prime * hashCode + ((getResolvedImageDigest() == null) ? 0 : getResolvedImageDigest().hashCode());
        return hashCode;
    }

    @Override
    public ImageConfiguration clone() {
        try {
            return (ImageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.ImageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
