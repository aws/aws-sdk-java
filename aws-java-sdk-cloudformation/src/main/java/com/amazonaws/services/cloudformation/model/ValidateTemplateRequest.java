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
 * The input for <a>ValidateTemplate</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ValidateTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateURL</code> or <code>TemplateBody</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is
     * located in an Amazon S3 bucket. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateURL</code> or <code>TemplateBody</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     */
    private String templateURL;

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateURL</code> or <code>TemplateBody</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     * 
     * @param templateBody
     *        Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *        bytes. For more information, go to <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must pass <code>TemplateURL</code> or <code>TemplateBody</code>. If both are passed, only
     *        <code>TemplateBody</code> is used.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateURL</code> or <code>TemplateBody</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     * 
     * @return Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *         bytes. For more information, go to <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *         <p>
     *         Conditional: You must pass <code>TemplateURL</code> or <code>TemplateBody</code>. If both are passed,
     *         only <code>TemplateBody</code> is used.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For
     * more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateURL</code> or <code>TemplateBody</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     * 
     * @param templateBody
     *        Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *        bytes. For more information, go to <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must pass <code>TemplateURL</code> or <code>TemplateBody</code>. If both are passed, only
     *        <code>TemplateBody</code> is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateTemplateRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is
     * located in an Amazon S3 bucket. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateURL</code> or <code>TemplateBody</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     * 
     * @param templateURL
     *        Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes)
     *        that is located in an Amazon S3 bucket. For more information, go to <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must pass <code>TemplateURL</code> or <code>TemplateBody</code>. If both are passed, only
     *        <code>TemplateBody</code> is used.
     */

    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is
     * located in an Amazon S3 bucket. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateURL</code> or <code>TemplateBody</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     * 
     * @return Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes)
     *         that is located in an Amazon S3 bucket. For more information, go to <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *         <p>
     *         Conditional: You must pass <code>TemplateURL</code> or <code>TemplateBody</code>. If both are passed,
     *         only <code>TemplateBody</code> is used.
     */

    public String getTemplateURL() {
        return this.templateURL;
    }

    /**
     * <p>
     * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is
     * located in an Amazon S3 bucket. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template Anatomy</a>
     * in the AWS CloudFormation User Guide.
     * </p>
     * <p>
     * Conditional: You must pass <code>TemplateURL</code> or <code>TemplateBody</code>. If both are passed, only
     * <code>TemplateBody</code> is used.
     * </p>
     * 
     * @param templateURL
     *        Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes)
     *        that is located in an Amazon S3 bucket. For more information, go to <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *        Anatomy</a> in the AWS CloudFormation User Guide.</p>
     *        <p>
     *        Conditional: You must pass <code>TemplateURL</code> or <code>TemplateBody</code>. If both are passed, only
     *        <code>TemplateBody</code> is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateTemplateRequest withTemplateURL(String templateURL) {
        setTemplateURL(templateURL);
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
            sb.append("TemplateURL: ").append(getTemplateURL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateTemplateRequest == false)
            return false;
        ValidateTemplateRequest other = (ValidateTemplateRequest) obj;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getTemplateURL() == null ^ this.getTemplateURL() == null)
            return false;
        if (other.getTemplateURL() != null && other.getTemplateURL().equals(this.getTemplateURL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getTemplateURL() == null) ? 0 : getTemplateURL().hashCode());
        return hashCode;
    }

    @Override
    public ValidateTemplateRequest clone() {
        return (ValidateTemplateRequest) super.clone();
    }

}
