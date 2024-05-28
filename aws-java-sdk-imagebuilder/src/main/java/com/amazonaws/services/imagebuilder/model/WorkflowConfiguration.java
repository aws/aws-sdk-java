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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains control settings and configurable inputs for a workflow resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/WorkflowConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource.
     * </p>
     */
    private String workflowArn;
    /**
     * <p>
     * Contains parameter values for each of the parameters that the workflow document defined for the workflow
     * resource.
     * </p>
     */
    private java.util.List<WorkflowParameter> parameters;
    /**
     * <p>
     * Test workflows are defined within named runtime groups called parallel groups. The parallel group is the named
     * group that contains this test workflow. Test workflows within a parallel group can run at the same time. Image
     * Builder starts up to five test workflows in the group at the same time, and starts additional workflows as others
     * complete, until all workflows in the group have completed. This field only applies for test workflows.
     * </p>
     */
    private String parallelGroup;
    /**
     * <p>
     * The action to take if the workflow fails.
     * </p>
     */
    private String onFailure;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource.
     * </p>
     * 
     * @param workflowArn
     *        The Amazon Resource Name (ARN) of the workflow resource.
     */

    public void setWorkflowArn(String workflowArn) {
        this.workflowArn = workflowArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the workflow resource.
     */

    public String getWorkflowArn() {
        return this.workflowArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource.
     * </p>
     * 
     * @param workflowArn
     *        The Amazon Resource Name (ARN) of the workflow resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowConfiguration withWorkflowArn(String workflowArn) {
        setWorkflowArn(workflowArn);
        return this;
    }

    /**
     * <p>
     * Contains parameter values for each of the parameters that the workflow document defined for the workflow
     * resource.
     * </p>
     * 
     * @return Contains parameter values for each of the parameters that the workflow document defined for the workflow
     *         resource.
     */

    public java.util.List<WorkflowParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Contains parameter values for each of the parameters that the workflow document defined for the workflow
     * resource.
     * </p>
     * 
     * @param parameters
     *        Contains parameter values for each of the parameters that the workflow document defined for the workflow
     *        resource.
     */

    public void setParameters(java.util.Collection<WorkflowParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<WorkflowParameter>(parameters);
    }

    /**
     * <p>
     * Contains parameter values for each of the parameters that the workflow document defined for the workflow
     * resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        Contains parameter values for each of the parameters that the workflow document defined for the workflow
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowConfiguration withParameters(WorkflowParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<WorkflowParameter>(parameters.length));
        }
        for (WorkflowParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains parameter values for each of the parameters that the workflow document defined for the workflow
     * resource.
     * </p>
     * 
     * @param parameters
     *        Contains parameter values for each of the parameters that the workflow document defined for the workflow
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowConfiguration withParameters(java.util.Collection<WorkflowParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * Test workflows are defined within named runtime groups called parallel groups. The parallel group is the named
     * group that contains this test workflow. Test workflows within a parallel group can run at the same time. Image
     * Builder starts up to five test workflows in the group at the same time, and starts additional workflows as others
     * complete, until all workflows in the group have completed. This field only applies for test workflows.
     * </p>
     * 
     * @param parallelGroup
     *        Test workflows are defined within named runtime groups called parallel groups. The parallel group is the
     *        named group that contains this test workflow. Test workflows within a parallel group can run at the same
     *        time. Image Builder starts up to five test workflows in the group at the same time, and starts additional
     *        workflows as others complete, until all workflows in the group have completed. This field only applies for
     *        test workflows.
     */

    public void setParallelGroup(String parallelGroup) {
        this.parallelGroup = parallelGroup;
    }

    /**
     * <p>
     * Test workflows are defined within named runtime groups called parallel groups. The parallel group is the named
     * group that contains this test workflow. Test workflows within a parallel group can run at the same time. Image
     * Builder starts up to five test workflows in the group at the same time, and starts additional workflows as others
     * complete, until all workflows in the group have completed. This field only applies for test workflows.
     * </p>
     * 
     * @return Test workflows are defined within named runtime groups called parallel groups. The parallel group is the
     *         named group that contains this test workflow. Test workflows within a parallel group can run at the same
     *         time. Image Builder starts up to five test workflows in the group at the same time, and starts additional
     *         workflows as others complete, until all workflows in the group have completed. This field only applies
     *         for test workflows.
     */

    public String getParallelGroup() {
        return this.parallelGroup;
    }

    /**
     * <p>
     * Test workflows are defined within named runtime groups called parallel groups. The parallel group is the named
     * group that contains this test workflow. Test workflows within a parallel group can run at the same time. Image
     * Builder starts up to five test workflows in the group at the same time, and starts additional workflows as others
     * complete, until all workflows in the group have completed. This field only applies for test workflows.
     * </p>
     * 
     * @param parallelGroup
     *        Test workflows are defined within named runtime groups called parallel groups. The parallel group is the
     *        named group that contains this test workflow. Test workflows within a parallel group can run at the same
     *        time. Image Builder starts up to five test workflows in the group at the same time, and starts additional
     *        workflows as others complete, until all workflows in the group have completed. This field only applies for
     *        test workflows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowConfiguration withParallelGroup(String parallelGroup) {
        setParallelGroup(parallelGroup);
        return this;
    }

    /**
     * <p>
     * The action to take if the workflow fails.
     * </p>
     * 
     * @param onFailure
     *        The action to take if the workflow fails.
     * @see OnWorkflowFailure
     */

    public void setOnFailure(String onFailure) {
        this.onFailure = onFailure;
    }

    /**
     * <p>
     * The action to take if the workflow fails.
     * </p>
     * 
     * @return The action to take if the workflow fails.
     * @see OnWorkflowFailure
     */

    public String getOnFailure() {
        return this.onFailure;
    }

    /**
     * <p>
     * The action to take if the workflow fails.
     * </p>
     * 
     * @param onFailure
     *        The action to take if the workflow fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnWorkflowFailure
     */

    public WorkflowConfiguration withOnFailure(String onFailure) {
        setOnFailure(onFailure);
        return this;
    }

    /**
     * <p>
     * The action to take if the workflow fails.
     * </p>
     * 
     * @param onFailure
     *        The action to take if the workflow fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnWorkflowFailure
     */

    public WorkflowConfiguration withOnFailure(OnWorkflowFailure onFailure) {
        this.onFailure = onFailure.toString();
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
        if (getWorkflowArn() != null)
            sb.append("WorkflowArn: ").append(getWorkflowArn()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getParallelGroup() != null)
            sb.append("ParallelGroup: ").append(getParallelGroup()).append(",");
        if (getOnFailure() != null)
            sb.append("OnFailure: ").append(getOnFailure());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowConfiguration == false)
            return false;
        WorkflowConfiguration other = (WorkflowConfiguration) obj;
        if (other.getWorkflowArn() == null ^ this.getWorkflowArn() == null)
            return false;
        if (other.getWorkflowArn() != null && other.getWorkflowArn().equals(this.getWorkflowArn()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getParallelGroup() == null ^ this.getParallelGroup() == null)
            return false;
        if (other.getParallelGroup() != null && other.getParallelGroup().equals(this.getParallelGroup()) == false)
            return false;
        if (other.getOnFailure() == null ^ this.getOnFailure() == null)
            return false;
        if (other.getOnFailure() != null && other.getOnFailure().equals(this.getOnFailure()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowArn() == null) ? 0 : getWorkflowArn().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getParallelGroup() == null) ? 0 : getParallelGroup().hashCode());
        hashCode = prime * hashCode + ((getOnFailure() == null) ? 0 : getOnFailure().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowConfiguration clone() {
        try {
            return (WorkflowConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.WorkflowConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
