/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#createStack(CreateStackRequest) CreateStack operation}.
 * <p>
 * Creates a stack as specified in the template. After the call completes successfully, the stack creation starts. You can check the status of the stack
 * via the DescribeStacks API.
 * </p>
 * <p>
 * <b>NOTE:</b> Currently, the limit for stacks is 20 stacks per account per region.
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#createStack(CreateStackRequest)
 */
public class CreateStackRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name associated with the stack. The name must be unique within
     * your AWS account. <note>Must contain only alphanumeric characters
     * (case sensitive) and start with an alpha character. Maximum length of
     * the name is 255 characters.</note>
     */
    private String stackName;

    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.) <p>Conditional: You must pass
     * <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String templateBody;

    /**
     * Location of file containing the template body. The URL must point to a
     * template (max size: 307,200 bytes) located in an S3 bucket in the same
     * region as the stack. For more information, go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>. <p>Conditional: You must pass
     * <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String templateURL;

    /**
     * A list of <code>Parameter</code> structures that specify input
     * parameters for the stack.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parameters;

    /**
     * Set to <code>true</code> to disable rollback of the stack if stack
     * creation failed. You can specify either <code>DisableRollback</code>
     * or <code>OnFailure</code>, but not both. <p>Default:
     * <code>false</code>
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
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> notificationARNs;

    /**
     * The list of capabilities that you want to allow in the stack. If your
     * template contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter; otherwise, this action returns an
     * InsufficientCapabilities error. IAM resources are the following: <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     * and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> capabilities;

    /**
     * Determines what action will be taken if stack creation fails. This
     * must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify
     * either <code>OnFailure</code> or <code>DisableRollback</code>, but not
     * both. <p>Default: <code>ROLLBACK</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOTHING, ROLLBACK, DELETE
     */
    private String onFailure;

    /**
     * Structure containing the stack policy body. (For more information, go
     * to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     * AWS CloudFormation User Guide</a>.) <p>If you pass
     * <code>StackPolicyBody</code> and <code>StackPolicyURL</code>, only
     * <code>StackPolicyBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     */
    private String stackPolicyBody;

    /**
     * Location of a file containing the stack policy. The URL must point to
     * a policy (max size: 16KB) located in an S3 bucket in the same region
     * as the stack. If you pass <code>StackPolicyBody</code> and
     * <code>StackPolicyURL</code>, only <code>StackPolicyBody</code> is
     * used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     */
    private String stackPolicyURL;

    /**
     * A set of user-defined <code>Tags</code> to associate with this stack,
     * represented by key/value pairs. Tags defined for the stack are
     * propagated to EC2 resources that are created as part of the stack. A
     * maximum number of 10 tags can be specified.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The name associated with the stack. The name must be unique within
     * your AWS account. <note>Must contain only alphanumeric characters
     * (case sensitive) and start with an alpha character. Maximum length of
     * the name is 255 characters.</note>
     *
     * @return The name associated with the stack. The name must be unique within
     *         your AWS account. <note>Must contain only alphanumeric characters
     *         (case sensitive) and start with an alpha character. Maximum length of
     *         the name is 255 characters.</note>
     */
    public String getStackName() {
        return stackName;
    }
    
    /**
     * The name associated with the stack. The name must be unique within
     * your AWS account. <note>Must contain only alphanumeric characters
     * (case sensitive) and start with an alpha character. Maximum length of
     * the name is 255 characters.</note>
     *
     * @param stackName The name associated with the stack. The name must be unique within
     *         your AWS account. <note>Must contain only alphanumeric characters
     *         (case sensitive) and start with an alpha character. Maximum length of
     *         the name is 255 characters.</note>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }
    
    /**
     * The name associated with the stack. The name must be unique within
     * your AWS account. <note>Must contain only alphanumeric characters
     * (case sensitive) and start with an alpha character. Maximum length of
     * the name is 255 characters.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackName The name associated with the stack. The name must be unique within
     *         your AWS account. <note>Must contain only alphanumeric characters
     *         (case sensitive) and start with an alpha character. Maximum length of
     *         the name is 255 characters.</note>
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
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.) <p>Conditional: You must pass
     * <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Structure containing the template body. (For more information, go to
     *         the <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>.) <p>Conditional: You must pass
     *         <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     */
    public String getTemplateBody() {
        return templateBody;
    }
    
    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.) <p>Conditional: You must pass
     * <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param templateBody Structure containing the template body. (For more information, go to
     *         the <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>.) <p>Conditional: You must pass
     *         <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }
    
    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.) <p>Conditional: You must pass
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
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>.) <p>Conditional: You must pass
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
     * template (max size: 307,200 bytes) located in an S3 bucket in the same
     * region as the stack. For more information, go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>. <p>Conditional: You must pass
     * <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return Location of file containing the template body. The URL must point to a
     *         template (max size: 307,200 bytes) located in an S3 bucket in the same
     *         region as the stack. For more information, go to the <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>. <p>Conditional: You must pass
     *         <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     */
    public String getTemplateURL() {
        return templateURL;
    }
    
    /**
     * Location of file containing the template body. The URL must point to a
     * template (max size: 307,200 bytes) located in an S3 bucket in the same
     * region as the stack. For more information, go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>. <p>Conditional: You must pass
     * <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param templateURL Location of file containing the template body. The URL must point to a
     *         template (max size: 307,200 bytes) located in an S3 bucket in the same
     *         region as the stack. For more information, go to the <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>. <p>Conditional: You must pass
     *         <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     */
    public void setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
    }
    
    /**
     * Location of file containing the template body. The URL must point to a
     * template (max size: 307,200 bytes) located in an S3 bucket in the same
     * region as the stack. For more information, go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
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
     *         template (max size: 307,200 bytes) located in an S3 bucket in the same
     *         region as the stack. For more information, go to the <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide">AWS
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
     * A list of <code>Parameter</code> structures that specify input
     * parameters for the stack.
     *
     * @return A list of <code>Parameter</code> structures that specify input
     *         parameters for the stack.
     */
    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
              parameters = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>();
              parameters.setAutoConstruct(true);
        }
        return parameters;
    }
    
    /**
     * A list of <code>Parameter</code> structures that specify input
     * parameters for the stack.
     *
     * @param parameters A list of <code>Parameter</code> structures that specify input
     *         parameters for the stack.
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parametersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>(parameters.size());
        parametersCopy.addAll(parameters);
        this.parameters = parametersCopy;
    }
    
    /**
     * A list of <code>Parameter</code> structures that specify input
     * parameters for the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <code>Parameter</code> structures that specify input
     *         parameters for the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateStackRequest withParameters(Parameter... parameters) {
        if (getParameters() == null) setParameters(new java.util.ArrayList<Parameter>(parameters.length));
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>Parameter</code> structures that specify input
     * parameters for the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <code>Parameter</code> structures that specify input
     *         parameters for the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateStackRequest withParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parametersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>(parameters.size());
            parametersCopy.addAll(parameters);
            this.parameters = parametersCopy;
        }

        return this;
    }

    /**
     * Set to <code>true</code> to disable rollback of the stack if stack
     * creation failed. You can specify either <code>DisableRollback</code>
     * or <code>OnFailure</code>, but not both. <p>Default:
     * <code>false</code>
     *
     * @return Set to <code>true</code> to disable rollback of the stack if stack
     *         creation failed. You can specify either <code>DisableRollback</code>
     *         or <code>OnFailure</code>, but not both. <p>Default:
     *         <code>false</code>
     */
    public Boolean isDisableRollback() {
        return disableRollback;
    }
    
    /**
     * Set to <code>true</code> to disable rollback of the stack if stack
     * creation failed. You can specify either <code>DisableRollback</code>
     * or <code>OnFailure</code>, but not both. <p>Default:
     * <code>false</code>
     *
     * @param disableRollback Set to <code>true</code> to disable rollback of the stack if stack
     *         creation failed. You can specify either <code>DisableRollback</code>
     *         or <code>OnFailure</code>, but not both. <p>Default:
     *         <code>false</code>
     */
    public void setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
    }
    
    /**
     * Set to <code>true</code> to disable rollback of the stack if stack
     * creation failed. You can specify either <code>DisableRollback</code>
     * or <code>OnFailure</code>, but not both. <p>Default:
     * <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param disableRollback Set to <code>true</code> to disable rollback of the stack if stack
     *         creation failed. You can specify either <code>DisableRollback</code>
     *         or <code>OnFailure</code>, but not both. <p>Default:
     *         <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateStackRequest withDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }

    /**
     * Set to <code>true</code> to disable rollback of the stack if stack
     * creation failed. You can specify either <code>DisableRollback</code>
     * or <code>OnFailure</code>, but not both. <p>Default:
     * <code>false</code>
     *
     * @return Set to <code>true</code> to disable rollback of the stack if stack
     *         creation failed. You can specify either <code>DisableRollback</code>
     *         or <code>OnFailure</code>, but not both. <p>Default:
     *         <code>false</code>
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
              notificationARNs = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              notificationARNs.setAutoConstruct(true);
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
        if (notificationARNs == null) {
            this.notificationARNs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> notificationARNsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(notificationARNs.size());
        notificationARNsCopy.addAll(notificationARNs);
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
        if (getNotificationARNs() == null) setNotificationARNs(new java.util.ArrayList<String>(notificationARNs.length));
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
        if (notificationARNs == null) {
            this.notificationARNs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> notificationARNsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(notificationARNs.size());
            notificationARNsCopy.addAll(notificationARNs);
            this.notificationARNs = notificationARNsCopy;
        }

        return this;
    }

    /**
     * The list of capabilities that you want to allow in the stack. If your
     * template contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter; otherwise, this action returns an
     * InsufficientCapabilities error. IAM resources are the following: <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     * and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     *
     * @return The list of capabilities that you want to allow in the stack. If your
     *         template contains IAM resources, you must specify the CAPABILITY_IAM
     *         value for this parameter; otherwise, this action returns an
     *         InsufficientCapabilities error. IAM resources are the following: <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     *         <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     *         <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     *         <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     *         and <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     */
    public java.util.List<String> getCapabilities() {
        if (capabilities == null) {
              capabilities = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              capabilities.setAutoConstruct(true);
        }
        return capabilities;
    }
    
    /**
     * The list of capabilities that you want to allow in the stack. If your
     * template contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter; otherwise, this action returns an
     * InsufficientCapabilities error. IAM resources are the following: <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     * and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     *
     * @param capabilities The list of capabilities that you want to allow in the stack. If your
     *         template contains IAM resources, you must specify the CAPABILITY_IAM
     *         value for this parameter; otherwise, this action returns an
     *         InsufficientCapabilities error. IAM resources are the following: <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     *         <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     *         <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     *         <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     *         and <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     */
    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> capabilitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(capabilities.size());
        capabilitiesCopy.addAll(capabilities);
        this.capabilities = capabilitiesCopy;
    }
    
    /**
     * The list of capabilities that you want to allow in the stack. If your
     * template contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter; otherwise, this action returns an
     * InsufficientCapabilities error. IAM resources are the following: <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     * and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capabilities The list of capabilities that you want to allow in the stack. If your
     *         template contains IAM resources, you must specify the CAPABILITY_IAM
     *         value for this parameter; otherwise, this action returns an
     *         InsufficientCapabilities error. IAM resources are the following: <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     *         <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     *         <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     *         <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     *         and <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateStackRequest withCapabilities(String... capabilities) {
        if (getCapabilities() == null) setCapabilities(new java.util.ArrayList<String>(capabilities.length));
        for (String value : capabilities) {
            getCapabilities().add(value);
        }
        return this;
    }
    
    /**
     * The list of capabilities that you want to allow in the stack. If your
     * template contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter; otherwise, this action returns an
     * InsufficientCapabilities error. IAM resources are the following: <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     * and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capabilities The list of capabilities that you want to allow in the stack. If your
     *         template contains IAM resources, you must specify the CAPABILITY_IAM
     *         value for this parameter; otherwise, this action returns an
     *         InsufficientCapabilities error. IAM resources are the following: <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     *         <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     *         <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     *         <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     *         and <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateStackRequest withCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> capabilitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(capabilities.size());
            capabilitiesCopy.addAll(capabilities);
            this.capabilities = capabilitiesCopy;
        }

        return this;
    }

    /**
     * The list of capabilities that you want to allow in the stack. If your
     * template contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter; otherwise, this action returns an
     * InsufficientCapabilities error. IAM resources are the following: <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     * <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     * and <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capabilities The list of capabilities that you want to allow in the stack. If your
     *         template contains IAM resources, you must specify the CAPABILITY_IAM
     *         value for this parameter; otherwise, this action returns an
     *         InsufficientCapabilities error. IAM resources are the following: <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     *         <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     *         <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     *         <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     *         and <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateStackRequest withCapabilities(Capability... capabilities) {
        java.util.ArrayList<String> capabilitiesCopy = new java.util.ArrayList<String>(capabilities.length);
        for (Capability member : capabilities) {
            capabilitiesCopy.add(member.toString());
        }
        if (getCapabilities() == null) {
            setCapabilities(capabilitiesCopy);
        } else {
            getCapabilities().addAll(capabilitiesCopy);
        }
        return this;
    }

    /**
     * Determines what action will be taken if stack creation fails. This
     * must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify
     * either <code>OnFailure</code> or <code>DisableRollback</code>, but not
     * both. <p>Default: <code>ROLLBACK</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOTHING, ROLLBACK, DELETE
     *
     * @return Determines what action will be taken if stack creation fails. This
     *         must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify
     *         either <code>OnFailure</code> or <code>DisableRollback</code>, but not
     *         both. <p>Default: <code>ROLLBACK</code>
     *
     * @see OnFailure
     */
    public String getOnFailure() {
        return onFailure;
    }
    
    /**
     * Determines what action will be taken if stack creation fails. This
     * must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify
     * either <code>OnFailure</code> or <code>DisableRollback</code>, but not
     * both. <p>Default: <code>ROLLBACK</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOTHING, ROLLBACK, DELETE
     *
     * @param onFailure Determines what action will be taken if stack creation fails. This
     *         must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify
     *         either <code>OnFailure</code> or <code>DisableRollback</code>, but not
     *         both. <p>Default: <code>ROLLBACK</code>
     *
     * @see OnFailure
     */
    public void setOnFailure(String onFailure) {
        this.onFailure = onFailure;
    }
    
    /**
     * Determines what action will be taken if stack creation fails. This
     * must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify
     * either <code>OnFailure</code> or <code>DisableRollback</code>, but not
     * both. <p>Default: <code>ROLLBACK</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOTHING, ROLLBACK, DELETE
     *
     * @param onFailure Determines what action will be taken if stack creation fails. This
     *         must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify
     *         either <code>OnFailure</code> or <code>DisableRollback</code>, but not
     *         both. <p>Default: <code>ROLLBACK</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see OnFailure
     */
    public CreateStackRequest withOnFailure(String onFailure) {
        this.onFailure = onFailure;
        return this;
    }

    /**
     * Determines what action will be taken if stack creation fails. This
     * must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify
     * either <code>OnFailure</code> or <code>DisableRollback</code>, but not
     * both. <p>Default: <code>ROLLBACK</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOTHING, ROLLBACK, DELETE
     *
     * @param onFailure Determines what action will be taken if stack creation fails. This
     *         must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify
     *         either <code>OnFailure</code> or <code>DisableRollback</code>, but not
     *         both. <p>Default: <code>ROLLBACK</code>
     *
     * @see OnFailure
     */
    public void setOnFailure(OnFailure onFailure) {
        this.onFailure = onFailure.toString();
    }
    
    /**
     * Determines what action will be taken if stack creation fails. This
     * must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify
     * either <code>OnFailure</code> or <code>DisableRollback</code>, but not
     * both. <p>Default: <code>ROLLBACK</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DO_NOTHING, ROLLBACK, DELETE
     *
     * @param onFailure Determines what action will be taken if stack creation fails. This
     *         must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify
     *         either <code>OnFailure</code> or <code>DisableRollback</code>, but not
     *         both. <p>Default: <code>ROLLBACK</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see OnFailure
     */
    public CreateStackRequest withOnFailure(OnFailure onFailure) {
        this.onFailure = onFailure.toString();
        return this;
    }

    /**
     * Structure containing the stack policy body. (For more information, go
     * to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     * AWS CloudFormation User Guide</a>.) <p>If you pass
     * <code>StackPolicyBody</code> and <code>StackPolicyURL</code>, only
     * <code>StackPolicyBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @return Structure containing the stack policy body. (For more information, go
     *         to the <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     *         AWS CloudFormation User Guide</a>.) <p>If you pass
     *         <code>StackPolicyBody</code> and <code>StackPolicyURL</code>, only
     *         <code>StackPolicyBody</code> is used.
     */
    public String getStackPolicyBody() {
        return stackPolicyBody;
    }
    
    /**
     * Structure containing the stack policy body. (For more information, go
     * to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     * AWS CloudFormation User Guide</a>.) <p>If you pass
     * <code>StackPolicyBody</code> and <code>StackPolicyURL</code>, only
     * <code>StackPolicyBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param stackPolicyBody Structure containing the stack policy body. (For more information, go
     *         to the <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     *         AWS CloudFormation User Guide</a>.) <p>If you pass
     *         <code>StackPolicyBody</code> and <code>StackPolicyURL</code>, only
     *         <code>StackPolicyBody</code> is used.
     */
    public void setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
    }
    
    /**
     * Structure containing the stack policy body. (For more information, go
     * to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     * AWS CloudFormation User Guide</a>.) <p>If you pass
     * <code>StackPolicyBody</code> and <code>StackPolicyURL</code>, only
     * <code>StackPolicyBody</code> is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param stackPolicyBody Structure containing the stack policy body. (For more information, go
     *         to the <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     *         AWS CloudFormation User Guide</a>.) <p>If you pass
     *         <code>StackPolicyBody</code> and <code>StackPolicyURL</code>, only
     *         <code>StackPolicyBody</code> is used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateStackRequest withStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }

    /**
     * Location of a file containing the stack policy. The URL must point to
     * a policy (max size: 16KB) located in an S3 bucket in the same region
     * as the stack. If you pass <code>StackPolicyBody</code> and
     * <code>StackPolicyURL</code>, only <code>StackPolicyBody</code> is
     * used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @return Location of a file containing the stack policy. The URL must point to
     *         a policy (max size: 16KB) located in an S3 bucket in the same region
     *         as the stack. If you pass <code>StackPolicyBody</code> and
     *         <code>StackPolicyURL</code>, only <code>StackPolicyBody</code> is
     *         used.
     */
    public String getStackPolicyURL() {
        return stackPolicyURL;
    }
    
    /**
     * Location of a file containing the stack policy. The URL must point to
     * a policy (max size: 16KB) located in an S3 bucket in the same region
     * as the stack. If you pass <code>StackPolicyBody</code> and
     * <code>StackPolicyURL</code>, only <code>StackPolicyBody</code> is
     * used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param stackPolicyURL Location of a file containing the stack policy. The URL must point to
     *         a policy (max size: 16KB) located in an S3 bucket in the same region
     *         as the stack. If you pass <code>StackPolicyBody</code> and
     *         <code>StackPolicyURL</code>, only <code>StackPolicyBody</code> is
     *         used.
     */
    public void setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
    }
    
    /**
     * Location of a file containing the stack policy. The URL must point to
     * a policy (max size: 16KB) located in an S3 bucket in the same region
     * as the stack. If you pass <code>StackPolicyBody</code> and
     * <code>StackPolicyURL</code>, only <code>StackPolicyBody</code> is
     * used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param stackPolicyURL Location of a file containing the stack policy. The URL must point to
     *         a policy (max size: 16KB) located in an S3 bucket in the same region
     *         as the stack. If you pass <code>StackPolicyBody</code> and
     *         <code>StackPolicyURL</code>, only <code>StackPolicyBody</code> is
     *         used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateStackRequest withStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }

    /**
     * A set of user-defined <code>Tags</code> to associate with this stack,
     * represented by key/value pairs. Tags defined for the stack are
     * propagated to EC2 resources that are created as part of the stack. A
     * maximum number of 10 tags can be specified.
     *
     * @return A set of user-defined <code>Tags</code> to associate with this stack,
     *         represented by key/value pairs. Tags defined for the stack are
     *         propagated to EC2 resources that are created as part of the stack. A
     *         maximum number of 10 tags can be specified.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A set of user-defined <code>Tags</code> to associate with this stack,
     * represented by key/value pairs. Tags defined for the stack are
     * propagated to EC2 resources that are created as part of the stack. A
     * maximum number of 10 tags can be specified.
     *
     * @param tags A set of user-defined <code>Tags</code> to associate with this stack,
     *         represented by key/value pairs. Tags defined for the stack are
     *         propagated to EC2 resources that are created as part of the stack. A
     *         maximum number of 10 tags can be specified.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A set of user-defined <code>Tags</code> to associate with this stack,
     * represented by key/value pairs. Tags defined for the stack are
     * propagated to EC2 resources that are created as part of the stack. A
     * maximum number of 10 tags can be specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A set of user-defined <code>Tags</code> to associate with this stack,
     *         represented by key/value pairs. Tags defined for the stack are
     *         propagated to EC2 resources that are created as part of the stack. A
     *         maximum number of 10 tags can be specified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateStackRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A set of user-defined <code>Tags</code> to associate with this stack,
     * represented by key/value pairs. Tags defined for the stack are
     * propagated to EC2 resources that are created as part of the stack. A
     * maximum number of 10 tags can be specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A set of user-defined <code>Tags</code> to associate with this stack,
     *         represented by key/value pairs. Tags defined for the stack are
     *         propagated to EC2 resources that are created as part of the stack. A
     *         maximum number of 10 tags can be specified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateStackRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

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
        if (getStackName() != null) sb.append("StackName: " + getStackName() + ",");
        if (getTemplateBody() != null) sb.append("TemplateBody: " + getTemplateBody() + ",");
        if (getTemplateURL() != null) sb.append("TemplateURL: " + getTemplateURL() + ",");
        if (getParameters() != null) sb.append("Parameters: " + getParameters() + ",");
        if (isDisableRollback() != null) sb.append("DisableRollback: " + isDisableRollback() + ",");
        if (getTimeoutInMinutes() != null) sb.append("TimeoutInMinutes: " + getTimeoutInMinutes() + ",");
        if (getNotificationARNs() != null) sb.append("NotificationARNs: " + getNotificationARNs() + ",");
        if (getCapabilities() != null) sb.append("Capabilities: " + getCapabilities() + ",");
        if (getOnFailure() != null) sb.append("OnFailure: " + getOnFailure() + ",");
        if (getStackPolicyBody() != null) sb.append("StackPolicyBody: " + getStackPolicyBody() + ",");
        if (getStackPolicyURL() != null) sb.append("StackPolicyURL: " + getStackPolicyURL() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode()); 
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode()); 
        hashCode = prime * hashCode + ((getTemplateURL() == null) ? 0 : getTemplateURL().hashCode()); 
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode()); 
        hashCode = prime * hashCode + ((isDisableRollback() == null) ? 0 : isDisableRollback().hashCode()); 
        hashCode = prime * hashCode + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode()); 
        hashCode = prime * hashCode + ((getNotificationARNs() == null) ? 0 : getNotificationARNs().hashCode()); 
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode()); 
        hashCode = prime * hashCode + ((getOnFailure() == null) ? 0 : getOnFailure().hashCode()); 
        hashCode = prime * hashCode + ((getStackPolicyBody() == null) ? 0 : getStackPolicyBody().hashCode()); 
        hashCode = prime * hashCode + ((getStackPolicyURL() == null) ? 0 : getStackPolicyURL().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateStackRequest == false) return false;
        CreateStackRequest other = (CreateStackRequest)obj;
        
        if (other.getStackName() == null ^ this.getStackName() == null) return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false) return false; 
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null) return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false) return false; 
        if (other.getTemplateURL() == null ^ this.getTemplateURL() == null) return false;
        if (other.getTemplateURL() != null && other.getTemplateURL().equals(this.getTemplateURL()) == false) return false; 
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        if (other.isDisableRollback() == null ^ this.isDisableRollback() == null) return false;
        if (other.isDisableRollback() != null && other.isDisableRollback().equals(this.isDisableRollback()) == false) return false; 
        if (other.getTimeoutInMinutes() == null ^ this.getTimeoutInMinutes() == null) return false;
        if (other.getTimeoutInMinutes() != null && other.getTimeoutInMinutes().equals(this.getTimeoutInMinutes()) == false) return false; 
        if (other.getNotificationARNs() == null ^ this.getNotificationARNs() == null) return false;
        if (other.getNotificationARNs() != null && other.getNotificationARNs().equals(this.getNotificationARNs()) == false) return false; 
        if (other.getCapabilities() == null ^ this.getCapabilities() == null) return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false) return false; 
        if (other.getOnFailure() == null ^ this.getOnFailure() == null) return false;
        if (other.getOnFailure() != null && other.getOnFailure().equals(this.getOnFailure()) == false) return false; 
        if (other.getStackPolicyBody() == null ^ this.getStackPolicyBody() == null) return false;
        if (other.getStackPolicyBody() != null && other.getStackPolicyBody().equals(this.getStackPolicyBody()) == false) return false; 
        if (other.getStackPolicyURL() == null ^ this.getStackPolicyURL() == null) return false;
        if (other.getStackPolicyURL() != null && other.getStackPolicyURL().equals(this.getStackPolicyURL()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    