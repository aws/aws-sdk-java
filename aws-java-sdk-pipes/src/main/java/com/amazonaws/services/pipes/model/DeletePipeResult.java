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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/DeletePipe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePipeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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

    public DeletePipeResult withArn(String arn) {
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

    public DeletePipeResult withCreationTime(java.util.Date creationTime) {
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

    public DeletePipeResult withCurrentState(String currentState) {
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

    public DeletePipeResult withCurrentState(PipeState currentState) {
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
     * @see RequestedPipeStateDescribeResponse
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
     * @see RequestedPipeStateDescribeResponse
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
     * @see RequestedPipeStateDescribeResponse
     */

    public DeletePipeResult withDesiredState(String desiredState) {
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
     * @see RequestedPipeStateDescribeResponse
     */

    public DeletePipeResult withDesiredState(RequestedPipeStateDescribeResponse desiredState) {
        this.desiredState = desiredState.toString();
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

    public DeletePipeResult withLastModifiedTime(java.util.Date lastModifiedTime) {
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

    public DeletePipeResult withName(String name) {
        setName(name);
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
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePipeResult == false)
            return false;
        DeletePipeResult other = (DeletePipeResult) obj;
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
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public DeletePipeResult clone() {
        try {
            return (DeletePipeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
