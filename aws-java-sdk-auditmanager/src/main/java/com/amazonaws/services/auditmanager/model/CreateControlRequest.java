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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateControl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateControlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the control.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the control.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The steps to follow to determine if the control has been satisfied.
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
    private java.util.List<CreateControlMappingSource> controlMappingSources;
    /**
     * <p>
     * The tags associated with the control.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the control.
     * </p>
     * 
     * @param name
     *        The name of the control.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the control.
     * </p>
     * 
     * @return The name of the control.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the control.
     * </p>
     * 
     * @param name
     *        The name of the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateControlRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the control.
     * </p>
     * 
     * @param description
     *        The description of the control.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the control.
     * </p>
     * 
     * @return The description of the control.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the control.
     * </p>
     * 
     * @param description
     *        The description of the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateControlRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The steps to follow to determine if the control has been satisfied.
     * </p>
     * 
     * @param testingInformation
     *        The steps to follow to determine if the control has been satisfied.
     */

    public void setTestingInformation(String testingInformation) {
        this.testingInformation = testingInformation;
    }

    /**
     * <p>
     * The steps to follow to determine if the control has been satisfied.
     * </p>
     * 
     * @return The steps to follow to determine if the control has been satisfied.
     */

    public String getTestingInformation() {
        return this.testingInformation;
    }

    /**
     * <p>
     * The steps to follow to determine if the control has been satisfied.
     * </p>
     * 
     * @param testingInformation
     *        The steps to follow to determine if the control has been satisfied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateControlRequest withTestingInformation(String testingInformation) {
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

    public CreateControlRequest withActionPlanTitle(String actionPlanTitle) {
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

    public CreateControlRequest withActionPlanInstructions(String actionPlanInstructions) {
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

    public java.util.List<CreateControlMappingSource> getControlMappingSources() {
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

    public void setControlMappingSources(java.util.Collection<CreateControlMappingSource> controlMappingSources) {
        if (controlMappingSources == null) {
            this.controlMappingSources = null;
            return;
        }

        this.controlMappingSources = new java.util.ArrayList<CreateControlMappingSource>(controlMappingSources);
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

    public CreateControlRequest withControlMappingSources(CreateControlMappingSource... controlMappingSources) {
        if (this.controlMappingSources == null) {
            setControlMappingSources(new java.util.ArrayList<CreateControlMappingSource>(controlMappingSources.length));
        }
        for (CreateControlMappingSource ele : controlMappingSources) {
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

    public CreateControlRequest withControlMappingSources(java.util.Collection<CreateControlMappingSource> controlMappingSources) {
        setControlMappingSources(controlMappingSources);
        return this;
    }

    /**
     * <p>
     * The tags associated with the control.
     * </p>
     * 
     * @return The tags associated with the control.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the control.
     * </p>
     * 
     * @param tags
     *        The tags associated with the control.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the control.
     * </p>
     * 
     * @param tags
     *        The tags associated with the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateControlRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateControlRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateControlRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateControlRequest clearTagsEntries() {
        this.tags = null;
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
            sb.append("ControlMappingSources: ").append(getControlMappingSources()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateControlRequest == false)
            return false;
        CreateControlRequest other = (CreateControlRequest) obj;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTestingInformation() == null) ? 0 : getTestingInformation().hashCode());
        hashCode = prime * hashCode + ((getActionPlanTitle() == null) ? 0 : getActionPlanTitle().hashCode());
        hashCode = prime * hashCode + ((getActionPlanInstructions() == null) ? 0 : getActionPlanInstructions().hashCode());
        hashCode = prime * hashCode + ((getControlMappingSources() == null) ? 0 : getControlMappingSources().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateControlRequest clone() {
        return (CreateControlRequest) super.clone();
    }

}
