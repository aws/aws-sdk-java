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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains summary information about an executor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ExecutorsSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutorsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The UUID of the executor.
     * </p>
     */
    private String executorId;
    /**
     * <p>
     * The type of executor used for the application (<code>COORDINATOR</code>, <code>GATEWAY</code>, or
     * <code>WORKER</code>).
     * </p>
     */
    private String executorType;
    /**
     * <p>
     * The date and time that the executor started.
     * </p>
     */
    private Long startDateTime;
    /**
     * <p>
     * The date and time that the executor was terminated.
     * </p>
     */
    private Long terminationDateTime;
    /**
     * <p>
     * The processing state of the executor. A description of each state follows.
     * </p>
     * <p>
     * <code>CREATING</code> - The executor is being started, including acquiring resources.
     * </p>
     * <p>
     * <code>CREATED</code> - The executor has been started.
     * </p>
     * <p>
     * <code>REGISTERED</code> - The executor has been registered.
     * </p>
     * <p>
     * <code>TERMINATING</code> - The executor is in the process of shutting down.
     * </p>
     * <p>
     * <code>TERMINATED</code> - The executor is no longer running.
     * </p>
     * <p>
     * <code>FAILED</code> - Due to a failure, the executor is no longer running.
     * </p>
     */
    private String executorState;
    /**
     * <p>
     * The smallest unit of compute that a session can request from Athena. Size is measured in data processing unit
     * (DPU) values, a relative measure of processing power.
     * </p>
     */
    private Long executorSize;

    /**
     * <p>
     * The UUID of the executor.
     * </p>
     * 
     * @param executorId
     *        The UUID of the executor.
     */

    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    /**
     * <p>
     * The UUID of the executor.
     * </p>
     * 
     * @return The UUID of the executor.
     */

    public String getExecutorId() {
        return this.executorId;
    }

    /**
     * <p>
     * The UUID of the executor.
     * </p>
     * 
     * @param executorId
     *        The UUID of the executor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutorsSummary withExecutorId(String executorId) {
        setExecutorId(executorId);
        return this;
    }

    /**
     * <p>
     * The type of executor used for the application (<code>COORDINATOR</code>, <code>GATEWAY</code>, or
     * <code>WORKER</code>).
     * </p>
     * 
     * @param executorType
     *        The type of executor used for the application (<code>COORDINATOR</code>, <code>GATEWAY</code>, or
     *        <code>WORKER</code>).
     * @see ExecutorType
     */

    public void setExecutorType(String executorType) {
        this.executorType = executorType;
    }

    /**
     * <p>
     * The type of executor used for the application (<code>COORDINATOR</code>, <code>GATEWAY</code>, or
     * <code>WORKER</code>).
     * </p>
     * 
     * @return The type of executor used for the application (<code>COORDINATOR</code>, <code>GATEWAY</code>, or
     *         <code>WORKER</code>).
     * @see ExecutorType
     */

    public String getExecutorType() {
        return this.executorType;
    }

    /**
     * <p>
     * The type of executor used for the application (<code>COORDINATOR</code>, <code>GATEWAY</code>, or
     * <code>WORKER</code>).
     * </p>
     * 
     * @param executorType
     *        The type of executor used for the application (<code>COORDINATOR</code>, <code>GATEWAY</code>, or
     *        <code>WORKER</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutorType
     */

    public ExecutorsSummary withExecutorType(String executorType) {
        setExecutorType(executorType);
        return this;
    }

    /**
     * <p>
     * The type of executor used for the application (<code>COORDINATOR</code>, <code>GATEWAY</code>, or
     * <code>WORKER</code>).
     * </p>
     * 
     * @param executorType
     *        The type of executor used for the application (<code>COORDINATOR</code>, <code>GATEWAY</code>, or
     *        <code>WORKER</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutorType
     */

    public ExecutorsSummary withExecutorType(ExecutorType executorType) {
        this.executorType = executorType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the executor started.
     * </p>
     * 
     * @param startDateTime
     *        The date and time that the executor started.
     */

    public void setStartDateTime(Long startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * The date and time that the executor started.
     * </p>
     * 
     * @return The date and time that the executor started.
     */

    public Long getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * The date and time that the executor started.
     * </p>
     * 
     * @param startDateTime
     *        The date and time that the executor started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutorsSummary withStartDateTime(Long startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the executor was terminated.
     * </p>
     * 
     * @param terminationDateTime
     *        The date and time that the executor was terminated.
     */

    public void setTerminationDateTime(Long terminationDateTime) {
        this.terminationDateTime = terminationDateTime;
    }

    /**
     * <p>
     * The date and time that the executor was terminated.
     * </p>
     * 
     * @return The date and time that the executor was terminated.
     */

    public Long getTerminationDateTime() {
        return this.terminationDateTime;
    }

    /**
     * <p>
     * The date and time that the executor was terminated.
     * </p>
     * 
     * @param terminationDateTime
     *        The date and time that the executor was terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutorsSummary withTerminationDateTime(Long terminationDateTime) {
        setTerminationDateTime(terminationDateTime);
        return this;
    }

    /**
     * <p>
     * The processing state of the executor. A description of each state follows.
     * </p>
     * <p>
     * <code>CREATING</code> - The executor is being started, including acquiring resources.
     * </p>
     * <p>
     * <code>CREATED</code> - The executor has been started.
     * </p>
     * <p>
     * <code>REGISTERED</code> - The executor has been registered.
     * </p>
     * <p>
     * <code>TERMINATING</code> - The executor is in the process of shutting down.
     * </p>
     * <p>
     * <code>TERMINATED</code> - The executor is no longer running.
     * </p>
     * <p>
     * <code>FAILED</code> - Due to a failure, the executor is no longer running.
     * </p>
     * 
     * @param executorState
     *        The processing state of the executor. A description of each state follows.</p>
     *        <p>
     *        <code>CREATING</code> - The executor is being started, including acquiring resources.
     *        </p>
     *        <p>
     *        <code>CREATED</code> - The executor has been started.
     *        </p>
     *        <p>
     *        <code>REGISTERED</code> - The executor has been registered.
     *        </p>
     *        <p>
     *        <code>TERMINATING</code> - The executor is in the process of shutting down.
     *        </p>
     *        <p>
     *        <code>TERMINATED</code> - The executor is no longer running.
     *        </p>
     *        <p>
     *        <code>FAILED</code> - Due to a failure, the executor is no longer running.
     * @see ExecutorState
     */

    public void setExecutorState(String executorState) {
        this.executorState = executorState;
    }

    /**
     * <p>
     * The processing state of the executor. A description of each state follows.
     * </p>
     * <p>
     * <code>CREATING</code> - The executor is being started, including acquiring resources.
     * </p>
     * <p>
     * <code>CREATED</code> - The executor has been started.
     * </p>
     * <p>
     * <code>REGISTERED</code> - The executor has been registered.
     * </p>
     * <p>
     * <code>TERMINATING</code> - The executor is in the process of shutting down.
     * </p>
     * <p>
     * <code>TERMINATED</code> - The executor is no longer running.
     * </p>
     * <p>
     * <code>FAILED</code> - Due to a failure, the executor is no longer running.
     * </p>
     * 
     * @return The processing state of the executor. A description of each state follows.</p>
     *         <p>
     *         <code>CREATING</code> - The executor is being started, including acquiring resources.
     *         </p>
     *         <p>
     *         <code>CREATED</code> - The executor has been started.
     *         </p>
     *         <p>
     *         <code>REGISTERED</code> - The executor has been registered.
     *         </p>
     *         <p>
     *         <code>TERMINATING</code> - The executor is in the process of shutting down.
     *         </p>
     *         <p>
     *         <code>TERMINATED</code> - The executor is no longer running.
     *         </p>
     *         <p>
     *         <code>FAILED</code> - Due to a failure, the executor is no longer running.
     * @see ExecutorState
     */

    public String getExecutorState() {
        return this.executorState;
    }

    /**
     * <p>
     * The processing state of the executor. A description of each state follows.
     * </p>
     * <p>
     * <code>CREATING</code> - The executor is being started, including acquiring resources.
     * </p>
     * <p>
     * <code>CREATED</code> - The executor has been started.
     * </p>
     * <p>
     * <code>REGISTERED</code> - The executor has been registered.
     * </p>
     * <p>
     * <code>TERMINATING</code> - The executor is in the process of shutting down.
     * </p>
     * <p>
     * <code>TERMINATED</code> - The executor is no longer running.
     * </p>
     * <p>
     * <code>FAILED</code> - Due to a failure, the executor is no longer running.
     * </p>
     * 
     * @param executorState
     *        The processing state of the executor. A description of each state follows.</p>
     *        <p>
     *        <code>CREATING</code> - The executor is being started, including acquiring resources.
     *        </p>
     *        <p>
     *        <code>CREATED</code> - The executor has been started.
     *        </p>
     *        <p>
     *        <code>REGISTERED</code> - The executor has been registered.
     *        </p>
     *        <p>
     *        <code>TERMINATING</code> - The executor is in the process of shutting down.
     *        </p>
     *        <p>
     *        <code>TERMINATED</code> - The executor is no longer running.
     *        </p>
     *        <p>
     *        <code>FAILED</code> - Due to a failure, the executor is no longer running.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutorState
     */

    public ExecutorsSummary withExecutorState(String executorState) {
        setExecutorState(executorState);
        return this;
    }

    /**
     * <p>
     * The processing state of the executor. A description of each state follows.
     * </p>
     * <p>
     * <code>CREATING</code> - The executor is being started, including acquiring resources.
     * </p>
     * <p>
     * <code>CREATED</code> - The executor has been started.
     * </p>
     * <p>
     * <code>REGISTERED</code> - The executor has been registered.
     * </p>
     * <p>
     * <code>TERMINATING</code> - The executor is in the process of shutting down.
     * </p>
     * <p>
     * <code>TERMINATED</code> - The executor is no longer running.
     * </p>
     * <p>
     * <code>FAILED</code> - Due to a failure, the executor is no longer running.
     * </p>
     * 
     * @param executorState
     *        The processing state of the executor. A description of each state follows.</p>
     *        <p>
     *        <code>CREATING</code> - The executor is being started, including acquiring resources.
     *        </p>
     *        <p>
     *        <code>CREATED</code> - The executor has been started.
     *        </p>
     *        <p>
     *        <code>REGISTERED</code> - The executor has been registered.
     *        </p>
     *        <p>
     *        <code>TERMINATING</code> - The executor is in the process of shutting down.
     *        </p>
     *        <p>
     *        <code>TERMINATED</code> - The executor is no longer running.
     *        </p>
     *        <p>
     *        <code>FAILED</code> - Due to a failure, the executor is no longer running.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutorState
     */

    public ExecutorsSummary withExecutorState(ExecutorState executorState) {
        this.executorState = executorState.toString();
        return this;
    }

    /**
     * <p>
     * The smallest unit of compute that a session can request from Athena. Size is measured in data processing unit
     * (DPU) values, a relative measure of processing power.
     * </p>
     * 
     * @param executorSize
     *        The smallest unit of compute that a session can request from Athena. Size is measured in data processing
     *        unit (DPU) values, a relative measure of processing power.
     */

    public void setExecutorSize(Long executorSize) {
        this.executorSize = executorSize;
    }

    /**
     * <p>
     * The smallest unit of compute that a session can request from Athena. Size is measured in data processing unit
     * (DPU) values, a relative measure of processing power.
     * </p>
     * 
     * @return The smallest unit of compute that a session can request from Athena. Size is measured in data processing
     *         unit (DPU) values, a relative measure of processing power.
     */

    public Long getExecutorSize() {
        return this.executorSize;
    }

    /**
     * <p>
     * The smallest unit of compute that a session can request from Athena. Size is measured in data processing unit
     * (DPU) values, a relative measure of processing power.
     * </p>
     * 
     * @param executorSize
     *        The smallest unit of compute that a session can request from Athena. Size is measured in data processing
     *        unit (DPU) values, a relative measure of processing power.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutorsSummary withExecutorSize(Long executorSize) {
        setExecutorSize(executorSize);
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
        if (getExecutorId() != null)
            sb.append("ExecutorId: ").append(getExecutorId()).append(",");
        if (getExecutorType() != null)
            sb.append("ExecutorType: ").append(getExecutorType()).append(",");
        if (getStartDateTime() != null)
            sb.append("StartDateTime: ").append(getStartDateTime()).append(",");
        if (getTerminationDateTime() != null)
            sb.append("TerminationDateTime: ").append(getTerminationDateTime()).append(",");
        if (getExecutorState() != null)
            sb.append("ExecutorState: ").append(getExecutorState()).append(",");
        if (getExecutorSize() != null)
            sb.append("ExecutorSize: ").append(getExecutorSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutorsSummary == false)
            return false;
        ExecutorsSummary other = (ExecutorsSummary) obj;
        if (other.getExecutorId() == null ^ this.getExecutorId() == null)
            return false;
        if (other.getExecutorId() != null && other.getExecutorId().equals(this.getExecutorId()) == false)
            return false;
        if (other.getExecutorType() == null ^ this.getExecutorType() == null)
            return false;
        if (other.getExecutorType() != null && other.getExecutorType().equals(this.getExecutorType()) == false)
            return false;
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null)
            return false;
        if (other.getStartDateTime() != null && other.getStartDateTime().equals(this.getStartDateTime()) == false)
            return false;
        if (other.getTerminationDateTime() == null ^ this.getTerminationDateTime() == null)
            return false;
        if (other.getTerminationDateTime() != null && other.getTerminationDateTime().equals(this.getTerminationDateTime()) == false)
            return false;
        if (other.getExecutorState() == null ^ this.getExecutorState() == null)
            return false;
        if (other.getExecutorState() != null && other.getExecutorState().equals(this.getExecutorState()) == false)
            return false;
        if (other.getExecutorSize() == null ^ this.getExecutorSize() == null)
            return false;
        if (other.getExecutorSize() != null && other.getExecutorSize().equals(this.getExecutorSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutorId() == null) ? 0 : getExecutorId().hashCode());
        hashCode = prime * hashCode + ((getExecutorType() == null) ? 0 : getExecutorType().hashCode());
        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getTerminationDateTime() == null) ? 0 : getTerminationDateTime().hashCode());
        hashCode = prime * hashCode + ((getExecutorState() == null) ? 0 : getExecutorState().hashCode());
        hashCode = prime * hashCode + ((getExecutorSize() == null) ? 0 : getExecutorSize().hashCode());
        return hashCode;
    }

    @Override
    public ExecutorsSummary clone() {
        try {
            return (ExecutorsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.ExecutorsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
