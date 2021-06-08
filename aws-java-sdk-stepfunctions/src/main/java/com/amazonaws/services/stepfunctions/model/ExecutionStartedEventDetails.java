/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The JSON data input to the execution. Length constraints apply to the payload size, and are expressed as bytes in
     * UTF-8 encoding.
     * </p>
     */
    private String input;
    /**
     * <p>
     * Contains details about the input for an execution history event.
     * </p>
     */
    private HistoryEventExecutionDataDetails inputDetails;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used for executing AWS Lambda tasks.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The JSON data input to the execution. Length constraints apply to the payload size, and are expressed as bytes in
     * UTF-8 encoding.
     * </p>
     * 
     * @param input
     *        The JSON data input to the execution. Length constraints apply to the payload size, and are expressed as
     *        bytes in UTF-8 encoding.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The JSON data input to the execution. Length constraints apply to the payload size, and are expressed as bytes in
     * UTF-8 encoding.
     * </p>
     * 
     * @return The JSON data input to the execution. Length constraints apply to the payload size, and are expressed as
     *         bytes in UTF-8 encoding.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The JSON data input to the execution. Length constraints apply to the payload size, and are expressed as bytes in
     * UTF-8 encoding.
     * </p>
     * 
     * @param input
     *        The JSON data input to the execution. Length constraints apply to the payload size, and are expressed as
     *        bytes in UTF-8 encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStartedEventDetails withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * Contains details about the input for an execution history event.
     * </p>
     * 
     * @param inputDetails
     *        Contains details about the input for an execution history event.
     */

    public void setInputDetails(HistoryEventExecutionDataDetails inputDetails) {
        this.inputDetails = inputDetails;
    }

    /**
     * <p>
     * Contains details about the input for an execution history event.
     * </p>
     * 
     * @return Contains details about the input for an execution history event.
     */

    public HistoryEventExecutionDataDetails getInputDetails() {
        return this.inputDetails;
    }

    /**
     * <p>
     * Contains details about the input for an execution history event.
     * </p>
     * 
     * @param inputDetails
     *        Contains details about the input for an execution history event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionStartedEventDetails withInputDetails(HistoryEventExecutionDataDetails inputDetails) {
        setInputDetails(inputDetails);
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
        if (getInputDetails() != null)
            sb.append("InputDetails: ").append(getInputDetails()).append(",");
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
        if (other.getInputDetails() == null ^ this.getInputDetails() == null)
            return false;
        if (other.getInputDetails() != null && other.getInputDetails().equals(this.getInputDetails()) == false)
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
        hashCode = prime * hashCode + ((getInputDetails() == null) ? 0 : getInputDetails().hashCode());
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
