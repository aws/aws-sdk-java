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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/StartSpeakerSearchTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSpeakerSearchTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Voice Connector ID.
     * </p>
     */
    private String voiceConnectorId;
    /**
     * <p>
     * The transaction ID of the call being analyzed.
     * </p>
     */
    private String transactionId;
    /**
     * <p>
     * The ID of the voice profile domain that will store the voice profile.
     * </p>
     */
    private String voiceProfileDomainId;
    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different speaker search tasks.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Specifies which call leg to stream for speaker search.
     * </p>
     */
    private String callLeg;

    /**
     * <p>
     * The Voice Connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Voice Connector ID.
     */

    public void setVoiceConnectorId(String voiceConnectorId) {
        this.voiceConnectorId = voiceConnectorId;
    }

    /**
     * <p>
     * The Voice Connector ID.
     * </p>
     * 
     * @return The Voice Connector ID.
     */

    public String getVoiceConnectorId() {
        return this.voiceConnectorId;
    }

    /**
     * <p>
     * The Voice Connector ID.
     * </p>
     * 
     * @param voiceConnectorId
     *        The Voice Connector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeakerSearchTaskRequest withVoiceConnectorId(String voiceConnectorId) {
        setVoiceConnectorId(voiceConnectorId);
        return this;
    }

    /**
     * <p>
     * The transaction ID of the call being analyzed.
     * </p>
     * 
     * @param transactionId
     *        The transaction ID of the call being analyzed.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * The transaction ID of the call being analyzed.
     * </p>
     * 
     * @return The transaction ID of the call being analyzed.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * The transaction ID of the call being analyzed.
     * </p>
     * 
     * @param transactionId
     *        The transaction ID of the call being analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeakerSearchTaskRequest withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * <p>
     * The ID of the voice profile domain that will store the voice profile.
     * </p>
     * 
     * @param voiceProfileDomainId
     *        The ID of the voice profile domain that will store the voice profile.
     */

    public void setVoiceProfileDomainId(String voiceProfileDomainId) {
        this.voiceProfileDomainId = voiceProfileDomainId;
    }

    /**
     * <p>
     * The ID of the voice profile domain that will store the voice profile.
     * </p>
     * 
     * @return The ID of the voice profile domain that will store the voice profile.
     */

    public String getVoiceProfileDomainId() {
        return this.voiceProfileDomainId;
    }

    /**
     * <p>
     * The ID of the voice profile domain that will store the voice profile.
     * </p>
     * 
     * @param voiceProfileDomainId
     *        The ID of the voice profile domain that will store the voice profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeakerSearchTaskRequest withVoiceProfileDomainId(String voiceProfileDomainId) {
        setVoiceProfileDomainId(voiceProfileDomainId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different speaker search tasks.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the client request. Use a different token for different speaker search tasks.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different speaker search tasks.
     * </p>
     * 
     * @return The unique identifier for the client request. Use a different token for different speaker search tasks.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different speaker search tasks.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the client request. Use a different token for different speaker search tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSpeakerSearchTaskRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Specifies which call leg to stream for speaker search.
     * </p>
     * 
     * @param callLeg
     *        Specifies which call leg to stream for speaker search.
     * @see CallLegType
     */

    public void setCallLeg(String callLeg) {
        this.callLeg = callLeg;
    }

    /**
     * <p>
     * Specifies which call leg to stream for speaker search.
     * </p>
     * 
     * @return Specifies which call leg to stream for speaker search.
     * @see CallLegType
     */

    public String getCallLeg() {
        return this.callLeg;
    }

    /**
     * <p>
     * Specifies which call leg to stream for speaker search.
     * </p>
     * 
     * @param callLeg
     *        Specifies which call leg to stream for speaker search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallLegType
     */

    public StartSpeakerSearchTaskRequest withCallLeg(String callLeg) {
        setCallLeg(callLeg);
        return this;
    }

    /**
     * <p>
     * Specifies which call leg to stream for speaker search.
     * </p>
     * 
     * @param callLeg
     *        Specifies which call leg to stream for speaker search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallLegType
     */

    public StartSpeakerSearchTaskRequest withCallLeg(CallLegType callLeg) {
        this.callLeg = callLeg.toString();
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
        if (getVoiceConnectorId() != null)
            sb.append("VoiceConnectorId: ").append(getVoiceConnectorId()).append(",");
        if (getTransactionId() != null)
            sb.append("TransactionId: ").append(getTransactionId()).append(",");
        if (getVoiceProfileDomainId() != null)
            sb.append("VoiceProfileDomainId: ").append(getVoiceProfileDomainId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getCallLeg() != null)
            sb.append("CallLeg: ").append(getCallLeg());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSpeakerSearchTaskRequest == false)
            return false;
        StartSpeakerSearchTaskRequest other = (StartSpeakerSearchTaskRequest) obj;
        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getVoiceProfileDomainId() == null ^ this.getVoiceProfileDomainId() == null)
            return false;
        if (other.getVoiceProfileDomainId() != null && other.getVoiceProfileDomainId().equals(this.getVoiceProfileDomainId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getCallLeg() == null ^ this.getCallLeg() == null)
            return false;
        if (other.getCallLeg() != null && other.getCallLeg().equals(this.getCallLeg()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getVoiceProfileDomainId() == null) ? 0 : getVoiceProfileDomainId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getCallLeg() == null) ? 0 : getCallLeg().hashCode());
        return hashCode;
    }

    @Override
    public StartSpeakerSearchTaskRequest clone() {
        return (StartSpeakerSearchTaskRequest) super.clone();
    }

}
