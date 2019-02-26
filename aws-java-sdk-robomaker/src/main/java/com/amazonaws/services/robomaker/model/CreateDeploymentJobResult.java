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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateDeploymentJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The target fleet for the deployment job.
     * </p>
     */
    private String fleet;
    /**
     * <p>
     * The status of the deployment job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The deployment application configuration.
     * </p>
     */
    private java.util.List<DeploymentApplicationConfig> deploymentApplicationConfigs;
    /**
     * <p>
     * The failure reason of the deployment job if it failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The failure code of the simulation job if it failed:
     * </p>
     * <dl>
     * <dt>BadPermissionError</dt>
     * <dd>
     * <p>
     * AWS Greengrass requires a service-level role permission to access other services. The role must include the <a
     * href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSGreengrassResourceAccessRolePolicy$jsonEditor"
     * > <code>AWSGreengrassResourceAccessRolePolicy</code> managed policy</a>.
     * </p>
     * </dd>
     * <dt>ExtractingBundleFailure</dt>
     * <dd>
     * <p>
     * The robot application could not be extracted from the bundle.
     * </p>
     * </dd>
     * <dt>FailureThresholdBreached</dt>
     * <dd>
     * <p>
     * The percentage of robots that could not be updated exceeded the percentage set for the deployment.
     * </p>
     * </dd>
     * <dt>GreengrassDeploymentFailed</dt>
     * <dd>
     * <p>
     * The robot application could not be deployed to the robot.
     * </p>
     * </dd>
     * <dt>GreengrassGroupVersionDoesNotExist</dt>
     * <dd>
     * <p>
     * The AWS Greengrass group or version associated with a robot is missing.
     * </p>
     * </dd>
     * <dt>InternalServerError</dt>
     * <dd>
     * <p>
     * An internal error has occurred. Retry your request, but if the problem persists, contact us with details.
     * </p>
     * </dd>
     * <dt>MissingRobotApplicationArchitecture</dt>
     * <dd>
     * <p>
     * The robot application does not have a source that matches the architecture of the robot.
     * </p>
     * </dd>
     * <dt>MissingRobotDeploymentResource</dt>
     * <dd>
     * <p>
     * One or more of the resources specified for the robot application are missing. For example, does the robot
     * application have the correct launch package and launch file?
     * </p>
     * </dd>
     * <dt>PostLaunchFileFailure</dt>
     * <dd>
     * <p>
     * The post-launch script failed.
     * </p>
     * </dd>
     * <dt>PreLaunchFileFailure</dt>
     * <dd>
     * <p>
     * The pre-launch script failed.
     * </p>
     * </dd>
     * <dt>ResourceNotFound</dt>
     * <dd>
     * <p>
     * One or more deployment resources are missing. For example, do robot application source bundles still exist?
     * </p>
     * </dd>
     * <dt>RobotDeploymentNoResponse</dt>
     * <dd>
     * <p>
     * There is no response from the robot. It might not be powered on or connected to the internet.
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
     * The deployment configuration.
     * </p>
     */
    private DeploymentConfig deploymentConfig;
    /**
     * <p>
     * The list of all tags added to the deployment job.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the deployment job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the deployment job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the deployment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentJobResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The target fleet for the deployment job.
     * </p>
     * 
     * @param fleet
     *        The target fleet for the deployment job.
     */

    public void setFleet(String fleet) {
        this.fleet = fleet;
    }

    /**
     * <p>
     * The target fleet for the deployment job.
     * </p>
     * 
     * @return The target fleet for the deployment job.
     */

    public String getFleet() {
        return this.fleet;
    }

    /**
     * <p>
     * The target fleet for the deployment job.
     * </p>
     * 
     * @param fleet
     *        The target fleet for the deployment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentJobResult withFleet(String fleet) {
        setFleet(fleet);
        return this;
    }

    /**
     * <p>
     * The status of the deployment job.
     * </p>
     * 
     * @param status
     *        The status of the deployment job.
     * @see DeploymentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the deployment job.
     * </p>
     * 
     * @return The status of the deployment job.
     * @see DeploymentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the deployment job.
     * </p>
     * 
     * @param status
     *        The status of the deployment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public CreateDeploymentJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the deployment job.
     * </p>
     * 
     * @param status
     *        The status of the deployment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public CreateDeploymentJobResult withStatus(DeploymentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The deployment application configuration.
     * </p>
     * 
     * @return The deployment application configuration.
     */

    public java.util.List<DeploymentApplicationConfig> getDeploymentApplicationConfigs() {
        return deploymentApplicationConfigs;
    }

    /**
     * <p>
     * The deployment application configuration.
     * </p>
     * 
     * @param deploymentApplicationConfigs
     *        The deployment application configuration.
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
     * The deployment application configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentApplicationConfigs(java.util.Collection)} or
     * {@link #withDeploymentApplicationConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param deploymentApplicationConfigs
     *        The deployment application configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentJobResult withDeploymentApplicationConfigs(DeploymentApplicationConfig... deploymentApplicationConfigs) {
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
     * The deployment application configuration.
     * </p>
     * 
     * @param deploymentApplicationConfigs
     *        The deployment application configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentJobResult withDeploymentApplicationConfigs(java.util.Collection<DeploymentApplicationConfig> deploymentApplicationConfigs) {
        setDeploymentApplicationConfigs(deploymentApplicationConfigs);
        return this;
    }

    /**
     * <p>
     * The failure reason of the deployment job if it failed.
     * </p>
     * 
     * @param failureReason
     *        The failure reason of the deployment job if it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The failure reason of the deployment job if it failed.
     * </p>
     * 
     * @return The failure reason of the deployment job if it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The failure reason of the deployment job if it failed.
     * </p>
     * 
     * @param failureReason
     *        The failure reason of the deployment job if it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentJobResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The failure code of the simulation job if it failed:
     * </p>
     * <dl>
     * <dt>BadPermissionError</dt>
     * <dd>
     * <p>
     * AWS Greengrass requires a service-level role permission to access other services. The role must include the <a
     * href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSGreengrassResourceAccessRolePolicy$jsonEditor"
     * > <code>AWSGreengrassResourceAccessRolePolicy</code> managed policy</a>.
     * </p>
     * </dd>
     * <dt>ExtractingBundleFailure</dt>
     * <dd>
     * <p>
     * The robot application could not be extracted from the bundle.
     * </p>
     * </dd>
     * <dt>FailureThresholdBreached</dt>
     * <dd>
     * <p>
     * The percentage of robots that could not be updated exceeded the percentage set for the deployment.
     * </p>
     * </dd>
     * <dt>GreengrassDeploymentFailed</dt>
     * <dd>
     * <p>
     * The robot application could not be deployed to the robot.
     * </p>
     * </dd>
     * <dt>GreengrassGroupVersionDoesNotExist</dt>
     * <dd>
     * <p>
     * The AWS Greengrass group or version associated with a robot is missing.
     * </p>
     * </dd>
     * <dt>InternalServerError</dt>
     * <dd>
     * <p>
     * An internal error has occurred. Retry your request, but if the problem persists, contact us with details.
     * </p>
     * </dd>
     * <dt>MissingRobotApplicationArchitecture</dt>
     * <dd>
     * <p>
     * The robot application does not have a source that matches the architecture of the robot.
     * </p>
     * </dd>
     * <dt>MissingRobotDeploymentResource</dt>
     * <dd>
     * <p>
     * One or more of the resources specified for the robot application are missing. For example, does the robot
     * application have the correct launch package and launch file?
     * </p>
     * </dd>
     * <dt>PostLaunchFileFailure</dt>
     * <dd>
     * <p>
     * The post-launch script failed.
     * </p>
     * </dd>
     * <dt>PreLaunchFileFailure</dt>
     * <dd>
     * <p>
     * The pre-launch script failed.
     * </p>
     * </dd>
     * <dt>ResourceNotFound</dt>
     * <dd>
     * <p>
     * One or more deployment resources are missing. For example, do robot application source bundles still exist?
     * </p>
     * </dd>
     * <dt>RobotDeploymentNoResponse</dt>
     * <dd>
     * <p>
     * There is no response from the robot. It might not be powered on or connected to the internet.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureCode
     *        The failure code of the simulation job if it failed:</p>
     *        <dl>
     *        <dt>BadPermissionError</dt>
     *        <dd>
     *        <p>
     *        AWS Greengrass requires a service-level role permission to access other services. The role must include
     *        the <a href=
     *        "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSGreengrassResourceAccessRolePolicy$jsonEditor"
     *        > <code>AWSGreengrassResourceAccessRolePolicy</code> managed policy</a>.
     *        </p>
     *        </dd>
     *        <dt>ExtractingBundleFailure</dt>
     *        <dd>
     *        <p>
     *        The robot application could not be extracted from the bundle.
     *        </p>
     *        </dd>
     *        <dt>FailureThresholdBreached</dt>
     *        <dd>
     *        <p>
     *        The percentage of robots that could not be updated exceeded the percentage set for the deployment.
     *        </p>
     *        </dd>
     *        <dt>GreengrassDeploymentFailed</dt>
     *        <dd>
     *        <p>
     *        The robot application could not be deployed to the robot.
     *        </p>
     *        </dd>
     *        <dt>GreengrassGroupVersionDoesNotExist</dt>
     *        <dd>
     *        <p>
     *        The AWS Greengrass group or version associated with a robot is missing.
     *        </p>
     *        </dd>
     *        <dt>InternalServerError</dt>
     *        <dd>
     *        <p>
     *        An internal error has occurred. Retry your request, but if the problem persists, contact us with details.
     *        </p>
     *        </dd>
     *        <dt>MissingRobotApplicationArchitecture</dt>
     *        <dd>
     *        <p>
     *        The robot application does not have a source that matches the architecture of the robot.
     *        </p>
     *        </dd>
     *        <dt>MissingRobotDeploymentResource</dt>
     *        <dd>
     *        <p>
     *        One or more of the resources specified for the robot application are missing. For example, does the robot
     *        application have the correct launch package and launch file?
     *        </p>
     *        </dd>
     *        <dt>PostLaunchFileFailure</dt>
     *        <dd>
     *        <p>
     *        The post-launch script failed.
     *        </p>
     *        </dd>
     *        <dt>PreLaunchFileFailure</dt>
     *        <dd>
     *        <p>
     *        The pre-launch script failed.
     *        </p>
     *        </dd>
     *        <dt>ResourceNotFound</dt>
     *        <dd>
     *        <p>
     *        One or more deployment resources are missing. For example, do robot application source bundles still
     *        exist?
     *        </p>
     *        </dd>
     *        <dt>RobotDeploymentNoResponse</dt>
     *        <dd>
     *        <p>
     *        There is no response from the robot. It might not be powered on or connected to the internet.
     *        </p>
     *        </dd>
     * @see DeploymentJobErrorCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code of the simulation job if it failed:
     * </p>
     * <dl>
     * <dt>BadPermissionError</dt>
     * <dd>
     * <p>
     * AWS Greengrass requires a service-level role permission to access other services. The role must include the <a
     * href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSGreengrassResourceAccessRolePolicy$jsonEditor"
     * > <code>AWSGreengrassResourceAccessRolePolicy</code> managed policy</a>.
     * </p>
     * </dd>
     * <dt>ExtractingBundleFailure</dt>
     * <dd>
     * <p>
     * The robot application could not be extracted from the bundle.
     * </p>
     * </dd>
     * <dt>FailureThresholdBreached</dt>
     * <dd>
     * <p>
     * The percentage of robots that could not be updated exceeded the percentage set for the deployment.
     * </p>
     * </dd>
     * <dt>GreengrassDeploymentFailed</dt>
     * <dd>
     * <p>
     * The robot application could not be deployed to the robot.
     * </p>
     * </dd>
     * <dt>GreengrassGroupVersionDoesNotExist</dt>
     * <dd>
     * <p>
     * The AWS Greengrass group or version associated with a robot is missing.
     * </p>
     * </dd>
     * <dt>InternalServerError</dt>
     * <dd>
     * <p>
     * An internal error has occurred. Retry your request, but if the problem persists, contact us with details.
     * </p>
     * </dd>
     * <dt>MissingRobotApplicationArchitecture</dt>
     * <dd>
     * <p>
     * The robot application does not have a source that matches the architecture of the robot.
     * </p>
     * </dd>
     * <dt>MissingRobotDeploymentResource</dt>
     * <dd>
     * <p>
     * One or more of the resources specified for the robot application are missing. For example, does the robot
     * application have the correct launch package and launch file?
     * </p>
     * </dd>
     * <dt>PostLaunchFileFailure</dt>
     * <dd>
     * <p>
     * The post-launch script failed.
     * </p>
     * </dd>
     * <dt>PreLaunchFileFailure</dt>
     * <dd>
     * <p>
     * The pre-launch script failed.
     * </p>
     * </dd>
     * <dt>ResourceNotFound</dt>
     * <dd>
     * <p>
     * One or more deployment resources are missing. For example, do robot application source bundles still exist?
     * </p>
     * </dd>
     * <dt>RobotDeploymentNoResponse</dt>
     * <dd>
     * <p>
     * There is no response from the robot. It might not be powered on or connected to the internet.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The failure code of the simulation job if it failed:</p>
     *         <dl>
     *         <dt>BadPermissionError</dt>
     *         <dd>
     *         <p>
     *         AWS Greengrass requires a service-level role permission to access other services. The role must include
     *         the <a href=
     *         "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSGreengrassResourceAccessRolePolicy$jsonEditor"
     *         > <code>AWSGreengrassResourceAccessRolePolicy</code> managed policy</a>.
     *         </p>
     *         </dd>
     *         <dt>ExtractingBundleFailure</dt>
     *         <dd>
     *         <p>
     *         The robot application could not be extracted from the bundle.
     *         </p>
     *         </dd>
     *         <dt>FailureThresholdBreached</dt>
     *         <dd>
     *         <p>
     *         The percentage of robots that could not be updated exceeded the percentage set for the deployment.
     *         </p>
     *         </dd>
     *         <dt>GreengrassDeploymentFailed</dt>
     *         <dd>
     *         <p>
     *         The robot application could not be deployed to the robot.
     *         </p>
     *         </dd>
     *         <dt>GreengrassGroupVersionDoesNotExist</dt>
     *         <dd>
     *         <p>
     *         The AWS Greengrass group or version associated with a robot is missing.
     *         </p>
     *         </dd>
     *         <dt>InternalServerError</dt>
     *         <dd>
     *         <p>
     *         An internal error has occurred. Retry your request, but if the problem persists, contact us with details.
     *         </p>
     *         </dd>
     *         <dt>MissingRobotApplicationArchitecture</dt>
     *         <dd>
     *         <p>
     *         The robot application does not have a source that matches the architecture of the robot.
     *         </p>
     *         </dd>
     *         <dt>MissingRobotDeploymentResource</dt>
     *         <dd>
     *         <p>
     *         One or more of the resources specified for the robot application are missing. For example, does the robot
     *         application have the correct launch package and launch file?
     *         </p>
     *         </dd>
     *         <dt>PostLaunchFileFailure</dt>
     *         <dd>
     *         <p>
     *         The post-launch script failed.
     *         </p>
     *         </dd>
     *         <dt>PreLaunchFileFailure</dt>
     *         <dd>
     *         <p>
     *         The pre-launch script failed.
     *         </p>
     *         </dd>
     *         <dt>ResourceNotFound</dt>
     *         <dd>
     *         <p>
     *         One or more deployment resources are missing. For example, do robot application source bundles still
     *         exist?
     *         </p>
     *         </dd>
     *         <dt>RobotDeploymentNoResponse</dt>
     *         <dd>
     *         <p>
     *         There is no response from the robot. It might not be powered on or connected to the internet.
     *         </p>
     *         </dd>
     * @see DeploymentJobErrorCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code of the simulation job if it failed:
     * </p>
     * <dl>
     * <dt>BadPermissionError</dt>
     * <dd>
     * <p>
     * AWS Greengrass requires a service-level role permission to access other services. The role must include the <a
     * href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSGreengrassResourceAccessRolePolicy$jsonEditor"
     * > <code>AWSGreengrassResourceAccessRolePolicy</code> managed policy</a>.
     * </p>
     * </dd>
     * <dt>ExtractingBundleFailure</dt>
     * <dd>
     * <p>
     * The robot application could not be extracted from the bundle.
     * </p>
     * </dd>
     * <dt>FailureThresholdBreached</dt>
     * <dd>
     * <p>
     * The percentage of robots that could not be updated exceeded the percentage set for the deployment.
     * </p>
     * </dd>
     * <dt>GreengrassDeploymentFailed</dt>
     * <dd>
     * <p>
     * The robot application could not be deployed to the robot.
     * </p>
     * </dd>
     * <dt>GreengrassGroupVersionDoesNotExist</dt>
     * <dd>
     * <p>
     * The AWS Greengrass group or version associated with a robot is missing.
     * </p>
     * </dd>
     * <dt>InternalServerError</dt>
     * <dd>
     * <p>
     * An internal error has occurred. Retry your request, but if the problem persists, contact us with details.
     * </p>
     * </dd>
     * <dt>MissingRobotApplicationArchitecture</dt>
     * <dd>
     * <p>
     * The robot application does not have a source that matches the architecture of the robot.
     * </p>
     * </dd>
     * <dt>MissingRobotDeploymentResource</dt>
     * <dd>
     * <p>
     * One or more of the resources specified for the robot application are missing. For example, does the robot
     * application have the correct launch package and launch file?
     * </p>
     * </dd>
     * <dt>PostLaunchFileFailure</dt>
     * <dd>
     * <p>
     * The post-launch script failed.
     * </p>
     * </dd>
     * <dt>PreLaunchFileFailure</dt>
     * <dd>
     * <p>
     * The pre-launch script failed.
     * </p>
     * </dd>
     * <dt>ResourceNotFound</dt>
     * <dd>
     * <p>
     * One or more deployment resources are missing. For example, do robot application source bundles still exist?
     * </p>
     * </dd>
     * <dt>RobotDeploymentNoResponse</dt>
     * <dd>
     * <p>
     * There is no response from the robot. It might not be powered on or connected to the internet.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureCode
     *        The failure code of the simulation job if it failed:</p>
     *        <dl>
     *        <dt>BadPermissionError</dt>
     *        <dd>
     *        <p>
     *        AWS Greengrass requires a service-level role permission to access other services. The role must include
     *        the <a href=
     *        "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSGreengrassResourceAccessRolePolicy$jsonEditor"
     *        > <code>AWSGreengrassResourceAccessRolePolicy</code> managed policy</a>.
     *        </p>
     *        </dd>
     *        <dt>ExtractingBundleFailure</dt>
     *        <dd>
     *        <p>
     *        The robot application could not be extracted from the bundle.
     *        </p>
     *        </dd>
     *        <dt>FailureThresholdBreached</dt>
     *        <dd>
     *        <p>
     *        The percentage of robots that could not be updated exceeded the percentage set for the deployment.
     *        </p>
     *        </dd>
     *        <dt>GreengrassDeploymentFailed</dt>
     *        <dd>
     *        <p>
     *        The robot application could not be deployed to the robot.
     *        </p>
     *        </dd>
     *        <dt>GreengrassGroupVersionDoesNotExist</dt>
     *        <dd>
     *        <p>
     *        The AWS Greengrass group or version associated with a robot is missing.
     *        </p>
     *        </dd>
     *        <dt>InternalServerError</dt>
     *        <dd>
     *        <p>
     *        An internal error has occurred. Retry your request, but if the problem persists, contact us with details.
     *        </p>
     *        </dd>
     *        <dt>MissingRobotApplicationArchitecture</dt>
     *        <dd>
     *        <p>
     *        The robot application does not have a source that matches the architecture of the robot.
     *        </p>
     *        </dd>
     *        <dt>MissingRobotDeploymentResource</dt>
     *        <dd>
     *        <p>
     *        One or more of the resources specified for the robot application are missing. For example, does the robot
     *        application have the correct launch package and launch file?
     *        </p>
     *        </dd>
     *        <dt>PostLaunchFileFailure</dt>
     *        <dd>
     *        <p>
     *        The post-launch script failed.
     *        </p>
     *        </dd>
     *        <dt>PreLaunchFileFailure</dt>
     *        <dd>
     *        <p>
     *        The pre-launch script failed.
     *        </p>
     *        </dd>
     *        <dt>ResourceNotFound</dt>
     *        <dd>
     *        <p>
     *        One or more deployment resources are missing. For example, do robot application source bundles still
     *        exist?
     *        </p>
     *        </dd>
     *        <dt>RobotDeploymentNoResponse</dt>
     *        <dd>
     *        <p>
     *        There is no response from the robot. It might not be powered on or connected to the internet.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentJobErrorCode
     */

    public CreateDeploymentJobResult withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The failure code of the simulation job if it failed:
     * </p>
     * <dl>
     * <dt>BadPermissionError</dt>
     * <dd>
     * <p>
     * AWS Greengrass requires a service-level role permission to access other services. The role must include the <a
     * href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSGreengrassResourceAccessRolePolicy$jsonEditor"
     * > <code>AWSGreengrassResourceAccessRolePolicy</code> managed policy</a>.
     * </p>
     * </dd>
     * <dt>ExtractingBundleFailure</dt>
     * <dd>
     * <p>
     * The robot application could not be extracted from the bundle.
     * </p>
     * </dd>
     * <dt>FailureThresholdBreached</dt>
     * <dd>
     * <p>
     * The percentage of robots that could not be updated exceeded the percentage set for the deployment.
     * </p>
     * </dd>
     * <dt>GreengrassDeploymentFailed</dt>
     * <dd>
     * <p>
     * The robot application could not be deployed to the robot.
     * </p>
     * </dd>
     * <dt>GreengrassGroupVersionDoesNotExist</dt>
     * <dd>
     * <p>
     * The AWS Greengrass group or version associated with a robot is missing.
     * </p>
     * </dd>
     * <dt>InternalServerError</dt>
     * <dd>
     * <p>
     * An internal error has occurred. Retry your request, but if the problem persists, contact us with details.
     * </p>
     * </dd>
     * <dt>MissingRobotApplicationArchitecture</dt>
     * <dd>
     * <p>
     * The robot application does not have a source that matches the architecture of the robot.
     * </p>
     * </dd>
     * <dt>MissingRobotDeploymentResource</dt>
     * <dd>
     * <p>
     * One or more of the resources specified for the robot application are missing. For example, does the robot
     * application have the correct launch package and launch file?
     * </p>
     * </dd>
     * <dt>PostLaunchFileFailure</dt>
     * <dd>
     * <p>
     * The post-launch script failed.
     * </p>
     * </dd>
     * <dt>PreLaunchFileFailure</dt>
     * <dd>
     * <p>
     * The pre-launch script failed.
     * </p>
     * </dd>
     * <dt>ResourceNotFound</dt>
     * <dd>
     * <p>
     * One or more deployment resources are missing. For example, do robot application source bundles still exist?
     * </p>
     * </dd>
     * <dt>RobotDeploymentNoResponse</dt>
     * <dd>
     * <p>
     * There is no response from the robot. It might not be powered on or connected to the internet.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param failureCode
     *        The failure code of the simulation job if it failed:</p>
     *        <dl>
     *        <dt>BadPermissionError</dt>
     *        <dd>
     *        <p>
     *        AWS Greengrass requires a service-level role permission to access other services. The role must include
     *        the <a href=
     *        "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSGreengrassResourceAccessRolePolicy$jsonEditor"
     *        > <code>AWSGreengrassResourceAccessRolePolicy</code> managed policy</a>.
     *        </p>
     *        </dd>
     *        <dt>ExtractingBundleFailure</dt>
     *        <dd>
     *        <p>
     *        The robot application could not be extracted from the bundle.
     *        </p>
     *        </dd>
     *        <dt>FailureThresholdBreached</dt>
     *        <dd>
     *        <p>
     *        The percentage of robots that could not be updated exceeded the percentage set for the deployment.
     *        </p>
     *        </dd>
     *        <dt>GreengrassDeploymentFailed</dt>
     *        <dd>
     *        <p>
     *        The robot application could not be deployed to the robot.
     *        </p>
     *        </dd>
     *        <dt>GreengrassGroupVersionDoesNotExist</dt>
     *        <dd>
     *        <p>
     *        The AWS Greengrass group or version associated with a robot is missing.
     *        </p>
     *        </dd>
     *        <dt>InternalServerError</dt>
     *        <dd>
     *        <p>
     *        An internal error has occurred. Retry your request, but if the problem persists, contact us with details.
     *        </p>
     *        </dd>
     *        <dt>MissingRobotApplicationArchitecture</dt>
     *        <dd>
     *        <p>
     *        The robot application does not have a source that matches the architecture of the robot.
     *        </p>
     *        </dd>
     *        <dt>MissingRobotDeploymentResource</dt>
     *        <dd>
     *        <p>
     *        One or more of the resources specified for the robot application are missing. For example, does the robot
     *        application have the correct launch package and launch file?
     *        </p>
     *        </dd>
     *        <dt>PostLaunchFileFailure</dt>
     *        <dd>
     *        <p>
     *        The post-launch script failed.
     *        </p>
     *        </dd>
     *        <dt>PreLaunchFileFailure</dt>
     *        <dd>
     *        <p>
     *        The pre-launch script failed.
     *        </p>
     *        </dd>
     *        <dt>ResourceNotFound</dt>
     *        <dd>
     *        <p>
     *        One or more deployment resources are missing. For example, do robot application source bundles still
     *        exist?
     *        </p>
     *        </dd>
     *        <dt>RobotDeploymentNoResponse</dt>
     *        <dd>
     *        <p>
     *        There is no response from the robot. It might not be powered on or connected to the internet.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentJobErrorCode
     */

    public CreateDeploymentJobResult withFailureCode(DeploymentJobErrorCode failureCode) {
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

    public CreateDeploymentJobResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The deployment configuration.
     * </p>
     * 
     * @param deploymentConfig
     *        The deployment configuration.
     */

    public void setDeploymentConfig(DeploymentConfig deploymentConfig) {
        this.deploymentConfig = deploymentConfig;
    }

    /**
     * <p>
     * The deployment configuration.
     * </p>
     * 
     * @return The deployment configuration.
     */

    public DeploymentConfig getDeploymentConfig() {
        return this.deploymentConfig;
    }

    /**
     * <p>
     * The deployment configuration.
     * </p>
     * 
     * @param deploymentConfig
     *        The deployment configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentJobResult withDeploymentConfig(DeploymentConfig deploymentConfig) {
        setDeploymentConfig(deploymentConfig);
        return this;
    }

    /**
     * <p>
     * The list of all tags added to the deployment job.
     * </p>
     * 
     * @return The list of all tags added to the deployment job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of all tags added to the deployment job.
     * </p>
     * 
     * @param tags
     *        The list of all tags added to the deployment job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of all tags added to the deployment job.
     * </p>
     * 
     * @param tags
     *        The list of all tags added to the deployment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentJobResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateDeploymentJobResult addTagsEntry(String key, String value) {
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

    public CreateDeploymentJobResult clearTagsEntries() {
        this.tags = null;
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
        if (getDeploymentApplicationConfigs() != null)
            sb.append("DeploymentApplicationConfigs: ").append(getDeploymentApplicationConfigs()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDeploymentConfig() != null)
            sb.append("DeploymentConfig: ").append(getDeploymentConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentJobResult == false)
            return false;
        CreateDeploymentJobResult other = (CreateDeploymentJobResult) obj;
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
        if (other.getDeploymentConfig() == null ^ this.getDeploymentConfig() == null)
            return false;
        if (other.getDeploymentConfig() != null && other.getDeploymentConfig().equals(this.getDeploymentConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getDeploymentApplicationConfigs() == null) ? 0 : getDeploymentApplicationConfigs().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfig() == null) ? 0 : getDeploymentConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentJobResult clone() {
        try {
            return (CreateDeploymentJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
