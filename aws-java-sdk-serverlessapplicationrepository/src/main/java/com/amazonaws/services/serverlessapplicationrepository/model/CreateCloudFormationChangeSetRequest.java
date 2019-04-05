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
package com.amazonaws.services.serverlessapplicationrepository.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateCloudFormationChangeSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCloudFormationChangeSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * A list of values that you must specify before you can deploy certain applications. Some applications might
     * include resources that can affect permissions in your AWS account, for example, by creating new AWS Identity and
     * Access Management (IAM) users. For those applications, you must explicitly acknowledge their capabilities by
     * specifying this parameter.
     * </p>
     * <p>
     * The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_RESOURCE_POLICY, and
     * CAPABILITY_AUTO_EXPAND.
     * </p>
     * <p>
     * The following resources require you to specify CAPABILITY_IAM or CAPABILITY_NAMED_IAM: <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     * >AWS::IAM::Group</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     * >AWS::IAM::InstanceProfile</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     * >AWS::IAM::Policy</a>, and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     * >AWS::IAM::Role</a>. If the application contains IAM resources, you can specify either CAPABILITY_IAM or
     * CAPABILITY_NAMED_IAM. If the application contains IAM resources with custom names, you must specify
     * CAPABILITY_NAMED_IAM.
     * </p>
     * <p>
     * The following resources require you to specify CAPABILITY_RESOURCE_POLICY: <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html"
     * >AWS::Lambda::Permission</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     * >AWS::IAM:Policy</a>, <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html"
     * >AWS::ApplicationAutoScaling::ScalingPolicy</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html"
     * >AWS::S3::BucketPolicy</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html"
     * >AWS::SQS::QueuePolicy</a>, and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html"
     * >AWS::SNS:TopicPolicy</a>.
     * </p>
     * <p>
     * Applications that contain one or more nested applications require you to specify CAPABILITY_AUTO_EXPAND.
     * </p>
     * <p>
     * If your application template contains any of the above resources, we recommend that you review all permissions
     * associated with the application before deploying. If you don't specify this parameter for an application that
     * requires capabilities, the call will fail.
     * </p>
     */
    private java.util.List<String> capabilities;
    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     */
    private String changeSetName;
    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     */
    private String description;
    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     */
    private java.util.List<String> notificationArns;
    /**
     * <p>
     * A list of parameter values for the parameters of the application.
     * </p>
     */
    private java.util.List<ParameterValue> parameterOverrides;
    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     */
    private java.util.List<String> resourceTypes;
    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     */
    private RollbackConfiguration rollbackConfiguration;
    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     */
    private String semanticVersion;
    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The UUID returned by CreateCloudFormationTemplate.
     * </p>
     * <p>
     * Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
     * </p>
     */
    private String templateId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationId
     *        The Amazon Resource Name (ARN) of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationId
     *        The Amazon Resource Name (ARN) of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * A list of values that you must specify before you can deploy certain applications. Some applications might
     * include resources that can affect permissions in your AWS account, for example, by creating new AWS Identity and
     * Access Management (IAM) users. For those applications, you must explicitly acknowledge their capabilities by
     * specifying this parameter.
     * </p>
     * <p>
     * The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_RESOURCE_POLICY, and
     * CAPABILITY_AUTO_EXPAND.
     * </p>
     * <p>
     * The following resources require you to specify CAPABILITY_IAM or CAPABILITY_NAMED_IAM: <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     * >AWS::IAM::Group</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     * >AWS::IAM::InstanceProfile</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     * >AWS::IAM::Policy</a>, and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     * >AWS::IAM::Role</a>. If the application contains IAM resources, you can specify either CAPABILITY_IAM or
     * CAPABILITY_NAMED_IAM. If the application contains IAM resources with custom names, you must specify
     * CAPABILITY_NAMED_IAM.
     * </p>
     * <p>
     * The following resources require you to specify CAPABILITY_RESOURCE_POLICY: <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html"
     * >AWS::Lambda::Permission</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     * >AWS::IAM:Policy</a>, <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html"
     * >AWS::ApplicationAutoScaling::ScalingPolicy</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html"
     * >AWS::S3::BucketPolicy</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html"
     * >AWS::SQS::QueuePolicy</a>, and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html"
     * >AWS::SNS:TopicPolicy</a>.
     * </p>
     * <p>
     * Applications that contain one or more nested applications require you to specify CAPABILITY_AUTO_EXPAND.
     * </p>
     * <p>
     * If your application template contains any of the above resources, we recommend that you review all permissions
     * associated with the application before deploying. If you don't specify this parameter for an application that
     * requires capabilities, the call will fail.
     * </p>
     * 
     * @return A list of values that you must specify before you can deploy certain applications. Some applications
     *         might include resources that can affect permissions in your AWS account, for example, by creating new AWS
     *         Identity and Access Management (IAM) users. For those applications, you must explicitly acknowledge their
     *         capabilities by specifying this parameter.</p>
     *         <p>
     *         The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_RESOURCE_POLICY, and
     *         CAPABILITY_AUTO_EXPAND.
     *         </p>
     *         <p>
     *         The following resources require you to specify CAPABILITY_IAM or CAPABILITY_NAMED_IAM: <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     *         >AWS::IAM::Group</a>, <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     *         >AWS::IAM::InstanceProfile</a>, <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     *         >AWS::IAM::Policy</a>, and <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     *         >AWS::IAM::Role</a>. If the application contains IAM resources, you can specify either CAPABILITY_IAM or
     *         CAPABILITY_NAMED_IAM. If the application contains IAM resources with custom names, you must specify
     *         CAPABILITY_NAMED_IAM.
     *         </p>
     *         <p>
     *         The following resources require you to specify CAPABILITY_RESOURCE_POLICY: <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html"
     *         >AWS::Lambda::Permission</a>, <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     *         >AWS::IAM:Policy</a>, <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html"
     *         >AWS::ApplicationAutoScaling::ScalingPolicy</a>, <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html"
     *         >AWS::S3::BucketPolicy</a>, <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html"
     *         >AWS::SQS::QueuePolicy</a>, and <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html"
     *         >AWS::SNS:TopicPolicy</a>.
     *         </p>
     *         <p>
     *         Applications that contain one or more nested applications require you to specify CAPABILITY_AUTO_EXPAND.
     *         </p>
     *         <p>
     *         If your application template contains any of the above resources, we recommend that you review all
     *         permissions associated with the application before deploying. If you don't specify this parameter for an
     *         application that requires capabilities, the call will fail.
     */

    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * A list of values that you must specify before you can deploy certain applications. Some applications might
     * include resources that can affect permissions in your AWS account, for example, by creating new AWS Identity and
     * Access Management (IAM) users. For those applications, you must explicitly acknowledge their capabilities by
     * specifying this parameter.
     * </p>
     * <p>
     * The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_RESOURCE_POLICY, and
     * CAPABILITY_AUTO_EXPAND.
     * </p>
     * <p>
     * The following resources require you to specify CAPABILITY_IAM or CAPABILITY_NAMED_IAM: <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     * >AWS::IAM::Group</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     * >AWS::IAM::InstanceProfile</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     * >AWS::IAM::Policy</a>, and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     * >AWS::IAM::Role</a>. If the application contains IAM resources, you can specify either CAPABILITY_IAM or
     * CAPABILITY_NAMED_IAM. If the application contains IAM resources with custom names, you must specify
     * CAPABILITY_NAMED_IAM.
     * </p>
     * <p>
     * The following resources require you to specify CAPABILITY_RESOURCE_POLICY: <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html"
     * >AWS::Lambda::Permission</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     * >AWS::IAM:Policy</a>, <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html"
     * >AWS::ApplicationAutoScaling::ScalingPolicy</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html"
     * >AWS::S3::BucketPolicy</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html"
     * >AWS::SQS::QueuePolicy</a>, and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html"
     * >AWS::SNS:TopicPolicy</a>.
     * </p>
     * <p>
     * Applications that contain one or more nested applications require you to specify CAPABILITY_AUTO_EXPAND.
     * </p>
     * <p>
     * If your application template contains any of the above resources, we recommend that you review all permissions
     * associated with the application before deploying. If you don't specify this parameter for an application that
     * requires capabilities, the call will fail.
     * </p>
     * 
     * @param capabilities
     *        A list of values that you must specify before you can deploy certain applications. Some applications might
     *        include resources that can affect permissions in your AWS account, for example, by creating new AWS
     *        Identity and Access Management (IAM) users. For those applications, you must explicitly acknowledge their
     *        capabilities by specifying this parameter.</p>
     *        <p>
     *        The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_RESOURCE_POLICY, and
     *        CAPABILITY_AUTO_EXPAND.
     *        </p>
     *        <p>
     *        The following resources require you to specify CAPABILITY_IAM or CAPABILITY_NAMED_IAM: <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     *        >AWS::IAM::Group</a>, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     *        >AWS::IAM::InstanceProfile</a>, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     *        >AWS::IAM::Policy</a>, and <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     *        >AWS::IAM::Role</a>. If the application contains IAM resources, you can specify either CAPABILITY_IAM or
     *        CAPABILITY_NAMED_IAM. If the application contains IAM resources with custom names, you must specify
     *        CAPABILITY_NAMED_IAM.
     *        </p>
     *        <p>
     *        The following resources require you to specify CAPABILITY_RESOURCE_POLICY: <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html"
     *        >AWS::Lambda::Permission</a>, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     *        >AWS::IAM:Policy</a>, <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html"
     *        >AWS::ApplicationAutoScaling::ScalingPolicy</a>, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html"
     *        >AWS::S3::BucketPolicy</a>, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html"
     *        >AWS::SQS::QueuePolicy</a>, and <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html"
     *        >AWS::SNS:TopicPolicy</a>.
     *        </p>
     *        <p>
     *        Applications that contain one or more nested applications require you to specify CAPABILITY_AUTO_EXPAND.
     *        </p>
     *        <p>
     *        If your application template contains any of the above resources, we recommend that you review all
     *        permissions associated with the application before deploying. If you don't specify this parameter for an
     *        application that requires capabilities, the call will fail.
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new java.util.ArrayList<String>(capabilities);
    }

    /**
     * <p>
     * A list of values that you must specify before you can deploy certain applications. Some applications might
     * include resources that can affect permissions in your AWS account, for example, by creating new AWS Identity and
     * Access Management (IAM) users. For those applications, you must explicitly acknowledge their capabilities by
     * specifying this parameter.
     * </p>
     * <p>
     * The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_RESOURCE_POLICY, and
     * CAPABILITY_AUTO_EXPAND.
     * </p>
     * <p>
     * The following resources require you to specify CAPABILITY_IAM or CAPABILITY_NAMED_IAM: <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     * >AWS::IAM::Group</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     * >AWS::IAM::InstanceProfile</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     * >AWS::IAM::Policy</a>, and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     * >AWS::IAM::Role</a>. If the application contains IAM resources, you can specify either CAPABILITY_IAM or
     * CAPABILITY_NAMED_IAM. If the application contains IAM resources with custom names, you must specify
     * CAPABILITY_NAMED_IAM.
     * </p>
     * <p>
     * The following resources require you to specify CAPABILITY_RESOURCE_POLICY: <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html"
     * >AWS::Lambda::Permission</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     * >AWS::IAM:Policy</a>, <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html"
     * >AWS::ApplicationAutoScaling::ScalingPolicy</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html"
     * >AWS::S3::BucketPolicy</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html"
     * >AWS::SQS::QueuePolicy</a>, and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html"
     * >AWS::SNS:TopicPolicy</a>.
     * </p>
     * <p>
     * Applications that contain one or more nested applications require you to specify CAPABILITY_AUTO_EXPAND.
     * </p>
     * <p>
     * If your application template contains any of the above resources, we recommend that you review all permissions
     * associated with the application before deploying. If you don't specify this parameter for an application that
     * requires capabilities, the call will fail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        A list of values that you must specify before you can deploy certain applications. Some applications might
     *        include resources that can affect permissions in your AWS account, for example, by creating new AWS
     *        Identity and Access Management (IAM) users. For those applications, you must explicitly acknowledge their
     *        capabilities by specifying this parameter.</p>
     *        <p>
     *        The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_RESOURCE_POLICY, and
     *        CAPABILITY_AUTO_EXPAND.
     *        </p>
     *        <p>
     *        The following resources require you to specify CAPABILITY_IAM or CAPABILITY_NAMED_IAM: <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     *        >AWS::IAM::Group</a>, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     *        >AWS::IAM::InstanceProfile</a>, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     *        >AWS::IAM::Policy</a>, and <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     *        >AWS::IAM::Role</a>. If the application contains IAM resources, you can specify either CAPABILITY_IAM or
     *        CAPABILITY_NAMED_IAM. If the application contains IAM resources with custom names, you must specify
     *        CAPABILITY_NAMED_IAM.
     *        </p>
     *        <p>
     *        The following resources require you to specify CAPABILITY_RESOURCE_POLICY: <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html"
     *        >AWS::Lambda::Permission</a>, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     *        >AWS::IAM:Policy</a>, <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html"
     *        >AWS::ApplicationAutoScaling::ScalingPolicy</a>, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html"
     *        >AWS::S3::BucketPolicy</a>, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html"
     *        >AWS::SQS::QueuePolicy</a>, and <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html"
     *        >AWS::SNS:TopicPolicy</a>.
     *        </p>
     *        <p>
     *        Applications that contain one or more nested applications require you to specify CAPABILITY_AUTO_EXPAND.
     *        </p>
     *        <p>
     *        If your application template contains any of the above resources, we recommend that you review all
     *        permissions associated with the application before deploying. If you don't specify this parameter for an
     *        application that requires capabilities, the call will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new java.util.ArrayList<String>(capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of values that you must specify before you can deploy certain applications. Some applications might
     * include resources that can affect permissions in your AWS account, for example, by creating new AWS Identity and
     * Access Management (IAM) users. For those applications, you must explicitly acknowledge their capabilities by
     * specifying this parameter.
     * </p>
     * <p>
     * The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_RESOURCE_POLICY, and
     * CAPABILITY_AUTO_EXPAND.
     * </p>
     * <p>
     * The following resources require you to specify CAPABILITY_IAM or CAPABILITY_NAMED_IAM: <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     * >AWS::IAM::Group</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     * >AWS::IAM::InstanceProfile</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     * >AWS::IAM::Policy</a>, and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     * >AWS::IAM::Role</a>. If the application contains IAM resources, you can specify either CAPABILITY_IAM or
     * CAPABILITY_NAMED_IAM. If the application contains IAM resources with custom names, you must specify
     * CAPABILITY_NAMED_IAM.
     * </p>
     * <p>
     * The following resources require you to specify CAPABILITY_RESOURCE_POLICY: <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html"
     * >AWS::Lambda::Permission</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     * >AWS::IAM:Policy</a>, <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html"
     * >AWS::ApplicationAutoScaling::ScalingPolicy</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html"
     * >AWS::S3::BucketPolicy</a>, <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html"
     * >AWS::SQS::QueuePolicy</a>, and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html"
     * >AWS::SNS:TopicPolicy</a>.
     * </p>
     * <p>
     * Applications that contain one or more nested applications require you to specify CAPABILITY_AUTO_EXPAND.
     * </p>
     * <p>
     * If your application template contains any of the above resources, we recommend that you review all permissions
     * associated with the application before deploying. If you don't specify this parameter for an application that
     * requires capabilities, the call will fail.
     * </p>
     * 
     * @param capabilities
     *        A list of values that you must specify before you can deploy certain applications. Some applications might
     *        include resources that can affect permissions in your AWS account, for example, by creating new AWS
     *        Identity and Access Management (IAM) users. For those applications, you must explicitly acknowledge their
     *        capabilities by specifying this parameter.</p>
     *        <p>
     *        The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_RESOURCE_POLICY, and
     *        CAPABILITY_AUTO_EXPAND.
     *        </p>
     *        <p>
     *        The following resources require you to specify CAPABILITY_IAM or CAPABILITY_NAMED_IAM: <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html"
     *        >AWS::IAM::Group</a>, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     *        >AWS::IAM::InstanceProfile</a>, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     *        >AWS::IAM::Policy</a>, and <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html"
     *        >AWS::IAM::Role</a>. If the application contains IAM resources, you can specify either CAPABILITY_IAM or
     *        CAPABILITY_NAMED_IAM. If the application contains IAM resources with custom names, you must specify
     *        CAPABILITY_NAMED_IAM.
     *        </p>
     *        <p>
     *        The following resources require you to specify CAPABILITY_RESOURCE_POLICY: <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-permission.html"
     *        >AWS::Lambda::Permission</a>, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html"
     *        >AWS::IAM:Policy</a>, <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html"
     *        >AWS::ApplicationAutoScaling::ScalingPolicy</a>, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html"
     *        >AWS::S3::BucketPolicy</a>, <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sqs-policy.html"
     *        >AWS::SQS::QueuePolicy</a>, and <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-policy.html"
     *        >AWS::SNS:TopicPolicy</a>.
     *        </p>
     *        <p>
     *        Applications that contain one or more nested applications require you to specify CAPABILITY_AUTO_EXPAND.
     *        </p>
     *        <p>
     *        If your application template contains any of the above resources, we recommend that you review all
     *        permissions associated with the application before deploying. If you don't specify this parameter for an
     *        application that requires capabilities, the call will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param changeSetName
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     */

    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @return This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *         href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *         >CreateChangeSet</a> </i> API.
     */

    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param changeSetName
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withChangeSetName(String changeSetName) {
        setChangeSetName(changeSetName);
        return this;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param clientToken
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @return This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *         href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *         >CreateChangeSet</a> </i> API.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param clientToken
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param description
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @return This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *         href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *         >CreateChangeSet</a> </i> API.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param description
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @return This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *         href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *         >CreateChangeSet</a> </i> API.
     */

    public java.util.List<String> getNotificationArns() {
        return notificationArns;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param notificationArns
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     */

    public void setNotificationArns(java.util.Collection<String> notificationArns) {
        if (notificationArns == null) {
            this.notificationArns = null;
            return;
        }

        this.notificationArns = new java.util.ArrayList<String>(notificationArns);
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationArns(java.util.Collection)} or {@link #withNotificationArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param notificationArns
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withNotificationArns(String... notificationArns) {
        if (this.notificationArns == null) {
            setNotificationArns(new java.util.ArrayList<String>(notificationArns.length));
        }
        for (String ele : notificationArns) {
            this.notificationArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param notificationArns
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withNotificationArns(java.util.Collection<String> notificationArns) {
        setNotificationArns(notificationArns);
        return this;
    }

    /**
     * <p>
     * A list of parameter values for the parameters of the application.
     * </p>
     * 
     * @return A list of parameter values for the parameters of the application.
     */

    public java.util.List<ParameterValue> getParameterOverrides() {
        return parameterOverrides;
    }

    /**
     * <p>
     * A list of parameter values for the parameters of the application.
     * </p>
     * 
     * @param parameterOverrides
     *        A list of parameter values for the parameters of the application.
     */

    public void setParameterOverrides(java.util.Collection<ParameterValue> parameterOverrides) {
        if (parameterOverrides == null) {
            this.parameterOverrides = null;
            return;
        }

        this.parameterOverrides = new java.util.ArrayList<ParameterValue>(parameterOverrides);
    }

    /**
     * <p>
     * A list of parameter values for the parameters of the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterOverrides(java.util.Collection)} or {@link #withParameterOverrides(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param parameterOverrides
     *        A list of parameter values for the parameters of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withParameterOverrides(ParameterValue... parameterOverrides) {
        if (this.parameterOverrides == null) {
            setParameterOverrides(new java.util.ArrayList<ParameterValue>(parameterOverrides.length));
        }
        for (ParameterValue ele : parameterOverrides) {
            this.parameterOverrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameter values for the parameters of the application.
     * </p>
     * 
     * @param parameterOverrides
     *        A list of parameter values for the parameters of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withParameterOverrides(java.util.Collection<ParameterValue> parameterOverrides) {
        setParameterOverrides(parameterOverrides);
        return this;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @return This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *         href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *         >CreateChangeSet</a> </i> API.
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param resourceTypes
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param resourceTypes
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param rollbackConfiguration
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     */

    public void setRollbackConfiguration(RollbackConfiguration rollbackConfiguration) {
        this.rollbackConfiguration = rollbackConfiguration;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @return This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *         href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *         >CreateChangeSet</a> </i> API.
     */

    public RollbackConfiguration getRollbackConfiguration() {
        return this.rollbackConfiguration;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param rollbackConfiguration
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withRollbackConfiguration(RollbackConfiguration rollbackConfiguration) {
        setRollbackConfiguration(rollbackConfiguration);
        return this;
    }

    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the application:</p>
     *        <p>
     *        <a href="https://semver.org/">https://semver.org/</a>
     */

    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     * 
     * @return The semantic version of the application:</p>
     *         <p>
     *         <a href="https://semver.org/">https://semver.org/</a>
     */

    public String getSemanticVersion() {
        return this.semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the application:</p>
     *        <p>
     *        <a href="https://semver.org/">https://semver.org/</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
        return this;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param stackName
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @return This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *         href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *         >CreateChangeSet</a> </i> API.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param stackName
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @return This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *         href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *         >CreateChangeSet</a> </i> API.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param tags
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     * href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet">CreateChangeSet</a> </i>
     * API.
     * </p>
     * 
     * @param tags
     *        This property corresponds to the parameter of the same name for the <i>AWS CloudFormation <a
     *        href="https://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet"
     *        >CreateChangeSet</a> </i> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The UUID returned by CreateCloudFormationTemplate.
     * </p>
     * <p>
     * Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
     * </p>
     * 
     * @param templateId
     *        The UUID returned by CreateCloudFormationTemplate.</p>
     *        <p>
     *        Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The UUID returned by CreateCloudFormationTemplate.
     * </p>
     * <p>
     * Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
     * </p>
     * 
     * @return The UUID returned by CreateCloudFormationTemplate.</p>
     *         <p>
     *         Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * The UUID returned by CreateCloudFormationTemplate.
     * </p>
     * <p>
     * Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
     * </p>
     * 
     * @param templateId
     *        The UUID returned by CreateCloudFormationTemplate.</p>
     *        <p>
     *        Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withTemplateId(String templateId) {
        setTemplateId(templateId);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: ").append(getChangeSetName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNotificationArns() != null)
            sb.append("NotificationArns: ").append(getNotificationArns()).append(",");
        if (getParameterOverrides() != null)
            sb.append("ParameterOverrides: ").append(getParameterOverrides()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getRollbackConfiguration() != null)
            sb.append("RollbackConfiguration: ").append(getRollbackConfiguration()).append(",");
        if (getSemanticVersion() != null)
            sb.append("SemanticVersion: ").append(getSemanticVersion()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCloudFormationChangeSetRequest == false)
            return false;
        CreateCloudFormationChangeSetRequest other = (CreateCloudFormationChangeSetRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNotificationArns() == null ^ this.getNotificationArns() == null)
            return false;
        if (other.getNotificationArns() != null && other.getNotificationArns().equals(this.getNotificationArns()) == false)
            return false;
        if (other.getParameterOverrides() == null ^ this.getParameterOverrides() == null)
            return false;
        if (other.getParameterOverrides() != null && other.getParameterOverrides().equals(this.getParameterOverrides()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getRollbackConfiguration() == null ^ this.getRollbackConfiguration() == null)
            return false;
        if (other.getRollbackConfiguration() != null && other.getRollbackConfiguration().equals(this.getRollbackConfiguration()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNotificationArns() == null) ? 0 : getNotificationArns().hashCode());
        hashCode = prime * hashCode + ((getParameterOverrides() == null) ? 0 : getParameterOverrides().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getRollbackConfiguration() == null) ? 0 : getRollbackConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        return hashCode;
    }

    @Override
    public CreateCloudFormationChangeSetRequest clone() {
        return (CreateCloudFormationChangeSetRequest) super.clone();
    }

}
