/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The prediction results from a call to <a>DetectAnomalies</a>. <code>DetectAnomalyResult</code> includes
 * classification information for the prediction (<code>IsAnomalous</code> and <code>Confidence</code>). If the model
 * you use is an image segementation model, <code>DetectAnomalyResult</code> also includes segmentation information (
 * <code>Anomalies</code> and <code>AnomalyMask</code>). Classification information is calculated separately from
 * segmentation information and you shouldn't assume a relationship between them.
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
     * True if Amazon Lookout for Vision classifies the image as containing an anomaly, otherwise false.
     * </p>
     */
    private Boolean isAnomalous;
    /**
     * <p>
     * The confidence that Lookout for Vision has in the accuracy of the classification in <code>IsAnomalous</code>.
     * </p>
     */
    private Float confidence;
    /**
     * <p>
     * If the model is an image segmentation model, <code>Anomalies</code> contains a list of anomaly types found in the
     * image. There is one entry for each type of anomaly found (even if multiple instances of an anomaly type exist on
     * the image). The first element in the list is always an anomaly type representing the image background
     * ('background') and shouldn't be considered an anomaly. Amazon Lookout for Vision automatically add the background
     * anomaly type to the response, and you don't need to declare a background anomaly type in your dataset.
     * </p>
     * <p>
     * If the list has one entry ('background'), no anomalies were found on the image.
     * </p>
     * <p/>
     * <p>
     * An image classification model doesn't return an <code>Anomalies</code> list.
     * </p>
     */
    private java.util.List<Anomaly> anomalies;
    /**
     * <p>
     * If the model is an image segmentation model, <code>AnomalyMask</code> contains pixel masks that covers all
     * anomaly types found on the image. Each anomaly type has a different mask color. To map a color to an anomaly
     * type, see the <code>color</code> field of the <a>PixelAnomaly</a> object.
     * </p>
     * <p>
     * An image classification model doesn't return an <code>Anomalies</code> list.
     * </p>
     */
    private java.nio.ByteBuffer anomalyMask;

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
     * True if Amazon Lookout for Vision classifies the image as containing an anomaly, otherwise false.
     * </p>
     * 
     * @param isAnomalous
     *        True if Amazon Lookout for Vision classifies the image as containing an anomaly, otherwise false.
     */

    public void setIsAnomalous(Boolean isAnomalous) {
        this.isAnomalous = isAnomalous;
    }

    /**
     * <p>
     * True if Amazon Lookout for Vision classifies the image as containing an anomaly, otherwise false.
     * </p>
     * 
     * @return True if Amazon Lookout for Vision classifies the image as containing an anomaly, otherwise false.
     */

    public Boolean getIsAnomalous() {
        return this.isAnomalous;
    }

    /**
     * <p>
     * True if Amazon Lookout for Vision classifies the image as containing an anomaly, otherwise false.
     * </p>
     * 
     * @param isAnomalous
     *        True if Amazon Lookout for Vision classifies the image as containing an anomaly, otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectAnomalyResult withIsAnomalous(Boolean isAnomalous) {
        setIsAnomalous(isAnomalous);
        return this;
    }

    /**
     * <p>
     * True if Amazon Lookout for Vision classifies the image as containing an anomaly, otherwise false.
     * </p>
     * 
     * @return True if Amazon Lookout for Vision classifies the image as containing an anomaly, otherwise false.
     */

    public Boolean isAnomalous() {
        return this.isAnomalous;
    }

    /**
     * <p>
     * The confidence that Lookout for Vision has in the accuracy of the classification in <code>IsAnomalous</code>.
     * </p>
     * 
     * @param confidence
     *        The confidence that Lookout for Vision has in the accuracy of the classification in
     *        <code>IsAnomalous</code>.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Lookout for Vision has in the accuracy of the classification in <code>IsAnomalous</code>.
     * </p>
     * 
     * @return The confidence that Lookout for Vision has in the accuracy of the classification in
     *         <code>IsAnomalous</code>.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The confidence that Lookout for Vision has in the accuracy of the classification in <code>IsAnomalous</code>.
     * </p>
     * 
     * @param confidence
     *        The confidence that Lookout for Vision has in the accuracy of the classification in
     *        <code>IsAnomalous</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectAnomalyResult withConfidence(Float confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * If the model is an image segmentation model, <code>Anomalies</code> contains a list of anomaly types found in the
     * image. There is one entry for each type of anomaly found (even if multiple instances of an anomaly type exist on
     * the image). The first element in the list is always an anomaly type representing the image background
     * ('background') and shouldn't be considered an anomaly. Amazon Lookout for Vision automatically add the background
     * anomaly type to the response, and you don't need to declare a background anomaly type in your dataset.
     * </p>
     * <p>
     * If the list has one entry ('background'), no anomalies were found on the image.
     * </p>
     * <p/>
     * <p>
     * An image classification model doesn't return an <code>Anomalies</code> list.
     * </p>
     * 
     * @return If the model is an image segmentation model, <code>Anomalies</code> contains a list of anomaly types
     *         found in the image. There is one entry for each type of anomaly found (even if multiple instances of an
     *         anomaly type exist on the image). The first element in the list is always an anomaly type representing
     *         the image background ('background') and shouldn't be considered an anomaly. Amazon Lookout for Vision
     *         automatically add the background anomaly type to the response, and you don't need to declare a background
     *         anomaly type in your dataset.</p>
     *         <p>
     *         If the list has one entry ('background'), no anomalies were found on the image.
     *         </p>
     *         <p/>
     *         <p>
     *         An image classification model doesn't return an <code>Anomalies</code> list.
     */

    public java.util.List<Anomaly> getAnomalies() {
        return anomalies;
    }

    /**
     * <p>
     * If the model is an image segmentation model, <code>Anomalies</code> contains a list of anomaly types found in the
     * image. There is one entry for each type of anomaly found (even if multiple instances of an anomaly type exist on
     * the image). The first element in the list is always an anomaly type representing the image background
     * ('background') and shouldn't be considered an anomaly. Amazon Lookout for Vision automatically add the background
     * anomaly type to the response, and you don't need to declare a background anomaly type in your dataset.
     * </p>
     * <p>
     * If the list has one entry ('background'), no anomalies were found on the image.
     * </p>
     * <p/>
     * <p>
     * An image classification model doesn't return an <code>Anomalies</code> list.
     * </p>
     * 
     * @param anomalies
     *        If the model is an image segmentation model, <code>Anomalies</code> contains a list of anomaly types found
     *        in the image. There is one entry for each type of anomaly found (even if multiple instances of an anomaly
     *        type exist on the image). The first element in the list is always an anomaly type representing the image
     *        background ('background') and shouldn't be considered an anomaly. Amazon Lookout for Vision automatically
     *        add the background anomaly type to the response, and you don't need to declare a background anomaly type
     *        in your dataset.</p>
     *        <p>
     *        If the list has one entry ('background'), no anomalies were found on the image.
     *        </p>
     *        <p/>
     *        <p>
     *        An image classification model doesn't return an <code>Anomalies</code> list.
     */

    public void setAnomalies(java.util.Collection<Anomaly> anomalies) {
        if (anomalies == null) {
            this.anomalies = null;
            return;
        }

        this.anomalies = new java.util.ArrayList<Anomaly>(anomalies);
    }

    /**
     * <p>
     * If the model is an image segmentation model, <code>Anomalies</code> contains a list of anomaly types found in the
     * image. There is one entry for each type of anomaly found (even if multiple instances of an anomaly type exist on
     * the image). The first element in the list is always an anomaly type representing the image background
     * ('background') and shouldn't be considered an anomaly. Amazon Lookout for Vision automatically add the background
     * anomaly type to the response, and you don't need to declare a background anomaly type in your dataset.
     * </p>
     * <p>
     * If the list has one entry ('background'), no anomalies were found on the image.
     * </p>
     * <p/>
     * <p>
     * An image classification model doesn't return an <code>Anomalies</code> list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnomalies(java.util.Collection)} or {@link #withAnomalies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param anomalies
     *        If the model is an image segmentation model, <code>Anomalies</code> contains a list of anomaly types found
     *        in the image. There is one entry for each type of anomaly found (even if multiple instances of an anomaly
     *        type exist on the image). The first element in the list is always an anomaly type representing the image
     *        background ('background') and shouldn't be considered an anomaly. Amazon Lookout for Vision automatically
     *        add the background anomaly type to the response, and you don't need to declare a background anomaly type
     *        in your dataset.</p>
     *        <p>
     *        If the list has one entry ('background'), no anomalies were found on the image.
     *        </p>
     *        <p/>
     *        <p>
     *        An image classification model doesn't return an <code>Anomalies</code> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectAnomalyResult withAnomalies(Anomaly... anomalies) {
        if (this.anomalies == null) {
            setAnomalies(new java.util.ArrayList<Anomaly>(anomalies.length));
        }
        for (Anomaly ele : anomalies) {
            this.anomalies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the model is an image segmentation model, <code>Anomalies</code> contains a list of anomaly types found in the
     * image. There is one entry for each type of anomaly found (even if multiple instances of an anomaly type exist on
     * the image). The first element in the list is always an anomaly type representing the image background
     * ('background') and shouldn't be considered an anomaly. Amazon Lookout for Vision automatically add the background
     * anomaly type to the response, and you don't need to declare a background anomaly type in your dataset.
     * </p>
     * <p>
     * If the list has one entry ('background'), no anomalies were found on the image.
     * </p>
     * <p/>
     * <p>
     * An image classification model doesn't return an <code>Anomalies</code> list.
     * </p>
     * 
     * @param anomalies
     *        If the model is an image segmentation model, <code>Anomalies</code> contains a list of anomaly types found
     *        in the image. There is one entry for each type of anomaly found (even if multiple instances of an anomaly
     *        type exist on the image). The first element in the list is always an anomaly type representing the image
     *        background ('background') and shouldn't be considered an anomaly. Amazon Lookout for Vision automatically
     *        add the background anomaly type to the response, and you don't need to declare a background anomaly type
     *        in your dataset.</p>
     *        <p>
     *        If the list has one entry ('background'), no anomalies were found on the image.
     *        </p>
     *        <p/>
     *        <p>
     *        An image classification model doesn't return an <code>Anomalies</code> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectAnomalyResult withAnomalies(java.util.Collection<Anomaly> anomalies) {
        setAnomalies(anomalies);
        return this;
    }

    /**
     * <p>
     * If the model is an image segmentation model, <code>AnomalyMask</code> contains pixel masks that covers all
     * anomaly types found on the image. Each anomaly type has a different mask color. To map a color to an anomaly
     * type, see the <code>color</code> field of the <a>PixelAnomaly</a> object.
     * </p>
     * <p>
     * An image classification model doesn't return an <code>Anomalies</code> list.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param anomalyMask
     *        If the model is an image segmentation model, <code>AnomalyMask</code> contains pixel masks that covers all
     *        anomaly types found on the image. Each anomaly type has a different mask color. To map a color to an
     *        anomaly type, see the <code>color</code> field of the <a>PixelAnomaly</a> object.</p>
     *        <p>
     *        An image classification model doesn't return an <code>Anomalies</code> list.
     */

    public void setAnomalyMask(java.nio.ByteBuffer anomalyMask) {
        this.anomalyMask = anomalyMask;
    }

    /**
     * <p>
     * If the model is an image segmentation model, <code>AnomalyMask</code> contains pixel masks that covers all
     * anomaly types found on the image. Each anomaly type has a different mask color. To map a color to an anomaly
     * type, see the <code>color</code> field of the <a>PixelAnomaly</a> object.
     * </p>
     * <p>
     * An image classification model doesn't return an <code>Anomalies</code> list.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return If the model is an image segmentation model, <code>AnomalyMask</code> contains pixel masks that covers
     *         all anomaly types found on the image. Each anomaly type has a different mask color. To map a color to an
     *         anomaly type, see the <code>color</code> field of the <a>PixelAnomaly</a> object.</p>
     *         <p>
     *         An image classification model doesn't return an <code>Anomalies</code> list.
     */

    public java.nio.ByteBuffer getAnomalyMask() {
        return this.anomalyMask;
    }

    /**
     * <p>
     * If the model is an image segmentation model, <code>AnomalyMask</code> contains pixel masks that covers all
     * anomaly types found on the image. Each anomaly type has a different mask color. To map a color to an anomaly
     * type, see the <code>color</code> field of the <a>PixelAnomaly</a> object.
     * </p>
     * <p>
     * An image classification model doesn't return an <code>Anomalies</code> list.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param anomalyMask
     *        If the model is an image segmentation model, <code>AnomalyMask</code> contains pixel masks that covers all
     *        anomaly types found on the image. Each anomaly type has a different mask color. To map a color to an
     *        anomaly type, see the <code>color</code> field of the <a>PixelAnomaly</a> object.</p>
     *        <p>
     *        An image classification model doesn't return an <code>Anomalies</code> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectAnomalyResult withAnomalyMask(java.nio.ByteBuffer anomalyMask) {
        setAnomalyMask(anomalyMask);
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
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getAnomalies() != null)
            sb.append("Anomalies: ").append(getAnomalies()).append(",");
        if (getAnomalyMask() != null)
            sb.append("AnomalyMask: ").append(getAnomalyMask());
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
        if (other.getAnomalies() == null ^ this.getAnomalies() == null)
            return false;
        if (other.getAnomalies() != null && other.getAnomalies().equals(this.getAnomalies()) == false)
            return false;
        if (other.getAnomalyMask() == null ^ this.getAnomalyMask() == null)
            return false;
        if (other.getAnomalyMask() != null && other.getAnomalyMask().equals(this.getAnomalyMask()) == false)
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
        hashCode = prime * hashCode + ((getAnomalies() == null) ? 0 : getAnomalies().hashCode());
        hashCode = prime * hashCode + ((getAnomalyMask() == null) ? 0 : getAnomalyMask().hashCode());
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
