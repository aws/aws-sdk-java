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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This represents a step in a cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/Step" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Step implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the cluster step.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the cluster step.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Hadoop job configuration of the cluster step.
     * </p>
     */
    private HadoopStepConfig config;
    /**
     * <p>
     * The action to take when the cluster step fails. Possible values are <code>TERMINATE_CLUSTER</code>,
     * <code>CANCEL_AND_WAIT</code>, and <code>CONTINUE</code>. <code>TERMINATE_JOB_FLOW</code> is provided for backward
     * compatibility. We recommend using <code>TERMINATE_CLUSTER</code> instead.
     * </p>
     * <p>
     * If a cluster's <code>StepConcurrencyLevel</code> is greater than <code>1</code>, do not use
     * <code>AddJobFlowSteps</code> to submit a step with this parameter set to <code>CANCEL_AND_WAIT</code> or
     * <code>TERMINATE_CLUSTER</code>. The step is not submitted and the action fails with a message that the
     * <code>ActionOnFailure</code> setting is not valid.
     * </p>
     * <p>
     * If you change a cluster's <code>StepConcurrencyLevel</code> to be greater than 1 while a step is running, the
     * <code>ActionOnFailure</code> parameter may not behave as you expect. In this case, for a step that fails with
     * this parameter set to <code>CANCEL_AND_WAIT</code>, pending steps and the running step are not canceled; for a
     * step that fails with this parameter set to <code>TERMINATE_CLUSTER</code>, the cluster does not terminate.
     * </p>
     */
    private String actionOnFailure;
    /**
     * <p>
     * The current execution status details of the cluster step.
     * </p>
     */
    private StepStatus status;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the runtime role for a step on the cluster. The runtime role can be a
     * cross-account IAM role. The runtime role ARN is a combination of account ID, role name, and role type using the
     * following format: <code>arn:partition:service:region:account:resource</code>.
     * </p>
     * <p>
     * For example, <code>arn:aws:iam::1234567890:role/ReadOnly</code> is a correctly formatted runtime role ARN.
     * </p>
     */
    private String executionRoleArn;

    /**
     * <p>
     * The identifier of the cluster step.
     * </p>
     * 
     * @param id
     *        The identifier of the cluster step.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the cluster step.
     * </p>
     * 
     * @return The identifier of the cluster step.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the cluster step.
     * </p>
     * 
     * @param id
     *        The identifier of the cluster step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the cluster step.
     * </p>
     * 
     * @param name
     *        The name of the cluster step.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the cluster step.
     * </p>
     * 
     * @return The name of the cluster step.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the cluster step.
     * </p>
     * 
     * @param name
     *        The name of the cluster step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Hadoop job configuration of the cluster step.
     * </p>
     * 
     * @param config
     *        The Hadoop job configuration of the cluster step.
     */

    public void setConfig(HadoopStepConfig config) {
        this.config = config;
    }

    /**
     * <p>
     * The Hadoop job configuration of the cluster step.
     * </p>
     * 
     * @return The Hadoop job configuration of the cluster step.
     */

    public HadoopStepConfig getConfig() {
        return this.config;
    }

    /**
     * <p>
     * The Hadoop job configuration of the cluster step.
     * </p>
     * 
     * @param config
     *        The Hadoop job configuration of the cluster step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withConfig(HadoopStepConfig config) {
        setConfig(config);
        return this;
    }

    /**
     * <p>
     * The action to take when the cluster step fails. Possible values are <code>TERMINATE_CLUSTER</code>,
     * <code>CANCEL_AND_WAIT</code>, and <code>CONTINUE</code>. <code>TERMINATE_JOB_FLOW</code> is provided for backward
     * compatibility. We recommend using <code>TERMINATE_CLUSTER</code> instead.
     * </p>
     * <p>
     * If a cluster's <code>StepConcurrencyLevel</code> is greater than <code>1</code>, do not use
     * <code>AddJobFlowSteps</code> to submit a step with this parameter set to <code>CANCEL_AND_WAIT</code> or
     * <code>TERMINATE_CLUSTER</code>. The step is not submitted and the action fails with a message that the
     * <code>ActionOnFailure</code> setting is not valid.
     * </p>
     * <p>
     * If you change a cluster's <code>StepConcurrencyLevel</code> to be greater than 1 while a step is running, the
     * <code>ActionOnFailure</code> parameter may not behave as you expect. In this case, for a step that fails with
     * this parameter set to <code>CANCEL_AND_WAIT</code>, pending steps and the running step are not canceled; for a
     * step that fails with this parameter set to <code>TERMINATE_CLUSTER</code>, the cluster does not terminate.
     * </p>
     * 
     * @param actionOnFailure
     *        The action to take when the cluster step fails. Possible values are <code>TERMINATE_CLUSTER</code>,
     *        <code>CANCEL_AND_WAIT</code>, and <code>CONTINUE</code>. <code>TERMINATE_JOB_FLOW</code> is provided for
     *        backward compatibility. We recommend using <code>TERMINATE_CLUSTER</code> instead.</p>
     *        <p>
     *        If a cluster's <code>StepConcurrencyLevel</code> is greater than <code>1</code>, do not use
     *        <code>AddJobFlowSteps</code> to submit a step with this parameter set to <code>CANCEL_AND_WAIT</code> or
     *        <code>TERMINATE_CLUSTER</code>. The step is not submitted and the action fails with a message that the
     *        <code>ActionOnFailure</code> setting is not valid.
     *        </p>
     *        <p>
     *        If you change a cluster's <code>StepConcurrencyLevel</code> to be greater than 1 while a step is running,
     *        the <code>ActionOnFailure</code> parameter may not behave as you expect. In this case, for a step that
     *        fails with this parameter set to <code>CANCEL_AND_WAIT</code>, pending steps and the running step are not
     *        canceled; for a step that fails with this parameter set to <code>TERMINATE_CLUSTER</code>, the cluster
     *        does not terminate.
     * @see ActionOnFailure
     */

    public void setActionOnFailure(String actionOnFailure) {
        this.actionOnFailure = actionOnFailure;
    }

    /**
     * <p>
     * The action to take when the cluster step fails. Possible values are <code>TERMINATE_CLUSTER</code>,
     * <code>CANCEL_AND_WAIT</code>, and <code>CONTINUE</code>. <code>TERMINATE_JOB_FLOW</code> is provided for backward
     * compatibility. We recommend using <code>TERMINATE_CLUSTER</code> instead.
     * </p>
     * <p>
     * If a cluster's <code>StepConcurrencyLevel</code> is greater than <code>1</code>, do not use
     * <code>AddJobFlowSteps</code> to submit a step with this parameter set to <code>CANCEL_AND_WAIT</code> or
     * <code>TERMINATE_CLUSTER</code>. The step is not submitted and the action fails with a message that the
     * <code>ActionOnFailure</code> setting is not valid.
     * </p>
     * <p>
     * If you change a cluster's <code>StepConcurrencyLevel</code> to be greater than 1 while a step is running, the
     * <code>ActionOnFailure</code> parameter may not behave as you expect. In this case, for a step that fails with
     * this parameter set to <code>CANCEL_AND_WAIT</code>, pending steps and the running step are not canceled; for a
     * step that fails with this parameter set to <code>TERMINATE_CLUSTER</code>, the cluster does not terminate.
     * </p>
     * 
     * @return The action to take when the cluster step fails. Possible values are <code>TERMINATE_CLUSTER</code>,
     *         <code>CANCEL_AND_WAIT</code>, and <code>CONTINUE</code>. <code>TERMINATE_JOB_FLOW</code> is provided for
     *         backward compatibility. We recommend using <code>TERMINATE_CLUSTER</code> instead.</p>
     *         <p>
     *         If a cluster's <code>StepConcurrencyLevel</code> is greater than <code>1</code>, do not use
     *         <code>AddJobFlowSteps</code> to submit a step with this parameter set to <code>CANCEL_AND_WAIT</code> or
     *         <code>TERMINATE_CLUSTER</code>. The step is not submitted and the action fails with a message that the
     *         <code>ActionOnFailure</code> setting is not valid.
     *         </p>
     *         <p>
     *         If you change a cluster's <code>StepConcurrencyLevel</code> to be greater than 1 while a step is running,
     *         the <code>ActionOnFailure</code> parameter may not behave as you expect. In this case, for a step that
     *         fails with this parameter set to <code>CANCEL_AND_WAIT</code>, pending steps and the running step are not
     *         canceled; for a step that fails with this parameter set to <code>TERMINATE_CLUSTER</code>, the cluster
     *         does not terminate.
     * @see ActionOnFailure
     */

    public String getActionOnFailure() {
        return this.actionOnFailure;
    }

    /**
     * <p>
     * The action to take when the cluster step fails. Possible values are <code>TERMINATE_CLUSTER</code>,
     * <code>CANCEL_AND_WAIT</code>, and <code>CONTINUE</code>. <code>TERMINATE_JOB_FLOW</code> is provided for backward
     * compatibility. We recommend using <code>TERMINATE_CLUSTER</code> instead.
     * </p>
     * <p>
     * If a cluster's <code>StepConcurrencyLevel</code> is greater than <code>1</code>, do not use
     * <code>AddJobFlowSteps</code> to submit a step with this parameter set to <code>CANCEL_AND_WAIT</code> or
     * <code>TERMINATE_CLUSTER</code>. The step is not submitted and the action fails with a message that the
     * <code>ActionOnFailure</code> setting is not valid.
     * </p>
     * <p>
     * If you change a cluster's <code>StepConcurrencyLevel</code> to be greater than 1 while a step is running, the
     * <code>ActionOnFailure</code> parameter may not behave as you expect. In this case, for a step that fails with
     * this parameter set to <code>CANCEL_AND_WAIT</code>, pending steps and the running step are not canceled; for a
     * step that fails with this parameter set to <code>TERMINATE_CLUSTER</code>, the cluster does not terminate.
     * </p>
     * 
     * @param actionOnFailure
     *        The action to take when the cluster step fails. Possible values are <code>TERMINATE_CLUSTER</code>,
     *        <code>CANCEL_AND_WAIT</code>, and <code>CONTINUE</code>. <code>TERMINATE_JOB_FLOW</code> is provided for
     *        backward compatibility. We recommend using <code>TERMINATE_CLUSTER</code> instead.</p>
     *        <p>
     *        If a cluster's <code>StepConcurrencyLevel</code> is greater than <code>1</code>, do not use
     *        <code>AddJobFlowSteps</code> to submit a step with this parameter set to <code>CANCEL_AND_WAIT</code> or
     *        <code>TERMINATE_CLUSTER</code>. The step is not submitted and the action fails with a message that the
     *        <code>ActionOnFailure</code> setting is not valid.
     *        </p>
     *        <p>
     *        If you change a cluster's <code>StepConcurrencyLevel</code> to be greater than 1 while a step is running,
     *        the <code>ActionOnFailure</code> parameter may not behave as you expect. In this case, for a step that
     *        fails with this parameter set to <code>CANCEL_AND_WAIT</code>, pending steps and the running step are not
     *        canceled; for a step that fails with this parameter set to <code>TERMINATE_CLUSTER</code>, the cluster
     *        does not terminate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionOnFailure
     */

    public Step withActionOnFailure(String actionOnFailure) {
        setActionOnFailure(actionOnFailure);
        return this;
    }

    /**
     * <p>
     * The action to take when the cluster step fails. Possible values are <code>TERMINATE_CLUSTER</code>,
     * <code>CANCEL_AND_WAIT</code>, and <code>CONTINUE</code>. <code>TERMINATE_JOB_FLOW</code> is provided for backward
     * compatibility. We recommend using <code>TERMINATE_CLUSTER</code> instead.
     * </p>
     * <p>
     * If a cluster's <code>StepConcurrencyLevel</code> is greater than <code>1</code>, do not use
     * <code>AddJobFlowSteps</code> to submit a step with this parameter set to <code>CANCEL_AND_WAIT</code> or
     * <code>TERMINATE_CLUSTER</code>. The step is not submitted and the action fails with a message that the
     * <code>ActionOnFailure</code> setting is not valid.
     * </p>
     * <p>
     * If you change a cluster's <code>StepConcurrencyLevel</code> to be greater than 1 while a step is running, the
     * <code>ActionOnFailure</code> parameter may not behave as you expect. In this case, for a step that fails with
     * this parameter set to <code>CANCEL_AND_WAIT</code>, pending steps and the running step are not canceled; for a
     * step that fails with this parameter set to <code>TERMINATE_CLUSTER</code>, the cluster does not terminate.
     * </p>
     * 
     * @param actionOnFailure
     *        The action to take when the cluster step fails. Possible values are <code>TERMINATE_CLUSTER</code>,
     *        <code>CANCEL_AND_WAIT</code>, and <code>CONTINUE</code>. <code>TERMINATE_JOB_FLOW</code> is provided for
     *        backward compatibility. We recommend using <code>TERMINATE_CLUSTER</code> instead.</p>
     *        <p>
     *        If a cluster's <code>StepConcurrencyLevel</code> is greater than <code>1</code>, do not use
     *        <code>AddJobFlowSteps</code> to submit a step with this parameter set to <code>CANCEL_AND_WAIT</code> or
     *        <code>TERMINATE_CLUSTER</code>. The step is not submitted and the action fails with a message that the
     *        <code>ActionOnFailure</code> setting is not valid.
     *        </p>
     *        <p>
     *        If you change a cluster's <code>StepConcurrencyLevel</code> to be greater than 1 while a step is running,
     *        the <code>ActionOnFailure</code> parameter may not behave as you expect. In this case, for a step that
     *        fails with this parameter set to <code>CANCEL_AND_WAIT</code>, pending steps and the running step are not
     *        canceled; for a step that fails with this parameter set to <code>TERMINATE_CLUSTER</code>, the cluster
     *        does not terminate.
     * @see ActionOnFailure
     */

    public void setActionOnFailure(ActionOnFailure actionOnFailure) {
        withActionOnFailure(actionOnFailure);
    }

    /**
     * <p>
     * The action to take when the cluster step fails. Possible values are <code>TERMINATE_CLUSTER</code>,
     * <code>CANCEL_AND_WAIT</code>, and <code>CONTINUE</code>. <code>TERMINATE_JOB_FLOW</code> is provided for backward
     * compatibility. We recommend using <code>TERMINATE_CLUSTER</code> instead.
     * </p>
     * <p>
     * If a cluster's <code>StepConcurrencyLevel</code> is greater than <code>1</code>, do not use
     * <code>AddJobFlowSteps</code> to submit a step with this parameter set to <code>CANCEL_AND_WAIT</code> or
     * <code>TERMINATE_CLUSTER</code>. The step is not submitted and the action fails with a message that the
     * <code>ActionOnFailure</code> setting is not valid.
     * </p>
     * <p>
     * If you change a cluster's <code>StepConcurrencyLevel</code> to be greater than 1 while a step is running, the
     * <code>ActionOnFailure</code> parameter may not behave as you expect. In this case, for a step that fails with
     * this parameter set to <code>CANCEL_AND_WAIT</code>, pending steps and the running step are not canceled; for a
     * step that fails with this parameter set to <code>TERMINATE_CLUSTER</code>, the cluster does not terminate.
     * </p>
     * 
     * @param actionOnFailure
     *        The action to take when the cluster step fails. Possible values are <code>TERMINATE_CLUSTER</code>,
     *        <code>CANCEL_AND_WAIT</code>, and <code>CONTINUE</code>. <code>TERMINATE_JOB_FLOW</code> is provided for
     *        backward compatibility. We recommend using <code>TERMINATE_CLUSTER</code> instead.</p>
     *        <p>
     *        If a cluster's <code>StepConcurrencyLevel</code> is greater than <code>1</code>, do not use
     *        <code>AddJobFlowSteps</code> to submit a step with this parameter set to <code>CANCEL_AND_WAIT</code> or
     *        <code>TERMINATE_CLUSTER</code>. The step is not submitted and the action fails with a message that the
     *        <code>ActionOnFailure</code> setting is not valid.
     *        </p>
     *        <p>
     *        If you change a cluster's <code>StepConcurrencyLevel</code> to be greater than 1 while a step is running,
     *        the <code>ActionOnFailure</code> parameter may not behave as you expect. In this case, for a step that
     *        fails with this parameter set to <code>CANCEL_AND_WAIT</code>, pending steps and the running step are not
     *        canceled; for a step that fails with this parameter set to <code>TERMINATE_CLUSTER</code>, the cluster
     *        does not terminate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionOnFailure
     */

    public Step withActionOnFailure(ActionOnFailure actionOnFailure) {
        this.actionOnFailure = actionOnFailure.toString();
        return this;
    }

    /**
     * <p>
     * The current execution status details of the cluster step.
     * </p>
     * 
     * @param status
     *        The current execution status details of the cluster step.
     */

    public void setStatus(StepStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current execution status details of the cluster step.
     * </p>
     * 
     * @return The current execution status details of the cluster step.
     */

    public StepStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current execution status details of the cluster step.
     * </p>
     * 
     * @param status
     *        The current execution status details of the cluster step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withStatus(StepStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the runtime role for a step on the cluster. The runtime role can be a
     * cross-account IAM role. The runtime role ARN is a combination of account ID, role name, and role type using the
     * following format: <code>arn:partition:service:region:account:resource</code>.
     * </p>
     * <p>
     * For example, <code>arn:aws:iam::1234567890:role/ReadOnly</code> is a correctly formatted runtime role ARN.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the runtime role for a step on the cluster. The runtime role can be a
     *        cross-account IAM role. The runtime role ARN is a combination of account ID, role name, and role type
     *        using the following format: <code>arn:partition:service:region:account:resource</code>. </p>
     *        <p>
     *        For example, <code>arn:aws:iam::1234567890:role/ReadOnly</code> is a correctly formatted runtime role ARN.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the runtime role for a step on the cluster. The runtime role can be a
     * cross-account IAM role. The runtime role ARN is a combination of account ID, role name, and role type using the
     * following format: <code>arn:partition:service:region:account:resource</code>.
     * </p>
     * <p>
     * For example, <code>arn:aws:iam::1234567890:role/ReadOnly</code> is a correctly formatted runtime role ARN.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the runtime role for a step on the cluster. The runtime role can be a
     *         cross-account IAM role. The runtime role ARN is a combination of account ID, role name, and role type
     *         using the following format: <code>arn:partition:service:region:account:resource</code>. </p>
     *         <p>
     *         For example, <code>arn:aws:iam::1234567890:role/ReadOnly</code> is a correctly formatted runtime role
     *         ARN.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the runtime role for a step on the cluster. The runtime role can be a
     * cross-account IAM role. The runtime role ARN is a combination of account ID, role name, and role type using the
     * following format: <code>arn:partition:service:region:account:resource</code>.
     * </p>
     * <p>
     * For example, <code>arn:aws:iam::1234567890:role/ReadOnly</code> is a correctly formatted runtime role ARN.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the runtime role for a step on the cluster. The runtime role can be a
     *        cross-account IAM role. The runtime role ARN is a combination of account ID, role name, and role type
     *        using the following format: <code>arn:partition:service:region:account:resource</code>. </p>
     *        <p>
     *        For example, <code>arn:aws:iam::1234567890:role/ReadOnly</code> is a correctly formatted runtime role ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Step withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getConfig() != null)
            sb.append("Config: ").append(getConfig()).append(",");
        if (getActionOnFailure() != null)
            sb.append("ActionOnFailure: ").append(getActionOnFailure()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Step == false)
            return false;
        Step other = (Step) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
            return false;
        if (other.getActionOnFailure() == null ^ this.getActionOnFailure() == null)
            return false;
        if (other.getActionOnFailure() != null && other.getActionOnFailure().equals(this.getActionOnFailure()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode());
        hashCode = prime * hashCode + ((getActionOnFailure() == null) ? 0 : getActionOnFailure().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public Step clone() {
        try {
            return (Step) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.StepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
