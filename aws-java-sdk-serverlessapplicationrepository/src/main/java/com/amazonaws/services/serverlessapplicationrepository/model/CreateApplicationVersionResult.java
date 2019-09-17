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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateApplicationVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The date and time this resource was created.
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * An array of parameter types supported by the application.
     * </p>
     */
    private java.util.List<ParameterDefinition> parameterDefinitions;
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
     * >AWS::SNS::TopicPolicy</a>.
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
    private java.util.List<String> requiredCapabilities;
    /**
     * <p>
     * Whether all of the AWS resources contained in this application are supported in the region in which it is being
     * retrieved.
     * </p>
     */
    private Boolean resourcesSupported;
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
     * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.
     * </p>
     * <p>
     * Maximum size 50 MB
     * </p>
     */
    private String sourceCodeArchiveUrl;
    /**
     * <p>
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     */
    private String sourceCodeUrl;
    /**
     * <p>
     * A link to the packaged AWS SAM template of your application.
     * </p>
     */
    private String templateUrl;

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     * 
     * @param applicationId
     *        The application Amazon Resource Name (ARN).
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The application Amazon Resource Name (ARN).
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     * 
     * @param applicationId
     *        The application Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The date and time this resource was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time this resource was created.
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time this resource was created.
     * </p>
     * 
     * @return The date and time this resource was created.
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time this resource was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time this resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionResult withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * An array of parameter types supported by the application.
     * </p>
     * 
     * @return An array of parameter types supported by the application.
     */

    public java.util.List<ParameterDefinition> getParameterDefinitions() {
        return parameterDefinitions;
    }

    /**
     * <p>
     * An array of parameter types supported by the application.
     * </p>
     * 
     * @param parameterDefinitions
     *        An array of parameter types supported by the application.
     */

    public void setParameterDefinitions(java.util.Collection<ParameterDefinition> parameterDefinitions) {
        if (parameterDefinitions == null) {
            this.parameterDefinitions = null;
            return;
        }

        this.parameterDefinitions = new java.util.ArrayList<ParameterDefinition>(parameterDefinitions);
    }

    /**
     * <p>
     * An array of parameter types supported by the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterDefinitions(java.util.Collection)} or {@link #withParameterDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param parameterDefinitions
     *        An array of parameter types supported by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionResult withParameterDefinitions(ParameterDefinition... parameterDefinitions) {
        if (this.parameterDefinitions == null) {
            setParameterDefinitions(new java.util.ArrayList<ParameterDefinition>(parameterDefinitions.length));
        }
        for (ParameterDefinition ele : parameterDefinitions) {
            this.parameterDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of parameter types supported by the application.
     * </p>
     * 
     * @param parameterDefinitions
     *        An array of parameter types supported by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionResult withParameterDefinitions(java.util.Collection<ParameterDefinition> parameterDefinitions) {
        setParameterDefinitions(parameterDefinitions);
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
     * >AWS::SNS::TopicPolicy</a>.
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
     *         >AWS::SNS::TopicPolicy</a>.
     *         </p>
     *         <p>
     *         Applications that contain one or more nested applications require you to specify CAPABILITY_AUTO_EXPAND.
     *         </p>
     *         <p>
     *         If your application template contains any of the above resources, we recommend that you review all
     *         permissions associated with the application before deploying. If you don't specify this parameter for an
     *         application that requires capabilities, the call will fail.
     * @see Capability
     */

    public java.util.List<String> getRequiredCapabilities() {
        return requiredCapabilities;
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
     * >AWS::SNS::TopicPolicy</a>.
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
     * @param requiredCapabilities
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
     *        >AWS::SNS::TopicPolicy</a>.
     *        </p>
     *        <p>
     *        Applications that contain one or more nested applications require you to specify CAPABILITY_AUTO_EXPAND.
     *        </p>
     *        <p>
     *        If your application template contains any of the above resources, we recommend that you review all
     *        permissions associated with the application before deploying. If you don't specify this parameter for an
     *        application that requires capabilities, the call will fail.
     * @see Capability
     */

    public void setRequiredCapabilities(java.util.Collection<String> requiredCapabilities) {
        if (requiredCapabilities == null) {
            this.requiredCapabilities = null;
            return;
        }

        this.requiredCapabilities = new java.util.ArrayList<String>(requiredCapabilities);
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
     * >AWS::SNS::TopicPolicy</a>.
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
     * {@link #setRequiredCapabilities(java.util.Collection)} or {@link #withRequiredCapabilities(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param requiredCapabilities
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
     *        >AWS::SNS::TopicPolicy</a>.
     *        </p>
     *        <p>
     *        Applications that contain one or more nested applications require you to specify CAPABILITY_AUTO_EXPAND.
     *        </p>
     *        <p>
     *        If your application template contains any of the above resources, we recommend that you review all
     *        permissions associated with the application before deploying. If you don't specify this parameter for an
     *        application that requires capabilities, the call will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateApplicationVersionResult withRequiredCapabilities(String... requiredCapabilities) {
        if (this.requiredCapabilities == null) {
            setRequiredCapabilities(new java.util.ArrayList<String>(requiredCapabilities.length));
        }
        for (String ele : requiredCapabilities) {
            this.requiredCapabilities.add(ele);
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
     * >AWS::SNS::TopicPolicy</a>.
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
     * @param requiredCapabilities
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
     *        >AWS::SNS::TopicPolicy</a>.
     *        </p>
     *        <p>
     *        Applications that contain one or more nested applications require you to specify CAPABILITY_AUTO_EXPAND.
     *        </p>
     *        <p>
     *        If your application template contains any of the above resources, we recommend that you review all
     *        permissions associated with the application before deploying. If you don't specify this parameter for an
     *        application that requires capabilities, the call will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateApplicationVersionResult withRequiredCapabilities(java.util.Collection<String> requiredCapabilities) {
        setRequiredCapabilities(requiredCapabilities);
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
     * >AWS::SNS::TopicPolicy</a>.
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
     * @param requiredCapabilities
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
     *        >AWS::SNS::TopicPolicy</a>.
     *        </p>
     *        <p>
     *        Applications that contain one or more nested applications require you to specify CAPABILITY_AUTO_EXPAND.
     *        </p>
     *        <p>
     *        If your application template contains any of the above resources, we recommend that you review all
     *        permissions associated with the application before deploying. If you don't specify this parameter for an
     *        application that requires capabilities, the call will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateApplicationVersionResult withRequiredCapabilities(Capability... requiredCapabilities) {
        java.util.ArrayList<String> requiredCapabilitiesCopy = new java.util.ArrayList<String>(requiredCapabilities.length);
        for (Capability value : requiredCapabilities) {
            requiredCapabilitiesCopy.add(value.toString());
        }
        if (getRequiredCapabilities() == null) {
            setRequiredCapabilities(requiredCapabilitiesCopy);
        } else {
            getRequiredCapabilities().addAll(requiredCapabilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Whether all of the AWS resources contained in this application are supported in the region in which it is being
     * retrieved.
     * </p>
     * 
     * @param resourcesSupported
     *        Whether all of the AWS resources contained in this application are supported in the region in which it is
     *        being retrieved.
     */

    public void setResourcesSupported(Boolean resourcesSupported) {
        this.resourcesSupported = resourcesSupported;
    }

    /**
     * <p>
     * Whether all of the AWS resources contained in this application are supported in the region in which it is being
     * retrieved.
     * </p>
     * 
     * @return Whether all of the AWS resources contained in this application are supported in the region in which it is
     *         being retrieved.
     */

    public Boolean getResourcesSupported() {
        return this.resourcesSupported;
    }

    /**
     * <p>
     * Whether all of the AWS resources contained in this application are supported in the region in which it is being
     * retrieved.
     * </p>
     * 
     * @param resourcesSupported
     *        Whether all of the AWS resources contained in this application are supported in the region in which it is
     *        being retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionResult withResourcesSupported(Boolean resourcesSupported) {
        setResourcesSupported(resourcesSupported);
        return this;
    }

    /**
     * <p>
     * Whether all of the AWS resources contained in this application are supported in the region in which it is being
     * retrieved.
     * </p>
     * 
     * @return Whether all of the AWS resources contained in this application are supported in the region in which it is
     *         being retrieved.
     */

    public Boolean isResourcesSupported() {
        return this.resourcesSupported;
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

    public CreateApplicationVersionResult withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
        return this;
    }

    /**
     * <p>
     * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.
     * </p>
     * <p>
     * Maximum size 50 MB
     * </p>
     * 
     * @param sourceCodeArchiveUrl
     *        A link to the S3 object that contains the ZIP archive of the source code for this version of your
     *        application.</p>
     *        <p>
     *        Maximum size 50 MB
     */

    public void setSourceCodeArchiveUrl(String sourceCodeArchiveUrl) {
        this.sourceCodeArchiveUrl = sourceCodeArchiveUrl;
    }

    /**
     * <p>
     * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.
     * </p>
     * <p>
     * Maximum size 50 MB
     * </p>
     * 
     * @return A link to the S3 object that contains the ZIP archive of the source code for this version of your
     *         application.</p>
     *         <p>
     *         Maximum size 50 MB
     */

    public String getSourceCodeArchiveUrl() {
        return this.sourceCodeArchiveUrl;
    }

    /**
     * <p>
     * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.
     * </p>
     * <p>
     * Maximum size 50 MB
     * </p>
     * 
     * @param sourceCodeArchiveUrl
     *        A link to the S3 object that contains the ZIP archive of the source code for this version of your
     *        application.</p>
     *        <p>
     *        Maximum size 50 MB
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionResult withSourceCodeArchiveUrl(String sourceCodeArchiveUrl) {
        setSourceCodeArchiveUrl(sourceCodeArchiveUrl);
        return this;
    }

    /**
     * <p>
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     * 
     * @param sourceCodeUrl
     *        A link to a public repository for the source code of your application, for example the URL of a specific
     *        GitHub commit.
     */

    public void setSourceCodeUrl(String sourceCodeUrl) {
        this.sourceCodeUrl = sourceCodeUrl;
    }

    /**
     * <p>
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     * 
     * @return A link to a public repository for the source code of your application, for example the URL of a specific
     *         GitHub commit.
     */

    public String getSourceCodeUrl() {
        return this.sourceCodeUrl;
    }

    /**
     * <p>
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     * 
     * @param sourceCodeUrl
     *        A link to a public repository for the source code of your application, for example the URL of a specific
     *        GitHub commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionResult withSourceCodeUrl(String sourceCodeUrl) {
        setSourceCodeUrl(sourceCodeUrl);
        return this;
    }

    /**
     * <p>
     * A link to the packaged AWS SAM template of your application.
     * </p>
     * 
     * @param templateUrl
     *        A link to the packaged AWS SAM template of your application.
     */

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    /**
     * <p>
     * A link to the packaged AWS SAM template of your application.
     * </p>
     * 
     * @return A link to the packaged AWS SAM template of your application.
     */

    public String getTemplateUrl() {
        return this.templateUrl;
    }

    /**
     * <p>
     * A link to the packaged AWS SAM template of your application.
     * </p>
     * 
     * @param templateUrl
     *        A link to the packaged AWS SAM template of your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationVersionResult withTemplateUrl(String templateUrl) {
        setTemplateUrl(templateUrl);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getParameterDefinitions() != null)
            sb.append("ParameterDefinitions: ").append(getParameterDefinitions()).append(",");
        if (getRequiredCapabilities() != null)
            sb.append("RequiredCapabilities: ").append(getRequiredCapabilities()).append(",");
        if (getResourcesSupported() != null)
            sb.append("ResourcesSupported: ").append(getResourcesSupported()).append(",");
        if (getSemanticVersion() != null)
            sb.append("SemanticVersion: ").append(getSemanticVersion()).append(",");
        if (getSourceCodeArchiveUrl() != null)
            sb.append("SourceCodeArchiveUrl: ").append(getSourceCodeArchiveUrl()).append(",");
        if (getSourceCodeUrl() != null)
            sb.append("SourceCodeUrl: ").append(getSourceCodeUrl()).append(",");
        if (getTemplateUrl() != null)
            sb.append("TemplateUrl: ").append(getTemplateUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationVersionResult == false)
            return false;
        CreateApplicationVersionResult other = (CreateApplicationVersionResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getParameterDefinitions() == null ^ this.getParameterDefinitions() == null)
            return false;
        if (other.getParameterDefinitions() != null && other.getParameterDefinitions().equals(this.getParameterDefinitions()) == false)
            return false;
        if (other.getRequiredCapabilities() == null ^ this.getRequiredCapabilities() == null)
            return false;
        if (other.getRequiredCapabilities() != null && other.getRequiredCapabilities().equals(this.getRequiredCapabilities()) == false)
            return false;
        if (other.getResourcesSupported() == null ^ this.getResourcesSupported() == null)
            return false;
        if (other.getResourcesSupported() != null && other.getResourcesSupported().equals(this.getResourcesSupported()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
            return false;
        if (other.getSourceCodeArchiveUrl() == null ^ this.getSourceCodeArchiveUrl() == null)
            return false;
        if (other.getSourceCodeArchiveUrl() != null && other.getSourceCodeArchiveUrl().equals(this.getSourceCodeArchiveUrl()) == false)
            return false;
        if (other.getSourceCodeUrl() == null ^ this.getSourceCodeUrl() == null)
            return false;
        if (other.getSourceCodeUrl() != null && other.getSourceCodeUrl().equals(this.getSourceCodeUrl()) == false)
            return false;
        if (other.getTemplateUrl() == null ^ this.getTemplateUrl() == null)
            return false;
        if (other.getTemplateUrl() != null && other.getTemplateUrl().equals(this.getTemplateUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getParameterDefinitions() == null) ? 0 : getParameterDefinitions().hashCode());
        hashCode = prime * hashCode + ((getRequiredCapabilities() == null) ? 0 : getRequiredCapabilities().hashCode());
        hashCode = prime * hashCode + ((getResourcesSupported() == null) ? 0 : getResourcesSupported().hashCode());
        hashCode = prime * hashCode + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        hashCode = prime * hashCode + ((getSourceCodeArchiveUrl() == null) ? 0 : getSourceCodeArchiveUrl().hashCode());
        hashCode = prime * hashCode + ((getSourceCodeUrl() == null) ? 0 : getSourceCodeUrl().hashCode());
        hashCode = prime * hashCode + ((getTemplateUrl() == null) ? 0 : getTemplateUrl().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationVersionResult clone() {
        try {
            return (CreateApplicationVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
