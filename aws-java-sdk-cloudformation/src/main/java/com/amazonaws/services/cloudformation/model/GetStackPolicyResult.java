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

/**
 * <p>
 * The output for the <a>GetStackPolicy</a> action.
 * </p>
 */
public class GetStackPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Structure containing the stack policy body. (For more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"> Prevent
     * Updates to Stack Resources</a> in the AWS CloudFormation User Guide.)
     * </p>
     */
    private String stackPolicyBody;

    /**
     * <p>
     * Structure containing the stack policy body. (For more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"> Prevent
     * Updates to Stack Resources</a> in the AWS CloudFormation User Guide.)
     * </p>
     * 
     * @param stackPolicyBody
     *        Structure containing the stack policy body. (For more information, go to <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"> Prevent
     *        Updates to Stack Resources</a> in the AWS CloudFormation User Guide.)
     */

    public void setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
    }

    /**
     * <p>
     * Structure containing the stack policy body. (For more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"> Prevent
     * Updates to Stack Resources</a> in the AWS CloudFormation User Guide.)
     * </p>
     * 
     * @return Structure containing the stack policy body. (For more information, go to <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html">
     *         Prevent Updates to Stack Resources</a> in the AWS CloudFormation User Guide.)
     */

    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    /**
     * <p>
     * Structure containing the stack policy body. (For more information, go to <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"> Prevent
     * Updates to Stack Resources</a> in the AWS CloudFormation User Guide.)
     * </p>
     * 
     * @param stackPolicyBody
     *        Structure containing the stack policy body. (For more information, go to <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/protect-stack-resources.html"> Prevent
     *        Updates to Stack Resources</a> in the AWS CloudFormation User Guide.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStackPolicyResult withStackPolicyBody(String stackPolicyBody) {
        setStackPolicyBody(stackPolicyBody);
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
        if (getStackPolicyBody() != null)
            sb.append("StackPolicyBody: " + getStackPolicyBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStackPolicyResult == false)
            return false;
        GetStackPolicyResult other = (GetStackPolicyResult) obj;
        if (other.getStackPolicyBody() == null ^ this.getStackPolicyBody() == null)
            return false;
        if (other.getStackPolicyBody() != null && other.getStackPolicyBody().equals(this.getStackPolicyBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackPolicyBody() == null) ? 0 : getStackPolicyBody().hashCode());
        return hashCode;
    }

    @Override
    public GetStackPolicyResult clone() {
        try {
            return (GetStackPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
