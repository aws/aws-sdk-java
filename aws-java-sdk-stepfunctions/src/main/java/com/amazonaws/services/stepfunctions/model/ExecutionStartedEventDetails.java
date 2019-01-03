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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the start of the execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/ExecutionStartedEventDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionStartedEventDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The JSON data input to the execution.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used for executing AWS Lambda tasks.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The JSON data input to the execution.
     * </p>
     * 
     * @param input
     *        The JSON data input to the execution.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The JSON data input to the execution.
     * </p>
     * 
     * @return The JSON data input to the execution.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The JSON data input to the execution.
     * </p>
     * 
     * @param input
     *        The JSON data input to the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStartedEventDetails withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used for executing AWS Lambda tasks.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role used for executing AWS Lambda tasks.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used for executing AWS Lambda tasks.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role used for executing AWS Lambda tasks.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used for executing AWS Lambda tasks.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role used for executing AWS Lambda tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStartedEventDetails withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getInput() != null)
            sb.append("Input: ").append("***Sensitive Data Redacted***").append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionStartedEventDetails == false)
            return false;
        ExecutionStartedEventDetails other = (ExecutionStartedEventDetails) obj;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionStartedEventDetails clone() {
        try {
            return (ExecutionStartedEventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.ExecutionStartedEventDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
