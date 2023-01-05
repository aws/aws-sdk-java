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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to create a new session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the session request.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The description of the session.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The IAM Role ARN
     * </p>
     */
    private String role;
    /**
     * <p>
     * The <code>SessionCommand</code> that runs the job.
     * </p>
     */
    private SessionCommand command;
    /**
     * <p>
     * The number of seconds before request times out.
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * The number of seconds when idle before request times out.
     * </p>
     */
    private Integer idleTimeout;
    /**
     * <p>
     * A map array of key-value pairs. Max is 75 pairs.
     * </p>
     */
    private java.util.Map<String, String> defaultArguments;
    /**
     * <p>
     * The number of connections to use for the session.
     * </p>
     */
    private ConnectionsList connections;
    /**
     * <p>
     * The number of Glue data processing units (DPUs) that can be allocated when the job runs. A DPU is a relative
     * measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB memory.
     * </p>
     */
    private Double maxCapacity;
    /**
     * <p>
     * The number of workers of a defined <code>WorkerType</code> to use for the session.
     * </p>
     */
    private Integer numberOfWorkers;
    /**
     * <p>
     * The type of predefined worker that is allocated to use for the session. Accepts a value of Standard, G.1X, G.2X,
     * or G.025X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPU, 4 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for low volume streaming jobs. This worker type is
     * only available for Glue version 3.0 streaming jobs.
     * </p>
     * </li>
     * </ul>
     */
    private String workerType;
    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with the session
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
     * The map of key value pairs (tags) belonging to the session.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The origin of the request.
     * </p>
     */
    private String requestOrigin;

    /**
     * <p>
     * The ID of the session request.
     * </p>
     * 
     * @param id
     *        The ID of the session request.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the session request.
     * </p>
     * 
     * @return The ID of the session request.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the session request.
     * </p>
     * 
     * @param id
     *        The ID of the session request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSessionRequest withId(String id) {
        setId(id);
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

    public CreateSessionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The IAM Role ARN
     * </p>
     * 
     * @param role
     *        The IAM Role ARN
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The IAM Role ARN
     * </p>
     * 
     * @return The IAM Role ARN
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The IAM Role ARN
     * </p>
     * 
     * @param role
     *        The IAM Role ARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSessionRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The <code>SessionCommand</code> that runs the job.
     * </p>
     * 
     * @param command
     *        The <code>SessionCommand</code> that runs the job.
     */

    public void setCommand(SessionCommand command) {
        this.command = command;
    }

    /**
     * <p>
     * The <code>SessionCommand</code> that runs the job.
     * </p>
     * 
     * @return The <code>SessionCommand</code> that runs the job.
     */

    public SessionCommand getCommand() {
        return this.command;
    }

    /**
     * <p>
     * The <code>SessionCommand</code> that runs the job.
     * </p>
     * 
     * @param command
     *        The <code>SessionCommand</code> that runs the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSessionRequest withCommand(SessionCommand command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The number of seconds before request times out.
     * </p>
     * 
     * @param timeout
     *        The number of seconds before request times out.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The number of seconds before request times out.
     * </p>
     * 
     * @return The number of seconds before request times out.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The number of seconds before request times out.
     * </p>
     * 
     * @param timeout
     *        The number of seconds before request times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSessionRequest withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * The number of seconds when idle before request times out.
     * </p>
     * 
     * @param idleTimeout
     *        The number of seconds when idle before request times out.
     */

    public void setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    /**
     * <p>
     * The number of seconds when idle before request times out.
     * </p>
     * 
     * @return The number of seconds when idle before request times out.
     */

    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * <p>
     * The number of seconds when idle before request times out.
     * </p>
     * 
     * @param idleTimeout
     *        The number of seconds when idle before request times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSessionRequest withIdleTimeout(Integer idleTimeout) {
        setIdleTimeout(idleTimeout);
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

    public CreateSessionRequest withDefaultArguments(java.util.Map<String, String> defaultArguments) {
        setDefaultArguments(defaultArguments);
        return this;
    }

    /**
     * Add a single DefaultArguments entry
     *
     * @see CreateSessionRequest#withDefaultArguments
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSessionRequest addDefaultArgumentsEntry(String key, String value) {
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

    public CreateSessionRequest clearDefaultArgumentsEntries() {
        this.defaultArguments = null;
        return this;
    }

    /**
     * <p>
     * The number of connections to use for the session.
     * </p>
     * 
     * @param connections
     *        The number of connections to use for the session.
     */

    public void setConnections(ConnectionsList connections) {
        this.connections = connections;
    }

    /**
     * <p>
     * The number of connections to use for the session.
     * </p>
     * 
     * @return The number of connections to use for the session.
     */

    public ConnectionsList getConnections() {
        return this.connections;
    }

    /**
     * <p>
     * The number of connections to use for the session.
     * </p>
     * 
     * @param connections
     *        The number of connections to use for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSessionRequest withConnections(ConnectionsList connections) {
        setConnections(connections);
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

    public CreateSessionRequest withMaxCapacity(Double maxCapacity) {
        setMaxCapacity(maxCapacity);
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

    public CreateSessionRequest withNumberOfWorkers(Integer numberOfWorkers) {
        setNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to use for the session. Accepts a value of Standard, G.1X, G.2X,
     * or G.025X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPU, 4 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for low volume streaming jobs. This worker type is
     * only available for Glue version 3.0 streaming jobs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated to use for the session. Accepts a value of Standard, G.1X,
     *        G.2X, or G.025X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPU, 4 GB of memory, 64 GB
     *        disk), and provides 1 executor per worker. We recommend this worker type for low volume streaming jobs.
     *        This worker type is only available for Glue version 3.0 streaming jobs.
     *        </p>
     *        </li>
     * @see WorkerType
     */

    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to use for the session. Accepts a value of Standard, G.1X, G.2X,
     * or G.025X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPU, 4 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for low volume streaming jobs. This worker type is
     * only available for Glue version 3.0 streaming jobs.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of predefined worker that is allocated to use for the session. Accepts a value of Standard,
     *         G.1X, G.2X, or G.025X.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *         and 2 executors per worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk),
     *         and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk),
     *         and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPU, 4 GB of memory, 64 GB
     *         disk), and provides 1 executor per worker. We recommend this worker type for low volume streaming jobs.
     *         This worker type is only available for Glue version 3.0 streaming jobs.
     *         </p>
     *         </li>
     * @see WorkerType
     */

    public String getWorkerType() {
        return this.workerType;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to use for the session. Accepts a value of Standard, G.1X, G.2X,
     * or G.025X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPU, 4 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for low volume streaming jobs. This worker type is
     * only available for Glue version 3.0 streaming jobs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated to use for the session. Accepts a value of Standard, G.1X,
     *        G.2X, or G.025X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPU, 4 GB of memory, 64 GB
     *        disk), and provides 1 executor per worker. We recommend this worker type for low volume streaming jobs.
     *        This worker type is only available for Glue version 3.0 streaming jobs.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public CreateSessionRequest withWorkerType(String workerType) {
        setWorkerType(workerType);
        return this;
    }

    /**
     * <p>
     * The type of predefined worker that is allocated to use for the session. Accepts a value of Standard, G.1X, G.2X,
     * or G.025X.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2
     * executors per worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPU, 4 GB of memory, 64 GB disk), and
     * provides 1 executor per worker. We recommend this worker type for low volume streaming jobs. This worker type is
     * only available for Glue version 3.0 streaming jobs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param workerType
     *        The type of predefined worker that is allocated to use for the session. Accepts a value of Standard, G.1X,
     *        G.2X, or G.025X.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For the <code>Standard</code> worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk,
     *        and 2 executors per worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.1X</code> worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.2X</code> worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk),
     *        and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the <code>G.025X</code> worker type, each worker maps to 0.25 DPU (2 vCPU, 4 GB of memory, 64 GB
     *        disk), and provides 1 executor per worker. We recommend this worker type for low volume streaming jobs.
     *        This worker type is only available for Glue version 3.0 streaming jobs.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkerType
     */

    public CreateSessionRequest withWorkerType(WorkerType workerType) {
        this.workerType = workerType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with the session
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the SecurityConfiguration structure to be used with the session
     */

    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with the session
     * </p>
     * 
     * @return The name of the SecurityConfiguration structure to be used with the session
     */

    public String getSecurityConfiguration() {
        return this.securityConfiguration;
    }

    /**
     * <p>
     * The name of the SecurityConfiguration structure to be used with the session
     * </p>
     * 
     * @param securityConfiguration
     *        The name of the SecurityConfiguration structure to be used with the session
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSessionRequest withSecurityConfiguration(String securityConfiguration) {
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

    public CreateSessionRequest withGlueVersion(String glueVersion) {
        setGlueVersion(glueVersion);
        return this;
    }

    /**
     * <p>
     * The map of key value pairs (tags) belonging to the session.
     * </p>
     * 
     * @return The map of key value pairs (tags) belonging to the session.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The map of key value pairs (tags) belonging to the session.
     * </p>
     * 
     * @param tags
     *        The map of key value pairs (tags) belonging to the session.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The map of key value pairs (tags) belonging to the session.
     * </p>
     * 
     * @param tags
     *        The map of key value pairs (tags) belonging to the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSessionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSessionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSessionRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSessionRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The origin of the request.
     * </p>
     * 
     * @param requestOrigin
     *        The origin of the request.
     */

    public void setRequestOrigin(String requestOrigin) {
        this.requestOrigin = requestOrigin;
    }

    /**
     * <p>
     * The origin of the request.
     * </p>
     * 
     * @return The origin of the request.
     */

    public String getRequestOrigin() {
        return this.requestOrigin;
    }

    /**
     * <p>
     * The origin of the request.
     * </p>
     * 
     * @param requestOrigin
     *        The origin of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSessionRequest withRequestOrigin(String requestOrigin) {
        setRequestOrigin(requestOrigin);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getIdleTimeout() != null)
            sb.append("IdleTimeout: ").append(getIdleTimeout()).append(",");
        if (getDefaultArguments() != null)
            sb.append("DefaultArguments: ").append(getDefaultArguments()).append(",");
        if (getConnections() != null)
            sb.append("Connections: ").append(getConnections()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity()).append(",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: ").append(getNumberOfWorkers()).append(",");
        if (getWorkerType() != null)
            sb.append("WorkerType: ").append(getWorkerType()).append(",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: ").append(getSecurityConfiguration()).append(",");
        if (getGlueVersion() != null)
            sb.append("GlueVersion: ").append(getGlueVersion()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getRequestOrigin() != null)
            sb.append("RequestOrigin: ").append(getRequestOrigin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSessionRequest == false)
            return false;
        CreateSessionRequest other = (CreateSessionRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getIdleTimeout() == null ^ this.getIdleTimeout() == null)
            return false;
        if (other.getIdleTimeout() != null && other.getIdleTimeout().equals(this.getIdleTimeout()) == false)
            return false;
        if (other.getDefaultArguments() == null ^ this.getDefaultArguments() == null)
            return false;
        if (other.getDefaultArguments() != null && other.getDefaultArguments().equals(this.getDefaultArguments()) == false)
            return false;
        if (other.getConnections() == null ^ this.getConnections() == null)
            return false;
        if (other.getConnections() != null && other.getConnections().equals(this.getConnections()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getNumberOfWorkers() == null ^ this.getNumberOfWorkers() == null)
            return false;
        if (other.getNumberOfWorkers() != null && other.getNumberOfWorkers().equals(this.getNumberOfWorkers()) == false)
            return false;
        if (other.getWorkerType() == null ^ this.getWorkerType() == null)
            return false;
        if (other.getWorkerType() != null && other.getWorkerType().equals(this.getWorkerType()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        if (other.getGlueVersion() == null ^ this.getGlueVersion() == null)
            return false;
        if (other.getGlueVersion() != null && other.getGlueVersion().equals(this.getGlueVersion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getRequestOrigin() == null ^ this.getRequestOrigin() == null)
            return false;
        if (other.getRequestOrigin() != null && other.getRequestOrigin().equals(this.getRequestOrigin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getIdleTimeout() == null) ? 0 : getIdleTimeout().hashCode());
        hashCode = prime * hashCode + ((getDefaultArguments() == null) ? 0 : getDefaultArguments().hashCode());
        hashCode = prime * hashCode + ((getConnections() == null) ? 0 : getConnections().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getWorkerType() == null) ? 0 : getWorkerType().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getGlueVersion() == null) ? 0 : getGlueVersion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getRequestOrigin() == null) ? 0 : getRequestOrigin().hashCode());
        return hashCode;
    }

    @Override
    public CreateSessionRequest clone() {
        return (CreateSessionRequest) super.clone();
    }

}
