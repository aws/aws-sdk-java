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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateFindings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of findings to update. <code>BatchUpdateFindings</code> can be used to update up to 100 findings at a
     * time.
     * </p>
     * <p>
     * For each finding, the list provides the finding identifier and the ARN of the finding provider.
     * </p>
     */
    private java.util.List<AwsSecurityFindingIdentifier> findingIdentifiers;

    private NoteUpdate note;
    /**
     * <p>
     * Used to update the finding severity.
     * </p>
     */
    private SeverityUpdate severity;
    /**
     * <p>
     * Indicates the veracity of a finding.
     * </p>
     * <p>
     * The available values for <code>VerificationState</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNKNOWN</code> – The default disposition of a security finding
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUE_POSITIVE</code> – The security finding is confirmed
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FALSE_POSITIVE</code> – The security finding was determined to be a false alarm
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BENIGN_POSITIVE</code> – A special case of <code>TRUE_POSITIVE</code> where the finding doesn't pose any
     * threat, is expected, or both
     * </p>
     * </li>
     * </ul>
     */
    private String verificationState;
    /**
     * <p>
     * The updated value for the finding confidence. Confidence is defined as the likelihood that a finding accurately
     * identifies the behavior or issue that it was intended to identify.
     * </p>
     * <p>
     * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means
     * 100 percent confidence.
     * </p>
     */
    private Integer confidence;
    /**
     * <p>
     * The updated value for the level of importance assigned to the resources associated with the findings.
     * </p>
     * <p>
     * A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most
     * critical resources.
     * </p>
     */
    private Integer criticality;
    /**
     * <p>
     * One or more finding types in the format of namespace/category/classifier that classify a finding.
     * </p>
     * <p>
     * Valid namespace values are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Software and Configuration Checks
     * </p>
     * </li>
     * <li>
     * <p>
     * TTPs
     * </p>
     * </li>
     * <li>
     * <p>
     * Effects
     * </p>
     * </li>
     * <li>
     * <p>
     * Unusual Behaviors
     * </p>
     * </li>
     * <li>
     * <p>
     * Sensitive Data Identifications
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> types;
    /**
     * <p>
     * A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a
     * finding.
     * </p>
     */
    private java.util.Map<String, String> userDefinedFields;
    /**
     * <p>
     * Used to update the workflow status of a finding.
     * </p>
     * <p>
     * The workflow status indicates the progress of the investigation into the finding.
     * </p>
     */
    private WorkflowUpdate workflow;
    /**
     * <p>
     * A list of findings that are related to the updated findings.
     * </p>
     */
    private java.util.List<RelatedFinding> relatedFindings;

    /**
     * <p>
     * The list of findings to update. <code>BatchUpdateFindings</code> can be used to update up to 100 findings at a
     * time.
     * </p>
     * <p>
     * For each finding, the list provides the finding identifier and the ARN of the finding provider.
     * </p>
     * 
     * @return The list of findings to update. <code>BatchUpdateFindings</code> can be used to update up to 100 findings
     *         at a time.</p>
     *         <p>
     *         For each finding, the list provides the finding identifier and the ARN of the finding provider.
     */

    public java.util.List<AwsSecurityFindingIdentifier> getFindingIdentifiers() {
        return findingIdentifiers;
    }

    /**
     * <p>
     * The list of findings to update. <code>BatchUpdateFindings</code> can be used to update up to 100 findings at a
     * time.
     * </p>
     * <p>
     * For each finding, the list provides the finding identifier and the ARN of the finding provider.
     * </p>
     * 
     * @param findingIdentifiers
     *        The list of findings to update. <code>BatchUpdateFindings</code> can be used to update up to 100 findings
     *        at a time.</p>
     *        <p>
     *        For each finding, the list provides the finding identifier and the ARN of the finding provider.
     */

    public void setFindingIdentifiers(java.util.Collection<AwsSecurityFindingIdentifier> findingIdentifiers) {
        if (findingIdentifiers == null) {
            this.findingIdentifiers = null;
            return;
        }

        this.findingIdentifiers = new java.util.ArrayList<AwsSecurityFindingIdentifier>(findingIdentifiers);
    }

    /**
     * <p>
     * The list of findings to update. <code>BatchUpdateFindings</code> can be used to update up to 100 findings at a
     * time.
     * </p>
     * <p>
     * For each finding, the list provides the finding identifier and the ARN of the finding provider.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingIdentifiers(java.util.Collection)} or {@link #withFindingIdentifiers(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param findingIdentifiers
     *        The list of findings to update. <code>BatchUpdateFindings</code> can be used to update up to 100 findings
     *        at a time.</p>
     *        <p>
     *        For each finding, the list provides the finding identifier and the ARN of the finding provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsRequest withFindingIdentifiers(AwsSecurityFindingIdentifier... findingIdentifiers) {
        if (this.findingIdentifiers == null) {
            setFindingIdentifiers(new java.util.ArrayList<AwsSecurityFindingIdentifier>(findingIdentifiers.length));
        }
        for (AwsSecurityFindingIdentifier ele : findingIdentifiers) {
            this.findingIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of findings to update. <code>BatchUpdateFindings</code> can be used to update up to 100 findings at a
     * time.
     * </p>
     * <p>
     * For each finding, the list provides the finding identifier and the ARN of the finding provider.
     * </p>
     * 
     * @param findingIdentifiers
     *        The list of findings to update. <code>BatchUpdateFindings</code> can be used to update up to 100 findings
     *        at a time.</p>
     *        <p>
     *        For each finding, the list provides the finding identifier and the ARN of the finding provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsRequest withFindingIdentifiers(java.util.Collection<AwsSecurityFindingIdentifier> findingIdentifiers) {
        setFindingIdentifiers(findingIdentifiers);
        return this;
    }

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

    public BatchUpdateFindingsRequest withNote(NoteUpdate note) {
        setNote(note);
        return this;
    }

    /**
     * <p>
     * Used to update the finding severity.
     * </p>
     * 
     * @param severity
     *        Used to update the finding severity.
     */

    public void setSeverity(SeverityUpdate severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * Used to update the finding severity.
     * </p>
     * 
     * @return Used to update the finding severity.
     */

    public SeverityUpdate getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * Used to update the finding severity.
     * </p>
     * 
     * @param severity
     *        Used to update the finding severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsRequest withSeverity(SeverityUpdate severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * Indicates the veracity of a finding.
     * </p>
     * <p>
     * The available values for <code>VerificationState</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNKNOWN</code> – The default disposition of a security finding
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUE_POSITIVE</code> – The security finding is confirmed
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FALSE_POSITIVE</code> – The security finding was determined to be a false alarm
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BENIGN_POSITIVE</code> – A special case of <code>TRUE_POSITIVE</code> where the finding doesn't pose any
     * threat, is expected, or both
     * </p>
     * </li>
     * </ul>
     * 
     * @param verificationState
     *        Indicates the veracity of a finding.</p>
     *        <p>
     *        The available values for <code>VerificationState</code> are as follows.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code> – The default disposition of a security finding
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRUE_POSITIVE</code> – The security finding is confirmed
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FALSE_POSITIVE</code> – The security finding was determined to be a false alarm
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BENIGN_POSITIVE</code> – A special case of <code>TRUE_POSITIVE</code> where the finding doesn't pose
     *        any threat, is expected, or both
     *        </p>
     *        </li>
     * @see VerificationState
     */

    public void setVerificationState(String verificationState) {
        this.verificationState = verificationState;
    }

    /**
     * <p>
     * Indicates the veracity of a finding.
     * </p>
     * <p>
     * The available values for <code>VerificationState</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNKNOWN</code> – The default disposition of a security finding
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUE_POSITIVE</code> – The security finding is confirmed
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FALSE_POSITIVE</code> – The security finding was determined to be a false alarm
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BENIGN_POSITIVE</code> – A special case of <code>TRUE_POSITIVE</code> where the finding doesn't pose any
     * threat, is expected, or both
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the veracity of a finding.</p>
     *         <p>
     *         The available values for <code>VerificationState</code> are as follows.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>UNKNOWN</code> – The default disposition of a security finding
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRUE_POSITIVE</code> – The security finding is confirmed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FALSE_POSITIVE</code> – The security finding was determined to be a false alarm
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BENIGN_POSITIVE</code> – A special case of <code>TRUE_POSITIVE</code> where the finding doesn't
     *         pose any threat, is expected, or both
     *         </p>
     *         </li>
     * @see VerificationState
     */

    public String getVerificationState() {
        return this.verificationState;
    }

    /**
     * <p>
     * Indicates the veracity of a finding.
     * </p>
     * <p>
     * The available values for <code>VerificationState</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNKNOWN</code> – The default disposition of a security finding
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUE_POSITIVE</code> – The security finding is confirmed
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FALSE_POSITIVE</code> – The security finding was determined to be a false alarm
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BENIGN_POSITIVE</code> – A special case of <code>TRUE_POSITIVE</code> where the finding doesn't pose any
     * threat, is expected, or both
     * </p>
     * </li>
     * </ul>
     * 
     * @param verificationState
     *        Indicates the veracity of a finding.</p>
     *        <p>
     *        The available values for <code>VerificationState</code> are as follows.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code> – The default disposition of a security finding
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRUE_POSITIVE</code> – The security finding is confirmed
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FALSE_POSITIVE</code> – The security finding was determined to be a false alarm
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BENIGN_POSITIVE</code> – A special case of <code>TRUE_POSITIVE</code> where the finding doesn't pose
     *        any threat, is expected, or both
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerificationState
     */

    public BatchUpdateFindingsRequest withVerificationState(String verificationState) {
        setVerificationState(verificationState);
        return this;
    }

    /**
     * <p>
     * Indicates the veracity of a finding.
     * </p>
     * <p>
     * The available values for <code>VerificationState</code> are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNKNOWN</code> – The default disposition of a security finding
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRUE_POSITIVE</code> – The security finding is confirmed
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FALSE_POSITIVE</code> – The security finding was determined to be a false alarm
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BENIGN_POSITIVE</code> – A special case of <code>TRUE_POSITIVE</code> where the finding doesn't pose any
     * threat, is expected, or both
     * </p>
     * </li>
     * </ul>
     * 
     * @param verificationState
     *        Indicates the veracity of a finding.</p>
     *        <p>
     *        The available values for <code>VerificationState</code> are as follows.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code> – The default disposition of a security finding
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRUE_POSITIVE</code> – The security finding is confirmed
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FALSE_POSITIVE</code> – The security finding was determined to be a false alarm
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BENIGN_POSITIVE</code> – A special case of <code>TRUE_POSITIVE</code> where the finding doesn't pose
     *        any threat, is expected, or both
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerificationState
     */

    public BatchUpdateFindingsRequest withVerificationState(VerificationState verificationState) {
        this.verificationState = verificationState.toString();
        return this;
    }

    /**
     * <p>
     * The updated value for the finding confidence. Confidence is defined as the likelihood that a finding accurately
     * identifies the behavior or issue that it was intended to identify.
     * </p>
     * <p>
     * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means
     * 100 percent confidence.
     * </p>
     * 
     * @param confidence
     *        The updated value for the finding confidence. Confidence is defined as the likelihood that a finding
     *        accurately identifies the behavior or issue that it was intended to identify.</p>
     *        <p>
     *        Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100
     *        means 100 percent confidence.
     */

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The updated value for the finding confidence. Confidence is defined as the likelihood that a finding accurately
     * identifies the behavior or issue that it was intended to identify.
     * </p>
     * <p>
     * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means
     * 100 percent confidence.
     * </p>
     * 
     * @return The updated value for the finding confidence. Confidence is defined as the likelihood that a finding
     *         accurately identifies the behavior or issue that it was intended to identify.</p>
     *         <p>
     *         Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100
     *         means 100 percent confidence.
     */

    public Integer getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The updated value for the finding confidence. Confidence is defined as the likelihood that a finding accurately
     * identifies the behavior or issue that it was intended to identify.
     * </p>
     * <p>
     * Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means
     * 100 percent confidence.
     * </p>
     * 
     * @param confidence
     *        The updated value for the finding confidence. Confidence is defined as the likelihood that a finding
     *        accurately identifies the behavior or issue that it was intended to identify.</p>
     *        <p>
     *        Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100
     *        means 100 percent confidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsRequest withConfidence(Integer confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * The updated value for the level of importance assigned to the resources associated with the findings.
     * </p>
     * <p>
     * A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most
     * critical resources.
     * </p>
     * 
     * @param criticality
     *        The updated value for the level of importance assigned to the resources associated with the findings.</p>
     *        <p>
     *        A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for
     *        the most critical resources.
     */

    public void setCriticality(Integer criticality) {
        this.criticality = criticality;
    }

    /**
     * <p>
     * The updated value for the level of importance assigned to the resources associated with the findings.
     * </p>
     * <p>
     * A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most
     * critical resources.
     * </p>
     * 
     * @return The updated value for the level of importance assigned to the resources associated with the findings.</p>
     *         <p>
     *         A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for
     *         the most critical resources.
     */

    public Integer getCriticality() {
        return this.criticality;
    }

    /**
     * <p>
     * The updated value for the level of importance assigned to the resources associated with the findings.
     * </p>
     * <p>
     * A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most
     * critical resources.
     * </p>
     * 
     * @param criticality
     *        The updated value for the level of importance assigned to the resources associated with the findings.</p>
     *        <p>
     *        A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for
     *        the most critical resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsRequest withCriticality(Integer criticality) {
        setCriticality(criticality);
        return this;
    }

    /**
     * <p>
     * One or more finding types in the format of namespace/category/classifier that classify a finding.
     * </p>
     * <p>
     * Valid namespace values are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Software and Configuration Checks
     * </p>
     * </li>
     * <li>
     * <p>
     * TTPs
     * </p>
     * </li>
     * <li>
     * <p>
     * Effects
     * </p>
     * </li>
     * <li>
     * <p>
     * Unusual Behaviors
     * </p>
     * </li>
     * <li>
     * <p>
     * Sensitive Data Identifications
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more finding types in the format of namespace/category/classifier that classify a finding.</p>
     *         <p>
     *         Valid namespace values are as follows.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Software and Configuration Checks
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TTPs
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Effects
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Unusual Behaviors
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Sensitive Data Identifications
     *         </p>
     *         </li>
     */

    public java.util.List<String> getTypes() {
        return types;
    }

    /**
     * <p>
     * One or more finding types in the format of namespace/category/classifier that classify a finding.
     * </p>
     * <p>
     * Valid namespace values are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Software and Configuration Checks
     * </p>
     * </li>
     * <li>
     * <p>
     * TTPs
     * </p>
     * </li>
     * <li>
     * <p>
     * Effects
     * </p>
     * </li>
     * <li>
     * <p>
     * Unusual Behaviors
     * </p>
     * </li>
     * <li>
     * <p>
     * Sensitive Data Identifications
     * </p>
     * </li>
     * </ul>
     * 
     * @param types
     *        One or more finding types in the format of namespace/category/classifier that classify a finding.</p>
     *        <p>
     *        Valid namespace values are as follows.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Software and Configuration Checks
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TTPs
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Effects
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unusual Behaviors
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Sensitive Data Identifications
     *        </p>
     *        </li>
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
     * One or more finding types in the format of namespace/category/classifier that classify a finding.
     * </p>
     * <p>
     * Valid namespace values are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Software and Configuration Checks
     * </p>
     * </li>
     * <li>
     * <p>
     * TTPs
     * </p>
     * </li>
     * <li>
     * <p>
     * Effects
     * </p>
     * </li>
     * <li>
     * <p>
     * Unusual Behaviors
     * </p>
     * </li>
     * <li>
     * <p>
     * Sensitive Data Identifications
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypes(java.util.Collection)} or {@link #withTypes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param types
     *        One or more finding types in the format of namespace/category/classifier that classify a finding.</p>
     *        <p>
     *        Valid namespace values are as follows.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Software and Configuration Checks
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TTPs
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Effects
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unusual Behaviors
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Sensitive Data Identifications
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsRequest withTypes(String... types) {
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
     * One or more finding types in the format of namespace/category/classifier that classify a finding.
     * </p>
     * <p>
     * Valid namespace values are as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Software and Configuration Checks
     * </p>
     * </li>
     * <li>
     * <p>
     * TTPs
     * </p>
     * </li>
     * <li>
     * <p>
     * Effects
     * </p>
     * </li>
     * <li>
     * <p>
     * Unusual Behaviors
     * </p>
     * </li>
     * <li>
     * <p>
     * Sensitive Data Identifications
     * </p>
     * </li>
     * </ul>
     * 
     * @param types
     *        One or more finding types in the format of namespace/category/classifier that classify a finding.</p>
     *        <p>
     *        Valid namespace values are as follows.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Software and Configuration Checks
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TTPs
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Effects
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Unusual Behaviors
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Sensitive Data Identifications
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsRequest withTypes(java.util.Collection<String> types) {
        setTypes(types);
        return this;
    }

    /**
     * <p>
     * A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a
     * finding.
     * </p>
     * 
     * @return A list of name/value string pairs associated with the finding. These are custom, user-defined fields
     *         added to a finding.
     */

    public java.util.Map<String, String> getUserDefinedFields() {
        return userDefinedFields;
    }

    /**
     * <p>
     * A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a
     * finding.
     * </p>
     * 
     * @param userDefinedFields
     *        A list of name/value string pairs associated with the finding. These are custom, user-defined fields added
     *        to a finding.
     */

    public void setUserDefinedFields(java.util.Map<String, String> userDefinedFields) {
        this.userDefinedFields = userDefinedFields;
    }

    /**
     * <p>
     * A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a
     * finding.
     * </p>
     * 
     * @param userDefinedFields
     *        A list of name/value string pairs associated with the finding. These are custom, user-defined fields added
     *        to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsRequest withUserDefinedFields(java.util.Map<String, String> userDefinedFields) {
        setUserDefinedFields(userDefinedFields);
        return this;
    }

    /**
     * Add a single UserDefinedFields entry
     *
     * @see BatchUpdateFindingsRequest#withUserDefinedFields
     * @returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsRequest addUserDefinedFieldsEntry(String key, String value) {
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

    public BatchUpdateFindingsRequest clearUserDefinedFieldsEntries() {
        this.userDefinedFields = null;
        return this;
    }

    /**
     * <p>
     * Used to update the workflow status of a finding.
     * </p>
     * <p>
     * The workflow status indicates the progress of the investigation into the finding.
     * </p>
     * 
     * @param workflow
     *        Used to update the workflow status of a finding.</p>
     *        <p>
     *        The workflow status indicates the progress of the investigation into the finding.
     */

    public void setWorkflow(WorkflowUpdate workflow) {
        this.workflow = workflow;
    }

    /**
     * <p>
     * Used to update the workflow status of a finding.
     * </p>
     * <p>
     * The workflow status indicates the progress of the investigation into the finding.
     * </p>
     * 
     * @return Used to update the workflow status of a finding.</p>
     *         <p>
     *         The workflow status indicates the progress of the investigation into the finding.
     */

    public WorkflowUpdate getWorkflow() {
        return this.workflow;
    }

    /**
     * <p>
     * Used to update the workflow status of a finding.
     * </p>
     * <p>
     * The workflow status indicates the progress of the investigation into the finding.
     * </p>
     * 
     * @param workflow
     *        Used to update the workflow status of a finding.</p>
     *        <p>
     *        The workflow status indicates the progress of the investigation into the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsRequest withWorkflow(WorkflowUpdate workflow) {
        setWorkflow(workflow);
        return this;
    }

    /**
     * <p>
     * A list of findings that are related to the updated findings.
     * </p>
     * 
     * @return A list of findings that are related to the updated findings.
     */

    public java.util.List<RelatedFinding> getRelatedFindings() {
        return relatedFindings;
    }

    /**
     * <p>
     * A list of findings that are related to the updated findings.
     * </p>
     * 
     * @param relatedFindings
     *        A list of findings that are related to the updated findings.
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
     * A list of findings that are related to the updated findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedFindings(java.util.Collection)} or {@link #withRelatedFindings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param relatedFindings
     *        A list of findings that are related to the updated findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsRequest withRelatedFindings(RelatedFinding... relatedFindings) {
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
     * A list of findings that are related to the updated findings.
     * </p>
     * 
     * @param relatedFindings
     *        A list of findings that are related to the updated findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateFindingsRequest withRelatedFindings(java.util.Collection<RelatedFinding> relatedFindings) {
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
        if (getFindingIdentifiers() != null)
            sb.append("FindingIdentifiers: ").append(getFindingIdentifiers()).append(",");
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

        if (obj instanceof BatchUpdateFindingsRequest == false)
            return false;
        BatchUpdateFindingsRequest other = (BatchUpdateFindingsRequest) obj;
        if (other.getFindingIdentifiers() == null ^ this.getFindingIdentifiers() == null)
            return false;
        if (other.getFindingIdentifiers() != null && other.getFindingIdentifiers().equals(this.getFindingIdentifiers()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getFindingIdentifiers() == null) ? 0 : getFindingIdentifiers().hashCode());
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
    public BatchUpdateFindingsRequest clone() {
        return (BatchUpdateFindingsRequest) super.clone();
    }

}
