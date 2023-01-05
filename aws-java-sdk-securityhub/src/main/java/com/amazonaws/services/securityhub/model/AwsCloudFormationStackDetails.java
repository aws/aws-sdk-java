/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Nests a stack as a resource in a top-level template. Nested stacks are stacks created as resources for another stack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCloudFormationStackDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFormationStackDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     */
    private java.util.List<String> capabilities;
    /**
     * <p>
     * The time at which the stack was created.
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * A user-defined description associated with the stack.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Boolean to enable or disable rollback on stack creation failures.
     * </p>
     */
    private Boolean disableRollback;
    /**
     * <p>
     * Information about whether a stack's actual configuration differs, or has drifted, from its expected
     * configuration, as defined in the stack template and any values specified as template parameters.
     * </p>
     */
    private AwsCloudFormationStackDriftInformationDetails driftInformation;
    /**
     * <p>
     * Whether termination protection is enabled for the stack.
     * </p>
     */
    private Boolean enableTerminationProtection;
    /**
     * <p>
     * The time the nested stack was last updated. This field will only be returned if the stack has been updated at
     * least once.
     * </p>
     */
    private String lastUpdatedTime;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the Amazon SNS topic to which stack-related events are published.
     * </p>
     */
    private java.util.List<String> notificationArns;
    /**
     * <p>
     * A list of output structures.
     * </p>
     */
    private java.util.List<AwsCloudFormationStackOutputsDetails> outputs;
    /**
     * <p>
     * The ARN of an IAM role that's associated with the stack.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The name associated with the stack.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * Current status of the stack.
     * </p>
     */
    private String stackStatus;
    /**
     * <p>
     * Success or failure message associated with the stack status.
     * </p>
     */
    private String stackStatusReason;
    /**
     * <p>
     * The length of time, in minutes, that CloudFormation waits for the nested stack to reach the
     * <code>CREATE_COMPLETE</code> state.
     * </p>
     */
    private Integer timeoutInMinutes;

    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     * 
     * @return The capabilities allowed in the stack.
     */

    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     * 
     * @param capabilities
     *        The capabilities allowed in the stack.
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new java.util.ArrayList<String>(capabilities);
    }

    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        The capabilities allowed in the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new java.util.ArrayList<String>(capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     * 
     * @param capabilities
     *        The capabilities allowed in the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The time at which the stack was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the stack was created.
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the stack was created.
     * </p>
     * 
     * @return The time at which the stack was created.
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the stack was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the stack was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A user-defined description associated with the stack.
     * </p>
     * 
     * @param description
     *        A user-defined description associated with the stack.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-defined description associated with the stack.
     * </p>
     * 
     * @return A user-defined description associated with the stack.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A user-defined description associated with the stack.
     * </p>
     * 
     * @param description
     *        A user-defined description associated with the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Boolean to enable or disable rollback on stack creation failures.
     * </p>
     * 
     * @param disableRollback
     *        Boolean to enable or disable rollback on stack creation failures.
     */

    public void setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
    }

    /**
     * <p>
     * Boolean to enable or disable rollback on stack creation failures.
     * </p>
     * 
     * @return Boolean to enable or disable rollback on stack creation failures.
     */

    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    /**
     * <p>
     * Boolean to enable or disable rollback on stack creation failures.
     * </p>
     * 
     * @param disableRollback
     *        Boolean to enable or disable rollback on stack creation failures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withDisableRollback(Boolean disableRollback) {
        setDisableRollback(disableRollback);
        return this;
    }

    /**
     * <p>
     * Boolean to enable or disable rollback on stack creation failures.
     * </p>
     * 
     * @return Boolean to enable or disable rollback on stack creation failures.
     */

    public Boolean isDisableRollback() {
        return this.disableRollback;
    }

    /**
     * <p>
     * Information about whether a stack's actual configuration differs, or has drifted, from its expected
     * configuration, as defined in the stack template and any values specified as template parameters.
     * </p>
     * 
     * @param driftInformation
     *        Information about whether a stack's actual configuration differs, or has drifted, from its expected
     *        configuration, as defined in the stack template and any values specified as template parameters.
     */

    public void setDriftInformation(AwsCloudFormationStackDriftInformationDetails driftInformation) {
        this.driftInformation = driftInformation;
    }

    /**
     * <p>
     * Information about whether a stack's actual configuration differs, or has drifted, from its expected
     * configuration, as defined in the stack template and any values specified as template parameters.
     * </p>
     * 
     * @return Information about whether a stack's actual configuration differs, or has drifted, from its expected
     *         configuration, as defined in the stack template and any values specified as template parameters.
     */

    public AwsCloudFormationStackDriftInformationDetails getDriftInformation() {
        return this.driftInformation;
    }

    /**
     * <p>
     * Information about whether a stack's actual configuration differs, or has drifted, from its expected
     * configuration, as defined in the stack template and any values specified as template parameters.
     * </p>
     * 
     * @param driftInformation
     *        Information about whether a stack's actual configuration differs, or has drifted, from its expected
     *        configuration, as defined in the stack template and any values specified as template parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withDriftInformation(AwsCloudFormationStackDriftInformationDetails driftInformation) {
        setDriftInformation(driftInformation);
        return this;
    }

    /**
     * <p>
     * Whether termination protection is enabled for the stack.
     * </p>
     * 
     * @param enableTerminationProtection
     *        Whether termination protection is enabled for the stack.
     */

    public void setEnableTerminationProtection(Boolean enableTerminationProtection) {
        this.enableTerminationProtection = enableTerminationProtection;
    }

    /**
     * <p>
     * Whether termination protection is enabled for the stack.
     * </p>
     * 
     * @return Whether termination protection is enabled for the stack.
     */

    public Boolean getEnableTerminationProtection() {
        return this.enableTerminationProtection;
    }

    /**
     * <p>
     * Whether termination protection is enabled for the stack.
     * </p>
     * 
     * @param enableTerminationProtection
     *        Whether termination protection is enabled for the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withEnableTerminationProtection(Boolean enableTerminationProtection) {
        setEnableTerminationProtection(enableTerminationProtection);
        return this;
    }

    /**
     * <p>
     * Whether termination protection is enabled for the stack.
     * </p>
     * 
     * @return Whether termination protection is enabled for the stack.
     */

    public Boolean isEnableTerminationProtection() {
        return this.enableTerminationProtection;
    }

    /**
     * <p>
     * The time the nested stack was last updated. This field will only be returned if the stack has been updated at
     * least once.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time the nested stack was last updated. This field will only be returned if the stack has been updated
     *        at least once.
     */

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time the nested stack was last updated. This field will only be returned if the stack has been updated at
     * least once.
     * </p>
     * 
     * @return The time the nested stack was last updated. This field will only be returned if the stack has been
     *         updated at least once.
     */

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time the nested stack was last updated. This field will only be returned if the stack has been updated at
     * least once.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time the nested stack was last updated. This field will only be returned if the stack has been updated
     *        at least once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withLastUpdatedTime(String lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the Amazon SNS topic to which stack-related events are published.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the Amazon SNS topic to which stack-related events are published.
     */

    public java.util.List<String> getNotificationArns() {
        return notificationArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the Amazon SNS topic to which stack-related events are published.
     * </p>
     * 
     * @param notificationArns
     *        The Amazon Resource Names (ARNs) of the Amazon SNS topic to which stack-related events are published.
     */

    public void setNotificationArns(java.util.Collection<String> notificationArns) {
        if (notificationArns == null) {
            this.notificationArns = null;
            return;
        }

        this.notificationArns = new java.util.ArrayList<String>(notificationArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the Amazon SNS topic to which stack-related events are published.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationArns(java.util.Collection)} or {@link #withNotificationArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param notificationArns
     *        The Amazon Resource Names (ARNs) of the Amazon SNS topic to which stack-related events are published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withNotificationArns(String... notificationArns) {
        if (this.notificationArns == null) {
            setNotificationArns(new java.util.ArrayList<String>(notificationArns.length));
        }
        for (String ele : notificationArns) {
            this.notificationArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the Amazon SNS topic to which stack-related events are published.
     * </p>
     * 
     * @param notificationArns
     *        The Amazon Resource Names (ARNs) of the Amazon SNS topic to which stack-related events are published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withNotificationArns(java.util.Collection<String> notificationArns) {
        setNotificationArns(notificationArns);
        return this;
    }

    /**
     * <p>
     * A list of output structures.
     * </p>
     * 
     * @return A list of output structures.
     */

    public java.util.List<AwsCloudFormationStackOutputsDetails> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * A list of output structures.
     * </p>
     * 
     * @param outputs
     *        A list of output structures.
     */

    public void setOutputs(java.util.Collection<AwsCloudFormationStackOutputsDetails> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<AwsCloudFormationStackOutputsDetails>(outputs);
    }

    /**
     * <p>
     * A list of output structures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        A list of output structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withOutputs(AwsCloudFormationStackOutputsDetails... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<AwsCloudFormationStackOutputsDetails>(outputs.length));
        }
        for (AwsCloudFormationStackOutputsDetails ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of output structures.
     * </p>
     * 
     * @param outputs
     *        A list of output structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withOutputs(java.util.Collection<AwsCloudFormationStackOutputsDetails> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role that's associated with the stack.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role that's associated with the stack.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that's associated with the stack.
     * </p>
     * 
     * @return The ARN of an IAM role that's associated with the stack.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that's associated with the stack.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role that's associated with the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     * 
     * @param stackId
     *        Unique identifier of the stack.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     * 
     * @return Unique identifier of the stack.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     * 
     * @param stackId
     *        Unique identifier of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name associated with the stack.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * 
     * @return The name associated with the stack.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name associated with the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * Current status of the stack.
     * </p>
     * 
     * @param stackStatus
     *        Current status of the stack.
     */

    public void setStackStatus(String stackStatus) {
        this.stackStatus = stackStatus;
    }

    /**
     * <p>
     * Current status of the stack.
     * </p>
     * 
     * @return Current status of the stack.
     */

    public String getStackStatus() {
        return this.stackStatus;
    }

    /**
     * <p>
     * Current status of the stack.
     * </p>
     * 
     * @param stackStatus
     *        Current status of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withStackStatus(String stackStatus) {
        setStackStatus(stackStatus);
        return this;
    }

    /**
     * <p>
     * Success or failure message associated with the stack status.
     * </p>
     * 
     * @param stackStatusReason
     *        Success or failure message associated with the stack status.
     */

    public void setStackStatusReason(String stackStatusReason) {
        this.stackStatusReason = stackStatusReason;
    }

    /**
     * <p>
     * Success or failure message associated with the stack status.
     * </p>
     * 
     * @return Success or failure message associated with the stack status.
     */

    public String getStackStatusReason() {
        return this.stackStatusReason;
    }

    /**
     * <p>
     * Success or failure message associated with the stack status.
     * </p>
     * 
     * @param stackStatusReason
     *        Success or failure message associated with the stack status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withStackStatusReason(String stackStatusReason) {
        setStackStatusReason(stackStatusReason);
        return this;
    }

    /**
     * <p>
     * The length of time, in minutes, that CloudFormation waits for the nested stack to reach the
     * <code>CREATE_COMPLETE</code> state.
     * </p>
     * 
     * @param timeoutInMinutes
     *        The length of time, in minutes, that CloudFormation waits for the nested stack to reach the
     *        <code>CREATE_COMPLETE</code> state.
     */

    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    /**
     * <p>
     * The length of time, in minutes, that CloudFormation waits for the nested stack to reach the
     * <code>CREATE_COMPLETE</code> state.
     * </p>
     * 
     * @return The length of time, in minutes, that CloudFormation waits for the nested stack to reach the
     *         <code>CREATE_COMPLETE</code> state.
     */

    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    /**
     * <p>
     * The length of time, in minutes, that CloudFormation waits for the nested stack to reach the
     * <code>CREATE_COMPLETE</code> state.
     * </p>
     * 
     * @param timeoutInMinutes
     *        The length of time, in minutes, that CloudFormation waits for the nested stack to reach the
     *        <code>CREATE_COMPLETE</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackDetails withTimeoutInMinutes(Integer timeoutInMinutes) {
        setTimeoutInMinutes(timeoutInMinutes);
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
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisableRollback() != null)
            sb.append("DisableRollback: ").append(getDisableRollback()).append(",");
        if (getDriftInformation() != null)
            sb.append("DriftInformation: ").append(getDriftInformation()).append(",");
        if (getEnableTerminationProtection() != null)
            sb.append("EnableTerminationProtection: ").append(getEnableTerminationProtection()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getNotificationArns() != null)
            sb.append("NotificationArns: ").append(getNotificationArns()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getStackStatus() != null)
            sb.append("StackStatus: ").append(getStackStatus()).append(",");
        if (getStackStatusReason() != null)
            sb.append("StackStatusReason: ").append(getStackStatusReason()).append(",");
        if (getTimeoutInMinutes() != null)
            sb.append("TimeoutInMinutes: ").append(getTimeoutInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFormationStackDetails == false)
            return false;
        AwsCloudFormationStackDetails other = (AwsCloudFormationStackDetails) obj;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisableRollback() == null ^ this.getDisableRollback() == null)
            return false;
        if (other.getDisableRollback() != null && other.getDisableRollback().equals(this.getDisableRollback()) == false)
            return false;
        if (other.getDriftInformation() == null ^ this.getDriftInformation() == null)
            return false;
        if (other.getDriftInformation() != null && other.getDriftInformation().equals(this.getDriftInformation()) == false)
            return false;
        if (other.getEnableTerminationProtection() == null ^ this.getEnableTerminationProtection() == null)
            return false;
        if (other.getEnableTerminationProtection() != null && other.getEnableTerminationProtection().equals(this.getEnableTerminationProtection()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getNotificationArns() == null ^ this.getNotificationArns() == null)
            return false;
        if (other.getNotificationArns() != null && other.getNotificationArns().equals(this.getNotificationArns()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getStackStatus() == null ^ this.getStackStatus() == null)
            return false;
        if (other.getStackStatus() != null && other.getStackStatus().equals(this.getStackStatus()) == false)
            return false;
        if (other.getStackStatusReason() == null ^ this.getStackStatusReason() == null)
            return false;
        if (other.getStackStatusReason() != null && other.getStackStatusReason().equals(this.getStackStatusReason()) == false)
            return false;
        if (other.getTimeoutInMinutes() == null ^ this.getTimeoutInMinutes() == null)
            return false;
        if (other.getTimeoutInMinutes() != null && other.getTimeoutInMinutes().equals(this.getTimeoutInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisableRollback() == null) ? 0 : getDisableRollback().hashCode());
        hashCode = prime * hashCode + ((getDriftInformation() == null) ? 0 : getDriftInformation().hashCode());
        hashCode = prime * hashCode + ((getEnableTerminationProtection() == null) ? 0 : getEnableTerminationProtection().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getNotificationArns() == null) ? 0 : getNotificationArns().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getStackStatus() == null) ? 0 : getStackStatus().hashCode());
        hashCode = prime * hashCode + ((getStackStatusReason() == null) ? 0 : getStackStatusReason().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudFormationStackDetails clone() {
        try {
            return (AwsCloudFormationStackDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCloudFormationStackDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
