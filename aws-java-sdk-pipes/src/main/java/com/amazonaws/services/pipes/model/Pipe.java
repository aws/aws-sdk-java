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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a pipe. Amazon EventBridgePipes connect event sources to targets and reduces the need for
 * specialized knowledge and integration code.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/Pipe" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Pipe implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the pipe.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time the pipe was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The state the pipe is in.
     * </p>
     */
    private String currentState;
    /**
     * <p>
     * The state the pipe should be in.
     * </p>
     */
    private String desiredState;
    /**
     * <p>
     * The ARN of the enrichment resource.
     * </p>
     */
    private String enrichment;
    /**
     * <p>
     * When the pipe was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The name of the pipe.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the source resource.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The reason the pipe is in its current state.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * The ARN of the target resource.
     * </p>
     */
    private String target;

    /**
     * <p>
     * The ARN of the pipe.
     * </p>
     * 
     * @param arn
     *        The ARN of the pipe.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the pipe.
     * </p>
     * 
     * @return The ARN of the pipe.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the pipe.
     * </p>
     * 
     * @param arn
     *        The ARN of the pipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipe withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time the pipe was created.
     * </p>
     * 
     * @param creationTime
     *        The time the pipe was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the pipe was created.
     * </p>
     * 
     * @return The time the pipe was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the pipe was created.
     * </p>
     * 
     * @param creationTime
     *        The time the pipe was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipe withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The state the pipe is in.
     * </p>
     * 
     * @param currentState
     *        The state the pipe is in.
     * @see PipeState
     */

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    /**
     * <p>
     * The state the pipe is in.
     * </p>
     * 
     * @return The state the pipe is in.
     * @see PipeState
     */

    public String getCurrentState() {
        return this.currentState;
    }

    /**
     * <p>
     * The state the pipe is in.
     * </p>
     * 
     * @param currentState
     *        The state the pipe is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipeState
     */

    public Pipe withCurrentState(String currentState) {
        setCurrentState(currentState);
        return this;
    }

    /**
     * <p>
     * The state the pipe is in.
     * </p>
     * 
     * @param currentState
     *        The state the pipe is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipeState
     */

    public Pipe withCurrentState(PipeState currentState) {
        this.currentState = currentState.toString();
        return this;
    }

    /**
     * <p>
     * The state the pipe should be in.
     * </p>
     * 
     * @param desiredState
     *        The state the pipe should be in.
     * @see RequestedPipeState
     */

    public void setDesiredState(String desiredState) {
        this.desiredState = desiredState;
    }

    /**
     * <p>
     * The state the pipe should be in.
     * </p>
     * 
     * @return The state the pipe should be in.
     * @see RequestedPipeState
     */

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * <p>
     * The state the pipe should be in.
     * </p>
     * 
     * @param desiredState
     *        The state the pipe should be in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestedPipeState
     */

    public Pipe withDesiredState(String desiredState) {
        setDesiredState(desiredState);
        return this;
    }

    /**
     * <p>
     * The state the pipe should be in.
     * </p>
     * 
     * @param desiredState
     *        The state the pipe should be in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestedPipeState
     */

    public Pipe withDesiredState(RequestedPipeState desiredState) {
        this.desiredState = desiredState.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the enrichment resource.
     * </p>
     * 
     * @param enrichment
     *        The ARN of the enrichment resource.
     */

    public void setEnrichment(String enrichment) {
        this.enrichment = enrichment;
    }

    /**
     * <p>
     * The ARN of the enrichment resource.
     * </p>
     * 
     * @return The ARN of the enrichment resource.
     */

    public String getEnrichment() {
        return this.enrichment;
    }

    /**
     * <p>
     * The ARN of the enrichment resource.
     * </p>
     * 
     * @param enrichment
     *        The ARN of the enrichment resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipe withEnrichment(String enrichment) {
        setEnrichment(enrichment);
        return this;
    }

    /**
     * <p>
     * When the pipe was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @param lastModifiedTime
     *        When the pipe was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     *        (YYYY-MM-DDThh:mm:ss.sTZD).
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the pipe was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @return When the pipe was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     *         (YYYY-MM-DDThh:mm:ss.sTZD).
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the pipe was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @param lastModifiedTime
     *        When the pipe was last updated, in <a href="https://www.w3.org/TR/NOTE-datetime">ISO-8601 format</a>
     *        (YYYY-MM-DDThh:mm:ss.sTZD).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipe withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The name of the pipe.
     * </p>
     * 
     * @param name
     *        The name of the pipe.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the pipe.
     * </p>
     * 
     * @return The name of the pipe.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the pipe.
     * </p>
     * 
     * @param name
     *        The name of the pipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipe withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the source resource.
     * </p>
     * 
     * @param source
     *        The ARN of the source resource.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The ARN of the source resource.
     * </p>
     * 
     * @return The ARN of the source resource.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The ARN of the source resource.
     * </p>
     * 
     * @param source
     *        The ARN of the source resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipe withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The reason the pipe is in its current state.
     * </p>
     * 
     * @param stateReason
     *        The reason the pipe is in its current state.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason the pipe is in its current state.
     * </p>
     * 
     * @return The reason the pipe is in its current state.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * The reason the pipe is in its current state.
     * </p>
     * 
     * @param stateReason
     *        The reason the pipe is in its current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipe withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * The ARN of the target resource.
     * </p>
     * 
     * @param target
     *        The ARN of the target resource.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The ARN of the target resource.
     * </p>
     * 
     * @return The ARN of the target resource.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The ARN of the target resource.
     * </p>
     * 
     * @param target
     *        The ARN of the target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipe withTarget(String target) {
        setTarget(target);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCurrentState() != null)
            sb.append("CurrentState: ").append(getCurrentState()).append(",");
        if (getDesiredState() != null)
            sb.append("DesiredState: ").append(getDesiredState()).append(",");
        if (getEnrichment() != null)
            sb.append("Enrichment: ").append(getEnrichment()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Pipe == false)
            return false;
        Pipe other = (Pipe) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCurrentState() == null ^ this.getCurrentState() == null)
            return false;
        if (other.getCurrentState() != null && other.getCurrentState().equals(this.getCurrentState()) == false)
            return false;
        if (other.getDesiredState() == null ^ this.getDesiredState() == null)
            return false;
        if (other.getDesiredState() != null && other.getDesiredState().equals(this.getDesiredState()) == false)
            return false;
        if (other.getEnrichment() == null ^ this.getEnrichment() == null)
            return false;
        if (other.getEnrichment() != null && other.getEnrichment().equals(this.getEnrichment()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCurrentState() == null) ? 0 : getCurrentState().hashCode());
        hashCode = prime * hashCode + ((getDesiredState() == null) ? 0 : getDesiredState().hashCode());
        hashCode = prime * hashCode + ((getEnrichment() == null) ? 0 : getEnrichment().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public Pipe clone() {
        try {
            return (Pipe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.PipeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
