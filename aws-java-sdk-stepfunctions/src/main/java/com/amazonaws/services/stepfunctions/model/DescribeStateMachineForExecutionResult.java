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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeStateMachineForExecution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStateMachineForExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine associated with the execution.
     * </p>
     */
    private String stateMachineArn;
    /**
     * <p>
     * The name of the state machine associated with the execution.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon States Language definition of the state machine. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a>.
     * </p>
     */
    private String definition;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role of the State Machine for the execution.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The date and time the state machine associated with an execution was updated. For a newly created state machine,
     * this is the creation date.
     * </p>
     */
    private java.util.Date updateDate;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine associated with the execution.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the state machine associated with the execution.
     */

    public void setStateMachineArn(String stateMachineArn) {
        this.stateMachineArn = stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine associated with the execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the state machine associated with the execution.
     */

    public String getStateMachineArn() {
        return this.stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine associated with the execution.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the state machine associated with the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineForExecutionResult withStateMachineArn(String stateMachineArn) {
        setStateMachineArn(stateMachineArn);
        return this;
    }

    /**
     * <p>
     * The name of the state machine associated with the execution.
     * </p>
     * 
     * @param name
     *        The name of the state machine associated with the execution.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the state machine associated with the execution.
     * </p>
     * 
     * @return The name of the state machine associated with the execution.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the state machine associated with the execution.
     * </p>
     * 
     * @param name
     *        The name of the state machine associated with the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineForExecutionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a>.
     * </p>
     * 
     * @param definition
     *        The Amazon States Language definition of the state machine. See <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *        States Language</a>.
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a>.
     * </p>
     * 
     * @return The Amazon States Language definition of the state machine. See <a
     *         href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *         States Language</a>.
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The Amazon States Language definition of the state machine. See <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon States
     * Language</a>.
     * </p>
     * 
     * @param definition
     *        The Amazon States Language definition of the state machine. See <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html">Amazon
     *        States Language</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineForExecutionResult withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role of the State Machine for the execution.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role of the State Machine for the execution.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role of the State Machine for the execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role of the State Machine for the execution.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role of the State Machine for the execution.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role of the State Machine for the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineForExecutionResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The date and time the state machine associated with an execution was updated. For a newly created state machine,
     * this is the creation date.
     * </p>
     * 
     * @param updateDate
     *        The date and time the state machine associated with an execution was updated. For a newly created state
     *        machine, this is the creation date.
     */

    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * <p>
     * The date and time the state machine associated with an execution was updated. For a newly created state machine,
     * this is the creation date.
     * </p>
     * 
     * @return The date and time the state machine associated with an execution was updated. For a newly created state
     *         machine, this is the creation date.
     */

    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * <p>
     * The date and time the state machine associated with an execution was updated. For a newly created state machine,
     * this is the creation date.
     * </p>
     * 
     * @param updateDate
     *        The date and time the state machine associated with an execution was updated. For a newly created state
     *        machine, this is the creation date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStateMachineForExecutionResult withUpdateDate(java.util.Date updateDate) {
        setUpdateDate(updateDate);
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
        if (getStateMachineArn() != null)
            sb.append("StateMachineArn: ").append(getStateMachineArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append("***Sensitive Data Redacted***").append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getUpdateDate() != null)
            sb.append("UpdateDate: ").append(getUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStateMachineForExecutionResult == false)
            return false;
        DescribeStateMachineForExecutionResult other = (DescribeStateMachineForExecutionResult) obj;
        if (other.getStateMachineArn() == null ^ this.getStateMachineArn() == null)
            return false;
        if (other.getStateMachineArn() != null && other.getStateMachineArn().equals(this.getStateMachineArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null)
            return false;
        if (other.getUpdateDate() != null && other.getUpdateDate().equals(this.getUpdateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStateMachineArn() == null) ? 0 : getStateMachineArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStateMachineForExecutionResult clone() {
        try {
            return (DescribeStateMachineForExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
