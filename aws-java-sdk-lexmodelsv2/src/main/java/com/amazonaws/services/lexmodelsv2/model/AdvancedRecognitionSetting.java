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
 * Provides settings that enable advanced recognition settings for slot values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/AdvancedRecognitionSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdvancedRecognitionSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables using the slot values as a custom vocabulary for recognizing user utterances.
     * </p>
     */
    private String audioRecognitionStrategy;

    /**
     * <p>
     * Enables using the slot values as a custom vocabulary for recognizing user utterances.
     * </p>
     * 
     * @param audioRecognitionStrategy
     *        Enables using the slot values as a custom vocabulary for recognizing user utterances.
     * @see AudioRecognitionStrategy
     */

    public void setAudioRecognitionStrategy(String audioRecognitionStrategy) {
        this.audioRecognitionStrategy = audioRecognitionStrategy;
    }

    /**
     * <p>
     * Enables using the slot values as a custom vocabulary for recognizing user utterances.
     * </p>
     * 
     * @return Enables using the slot values as a custom vocabulary for recognizing user utterances.
     * @see AudioRecognitionStrategy
     */

    public String getAudioRecognitionStrategy() {
        return this.audioRecognitionStrategy;
    }

    /**
     * <p>
     * Enables using the slot values as a custom vocabulary for recognizing user utterances.
     * </p>
     * 
     * @param audioRecognitionStrategy
     *        Enables using the slot values as a custom vocabulary for recognizing user utterances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioRecognitionStrategy
     */

    public AdvancedRecognitionSetting withAudioRecognitionStrategy(String audioRecognitionStrategy) {
        setAudioRecognitionStrategy(audioRecognitionStrategy);
        return this;
    }

    /**
     * <p>
     * Enables using the slot values as a custom vocabulary for recognizing user utterances.
     * </p>
     * 
     * @param audioRecognitionStrategy
     *        Enables using the slot values as a custom vocabulary for recognizing user utterances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioRecognitionStrategy
     */

    public AdvancedRecognitionSetting withAudioRecognitionStrategy(AudioRecognitionStrategy audioRecognitionStrategy) {
        this.audioRecognitionStrategy = audioRecognitionStrategy.toString();
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
        if (getAudioRecognitionStrategy() != null)
            sb.append("AudioRecognitionStrategy: ").append(getAudioRecognitionStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdvancedRecognitionSetting == false)
            return false;
        AdvancedRecognitionSetting other = (AdvancedRecognitionSetting) obj;
        if (other.getAudioRecognitionStrategy() == null ^ this.getAudioRecognitionStrategy() == null)
            return false;
        if (other.getAudioRecognitionStrategy() != null && other.getAudioRecognitionStrategy().equals(this.getAudioRecognitionStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioRecognitionStrategy() == null) ? 0 : getAudioRecognitionStrategy().hashCode());
        return hashCode;
    }

    @Override
    public AdvancedRecognitionSetting clone() {
        try {
            return (AdvancedRecognitionSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.AdvancedRecognitionSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
