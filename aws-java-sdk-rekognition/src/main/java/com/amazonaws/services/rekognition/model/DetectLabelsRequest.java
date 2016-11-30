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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DetectLabelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The input image. You can provide a blob of image bytes or an S3 object.
     * </p>
     */
    private Image image;
    /**
     * <p>
     * Maximum number of labels you want the service to return in the response. The service returns the specified number
     * of highest confidence labels.
     * </p>
     */
    private Integer maxLabels;
    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with confidence lower than this specified value.
     * </p>
     * <p>
     * If <code>minConfidence</code> is not specified, the operation returns labels with a confidence values greater
     * than or equal to 50 percent.
     * </p>
     */
    private Float minConfidence;

    /**
     * <p>
     * The input image. You can provide a blob of image bytes or an S3 object.
     * </p>
     * 
     * @param image
     *        The input image. You can provide a blob of image bytes or an S3 object.
     */

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * The input image. You can provide a blob of image bytes or an S3 object.
     * </p>
     * 
     * @return The input image. You can provide a blob of image bytes or an S3 object.
     */

    public Image getImage() {
        return this.image;
    }

    /**
     * <p>
     * The input image. You can provide a blob of image bytes or an S3 object.
     * </p>
     * 
     * @param image
     *        The input image. You can provide a blob of image bytes or an S3 object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsRequest withImage(Image image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * Maximum number of labels you want the service to return in the response. The service returns the specified number
     * of highest confidence labels.
     * </p>
     * 
     * @param maxLabels
     *        Maximum number of labels you want the service to return in the response. The service returns the specified
     *        number of highest confidence labels.
     */

    public void setMaxLabels(Integer maxLabels) {
        this.maxLabels = maxLabels;
    }

    /**
     * <p>
     * Maximum number of labels you want the service to return in the response. The service returns the specified number
     * of highest confidence labels.
     * </p>
     * 
     * @return Maximum number of labels you want the service to return in the response. The service returns the
     *         specified number of highest confidence labels.
     */

    public Integer getMaxLabels() {
        return this.maxLabels;
    }

    /**
     * <p>
     * Maximum number of labels you want the service to return in the response. The service returns the specified number
     * of highest confidence labels.
     * </p>
     * 
     * @param maxLabels
     *        Maximum number of labels you want the service to return in the response. The service returns the specified
     *        number of highest confidence labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsRequest withMaxLabels(Integer maxLabels) {
        setMaxLabels(maxLabels);
        return this;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with confidence lower than this specified value.
     * </p>
     * <p>
     * If <code>minConfidence</code> is not specified, the operation returns labels with a confidence values greater
     * than or equal to 50 percent.
     * </p>
     * 
     * @param minConfidence
     *        Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any
     *        labels with confidence lower than this specified value.</p>
     *        <p>
     *        If <code>minConfidence</code> is not specified, the operation returns labels with a confidence values
     *        greater than or equal to 50 percent.
     */

    public void setMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with confidence lower than this specified value.
     * </p>
     * <p>
     * If <code>minConfidence</code> is not specified, the operation returns labels with a confidence values greater
     * than or equal to 50 percent.
     * </p>
     * 
     * @return Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any
     *         labels with confidence lower than this specified value.</p>
     *         <p>
     *         If <code>minConfidence</code> is not specified, the operation returns labels with a confidence values
     *         greater than or equal to 50 percent.
     */

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels
     * with confidence lower than this specified value.
     * </p>
     * <p>
     * If <code>minConfidence</code> is not specified, the operation returns labels with a confidence values greater
     * than or equal to 50 percent.
     * </p>
     * 
     * @param minConfidence
     *        Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any
     *        labels with confidence lower than this specified value.</p>
     *        <p>
     *        If <code>minConfidence</code> is not specified, the operation returns labels with a confidence values
     *        greater than or equal to 50 percent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsRequest withMinConfidence(Float minConfidence) {
        setMinConfidence(minConfidence);
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
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getMaxLabels() != null)
            sb.append("MaxLabels: " + getMaxLabels() + ",");
        if (getMinConfidence() != null)
            sb.append("MinConfidence: " + getMinConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectLabelsRequest == false)
            return false;
        DetectLabelsRequest other = (DetectLabelsRequest) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getMaxLabels() == null ^ this.getMaxLabels() == null)
            return false;
        if (other.getMaxLabels() != null && other.getMaxLabels().equals(this.getMaxLabels()) == false)
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
        hashCode = prime * hashCode + ((getMaxLabels() == null) ? 0 : getMaxLabels().hashCode());
        hashCode = prime * hashCode + ((getMinConfidence() == null) ? 0 : getMinConfidence().hashCode());
        return hashCode;
    }

    @Override
    public DetectLabelsRequest clone() {
        return (DetectLabelsRequest) super.clone();
    }
}
