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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a source image repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ImageRepository" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageRepository implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of an image.
     * </p>
     * <p>
     * For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the image name format,
     * see <a href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-pull-ecr-image.html">Pulling an
     * image</a> in the <i>Amazon ECR User Guide</i>.
     * </p>
     */
    private String imageIdentifier;
    /**
     * <p>
     * Configuration for running the identified image.
     * </p>
     */
    private ImageConfiguration imageConfiguration;
    /**
     * <p>
     * The type of the image repository. This reflects the repository provider and whether the repository is private or
     * public.
     * </p>
     */
    private String imageRepositoryType;

    /**
     * <p>
     * The identifier of an image.
     * </p>
     * <p>
     * For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the image name format,
     * see <a href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-pull-ecr-image.html">Pulling an
     * image</a> in the <i>Amazon ECR User Guide</i>.
     * </p>
     * 
     * @param imageIdentifier
     *        The identifier of an image.</p>
     *        <p>
     *        For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the image name
     *        format, see <a
     *        href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-pull-ecr-image.html">Pulling an
     *        image</a> in the <i>Amazon ECR User Guide</i>.
     */

    public void setImageIdentifier(String imageIdentifier) {
        this.imageIdentifier = imageIdentifier;
    }

    /**
     * <p>
     * The identifier of an image.
     * </p>
     * <p>
     * For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the image name format,
     * see <a href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-pull-ecr-image.html">Pulling an
     * image</a> in the <i>Amazon ECR User Guide</i>.
     * </p>
     * 
     * @return The identifier of an image.</p>
     *         <p>
     *         For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the image name
     *         format, see <a
     *         href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-pull-ecr-image.html">Pulling an
     *         image</a> in the <i>Amazon ECR User Guide</i>.
     */

    public String getImageIdentifier() {
        return this.imageIdentifier;
    }

    /**
     * <p>
     * The identifier of an image.
     * </p>
     * <p>
     * For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the image name format,
     * see <a href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-pull-ecr-image.html">Pulling an
     * image</a> in the <i>Amazon ECR User Guide</i>.
     * </p>
     * 
     * @param imageIdentifier
     *        The identifier of an image.</p>
     *        <p>
     *        For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the image name
     *        format, see <a
     *        href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-pull-ecr-image.html">Pulling an
     *        image</a> in the <i>Amazon ECR User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageRepository withImageIdentifier(String imageIdentifier) {
        setImageIdentifier(imageIdentifier);
        return this;
    }

    /**
     * <p>
     * Configuration for running the identified image.
     * </p>
     * 
     * @param imageConfiguration
     *        Configuration for running the identified image.
     */

    public void setImageConfiguration(ImageConfiguration imageConfiguration) {
        this.imageConfiguration = imageConfiguration;
    }

    /**
     * <p>
     * Configuration for running the identified image.
     * </p>
     * 
     * @return Configuration for running the identified image.
     */

    public ImageConfiguration getImageConfiguration() {
        return this.imageConfiguration;
    }

    /**
     * <p>
     * Configuration for running the identified image.
     * </p>
     * 
     * @param imageConfiguration
     *        Configuration for running the identified image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageRepository withImageConfiguration(ImageConfiguration imageConfiguration) {
        setImageConfiguration(imageConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of the image repository. This reflects the repository provider and whether the repository is private or
     * public.
     * </p>
     * 
     * @param imageRepositoryType
     *        The type of the image repository. This reflects the repository provider and whether the repository is
     *        private or public.
     * @see ImageRepositoryType
     */

    public void setImageRepositoryType(String imageRepositoryType) {
        this.imageRepositoryType = imageRepositoryType;
    }

    /**
     * <p>
     * The type of the image repository. This reflects the repository provider and whether the repository is private or
     * public.
     * </p>
     * 
     * @return The type of the image repository. This reflects the repository provider and whether the repository is
     *         private or public.
     * @see ImageRepositoryType
     */

    public String getImageRepositoryType() {
        return this.imageRepositoryType;
    }

    /**
     * <p>
     * The type of the image repository. This reflects the repository provider and whether the repository is private or
     * public.
     * </p>
     * 
     * @param imageRepositoryType
     *        The type of the image repository. This reflects the repository provider and whether the repository is
     *        private or public.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageRepositoryType
     */

    public ImageRepository withImageRepositoryType(String imageRepositoryType) {
        setImageRepositoryType(imageRepositoryType);
        return this;
    }

    /**
     * <p>
     * The type of the image repository. This reflects the repository provider and whether the repository is private or
     * public.
     * </p>
     * 
     * @param imageRepositoryType
     *        The type of the image repository. This reflects the repository provider and whether the repository is
     *        private or public.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageRepositoryType
     */

    public ImageRepository withImageRepositoryType(ImageRepositoryType imageRepositoryType) {
        this.imageRepositoryType = imageRepositoryType.toString();
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
        if (getImageIdentifier() != null)
            sb.append("ImageIdentifier: ").append(getImageIdentifier()).append(",");
        if (getImageConfiguration() != null)
            sb.append("ImageConfiguration: ").append(getImageConfiguration()).append(",");
        if (getImageRepositoryType() != null)
            sb.append("ImageRepositoryType: ").append(getImageRepositoryType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageRepository == false)
            return false;
        ImageRepository other = (ImageRepository) obj;
        if (other.getImageIdentifier() == null ^ this.getImageIdentifier() == null)
            return false;
        if (other.getImageIdentifier() != null && other.getImageIdentifier().equals(this.getImageIdentifier()) == false)
            return false;
        if (other.getImageConfiguration() == null ^ this.getImageConfiguration() == null)
            return false;
        if (other.getImageConfiguration() != null && other.getImageConfiguration().equals(this.getImageConfiguration()) == false)
            return false;
        if (other.getImageRepositoryType() == null ^ this.getImageRepositoryType() == null)
            return false;
        if (other.getImageRepositoryType() != null && other.getImageRepositoryType().equals(this.getImageRepositoryType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageIdentifier() == null) ? 0 : getImageIdentifier().hashCode());
        hashCode = prime * hashCode + ((getImageConfiguration() == null) ? 0 : getImageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getImageRepositoryType() == null) ? 0 : getImageRepositoryType().hashCode());
        return hashCode;
    }

    @Override
    public ImageRepository clone() {
        try {
            return (ImageRepository) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.ImageRepositoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
