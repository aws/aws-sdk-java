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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/DescribeSimulation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSimulationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since the
     * Unix epoch (0:0:0.000, January 1, 1970).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The description of the simulation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A universally unique identifier (UUID) for this simulation.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * A collection of additional state information, such as domain and clock configuration.
     * </p>
     */
    private LiveSimulationState liveSimulationState;
    /**
     * <p>
     * Settings that control how SimSpace Weaver handles your simulation log data.
     * </p>
     */
    private LoggingConfiguration loggingConfiguration;
    /**
     * <p>
     * The maximum running time of the simulation, specified as a number of months (m or M), hours (h or H), or days (d
     * or D). The simulation stops when it reaches this limit.
     * </p>
     */
    private String maximumDuration;
    /**
     * <p>
     * The name of the simulation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation assumes to
     * perform actions. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about IAM roles, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM roles</a> in the <i>Identity and Access
     * Management User Guide</i>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An error message that SimSpace Weaver returns only if there is a problem with the simulation schema.
     * </p>
     */
    private String schemaError;
    /**
     * <p>
     * The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information about
     * Amazon S3, see the <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html"> <i>Amazon Simple
     * Storage Service User Guide</i> </a>.
     * </p>
     */
    private S3Location schemaS3Location;
    /**
     * <p>
     * The current lifecycle state of the simulation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The desired lifecycle state of the simulation.
     * </p>
     */
    private String targetStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the simulation. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSimulationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since the
     * Unix epoch (0:0:0.000, January 1, 1970).
     * </p>
     * 
     * @param creationTime
     *        The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since
     *        the Unix epoch (0:0:0.000, January 1, 1970).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since the
     * Unix epoch (0:0:0.000, January 1, 1970).
     * </p>
     * 
     * @return The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC
     *         since the Unix epoch (0:0:0.000, January 1, 1970).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since the
     * Unix epoch (0:0:0.000, January 1, 1970).
     * </p>
     * 
     * @param creationTime
     *        The time when the simulation was created, expressed as the number of seconds and milliseconds in UTC since
     *        the Unix epoch (0:0:0.000, January 1, 1970).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSimulationResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The description of the simulation.
     * </p>
     * 
     * @param description
     *        The description of the simulation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the simulation.
     * </p>
     * 
     * @return The description of the simulation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the simulation.
     * </p>
     * 
     * @param description
     *        The description of the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSimulationResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) for this simulation.
     * </p>
     * 
     * @param executionId
     *        A universally unique identifier (UUID) for this simulation.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) for this simulation.
     * </p>
     * 
     * @return A universally unique identifier (UUID) for this simulation.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) for this simulation.
     * </p>
     * 
     * @param executionId
     *        A universally unique identifier (UUID) for this simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSimulationResult withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * A collection of additional state information, such as domain and clock configuration.
     * </p>
     * 
     * @param liveSimulationState
     *        A collection of additional state information, such as domain and clock configuration.
     */

    public void setLiveSimulationState(LiveSimulationState liveSimulationState) {
        this.liveSimulationState = liveSimulationState;
    }

    /**
     * <p>
     * A collection of additional state information, such as domain and clock configuration.
     * </p>
     * 
     * @return A collection of additional state information, such as domain and clock configuration.
     */

    public LiveSimulationState getLiveSimulationState() {
        return this.liveSimulationState;
    }

    /**
     * <p>
     * A collection of additional state information, such as domain and clock configuration.
     * </p>
     * 
     * @param liveSimulationState
     *        A collection of additional state information, such as domain and clock configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSimulationResult withLiveSimulationState(LiveSimulationState liveSimulationState) {
        setLiveSimulationState(liveSimulationState);
        return this;
    }

    /**
     * <p>
     * Settings that control how SimSpace Weaver handles your simulation log data.
     * </p>
     * 
     * @param loggingConfiguration
     *        Settings that control how SimSpace Weaver handles your simulation log data.
     */

    public void setLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * <p>
     * Settings that control how SimSpace Weaver handles your simulation log data.
     * </p>
     * 
     * @return Settings that control how SimSpace Weaver handles your simulation log data.
     */

    public LoggingConfiguration getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    /**
     * <p>
     * Settings that control how SimSpace Weaver handles your simulation log data.
     * </p>
     * 
     * @param loggingConfiguration
     *        Settings that control how SimSpace Weaver handles your simulation log data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSimulationResult withLoggingConfiguration(LoggingConfiguration loggingConfiguration) {
        setLoggingConfiguration(loggingConfiguration);
        return this;
    }

    /**
     * <p>
     * The maximum running time of the simulation, specified as a number of months (m or M), hours (h or H), or days (d
     * or D). The simulation stops when it reaches this limit.
     * </p>
     * 
     * @param maximumDuration
     *        The maximum running time of the simulation, specified as a number of months (m or M), hours (h or H), or
     *        days (d or D). The simulation stops when it reaches this limit.
     */

    public void setMaximumDuration(String maximumDuration) {
        this.maximumDuration = maximumDuration;
    }

    /**
     * <p>
     * The maximum running time of the simulation, specified as a number of months (m or M), hours (h or H), or days (d
     * or D). The simulation stops when it reaches this limit.
     * </p>
     * 
     * @return The maximum running time of the simulation, specified as a number of months (m or M), hours (h or H), or
     *         days (d or D). The simulation stops when it reaches this limit.
     */

    public String getMaximumDuration() {
        return this.maximumDuration;
    }

    /**
     * <p>
     * The maximum running time of the simulation, specified as a number of months (m or M), hours (h or H), or days (d
     * or D). The simulation stops when it reaches this limit.
     * </p>
     * 
     * @param maximumDuration
     *        The maximum running time of the simulation, specified as a number of months (m or M), hours (h or H), or
     *        days (d or D). The simulation stops when it reaches this limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSimulationResult withMaximumDuration(String maximumDuration) {
        setMaximumDuration(maximumDuration);
        return this;
    }

    /**
     * <p>
     * The name of the simulation.
     * </p>
     * 
     * @param name
     *        The name of the simulation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the simulation.
     * </p>
     * 
     * @return The name of the simulation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the simulation.
     * </p>
     * 
     * @param name
     *        The name of the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSimulationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation assumes to
     * perform actions. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about IAM roles, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM roles</a> in the <i>Identity and Access
     * Management User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation
     *        assumes to perform actions. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about IAM roles, see
     *        <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM roles</a> in the <i>Identity
     *        and Access Management User Guide</i>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation assumes to
     * perform actions. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about IAM roles, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM roles</a> in the <i>Identity and Access
     * Management User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation
     *         assumes to perform actions. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about IAM roles, see
     *         <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM roles</a> in the <i>Identity
     *         and Access Management User Guide</i>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation assumes to
     * perform actions. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about IAM roles, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM roles</a> in the <i>Identity and Access
     * Management User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that the simulation
     *        assumes to perform actions. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. For more information about IAM roles, see
     *        <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html">IAM roles</a> in the <i>Identity
     *        and Access Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSimulationResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An error message that SimSpace Weaver returns only if there is a problem with the simulation schema.
     * </p>
     * 
     * @param schemaError
     *        An error message that SimSpace Weaver returns only if there is a problem with the simulation schema.
     */

    public void setSchemaError(String schemaError) {
        this.schemaError = schemaError;
    }

    /**
     * <p>
     * An error message that SimSpace Weaver returns only if there is a problem with the simulation schema.
     * </p>
     * 
     * @return An error message that SimSpace Weaver returns only if there is a problem with the simulation schema.
     */

    public String getSchemaError() {
        return this.schemaError;
    }

    /**
     * <p>
     * An error message that SimSpace Weaver returns only if there is a problem with the simulation schema.
     * </p>
     * 
     * @param schemaError
     *        An error message that SimSpace Weaver returns only if there is a problem with the simulation schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSimulationResult withSchemaError(String schemaError) {
        setSchemaError(schemaError);
        return this;
    }

    /**
     * <p>
     * The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information about
     * Amazon S3, see the <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html"> <i>Amazon Simple
     * Storage Service User Guide</i> </a>.
     * </p>
     * 
     * @param schemaS3Location
     *        The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information
     *        about Amazon S3, see the <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html">
     *        <i>Amazon Simple Storage Service User Guide</i> </a>.
     */

    public void setSchemaS3Location(S3Location schemaS3Location) {
        this.schemaS3Location = schemaS3Location;
    }

    /**
     * <p>
     * The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information about
     * Amazon S3, see the <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html"> <i>Amazon Simple
     * Storage Service User Guide</i> </a>.
     * </p>
     * 
     * @return The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information
     *         about Amazon S3, see the <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html">
     *         <i>Amazon Simple Storage Service User Guide</i> </a>.
     */

    public S3Location getSchemaS3Location() {
        return this.schemaS3Location;
    }

    /**
     * <p>
     * The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information about
     * Amazon S3, see the <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html"> <i>Amazon Simple
     * Storage Service User Guide</i> </a>.
     * </p>
     * 
     * @param schemaS3Location
     *        The location of the simulation schema in Amazon Simple Storage Service (Amazon S3). For more information
     *        about Amazon S3, see the <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Welcome.html">
     *        <i>Amazon Simple Storage Service User Guide</i> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSimulationResult withSchemaS3Location(S3Location schemaS3Location) {
        setSchemaS3Location(schemaS3Location);
        return this;
    }

    /**
     * <p>
     * The current lifecycle state of the simulation.
     * </p>
     * 
     * @param status
     *        The current lifecycle state of the simulation.
     * @see SimulationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current lifecycle state of the simulation.
     * </p>
     * 
     * @return The current lifecycle state of the simulation.
     * @see SimulationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current lifecycle state of the simulation.
     * </p>
     * 
     * @param status
     *        The current lifecycle state of the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationStatus
     */

    public DescribeSimulationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current lifecycle state of the simulation.
     * </p>
     * 
     * @param status
     *        The current lifecycle state of the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationStatus
     */

    public DescribeSimulationResult withStatus(SimulationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The desired lifecycle state of the simulation.
     * </p>
     * 
     * @param targetStatus
     *        The desired lifecycle state of the simulation.
     * @see SimulationTargetStatus
     */

    public void setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
    }

    /**
     * <p>
     * The desired lifecycle state of the simulation.
     * </p>
     * 
     * @return The desired lifecycle state of the simulation.
     * @see SimulationTargetStatus
     */

    public String getTargetStatus() {
        return this.targetStatus;
    }

    /**
     * <p>
     * The desired lifecycle state of the simulation.
     * </p>
     * 
     * @param targetStatus
     *        The desired lifecycle state of the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationTargetStatus
     */

    public DescribeSimulationResult withTargetStatus(String targetStatus) {
        setTargetStatus(targetStatus);
        return this;
    }

    /**
     * <p>
     * The desired lifecycle state of the simulation.
     * </p>
     * 
     * @param targetStatus
     *        The desired lifecycle state of the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationTargetStatus
     */

    public DescribeSimulationResult withTargetStatus(SimulationTargetStatus targetStatus) {
        this.targetStatus = targetStatus.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId()).append(",");
        if (getLiveSimulationState() != null)
            sb.append("LiveSimulationState: ").append(getLiveSimulationState()).append(",");
        if (getLoggingConfiguration() != null)
            sb.append("LoggingConfiguration: ").append(getLoggingConfiguration()).append(",");
        if (getMaximumDuration() != null)
            sb.append("MaximumDuration: ").append(getMaximumDuration()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSchemaError() != null)
            sb.append("SchemaError: ").append(getSchemaError()).append(",");
        if (getSchemaS3Location() != null)
            sb.append("SchemaS3Location: ").append(getSchemaS3Location()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTargetStatus() != null)
            sb.append("TargetStatus: ").append(getTargetStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSimulationResult == false)
            return false;
        DescribeSimulationResult other = (DescribeSimulationResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getLiveSimulationState() == null ^ this.getLiveSimulationState() == null)
            return false;
        if (other.getLiveSimulationState() != null && other.getLiveSimulationState().equals(this.getLiveSimulationState()) == false)
            return false;
        if (other.getLoggingConfiguration() == null ^ this.getLoggingConfiguration() == null)
            return false;
        if (other.getLoggingConfiguration() != null && other.getLoggingConfiguration().equals(this.getLoggingConfiguration()) == false)
            return false;
        if (other.getMaximumDuration() == null ^ this.getMaximumDuration() == null)
            return false;
        if (other.getMaximumDuration() != null && other.getMaximumDuration().equals(this.getMaximumDuration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSchemaError() == null ^ this.getSchemaError() == null)
            return false;
        if (other.getSchemaError() != null && other.getSchemaError().equals(this.getSchemaError()) == false)
            return false;
        if (other.getSchemaS3Location() == null ^ this.getSchemaS3Location() == null)
            return false;
        if (other.getSchemaS3Location() != null && other.getSchemaS3Location().equals(this.getSchemaS3Location()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTargetStatus() == null ^ this.getTargetStatus() == null)
            return false;
        if (other.getTargetStatus() != null && other.getTargetStatus().equals(this.getTargetStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getLiveSimulationState() == null) ? 0 : getLiveSimulationState().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfiguration() == null) ? 0 : getLoggingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMaximumDuration() == null) ? 0 : getMaximumDuration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaError() == null) ? 0 : getSchemaError().hashCode());
        hashCode = prime * hashCode + ((getSchemaS3Location() == null) ? 0 : getSchemaS3Location().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetStatus() == null) ? 0 : getTargetStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSimulationResult clone() {
        try {
            return (DescribeSimulationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
