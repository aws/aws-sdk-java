/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The input for the <a>GetTemplateSummary</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/GetTemplateSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTemplateSummaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information about templates, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is
     * located in an Amazon S3 bucket or a Systems Manager document. For more information about templates, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     */
    private String templateURL;
    /**
     * <p>
     * The name or the stack ID that is associated with the stack, which are not always interchangeable. For running
     * stacks, you can specify either the stack's name or its unique stack ID. For deleted stack, you must specify the
     * unique stack ID.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The name or unique ID of the stack set from which the stack was created.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     */
    private String stackSetName;
    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String callAs;

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information about templates, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @param templateBody
     *        Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *        bytes. For more information about templates, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *        <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information about templates, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @return Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *         bytes. For more information about templates, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *         <p>
     *         Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *         <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information about templates, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @param templateBody
     *        Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *        bytes. For more information about templates, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *        <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateSummaryRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is
     * located in an Amazon S3 bucket or a Systems Manager document. For more information about templates, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @param templateURL
     *        Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes)
     *        that is located in an Amazon S3 bucket or a Systems Manager document. For more information about
     *        templates, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *        <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     */

    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is
     * located in an Amazon S3 bucket or a Systems Manager document. For more information about templates, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @return Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes)
     *         that is located in an Amazon S3 bucket or a Systems Manager document. For more information about
     *         templates, see <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *         <p>
     *         Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *         <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     */

    public String getTemplateURL() {
        return this.templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is
     * located in an Amazon S3 bucket or a Systems Manager document. For more information about templates, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @param templateURL
     *        Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes)
     *        that is located in an Amazon S3 bucket or a Systems Manager document. For more information about
     *        templates, see <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *        <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateSummaryRequest withTemplateURL(String templateURL) {
        setTemplateURL(templateURL);
        return this;
    }

    /**
     * <p>
     * The name or the stack ID that is associated with the stack, which are not always interchangeable. For running
     * stacks, you can specify either the stack's name or its unique stack ID. For deleted stack, you must specify the
     * unique stack ID.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @param stackName
     *        The name or the stack ID that is associated with the stack, which are not always interchangeable. For
     *        running stacks, you can specify either the stack's name or its unique stack ID. For deleted stack, you
     *        must specify the unique stack ID.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *        <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or the stack ID that is associated with the stack, which are not always interchangeable. For running
     * stacks, you can specify either the stack's name or its unique stack ID. For deleted stack, you must specify the
     * unique stack ID.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @return The name or the stack ID that is associated with the stack, which are not always interchangeable. For
     *         running stacks, you can specify either the stack's name or its unique stack ID. For deleted stack, you
     *         must specify the unique stack ID.</p>
     *         <p>
     *         Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *         <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name or the stack ID that is associated with the stack, which are not always interchangeable. For running
     * stacks, you can specify either the stack's name or its unique stack ID. For deleted stack, you must specify the
     * unique stack ID.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @param stackName
     *        The name or the stack ID that is associated with the stack, which are not always interchangeable. For
     *        running stacks, you can specify either the stack's name or its unique stack ID. For deleted stack, you
     *        must specify the unique stack ID.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *        <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateSummaryRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The name or unique ID of the stack set from which the stack was created.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @param stackSetName
     *        The name or unique ID of the stack set from which the stack was created.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *        <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set from which the stack was created.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @return The name or unique ID of the stack set from which the stack was created.</p>
     *         <p>
     *         Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *         <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set from which the stack was created.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @param stackSetName
     *        The name or unique ID of the stack set from which the stack was created.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *        <code>StackSetName</code>, <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateSummaryRequest withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *        organization's management account or as a delegated administrator in a member account.</p>
     *        <p>
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        <p>
     *        Your AWS account must be registered as a delegated administrator in the management account. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *        >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *        </p>
     *        </li>
     * @see CallAs
     */

    public void setCallAs(String callAs) {
        this.callAs = callAs;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *         organization's management account or as a delegated administrator in a member account.</p>
     *         <p>
     *         By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *         permissions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you are signed in to the management account, specify <code>SELF</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *         </p>
     *         <p>
     *         Your AWS account must be registered as a delegated administrator in the management account. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *         >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *         </p>
     *         </li>
     * @see CallAs
     */

    public String getCallAs() {
        return this.callAs;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *        organization's management account or as a delegated administrator in a member account.</p>
     *        <p>
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        <p>
     *        Your AWS account must be registered as a delegated administrator in the management account. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *        >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAs
     */

    public GetTemplateSummaryRequest withCallAs(String callAs) {
        setCallAs(callAs);
        return this;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your AWS account must be registered as a delegated administrator in the management account. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html">
     * Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *        organization's management account or as a delegated administrator in a member account.</p>
     *        <p>
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        <p>
     *        Your AWS account must be registered as a delegated administrator in the management account. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *        >Register a delegated administrator</a> in the <i>AWS CloudFormation User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAs
     */

    public GetTemplateSummaryRequest withCallAs(CallAs callAs) {
        this.callAs = callAs.toString();
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
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getTemplateURL() != null)
            sb.append("TemplateURL: ").append(getTemplateURL()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName()).append(",");
        if (getCallAs() != null)
            sb.append("CallAs: ").append(getCallAs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTemplateSummaryRequest == false)
            return false;
        GetTemplateSummaryRequest other = (GetTemplateSummaryRequest) obj;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getTemplateURL() == null ^ this.getTemplateURL() == null)
            return false;
        if (other.getTemplateURL() != null && other.getTemplateURL().equals(this.getTemplateURL()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getCallAs() == null ^ this.getCallAs() == null)
            return false;
        if (other.getCallAs() != null && other.getCallAs().equals(this.getCallAs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getTemplateURL() == null) ? 0 : getTemplateURL().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getCallAs() == null) ? 0 : getCallAs().hashCode());
        return hashCode;
    }

    @Override
    public GetTemplateSummaryRequest clone() {
        return (GetTemplateSummaryRequest) super.clone();
    }

}
