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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectProtectiveEquipmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The image in which you want to detect PPE on detected persons. The image can be passed as image bytes or you can
     * reference an image stored in an Amazon S3 bucket.
     * </p>
     */
    private Image image;
    /**
     * <p>
     * An array of PPE types that you want to summarize.
     * </p>
     */
    private ProtectiveEquipmentSummarizationAttributes summarizationAttributes;

    /**
     * <p>
     * The image in which you want to detect PPE on detected persons. The image can be passed as image bytes or you can
     * reference an image stored in an Amazon S3 bucket.
     * </p>
     * 
     * @param image
     *        The image in which you want to detect PPE on detected persons. The image can be passed as image bytes or
     *        you can reference an image stored in an Amazon S3 bucket.
     */

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * The image in which you want to detect PPE on detected persons. The image can be passed as image bytes or you can
     * reference an image stored in an Amazon S3 bucket.
     * </p>
     * 
     * @return The image in which you want to detect PPE on detected persons. The image can be passed as image bytes or
     *         you can reference an image stored in an Amazon S3 bucket.
     */

    public Image getImage() {
        return this.image;
    }

    /**
     * <p>
     * The image in which you want to detect PPE on detected persons. The image can be passed as image bytes or you can
     * reference an image stored in an Amazon S3 bucket.
     * </p>
     * 
     * @param image
     *        The image in which you want to detect PPE on detected persons. The image can be passed as image bytes or
     *        you can reference an image stored in an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectProtectiveEquipmentRequest withImage(Image image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * An array of PPE types that you want to summarize.
     * </p>
     * 
     * @param summarizationAttributes
     *        An array of PPE types that you want to summarize.
     */

    public void setSummarizationAttributes(ProtectiveEquipmentSummarizationAttributes summarizationAttributes) {
        this.summarizationAttributes = summarizationAttributes;
    }

    /**
     * <p>
     * An array of PPE types that you want to summarize.
     * </p>
     * 
     * @return An array of PPE types that you want to summarize.
     */

    public ProtectiveEquipmentSummarizationAttributes getSummarizationAttributes() {
        return this.summarizationAttributes;
    }

    /**
     * <p>
     * An array of PPE types that you want to summarize.
     * </p>
     * 
     * @param summarizationAttributes
     *        An array of PPE types that you want to summarize.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectProtectiveEquipmentRequest withSummarizationAttributes(ProtectiveEquipmentSummarizationAttributes summarizationAttributes) {
        setSummarizationAttributes(summarizationAttributes);
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getSummarizationAttributes() != null)
            sb.append("SummarizationAttributes: ").append(getSummarizationAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectProtectiveEquipmentRequest == false)
            return false;
        DetectProtectiveEquipmentRequest other = (DetectProtectiveEquipmentRequest) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getSummarizationAttributes() == null ^ this.getSummarizationAttributes() == null)
            return false;
        if (other.getSummarizationAttributes() != null && other.getSummarizationAttributes().equals(this.getSummarizationAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getSummarizationAttributes() == null) ? 0 : getSummarizationAttributes().hashCode());
        return hashCode;
    }

    @Override
    public DetectProtectiveEquipmentRequest clone() {
        return (DetectProtectiveEquipmentRequest) super.clone();
    }

}
