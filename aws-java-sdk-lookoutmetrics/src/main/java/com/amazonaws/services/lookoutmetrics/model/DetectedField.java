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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An inferred field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DetectedField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectedField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field's value.
     * </p>
     */
    private AttributeValue value;
    /**
     * <p>
     * The field's confidence.
     * </p>
     */
    private String confidence;
    /**
     * <p>
     * The field's message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The field's value.
     * </p>
     * 
     * @param value
     *        The field's value.
     */

    public void setValue(AttributeValue value) {
        this.value = value;
    }

    /**
     * <p>
     * The field's value.
     * </p>
     * 
     * @return The field's value.
     */

    public AttributeValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * The field's value.
     * </p>
     * 
     * @param value
     *        The field's value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedField withValue(AttributeValue value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The field's confidence.
     * </p>
     * 
     * @param confidence
     *        The field's confidence.
     * @see Confidence
     */

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The field's confidence.
     * </p>
     * 
     * @return The field's confidence.
     * @see Confidence
     */

    public String getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The field's confidence.
     * </p>
     * 
     * @param confidence
     *        The field's confidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Confidence
     */

    public DetectedField withConfidence(String confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * The field's confidence.
     * </p>
     * 
     * @param confidence
     *        The field's confidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Confidence
     */

    public DetectedField withConfidence(Confidence confidence) {
        this.confidence = confidence.toString();
        return this;
    }

    /**
     * <p>
     * The field's message.
     * </p>
     * 
     * @param message
     *        The field's message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The field's message.
     * </p>
     * 
     * @return The field's message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The field's message.
     * </p>
     * 
     * @param message
     *        The field's message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectedField withMessage(String message) {
        setMessage(message);
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
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectedField == false)
            return false;
        DetectedField other = (DetectedField) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public DetectedField clone() {
        try {
            return (DetectedField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.DetectedFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
