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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for task execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/MaintenanceWindowTaskInvocationParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowTaskInvocationParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parameters for a RUN_COMMAND task type.
     * </p>
     */
    private MaintenanceWindowRunCommandParameters runCommand;
    /**
     * <p>
     * The parameters for an AUTOMATION task type.
     * </p>
     */
    private MaintenanceWindowAutomationParameters automation;
    /**
     * <p>
     * The parameters for a STEP_FUNCTION task type.
     * </p>
     */
    private MaintenanceWindowStepFunctionsParameters stepFunctions;
    /**
     * <p>
     * The parameters for a LAMBDA task type.
     * </p>
     */
    private MaintenanceWindowLambdaParameters lambda;

    /**
     * <p>
     * The parameters for a RUN_COMMAND task type.
     * </p>
     * 
     * @param runCommand
     *        The parameters for a RUN_COMMAND task type.
     */

    public void setRunCommand(MaintenanceWindowRunCommandParameters runCommand) {
        this.runCommand = runCommand;
    }

    /**
     * <p>
     * The parameters for a RUN_COMMAND task type.
     * </p>
     * 
     * @return The parameters for a RUN_COMMAND task type.
     */

    public MaintenanceWindowRunCommandParameters getRunCommand() {
        return this.runCommand;
    }

    /**
     * <p>
     * The parameters for a RUN_COMMAND task type.
     * </p>
     * 
     * @param runCommand
     *        The parameters for a RUN_COMMAND task type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTaskInvocationParameters withRunCommand(MaintenanceWindowRunCommandParameters runCommand) {
        setRunCommand(runCommand);
        return this;
    }

    /**
     * <p>
     * The parameters for an AUTOMATION task type.
     * </p>
     * 
     * @param automation
     *        The parameters for an AUTOMATION task type.
     */

    public void setAutomation(MaintenanceWindowAutomationParameters automation) {
        this.automation = automation;
    }

    /**
     * <p>
     * The parameters for an AUTOMATION task type.
     * </p>
     * 
     * @return The parameters for an AUTOMATION task type.
     */

    public MaintenanceWindowAutomationParameters getAutomation() {
        return this.automation;
    }

    /**
     * <p>
     * The parameters for an AUTOMATION task type.
     * </p>
     * 
     * @param automation
     *        The parameters for an AUTOMATION task type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTaskInvocationParameters withAutomation(MaintenanceWindowAutomationParameters automation) {
        setAutomation(automation);
        return this;
    }

    /**
     * <p>
     * The parameters for a STEP_FUNCTION task type.
     * </p>
     * 
     * @param stepFunctions
     *        The parameters for a STEP_FUNCTION task type.
     */

    public void setStepFunctions(MaintenanceWindowStepFunctionsParameters stepFunctions) {
        this.stepFunctions = stepFunctions;
    }

    /**
     * <p>
     * The parameters for a STEP_FUNCTION task type.
     * </p>
     * 
     * @return The parameters for a STEP_FUNCTION task type.
     */

    public MaintenanceWindowStepFunctionsParameters getStepFunctions() {
        return this.stepFunctions;
    }

    /**
     * <p>
     * The parameters for a STEP_FUNCTION task type.
     * </p>
     * 
     * @param stepFunctions
     *        The parameters for a STEP_FUNCTION task type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTaskInvocationParameters withStepFunctions(MaintenanceWindowStepFunctionsParameters stepFunctions) {
        setStepFunctions(stepFunctions);
        return this;
    }

    /**
     * <p>
     * The parameters for a LAMBDA task type.
     * </p>
     * 
     * @param lambda
     *        The parameters for a LAMBDA task type.
     */

    public void setLambda(MaintenanceWindowLambdaParameters lambda) {
        this.lambda = lambda;
    }

    /**
     * <p>
     * The parameters for a LAMBDA task type.
     * </p>
     * 
     * @return The parameters for a LAMBDA task type.
     */

    public MaintenanceWindowLambdaParameters getLambda() {
        return this.lambda;
    }

    /**
     * <p>
     * The parameters for a LAMBDA task type.
     * </p>
     * 
     * @param lambda
     *        The parameters for a LAMBDA task type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowTaskInvocationParameters withLambda(MaintenanceWindowLambdaParameters lambda) {
        setLambda(lambda);
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
        if (getRunCommand() != null)
            sb.append("RunCommand: ").append(getRunCommand()).append(",");
        if (getAutomation() != null)
            sb.append("Automation: ").append(getAutomation()).append(",");
        if (getStepFunctions() != null)
            sb.append("StepFunctions: ").append(getStepFunctions()).append(",");
        if (getLambda() != null)
            sb.append("Lambda: ").append(getLambda());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowTaskInvocationParameters == false)
            return false;
        MaintenanceWindowTaskInvocationParameters other = (MaintenanceWindowTaskInvocationParameters) obj;
        if (other.getRunCommand() == null ^ this.getRunCommand() == null)
            return false;
        if (other.getRunCommand() != null && other.getRunCommand().equals(this.getRunCommand()) == false)
            return false;
        if (other.getAutomation() == null ^ this.getAutomation() == null)
            return false;
        if (other.getAutomation() != null && other.getAutomation().equals(this.getAutomation()) == false)
            return false;
        if (other.getStepFunctions() == null ^ this.getStepFunctions() == null)
            return false;
        if (other.getStepFunctions() != null && other.getStepFunctions().equals(this.getStepFunctions()) == false)
            return false;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRunCommand() == null) ? 0 : getRunCommand().hashCode());
        hashCode = prime * hashCode + ((getAutomation() == null) ? 0 : getAutomation().hashCode());
        hashCode = prime * hashCode + ((getStepFunctions() == null) ? 0 : getStepFunctions().hashCode());
        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceWindowTaskInvocationParameters clone() {
        try {
            return (MaintenanceWindowTaskInvocationParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.MaintenanceWindowTaskInvocationParametersMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
