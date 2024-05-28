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
package com.amazonaws.services.artifact.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Full detail for report resource metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/artifact-2018-05-10/ReportDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Acceptance type for report.
     * </p>
     */
    private String acceptanceType;
    /**
     * <p>
     * ARN for the report resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Category for the report resource.
     * </p>
     */
    private String category;
    /**
     * <p>
     * Associated company name for the report resource.
     * </p>
     */
    private String companyName;
    /**
     * <p>
     * Timestamp indicating when the report resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Timestamp indicating when the report resource was deleted.
     * </p>
     */
    private java.util.Date deletedAt;
    /**
     * <p>
     * Description for the report resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Unique resource ID for the report resource.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Timestamp indicating when the report resource was last modified.
     * </p>
     */
    private java.util.Date lastModifiedAt;
    /**
     * <p>
     * Name for the report resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Timestamp indicating the report resource effective end.
     * </p>
     */
    private java.util.Date periodEnd;
    /**
     * <p>
     * Timestamp indicating the report resource effective start.
     * </p>
     */
    private java.util.Date periodStart;
    /**
     * <p>
     * Associated product name for the report resource.
     * </p>
     */
    private String productName;
    /**
     * <p>
     * Sequence number to enforce optimistic locking.
     * </p>
     */
    private Long sequenceNumber;
    /**
     * <p>
     * Series for the report resource.
     * </p>
     */
    private String series;
    /**
     * <p>
     * Current state of the report resource
     * </p>
     */
    private String state;
    /**
     * <p>
     * The message associated with the current upload state.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Unique resource ARN for term resource.
     * </p>
     */
    private String termArn;
    /**
     * <p>
     * The current state of the document upload.
     * </p>
     */
    private String uploadState;
    /**
     * <p>
     * Version for the report resource.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * Acceptance type for report.
     * </p>
     * 
     * @param acceptanceType
     *        Acceptance type for report.
     * @see AcceptanceType
     */

    public void setAcceptanceType(String acceptanceType) {
        this.acceptanceType = acceptanceType;
    }

    /**
     * <p>
     * Acceptance type for report.
     * </p>
     * 
     * @return Acceptance type for report.
     * @see AcceptanceType
     */

    public String getAcceptanceType() {
        return this.acceptanceType;
    }

    /**
     * <p>
     * Acceptance type for report.
     * </p>
     * 
     * @param acceptanceType
     *        Acceptance type for report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptanceType
     */

    public ReportDetail withAcceptanceType(String acceptanceType) {
        setAcceptanceType(acceptanceType);
        return this;
    }

    /**
     * <p>
     * Acceptance type for report.
     * </p>
     * 
     * @param acceptanceType
     *        Acceptance type for report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptanceType
     */

    public ReportDetail withAcceptanceType(AcceptanceType acceptanceType) {
        this.acceptanceType = acceptanceType.toString();
        return this;
    }

    /**
     * <p>
     * ARN for the report resource.
     * </p>
     * 
     * @param arn
     *        ARN for the report resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * ARN for the report resource.
     * </p>
     * 
     * @return ARN for the report resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * ARN for the report resource.
     * </p>
     * 
     * @param arn
     *        ARN for the report resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Category for the report resource.
     * </p>
     * 
     * @param category
     *        Category for the report resource.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * Category for the report resource.
     * </p>
     * 
     * @return Category for the report resource.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * Category for the report resource.
     * </p>
     * 
     * @param category
     *        Category for the report resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * Associated company name for the report resource.
     * </p>
     * 
     * @param companyName
     *        Associated company name for the report resource.
     */

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * <p>
     * Associated company name for the report resource.
     * </p>
     * 
     * @return Associated company name for the report resource.
     */

    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * <p>
     * Associated company name for the report resource.
     * </p>
     * 
     * @param companyName
     *        Associated company name for the report resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withCompanyName(String companyName) {
        setCompanyName(companyName);
        return this;
    }

    /**
     * <p>
     * Timestamp indicating when the report resource was created.
     * </p>
     * 
     * @param createdAt
     *        Timestamp indicating when the report resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Timestamp indicating when the report resource was created.
     * </p>
     * 
     * @return Timestamp indicating when the report resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Timestamp indicating when the report resource was created.
     * </p>
     * 
     * @param createdAt
     *        Timestamp indicating when the report resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Timestamp indicating when the report resource was deleted.
     * </p>
     * 
     * @param deletedAt
     *        Timestamp indicating when the report resource was deleted.
     */

    public void setDeletedAt(java.util.Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * <p>
     * Timestamp indicating when the report resource was deleted.
     * </p>
     * 
     * @return Timestamp indicating when the report resource was deleted.
     */

    public java.util.Date getDeletedAt() {
        return this.deletedAt;
    }

    /**
     * <p>
     * Timestamp indicating when the report resource was deleted.
     * </p>
     * 
     * @param deletedAt
     *        Timestamp indicating when the report resource was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withDeletedAt(java.util.Date deletedAt) {
        setDeletedAt(deletedAt);
        return this;
    }

    /**
     * <p>
     * Description for the report resource.
     * </p>
     * 
     * @param description
     *        Description for the report resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description for the report resource.
     * </p>
     * 
     * @return Description for the report resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description for the report resource.
     * </p>
     * 
     * @param description
     *        Description for the report resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Unique resource ID for the report resource.
     * </p>
     * 
     * @param id
     *        Unique resource ID for the report resource.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Unique resource ID for the report resource.
     * </p>
     * 
     * @return Unique resource ID for the report resource.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Unique resource ID for the report resource.
     * </p>
     * 
     * @param id
     *        Unique resource ID for the report resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Timestamp indicating when the report resource was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        Timestamp indicating when the report resource was last modified.
     */

    public void setLastModifiedAt(java.util.Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * <p>
     * Timestamp indicating when the report resource was last modified.
     * </p>
     * 
     * @return Timestamp indicating when the report resource was last modified.
     */

    public java.util.Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * <p>
     * Timestamp indicating when the report resource was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        Timestamp indicating when the report resource was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withLastModifiedAt(java.util.Date lastModifiedAt) {
        setLastModifiedAt(lastModifiedAt);
        return this;
    }

    /**
     * <p>
     * Name for the report resource.
     * </p>
     * 
     * @param name
     *        Name for the report resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name for the report resource.
     * </p>
     * 
     * @return Name for the report resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name for the report resource.
     * </p>
     * 
     * @param name
     *        Name for the report resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Timestamp indicating the report resource effective end.
     * </p>
     * 
     * @param periodEnd
     *        Timestamp indicating the report resource effective end.
     */

    public void setPeriodEnd(java.util.Date periodEnd) {
        this.periodEnd = periodEnd;
    }

    /**
     * <p>
     * Timestamp indicating the report resource effective end.
     * </p>
     * 
     * @return Timestamp indicating the report resource effective end.
     */

    public java.util.Date getPeriodEnd() {
        return this.periodEnd;
    }

    /**
     * <p>
     * Timestamp indicating the report resource effective end.
     * </p>
     * 
     * @param periodEnd
     *        Timestamp indicating the report resource effective end.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withPeriodEnd(java.util.Date periodEnd) {
        setPeriodEnd(periodEnd);
        return this;
    }

    /**
     * <p>
     * Timestamp indicating the report resource effective start.
     * </p>
     * 
     * @param periodStart
     *        Timestamp indicating the report resource effective start.
     */

    public void setPeriodStart(java.util.Date periodStart) {
        this.periodStart = periodStart;
    }

    /**
     * <p>
     * Timestamp indicating the report resource effective start.
     * </p>
     * 
     * @return Timestamp indicating the report resource effective start.
     */

    public java.util.Date getPeriodStart() {
        return this.periodStart;
    }

    /**
     * <p>
     * Timestamp indicating the report resource effective start.
     * </p>
     * 
     * @param periodStart
     *        Timestamp indicating the report resource effective start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withPeriodStart(java.util.Date periodStart) {
        setPeriodStart(periodStart);
        return this;
    }

    /**
     * <p>
     * Associated product name for the report resource.
     * </p>
     * 
     * @param productName
     *        Associated product name for the report resource.
     */

    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * <p>
     * Associated product name for the report resource.
     * </p>
     * 
     * @return Associated product name for the report resource.
     */

    public String getProductName() {
        return this.productName;
    }

    /**
     * <p>
     * Associated product name for the report resource.
     * </p>
     * 
     * @param productName
     *        Associated product name for the report resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withProductName(String productName) {
        setProductName(productName);
        return this;
    }

    /**
     * <p>
     * Sequence number to enforce optimistic locking.
     * </p>
     * 
     * @param sequenceNumber
     *        Sequence number to enforce optimistic locking.
     */

    public void setSequenceNumber(Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * <p>
     * Sequence number to enforce optimistic locking.
     * </p>
     * 
     * @return Sequence number to enforce optimistic locking.
     */

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * <p>
     * Sequence number to enforce optimistic locking.
     * </p>
     * 
     * @param sequenceNumber
     *        Sequence number to enforce optimistic locking.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withSequenceNumber(Long sequenceNumber) {
        setSequenceNumber(sequenceNumber);
        return this;
    }

    /**
     * <p>
     * Series for the report resource.
     * </p>
     * 
     * @param series
     *        Series for the report resource.
     */

    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * <p>
     * Series for the report resource.
     * </p>
     * 
     * @return Series for the report resource.
     */

    public String getSeries() {
        return this.series;
    }

    /**
     * <p>
     * Series for the report resource.
     * </p>
     * 
     * @param series
     *        Series for the report resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withSeries(String series) {
        setSeries(series);
        return this;
    }

    /**
     * <p>
     * Current state of the report resource
     * </p>
     * 
     * @param state
     *        Current state of the report resource
     * @see PublishedState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Current state of the report resource
     * </p>
     * 
     * @return Current state of the report resource
     * @see PublishedState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Current state of the report resource
     * </p>
     * 
     * @param state
     *        Current state of the report resource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PublishedState
     */

    public ReportDetail withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Current state of the report resource
     * </p>
     * 
     * @param state
     *        Current state of the report resource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PublishedState
     */

    public ReportDetail withState(PublishedState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The message associated with the current upload state.
     * </p>
     * 
     * @param statusMessage
     *        The message associated with the current upload state.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The message associated with the current upload state.
     * </p>
     * 
     * @return The message associated with the current upload state.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The message associated with the current upload state.
     * </p>
     * 
     * @param statusMessage
     *        The message associated with the current upload state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Unique resource ARN for term resource.
     * </p>
     * 
     * @param termArn
     *        Unique resource ARN for term resource.
     */

    public void setTermArn(String termArn) {
        this.termArn = termArn;
    }

    /**
     * <p>
     * Unique resource ARN for term resource.
     * </p>
     * 
     * @return Unique resource ARN for term resource.
     */

    public String getTermArn() {
        return this.termArn;
    }

    /**
     * <p>
     * Unique resource ARN for term resource.
     * </p>
     * 
     * @param termArn
     *        Unique resource ARN for term resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withTermArn(String termArn) {
        setTermArn(termArn);
        return this;
    }

    /**
     * <p>
     * The current state of the document upload.
     * </p>
     * 
     * @param uploadState
     *        The current state of the document upload.
     * @see UploadState
     */

    public void setUploadState(String uploadState) {
        this.uploadState = uploadState;
    }

    /**
     * <p>
     * The current state of the document upload.
     * </p>
     * 
     * @return The current state of the document upload.
     * @see UploadState
     */

    public String getUploadState() {
        return this.uploadState;
    }

    /**
     * <p>
     * The current state of the document upload.
     * </p>
     * 
     * @param uploadState
     *        The current state of the document upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadState
     */

    public ReportDetail withUploadState(String uploadState) {
        setUploadState(uploadState);
        return this;
    }

    /**
     * <p>
     * The current state of the document upload.
     * </p>
     * 
     * @param uploadState
     *        The current state of the document upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadState
     */

    public ReportDetail withUploadState(UploadState uploadState) {
        this.uploadState = uploadState.toString();
        return this;
    }

    /**
     * <p>
     * Version for the report resource.
     * </p>
     * 
     * @param version
     *        Version for the report resource.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * Version for the report resource.
     * </p>
     * 
     * @return Version for the report resource.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version for the report resource.
     * </p>
     * 
     * @param version
     *        Version for the report resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportDetail withVersion(Long version) {
        setVersion(version);
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
        if (getAcceptanceType() != null)
            sb.append("AcceptanceType: ").append(getAcceptanceType()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getCompanyName() != null)
            sb.append("CompanyName: ").append(getCompanyName()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDeletedAt() != null)
            sb.append("DeletedAt: ").append(getDeletedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastModifiedAt() != null)
            sb.append("LastModifiedAt: ").append(getLastModifiedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPeriodEnd() != null)
            sb.append("PeriodEnd: ").append(getPeriodEnd()).append(",");
        if (getPeriodStart() != null)
            sb.append("PeriodStart: ").append(getPeriodStart()).append(",");
        if (getProductName() != null)
            sb.append("ProductName: ").append(getProductName()).append(",");
        if (getSequenceNumber() != null)
            sb.append("SequenceNumber: ").append(getSequenceNumber()).append(",");
        if (getSeries() != null)
            sb.append("Series: ").append(getSeries()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getTermArn() != null)
            sb.append("TermArn: ").append(getTermArn()).append(",");
        if (getUploadState() != null)
            sb.append("UploadState: ").append(getUploadState()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportDetail == false)
            return false;
        ReportDetail other = (ReportDetail) obj;
        if (other.getAcceptanceType() == null ^ this.getAcceptanceType() == null)
            return false;
        if (other.getAcceptanceType() != null && other.getAcceptanceType().equals(this.getAcceptanceType()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getCompanyName() == null ^ this.getCompanyName() == null)
            return false;
        if (other.getCompanyName() != null && other.getCompanyName().equals(this.getCompanyName()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeletedAt() == null ^ this.getDeletedAt() == null)
            return false;
        if (other.getDeletedAt() != null && other.getDeletedAt().equals(this.getDeletedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModifiedAt() == null ^ this.getLastModifiedAt() == null)
            return false;
        if (other.getLastModifiedAt() != null && other.getLastModifiedAt().equals(this.getLastModifiedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPeriodEnd() == null ^ this.getPeriodEnd() == null)
            return false;
        if (other.getPeriodEnd() != null && other.getPeriodEnd().equals(this.getPeriodEnd()) == false)
            return false;
        if (other.getPeriodStart() == null ^ this.getPeriodStart() == null)
            return false;
        if (other.getPeriodStart() != null && other.getPeriodStart().equals(this.getPeriodStart()) == false)
            return false;
        if (other.getProductName() == null ^ this.getProductName() == null)
            return false;
        if (other.getProductName() != null && other.getProductName().equals(this.getProductName()) == false)
            return false;
        if (other.getSequenceNumber() == null ^ this.getSequenceNumber() == null)
            return false;
        if (other.getSequenceNumber() != null && other.getSequenceNumber().equals(this.getSequenceNumber()) == false)
            return false;
        if (other.getSeries() == null ^ this.getSeries() == null)
            return false;
        if (other.getSeries() != null && other.getSeries().equals(this.getSeries()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTermArn() == null ^ this.getTermArn() == null)
            return false;
        if (other.getTermArn() != null && other.getTermArn().equals(this.getTermArn()) == false)
            return false;
        if (other.getUploadState() == null ^ this.getUploadState() == null)
            return false;
        if (other.getUploadState() != null && other.getUploadState().equals(this.getUploadState()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptanceType() == null) ? 0 : getAcceptanceType().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeletedAt() == null) ? 0 : getDeletedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAt() == null) ? 0 : getLastModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPeriodEnd() == null) ? 0 : getPeriodEnd().hashCode());
        hashCode = prime * hashCode + ((getPeriodStart() == null) ? 0 : getPeriodStart().hashCode());
        hashCode = prime * hashCode + ((getProductName() == null) ? 0 : getProductName().hashCode());
        hashCode = prime * hashCode + ((getSequenceNumber() == null) ? 0 : getSequenceNumber().hashCode());
        hashCode = prime * hashCode + ((getSeries() == null) ? 0 : getSeries().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTermArn() == null) ? 0 : getTermArn().hashCode());
        hashCode = prime * hashCode + ((getUploadState() == null) ? 0 : getUploadState().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public ReportDetail clone() {
        try {
            return (ReportDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.artifact.model.transform.ReportDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
