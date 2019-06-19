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
 * The input for the <a>SetStackPolicy</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/SetStackPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetStackPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or unique stack ID that you want to associate a policy with.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * Structure containing the stack policy body. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"> Prevent
     * Updates to Stack Resources</a> in the AWS CloudFormation User Guide. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     */
    private String stackPolicyBody;
    /**
     * <p>
     * Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB) located in
     * an S3 bucket in the same region as the stack. You can specify either the <code>StackPolicyBody</code> or the
     * <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     */
    private String stackPolicyURL;

    /**
     * <p>
     * The name or unique stack ID that you want to associate a policy with.
     * </p>
     * 
     * @param stackName
     *        The name or unique stack ID that you want to associate a policy with.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or unique stack ID that you want to associate a policy with.
     * </p>
     * 
     * @return The name or unique stack ID that you want to associate a policy with.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name or unique stack ID that you want to associate a policy with.
     * </p>
     * 
     * @param stackName
     *        The name or unique stack ID that you want to associate a policy with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetStackPolicyRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * Structure containing the stack policy body. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"> Prevent
     * Updates to Stack Resources</a> in the AWS CloudFormation User Guide. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * 
     * @param stackPolicyBody
     *        Structure containing the stack policy body. For more information, go to <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     *        Prevent Updates to Stack Resources</a> in the AWS CloudFormation User Guide. You can specify either the
     *        <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     */

    public void setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
    }

    /**
     * <p>
     * Structure containing the stack policy body. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"> Prevent
     * Updates to Stack Resources</a> in the AWS CloudFormation User Guide. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * 
     * @return Structure containing the stack policy body. For more information, go to <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     *         Prevent Updates to Stack Resources</a> in the AWS CloudFormation User Guide. You can specify either the
     *         <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     */

    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    /**
     * <p>
     * Structure containing the stack policy body. For more information, go to <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"> Prevent
     * Updates to Stack Resources</a> in the AWS CloudFormation User Guide. You can specify either the
     * <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * 
     * @param stackPolicyBody
     *        Structure containing the stack policy body. For more information, go to <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     *        Prevent Updates to Stack Resources</a> in the AWS CloudFormation User Guide. You can specify either the
     *        <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetStackPolicyRequest withStackPolicyBody(String stackPolicyBody) {
        setStackPolicyBody(stackPolicyBody);
        return this;
    }

    /**
     * <p>
     * Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB) located in
     * an S3 bucket in the same region as the stack. You can specify either the <code>StackPolicyBody</code> or the
     * <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * 
     * @param stackPolicyURL
     *        Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB)
     *        located in an S3 bucket in the same region as the stack. You can specify either the
     *        <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     */

    public void setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
    }

    /**
     * <p>
     * Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB) located in
     * an S3 bucket in the same region as the stack. You can specify either the <code>StackPolicyBody</code> or the
     * <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * 
     * @return Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB)
     *         located in an S3 bucket in the same region as the stack. You can specify either the
     *         <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     */

    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    /**
     * <p>
     * Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB) located in
     * an S3 bucket in the same region as the stack. You can specify either the <code>StackPolicyBody</code> or the
     * <code>StackPolicyURL</code> parameter, but not both.
     * </p>
     * 
     * @param stackPolicyURL
     *        Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB)
     *        located in an S3 bucket in the same region as the stack. You can specify either the
     *        <code>StackPolicyBody</code> or the <code>StackPolicyURL</code> parameter, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetStackPolicyRequest withStackPolicyURL(String stackPolicyURL) {
        setStackPolicyURL(stackPolicyURL);
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
        if (getStackPolicyBody() != null)
            sb.append("StackPolicyBody: ").append(getStackPolicyBody()).append(",");
        if (getStackPolicyURL() != null)
            sb.append("StackPolicyURL: ").append(getStackPolicyURL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetStackPolicyRequest == false)
            return false;
        SetStackPolicyRequest other = (SetStackPolicyRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getStackPolicyBody() == null ^ this.getStackPolicyBody() == null)
            return false;
        if (other.getStackPolicyBody() != null && other.getStackPolicyBody().equals(this.getStackPolicyBody()) == false)
            return false;
        if (other.getStackPolicyURL() == null ^ this.getStackPolicyURL() == null)
            return false;
        if (other.getStackPolicyURL() != null && other.getStackPolicyURL().equals(this.getStackPolicyURL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getStackPolicyBody() == null) ? 0 : getStackPolicyBody().hashCode());
        hashCode = prime * hashCode + ((getStackPolicyURL() == null) ? 0 : getStackPolicyURL().hashCode());
        return hashCode;
    }

    @Override
    public SetStackPolicyRequest clone() {
        return (SetStackPolicyRequest) super.clone();
    }

}
