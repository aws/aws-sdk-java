/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Voice Message.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/VoiceMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceMessage implements Serializable, Cloneable, StructuredPojo {

    /** The message body of the notification, the email body or the text message. */
    private String body;
    /** Language of sent message */
    private String languageCode;
    /** Is the number from the pool or messaging service to send from. */
    private String originationNumber;
    /** Default message substitutions. Can be overridden by individual address substitutions. */
    private java.util.Map<String, java.util.List<String>> substitutions;
    /** Voice ID of sent message. */
    private String voiceId;

    /**
     * The message body of the notification, the email body or the text message.
     * 
     * @param body
     *        The message body of the notification, the email body or the text message.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * The message body of the notification, the email body or the text message.
     * 
     * @return The message body of the notification, the email body or the text message.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * The message body of the notification, the email body or the text message.
     * 
     * @param body
     *        The message body of the notification, the email body or the text message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceMessage withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * Language of sent message
     * 
     * @param languageCode
     *        Language of sent message
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Language of sent message
     * 
     * @return Language of sent message
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * Language of sent message
     * 
     * @param languageCode
     *        Language of sent message
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceMessage withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * Is the number from the pool or messaging service to send from.
     * 
     * @param originationNumber
     *        Is the number from the pool or messaging service to send from.
     */

    public void setOriginationNumber(String originationNumber) {
        this.originationNumber = originationNumber;
    }

    /**
     * Is the number from the pool or messaging service to send from.
     * 
     * @return Is the number from the pool or messaging service to send from.
     */

    public String getOriginationNumber() {
        return this.originationNumber;
    }

    /**
     * Is the number from the pool or messaging service to send from.
     * 
     * @param originationNumber
     *        Is the number from the pool or messaging service to send from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceMessage withOriginationNumber(String originationNumber) {
        setOriginationNumber(originationNumber);
        return this;
    }

    /**
     * Default message substitutions. Can be overridden by individual address substitutions.
     * 
     * @return Default message substitutions. Can be overridden by individual address substitutions.
     */

    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address substitutions.
     * 
     * @param substitutions
     *        Default message substitutions. Can be overridden by individual address substitutions.
     */

    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * Default message substitutions. Can be overridden by individual address substitutions.
     * 
     * @param substitutions
     *        Default message substitutions. Can be overridden by individual address substitutions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceMessage withSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        setSubstitutions(substitutions);
        return this;
    }

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
     * Voice ID of sent message.
     * 
     * @param voiceId
     *        Voice ID of sent message.
     */

    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * Voice ID of sent message.
     * 
     * @return Voice ID of sent message.
     */

    public String getVoiceId() {
        return this.voiceId;
    }

    /**
     * Voice ID of sent message.
     * 
     * @param voiceId
     *        Voice ID of sent message.
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
