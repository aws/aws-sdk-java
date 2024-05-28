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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateStage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Participant tokens attached to the stage. These correspond to the <code>participants</code> in the request.
     * </p>
     */
    private java.util.List<ParticipantToken> participantTokens;
    /**
     * <p>
     * The stage that was created.
     * </p>
     */
    private Stage stage;

    /**
     * <p>
     * Participant tokens attached to the stage. These correspond to the <code>participants</code> in the request.
     * </p>
     * 
     * @return Participant tokens attached to the stage. These correspond to the <code>participants</code> in the
     *         request.
     */

    public java.util.List<ParticipantToken> getParticipantTokens() {
        return participantTokens;
    }

    /**
     * <p>
     * Participant tokens attached to the stage. These correspond to the <code>participants</code> in the request.
     * </p>
     * 
     * @param participantTokens
     *        Participant tokens attached to the stage. These correspond to the <code>participants</code> in the
     *        request.
     */

    public void setParticipantTokens(java.util.Collection<ParticipantToken> participantTokens) {
        if (participantTokens == null) {
            this.participantTokens = null;
            return;
        }

        this.participantTokens = new java.util.ArrayList<ParticipantToken>(participantTokens);
    }

    /**
     * <p>
     * Participant tokens attached to the stage. These correspond to the <code>participants</code> in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParticipantTokens(java.util.Collection)} or {@link #withParticipantTokens(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param participantTokens
     *        Participant tokens attached to the stage. These correspond to the <code>participants</code> in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageResult withParticipantTokens(ParticipantToken... participantTokens) {
        if (this.participantTokens == null) {
            setParticipantTokens(new java.util.ArrayList<ParticipantToken>(participantTokens.length));
        }
        for (ParticipantToken ele : participantTokens) {
            this.participantTokens.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Participant tokens attached to the stage. These correspond to the <code>participants</code> in the request.
     * </p>
     * 
     * @param participantTokens
     *        Participant tokens attached to the stage. These correspond to the <code>participants</code> in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageResult withParticipantTokens(java.util.Collection<ParticipantToken> participantTokens) {
        setParticipantTokens(participantTokens);
        return this;
    }

    /**
     * <p>
     * The stage that was created.
     * </p>
     * 
     * @param stage
     *        The stage that was created.
     */

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The stage that was created.
     * </p>
     * 
     * @return The stage that was created.
     */

    public Stage getStage() {
        return this.stage;
    }

    /**
     * <p>
     * The stage that was created.
     * </p>
     * 
     * @param stage
     *        The stage that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageResult withStage(Stage stage) {
        setStage(stage);
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
        if (getParticipantTokens() != null)
            sb.append("ParticipantTokens: ").append(getParticipantTokens()).append(",");
        if (getStage() != null)
            sb.append("Stage: ").append(getStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStageResult == false)
            return false;
        CreateStageResult other = (CreateStageResult) obj;
        if (other.getParticipantTokens() == null ^ this.getParticipantTokens() == null)
            return false;
        if (other.getParticipantTokens() != null && other.getParticipantTokens().equals(this.getParticipantTokens()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParticipantTokens() == null) ? 0 : getParticipantTokens().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        return hashCode;
    }

    @Override
    public CreateStageResult clone() {
        try {
            return (CreateStageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
