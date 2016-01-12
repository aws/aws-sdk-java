/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a create deployment group operation.
 * </p>
 */
public class CreateDeploymentGroupRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an existing AWS CodeDeploy application associated with the
     * applicable IAM user or AWS account.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The name of an existing deployment group for the specified application.
     * </p>
     */
    private String deploymentGroupName;
    /**
     * <p>
     * If specified, the deployment configuration name must be one of the
     * predefined values, or it can be a custom deployment configuration:
     * </p>
     * <ul>
     * <li>CodeDeployDefault.AllAtOnce deploys an application revision to up to
     * all of the instances at once. The overall deployment succeeds if the
     * application revision deploys to at least one of the instances. The
     * overall deployment fails after the application revision fails to deploy
     * to all of the instances. For example, for 9 instances, deploy to up to
     * all 9 instances at once. The overall deployment succeeds if any of the 9
     * instances is successfully deployed to, and it fails if all 9 instances
     * fail to be deployed to.</li>
     * <li>CodeDeployDefault.HalfAtATime deploys to up to half of the instances
     * at a time (with fractions rounded down). The overall deployment succeeds
     * if the application revision deploys to at least half of the instances
     * (with fractions rounded up); otherwise, the deployment fails. For
     * example, for 9 instances, deploy to up to 4 instances at a time. The
     * overall deployment succeeds if 5 or more instances are successfully
     * deployed to; otherwise, the deployment fails. Note that the deployment
     * may successfully deploy to some instances, even if the overall deployment
     * fails.</li>
     * <li>CodeDeployDefault.OneAtATime deploys the application revision to only
     * one of the instances at a time. The overall deployment succeeds if the
     * application revision deploys to all of the instances. The overall
     * deployment fails after the application revision first fails to deploy to
     * any one instances. For example, for 9 instances, deploy to one instance
     * at a time. The overall deployment succeeds if all 9 instances are
     * successfully deployed to, and it fails if any of one of the 9 instances
     * fail to be deployed to. Note that the deployment may successfully deploy
     * to some instances, even if the overall deployment fails. This is the
     * default deployment configuration if a configuration isn't specified for
     * either the deployment or the deployment group.</li>
     * </ul>
     * <p>
     * To create a custom deployment configuration, call the create deployment
     * configuration operation.
     * </p>
     */
    private String deploymentConfigName;
    /**
     * <p>
     * The Amazon EC2 tags to filter on.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EC2TagFilter> ec2TagFilters;
    /**
     * <p>
     * The on-premises instance tags to filter on.
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
     * A service role ARN that allows AWS CodeDeploy to act on the user's behalf
     * when interacting with AWS services.
     * </p>
     */
    private String serviceRoleArn;

    /**
     * <p>
     * The name of an existing AWS CodeDeploy application associated with the
     * applicable IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an existing AWS CodeDeploy application associated with
     *        the applicable IAM user or AWS account.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an existing AWS CodeDeploy application associated with the
     * applicable IAM user or AWS account.
     * </p>
     * 
     * @return The name of an existing AWS CodeDeploy application associated
     *         with the applicable IAM user or AWS account.
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of an existing AWS CodeDeploy application associated with the
     * applicable IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an existing AWS CodeDeploy application associated with
     *        the applicable IAM user or AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withApplicationName(
            String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The name of an existing deployment group for the specified application.
     * </p>
     * 
     * @param deploymentGroupName
     *        The name of an existing deployment group for the specified
     *        application.
     */
    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }

    /**
     * <p>
     * The name of an existing deployment group for the specified application.
     * </p>
     * 
     * @return The name of an existing deployment group for the specified
     *         application.
     */
    public String getDeploymentGroupName() {
        return this.deploymentGroupName;
    }

    /**
     * <p>
     * The name of an existing deployment group for the specified application.
     * </p>
     * 
     * @param deploymentGroupName
     *        The name of an existing deployment group for the specified
     *        application.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withDeploymentGroupName(
            String deploymentGroupName) {
        setDeploymentGroupName(deploymentGroupName);
        return this;
    }

    /**
     * <p>
     * If specified, the deployment configuration name must be one of the
     * predefined values, or it can be a custom deployment configuration:
     * </p>
     * <ul>
     * <li>CodeDeployDefault.AllAtOnce deploys an application revision to up to
     * all of the instances at once. The overall deployment succeeds if the
     * application revision deploys to at least one of the instances. The
     * overall deployment fails after the application revision fails to deploy
     * to all of the instances. For example, for 9 instances, deploy to up to
     * all 9 instances at once. The overall deployment succeeds if any of the 9
     * instances is successfully deployed to, and it fails if all 9 instances
     * fail to be deployed to.</li>
     * <li>CodeDeployDefault.HalfAtATime deploys to up to half of the instances
     * at a time (with fractions rounded down). The overall deployment succeeds
     * if the application revision deploys to at least half of the instances
     * (with fractions rounded up); otherwise, the deployment fails. For
     * example, for 9 instances, deploy to up to 4 instances at a time. The
     * overall deployment succeeds if 5 or more instances are successfully
     * deployed to; otherwise, the deployment fails. Note that the deployment
     * may successfully deploy to some instances, even if the overall deployment
     * fails.</li>
     * <li>CodeDeployDefault.OneAtATime deploys the application revision to only
     * one of the instances at a time. The overall deployment succeeds if the
     * application revision deploys to all of the instances. The overall
     * deployment fails after the application revision first fails to deploy to
     * any one instances. For example, for 9 instances, deploy to one instance
     * at a time. The overall deployment succeeds if all 9 instances are
     * successfully deployed to, and it fails if any of one of the 9 instances
     * fail to be deployed to. Note that the deployment may successfully deploy
     * to some instances, even if the overall deployment fails. This is the
     * default deployment configuration if a configuration isn't specified for
     * either the deployment or the deployment group.</li>
     * </ul>
     * <p>
     * To create a custom deployment configuration, call the create deployment
     * configuration operation.
     * </p>
     * 
     * @param deploymentConfigName
     *        If specified, the deployment configuration name must be one of the
     *        predefined values, or it can be a custom deployment
     *        configuration:</p>
     *        <ul>
     *        <li>CodeDeployDefault.AllAtOnce deploys an application revision to
     *        up to all of the instances at once. The overall deployment
     *        succeeds if the application revision deploys to at least one of
     *        the instances. The overall deployment fails after the application
     *        revision fails to deploy to all of the instances. For example, for
     *        9 instances, deploy to up to all 9 instances at once. The overall
     *        deployment succeeds if any of the 9 instances is successfully
     *        deployed to, and it fails if all 9 instances fail to be deployed
     *        to.</li>
     *        <li>CodeDeployDefault.HalfAtATime deploys to up to half of the
     *        instances at a time (with fractions rounded down). The overall
     *        deployment succeeds if the application revision deploys to at
     *        least half of the instances (with fractions rounded up);
     *        otherwise, the deployment fails. For example, for 9 instances,
     *        deploy to up to 4 instances at a time. The overall deployment
     *        succeeds if 5 or more instances are successfully deployed to;
     *        otherwise, the deployment fails. Note that the deployment may
     *        successfully deploy to some instances, even if the overall
     *        deployment fails.</li>
     *        <li>CodeDeployDefault.OneAtATime deploys the application revision
     *        to only one of the instances at a time. The overall deployment
     *        succeeds if the application revision deploys to all of the
     *        instances. The overall deployment fails after the application
     *        revision first fails to deploy to any one instances. For example,
     *        for 9 instances, deploy to one instance at a time. The overall
     *        deployment succeeds if all 9 instances are successfully deployed
     *        to, and it fails if any of one of the 9 instances fail to be
     *        deployed to. Note that the deployment may successfully deploy to
     *        some instances, even if the overall deployment fails. This is the
     *        default deployment configuration if a configuration isn't
     *        specified for either the deployment or the deployment group.</li>
     *        </ul>
     *        <p>
     *        To create a custom deployment configuration, call the create
     *        deployment configuration operation.
     */
    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    /**
     * <p>
     * If specified, the deployment configuration name must be one of the
     * predefined values, or it can be a custom deployment configuration:
     * </p>
     * <ul>
     * <li>CodeDeployDefault.AllAtOnce deploys an application revision to up to
     * all of the instances at once. The overall deployment succeeds if the
     * application revision deploys to at least one of the instances. The
     * overall deployment fails after the application revision fails to deploy
     * to all of the instances. For example, for 9 instances, deploy to up to
     * all 9 instances at once. The overall deployment succeeds if any of the 9
     * instances is successfully deployed to, and it fails if all 9 instances
     * fail to be deployed to.</li>
     * <li>CodeDeployDefault.HalfAtATime deploys to up to half of the instances
     * at a time (with fractions rounded down). The overall deployment succeeds
     * if the application revision deploys to at least half of the instances
     * (with fractions rounded up); otherwise, the deployment fails. For
     * example, for 9 instances, deploy to up to 4 instances at a time. The
     * overall deployment succeeds if 5 or more instances are successfully
     * deployed to; otherwise, the deployment fails. Note that the deployment
     * may successfully deploy to some instances, even if the overall deployment
     * fails.</li>
     * <li>CodeDeployDefault.OneAtATime deploys the application revision to only
     * one of the instances at a time. The overall deployment succeeds if the
     * application revision deploys to all of the instances. The overall
     * deployment fails after the application revision first fails to deploy to
     * any one instances. For example, for 9 instances, deploy to one instance
     * at a time. The overall deployment succeeds if all 9 instances are
     * successfully deployed to, and it fails if any of one of the 9 instances
     * fail to be deployed to. Note that the deployment may successfully deploy
     * to some instances, even if the overall deployment fails. This is the
     * default deployment configuration if a configuration isn't specified for
     * either the deployment or the deployment group.</li>
     * </ul>
     * <p>
     * To create a custom deployment configuration, call the create deployment
     * configuration operation.
     * </p>
     * 
     * @return If specified, the deployment configuration name must be one of
     *         the predefined values, or it can be a custom deployment
     *         configuration:</p>
     *         <ul>
     *         <li>CodeDeployDefault.AllAtOnce deploys an application revision
     *         to up to all of the instances at once. The overall deployment
     *         succeeds if the application revision deploys to at least one of
     *         the instances. The overall deployment fails after the application
     *         revision fails to deploy to all of the instances. For example,
     *         for 9 instances, deploy to up to all 9 instances at once. The
     *         overall deployment succeeds if any of the 9 instances is
     *         successfully deployed to, and it fails if all 9 instances fail to
     *         be deployed to.</li>
     *         <li>CodeDeployDefault.HalfAtATime deploys to up to half of the
     *         instances at a time (with fractions rounded down). The overall
     *         deployment succeeds if the application revision deploys to at
     *         least half of the instances (with fractions rounded up);
     *         otherwise, the deployment fails. For example, for 9 instances,
     *         deploy to up to 4 instances at a time. The overall deployment
     *         succeeds if 5 or more instances are successfully deployed to;
     *         otherwise, the deployment fails. Note that the deployment may
     *         successfully deploy to some instances, even if the overall
     *         deployment fails.</li>
     *         <li>CodeDeployDefault.OneAtATime deploys the application revision
     *         to only one of the instances at a time. The overall deployment
     *         succeeds if the application revision deploys to all of the
     *         instances. The overall deployment fails after the application
     *         revision first fails to deploy to any one instances. For example,
     *         for 9 instances, deploy to one instance at a time. The overall
     *         deployment succeeds if all 9 instances are successfully deployed
     *         to, and it fails if any of one of the 9 instances fail to be
     *         deployed to. Note that the deployment may successfully deploy to
     *         some instances, even if the overall deployment fails. This is the
     *         default deployment configuration if a configuration isn't
     *         specified for either the deployment or the deployment group.</li>
     *         </ul>
     *         <p>
     *         To create a custom deployment configuration, call the create
     *         deployment configuration operation.
     */
    public String getDeploymentConfigName() {
        return this.deploymentConfigName;
    }

    /**
     * <p>
     * If specified, the deployment configuration name must be one of the
     * predefined values, or it can be a custom deployment configuration:
     * </p>
     * <ul>
     * <li>CodeDeployDefault.AllAtOnce deploys an application revision to up to
     * all of the instances at once. The overall deployment succeeds if the
     * application revision deploys to at least one of the instances. The
     * overall deployment fails after the application revision fails to deploy
     * to all of the instances. For example, for 9 instances, deploy to up to
     * all 9 instances at once. The overall deployment succeeds if any of the 9
     * instances is successfully deployed to, and it fails if all 9 instances
     * fail to be deployed to.</li>
     * <li>CodeDeployDefault.HalfAtATime deploys to up to half of the instances
     * at a time (with fractions rounded down). The overall deployment succeeds
     * if the application revision deploys to at least half of the instances
     * (with fractions rounded up); otherwise, the deployment fails. For
     * example, for 9 instances, deploy to up to 4 instances at a time. The
     * overall deployment succeeds if 5 or more instances are successfully
     * deployed to; otherwise, the deployment fails. Note that the deployment
     * may successfully deploy to some instances, even if the overall deployment
     * fails.</li>
     * <li>CodeDeployDefault.OneAtATime deploys the application revision to only
     * one of the instances at a time. The overall deployment succeeds if the
     * application revision deploys to all of the instances. The overall
     * deployment fails after the application revision first fails to deploy to
     * any one instances. For example, for 9 instances, deploy to one instance
     * at a time. The overall deployment succeeds if all 9 instances are
     * successfully deployed to, and it fails if any of one of the 9 instances
     * fail to be deployed to. Note that the deployment may successfully deploy
     * to some instances, even if the overall deployment fails. This is the
     * default deployment configuration if a configuration isn't specified for
     * either the deployment or the deployment group.</li>
     * </ul>
     * <p>
     * To create a custom deployment configuration, call the create deployment
     * configuration operation.
     * </p>
     * 
     * @param deploymentConfigName
     *        If specified, the deployment configuration name must be one of the
     *        predefined values, or it can be a custom deployment
     *        configuration:</p>
     *        <ul>
     *        <li>CodeDeployDefault.AllAtOnce deploys an application revision to
     *        up to all of the instances at once. The overall deployment
     *        succeeds if the application revision deploys to at least one of
     *        the instances. The overall deployment fails after the application
     *        revision fails to deploy to all of the instances. For example, for
     *        9 instances, deploy to up to all 9 instances at once. The overall
     *        deployment succeeds if any of the 9 instances is successfully
     *        deployed to, and it fails if all 9 instances fail to be deployed
     *        to.</li>
     *        <li>CodeDeployDefault.HalfAtATime deploys to up to half of the
     *        instances at a time (with fractions rounded down). The overall
     *        deployment succeeds if the application revision deploys to at
     *        least half of the instances (with fractions rounded up);
     *        otherwise, the deployment fails. For example, for 9 instances,
     *        deploy to up to 4 instances at a time. The overall deployment
     *        succeeds if 5 or more instances are successfully deployed to;
     *        otherwise, the deployment fails. Note that the deployment may
     *        successfully deploy to some instances, even if the overall
     *        deployment fails.</li>
     *        <li>CodeDeployDefault.OneAtATime deploys the application revision
     *        to only one of the instances at a time. The overall deployment
     *        succeeds if the application revision deploys to all of the
     *        instances. The overall deployment fails after the application
     *        revision first fails to deploy to any one instances. For example,
     *        for 9 instances, deploy to one instance at a time. The overall
     *        deployment succeeds if all 9 instances are successfully deployed
     *        to, and it fails if any of one of the 9 instances fail to be
     *        deployed to. Note that the deployment may successfully deploy to
     *        some instances, even if the overall deployment fails. This is the
     *        default deployment configuration if a configuration isn't
     *        specified for either the deployment or the deployment group.</li>
     *        </ul>
     *        <p>
     *        To create a custom deployment configuration, call the create
     *        deployment configuration operation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withDeploymentConfigName(
            String deploymentConfigName) {
        setDeploymentConfigName(deploymentConfigName);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 tags to filter on.
     * </p>
     * 
     * @return The Amazon EC2 tags to filter on.
     */
    public java.util.List<EC2TagFilter> getEc2TagFilters() {
        if (ec2TagFilters == null) {
            ec2TagFilters = new com.amazonaws.internal.SdkInternalList<EC2TagFilter>();
        }
        return ec2TagFilters;
    }

    /**
     * <p>
     * The Amazon EC2 tags to filter on.
     * </p>
     * 
     * @param ec2TagFilters
     *        The Amazon EC2 tags to filter on.
     */
    public void setEc2TagFilters(
            java.util.Collection<EC2TagFilter> ec2TagFilters) {
        if (ec2TagFilters == null) {
            this.ec2TagFilters = null;
            return;
        }

        this.ec2TagFilters = new com.amazonaws.internal.SdkInternalList<EC2TagFilter>(
                ec2TagFilters);
    }

    /**
     * <p>
     * The Amazon EC2 tags to filter on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEc2TagFilters(java.util.Collection)} or
     * {@link #withEc2TagFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ec2TagFilters
     *        The Amazon EC2 tags to filter on.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withEc2TagFilters(
            EC2TagFilter... ec2TagFilters) {
        if (this.ec2TagFilters == null) {
            setEc2TagFilters(new com.amazonaws.internal.SdkInternalList<EC2TagFilter>(
                    ec2TagFilters.length));
        }
        for (EC2TagFilter ele : ec2TagFilters) {
            this.ec2TagFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 tags to filter on.
     * </p>
     * 
     * @param ec2TagFilters
     *        The Amazon EC2 tags to filter on.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withEc2TagFilters(
            java.util.Collection<EC2TagFilter> ec2TagFilters) {
        setEc2TagFilters(ec2TagFilters);
        return this;
    }

    /**
     * <p>
     * The on-premises instance tags to filter on.
     * </p>
     * 
     * @return The on-premises instance tags to filter on.
     */
    public java.util.List<TagFilter> getOnPremisesInstanceTagFilters() {
        if (onPremisesInstanceTagFilters == null) {
            onPremisesInstanceTagFilters = new com.amazonaws.internal.SdkInternalList<TagFilter>();
        }
        return onPremisesInstanceTagFilters;
    }

    /**
     * <p>
     * The on-premises instance tags to filter on.
     * </p>
     * 
     * @param onPremisesInstanceTagFilters
     *        The on-premises instance tags to filter on.
     */
    public void setOnPremisesInstanceTagFilters(
            java.util.Collection<TagFilter> onPremisesInstanceTagFilters) {
        if (onPremisesInstanceTagFilters == null) {
            this.onPremisesInstanceTagFilters = null;
            return;
        }

        this.onPremisesInstanceTagFilters = new com.amazonaws.internal.SdkInternalList<TagFilter>(
                onPremisesInstanceTagFilters);
    }

    /**
     * <p>
     * The on-premises instance tags to filter on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setOnPremisesInstanceTagFilters(java.util.Collection)}
     * or {@link #withOnPremisesInstanceTagFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param onPremisesInstanceTagFilters
     *        The on-premises instance tags to filter on.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withOnPremisesInstanceTagFilters(
            TagFilter... onPremisesInstanceTagFilters) {
        if (this.onPremisesInstanceTagFilters == null) {
            setOnPremisesInstanceTagFilters(new com.amazonaws.internal.SdkInternalList<TagFilter>(
                    onPremisesInstanceTagFilters.length));
        }
        for (TagFilter ele : onPremisesInstanceTagFilters) {
            this.onPremisesInstanceTagFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The on-premises instance tags to filter on.
     * </p>
     * 
     * @param onPremisesInstanceTagFilters
     *        The on-premises instance tags to filter on.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withOnPremisesInstanceTagFilters(
            java.util.Collection<TagFilter> onPremisesInstanceTagFilters) {
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
    public void setAutoScalingGroups(
            java.util.Collection<String> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }

        this.autoScalingGroups = new com.amazonaws.internal.SdkInternalList<String>(
                autoScalingGroups);
    }

    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAutoScalingGroups(java.util.Collection)} or
     * {@link #withAutoScalingGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param autoScalingGroups
     *        A list of associated Auto Scaling groups.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withAutoScalingGroups(
            String... autoScalingGroups) {
        if (this.autoScalingGroups == null) {
            setAutoScalingGroups(new com.amazonaws.internal.SdkInternalList<String>(
                    autoScalingGroups.length));
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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withAutoScalingGroups(
            java.util.Collection<String> autoScalingGroups) {
        setAutoScalingGroups(autoScalingGroups);
        return this;
    }

    /**
     * <p>
     * A service role ARN that allows AWS CodeDeploy to act on the user's behalf
     * when interacting with AWS services.
     * </p>
     * 
     * @param serviceRoleArn
     *        A service role ARN that allows AWS CodeDeploy to act on the user's
     *        behalf when interacting with AWS services.
     */
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * A service role ARN that allows AWS CodeDeploy to act on the user's behalf
     * when interacting with AWS services.
     * </p>
     * 
     * @return A service role ARN that allows AWS CodeDeploy to act on the
     *         user's behalf when interacting with AWS services.
     */
    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * A service role ARN that allows AWS CodeDeploy to act on the user's behalf
     * when interacting with AWS services.
     * </p>
     * 
     * @param serviceRoleArn
     *        A service role ARN that allows AWS CodeDeploy to act on the user's
     *        behalf when interacting with AWS services.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupRequest withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("DeploymentConfigName: " + getDeploymentConfigName()
                    + ",");
        if (getEc2TagFilters() != null)
            sb.append("Ec2TagFilters: " + getEc2TagFilters() + ",");
        if (getOnPremisesInstanceTagFilters() != null)
            sb.append("OnPremisesInstanceTagFilters: "
                    + getOnPremisesInstanceTagFilters() + ",");
        if (getAutoScalingGroups() != null)
            sb.append("AutoScalingGroups: " + getAutoScalingGroups() + ",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: " + getServiceRoleArn());
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
        if (other.getApplicationName() == null
                ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDeploymentGroupName() == null
                ^ this.getDeploymentGroupName() == null)
            return false;
        if (other.getDeploymentGroupName() != null
                && other.getDeploymentGroupName().equals(
                        this.getDeploymentGroupName()) == false)
            return false;
        if (other.getDeploymentConfigName() == null
                ^ this.getDeploymentConfigName() == null)
            return false;
        if (other.getDeploymentConfigName() != null
                && other.getDeploymentConfigName().equals(
                        this.getDeploymentConfigName()) == false)
            return false;
        if (other.getEc2TagFilters() == null ^ this.getEc2TagFilters() == null)
            return false;
        if (other.getEc2TagFilters() != null
                && other.getEc2TagFilters().equals(this.getEc2TagFilters()) == false)
            return false;
        if (other.getOnPremisesInstanceTagFilters() == null
                ^ this.getOnPremisesInstanceTagFilters() == null)
            return false;
        if (other.getOnPremisesInstanceTagFilters() != null
                && other.getOnPremisesInstanceTagFilters().equals(
                        this.getOnPremisesInstanceTagFilters()) == false)
            return false;
        if (other.getAutoScalingGroups() == null
                ^ this.getAutoScalingGroups() == null)
            return false;
        if (other.getAutoScalingGroups() != null
                && other.getAutoScalingGroups().equals(
                        this.getAutoScalingGroups()) == false)
            return false;
        if (other.getServiceRoleArn() == null
                ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null
                && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentGroupName() == null) ? 0
                        : getDeploymentGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentConfigName() == null) ? 0
                        : getDeploymentConfigName().hashCode());
        hashCode = prime
                * hashCode
                + ((getEc2TagFilters() == null) ? 0 : getEc2TagFilters()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getOnPremisesInstanceTagFilters() == null) ? 0
                        : getOnPremisesInstanceTagFilters().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoScalingGroups() == null) ? 0
                        : getAutoScalingGroups().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentGroupRequest clone() {
        return (CreateDeploymentGroupRequest) super.clone();
    }
}