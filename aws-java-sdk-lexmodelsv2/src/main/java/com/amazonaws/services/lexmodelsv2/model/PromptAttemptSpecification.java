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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the settings on a prompt attempt.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/PromptAttemptSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PromptAttemptSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the user can interrupt a speech prompt attempt from the bot.
     * </p>
     */
    private Boolean allowInterrupt;
    /**
     * <p>
     * Indicates the allowed input types of the prompt attempt.
     * </p>
     */
    private AllowedInputTypes allowedInputTypes;
    /**
     * <p>
     * Specifies the settings on audio and DTMF input.
     * </p>
     */
    private AudioAndDTMFInputSpecification audioAndDTMFInputSpecification;
    /**
     * <p>
     * Specifies the settings on text input.
     * </p>
     */
    private TextInputSpecification textInputSpecification;

    /**
     * <p>
     * Indicates whether the user can interrupt a speech prompt attempt from the bot.
     * </p>
     * 
     * @param allowInterrupt
     *        Indicates whether the user can interrupt a speech prompt attempt from the bot.
     */

    public void setAllowInterrupt(Boolean allowInterrupt) {
        this.allowInterrupt = allowInterrupt;
    }

    /**
     * <p>
     * Indicates whether the user can interrupt a speech prompt attempt from the bot.
     * </p>
     * 
     * @return Indicates whether the user can interrupt a speech prompt attempt from the bot.
     */

    public Boolean getAllowInterrupt() {
        return this.allowInterrupt;
    }

    /**
     * <p>
     * Indicates whether the user can interrupt a speech prompt attempt from the bot.
     * </p>
     * 
     * @param allowInterrupt
     *        Indicates whether the user can interrupt a speech prompt attempt from the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptAttemptSpecification withAllowInterrupt(Boolean allowInterrupt) {
        setAllowInterrupt(allowInterrupt);
        return this;
    }

    /**
     * <p>
     * Indicates whether the user can interrupt a speech prompt attempt from the bot.
     * </p>
     * 
     * @return Indicates whether the user can interrupt a speech prompt attempt from the bot.
     */

    public Boolean isAllowInterrupt() {
        return this.allowInterrupt;
    }

    /**
     * <p>
     * Indicates the allowed input types of the prompt attempt.
     * </p>
     * 
     * @param allowedInputTypes
     *        Indicates the allowed input types of the prompt attempt.
     */

    public void setAllowedInputTypes(AllowedInputTypes allowedInputTypes) {
        this.allowedInputTypes = allowedInputTypes;
    }

    /**
     * <p>
     * Indicates the allowed input types of the prompt attempt.
     * </p>
     * 
     * @return Indicates the allowed input types of the prompt attempt.
     */

    public AllowedInputTypes getAllowedInputTypes() {
        return this.allowedInputTypes;
    }

    /**
     * <p>
     * Indicates the allowed input types of the prompt attempt.
     * </p>
     * 
     * @param allowedInputTypes
     *        Indicates the allowed input types of the prompt attempt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptAttemptSpecification withAllowedInputTypes(AllowedInputTypes allowedInputTypes) {
        setAllowedInputTypes(allowedInputTypes);
        return this;
    }

    /**
     * <p>
     * Specifies the settings on audio and DTMF input.
     * </p>
     * 
     * @param audioAndDTMFInputSpecification
     *        Specifies the settings on audio and DTMF input.
     */

    public void setAudioAndDTMFInputSpecification(AudioAndDTMFInputSpecification audioAndDTMFInputSpecification) {
        this.audioAndDTMFInputSpecification = audioAndDTMFInputSpecification;
    }

    /**
     * <p>
     * Specifies the settings on audio and DTMF input.
     * </p>
     * 
     * @return Specifies the settings on audio and DTMF input.
     */

    public AudioAndDTMFInputSpecification getAudioAndDTMFInputSpecification() {
        return this.audioAndDTMFInputSpecification;
    }

    /**
     * <p>
     * Specifies the settings on audio and DTMF input.
     * </p>
     * 
     * @param audioAndDTMFInputSpecification
     *        Specifies the settings on audio and DTMF input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptAttemptSpecification withAudioAndDTMFInputSpecification(AudioAndDTMFInputSpecification audioAndDTMFInputSpecification) {
        setAudioAndDTMFInputSpecification(audioAndDTMFInputSpecification);
        return this;
    }

    /**
     * <p>
     * Specifies the settings on text input.
     * </p>
     * 
     * @param textInputSpecification
     *        Specifies the settings on text input.
     */

    public void setTextInputSpecification(TextInputSpecification textInputSpecification) {
        this.textInputSpecification = textInputSpecification;
    }

    /**
     * <p>
     * Specifies the settings on text input.
     * </p>
     * 
     * @return Specifies the settings on text input.
     */

    public TextInputSpecification getTextInputSpecification() {
        return this.textInputSpecification;
    }

    /**
     * <p>
     * Specifies the settings on text input.
     * </p>
     * 
     * @param textInputSpecification
     *        Specifies the settings on text input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptAttemptSpecification withTextInputSpecification(TextInputSpecification textInputSpecification) {
        setTextInputSpecification(textInputSpecification);
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
        if (getAllowInterrupt() != null)
            sb.append("AllowInterrupt: ").append(getAllowInterrupt()).append(",");
        if (getAllowedInputTypes() != null)
            sb.append("AllowedInputTypes: ").append(getAllowedInputTypes()).append(",");
        if (getAudioAndDTMFInputSpecification() != null)
            sb.append("AudioAndDTMFInputSpecification: ").append(getAudioAndDTMFInputSpecification()).append(",");
        if (getTextInputSpecification() != null)
            sb.append("TextInputSpecification: ").append(getTextInputSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromptAttemptSpecification == false)
            return false;
        PromptAttemptSpecification other = (PromptAttemptSpecification) obj;
        if (other.getAllowInterrupt() == null ^ this.getAllowInterrupt() == null)
            return false;
        if (other.getAllowInterrupt() != null && other.getAllowInterrupt().equals(this.getAllowInterrupt()) == false)
            return false;
        if (other.getAllowedInputTypes() == null ^ this.getAllowedInputTypes() == null)
            return false;
        if (other.getAllowedInputTypes() != null && other.getAllowedInputTypes().equals(this.getAllowedInputTypes()) == false)
            return false;
        if (other.getAudioAndDTMFInputSpecification() == null ^ this.getAudioAndDTMFInputSpecification() == null)
            return false;
        if (other.getAudioAndDTMFInputSpecification() != null
                && other.getAudioAndDTMFInputSpecification().equals(this.getAudioAndDTMFInputSpecification()) == false)
            return false;
        if (other.getTextInputSpecification() == null ^ this.getTextInputSpecification() == null)
            return false;
        if (other.getTextInputSpecification() != null && other.getTextInputSpecification().equals(this.getTextInputSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowInterrupt() == null) ? 0 : getAllowInterrupt().hashCode());
        hashCode = prime * hashCode + ((getAllowedInputTypes() == null) ? 0 : getAllowedInputTypes().hashCode());
        hashCode = prime * hashCode + ((getAudioAndDTMFInputSpecification() == null) ? 0 : getAudioAndDTMFInputSpecification().hashCode());
        hashCode = prime * hashCode + ((getTextInputSpecification() == null) ? 0 : getTextInputSpecification().hashCode());
        return hashCode;
    }

    @Override
    public PromptAttemptSpecification clone() {
        try {
            return (PromptAttemptSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.PromptAttemptSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
