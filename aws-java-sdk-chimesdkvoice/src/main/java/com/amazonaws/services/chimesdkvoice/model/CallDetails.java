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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an Amazon Chime SDK Voice Connector call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CallDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CallDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Voice Connector ID.
     * </p>
     */
    private String voiceConnectorId;
    /**
     * <p>
     * The transaction ID of a Voice Connector call.
     * </p>
     */
    private String transactionId;
    /**
     * <p>
     * Identifies a person as the caller or the callee.
     * </p>
     */
    private Boolean isCaller;

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

    public CallDetails withVoiceConnectorId(String voiceConnectorId) {
        setVoiceConnectorId(voiceConnectorId);
        return this;
    }

    /**
     * <p>
     * The transaction ID of a Voice Connector call.
     * </p>
     * 
     * @param transactionId
     *        The transaction ID of a Voice Connector call.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * The transaction ID of a Voice Connector call.
     * </p>
     * 
     * @return The transaction ID of a Voice Connector call.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * The transaction ID of a Voice Connector call.
     * </p>
     * 
     * @param transactionId
     *        The transaction ID of a Voice Connector call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallDetails withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * <p>
     * Identifies a person as the caller or the callee.
     * </p>
     * 
     * @param isCaller
     *        Identifies a person as the caller or the callee.
     */

    public void setIsCaller(Boolean isCaller) {
        this.isCaller = isCaller;
    }

    /**
     * <p>
     * Identifies a person as the caller or the callee.
     * </p>
     * 
     * @return Identifies a person as the caller or the callee.
     */

    public Boolean getIsCaller() {
        return this.isCaller;
    }

    /**
     * <p>
     * Identifies a person as the caller or the callee.
     * </p>
     * 
     * @param isCaller
     *        Identifies a person as the caller or the callee.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallDetails withIsCaller(Boolean isCaller) {
        setIsCaller(isCaller);
        return this;
    }

    /**
     * <p>
     * Identifies a person as the caller or the callee.
     * </p>
     * 
     * @return Identifies a person as the caller or the callee.
     */

    public Boolean isCaller() {
        return this.isCaller;
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
        if (getIsCaller() != null)
            sb.append("IsCaller: ").append(getIsCaller());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CallDetails == false)
            return false;
        CallDetails other = (CallDetails) obj;
        if (other.getVoiceConnectorId() == null ^ this.getVoiceConnectorId() == null)
            return false;
        if (other.getVoiceConnectorId() != null && other.getVoiceConnectorId().equals(this.getVoiceConnectorId()) == false)
            return false;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getIsCaller() == null ^ this.getIsCaller() == null)
            return false;
        if (other.getIsCaller() != null && other.getIsCaller().equals(this.getIsCaller()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceConnectorId() == null) ? 0 : getVoiceConnectorId().hashCode());
        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getIsCaller() == null) ? 0 : getIsCaller().hashCode());
        return hashCode;
    }

    @Override
    public CallDetails clone() {
        try {
            return (CallDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.CallDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
