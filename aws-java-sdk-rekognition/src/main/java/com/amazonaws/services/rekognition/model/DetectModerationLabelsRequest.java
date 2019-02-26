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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectModerationLabelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     */
    private Image image;
    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with a confidence level lower than this specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinConfidence</code>, the operation returns labels with confidence values greater than
     * or equal to 50 percent.
     * </p>
     */
    private Float minConfidence;

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @param image
     *        The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     *        operations, passing base64-encoded image bytes is not supported. </p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *        developer guide.
     */

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @return The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon
     *         Rekognition operations, passing base64-encoded image bytes is not supported. </p>
     *         <p>
     *         If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *         passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *         developer guide.
     */

    public Image getImage() {
        return this.image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @param image
     *        The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     *        operations, passing base64-encoded image bytes is not supported. </p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *        developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectModerationLabelsRequest withImage(Image image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with a confidence level lower than this specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinConfidence</code>, the operation returns labels with confidence values greater than
     * or equal to 50 percent.
     * </p>
     * 
     * @param minConfidence
     *        Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any
     *        labels with a confidence level lower than this specified value.</p>
     *        <p>
     *        If you don't specify <code>MinConfidence</code>, the operation returns labels with confidence values
     *        greater than or equal to 50 percent.
     */

    public void setMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with a confidence level lower than this specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinConfidence</code>, the operation returns labels with confidence values greater than
     * or equal to 50 percent.
     * </p>
     * 
     * @return Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any
     *         labels with a confidence level lower than this specified value.</p>
     *         <p>
     *         If you don't specify <code>MinConfidence</code>, the operation returns labels with confidence values
     *         greater than or equal to 50 percent.
     */

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with a confidence level lower than this specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinConfidence</code>, the operation returns labels with confidence values greater than
     * or equal to 50 percent.
     * </p>
     * 
     * @param minConfidence
     *        Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any
     *        labels with a confidence level lower than this specified value.</p>
     *        <p>
     *        If you don't specify <code>MinConfidence</code>, the operation returns labels with confidence values
     *        greater than or equal to 50 percent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectModerationLabelsRequest withMinConfidence(Float minConfidence) {
        setMinConfidence(minConfidence);
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
        if (getMinConfidence() != null)
            sb.append("MinConfidence: ").append(getMinConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectModerationLabelsRequest == false)
            return false;
        DetectModerationLabelsRequest other = (DetectModerationLabelsRequest) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getMinConfidence() == null ^ this.getMinConfidence() == null)
            return false;
        if (other.getMinConfidence() != null && other.getMinConfidence().equals(this.getMinConfidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getMinConfidence() == null) ? 0 : getMinConfidence().hashCode());
        return hashCode;
    }

    @Override
    public DetectModerationLabelsRequest clone() {
        return (DetectModerationLabelsRequest) super.clone();
    }

}
