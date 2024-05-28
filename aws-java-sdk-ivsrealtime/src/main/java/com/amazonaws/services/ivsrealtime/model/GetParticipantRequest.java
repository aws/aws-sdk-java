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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetParticipant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetParticipantRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the participant. This is assigned by IVS and returned by <a>CreateParticipantToken</a>.
     * </p>
     */
    private String participantId;
    /**
     * <p>
     * ID of a session within the stage.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * Stage ARN.
     * </p>
     */
    private String stageArn;

    /**
     * <p>
     * Unique identifier for the participant. This is assigned by IVS and returned by <a>CreateParticipantToken</a>.
     * </p>
     * 
     * @param participantId
     *        Unique identifier for the participant. This is assigned by IVS and returned by
     *        <a>CreateParticipantToken</a>.
     */

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    /**
     * <p>
     * Unique identifier for the participant. This is assigned by IVS and returned by <a>CreateParticipantToken</a>.
     * </p>
     * 
     * @return Unique identifier for the participant. This is assigned by IVS and returned by
     *         <a>CreateParticipantToken</a>.
     */

    public String getParticipantId() {
        return this.participantId;
    }

    /**
     * <p>
     * Unique identifier for the participant. This is assigned by IVS and returned by <a>CreateParticipantToken</a>.
     * </p>
     * 
     * @param participantId
     *        Unique identifier for the participant. This is assigned by IVS and returned by
     *        <a>CreateParticipantToken</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParticipantRequest withParticipantId(String participantId) {
        setParticipantId(participantId);
        return this;
    }

    /**
     * <p>
     * ID of a session within the stage.
     * </p>
     * 
     * @param sessionId
     *        ID of a session within the stage.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * ID of a session within the stage.
     * </p>
     * 
     * @return ID of a session within the stage.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * ID of a session within the stage.
     * </p>
     * 
     * @param sessionId
     *        ID of a session within the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParticipantRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * Stage ARN.
     * </p>
     * 
     * @param stageArn
     *        Stage ARN.
     */

    public void setStageArn(String stageArn) {
        this.stageArn = stageArn;
    }

    /**
     * <p>
     * Stage ARN.
     * </p>
     * 
     * @return Stage ARN.
     */

    public String getStageArn() {
        return this.stageArn;
    }

    /**
     * <p>
     * Stage ARN.
     * </p>
     * 
     * @param stageArn
     *        Stage ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParticipantRequest withStageArn(String stageArn) {
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
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
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

        if (obj instanceof GetParticipantRequest == false)
            return false;
        GetParticipantRequest other = (GetParticipantRequest) obj;
        if (other.getParticipantId() == null ^ this.getParticipantId() == null)
            return false;
        if (other.getParticipantId() != null && other.getParticipantId().equals(this.getParticipantId()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
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
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getStageArn() == null) ? 0 : getStageArn().hashCode());
        return hashCode;
    }

    @Override
    public GetParticipantRequest clone() {
        return (GetParticipantRequest) super.clone();
    }

}
