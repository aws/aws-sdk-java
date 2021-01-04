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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The prediction results from a call to <a>DetectAnomalies</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DetectAnomalyResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectAnomalyResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source of the image that was analyzed. <code>direct</code> means that the images was supplied from the local
     * computer. No other values are supported.
     * </p>
     */
    private ImageSource source;
    /**
     * <p>
     * True if the image contains an anomaly, otherwise false.
     * </p>
     */
    private Boolean isAnomalous;
    /**
     * <p>
     * The confidence that Amazon Lookout for Vision has in the accuracy of the prediction.
     * </p>
     */
    private Float confidence;

    /**
     * <p>
     * The source of the image that was analyzed. <code>direct</code> means that the images was supplied from the local
     * computer. No other values are supported.
     * </p>
     * 
     * @param source
     *        The source of the image that was analyzed. <code>direct</code> means that the images was supplied from the
     *        local computer. No other values are supported.
     */

    public void setSource(ImageSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the image that was analyzed. <code>direct</code> means that the images was supplied from the local
     * computer. No other values are supported.
     * </p>
     * 
     * @return The source of the image that was analyzed. <code>direct</code> means that the images was supplied from
     *         the local computer. No other values are supported.
     */

    public ImageSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the image that was analyzed. <code>direct</code> means that the images was supplied from the local
     * computer. No other values are supported.
     * </p>
     * 
     * @param source
     *        The source of the image that was analyzed. <code>direct</code> means that the images was supplied from the
     *        local computer. No other values are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectAnomalyResult withSource(ImageSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * True if the image contains an anomaly, otherwise false.
     * </p>
     * 
     * @param isAnomalous
     *        True if the image contains an anomaly, otherwise false.
     */

    public void setIsAnomalous(Boolean isAnomalous) {
        this.isAnomalous = isAnomalous;
    }

    /**
     * <p>
     * True if the image contains an anomaly, otherwise false.
     * </p>
     * 
     * @return True if the image contains an anomaly, otherwise false.
     */

    public Boolean getIsAnomalous() {
        return this.isAnomalous;
    }

    /**
     * <p>
     * True if the image contains an anomaly, otherwise false.
     * </p>
     * 
     * @param isAnomalous
     *        True if the image contains an anomaly, otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectAnomalyResult withIsAnomalous(Boolean isAnomalous) {
        setIsAnomalous(isAnomalous);
        return this;
    }

    /**
     * <p>
     * True if the image contains an anomaly, otherwise false.
     * </p>
     * 
     * @return True if the image contains an anomaly, otherwise false.
     */

    public Boolean isAnomalous() {
        return this.isAnomalous;
    }

    /**
     * <p>
     * The confidence that Amazon Lookout for Vision has in the accuracy of the prediction.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Lookout for Vision has in the accuracy of the prediction.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Lookout for Vision has in the accuracy of the prediction.
     * </p>
     * 
     * @return The confidence that Amazon Lookout for Vision has in the accuracy of the prediction.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Lookout for Vision has in the accuracy of the prediction.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Lookout for Vision has in the accuracy of the prediction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectAnomalyResult withConfidence(Float confidence) {
        setConfidence(confidence);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getIsAnomalous() != null)
            sb.append("IsAnomalous: ").append(getIsAnomalous()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectAnomalyResult == false)
            return false;
        DetectAnomalyResult other = (DetectAnomalyResult) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getIsAnomalous() == null ^ this.getIsAnomalous() == null)
            return false;
        if (other.getIsAnomalous() != null && other.getIsAnomalous().equals(this.getIsAnomalous()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getIsAnomalous() == null) ? 0 : getIsAnomalous().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public DetectAnomalyResult clone() {
        try {
            return (DetectAnomalyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutforvision.model.transform.DetectAnomalyResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
