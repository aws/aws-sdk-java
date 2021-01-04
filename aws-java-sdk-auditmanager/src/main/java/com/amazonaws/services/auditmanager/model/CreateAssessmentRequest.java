/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssessmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the assessment to be created.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The optional description of the assessment to be created.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The assessment report storage destination for the specified assessment that is being created.
     * </p>
     */
    private AssessmentReportsDestination assessmentReportsDestination;

    private Scope scope;
    /**
     * <p>
     * The list of roles for the specified assessment.
     * </p>
     */
    private java.util.List<Role> roles;
    /**
     * <p>
     * The identifier for the specified framework.
     * </p>
     */
    private String frameworkId;
    /**
     * <p>
     * The tags associated with the assessment.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the assessment to be created.
     * </p>
     * 
     * @param name
     *        The name of the assessment to be created.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the assessment to be created.
     * </p>
     * 
     * @return The name of the assessment to be created.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the assessment to be created.
     * </p>
     * 
     * @param name
     *        The name of the assessment to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The optional description of the assessment to be created.
     * </p>
     * 
     * @param description
     *        The optional description of the assessment to be created.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description of the assessment to be created.
     * </p>
     * 
     * @return The optional description of the assessment to be created.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description of the assessment to be created.
     * </p>
     * 
     * @param description
     *        The optional description of the assessment to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The assessment report storage destination for the specified assessment that is being created.
     * </p>
     * 
     * @param assessmentReportsDestination
     *        The assessment report storage destination for the specified assessment that is being created.
     */

    public void setAssessmentReportsDestination(AssessmentReportsDestination assessmentReportsDestination) {
        this.assessmentReportsDestination = assessmentReportsDestination;
    }

    /**
     * <p>
     * The assessment report storage destination for the specified assessment that is being created.
     * </p>
     * 
     * @return The assessment report storage destination for the specified assessment that is being created.
     */

    public AssessmentReportsDestination getAssessmentReportsDestination() {
        return this.assessmentReportsDestination;
    }

    /**
     * <p>
     * The assessment report storage destination for the specified assessment that is being created.
     * </p>
     * 
     * @param assessmentReportsDestination
     *        The assessment report storage destination for the specified assessment that is being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentRequest withAssessmentReportsDestination(AssessmentReportsDestination assessmentReportsDestination) {
        setAssessmentReportsDestination(assessmentReportsDestination);
        return this;
    }

    /**
     * @param scope
     */

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    /**
     * @return
     */

    public Scope getScope() {
        return this.scope;
    }

    /**
     * @param scope
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentRequest withScope(Scope scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The list of roles for the specified assessment.
     * </p>
     * 
     * @return The list of roles for the specified assessment.
     */

    public java.util.List<Role> getRoles() {
        return roles;
    }

    /**
     * <p>
     * The list of roles for the specified assessment.
     * </p>
     * 
     * @param roles
     *        The list of roles for the specified assessment.
     */

    public void setRoles(java.util.Collection<Role> roles) {
        if (roles == null) {
            this.roles = null;
            return;
        }

        this.roles = new java.util.ArrayList<Role>(roles);
    }

    /**
     * <p>
     * The list of roles for the specified assessment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoles(java.util.Collection)} or {@link #withRoles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param roles
     *        The list of roles for the specified assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentRequest withRoles(Role... roles) {
        if (this.roles == null) {
            setRoles(new java.util.ArrayList<Role>(roles.length));
        }
        for (Role ele : roles) {
            this.roles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of roles for the specified assessment.
     * </p>
     * 
     * @param roles
     *        The list of roles for the specified assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentRequest withRoles(java.util.Collection<Role> roles) {
        setRoles(roles);
        return this;
    }

    /**
     * <p>
     * The identifier for the specified framework.
     * </p>
     * 
     * @param frameworkId
     *        The identifier for the specified framework.
     */

    public void setFrameworkId(String frameworkId) {
        this.frameworkId = frameworkId;
    }

    /**
     * <p>
     * The identifier for the specified framework.
     * </p>
     * 
     * @return The identifier for the specified framework.
     */

    public String getFrameworkId() {
        return this.frameworkId;
    }

    /**
     * <p>
     * The identifier for the specified framework.
     * </p>
     * 
     * @param frameworkId
     *        The identifier for the specified framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentRequest withFrameworkId(String frameworkId) {
        setFrameworkId(frameworkId);
        return this;
    }

    /**
     * <p>
     * The tags associated with the assessment.
     * </p>
     * 
     * @return The tags associated with the assessment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the assessment.
     * </p>
     * 
     * @param tags
     *        The tags associated with the assessment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the assessment.
     * </p>
     * 
     * @param tags
     *        The tags associated with the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAssessmentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentRequest addTagsEntry(String key, String value) {
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

    public CreateAssessmentRequest clearTagsEntries() {
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
        if (getAssessmentReportsDestination() != null)
            sb.append("AssessmentReportsDestination: ").append(getAssessmentReportsDestination()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getRoles() != null)
            sb.append("Roles: ").append(getRoles()).append(",");
        if (getFrameworkId() != null)
            sb.append("FrameworkId: ").append(getFrameworkId()).append(",");
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

        if (obj instanceof CreateAssessmentRequest == false)
            return false;
        CreateAssessmentRequest other = (CreateAssessmentRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAssessmentReportsDestination() == null ^ this.getAssessmentReportsDestination() == null)
            return false;
        if (other.getAssessmentReportsDestination() != null && other.getAssessmentReportsDestination().equals(this.getAssessmentReportsDestination()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getRoles() == null ^ this.getRoles() == null)
            return false;
        if (other.getRoles() != null && other.getRoles().equals(this.getRoles()) == false)
            return false;
        if (other.getFrameworkId() == null ^ this.getFrameworkId() == null)
            return false;
        if (other.getFrameworkId() != null && other.getFrameworkId().equals(this.getFrameworkId()) == false)
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
        hashCode = prime * hashCode + ((getAssessmentReportsDestination() == null) ? 0 : getAssessmentReportsDestination().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getRoles() == null) ? 0 : getRoles().hashCode());
        hashCode = prime * hashCode + ((getFrameworkId() == null) ? 0 : getFrameworkId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssessmentRequest clone() {
        return (CreateAssessmentRequest) super.clone();
    }

}
