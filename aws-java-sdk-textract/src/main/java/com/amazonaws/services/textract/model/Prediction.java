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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information regarding predicted values returned by Amazon Textract operations, including the predicted value
 * and the confidence in the predicted value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/Prediction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Prediction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The predicted value of a detected object.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Amazon Textract's confidence in its predicted value.
     * </p>
     */
    private Float confidence;

    /**
     * <p>
     * The predicted value of a detected object.
     * </p>
     * 
     * @param value
     *        The predicted value of a detected object.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The predicted value of a detected object.
     * </p>
     * 
     * @return The predicted value of a detected object.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The predicted value of a detected object.
     * </p>
     * 
     * @param value
     *        The predicted value of a detected object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prediction withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Amazon Textract's confidence in its predicted value.
     * </p>
     * 
     * @param confidence
     *        Amazon Textract's confidence in its predicted value.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Amazon Textract's confidence in its predicted value.
     * </p>
     * 
     * @return Amazon Textract's confidence in its predicted value.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * Amazon Textract's confidence in its predicted value.
     * </p>
     * 
     * @param confidence
     *        Amazon Textract's confidence in its predicted value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Prediction withConfidence(Float confidence) {
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
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

        if (obj instanceof Prediction == false)
            return false;
        Prediction other = (Prediction) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
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

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public Prediction clone() {
        try {
            return (Prediction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.PredictionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
