/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#getTemplateSummary(GetTemplateSummaryRequest) GetTemplateSummary operation}.
 * <p>
 * Returns information about a new or existing template. The
 * <code>GetTemplateSummary</code> action is useful for viewing parameter
 * information, such as default parameter values and parameter types,
 * before you create or update a stack.
 * </p>
 * <p>
 * You can use the <code>GetTemplateSummary</code> action when you submit
 * a template, or you can get template information for a running or
 * deleted stack.
 * </p>
 * <p>
 * For deleted stacks, <code>GetTemplateSummary</code> returns the
 * template information for up to 90 days after the stack has been
 * deleted. If the template does not exist, a
 * <code>ValidationError</code> is returned.
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#getTemplateSummary(GetTemplateSummaryRequest)
 */
public class GetTemplateSummaryRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. For more information about
     * templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     * Anatomy</a> in the AWS CloudFormation User Guide. <p>Conditional: You
     * must specify only one of the following parameters:
     * <code>StackName</code>, <code>TemplateBody</code>, or
     * <code>TemplateURL</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String templateBody;

    /**
     * Location of file containing the template body. The URL must point to a
     * template (max size: 307,200 bytes) located in an Amazon S3 bucket. For
     * more information about templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     * Anatomy</a> in the AWS CloudFormation User Guide. <p>Conditional: You
     * must specify only one of the following parameters:
     * <code>StackName</code>, <code>TemplateBody</code>, or
     * <code>TemplateURL</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String templateURL;

    /**
     * The name or the unique identifier associated with the stack, which are
     * not always interchangeable. For running stacks, you can specify either
     * the stack's name or its unique stack ID. For deleted stack, you must
     * specify the unique stack ID. <p>Conditional: You must specify only one
     * of the following parameters: <code>StackName</code>,
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)<br/>
     */
    private String stackName;

    /**
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. For more information about
     * templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     * Anatomy</a> in the AWS CloudFormation User Guide. <p>Conditional: You
     * must specify only one of the following parameters:
     * <code>StackName</code>, <code>TemplateBody</code>, or
     * <code>TemplateURL</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Structure containing the template body with a minimum length of 1 byte
     *         and a maximum length of 51,200 bytes. For more information about
     *         templates, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide. <p>Conditional: You
     *         must specify only one of the following parameters:
     *         <code>StackName</code>, <code>TemplateBody</code>, or
     *         <code>TemplateURL</code>.
     */
    public String getTemplateBody() {
        return templateBody;
    }
    
    /**
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. For more information about
     * templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     * Anatomy</a> in the AWS CloudFormation User Guide. <p>Conditional: You
     * must specify only one of the following parameters:
     * <code>StackName</code>, <code>TemplateBody</code>, or
     * <code>TemplateURL</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody Structure containing the template body with a minimum length of 1 byte
     *         and a maximum length of 51,200 bytes. For more information about
     *         templates, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide. <p>Conditional: You
     *         must specify only one of the following parameters:
     *         <code>StackName</code>, <code>TemplateBody</code>, or
     *         <code>TemplateURL</code>.
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }
    
    /**
     * Structure containing the template body with a minimum length of 1 byte
     * and a maximum length of 51,200 bytes. For more information about
     * templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     * Anatomy</a> in the AWS CloudFormation User Guide. <p>Conditional: You
     * must specify only one of the following parameters:
     * <code>StackName</code>, <code>TemplateBody</code>, or
     * <code>TemplateURL</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody Structure containing the template body with a minimum length of 1 byte
     *         and a maximum length of 51,200 bytes. For more information about
     *         templates, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide. <p>Conditional: You
     *         must specify only one of the following parameters:
     *         <code>StackName</code>, <code>TemplateBody</code>, or
     *         <code>TemplateURL</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTemplateSummaryRequest withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * Location of file containing the template body. The URL must point to a
     * template (max size: 307,200 bytes) located in an Amazon S3 bucket. For
     * more information about templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     * Anatomy</a> in the AWS CloudFormation User Guide. <p>Conditional: You
     * must specify only one of the following parameters:
     * <code>StackName</code>, <code>TemplateBody</code>, or
     * <code>TemplateURL</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return Location of file containing the template body. The URL must point to a
     *         template (max size: 307,200 bytes) located in an Amazon S3 bucket. For
     *         more information about templates, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide. <p>Conditional: You
     *         must specify only one of the following parameters:
     *         <code>StackName</code>, <code>TemplateBody</code>, or
     *         <code>TemplateURL</code>.
     */
    public String getTemplateURL() {
        return templateURL;
    }
    
    /**
     * Location of file containing the template body. The URL must point to a
     * template (max size: 307,200 bytes) located in an Amazon S3 bucket. For
     * more information about templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     * Anatomy</a> in the AWS CloudFormation User Guide. <p>Conditional: You
     * must specify only one of the following parameters:
     * <code>StackName</code>, <code>TemplateBody</code>, or
     * <code>TemplateURL</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL Location of file containing the template body. The URL must point to a
     *         template (max size: 307,200 bytes) located in an Amazon S3 bucket. For
     *         more information about templates, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide. <p>Conditional: You
     *         must specify only one of the following parameters:
     *         <code>StackName</code>, <code>TemplateBody</code>, or
     *         <code>TemplateURL</code>.
     */
    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }
    
    /**
     * Location of file containing the template body. The URL must point to a
     * template (max size: 307,200 bytes) located in an Amazon S3 bucket. For
     * more information about templates, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     * Anatomy</a> in the AWS CloudFormation User Guide. <p>Conditional: You
     * must specify only one of the following parameters:
     * <code>StackName</code>, <code>TemplateBody</code>, or
     * <code>TemplateURL</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL Location of file containing the template body. The URL must point to a
     *         template (max size: 307,200 bytes) located in an Amazon S3 bucket. For
     *         more information about templates, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html">Template
     *         Anatomy</a> in the AWS CloudFormation User Guide. <p>Conditional: You
     *         must specify only one of the following parameters:
     *         <code>StackName</code>, <code>TemplateBody</code>, or
     *         <code>TemplateURL</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTemplateSummaryRequest withTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }

    /**
     * The name or the unique identifier associated with the stack, which are
     * not always interchangeable. For running stacks, you can specify either
     * the stack's name or its unique stack ID. For deleted stack, you must
     * specify the unique stack ID. <p>Conditional: You must specify only one
     * of the following parameters: <code>StackName</code>,
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)<br/>
     *
     * @return The name or the unique identifier associated with the stack, which are
     *         not always interchangeable. For running stacks, you can specify either
     *         the stack's name or its unique stack ID. For deleted stack, you must
     *         specify the unique stack ID. <p>Conditional: You must specify only one
     *         of the following parameters: <code>StackName</code>,
     *         <code>TemplateBody</code>, or <code>TemplateURL</code>.
     */
    public String getStackName() {
        return stackName;
    }
    
    /**
     * The name or the unique identifier associated with the stack, which are
     * not always interchangeable. For running stacks, you can specify either
     * the stack's name or its unique stack ID. For deleted stack, you must
     * specify the unique stack ID. <p>Conditional: You must specify only one
     * of the following parameters: <code>StackName</code>,
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName The name or the unique identifier associated with the stack, which are
     *         not always interchangeable. For running stacks, you can specify either
     *         the stack's name or its unique stack ID. For deleted stack, you must
     *         specify the unique stack ID. <p>Conditional: You must specify only one
     *         of the following parameters: <code>StackName</code>,
     *         <code>TemplateBody</code>, or <code>TemplateURL</code>.
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }
    
    /**
     * The name or the unique identifier associated with the stack, which are
     * not always interchangeable. For running stacks, you can specify either
     * the stack's name or its unique stack ID. For deleted stack, you must
     * specify the unique stack ID. <p>Conditional: You must specify only one
     * of the following parameters: <code>StackName</code>,
     * <code>TemplateBody</code>, or <code>TemplateURL</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName The name or the unique identifier associated with the stack, which are
     *         not always interchangeable. For running stacks, you can specify either
     *         the stack's name or its unique stack ID. For deleted stack, you must
     *         specify the unique stack ID. <p>Conditional: You must specify only one
     *         of the following parameters: <code>StackName</code>,
     *         <code>TemplateBody</code>, or <code>TemplateURL</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTemplateSummaryRequest withStackName(String stackName) {
        this.stackName = stackName;
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
        if (getTemplateBody() != null) sb.append("TemplateBody: " + getTemplateBody() + ",");
        if (getTemplateURL() != null) sb.append("TemplateURL: " + getTemplateURL() + ",");
        if (getStackName() != null) sb.append("StackName: " + getStackName() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetTemplateSummaryRequest == false) return false;
        GetTemplateSummaryRequest other = (GetTemplateSummaryRequest)obj;
        
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null) return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false) return false; 
        if (other.getTemplateURL() == null ^ this.getTemplateURL() == null) return false;
        if (other.getTemplateURL() != null && other.getTemplateURL().equals(this.getTemplateURL()) == false) return false; 
        if (other.getStackName() == null ^ this.getStackName() == null) return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false) return false; 
        return true;
    }
    
}
    