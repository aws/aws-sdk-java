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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for <a>CreateStack</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateStack" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name that's associated with the stack. The name must be unique in the Region in which you are creating the
     * stack.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case sensitive) and hyphens. It must start with an
     * alphabetical character and can't be longer than 128 characters.
     * </p>
     * </note>
     */
    private String stackName;
    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template anatomy</a>
     * in the <i>CloudFormation User Guide</i>.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that's
     * located in an Amazon S3 bucket or a Systems Manager document. For more information, go to the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template anatomy</a>
     * in the <i>CloudFormation User Guide</i>. The location for an Amazon S3 bucket must start with
     * <code>https://</code>.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     */
    private String templateURL;
    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters for the stack. For more information,
     * see the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a> data
     * type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Parameter> parameters;
    /**
     * <p>
     * Set to <code>true</code> to disable rollback of the stack if stack creation failed. You can specify either
     * <code>DisableRollback</code> or <code>OnFailure</code>, but not both.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean disableRollback;
    /**
     * <p>
     * The rollback triggers for CloudFormation to monitor during stack creation and updating operations, and for the
     * specified monitoring period afterwards.
     * </p>
     */
    private RollbackConfiguration rollbackConfiguration;
    /**
     * <p>
     * The amount of time that can pass before the stack status becomes <code>CREATE_FAILED</code>; if
     * <code>DisableRollback</code> is not set or is set to <code>false</code>, the stack will be rolled back.
     * </p>
     */
    private Integer timeoutInMinutes;
    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related events. You can find your
     * Amazon SNS topic ARNs using the Amazon SNS console or your Command Line Interface (CLI).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> notificationARNs;
    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in order
     * for CloudFormation to create the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your Amazon Web Services account; for
     * example, by creating new Identity and Access Management (IAM) users. For those stacks, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     * <code>CAPABILITY_NAMED_IAM</code> capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, CloudFormation returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions associated with
     * them and edit their permissions if necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::
     * IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::
     * Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">AWS
     * ::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::
     * Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">AWS::IAM::Role
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::
     * User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some template contain macros. Macros perform custom processing on templates; this can include simple actions like
     * find-and-replace operations, all the way to extensive transformations of entire templates. Because of this, users
     * typically create a change set from the processed template, so that they can review the changes resulting from the
     * macros before actually creating the stack. If your stack template contains one or more macros, and you choose to
     * create a stack directly from the processed template, without first reviewing the resulting changes in a change
     * set, you must acknowledge this capability. This includes the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by CloudFormation.
     * </p>
     * <p>
     * If you want to create a stack from a stack template that contains macros <i>and</i> nested stacks, you must
     * create the stack directly from the template using this capability.
     * </p>
     * <important>
     * <p>
     * You should only create stacks directly from a stack template that contains macros if you know what processing the
     * macro performs.
     * </p>
     * <p>
     * Each macro relies on an underlying Lambda service function for processing stack templates. Be aware that the
     * Lambda function owner can update the function operation without CloudFormation being notified.
     * </p>
     * </important>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using CloudFormation
     * macros to perform custom processing on templates</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> capabilities;
    /**
     * <p>
     * The template resource types that you have permissions to work with for this create stack action, such as
     * <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>. Use the
     * following syntax to describe template resource types: <code>AWS::*</code> (for all Amazon Web Services
     * resources), <code>Custom::*</code> (for all custom resources), <code>Custom::<i>logical_ID</i> </code> (for a
     * specific custom resource), <code>AWS::<i>service_name</i>::*</code> (for all resources of a particular Amazon Web
     * Services service), and <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code> (for a specific Amazon
     * Web Services resource).
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're creating, the stack creation fails. By
     * default, CloudFormation grants permissions to all resource types. Identity and Access Management (IAM) uses this
     * parameter for CloudFormation-specific condition keys in IAM policies. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling Access
     * with Identity and Access Management</a>.
     * </p>
     * <note>
     * <p>
     * Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypes;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFormation assumes to
     * create the stack. CloudFormation uses the role's credentials to make calls on your behalf. CloudFormation always
     * uses this role for all future operations on the stack. Provided that users have permission to operate on the
     * stack, CloudFormation uses this role even if the users don't have permission to pass it. Ensure that the role
     * grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, CloudFormation uses the role that was previously associated with the stack. If no
     * role is available, CloudFormation uses a temporary session that's generated from your user credentials.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * Determines what action will be taken if stack creation fails. This must be one of: <code>DO_NOTHING</code>,
     * <code>ROLLBACK</code>, or <code>DELETE</code>. You can specify either <code>OnFailure</code> or
     * <code>DisableRollback</code>, but not both.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     */
    private String onFailure;
    /**
     * <p>
     * Structure containing the stack policy body. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"> Prevent
     * Updates to Stack Resources</a> in the <i>CloudFormation User Guide</i>. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     */
    private String stackPolicyBody;
    /**
     * <p>
     * Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB) located in
     * an S3 bucket in the same Region as the stack. The location for an Amazon S3 bucket must start with
     * <code>https://</code>. You can specify either the <code>StackPolicyBody</code> or the <code>StackPolicyURL</code>
     * parameter, but not both.
     * </p>
     */
    private String stackPolicyURL;
    /**
     * <p>
     * Key-value pairs to associate with this stack. CloudFormation also propagates these tags to the resources created
     * in the stack. A maximum number of 50 tags can be specified.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * A unique identifier for this <code>CreateStack</code> request. Specify this token if you plan to retry requests
     * so that CloudFormation knows that you're not attempting to create a stack with the same name. You might retry
     * <code>CreateStack</code> requests to ensure that CloudFormation successfully received them.
     * </p>
     * <p>
     * All events initiated by a given stack operation are assigned the same client request token, which you can use to
     * track operations. For example, if you execute a <code>CreateStack</code> operation with the token
     * <code>token1</code>, then all the <code>StackEvents</code> generated by that operation will have
     * <code>ClientRequestToken</code> set as <code>token1</code>.
     * </p>
     * <p>
     * In the console, stack operations display the client request token on the Events tab. Stack operations that are
     * initiated from the console use the token format <i>Console-StackOperation-ID</i>, which helps you easily identify
     * the stack operation . For example, if you create a stack using the console, each stack event would be assigned
     * the same token in the following format: <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Whether to enable termination protection on the specified stack. If a user attempts to delete a stack with
     * termination protection enabled, the operation fails and the stack remains unchanged. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html">Protecting a
     * Stack From Being Deleted</a> in the <i>CloudFormation User Guide</i>. Termination protection is deactivated on
     * stacks by default.
     * </p>
     * <p>
     * For <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     * stacks</a>, termination protection is set on the root stack and can't be changed directly on the nested stack.
     * </p>
     */
    private Boolean enableTerminationProtection;
    /**
     * <p>
     * When set to <code>true</code>, newly created resources are deleted when the operation rolls back. This includes
     * newly created resources marked with a deletion policy of <code>Retain</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean retainExceptOnCreate;

    /**
     * <p>
     * The name that's associated with the stack. The name must be unique in the Region in which you are creating the
     * stack.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case sensitive) and hyphens. It must start with an
     * alphabetical character and can't be longer than 128 characters.
     * </p>
     * </note>
     * 
     * @param stackName
     *        The name that's associated with the stack. The name must be unique in the Region in which you are creating
     *        the stack.</p> <note>
     *        <p>
     *        A stack name can contain only alphanumeric characters (case sensitive) and hyphens. It must start with an
     *        alphabetical character and can't be longer than 128 characters.
     *        </p>
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name that's associated with the stack. The name must be unique in the Region in which you are creating the
     * stack.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case sensitive) and hyphens. It must start with an
     * alphabetical character and can't be longer than 128 characters.
     * </p>
     * </note>
     * 
     * @return The name that's associated with the stack. The name must be unique in the Region in which you are
     *         creating the stack.</p> <note>
     *         <p>
     *         A stack name can contain only alphanumeric characters (case sensitive) and hyphens. It must start with an
     *         alphabetical character and can't be longer than 128 characters.
     *         </p>
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name that's associated with the stack. The name must be unique in the Region in which you are creating the
     * stack.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case sensitive) and hyphens. It must start with an
     * alphabetical character and can't be longer than 128 characters.
     * </p>
     * </note>
     * 
     * @param stackName
     *        The name that's associated with the stack. The name must be unique in the Region in which you are creating
     *        the stack.</p> <note>
     *        <p>
     *        A stack name can contain only alphanumeric characters (case sensitive) and hyphens. It must start with an
     *        alphabetical character and can't be longer than 128 characters.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template anatomy</a>
     * in the <i>CloudFormation User Guide</i>.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     * 
     * @param templateBody
     *        Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *        bytes. For more information, go to <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        anatomy</a> in the <i>CloudFormation User Guide</i>.</p>
     *        <p>
     *        Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code>
     *        parameter, but not both.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template anatomy</a>
     * in the <i>CloudFormation User Guide</i>.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     * 
     * @return Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *         bytes. For more information, go to <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         anatomy</a> in the <i>CloudFormation User Guide</i>.</p>
     *         <p>
     *         Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code>
     *         parameter, but not both.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template anatomy</a>
     * in the <i>CloudFormation User Guide</i>.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     * 
     * @param templateBody
     *        Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *        bytes. For more information, go to <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        anatomy</a> in the <i>CloudFormation User Guide</i>.</p>
     *        <p>
     *        Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code>
     *        parameter, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that's
     * located in an Amazon S3 bucket or a Systems Manager document. For more information, go to the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template anatomy</a>
     * in the <i>CloudFormation User Guide</i>. The location for an Amazon S3 bucket must start with
     * <code>https://</code>.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     * 
     * @param templateURL
     *        Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes)
     *        that's located in an Amazon S3 bucket or a Systems Manager document. For more information, go to the <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        anatomy</a> in the <i>CloudFormation User Guide</i>. The location for an Amazon S3 bucket must start with
     *        <code>https://</code>.</p>
     *        <p>
     *        Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code>
     *        parameter, but not both.
     */

    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that's
     * located in an Amazon S3 bucket or a Systems Manager document. For more information, go to the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template anatomy</a>
     * in the <i>CloudFormation User Guide</i>. The location for an Amazon S3 bucket must start with
     * <code>https://</code>.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     * 
     * @return Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes)
     *         that's located in an Amazon S3 bucket or a Systems Manager document. For more information, go to the <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         anatomy</a> in the <i>CloudFormation User Guide</i>. The location for an Amazon S3 bucket must start with
     *         <code>https://</code>.</p>
     *         <p>
     *         Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code>
     *         parameter, but not both.
     */

    public String getTemplateURL() {
        return this.templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that's
     * located in an Amazon S3 bucket or a Systems Manager document. For more information, go to the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template anatomy</a>
     * in the <i>CloudFormation User Guide</i>. The location for an Amazon S3 bucket must start with
     * <code>https://</code>.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     * 
     * @param templateURL
     *        Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes)
     *        that's located in an Amazon S3 bucket or a Systems Manager document. For more information, go to the <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        anatomy</a> in the <i>CloudFormation User Guide</i>. The location for an Amazon S3 bucket must start with
     *        <code>https://</code>.</p>
     *        <p>
     *        Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code>
     *        parameter, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withTemplateURL(String templateURL) {
        setTemplateURL(templateURL);
        return this;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters for the stack. For more information,
     * see the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a> data
     * type.
     * </p>
     * 
     * @return A list of <code>Parameter</code> structures that specify input parameters for the stack. For more
     *         information, see the <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a>
     *         data type.
     */

    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<Parameter>();
        }
        return parameters;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters for the stack. For more information,
     * see the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a> data
     * type.
     * </p>
     * 
     * @param parameters
     *        A list of <code>Parameter</code> structures that specify input parameters for the stack. For more
     *        information, see the <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a>
     *        data type.
     */

    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new com.amazonaws.internal.SdkInternalList<Parameter>(parameters);
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters for the stack. For more information,
     * see the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a> data
     * type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        A list of <code>Parameter</code> structures that specify input parameters for the stack. For more
     *        information, see the <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a>
     *        data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withParameters(Parameter... parameters) {
        if (this.parameters == null) {
            setParameters(new com.amazonaws.internal.SdkInternalList<Parameter>(parameters.length));
        }
        for (Parameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters for the stack. For more information,
     * see the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a> data
     * type.
     * </p>
     * 
     * @param parameters
     *        A list of <code>Parameter</code> structures that specify input parameters for the stack. For more
     *        information, see the <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a>
     *        data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to disable rollback of the stack if stack creation failed. You can specify either
     * <code>DisableRollback</code> or <code>OnFailure</code>, but not both.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param disableRollback
     *        Set to <code>true</code> to disable rollback of the stack if stack creation failed. You can specify either
     *        <code>DisableRollback</code> or <code>OnFailure</code>, but not both.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
    }

    /**
     * <p>
     * Set to <code>true</code> to disable rollback of the stack if stack creation failed. You can specify either
     * <code>DisableRollback</code> or <code>OnFailure</code>, but not both.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Set to <code>true</code> to disable rollback of the stack if stack creation failed. You can specify
     *         either <code>DisableRollback</code> or <code>OnFailure</code>, but not both.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    /**
     * <p>
     * Set to <code>true</code> to disable rollback of the stack if stack creation failed. You can specify either
     * <code>DisableRollback</code> or <code>OnFailure</code>, but not both.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param disableRollback
     *        Set to <code>true</code> to disable rollback of the stack if stack creation failed. You can specify either
     *        <code>DisableRollback</code> or <code>OnFailure</code>, but not both.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withDisableRollback(Boolean disableRollback) {
        setDisableRollback(disableRollback);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to disable rollback of the stack if stack creation failed. You can specify either
     * <code>DisableRollback</code> or <code>OnFailure</code>, but not both.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Set to <code>true</code> to disable rollback of the stack if stack creation failed. You can specify
     *         either <code>DisableRollback</code> or <code>OnFailure</code>, but not both.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isDisableRollback() {
        return this.disableRollback;
    }

    /**
     * <p>
     * The rollback triggers for CloudFormation to monitor during stack creation and updating operations, and for the
     * specified monitoring period afterwards.
     * </p>
     * 
     * @param rollbackConfiguration
     *        The rollback triggers for CloudFormation to monitor during stack creation and updating operations, and for
     *        the specified monitoring period afterwards.
     */

    public void setRollbackConfiguration(RollbackConfiguration rollbackConfiguration) {
        this.rollbackConfiguration = rollbackConfiguration;
    }

    /**
     * <p>
     * The rollback triggers for CloudFormation to monitor during stack creation and updating operations, and for the
     * specified monitoring period afterwards.
     * </p>
     * 
     * @return The rollback triggers for CloudFormation to monitor during stack creation and updating operations, and
     *         for the specified monitoring period afterwards.
     */

    public RollbackConfiguration getRollbackConfiguration() {
        return this.rollbackConfiguration;
    }

    /**
     * <p>
     * The rollback triggers for CloudFormation to monitor during stack creation and updating operations, and for the
     * specified monitoring period afterwards.
     * </p>
     * 
     * @param rollbackConfiguration
     *        The rollback triggers for CloudFormation to monitor during stack creation and updating operations, and for
     *        the specified monitoring period afterwards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withRollbackConfiguration(RollbackConfiguration rollbackConfiguration) {
        setRollbackConfiguration(rollbackConfiguration);
        return this;
    }

    /**
     * <p>
     * The amount of time that can pass before the stack status becomes <code>CREATE_FAILED</code>; if
     * <code>DisableRollback</code> is not set or is set to <code>false</code>, the stack will be rolled back.
     * </p>
     * 
     * @param timeoutInMinutes
     *        The amount of time that can pass before the stack status becomes <code>CREATE_FAILED</code>; if
     *        <code>DisableRollback</code> is not set or is set to <code>false</code>, the stack will be rolled back.
     */

    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    /**
     * <p>
     * The amount of time that can pass before the stack status becomes <code>CREATE_FAILED</code>; if
     * <code>DisableRollback</code> is not set or is set to <code>false</code>, the stack will be rolled back.
     * </p>
     * 
     * @return The amount of time that can pass before the stack status becomes <code>CREATE_FAILED</code>; if
     *         <code>DisableRollback</code> is not set or is set to <code>false</code>, the stack will be rolled back.
     */

    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    /**
     * <p>
     * The amount of time that can pass before the stack status becomes <code>CREATE_FAILED</code>; if
     * <code>DisableRollback</code> is not set or is set to <code>false</code>, the stack will be rolled back.
     * </p>
     * 
     * @param timeoutInMinutes
     *        The amount of time that can pass before the stack status becomes <code>CREATE_FAILED</code>; if
     *        <code>DisableRollback</code> is not set or is set to <code>false</code>, the stack will be rolled back.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withTimeoutInMinutes(Integer timeoutInMinutes) {
        setTimeoutInMinutes(timeoutInMinutes);
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related events. You can find your
     * Amazon SNS topic ARNs using the Amazon SNS console or your Command Line Interface (CLI).
     * </p>
     * 
     * @return The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related events. You can
     *         find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line Interface (CLI).
     */

    public java.util.List<String> getNotificationARNs() {
        if (notificationARNs == null) {
            notificationARNs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return notificationARNs;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related events. You can find your
     * Amazon SNS topic ARNs using the Amazon SNS console or your Command Line Interface (CLI).
     * </p>
     * 
     * @param notificationARNs
     *        The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related events. You can
     *        find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line Interface (CLI).
     */

    public void setNotificationARNs(java.util.Collection<String> notificationARNs) {
        if (notificationARNs == null) {
            this.notificationARNs = null;
            return;
        }

        this.notificationARNs = new com.amazonaws.internal.SdkInternalList<String>(notificationARNs);
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related events. You can find your
     * Amazon SNS topic ARNs using the Amazon SNS console or your Command Line Interface (CLI).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationARNs(java.util.Collection)} or {@link #withNotificationARNs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param notificationARNs
     *        The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related events. You can
     *        find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line Interface (CLI).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withNotificationARNs(String... notificationARNs) {
        if (this.notificationARNs == null) {
            setNotificationARNs(new com.amazonaws.internal.SdkInternalList<String>(notificationARNs.length));
        }
        for (String ele : notificationARNs) {
            this.notificationARNs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related events. You can find your
     * Amazon SNS topic ARNs using the Amazon SNS console or your Command Line Interface (CLI).
     * </p>
     * 
     * @param notificationARNs
     *        The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related events. You can
     *        find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line Interface (CLI).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withNotificationARNs(java.util.Collection<String> notificationARNs) {
        setNotificationARNs(notificationARNs);
        return this;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in order
     * for CloudFormation to create the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your Amazon Web Services account; for
     * example, by creating new Identity and Access Management (IAM) users. For those stacks, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     * <code>CAPABILITY_NAMED_IAM</code> capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, CloudFormation returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions associated with
     * them and edit their permissions if necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::
     * IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::
     * Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">AWS
     * ::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::
     * Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">AWS::IAM::Role
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::
     * User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some template contain macros. Macros perform custom processing on templates; this can include simple actions like
     * find-and-replace operations, all the way to extensive transformations of entire templates. Because of this, users
     * typically create a change set from the processed template, so that they can review the changes resulting from the
     * macros before actually creating the stack. If your stack template contains one or more macros, and you choose to
     * create a stack directly from the processed template, without first reviewing the resulting changes in a change
     * set, you must acknowledge this capability. This includes the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by CloudFormation.
     * </p>
     * <p>
     * If you want to create a stack from a stack template that contains macros <i>and</i> nested stacks, you must
     * create the stack directly from the template using this capability.
     * </p>
     * <important>
     * <p>
     * You should only create stacks directly from a stack template that contains macros if you know what processing the
     * macro performs.
     * </p>
     * <p>
     * Each macro relies on an underlying Lambda service function for processing stack templates. Be aware that the
     * Lambda function owner can update the function operation without CloudFormation being notified.
     * </p>
     * </important>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using CloudFormation
     * macros to perform custom processing on templates</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     * </p>
     * </note>
     * 
     * @return In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in
     *         order for CloudFormation to create the stack.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *         </p>
     *         <p>
     *         Some stack templates might include resources that can affect permissions in your Amazon Web Services
     *         account; for example, by creating new Identity and Access Management (IAM) users. For those stacks, you
     *         must explicitly acknowledge this by specifying one of these capabilities.
     *         </p>
     *         <p>
     *         The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     *         <code>CAPABILITY_NAMED_IAM</code> capability.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you have IAM resources, you can specify either capability.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you don't specify either of these capabilities, CloudFormation returns an
     *         <code>InsufficientCapabilities</code> error.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If your stack template contains these resources, we recommend that you review all permissions associated
     *         with them and edit their permissions if necessary.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html"
     *         >AWS::IAM::AccessKey</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS
     *         ::IAM::Group</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     *         >AWS::IAM::InstanceProfile</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     *         AWS::IAM::Policy</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">AWS::
     *         IAM::Role</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS
     *         ::IAM::User</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html"
     *         >AWS::IAM::UserToGroupAddition</a>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *         >Acknowledging IAM Resources in CloudFormation Templates</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CAPABILITY_AUTO_EXPAND</code>
     *         </p>
     *         <p>
     *         Some template contain macros. Macros perform custom processing on templates; this can include simple
     *         actions like find-and-replace operations, all the way to extensive transformations of entire templates.
     *         Because of this, users typically create a change set from the processed template, so that they can review
     *         the changes resulting from the macros before actually creating the stack. If your stack template contains
     *         one or more macros, and you choose to create a stack directly from the processed template, without first
     *         reviewing the resulting changes in a change set, you must acknowledge this capability. This includes the
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *         >AWS::Include</a> and <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *         >AWS::Serverless</a> transforms, which are macros hosted by CloudFormation.
     *         </p>
     *         <p>
     *         If you want to create a stack from a stack template that contains macros <i>and</i> nested stacks, you
     *         must create the stack directly from the template using this capability.
     *         </p>
     *         <important>
     *         <p>
     *         You should only create stacks directly from a stack template that contains macros if you know what
     *         processing the macro performs.
     *         </p>
     *         <p>
     *         Each macro relies on an underlying Lambda service function for processing stack templates. Be aware that
     *         the Lambda function owner can update the function operation without CloudFormation being notified.
     *         </p>
     *         </important>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using
     *         CloudFormation macros to perform custom processing on templates</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     *         </p>
     * @see Capability
     */

    public java.util.List<String> getCapabilities() {
        if (capabilities == null) {
            capabilities = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return capabilities;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in order
     * for CloudFormation to create the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your Amazon Web Services account; for
     * example, by creating new Identity and Access Management (IAM) users. For those stacks, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     * <code>CAPABILITY_NAMED_IAM</code> capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, CloudFormation returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions associated with
     * them and edit their permissions if necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::
     * IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::
     * Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">AWS
     * ::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::
     * Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">AWS::IAM::Role
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::
     * User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some template contain macros. Macros perform custom processing on templates; this can include simple actions like
     * find-and-replace operations, all the way to extensive transformations of entire templates. Because of this, users
     * typically create a change set from the processed template, so that they can review the changes resulting from the
     * macros before actually creating the stack. If your stack template contains one or more macros, and you choose to
     * create a stack directly from the processed template, without first reviewing the resulting changes in a change
     * set, you must acknowledge this capability. This includes the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by CloudFormation.
     * </p>
     * <p>
     * If you want to create a stack from a stack template that contains macros <i>and</i> nested stacks, you must
     * create the stack directly from the template using this capability.
     * </p>
     * <important>
     * <p>
     * You should only create stacks directly from a stack template that contains macros if you know what processing the
     * macro performs.
     * </p>
     * <p>
     * Each macro relies on an underlying Lambda service function for processing stack templates. Be aware that the
     * Lambda function owner can update the function operation without CloudFormation being notified.
     * </p>
     * </important>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using CloudFormation
     * macros to perform custom processing on templates</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     * </p>
     * </note>
     * 
     * @param capabilities
     *        In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in
     *        order for CloudFormation to create the stack.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *        </p>
     *        <p>
     *        Some stack templates might include resources that can affect permissions in your Amazon Web Services
     *        account; for example, by creating new Identity and Access Management (IAM) users. For those stacks, you
     *        must explicitly acknowledge this by specifying one of these capabilities.
     *        </p>
     *        <p>
     *        The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     *        <code>CAPABILITY_NAMED_IAM</code> capability.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you have IAM resources, you can specify either capability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't specify either of these capabilities, CloudFormation returns an
     *        <code>InsufficientCapabilities</code> error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If your stack template contains these resources, we recommend that you review all permissions associated
     *        with them and edit their permissions if necessary.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     *        AWS::IAM::AccessKey</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS
     *        ::IAM::Group</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     *        >AWS::IAM::InstanceProfile</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS
     *        ::IAM::Policy</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">AWS::
     *        IAM::Role</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::
     *        IAM::User</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html"
     *        >AWS::IAM::UserToGroupAddition</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in CloudFormation Templates</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_AUTO_EXPAND</code>
     *        </p>
     *        <p>
     *        Some template contain macros. Macros perform custom processing on templates; this can include simple
     *        actions like find-and-replace operations, all the way to extensive transformations of entire templates.
     *        Because of this, users typically create a change set from the processed template, so that they can review
     *        the changes resulting from the macros before actually creating the stack. If your stack template contains
     *        one or more macros, and you choose to create a stack directly from the processed template, without first
     *        reviewing the resulting changes in a change set, you must acknowledge this capability. This includes the
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *        >AWS::Include</a> and <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *        >AWS::Serverless</a> transforms, which are macros hosted by CloudFormation.
     *        </p>
     *        <p>
     *        If you want to create a stack from a stack template that contains macros <i>and</i> nested stacks, you
     *        must create the stack directly from the template using this capability.
     *        </p>
     *        <important>
     *        <p>
     *        You should only create stacks directly from a stack template that contains macros if you know what
     *        processing the macro performs.
     *        </p>
     *        <p>
     *        Each macro relies on an underlying Lambda service function for processing stack templates. Be aware that
     *        the Lambda function owner can update the function operation without CloudFormation being notified.
     *        </p>
     *        </important>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using
     *        CloudFormation macros to perform custom processing on templates</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     *        </p>
     * @see Capability
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new com.amazonaws.internal.SdkInternalList<String>(capabilities);
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in order
     * for CloudFormation to create the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your Amazon Web Services account; for
     * example, by creating new Identity and Access Management (IAM) users. For those stacks, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     * <code>CAPABILITY_NAMED_IAM</code> capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, CloudFormation returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions associated with
     * them and edit their permissions if necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::
     * IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::
     * Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">AWS
     * ::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::
     * Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">AWS::IAM::Role
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::
     * User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some template contain macros. Macros perform custom processing on templates; this can include simple actions like
     * find-and-replace operations, all the way to extensive transformations of entire templates. Because of this, users
     * typically create a change set from the processed template, so that they can review the changes resulting from the
     * macros before actually creating the stack. If your stack template contains one or more macros, and you choose to
     * create a stack directly from the processed template, without first reviewing the resulting changes in a change
     * set, you must acknowledge this capability. This includes the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by CloudFormation.
     * </p>
     * <p>
     * If you want to create a stack from a stack template that contains macros <i>and</i> nested stacks, you must
     * create the stack directly from the template using this capability.
     * </p>
     * <important>
     * <p>
     * You should only create stacks directly from a stack template that contains macros if you know what processing the
     * macro performs.
     * </p>
     * <p>
     * Each macro relies on an underlying Lambda service function for processing stack templates. Be aware that the
     * Lambda function owner can update the function operation without CloudFormation being notified.
     * </p>
     * </important>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using CloudFormation
     * macros to perform custom processing on templates</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in
     *        order for CloudFormation to create the stack.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *        </p>
     *        <p>
     *        Some stack templates might include resources that can affect permissions in your Amazon Web Services
     *        account; for example, by creating new Identity and Access Management (IAM) users. For those stacks, you
     *        must explicitly acknowledge this by specifying one of these capabilities.
     *        </p>
     *        <p>
     *        The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     *        <code>CAPABILITY_NAMED_IAM</code> capability.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you have IAM resources, you can specify either capability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't specify either of these capabilities, CloudFormation returns an
     *        <code>InsufficientCapabilities</code> error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If your stack template contains these resources, we recommend that you review all permissions associated
     *        with them and edit their permissions if necessary.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     *        AWS::IAM::AccessKey</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS
     *        ::IAM::Group</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     *        >AWS::IAM::InstanceProfile</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS
     *        ::IAM::Policy</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">AWS::
     *        IAM::Role</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::
     *        IAM::User</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html"
     *        >AWS::IAM::UserToGroupAddition</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in CloudFormation Templates</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_AUTO_EXPAND</code>
     *        </p>
     *        <p>
     *        Some template contain macros. Macros perform custom processing on templates; this can include simple
     *        actions like find-and-replace operations, all the way to extensive transformations of entire templates.
     *        Because of this, users typically create a change set from the processed template, so that they can review
     *        the changes resulting from the macros before actually creating the stack. If your stack template contains
     *        one or more macros, and you choose to create a stack directly from the processed template, without first
     *        reviewing the resulting changes in a change set, you must acknowledge this capability. This includes the
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *        >AWS::Include</a> and <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *        >AWS::Serverless</a> transforms, which are macros hosted by CloudFormation.
     *        </p>
     *        <p>
     *        If you want to create a stack from a stack template that contains macros <i>and</i> nested stacks, you
     *        must create the stack directly from the template using this capability.
     *        </p>
     *        <important>
     *        <p>
     *        You should only create stacks directly from a stack template that contains macros if you know what
     *        processing the macro performs.
     *        </p>
     *        <p>
     *        Each macro relies on an underlying Lambda service function for processing stack templates. Be aware that
     *        the Lambda function owner can update the function operation without CloudFormation being notified.
     *        </p>
     *        </important>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using
     *        CloudFormation macros to perform custom processing on templates</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateStackRequest withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new com.amazonaws.internal.SdkInternalList<String>(capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in order
     * for CloudFormation to create the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your Amazon Web Services account; for
     * example, by creating new Identity and Access Management (IAM) users. For those stacks, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     * <code>CAPABILITY_NAMED_IAM</code> capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, CloudFormation returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions associated with
     * them and edit their permissions if necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::
     * IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::
     * Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">AWS
     * ::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::
     * Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">AWS::IAM::Role
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::
     * User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some template contain macros. Macros perform custom processing on templates; this can include simple actions like
     * find-and-replace operations, all the way to extensive transformations of entire templates. Because of this, users
     * typically create a change set from the processed template, so that they can review the changes resulting from the
     * macros before actually creating the stack. If your stack template contains one or more macros, and you choose to
     * create a stack directly from the processed template, without first reviewing the resulting changes in a change
     * set, you must acknowledge this capability. This includes the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by CloudFormation.
     * </p>
     * <p>
     * If you want to create a stack from a stack template that contains macros <i>and</i> nested stacks, you must
     * create the stack directly from the template using this capability.
     * </p>
     * <important>
     * <p>
     * You should only create stacks directly from a stack template that contains macros if you know what processing the
     * macro performs.
     * </p>
     * <p>
     * Each macro relies on an underlying Lambda service function for processing stack templates. Be aware that the
     * Lambda function owner can update the function operation without CloudFormation being notified.
     * </p>
     * </important>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using CloudFormation
     * macros to perform custom processing on templates</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     * </p>
     * </note>
     * 
     * @param capabilities
     *        In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in
     *        order for CloudFormation to create the stack.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *        </p>
     *        <p>
     *        Some stack templates might include resources that can affect permissions in your Amazon Web Services
     *        account; for example, by creating new Identity and Access Management (IAM) users. For those stacks, you
     *        must explicitly acknowledge this by specifying one of these capabilities.
     *        </p>
     *        <p>
     *        The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     *        <code>CAPABILITY_NAMED_IAM</code> capability.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you have IAM resources, you can specify either capability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't specify either of these capabilities, CloudFormation returns an
     *        <code>InsufficientCapabilities</code> error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If your stack template contains these resources, we recommend that you review all permissions associated
     *        with them and edit their permissions if necessary.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     *        AWS::IAM::AccessKey</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS
     *        ::IAM::Group</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     *        >AWS::IAM::InstanceProfile</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS
     *        ::IAM::Policy</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">AWS::
     *        IAM::Role</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::
     *        IAM::User</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html"
     *        >AWS::IAM::UserToGroupAddition</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in CloudFormation Templates</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_AUTO_EXPAND</code>
     *        </p>
     *        <p>
     *        Some template contain macros. Macros perform custom processing on templates; this can include simple
     *        actions like find-and-replace operations, all the way to extensive transformations of entire templates.
     *        Because of this, users typically create a change set from the processed template, so that they can review
     *        the changes resulting from the macros before actually creating the stack. If your stack template contains
     *        one or more macros, and you choose to create a stack directly from the processed template, without first
     *        reviewing the resulting changes in a change set, you must acknowledge this capability. This includes the
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *        >AWS::Include</a> and <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *        >AWS::Serverless</a> transforms, which are macros hosted by CloudFormation.
     *        </p>
     *        <p>
     *        If you want to create a stack from a stack template that contains macros <i>and</i> nested stacks, you
     *        must create the stack directly from the template using this capability.
     *        </p>
     *        <important>
     *        <p>
     *        You should only create stacks directly from a stack template that contains macros if you know what
     *        processing the macro performs.
     *        </p>
     *        <p>
     *        Each macro relies on an underlying Lambda service function for processing stack templates. Be aware that
     *        the Lambda function owner can update the function operation without CloudFormation being notified.
     *        </p>
     *        </important>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using
     *        CloudFormation macros to perform custom processing on templates</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateStackRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in order
     * for CloudFormation to create the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your Amazon Web Services account; for
     * example, by creating new Identity and Access Management (IAM) users. For those stacks, you must explicitly
     * acknowledge this by specifying one of these capabilities.
     * </p>
     * <p>
     * The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     * <code>CAPABILITY_NAMED_IAM</code> capability.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you have IAM resources, you can specify either capability.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you don't specify either of these capabilities, CloudFormation returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions associated with
     * them and edit their permissions if necessary.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::
     * IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::
     * Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">AWS
     * ::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::
     * Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">AWS::IAM::Role
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::
     * User</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in CloudFormation Templates</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CAPABILITY_AUTO_EXPAND</code>
     * </p>
     * <p>
     * Some template contain macros. Macros perform custom processing on templates; this can include simple actions like
     * find-and-replace operations, all the way to extensive transformations of entire templates. Because of this, users
     * typically create a change set from the processed template, so that they can review the changes resulting from the
     * macros before actually creating the stack. If your stack template contains one or more macros, and you choose to
     * create a stack directly from the processed template, without first reviewing the resulting changes in a change
     * set, you must acknowledge this capability. This includes the <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by CloudFormation.
     * </p>
     * <p>
     * If you want to create a stack from a stack template that contains macros <i>and</i> nested stacks, you must
     * create the stack directly from the template using this capability.
     * </p>
     * <important>
     * <p>
     * You should only create stacks directly from a stack template that contains macros if you know what processing the
     * macro performs.
     * </p>
     * <p>
     * Each macro relies on an underlying Lambda service function for processing stack templates. Be aware that the
     * Lambda function owner can update the function operation without CloudFormation being notified.
     * </p>
     * </important>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using CloudFormation
     * macros to perform custom processing on templates</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     * </p>
     * </note>
     * 
     * @param capabilities
     *        In some cases, you must explicitly acknowledge that your stack template contains certain capabilities in
     *        order for CloudFormation to create the stack.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *        </p>
     *        <p>
     *        Some stack templates might include resources that can affect permissions in your Amazon Web Services
     *        account; for example, by creating new Identity and Access Management (IAM) users. For those stacks, you
     *        must explicitly acknowledge this by specifying one of these capabilities.
     *        </p>
     *        <p>
     *        The following IAM resources require you to specify either the <code>CAPABILITY_IAM</code> or
     *        <code>CAPABILITY_NAMED_IAM</code> capability.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you have IAM resources, you can specify either capability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you have IAM resources with custom names, you <i>must</i> specify <code>CAPABILITY_NAMED_IAM</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you don't specify either of these capabilities, CloudFormation returns an
     *        <code>InsufficientCapabilities</code> error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If your stack template contains these resources, we recommend that you review all permissions associated
     *        with them and edit their permissions if necessary.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     *        AWS::IAM::AccessKey</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS
     *        ::IAM::Group</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html"
     *        >AWS::IAM::InstanceProfile</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS
     *        ::IAM::Policy</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">AWS::
     *        IAM::Role</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::
     *        IAM::User</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html"
     *        >AWS::IAM::UserToGroupAddition</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in CloudFormation Templates</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_AUTO_EXPAND</code>
     *        </p>
     *        <p>
     *        Some template contain macros. Macros perform custom processing on templates; this can include simple
     *        actions like find-and-replace operations, all the way to extensive transformations of entire templates.
     *        Because of this, users typically create a change set from the processed template, so that they can review
     *        the changes resulting from the macros before actually creating the stack. If your stack template contains
     *        one or more macros, and you choose to create a stack directly from the processed template, without first
     *        reviewing the resulting changes in a change set, you must acknowledge this capability. This includes the
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *        >AWS::Include</a> and <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *        >AWS::Serverless</a> transforms, which are macros hosted by CloudFormation.
     *        </p>
     *        <p>
     *        If you want to create a stack from a stack template that contains macros <i>and</i> nested stacks, you
     *        must create the stack directly from the template using this capability.
     *        </p>
     *        <important>
     *        <p>
     *        You should only create stacks directly from a stack template that contains macros if you know what
     *        processing the macro performs.
     *        </p>
     *        <p>
     *        Each macro relies on an underlying Lambda service function for processing stack templates. Be aware that
     *        the Lambda function owner can update the function operation without CloudFormation being notified.
     *        </p>
     *        </important>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using
     *        CloudFormation macros to perform custom processing on templates</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateStackRequest withCapabilities(Capability... capabilities) {
        com.amazonaws.internal.SdkInternalList<String> capabilitiesCopy = new com.amazonaws.internal.SdkInternalList<String>(capabilities.length);
        for (Capability value : capabilities) {
            capabilitiesCopy.add(value.toString());
        }
        if (getCapabilities() == null) {
            setCapabilities(capabilitiesCopy);
        } else {
            getCapabilities().addAll(capabilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The template resource types that you have permissions to work with for this create stack action, such as
     * <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>. Use the
     * following syntax to describe template resource types: <code>AWS::*</code> (for all Amazon Web Services
     * resources), <code>Custom::*</code> (for all custom resources), <code>Custom::<i>logical_ID</i> </code> (for a
     * specific custom resource), <code>AWS::<i>service_name</i>::*</code> (for all resources of a particular Amazon Web
     * Services service), and <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code> (for a specific Amazon
     * Web Services resource).
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're creating, the stack creation fails. By
     * default, CloudFormation grants permissions to all resource types. Identity and Access Management (IAM) uses this
     * parameter for CloudFormation-specific condition keys in IAM policies. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling Access
     * with Identity and Access Management</a>.
     * </p>
     * <note>
     * <p>
     * Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     * </p>
     * </note>
     * 
     * @return The template resource types that you have permissions to work with for this create stack action, such as
     *         <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>. Use
     *         the following syntax to describe template resource types: <code>AWS::*</code> (for all Amazon Web
     *         Services resources), <code>Custom::*</code> (for all custom resources),
     *         <code>Custom::<i>logical_ID</i> </code> (for a specific custom resource),
     *         <code>AWS::<i>service_name</i>::*</code> (for all resources of a particular Amazon Web Services service),
     *         and <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code> (for a specific Amazon Web
     *         Services resource).</p>
     *         <p>
     *         If the list of resource types doesn't include a resource that you're creating, the stack creation fails.
     *         By default, CloudFormation grants permissions to all resource types. Identity and Access Management (IAM)
     *         uses this parameter for CloudFormation-specific condition keys in IAM policies. For more information, see
     *         <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">
     *         Controlling Access with Identity and Access Management</a>.
     *         </p>
     *         <note>
     *         <p>
     *         Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     *         </p>
     */

    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypes;
    }

    /**
     * <p>
     * The template resource types that you have permissions to work with for this create stack action, such as
     * <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>. Use the
     * following syntax to describe template resource types: <code>AWS::*</code> (for all Amazon Web Services
     * resources), <code>Custom::*</code> (for all custom resources), <code>Custom::<i>logical_ID</i> </code> (for a
     * specific custom resource), <code>AWS::<i>service_name</i>::*</code> (for all resources of a particular Amazon Web
     * Services service), and <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code> (for a specific Amazon
     * Web Services resource).
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're creating, the stack creation fails. By
     * default, CloudFormation grants permissions to all resource types. Identity and Access Management (IAM) uses this
     * parameter for CloudFormation-specific condition keys in IAM policies. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling Access
     * with Identity and Access Management</a>.
     * </p>
     * <note>
     * <p>
     * Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     * </p>
     * </note>
     * 
     * @param resourceTypes
     *        The template resource types that you have permissions to work with for this create stack action, such as
     *        <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>. Use
     *        the following syntax to describe template resource types: <code>AWS::*</code> (for all Amazon Web Services
     *        resources), <code>Custom::*</code> (for all custom resources), <code>Custom::<i>logical_ID</i> </code>
     *        (for a specific custom resource), <code>AWS::<i>service_name</i>::*</code> (for all resources of a
     *        particular Amazon Web Services service), and
     *        <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code> (for a specific Amazon Web Services
     *        resource).</p>
     *        <p>
     *        If the list of resource types doesn't include a resource that you're creating, the stack creation fails.
     *        By default, CloudFormation grants permissions to all resource types. Identity and Access Management (IAM)
     *        uses this parameter for CloudFormation-specific condition keys in IAM policies. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">
     *        Controlling Access with Identity and Access Management</a>.
     *        </p>
     *        <note>
     *        <p>
     *        Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     *        </p>
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new com.amazonaws.internal.SdkInternalList<String>(resourceTypes);
    }

    /**
     * <p>
     * The template resource types that you have permissions to work with for this create stack action, such as
     * <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>. Use the
     * following syntax to describe template resource types: <code>AWS::*</code> (for all Amazon Web Services
     * resources), <code>Custom::*</code> (for all custom resources), <code>Custom::<i>logical_ID</i> </code> (for a
     * specific custom resource), <code>AWS::<i>service_name</i>::*</code> (for all resources of a particular Amazon Web
     * Services service), and <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code> (for a specific Amazon
     * Web Services resource).
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're creating, the stack creation fails. By
     * default, CloudFormation grants permissions to all resource types. Identity and Access Management (IAM) uses this
     * parameter for CloudFormation-specific condition keys in IAM policies. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling Access
     * with Identity and Access Management</a>.
     * </p>
     * <note>
     * <p>
     * Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The template resource types that you have permissions to work with for this create stack action, such as
     *        <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>. Use
     *        the following syntax to describe template resource types: <code>AWS::*</code> (for all Amazon Web Services
     *        resources), <code>Custom::*</code> (for all custom resources), <code>Custom::<i>logical_ID</i> </code>
     *        (for a specific custom resource), <code>AWS::<i>service_name</i>::*</code> (for all resources of a
     *        particular Amazon Web Services service), and
     *        <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code> (for a specific Amazon Web Services
     *        resource).</p>
     *        <p>
     *        If the list of resource types doesn't include a resource that you're creating, the stack creation fails.
     *        By default, CloudFormation grants permissions to all resource types. Identity and Access Management (IAM)
     *        uses this parameter for CloudFormation-specific condition keys in IAM policies. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">
     *        Controlling Access with Identity and Access Management</a>.
     *        </p>
     *        <note>
     *        <p>
     *        Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The template resource types that you have permissions to work with for this create stack action, such as
     * <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>. Use the
     * following syntax to describe template resource types: <code>AWS::*</code> (for all Amazon Web Services
     * resources), <code>Custom::*</code> (for all custom resources), <code>Custom::<i>logical_ID</i> </code> (for a
     * specific custom resource), <code>AWS::<i>service_name</i>::*</code> (for all resources of a particular Amazon Web
     * Services service), and <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code> (for a specific Amazon
     * Web Services resource).
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're creating, the stack creation fails. By
     * default, CloudFormation grants permissions to all resource types. Identity and Access Management (IAM) uses this
     * parameter for CloudFormation-specific condition keys in IAM policies. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling Access
     * with Identity and Access Management</a>.
     * </p>
     * <note>
     * <p>
     * Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     * </p>
     * </note>
     * 
     * @param resourceTypes
     *        The template resource types that you have permissions to work with for this create stack action, such as
     *        <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>. Use
     *        the following syntax to describe template resource types: <code>AWS::*</code> (for all Amazon Web Services
     *        resources), <code>Custom::*</code> (for all custom resources), <code>Custom::<i>logical_ID</i> </code>
     *        (for a specific custom resource), <code>AWS::<i>service_name</i>::*</code> (for all resources of a
     *        particular Amazon Web Services service), and
     *        <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i> </code> (for a specific Amazon Web Services
     *        resource).</p>
     *        <p>
     *        If the list of resource types doesn't include a resource that you're creating, the stack creation fails.
     *        By default, CloudFormation grants permissions to all resource types. Identity and Access Management (IAM)
     *        uses this parameter for CloudFormation-specific condition keys in IAM policies. For more information, see
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">
     *        Controlling Access with Identity and Access Management</a>.
     *        </p>
     *        <note>
     *        <p>
     *        Only one of the <code>Capabilities</code> and <code>ResourceType</code> parameters can be specified.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFormation assumes to
     * create the stack. CloudFormation uses the role's credentials to make calls on your behalf. CloudFormation always
     * uses this role for all future operations on the stack. Provided that users have permission to operate on the
     * stack, CloudFormation uses this role even if the users don't have permission to pass it. Ensure that the role
     * grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, CloudFormation uses the role that was previously associated with the stack. If no
     * role is available, CloudFormation uses a temporary session that's generated from your user credentials.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFormation assumes
     *        to create the stack. CloudFormation uses the role's credentials to make calls on your behalf.
     *        CloudFormation always uses this role for all future operations on the stack. Provided that users have
     *        permission to operate on the stack, CloudFormation uses this role even if the users don't have permission
     *        to pass it. Ensure that the role grants least privilege.</p>
     *        <p>
     *        If you don't specify a value, CloudFormation uses the role that was previously associated with the stack.
     *        If no role is available, CloudFormation uses a temporary session that's generated from your user
     *        credentials.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFormation assumes to
     * create the stack. CloudFormation uses the role's credentials to make calls on your behalf. CloudFormation always
     * uses this role for all future operations on the stack. Provided that users have permission to operate on the
     * stack, CloudFormation uses this role even if the users don't have permission to pass it. Ensure that the role
     * grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, CloudFormation uses the role that was previously associated with the stack. If no
     * role is available, CloudFormation uses a temporary session that's generated from your user credentials.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFormation
     *         assumes to create the stack. CloudFormation uses the role's credentials to make calls on your behalf.
     *         CloudFormation always uses this role for all future operations on the stack. Provided that users have
     *         permission to operate on the stack, CloudFormation uses this role even if the users don't have permission
     *         to pass it. Ensure that the role grants least privilege.</p>
     *         <p>
     *         If you don't specify a value, CloudFormation uses the role that was previously associated with the stack.
     *         If no role is available, CloudFormation uses a temporary session that's generated from your user
     *         credentials.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFormation assumes to
     * create the stack. CloudFormation uses the role's credentials to make calls on your behalf. CloudFormation always
     * uses this role for all future operations on the stack. Provided that users have permission to operate on the
     * stack, CloudFormation uses this role even if the users don't have permission to pass it. Ensure that the role
     * grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, CloudFormation uses the role that was previously associated with the stack. If no
     * role is available, CloudFormation uses a temporary session that's generated from your user credentials.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that CloudFormation assumes
     *        to create the stack. CloudFormation uses the role's credentials to make calls on your behalf.
     *        CloudFormation always uses this role for all future operations on the stack. Provided that users have
     *        permission to operate on the stack, CloudFormation uses this role even if the users don't have permission
     *        to pass it. Ensure that the role grants least privilege.</p>
     *        <p>
     *        If you don't specify a value, CloudFormation uses the role that was previously associated with the stack.
     *        If no role is available, CloudFormation uses a temporary session that's generated from your user
     *        credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * Determines what action will be taken if stack creation fails. This must be one of: <code>DO_NOTHING</code>,
     * <code>ROLLBACK</code>, or <code>DELETE</code>. You can specify either <code>OnFailure</code> or
     * <code>DisableRollback</code>, but not both.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     * 
     * @param onFailure
     *        Determines what action will be taken if stack creation fails. This must be one of: <code>DO_NOTHING</code>
     *        , <code>ROLLBACK</code>, or <code>DELETE</code>. You can specify either <code>OnFailure</code> or
     *        <code>DisableRollback</code>, but not both.</p>
     *        <p>
     *        Default: <code>ROLLBACK</code>
     * @see OnFailure
     */

    public void setOnFailure(String onFailure) {
        this.onFailure = onFailure;
    }

    /**
     * <p>
     * Determines what action will be taken if stack creation fails. This must be one of: <code>DO_NOTHING</code>,
     * <code>ROLLBACK</code>, or <code>DELETE</code>. You can specify either <code>OnFailure</code> or
     * <code>DisableRollback</code>, but not both.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     * 
     * @return Determines what action will be taken if stack creation fails. This must be one of:
     *         <code>DO_NOTHING</code>, <code>ROLLBACK</code>, or <code>DELETE</code>. You can specify either
     *         <code>OnFailure</code> or <code>DisableRollback</code>, but not both.</p>
     *         <p>
     *         Default: <code>ROLLBACK</code>
     * @see OnFailure
     */

    public String getOnFailure() {
        return this.onFailure;
    }

    /**
     * <p>
     * Determines what action will be taken if stack creation fails. This must be one of: <code>DO_NOTHING</code>,
     * <code>ROLLBACK</code>, or <code>DELETE</code>. You can specify either <code>OnFailure</code> or
     * <code>DisableRollback</code>, but not both.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     * 
     * @param onFailure
     *        Determines what action will be taken if stack creation fails. This must be one of: <code>DO_NOTHING</code>
     *        , <code>ROLLBACK</code>, or <code>DELETE</code>. You can specify either <code>OnFailure</code> or
     *        <code>DisableRollback</code>, but not both.</p>
     *        <p>
     *        Default: <code>ROLLBACK</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnFailure
     */

    public CreateStackRequest withOnFailure(String onFailure) {
        setOnFailure(onFailure);
        return this;
    }

    /**
     * <p>
     * Determines what action will be taken if stack creation fails. This must be one of: <code>DO_NOTHING</code>,
     * <code>ROLLBACK</code>, or <code>DELETE</code>. You can specify either <code>OnFailure</code> or
     * <code>DisableRollback</code>, but not both.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     * 
     * @param onFailure
     *        Determines what action will be taken if stack creation fails. This must be one of: <code>DO_NOTHING</code>
     *        , <code>ROLLBACK</code>, or <code>DELETE</code>. You can specify either <code>OnFailure</code> or
     *        <code>DisableRollback</code>, but not both.</p>
     *        <p>
     *        Default: <code>ROLLBACK</code>
     * @see OnFailure
     */

    public void setOnFailure(OnFailure onFailure) {
        withOnFailure(onFailure);
    }

    /**
     * <p>
     * Determines what action will be taken if stack creation fails. This must be one of: <code>DO_NOTHING</code>,
     * <code>ROLLBACK</code>, or <code>DELETE</code>. You can specify either <code>OnFailure</code> or
     * <code>DisableRollback</code>, but not both.
     * </p>
     * <p>
     * Default: <code>ROLLBACK</code>
     * </p>
     * 
     * @param onFailure
     *        Determines what action will be taken if stack creation fails. This must be one of: <code>DO_NOTHING</code>
     *        , <code>ROLLBACK</code>, or <code>DELETE</code>. You can specify either <code>OnFailure</code> or
     *        <code>DisableRollback</code>, but not both.</p>
     *        <p>
     *        Default: <code>ROLLBACK</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnFailure
     */

    public CreateStackRequest withOnFailure(OnFailure onFailure) {
        this.onFailure = onFailure.toString();
        return this;
    }

    /**
     * <p>
     * Structure containing the stack policy body. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"> Prevent
     * Updates to Stack Resources</a> in the <i>CloudFormation User Guide</i>. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * 
     * @param stackPolicyBody
     *        Structure containing the stack policy body. For more information, go to <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     *        Prevent Updates to Stack Resources</a> in the <i>CloudFormation User Guide</i>. You can specify either the
     *        <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     */

    public void setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
    }

    /**
     * <p>
     * Structure containing the stack policy body. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"> Prevent
     * Updates to Stack Resources</a> in the <i>CloudFormation User Guide</i>. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * 
     * @return Structure containing the stack policy body. For more information, go to <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     *         Prevent Updates to Stack Resources</a> in the <i>CloudFormation User Guide</i>. You can specify either
     *         the <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     */

    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    /**
     * <p>
     * Structure containing the stack policy body. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"> Prevent
     * Updates to Stack Resources</a> in the <i>CloudFormation User Guide</i>. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * 
     * @param stackPolicyBody
     *        Structure containing the stack policy body. For more information, go to <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     *        Prevent Updates to Stack Resources</a> in the <i>CloudFormation User Guide</i>. You can specify either the
     *        <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withStackPolicyBody(String stackPolicyBody) {
        setStackPolicyBody(stackPolicyBody);
        return this;
    }

    /**
     * <p>
     * Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB) located in
     * an S3 bucket in the same Region as the stack. The location for an Amazon S3 bucket must start with
     * <code>https://</code>. You can specify either the <code>StackPolicyBody</code> or the <code>StackPolicyURL</code>
     * parameter, but not both.
     * </p>
     * 
     * @param stackPolicyURL
     *        Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB)
     *        located in an S3 bucket in the same Region as the stack. The location for an Amazon S3 bucket must start
     *        with <code>https://</code>. You can specify either the <code>StackPolicyBody</code> or the
     *        <code>StackPolicyURL</code> parameter, but not both.
     */

    public void setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
    }

    /**
     * <p>
     * Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB) located in
     * an S3 bucket in the same Region as the stack. The location for an Amazon S3 bucket must start with
     * <code>https://</code>. You can specify either the <code>StackPolicyBody</code> or the <code>StackPolicyURL</code>
     * parameter, but not both.
     * </p>
     * 
     * @return Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB)
     *         located in an S3 bucket in the same Region as the stack. The location for an Amazon S3 bucket must start
     *         with <code>https://</code>. You can specify either the <code>StackPolicyBody</code> or the
     *         <code>StackPolicyURL</code> parameter, but not both.
     */

    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    /**
     * <p>
     * Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB) located in
     * an S3 bucket in the same Region as the stack. The location for an Amazon S3 bucket must start with
     * <code>https://</code>. You can specify either the <code>StackPolicyBody</code> or the <code>StackPolicyURL</code>
     * parameter, but not both.
     * </p>
     * 
     * @param stackPolicyURL
     *        Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB)
     *        located in an S3 bucket in the same Region as the stack. The location for an Amazon S3 bucket must start
     *        with <code>https://</code>. You can specify either the <code>StackPolicyBody</code> or the
     *        <code>StackPolicyURL</code> parameter, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withStackPolicyURL(String stackPolicyURL) {
        setStackPolicyURL(stackPolicyURL);
        return this;
    }

    /**
     * <p>
     * Key-value pairs to associate with this stack. CloudFormation also propagates these tags to the resources created
     * in the stack. A maximum number of 50 tags can be specified.
     * </p>
     * 
     * @return Key-value pairs to associate with this stack. CloudFormation also propagates these tags to the resources
     *         created in the stack. A maximum number of 50 tags can be specified.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Key-value pairs to associate with this stack. CloudFormation also propagates these tags to the resources created
     * in the stack. A maximum number of 50 tags can be specified.
     * </p>
     * 
     * @param tags
     *        Key-value pairs to associate with this stack. CloudFormation also propagates these tags to the resources
     *        created in the stack. A maximum number of 50 tags can be specified.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Key-value pairs to associate with this stack. CloudFormation also propagates these tags to the resources created
     * in the stack. A maximum number of 50 tags can be specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs to associate with this stack. CloudFormation also propagates these tags to the resources
     *        created in the stack. A maximum number of 50 tags can be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Key-value pairs to associate with this stack. CloudFormation also propagates these tags to the resources created
     * in the stack. A maximum number of 50 tags can be specified.
     * </p>
     * 
     * @param tags
     *        Key-value pairs to associate with this stack. CloudFormation also propagates these tags to the resources
     *        created in the stack. A maximum number of 50 tags can be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateStack</code> request. Specify this token if you plan to retry requests
     * so that CloudFormation knows that you're not attempting to create a stack with the same name. You might retry
     * <code>CreateStack</code> requests to ensure that CloudFormation successfully received them.
     * </p>
     * <p>
     * All events initiated by a given stack operation are assigned the same client request token, which you can use to
     * track operations. For example, if you execute a <code>CreateStack</code> operation with the token
     * <code>token1</code>, then all the <code>StackEvents</code> generated by that operation will have
     * <code>ClientRequestToken</code> set as <code>token1</code>.
     * </p>
     * <p>
     * In the console, stack operations display the client request token on the Events tab. Stack operations that are
     * initiated from the console use the token format <i>Console-StackOperation-ID</i>, which helps you easily identify
     * the stack operation . For example, if you create a stack using the console, each stack event would be assigned
     * the same token in the following format: <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for this <code>CreateStack</code> request. Specify this token if you plan to retry
     *        requests so that CloudFormation knows that you're not attempting to create a stack with the same name. You
     *        might retry <code>CreateStack</code> requests to ensure that CloudFormation successfully received
     *        them.</p>
     *        <p>
     *        All events initiated by a given stack operation are assigned the same client request token, which you can
     *        use to track operations. For example, if you execute a <code>CreateStack</code> operation with the token
     *        <code>token1</code>, then all the <code>StackEvents</code> generated by that operation will have
     *        <code>ClientRequestToken</code> set as <code>token1</code>.
     *        </p>
     *        <p>
     *        In the console, stack operations display the client request token on the Events tab. Stack operations that
     *        are initiated from the console use the token format <i>Console-StackOperation-ID</i>, which helps you
     *        easily identify the stack operation . For example, if you create a stack using the console, each stack
     *        event would be assigned the same token in the following format:
     *        <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateStack</code> request. Specify this token if you plan to retry requests
     * so that CloudFormation knows that you're not attempting to create a stack with the same name. You might retry
     * <code>CreateStack</code> requests to ensure that CloudFormation successfully received them.
     * </p>
     * <p>
     * All events initiated by a given stack operation are assigned the same client request token, which you can use to
     * track operations. For example, if you execute a <code>CreateStack</code> operation with the token
     * <code>token1</code>, then all the <code>StackEvents</code> generated by that operation will have
     * <code>ClientRequestToken</code> set as <code>token1</code>.
     * </p>
     * <p>
     * In the console, stack operations display the client request token on the Events tab. Stack operations that are
     * initiated from the console use the token format <i>Console-StackOperation-ID</i>, which helps you easily identify
     * the stack operation . For example, if you create a stack using the console, each stack event would be assigned
     * the same token in the following format: <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     * </p>
     * 
     * @return A unique identifier for this <code>CreateStack</code> request. Specify this token if you plan to retry
     *         requests so that CloudFormation knows that you're not attempting to create a stack with the same name.
     *         You might retry <code>CreateStack</code> requests to ensure that CloudFormation successfully received
     *         them.</p>
     *         <p>
     *         All events initiated by a given stack operation are assigned the same client request token, which you can
     *         use to track operations. For example, if you execute a <code>CreateStack</code> operation with the token
     *         <code>token1</code>, then all the <code>StackEvents</code> generated by that operation will have
     *         <code>ClientRequestToken</code> set as <code>token1</code>.
     *         </p>
     *         <p>
     *         In the console, stack operations display the client request token on the Events tab. Stack operations
     *         that are initiated from the console use the token format <i>Console-StackOperation-ID</i>, which helps
     *         you easily identify the stack operation . For example, if you create a stack using the console, each
     *         stack event would be assigned the same token in the following format:
     *         <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateStack</code> request. Specify this token if you plan to retry requests
     * so that CloudFormation knows that you're not attempting to create a stack with the same name. You might retry
     * <code>CreateStack</code> requests to ensure that CloudFormation successfully received them.
     * </p>
     * <p>
     * All events initiated by a given stack operation are assigned the same client request token, which you can use to
     * track operations. For example, if you execute a <code>CreateStack</code> operation with the token
     * <code>token1</code>, then all the <code>StackEvents</code> generated by that operation will have
     * <code>ClientRequestToken</code> set as <code>token1</code>.
     * </p>
     * <p>
     * In the console, stack operations display the client request token on the Events tab. Stack operations that are
     * initiated from the console use the token format <i>Console-StackOperation-ID</i>, which helps you easily identify
     * the stack operation . For example, if you create a stack using the console, each stack event would be assigned
     * the same token in the following format: <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for this <code>CreateStack</code> request. Specify this token if you plan to retry
     *        requests so that CloudFormation knows that you're not attempting to create a stack with the same name. You
     *        might retry <code>CreateStack</code> requests to ensure that CloudFormation successfully received
     *        them.</p>
     *        <p>
     *        All events initiated by a given stack operation are assigned the same client request token, which you can
     *        use to track operations. For example, if you execute a <code>CreateStack</code> operation with the token
     *        <code>token1</code>, then all the <code>StackEvents</code> generated by that operation will have
     *        <code>ClientRequestToken</code> set as <code>token1</code>.
     *        </p>
     *        <p>
     *        In the console, stack operations display the client request token on the Events tab. Stack operations that
     *        are initiated from the console use the token format <i>Console-StackOperation-ID</i>, which helps you
     *        easily identify the stack operation . For example, if you create a stack using the console, each stack
     *        event would be assigned the same token in the following format:
     *        <code>Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Whether to enable termination protection on the specified stack. If a user attempts to delete a stack with
     * termination protection enabled, the operation fails and the stack remains unchanged. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html">Protecting a
     * Stack From Being Deleted</a> in the <i>CloudFormation User Guide</i>. Termination protection is deactivated on
     * stacks by default.
     * </p>
     * <p>
     * For <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     * stacks</a>, termination protection is set on the root stack and can't be changed directly on the nested stack.
     * </p>
     * 
     * @param enableTerminationProtection
     *        Whether to enable termination protection on the specified stack. If a user attempts to delete a stack with
     *        termination protection enabled, the operation fails and the stack remains unchanged. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html">
     *        Protecting a Stack From Being Deleted</a> in the <i>CloudFormation User Guide</i>. Termination protection
     *        is deactivated on stacks by default.</p>
     *        <p>
     *        For <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">
     *        nested stacks</a>, termination protection is set on the root stack and can't be changed directly on the
     *        nested stack.
     */

    public void setEnableTerminationProtection(Boolean enableTerminationProtection) {
        this.enableTerminationProtection = enableTerminationProtection;
    }

    /**
     * <p>
     * Whether to enable termination protection on the specified stack. If a user attempts to delete a stack with
     * termination protection enabled, the operation fails and the stack remains unchanged. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html">Protecting a
     * Stack From Being Deleted</a> in the <i>CloudFormation User Guide</i>. Termination protection is deactivated on
     * stacks by default.
     * </p>
     * <p>
     * For <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     * stacks</a>, termination protection is set on the root stack and can't be changed directly on the nested stack.
     * </p>
     * 
     * @return Whether to enable termination protection on the specified stack. If a user attempts to delete a stack
     *         with termination protection enabled, the operation fails and the stack remains unchanged. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     *         >Protecting a Stack From Being Deleted</a> in the <i>CloudFormation User Guide</i>. Termination
     *         protection is deactivated on stacks by default.</p>
     *         <p>
     *         For <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     *         stacks</a>, termination protection is set on the root stack and can't be changed directly on the nested
     *         stack.
     */

    public Boolean getEnableTerminationProtection() {
        return this.enableTerminationProtection;
    }

    /**
     * <p>
     * Whether to enable termination protection on the specified stack. If a user attempts to delete a stack with
     * termination protection enabled, the operation fails and the stack remains unchanged. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html">Protecting a
     * Stack From Being Deleted</a> in the <i>CloudFormation User Guide</i>. Termination protection is deactivated on
     * stacks by default.
     * </p>
     * <p>
     * For <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     * stacks</a>, termination protection is set on the root stack and can't be changed directly on the nested stack.
     * </p>
     * 
     * @param enableTerminationProtection
     *        Whether to enable termination protection on the specified stack. If a user attempts to delete a stack with
     *        termination protection enabled, the operation fails and the stack remains unchanged. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html">
     *        Protecting a Stack From Being Deleted</a> in the <i>CloudFormation User Guide</i>. Termination protection
     *        is deactivated on stacks by default.</p>
     *        <p>
     *        For <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">
     *        nested stacks</a>, termination protection is set on the root stack and can't be changed directly on the
     *        nested stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withEnableTerminationProtection(Boolean enableTerminationProtection) {
        setEnableTerminationProtection(enableTerminationProtection);
        return this;
    }

    /**
     * <p>
     * Whether to enable termination protection on the specified stack. If a user attempts to delete a stack with
     * termination protection enabled, the operation fails and the stack remains unchanged. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html">Protecting a
     * Stack From Being Deleted</a> in the <i>CloudFormation User Guide</i>. Termination protection is deactivated on
     * stacks by default.
     * </p>
     * <p>
     * For <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     * stacks</a>, termination protection is set on the root stack and can't be changed directly on the nested stack.
     * </p>
     * 
     * @return Whether to enable termination protection on the specified stack. If a user attempts to delete a stack
     *         with termination protection enabled, the operation fails and the stack remains unchanged. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     *         >Protecting a Stack From Being Deleted</a> in the <i>CloudFormation User Guide</i>. Termination
     *         protection is deactivated on stacks by default.</p>
     *         <p>
     *         For <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     *         stacks</a>, termination protection is set on the root stack and can't be changed directly on the nested
     *         stack.
     */

    public Boolean isEnableTerminationProtection() {
        return this.enableTerminationProtection;
    }

    /**
     * <p>
     * When set to <code>true</code>, newly created resources are deleted when the operation rolls back. This includes
     * newly created resources marked with a deletion policy of <code>Retain</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param retainExceptOnCreate
     *        When set to <code>true</code>, newly created resources are deleted when the operation rolls back. This
     *        includes newly created resources marked with a deletion policy of <code>Retain</code>.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setRetainExceptOnCreate(Boolean retainExceptOnCreate) {
        this.retainExceptOnCreate = retainExceptOnCreate;
    }

    /**
     * <p>
     * When set to <code>true</code>, newly created resources are deleted when the operation rolls back. This includes
     * newly created resources marked with a deletion policy of <code>Retain</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return When set to <code>true</code>, newly created resources are deleted when the operation rolls back. This
     *         includes newly created resources marked with a deletion policy of <code>Retain</code>.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getRetainExceptOnCreate() {
        return this.retainExceptOnCreate;
    }

    /**
     * <p>
     * When set to <code>true</code>, newly created resources are deleted when the operation rolls back. This includes
     * newly created resources marked with a deletion policy of <code>Retain</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param retainExceptOnCreate
     *        When set to <code>true</code>, newly created resources are deleted when the operation rolls back. This
     *        includes newly created resources marked with a deletion policy of <code>Retain</code>.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackRequest withRetainExceptOnCreate(Boolean retainExceptOnCreate) {
        setRetainExceptOnCreate(retainExceptOnCreate);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, newly created resources are deleted when the operation rolls back. This includes
     * newly created resources marked with a deletion policy of <code>Retain</code>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return When set to <code>true</code>, newly created resources are deleted when the operation rolls back. This
     *         includes newly created resources marked with a deletion policy of <code>Retain</code>.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isRetainExceptOnCreate() {
        return this.retainExceptOnCreate;
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getTemplateURL() != null)
            sb.append("TemplateURL: ").append(getTemplateURL()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getDisableRollback() != null)
            sb.append("DisableRollback: ").append(getDisableRollback()).append(",");
        if (getRollbackConfiguration() != null)
            sb.append("RollbackConfiguration: ").append(getRollbackConfiguration()).append(",");
        if (getTimeoutInMinutes() != null)
            sb.append("TimeoutInMinutes: ").append(getTimeoutInMinutes()).append(",");
        if (getNotificationARNs() != null)
            sb.append("NotificationARNs: ").append(getNotificationARNs()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getOnFailure() != null)
            sb.append("OnFailure: ").append(getOnFailure()).append(",");
        if (getStackPolicyBody() != null)
            sb.append("StackPolicyBody: ").append(getStackPolicyBody()).append(",");
        if (getStackPolicyURL() != null)
            sb.append("StackPolicyURL: ").append(getStackPolicyURL()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getEnableTerminationProtection() != null)
            sb.append("EnableTerminationProtection: ").append(getEnableTerminationProtection()).append(",");
        if (getRetainExceptOnCreate() != null)
            sb.append("RetainExceptOnCreate: ").append(getRetainExceptOnCreate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStackRequest == false)
            return false;
        CreateStackRequest other = (CreateStackRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getTemplateURL() == null ^ this.getTemplateURL() == null)
            return false;
        if (other.getTemplateURL() != null && other.getTemplateURL().equals(this.getTemplateURL()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getDisableRollback() == null ^ this.getDisableRollback() == null)
            return false;
        if (other.getDisableRollback() != null && other.getDisableRollback().equals(this.getDisableRollback()) == false)
            return false;
        if (other.getRollbackConfiguration() == null ^ this.getRollbackConfiguration() == null)
            return false;
        if (other.getRollbackConfiguration() != null && other.getRollbackConfiguration().equals(this.getRollbackConfiguration()) == false)
            return false;
        if (other.getTimeoutInMinutes() == null ^ this.getTimeoutInMinutes() == null)
            return false;
        if (other.getTimeoutInMinutes() != null && other.getTimeoutInMinutes().equals(this.getTimeoutInMinutes()) == false)
            return false;
        if (other.getNotificationARNs() == null ^ this.getNotificationARNs() == null)
            return false;
        if (other.getNotificationARNs() != null && other.getNotificationARNs().equals(this.getNotificationARNs()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getOnFailure() == null ^ this.getOnFailure() == null)
            return false;
        if (other.getOnFailure() != null && other.getOnFailure().equals(this.getOnFailure()) == false)
            return false;
        if (other.getStackPolicyBody() == null ^ this.getStackPolicyBody() == null)
            return false;
        if (other.getStackPolicyBody() != null && other.getStackPolicyBody().equals(this.getStackPolicyBody()) == false)
            return false;
        if (other.getStackPolicyURL() == null ^ this.getStackPolicyURL() == null)
            return false;
        if (other.getStackPolicyURL() != null && other.getStackPolicyURL().equals(this.getStackPolicyURL()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getEnableTerminationProtection() == null ^ this.getEnableTerminationProtection() == null)
            return false;
        if (other.getEnableTerminationProtection() != null && other.getEnableTerminationProtection().equals(this.getEnableTerminationProtection()) == false)
            return false;
        if (other.getRetainExceptOnCreate() == null ^ this.getRetainExceptOnCreate() == null)
            return false;
        if (other.getRetainExceptOnCreate() != null && other.getRetainExceptOnCreate().equals(this.getRetainExceptOnCreate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getTemplateURL() == null) ? 0 : getTemplateURL().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getDisableRollback() == null) ? 0 : getDisableRollback().hashCode());
        hashCode = prime * hashCode + ((getRollbackConfiguration() == null) ? 0 : getRollbackConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode + ((getNotificationARNs() == null) ? 0 : getNotificationARNs().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getOnFailure() == null) ? 0 : getOnFailure().hashCode());
        hashCode = prime * hashCode + ((getStackPolicyBody() == null) ? 0 : getStackPolicyBody().hashCode());
        hashCode = prime * hashCode + ((getStackPolicyURL() == null) ? 0 : getStackPolicyURL().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getEnableTerminationProtection() == null) ? 0 : getEnableTerminationProtection().hashCode());
        hashCode = prime * hashCode + ((getRetainExceptOnCreate() == null) ? 0 : getRetainExceptOnCreate().hashCode());
        return hashCode;
    }

    @Override
    public CreateStackRequest clone() {
        return (CreateStackRequest) super.clone();
    }

}
