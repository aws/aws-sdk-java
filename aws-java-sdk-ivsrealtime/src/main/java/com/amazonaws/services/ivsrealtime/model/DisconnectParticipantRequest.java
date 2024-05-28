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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DisconnectParticipant" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisconnectParticipantRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier of the participant to be disconnected. This is assigned by IVS and returned by
     * <a>CreateParticipantToken</a>.
     * </p>
     */
    private String participantId;
    /**
     * <p>
     * Description of why this participant is being disconnected.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * ARN of the stage to which the participant is attached.
     * </p>
     */
    private String stageArn;

    /**
     * <p>
     * Identifier of the participant to be disconnected. This is assigned by IVS and returned by
     * <a>CreateParticipantToken</a>.
     * </p>
     * 
     * @param participantId
     *        Identifier of the participant to be disconnected. This is assigned by IVS and returned by
     *        <a>CreateParticipantToken</a>.
     */

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    /**
     * <p>
     * Identifier of the participant to be disconnected. This is assigned by IVS and returned by
     * <a>CreateParticipantToken</a>.
     * </p>
     * 
     * @return Identifier of the participant to be disconnected. This is assigned by IVS and returned by
     *         <a>CreateParticipantToken</a>.
     */

    public String getParticipantId() {
        return this.participantId;
    }

    /**
     * <p>
     * Identifier of the participant to be disconnected. This is assigned by IVS and returned by
     * <a>CreateParticipantToken</a>.
     * </p>
     * 
     * @param participantId
     *        Identifier of the participant to be disconnected. This is assigned by IVS and returned by
     *        <a>CreateParticipantToken</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisconnectParticipantRequest withParticipantId(String participantId) {
        setParticipantId(participantId);
        return this;
    }

    /**
     * <p>
     * Description of why this participant is being disconnected.
     * </p>
     * 
     * @param reason
     *        Description of why this participant is being disconnected.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Description of why this participant is being disconnected.
     * </p>
     * 
     * @return Description of why this participant is being disconnected.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * Description of why this participant is being disconnected.
     * </p>
     * 
     * @param reason
     *        Description of why this participant is being disconnected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisconnectParticipantRequest withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * ARN of the stage to which the participant is attached.
     * </p>
     * 
     * @param stageArn
     *        ARN of the stage to which the participant is attached.
     */

    public void setStageArn(String stageArn) {
        this.stageArn = stageArn;
    }

    /**
     * <p>
     * ARN of the stage to which the participant is attached.
     * </p>
     * 
     * @return ARN of the stage to which the participant is attached.
     */

    public String getStageArn() {
        return this.stageArn;
    }

    /**
     * <p>
     * ARN of the stage to which the participant is attached.
     * </p>
     * 
     * @param stageArn
     *        ARN of the stage to which the participant is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisconnectParticipantRequest withStageArn(String stageArn) {
        setStageArn(stageArn);
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
        if (getParticipantId() != null)
            sb.append("ParticipantId: ").append(getParticipantId()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getStageArn() != null)
            sb.append("StageArn: ").append(getStageArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisconnectParticipantRequest == false)
            return false;
        DisconnectParticipantRequest other = (DisconnectParticipantRequest) obj;
        if (other.getParticipantId() == null ^ this.getParticipantId() == null)
            return false;
        if (other.getParticipantId() != null && other.getParticipantId().equals(this.getParticipantId()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getStageArn() == null ^ this.getStageArn() == null)
            return false;
        if (other.getStageArn() != null && other.getStageArn().equals(this.getStageArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParticipantId() == null) ? 0 : getParticipantId().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getStageArn() == null) ? 0 : getStageArn().hashCode());
        return hashCode;
    }

    @Override
    public DisconnectParticipantRequest clone() {
        return (DisconnectParticipantRequest) super.clone();
    }

}
