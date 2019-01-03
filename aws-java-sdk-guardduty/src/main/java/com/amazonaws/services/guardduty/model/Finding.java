/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Representation of a abnormal or suspicious activity.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Finding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Finding implements Serializable, Cloneable, StructuredPojo {

    /** AWS account ID where the activity occurred that prompted GuardDuty to generate a finding. */
    private String accountId;
    /** The ARN of a finding described by the action. */
    private String arn;
    /** The confidence level of a finding. */
    private Double confidence;
    /** The time stamp at which a finding was generated. */
    private String createdAt;
    /** The description of a finding. */
    private String description;
    /** The identifier that corresponds to a finding described by the action. */
    private String id;
    /** The AWS resource partition. */
    private String partition;
    /** The AWS region where the activity occurred that prompted GuardDuty to generate a finding. */
    private String region;
    /** The AWS resource associated with the activity that prompted GuardDuty to generate a finding. */
    private Resource resource;
    /** Findings' schema version. */
    private String schemaVersion;
    /** Additional information assigned to the generated finding by GuardDuty. */
    private Service service;
    /** The severity of a finding. */
    private Double severity;
    /** The title of a finding. */
    private String title;
    /** The type of a finding described by the action. */
    private String type;
    /** The time stamp at which a finding was last updated. */
    private String updatedAt;

    /**
     * AWS account ID where the activity occurred that prompted GuardDuty to generate a finding.
     * 
     * @param accountId
     *        AWS account ID where the activity occurred that prompted GuardDuty to generate a finding.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * AWS account ID where the activity occurred that prompted GuardDuty to generate a finding.
     * 
     * @return AWS account ID where the activity occurred that prompted GuardDuty to generate a finding.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * AWS account ID where the activity occurred that prompted GuardDuty to generate a finding.
     * 
     * @param accountId
     *        AWS account ID where the activity occurred that prompted GuardDuty to generate a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * The ARN of a finding described by the action.
     * 
     * @param arn
     *        The ARN of a finding described by the action.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The ARN of a finding described by the action.
     * 
     * @return The ARN of a finding described by the action.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The ARN of a finding described by the action.
     * 
     * @param arn
     *        The ARN of a finding described by the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The confidence level of a finding.
     * 
     * @param confidence
     *        The confidence level of a finding.
     */

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    /**
     * The confidence level of a finding.
     * 
     * @return The confidence level of a finding.
     */

    public Double getConfidence() {
        return this.confidence;
    }

    /**
     * The confidence level of a finding.
     * 
     * @param confidence
     *        The confidence level of a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withConfidence(Double confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * The time stamp at which a finding was generated.
     * 
     * @param createdAt
     *        The time stamp at which a finding was generated.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The time stamp at which a finding was generated.
     * 
     * @return The time stamp at which a finding was generated.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * The time stamp at which a finding was generated.
     * 
     * @param createdAt
     *        The time stamp at which a finding was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * The description of a finding.
     * 
     * @param description
     *        The description of a finding.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The description of a finding.
     * 
     * @return The description of a finding.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * The description of a finding.
     * 
     * @param description
     *        The description of a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The identifier that corresponds to a finding described by the action.
     * 
     * @param id
     *        The identifier that corresponds to a finding described by the action.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The identifier that corresponds to a finding described by the action.
     * 
     * @return The identifier that corresponds to a finding described by the action.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The identifier that corresponds to a finding described by the action.
     * 
     * @param id
     *        The identifier that corresponds to a finding described by the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The AWS resource partition.
     * 
     * @param partition
     *        The AWS resource partition.
     */

    public void setPartition(String partition) {
        this.partition = partition;
    }

    /**
     * The AWS resource partition.
     * 
     * @return The AWS resource partition.
     */

    public String getPartition() {
        return this.partition;
    }

    /**
     * The AWS resource partition.
     * 
     * @param partition
     *        The AWS resource partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withPartition(String partition) {
        setPartition(partition);
        return this;
    }

    /**
     * The AWS region where the activity occurred that prompted GuardDuty to generate a finding.
     * 
     * @param region
     *        The AWS region where the activity occurred that prompted GuardDuty to generate a finding.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * The AWS region where the activity occurred that prompted GuardDuty to generate a finding.
     * 
     * @return The AWS region where the activity occurred that prompted GuardDuty to generate a finding.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * The AWS region where the activity occurred that prompted GuardDuty to generate a finding.
     * 
     * @param region
     *        The AWS region where the activity occurred that prompted GuardDuty to generate a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * The AWS resource associated with the activity that prompted GuardDuty to generate a finding.
     * 
     * @param resource
     *        The AWS resource associated with the activity that prompted GuardDuty to generate a finding.
     */

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * The AWS resource associated with the activity that prompted GuardDuty to generate a finding.
     * 
     * @return The AWS resource associated with the activity that prompted GuardDuty to generate a finding.
     */

    public Resource getResource() {
        return this.resource;
    }

    /**
     * The AWS resource associated with the activity that prompted GuardDuty to generate a finding.
     * 
     * @param resource
     *        The AWS resource associated with the activity that prompted GuardDuty to generate a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withResource(Resource resource) {
        setResource(resource);
        return this;
    }

    /**
     * Findings' schema version.
     * 
     * @param schemaVersion
     *        Findings' schema version.
     */

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * Findings' schema version.
     * 
     * @return Findings' schema version.
     */

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * Findings' schema version.
     * 
     * @param schemaVersion
     *        Findings' schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withSchemaVersion(String schemaVersion) {
        setSchemaVersion(schemaVersion);
        return this;
    }

    /**
     * Additional information assigned to the generated finding by GuardDuty.
     * 
     * @param service
     *        Additional information assigned to the generated finding by GuardDuty.
     */

    public void setService(Service service) {
        this.service = service;
    }

    /**
     * Additional information assigned to the generated finding by GuardDuty.
     * 
     * @return Additional information assigned to the generated finding by GuardDuty.
     */

    public Service getService() {
        return this.service;
    }

    /**
     * Additional information assigned to the generated finding by GuardDuty.
     * 
     * @param service
     *        Additional information assigned to the generated finding by GuardDuty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withService(Service service) {
        setService(service);
        return this;
    }

    /**
     * The severity of a finding.
     * 
     * @param severity
     *        The severity of a finding.
     */

    public void setSeverity(Double severity) {
        this.severity = severity;
    }

    /**
     * The severity of a finding.
     * 
     * @return The severity of a finding.
     */

    public Double getSeverity() {
        return this.severity;
    }

    /**
     * The severity of a finding.
     * 
     * @param severity
     *        The severity of a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withSeverity(Double severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * The title of a finding.
     * 
     * @param title
     *        The title of a finding.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The title of a finding.
     * 
     * @return The title of a finding.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * The title of a finding.
     * 
     * @param title
     *        The title of a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * The type of a finding described by the action.
     * 
     * @param type
     *        The type of a finding described by the action.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * The type of a finding described by the action.
     * 
     * @return The type of a finding described by the action.
     */

    public String getType() {
        return this.type;
    }

    /**
     * The type of a finding described by the action.
     * 
     * @param type
     *        The type of a finding described by the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withType(String type) {
        setType(type);
        return this;
    }

    /**
     * The time stamp at which a finding was last updated.
     * 
     * @param updatedAt
     *        The time stamp at which a finding was last updated.
     */

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * The time stamp at which a finding was last updated.
     * 
     * @return The time stamp at which a finding was last updated.
     */

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * The time stamp at which a finding was last updated.
     * 
     * @param updatedAt
     *        The time stamp at which a finding was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withUpdatedAt(String updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getPartition() != null)
            sb.append("Partition: ").append(getPartition()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: ").append(getSchemaVersion()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
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
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPartition() == null ^ this.getPartition() == null)
            return false;
        if (other.getPartition() != null && other.getPartition().equals(this.getPartition()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPartition() == null) ? 0 : getPartition().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
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
        com.amazonaws.services.guardduty.model.transform.FindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
