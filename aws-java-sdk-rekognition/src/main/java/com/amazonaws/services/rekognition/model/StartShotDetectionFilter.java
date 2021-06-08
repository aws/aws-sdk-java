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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filters for the shot detection segments returned by <code>GetSegmentDetection</code>. For more information, see
 * <a>StartSegmentDetectionFilters</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartShotDetectionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the minimum confidence that Amazon Rekognition Video must have in order to return a detected segment.
     * Confidence represents how certain Amazon Rekognition is that a segment is correctly identified. 0 is the lowest
     * confidence. 100 is the highest confidence. Amazon Rekognition Video doesn't return any segments with a confidence
     * level lower than this specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinSegmentConfidence</code>, the <code>GetSegmentDetection</code> returns segments
     * with confidence values greater than or equal to 50 percent.
     * </p>
     */
    private Float minSegmentConfidence;

    /**
     * <p>
     * Specifies the minimum confidence that Amazon Rekognition Video must have in order to return a detected segment.
     * Confidence represents how certain Amazon Rekognition is that a segment is correctly identified. 0 is the lowest
     * confidence. 100 is the highest confidence. Amazon Rekognition Video doesn't return any segments with a confidence
     * level lower than this specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinSegmentConfidence</code>, the <code>GetSegmentDetection</code> returns segments
     * with confidence values greater than or equal to 50 percent.
     * </p>
     * 
     * @param minSegmentConfidence
     *        Specifies the minimum confidence that Amazon Rekognition Video must have in order to return a detected
     *        segment. Confidence represents how certain Amazon Rekognition is that a segment is correctly identified. 0
     *        is the lowest confidence. 100 is the highest confidence. Amazon Rekognition Video doesn't return any
     *        segments with a confidence level lower than this specified value.</p>
     *        <p>
     *        If you don't specify <code>MinSegmentConfidence</code>, the <code>GetSegmentDetection</code> returns
     *        segments with confidence values greater than or equal to 50 percent.
     */

    public void setMinSegmentConfidence(Float minSegmentConfidence) {
        this.minSegmentConfidence = minSegmentConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence that Amazon Rekognition Video must have in order to return a detected segment.
     * Confidence represents how certain Amazon Rekognition is that a segment is correctly identified. 0 is the lowest
     * confidence. 100 is the highest confidence. Amazon Rekognition Video doesn't return any segments with a confidence
     * level lower than this specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinSegmentConfidence</code>, the <code>GetSegmentDetection</code> returns segments
     * with confidence values greater than or equal to 50 percent.
     * </p>
     * 
     * @return Specifies the minimum confidence that Amazon Rekognition Video must have in order to return a detected
     *         segment. Confidence represents how certain Amazon Rekognition is that a segment is correctly identified.
     *         0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition Video doesn't return any
     *         segments with a confidence level lower than this specified value.</p>
     *         <p>
     *         If you don't specify <code>MinSegmentConfidence</code>, the <code>GetSegmentDetection</code> returns
     *         segments with confidence values greater than or equal to 50 percent.
     */

    public Float getMinSegmentConfidence() {
        return this.minSegmentConfidence;
    }

    /**
     * <p>
     * Specifies the minimum confidence that Amazon Rekognition Video must have in order to return a detected segment.
     * Confidence represents how certain Amazon Rekognition is that a segment is correctly identified. 0 is the lowest
     * confidence. 100 is the highest confidence. Amazon Rekognition Video doesn't return any segments with a confidence
     * level lower than this specified value.
     * </p>
     * <p>
     * If you don't specify <code>MinSegmentConfidence</code>, the <code>GetSegmentDetection</code> returns segments
     * with confidence values greater than or equal to 50 percent.
     * </p>
     * 
     * @param minSegmentConfidence
     *        Specifies the minimum confidence that Amazon Rekognition Video must have in order to return a detected
     *        segment. Confidence represents how certain Amazon Rekognition is that a segment is correctly identified. 0
     *        is the lowest confidence. 100 is the highest confidence. Amazon Rekognition Video doesn't return any
     *        segments with a confidence level lower than this specified value.</p>
     *        <p>
     *        If you don't specify <code>MinSegmentConfidence</code>, the <code>GetSegmentDetection</code> returns
     *        segments with confidence values greater than or equal to 50 percent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartShotDetectionFilter withMinSegmentConfidence(Float minSegmentConfidence) {
        setMinSegmentConfidence(minSegmentConfidence);
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
        if (getMinSegmentConfidence() != null)
            sb.append("MinSegmentConfidence: ").append(getMinSegmentConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartShotDetectionFilter == false)
            return false;
        StartShotDetectionFilter other = (StartShotDetectionFilter) obj;
        if (other.getMinSegmentConfidence() == null ^ this.getMinSegmentConfidence() == null)
            return false;
        if (other.getMinSegmentConfidence() != null && other.getMinSegmentConfidence().equals(this.getMinSegmentConfidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinSegmentConfidence() == null) ? 0 : getMinSegmentConfidence().hashCode());
        return hashCode;
    }

    @Override
    public StartShotDetectionFilter clone() {
        try {
            return (StartShotDetectionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.StartShotDetectionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
