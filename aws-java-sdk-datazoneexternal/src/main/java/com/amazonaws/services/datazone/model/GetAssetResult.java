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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetAsset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of when the asset was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon DataZone user who created the asset.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The description of the Amazon DataZone asset.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the Amazon DataZone domain to which the asset belongs.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The external ID of the asset.
     * </p>
     */
    private String externalIdentifier;
    /**
     * <p>
     * The timestamp of when the first revision of the asset was created.
     * </p>
     */
    private java.util.Date firstRevisionCreatedAt;
    /**
     * <p>
     * The Amazon DataZone user who created the first revision of the asset.
     * </p>
     */
    private String firstRevisionCreatedBy;
    /**
     * <p>
     * The metadata forms attached to the asset.
     * </p>
     */
    private java.util.List<FormOutput> formsOutput;
    /**
     * <p>
     * The business glossary terms attached to the asset.
     * </p>
     */
    private java.util.List<String> glossaryTerms;
    /**
     * <p>
     * The ID of the asset.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The latest data point that was imported into the time series form for the asset.
     * </p>
     */
    private java.util.List<TimeSeriesDataPointSummaryFormOutput> latestTimeSeriesDataPointFormsOutput;
    /**
     * <p>
     * The listing of the asset.
     * </p>
     */
    private AssetListingDetails listing;
    /**
     * <p>
     * The name of the asset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the project that owns the asset.
     * </p>
     */
    private String owningProjectId;
    /**
     * <p>
     * The read-only metadata forms attached to the asset.
     * </p>
     */
    private java.util.List<FormOutput> readOnlyFormsOutput;
    /**
     * <p>
     * The revision of the asset.
     * </p>
     */
    private String revision;
    /**
     * <p>
     * The ID of the asset type.
     * </p>
     */
    private String typeIdentifier;
    /**
     * <p>
     * The revision of the asset type.
     * </p>
     */
    private String typeRevision;

    /**
     * <p>
     * The timestamp of when the asset was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the asset was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the asset was created.
     * </p>
     * 
     * @return The timestamp of when the asset was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the asset was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the asset was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the asset.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the asset.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the asset.
     * </p>
     * 
     * @return The Amazon DataZone user who created the asset.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the asset.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The description of the Amazon DataZone asset.
     * </p>
     * 
     * @param description
     *        The description of the Amazon DataZone asset.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Amazon DataZone asset.
     * </p>
     * 
     * @return The description of the Amazon DataZone asset.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the Amazon DataZone asset.
     * </p>
     * 
     * @param description
     *        The description of the Amazon DataZone asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain to which the asset belongs.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain to which the asset belongs.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain to which the asset belongs.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain to which the asset belongs.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain to which the asset belongs.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain to which the asset belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The external ID of the asset.
     * </p>
     * 
     * @param externalIdentifier
     *        The external ID of the asset.
     */

    public void setExternalIdentifier(String externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
    }

    /**
     * <p>
     * The external ID of the asset.
     * </p>
     * 
     * @return The external ID of the asset.
     */

    public String getExternalIdentifier() {
        return this.externalIdentifier;
    }

    /**
     * <p>
     * The external ID of the asset.
     * </p>
     * 
     * @param externalIdentifier
     *        The external ID of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withExternalIdentifier(String externalIdentifier) {
        setExternalIdentifier(externalIdentifier);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the first revision of the asset was created.
     * </p>
     * 
     * @param firstRevisionCreatedAt
     *        The timestamp of when the first revision of the asset was created.
     */

    public void setFirstRevisionCreatedAt(java.util.Date firstRevisionCreatedAt) {
        this.firstRevisionCreatedAt = firstRevisionCreatedAt;
    }

    /**
     * <p>
     * The timestamp of when the first revision of the asset was created.
     * </p>
     * 
     * @return The timestamp of when the first revision of the asset was created.
     */

    public java.util.Date getFirstRevisionCreatedAt() {
        return this.firstRevisionCreatedAt;
    }

    /**
     * <p>
     * The timestamp of when the first revision of the asset was created.
     * </p>
     * 
     * @param firstRevisionCreatedAt
     *        The timestamp of when the first revision of the asset was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withFirstRevisionCreatedAt(java.util.Date firstRevisionCreatedAt) {
        setFirstRevisionCreatedAt(firstRevisionCreatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the first revision of the asset.
     * </p>
     * 
     * @param firstRevisionCreatedBy
     *        The Amazon DataZone user who created the first revision of the asset.
     */

    public void setFirstRevisionCreatedBy(String firstRevisionCreatedBy) {
        this.firstRevisionCreatedBy = firstRevisionCreatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the first revision of the asset.
     * </p>
     * 
     * @return The Amazon DataZone user who created the first revision of the asset.
     */

    public String getFirstRevisionCreatedBy() {
        return this.firstRevisionCreatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the first revision of the asset.
     * </p>
     * 
     * @param firstRevisionCreatedBy
     *        The Amazon DataZone user who created the first revision of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withFirstRevisionCreatedBy(String firstRevisionCreatedBy) {
        setFirstRevisionCreatedBy(firstRevisionCreatedBy);
        return this;
    }

    /**
     * <p>
     * The metadata forms attached to the asset.
     * </p>
     * 
     * @return The metadata forms attached to the asset.
     */

    public java.util.List<FormOutput> getFormsOutput() {
        return formsOutput;
    }

    /**
     * <p>
     * The metadata forms attached to the asset.
     * </p>
     * 
     * @param formsOutput
     *        The metadata forms attached to the asset.
     */

    public void setFormsOutput(java.util.Collection<FormOutput> formsOutput) {
        if (formsOutput == null) {
            this.formsOutput = null;
            return;
        }

        this.formsOutput = new java.util.ArrayList<FormOutput>(formsOutput);
    }

    /**
     * <p>
     * The metadata forms attached to the asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFormsOutput(java.util.Collection)} or {@link #withFormsOutput(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param formsOutput
     *        The metadata forms attached to the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withFormsOutput(FormOutput... formsOutput) {
        if (this.formsOutput == null) {
            setFormsOutput(new java.util.ArrayList<FormOutput>(formsOutput.length));
        }
        for (FormOutput ele : formsOutput) {
            this.formsOutput.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata forms attached to the asset.
     * </p>
     * 
     * @param formsOutput
     *        The metadata forms attached to the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withFormsOutput(java.util.Collection<FormOutput> formsOutput) {
        setFormsOutput(formsOutput);
        return this;
    }

    /**
     * <p>
     * The business glossary terms attached to the asset.
     * </p>
     * 
     * @return The business glossary terms attached to the asset.
     */

    public java.util.List<String> getGlossaryTerms() {
        return glossaryTerms;
    }

    /**
     * <p>
     * The business glossary terms attached to the asset.
     * </p>
     * 
     * @param glossaryTerms
     *        The business glossary terms attached to the asset.
     */

    public void setGlossaryTerms(java.util.Collection<String> glossaryTerms) {
        if (glossaryTerms == null) {
            this.glossaryTerms = null;
            return;
        }

        this.glossaryTerms = new java.util.ArrayList<String>(glossaryTerms);
    }

    /**
     * <p>
     * The business glossary terms attached to the asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlossaryTerms(java.util.Collection)} or {@link #withGlossaryTerms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param glossaryTerms
     *        The business glossary terms attached to the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withGlossaryTerms(String... glossaryTerms) {
        if (this.glossaryTerms == null) {
            setGlossaryTerms(new java.util.ArrayList<String>(glossaryTerms.length));
        }
        for (String ele : glossaryTerms) {
            this.glossaryTerms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The business glossary terms attached to the asset.
     * </p>
     * 
     * @param glossaryTerms
     *        The business glossary terms attached to the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withGlossaryTerms(java.util.Collection<String> glossaryTerms) {
        setGlossaryTerms(glossaryTerms);
        return this;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param id
     *        The ID of the asset.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @return The ID of the asset.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param id
     *        The ID of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The latest data point that was imported into the time series form for the asset.
     * </p>
     * 
     * @return The latest data point that was imported into the time series form for the asset.
     */

    public java.util.List<TimeSeriesDataPointSummaryFormOutput> getLatestTimeSeriesDataPointFormsOutput() {
        return latestTimeSeriesDataPointFormsOutput;
    }

    /**
     * <p>
     * The latest data point that was imported into the time series form for the asset.
     * </p>
     * 
     * @param latestTimeSeriesDataPointFormsOutput
     *        The latest data point that was imported into the time series form for the asset.
     */

    public void setLatestTimeSeriesDataPointFormsOutput(java.util.Collection<TimeSeriesDataPointSummaryFormOutput> latestTimeSeriesDataPointFormsOutput) {
        if (latestTimeSeriesDataPointFormsOutput == null) {
            this.latestTimeSeriesDataPointFormsOutput = null;
            return;
        }

        this.latestTimeSeriesDataPointFormsOutput = new java.util.ArrayList<TimeSeriesDataPointSummaryFormOutput>(latestTimeSeriesDataPointFormsOutput);
    }

    /**
     * <p>
     * The latest data point that was imported into the time series form for the asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLatestTimeSeriesDataPointFormsOutput(java.util.Collection)} or
     * {@link #withLatestTimeSeriesDataPointFormsOutput(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param latestTimeSeriesDataPointFormsOutput
     *        The latest data point that was imported into the time series form for the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withLatestTimeSeriesDataPointFormsOutput(TimeSeriesDataPointSummaryFormOutput... latestTimeSeriesDataPointFormsOutput) {
        if (this.latestTimeSeriesDataPointFormsOutput == null) {
            setLatestTimeSeriesDataPointFormsOutput(new java.util.ArrayList<TimeSeriesDataPointSummaryFormOutput>(latestTimeSeriesDataPointFormsOutput.length));
        }
        for (TimeSeriesDataPointSummaryFormOutput ele : latestTimeSeriesDataPointFormsOutput) {
            this.latestTimeSeriesDataPointFormsOutput.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The latest data point that was imported into the time series form for the asset.
     * </p>
     * 
     * @param latestTimeSeriesDataPointFormsOutput
     *        The latest data point that was imported into the time series form for the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withLatestTimeSeriesDataPointFormsOutput(
            java.util.Collection<TimeSeriesDataPointSummaryFormOutput> latestTimeSeriesDataPointFormsOutput) {
        setLatestTimeSeriesDataPointFormsOutput(latestTimeSeriesDataPointFormsOutput);
        return this;
    }

    /**
     * <p>
     * The listing of the asset.
     * </p>
     * 
     * @param listing
     *        The listing of the asset.
     */

    public void setListing(AssetListingDetails listing) {
        this.listing = listing;
    }

    /**
     * <p>
     * The listing of the asset.
     * </p>
     * 
     * @return The listing of the asset.
     */

    public AssetListingDetails getListing() {
        return this.listing;
    }

    /**
     * <p>
     * The listing of the asset.
     * </p>
     * 
     * @param listing
     *        The listing of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withListing(AssetListingDetails listing) {
        setListing(listing);
        return this;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @param name
     *        The name of the asset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @return The name of the asset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @param name
     *        The name of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the project that owns the asset.
     * </p>
     * 
     * @param owningProjectId
     *        The ID of the project that owns the asset.
     */

    public void setOwningProjectId(String owningProjectId) {
        this.owningProjectId = owningProjectId;
    }

    /**
     * <p>
     * The ID of the project that owns the asset.
     * </p>
     * 
     * @return The ID of the project that owns the asset.
     */

    public String getOwningProjectId() {
        return this.owningProjectId;
    }

    /**
     * <p>
     * The ID of the project that owns the asset.
     * </p>
     * 
     * @param owningProjectId
     *        The ID of the project that owns the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withOwningProjectId(String owningProjectId) {
        setOwningProjectId(owningProjectId);
        return this;
    }

    /**
     * <p>
     * The read-only metadata forms attached to the asset.
     * </p>
     * 
     * @return The read-only metadata forms attached to the asset.
     */

    public java.util.List<FormOutput> getReadOnlyFormsOutput() {
        return readOnlyFormsOutput;
    }

    /**
     * <p>
     * The read-only metadata forms attached to the asset.
     * </p>
     * 
     * @param readOnlyFormsOutput
     *        The read-only metadata forms attached to the asset.
     */

    public void setReadOnlyFormsOutput(java.util.Collection<FormOutput> readOnlyFormsOutput) {
        if (readOnlyFormsOutput == null) {
            this.readOnlyFormsOutput = null;
            return;
        }

        this.readOnlyFormsOutput = new java.util.ArrayList<FormOutput>(readOnlyFormsOutput);
    }

    /**
     * <p>
     * The read-only metadata forms attached to the asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadOnlyFormsOutput(java.util.Collection)} or {@link #withReadOnlyFormsOutput(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param readOnlyFormsOutput
     *        The read-only metadata forms attached to the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withReadOnlyFormsOutput(FormOutput... readOnlyFormsOutput) {
        if (this.readOnlyFormsOutput == null) {
            setReadOnlyFormsOutput(new java.util.ArrayList<FormOutput>(readOnlyFormsOutput.length));
        }
        for (FormOutput ele : readOnlyFormsOutput) {
            this.readOnlyFormsOutput.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The read-only metadata forms attached to the asset.
     * </p>
     * 
     * @param readOnlyFormsOutput
     *        The read-only metadata forms attached to the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withReadOnlyFormsOutput(java.util.Collection<FormOutput> readOnlyFormsOutput) {
        setReadOnlyFormsOutput(readOnlyFormsOutput);
        return this;
    }

    /**
     * <p>
     * The revision of the asset.
     * </p>
     * 
     * @param revision
     *        The revision of the asset.
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the asset.
     * </p>
     * 
     * @return The revision of the asset.
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of the asset.
     * </p>
     * 
     * @param revision
     *        The revision of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withRevision(String revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * The ID of the asset type.
     * </p>
     * 
     * @param typeIdentifier
     *        The ID of the asset type.
     */

    public void setTypeIdentifier(String typeIdentifier) {
        this.typeIdentifier = typeIdentifier;
    }

    /**
     * <p>
     * The ID of the asset type.
     * </p>
     * 
     * @return The ID of the asset type.
     */

    public String getTypeIdentifier() {
        return this.typeIdentifier;
    }

    /**
     * <p>
     * The ID of the asset type.
     * </p>
     * 
     * @param typeIdentifier
     *        The ID of the asset type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withTypeIdentifier(String typeIdentifier) {
        setTypeIdentifier(typeIdentifier);
        return this;
    }

    /**
     * <p>
     * The revision of the asset type.
     * </p>
     * 
     * @param typeRevision
     *        The revision of the asset type.
     */

    public void setTypeRevision(String typeRevision) {
        this.typeRevision = typeRevision;
    }

    /**
     * <p>
     * The revision of the asset type.
     * </p>
     * 
     * @return The revision of the asset type.
     */

    public String getTypeRevision() {
        return this.typeRevision;
    }

    /**
     * <p>
     * The revision of the asset type.
     * </p>
     * 
     * @param typeRevision
     *        The revision of the asset type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetResult withTypeRevision(String typeRevision) {
        setTypeRevision(typeRevision);
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
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getExternalIdentifier() != null)
            sb.append("ExternalIdentifier: ").append("***Sensitive Data Redacted***").append(",");
        if (getFirstRevisionCreatedAt() != null)
            sb.append("FirstRevisionCreatedAt: ").append(getFirstRevisionCreatedAt()).append(",");
        if (getFirstRevisionCreatedBy() != null)
            sb.append("FirstRevisionCreatedBy: ").append(getFirstRevisionCreatedBy()).append(",");
        if (getFormsOutput() != null)
            sb.append("FormsOutput: ").append(getFormsOutput()).append(",");
        if (getGlossaryTerms() != null)
            sb.append("GlossaryTerms: ").append(getGlossaryTerms()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLatestTimeSeriesDataPointFormsOutput() != null)
            sb.append("LatestTimeSeriesDataPointFormsOutput: ").append(getLatestTimeSeriesDataPointFormsOutput()).append(",");
        if (getListing() != null)
            sb.append("Listing: ").append(getListing()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getOwningProjectId() != null)
            sb.append("OwningProjectId: ").append(getOwningProjectId()).append(",");
        if (getReadOnlyFormsOutput() != null)
            sb.append("ReadOnlyFormsOutput: ").append(getReadOnlyFormsOutput()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getTypeIdentifier() != null)
            sb.append("TypeIdentifier: ").append(getTypeIdentifier()).append(",");
        if (getTypeRevision() != null)
            sb.append("TypeRevision: ").append(getTypeRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssetResult == false)
            return false;
        GetAssetResult other = (GetAssetResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getExternalIdentifier() == null ^ this.getExternalIdentifier() == null)
            return false;
        if (other.getExternalIdentifier() != null && other.getExternalIdentifier().equals(this.getExternalIdentifier()) == false)
            return false;
        if (other.getFirstRevisionCreatedAt() == null ^ this.getFirstRevisionCreatedAt() == null)
            return false;
        if (other.getFirstRevisionCreatedAt() != null && other.getFirstRevisionCreatedAt().equals(this.getFirstRevisionCreatedAt()) == false)
            return false;
        if (other.getFirstRevisionCreatedBy() == null ^ this.getFirstRevisionCreatedBy() == null)
            return false;
        if (other.getFirstRevisionCreatedBy() != null && other.getFirstRevisionCreatedBy().equals(this.getFirstRevisionCreatedBy()) == false)
            return false;
        if (other.getFormsOutput() == null ^ this.getFormsOutput() == null)
            return false;
        if (other.getFormsOutput() != null && other.getFormsOutput().equals(this.getFormsOutput()) == false)
            return false;
        if (other.getGlossaryTerms() == null ^ this.getGlossaryTerms() == null)
            return false;
        if (other.getGlossaryTerms() != null && other.getGlossaryTerms().equals(this.getGlossaryTerms()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLatestTimeSeriesDataPointFormsOutput() == null ^ this.getLatestTimeSeriesDataPointFormsOutput() == null)
            return false;
        if (other.getLatestTimeSeriesDataPointFormsOutput() != null
                && other.getLatestTimeSeriesDataPointFormsOutput().equals(this.getLatestTimeSeriesDataPointFormsOutput()) == false)
            return false;
        if (other.getListing() == null ^ this.getListing() == null)
            return false;
        if (other.getListing() != null && other.getListing().equals(this.getListing()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwningProjectId() == null ^ this.getOwningProjectId() == null)
            return false;
        if (other.getOwningProjectId() != null && other.getOwningProjectId().equals(this.getOwningProjectId()) == false)
            return false;
        if (other.getReadOnlyFormsOutput() == null ^ this.getReadOnlyFormsOutput() == null)
            return false;
        if (other.getReadOnlyFormsOutput() != null && other.getReadOnlyFormsOutput().equals(this.getReadOnlyFormsOutput()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getTypeIdentifier() == null ^ this.getTypeIdentifier() == null)
            return false;
        if (other.getTypeIdentifier() != null && other.getTypeIdentifier().equals(this.getTypeIdentifier()) == false)
            return false;
        if (other.getTypeRevision() == null ^ this.getTypeRevision() == null)
            return false;
        if (other.getTypeRevision() != null && other.getTypeRevision().equals(this.getTypeRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getExternalIdentifier() == null) ? 0 : getExternalIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFirstRevisionCreatedAt() == null) ? 0 : getFirstRevisionCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getFirstRevisionCreatedBy() == null) ? 0 : getFirstRevisionCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getFormsOutput() == null) ? 0 : getFormsOutput().hashCode());
        hashCode = prime * hashCode + ((getGlossaryTerms() == null) ? 0 : getGlossaryTerms().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLatestTimeSeriesDataPointFormsOutput() == null) ? 0 : getLatestTimeSeriesDataPointFormsOutput().hashCode());
        hashCode = prime * hashCode + ((getListing() == null) ? 0 : getListing().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwningProjectId() == null) ? 0 : getOwningProjectId().hashCode());
        hashCode = prime * hashCode + ((getReadOnlyFormsOutput() == null) ? 0 : getReadOnlyFormsOutput().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getTypeIdentifier() == null) ? 0 : getTypeIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTypeRevision() == null) ? 0 : getTypeRevision().hashCode());
        return hashCode;
    }

    @Override
    public GetAssetResult clone() {
        try {
            return (GetAssetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
