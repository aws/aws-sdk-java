/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CreateStackSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStackSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name to associate with the stack set. The name must be unique in the region where you create your stack set.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an
     * alphabetic character and can't be longer than 128 characters.
     * </p>
     * </note>
     */
    private String stackSetName;
    /**
     * <p>
     * A description of the stack set. You can use the description to identify the stack set's purpose or other
     * important information.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The structure that contains the template body, with a minimum length of 1 byte and a maximum length of 51,200
     * bytes. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * The location of the file that contains the template body. The URL must point to a template (maximum size: 460,800
     * bytes) that's located in an Amazon S3 bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
     * </p>
     */
    private String templateURL;
    /**
     * <p>
     * The input parameters for the stack set template.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Parameter> parameters;
    /**
     * <p>
     * A list of values that you must specify before AWS CloudFormation can create certain stack sets. Some stack set
     * templates might include resources that can affect permissions in your AWS account—for example, by creating new
     * AWS Identity and Access Management (IAM) users. For those stack sets, you must explicitly acknowledge their
     * capabilities by specifying this parameter.
     * </p>
     * <p>
     * The only valid values are CAPABILITY_IAM and CAPABILITY_NAMED_IAM. The following resources require you to specify
     * this parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS::IAM::AccessKey
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Group
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::InstanceProfile
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Policy
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Role
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::User
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::UserToGroupAddition
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions that are associated
     * with them and edit their permissions if necessary.
     * </p>
     * <p>
     * If you have IAM resources, you can specify either capability. If you have IAM resources with custom names, you
     * must specify CAPABILITY_NAMED_IAM. If you don't specify this parameter, this action returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> capabilities;
    /**
     * <p>
     * The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also
     * propagates these tags to supported resources that are created in the stacks. A maximum number of 50 tags can be
     * specified.
     * </p>
     * <p>
     * If you specify tags as part of a <code>CreateStackSet</code> action, AWS CloudFormation checks to see if you have
     * the required IAM permission to tag resources. If you don't, the entire <code>CreateStackSet</code> action fails
     * with an <code>access denied</code> error, and the stack set is not created.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * A unique identifier for this <code>CreateStackSet</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to create another stack set with the same
     * name. You might retry <code>CreateStackSet</code> requests to ensure that AWS CloudFormation successfully
     * received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one automatically.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name to associate with the stack set. The name must be unique in the region where you create your stack set.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an
     * alphabetic character and can't be longer than 128 characters.
     * </p>
     * </note>
     * 
     * @param stackSetName
     *        The name to associate with the stack set. The name must be unique in the region where you create your
     *        stack set.</p> <note>
     *        <p>
     *        A stack name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an
     *        alphabetic character and can't be longer than 128 characters.
     *        </p>
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name to associate with the stack set. The name must be unique in the region where you create your stack set.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an
     * alphabetic character and can't be longer than 128 characters.
     * </p>
     * </note>
     * 
     * @return The name to associate with the stack set. The name must be unique in the region where you create your
     *         stack set.</p> <note>
     *         <p>
     *         A stack name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an
     *         alphabetic character and can't be longer than 128 characters.
     *         </p>
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name to associate with the stack set. The name must be unique in the region where you create your stack set.
     * </p>
     * <note>
     * <p>
     * A stack name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an
     * alphabetic character and can't be longer than 128 characters.
     * </p>
     * </note>
     * 
     * @param stackSetName
     *        The name to associate with the stack set. The name must be unique in the region where you create your
     *        stack set.</p> <note>
     *        <p>
     *        A stack name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an
     *        alphabetic character and can't be longer than 128 characters.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackSetRequest withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * <p>
     * A description of the stack set. You can use the description to identify the stack set's purpose or other
     * important information.
     * </p>
     * 
     * @param description
     *        A description of the stack set. You can use the description to identify the stack set's purpose or other
     *        important information.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the stack set. You can use the description to identify the stack set's purpose or other
     * important information.
     * </p>
     * 
     * @return A description of the stack set. You can use the description to identify the stack set's purpose or other
     *         important information.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the stack set. You can use the description to identify the stack set's purpose or other
     * important information.
     * </p>
     * 
     * @param description
     *        A description of the stack set. You can use the description to identify the stack set's purpose or other
     *        important information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackSetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The structure that contains the template body, with a minimum length of 1 byte and a maximum length of 51,200
     * bytes. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
     * </p>
     * 
     * @param templateBody
     *        The structure that contains the template body, with a minimum length of 1 byte and a maximum length of
     *        51,200 bytes. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The structure that contains the template body, with a minimum length of 1 byte and a maximum length of 51,200
     * bytes. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
     * </p>
     * 
     * @return The structure that contains the template body, with a minimum length of 1 byte and a maximum length of
     *         51,200 bytes. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *         <p>
     *         Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * The structure that contains the template body, with a minimum length of 1 byte and a maximum length of 51,200
     * bytes. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
     * </p>
     * 
     * @param templateBody
     *        The structure that contains the template body, with a minimum length of 1 byte and a maximum length of
     *        51,200 bytes. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackSetRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * The location of the file that contains the template body. The URL must point to a template (maximum size: 460,800
     * bytes) that's located in an Amazon S3 bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
     * </p>
     * 
     * @param templateURL
     *        The location of the file that contains the template body. The URL must point to a template (maximum size:
     *        460,800 bytes) that's located in an Amazon S3 bucket. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
     */

    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }

    /**
     * <p>
     * The location of the file that contains the template body. The URL must point to a template (maximum size: 460,800
     * bytes) that's located in an Amazon S3 bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
     * </p>
     * 
     * @return The location of the file that contains the template body. The URL must point to a template (maximum size:
     *         460,800 bytes) that's located in an Amazon S3 bucket. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *         <p>
     *         Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
     */

    public String getTemplateURL() {
        return this.templateURL;
    }

    /**
     * <p>
     * The location of the file that contains the template body. The URL must point to a template (maximum size: 460,800
     * bytes) that's located in an Amazon S3 bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
     * </p>
     * 
     * @param templateURL
     *        The location of the file that contains the template body. The URL must point to a template (maximum size:
     *        460,800 bytes) that's located in an Amazon S3 bucket. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackSetRequest withTemplateURL(String templateURL) {
        setTemplateURL(templateURL);
        return this;
    }

    /**
     * <p>
     * The input parameters for the stack set template.
     * </p>
     * 
     * @return The input parameters for the stack set template.
     */

    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<Parameter>();
        }
        return parameters;
    }

    /**
     * <p>
     * The input parameters for the stack set template.
     * </p>
     * 
     * @param parameters
     *        The input parameters for the stack set template.
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
     * The input parameters for the stack set template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        The input parameters for the stack set template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackSetRequest withParameters(Parameter... parameters) {
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
     * The input parameters for the stack set template.
     * </p>
     * 
     * @param parameters
     *        The input parameters for the stack set template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackSetRequest withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * A list of values that you must specify before AWS CloudFormation can create certain stack sets. Some stack set
     * templates might include resources that can affect permissions in your AWS account—for example, by creating new
     * AWS Identity and Access Management (IAM) users. For those stack sets, you must explicitly acknowledge their
     * capabilities by specifying this parameter.
     * </p>
     * <p>
     * The only valid values are CAPABILITY_IAM and CAPABILITY_NAMED_IAM. The following resources require you to specify
     * this parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS::IAM::AccessKey
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Group
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::InstanceProfile
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Policy
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Role
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::User
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::UserToGroupAddition
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions that are associated
     * with them and edit their permissions if necessary.
     * </p>
     * <p>
     * If you have IAM resources, you can specify either capability. If you have IAM resources with custom names, you
     * must specify CAPABILITY_NAMED_IAM. If you don't specify this parameter, this action returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     * 
     * @return A list of values that you must specify before AWS CloudFormation can create certain stack sets. Some
     *         stack set templates might include resources that can affect permissions in your AWS account—for example,
     *         by creating new AWS Identity and Access Management (IAM) users. For those stack sets, you must explicitly
     *         acknowledge their capabilities by specifying this parameter.</p>
     *         <p>
     *         The only valid values are CAPABILITY_IAM and CAPABILITY_NAMED_IAM. The following resources require you to
     *         specify this parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AWS::IAM::AccessKey
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS::IAM::Group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS::IAM::InstanceProfile
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS::IAM::Policy
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS::IAM::Role
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS::IAM::User
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS::IAM::UserToGroupAddition
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If your stack template contains these resources, we recommend that you review all permissions that are
     *         associated with them and edit their permissions if necessary.
     *         </p>
     *         <p>
     *         If you have IAM resources, you can specify either capability. If you have IAM resources with custom
     *         names, you must specify CAPABILITY_NAMED_IAM. If you don't specify this parameter, this action returns an
     *         <code>InsufficientCapabilities</code> error.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *         >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
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
     * A list of values that you must specify before AWS CloudFormation can create certain stack sets. Some stack set
     * templates might include resources that can affect permissions in your AWS account—for example, by creating new
     * AWS Identity and Access Management (IAM) users. For those stack sets, you must explicitly acknowledge their
     * capabilities by specifying this parameter.
     * </p>
     * <p>
     * The only valid values are CAPABILITY_IAM and CAPABILITY_NAMED_IAM. The following resources require you to specify
     * this parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS::IAM::AccessKey
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Group
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::InstanceProfile
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Policy
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Role
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::User
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::UserToGroupAddition
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions that are associated
     * with them and edit their permissions if necessary.
     * </p>
     * <p>
     * If you have IAM resources, you can specify either capability. If you have IAM resources with custom names, you
     * must specify CAPABILITY_NAMED_IAM. If you don't specify this parameter, this action returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     * 
     * @param capabilities
     *        A list of values that you must specify before AWS CloudFormation can create certain stack sets. Some stack
     *        set templates might include resources that can affect permissions in your AWS account—for example, by
     *        creating new AWS Identity and Access Management (IAM) users. For those stack sets, you must explicitly
     *        acknowledge their capabilities by specifying this parameter.</p>
     *        <p>
     *        The only valid values are CAPABILITY_IAM and CAPABILITY_NAMED_IAM. The following resources require you to
     *        specify this parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS::IAM::AccessKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::Group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::InstanceProfile
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::Policy
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::Role
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::User
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::UserToGroupAddition
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If your stack template contains these resources, we recommend that you review all permissions that are
     *        associated with them and edit their permissions if necessary.
     *        </p>
     *        <p>
     *        If you have IAM resources, you can specify either capability. If you have IAM resources with custom names,
     *        you must specify CAPABILITY_NAMED_IAM. If you don't specify this parameter, this action returns an
     *        <code>InsufficientCapabilities</code> error.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
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
     * A list of values that you must specify before AWS CloudFormation can create certain stack sets. Some stack set
     * templates might include resources that can affect permissions in your AWS account—for example, by creating new
     * AWS Identity and Access Management (IAM) users. For those stack sets, you must explicitly acknowledge their
     * capabilities by specifying this parameter.
     * </p>
     * <p>
     * The only valid values are CAPABILITY_IAM and CAPABILITY_NAMED_IAM. The following resources require you to specify
     * this parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS::IAM::AccessKey
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Group
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::InstanceProfile
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Policy
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Role
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::User
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::UserToGroupAddition
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions that are associated
     * with them and edit their permissions if necessary.
     * </p>
     * <p>
     * If you have IAM resources, you can specify either capability. If you have IAM resources with custom names, you
     * must specify CAPABILITY_NAMED_IAM. If you don't specify this parameter, this action returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        A list of values that you must specify before AWS CloudFormation can create certain stack sets. Some stack
     *        set templates might include resources that can affect permissions in your AWS account—for example, by
     *        creating new AWS Identity and Access Management (IAM) users. For those stack sets, you must explicitly
     *        acknowledge their capabilities by specifying this parameter.</p>
     *        <p>
     *        The only valid values are CAPABILITY_IAM and CAPABILITY_NAMED_IAM. The following resources require you to
     *        specify this parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS::IAM::AccessKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::Group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::InstanceProfile
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::Policy
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::Role
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::User
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::UserToGroupAddition
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If your stack template contains these resources, we recommend that you review all permissions that are
     *        associated with them and edit their permissions if necessary.
     *        </p>
     *        <p>
     *        If you have IAM resources, you can specify either capability. If you have IAM resources with custom names,
     *        you must specify CAPABILITY_NAMED_IAM. If you don't specify this parameter, this action returns an
     *        <code>InsufficientCapabilities</code> error.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateStackSetRequest withCapabilities(String... capabilities) {
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
     * A list of values that you must specify before AWS CloudFormation can create certain stack sets. Some stack set
     * templates might include resources that can affect permissions in your AWS account—for example, by creating new
     * AWS Identity and Access Management (IAM) users. For those stack sets, you must explicitly acknowledge their
     * capabilities by specifying this parameter.
     * </p>
     * <p>
     * The only valid values are CAPABILITY_IAM and CAPABILITY_NAMED_IAM. The following resources require you to specify
     * this parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS::IAM::AccessKey
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Group
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::InstanceProfile
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Policy
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Role
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::User
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::UserToGroupAddition
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions that are associated
     * with them and edit their permissions if necessary.
     * </p>
     * <p>
     * If you have IAM resources, you can specify either capability. If you have IAM resources with custom names, you
     * must specify CAPABILITY_NAMED_IAM. If you don't specify this parameter, this action returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     * 
     * @param capabilities
     *        A list of values that you must specify before AWS CloudFormation can create certain stack sets. Some stack
     *        set templates might include resources that can affect permissions in your AWS account—for example, by
     *        creating new AWS Identity and Access Management (IAM) users. For those stack sets, you must explicitly
     *        acknowledge their capabilities by specifying this parameter.</p>
     *        <p>
     *        The only valid values are CAPABILITY_IAM and CAPABILITY_NAMED_IAM. The following resources require you to
     *        specify this parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS::IAM::AccessKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::Group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::InstanceProfile
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::Policy
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::Role
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::User
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::UserToGroupAddition
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If your stack template contains these resources, we recommend that you review all permissions that are
     *        associated with them and edit their permissions if necessary.
     *        </p>
     *        <p>
     *        If you have IAM resources, you can specify either capability. If you have IAM resources with custom names,
     *        you must specify CAPABILITY_NAMED_IAM. If you don't specify this parameter, this action returns an
     *        <code>InsufficientCapabilities</code> error.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateStackSetRequest withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * A list of values that you must specify before AWS CloudFormation can create certain stack sets. Some stack set
     * templates might include resources that can affect permissions in your AWS account—for example, by creating new
     * AWS Identity and Access Management (IAM) users. For those stack sets, you must explicitly acknowledge their
     * capabilities by specifying this parameter.
     * </p>
     * <p>
     * The only valid values are CAPABILITY_IAM and CAPABILITY_NAMED_IAM. The following resources require you to specify
     * this parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS::IAM::AccessKey
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Group
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::InstanceProfile
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Policy
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::Role
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::User
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS::IAM::UserToGroupAddition
     * </p>
     * </li>
     * </ul>
     * <p>
     * If your stack template contains these resources, we recommend that you review all permissions that are associated
     * with them and edit their permissions if necessary.
     * </p>
     * <p>
     * If you have IAM resources, you can specify either capability. If you have IAM resources with custom names, you
     * must specify CAPABILITY_NAMED_IAM. If you don't specify this parameter, this action returns an
     * <code>InsufficientCapabilities</code> error.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     * 
     * @param capabilities
     *        A list of values that you must specify before AWS CloudFormation can create certain stack sets. Some stack
     *        set templates might include resources that can affect permissions in your AWS account—for example, by
     *        creating new AWS Identity and Access Management (IAM) users. For those stack sets, you must explicitly
     *        acknowledge their capabilities by specifying this parameter.</p>
     *        <p>
     *        The only valid values are CAPABILITY_IAM and CAPABILITY_NAMED_IAM. The following resources require you to
     *        specify this parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS::IAM::AccessKey
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::Group
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::InstanceProfile
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::Policy
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::Role
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::User
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS::IAM::UserToGroupAddition
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If your stack template contains these resources, we recommend that you review all permissions that are
     *        associated with them and edit their permissions if necessary.
     *        </p>
     *        <p>
     *        If you have IAM resources, you can specify either capability. If you have IAM resources with custom names,
     *        you must specify CAPABILITY_NAMED_IAM. If you don't specify this parameter, this action returns an
     *        <code>InsufficientCapabilities</code> error.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public CreateStackSetRequest withCapabilities(Capability... capabilities) {
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
     * The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also
     * propagates these tags to supported resources that are created in the stacks. A maximum number of 50 tags can be
     * specified.
     * </p>
     * <p>
     * If you specify tags as part of a <code>CreateStackSet</code> action, AWS CloudFormation checks to see if you have
     * the required IAM permission to tag resources. If you don't, the entire <code>CreateStackSet</code> action fails
     * with an <code>access denied</code> error, and the stack set is not created.
     * </p>
     * 
     * @return The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation
     *         also propagates these tags to supported resources that are created in the stacks. A maximum number of 50
     *         tags can be specified.</p>
     *         <p>
     *         If you specify tags as part of a <code>CreateStackSet</code> action, AWS CloudFormation checks to see if
     *         you have the required IAM permission to tag resources. If you don't, the entire
     *         <code>CreateStackSet</code> action fails with an <code>access denied</code> error, and the stack set is
     *         not created.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also
     * propagates these tags to supported resources that are created in the stacks. A maximum number of 50 tags can be
     * specified.
     * </p>
     * <p>
     * If you specify tags as part of a <code>CreateStackSet</code> action, AWS CloudFormation checks to see if you have
     * the required IAM permission to tag resources. If you don't, the entire <code>CreateStackSet</code> action fails
     * with an <code>access denied</code> error, and the stack set is not created.
     * </p>
     * 
     * @param tags
     *        The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation
     *        also propagates these tags to supported resources that are created in the stacks. A maximum number of 50
     *        tags can be specified.</p>
     *        <p>
     *        If you specify tags as part of a <code>CreateStackSet</code> action, AWS CloudFormation checks to see if
     *        you have the required IAM permission to tag resources. If you don't, the entire
     *        <code>CreateStackSet</code> action fails with an <code>access denied</code> error, and the stack set is
     *        not created.
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
     * The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also
     * propagates these tags to supported resources that are created in the stacks. A maximum number of 50 tags can be
     * specified.
     * </p>
     * <p>
     * If you specify tags as part of a <code>CreateStackSet</code> action, AWS CloudFormation checks to see if you have
     * the required IAM permission to tag resources. If you don't, the entire <code>CreateStackSet</code> action fails
     * with an <code>access denied</code> error, and the stack set is not created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation
     *        also propagates these tags to supported resources that are created in the stacks. A maximum number of 50
     *        tags can be specified.</p>
     *        <p>
     *        If you specify tags as part of a <code>CreateStackSet</code> action, AWS CloudFormation checks to see if
     *        you have the required IAM permission to tag resources. If you don't, the entire
     *        <code>CreateStackSet</code> action fails with an <code>access denied</code> error, and the stack set is
     *        not created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackSetRequest withTags(Tag... tags) {
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
     * The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also
     * propagates these tags to supported resources that are created in the stacks. A maximum number of 50 tags can be
     * specified.
     * </p>
     * <p>
     * If you specify tags as part of a <code>CreateStackSet</code> action, AWS CloudFormation checks to see if you have
     * the required IAM permission to tag resources. If you don't, the entire <code>CreateStackSet</code> action fails
     * with an <code>access denied</code> error, and the stack set is not created.
     * </p>
     * 
     * @param tags
     *        The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation
     *        also propagates these tags to supported resources that are created in the stacks. A maximum number of 50
     *        tags can be specified.</p>
     *        <p>
     *        If you specify tags as part of a <code>CreateStackSet</code> action, AWS CloudFormation checks to see if
     *        you have the required IAM permission to tag resources. If you don't, the entire
     *        <code>CreateStackSet</code> action fails with an <code>access denied</code> error, and the stack set is
     *        not created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackSetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateStackSet</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to create another stack set with the same
     * name. You might retry <code>CreateStackSet</code> requests to ensure that AWS CloudFormation successfully
     * received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one automatically.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for this <code>CreateStackSet</code> request. Specify this token if you plan to retry
     *        requests so that AWS CloudFormation knows that you're not attempting to create another stack set with the
     *        same name. You might retry <code>CreateStackSet</code> requests to ensure that AWS CloudFormation
     *        successfully received them.</p>
     *        <p>
     *        If you don't specify an operation ID, the SDK generates one automatically.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateStackSet</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to create another stack set with the same
     * name. You might retry <code>CreateStackSet</code> requests to ensure that AWS CloudFormation successfully
     * received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one automatically.
     * </p>
     * 
     * @return A unique identifier for this <code>CreateStackSet</code> request. Specify this token if you plan to retry
     *         requests so that AWS CloudFormation knows that you're not attempting to create another stack set with the
     *         same name. You might retry <code>CreateStackSet</code> requests to ensure that AWS CloudFormation
     *         successfully received them.</p>
     *         <p>
     *         If you don't specify an operation ID, the SDK generates one automatically.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>CreateStackSet</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to create another stack set with the same
     * name. You might retry <code>CreateStackSet</code> requests to ensure that AWS CloudFormation successfully
     * received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one automatically.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for this <code>CreateStackSet</code> request. Specify this token if you plan to retry
     *        requests so that AWS CloudFormation knows that you're not attempting to create another stack set with the
     *        same name. You might retry <code>CreateStackSet</code> requests to ensure that AWS CloudFormation
     *        successfully received them.</p>
     *        <p>
     *        If you don't specify an operation ID, the SDK generates one automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStackSetRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getTemplateURL() != null)
            sb.append("TemplateURL: ").append(getTemplateURL()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStackSetRequest == false)
            return false;
        CreateStackSetRequest other = (CreateStackSetRequest) obj;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getTemplateURL() == null) ? 0 : getTemplateURL().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateStackSetRequest clone() {
        return (CreateStackSetRequest) super.clone();
    }

}
