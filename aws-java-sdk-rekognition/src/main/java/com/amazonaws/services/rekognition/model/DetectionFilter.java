/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of parameters that allow you to filter out certain results from your returned results.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets confidence of word detection. Words with detection confidence below this will be excluded from the result.
     * Values should be between 0.5 and 1 as Text in Video will not return any result below 0.5.
     * </p>
     */
    private Float minConfidence;
    /**
     * <p>
     * Sets the minimum height of the word bounding box. Words with bounding box heights lesser than this value will be
     * excluded from the result. Value is relative to the video frame height.
     * </p>
     */
    private Float minBoundingBoxHeight;
    /**
     * <p>
     * Sets the minimum width of the word bounding box. Words with bounding boxes widths lesser than this value will be
     * excluded from the result. Value is relative to the video frame width.
     * </p>
     */
    private Float minBoundingBoxWidth;

    /**
     * <p>
     * Sets confidence of word detection. Words with detection confidence below this will be excluded from the result.
     * Values should be between 0.5 and 1 as Text in Video will not return any result below 0.5.
     * </p>
     * 
     * @param minConfidence
     *        Sets confidence of word detection. Words with detection confidence below this will be excluded from the
     *        result. Values should be between 0.5 and 1 as Text in Video will not return any result below 0.5.
     */

    public void setMinConfidence(Float minConfidence) {
        this.minConfidence = minConfidence;
    }

    /**
     * <p>
     * Sets confidence of word detection. Words with detection confidence below this will be excluded from the result.
     * Values should be between 0.5 and 1 as Text in Video will not return any result below 0.5.
     * </p>
     * 
     * @return Sets confidence of word detection. Words with detection confidence below this will be excluded from the
     *         result. Values should be between 0.5 and 1 as Text in Video will not return any result below 0.5.
     */

    public Float getMinConfidence() {
        return this.minConfidence;
    }

    /**
     * <p>
     * Sets confidence of word detection. Words with detection confidence below this will be excluded from the result.
     * Values should be between 0.5 and 1 as Text in Video will not return any result below 0.5.
     * </p>
     * 
     * @param minConfidence
     *        Sets confidence of word detection. Words with detection confidence below this will be excluded from the
     *        result. Values should be between 0.5 and 1 as Text in Video will not return any result below 0.5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectionFilter withMinConfidence(Float minConfidence) {
        setMinConfidence(minConfidence);
        return this;
    }

    /**
     * <p>
     * Sets the minimum height of the word bounding box. Words with bounding box heights lesser than this value will be
     * excluded from the result. Value is relative to the video frame height.
     * </p>
     * 
     * @param minBoundingBoxHeight
     *        Sets the minimum height of the word bounding box. Words with bounding box heights lesser than this value
     *        will be excluded from the result. Value is relative to the video frame height.
     */

    public void setMinBoundingBoxHeight(Float minBoundingBoxHeight) {
        this.minBoundingBoxHeight = minBoundingBoxHeight;
    }

    /**
     * <p>
     * Sets the minimum height of the word bounding box. Words with bounding box heights lesser than this value will be
     * excluded from the result. Value is relative to the video frame height.
     * </p>
     * 
     * @return Sets the minimum height of the word bounding box. Words with bounding box heights lesser than this value
     *         will be excluded from the result. Value is relative to the video frame height.
     */

    public Float getMinBoundingBoxHeight() {
        return this.minBoundingBoxHeight;
    }

    /**
     * <p>
     * Sets the minimum height of the word bounding box. Words with bounding box heights lesser than this value will be
     * excluded from the result. Value is relative to the video frame height.
     * </p>
     * 
     * @param minBoundingBoxHeight
     *        Sets the minimum height of the word bounding box. Words with bounding box heights lesser than this value
     *        will be excluded from the result. Value is relative to the video frame height.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectionFilter withMinBoundingBoxHeight(Float minBoundingBoxHeight) {
        setMinBoundingBoxHeight(minBoundingBoxHeight);
        return this;
    }

    /**
     * <p>
     * Sets the minimum width of the word bounding box. Words with bounding boxes widths lesser than this value will be
     * excluded from the result. Value is relative to the video frame width.
     * </p>
     * 
     * @param minBoundingBoxWidth
     *        Sets the minimum width of the word bounding box. Words with bounding boxes widths lesser than this value
     *        will be excluded from the result. Value is relative to the video frame width.
     */

    public void setMinBoundingBoxWidth(Float minBoundingBoxWidth) {
        this.minBoundingBoxWidth = minBoundingBoxWidth;
    }

    /**
     * <p>
     * Sets the minimum width of the word bounding box. Words with bounding boxes widths lesser than this value will be
     * excluded from the result. Value is relative to the video frame width.
     * </p>
     * 
     * @return Sets the minimum width of the word bounding box. Words with bounding boxes widths lesser than this value
     *         will be excluded from the result. Value is relative to the video frame width.
     */

    public Float getMinBoundingBoxWidth() {
        return this.minBoundingBoxWidth;
    }

    /**
     * <p>
     * Sets the minimum width of the word bounding box. Words with bounding boxes widths lesser than this value will be
     * excluded from the result. Value is relative to the video frame width.
     * </p>
     * 
     * @param minBoundingBoxWidth
     *        Sets the minimum width of the word bounding box. Words with bounding boxes widths lesser than this value
     *        will be excluded from the result. Value is relative to the video frame width.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectionFilter withMinBoundingBoxWidth(Float minBoundingBoxWidth) {
        setMinBoundingBoxWidth(minBoundingBoxWidth);
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
        if (getMinConfidence() != null)
            sb.append("MinConfidence: ").append(getMinConfidence()).append(",");
        if (getMinBoundingBoxHeight() != null)
            sb.append("MinBoundingBoxHeight: ").append(getMinBoundingBoxHeight()).append(",");
        if (getMinBoundingBoxWidth() != null)
            sb.append("MinBoundingBoxWidth: ").append(getMinBoundingBoxWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectionFilter == false)
            return false;
        DetectionFilter other = (DetectionFilter) obj;
        if (other.getMinConfidence() == null ^ this.getMinConfidence() == null)
            return false;
        if (other.getMinConfidence() != null && other.getMinConfidence().equals(this.getMinConfidence()) == false)
            return false;
        if (other.getMinBoundingBoxHeight() == null ^ this.getMinBoundingBoxHeight() == null)
            return false;
        if (other.getMinBoundingBoxHeight() != null && other.getMinBoundingBoxHeight().equals(this.getMinBoundingBoxHeight()) == false)
            return false;
        if (other.getMinBoundingBoxWidth() == null ^ this.getMinBoundingBoxWidth() == null)
            return false;
        if (other.getMinBoundingBoxWidth() != null && other.getMinBoundingBoxWidth().equals(this.getMinBoundingBoxWidth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinConfidence() == null) ? 0 : getMinConfidence().hashCode());
        hashCode = prime * hashCode + ((getMinBoundingBoxHeight() == null) ? 0 : getMinBoundingBoxHeight().hashCode());
        hashCode = prime * hashCode + ((getMinBoundingBoxWidth() == null) ? 0 : getMinBoundingBoxWidth().hashCode());
        return hashCode;
    }

    @Override
    public DetectionFilter clone() {
        try {
            return (DetectionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.DetectionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
