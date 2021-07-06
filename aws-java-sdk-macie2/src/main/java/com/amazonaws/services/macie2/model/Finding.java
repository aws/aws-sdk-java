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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the details of a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/Finding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Finding implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that the finding applies to. This is typically the
     * account that owns the affected resource.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Specifies whether the finding is archived (suppressed).
     * </p>
     */
    private Boolean archived;
    /**
     * <p>
     * The category of the finding. Possible values are: CLASSIFICATION, for a sensitive data finding; and, POLICY, for
     * a policy finding.
     * </p>
     */
    private String category;
    /**
     * <p>
     * The details of a sensitive data finding. This value is null for a policy finding.
     * </p>
     */
    private ClassificationDetails classificationDetails;
    /**
     * <p>
     * The total number of occurrences of the finding. For sensitive data findings, this value is always 1. All
     * sensitive data findings are considered new (unique) because they derive from individual classification jobs.
     * </p>
     */
    private Long count;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of the finding.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier for the finding. This is a random string that Amazon Macie generates and assigns to a
     * finding when it creates the finding.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Web Services partition that Amazon Macie created the finding in.
     * </p>
     */
    private String partition;
    /**
     * <p>
     * The details of a policy finding. This value is null for a sensitive data finding.
     * </p>
     */
    private PolicyDetails policyDetails;
    /**
     * <p>
     * The Amazon Web Services Region that Amazon Macie created the finding in.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The resources that the finding applies to.
     * </p>
     */
    private ResourcesAffected resourcesAffected;
    /**
     * <p>
     * Specifies whether the finding is a sample finding. A <i>sample finding</i> is a finding that uses example data to
     * demonstrate what a finding might contain.
     * </p>
     */
    private Boolean sample;
    /**
     * <p>
     * The version of the schema that was used to define the data structures in the finding.
     * </p>
     */
    private String schemaVersion;
    /**
     * <p>
     * The severity level and score for the finding.
     * </p>
     */
    private Severity severity;
    /**
     * <p>
     * The brief description of the finding.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The type of the finding.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding was last updated. For sensitive data
     * findings, this value is the same as the value for the createdAt property. All sensitive data findings are
     * considered new (unique) because they derive from individual classification jobs.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that the finding applies to. This is typically the
     * account that owns the affected resource.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account that the finding applies to. This is typically
     *        the account that owns the affected resource.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that the finding applies to. This is typically the
     * account that owns the affected resource.
     * </p>
     * 
     * @return The unique identifier for the Amazon Web Services account that the finding applies to. This is typically
     *         the account that owns the affected resource.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that the finding applies to. This is typically the
     * account that owns the affected resource.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account that the finding applies to. This is typically
     *        the account that owns the affected resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the finding is archived (suppressed).
     * </p>
     * 
     * @param archived
     *        Specifies whether the finding is archived (suppressed).
     */

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     * <p>
     * Specifies whether the finding is archived (suppressed).
     * </p>
     * 
     * @return Specifies whether the finding is archived (suppressed).
     */

    public Boolean getArchived() {
        return this.archived;
    }

    /**
     * <p>
     * Specifies whether the finding is archived (suppressed).
     * </p>
     * 
     * @param archived
     *        Specifies whether the finding is archived (suppressed).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withArchived(Boolean archived) {
        setArchived(archived);
        return this;
    }

    /**
     * <p>
     * Specifies whether the finding is archived (suppressed).
     * </p>
     * 
     * @return Specifies whether the finding is archived (suppressed).
     */

    public Boolean isArchived() {
        return this.archived;
    }

    /**
     * <p>
     * The category of the finding. Possible values are: CLASSIFICATION, for a sensitive data finding; and, POLICY, for
     * a policy finding.
     * </p>
     * 
     * @param category
     *        The category of the finding. Possible values are: CLASSIFICATION, for a sensitive data finding; and,
     *        POLICY, for a policy finding.
     * @see FindingCategory
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of the finding. Possible values are: CLASSIFICATION, for a sensitive data finding; and, POLICY, for
     * a policy finding.
     * </p>
     * 
     * @return The category of the finding. Possible values are: CLASSIFICATION, for a sensitive data finding; and,
     *         POLICY, for a policy finding.
     * @see FindingCategory
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of the finding. Possible values are: CLASSIFICATION, for a sensitive data finding; and, POLICY, for
     * a policy finding.
     * </p>
     * 
     * @param category
     *        The category of the finding. Possible values are: CLASSIFICATION, for a sensitive data finding; and,
     *        POLICY, for a policy finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingCategory
     */

    public Finding withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The category of the finding. Possible values are: CLASSIFICATION, for a sensitive data finding; and, POLICY, for
     * a policy finding.
     * </p>
     * 
     * @param category
     *        The category of the finding. Possible values are: CLASSIFICATION, for a sensitive data finding; and,
     *        POLICY, for a policy finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingCategory
     */

    public Finding withCategory(FindingCategory category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * The details of a sensitive data finding. This value is null for a policy finding.
     * </p>
     * 
     * @param classificationDetails
     *        The details of a sensitive data finding. This value is null for a policy finding.
     */

    public void setClassificationDetails(ClassificationDetails classificationDetails) {
        this.classificationDetails = classificationDetails;
    }

    /**
     * <p>
     * The details of a sensitive data finding. This value is null for a policy finding.
     * </p>
     * 
     * @return The details of a sensitive data finding. This value is null for a policy finding.
     */

    public ClassificationDetails getClassificationDetails() {
        return this.classificationDetails;
    }

    /**
     * <p>
     * The details of a sensitive data finding. This value is null for a policy finding.
     * </p>
     * 
     * @param classificationDetails
     *        The details of a sensitive data finding. This value is null for a policy finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withClassificationDetails(ClassificationDetails classificationDetails) {
        setClassificationDetails(classificationDetails);
        return this;
    }

    /**
     * <p>
     * The total number of occurrences of the finding. For sensitive data findings, this value is always 1. All
     * sensitive data findings are considered new (unique) because they derive from individual classification jobs.
     * </p>
     * 
     * @param count
     *        The total number of occurrences of the finding. For sensitive data findings, this value is always 1. All
     *        sensitive data findings are considered new (unique) because they derive from individual classification
     *        jobs.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The total number of occurrences of the finding. For sensitive data findings, this value is always 1. All
     * sensitive data findings are considered new (unique) because they derive from individual classification jobs.
     * </p>
     * 
     * @return The total number of occurrences of the finding. For sensitive data findings, this value is always 1. All
     *         sensitive data findings are considered new (unique) because they derive from individual classification
     *         jobs.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * The total number of occurrences of the finding. For sensitive data findings, this value is always 1. All
     * sensitive data findings are considered new (unique) because they derive from individual classification jobs.
     * </p>
     * 
     * @param count
     *        The total number of occurrences of the finding. For sensitive data findings, this value is always 1. All
     *        sensitive data findings are considered new (unique) because they derive from individual classification
     *        jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withCount(Long count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the finding was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding was created.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the finding was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the finding was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @param description
     *        The description of the finding.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @return The description of the finding.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @param description
     *        The description of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the finding. This is a random string that Amazon Macie generates and assigns to a
     * finding when it creates the finding.
     * </p>
     * 
     * @param id
     *        The unique identifier for the finding. This is a random string that Amazon Macie generates and assigns to
     *        a finding when it creates the finding.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the finding. This is a random string that Amazon Macie generates and assigns to a
     * finding when it creates the finding.
     * </p>
     * 
     * @return The unique identifier for the finding. This is a random string that Amazon Macie generates and assigns to
     *         a finding when it creates the finding.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the finding. This is a random string that Amazon Macie generates and assigns to a
     * finding when it creates the finding.
     * </p>
     * 
     * @param id
     *        The unique identifier for the finding. This is a random string that Amazon Macie generates and assigns to
     *        a finding when it creates the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services partition that Amazon Macie created the finding in.
     * </p>
     * 
     * @param partition
     *        The Amazon Web Services partition that Amazon Macie created the finding in.
     */

    public void setPartition(String partition) {
        this.partition = partition;
    }

    /**
     * <p>
     * The Amazon Web Services partition that Amazon Macie created the finding in.
     * </p>
     * 
     * @return The Amazon Web Services partition that Amazon Macie created the finding in.
     */

    public String getPartition() {
        return this.partition;
    }

    /**
     * <p>
     * The Amazon Web Services partition that Amazon Macie created the finding in.
     * </p>
     * 
     * @param partition
     *        The Amazon Web Services partition that Amazon Macie created the finding in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withPartition(String partition) {
        setPartition(partition);
        return this;
    }

    /**
     * <p>
     * The details of a policy finding. This value is null for a sensitive data finding.
     * </p>
     * 
     * @param policyDetails
     *        The details of a policy finding. This value is null for a sensitive data finding.
     */

    public void setPolicyDetails(PolicyDetails policyDetails) {
        this.policyDetails = policyDetails;
    }

    /**
     * <p>
     * The details of a policy finding. This value is null for a sensitive data finding.
     * </p>
     * 
     * @return The details of a policy finding. This value is null for a sensitive data finding.
     */

    public PolicyDetails getPolicyDetails() {
        return this.policyDetails;
    }

    /**
     * <p>
     * The details of a policy finding. This value is null for a sensitive data finding.
     * </p>
     * 
     * @param policyDetails
     *        The details of a policy finding. This value is null for a sensitive data finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withPolicyDetails(PolicyDetails policyDetails) {
        setPolicyDetails(policyDetails);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region that Amazon Macie created the finding in.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region that Amazon Macie created the finding in.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region that Amazon Macie created the finding in.
     * </p>
     * 
     * @return The Amazon Web Services Region that Amazon Macie created the finding in.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region that Amazon Macie created the finding in.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region that Amazon Macie created the finding in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The resources that the finding applies to.
     * </p>
     * 
     * @param resourcesAffected
     *        The resources that the finding applies to.
     */

    public void setResourcesAffected(ResourcesAffected resourcesAffected) {
        this.resourcesAffected = resourcesAffected;
    }

    /**
     * <p>
     * The resources that the finding applies to.
     * </p>
     * 
     * @return The resources that the finding applies to.
     */

    public ResourcesAffected getResourcesAffected() {
        return this.resourcesAffected;
    }

    /**
     * <p>
     * The resources that the finding applies to.
     * </p>
     * 
     * @param resourcesAffected
     *        The resources that the finding applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withResourcesAffected(ResourcesAffected resourcesAffected) {
        setResourcesAffected(resourcesAffected);
        return this;
    }

    /**
     * <p>
     * Specifies whether the finding is a sample finding. A <i>sample finding</i> is a finding that uses example data to
     * demonstrate what a finding might contain.
     * </p>
     * 
     * @param sample
     *        Specifies whether the finding is a sample finding. A <i>sample finding</i> is a finding that uses example
     *        data to demonstrate what a finding might contain.
     */

    public void setSample(Boolean sample) {
        this.sample = sample;
    }

    /**
     * <p>
     * Specifies whether the finding is a sample finding. A <i>sample finding</i> is a finding that uses example data to
     * demonstrate what a finding might contain.
     * </p>
     * 
     * @return Specifies whether the finding is a sample finding. A <i>sample finding</i> is a finding that uses example
     *         data to demonstrate what a finding might contain.
     */

    public Boolean getSample() {
        return this.sample;
    }

    /**
     * <p>
     * Specifies whether the finding is a sample finding. A <i>sample finding</i> is a finding that uses example data to
     * demonstrate what a finding might contain.
     * </p>
     * 
     * @param sample
     *        Specifies whether the finding is a sample finding. A <i>sample finding</i> is a finding that uses example
     *        data to demonstrate what a finding might contain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withSample(Boolean sample) {
        setSample(sample);
        return this;
    }

    /**
     * <p>
     * Specifies whether the finding is a sample finding. A <i>sample finding</i> is a finding that uses example data to
     * demonstrate what a finding might contain.
     * </p>
     * 
     * @return Specifies whether the finding is a sample finding. A <i>sample finding</i> is a finding that uses example
     *         data to demonstrate what a finding might contain.
     */

    public Boolean isSample() {
        return this.sample;
    }

    /**
     * <p>
     * The version of the schema that was used to define the data structures in the finding.
     * </p>
     * 
     * @param schemaVersion
     *        The version of the schema that was used to define the data structures in the finding.
     */

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The version of the schema that was used to define the data structures in the finding.
     * </p>
     * 
     * @return The version of the schema that was used to define the data structures in the finding.
     */

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * <p>
     * The version of the schema that was used to define the data structures in the finding.
     * </p>
     * 
     * @param schemaVersion
     *        The version of the schema that was used to define the data structures in the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withSchemaVersion(String schemaVersion) {
        setSchemaVersion(schemaVersion);
        return this;
    }

    /**
     * <p>
     * The severity level and score for the finding.
     * </p>
     * 
     * @param severity
     *        The severity level and score for the finding.
     */

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity level and score for the finding.
     * </p>
     * 
     * @return The severity level and score for the finding.
     */

    public Severity getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity level and score for the finding.
     * </p>
     * 
     * @param severity
     *        The severity level and score for the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withSeverity(Severity severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The brief description of the finding.
     * </p>
     * 
     * @param title
     *        The brief description of the finding.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The brief description of the finding.
     * </p>
     * 
     * @return The brief description of the finding.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The brief description of the finding.
     * </p>
     * 
     * @param title
     *        The brief description of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The type of the finding.
     * </p>
     * 
     * @param type
     *        The type of the finding.
     * @see FindingType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the finding.
     * </p>
     * 
     * @return The type of the finding.
     * @see FindingType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the finding.
     * </p>
     * 
     * @param type
     *        The type of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingType
     */

    public Finding withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the finding.
     * </p>
     * 
     * @param type
     *        The type of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingType
     */

    public Finding withType(FindingType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding was last updated. For sensitive data
     * findings, this value is the same as the value for the createdAt property. All sensitive data findings are
     * considered new (unique) because they derive from individual classification jobs.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in UTC and extended ISO 8601 format, when the finding was last updated. For sensitive
     *        data findings, this value is the same as the value for the createdAt property. All sensitive data findings
     *        are considered new (unique) because they derive from individual classification jobs.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding was last updated. For sensitive data
     * findings, this value is the same as the value for the createdAt property. All sensitive data findings are
     * considered new (unique) because they derive from individual classification jobs.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the finding was last updated. For sensitive
     *         data findings, this value is the same as the value for the createdAt property. All sensitive data
     *         findings are considered new (unique) because they derive from individual classification jobs.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the finding was last updated. For sensitive data
     * findings, this value is the same as the value for the createdAt property. All sensitive data findings are
     * considered new (unique) because they derive from individual classification jobs.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in UTC and extended ISO 8601 format, when the finding was last updated. For sensitive
     *        data findings, this value is the same as the value for the createdAt property. All sensitive data findings
     *        are considered new (unique) because they derive from individual classification jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withUpdatedAt(java.util.Date updatedAt) {
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
        if (getArchived() != null)
            sb.append("Archived: ").append(getArchived()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getClassificationDetails() != null)
            sb.append("ClassificationDetails: ").append(getClassificationDetails()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getPartition() != null)
            sb.append("Partition: ").append(getPartition()).append(",");
        if (getPolicyDetails() != null)
            sb.append("PolicyDetails: ").append(getPolicyDetails()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getResourcesAffected() != null)
            sb.append("ResourcesAffected: ").append(getResourcesAffected()).append(",");
        if (getSample() != null)
            sb.append("Sample: ").append(getSample()).append(",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: ").append(getSchemaVersion()).append(",");
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
        if (other.getArchived() == null ^ this.getArchived() == null)
            return false;
        if (other.getArchived() != null && other.getArchived().equals(this.getArchived()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getClassificationDetails() == null ^ this.getClassificationDetails() == null)
            return false;
        if (other.getClassificationDetails() != null && other.getClassificationDetails().equals(this.getClassificationDetails()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
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
        if (other.getPolicyDetails() == null ^ this.getPolicyDetails() == null)
            return false;
        if (other.getPolicyDetails() != null && other.getPolicyDetails().equals(this.getPolicyDetails()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getResourcesAffected() == null ^ this.getResourcesAffected() == null)
            return false;
        if (other.getResourcesAffected() != null && other.getResourcesAffected().equals(this.getResourcesAffected()) == false)
            return false;
        if (other.getSample() == null ^ this.getSample() == null)
            return false;
        if (other.getSample() != null && other.getSample().equals(this.getSample()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
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
        hashCode = prime * hashCode + ((getArchived() == null) ? 0 : getArchived().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getClassificationDetails() == null) ? 0 : getClassificationDetails().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPartition() == null) ? 0 : getPartition().hashCode());
        hashCode = prime * hashCode + ((getPolicyDetails() == null) ? 0 : getPolicyDetails().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getResourcesAffected() == null) ? 0 : getResourcesAffected().hashCode());
        hashCode = prime * hashCode + ((getSample() == null) ? 0 : getSample().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
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
        com.amazonaws.services.macie2.model.transform.FindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
