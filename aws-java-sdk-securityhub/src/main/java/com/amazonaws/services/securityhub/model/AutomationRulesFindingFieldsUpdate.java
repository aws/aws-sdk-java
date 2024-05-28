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
 * Identifies the finding fields that the automation rule action updates when a finding matches the defined criteria.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AutomationRulesFindingFieldsUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomationRulesFindingFieldsUpdate implements Serializable, Cloneable, StructuredPojo {

    private NoteUpdate note;

    private SeverityUpdate severity;
    /**
     * <p>
     * The rule action updates the <code>VerificationState</code> field of a finding.
     * </p>
     */
    private String verificationState;
    /**
     * <p>
     * The rule action updates the <code>Confidence</code> field of a finding.
     * </p>
     */
    private Integer confidence;
    /**
     * <p>
     * The rule action updates the <code>Criticality</code> field of a finding.
     * </p>
     */
    private Integer criticality;
    /**
     * <p>
     * The rule action updates the <code>Types</code> field of a finding.
     * </p>
     */
    private java.util.List<String> types;
    /**
     * <p>
     * The rule action updates the <code>UserDefinedFields</code> field of a finding.
     * </p>
     */
    private java.util.Map<String, String> userDefinedFields;

    private WorkflowUpdate workflow;
    /**
     * <p>
     * The rule action updates the <code>RelatedFindings</code> field of a finding.
     * </p>
     */
    private java.util.List<RelatedFinding> relatedFindings;

    /**
     * @param note
     */

    public void setNote(NoteUpdate note) {
        this.note = note;
    }

    /**
     * @return
     */

    public NoteUpdate getNote() {
        return this.note;
    }

    /**
     * @param note
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFieldsUpdate withNote(NoteUpdate note) {
        setNote(note);
        return this;
    }

    /**
     * @param severity
     */

    public void setSeverity(SeverityUpdate severity) {
        this.severity = severity;
    }

    /**
     * @return
     */

    public SeverityUpdate getSeverity() {
        return this.severity;
    }

    /**
     * @param severity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFieldsUpdate withSeverity(SeverityUpdate severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The rule action updates the <code>VerificationState</code> field of a finding.
     * </p>
     * 
     * @param verificationState
     *        The rule action updates the <code>VerificationState</code> field of a finding.
     * @see VerificationState
     */

    public void setVerificationState(String verificationState) {
        this.verificationState = verificationState;
    }

    /**
     * <p>
     * The rule action updates the <code>VerificationState</code> field of a finding.
     * </p>
     * 
     * @return The rule action updates the <code>VerificationState</code> field of a finding.
     * @see VerificationState
     */

    public String getVerificationState() {
        return this.verificationState;
    }

    /**
     * <p>
     * The rule action updates the <code>VerificationState</code> field of a finding.
     * </p>
     * 
     * @param verificationState
     *        The rule action updates the <code>VerificationState</code> field of a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerificationState
     */

    public AutomationRulesFindingFieldsUpdate withVerificationState(String verificationState) {
        setVerificationState(verificationState);
        return this;
    }

    /**
     * <p>
     * The rule action updates the <code>VerificationState</code> field of a finding.
     * </p>
     * 
     * @param verificationState
     *        The rule action updates the <code>VerificationState</code> field of a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerificationState
     */

    public AutomationRulesFindingFieldsUpdate withVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
        return this;
    }

    /**
     * <p>
     * The rule action updates the <code>Confidence</code> field of a finding.
     * </p>
     * 
     * @param confidence
     *        The rule action updates the <code>Confidence</code> field of a finding.
     */

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The rule action updates the <code>Confidence</code> field of a finding.
     * </p>
     * 
     * @return The rule action updates the <code>Confidence</code> field of a finding.
     */

    public Integer getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The rule action updates the <code>Confidence</code> field of a finding.
     * </p>
     * 
     * @param confidence
     *        The rule action updates the <code>Confidence</code> field of a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFieldsUpdate withConfidence(Integer confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * The rule action updates the <code>Criticality</code> field of a finding.
     * </p>
     * 
     * @param criticality
     *        The rule action updates the <code>Criticality</code> field of a finding.
     */

    public void setCriticality(Integer criticality) {
        this.criticality = criticality;
    }

    /**
     * <p>
     * The rule action updates the <code>Criticality</code> field of a finding.
     * </p>
     * 
     * @return The rule action updates the <code>Criticality</code> field of a finding.
     */

    public Integer getCriticality() {
        return this.criticality;
    }

    /**
     * <p>
     * The rule action updates the <code>Criticality</code> field of a finding.
     * </p>
     * 
     * @param criticality
     *        The rule action updates the <code>Criticality</code> field of a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFieldsUpdate withCriticality(Integer criticality) {
        setCriticality(criticality);
        return this;
    }

    /**
     * <p>
     * The rule action updates the <code>Types</code> field of a finding.
     * </p>
     * 
     * @return The rule action updates the <code>Types</code> field of a finding.
     */

    public java.util.List<String> getTypes() {
        return types;
    }

    /**
     * <p>
     * The rule action updates the <code>Types</code> field of a finding.
     * </p>
     * 
     * @param types
     *        The rule action updates the <code>Types</code> field of a finding.
     */

    public void setTypes(java.util.Collection<String> types) {
        if (types == null) {
            this.types = null;
            return;
        }

        this.types = new java.util.ArrayList<String>(types);
    }

    /**
     * <p>
     * The rule action updates the <code>Types</code> field of a finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypes(java.util.Collection)} or {@link #withTypes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param types
     *        The rule action updates the <code>Types</code> field of a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFieldsUpdate withTypes(String... types) {
        if (this.types == null) {
            setTypes(new java.util.ArrayList<String>(types.length));
        }
        for (String ele : types) {
            this.types.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rule action updates the <code>Types</code> field of a finding.
     * </p>
     * 
     * @param types
     *        The rule action updates the <code>Types</code> field of a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFieldsUpdate withTypes(java.util.Collection<String> types) {
        setTypes(types);
        return this;
    }

    /**
     * <p>
     * The rule action updates the <code>UserDefinedFields</code> field of a finding.
     * </p>
     * 
     * @return The rule action updates the <code>UserDefinedFields</code> field of a finding.
     */

    public java.util.Map<String, String> getUserDefinedFields() {
        return userDefinedFields;
    }

    /**
     * <p>
     * The rule action updates the <code>UserDefinedFields</code> field of a finding.
     * </p>
     * 
     * @param userDefinedFields
     *        The rule action updates the <code>UserDefinedFields</code> field of a finding.
     */

    public void setUserDefinedFields(java.util.Map<String, String> userDefinedFields) {
        this.userDefinedFields = userDefinedFields;
    }

    /**
     * <p>
     * The rule action updates the <code>UserDefinedFields</code> field of a finding.
     * </p>
     * 
     * @param userDefinedFields
     *        The rule action updates the <code>UserDefinedFields</code> field of a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFieldsUpdate withUserDefinedFields(java.util.Map<String, String> userDefinedFields) {
        setUserDefinedFields(userDefinedFields);
        return this;
    }

    /**
     * Add a single UserDefinedFields entry
     *
     * @see AutomationRulesFindingFieldsUpdate#withUserDefinedFields
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFieldsUpdate addUserDefinedFieldsEntry(String key, String value) {
        if (null == this.userDefinedFields) {
            this.userDefinedFields = new java.util.HashMap<String, String>();
        }
        if (this.userDefinedFields.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.userDefinedFields.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserDefinedFields.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFieldsUpdate clearUserDefinedFieldsEntries() {
        this.userDefinedFields = null;
        return this;
    }

    /**
     * @param workflow
     */

    public void setWorkflow(WorkflowUpdate workflow) {
        this.workflow = workflow;
    }

    /**
     * @return
     */

    public WorkflowUpdate getWorkflow() {
        return this.workflow;
    }

    /**
     * @param workflow
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFieldsUpdate withWorkflow(WorkflowUpdate workflow) {
        setWorkflow(workflow);
        return this;
    }

    /**
     * <p>
     * The rule action updates the <code>RelatedFindings</code> field of a finding.
     * </p>
     * 
     * @return The rule action updates the <code>RelatedFindings</code> field of a finding.
     */

    public java.util.List<RelatedFinding> getRelatedFindings() {
        return relatedFindings;
    }

    /**
     * <p>
     * The rule action updates the <code>RelatedFindings</code> field of a finding.
     * </p>
     * 
     * @param relatedFindings
     *        The rule action updates the <code>RelatedFindings</code> field of a finding.
     */

    public void setRelatedFindings(java.util.Collection<RelatedFinding> relatedFindings) {
        if (relatedFindings == null) {
            this.relatedFindings = null;
            return;
        }

        this.relatedFindings = new java.util.ArrayList<RelatedFinding>(relatedFindings);
    }

    /**
     * <p>
     * The rule action updates the <code>RelatedFindings</code> field of a finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedFindings(java.util.Collection)} or {@link #withRelatedFindings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param relatedFindings
     *        The rule action updates the <code>RelatedFindings</code> field of a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFieldsUpdate withRelatedFindings(RelatedFinding... relatedFindings) {
        if (this.relatedFindings == null) {
            setRelatedFindings(new java.util.ArrayList<RelatedFinding>(relatedFindings.length));
        }
        for (RelatedFinding ele : relatedFindings) {
            this.relatedFindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rule action updates the <code>RelatedFindings</code> field of a finding.
     * </p>
     * 
     * @param relatedFindings
     *        The rule action updates the <code>RelatedFindings</code> field of a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationRulesFindingFieldsUpdate withRelatedFindings(java.util.Collection<RelatedFinding> relatedFindings) {
        setRelatedFindings(relatedFindings);
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
        if (getNote() != null)
            sb.append("Note: ").append(getNote()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getVerificationState() != null)
            sb.append("VerificationState: ").append(getVerificationState()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getCriticality() != null)
            sb.append("Criticality: ").append(getCriticality()).append(",");
        if (getTypes() != null)
            sb.append("Types: ").append(getTypes()).append(",");
        if (getUserDefinedFields() != null)
            sb.append("UserDefinedFields: ").append(getUserDefinedFields()).append(",");
        if (getWorkflow() != null)
            sb.append("Workflow: ").append(getWorkflow()).append(",");
        if (getRelatedFindings() != null)
            sb.append("RelatedFindings: ").append(getRelatedFindings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomationRulesFindingFieldsUpdate == false)
            return false;
        AutomationRulesFindingFieldsUpdate other = (AutomationRulesFindingFieldsUpdate) obj;
        if (other.getNote() == null ^ this.getNote() == null)
            return false;
        if (other.getNote() != null && other.getNote().equals(this.getNote()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getVerificationState() == null ^ this.getVerificationState() == null)
            return false;
        if (other.getVerificationState() != null && other.getVerificationState().equals(this.getVerificationState()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getCriticality() == null ^ this.getCriticality() == null)
            return false;
        if (other.getCriticality() != null && other.getCriticality().equals(this.getCriticality()) == false)
            return false;
        if (other.getTypes() == null ^ this.getTypes() == null)
            return false;
        if (other.getTypes() != null && other.getTypes().equals(this.getTypes()) == false)
            return false;
        if (other.getUserDefinedFields() == null ^ this.getUserDefinedFields() == null)
            return false;
        if (other.getUserDefinedFields() != null && other.getUserDefinedFields().equals(this.getUserDefinedFields()) == false)
            return false;
        if (other.getWorkflow() == null ^ this.getWorkflow() == null)
            return false;
        if (other.getWorkflow() != null && other.getWorkflow().equals(this.getWorkflow()) == false)
            return false;
        if (other.getRelatedFindings() == null ^ this.getRelatedFindings() == null)
            return false;
        if (other.getRelatedFindings() != null && other.getRelatedFindings().equals(this.getRelatedFindings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNote() == null) ? 0 : getNote().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getVerificationState() == null) ? 0 : getVerificationState().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getCriticality() == null) ? 0 : getCriticality().hashCode());
        hashCode = prime * hashCode + ((getTypes() == null) ? 0 : getTypes().hashCode());
        hashCode = prime * hashCode + ((getUserDefinedFields() == null) ? 0 : getUserDefinedFields().hashCode());
        hashCode = prime * hashCode + ((getWorkflow() == null) ? 0 : getWorkflow().hashCode());
        hashCode = prime * hashCode + ((getRelatedFindings() == null) ? 0 : getRelatedFindings().hashCode());
        return hashCode;
    }

    @Override
    public AutomationRulesFindingFieldsUpdate clone() {
        try {
            return (AutomationRulesFindingFieldsUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AutomationRulesFindingFieldsUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
