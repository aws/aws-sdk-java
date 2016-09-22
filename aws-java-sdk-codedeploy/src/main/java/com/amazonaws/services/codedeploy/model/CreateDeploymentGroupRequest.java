/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a create deployment group operation.
 * </p>
 */
public class CreateDeploymentGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The name of a new deployment group for the specified application.
     * </p>
     */
    private String deploymentGroupName;
    /**
     * <p>
     * If specified, the deployment configuration name can be either one of the predefined configurations provided with
     * AWS CodeDeploy or a custom deployment configuration that you create by calling the create deployment
     * configuration operation.
     * </p>
     * <note>
     * <p>
     * CodeDeployDefault.OneAtATime is the default deployment configuration. It is used if a configuration isn't
     * specified for the deployment or the deployment group.
     * </p>
     * </note>
     * <p>
     * The predefined deployment configurations include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeDeployDefault.AllAtOnce</b> attempts to deploy an application revision to as many instances as possible at
     * once. The status of the overall deployment will be displayed as <b>Succeeded</b> if the application revision is
     * deployed to one or more of the instances. The status of the overall deployment will be displayed as <b>Failed</b>
     * if the application revision is not deployed to any of the instances. Using an example of nine instances,
     * CodeDeployDefault.AllAtOnce will attempt to deploy to all nine instances at once. The overall deployment will
     * succeed if deployment to even a single instance is successful; it will fail only if deployments to all nine
     * instances fail.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CodeDeployDefault.HalfAtATime</b> deploys to up to half of the instances at a time (with fractions rounded
     * down). The overall deployment succeeds if the application revision is deployed to at least half of the instances
     * (with fractions rounded up); otherwise, the deployment fails. In the example of nine instances, it will deploy to
     * up to four instances at a time. The overall deployment succeeds if deployment to five or more instances succeed;
     * otherwise, the deployment fails. The deployment may be successfully deployed to some instances even if the
     * overall deployment fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CodeDeployDefault.OneAtATime</b> deploys the application revision to only one instance at a time.
     * </p>
     * <p>
     * For deployment groups that contain more than one instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The overall deployment succeeds if the application revision is deployed to all of the instances. The exception to
     * this rule is if deployment to the last instance fails, the overall deployment still succeeds. This is because AWS
     * CodeDeploy allows only one instance at a time to be taken offline with the CodeDeployDefault.OneAtATime
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * The overall deployment fails as soon as the application revision fails to be deployed to any but the last
     * instance. The deployment may be successfully deployed to some instances even if the overall deployment fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * In an example using nine instances, it will deploy to one instance at a time. The overall deployment succeeds if
     * deployment to the first eight instances is successful; the overall deployment fails if deployment to any of the
     * first eight instances fails.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For deployment groups that contain only one instance, the overall deployment is successful only if deployment to
     * the single instance is successful
     * </p>
     * </li>
     * </ul>
     */
    private String deploymentConfigName;
    /**
     * <p>
     * The Amazon EC2 tags on which to filter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EC2TagFilter> ec2TagFilters;
    /**
     * <p>
     * The on-premises instance tags on which to filter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagFilter> onPremisesInstanceTagFilters;
    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> autoScalingGroups;
    /**
     * <p>
     * A service role ARN that allows AWS CodeDeploy to act on the user's behalf when interacting with AWS services.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * Information about triggers to create when the deployment group is created. For examples, see <a
     * href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html">Create a Trigger for an AWS
     * CodeDeploy Event</a> in the AWS CodeDeploy User Guide.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TriggerConfig> triggerConfigurations;
    /**
     * <p>
     * Information to add about Amazon CloudWatch alarms when the deployment group is created.
     * </p>
     */
    private AlarmConfiguration alarmConfiguration;
    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a deployment group is created.
     * </p>
     */
    private AutoRollbackConfiguration autoRollbackConfiguration;

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
     * </p>
     * 
     * @return The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentGroupRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The name of a new deployment group for the specified application.
     * </p>
     * 
     * @param deploymentGroupName
     *        The name of a new deployment group for the specified application.
     */

    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }

    /**
     * <p>
     * The name of a new deployment group for the specified application.
     * </p>
     * 
     * @return The name of a new deployment group for the specified application.
     */

    public String getDeploymentGroupName() {
        return this.deploymentGroupName;
    }

    /**
     * <p>
     * The name of a new deployment group for the specified application.
     * </p>
     * 
     * @param deploymentGroupName
     *        The name of a new deployment group for the specified application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentGroupRequest withDeploymentGroupName(String deploymentGroupName) {
        setDeploymentGroupName(deploymentGroupName);
        return this;
    }

    /**
     * <p>
     * If specified, the deployment configuration name can be either one of the predefined configurations provided with
     * AWS CodeDeploy or a custom deployment configuration that you create by calling the create deployment
     * configuration operation.
     * </p>
     * <note>
     * <p>
     * CodeDeployDefault.OneAtATime is the default deployment configuration. It is used if a configuration isn't
     * specified for the deployment or the deployment group.
     * </p>
     * </note>
     * <p>
     * The predefined deployment configurations include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeDeployDefault.AllAtOnce</b> attempts to deploy an application revision to as many instances as possible at
     * once. The status of the overall deployment will be displayed as <b>Succeeded</b> if the application revision is
     * deployed to one or more of the instances. The status of the overall deployment will be displayed as <b>Failed</b>
     * if the application revision is not deployed to any of the instances. Using an example of nine instances,
     * CodeDeployDefault.AllAtOnce will attempt to deploy to all nine instances at once. The overall deployment will
     * succeed if deployment to even a single instance is successful; it will fail only if deployments to all nine
     * instances fail.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CodeDeployDefault.HalfAtATime</b> deploys to up to half of the instances at a time (with fractions rounded
     * down). The overall deployment succeeds if the application revision is deployed to at least half of the instances
     * (with fractions rounded up); otherwise, the deployment fails. In the example of nine instances, it will deploy to
     * up to four instances at a time. The overall deployment succeeds if deployment to five or more instances succeed;
     * otherwise, the deployment fails. The deployment may be successfully deployed to some instances even if the
     * overall deployment fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CodeDeployDefault.OneAtATime</b> deploys the application revision to only one instance at a time.
     * </p>
     * <p>
     * For deployment groups that contain more than one instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The overall deployment succeeds if the application revision is deployed to all of the instances. The exception to
     * this rule is if deployment to the last instance fails, the overall deployment still succeeds. This is because AWS
     * CodeDeploy allows only one instance at a time to be taken offline with the CodeDeployDefault.OneAtATime
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * The overall deployment fails as soon as the application revision fails to be deployed to any but the last
     * instance. The deployment may be successfully deployed to some instances even if the overall deployment fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * In an example using nine instances, it will deploy to one instance at a time. The overall deployment succeeds if
     * deployment to the first eight instances is successful; the overall deployment fails if deployment to any of the
     * first eight instances fails.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For deployment groups that contain only one instance, the overall deployment is successful only if deployment to
     * the single instance is successful
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentConfigName
     *        If specified, the deployment configuration name can be either one of the predefined configurations
     *        provided with AWS CodeDeploy or a custom deployment configuration that you create by calling the create
     *        deployment configuration operation.</p> <note>
     *        <p>
     *        CodeDeployDefault.OneAtATime is the default deployment configuration. It is used if a configuration isn't
     *        specified for the deployment or the deployment group.
     *        </p>
     *        </note>
     *        <p>
     *        The predefined deployment configurations include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CodeDeployDefault.AllAtOnce</b> attempts to deploy an application revision to as many instances as
     *        possible at once. The status of the overall deployment will be displayed as <b>Succeeded</b> if the
     *        application revision is deployed to one or more of the instances. The status of the overall deployment
     *        will be displayed as <b>Failed</b> if the application revision is not deployed to any of the instances.
     *        Using an example of nine instances, CodeDeployDefault.AllAtOnce will attempt to deploy to all nine
     *        instances at once. The overall deployment will succeed if deployment to even a single instance is
     *        successful; it will fail only if deployments to all nine instances fail.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CodeDeployDefault.HalfAtATime</b> deploys to up to half of the instances at a time (with fractions
     *        rounded down). The overall deployment succeeds if the application revision is deployed to at least half of
     *        the instances (with fractions rounded up); otherwise, the deployment fails. In the example of nine
     *        instances, it will deploy to up to four instances at a time. The overall deployment succeeds if deployment
     *        to five or more instances succeed; otherwise, the deployment fails. The deployment may be successfully
     *        deployed to some instances even if the overall deployment fails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CodeDeployDefault.OneAtATime</b> deploys the application revision to only one instance at a time.
     *        </p>
     *        <p>
     *        For deployment groups that contain more than one instance:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The overall deployment succeeds if the application revision is deployed to all of the instances. The
     *        exception to this rule is if deployment to the last instance fails, the overall deployment still succeeds.
     *        This is because AWS CodeDeploy allows only one instance at a time to be taken offline with the
     *        CodeDeployDefault.OneAtATime configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The overall deployment fails as soon as the application revision fails to be deployed to any but the last
     *        instance. The deployment may be successfully deployed to some instances even if the overall deployment
     *        fails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In an example using nine instances, it will deploy to one instance at a time. The overall deployment
     *        succeeds if deployment to the first eight instances is successful; the overall deployment fails if
     *        deployment to any of the first eight instances fails.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For deployment groups that contain only one instance, the overall deployment is successful only if
     *        deployment to the single instance is successful
     *        </p>
     *        </li>
     */

    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    /**
     * <p>
     * If specified, the deployment configuration name can be either one of the predefined configurations provided with
     * AWS CodeDeploy or a custom deployment configuration that you create by calling the create deployment
     * configuration operation.
     * </p>
     * <note>
     * <p>
     * CodeDeployDefault.OneAtATime is the default deployment configuration. It is used if a configuration isn't
     * specified for the deployment or the deployment group.
     * </p>
     * </note>
     * <p>
     * The predefined deployment configurations include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeDeployDefault.AllAtOnce</b> attempts to deploy an application revision to as many instances as possible at
     * once. The status of the overall deployment will be displayed as <b>Succeeded</b> if the application revision is
     * deployed to one or more of the instances. The status of the overall deployment will be displayed as <b>Failed</b>
     * if the application revision is not deployed to any of the instances. Using an example of nine instances,
     * CodeDeployDefault.AllAtOnce will attempt to deploy to all nine instances at once. The overall deployment will
     * succeed if deployment to even a single instance is successful; it will fail only if deployments to all nine
     * instances fail.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CodeDeployDefault.HalfAtATime</b> deploys to up to half of the instances at a time (with fractions rounded
     * down). The overall deployment succeeds if the application revision is deployed to at least half of the instances
     * (with fractions rounded up); otherwise, the deployment fails. In the example of nine instances, it will deploy to
     * up to four instances at a time. The overall deployment succeeds if deployment to five or more instances succeed;
     * otherwise, the deployment fails. The deployment may be successfully deployed to some instances even if the
     * overall deployment fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CodeDeployDefault.OneAtATime</b> deploys the application revision to only one instance at a time.
     * </p>
     * <p>
     * For deployment groups that contain more than one instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The overall deployment succeeds if the application revision is deployed to all of the instances. The exception to
     * this rule is if deployment to the last instance fails, the overall deployment still succeeds. This is because AWS
     * CodeDeploy allows only one instance at a time to be taken offline with the CodeDeployDefault.OneAtATime
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * The overall deployment fails as soon as the application revision fails to be deployed to any but the last
     * instance. The deployment may be successfully deployed to some instances even if the overall deployment fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * In an example using nine instances, it will deploy to one instance at a time. The overall deployment succeeds if
     * deployment to the first eight instances is successful; the overall deployment fails if deployment to any of the
     * first eight instances fails.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For deployment groups that contain only one instance, the overall deployment is successful only if deployment to
     * the single instance is successful
     * </p>
     * </li>
     * </ul>
     * 
     * @return If specified, the deployment configuration name can be either one of the predefined configurations
     *         provided with AWS CodeDeploy or a custom deployment configuration that you create by calling the create
     *         deployment configuration operation.</p> <note>
     *         <p>
     *         CodeDeployDefault.OneAtATime is the default deployment configuration. It is used if a configuration isn't
     *         specified for the deployment or the deployment group.
     *         </p>
     *         </note>
     *         <p>
     *         The predefined deployment configurations include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>CodeDeployDefault.AllAtOnce</b> attempts to deploy an application revision to as many instances as
     *         possible at once. The status of the overall deployment will be displayed as <b>Succeeded</b> if the
     *         application revision is deployed to one or more of the instances. The status of the overall deployment
     *         will be displayed as <b>Failed</b> if the application revision is not deployed to any of the instances.
     *         Using an example of nine instances, CodeDeployDefault.AllAtOnce will attempt to deploy to all nine
     *         instances at once. The overall deployment will succeed if deployment to even a single instance is
     *         successful; it will fail only if deployments to all nine instances fail.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CodeDeployDefault.HalfAtATime</b> deploys to up to half of the instances at a time (with fractions
     *         rounded down). The overall deployment succeeds if the application revision is deployed to at least half
     *         of the instances (with fractions rounded up); otherwise, the deployment fails. In the example of nine
     *         instances, it will deploy to up to four instances at a time. The overall deployment succeeds if
     *         deployment to five or more instances succeed; otherwise, the deployment fails. The deployment may be
     *         successfully deployed to some instances even if the overall deployment fails.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CodeDeployDefault.OneAtATime</b> deploys the application revision to only one instance at a time.
     *         </p>
     *         <p>
     *         For deployment groups that contain more than one instance:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The overall deployment succeeds if the application revision is deployed to all of the instances. The
     *         exception to this rule is if deployment to the last instance fails, the overall deployment still
     *         succeeds. This is because AWS CodeDeploy allows only one instance at a time to be taken offline with the
     *         CodeDeployDefault.OneAtATime configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The overall deployment fails as soon as the application revision fails to be deployed to any but the last
     *         instance. The deployment may be successfully deployed to some instances even if the overall deployment
     *         fails.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In an example using nine instances, it will deploy to one instance at a time. The overall deployment
     *         succeeds if deployment to the first eight instances is successful; the overall deployment fails if
     *         deployment to any of the first eight instances fails.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For deployment groups that contain only one instance, the overall deployment is successful only if
     *         deployment to the single instance is successful
     *         </p>
     *         </li>
     */

    public String getDeploymentConfigName() {
        return this.deploymentConfigName;
    }

    /**
     * <p>
     * If specified, the deployment configuration name can be either one of the predefined configurations provided with
     * AWS CodeDeploy or a custom deployment configuration that you create by calling the create deployment
     * configuration operation.
     * </p>
     * <note>
     * <p>
     * CodeDeployDefault.OneAtATime is the default deployment configuration. It is used if a configuration isn't
     * specified for the deployment or the deployment group.
     * </p>
     * </note>
     * <p>
     * The predefined deployment configurations include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CodeDeployDefault.AllAtOnce</b> attempts to deploy an application revision to as many instances as possible at
     * once. The status of the overall deployment will be displayed as <b>Succeeded</b> if the application revision is
     * deployed to one or more of the instances. The status of the overall deployment will be displayed as <b>Failed</b>
     * if the application revision is not deployed to any of the instances. Using an example of nine instances,
     * CodeDeployDefault.AllAtOnce will attempt to deploy to all nine instances at once. The overall deployment will
     * succeed if deployment to even a single instance is successful; it will fail only if deployments to all nine
     * instances fail.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CodeDeployDefault.HalfAtATime</b> deploys to up to half of the instances at a time (with fractions rounded
     * down). The overall deployment succeeds if the application revision is deployed to at least half of the instances
     * (with fractions rounded up); otherwise, the deployment fails. In the example of nine instances, it will deploy to
     * up to four instances at a time. The overall deployment succeeds if deployment to five or more instances succeed;
     * otherwise, the deployment fails. The deployment may be successfully deployed to some instances even if the
     * overall deployment fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CodeDeployDefault.OneAtATime</b> deploys the application revision to only one instance at a time.
     * </p>
     * <p>
     * For deployment groups that contain more than one instance:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The overall deployment succeeds if the application revision is deployed to all of the instances. The exception to
     * this rule is if deployment to the last instance fails, the overall deployment still succeeds. This is because AWS
     * CodeDeploy allows only one instance at a time to be taken offline with the CodeDeployDefault.OneAtATime
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * The overall deployment fails as soon as the application revision fails to be deployed to any but the last
     * instance. The deployment may be successfully deployed to some instances even if the overall deployment fails.
     * </p>
     * </li>
     * <li>
     * <p>
     * In an example using nine instances, it will deploy to one instance at a time. The overall deployment succeeds if
     * deployment to the first eight instances is successful; the overall deployment fails if deployment to any of the
     * first eight instances fails.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For deployment groups that contain only one instance, the overall deployment is successful only if deployment to
     * the single instance is successful
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentConfigName
     *        If specified, the deployment configuration name can be either one of the predefined configurations
     *        provided with AWS CodeDeploy or a custom deployment configuration that you create by calling the create
     *        deployment configuration operation.</p> <note>
     *        <p>
     *        CodeDeployDefault.OneAtATime is the default deployment configuration. It is used if a configuration isn't
     *        specified for the deployment or the deployment group.
     *        </p>
     *        </note>
     *        <p>
     *        The predefined deployment configurations include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CodeDeployDefault.AllAtOnce</b> attempts to deploy an application revision to as many instances as
     *        possible at once. The status of the overall deployment will be displayed as <b>Succeeded</b> if the
     *        application revision is deployed to one or more of the instances. The status of the overall deployment
     *        will be displayed as <b>Failed</b> if the application revision is not deployed to any of the instances.
     *        Using an example of nine instances, CodeDeployDefault.AllAtOnce will attempt to deploy to all nine
     *        instances at once. The overall deployment will succeed if deployment to even a single instance is
     *        successful; it will fail only if deployments to all nine instances fail.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CodeDeployDefault.HalfAtATime</b> deploys to up to half of the instances at a time (with fractions
     *        rounded down). The overall deployment succeeds if the application revision is deployed to at least half of
     *        the instances (with fractions rounded up); otherwise, the deployment fails. In the example of nine
     *        instances, it will deploy to up to four instances at a time. The overall deployment succeeds if deployment
     *        to five or more instances succeed; otherwise, the deployment fails. The deployment may be successfully
     *        deployed to some instances even if the overall deployment fails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CodeDeployDefault.OneAtATime</b> deploys the application revision to only one instance at a time.
     *        </p>
     *        <p>
     *        For deployment groups that contain more than one instance:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The overall deployment succeeds if the application revision is deployed to all of the instances. The
     *        exception to this rule is if deployment to the last instance fails, the overall deployment still succeeds.
     *        This is because AWS CodeDeploy allows only one instance at a time to be taken offline with the
     *        CodeDeployDefault.OneAtATime configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The overall deployment fails as soon as the application revision fails to be deployed to any but the last
     *        instance. The deployment may be successfully deployed to some instances even if the overall deployment
     *        fails.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In an example using nine instances, it will deploy to one instance at a time. The overall deployment
     *        succeeds if deployment to the first eight instances is successful; the overall deployment fails if
     *        deployment to any of the first eight instances fails.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For deployment groups that contain only one instance, the overall deployment is successful only if
     *        deployment to the single instance is successful
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentGroupRequest withDeploymentConfigName(String deploymentConfigName) {
        setDeploymentConfigName(deploymentConfigName);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 tags on which to filter.
     * </p>
     * 
     * @return The Amazon EC2 tags on which to filter.
     */

    public java.util.List<EC2TagFilter> getEc2TagFilters() {
        if (ec2TagFilters == null) {
            ec2TagFilters = new com.amazonaws.internal.SdkInternalList<EC2TagFilter>();
        }
        return ec2TagFilters;
    }

    /**
     * <p>
     * The Amazon EC2 tags on which to filter.
     * </p>
     * 
     * @param ec2TagFilters
     *        The Amazon EC2 tags on which to filter.
     */

    public void setEc2TagFilters(java.util.Collection<EC2TagFilter> ec2TagFilters) {
        if (ec2TagFilters == null) {
            this.ec2TagFilters = null;
            return;
        }

        this.ec2TagFilters = new com.amazonaws.internal.SdkInternalList<EC2TagFilter>(ec2TagFilters);
    }

    /**
     * <p>
     * The Amazon EC2 tags on which to filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2TagFilters(java.util.Collection)} or {@link #withEc2TagFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ec2TagFilters
     *        The Amazon EC2 tags on which to filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentGroupRequest withEc2TagFilters(EC2TagFilter... ec2TagFilters) {
        if (this.ec2TagFilters == null) {
            setEc2TagFilters(new com.amazonaws.internal.SdkInternalList<EC2TagFilter>(ec2TagFilters.length));
        }
        for (EC2TagFilter ele : ec2TagFilters) {
            this.ec2TagFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 tags on which to filter.
     * </p>
     * 
     * @param ec2TagFilters
     *        The Amazon EC2 tags on which to filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentGroupRequest withEc2TagFilters(java.util.Collection<EC2TagFilter> ec2TagFilters) {
        setEc2TagFilters(ec2TagFilters);
        return this;
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter.
     * </p>
     * 
     * @return The on-premises instance tags on which to filter.
     */

    public java.util.List<TagFilter> getOnPremisesInstanceTagFilters() {
        if (onPremisesInstanceTagFilters == null) {
            onPremisesInstanceTagFilters = new com.amazonaws.internal.SdkInternalList<TagFilter>();
        }
        return onPremisesInstanceTagFilters;
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter.
     * </p>
     * 
     * @param onPremisesInstanceTagFilters
     *        The on-premises instance tags on which to filter.
     */

    public void setOnPremisesInstanceTagFilters(java.util.Collection<TagFilter> onPremisesInstanceTagFilters) {
        if (onPremisesInstanceTagFilters == null) {
            this.onPremisesInstanceTagFilters = null;
            return;
        }

        this.onPremisesInstanceTagFilters = new com.amazonaws.internal.SdkInternalList<TagFilter>(onPremisesInstanceTagFilters);
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOnPremisesInstanceTagFilters(java.util.Collection)} or
     * {@link #withOnPremisesInstanceTagFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param onPremisesInstanceTagFilters
     *        The on-premises instance tags on which to filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentGroupRequest withOnPremisesInstanceTagFilters(TagFilter... onPremisesInstanceTagFilters) {
        if (this.onPremisesInstanceTagFilters == null) {
            setOnPremisesInstanceTagFilters(new com.amazonaws.internal.SdkInternalList<TagFilter>(onPremisesInstanceTagFilters.length));
        }
        for (TagFilter ele : onPremisesInstanceTagFilters) {
            this.onPremisesInstanceTagFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter.
     * </p>
     * 
     * @param onPremisesInstanceTagFilters
     *        The on-premises instance tags on which to filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentGroupRequest withOnPremisesInstanceTagFilters(java.util.Collection<TagFilter> onPremisesInstanceTagFilters) {
        setOnPremisesInstanceTagFilters(onPremisesInstanceTagFilters);
        return this;
    }

    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     * 
     * @return A list of associated Auto Scaling groups.
     */

    public java.util.List<String> getAutoScalingGroups() {
        if (autoScalingGroups == null) {
            autoScalingGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return autoScalingGroups;
    }

    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     * 
     * @param autoScalingGroups
     *        A list of associated Auto Scaling groups.
     */

    public void setAutoScalingGroups(java.util.Collection<String> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }

        this.autoScalingGroups = new com.amazonaws.internal.SdkInternalList<String>(autoScalingGroups);
    }

    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoScalingGroups(java.util.Collection)} or {@link #withAutoScalingGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param autoScalingGroups
     *        A list of associated Auto Scaling groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentGroupRequest withAutoScalingGroups(String... autoScalingGroups) {
        if (this.autoScalingGroups == null) {
            setAutoScalingGroups(new com.amazonaws.internal.SdkInternalList<String>(autoScalingGroups.length));
        }
        for (String ele : autoScalingGroups) {
            this.autoScalingGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     * 
     * @param autoScalingGroups
     *        A list of associated Auto Scaling groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentGroupRequest withAutoScalingGroups(java.util.Collection<String> autoScalingGroups) {
        setAutoScalingGroups(autoScalingGroups);
        return this;
    }

    /**
     * <p>
     * A service role ARN that allows AWS CodeDeploy to act on the user's behalf when interacting with AWS services.
     * </p>
     * 
     * @param serviceRoleArn
     *        A service role ARN that allows AWS CodeDeploy to act on the user's behalf when interacting with AWS
     *        services.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * A service role ARN that allows AWS CodeDeploy to act on the user's behalf when interacting with AWS services.
     * </p>
     * 
     * @return A service role ARN that allows AWS CodeDeploy to act on the user's behalf when interacting with AWS
     *         services.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * A service role ARN that allows AWS CodeDeploy to act on the user's behalf when interacting with AWS services.
     * </p>
     * 
     * @param serviceRoleArn
     *        A service role ARN that allows AWS CodeDeploy to act on the user's behalf when interacting with AWS
     *        services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentGroupRequest withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * Information about triggers to create when the deployment group is created. For examples, see <a
     * href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html">Create a Trigger for an AWS
     * CodeDeploy Event</a> in the AWS CodeDeploy User Guide.
     * </p>
     * 
     * @return Information about triggers to create when the deployment group is created. For examples, see <a
     *         href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html">Create a Trigger for
     *         an AWS CodeDeploy Event</a> in the AWS CodeDeploy User Guide.
     */

    public java.util.List<TriggerConfig> getTriggerConfigurations() {
        if (triggerConfigurations == null) {
            triggerConfigurations = new com.amazonaws.internal.SdkInternalList<TriggerConfig>();
        }
        return triggerConfigurations;
    }

    /**
     * <p>
     * Information about triggers to create when the deployment group is created. For examples, see <a
     * href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html">Create a Trigger for an AWS
     * CodeDeploy Event</a> in the AWS CodeDeploy User Guide.
     * </p>
     * 
     * @param triggerConfigurations
     *        Information about triggers to create when the deployment group is created. For examples, see <a
     *        href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html">Create a Trigger for
     *        an AWS CodeDeploy Event</a> in the AWS CodeDeploy User Guide.
     */

    public void setTriggerConfigurations(java.util.Collection<TriggerConfig> triggerConfigurations) {
        if (triggerConfigurations == null) {
            this.triggerConfigurations = null;
            return;
        }

        this.triggerConfigurations = new com.amazonaws.internal.SdkInternalList<TriggerConfig>(triggerConfigurations);
    }

    /**
     * <p>
     * Information about triggers to create when the deployment group is created. For examples, see <a
     * href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html">Create a Trigger for an AWS
     * CodeDeploy Event</a> in the AWS CodeDeploy User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTriggerConfigurations(java.util.Collection)} or
     * {@link #withTriggerConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param triggerConfigurations
     *        Information about triggers to create when the deployment group is created. For examples, see <a
     *        href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html">Create a Trigger for
     *        an AWS CodeDeploy Event</a> in the AWS CodeDeploy User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentGroupRequest withTriggerConfigurations(TriggerConfig... triggerConfigurations) {
        if (this.triggerConfigurations == null) {
            setTriggerConfigurations(new com.amazonaws.internal.SdkInternalList<TriggerConfig>(triggerConfigurations.length));
        }
        for (TriggerConfig ele : triggerConfigurations) {
            this.triggerConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about triggers to create when the deployment group is created. For examples, see <a
     * href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html">Create a Trigger for an AWS
     * CodeDeploy Event</a> in the AWS CodeDeploy User Guide.
     * </p>
     * 
     * @param triggerConfigurations
     *        Information about triggers to create when the deployment group is created. For examples, see <a
     *        href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-sns.html">Create a Trigger for
     *        an AWS CodeDeploy Event</a> in the AWS CodeDeploy User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentGroupRequest withTriggerConfigurations(java.util.Collection<TriggerConfig> triggerConfigurations) {
        setTriggerConfigurations(triggerConfigurations);
        return this;
    }

    /**
     * <p>
     * Information to add about Amazon CloudWatch alarms when the deployment group is created.
     * </p>
     * 
     * @param alarmConfiguration
     *        Information to add about Amazon CloudWatch alarms when the deployment group is created.
     */

    public void setAlarmConfiguration(AlarmConfiguration alarmConfiguration) {
        this.alarmConfiguration = alarmConfiguration;
    }

    /**
     * <p>
     * Information to add about Amazon CloudWatch alarms when the deployment group is created.
     * </p>
     * 
     * @return Information to add about Amazon CloudWatch alarms when the deployment group is created.
     */

    public AlarmConfiguration getAlarmConfiguration() {
        return this.alarmConfiguration;
    }

    /**
     * <p>
     * Information to add about Amazon CloudWatch alarms when the deployment group is created.
     * </p>
     * 
     * @param alarmConfiguration
     *        Information to add about Amazon CloudWatch alarms when the deployment group is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentGroupRequest withAlarmConfiguration(AlarmConfiguration alarmConfiguration) {
        setAlarmConfiguration(alarmConfiguration);
        return this;
    }

    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a deployment group is created.
     * </p>
     * 
     * @param autoRollbackConfiguration
     *        Configuration information for an automatic rollback that is added when a deployment group is created.
     */

    public void setAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
    }

    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a deployment group is created.
     * </p>
     * 
     * @return Configuration information for an automatic rollback that is added when a deployment group is created.
     */

    public AutoRollbackConfiguration getAutoRollbackConfiguration() {
        return this.autoRollbackConfiguration;
    }

    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a deployment group is created.
     * </p>
     * 
     * @param autoRollbackConfiguration
     *        Configuration information for an automatic rollback that is added when a deployment group is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentGroupRequest withAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        setAutoRollbackConfiguration(autoRollbackConfiguration);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getDeploymentGroupName() != null)
            sb.append("DeploymentGroupName: " + getDeploymentGroupName() + ",");
        if (getDeploymentConfigName() != null)
            sb.append("DeploymentConfigName: " + getDeploymentConfigName() + ",");
        if (getEc2TagFilters() != null)
            sb.append("Ec2TagFilters: " + getEc2TagFilters() + ",");
        if (getOnPremisesInstanceTagFilters() != null)
            sb.append("OnPremisesInstanceTagFilters: " + getOnPremisesInstanceTagFilters() + ",");
        if (getAutoScalingGroups() != null)
            sb.append("AutoScalingGroups: " + getAutoScalingGroups() + ",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: " + getServiceRoleArn() + ",");
        if (getTriggerConfigurations() != null)
            sb.append("TriggerConfigurations: " + getTriggerConfigurations() + ",");
        if (getAlarmConfiguration() != null)
            sb.append("AlarmConfiguration: " + getAlarmConfiguration() + ",");
        if (getAutoRollbackConfiguration() != null)
            sb.append("AutoRollbackConfiguration: " + getAutoRollbackConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentGroupRequest == false)
            return false;
        CreateDeploymentGroupRequest other = (CreateDeploymentGroupRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDeploymentGroupName() == null ^ this.getDeploymentGroupName() == null)
            return false;
        if (other.getDeploymentGroupName() != null && other.getDeploymentGroupName().equals(this.getDeploymentGroupName()) == false)
            return false;
        if (other.getDeploymentConfigName() == null ^ this.getDeploymentConfigName() == null)
            return false;
        if (other.getDeploymentConfigName() != null && other.getDeploymentConfigName().equals(this.getDeploymentConfigName()) == false)
            return false;
        if (other.getEc2TagFilters() == null ^ this.getEc2TagFilters() == null)
            return false;
        if (other.getEc2TagFilters() != null && other.getEc2TagFilters().equals(this.getEc2TagFilters()) == false)
            return false;
        if (other.getOnPremisesInstanceTagFilters() == null ^ this.getOnPremisesInstanceTagFilters() == null)
            return false;
        if (other.getOnPremisesInstanceTagFilters() != null && other.getOnPremisesInstanceTagFilters().equals(this.getOnPremisesInstanceTagFilters()) == false)
            return false;
        if (other.getAutoScalingGroups() == null ^ this.getAutoScalingGroups() == null)
            return false;
        if (other.getAutoScalingGroups() != null && other.getAutoScalingGroups().equals(this.getAutoScalingGroups()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getTriggerConfigurations() == null ^ this.getTriggerConfigurations() == null)
            return false;
        if (other.getTriggerConfigurations() != null && other.getTriggerConfigurations().equals(this.getTriggerConfigurations()) == false)
            return false;
        if (other.getAlarmConfiguration() == null ^ this.getAlarmConfiguration() == null)
            return false;
        if (other.getAlarmConfiguration() != null && other.getAlarmConfiguration().equals(this.getAlarmConfiguration()) == false)
            return false;
        if (other.getAutoRollbackConfiguration() == null ^ this.getAutoRollbackConfiguration() == null)
            return false;
        if (other.getAutoRollbackConfiguration() != null && other.getAutoRollbackConfiguration().equals(this.getAutoRollbackConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentGroupName() == null) ? 0 : getDeploymentGroupName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode());
        hashCode = prime * hashCode + ((getEc2TagFilters() == null) ? 0 : getEc2TagFilters().hashCode());
        hashCode = prime * hashCode + ((getOnPremisesInstanceTagFilters() == null) ? 0 : getOnPremisesInstanceTagFilters().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroups() == null) ? 0 : getAutoScalingGroups().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTriggerConfigurations() == null) ? 0 : getTriggerConfigurations().hashCode());
        hashCode = prime * hashCode + ((getAlarmConfiguration() == null) ? 0 : getAlarmConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAutoRollbackConfiguration() == null) ? 0 : getAutoRollbackConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentGroupRequest clone() {
        return (CreateDeploymentGroupRequest) super.clone();
    }
}
