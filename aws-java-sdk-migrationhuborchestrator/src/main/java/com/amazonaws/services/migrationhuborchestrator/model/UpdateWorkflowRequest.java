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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UpdateWorkflow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkflowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the migration workflow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The input parameters required to update a migration workflow.
     * </p>
     */
    private java.util.Map<String, StepInput> inputParameters;
    /**
     * <p>
     * The servers on which a step will be run.
     * </p>
     */
    private java.util.List<String> stepTargets;

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     * 
     * @param id
     *        The ID of the migration workflow.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     * 
     * @return The ID of the migration workflow.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     * 
     * @param id
     *        The ID of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     * 
     * @param name
     *        The name of the migration workflow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     * 
     * @return The name of the migration workflow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the migration workflow.
     * </p>
     * 
     * @param name
     *        The name of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the migration workflow.
     * </p>
     * 
     * @param description
     *        The description of the migration workflow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the migration workflow.
     * </p>
     * 
     * @return The description of the migration workflow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the migration workflow.
     * </p>
     * 
     * @param description
     *        The description of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The input parameters required to update a migration workflow.
     * </p>
     * 
     * @return The input parameters required to update a migration workflow.
     */

    public java.util.Map<String, StepInput> getInputParameters() {
        return inputParameters;
    }

    /**
     * <p>
     * The input parameters required to update a migration workflow.
     * </p>
     * 
     * @param inputParameters
     *        The input parameters required to update a migration workflow.
     */

    public void setInputParameters(java.util.Map<String, StepInput> inputParameters) {
        this.inputParameters = inputParameters;
    }

    /**
     * <p>
     * The input parameters required to update a migration workflow.
     * </p>
     * 
     * @param inputParameters
     *        The input parameters required to update a migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowRequest withInputParameters(java.util.Map<String, StepInput> inputParameters) {
        setInputParameters(inputParameters);
        return this;
    }

    /**
     * Add a single InputParameters entry
     *
     * @see UpdateWorkflowRequest#withInputParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowRequest addInputParametersEntry(String key, StepInput value) {
        if (null == this.inputParameters) {
            this.inputParameters = new java.util.HashMap<String, StepInput>();
        }
        if (this.inputParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.inputParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into InputParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowRequest clearInputParametersEntries() {
        this.inputParameters = null;
        return this;
    }

    /**
     * <p>
     * The servers on which a step will be run.
     * </p>
     * 
     * @return The servers on which a step will be run.
     */

    public java.util.List<String> getStepTargets() {
        return stepTargets;
    }

    /**
     * <p>
     * The servers on which a step will be run.
     * </p>
     * 
     * @param stepTargets
     *        The servers on which a step will be run.
     */

    public void setStepTargets(java.util.Collection<String> stepTargets) {
        if (stepTargets == null) {
            this.stepTargets = null;
            return;
        }

        this.stepTargets = new java.util.ArrayList<String>(stepTargets);
    }

    /**
     * <p>
     * The servers on which a step will be run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStepTargets(java.util.Collection)} or {@link #withStepTargets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stepTargets
     *        The servers on which a step will be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowRequest withStepTargets(String... stepTargets) {
        if (this.stepTargets == null) {
            setStepTargets(new java.util.ArrayList<String>(stepTargets.length));
        }
        for (String ele : stepTargets) {
            this.stepTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The servers on which a step will be run.
     * </p>
     * 
     * @param stepTargets
     *        The servers on which a step will be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowRequest withStepTargets(java.util.Collection<String> stepTargets) {
        setStepTargets(stepTargets);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInputParameters() != null)
            sb.append("InputParameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getStepTargets() != null)
            sb.append("StepTargets: ").append(getStepTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkflowRequest == false)
            return false;
        UpdateWorkflowRequest other = (UpdateWorkflowRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInputParameters() == null ^ this.getInputParameters() == null)
            return false;
        if (other.getInputParameters() != null && other.getInputParameters().equals(this.getInputParameters()) == false)
            return false;
        if (other.getStepTargets() == null ^ this.getStepTargets() == null)
            return false;
        if (other.getStepTargets() != null && other.getStepTargets().equals(this.getStepTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInputParameters() == null) ? 0 : getInputParameters().hashCode());
        hashCode = prime * hashCode + ((getStepTargets() == null) ? 0 : getStepTargets().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkflowRequest clone() {
        return (UpdateWorkflowRequest) super.clone();
    }

}
