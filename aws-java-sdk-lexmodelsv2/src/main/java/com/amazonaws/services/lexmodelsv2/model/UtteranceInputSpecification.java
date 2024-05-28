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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about input of an utterance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UtteranceInputSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UtteranceInputSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A text input transcription of the utterance. It is only applicable for test-sets containing text data.
     * </p>
     */
    private String textInput;
    /**
     * <p>
     * Contains information about the audio input for an utterance.
     * </p>
     */
    private UtteranceAudioInputSpecification audioInput;

    /**
     * <p>
     * A text input transcription of the utterance. It is only applicable for test-sets containing text data.
     * </p>
     * 
     * @param textInput
     *        A text input transcription of the utterance. It is only applicable for test-sets containing text data.
     */

    public void setTextInput(String textInput) {
        this.textInput = textInput;
    }

    /**
     * <p>
     * A text input transcription of the utterance. It is only applicable for test-sets containing text data.
     * </p>
     * 
     * @return A text input transcription of the utterance. It is only applicable for test-sets containing text data.
     */

    public String getTextInput() {
        return this.textInput;
    }

    /**
     * <p>
     * A text input transcription of the utterance. It is only applicable for test-sets containing text data.
     * </p>
     * 
     * @param textInput
     *        A text input transcription of the utterance. It is only applicable for test-sets containing text data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceInputSpecification withTextInput(String textInput) {
        setTextInput(textInput);
        return this;
    }

    /**
     * <p>
     * Contains information about the audio input for an utterance.
     * </p>
     * 
     * @param audioInput
     *        Contains information about the audio input for an utterance.
     */

    public void setAudioInput(UtteranceAudioInputSpecification audioInput) {
        this.audioInput = audioInput;
    }

    /**
     * <p>
     * Contains information about the audio input for an utterance.
     * </p>
     * 
     * @return Contains information about the audio input for an utterance.
     */

    public UtteranceAudioInputSpecification getAudioInput() {
        return this.audioInput;
    }

    /**
     * <p>
     * Contains information about the audio input for an utterance.
     * </p>
     * 
     * @param audioInput
     *        Contains information about the audio input for an utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceInputSpecification withAudioInput(UtteranceAudioInputSpecification audioInput) {
        setAudioInput(audioInput);
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
        if (getTextInput() != null)
            sb.append("TextInput: ").append(getTextInput()).append(",");
        if (getAudioInput() != null)
            sb.append("AudioInput: ").append(getAudioInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UtteranceInputSpecification == false)
            return false;
        UtteranceInputSpecification other = (UtteranceInputSpecification) obj;
        if (other.getTextInput() == null ^ this.getTextInput() == null)
            return false;
        if (other.getTextInput() != null && other.getTextInput().equals(this.getTextInput()) == false)
            return false;
        if (other.getAudioInput() == null ^ this.getAudioInput() == null)
            return false;
        if (other.getAudioInput() != null && other.getAudioInput().equals(this.getAudioInput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextInput() == null) ? 0 : getTextInput().hashCode());
        hashCode = prime * hashCode + ((getAudioInput() == null) ? 0 : getAudioInput().hashCode());
        return hashCode;
    }

    @Override
    public UtteranceInputSpecification clone() {
        try {
            return (UtteranceInputSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.UtteranceInputSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
