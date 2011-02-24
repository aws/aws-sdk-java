/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#createStack(CreateStackRequest) CreateStack operation}.
 * <p>
 * Creates a stack as specified in the template. Once the call completes
 * successfully, the stack creation starts. You can check the status of
 * the stack via the DescribeStacks API.
 * </p>
 * <p>
 * <b>NOTE:</b> Currently, the limit for stacks is 20 stacks per account
 * per region.
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#createStack(CreateStackRequest)
 */
public class CreateStackRequest extends AmazonWebServiceRequest {

    /**
     * The name associated with the stack. The name must be unique within
     * your AWS account. <note> Must contain only alphanumeric characters
     * (case sensitive) and start with an alpha character. Maximum length of
     * the name is 255 characters. </note>
     */
    private String stackName;

    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * tp://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">AWS
     * CloudFormation User Guide</a>.) <p>Condition: You must pass
     * <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String templateBody;

    /**
     * Location of file containing the template body. The URL must point to a
     * template located in an S3 bucket in the same region as the stack. For
     * more information, go to the <a
     * tp://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">AWS
     * CloudFormation User Guide</a>. <p>Conditional: You must pass
     * <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String templateURL;

    /**
     * A list of <code>Parameter</code> structures.
     */
    private java.util.List<Parameter> parameters;

    /**
     * Boolean to enable or disable rollback on stack creation
     * failures.<br></br> Default: <code>false</code>
     */
    private Boolean disableRollback;

    /**
     * The amount of time that can pass before the stack status becomes
     * CREATE_FAILED; if <code>DisableRollback</code> is not set or is set to
     * <code>false</code>, the stack will be rolled back.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer timeoutInMinutes;

    /**
     * The Simple Notification Service (SNS) topic ARNs to publish stack
     * related events. You can find your SNS topic ARNs using the <a
     * href="http://console.aws.amazon.com/sns">SNS console</a> or your
     * Command Line Interface (CLI).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     */
    private java.util.List<String> notificationARNs;

    /**
     * The name associated with the stack. The name must be unique within
     * your AWS account. <note> Must contain only alphanumeric characters
     * (case sensitive) and start with an alpha character. Maximum length of
     * the name is 255 characters. </note>
     *
     * @return The name associated with the stack. The name must be unique within
     *         your AWS account. <note> Must contain only alphanumeric characters
     *         (case sensitive) and start with an alpha character. Maximum length of
     *         the name is 255 characters. </note>
     */
    public String getStackName() {
        return stackName;
    }
    
    /**
     * The name associated with the stack. The name must be unique within
     * your AWS account. <note> Must contain only alphanumeric characters
     * (case sensitive) and start with an alpha character. Maximum length of
     * the name is 255 characters. </note>
     *
     * @param stackName The name associated with the stack. The name must be unique within
     *         your AWS account. <note> Must contain only alphanumeric characters
     *         (case sensitive) and start with an alpha character. Maximum length of
     *         the name is 255 characters. </note>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }
    
    /**
     * The name associated with the stack. The name must be unique within
     * your AWS account. <note> Must contain only alphanumeric characters
     * (case sensitive) and start with an alpha character. Maximum length of
     * the name is 255 characters. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackName The name associated with the stack. The name must be unique within
     *         your AWS account. <note> Must contain only alphanumeric characters
     *         (case sensitive) and start with an alpha character. Maximum length of
     *         the name is 255 characters. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    
    
    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * tp://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">AWS
     * CloudFormation User Guide</a>.) <p>Condition: You must pass
     * <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Structure containing the template body. (For more information, go to
     *         the <a
     *         tp://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">AWS
     *         CloudFormation User Guide</a>.) <p>Condition: You must pass
     *         <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     */
    public String getTemplateBody() {
        return templateBody;
    }
    
    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * tp://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">AWS
     * CloudFormation User Guide</a>.) <p>Condition: You must pass
     * <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody Structure containing the template body. (For more information, go to
     *         the <a
     *         tp://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">AWS
     *         CloudFormation User Guide</a>.) <p>Condition: You must pass
     *         <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }
    
    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * tp://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">AWS
     * CloudFormation User Guide</a>.) <p>Condition: You must pass
     * <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody Structure containing the template body. (For more information, go to
     *         the <a
     *         tp://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">AWS
     *         CloudFormation User Guide</a>.) <p>Condition: You must pass
     *         <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    
    
    /**
     * Location of file containing the template body. The URL must point to a
     * template located in an S3 bucket in the same region as the stack. For
     * more information, go to the <a
     * tp://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">AWS
     * CloudFormation User Guide</a>. <p>Conditional: You must pass
     * <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return Location of file containing the template body. The URL must point to a
     *         template located in an S3 bucket in the same region as the stack. For
     *         more information, go to the <a
     *         tp://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">AWS
     *         CloudFormation User Guide</a>. <p>Conditional: You must pass
     *         <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     */
    public String getTemplateURL() {
        return templateURL;
    }
    
    /**
     * Location of file containing the template body. The URL must point to a
     * template located in an S3 bucket in the same region as the stack. For
     * more information, go to the <a
     * tp://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">AWS
     * CloudFormation User Guide</a>. <p>Conditional: You must pass
     * <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL Location of file containing the template body. The URL must point to a
     *         template located in an S3 bucket in the same region as the stack. For
     *         more information, go to the <a
     *         tp://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">AWS
     *         CloudFormation User Guide</a>. <p>Conditional: You must pass
     *         <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     */
    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }
    
    /**
     * Location of file containing the template body. The URL must point to a
     * template located in an S3 bucket in the same region as the stack. For
     * more information, go to the <a
     * tp://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">AWS
     * CloudFormation User Guide</a>. <p>Conditional: You must pass
     * <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL Location of file containing the template body. The URL must point to a
     *         template located in an S3 bucket in the same region as the stack. For
     *         more information, go to the <a
     *         tp://docs.amazonwebservices.com/AWSCloudFormation/latest/CFNGuide">AWS
     *         CloudFormation User Guide</a>. <p>Conditional: You must pass
     *         <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    
    
    /**
     * A list of <code>Parameter</code> structures.
     *
     * @return A list of <code>Parameter</code> structures.
     */
    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new java.util.ArrayList<Parameter>();
        }
        return parameters;
    }
    
    /**
     * A list of <code>Parameter</code> structures.
     *
     * @param parameters A list of <code>Parameter</code> structures.
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        java.util.List<Parameter> parametersCopy = new java.util.ArrayList<Parameter>();
        if (parameters != null) {
            parametersCopy.addAll(parameters);
        }
        this.parameters = parametersCopy;
    }
    
    /**
     * A list of <code>Parameter</code> structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <code>Parameter</code> structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withParameters(Parameter... parameters) {
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>Parameter</code> structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <code>Parameter</code> structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withParameters(java.util.Collection<Parameter> parameters) {
        java.util.List<Parameter> parametersCopy = new java.util.ArrayList<Parameter>();
        if (parameters != null) {
            parametersCopy.addAll(parameters);
        }
        this.parameters = parametersCopy;

        return this;
    }
    
    /**
     * Boolean to enable or disable rollback on stack creation
     * failures.<br></br> Default: <code>false</code>
     *
     * @return Boolean to enable or disable rollback on stack creation
     *         failures.<br></br> Default: <code>false</code>
     */
    public Boolean isDisableRollback() {
        return disableRollback;
    }
    
    /**
     * Boolean to enable or disable rollback on stack creation
     * failures.<br></br> Default: <code>false</code>
     *
     * @param disableRollback Boolean to enable or disable rollback on stack creation
     *         failures.<br></br> Default: <code>false</code>
     */
    public void setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
    }
    
    /**
     * Boolean to enable or disable rollback on stack creation
     * failures.<br></br> Default: <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param disableRollback Boolean to enable or disable rollback on stack creation
     *         failures.<br></br> Default: <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    
    
    /**
     * Boolean to enable or disable rollback on stack creation
     * failures.<br></br> Default: <code>false</code>
     *
     * @return Boolean to enable or disable rollback on stack creation
     *         failures.<br></br> Default: <code>false</code>
     */
    public Boolean getDisableRollback() {
        return disableRollback;
    }
    
    /**
     * The amount of time that can pass before the stack status becomes
     * CREATE_FAILED; if <code>DisableRollback</code> is not set or is set to
     * <code>false</code>, the stack will be rolled back.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The amount of time that can pass before the stack status becomes
     *         CREATE_FAILED; if <code>DisableRollback</code> is not set or is set to
     *         <code>false</code>, the stack will be rolled back.
     */
    public Integer getTimeoutInMinutes() {
        return timeoutInMinutes;
    }
    
    /**
     * The amount of time that can pass before the stack status becomes
     * CREATE_FAILED; if <code>DisableRollback</code> is not set or is set to
     * <code>false</code>, the stack will be rolled back.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeoutInMinutes The amount of time that can pass before the stack status becomes
     *         CREATE_FAILED; if <code>DisableRollback</code> is not set or is set to
     *         <code>false</code>, the stack will be rolled back.
     */
    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }
    
    /**
     * The amount of time that can pass before the stack status becomes
     * CREATE_FAILED; if <code>DisableRollback</code> is not set or is set to
     * <code>false</code>, the stack will be rolled back.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeoutInMinutes The amount of time that can pass before the stack status becomes
     *         CREATE_FAILED; if <code>DisableRollback</code> is not set or is set to
     *         <code>false</code>, the stack will be rolled back.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    
    
    /**
     * The Simple Notification Service (SNS) topic ARNs to publish stack
     * related events. You can find your SNS topic ARNs using the <a
     * href="http://console.aws.amazon.com/sns">SNS console</a> or your
     * Command Line Interface (CLI).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return The Simple Notification Service (SNS) topic ARNs to publish stack
     *         related events. You can find your SNS topic ARNs using the <a
     *         href="http://console.aws.amazon.com/sns">SNS console</a> or your
     *         Command Line Interface (CLI).
     */
    public java.util.List<String> getNotificationARNs() {
        if (notificationARNs == null) {
            notificationARNs = new java.util.ArrayList<String>();
        }
        return notificationARNs;
    }
    
    /**
     * The Simple Notification Service (SNS) topic ARNs to publish stack
     * related events. You can find your SNS topic ARNs using the <a
     * href="http://console.aws.amazon.com/sns">SNS console</a> or your
     * Command Line Interface (CLI).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param notificationARNs The Simple Notification Service (SNS) topic ARNs to publish stack
     *         related events. You can find your SNS topic ARNs using the <a
     *         href="http://console.aws.amazon.com/sns">SNS console</a> or your
     *         Command Line Interface (CLI).
     */
    public void setNotificationARNs(java.util.Collection<String> notificationARNs) {
        java.util.List<String> notificationARNsCopy = new java.util.ArrayList<String>();
        if (notificationARNs != null) {
            notificationARNsCopy.addAll(notificationARNs);
        }
        this.notificationARNs = notificationARNsCopy;
    }
    
    /**
     * The Simple Notification Service (SNS) topic ARNs to publish stack
     * related events. You can find your SNS topic ARNs using the <a
     * href="http://console.aws.amazon.com/sns">SNS console</a> or your
     * Command Line Interface (CLI).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param notificationARNs The Simple Notification Service (SNS) topic ARNs to publish stack
     *         related events. You can find your SNS topic ARNs using the <a
     *         href="http://console.aws.amazon.com/sns">SNS console</a> or your
     *         Command Line Interface (CLI).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withNotificationARNs(String... notificationARNs) {
        for (String value : notificationARNs) {
            getNotificationARNs().add(value);
        }
        return this;
    }
    
    /**
     * The Simple Notification Service (SNS) topic ARNs to publish stack
     * related events. You can find your SNS topic ARNs using the <a
     * href="http://console.aws.amazon.com/sns">SNS console</a> or your
     * Command Line Interface (CLI).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param notificationARNs The Simple Notification Service (SNS) topic ARNs to publish stack
     *         related events. You can find your SNS topic ARNs using the <a
     *         href="http://console.aws.amazon.com/sns">SNS console</a> or your
     *         Command Line Interface (CLI).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withNotificationARNs(java.util.Collection<String> notificationARNs) {
        java.util.List<String> notificationARNsCopy = new java.util.ArrayList<String>();
        if (notificationARNs != null) {
            notificationARNsCopy.addAll(notificationARNs);
        }
        this.notificationARNs = notificationARNsCopy;

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
        sb.append("StackName: " + stackName + ", ");
        sb.append("TemplateBody: " + templateBody + ", ");
        sb.append("TemplateURL: " + templateURL + ", ");
        sb.append("Parameters: " + parameters + ", ");
        sb.append("DisableRollback: " + disableRollback + ", ");
        sb.append("TimeoutInMinutes: " + timeoutInMinutes + ", ");
        sb.append("NotificationARNs: " + notificationARNs + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    