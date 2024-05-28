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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The period in which a remote Spark runtime environment is running.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Session" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Session implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the session.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The time and date when the session was created.
     * </p>
     */
    private java.util.Date createdOn;
    /**
     * <p>
     * The session status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The error message displayed during the session.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The description of the session.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role associated with the Session.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The command object.See SessionCommand.
     * </p>
     */
    private SessionCommand command;
    /**
     * <p>
     * A map array of key-value pairs. Max is 75 pairs.
     * </p>
     */
    private java.util.Map<String, String> defaultArguments;
    /**
     * <p>
     * The number of connections used for the session.
     * </p>
     */
    private ConnectionsList connections;
    /**
     * <p>
     * The code execution progress of the session.
     * </p>
     */
    private Double progress;
    /**
     * <p>
     * The number of Glue data processing units (DPUs) that can be allocated when the job runs. A DPU is a relative
     * measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB memory.
     * </p>
     */
    private Double maxCapacity;
    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with the session.
     * </p>
     */
    private String securityConfiguration;
    /**
     * <p>
     * The Glue version determines the versions of Apache Spark and Python that Glue supports. The GlueVersion must be
     * greater than 2.0.
     * </p>
     */
    private String glueVersion;
    /**
     * <p>
     * The number of workers of a defined <code>WorkerType</code> to use for the session.
     * </p>
     */
    private Integer numberOfWorkers;
    /**
     * <p>
     * The type of predefined worker that is allocated when a session runs. Accepts a value of <code>G.1X</code>,
     * <code>G.2X</code>, <code>G.4X</code>, or <code>G.8X</code> for Spark sessions. Accepts the value
     * <code>Z.2X</code> for Ray sessions.
     * </p>
     */
    private String workerType;
    /**
     * <p>
     * The date and time that this session is completed.
     * </p>
     */
    private java.util.Date completedOn;
    /**
     * <p>
     * The total time the session ran for.
     * </p>
     */
    private Double executionTime;
    /**
     * <p>
     * The DPUs consumed by the session (formula: ExecutionTime * MaxCapacity).
     * </p>
     */
    private Double dPUSeconds;
    /**
     * <p>
     * The number of minutes when idle before the session times out.
     * </p>
     */
    private Integer idleTimeout;

    /**
     * <p>
     * The ID of the session.
     * </p>
     * 
     * @param id
     *        The ID of the session.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the session.
     * </p>
     * 
     * @return The ID of the session.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the session.
     * </p>
     * 
     * @param id
     *        The ID of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The time and date when the session was created.
     * </p>
     * 
     * @param createdOn
     *        The time and date when the session was created.
     */

    public void setCreatedOn(java.util.Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * <p>
     * The time and date when the session was created.
     * </p>
     * 
     * @return The time and date when the session was created.
     */

    public java.util.Date getCreatedOn() {
        return this.createdOn;
    }

    /**
     * <p>
     * The time and date when the session was created.
     * </p>
     * 
     * @param createdOn
     *        The time and date when the session was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withCreatedOn(java.util.Date createdOn) {
        setCreatedOn(createdOn);
        return this;
    }

    /**
     * <p>
     * The session status.
     * </p>
     * 
     * @param status
     *        The session status.
     * @see SessionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The session status.
     * </p>
     * 
     * @return The session status.
     * @see SessionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The session status.
     * </p>
     * 
     * @param status
     *        The session status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionStatus
     */

    public Session withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The session status.
     * </p>
     * 
     * @param status
     *        The session status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionStatus
     */

    public Session withStatus(SessionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The error message displayed during the session.
     * </p>
     * 
     * @param errorMessage
     *        The error message displayed during the session.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message displayed during the session.
     * </p>
     * 
     * @return The error message displayed during the session.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message displayed during the session.
     * </p>
     * 
     * @param errorMessage
     *        The error message displayed during the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The description of the session.
     * </p>
     * 
     * @param description
     *        The description of the session.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the session.
     * </p>
     * 
     * @return The description of the session.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the session.
     * </p>
     * 
     * @param description
     *        The description of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role associated with the Session.
     * </p>
     * 
     * @param role
     *        The name or Amazon Resource Name (ARN) of the IAM role associated with the Session.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role associated with the Session.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the IAM role associated with the Session.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the IAM role associated with the Session.
     * </p>
     * 
     * @param role
     *        The name or Amazon Resource Name (ARN) of the IAM role associated with the Session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The command object.See SessionCommand.
     * </p>
     * 
     * @param command
     *        The command object.See SessionCommand.
     */

    public void setCommand(SessionCommand command) {
        this.command = command;
    }

    /**
     * <p>
     * The command object.See SessionCommand.
     * </p>
     * 
     * @return The command object.See SessionCommand.
     */

    public SessionCommand getCommand() {
        return this.command;
    }

    /**
     * <p>
     * The command object.See SessionCommand.
     * </p>
     * 
     * @param command
     *        The command object.See SessionCommand.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withCommand(SessionCommand command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * A map array of key-value pairs. Max is 75 pairs.
     * </p>
     * 
     * @return A map array of key-value pairs. Max is 75 pairs.
     */

    public java.util.Map<String, String> getDefaultArguments() {
        return defaultArguments;
    }

    /**
     * <p>
     * A map array of key-value pairs. Max is 75 pairs.
     * </p>
     * 
     * @param defaultArguments
     *        A map array of key-value pairs. Max is 75 pairs.
     */

    public void setDefaultArguments(java.util.Map<String, String> defaultArguments) {
        this.defaultArguments = defaultArguments;
    }

    /**
     * <p>
     * A map array of key-value pairs. Max is 75 pairs.
     * </p>
     * 
     * @param defaultArguments
     *        A map array of key-value pairs. Max is 75 pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withDefaultArguments(java.util.Map<String, String> defaultArguments) {
        setDefaultArguments(defaultArguments);
        return this;
    }

    /**
     * Add a single DefaultArguments entry
     *
     * @see Session#withDefaultArguments
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Session addDefaultArgumentsEntry(String key, String value) {
        if (null == this.defaultArguments) {
            this.defaultArguments = new java.util.HashMap<String, String>();
        }
        if (this.defaultArguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.defaultArguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DefaultArguments.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session clearDefaultArgumentsEntries() {
        this.defaultArguments = null;
        return this;
    }

    /**
     * <p>
     * The number of connections used for the session.
     * </p>
     * 
     * @param connections
     *        The number of connections used for the session.
     */

    public void setConnections(ConnectionsList connections) {
        this.connections = connections;
    }

    /**
     * <p>
     * The number of connections used for the session.
     * </p>
     * 
     * @return The number of connections used for the session.
     */

    public ConnectionsList getConnections() {
        return this.connections;
    }

    /**
     * <p>
     * The number of connections used for the session.
     * </p>
     * 
     * @param connections
     *        The number of connections used for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withConnections(ConnectionsList connections) {
        setConnections(connections);
        return this;
    }

    /**
     * <p>
     * The code execution progress of the session.
     * </p>
     * 
     * @param progress
     *        The code execution progress of the session.
     */

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The code execution progress of the session.
     * </p>
     * 
     * @return The code execution progress of the session.
     */

    public Double getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * The code execution progress of the session.
     * </p>
     * 
     * @param progress
     *        The code execution progress of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withProgress(Double progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * The number of Glue data processing units (DPUs) that can be allocated when the job runs. A DPU is a relative
     * measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB memory.
     * </p>
     * 
     * @param maxCapacity
     *        The number of Glue data processing units (DPUs) that can be allocated when the job runs. A DPU is a
     *        relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB memory.
     */

    public void setMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The number of Glue data processing units (DPUs) that can be allocated when the job runs. A DPU is a relative
     * measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB memory.
     * </p>
     * 
     * @return The number of Glue data processing units (DPUs) that can be allocated when the job runs. A DPU is a
     *         relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB memory.
     */

    public Double getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The number of Glue data processing units (DPUs) that can be allocated when the job runs. A DPU is a relative
     * measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB memory.
     * </p>
     * 
     * @param maxCapacity
     *        The number of Glue data processing units (DPUs) that can be allocated when the job runs. A DPU is a
     *        relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB memory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withMaxCapacity(Double maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with the session.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the SecurityConfiguration structure to be used with the session.
     */

    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with the session.
     * </p>
     * 
     * @return The name of the SecurityConfiguration structure to be used with the session.
     */

    public String getSecurityConfiguration() {
        return this.securityConfiguration;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with the session.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the SecurityConfiguration structure to be used with the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withSecurityConfiguration(String securityConfiguration) {
        setSecurityConfiguration(securityConfiguration);
        return this;
    }

    /**
     * <p>
     * The Glue version determines the versions of Apache Spark and Python that Glue supports. The GlueVersion must be
     * greater than 2.0.
     * </p>
     * 
     * @param glueVersion
     *        The Glue version determines the versions of Apache Spark and Python that Glue supports. The GlueVersion
     *        must be greater than 2.0.
     */

    public void setGlueVersion(String glueVersion) {
        this.glueVersion = glueVersion;
    }

    /**
     * <p>
     * The Glue version determines the versions of Apache Spark and Python that Glue supports. The GlueVersion must be
     * greater than 2.0.
     * </p>
     * 
     * @return The Glue version determines the versions of Apache Spark and Python that Glue supports. The GlueVersion
     *         must be greater than 2.0.
     */

    public String getGlueVersion() {
        return this.glueVersion;
    }

    /**
     * <p>
     * The Glue version determines the versions of Apache Spark and Python that Glue supports. The GlueVersion must be
     * greater than 2.0.
     * </p>
     * 
     * @param glueVersion
     *        The Glue version determines the versions of Apache Spark and Python that Glue supports. The GlueVersion
     *        must be greater than 2.0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withGlueVersion(String glueVersion) {
        setGlueVersion(glueVersion);
        return this;
    }

    /**
     * <p>
     * The number of workers of a defined <code>WorkerType</code> to use for the session.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>WorkerType</code> to use for the session.
     */

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>WorkerType</code> to use for the session.
     * </p>
     * 
     * @return The number of workers of a defined <code>WorkerType</code> to use for the session.
     */

    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * <p>
     * The number of workers of a defined <code>WorkerType</code> to use for the session.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of workers of a defined <code>WorkerType</code> to use for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withNumberOfWorkers(Integer numberOfWorkers) {
        setNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a session runs. Accepts a value of <code>G.1X</code>,
     * <code>G.2X</code>, <code>G.4X</code>, or <code>G.8X</code> for Spark sessions. Accepts the value
     * <code>Z.2X</code> for Ray sessions.
     * </p>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated when a session runs. Accepts a value of <code>G.1X</code>,
     *        <code>G.2X</code>, <code>G.4X</code>, or <code>G.8X</code> for Spark sessions. Accepts the value
     *        <code>Z.2X</code> for Ray sessions.
     * @see WorkerType
     */

    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a session runs. Accepts a value of <code>G.1X</code>,
     * <code>G.2X</code>, <code>G.4X</code>, or <code>G.8X</code> for Spark sessions. Accepts the value
     * <code>Z.2X</code> for Ray sessions.
     * </p>
     * 
     * @return The type of predefined worker that is allocated when a session runs. Accepts a value of <code>G.1X</code>
     *         , <code>G.2X</code>, <code>G.4X</code>, or <code>G.8X</code> for Spark sessions. Accepts the value
     *         <code>Z.2X</code> for Ray sessions.
     * @see WorkerType
     */

    public String getWorkerType() {
        return this.workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a session runs. Accepts a value of <code>G.1X</code>,
     * <code>G.2X</code>, <code>G.4X</code>, or <code>G.8X</code> for Spark sessions. Accepts the value
     * <code>Z.2X</code> for Ray sessions.
     * </p>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated when a session runs. Accepts a value of <code>G.1X</code>,
     *        <code>G.2X</code>, <code>G.4X</code>, or <code>G.8X</code> for Spark sessions. Accepts the value
     *        <code>Z.2X</code> for Ray sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public Session withWorkerType(String workerType) {
        setWorkerType(workerType);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated when a session runs. Accepts a value of <code>G.1X</code>,
     * <code>G.2X</code>, <code>G.4X</code>, or <code>G.8X</code> for Spark sessions. Accepts the value
     * <code>Z.2X</code> for Ray sessions.
     * </p>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated when a session runs. Accepts a value of <code>G.1X</code>,
     *        <code>G.2X</code>, <code>G.4X</code>, or <code>G.8X</code> for Spark sessions. Accepts the value
     *        <code>Z.2X</code> for Ray sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public Session withWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that this session is completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time that this session is completed.
     */

    public void setCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * The date and time that this session is completed.
     * </p>
     * 
     * @return The date and time that this session is completed.
     */

    public java.util.Date getCompletedOn() {
        return this.completedOn;
    }

    /**
     * <p>
     * The date and time that this session is completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time that this session is completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withCompletedOn(java.util.Date completedOn) {
        setCompletedOn(completedOn);
        return this;
    }

    /**
     * <p>
     * The total time the session ran for.
     * </p>
     * 
     * @param executionTime
     *        The total time the session ran for.
     */

    public void setExecutionTime(Double executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * <p>
     * The total time the session ran for.
     * </p>
     * 
     * @return The total time the session ran for.
     */

    public Double getExecutionTime() {
        return this.executionTime;
    }

    /**
     * <p>
     * The total time the session ran for.
     * </p>
     * 
     * @param executionTime
     *        The total time the session ran for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withExecutionTime(Double executionTime) {
        setExecutionTime(executionTime);
        return this;
    }

    /**
     * <p>
     * The DPUs consumed by the session (formula: ExecutionTime * MaxCapacity).
     * </p>
     * 
     * @param dPUSeconds
     *        The DPUs consumed by the session (formula: ExecutionTime * MaxCapacity).
     */

    public void setDPUSeconds(Double dPUSeconds) {
        this.dPUSeconds = dPUSeconds;
    }

    /**
     * <p>
     * The DPUs consumed by the session (formula: ExecutionTime * MaxCapacity).
     * </p>
     * 
     * @return The DPUs consumed by the session (formula: ExecutionTime * MaxCapacity).
     */

    public Double getDPUSeconds() {
        return this.dPUSeconds;
    }

    /**
     * <p>
     * The DPUs consumed by the session (formula: ExecutionTime * MaxCapacity).
     * </p>
     * 
     * @param dPUSeconds
     *        The DPUs consumed by the session (formula: ExecutionTime * MaxCapacity).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withDPUSeconds(Double dPUSeconds) {
        setDPUSeconds(dPUSeconds);
        return this;
    }

    /**
     * <p>
     * The number of minutes when idle before the session times out.
     * </p>
     * 
     * @param idleTimeout
     *        The number of minutes when idle before the session times out.
     */

    public void setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    /**
     * <p>
     * The number of minutes when idle before the session times out.
     * </p>
     * 
     * @return The number of minutes when idle before the session times out.
     */

    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * <p>
     * The number of minutes when idle before the session times out.
     * </p>
     * 
     * @param idleTimeout
     *        The number of minutes when idle before the session times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Session withIdleTimeout(Integer idleTimeout) {
        setIdleTimeout(idleTimeout);
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
        if (getCreatedOn() != null)
            sb.append("CreatedOn: ").append(getCreatedOn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getDefaultArguments() != null)
            sb.append("DefaultArguments: ").append(getDefaultArguments()).append(",");
        if (getConnections() != null)
            sb.append("Connections: ").append(getConnections()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity()).append(",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: ").append(getSecurityConfiguration()).append(",");
        if (getGlueVersion() != null)
            sb.append("GlueVersion: ").append(getGlueVersion()).append(",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: ").append(getNumberOfWorkers()).append(",");
        if (getWorkerType() != null)
            sb.append("WorkerType: ").append(getWorkerType()).append(",");
        if (getCompletedOn() != null)
            sb.append("CompletedOn: ").append(getCompletedOn()).append(",");
        if (getExecutionTime() != null)
            sb.append("ExecutionTime: ").append(getExecutionTime()).append(",");
        if (getDPUSeconds() != null)
            sb.append("DPUSeconds: ").append(getDPUSeconds()).append(",");
        if (getIdleTimeout() != null)
            sb.append("IdleTimeout: ").append(getIdleTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Session == false)
            return false;
        Session other = (Session) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCreatedOn() == null ^ this.getCreatedOn() == null)
            return false;
        if (other.getCreatedOn() != null && other.getCreatedOn().equals(this.getCreatedOn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getDefaultArguments() == null ^ this.getDefaultArguments() == null)
            return false;
        if (other.getDefaultArguments() != null && other.getDefaultArguments().equals(this.getDefaultArguments()) == false)
            return false;
        if (other.getConnections() == null ^ this.getConnections() == null)
            return false;
        if (other.getConnections() != null && other.getConnections().equals(this.getConnections()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        if (other.getGlueVersion() == null ^ this.getGlueVersion() == null)
            return false;
        if (other.getGlueVersion() != null && other.getGlueVersion().equals(this.getGlueVersion()) == false)
            return false;
        if (other.getNumberOfWorkers() == null ^ this.getNumberOfWorkers() == null)
            return false;
        if (other.getNumberOfWorkers() != null && other.getNumberOfWorkers().equals(this.getNumberOfWorkers()) == false)
            return false;
        if (other.getWorkerType() == null ^ this.getWorkerType() == null)
            return false;
        if (other.getWorkerType() != null && other.getWorkerType().equals(this.getWorkerType()) == false)
            return false;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        if (other.getExecutionTime() == null ^ this.getExecutionTime() == null)
            return false;
        if (other.getExecutionTime() != null && other.getExecutionTime().equals(this.getExecutionTime()) == false)
            return false;
        if (other.getDPUSeconds() == null ^ this.getDPUSeconds() == null)
            return false;
        if (other.getDPUSeconds() != null && other.getDPUSeconds().equals(this.getDPUSeconds()) == false)
            return false;
        if (other.getIdleTimeout() == null ^ this.getIdleTimeout() == null)
            return false;
        if (other.getIdleTimeout() != null && other.getIdleTimeout().equals(this.getIdleTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCreatedOn() == null) ? 0 : getCreatedOn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getDefaultArguments() == null) ? 0 : getDefaultArguments().hashCode());
        hashCode = prime * hashCode + ((getConnections() == null) ? 0 : getConnections().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getGlueVersion() == null) ? 0 : getGlueVersion().hashCode());
        hashCode = prime * hashCode + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        hashCode = prime * hashCode + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        hashCode = prime * hashCode + ((getDPUSeconds() == null) ? 0 : getDPUSeconds().hashCode());
        hashCode = prime * hashCode + ((getIdleTimeout() == null) ? 0 : getIdleTimeout().hashCode());
        return hashCode;
    }

    @Override
    public Session clone() {
        try {
            return (Session) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
