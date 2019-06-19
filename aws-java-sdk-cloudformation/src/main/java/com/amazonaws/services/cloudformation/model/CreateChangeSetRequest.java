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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <a>CreateChangeSet</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateChangeSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChangeSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation generates the
     * change set by comparing this stack's information with the information that you submit, such as a modified
     * template or different parameter input values.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * A structure that contains the body of the revised template, with a minimum length of 1 byte and a maximum length
     * of 51,200 bytes. AWS CloudFormation generates the change set by comparing this template with the template of the
     * stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or <code>TemplateURL</code>.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * The location of the file that contains the revised template. The URL must point to a template (max size: 460,800
     * bytes) that is located in an S3 bucket. AWS CloudFormation generates the change set by comparing this template
     * with the stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or <code>TemplateURL</code>.
     * </p>
     */
    private String templateURL;
    /**
     * <p>
     * Whether to reuse the template that is associated with the stack to create the change set.
     * </p>
     */
    private Boolean usePreviousTemplate;
    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters for the change set. For more
     * information, see the <a>Parameter</a> data type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Parameter> parameters;
    /**
     * <p>
     * In some cases, you must explicity acknowledge that your stack template contains certain capabilities in order for
     * AWS CloudFormation to create the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your AWS account; for example, by
     * creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge
     * this by specifying one of these capabilities.
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
     * If you don't specify either of these capabilities, AWS CloudFormation returns an
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
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>
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
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
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
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.
     * </p>
     * <note>
     * <p>
     * This capacity does not apply to creating change sets, and specifying it when creating change sets has no effect.
     * </p>
     * <p>
     * Also, change sets do not currently support nested stacks. If you want to create a stack from a stack template
     * that contains macros <i>and</i> nested stacks, you must create or update the stack directly from the template
     * using the <a>CreateStack</a> or <a>UpdateStack</a> action, and specifying this capability.
     * </p>
     * </note>
     * <p>
     * For more information on macros, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     * CloudFormation Macros to Perform Custom Processing on Templates</a>.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> capabilities;
    /**
     * <p>
     * The template resource types that you have permissions to work with if you execute this change set, such as
     * <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource type that you're updating, the stack update fails. By
     * default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management (IAM)
     * uses this parameter for condition keys in IAM policies for AWS CloudFormation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling Access
     * with AWS Identity and Access Management</a> in the AWS CloudFormation User Guide.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypes;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     * assumes when executing the change set. AWS CloudFormation uses the role's credentials to make calls on your
     * behalf. AWS CloudFormation uses this role for all future operations on the stack. As long as users have
     * permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to
     * pass it. Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for
     * the specified monitoring period afterwards.
     * </p>
     */
    private RollbackConfiguration rollbackConfiguration;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Amazon Simple Notification Service (Amazon SNS) topics that AWS
     * CloudFormation associates with the stack. To remove all associated notification topics, specify an empty list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> notificationARNs;
    /**
     * <p>
     * Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to resources in the
     * stack. You can specify a maximum of 50 tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The name of the change set. The name must be unique among all change sets that are associated with the specified
     * stack.
     * </p>
     * <p>
     * A change set name can contain only alphanumeric, case sensitive characters and hyphens. It must start with an
     * alphabetic character and cannot exceed 128 characters.
     * </p>
     */
    private String changeSetName;
    /**
     * <p>
     * A unique identifier for this <code>CreateChangeSet</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to create another change set with the same
     * name. You might retry <code>CreateChangeSet</code> requests to ensure that AWS CloudFormation successfully
     * received them.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A description to help you identify this change set.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of change set operation. To create a change set for a new stack, specify <code>CREATE</code>. To create
     * a change set for an existing stack, specify <code>UPDATE</code>.
     * </p>
     * <p>
     * If you create a change set for a new stack, AWS Cloudformation creates a stack with a unique stack ID, but no
     * template or resources. The stack will be in the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995">
     * <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change set.
     * </p>
     * <p>
     * By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't use the <code>UPDATE</code> type to
     * create a change set for a new stack or the <code>CREATE</code> type to create a change set for an existing stack.
     * </p>
     */
    private String changeSetType;

    /**
     * <p>
     * The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation generates the
     * change set by comparing this stack's information with the information that you submit, such as a modified
     * template or different parameter input values.
     * </p>
     * 
     * @param stackName
     *        The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation
     *        generates the change set by comparing this stack's information with the information that you submit, such
     *        as a modified template or different parameter input values.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation generates the
     * change set by comparing this stack's information with the information that you submit, such as a modified
     * template or different parameter input values.
     * </p>
     * 
     * @return The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation
     *         generates the change set by comparing this stack's information with the information that you submit, such
     *         as a modified template or different parameter input values.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation generates the
     * change set by comparing this stack's information with the information that you submit, such as a modified
     * template or different parameter input values.
     * </p>
     * 
     * @param stackName
     *        The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation
     *        generates the change set by comparing this stack's information with the information that you submit, such
     *        as a modified template or different parameter input values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * A structure that contains the body of the revised template, with a minimum length of 1 byte and a maximum length
     * of 51,200 bytes. AWS CloudFormation generates the change set by comparing this template with the template of the
     * stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or <code>TemplateURL</code>.
     * </p>
     * 
     * @param templateBody
     *        A structure that contains the body of the revised template, with a minimum length of 1 byte and a maximum
     *        length of 51,200 bytes. AWS CloudFormation generates the change set by comparing this template with the
     *        template of the stack that you specified.</p>
     *        <p>
     *        Conditional: You must specify only <code>TemplateBody</code> or <code>TemplateURL</code>.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * A structure that contains the body of the revised template, with a minimum length of 1 byte and a maximum length
     * of 51,200 bytes. AWS CloudFormation generates the change set by comparing this template with the template of the
     * stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or <code>TemplateURL</code>.
     * </p>
     * 
     * @return A structure that contains the body of the revised template, with a minimum length of 1 byte and a maximum
     *         length of 51,200 bytes. AWS CloudFormation generates the change set by comparing this template with the
     *         template of the stack that you specified.</p>
     *         <p>
     *         Conditional: You must specify only <code>TemplateBody</code> or <code>TemplateURL</code>.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * A structure that contains the body of the revised template, with a minimum length of 1 byte and a maximum length
     * of 51,200 bytes. AWS CloudFormation generates the change set by comparing this template with the template of the
     * stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or <code>TemplateURL</code>.
     * </p>
     * 
     * @param templateBody
     *        A structure that contains the body of the revised template, with a minimum length of 1 byte and a maximum
     *        length of 51,200 bytes. AWS CloudFormation generates the change set by comparing this template with the
     *        template of the stack that you specified.</p>
     *        <p>
     *        Conditional: You must specify only <code>TemplateBody</code> or <code>TemplateURL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * The location of the file that contains the revised template. The URL must point to a template (max size: 460,800
     * bytes) that is located in an S3 bucket. AWS CloudFormation generates the change set by comparing this template
     * with the stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or <code>TemplateURL</code>.
     * </p>
     * 
     * @param templateURL
     *        The location of the file that contains the revised template. The URL must point to a template (max size:
     *        460,800 bytes) that is located in an S3 bucket. AWS CloudFormation generates the change set by comparing
     *        this template with the stack that you specified.</p>
     *        <p>
     *        Conditional: You must specify only <code>TemplateBody</code> or <code>TemplateURL</code>.
     */

    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }

    /**
     * <p>
     * The location of the file that contains the revised template. The URL must point to a template (max size: 460,800
     * bytes) that is located in an S3 bucket. AWS CloudFormation generates the change set by comparing this template
     * with the stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or <code>TemplateURL</code>.
     * </p>
     * 
     * @return The location of the file that contains the revised template. The URL must point to a template (max size:
     *         460,800 bytes) that is located in an S3 bucket. AWS CloudFormation generates the change set by comparing
     *         this template with the stack that you specified.</p>
     *         <p>
     *         Conditional: You must specify only <code>TemplateBody</code> or <code>TemplateURL</code>.
     */

    public String getTemplateURL() {
        return this.templateURL;
    }

    /**
     * <p>
     * The location of the file that contains the revised template. The URL must point to a template (max size: 460,800
     * bytes) that is located in an S3 bucket. AWS CloudFormation generates the change set by comparing this template
     * with the stack that you specified.
     * </p>
     * <p>
     * Conditional: You must specify only <code>TemplateBody</code> or <code>TemplateURL</code>.
     * </p>
     * 
     * @param templateURL
     *        The location of the file that contains the revised template. The URL must point to a template (max size:
     *        460,800 bytes) that is located in an S3 bucket. AWS CloudFormation generates the change set by comparing
     *        this template with the stack that you specified.</p>
     *        <p>
     *        Conditional: You must specify only <code>TemplateBody</code> or <code>TemplateURL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withTemplateURL(String templateURL) {
        setTemplateURL(templateURL);
        return this;
    }

    /**
     * <p>
     * Whether to reuse the template that is associated with the stack to create the change set.
     * </p>
     * 
     * @param usePreviousTemplate
     *        Whether to reuse the template that is associated with the stack to create the change set.
     */

    public void setUsePreviousTemplate(Boolean usePreviousTemplate) {
        this.usePreviousTemplate = usePreviousTemplate;
    }

    /**
     * <p>
     * Whether to reuse the template that is associated with the stack to create the change set.
     * </p>
     * 
     * @return Whether to reuse the template that is associated with the stack to create the change set.
     */

    public Boolean getUsePreviousTemplate() {
        return this.usePreviousTemplate;
    }

    /**
     * <p>
     * Whether to reuse the template that is associated with the stack to create the change set.
     * </p>
     * 
     * @param usePreviousTemplate
     *        Whether to reuse the template that is associated with the stack to create the change set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withUsePreviousTemplate(Boolean usePreviousTemplate) {
        setUsePreviousTemplate(usePreviousTemplate);
        return this;
    }

    /**
     * <p>
     * Whether to reuse the template that is associated with the stack to create the change set.
     * </p>
     * 
     * @return Whether to reuse the template that is associated with the stack to create the change set.
     */

    public Boolean isUsePreviousTemplate() {
        return this.usePreviousTemplate;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters for the change set. For more
     * information, see the <a>Parameter</a> data type.
     * </p>
     * 
     * @return A list of <code>Parameter</code> structures that specify input parameters for the change set. For more
     *         information, see the <a>Parameter</a> data type.
     */

    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<Parameter>();
        }
        return parameters;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures that specify input parameters for the change set. For more
     * information, see the <a>Parameter</a> data type.
     * </p>
     * 
     * @param parameters
     *        A list of <code>Parameter</code> structures that specify input parameters for the change set. For more
     *        information, see the <a>Parameter</a> data type.
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
     * A list of <code>Parameter</code> structures that specify input parameters for the change set. For more
     * information, see the <a>Parameter</a> data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        A list of <code>Parameter</code> structures that specify input parameters for the change set. For more
     *        information, see the <a>Parameter</a> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withParameters(Parameter... parameters) {
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
     * A list of <code>Parameter</code> structures that specify input parameters for the change set. For more
     * information, see the <a>Parameter</a> data type.
     * </p>
     * 
     * @param parameters
     *        A list of <code>Parameter</code> structures that specify input parameters for the change set. For more
     *        information, see the <a>Parameter</a> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * In some cases, you must explicity acknowledge that your stack template contains certain capabilities in order for
     * AWS CloudFormation to create the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your AWS account; for example, by
     * creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge
     * this by specifying one of these capabilities.
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
     * If you don't specify either of these capabilities, AWS CloudFormation returns an
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
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>
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
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
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
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.
     * </p>
     * <note>
     * <p>
     * This capacity does not apply to creating change sets, and specifying it when creating change sets has no effect.
     * </p>
     * <p>
     * Also, change sets do not currently support nested stacks. If you want to create a stack from a stack template
     * that contains macros <i>and</i> nested stacks, you must create or update the stack directly from the template
     * using the <a>CreateStack</a> or <a>UpdateStack</a> action, and specifying this capability.
     * </p>
     * </note>
     * <p>
     * For more information on macros, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     * CloudFormation Macros to Perform Custom Processing on Templates</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return In some cases, you must explicity acknowledge that your stack template contains certain capabilities in
     *         order for AWS CloudFormation to create the stack.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *         </p>
     *         <p>
     *         Some stack templates might include resources that can affect permissions in your AWS account; for
     *         example, by creating new AWS Identity and Access Management (IAM) users. For those stacks, you must
     *         explicitly acknowledge this by specifying one of these capabilities.
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
     *         If you don't specify either of these capabilities, AWS CloudFormation returns an
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
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     *         AWS::IAM::AccessKey</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     *         AWS::IAM::Group</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     *         AWS::IAM::InstanceProfile</a>
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
     *         <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     *         AWS::IAM::Role</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     *         AWS::IAM::User</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     *         AWS::IAM::UserToGroupAddition</a>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *         >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
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
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *         >AWS::Include</a> and <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *         >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.
     *         </p>
     *         <note>
     *         <p>
     *         This capacity does not apply to creating change sets, and specifying it when creating change sets has no
     *         effect.
     *         </p>
     *         <p>
     *         Also, change sets do not currently support nested stacks. If you want to create a stack from a stack
     *         template that contains macros <i>and</i> nested stacks, you must create or update the stack directly from
     *         the template using the <a>CreateStack</a> or <a>UpdateStack</a> action, and specifying this capability.
     *         </p>
     *         </note>
     *         <p>
     *         For more information on macros, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     *         CloudFormation Macros to Perform Custom Processing on Templates</a>.
     *         </p>
     *         </li>
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
     * In some cases, you must explicity acknowledge that your stack template contains certain capabilities in order for
     * AWS CloudFormation to create the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your AWS account; for example, by
     * creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge
     * this by specifying one of these capabilities.
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
     * If you don't specify either of these capabilities, AWS CloudFormation returns an
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
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>
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
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
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
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.
     * </p>
     * <note>
     * <p>
     * This capacity does not apply to creating change sets, and specifying it when creating change sets has no effect.
     * </p>
     * <p>
     * Also, change sets do not currently support nested stacks. If you want to create a stack from a stack template
     * that contains macros <i>and</i> nested stacks, you must create or update the stack directly from the template
     * using the <a>CreateStack</a> or <a>UpdateStack</a> action, and specifying this capability.
     * </p>
     * </note>
     * <p>
     * For more information on macros, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     * CloudFormation Macros to Perform Custom Processing on Templates</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capabilities
     *        In some cases, you must explicity acknowledge that your stack template contains certain capabilities in
     *        order for AWS CloudFormation to create the stack.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *        </p>
     *        <p>
     *        Some stack templates might include resources that can affect permissions in your AWS account; for example,
     *        by creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly
     *        acknowledge this by specifying one of these capabilities.
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
     *        If you don't specify either of these capabilities, AWS CloudFormation returns an
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
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     *        AWS::IAM::Group</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     *        AWS::IAM::InstanceProfile</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     *        AWS::IAM::Policy</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     *        AWS::IAM::Role</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     *        AWS::IAM::User</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     *        AWS::IAM::UserToGroupAddition</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
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
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *        >AWS::Include</a> and <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *        >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.
     *        </p>
     *        <note>
     *        <p>
     *        This capacity does not apply to creating change sets, and specifying it when creating change sets has no
     *        effect.
     *        </p>
     *        <p>
     *        Also, change sets do not currently support nested stacks. If you want to create a stack from a stack
     *        template that contains macros <i>and</i> nested stacks, you must create or update the stack directly from
     *        the template using the <a>CreateStack</a> or <a>UpdateStack</a> action, and specifying this capability.
     *        </p>
     *        </note>
     *        <p>
     *        For more information on macros, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     *        CloudFormation Macros to Perform Custom Processing on Templates</a>.
     *        </p>
     *        </li>
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
     * In some cases, you must explicity acknowledge that your stack template contains certain capabilities in order for
     * AWS CloudFormation to create the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your AWS account; for example, by
     * creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge
     * this by specifying one of these capabilities.
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
     * If you don't specify either of these capabilities, AWS CloudFormation returns an
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
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>
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
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
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
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.
     * </p>
     * <note>
     * <p>
     * This capacity does not apply to creating change sets, and specifying it when creating change sets has no effect.
     * </p>
     * <p>
     * Also, change sets do not currently support nested stacks. If you want to create a stack from a stack template
     * that contains macros <i>and</i> nested stacks, you must create or update the stack directly from the template
     * using the <a>CreateStack</a> or <a>UpdateStack</a> action, and specifying this capability.
     * </p>
     * </note>
     * <p>
     * For more information on macros, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     * CloudFormation Macros to Perform Custom Processing on Templates</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        In some cases, you must explicity acknowledge that your stack template contains certain capabilities in
     *        order for AWS CloudFormation to create the stack.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *        </p>
     *        <p>
     *        Some stack templates might include resources that can affect permissions in your AWS account; for example,
     *        by creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly
     *        acknowledge this by specifying one of these capabilities.
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
     *        If you don't specify either of these capabilities, AWS CloudFormation returns an
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
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     *        AWS::IAM::Group</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     *        AWS::IAM::InstanceProfile</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     *        AWS::IAM::Policy</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     *        AWS::IAM::Role</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     *        AWS::IAM::User</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     *        AWS::IAM::UserToGroupAddition</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
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
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *        >AWS::Include</a> and <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *        >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.
     *        </p>
     *        <note>
     *        <p>
     *        This capacity does not apply to creating change sets, and specifying it when creating change sets has no
     *        effect.
     *        </p>
     *        <p>
     *        Also, change sets do not currently support nested stacks. If you want to create a stack from a stack
     *        template that contains macros <i>and</i> nested stacks, you must create or update the stack directly from
     *        the template using the <a>CreateStack</a> or <a>UpdateStack</a> action, and specifying this capability.
     *        </p>
     *        </note>
     *        <p>
     *        For more information on macros, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     *        CloudFormation Macros to Perform Custom Processing on Templates</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateChangeSetRequest withCapabilities(String... capabilities) {
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
     * In some cases, you must explicity acknowledge that your stack template contains certain capabilities in order for
     * AWS CloudFormation to create the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your AWS account; for example, by
     * creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge
     * this by specifying one of these capabilities.
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
     * If you don't specify either of these capabilities, AWS CloudFormation returns an
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
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>
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
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
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
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.
     * </p>
     * <note>
     * <p>
     * This capacity does not apply to creating change sets, and specifying it when creating change sets has no effect.
     * </p>
     * <p>
     * Also, change sets do not currently support nested stacks. If you want to create a stack from a stack template
     * that contains macros <i>and</i> nested stacks, you must create or update the stack directly from the template
     * using the <a>CreateStack</a> or <a>UpdateStack</a> action, and specifying this capability.
     * </p>
     * </note>
     * <p>
     * For more information on macros, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     * CloudFormation Macros to Perform Custom Processing on Templates</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capabilities
     *        In some cases, you must explicity acknowledge that your stack template contains certain capabilities in
     *        order for AWS CloudFormation to create the stack.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *        </p>
     *        <p>
     *        Some stack templates might include resources that can affect permissions in your AWS account; for example,
     *        by creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly
     *        acknowledge this by specifying one of these capabilities.
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
     *        If you don't specify either of these capabilities, AWS CloudFormation returns an
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
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     *        AWS::IAM::Group</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     *        AWS::IAM::InstanceProfile</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     *        AWS::IAM::Policy</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     *        AWS::IAM::Role</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     *        AWS::IAM::User</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     *        AWS::IAM::UserToGroupAddition</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
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
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *        >AWS::Include</a> and <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *        >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.
     *        </p>
     *        <note>
     *        <p>
     *        This capacity does not apply to creating change sets, and specifying it when creating change sets has no
     *        effect.
     *        </p>
     *        <p>
     *        Also, change sets do not currently support nested stacks. If you want to create a stack from a stack
     *        template that contains macros <i>and</i> nested stacks, you must create or update the stack directly from
     *        the template using the <a>CreateStack</a> or <a>UpdateStack</a> action, and specifying this capability.
     *        </p>
     *        </note>
     *        <p>
     *        For more information on macros, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     *        CloudFormation Macros to Perform Custom Processing on Templates</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateChangeSetRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * In some cases, you must explicity acknowledge that your stack template contains certain capabilities in order for
     * AWS CloudFormation to create the stack.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     * </p>
     * <p>
     * Some stack templates might include resources that can affect permissions in your AWS account; for example, by
     * creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge
     * this by specifying one of these capabilities.
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
     * If you don't specify either of these capabilities, AWS CloudFormation returns an
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
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">
     * AWS::IAM::AccessKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     * AWS::IAM::Group</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     * AWS::IAM::InstanceProfile</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     * AWS::IAM::Policy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     * AWS::IAM::Role</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     * AWS::IAM::User</a>
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
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
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
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     * >AWS::Include</a> and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     * >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.
     * </p>
     * <note>
     * <p>
     * This capacity does not apply to creating change sets, and specifying it when creating change sets has no effect.
     * </p>
     * <p>
     * Also, change sets do not currently support nested stacks. If you want to create a stack from a stack template
     * that contains macros <i>and</i> nested stacks, you must create or update the stack directly from the template
     * using the <a>CreateStack</a> or <a>UpdateStack</a> action, and specifying this capability.
     * </p>
     * </note>
     * <p>
     * For more information on macros, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     * CloudFormation Macros to Perform Custom Processing on Templates</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capabilities
     *        In some cases, you must explicity acknowledge that your stack template contains certain capabilities in
     *        order for AWS CloudFormation to create the stack.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAPABILITY_IAM</code> and <code>CAPABILITY_NAMED_IAM</code>
     *        </p>
     *        <p>
     *        Some stack templates might include resources that can affect permissions in your AWS account; for example,
     *        by creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly
     *        acknowledge this by specifying one of these capabilities.
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
     *        If you don't specify either of these capabilities, AWS CloudFormation returns an
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
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">
     *        AWS::IAM::Group</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-instanceprofile.html">
     *        AWS::IAM::InstanceProfile</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">
     *        AWS::IAM::Policy</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html">
     *        AWS::IAM::Role</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">
     *        AWS::IAM::User</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">
     *        AWS::IAM::UserToGroupAddition</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates</a>.
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
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/create-reusable-transform-function-snippets-and-add-to-your-template-with-aws-include-transform.html"
     *        >AWS::Include</a> and <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/transform-aws-serverless.html"
     *        >AWS::Serverless</a> transforms, which are macros hosted by AWS CloudFormation.
     *        </p>
     *        <note>
     *        <p>
     *        This capacity does not apply to creating change sets, and specifying it when creating change sets has no
     *        effect.
     *        </p>
     *        <p>
     *        Also, change sets do not currently support nested stacks. If you want to create a stack from a stack
     *        template that contains macros <i>and</i> nested stacks, you must create or update the stack directly from
     *        the template using the <a>CreateStack</a> or <a>UpdateStack</a> action, and specifying this capability.
     *        </p>
     *        </note>
     *        <p>
     *        For more information on macros, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-macros.html">Using AWS
     *        CloudFormation Macros to Perform Custom Processing on Templates</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateChangeSetRequest withCapabilities(Capability... capabilities) {
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
     * The template resource types that you have permissions to work with if you execute this change set, such as
     * <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource type that you're updating, the stack update fails. By
     * default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management (IAM)
     * uses this parameter for condition keys in IAM policies for AWS CloudFormation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling Access
     * with AWS Identity and Access Management</a> in the AWS CloudFormation User Guide.
     * </p>
     * 
     * @return The template resource types that you have permissions to work with if you execute this change set, such
     *         as <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>
     *         .</p>
     *         <p>
     *         If the list of resource types doesn't include a resource type that you're updating, the stack update
     *         fails. By default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access
     *         Management (IAM) uses this parameter for condition keys in IAM policies for AWS CloudFormation. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling
     *         Access with AWS Identity and Access Management</a> in the AWS CloudFormation User Guide.
     */

    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypes;
    }

    /**
     * <p>
     * The template resource types that you have permissions to work with if you execute this change set, such as
     * <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource type that you're updating, the stack update fails. By
     * default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management (IAM)
     * uses this parameter for condition keys in IAM policies for AWS CloudFormation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling Access
     * with AWS Identity and Access Management</a> in the AWS CloudFormation User Guide.
     * </p>
     * 
     * @param resourceTypes
     *        The template resource types that you have permissions to work with if you execute this change set, such as
     *        <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.</p>
     *        <p>
     *        If the list of resource types doesn't include a resource type that you're updating, the stack update
     *        fails. By default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access
     *        Management (IAM) uses this parameter for condition keys in IAM policies for AWS CloudFormation. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling
     *        Access with AWS Identity and Access Management</a> in the AWS CloudFormation User Guide.
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
     * The template resource types that you have permissions to work with if you execute this change set, such as
     * <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource type that you're updating, the stack update fails. By
     * default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management (IAM)
     * uses this parameter for condition keys in IAM policies for AWS CloudFormation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling Access
     * with AWS Identity and Access Management</a> in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The template resource types that you have permissions to work with if you execute this change set, such as
     *        <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.</p>
     *        <p>
     *        If the list of resource types doesn't include a resource type that you're updating, the stack update
     *        fails. By default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access
     *        Management (IAM) uses this parameter for condition keys in IAM policies for AWS CloudFormation. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling
     *        Access with AWS Identity and Access Management</a> in the AWS CloudFormation User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withResourceTypes(String... resourceTypes) {
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
     * The template resource types that you have permissions to work with if you execute this change set, such as
     * <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * If the list of resource types doesn't include a resource type that you're updating, the stack update fails. By
     * default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management (IAM)
     * uses this parameter for condition keys in IAM policies for AWS CloudFormation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling Access
     * with AWS Identity and Access Management</a> in the AWS CloudFormation User Guide.
     * </p>
     * 
     * @param resourceTypes
     *        The template resource types that you have permissions to work with if you execute this change set, such as
     *        <code>AWS::EC2::Instance</code>, <code>AWS::EC2::*</code>, or <code>Custom::MyCustomInstance</code>.</p>
     *        <p>
     *        If the list of resource types doesn't include a resource type that you're updating, the stack update
     *        fails. By default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access
     *        Management (IAM) uses this parameter for condition keys in IAM policies for AWS CloudFormation. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html">Controlling
     *        Access with AWS Identity and Access Management</a> in the AWS CloudFormation User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     * assumes when executing the change set. AWS CloudFormation uses the role's credentials to make calls on your
     * behalf. AWS CloudFormation uses this role for all future operations on the stack. As long as users have
     * permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to
     * pass it. Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     *        assumes when executing the change set. AWS CloudFormation uses the role's credentials to make calls on
     *        your behalf. AWS CloudFormation uses this role for all future operations on the stack. As long as users
     *        have permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have
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
     * assumes when executing the change set. AWS CloudFormation uses the role's credentials to make calls on your
     * behalf. AWS CloudFormation uses this role for all future operations on the stack. As long as users have
     * permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to
     * pass it. Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS
     *         CloudFormation assumes when executing the change set. AWS CloudFormation uses the role's credentials to
     *         make calls on your behalf. AWS CloudFormation uses this role for all future operations on the stack. As
     *         long as users have permission to operate on the stack, AWS CloudFormation uses this role even if the
     *         users don't have permission to pass it. Ensure that the role grants least privilege.</p>
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
     * assumes when executing the change set. AWS CloudFormation uses the role's credentials to make calls on your
     * behalf. AWS CloudFormation uses this role for all future operations on the stack. As long as users have
     * permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to
     * pass it. Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     *        assumes when executing the change set. AWS CloudFormation uses the role's credentials to make calls on
     *        your behalf. AWS CloudFormation uses this role for all future operations on the stack. As long as users
     *        have permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have
     *        permission to pass it. Ensure that the role grants least privilege.</p>
     *        <p>
     *        If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the
     *        stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your
     *        user credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for
     * the specified monitoring period afterwards.
     * </p>
     * 
     * @param rollbackConfiguration
     *        The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and
     *        for the specified monitoring period afterwards.
     */

    public void setRollbackConfiguration(RollbackConfiguration rollbackConfiguration) {
        this.rollbackConfiguration = rollbackConfiguration;
    }

    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for
     * the specified monitoring period afterwards.
     * </p>
     * 
     * @return The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations,
     *         and for the specified monitoring period afterwards.
     */

    public RollbackConfiguration getRollbackConfiguration() {
        return this.rollbackConfiguration;
    }

    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for
     * the specified monitoring period afterwards.
     * </p>
     * 
     * @param rollbackConfiguration
     *        The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and
     *        for the specified monitoring period afterwards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withRollbackConfiguration(RollbackConfiguration rollbackConfiguration) {
        setRollbackConfiguration(rollbackConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Amazon Simple Notification Service (Amazon SNS) topics that AWS
     * CloudFormation associates with the stack. To remove all associated notification topics, specify an empty list.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of Amazon Simple Notification Service (Amazon SNS) topics that AWS
     *         CloudFormation associates with the stack. To remove all associated notification topics, specify an empty
     *         list.
     */

    public java.util.List<String> getNotificationARNs() {
        if (notificationARNs == null) {
            notificationARNs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return notificationARNs;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Amazon Simple Notification Service (Amazon SNS) topics that AWS
     * CloudFormation associates with the stack. To remove all associated notification topics, specify an empty list.
     * </p>
     * 
     * @param notificationARNs
     *        The Amazon Resource Names (ARNs) of Amazon Simple Notification Service (Amazon SNS) topics that AWS
     *        CloudFormation associates with the stack. To remove all associated notification topics, specify an empty
     *        list.
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
     * The Amazon Resource Names (ARNs) of Amazon Simple Notification Service (Amazon SNS) topics that AWS
     * CloudFormation associates with the stack. To remove all associated notification topics, specify an empty list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationARNs(java.util.Collection)} or {@link #withNotificationARNs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param notificationARNs
     *        The Amazon Resource Names (ARNs) of Amazon Simple Notification Service (Amazon SNS) topics that AWS
     *        CloudFormation associates with the stack. To remove all associated notification topics, specify an empty
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withNotificationARNs(String... notificationARNs) {
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
     * The Amazon Resource Names (ARNs) of Amazon Simple Notification Service (Amazon SNS) topics that AWS
     * CloudFormation associates with the stack. To remove all associated notification topics, specify an empty list.
     * </p>
     * 
     * @param notificationARNs
     *        The Amazon Resource Names (ARNs) of Amazon Simple Notification Service (Amazon SNS) topics that AWS
     *        CloudFormation associates with the stack. To remove all associated notification topics, specify an empty
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withNotificationARNs(java.util.Collection<String> notificationARNs) {
        setNotificationARNs(notificationARNs);
        return this;
    }

    /**
     * <p>
     * Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to resources in the
     * stack. You can specify a maximum of 50 tags.
     * </p>
     * 
     * @return Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to resources
     *         in the stack. You can specify a maximum of 50 tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to resources in the
     * stack. You can specify a maximum of 50 tags.
     * </p>
     * 
     * @param tags
     *        Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to resources
     *        in the stack. You can specify a maximum of 50 tags.
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
     * Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to resources in the
     * stack. You can specify a maximum of 50 tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to resources
     *        in the stack. You can specify a maximum of 50 tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withTags(Tag... tags) {
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
     * Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to resources in the
     * stack. You can specify a maximum of 50 tags.
     * </p>
     * 
     * @param tags
     *        Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to resources
     *        in the stack. You can specify a maximum of 50 tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the change set. The name must be unique among all change sets that are associated with the specified
     * stack.
     * </p>
     * <p>
     * A change set name can contain only alphanumeric, case sensitive characters and hyphens. It must start with an
     * alphabetic character and cannot exceed 128 characters.
     * </p>
     * 
     * @param changeSetName
     *        The name of the change set. The name must be unique among all change sets that are associated with the
     *        specified stack.</p>
     *        <p>
     *        A change set name can contain only alphanumeric, case sensitive characters and hyphens. It must start with
     *        an alphabetic character and cannot exceed 128 characters.
     */

    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * The name of the change set. The name must be unique among all change sets that are associated with the specified
     * stack.
     * </p>
     * <p>
     * A change set name can contain only alphanumeric, case sensitive characters and hyphens. It must start with an
     * alphabetic character and cannot exceed 128 characters.
     * </p>
     * 
     * @return The name of the change set. The name must be unique among all change sets that are associated with the
     *         specified stack.</p>
     *         <p>
     *         A change set name can contain only alphanumeric, case sensitive characters and hyphens. It must start
     *         with an alphabetic character and cannot exceed 128 characters.
     */

    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * <p>
     * The name of the change set. The name must be unique among all change sets that are associated with the specified
     * stack.
     * </p>
     * <p>
     * A change set name can contain only alphanumeric, case sensitive characters and hyphens. It must start with an
     * alphabetic character and cannot exceed 128 characters.
     * </p>
     * 
     * @param changeSetName
     *        The name of the change set. The name must be unique among all change sets that are associated with the
     *        specified stack.</p>
     *        <p>
     *        A change set name can contain only alphanumeric, case sensitive characters and hyphens. It must start with
     *        an alphabetic character and cannot exceed 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withChangeSetName(String changeSetName) {
        setChangeSetName(changeSetName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateChangeSet</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to create another change set with the same
     * name. You might retry <code>CreateChangeSet</code> requests to ensure that AWS CloudFormation successfully
     * received them.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for this <code>CreateChangeSet</code> request. Specify this token if you plan to retry
     *        requests so that AWS CloudFormation knows that you're not attempting to create another change set with the
     *        same name. You might retry <code>CreateChangeSet</code> requests to ensure that AWS CloudFormation
     *        successfully received them.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateChangeSet</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to create another change set with the same
     * name. You might retry <code>CreateChangeSet</code> requests to ensure that AWS CloudFormation successfully
     * received them.
     * </p>
     * 
     * @return A unique identifier for this <code>CreateChangeSet</code> request. Specify this token if you plan to
     *         retry requests so that AWS CloudFormation knows that you're not attempting to create another change set
     *         with the same name. You might retry <code>CreateChangeSet</code> requests to ensure that AWS
     *         CloudFormation successfully received them.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateChangeSet</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to create another change set with the same
     * name. You might retry <code>CreateChangeSet</code> requests to ensure that AWS CloudFormation successfully
     * received them.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for this <code>CreateChangeSet</code> request. Specify this token if you plan to retry
     *        requests so that AWS CloudFormation knows that you're not attempting to create another change set with the
     *        same name. You might retry <code>CreateChangeSet</code> requests to ensure that AWS CloudFormation
     *        successfully received them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A description to help you identify this change set.
     * </p>
     * 
     * @param description
     *        A description to help you identify this change set.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description to help you identify this change set.
     * </p>
     * 
     * @return A description to help you identify this change set.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description to help you identify this change set.
     * </p>
     * 
     * @param description
     *        A description to help you identify this change set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangeSetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of change set operation. To create a change set for a new stack, specify <code>CREATE</code>. To create
     * a change set for an existing stack, specify <code>UPDATE</code>.
     * </p>
     * <p>
     * If you create a change set for a new stack, AWS Cloudformation creates a stack with a unique stack ID, but no
     * template or resources. The stack will be in the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995">
     * <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change set.
     * </p>
     * <p>
     * By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't use the <code>UPDATE</code> type to
     * create a change set for a new stack or the <code>CREATE</code> type to create a change set for an existing stack.
     * </p>
     * 
     * @param changeSetType
     *        The type of change set operation. To create a change set for a new stack, specify <code>CREATE</code>. To
     *        create a change set for an existing stack, specify <code>UPDATE</code>.</p>
     *        <p>
     *        If you create a change set for a new stack, AWS Cloudformation creates a stack with a unique stack ID, but
     *        no template or resources. The stack will be in the <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     *        > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change set.
     *        </p>
     *        <p>
     *        By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't use the <code>UPDATE</code> type
     *        to create a change set for a new stack or the <code>CREATE</code> type to create a change set for an
     *        existing stack.
     * @see ChangeSetType
     */

    public void setChangeSetType(String changeSetType) {
        this.changeSetType = changeSetType;
    }

    /**
     * <p>
     * The type of change set operation. To create a change set for a new stack, specify <code>CREATE</code>. To create
     * a change set for an existing stack, specify <code>UPDATE</code>.
     * </p>
     * <p>
     * If you create a change set for a new stack, AWS Cloudformation creates a stack with a unique stack ID, but no
     * template or resources. The stack will be in the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995">
     * <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change set.
     * </p>
     * <p>
     * By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't use the <code>UPDATE</code> type to
     * create a change set for a new stack or the <code>CREATE</code> type to create a change set for an existing stack.
     * </p>
     * 
     * @return The type of change set operation. To create a change set for a new stack, specify <code>CREATE</code>. To
     *         create a change set for an existing stack, specify <code>UPDATE</code>.</p>
     *         <p>
     *         If you create a change set for a new stack, AWS Cloudformation creates a stack with a unique stack ID,
     *         but no template or resources. The stack will be in the <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     *         > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change set.
     *         </p>
     *         <p>
     *         By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't use the <code>UPDATE</code> type
     *         to create a change set for a new stack or the <code>CREATE</code> type to create a change set for an
     *         existing stack.
     * @see ChangeSetType
     */

    public String getChangeSetType() {
        return this.changeSetType;
    }

    /**
     * <p>
     * The type of change set operation. To create a change set for a new stack, specify <code>CREATE</code>. To create
     * a change set for an existing stack, specify <code>UPDATE</code>.
     * </p>
     * <p>
     * If you create a change set for a new stack, AWS Cloudformation creates a stack with a unique stack ID, but no
     * template or resources. The stack will be in the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995">
     * <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change set.
     * </p>
     * <p>
     * By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't use the <code>UPDATE</code> type to
     * create a change set for a new stack or the <code>CREATE</code> type to create a change set for an existing stack.
     * </p>
     * 
     * @param changeSetType
     *        The type of change set operation. To create a change set for a new stack, specify <code>CREATE</code>. To
     *        create a change set for an existing stack, specify <code>UPDATE</code>.</p>
     *        <p>
     *        If you create a change set for a new stack, AWS Cloudformation creates a stack with a unique stack ID, but
     *        no template or resources. The stack will be in the <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     *        > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change set.
     *        </p>
     *        <p>
     *        By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't use the <code>UPDATE</code> type
     *        to create a change set for a new stack or the <code>CREATE</code> type to create a change set for an
     *        existing stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeSetType
     */

    public CreateChangeSetRequest withChangeSetType(String changeSetType) {
        setChangeSetType(changeSetType);
        return this;
    }

    /**
     * <p>
     * The type of change set operation. To create a change set for a new stack, specify <code>CREATE</code>. To create
     * a change set for an existing stack, specify <code>UPDATE</code>.
     * </p>
     * <p>
     * If you create a change set for a new stack, AWS Cloudformation creates a stack with a unique stack ID, but no
     * template or resources. The stack will be in the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995">
     * <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change set.
     * </p>
     * <p>
     * By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't use the <code>UPDATE</code> type to
     * create a change set for a new stack or the <code>CREATE</code> type to create a change set for an existing stack.
     * </p>
     * 
     * @param changeSetType
     *        The type of change set operation. To create a change set for a new stack, specify <code>CREATE</code>. To
     *        create a change set for an existing stack, specify <code>UPDATE</code>.</p>
     *        <p>
     *        If you create a change set for a new stack, AWS Cloudformation creates a stack with a unique stack ID, but
     *        no template or resources. The stack will be in the <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     *        > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change set.
     *        </p>
     *        <p>
     *        By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't use the <code>UPDATE</code> type
     *        to create a change set for a new stack or the <code>CREATE</code> type to create a change set for an
     *        existing stack.
     * @see ChangeSetType
     */

    public void setChangeSetType(ChangeSetType changeSetType) {
        withChangeSetType(changeSetType);
    }

    /**
     * <p>
     * The type of change set operation. To create a change set for a new stack, specify <code>CREATE</code>. To create
     * a change set for an existing stack, specify <code>UPDATE</code>.
     * </p>
     * <p>
     * If you create a change set for a new stack, AWS Cloudformation creates a stack with a unique stack ID, but no
     * template or resources. The stack will be in the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995">
     * <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change set.
     * </p>
     * <p>
     * By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't use the <code>UPDATE</code> type to
     * create a change set for a new stack or the <code>CREATE</code> type to create a change set for an existing stack.
     * </p>
     * 
     * @param changeSetType
     *        The type of change set operation. To create a change set for a new stack, specify <code>CREATE</code>. To
     *        create a change set for an existing stack, specify <code>UPDATE</code>.</p>
     *        <p>
     *        If you create a change set for a new stack, AWS Cloudformation creates a stack with a unique stack ID, but
     *        no template or resources. The stack will be in the <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-describing-stacks.html#d0e11995"
     *        > <code>REVIEW_IN_PROGRESS</code> </a> state until you execute the change set.
     *        </p>
     *        <p>
     *        By default, AWS CloudFormation specifies <code>UPDATE</code>. You can't use the <code>UPDATE</code> type
     *        to create a change set for a new stack or the <code>CREATE</code> type to create a change set for an
     *        existing stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeSetType
     */

    public CreateChangeSetRequest withChangeSetType(ChangeSetType changeSetType) {
        this.changeSetType = changeSetType.toString();
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getTemplateURL() != null)
            sb.append("TemplateURL: ").append(getTemplateURL()).append(",");
        if (getUsePreviousTemplate() != null)
            sb.append("UsePreviousTemplate: ").append(getUsePreviousTemplate()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getRollbackConfiguration() != null)
            sb.append("RollbackConfiguration: ").append(getRollbackConfiguration()).append(",");
        if (getNotificationARNs() != null)
            sb.append("NotificationARNs: ").append(getNotificationARNs()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: ").append(getChangeSetName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getChangeSetType() != null)
            sb.append("ChangeSetType: ").append(getChangeSetType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChangeSetRequest == false)
            return false;
        CreateChangeSetRequest other = (CreateChangeSetRequest) obj;
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
        if (other.getRollbackConfiguration() == null ^ this.getRollbackConfiguration() == null)
            return false;
        if (other.getRollbackConfiguration() != null && other.getRollbackConfiguration().equals(this.getRollbackConfiguration()) == false)
            return false;
        if (other.getNotificationARNs() == null ^ this.getNotificationARNs() == null)
            return false;
        if (other.getNotificationARNs() != null && other.getNotificationARNs().equals(this.getNotificationARNs()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        if (other.getChangeSetType() == null ^ this.getChangeSetType() == null)
            return false;
        if (other.getChangeSetType() != null && other.getChangeSetType().equals(this.getChangeSetType()) == false)
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
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getRollbackConfiguration() == null) ? 0 : getRollbackConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNotificationARNs() == null) ? 0 : getNotificationARNs().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getChangeSetType() == null) ? 0 : getChangeSetType().hashCode());
        return hashCode;
    }

    @Override
    public CreateChangeSetRequest clone() {
        return (CreateChangeSetRequest) super.clone();
    }

}
