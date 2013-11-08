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
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#setStackPolicy(SetStackPolicyRequest) SetStackPolicy operation}.
 * <p>
 * Sets a stack policy for a specified stack.
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#setStackPolicy(SetStackPolicyRequest)
 */
public class SetStackPolicyRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name or stack ID that you want to associate a policy with.
     */
    private String stackName;

    /**
     * Structure containing the stack policy body. (For more information, go
     * to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     * AWS CloudFormation User Guide</a>.) <p>You must pass
     * <code>StackPolicyBody</code> or <code>StackPolicyURL</code>. If both
     * are passed, only <code>StackPolicyBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     */
    private String stackPolicyBody;

    /**
     * Location of a file containing the stack policy. The URL must point to
     * a policy (max size: 16KB) located in an S3 bucket in the same region
     * as the stack. You must pass <code>StackPolicyBody</code> or
     * <code>StackPolicyURL</code>. If both are passed, only
     * <code>StackPolicyBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     */
    private String stackPolicyURL;

    /**
     * The name or stack ID that you want to associate a policy with.
     *
     * @return The name or stack ID that you want to associate a policy with.
     */
    public String getStackName() {
        return stackName;
    }
    
    /**
     * The name or stack ID that you want to associate a policy with.
     *
     * @param stackName The name or stack ID that you want to associate a policy with.
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }
    
    /**
     * The name or stack ID that you want to associate a policy with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackName The name or stack ID that you want to associate a policy with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetStackPolicyRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * Structure containing the stack policy body. (For more information, go
     * to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     * AWS CloudFormation User Guide</a>.) <p>You must pass
     * <code>StackPolicyBody</code> or <code>StackPolicyURL</code>. If both
     * are passed, only <code>StackPolicyBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @return Structure containing the stack policy body. (For more information, go
     *         to the <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     *         AWS CloudFormation User Guide</a>.) <p>You must pass
     *         <code>StackPolicyBody</code> or <code>StackPolicyURL</code>. If both
     *         are passed, only <code>StackPolicyBody</code> is used.
     */
    public String getStackPolicyBody() {
        return stackPolicyBody;
    }
    
    /**
     * Structure containing the stack policy body. (For more information, go
     * to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     * AWS CloudFormation User Guide</a>.) <p>You must pass
     * <code>StackPolicyBody</code> or <code>StackPolicyURL</code>. If both
     * are passed, only <code>StackPolicyBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param stackPolicyBody Structure containing the stack policy body. (For more information, go
     *         to the <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     *         AWS CloudFormation User Guide</a>.) <p>You must pass
     *         <code>StackPolicyBody</code> or <code>StackPolicyURL</code>. If both
     *         are passed, only <code>StackPolicyBody</code> is used.
     */
    public void setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
    }
    
    /**
     * Structure containing the stack policy body. (For more information, go
     * to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     * AWS CloudFormation User Guide</a>.) <p>You must pass
     * <code>StackPolicyBody</code> or <code>StackPolicyURL</code>. If both
     * are passed, only <code>StackPolicyBody</code> is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16384<br/>
     *
     * @param stackPolicyBody Structure containing the stack policy body. (For more information, go
     *         to the <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     *         AWS CloudFormation User Guide</a>.) <p>You must pass
     *         <code>StackPolicyBody</code> or <code>StackPolicyURL</code>. If both
     *         are passed, only <code>StackPolicyBody</code> is used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetStackPolicyRequest withStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }

    /**
     * Location of a file containing the stack policy. The URL must point to
     * a policy (max size: 16KB) located in an S3 bucket in the same region
     * as the stack. You must pass <code>StackPolicyBody</code> or
     * <code>StackPolicyURL</code>. If both are passed, only
     * <code>StackPolicyBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @return Location of a file containing the stack policy. The URL must point to
     *         a policy (max size: 16KB) located in an S3 bucket in the same region
     *         as the stack. You must pass <code>StackPolicyBody</code> or
     *         <code>StackPolicyURL</code>. If both are passed, only
     *         <code>StackPolicyBody</code> is used.
     */
    public String getStackPolicyURL() {
        return stackPolicyURL;
    }
    
    /**
     * Location of a file containing the stack policy. The URL must point to
     * a policy (max size: 16KB) located in an S3 bucket in the same region
     * as the stack. You must pass <code>StackPolicyBody</code> or
     * <code>StackPolicyURL</code>. If both are passed, only
     * <code>StackPolicyBody</code> is used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param stackPolicyURL Location of a file containing the stack policy. The URL must point to
     *         a policy (max size: 16KB) located in an S3 bucket in the same region
     *         as the stack. You must pass <code>StackPolicyBody</code> or
     *         <code>StackPolicyURL</code>. If both are passed, only
     *         <code>StackPolicyBody</code> is used.
     */
    public void setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
    }
    
    /**
     * Location of a file containing the stack policy. The URL must point to
     * a policy (max size: 16KB) located in an S3 bucket in the same region
     * as the stack. You must pass <code>StackPolicyBody</code> or
     * <code>StackPolicyURL</code>. If both are passed, only
     * <code>StackPolicyBody</code> is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1350<br/>
     *
     * @param stackPolicyURL Location of a file containing the stack policy. The URL must point to
     *         a policy (max size: 16KB) located in an S3 bucket in the same region
     *         as the stack. You must pass <code>StackPolicyBody</code> or
     *         <code>StackPolicyURL</code>. If both are passed, only
     *         <code>StackPolicyBody</code> is used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetStackPolicyRequest withStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
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
        if (getStackPolicyBody() != null) sb.append("StackPolicyBody: " + getStackPolicyBody() + ",");
        if (getStackPolicyURL() != null) sb.append("StackPolicyURL: " + getStackPolicyURL() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetStackPolicyRequest == false) return false;
        SetStackPolicyRequest other = (SetStackPolicyRequest)obj;
        
        if (other.getStackName() == null ^ this.getStackName() == null) return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false) return false; 
        if (other.getStackPolicyBody() == null ^ this.getStackPolicyBody() == null) return false;
        if (other.getStackPolicyBody() != null && other.getStackPolicyBody().equals(this.getStackPolicyBody()) == false) return false; 
        if (other.getStackPolicyURL() == null ^ this.getStackPolicyURL() == null) return false;
        if (other.getStackPolicyURL() != null && other.getStackPolicyURL().equals(this.getStackPolicyURL()) == false) return false; 
        return true;
    }
    
}
    