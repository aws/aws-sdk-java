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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a finding that was detected in your code.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/Finding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Finding implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the finding was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * A description of the finding.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier for the detector that detected the finding in your code. A detector is a defined rule based on
     * industry standards and AWS best practices.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The name of the detector that identified the security vulnerability in your code.
     * </p>
     */
    private String detectorName;
    /**
     * <p>
     * One or more tags or categorizations that are associated with a detector. These tags are defined by type,
     * programming language, or other classification such as maintainability or consistency.
     * </p>
     */
    private java.util.List<String> detectorTags;
    /**
     * <p>
     * The identifier for the component that generated a finding such as AWSCodeGuruSecurity or AWSInspector.
     * </p>
     */
    private String generatorId;
    /**
     * <p>
     * The identifier for a finding.
     * </p>
     */
    private String id;
    /**
     * <p>
     * An object that contains the details about how to remediate a finding.
     * </p>
     */
    private Remediation remediation;
    /**
     * <p>
     * The resource where Amazon CodeGuru Security detected a finding.
     * </p>
     */
    private Resource resource;
    /**
     * <p>
     * The identifier for the rule that generated the finding.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * The severity of the finding.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The status of the finding. A finding status can be open or closed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The title of the finding.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The type of finding.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The time when the finding was last updated. Findings are updated when you remediate them or when the finding code
     * location changes.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * An object that describes the detected security vulnerability.
     * </p>
     */
    private Vulnerability vulnerability;

    /**
     * <p>
     * The time when the finding was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the finding was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the finding was created.
     * </p>
     * 
     * @return The time when the finding was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the finding was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the finding was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * A description of the finding.
     * </p>
     * 
     * @param description
     *        A description of the finding.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the finding.
     * </p>
     * 
     * @return A description of the finding.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the finding.
     * </p>
     * 
     * @param description
     *        A description of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier for the detector that detected the finding in your code. A detector is a defined rule based on
     * industry standards and AWS best practices.
     * </p>
     * 
     * @param detectorId
     *        The identifier for the detector that detected the finding in your code. A detector is a defined rule based
     *        on industry standards and AWS best practices.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The identifier for the detector that detected the finding in your code. A detector is a defined rule based on
     * industry standards and AWS best practices.
     * </p>
     * 
     * @return The identifier for the detector that detected the finding in your code. A detector is a defined rule
     *         based on industry standards and AWS best practices.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The identifier for the detector that detected the finding in your code. A detector is a defined rule based on
     * industry standards and AWS best practices.
     * </p>
     * 
     * @param detectorId
     *        The identifier for the detector that detected the finding in your code. A detector is a defined rule based
     *        on industry standards and AWS best practices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The name of the detector that identified the security vulnerability in your code.
     * </p>
     * 
     * @param detectorName
     *        The name of the detector that identified the security vulnerability in your code.
     */

    public void setDetectorName(String detectorName) {
        this.detectorName = detectorName;
    }

    /**
     * <p>
     * The name of the detector that identified the security vulnerability in your code.
     * </p>
     * 
     * @return The name of the detector that identified the security vulnerability in your code.
     */

    public String getDetectorName() {
        return this.detectorName;
    }

    /**
     * <p>
     * The name of the detector that identified the security vulnerability in your code.
     * </p>
     * 
     * @param detectorName
     *        The name of the detector that identified the security vulnerability in your code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withDetectorName(String detectorName) {
        setDetectorName(detectorName);
        return this;
    }

    /**
     * <p>
     * One or more tags or categorizations that are associated with a detector. These tags are defined by type,
     * programming language, or other classification such as maintainability or consistency.
     * </p>
     * 
     * @return One or more tags or categorizations that are associated with a detector. These tags are defined by type,
     *         programming language, or other classification such as maintainability or consistency.
     */

    public java.util.List<String> getDetectorTags() {
        return detectorTags;
    }

    /**
     * <p>
     * One or more tags or categorizations that are associated with a detector. These tags are defined by type,
     * programming language, or other classification such as maintainability or consistency.
     * </p>
     * 
     * @param detectorTags
     *        One or more tags or categorizations that are associated with a detector. These tags are defined by type,
     *        programming language, or other classification such as maintainability or consistency.
     */

    public void setDetectorTags(java.util.Collection<String> detectorTags) {
        if (detectorTags == null) {
            this.detectorTags = null;
            return;
        }

        this.detectorTags = new java.util.ArrayList<String>(detectorTags);
    }

    /**
     * <p>
     * One or more tags or categorizations that are associated with a detector. These tags are defined by type,
     * programming language, or other classification such as maintainability or consistency.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetectorTags(java.util.Collection)} or {@link #withDetectorTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param detectorTags
     *        One or more tags or categorizations that are associated with a detector. These tags are defined by type,
     *        programming language, or other classification such as maintainability or consistency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withDetectorTags(String... detectorTags) {
        if (this.detectorTags == null) {
            setDetectorTags(new java.util.ArrayList<String>(detectorTags.length));
        }
        for (String ele : detectorTags) {
            this.detectorTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags or categorizations that are associated with a detector. These tags are defined by type,
     * programming language, or other classification such as maintainability or consistency.
     * </p>
     * 
     * @param detectorTags
     *        One or more tags or categorizations that are associated with a detector. These tags are defined by type,
     *        programming language, or other classification such as maintainability or consistency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withDetectorTags(java.util.Collection<String> detectorTags) {
        setDetectorTags(detectorTags);
        return this;
    }

    /**
     * <p>
     * The identifier for the component that generated a finding such as AWSCodeGuruSecurity or AWSInspector.
     * </p>
     * 
     * @param generatorId
     *        The identifier for the component that generated a finding such as AWSCodeGuruSecurity or AWSInspector.
     */

    public void setGeneratorId(String generatorId) {
        this.generatorId = generatorId;
    }

    /**
     * <p>
     * The identifier for the component that generated a finding such as AWSCodeGuruSecurity or AWSInspector.
     * </p>
     * 
     * @return The identifier for the component that generated a finding such as AWSCodeGuruSecurity or AWSInspector.
     */

    public String getGeneratorId() {
        return this.generatorId;
    }

    /**
     * <p>
     * The identifier for the component that generated a finding such as AWSCodeGuruSecurity or AWSInspector.
     * </p>
     * 
     * @param generatorId
     *        The identifier for the component that generated a finding such as AWSCodeGuruSecurity or AWSInspector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withGeneratorId(String generatorId) {
        setGeneratorId(generatorId);
        return this;
    }

    /**
     * <p>
     * The identifier for a finding.
     * </p>
     * 
     * @param id
     *        The identifier for a finding.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for a finding.
     * </p>
     * 
     * @return The identifier for a finding.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for a finding.
     * </p>
     * 
     * @param id
     *        The identifier for a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * An object that contains the details about how to remediate a finding.
     * </p>
     * 
     * @param remediation
     *        An object that contains the details about how to remediate a finding.
     */

    public void setRemediation(Remediation remediation) {
        this.remediation = remediation;
    }

    /**
     * <p>
     * An object that contains the details about how to remediate a finding.
     * </p>
     * 
     * @return An object that contains the details about how to remediate a finding.
     */

    public Remediation getRemediation() {
        return this.remediation;
    }

    /**
     * <p>
     * An object that contains the details about how to remediate a finding.
     * </p>
     * 
     * @param remediation
     *        An object that contains the details about how to remediate a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withRemediation(Remediation remediation) {
        setRemediation(remediation);
        return this;
    }

    /**
     * <p>
     * The resource where Amazon CodeGuru Security detected a finding.
     * </p>
     * 
     * @param resource
     *        The resource where Amazon CodeGuru Security detected a finding.
     */

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource where Amazon CodeGuru Security detected a finding.
     * </p>
     * 
     * @return The resource where Amazon CodeGuru Security detected a finding.
     */

    public Resource getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource where Amazon CodeGuru Security detected a finding.
     * </p>
     * 
     * @param resource
     *        The resource where Amazon CodeGuru Security detected a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withResource(Resource resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The identifier for the rule that generated the finding.
     * </p>
     * 
     * @param ruleId
     *        The identifier for the rule that generated the finding.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The identifier for the rule that generated the finding.
     * </p>
     * 
     * @return The identifier for the rule that generated the finding.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The identifier for the rule that generated the finding.
     * </p>
     * 
     * @param ruleId
     *        The identifier for the rule that generated the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * The severity of the finding.
     * </p>
     * 
     * @param severity
     *        The severity of the finding.
     * @see Severity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the finding.
     * </p>
     * 
     * @return The severity of the finding.
     * @see Severity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the finding.
     * </p>
     * 
     * @param severity
     *        The severity of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Severity
     */

    public Finding withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The severity of the finding.
     * </p>
     * 
     * @param severity
     *        The severity of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Severity
     */

    public Finding withSeverity(Severity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * The status of the finding. A finding status can be open or closed.
     * </p>
     * 
     * @param status
     *        The status of the finding. A finding status can be open or closed.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the finding. A finding status can be open or closed.
     * </p>
     * 
     * @return The status of the finding. A finding status can be open or closed.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the finding. A finding status can be open or closed.
     * </p>
     * 
     * @param status
     *        The status of the finding. A finding status can be open or closed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Finding withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the finding. A finding status can be open or closed.
     * </p>
     * 
     * @param status
     *        The status of the finding. A finding status can be open or closed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Finding withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The title of the finding.
     * </p>
     * 
     * @param title
     *        The title of the finding.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the finding.
     * </p>
     * 
     * @return The title of the finding.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the finding.
     * </p>
     * 
     * @param title
     *        The title of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The type of finding.
     * </p>
     * 
     * @param type
     *        The type of finding.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of finding.
     * </p>
     * 
     * @return The type of finding.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of finding.
     * </p>
     * 
     * @param type
     *        The type of finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The time when the finding was last updated. Findings are updated when you remediate them or when the finding code
     * location changes.
     * </p>
     * 
     * @param updatedAt
     *        The time when the finding was last updated. Findings are updated when you remediate them or when the
     *        finding code location changes.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time when the finding was last updated. Findings are updated when you remediate them or when the finding code
     * location changes.
     * </p>
     * 
     * @return The time when the finding was last updated. Findings are updated when you remediate them or when the
     *         finding code location changes.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time when the finding was last updated. Findings are updated when you remediate them or when the finding code
     * location changes.
     * </p>
     * 
     * @param updatedAt
     *        The time when the finding was last updated. Findings are updated when you remediate them or when the
     *        finding code location changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * An object that describes the detected security vulnerability.
     * </p>
     * 
     * @param vulnerability
     *        An object that describes the detected security vulnerability.
     */

    public void setVulnerability(Vulnerability vulnerability) {
        this.vulnerability = vulnerability;
    }

    /**
     * <p>
     * An object that describes the detected security vulnerability.
     * </p>
     * 
     * @return An object that describes the detected security vulnerability.
     */

    public Vulnerability getVulnerability() {
        return this.vulnerability;
    }

    /**
     * <p>
     * An object that describes the detected security vulnerability.
     * </p>
     * 
     * @param vulnerability
     *        An object that describes the detected security vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withVulnerability(Vulnerability vulnerability) {
        setVulnerability(vulnerability);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getDetectorName() != null)
            sb.append("DetectorName: ").append(getDetectorName()).append(",");
        if (getDetectorTags() != null)
            sb.append("DetectorTags: ").append(getDetectorTags()).append(",");
        if (getGeneratorId() != null)
            sb.append("GeneratorId: ").append(getGeneratorId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRemediation() != null)
            sb.append("Remediation: ").append(getRemediation()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getVulnerability() != null)
            sb.append("Vulnerability: ").append(getVulnerability());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Finding == false)
            return false;
        Finding other = (Finding) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDetectorName() == null ^ this.getDetectorName() == null)
            return false;
        if (other.getDetectorName() != null && other.getDetectorName().equals(this.getDetectorName()) == false)
            return false;
        if (other.getDetectorTags() == null ^ this.getDetectorTags() == null)
            return false;
        if (other.getDetectorTags() != null && other.getDetectorTags().equals(this.getDetectorTags()) == false)
            return false;
        if (other.getGeneratorId() == null ^ this.getGeneratorId() == null)
            return false;
        if (other.getGeneratorId() != null && other.getGeneratorId().equals(this.getGeneratorId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRemediation() == null ^ this.getRemediation() == null)
            return false;
        if (other.getRemediation() != null && other.getRemediation().equals(this.getRemediation()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getVulnerability() == null ^ this.getVulnerability() == null)
            return false;
        if (other.getVulnerability() != null && other.getVulnerability().equals(this.getVulnerability()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getDetectorName() == null) ? 0 : getDetectorName().hashCode());
        hashCode = prime * hashCode + ((getDetectorTags() == null) ? 0 : getDetectorTags().hashCode());
        hashCode = prime * hashCode + ((getGeneratorId() == null) ? 0 : getGeneratorId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRemediation() == null) ? 0 : getRemediation().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getVulnerability() == null) ? 0 : getVulnerability().hashCode());
        return hashCode;
    }

    @Override
    public Finding clone() {
        try {
            return (Finding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurusecurity.model.transform.FindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
