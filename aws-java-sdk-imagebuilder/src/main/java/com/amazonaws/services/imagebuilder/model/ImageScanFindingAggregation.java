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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This returns exactly one type of aggregation, based on the filter that Image Builder applies in its API action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImageScanFindingAggregation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageScanFindingAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Returns an object that contains severity counts based on an account ID.
     * </p>
     */
    private AccountAggregation accountAggregation;
    /**
     * <p>
     * Returns an object that contains severity counts based on the Amazon Resource Name (ARN) for a specific image.
     * </p>
     */
    private ImageAggregation imageAggregation;
    /**
     * <p>
     * Returns an object that contains severity counts based on an image pipeline ARN.
     * </p>
     */
    private ImagePipelineAggregation imagePipelineAggregation;
    /**
     * <p>
     * Returns an object that contains severity counts based on vulnerability ID.
     * </p>
     */
    private VulnerabilityIdAggregation vulnerabilityIdAggregation;

    /**
     * <p>
     * Returns an object that contains severity counts based on an account ID.
     * </p>
     * 
     * @param accountAggregation
     *        Returns an object that contains severity counts based on an account ID.
     */

    public void setAccountAggregation(AccountAggregation accountAggregation) {
        this.accountAggregation = accountAggregation;
    }

    /**
     * <p>
     * Returns an object that contains severity counts based on an account ID.
     * </p>
     * 
     * @return Returns an object that contains severity counts based on an account ID.
     */

    public AccountAggregation getAccountAggregation() {
        return this.accountAggregation;
    }

    /**
     * <p>
     * Returns an object that contains severity counts based on an account ID.
     * </p>
     * 
     * @param accountAggregation
     *        Returns an object that contains severity counts based on an account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFindingAggregation withAccountAggregation(AccountAggregation accountAggregation) {
        setAccountAggregation(accountAggregation);
        return this;
    }

    /**
     * <p>
     * Returns an object that contains severity counts based on the Amazon Resource Name (ARN) for a specific image.
     * </p>
     * 
     * @param imageAggregation
     *        Returns an object that contains severity counts based on the Amazon Resource Name (ARN) for a specific
     *        image.
     */

    public void setImageAggregation(ImageAggregation imageAggregation) {
        this.imageAggregation = imageAggregation;
    }

    /**
     * <p>
     * Returns an object that contains severity counts based on the Amazon Resource Name (ARN) for a specific image.
     * </p>
     * 
     * @return Returns an object that contains severity counts based on the Amazon Resource Name (ARN) for a specific
     *         image.
     */

    public ImageAggregation getImageAggregation() {
        return this.imageAggregation;
    }

    /**
     * <p>
     * Returns an object that contains severity counts based on the Amazon Resource Name (ARN) for a specific image.
     * </p>
     * 
     * @param imageAggregation
     *        Returns an object that contains severity counts based on the Amazon Resource Name (ARN) for a specific
     *        image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFindingAggregation withImageAggregation(ImageAggregation imageAggregation) {
        setImageAggregation(imageAggregation);
        return this;
    }

    /**
     * <p>
     * Returns an object that contains severity counts based on an image pipeline ARN.
     * </p>
     * 
     * @param imagePipelineAggregation
     *        Returns an object that contains severity counts based on an image pipeline ARN.
     */

    public void setImagePipelineAggregation(ImagePipelineAggregation imagePipelineAggregation) {
        this.imagePipelineAggregation = imagePipelineAggregation;
    }

    /**
     * <p>
     * Returns an object that contains severity counts based on an image pipeline ARN.
     * </p>
     * 
     * @return Returns an object that contains severity counts based on an image pipeline ARN.
     */

    public ImagePipelineAggregation getImagePipelineAggregation() {
        return this.imagePipelineAggregation;
    }

    /**
     * <p>
     * Returns an object that contains severity counts based on an image pipeline ARN.
     * </p>
     * 
     * @param imagePipelineAggregation
     *        Returns an object that contains severity counts based on an image pipeline ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFindingAggregation withImagePipelineAggregation(ImagePipelineAggregation imagePipelineAggregation) {
        setImagePipelineAggregation(imagePipelineAggregation);
        return this;
    }

    /**
     * <p>
     * Returns an object that contains severity counts based on vulnerability ID.
     * </p>
     * 
     * @param vulnerabilityIdAggregation
     *        Returns an object that contains severity counts based on vulnerability ID.
     */

    public void setVulnerabilityIdAggregation(VulnerabilityIdAggregation vulnerabilityIdAggregation) {
        this.vulnerabilityIdAggregation = vulnerabilityIdAggregation;
    }

    /**
     * <p>
     * Returns an object that contains severity counts based on vulnerability ID.
     * </p>
     * 
     * @return Returns an object that contains severity counts based on vulnerability ID.
     */

    public VulnerabilityIdAggregation getVulnerabilityIdAggregation() {
        return this.vulnerabilityIdAggregation;
    }

    /**
     * <p>
     * Returns an object that contains severity counts based on vulnerability ID.
     * </p>
     * 
     * @param vulnerabilityIdAggregation
     *        Returns an object that contains severity counts based on vulnerability ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanFindingAggregation withVulnerabilityIdAggregation(VulnerabilityIdAggregation vulnerabilityIdAggregation) {
        setVulnerabilityIdAggregation(vulnerabilityIdAggregation);
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
        if (getAccountAggregation() != null)
            sb.append("AccountAggregation: ").append(getAccountAggregation()).append(",");
        if (getImageAggregation() != null)
            sb.append("ImageAggregation: ").append(getImageAggregation()).append(",");
        if (getImagePipelineAggregation() != null)
            sb.append("ImagePipelineAggregation: ").append(getImagePipelineAggregation()).append(",");
        if (getVulnerabilityIdAggregation() != null)
            sb.append("VulnerabilityIdAggregation: ").append(getVulnerabilityIdAggregation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageScanFindingAggregation == false)
            return false;
        ImageScanFindingAggregation other = (ImageScanFindingAggregation) obj;
        if (other.getAccountAggregation() == null ^ this.getAccountAggregation() == null)
            return false;
        if (other.getAccountAggregation() != null && other.getAccountAggregation().equals(this.getAccountAggregation()) == false)
            return false;
        if (other.getImageAggregation() == null ^ this.getImageAggregation() == null)
            return false;
        if (other.getImageAggregation() != null && other.getImageAggregation().equals(this.getImageAggregation()) == false)
            return false;
        if (other.getImagePipelineAggregation() == null ^ this.getImagePipelineAggregation() == null)
            return false;
        if (other.getImagePipelineAggregation() != null && other.getImagePipelineAggregation().equals(this.getImagePipelineAggregation()) == false)
            return false;
        if (other.getVulnerabilityIdAggregation() == null ^ this.getVulnerabilityIdAggregation() == null)
            return false;
        if (other.getVulnerabilityIdAggregation() != null && other.getVulnerabilityIdAggregation().equals(this.getVulnerabilityIdAggregation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountAggregation() == null) ? 0 : getAccountAggregation().hashCode());
        hashCode = prime * hashCode + ((getImageAggregation() == null) ? 0 : getImageAggregation().hashCode());
        hashCode = prime * hashCode + ((getImagePipelineAggregation() == null) ? 0 : getImagePipelineAggregation().hashCode());
        hashCode = prime * hashCode + ((getVulnerabilityIdAggregation() == null) ? 0 : getVulnerabilityIdAggregation().hashCode());
        return hashCode;
    }

    @Override
    public ImageScanFindingAggregation clone() {
        try {
            return (ImageScanFindingAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ImageScanFindingAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
