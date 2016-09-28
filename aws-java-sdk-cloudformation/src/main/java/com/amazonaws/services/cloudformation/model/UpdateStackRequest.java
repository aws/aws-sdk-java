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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for an <a>UpdateStack</a> action.
 * </p>
 */
public class UpdateStackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or unique stack ID of the stack to update.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. (For
     * more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template that is located in an Amazon S3
     * bucket. For more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     */
    private String templateURL;
    /**
     * <p>
     * Reuse the existing template that is associated with the stack that you are updating.
     * </p>
     */
    private Boolean usePreviousTemplate;
    /**
     * <p>
     * Structure containing the temporary overriding stack policy body. You can specify either the
     * <code>StackPolicyDuringUpdateBody</code> or the <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding stack policy during this update. If you
     * do not specify a stack policy, the current policy that is associated with the stack will be used.
     * </p>
     */
    private String stackPolicyDuringUpdateBody;
    /**
     * <p>
     * Location of a file containing the temporary overriding stack policy. The URL must point to a policy (max size:
     * 16KB) located in an S3 bucket in the same region as the stack. You can specify either the
     * <code>StackPolicyDuringUpdateBody</code> or the <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding stack policy during this update. If you
     * do not specify a stack policy, the current policy that is associated with the stack will be used.
     * </p>
     */
    private String stackPolicyDuringUpdateURL;
    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters for the stack. For more information,
     * see the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a> data
     * type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Parameter> parameters;
    /**
     * <p>
     * A list of values that you must specify before AWS CloudFormation can update certain stacks. Some stack templates
     * might include resources that can affect permissions in your AWS account, for example, by creating new AWS
     * Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge their capabilities
     * by specifying this parameter.
     * </p>
     * <p>
     * The only valid values are <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>. The following
     * resources require you to specify this parameter: <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>, and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>. If your stack template contains these resources, we recommend that you review
     * all permissions associated with them and edit their permissions if necessary.
     * </p>
     * <p>
     * If you have IAM resources, you can specify either capability. If you have IAM resources with custom names, you
     * must specify <code>CAPABILITY_NAMED_IAM</code>. If you don't specify this parameter, this action returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> capabilities;
    /**
     * <p>
     * The template resource types that you have permissions to work with for this update stack action, such as
     * <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're updating, the stack update fails. By
     * default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management (IAM)
     * uses this parameter for AWS CloudFormation-specific condition keys in IAM policies. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling Access
     * with AWS Identity and Access Management</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypes;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     * assumes to update the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf. AWS
     * CloudFormation always uses this role for all future operations on the stack. As long as users have permission to
     * operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to pass it.
     * Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * Structure containing a new stack policy body. You can specify either the <code>StackPolicyBody</code> or the
     * <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new resource that you created during a
     * stack update. If you do not specify a stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     */
    private String stackPolicyBody;
    /**
     * <p>
     * Location of a file containing the updated stack policy. The URL must point to a policy (max size: 16KB) located
     * in an S3 bucket in the same region as the stack. You can specify either the <code>StackPolicyBody</code> or the
     * <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new resource that you created during a
     * stack update. If you do not specify a stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     */
    private String stackPolicyURL;
    /**
     * <p>
     * Amazon Simple Notification Service topic Amazon Resource Names (ARNs) that AWS CloudFormation associates with the
     * stack. Specify an empty list to remove all notification topics.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> notificationARNs;
    /**
     * <p>
     * Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to supported
     * resources in the stack. You can specify a maximum number of 10 tags.
     * </p>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If you specify an empty
     * value, AWS CloudFormation removes all associated tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name or unique stack ID of the stack to update.
     * </p>
     * 
     * @param stackName
     *        The name or unique stack ID of the stack to update.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or unique stack ID of the stack to update.
     * </p>
     * 
     * @return The name or unique stack ID of the stack to update.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name or unique stack ID of the stack to update.
     * </p>
     * 
     * @param stackName
     *        The name or unique stack ID of the stack to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. (For
     * more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     * 
     * @param templateBody
     *        Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *        bytes. (For more information, go to <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.)</p>
     *        <p>
     *        Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code>
     *        parameter, but not both.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. (For
     * more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     * 
     * @return Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *         bytes. (For more information, go to <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide.)</p>
     *         <p>
     *         Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code>
     *         parameter, but not both.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. (For
     * more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.)
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     * 
     * @param templateBody
     *        Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *        bytes. (For more information, go to <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.)</p>
     *        <p>
     *        Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code>
     *        parameter, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template that is located in an Amazon S3
     * bucket. For more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     * 
     * @param templateURL
     *        Location of file containing the template body. The URL must point to a template that is located in an
     *        Amazon S3 bucket. For more information, go to <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code>
     *        parameter, but not both.
     */

    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template that is located in an Amazon S3
     * bucket. For more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     * 
     * @return Location of file containing the template body. The URL must point to a template that is located in an
     *         Amazon S3 bucket. For more information, go to <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *         <p>
     *         Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code>
     *         parameter, but not both.
     */

    public String getTemplateURL() {
        return this.templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template that is located in an Amazon S3
     * bucket. For more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code> parameter, but
     * not both.
     * </p>
     * 
     * @param templateURL
     *        Location of file containing the template body. The URL must point to a template that is located in an
     *        Amazon S3 bucket. For more information, go to <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify either the <code>TemplateBody</code> or the <code>TemplateURL</code>
     *        parameter, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withTemplateURL(String templateURL) {
        setTemplateURL(templateURL);
        return this;
    }

    /**
     * <p>
     * Reuse the existing template that is associated with the stack that you are updating.
     * </p>
     * 
     * @param usePreviousTemplate
     *        Reuse the existing template that is associated with the stack that you are updating.
     */

    public void setUsePreviousTemplate(Boolean usePreviousTemplate) {
        this.usePreviousTemplate = usePreviousTemplate;
    }

    /**
     * <p>
     * Reuse the existing template that is associated with the stack that you are updating.
     * </p>
     * 
     * @return Reuse the existing template that is associated with the stack that you are updating.
     */

    public Boolean getUsePreviousTemplate() {
        return this.usePreviousTemplate;
    }

    /**
     * <p>
     * Reuse the existing template that is associated with the stack that you are updating.
     * </p>
     * 
     * @param usePreviousTemplate
     *        Reuse the existing template that is associated with the stack that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withUsePreviousTemplate(Boolean usePreviousTemplate) {
        setUsePreviousTemplate(usePreviousTemplate);
        return this;
    }

    /**
     * <p>
     * Reuse the existing template that is associated with the stack that you are updating.
     * </p>
     * 
     * @return Reuse the existing template that is associated with the stack that you are updating.
     */

    public Boolean isUsePreviousTemplate() {
        return this.usePreviousTemplate;
    }

    /**
     * <p>
     * Structure containing the temporary overriding stack policy body. You can specify either the
     * <code>StackPolicyDuringUpdateBody</code> or the <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding stack policy during this update. If you
     * do not specify a stack policy, the current policy that is associated with the stack will be used.
     * </p>
     * 
     * @param stackPolicyDuringUpdateBody
     *        Structure containing the temporary overriding stack policy body. You can specify either the
     *        <code>StackPolicyDuringUpdateBody</code> or the <code>StackPolicyDuringUpdateURL</code> parameter, but not
     *        both.</p>
     *        <p>
     *        If you want to update protected resources, specify a temporary overriding stack policy during this update.
     *        If you do not specify a stack policy, the current policy that is associated with the stack will be used.
     */

    public void setStackPolicyDuringUpdateBody(String stackPolicyDuringUpdateBody) {
        this.stackPolicyDuringUpdateBody = stackPolicyDuringUpdateBody;
    }

    /**
     * <p>
     * Structure containing the temporary overriding stack policy body. You can specify either the
     * <code>StackPolicyDuringUpdateBody</code> or the <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding stack policy during this update. If you
     * do not specify a stack policy, the current policy that is associated with the stack will be used.
     * </p>
     * 
     * @return Structure containing the temporary overriding stack policy body. You can specify either the
     *         <code>StackPolicyDuringUpdateBody</code> or the <code>StackPolicyDuringUpdateURL</code> parameter, but
     *         not both.</p>
     *         <p>
     *         If you want to update protected resources, specify a temporary overriding stack policy during this
     *         update. If you do not specify a stack policy, the current policy that is associated with the stack will
     *         be used.
     */

    public String getStackPolicyDuringUpdateBody() {
        return this.stackPolicyDuringUpdateBody;
    }

    /**
     * <p>
     * Structure containing the temporary overriding stack policy body. You can specify either the
     * <code>StackPolicyDuringUpdateBody</code> or the <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding stack policy during this update. If you
     * do not specify a stack policy, the current policy that is associated with the stack will be used.
     * </p>
     * 
     * @param stackPolicyDuringUpdateBody
     *        Structure containing the temporary overriding stack policy body. You can specify either the
     *        <code>StackPolicyDuringUpdateBody</code> or the <code>StackPolicyDuringUpdateURL</code> parameter, but not
     *        both.</p>
     *        <p>
     *        If you want to update protected resources, specify a temporary overriding stack policy during this update.
     *        If you do not specify a stack policy, the current policy that is associated with the stack will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withStackPolicyDuringUpdateBody(String stackPolicyDuringUpdateBody) {
        setStackPolicyDuringUpdateBody(stackPolicyDuringUpdateBody);
        return this;
    }

    /**
     * <p>
     * Location of a file containing the temporary overriding stack policy. The URL must point to a policy (max size:
     * 16KB) located in an S3 bucket in the same region as the stack. You can specify either the
     * <code>StackPolicyDuringUpdateBody</code> or the <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding stack policy during this update. If you
     * do not specify a stack policy, the current policy that is associated with the stack will be used.
     * </p>
     * 
     * @param stackPolicyDuringUpdateURL
     *        Location of a file containing the temporary overriding stack policy. The URL must point to a policy (max
     *        size: 16KB) located in an S3 bucket in the same region as the stack. You can specify either the
     *        <code>StackPolicyDuringUpdateBody</code> or the <code>StackPolicyDuringUpdateURL</code> parameter, but not
     *        both.</p>
     *        <p>
     *        If you want to update protected resources, specify a temporary overriding stack policy during this update.
     *        If you do not specify a stack policy, the current policy that is associated with the stack will be used.
     */

    public void setStackPolicyDuringUpdateURL(String stackPolicyDuringUpdateURL) {
        this.stackPolicyDuringUpdateURL = stackPolicyDuringUpdateURL;
    }

    /**
     * <p>
     * Location of a file containing the temporary overriding stack policy. The URL must point to a policy (max size:
     * 16KB) located in an S3 bucket in the same region as the stack. You can specify either the
     * <code>StackPolicyDuringUpdateBody</code> or the <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding stack policy during this update. If you
     * do not specify a stack policy, the current policy that is associated with the stack will be used.
     * </p>
     * 
     * @return Location of a file containing the temporary overriding stack policy. The URL must point to a policy (max
     *         size: 16KB) located in an S3 bucket in the same region as the stack. You can specify either the
     *         <code>StackPolicyDuringUpdateBody</code> or the <code>StackPolicyDuringUpdateURL</code> parameter, but
     *         not both.</p>
     *         <p>
     *         If you want to update protected resources, specify a temporary overriding stack policy during this
     *         update. If you do not specify a stack policy, the current policy that is associated with the stack will
     *         be used.
     */

    public String getStackPolicyDuringUpdateURL() {
        return this.stackPolicyDuringUpdateURL;
    }

    /**
     * <p>
     * Location of a file containing the temporary overriding stack policy. The URL must point to a policy (max size:
     * 16KB) located in an S3 bucket in the same region as the stack. You can specify either the
     * <code>StackPolicyDuringUpdateBody</code> or the <code>StackPolicyDuringUpdateURL</code> parameter, but not both.
     * </p>
     * <p>
     * If you want to update protected resources, specify a temporary overriding stack policy during this update. If you
     * do not specify a stack policy, the current policy that is associated with the stack will be used.
     * </p>
     * 
     * @param stackPolicyDuringUpdateURL
     *        Location of a file containing the temporary overriding stack policy. The URL must point to a policy (max
     *        size: 16KB) located in an S3 bucket in the same region as the stack. You can specify either the
     *        <code>StackPolicyDuringUpdateBody</code> or the <code>StackPolicyDuringUpdateURL</code> parameter, but not
     *        both.</p>
     *        <p>
     *        If you want to update protected resources, specify a temporary overriding stack policy during this update.
     *        If you do not specify a stack policy, the current policy that is associated with the stack will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withStackPolicyDuringUpdateURL(String stackPolicyDuringUpdateURL) {
        setStackPolicyDuringUpdateURL(stackPolicyDuringUpdateURL);
        return this;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters for the stack. For more information,
     * see the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a> data
     * type.
     * </p>
     * 
     * @return A list of <code>Parameter</code> structures that specify input parameters for the stack. For more
     *         information, see the <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a>
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
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a> data
     * type.
     * </p>
     * 
     * @param parameters
     *        A list of <code>Parameter</code> structures that specify input parameters for the stack. For more
     *        information, see the <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a>
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
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a> data
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
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a>
     *        data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withParameters(Parameter... parameters) {
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
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a> data
     * type.
     * </p>
     * 
     * @param parameters
     *        A list of <code>Parameter</code> structures that specify input parameters for the stack. For more
     *        information, see the <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_Parameter.html">Parameter</a>
     *        data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * A list of values that you must specify before AWS CloudFormation can update certain stacks. Some stack templates
     * might include resources that can affect permissions in your AWS account, for example, by creating new AWS
     * Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge their capabilities
     * by specifying this parameter.
     * </p>
     * <p>
     * The only valid values are <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>. The following
     * resources require you to specify this parameter: <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>, and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>. If your stack template contains these resources, we recommend that you review
     * all permissions associated with them and edit their permissions if necessary.
     * </p>
     * <p>
     * If you have IAM resources, you can specify either capability. If you have IAM resources with custom names, you
     * must specify <code>CAPABILITY_NAMED_IAM</code>. If you don't specify this parameter, this action returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * 
     * @return A list of values that you must specify before AWS CloudFormation can update certain stacks. Some stack
     *         templates might include resources that can affect permissions in your AWS account, for example, by
     *         creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly
     *         acknowledge their capabilities by specifying this parameter.</p>
     *         <p>
     *         The only valid values are <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>. The
     *         following resources require you to specify this parameter: <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     *         AWS::IAM::AccessKey</a>, <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     *         AWS::IAM::Group</a>, <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     *         AWS::IAM::InstanceProfile</a>, <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     *         AWS::IAM::Policy</a>, <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     *         AWS::IAM::Role</a>, <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     *         AWS::IAM::User</a>, and <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     *         AWS::IAM::UserToGroupAddition</a>. If your stack template contains these resources, we recommend that you
     *         review all permissions associated with them and edit their permissions if necessary.
     *         </p>
     *         <p>
     *         If you have IAM resources, you can specify either capability. If you have IAM resources with custom
     *         names, you must specify <code>CAPABILITY_NAMED_IAM</code>. If you don't specify this parameter, this
     *         action returns an <code>InsufficientCapabilities</code> error.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *         >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
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
     * A list of values that you must specify before AWS CloudFormation can update certain stacks. Some stack templates
     * might include resources that can affect permissions in your AWS account, for example, by creating new AWS
     * Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge their capabilities
     * by specifying this parameter.
     * </p>
     * <p>
     * The only valid values are <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>. The following
     * resources require you to specify this parameter: <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>, and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>. If your stack template contains these resources, we recommend that you review
     * all permissions associated with them and edit their permissions if necessary.
     * </p>
     * <p>
     * If you have IAM resources, you can specify either capability. If you have IAM resources with custom names, you
     * must specify <code>CAPABILITY_NAMED_IAM</code>. If you don't specify this parameter, this action returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * 
     * @param capabilities
     *        A list of values that you must specify before AWS CloudFormation can update certain stacks. Some stack
     *        templates might include resources that can affect permissions in your AWS account, for example, by
     *        creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly
     *        acknowledge their capabilities by specifying this parameter.</p>
     *        <p>
     *        The only valid values are <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>. The following
     *        resources require you to specify this parameter: <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     *        AWS::IAM::AccessKey</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     *        AWS::IAM::Group</a>, <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     *        AWS::IAM::InstanceProfile</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     *        AWS::IAM::Policy</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     *        AWS::IAM::Role</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     *        AWS::IAM::User</a>, and <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     *        AWS::IAM::UserToGroupAddition</a>. If your stack template contains these resources, we recommend that you
     *        review all permissions associated with them and edit their permissions if necessary.
     *        </p>
     *        <p>
     *        If you have IAM resources, you can specify either capability. If you have IAM resources with custom names,
     *        you must specify <code>CAPABILITY_NAMED_IAM</code>. If you don't specify this parameter, this action
     *        returns an <code>InsufficientCapabilities</code> error.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
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
     * A list of values that you must specify before AWS CloudFormation can update certain stacks. Some stack templates
     * might include resources that can affect permissions in your AWS account, for example, by creating new AWS
     * Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge their capabilities
     * by specifying this parameter.
     * </p>
     * <p>
     * The only valid values are <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>. The following
     * resources require you to specify this parameter: <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>, and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>. If your stack template contains these resources, we recommend that you review
     * all permissions associated with them and edit their permissions if necessary.
     * </p>
     * <p>
     * If you have IAM resources, you can specify either capability. If you have IAM resources with custom names, you
     * must specify <code>CAPABILITY_NAMED_IAM</code>. If you don't specify this parameter, this action returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        A list of values that you must specify before AWS CloudFormation can update certain stacks. Some stack
     *        templates might include resources that can affect permissions in your AWS account, for example, by
     *        creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly
     *        acknowledge their capabilities by specifying this parameter.</p>
     *        <p>
     *        The only valid values are <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>. The following
     *        resources require you to specify this parameter: <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     *        AWS::IAM::AccessKey</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     *        AWS::IAM::Group</a>, <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     *        AWS::IAM::InstanceProfile</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     *        AWS::IAM::Policy</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     *        AWS::IAM::Role</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     *        AWS::IAM::User</a>, and <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     *        AWS::IAM::UserToGroupAddition</a>. If your stack template contains these resources, we recommend that you
     *        review all permissions associated with them and edit their permissions if necessary.
     *        </p>
     *        <p>
     *        If you have IAM resources, you can specify either capability. If you have IAM resources with custom names,
     *        you must specify <code>CAPABILITY_NAMED_IAM</code>. If you don't specify this parameter, this action
     *        returns an <code>InsufficientCapabilities</code> error.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public UpdateStackRequest withCapabilities(String... capabilities) {
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
     * A list of values that you must specify before AWS CloudFormation can update certain stacks. Some stack templates
     * might include resources that can affect permissions in your AWS account, for example, by creating new AWS
     * Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge their capabilities
     * by specifying this parameter.
     * </p>
     * <p>
     * The only valid values are <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>. The following
     * resources require you to specify this parameter: <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>, and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>. If your stack template contains these resources, we recommend that you review
     * all permissions associated with them and edit their permissions if necessary.
     * </p>
     * <p>
     * If you have IAM resources, you can specify either capability. If you have IAM resources with custom names, you
     * must specify <code>CAPABILITY_NAMED_IAM</code>. If you don't specify this parameter, this action returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * 
     * @param capabilities
     *        A list of values that you must specify before AWS CloudFormation can update certain stacks. Some stack
     *        templates might include resources that can affect permissions in your AWS account, for example, by
     *        creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly
     *        acknowledge their capabilities by specifying this parameter.</p>
     *        <p>
     *        The only valid values are <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>. The following
     *        resources require you to specify this parameter: <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     *        AWS::IAM::AccessKey</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     *        AWS::IAM::Group</a>, <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     *        AWS::IAM::InstanceProfile</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     *        AWS::IAM::Policy</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     *        AWS::IAM::Role</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     *        AWS::IAM::User</a>, and <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     *        AWS::IAM::UserToGroupAddition</a>. If your stack template contains these resources, we recommend that you
     *        review all permissions associated with them and edit their permissions if necessary.
     *        </p>
     *        <p>
     *        If you have IAM resources, you can specify either capability. If you have IAM resources with custom names,
     *        you must specify <code>CAPABILITY_NAMED_IAM</code>. If you don't specify this parameter, this action
     *        returns an <code>InsufficientCapabilities</code> error.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public UpdateStackRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * A list of values that you must specify before AWS CloudFormation can update certain stacks. Some stack templates
     * might include resources that can affect permissions in your AWS account, for example, by creating new AWS
     * Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge their capabilities
     * by specifying this parameter.
     * </p>
     * <p>
     * The only valid values are <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>. The following
     * resources require you to specify this parameter: <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>, <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>, and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     * AWS::IAM::UserToGroupAddition</a>. If your stack template contains these resources, we recommend that you review
     * all permissions associated with them and edit their permissions if necessary.
     * </p>
     * <p>
     * If you have IAM resources, you can specify either capability. If you have IAM resources with custom names, you
     * must specify <code>CAPABILITY_NAMED_IAM</code>. If you don't specify this parameter, this action returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * </p>
     * 
     * @param capabilities
     *        A list of values that you must specify before AWS CloudFormation can update certain stacks. Some stack
     *        templates might include resources that can affect permissions in your AWS account, for example, by
     *        creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly
     *        acknowledge their capabilities by specifying this parameter.</p>
     *        <p>
     *        The only valid values are <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>. The following
     *        resources require you to specify this parameter: <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     *        AWS::IAM::AccessKey</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     *        AWS::IAM::Group</a>, <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     *        AWS::IAM::InstanceProfile</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     *        AWS::IAM::Policy</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     *        AWS::IAM::Role</a>, <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     *        AWS::IAM::User</a>, and <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     *        AWS::IAM::UserToGroupAddition</a>. If your stack template contains these resources, we recommend that you
     *        review all permissions associated with them and edit their permissions if necessary.
     *        </p>
     *        <p>
     *        If you have IAM resources, you can specify either capability. If you have IAM resources with custom names,
     *        you must specify <code>CAPABILITY_NAMED_IAM</code>. If you don't specify this parameter, this action
     *        returns an <code>InsufficientCapabilities</code> error.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public UpdateStackRequest withCapabilities(Capability... capabilities) {
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
     * The template resource types that you have permissions to work with for this update stack action, such as
     * <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're updating, the stack update fails. By
     * default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management (IAM)
     * uses this parameter for AWS CloudFormation-specific condition keys in IAM policies. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling Access
     * with AWS Identity and Access Management</a>.
     * </p>
     * 
     * @return The template resource types that you have permissions to work with for this update stack action, such as
     *         <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.</p>
     *         <p>
     *         If the list of resource types doesn't include a resource that you're updating, the stack update fails. By
     *         default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management
     *         (IAM) uses this parameter for AWS CloudFormation-specific condition keys in IAM policies. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling
     *         Access with AWS Identity and Access Management</a>.
     */

    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypes;
    }

    /**
     * <p>
     * The template resource types that you have permissions to work with for this update stack action, such as
     * <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're updating, the stack update fails. By
     * default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management (IAM)
     * uses this parameter for AWS CloudFormation-specific condition keys in IAM policies. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling Access
     * with AWS Identity and Access Management</a>.
     * </p>
     * 
     * @param resourceTypes
     *        The template resource types that you have permissions to work with for this update stack action, such as
     *        <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.</p>
     *        <p>
     *        If the list of resource types doesn't include a resource that you're updating, the stack update fails. By
     *        default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management
     *        (IAM) uses this parameter for AWS CloudFormation-specific condition keys in IAM policies. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling
     *        Access with AWS Identity and Access Management</a>.
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
     * The template resource types that you have permissions to work with for this update stack action, such as
     * <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're updating, the stack update fails. By
     * default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management (IAM)
     * uses this parameter for AWS CloudFormation-specific condition keys in IAM policies. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling Access
     * with AWS Identity and Access Management</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The template resource types that you have permissions to work with for this update stack action, such as
     *        <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.</p>
     *        <p>
     *        If the list of resource types doesn't include a resource that you're updating, the stack update fails. By
     *        default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management
     *        (IAM) uses this parameter for AWS CloudFormation-specific condition keys in IAM policies. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling
     *        Access with AWS Identity and Access Management</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withResourceTypes(String... resourceTypes) {
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
     * The template resource types that you have permissions to work with for this update stack action, such as
     * <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource that you're updating, the stack update fails. By
     * default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management (IAM)
     * uses this parameter for AWS CloudFormation-specific condition keys in IAM policies. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling Access
     * with AWS Identity and Access Management</a>.
     * </p>
     * 
     * @param resourceTypes
     *        The template resource types that you have permissions to work with for this update stack action, such as
     *        <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.</p>
     *        <p>
     *        If the list of resource types doesn't include a resource that you're updating, the stack update fails. By
     *        default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management
     *        (IAM) uses this parameter for AWS CloudFormation-specific condition keys in IAM policies. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling
     *        Access with AWS Identity and Access Management</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     * assumes to update the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf. AWS
     * CloudFormation always uses this role for all future operations on the stack. As long as users have permission to
     * operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to pass it.
     * Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     *        assumes to update the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf.
     *        AWS CloudFormation always uses this role for all future operations on the stack. As long as users have
     *        permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have
     *        permission to pass it. Ensure that the role grants least privilege.</p>
     *        <p>
     *        If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the
     *        stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your
     *        user credentials.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     * assumes to update the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf. AWS
     * CloudFormation always uses this role for all future operations on the stack. As long as users have permission to
     * operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to pass it.
     * Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS
     *         CloudFormation assumes to update the stack. AWS CloudFormation uses the role's credentials to make calls
     *         on your behalf. AWS CloudFormation always uses this role for all future operations on the stack. As long
     *         as users have permission to operate on the stack, AWS CloudFormation uses this role even if the users
     *         don't have permission to pass it. Ensure that the role grants least privilege.</p>
     *         <p>
     *         If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the
     *         stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your
     *         user credentials.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     * assumes to update the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf. AWS
     * CloudFormation always uses this role for all future operations on the stack. As long as users have permission to
     * operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to pass it.
     * Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     *        assumes to update the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf.
     *        AWS CloudFormation always uses this role for all future operations on the stack. As long as users have
     *        permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have
     *        permission to pass it. Ensure that the role grants least privilege.</p>
     *        <p>
     *        If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the
     *        stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your
     *        user credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * Structure containing a new stack policy body. You can specify either the <code>StackPolicyBody</code> or the
     * <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new resource that you created during a
     * stack update. If you do not specify a stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     * 
     * @param stackPolicyBody
     *        Structure containing a new stack policy body. You can specify either the <code>StackPolicyBody</code> or
     *        the <code>StackPolicyURL</code> parameter, but not both.</p>
     *        <p>
     *        You might update the stack policy, for example, in order to protect a new resource that you created during
     *        a stack update. If you do not specify a stack policy, the current policy that is associated with the stack
     *        is unchanged.
     */

    public void setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
    }

    /**
     * <p>
     * Structure containing a new stack policy body. You can specify either the <code>StackPolicyBody</code> or the
     * <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new resource that you created during a
     * stack update. If you do not specify a stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     * 
     * @return Structure containing a new stack policy body. You can specify either the <code>StackPolicyBody</code> or
     *         the <code>StackPolicyURL</code> parameter, but not both.</p>
     *         <p>
     *         You might update the stack policy, for example, in order to protect a new resource that you created
     *         during a stack update. If you do not specify a stack policy, the current policy that is associated with
     *         the stack is unchanged.
     */

    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    /**
     * <p>
     * Structure containing a new stack policy body. You can specify either the <code>StackPolicyBody</code> or the
     * <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new resource that you created during a
     * stack update. If you do not specify a stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     * 
     * @param stackPolicyBody
     *        Structure containing a new stack policy body. You can specify either the <code>StackPolicyBody</code> or
     *        the <code>StackPolicyURL</code> parameter, but not both.</p>
     *        <p>
     *        You might update the stack policy, for example, in order to protect a new resource that you created during
     *        a stack update. If you do not specify a stack policy, the current policy that is associated with the stack
     *        is unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withStackPolicyBody(String stackPolicyBody) {
        setStackPolicyBody(stackPolicyBody);
        return this;
    }

    /**
     * <p>
     * Location of a file containing the updated stack policy. The URL must point to a policy (max size: 16KB) located
     * in an S3 bucket in the same region as the stack. You can specify either the <code>StackPolicyBody</code> or the
     * <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new resource that you created during a
     * stack update. If you do not specify a stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     * 
     * @param stackPolicyURL
     *        Location of a file containing the updated stack policy. The URL must point to a policy (max size: 16KB)
     *        located in an S3 bucket in the same region as the stack. You can specify either the
     *        <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.</p>
     *        <p>
     *        You might update the stack policy, for example, in order to protect a new resource that you created during
     *        a stack update. If you do not specify a stack policy, the current policy that is associated with the stack
     *        is unchanged.
     */

    public void setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
    }

    /**
     * <p>
     * Location of a file containing the updated stack policy. The URL must point to a policy (max size: 16KB) located
     * in an S3 bucket in the same region as the stack. You can specify either the <code>StackPolicyBody</code> or the
     * <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new resource that you created during a
     * stack update. If you do not specify a stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     * 
     * @return Location of a file containing the updated stack policy. The URL must point to a policy (max size: 16KB)
     *         located in an S3 bucket in the same region as the stack. You can specify either the
     *         <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.</p>
     *         <p>
     *         You might update the stack policy, for example, in order to protect a new resource that you created
     *         during a stack update. If you do not specify a stack policy, the current policy that is associated with
     *         the stack is unchanged.
     */

    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    /**
     * <p>
     * Location of a file containing the updated stack policy. The URL must point to a policy (max size: 16KB) located
     * in an S3 bucket in the same region as the stack. You can specify either the <code>StackPolicyBody</code> or the
     * <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * <p>
     * You might update the stack policy, for example, in order to protect a new resource that you created during a
     * stack update. If you do not specify a stack policy, the current policy that is associated with the stack is
     * unchanged.
     * </p>
     * 
     * @param stackPolicyURL
     *        Location of a file containing the updated stack policy. The URL must point to a policy (max size: 16KB)
     *        located in an S3 bucket in the same region as the stack. You can specify either the
     *        <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.</p>
     *        <p>
     *        You might update the stack policy, for example, in order to protect a new resource that you created during
     *        a stack update. If you do not specify a stack policy, the current policy that is associated with the stack
     *        is unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withStackPolicyURL(String stackPolicyURL) {
        setStackPolicyURL(stackPolicyURL);
        return this;
    }

    /**
     * <p>
     * Amazon Simple Notification Service topic Amazon Resource Names (ARNs) that AWS CloudFormation associates with the
     * stack. Specify an empty list to remove all notification topics.
     * </p>
     * 
     * @return Amazon Simple Notification Service topic Amazon Resource Names (ARNs) that AWS CloudFormation associates
     *         with the stack. Specify an empty list to remove all notification topics.
     */

    public java.util.List<String> getNotificationARNs() {
        if (notificationARNs == null) {
            notificationARNs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return notificationARNs;
    }

    /**
     * <p>
     * Amazon Simple Notification Service topic Amazon Resource Names (ARNs) that AWS CloudFormation associates with the
     * stack. Specify an empty list to remove all notification topics.
     * </p>
     * 
     * @param notificationARNs
     *        Amazon Simple Notification Service topic Amazon Resource Names (ARNs) that AWS CloudFormation associates
     *        with the stack. Specify an empty list to remove all notification topics.
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
     * Amazon Simple Notification Service topic Amazon Resource Names (ARNs) that AWS CloudFormation associates with the
     * stack. Specify an empty list to remove all notification topics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationARNs(java.util.Collection)} or {@link #withNotificationARNs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param notificationARNs
     *        Amazon Simple Notification Service topic Amazon Resource Names (ARNs) that AWS CloudFormation associates
     *        with the stack. Specify an empty list to remove all notification topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withNotificationARNs(String... notificationARNs) {
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
     * Amazon Simple Notification Service topic Amazon Resource Names (ARNs) that AWS CloudFormation associates with the
     * stack. Specify an empty list to remove all notification topics.
     * </p>
     * 
     * @param notificationARNs
     *        Amazon Simple Notification Service topic Amazon Resource Names (ARNs) that AWS CloudFormation associates
     *        with the stack. Specify an empty list to remove all notification topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withNotificationARNs(java.util.Collection<String> notificationARNs) {
        setNotificationARNs(notificationARNs);
        return this;
    }

    /**
     * <p>
     * Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to supported
     * resources in the stack. You can specify a maximum number of 10 tags.
     * </p>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If you specify an empty
     * value, AWS CloudFormation removes all associated tags.
     * </p>
     * 
     * @return Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to supported
     *         resources in the stack. You can specify a maximum number of 10 tags.</p>
     *         <p>
     *         If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If you specify
     *         an empty value, AWS CloudFormation removes all associated tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to supported
     * resources in the stack. You can specify a maximum number of 10 tags.
     * </p>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If you specify an empty
     * value, AWS CloudFormation removes all associated tags.
     * </p>
     * 
     * @param tags
     *        Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to supported
     *        resources in the stack. You can specify a maximum number of 10 tags.</p>
     *        <p>
     *        If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If you specify an
     *        empty value, AWS CloudFormation removes all associated tags.
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
     * Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to supported
     * resources in the stack. You can specify a maximum number of 10 tags.
     * </p>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If you specify an empty
     * value, AWS CloudFormation removes all associated tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to supported
     *        resources in the stack. You can specify a maximum number of 10 tags.</p>
     *        <p>
     *        If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If you specify an
     *        empty value, AWS CloudFormation removes all associated tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withTags(Tag... tags) {
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
     * Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to supported
     * resources in the stack. You can specify a maximum number of 10 tags.
     * </p>
     * <p>
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If you specify an empty
     * value, AWS CloudFormation removes all associated tags.
     * </p>
     * 
     * @param tags
     *        Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to supported
     *        resources in the stack. You can specify a maximum number of 10 tags.</p>
     *        <p>
     *        If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If you specify an
     *        empty value, AWS CloudFormation removes all associated tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: " + getTemplateBody() + ",");
        if (getTemplateURL() != null)
            sb.append("TemplateURL: " + getTemplateURL() + ",");
        if (getUsePreviousTemplate() != null)
            sb.append("UsePreviousTemplate: " + getUsePreviousTemplate() + ",");
        if (getStackPolicyDuringUpdateBody() != null)
            sb.append("StackPolicyDuringUpdateBody: " + getStackPolicyDuringUpdateBody() + ",");
        if (getStackPolicyDuringUpdateURL() != null)
            sb.append("StackPolicyDuringUpdateURL: " + getStackPolicyDuringUpdateURL() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getCapabilities() != null)
            sb.append("Capabilities: " + getCapabilities() + ",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: " + getResourceTypes() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getStackPolicyBody() != null)
            sb.append("StackPolicyBody: " + getStackPolicyBody() + ",");
        if (getStackPolicyURL() != null)
            sb.append("StackPolicyURL: " + getStackPolicyURL() + ",");
        if (getNotificationARNs() != null)
            sb.append("NotificationARNs: " + getNotificationARNs() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStackRequest == false)
            return false;
        UpdateStackRequest other = (UpdateStackRequest) obj;
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
        if (other.getUsePreviousTemplate() == null ^ this.getUsePreviousTemplate() == null)
            return false;
        if (other.getUsePreviousTemplate() != null && other.getUsePreviousTemplate().equals(this.getUsePreviousTemplate()) == false)
            return false;
        if (other.getStackPolicyDuringUpdateBody() == null ^ this.getStackPolicyDuringUpdateBody() == null)
            return false;
        if (other.getStackPolicyDuringUpdateBody() != null && other.getStackPolicyDuringUpdateBody().equals(this.getStackPolicyDuringUpdateBody()) == false)
            return false;
        if (other.getStackPolicyDuringUpdateURL() == null ^ this.getStackPolicyDuringUpdateURL() == null)
            return false;
        if (other.getStackPolicyDuringUpdateURL() != null && other.getStackPolicyDuringUpdateURL().equals(this.getStackPolicyDuringUpdateURL()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
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
        if (other.getStackPolicyBody() == null ^ this.getStackPolicyBody() == null)
            return false;
        if (other.getStackPolicyBody() != null && other.getStackPolicyBody().equals(this.getStackPolicyBody()) == false)
            return false;
        if (other.getStackPolicyURL() == null ^ this.getStackPolicyURL() == null)
            return false;
        if (other.getStackPolicyURL() != null && other.getStackPolicyURL().equals(this.getStackPolicyURL()) == false)
            return false;
        if (other.getNotificationARNs() == null ^ this.getNotificationARNs() == null)
            return false;
        if (other.getNotificationARNs() != null && other.getNotificationARNs().equals(this.getNotificationARNs()) == false)
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

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getTemplateURL() == null) ? 0 : getTemplateURL().hashCode());
        hashCode = prime * hashCode + ((getUsePreviousTemplate() == null) ? 0 : getUsePreviousTemplate().hashCode());
        hashCode = prime * hashCode + ((getStackPolicyDuringUpdateBody() == null) ? 0 : getStackPolicyDuringUpdateBody().hashCode());
        hashCode = prime * hashCode + ((getStackPolicyDuringUpdateURL() == null) ? 0 : getStackPolicyDuringUpdateURL().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getStackPolicyBody() == null) ? 0 : getStackPolicyBody().hashCode());
        hashCode = prime * hashCode + ((getStackPolicyURL() == null) ? 0 : getStackPolicyURL().hashCode());
        hashCode = prime * hashCode + ((getNotificationARNs() == null) ? 0 : getNotificationARNs().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStackRequest clone() {
        return (UpdateStackRequest) super.clone();
    }
}
