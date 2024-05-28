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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates which speaker is on which channel. The options are <code>CLINICIAN</code> and <code>PATIENT</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/MedicalScribeChannelDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MedicalScribeChannelDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify the audio channel you want to define.
     * </p>
     */
    private Integer channelId;
    /**
     * <p>
     * Specify the participant that you want to flag. The options are <code>CLINICIAN</code> and <code>PATIENT</code>
     * </p>
     */
    private String participantRole;

    /**
     * <p>
     * Specify the audio channel you want to define.
     * </p>
     * 
     * @param channelId
     *        Specify the audio channel you want to define.
     */

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * <p>
     * Specify the audio channel you want to define.
     * </p>
     * 
     * @return Specify the audio channel you want to define.
     */

    public Integer getChannelId() {
        return this.channelId;
    }

    /**
     * <p>
     * Specify the audio channel you want to define.
     * </p>
     * 
     * @param channelId
     *        Specify the audio channel you want to define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeChannelDefinition withChannelId(Integer channelId) {
        setChannelId(channelId);
        return this;
    }

    /**
     * <p>
     * Specify the participant that you want to flag. The options are <code>CLINICIAN</code> and <code>PATIENT</code>
     * </p>
     * 
     * @param participantRole
     *        Specify the participant that you want to flag. The options are <code>CLINICIAN</code> and
     *        <code>PATIENT</code>
     * @see MedicalScribeParticipantRole
     */

    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * Specify the participant that you want to flag. The options are <code>CLINICIAN</code> and <code>PATIENT</code>
     * </p>
     * 
     * @return Specify the participant that you want to flag. The options are <code>CLINICIAN</code> and
     *         <code>PATIENT</code>
     * @see MedicalScribeParticipantRole
     */

    public String getParticipantRole() {
        return this.participantRole;
    }

    /**
     * <p>
     * Specify the participant that you want to flag. The options are <code>CLINICIAN</code> and <code>PATIENT</code>
     * </p>
     * 
     * @param participantRole
     *        Specify the participant that you want to flag. The options are <code>CLINICIAN</code> and
     *        <code>PATIENT</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MedicalScribeParticipantRole
     */

    public MedicalScribeChannelDefinition withParticipantRole(String participantRole) {
        setParticipantRole(participantRole);
        return this;
    }

    /**
     * <p>
     * Specify the participant that you want to flag. The options are <code>CLINICIAN</code> and <code>PATIENT</code>
     * </p>
     * 
     * @param participantRole
     *        Specify the participant that you want to flag. The options are <code>CLINICIAN</code> and
     *        <code>PATIENT</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MedicalScribeParticipantRole
     */

    public MedicalScribeChannelDefinition withParticipantRole(MedicalScribeParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
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
        if (getChannelId() != null)
            sb.append("ChannelId: ").append(getChannelId()).append(",");
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: ").append(getParticipantRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MedicalScribeChannelDefinition == false)
            return false;
        MedicalScribeChannelDefinition other = (MedicalScribeChannelDefinition) obj;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        return hashCode;
    }

    @Override
    public MedicalScribeChannelDefinition clone() {
        try {
            return (MedicalScribeChannelDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.MedicalScribeChannelDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
