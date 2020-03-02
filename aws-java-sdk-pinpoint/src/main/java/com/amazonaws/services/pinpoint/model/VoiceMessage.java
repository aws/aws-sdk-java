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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the settings for a one-time voice message that's sent directly to an endpoint through the voice channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/VoiceMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text of the script to use for the voice message.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The code for the language to use when synthesizing the text of the message script. For a list of supported
     * languages and the code for each one, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The long code to send the voice message from. This value should be one of the dedicated long codes that's
     * assigned to your AWS account. Although it isn't required, we recommend that you specify the long code in E.164
     * format, for example +12065550100, to ensure prompt and accurate delivery of the message.
     * </p>
     */
    private String originationNumber;
    /**
     * <p>
     * The default message variables to use in the voice message. You can override the default variables with individual
     * address variables.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> substitutions;
    /**
     * <p>
     * The name of the voice to use when delivering the message. For a list of supported voices, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * </p>
     */
    private String voiceId;

    /**
     * <p>
     * The text of the script to use for the voice message.
     * </p>
     * 
     * @param body
     *        The text of the script to use for the voice message.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The text of the script to use for the voice message.
     * </p>
     * 
     * @return The text of the script to use for the voice message.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The text of the script to use for the voice message.
     * </p>
     * 
     * @param body
     *        The text of the script to use for the voice message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The code for the language to use when synthesizing the text of the message script. For a list of supported
     * languages and the code for each one, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * </p>
     * 
     * @param languageCode
     *        The code for the language to use when synthesizing the text of the message script. For a list of supported
     *        languages and the code for each one, see the <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The code for the language to use when synthesizing the text of the message script. For a list of supported
     * languages and the code for each one, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * </p>
     * 
     * @return The code for the language to use when synthesizing the text of the message script. For a list of
     *         supported languages and the code for each one, see the <a
     *         href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The code for the language to use when synthesizing the text of the message script. For a list of supported
     * languages and the code for each one, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * </p>
     * 
     * @param languageCode
     *        The code for the language to use when synthesizing the text of the message script. For a list of supported
     *        languages and the code for each one, see the <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceMessage withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The long code to send the voice message from. This value should be one of the dedicated long codes that's
     * assigned to your AWS account. Although it isn't required, we recommend that you specify the long code in E.164
     * format, for example +12065550100, to ensure prompt and accurate delivery of the message.
     * </p>
     * 
     * @param originationNumber
     *        The long code to send the voice message from. This value should be one of the dedicated long codes that's
     *        assigned to your AWS account. Although it isn't required, we recommend that you specify the long code in
     *        E.164 format, for example +12065550100, to ensure prompt and accurate delivery of the message.
     */

    public void setOriginationNumber(String originationNumber) {
        this.originationNumber = originationNumber;
    }

    /**
     * <p>
     * The long code to send the voice message from. This value should be one of the dedicated long codes that's
     * assigned to your AWS account. Although it isn't required, we recommend that you specify the long code in E.164
     * format, for example +12065550100, to ensure prompt and accurate delivery of the message.
     * </p>
     * 
     * @return The long code to send the voice message from. This value should be one of the dedicated long codes that's
     *         assigned to your AWS account. Although it isn't required, we recommend that you specify the long code in
     *         E.164 format, for example +12065550100, to ensure prompt and accurate delivery of the message.
     */

    public String getOriginationNumber() {
        return this.originationNumber;
    }

    /**
     * <p>
     * The long code to send the voice message from. This value should be one of the dedicated long codes that's
     * assigned to your AWS account. Although it isn't required, we recommend that you specify the long code in E.164
     * format, for example +12065550100, to ensure prompt and accurate delivery of the message.
     * </p>
     * 
     * @param originationNumber
     *        The long code to send the voice message from. This value should be one of the dedicated long codes that's
     *        assigned to your AWS account. Although it isn't required, we recommend that you specify the long code in
     *        E.164 format, for example +12065550100, to ensure prompt and accurate delivery of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceMessage withOriginationNumber(String originationNumber) {
        setOriginationNumber(originationNumber);
        return this;
    }

    /**
     * <p>
     * The default message variables to use in the voice message. You can override the default variables with individual
     * address variables.
     * </p>
     * 
     * @return The default message variables to use in the voice message. You can override the default variables with
     *         individual address variables.
     */

    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the voice message. You can override the default variables with individual
     * address variables.
     * </p>
     * 
     * @param substitutions
     *        The default message variables to use in the voice message. You can override the default variables with
     *        individual address variables.
     */

    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * <p>
     * The default message variables to use in the voice message. You can override the default variables with individual
     * address variables.
     * </p>
     * 
     * @param substitutions
     *        The default message variables to use in the voice message. You can override the default variables with
     *        individual address variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        setSubstitutions(substitutions);
        return this;
    }

    /**
     * Add a single Substitutions entry
     *
     * @see VoiceMessage#withSubstitutions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public VoiceMessage addSubstitutionsEntry(String key, java.util.List<String> value) {
        if (null == this.substitutions) {
            this.substitutions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.substitutions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.substitutions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Substitutions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceMessage clearSubstitutionsEntries() {
        this.substitutions = null;
        return this;
    }

    /**
     * <p>
     * The name of the voice to use when delivering the message. For a list of supported voices, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * </p>
     * 
     * @param voiceId
     *        The name of the voice to use when delivering the message. For a list of supported voices, see the <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     */

    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * <p>
     * The name of the voice to use when delivering the message. For a list of supported voices, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * </p>
     * 
     * @return The name of the voice to use when delivering the message. For a list of supported voices, see the <a
     *         href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     */

    public String getVoiceId() {
        return this.voiceId;
    }

    /**
     * <p>
     * The name of the voice to use when delivering the message. For a list of supported voices, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * </p>
     * 
     * @param voiceId
     *        The name of the voice to use when delivering the message. For a list of supported voices, see the <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceMessage withVoiceId(String voiceId) {
        setVoiceId(voiceId);
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
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getOriginationNumber() != null)
            sb.append("OriginationNumber: ").append(getOriginationNumber()).append(",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: ").append(getSubstitutions()).append(",");
        if (getVoiceId() != null)
            sb.append("VoiceId: ").append(getVoiceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceMessage == false)
            return false;
        VoiceMessage other = (VoiceMessage) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getOriginationNumber() == null ^ this.getOriginationNumber() == null)
            return false;
        if (other.getOriginationNumber() != null && other.getOriginationNumber().equals(this.getOriginationNumber()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        if (other.getVoiceId() == null ^ this.getVoiceId() == null)
            return false;
        if (other.getVoiceId() != null && other.getVoiceId().equals(this.getVoiceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getOriginationNumber() == null) ? 0 : getOriginationNumber().hashCode());
        hashCode = prime * hashCode + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        return hashCode;
    }

    @Override
    public VoiceMessage clone() {
        try {
            return (VoiceMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.VoiceMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
