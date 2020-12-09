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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a set of controls in an AWS Audit Manager assessment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/AssessmentControlSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentControlSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the control set in the assessment. This is the control set name in a plain string format.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The description for the control set.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies the current status of the control set.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The roles associated with the control set.
     * </p>
     */
    private java.util.List<Role> roles;
    /**
     * <p>
     * The list of controls contained with the control set.
     * </p>
     */
    private java.util.List<AssessmentControl> controls;
    /**
     * <p>
     * The delegations associated with the control set.
     * </p>
     */
    private java.util.List<Delegation> delegations;
    /**
     * <p>
     * The total number of evidence objects retrieved automatically for the control set.
     * </p>
     */
    private Integer systemEvidenceCount;
    /**
     * <p>
     * The total number of evidence objects uploaded manually to the control set.
     * </p>
     */
    private Integer manualEvidenceCount;

    /**
     * <p>
     * The identifier of the control set in the assessment. This is the control set name in a plain string format.
     * </p>
     * 
     * @param id
     *        The identifier of the control set in the assessment. This is the control set name in a plain string
     *        format.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the control set in the assessment. This is the control set name in a plain string format.
     * </p>
     * 
     * @return The identifier of the control set in the assessment. This is the control set name in a plain string
     *         format.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the control set in the assessment. This is the control set name in a plain string format.
     * </p>
     * 
     * @param id
     *        The identifier of the control set in the assessment. This is the control set name in a plain string
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControlSet withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The description for the control set.
     * </p>
     * 
     * @param description
     *        The description for the control set.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the control set.
     * </p>
     * 
     * @return The description for the control set.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the control set.
     * </p>
     * 
     * @param description
     *        The description for the control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControlSet withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies the current status of the control set.
     * </p>
     * 
     * @param status
     *        Specifies the current status of the control set.
     * @see ControlSetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the current status of the control set.
     * </p>
     * 
     * @return Specifies the current status of the control set.
     * @see ControlSetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the current status of the control set.
     * </p>
     * 
     * @param status
     *        Specifies the current status of the control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlSetStatus
     */

    public AssessmentControlSet withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the current status of the control set.
     * </p>
     * 
     * @param status
     *        Specifies the current status of the control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlSetStatus
     */

    public AssessmentControlSet withStatus(ControlSetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The roles associated with the control set.
     * </p>
     * 
     * @return The roles associated with the control set.
     */

    public java.util.List<Role> getRoles() {
        return roles;
    }

    /**
     * <p>
     * The roles associated with the control set.
     * </p>
     * 
     * @param roles
     *        The roles associated with the control set.
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
     * The roles associated with the control set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoles(java.util.Collection)} or {@link #withRoles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param roles
     *        The roles associated with the control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControlSet withRoles(Role... roles) {
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
     * The roles associated with the control set.
     * </p>
     * 
     * @param roles
     *        The roles associated with the control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControlSet withRoles(java.util.Collection<Role> roles) {
        setRoles(roles);
        return this;
    }

    /**
     * <p>
     * The list of controls contained with the control set.
     * </p>
     * 
     * @return The list of controls contained with the control set.
     */

    public java.util.List<AssessmentControl> getControls() {
        return controls;
    }

    /**
     * <p>
     * The list of controls contained with the control set.
     * </p>
     * 
     * @param controls
     *        The list of controls contained with the control set.
     */

    public void setControls(java.util.Collection<AssessmentControl> controls) {
        if (controls == null) {
            this.controls = null;
            return;
        }

        this.controls = new java.util.ArrayList<AssessmentControl>(controls);
    }

    /**
     * <p>
     * The list of controls contained with the control set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setControls(java.util.Collection)} or {@link #withControls(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param controls
     *        The list of controls contained with the control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControlSet withControls(AssessmentControl... controls) {
        if (this.controls == null) {
            setControls(new java.util.ArrayList<AssessmentControl>(controls.length));
        }
        for (AssessmentControl ele : controls) {
            this.controls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of controls contained with the control set.
     * </p>
     * 
     * @param controls
     *        The list of controls contained with the control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControlSet withControls(java.util.Collection<AssessmentControl> controls) {
        setControls(controls);
        return this;
    }

    /**
     * <p>
     * The delegations associated with the control set.
     * </p>
     * 
     * @return The delegations associated with the control set.
     */

    public java.util.List<Delegation> getDelegations() {
        return delegations;
    }

    /**
     * <p>
     * The delegations associated with the control set.
     * </p>
     * 
     * @param delegations
     *        The delegations associated with the control set.
     */

    public void setDelegations(java.util.Collection<Delegation> delegations) {
        if (delegations == null) {
            this.delegations = null;
            return;
        }

        this.delegations = new java.util.ArrayList<Delegation>(delegations);
    }

    /**
     * <p>
     * The delegations associated with the control set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDelegations(java.util.Collection)} or {@link #withDelegations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param delegations
     *        The delegations associated with the control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControlSet withDelegations(Delegation... delegations) {
        if (this.delegations == null) {
            setDelegations(new java.util.ArrayList<Delegation>(delegations.length));
        }
        for (Delegation ele : delegations) {
            this.delegations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The delegations associated with the control set.
     * </p>
     * 
     * @param delegations
     *        The delegations associated with the control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControlSet withDelegations(java.util.Collection<Delegation> delegations) {
        setDelegations(delegations);
        return this;
    }

    /**
     * <p>
     * The total number of evidence objects retrieved automatically for the control set.
     * </p>
     * 
     * @param systemEvidenceCount
     *        The total number of evidence objects retrieved automatically for the control set.
     */

    public void setSystemEvidenceCount(Integer systemEvidenceCount) {
        this.systemEvidenceCount = systemEvidenceCount;
    }

    /**
     * <p>
     * The total number of evidence objects retrieved automatically for the control set.
     * </p>
     * 
     * @return The total number of evidence objects retrieved automatically for the control set.
     */

    public Integer getSystemEvidenceCount() {
        return this.systemEvidenceCount;
    }

    /**
     * <p>
     * The total number of evidence objects retrieved automatically for the control set.
     * </p>
     * 
     * @param systemEvidenceCount
     *        The total number of evidence objects retrieved automatically for the control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControlSet withSystemEvidenceCount(Integer systemEvidenceCount) {
        setSystemEvidenceCount(systemEvidenceCount);
        return this;
    }

    /**
     * <p>
     * The total number of evidence objects uploaded manually to the control set.
     * </p>
     * 
     * @param manualEvidenceCount
     *        The total number of evidence objects uploaded manually to the control set.
     */

    public void setManualEvidenceCount(Integer manualEvidenceCount) {
        this.manualEvidenceCount = manualEvidenceCount;
    }

    /**
     * <p>
     * The total number of evidence objects uploaded manually to the control set.
     * </p>
     * 
     * @return The total number of evidence objects uploaded manually to the control set.
     */

    public Integer getManualEvidenceCount() {
        return this.manualEvidenceCount;
    }

    /**
     * <p>
     * The total number of evidence objects uploaded manually to the control set.
     * </p>
     * 
     * @param manualEvidenceCount
     *        The total number of evidence objects uploaded manually to the control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControlSet withManualEvidenceCount(Integer manualEvidenceCount) {
        setManualEvidenceCount(manualEvidenceCount);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRoles() != null)
            sb.append("Roles: ").append(getRoles()).append(",");
        if (getControls() != null)
            sb.append("Controls: ").append(getControls()).append(",");
        if (getDelegations() != null)
            sb.append("Delegations: ").append(getDelegations()).append(",");
        if (getSystemEvidenceCount() != null)
            sb.append("SystemEvidenceCount: ").append(getSystemEvidenceCount()).append(",");
        if (getManualEvidenceCount() != null)
            sb.append("ManualEvidenceCount: ").append(getManualEvidenceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentControlSet == false)
            return false;
        AssessmentControlSet other = (AssessmentControlSet) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRoles() == null ^ this.getRoles() == null)
            return false;
        if (other.getRoles() != null && other.getRoles().equals(this.getRoles()) == false)
            return false;
        if (other.getControls() == null ^ this.getControls() == null)
            return false;
        if (other.getControls() != null && other.getControls().equals(this.getControls()) == false)
            return false;
        if (other.getDelegations() == null ^ this.getDelegations() == null)
            return false;
        if (other.getDelegations() != null && other.getDelegations().equals(this.getDelegations()) == false)
            return false;
        if (other.getSystemEvidenceCount() == null ^ this.getSystemEvidenceCount() == null)
            return false;
        if (other.getSystemEvidenceCount() != null && other.getSystemEvidenceCount().equals(this.getSystemEvidenceCount()) == false)
            return false;
        if (other.getManualEvidenceCount() == null ^ this.getManualEvidenceCount() == null)
            return false;
        if (other.getManualEvidenceCount() != null && other.getManualEvidenceCount().equals(this.getManualEvidenceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRoles() == null) ? 0 : getRoles().hashCode());
        hashCode = prime * hashCode + ((getControls() == null) ? 0 : getControls().hashCode());
        hashCode = prime * hashCode + ((getDelegations() == null) ? 0 : getDelegations().hashCode());
        hashCode = prime * hashCode + ((getSystemEvidenceCount() == null) ? 0 : getSystemEvidenceCount().hashCode());
        hashCode = prime * hashCode + ((getManualEvidenceCount() == null) ? 0 : getManualEvidenceCount().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentControlSet clone() {
        try {
            return (AssessmentControlSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.AssessmentControlSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
