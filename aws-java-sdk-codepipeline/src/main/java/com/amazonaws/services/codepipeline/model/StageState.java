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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about the state of the stage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/StageState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StageState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the stage.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * The state of the inbound transition, which is either enabled or disabled.
     * </p>
     */
    private TransitionState inboundTransitionState;
    /**
     * <p>
     * The state of the stage.
     * </p>
     */
    private java.util.List<ActionState> actionStates;
    /**
     * <p>
     * Information about the latest execution in the stage, including its ID and status.
     * </p>
     */
    private StageExecution latestExecution;

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param stageName
     *        The name of the stage.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @return The name of the stage.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param stageName
     *        The name of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageState withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * The state of the inbound transition, which is either enabled or disabled.
     * </p>
     * 
     * @param inboundTransitionState
     *        The state of the inbound transition, which is either enabled or disabled.
     */

    public void setInboundTransitionState(TransitionState inboundTransitionState) {
        this.inboundTransitionState = inboundTransitionState;
    }

    /**
     * <p>
     * The state of the inbound transition, which is either enabled or disabled.
     * </p>
     * 
     * @return The state of the inbound transition, which is either enabled or disabled.
     */

    public TransitionState getInboundTransitionState() {
        return this.inboundTransitionState;
    }

    /**
     * <p>
     * The state of the inbound transition, which is either enabled or disabled.
     * </p>
     * 
     * @param inboundTransitionState
     *        The state of the inbound transition, which is either enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageState withInboundTransitionState(TransitionState inboundTransitionState) {
        setInboundTransitionState(inboundTransitionState);
        return this;
    }

    /**
     * <p>
     * The state of the stage.
     * </p>
     * 
     * @return The state of the stage.
     */

    public java.util.List<ActionState> getActionStates() {
        return actionStates;
    }

    /**
     * <p>
     * The state of the stage.
     * </p>
     * 
     * @param actionStates
     *        The state of the stage.
     */

    public void setActionStates(java.util.Collection<ActionState> actionStates) {
        if (actionStates == null) {
            this.actionStates = null;
            return;
        }

        this.actionStates = new java.util.ArrayList<ActionState>(actionStates);
    }

    /**
     * <p>
     * The state of the stage.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionStates(java.util.Collection)} or {@link #withActionStates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param actionStates
     *        The state of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageState withActionStates(ActionState... actionStates) {
        if (this.actionStates == null) {
            setActionStates(new java.util.ArrayList<ActionState>(actionStates.length));
        }
        for (ActionState ele : actionStates) {
            this.actionStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The state of the stage.
     * </p>
     * 
     * @param actionStates
     *        The state of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageState withActionStates(java.util.Collection<ActionState> actionStates) {
        setActionStates(actionStates);
        return this;
    }

    /**
     * <p>
     * Information about the latest execution in the stage, including its ID and status.
     * </p>
     * 
     * @param latestExecution
     *        Information about the latest execution in the stage, including its ID and status.
     */

    public void setLatestExecution(StageExecution latestExecution) {
        this.latestExecution = latestExecution;
    }

    /**
     * <p>
     * Information about the latest execution in the stage, including its ID and status.
     * </p>
     * 
     * @return Information about the latest execution in the stage, including its ID and status.
     */

    public StageExecution getLatestExecution() {
        return this.latestExecution;
    }

    /**
     * <p>
     * Information about the latest execution in the stage, including its ID and status.
     * </p>
     * 
     * @param latestExecution
     *        Information about the latest execution in the stage, including its ID and status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageState withLatestExecution(StageExecution latestExecution) {
        setLatestExecution(latestExecution);
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
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getInboundTransitionState() != null)
            sb.append("InboundTransitionState: ").append(getInboundTransitionState()).append(",");
        if (getActionStates() != null)
            sb.append("ActionStates: ").append(getActionStates()).append(",");
        if (getLatestExecution() != null)
            sb.append("LatestExecution: ").append(getLatestExecution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StageState == false)
            return false;
        StageState other = (StageState) obj;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getInboundTransitionState() == null ^ this.getInboundTransitionState() == null)
            return false;
        if (other.getInboundTransitionState() != null && other.getInboundTransitionState().equals(this.getInboundTransitionState()) == false)
            return false;
        if (other.getActionStates() == null ^ this.getActionStates() == null)
            return false;
        if (other.getActionStates() != null && other.getActionStates().equals(this.getActionStates()) == false)
            return false;
        if (other.getLatestExecution() == null ^ this.getLatestExecution() == null)
            return false;
        if (other.getLatestExecution() != null && other.getLatestExecution().equals(this.getLatestExecution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getInboundTransitionState() == null) ? 0 : getInboundTransitionState().hashCode());
        hashCode = prime * hashCode + ((getActionStates() == null) ? 0 : getActionStates().hashCode());
        hashCode = prime * hashCode + ((getLatestExecution() == null) ? 0 : getLatestExecution().hashCode());
        return hashCode;
    }

    @Override
    public StageState clone() {
        try {
            return (StageState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.StageStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
