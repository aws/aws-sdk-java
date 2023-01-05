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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The statement or request for a particular action to occur in a session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Statement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Statement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the statement.
     * </p>
     */
    private Integer id;
    /**
     * <p>
     * The execution code of the statement.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The state while request is actioned.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The output in JSON.
     * </p>
     */
    private StatementOutput output;
    /**
     * <p>
     * The code execution progress.
     * </p>
     */
    private Double progress;
    /**
     * <p>
     * The unix time and date that the job definition was started.
     * </p>
     */
    private Long startedOn;
    /**
     * <p>
     * The unix time and date that the job definition was completed.
     * </p>
     */
    private Long completedOn;

    /**
     * <p>
     * The ID of the statement.
     * </p>
     * 
     * @param id
     *        The ID of the statement.
     */

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the statement.
     * </p>
     * 
     * @return The ID of the statement.
     */

    public Integer getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the statement.
     * </p>
     * 
     * @param id
     *        The ID of the statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withId(Integer id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The execution code of the statement.
     * </p>
     * 
     * @param code
     *        The execution code of the statement.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The execution code of the statement.
     * </p>
     * 
     * @return The execution code of the statement.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The execution code of the statement.
     * </p>
     * 
     * @param code
     *        The execution code of the statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The state while request is actioned.
     * </p>
     * 
     * @param state
     *        The state while request is actioned.
     * @see StatementState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state while request is actioned.
     * </p>
     * 
     * @return The state while request is actioned.
     * @see StatementState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state while request is actioned.
     * </p>
     * 
     * @param state
     *        The state while request is actioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatementState
     */

    public Statement withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state while request is actioned.
     * </p>
     * 
     * @param state
     *        The state while request is actioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatementState
     */

    public Statement withState(StatementState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The output in JSON.
     * </p>
     * 
     * @param output
     *        The output in JSON.
     */

    public void setOutput(StatementOutput output) {
        this.output = output;
    }

    /**
     * <p>
     * The output in JSON.
     * </p>
     * 
     * @return The output in JSON.
     */

    public StatementOutput getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The output in JSON.
     * </p>
     * 
     * @param output
     *        The output in JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withOutput(StatementOutput output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * The code execution progress.
     * </p>
     * 
     * @param progress
     *        The code execution progress.
     */

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The code execution progress.
     * </p>
     * 
     * @return The code execution progress.
     */

    public Double getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * The code execution progress.
     * </p>
     * 
     * @param progress
     *        The code execution progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withProgress(Double progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * The unix time and date that the job definition was started.
     * </p>
     * 
     * @param startedOn
     *        The unix time and date that the job definition was started.
     */

    public void setStartedOn(Long startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * The unix time and date that the job definition was started.
     * </p>
     * 
     * @return The unix time and date that the job definition was started.
     */

    public Long getStartedOn() {
        return this.startedOn;
    }

    /**
     * <p>
     * The unix time and date that the job definition was started.
     * </p>
     * 
     * @param startedOn
     *        The unix time and date that the job definition was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withStartedOn(Long startedOn) {
        setStartedOn(startedOn);
        return this;
    }

    /**
     * <p>
     * The unix time and date that the job definition was completed.
     * </p>
     * 
     * @param completedOn
     *        The unix time and date that the job definition was completed.
     */

    public void setCompletedOn(Long completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * The unix time and date that the job definition was completed.
     * </p>
     * 
     * @return The unix time and date that the job definition was completed.
     */

    public Long getCompletedOn() {
        return this.completedOn;
    }

    /**
     * <p>
     * The unix time and date that the job definition was completed.
     * </p>
     * 
     * @param completedOn
     *        The unix time and date that the job definition was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withCompletedOn(Long completedOn) {
        setCompletedOn(completedOn);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress()).append(",");
        if (getStartedOn() != null)
            sb.append("StartedOn: ").append(getStartedOn()).append(",");
        if (getCompletedOn() != null)
            sb.append("CompletedOn: ").append(getCompletedOn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Statement == false)
            return false;
        Statement other = (Statement) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        hashCode = prime * hashCode + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        return hashCode;
    }

    @Override
    public Statement clone() {
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.StatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
