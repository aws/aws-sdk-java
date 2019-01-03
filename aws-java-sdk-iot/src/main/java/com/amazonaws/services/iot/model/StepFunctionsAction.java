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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Starts execution of a Step Functions state machine.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepFunctionsAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * (Optional) A name will be given to the state machine execution consisting of this prefix followed by a UUID. Step
     * Functions automatically creates a unique name for each state machine execution if one is not provided.
     * </p>
     */
    private String executionNamePrefix;
    /**
     * <p>
     * The name of the Step Functions state machine whose execution will be started.
     * </p>
     */
    private String stateMachineName;
    /**
     * <p>
     * The ARN of the role that grants IoT permission to start execution of a state machine
     * ("Action":"states:StartExecution").
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * (Optional) A name will be given to the state machine execution consisting of this prefix followed by a UUID. Step
     * Functions automatically creates a unique name for each state machine execution if one is not provided.
     * </p>
     * 
     * @param executionNamePrefix
     *        (Optional) A name will be given to the state machine execution consisting of this prefix followed by a
     *        UUID. Step Functions automatically creates a unique name for each state machine execution if one is not
     *        provided.
     */

    public void setExecutionNamePrefix(String executionNamePrefix) {
        this.executionNamePrefix = executionNamePrefix;
    }

    /**
     * <p>
     * (Optional) A name will be given to the state machine execution consisting of this prefix followed by a UUID. Step
     * Functions automatically creates a unique name for each state machine execution if one is not provided.
     * </p>
     * 
     * @return (Optional) A name will be given to the state machine execution consisting of this prefix followed by a
     *         UUID. Step Functions automatically creates a unique name for each state machine execution if one is not
     *         provided.
     */

    public String getExecutionNamePrefix() {
        return this.executionNamePrefix;
    }

    /**
     * <p>
     * (Optional) A name will be given to the state machine execution consisting of this prefix followed by a UUID. Step
     * Functions automatically creates a unique name for each state machine execution if one is not provided.
     * </p>
     * 
     * @param executionNamePrefix
     *        (Optional) A name will be given to the state machine execution consisting of this prefix followed by a
     *        UUID. Step Functions automatically creates a unique name for each state machine execution if one is not
     *        provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepFunctionsAction withExecutionNamePrefix(String executionNamePrefix) {
        setExecutionNamePrefix(executionNamePrefix);
        return this;
    }

    /**
     * <p>
     * The name of the Step Functions state machine whose execution will be started.
     * </p>
     * 
     * @param stateMachineName
     *        The name of the Step Functions state machine whose execution will be started.
     */

    public void setStateMachineName(String stateMachineName) {
        this.stateMachineName = stateMachineName;
    }

    /**
     * <p>
     * The name of the Step Functions state machine whose execution will be started.
     * </p>
     * 
     * @return The name of the Step Functions state machine whose execution will be started.
     */

    public String getStateMachineName() {
        return this.stateMachineName;
    }

    /**
     * <p>
     * The name of the Step Functions state machine whose execution will be started.
     * </p>
     * 
     * @param stateMachineName
     *        The name of the Step Functions state machine whose execution will be started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepFunctionsAction withStateMachineName(String stateMachineName) {
        setStateMachineName(stateMachineName);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that grants IoT permission to start execution of a state machine
     * ("Action":"states:StartExecution").
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants IoT permission to start execution of a state machine
     *        ("Action":"states:StartExecution").
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants IoT permission to start execution of a state machine
     * ("Action":"states:StartExecution").
     * </p>
     * 
     * @return The ARN of the role that grants IoT permission to start execution of a state machine
     *         ("Action":"states:StartExecution").
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants IoT permission to start execution of a state machine
     * ("Action":"states:StartExecution").
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role that grants IoT permission to start execution of a state machine
     *        ("Action":"states:StartExecution").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepFunctionsAction withRoleArn(String roleArn) {
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
        if (getExecutionNamePrefix() != null)
            sb.append("ExecutionNamePrefix: ").append(getExecutionNamePrefix()).append(",");
        if (getStateMachineName() != null)
            sb.append("StateMachineName: ").append(getStateMachineName()).append(",");
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

        if (obj instanceof StepFunctionsAction == false)
            return false;
        StepFunctionsAction other = (StepFunctionsAction) obj;
        if (other.getExecutionNamePrefix() == null ^ this.getExecutionNamePrefix() == null)
            return false;
        if (other.getExecutionNamePrefix() != null && other.getExecutionNamePrefix().equals(this.getExecutionNamePrefix()) == false)
            return false;
        if (other.getStateMachineName() == null ^ this.getStateMachineName() == null)
            return false;
        if (other.getStateMachineName() != null && other.getStateMachineName().equals(this.getStateMachineName()) == false)
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

        hashCode = prime * hashCode + ((getExecutionNamePrefix() == null) ? 0 : getExecutionNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getStateMachineName() == null) ? 0 : getStateMachineName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public StepFunctionsAction clone() {
        try {
            return (StepFunctionsAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.StepFunctionsActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
