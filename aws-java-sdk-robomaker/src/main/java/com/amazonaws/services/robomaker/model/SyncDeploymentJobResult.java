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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/SyncDeploymentJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SyncDeploymentJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the synchronization request.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     */
    private String fleet;
    /**
     * <p>
     * The status of the synchronization job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Information about the deployment configuration.
     * </p>
     */
    private DeploymentConfig deploymentConfig;
    /**
     * <p>
     * Information about the deployment application configurations.
     * </p>
     */
    private java.util.List<DeploymentApplicationConfig> deploymentApplicationConfigs;
    /**
     * <p>
     * The failure reason if the job fails.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The failure code if the job fails:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>RobotApplicationCrash</dt>
     * <dd>
     * <p>
     * Robot application exited abnormally.
     * </p>
     * </dd>
     * <dt>SimulationApplicationCrash</dt>
     * <dd>
     * <p>
     * Simulation application exited abnormally.
     * </p>
     * </dd>
     * <dt>BadPermissionsRobotApplication</dt>
     * <dd>
     * <p>
     * Robot application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsS3Output</dt>
     * <dd>
     * <p>
     * Unable to publish outputs to customer-provided S3 bucket.
     * </p>
     * </dd>
     * <dt>BadPermissionsCloudwatchLogs</dt>
     * <dd>
     * <p>
     * Unable to publish logs to customer-provided CloudWatch Logs resource.
     * </p>
     * </dd>
     * <dt>SubnetIpLimitExceeded</dt>
     * <dd>
     * <p>
     * Subnet IP limit exceeded.
     * </p>
     * </dd>
     * <dt>ENILimitExceeded</dt>
     * <dd>
     * <p>
     * ENI limit exceeded.
     * </p>
     * </dd>
     * <dt>BadPermissionsUserCredentials</dt>
     * <dd>
     * <p>
     * Unable to use the Role provided.
     * </p>
     * </dd>
     * <dt>InvalidBundleRobotApplication</dt>
     * <dd>
     * <p>
     * Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>InvalidBundleSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>RobotApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for RobotApplication does not match value during version creation.
     * </p>
     * </dd>
     * <dt>SimulationApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for SimulationApplication does not match value during version creation.
     * </p>
     * </dd>
     * </dl>
     */
    private String failureCode;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the fleet was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the synchronization request.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the synchronization request.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the synchronization request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the synchronization request.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the synchronization request.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the synchronization request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncDeploymentJobResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @param fleet
     *        The Amazon Resource Name (ARN) of the fleet.
     */

    public void setFleet(String fleet) {
        this.fleet = fleet;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the fleet.
     */

    public String getFleet() {
        return this.fleet;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @param fleet
     *        The Amazon Resource Name (ARN) of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncDeploymentJobResult withFleet(String fleet) {
        setFleet(fleet);
        return this;
    }

    /**
     * <p>
     * The status of the synchronization job.
     * </p>
     * 
     * @param status
     *        The status of the synchronization job.
     * @see DeploymentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the synchronization job.
     * </p>
     * 
     * @return The status of the synchronization job.
     * @see DeploymentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the synchronization job.
     * </p>
     * 
     * @param status
     *        The status of the synchronization job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public SyncDeploymentJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the synchronization job.
     * </p>
     * 
     * @param status
     *        The status of the synchronization job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public SyncDeploymentJobResult withStatus(DeploymentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Information about the deployment configuration.
     * </p>
     * 
     * @param deploymentConfig
     *        Information about the deployment configuration.
     */

    public void setDeploymentConfig(DeploymentConfig deploymentConfig) {
        this.deploymentConfig = deploymentConfig;
    }

    /**
     * <p>
     * Information about the deployment configuration.
     * </p>
     * 
     * @return Information about the deployment configuration.
     */

    public DeploymentConfig getDeploymentConfig() {
        return this.deploymentConfig;
    }

    /**
     * <p>
     * Information about the deployment configuration.
     * </p>
     * 
     * @param deploymentConfig
     *        Information about the deployment configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncDeploymentJobResult withDeploymentConfig(DeploymentConfig deploymentConfig) {
        setDeploymentConfig(deploymentConfig);
        return this;
    }

    /**
     * <p>
     * Information about the deployment application configurations.
     * </p>
     * 
     * @return Information about the deployment application configurations.
     */

    public java.util.List<DeploymentApplicationConfig> getDeploymentApplicationConfigs() {
        return deploymentApplicationConfigs;
    }

    /**
     * <p>
     * Information about the deployment application configurations.
     * </p>
     * 
     * @param deploymentApplicationConfigs
     *        Information about the deployment application configurations.
     */

    public void setDeploymentApplicationConfigs(java.util.Collection<DeploymentApplicationConfig> deploymentApplicationConfigs) {
        if (deploymentApplicationConfigs == null) {
            this.deploymentApplicationConfigs = null;
            return;
        }

        this.deploymentApplicationConfigs = new java.util.ArrayList<DeploymentApplicationConfig>(deploymentApplicationConfigs);
    }

    /**
     * <p>
     * Information about the deployment application configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentApplicationConfigs(java.util.Collection)} or
     * {@link #withDeploymentApplicationConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param deploymentApplicationConfigs
     *        Information about the deployment application configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncDeploymentJobResult withDeploymentApplicationConfigs(DeploymentApplicationConfig... deploymentApplicationConfigs) {
        if (this.deploymentApplicationConfigs == null) {
            setDeploymentApplicationConfigs(new java.util.ArrayList<DeploymentApplicationConfig>(deploymentApplicationConfigs.length));
        }
        for (DeploymentApplicationConfig ele : deploymentApplicationConfigs) {
            this.deploymentApplicationConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the deployment application configurations.
     * </p>
     * 
     * @param deploymentApplicationConfigs
     *        Information about the deployment application configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncDeploymentJobResult withDeploymentApplicationConfigs(java.util.Collection<DeploymentApplicationConfig> deploymentApplicationConfigs) {
        setDeploymentApplicationConfigs(deploymentApplicationConfigs);
        return this;
    }

    /**
     * <p>
     * The failure reason if the job fails.
     * </p>
     * 
     * @param failureReason
     *        The failure reason if the job fails.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The failure reason if the job fails.
     * </p>
     * 
     * @return The failure reason if the job fails.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The failure reason if the job fails.
     * </p>
     * 
     * @param failureReason
     *        The failure reason if the job fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncDeploymentJobResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The failure code if the job fails:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>RobotApplicationCrash</dt>
     * <dd>
     * <p>
     * Robot application exited abnormally.
     * </p>
     * </dd>
     * <dt>SimulationApplicationCrash</dt>
     * <dd>
     * <p>
     * Simulation application exited abnormally.
     * </p>
     * </dd>
     * <dt>BadPermissionsRobotApplication</dt>
     * <dd>
     * <p>
     * Robot application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsS3Output</dt>
     * <dd>
     * <p>
     * Unable to publish outputs to customer-provided S3 bucket.
     * </p>
     * </dd>
     * <dt>BadPermissionsCloudwatchLogs</dt>
     * <dd>
     * <p>
     * Unable to publish logs to customer-provided CloudWatch Logs resource.
     * </p>
     * </dd>
     * <dt>SubnetIpLimitExceeded</dt>
     * <dd>
     * <p>
     * Subnet IP limit exceeded.
     * </p>
     * </dd>
     * <dt>ENILimitExceeded</dt>
     * <dd>
     * <p>
     * ENI limit exceeded.
     * </p>
     * </dd>
     * <dt>BadPermissionsUserCredentials</dt>
     * <dd>
     * <p>
     * Unable to use the Role provided.
     * </p>
     * </dd>
     * <dt>InvalidBundleRobotApplication</dt>
     * <dd>
     * <p>
     * Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>InvalidBundleSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>RobotApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for RobotApplication does not match value during version creation.
     * </p>
     * </dd>
     * <dt>SimulationApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for SimulationApplication does not match value during version creation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureCode
     *        The failure code if the job fails:</p>
     *        <dl>
     *        <dt>InternalServiceError</dt>
     *        <dd>
     *        <p>
     *        Internal service error.
     *        </p>
     *        </dd>
     *        <dt>RobotApplicationCrash</dt>
     *        <dd>
     *        <p>
     *        Robot application exited abnormally.
     *        </p>
     *        </dd>
     *        <dt>SimulationApplicationCrash</dt>
     *        <dd>
     *        <p>
     *        Simulation application exited abnormally.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsRobotApplication</dt>
     *        <dd>
     *        <p>
     *        Robot application bundle could not be downloaded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsSimulationApplication</dt>
     *        <dd>
     *        <p>
     *        Simulation application bundle could not be downloaded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsS3Output</dt>
     *        <dd>
     *        <p>
     *        Unable to publish outputs to customer-provided S3 bucket.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsCloudwatchLogs</dt>
     *        <dd>
     *        <p>
     *        Unable to publish logs to customer-provided CloudWatch Logs resource.
     *        </p>
     *        </dd>
     *        <dt>SubnetIpLimitExceeded</dt>
     *        <dd>
     *        <p>
     *        Subnet IP limit exceeded.
     *        </p>
     *        </dd>
     *        <dt>ENILimitExceeded</dt>
     *        <dd>
     *        <p>
     *        ENI limit exceeded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsUserCredentials</dt>
     *        <dd>
     *        <p>
     *        Unable to use the Role provided.
     *        </p>
     *        </dd>
     *        <dt>InvalidBundleRobotApplication</dt>
     *        <dd>
     *        <p>
     *        Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     *        </p>
     *        </dd>
     *        <dt>InvalidBundleSimulationApplication</dt>
     *        <dd>
     *        <p>
     *        Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     *        </p>
     *        </dd>
     *        <dt>RobotApplicationVersionMismatchedEtag</dt>
     *        <dd>
     *        <p>
     *        Etag for RobotApplication does not match value during version creation.
     *        </p>
     *        </dd>
     *        <dt>SimulationApplicationVersionMismatchedEtag</dt>
     *        <dd>
     *        <p>
     *        Etag for SimulationApplication does not match value during version creation.
     *        </p>
     *        </dd>
     * @see DeploymentJobErrorCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code if the job fails:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>RobotApplicationCrash</dt>
     * <dd>
     * <p>
     * Robot application exited abnormally.
     * </p>
     * </dd>
     * <dt>SimulationApplicationCrash</dt>
     * <dd>
     * <p>
     * Simulation application exited abnormally.
     * </p>
     * </dd>
     * <dt>BadPermissionsRobotApplication</dt>
     * <dd>
     * <p>
     * Robot application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsS3Output</dt>
     * <dd>
     * <p>
     * Unable to publish outputs to customer-provided S3 bucket.
     * </p>
     * </dd>
     * <dt>BadPermissionsCloudwatchLogs</dt>
     * <dd>
     * <p>
     * Unable to publish logs to customer-provided CloudWatch Logs resource.
     * </p>
     * </dd>
     * <dt>SubnetIpLimitExceeded</dt>
     * <dd>
     * <p>
     * Subnet IP limit exceeded.
     * </p>
     * </dd>
     * <dt>ENILimitExceeded</dt>
     * <dd>
     * <p>
     * ENI limit exceeded.
     * </p>
     * </dd>
     * <dt>BadPermissionsUserCredentials</dt>
     * <dd>
     * <p>
     * Unable to use the Role provided.
     * </p>
     * </dd>
     * <dt>InvalidBundleRobotApplication</dt>
     * <dd>
     * <p>
     * Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>InvalidBundleSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>RobotApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for RobotApplication does not match value during version creation.
     * </p>
     * </dd>
     * <dt>SimulationApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for SimulationApplication does not match value during version creation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The failure code if the job fails:</p>
     *         <dl>
     *         <dt>InternalServiceError</dt>
     *         <dd>
     *         <p>
     *         Internal service error.
     *         </p>
     *         </dd>
     *         <dt>RobotApplicationCrash</dt>
     *         <dd>
     *         <p>
     *         Robot application exited abnormally.
     *         </p>
     *         </dd>
     *         <dt>SimulationApplicationCrash</dt>
     *         <dd>
     *         <p>
     *         Simulation application exited abnormally.
     *         </p>
     *         </dd>
     *         <dt>BadPermissionsRobotApplication</dt>
     *         <dd>
     *         <p>
     *         Robot application bundle could not be downloaded.
     *         </p>
     *         </dd>
     *         <dt>BadPermissionsSimulationApplication</dt>
     *         <dd>
     *         <p>
     *         Simulation application bundle could not be downloaded.
     *         </p>
     *         </dd>
     *         <dt>BadPermissionsS3Output</dt>
     *         <dd>
     *         <p>
     *         Unable to publish outputs to customer-provided S3 bucket.
     *         </p>
     *         </dd>
     *         <dt>BadPermissionsCloudwatchLogs</dt>
     *         <dd>
     *         <p>
     *         Unable to publish logs to customer-provided CloudWatch Logs resource.
     *         </p>
     *         </dd>
     *         <dt>SubnetIpLimitExceeded</dt>
     *         <dd>
     *         <p>
     *         Subnet IP limit exceeded.
     *         </p>
     *         </dd>
     *         <dt>ENILimitExceeded</dt>
     *         <dd>
     *         <p>
     *         ENI limit exceeded.
     *         </p>
     *         </dd>
     *         <dt>BadPermissionsUserCredentials</dt>
     *         <dd>
     *         <p>
     *         Unable to use the Role provided.
     *         </p>
     *         </dd>
     *         <dt>InvalidBundleRobotApplication</dt>
     *         <dd>
     *         <p>
     *         Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     *         </p>
     *         </dd>
     *         <dt>InvalidBundleSimulationApplication</dt>
     *         <dd>
     *         <p>
     *         Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     *         </p>
     *         </dd>
     *         <dt>RobotApplicationVersionMismatchedEtag</dt>
     *         <dd>
     *         <p>
     *         Etag for RobotApplication does not match value during version creation.
     *         </p>
     *         </dd>
     *         <dt>SimulationApplicationVersionMismatchedEtag</dt>
     *         <dd>
     *         <p>
     *         Etag for SimulationApplication does not match value during version creation.
     *         </p>
     *         </dd>
     * @see DeploymentJobErrorCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code if the job fails:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>RobotApplicationCrash</dt>
     * <dd>
     * <p>
     * Robot application exited abnormally.
     * </p>
     * </dd>
     * <dt>SimulationApplicationCrash</dt>
     * <dd>
     * <p>
     * Simulation application exited abnormally.
     * </p>
     * </dd>
     * <dt>BadPermissionsRobotApplication</dt>
     * <dd>
     * <p>
     * Robot application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsS3Output</dt>
     * <dd>
     * <p>
     * Unable to publish outputs to customer-provided S3 bucket.
     * </p>
     * </dd>
     * <dt>BadPermissionsCloudwatchLogs</dt>
     * <dd>
     * <p>
     * Unable to publish logs to customer-provided CloudWatch Logs resource.
     * </p>
     * </dd>
     * <dt>SubnetIpLimitExceeded</dt>
     * <dd>
     * <p>
     * Subnet IP limit exceeded.
     * </p>
     * </dd>
     * <dt>ENILimitExceeded</dt>
     * <dd>
     * <p>
     * ENI limit exceeded.
     * </p>
     * </dd>
     * <dt>BadPermissionsUserCredentials</dt>
     * <dd>
     * <p>
     * Unable to use the Role provided.
     * </p>
     * </dd>
     * <dt>InvalidBundleRobotApplication</dt>
     * <dd>
     * <p>
     * Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>InvalidBundleSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>RobotApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for RobotApplication does not match value during version creation.
     * </p>
     * </dd>
     * <dt>SimulationApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for SimulationApplication does not match value during version creation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureCode
     *        The failure code if the job fails:</p>
     *        <dl>
     *        <dt>InternalServiceError</dt>
     *        <dd>
     *        <p>
     *        Internal service error.
     *        </p>
     *        </dd>
     *        <dt>RobotApplicationCrash</dt>
     *        <dd>
     *        <p>
     *        Robot application exited abnormally.
     *        </p>
     *        </dd>
     *        <dt>SimulationApplicationCrash</dt>
     *        <dd>
     *        <p>
     *        Simulation application exited abnormally.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsRobotApplication</dt>
     *        <dd>
     *        <p>
     *        Robot application bundle could not be downloaded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsSimulationApplication</dt>
     *        <dd>
     *        <p>
     *        Simulation application bundle could not be downloaded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsS3Output</dt>
     *        <dd>
     *        <p>
     *        Unable to publish outputs to customer-provided S3 bucket.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsCloudwatchLogs</dt>
     *        <dd>
     *        <p>
     *        Unable to publish logs to customer-provided CloudWatch Logs resource.
     *        </p>
     *        </dd>
     *        <dt>SubnetIpLimitExceeded</dt>
     *        <dd>
     *        <p>
     *        Subnet IP limit exceeded.
     *        </p>
     *        </dd>
     *        <dt>ENILimitExceeded</dt>
     *        <dd>
     *        <p>
     *        ENI limit exceeded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsUserCredentials</dt>
     *        <dd>
     *        <p>
     *        Unable to use the Role provided.
     *        </p>
     *        </dd>
     *        <dt>InvalidBundleRobotApplication</dt>
     *        <dd>
     *        <p>
     *        Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     *        </p>
     *        </dd>
     *        <dt>InvalidBundleSimulationApplication</dt>
     *        <dd>
     *        <p>
     *        Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     *        </p>
     *        </dd>
     *        <dt>RobotApplicationVersionMismatchedEtag</dt>
     *        <dd>
     *        <p>
     *        Etag for RobotApplication does not match value during version creation.
     *        </p>
     *        </dd>
     *        <dt>SimulationApplicationVersionMismatchedEtag</dt>
     *        <dd>
     *        <p>
     *        Etag for SimulationApplication does not match value during version creation.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentJobErrorCode
     */

    public SyncDeploymentJobResult withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The failure code if the job fails:
     * </p>
     * <dl>
     * <dt>InternalServiceError</dt>
     * <dd>
     * <p>
     * Internal service error.
     * </p>
     * </dd>
     * <dt>RobotApplicationCrash</dt>
     * <dd>
     * <p>
     * Robot application exited abnormally.
     * </p>
     * </dd>
     * <dt>SimulationApplicationCrash</dt>
     * <dd>
     * <p>
     * Simulation application exited abnormally.
     * </p>
     * </dd>
     * <dt>BadPermissionsRobotApplication</dt>
     * <dd>
     * <p>
     * Robot application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation application bundle could not be downloaded.
     * </p>
     * </dd>
     * <dt>BadPermissionsS3Output</dt>
     * <dd>
     * <p>
     * Unable to publish outputs to customer-provided S3 bucket.
     * </p>
     * </dd>
     * <dt>BadPermissionsCloudwatchLogs</dt>
     * <dd>
     * <p>
     * Unable to publish logs to customer-provided CloudWatch Logs resource.
     * </p>
     * </dd>
     * <dt>SubnetIpLimitExceeded</dt>
     * <dd>
     * <p>
     * Subnet IP limit exceeded.
     * </p>
     * </dd>
     * <dt>ENILimitExceeded</dt>
     * <dd>
     * <p>
     * ENI limit exceeded.
     * </p>
     * </dd>
     * <dt>BadPermissionsUserCredentials</dt>
     * <dd>
     * <p>
     * Unable to use the Role provided.
     * </p>
     * </dd>
     * <dt>InvalidBundleRobotApplication</dt>
     * <dd>
     * <p>
     * Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>InvalidBundleSimulationApplication</dt>
     * <dd>
     * <p>
     * Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     * </p>
     * </dd>
     * <dt>RobotApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for RobotApplication does not match value during version creation.
     * </p>
     * </dd>
     * <dt>SimulationApplicationVersionMismatchedEtag</dt>
     * <dd>
     * <p>
     * Etag for SimulationApplication does not match value during version creation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureCode
     *        The failure code if the job fails:</p>
     *        <dl>
     *        <dt>InternalServiceError</dt>
     *        <dd>
     *        <p>
     *        Internal service error.
     *        </p>
     *        </dd>
     *        <dt>RobotApplicationCrash</dt>
     *        <dd>
     *        <p>
     *        Robot application exited abnormally.
     *        </p>
     *        </dd>
     *        <dt>SimulationApplicationCrash</dt>
     *        <dd>
     *        <p>
     *        Simulation application exited abnormally.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsRobotApplication</dt>
     *        <dd>
     *        <p>
     *        Robot application bundle could not be downloaded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsSimulationApplication</dt>
     *        <dd>
     *        <p>
     *        Simulation application bundle could not be downloaded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsS3Output</dt>
     *        <dd>
     *        <p>
     *        Unable to publish outputs to customer-provided S3 bucket.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsCloudwatchLogs</dt>
     *        <dd>
     *        <p>
     *        Unable to publish logs to customer-provided CloudWatch Logs resource.
     *        </p>
     *        </dd>
     *        <dt>SubnetIpLimitExceeded</dt>
     *        <dd>
     *        <p>
     *        Subnet IP limit exceeded.
     *        </p>
     *        </dd>
     *        <dt>ENILimitExceeded</dt>
     *        <dd>
     *        <p>
     *        ENI limit exceeded.
     *        </p>
     *        </dd>
     *        <dt>BadPermissionsUserCredentials</dt>
     *        <dd>
     *        <p>
     *        Unable to use the Role provided.
     *        </p>
     *        </dd>
     *        <dt>InvalidBundleRobotApplication</dt>
     *        <dd>
     *        <p>
     *        Robot bundle cannot be extracted (invalid format, bundling error, or other issue).
     *        </p>
     *        </dd>
     *        <dt>InvalidBundleSimulationApplication</dt>
     *        <dd>
     *        <p>
     *        Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).
     *        </p>
     *        </dd>
     *        <dt>RobotApplicationVersionMismatchedEtag</dt>
     *        <dd>
     *        <p>
     *        Etag for RobotApplication does not match value during version creation.
     *        </p>
     *        </dd>
     *        <dt>SimulationApplicationVersionMismatchedEtag</dt>
     *        <dd>
     *        <p>
     *        Etag for SimulationApplication does not match value during version creation.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentJobErrorCode
     */

    public SyncDeploymentJobResult withFailureCode(DeploymentJobErrorCode failureCode) {
        this.failureCode = failureCode.toString();
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the fleet was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the fleet was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the fleet was created.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the fleet was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the fleet was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the fleet was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncDeploymentJobResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getFleet() != null)
            sb.append("Fleet: ").append(getFleet()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDeploymentConfig() != null)
            sb.append("DeploymentConfig: ").append(getDeploymentConfig()).append(",");
        if (getDeploymentApplicationConfigs() != null)
            sb.append("DeploymentApplicationConfigs: ").append(getDeploymentApplicationConfigs()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SyncDeploymentJobResult == false)
            return false;
        SyncDeploymentJobResult other = (SyncDeploymentJobResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getFleet() == null ^ this.getFleet() == null)
            return false;
        if (other.getFleet() != null && other.getFleet().equals(this.getFleet()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDeploymentConfig() == null ^ this.getDeploymentConfig() == null)
            return false;
        if (other.getDeploymentConfig() != null && other.getDeploymentConfig().equals(this.getDeploymentConfig()) == false)
            return false;
        if (other.getDeploymentApplicationConfigs() == null ^ this.getDeploymentApplicationConfigs() == null)
            return false;
        if (other.getDeploymentApplicationConfigs() != null && other.getDeploymentApplicationConfigs().equals(this.getDeploymentApplicationConfigs()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getFleet() == null) ? 0 : getFleet().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfig() == null) ? 0 : getDeploymentConfig().hashCode());
        hashCode = prime * hashCode + ((getDeploymentApplicationConfigs() == null) ? 0 : getDeploymentApplicationConfigs().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public SyncDeploymentJobResult clone() {
        try {
            return (SyncDeploymentJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
