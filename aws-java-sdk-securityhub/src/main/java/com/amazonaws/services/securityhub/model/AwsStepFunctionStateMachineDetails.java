/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about an Step Functions state machine, which is a workflow consisting of a series of event- driven
 * steps.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsStepFunctionStateMachineDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsStepFunctionStateMachineDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A user-defined or an auto-generated string that identifies a <code>Map</code> state. This parameter is present
     * only if the <code>stateMachineArn</code> specified in input is a qualified state machine ARN.
     * </p>
     */
    private String label;
    /**
     * <p>
     * Used to set CloudWatch Logs options.
     * </p>
     */
    private AwsStepFunctionStateMachineLoggingConfigurationDetails loggingConfiguration;
    /**
     * <p>
     * The name of the state machine.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used when creating this state machine.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The ARN that identifies the state machine.
     * </p>
     */
    private String stateMachineArn;
    /**
     * <p>
     * The current status of the state machine.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies whether X-Ray tracing is enabled.
     * </p>
     */
    private AwsStepFunctionStateMachineTracingConfigurationDetails tracingConfiguration;
    /**
     * <p>
     * The type of the state machine (STANDARD or EXPRESS).
     * </p>
     */
    private String type;

    /**
     * <p>
     * A user-defined or an auto-generated string that identifies a <code>Map</code> state. This parameter is present
     * only if the <code>stateMachineArn</code> specified in input is a qualified state machine ARN.
     * </p>
     * 
     * @param label
     *        A user-defined or an auto-generated string that identifies a <code>Map</code> state. This parameter is
     *        present only if the <code>stateMachineArn</code> specified in input is a qualified state machine ARN.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * A user-defined or an auto-generated string that identifies a <code>Map</code> state. This parameter is present
     * only if the <code>stateMachineArn</code> specified in input is a qualified state machine ARN.
     * </p>
     * 
     * @return A user-defined or an auto-generated string that identifies a <code>Map</code> state. This parameter is
     *         present only if the <code>stateMachineArn</code> specified in input is a qualified state machine ARN.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * A user-defined or an auto-generated string that identifies a <code>Map</code> state. This parameter is present
     * only if the <code>stateMachineArn</code> specified in input is a qualified state machine ARN.
     * </p>
     * 
     * @param label
     *        A user-defined or an auto-generated string that identifies a <code>Map</code> state. This parameter is
     *        present only if the <code>stateMachineArn</code> specified in input is a qualified state machine ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsStepFunctionStateMachineDetails withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * Used to set CloudWatch Logs options.
     * </p>
     * 
     * @param loggingConfiguration
     *        Used to set CloudWatch Logs options.
     */

    public void setLoggingConfiguration(AwsStepFunctionStateMachineLoggingConfigurationDetails loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    /**
     * <p>
     * Used to set CloudWatch Logs options.
     * </p>
     * 
     * @return Used to set CloudWatch Logs options.
     */

    public AwsStepFunctionStateMachineLoggingConfigurationDetails getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    /**
     * <p>
     * Used to set CloudWatch Logs options.
     * </p>
     * 
     * @param loggingConfiguration
     *        Used to set CloudWatch Logs options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsStepFunctionStateMachineDetails withLoggingConfiguration(AwsStepFunctionStateMachineLoggingConfigurationDetails loggingConfiguration) {
        setLoggingConfiguration(loggingConfiguration);
        return this;
    }

    /**
     * <p>
     * The name of the state machine.
     * </p>
     * 
     * @param name
     *        The name of the state machine.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the state machine.
     * </p>
     * 
     * @return The name of the state machine.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the state machine.
     * </p>
     * 
     * @param name
     *        The name of the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsStepFunctionStateMachineDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used when creating this state machine.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role used when creating this state machine.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used when creating this state machine.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role used when creating this state machine.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used when creating this state machine.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role used when creating this state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsStepFunctionStateMachineDetails withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The ARN that identifies the state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The ARN that identifies the state machine.
     */

    public void setStateMachineArn(String stateMachineArn) {
        this.stateMachineArn = stateMachineArn;
    }

    /**
     * <p>
     * The ARN that identifies the state machine.
     * </p>
     * 
     * @return The ARN that identifies the state machine.
     */

    public String getStateMachineArn() {
        return this.stateMachineArn;
    }

    /**
     * <p>
     * The ARN that identifies the state machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The ARN that identifies the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsStepFunctionStateMachineDetails withStateMachineArn(String stateMachineArn) {
        setStateMachineArn(stateMachineArn);
        return this;
    }

    /**
     * <p>
     * The current status of the state machine.
     * </p>
     * 
     * @param status
     *        The current status of the state machine.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the state machine.
     * </p>
     * 
     * @return The current status of the state machine.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the state machine.
     * </p>
     * 
     * @param status
     *        The current status of the state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsStepFunctionStateMachineDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies whether X-Ray tracing is enabled.
     * </p>
     * 
     * @param tracingConfiguration
     *        Specifies whether X-Ray tracing is enabled.
     */

    public void setTracingConfiguration(AwsStepFunctionStateMachineTracingConfigurationDetails tracingConfiguration) {
        this.tracingConfiguration = tracingConfiguration;
    }

    /**
     * <p>
     * Specifies whether X-Ray tracing is enabled.
     * </p>
     * 
     * @return Specifies whether X-Ray tracing is enabled.
     */

    public AwsStepFunctionStateMachineTracingConfigurationDetails getTracingConfiguration() {
        return this.tracingConfiguration;
    }

    /**
     * <p>
     * Specifies whether X-Ray tracing is enabled.
     * </p>
     * 
     * @param tracingConfiguration
     *        Specifies whether X-Ray tracing is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsStepFunctionStateMachineDetails withTracingConfiguration(AwsStepFunctionStateMachineTracingConfigurationDetails tracingConfiguration) {
        setTracingConfiguration(tracingConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of the state machine (STANDARD or EXPRESS).
     * </p>
     * 
     * @param type
     *        The type of the state machine (STANDARD or EXPRESS).
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the state machine (STANDARD or EXPRESS).
     * </p>
     * 
     * @return The type of the state machine (STANDARD or EXPRESS).
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the state machine (STANDARD or EXPRESS).
     * </p>
     * 
     * @param type
     *        The type of the state machine (STANDARD or EXPRESS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsStepFunctionStateMachineDetails withType(String type) {
        setType(type);
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
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getLoggingConfiguration() != null)
            sb.append("LoggingConfiguration: ").append(getLoggingConfiguration()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStateMachineArn() != null)
            sb.append("StateMachineArn: ").append(getStateMachineArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTracingConfiguration() != null)
            sb.append("TracingConfiguration: ").append(getTracingConfiguration()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsStepFunctionStateMachineDetails == false)
            return false;
        AwsStepFunctionStateMachineDetails other = (AwsStepFunctionStateMachineDetails) obj;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getLoggingConfiguration() == null ^ this.getLoggingConfiguration() == null)
            return false;
        if (other.getLoggingConfiguration() != null && other.getLoggingConfiguration().equals(this.getLoggingConfiguration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStateMachineArn() == null ^ this.getStateMachineArn() == null)
            return false;
        if (other.getStateMachineArn() != null && other.getStateMachineArn().equals(this.getStateMachineArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTracingConfiguration() == null ^ this.getTracingConfiguration() == null)
            return false;
        if (other.getTracingConfiguration() != null && other.getTracingConfiguration().equals(this.getTracingConfiguration()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getLoggingConfiguration() == null) ? 0 : getLoggingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStateMachineArn() == null) ? 0 : getStateMachineArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTracingConfiguration() == null) ? 0 : getTracingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsStepFunctionStateMachineDetails clone() {
        try {
            return (AwsStepFunctionStateMachineDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsStepFunctionStateMachineDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
