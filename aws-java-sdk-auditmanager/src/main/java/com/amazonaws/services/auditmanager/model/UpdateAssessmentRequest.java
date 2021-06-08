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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAssessmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     */
    private String assessmentId;
    /**
     * <p>
     * The name of the specified assessment to be updated.
     * </p>
     */
    private String assessmentName;
    /**
     * <p>
     * The description of the specified assessment.
     * </p>
     */
    private String assessmentDescription;
    /**
     * <p>
     * The scope of the specified assessment.
     * </p>
     */
    private Scope scope;
    /**
     * <p>
     * The assessment report storage destination for the specified assessment that is being updated.
     * </p>
     */
    private AssessmentReportsDestination assessmentReportsDestination;
    /**
     * <p>
     * The list of roles for the specified assessment.
     * </p>
     */
    private java.util.List<Role> roles;

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @param assessmentId
     *        The identifier for the specified assessment.
     */

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @return The identifier for the specified assessment.
     */

    public String getAssessmentId() {
        return this.assessmentId;
    }

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @param assessmentId
     *        The identifier for the specified assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssessmentRequest withAssessmentId(String assessmentId) {
        setAssessmentId(assessmentId);
        return this;
    }

    /**
     * <p>
     * The name of the specified assessment to be updated.
     * </p>
     * 
     * @param assessmentName
     *        The name of the specified assessment to be updated.
     */

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    /**
     * <p>
     * The name of the specified assessment to be updated.
     * </p>
     * 
     * @return The name of the specified assessment to be updated.
     */

    public String getAssessmentName() {
        return this.assessmentName;
    }

    /**
     * <p>
     * The name of the specified assessment to be updated.
     * </p>
     * 
     * @param assessmentName
     *        The name of the specified assessment to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssessmentRequest withAssessmentName(String assessmentName) {
        setAssessmentName(assessmentName);
        return this;
    }

    /**
     * <p>
     * The description of the specified assessment.
     * </p>
     * 
     * @param assessmentDescription
     *        The description of the specified assessment.
     */

    public void setAssessmentDescription(String assessmentDescription) {
        this.assessmentDescription = assessmentDescription;
    }

    /**
     * <p>
     * The description of the specified assessment.
     * </p>
     * 
     * @return The description of the specified assessment.
     */

    public String getAssessmentDescription() {
        return this.assessmentDescription;
    }

    /**
     * <p>
     * The description of the specified assessment.
     * </p>
     * 
     * @param assessmentDescription
     *        The description of the specified assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssessmentRequest withAssessmentDescription(String assessmentDescription) {
        setAssessmentDescription(assessmentDescription);
        return this;
    }

    /**
     * <p>
     * The scope of the specified assessment.
     * </p>
     * 
     * @param scope
     *        The scope of the specified assessment.
     */

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The scope of the specified assessment.
     * </p>
     * 
     * @return The scope of the specified assessment.
     */

    public Scope getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The scope of the specified assessment.
     * </p>
     * 
     * @param scope
     *        The scope of the specified assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssessmentRequest withScope(Scope scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The assessment report storage destination for the specified assessment that is being updated.
     * </p>
     * 
     * @param assessmentReportsDestination
     *        The assessment report storage destination for the specified assessment that is being updated.
     */

    public void setAssessmentReportsDestination(AssessmentReportsDestination assessmentReportsDestination) {
        this.assessmentReportsDestination = assessmentReportsDestination;
    }

    /**
     * <p>
     * The assessment report storage destination for the specified assessment that is being updated.
     * </p>
     * 
     * @return The assessment report storage destination for the specified assessment that is being updated.
     */

    public AssessmentReportsDestination getAssessmentReportsDestination() {
        return this.assessmentReportsDestination;
    }

    /**
     * <p>
     * The assessment report storage destination for the specified assessment that is being updated.
     * </p>
     * 
     * @param assessmentReportsDestination
     *        The assessment report storage destination for the specified assessment that is being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssessmentRequest withAssessmentReportsDestination(AssessmentReportsDestination assessmentReportsDestination) {
        setAssessmentReportsDestination(assessmentReportsDestination);
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

    public UpdateAssessmentRequest withRoles(Role... roles) {
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

    public UpdateAssessmentRequest withRoles(java.util.Collection<Role> roles) {
        setRoles(roles);
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
        if (getAssessmentId() != null)
            sb.append("AssessmentId: ").append(getAssessmentId()).append(",");
        if (getAssessmentName() != null)
            sb.append("AssessmentName: ").append(getAssessmentName()).append(",");
        if (getAssessmentDescription() != null)
            sb.append("AssessmentDescription: ").append(getAssessmentDescription()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getAssessmentReportsDestination() != null)
            sb.append("AssessmentReportsDestination: ").append(getAssessmentReportsDestination()).append(",");
        if (getRoles() != null)
            sb.append("Roles: ").append(getRoles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssessmentRequest == false)
            return false;
        UpdateAssessmentRequest other = (UpdateAssessmentRequest) obj;
        if (other.getAssessmentId() == null ^ this.getAssessmentId() == null)
            return false;
        if (other.getAssessmentId() != null && other.getAssessmentId().equals(this.getAssessmentId()) == false)
            return false;
        if (other.getAssessmentName() == null ^ this.getAssessmentName() == null)
            return false;
        if (other.getAssessmentName() != null && other.getAssessmentName().equals(this.getAssessmentName()) == false)
            return false;
        if (other.getAssessmentDescription() == null ^ this.getAssessmentDescription() == null)
            return false;
        if (other.getAssessmentDescription() != null && other.getAssessmentDescription().equals(this.getAssessmentDescription()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getAssessmentReportsDestination() == null ^ this.getAssessmentReportsDestination() == null)
            return false;
        if (other.getAssessmentReportsDestination() != null && other.getAssessmentReportsDestination().equals(this.getAssessmentReportsDestination()) == false)
            return false;
        if (other.getRoles() == null ^ this.getRoles() == null)
            return false;
        if (other.getRoles() != null && other.getRoles().equals(this.getRoles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentId() == null) ? 0 : getAssessmentId().hashCode());
        hashCode = prime * hashCode + ((getAssessmentName() == null) ? 0 : getAssessmentName().hashCode());
        hashCode = prime * hashCode + ((getAssessmentDescription() == null) ? 0 : getAssessmentDescription().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getAssessmentReportsDestination() == null) ? 0 : getAssessmentReportsDestination().hashCode());
        hashCode = prime * hashCode + ((getRoles() == null) ? 0 : getRoles().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssessmentRequest clone() {
        return (UpdateAssessmentRequest) super.clone();
    }

}
