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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#updateStack(UpdateStackRequest) UpdateStack operation}.
 * <p>
 * Updates a stack as specified in the template. After the call completes successfully, the stack update starts. You can check the status of the stack
 * via the DescribeStacks action.
 * </p>
 * <p>
 * To get a copy of the template for an existing stack, you can use the GetTemplate action.
 * </p>
 * <p>
 * Tags that were associated with this stack during creation time will still be associated with the stack after an <code>UpdateStack</code> operation.
 * </p>
 * <p>
 * For more information about creating an update template, updating a stack, and monitoring the progress of the update, see <a
 * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html"> Updating a Stack </a> .
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#updateStack(UpdateStackRequest)
 */
public class UpdateStackRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * The name or stack ID of the stack to update. <note> Must contain only
     * alphanumeric characters (case sensitive) and start with an alpha
     * character. Maximum length of the name is 255 characters. </note>
     */
    private String stackName;

    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.) <p>Conditional: You must pass
     * <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 51200<br/>
     */
    private String templateBody;

    /**
     * Location of file containing the template body. The URL must point to a
     * template located in an S3 bucket in the same region as the stack. For
     * more information, go to the <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
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
     * The list of capabilities that you want to allow in the stack. If your
     * stack contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter; otherwise, this action returns an
     * InsufficientCapabilities error. IAM resources are the following: <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     * <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     * <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     * <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     * and <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> capabilities;

    /**
     * The name or stack ID of the stack to update. <note> Must contain only
     * alphanumeric characters (case sensitive) and start with an alpha
     * character. Maximum length of the name is 255 characters. </note>
     *
     * @return The name or stack ID of the stack to update. <note> Must contain only
     *         alphanumeric characters (case sensitive) and start with an alpha
     *         character. Maximum length of the name is 255 characters. </note>
     */
    public String getStackName() {
        return stackName;
    }
    
    /**
     * The name or stack ID of the stack to update. <note> Must contain only
     * alphanumeric characters (case sensitive) and start with an alpha
     * character. Maximum length of the name is 255 characters. </note>
     *
     * @param stackName The name or stack ID of the stack to update. <note> Must contain only
     *         alphanumeric characters (case sensitive) and start with an alpha
     *         character. Maximum length of the name is 255 characters. </note>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }
    
    /**
     * The name or stack ID of the stack to update. <note> Must contain only
     * alphanumeric characters (case sensitive) and start with an alpha
     * character. Maximum length of the name is 255 characters. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackName The name or stack ID of the stack to update. <note> Must contain only
     *         alphanumeric characters (case sensitive) and start with an alpha
     *         character. Maximum length of the name is 255 characters. </note>
     */
    public UpdateStackRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    
    
    /**
     * Structure containing the template body. (For more information, go to
     * the <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.) <p>Conditional: You must pass
     * <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 51200<br/>
     *
     * @return Structure containing the template body. (For more information, go to
     *         the <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
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
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.) <p>Conditional: You must pass
     * <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 51200<br/>
     *
     * @param templateBody Structure containing the template body. (For more information, go to
     *         the <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
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
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     * CloudFormation User Guide</a>.) <p>Conditional: You must pass
     * <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     * passed, only <code>TemplateBody</code> is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 51200<br/>
     *
     * @param templateBody Structure containing the template body. (For more information, go to
     *         the <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>.) <p>Conditional: You must pass
     *         <code>TemplateBody</code> or <code>TemplateURL</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     */
    public UpdateStackRequest withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    
    
    /**
     * Location of file containing the template body. The URL must point to a
     * template located in an S3 bucket in the same region as the stack. For
     * more information, go to the <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
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
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
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
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
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
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
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
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
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
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide">AWS
     *         CloudFormation User Guide</a>. <p>Conditional: You must pass
     *         <code>TemplateURL</code> or <code>TemplateBody</code>. If both are
     *         passed, only <code>TemplateBody</code> is used.
     */
    public UpdateStackRequest withTemplateURL(String templateURL) {
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
     */
    public UpdateStackRequest withParameters(Parameter... parameters) {
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
     */
    public UpdateStackRequest withParameters(java.util.Collection<Parameter> parameters) {
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
     * The list of capabilities that you want to allow in the stack. If your
     * stack contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter; otherwise, this action returns an
     * InsufficientCapabilities error. IAM resources are the following: <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     * <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     * <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     * <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     * and <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     *
     * @return The list of capabilities that you want to allow in the stack. If your
     *         stack contains IAM resources, you must specify the CAPABILITY_IAM
     *         value for this parameter; otherwise, this action returns an
     *         InsufficientCapabilities error. IAM resources are the following: <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     *         <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     *         <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     *         <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     *         and <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
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
     * stack contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter; otherwise, this action returns an
     * InsufficientCapabilities error. IAM resources are the following: <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     * <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     * <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     * <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     * and <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     *
     * @param capabilities The list of capabilities that you want to allow in the stack. If your
     *         stack contains IAM resources, you must specify the CAPABILITY_IAM
     *         value for this parameter; otherwise, this action returns an
     *         InsufficientCapabilities error. IAM resources are the following: <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     *         <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     *         <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     *         <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     *         and <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
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
     * stack contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter; otherwise, this action returns an
     * InsufficientCapabilities error. IAM resources are the following: <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     * <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     * <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     * <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     * and <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capabilities The list of capabilities that you want to allow in the stack. If your
     *         stack contains IAM resources, you must specify the CAPABILITY_IAM
     *         value for this parameter; otherwise, this action returns an
     *         InsufficientCapabilities error. IAM resources are the following: <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     *         <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     *         <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     *         <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     *         and <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     */
    public UpdateStackRequest withCapabilities(String... capabilities) {
        if (getCapabilities() == null) setCapabilities(new java.util.ArrayList<String>(capabilities.length));
        for (String value : capabilities) {
            getCapabilities().add(value);
        }
        return this;
    }
    
    /**
     * The list of capabilities that you want to allow in the stack. If your
     * stack contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter; otherwise, this action returns an
     * InsufficientCapabilities error. IAM resources are the following: <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     * <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     * <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     * <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     * and <a
     * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capabilities The list of capabilities that you want to allow in the stack. If your
     *         stack contains IAM resources, you must specify the CAPABILITY_IAM
     *         value for this parameter; otherwise, this action returns an
     *         InsufficientCapabilities error. IAM resources are the following: <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-accesskey.html">AWS::IAM::AccessKey</a>,
     *         <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group.html">AWS::IAM::Group</a>,
     *         <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html">AWS::IAM::Policy</a>,
     *         <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user.html">AWS::IAM::User</a>,
     *         and <a
     *         href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-addusertogroup.html">AWS::IAM::UserToGroupAddition</a>.
     */
    public UpdateStackRequest withCapabilities(java.util.Collection<String> capabilities) {
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
        if (getCapabilities() != null) sb.append("Capabilities: " + getCapabilities() );
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
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateStackRequest == false) return false;
        UpdateStackRequest other = (UpdateStackRequest)obj;
        
        if (other.getStackName() == null ^ this.getStackName() == null) return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false) return false; 
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null) return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false) return false; 
        if (other.getTemplateURL() == null ^ this.getTemplateURL() == null) return false;
        if (other.getTemplateURL() != null && other.getTemplateURL().equals(this.getTemplateURL()) == false) return false; 
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        if (other.getCapabilities() == null ^ this.getCapabilities() == null) return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false) return false; 
        return true;
    }
    
}
    