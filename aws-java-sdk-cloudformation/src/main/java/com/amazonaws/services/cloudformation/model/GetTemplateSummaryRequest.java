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
 * The input for the <a>GetTemplateSummary</a> action.
 * </p>
 */
public class GetTemplateSummaryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information about templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is
     * located in an Amazon S3 bucket. For more information about templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
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
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     */
    private String stackName;

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information about templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @param templateBody
     *        Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *        bytes. For more information about templates, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *        <code>TemplateBody</code>, or <code>TemplateURL</code>.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information about templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @return Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *         bytes. For more information about templates, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *         <p>
     *         Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *         <code>TemplateBody</code>, or <code>TemplateURL</code>.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information about templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @param templateBody
     *        Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *        bytes. For more information about templates, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *        <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateSummaryRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is
     * located in an Amazon S3 bucket. For more information about templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @param templateURL
     *        Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes)
     *        that is located in an Amazon S3 bucket. For more information about templates, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *        <code>TemplateBody</code>, or <code>TemplateURL</code>.
     */

    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is
     * located in an Amazon S3 bucket. For more information about templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @return Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes)
     *         that is located in an Amazon S3 bucket. For more information about templates, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *         <p>
     *         Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *         <code>TemplateBody</code>, or <code>TemplateURL</code>.
     */

    public String getTemplateURL() {
        return this.templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is
     * located in an Amazon S3 bucket. For more information about templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @param templateURL
     *        Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes)
     *        that is located in an Amazon S3 bucket. For more information about templates, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *        <code>TemplateBody</code>, or <code>TemplateURL</code>.
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
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @param stackName
     *        The name or the stack ID that is associated with the stack, which are not always interchangeable. For
     *        running stacks, you can specify either the stack's name or its unique stack ID. For deleted stack, you
     *        must specify the unique stack ID.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *        <code>TemplateBody</code>, or <code>TemplateURL</code>.
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
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @return The name or the stack ID that is associated with the stack, which are not always interchangeable. For
     *         running stacks, you can specify either the stack's name or its unique stack ID. For deleted stack, you
     *         must specify the unique stack ID.</p>
     *         <p>
     *         Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *         <code>TemplateBody</code>, or <code>TemplateURL</code>.
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
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * </p>
     * 
     * @param stackName
     *        The name or the stack ID that is associated with the stack, which are not always interchangeable. For
     *        running stacks, you can specify either the stack's name or its unique stack ID. For deleted stack, you
     *        must specify the unique stack ID.</p>
     *        <p>
     *        Conditional: You must specify only one of the following parameters: <code>StackName</code>,
     *        <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateSummaryRequest withStackName(String stackName) {
        setStackName(stackName);
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
        if (getTemplateBody() != null)
            sb.append("TemplateBody: " + getTemplateBody() + ",");
        if (getTemplateURL() != null)
            sb.append("TemplateURL: " + getTemplateURL() + ",");
        if (getStackName() != null)
            sb.append("StackName: " + getStackName());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getTemplateURL() == null) ? 0 : getTemplateURL().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        return hashCode;
    }

    @Override
    public GetTemplateSummaryRequest clone() {
        return (GetTemplateSummaryRequest) super.clone();
    }
}
