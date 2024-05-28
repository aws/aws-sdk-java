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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Validation rules for a text field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/TextValidation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextValidation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum number of characters for the text field.
     * </p>
     */
    private Integer minLength;
    /**
     * <p>
     * The maximum number of characters for the text field.
     * </p>
     */
    private Integer maxLength;
    /**
     * <p>
     * The regular expression used to validate the text field.
     * </p>
     */
    private String pattern;

    /**
     * <p>
     * The minimum number of characters for the text field.
     * </p>
     * 
     * @param minLength
     *        The minimum number of characters for the text field.
     */

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    /**
     * <p>
     * The minimum number of characters for the text field.
     * </p>
     * 
     * @return The minimum number of characters for the text field.
     */

    public Integer getMinLength() {
        return this.minLength;
    }

    /**
     * <p>
     * The minimum number of characters for the text field.
     * </p>
     * 
     * @param minLength
     *        The minimum number of characters for the text field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextValidation withMinLength(Integer minLength) {
        setMinLength(minLength);
        return this;
    }

    /**
     * <p>
     * The maximum number of characters for the text field.
     * </p>
     * 
     * @param maxLength
     *        The maximum number of characters for the text field.
     */

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * <p>
     * The maximum number of characters for the text field.
     * </p>
     * 
     * @return The maximum number of characters for the text field.
     */

    public Integer getMaxLength() {
        return this.maxLength;
    }

    /**
     * <p>
     * The maximum number of characters for the text field.
     * </p>
     * 
     * @param maxLength
     *        The maximum number of characters for the text field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextValidation withMaxLength(Integer maxLength) {
        setMaxLength(maxLength);
        return this;
    }

    /**
     * <p>
     * The regular expression used to validate the text field.
     * </p>
     * 
     * @param pattern
     *        The regular expression used to validate the text field.
     */

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * The regular expression used to validate the text field.
     * </p>
     * 
     * @return The regular expression used to validate the text field.
     */

    public String getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * The regular expression used to validate the text field.
     * </p>
     * 
     * @param pattern
     *        The regular expression used to validate the text field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextValidation withPattern(String pattern) {
        setPattern(pattern);
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
        if (getMinLength() != null)
            sb.append("MinLength: ").append(getMinLength()).append(",");
        if (getMaxLength() != null)
            sb.append("MaxLength: ").append(getMaxLength()).append(",");
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextValidation == false)
            return false;
        TextValidation other = (TextValidation) obj;
        if (other.getMinLength() == null ^ this.getMinLength() == null)
            return false;
        if (other.getMinLength() != null && other.getMinLength().equals(this.getMinLength()) == false)
            return false;
        if (other.getMaxLength() == null ^ this.getMaxLength() == null)
            return false;
        if (other.getMaxLength() != null && other.getMaxLength().equals(this.getMaxLength()) == false)
            return false;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinLength() == null) ? 0 : getMinLength().hashCode());
        hashCode = prime * hashCode + ((getMaxLength() == null) ? 0 : getMaxLength().hashCode());
        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        return hashCode;
    }

    @Override
    public TextValidation clone() {
        try {
            return (TextValidation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.TextValidationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
