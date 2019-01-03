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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Gets the Amazon EC2 Container Registry path of the docker image of the model that is hosted in this
 * <a>ProductionVariant</a>.
 * </p>
 * <p>
 * If you used the <code>registry/repository[:tag]</code> form to specify the image path of the primary container when
 * you created the model hosted in this <code>ProductionVariant</code>, the path resolves to a path of the form
 * <code>registry/repository[@digest]</code>. A digest is a hash value that identifies a specific version of an image.
 * For information about Amazon ECR paths, see <a
 * href="http://docs.aws.amazon.com//AmazonECR/latest/userguide/docker-pull-ecr-image.html">Pulling an Image</a> in the
 * <i>Amazon ECR User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeployedImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeployedImage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The image path you specified when you created the model.
     * </p>
     */
    private String specifiedImage;
    /**
     * <p>
     * The specific digest path of the image hosted in this <code>ProductionVariant</code>.
     * </p>
     */
    private String resolvedImage;
    /**
     * <p>
     * The date and time when the image path for the model resolved to the <code>ResolvedImage</code>
     * </p>
     */
    private java.util.Date resolutionTime;

    /**
     * <p>
     * The image path you specified when you created the model.
     * </p>
     * 
     * @param specifiedImage
     *        The image path you specified when you created the model.
     */

    public void setSpecifiedImage(String specifiedImage) {
        this.specifiedImage = specifiedImage;
    }

    /**
     * <p>
     * The image path you specified when you created the model.
     * </p>
     * 
     * @return The image path you specified when you created the model.
     */

    public String getSpecifiedImage() {
        return this.specifiedImage;
    }

    /**
     * <p>
     * The image path you specified when you created the model.
     * </p>
     * 
     * @param specifiedImage
     *        The image path you specified when you created the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeployedImage withSpecifiedImage(String specifiedImage) {
        setSpecifiedImage(specifiedImage);
        return this;
    }

    /**
     * <p>
     * The specific digest path of the image hosted in this <code>ProductionVariant</code>.
     * </p>
     * 
     * @param resolvedImage
     *        The specific digest path of the image hosted in this <code>ProductionVariant</code>.
     */

    public void setResolvedImage(String resolvedImage) {
        this.resolvedImage = resolvedImage;
    }

    /**
     * <p>
     * The specific digest path of the image hosted in this <code>ProductionVariant</code>.
     * </p>
     * 
     * @return The specific digest path of the image hosted in this <code>ProductionVariant</code>.
     */

    public String getResolvedImage() {
        return this.resolvedImage;
    }

    /**
     * <p>
     * The specific digest path of the image hosted in this <code>ProductionVariant</code>.
     * </p>
     * 
     * @param resolvedImage
     *        The specific digest path of the image hosted in this <code>ProductionVariant</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeployedImage withResolvedImage(String resolvedImage) {
        setResolvedImage(resolvedImage);
        return this;
    }

    /**
     * <p>
     * The date and time when the image path for the model resolved to the <code>ResolvedImage</code>
     * </p>
     * 
     * @param resolutionTime
     *        The date and time when the image path for the model resolved to the <code>ResolvedImage</code>
     */

    public void setResolutionTime(java.util.Date resolutionTime) {
        this.resolutionTime = resolutionTime;
    }

    /**
     * <p>
     * The date and time when the image path for the model resolved to the <code>ResolvedImage</code>
     * </p>
     * 
     * @return The date and time when the image path for the model resolved to the <code>ResolvedImage</code>
     */

    public java.util.Date getResolutionTime() {
        return this.resolutionTime;
    }

    /**
     * <p>
     * The date and time when the image path for the model resolved to the <code>ResolvedImage</code>
     * </p>
     * 
     * @param resolutionTime
     *        The date and time when the image path for the model resolved to the <code>ResolvedImage</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeployedImage withResolutionTime(java.util.Date resolutionTime) {
        setResolutionTime(resolutionTime);
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
        if (getSpecifiedImage() != null)
            sb.append("SpecifiedImage: ").append(getSpecifiedImage()).append(",");
        if (getResolvedImage() != null)
            sb.append("ResolvedImage: ").append(getResolvedImage()).append(",");
        if (getResolutionTime() != null)
            sb.append("ResolutionTime: ").append(getResolutionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeployedImage == false)
            return false;
        DeployedImage other = (DeployedImage) obj;
        if (other.getSpecifiedImage() == null ^ this.getSpecifiedImage() == null)
            return false;
        if (other.getSpecifiedImage() != null && other.getSpecifiedImage().equals(this.getSpecifiedImage()) == false)
            return false;
        if (other.getResolvedImage() == null ^ this.getResolvedImage() == null)
            return false;
        if (other.getResolvedImage() != null && other.getResolvedImage().equals(this.getResolvedImage()) == false)
            return false;
        if (other.getResolutionTime() == null ^ this.getResolutionTime() == null)
            return false;
        if (other.getResolutionTime() != null && other.getResolutionTime().equals(this.getResolutionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpecifiedImage() == null) ? 0 : getSpecifiedImage().hashCode());
        hashCode = prime * hashCode + ((getResolvedImage() == null) ? 0 : getResolvedImage().hashCode());
        hashCode = prime * hashCode + ((getResolutionTime() == null) ? 0 : getResolutionTime().hashCode());
        return hashCode;
    }

    @Override
    public DeployedImage clone() {
        try {
            return (DeployedImage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DeployedImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
