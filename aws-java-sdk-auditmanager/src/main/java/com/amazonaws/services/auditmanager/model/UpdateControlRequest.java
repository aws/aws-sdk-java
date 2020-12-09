/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateControl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateControlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     */
    private String controlId;
    /**
     * <p>
     * The name of the control to be updated.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The optional description of the control.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The steps that to follow to determine if the control has been satisfied.
     * </p>
     */
    private String testingInformation;
    /**
     * <p>
     * The title of the action plan for remediating the control.
     * </p>
     */
    private String actionPlanTitle;
    /**
     * <p>
     * The recommended actions to carry out if the control is not fulfilled.
     * </p>
     */
    private String actionPlanInstructions;
    /**
     * <p>
     * The data source that determines from where AWS Audit Manager collects evidence for the control.
     * </p>
     */
    private java.util.List<ControlMappingSource> controlMappingSources;

    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     * 
     * @param controlId
     *        The identifier for the specified control.
     */

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     * 
     * @return The identifier for the specified control.
     */

    public String getControlId() {
        return this.controlId;
    }

    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     * 
     * @param controlId
     *        The identifier for the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateControlRequest withControlId(String controlId) {
        setControlId(controlId);
        return this;
    }

    /**
     * <p>
     * The name of the control to be updated.
     * </p>
     * 
     * @param name
     *        The name of the control to be updated.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the control to be updated.
     * </p>
     * 
     * @return The name of the control to be updated.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the control to be updated.
     * </p>
     * 
     * @param name
     *        The name of the control to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateControlRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The optional description of the control.
     * </p>
     * 
     * @param description
     *        The optional description of the control.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description of the control.
     * </p>
     * 
     * @return The optional description of the control.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description of the control.
     * </p>
     * 
     * @param description
     *        The optional description of the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateControlRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The steps that to follow to determine if the control has been satisfied.
     * </p>
     * 
     * @param testingInformation
     *        The steps that to follow to determine if the control has been satisfied.
     */

    public void setTestingInformation(String testingInformation) {
        this.testingInformation = testingInformation;
    }

    /**
     * <p>
     * The steps that to follow to determine if the control has been satisfied.
     * </p>
     * 
     * @return The steps that to follow to determine if the control has been satisfied.
     */

    public String getTestingInformation() {
        return this.testingInformation;
    }

    /**
     * <p>
     * The steps that to follow to determine if the control has been satisfied.
     * </p>
     * 
     * @param testingInformation
     *        The steps that to follow to determine if the control has been satisfied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateControlRequest withTestingInformation(String testingInformation) {
        setTestingInformation(testingInformation);
        return this;
    }

    /**
     * <p>
     * The title of the action plan for remediating the control.
     * </p>
     * 
     * @param actionPlanTitle
     *        The title of the action plan for remediating the control.
     */

    public void setActionPlanTitle(String actionPlanTitle) {
        this.actionPlanTitle = actionPlanTitle;
    }

    /**
     * <p>
     * The title of the action plan for remediating the control.
     * </p>
     * 
     * @return The title of the action plan for remediating the control.
     */

    public String getActionPlanTitle() {
        return this.actionPlanTitle;
    }

    /**
     * <p>
     * The title of the action plan for remediating the control.
     * </p>
     * 
     * @param actionPlanTitle
     *        The title of the action plan for remediating the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateControlRequest withActionPlanTitle(String actionPlanTitle) {
        setActionPlanTitle(actionPlanTitle);
        return this;
    }

    /**
     * <p>
     * The recommended actions to carry out if the control is not fulfilled.
     * </p>
     * 
     * @param actionPlanInstructions
     *        The recommended actions to carry out if the control is not fulfilled.
     */

    public void setActionPlanInstructions(String actionPlanInstructions) {
        this.actionPlanInstructions = actionPlanInstructions;
    }

    /**
     * <p>
     * The recommended actions to carry out if the control is not fulfilled.
     * </p>
     * 
     * @return The recommended actions to carry out if the control is not fulfilled.
     */

    public String getActionPlanInstructions() {
        return this.actionPlanInstructions;
    }

    /**
     * <p>
     * The recommended actions to carry out if the control is not fulfilled.
     * </p>
     * 
     * @param actionPlanInstructions
     *        The recommended actions to carry out if the control is not fulfilled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateControlRequest withActionPlanInstructions(String actionPlanInstructions) {
        setActionPlanInstructions(actionPlanInstructions);
        return this;
    }

    /**
     * <p>
     * The data source that determines from where AWS Audit Manager collects evidence for the control.
     * </p>
     * 
     * @return The data source that determines from where AWS Audit Manager collects evidence for the control.
     */

    public java.util.List<ControlMappingSource> getControlMappingSources() {
        return controlMappingSources;
    }

    /**
     * <p>
     * The data source that determines from where AWS Audit Manager collects evidence for the control.
     * </p>
     * 
     * @param controlMappingSources
     *        The data source that determines from where AWS Audit Manager collects evidence for the control.
     */

    public void setControlMappingSources(java.util.Collection<ControlMappingSource> controlMappingSources) {
        if (controlMappingSources == null) {
            this.controlMappingSources = null;
            return;
        }

        this.controlMappingSources = new java.util.ArrayList<ControlMappingSource>(controlMappingSources);
    }

    /**
     * <p>
     * The data source that determines from where AWS Audit Manager collects evidence for the control.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setControlMappingSources(java.util.Collection)} or
     * {@link #withControlMappingSources(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param controlMappingSources
     *        The data source that determines from where AWS Audit Manager collects evidence for the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateControlRequest withControlMappingSources(ControlMappingSource... controlMappingSources) {
        if (this.controlMappingSources == null) {
            setControlMappingSources(new java.util.ArrayList<ControlMappingSource>(controlMappingSources.length));
        }
        for (ControlMappingSource ele : controlMappingSources) {
            this.controlMappingSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data source that determines from where AWS Audit Manager collects evidence for the control.
     * </p>
     * 
     * @param controlMappingSources
     *        The data source that determines from where AWS Audit Manager collects evidence for the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateControlRequest withControlMappingSources(java.util.Collection<ControlMappingSource> controlMappingSources) {
        setControlMappingSources(controlMappingSources);
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
        if (getControlId() != null)
            sb.append("ControlId: ").append(getControlId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTestingInformation() != null)
            sb.append("TestingInformation: ").append(getTestingInformation()).append(",");
        if (getActionPlanTitle() != null)
            sb.append("ActionPlanTitle: ").append(getActionPlanTitle()).append(",");
        if (getActionPlanInstructions() != null)
            sb.append("ActionPlanInstructions: ").append(getActionPlanInstructions()).append(",");
        if (getControlMappingSources() != null)
            sb.append("ControlMappingSources: ").append(getControlMappingSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateControlRequest == false)
            return false;
        UpdateControlRequest other = (UpdateControlRequest) obj;
        if (other.getControlId() == null ^ this.getControlId() == null)
            return false;
        if (other.getControlId() != null && other.getControlId().equals(this.getControlId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTestingInformation() == null ^ this.getTestingInformation() == null)
            return false;
        if (other.getTestingInformation() != null && other.getTestingInformation().equals(this.getTestingInformation()) == false)
            return false;
        if (other.getActionPlanTitle() == null ^ this.getActionPlanTitle() == null)
            return false;
        if (other.getActionPlanTitle() != null && other.getActionPlanTitle().equals(this.getActionPlanTitle()) == false)
            return false;
        if (other.getActionPlanInstructions() == null ^ this.getActionPlanInstructions() == null)
            return false;
        if (other.getActionPlanInstructions() != null && other.getActionPlanInstructions().equals(this.getActionPlanInstructions()) == false)
            return false;
        if (other.getControlMappingSources() == null ^ this.getControlMappingSources() == null)
            return false;
        if (other.getControlMappingSources() != null && other.getControlMappingSources().equals(this.getControlMappingSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControlId() == null) ? 0 : getControlId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTestingInformation() == null) ? 0 : getTestingInformation().hashCode());
        hashCode = prime * hashCode + ((getActionPlanTitle() == null) ? 0 : getActionPlanTitle().hashCode());
        hashCode = prime * hashCode + ((getActionPlanInstructions() == null) ? 0 : getActionPlanInstructions().hashCode());
        hashCode = prime * hashCode + ((getControlMappingSources() == null) ? 0 : getControlMappingSources().hashCode());
        return hashCode;
    }

    @Override
    public UpdateControlRequest clone() {
        return (UpdateControlRequest) super.clone();
    }

}
