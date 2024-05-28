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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An asset published in an Amazon DataZone catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/AssetListing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetListing implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of an asset published in an Amazon DataZone catalog.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The revision of an asset published in an Amazon DataZone catalog.
     * </p>
     */
    private String assetRevision;
    /**
     * <p>
     * The type of an asset published in an Amazon DataZone catalog.
     * </p>
     */
    private String assetType;
    /**
     * <p>
     * The timestamp of when an asset published in an Amazon DataZone catalog was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The metadata forms attached to an asset published in an Amazon DataZone catalog.
     * </p>
     */
    private String forms;
    /**
     * <p>
     * The glossary terms attached to an asset published in an Amazon DataZone catalog.
     * </p>
     */
    private java.util.List<DetailedGlossaryTerm> glossaryTerms;
    /**
     * <p>
     * The latest time series data points forms included in the additional attributes of an asset.
     * </p>
     */
    private java.util.List<TimeSeriesDataPointSummaryFormOutput> latestTimeSeriesDataPointForms;
    /**
     * <p>
     * The identifier of the project where an asset published in an Amazon DataZone catalog exists.
     * </p>
     */
    private String owningProjectId;

    /**
     * <p>
     * The identifier of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param assetId
     *        The identifier of an asset published in an Amazon DataZone catalog.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The identifier of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @return The identifier of an asset published in an Amazon DataZone catalog.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The identifier of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param assetId
     *        The identifier of an asset published in an Amazon DataZone catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListing withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The revision of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param assetRevision
     *        The revision of an asset published in an Amazon DataZone catalog.
     */

    public void setAssetRevision(String assetRevision) {
        this.assetRevision = assetRevision;
    }

    /**
     * <p>
     * The revision of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @return The revision of an asset published in an Amazon DataZone catalog.
     */

    public String getAssetRevision() {
        return this.assetRevision;
    }

    /**
     * <p>
     * The revision of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param assetRevision
     *        The revision of an asset published in an Amazon DataZone catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListing withAssetRevision(String assetRevision) {
        setAssetRevision(assetRevision);
        return this;
    }

    /**
     * <p>
     * The type of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param assetType
     *        The type of an asset published in an Amazon DataZone catalog.
     */

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    /**
     * <p>
     * The type of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @return The type of an asset published in an Amazon DataZone catalog.
     */

    public String getAssetType() {
        return this.assetType;
    }

    /**
     * <p>
     * The type of an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param assetType
     *        The type of an asset published in an Amazon DataZone catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListing withAssetType(String assetType) {
        setAssetType(assetType);
        return this;
    }

    /**
     * <p>
     * The timestamp of when an asset published in an Amazon DataZone catalog was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when an asset published in an Amazon DataZone catalog was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when an asset published in an Amazon DataZone catalog was created.
     * </p>
     * 
     * @return The timestamp of when an asset published in an Amazon DataZone catalog was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when an asset published in an Amazon DataZone catalog was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when an asset published in an Amazon DataZone catalog was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListing withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The metadata forms attached to an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param forms
     *        The metadata forms attached to an asset published in an Amazon DataZone catalog.
     */

    public void setForms(String forms) {
        this.forms = forms;
    }

    /**
     * <p>
     * The metadata forms attached to an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @return The metadata forms attached to an asset published in an Amazon DataZone catalog.
     */

    public String getForms() {
        return this.forms;
    }

    /**
     * <p>
     * The metadata forms attached to an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param forms
     *        The metadata forms attached to an asset published in an Amazon DataZone catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListing withForms(String forms) {
        setForms(forms);
        return this;
    }

    /**
     * <p>
     * The glossary terms attached to an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @return The glossary terms attached to an asset published in an Amazon DataZone catalog.
     */

    public java.util.List<DetailedGlossaryTerm> getGlossaryTerms() {
        return glossaryTerms;
    }

    /**
     * <p>
     * The glossary terms attached to an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms attached to an asset published in an Amazon DataZone catalog.
     */

    public void setGlossaryTerms(java.util.Collection<DetailedGlossaryTerm> glossaryTerms) {
        if (glossaryTerms == null) {
            this.glossaryTerms = null;
            return;
        }

        this.glossaryTerms = new java.util.ArrayList<DetailedGlossaryTerm>(glossaryTerms);
    }

    /**
     * <p>
     * The glossary terms attached to an asset published in an Amazon DataZone catalog.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlossaryTerms(java.util.Collection)} or {@link #withGlossaryTerms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms attached to an asset published in an Amazon DataZone catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListing withGlossaryTerms(DetailedGlossaryTerm... glossaryTerms) {
        if (this.glossaryTerms == null) {
            setGlossaryTerms(new java.util.ArrayList<DetailedGlossaryTerm>(glossaryTerms.length));
        }
        for (DetailedGlossaryTerm ele : glossaryTerms) {
            this.glossaryTerms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The glossary terms attached to an asset published in an Amazon DataZone catalog.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms attached to an asset published in an Amazon DataZone catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListing withGlossaryTerms(java.util.Collection<DetailedGlossaryTerm> glossaryTerms) {
        setGlossaryTerms(glossaryTerms);
        return this;
    }

    /**
     * <p>
     * The latest time series data points forms included in the additional attributes of an asset.
     * </p>
     * 
     * @return The latest time series data points forms included in the additional attributes of an asset.
     */

    public java.util.List<TimeSeriesDataPointSummaryFormOutput> getLatestTimeSeriesDataPointForms() {
        return latestTimeSeriesDataPointForms;
    }

    /**
     * <p>
     * The latest time series data points forms included in the additional attributes of an asset.
     * </p>
     * 
     * @param latestTimeSeriesDataPointForms
     *        The latest time series data points forms included in the additional attributes of an asset.
     */

    public void setLatestTimeSeriesDataPointForms(java.util.Collection<TimeSeriesDataPointSummaryFormOutput> latestTimeSeriesDataPointForms) {
        if (latestTimeSeriesDataPointForms == null) {
            this.latestTimeSeriesDataPointForms = null;
            return;
        }

        this.latestTimeSeriesDataPointForms = new java.util.ArrayList<TimeSeriesDataPointSummaryFormOutput>(latestTimeSeriesDataPointForms);
    }

    /**
     * <p>
     * The latest time series data points forms included in the additional attributes of an asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLatestTimeSeriesDataPointForms(java.util.Collection)} or
     * {@link #withLatestTimeSeriesDataPointForms(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param latestTimeSeriesDataPointForms
     *        The latest time series data points forms included in the additional attributes of an asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListing withLatestTimeSeriesDataPointForms(TimeSeriesDataPointSummaryFormOutput... latestTimeSeriesDataPointForms) {
        if (this.latestTimeSeriesDataPointForms == null) {
            setLatestTimeSeriesDataPointForms(new java.util.ArrayList<TimeSeriesDataPointSummaryFormOutput>(latestTimeSeriesDataPointForms.length));
        }
        for (TimeSeriesDataPointSummaryFormOutput ele : latestTimeSeriesDataPointForms) {
            this.latestTimeSeriesDataPointForms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The latest time series data points forms included in the additional attributes of an asset.
     * </p>
     * 
     * @param latestTimeSeriesDataPointForms
     *        The latest time series data points forms included in the additional attributes of an asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListing withLatestTimeSeriesDataPointForms(java.util.Collection<TimeSeriesDataPointSummaryFormOutput> latestTimeSeriesDataPointForms) {
        setLatestTimeSeriesDataPointForms(latestTimeSeriesDataPointForms);
        return this;
    }

    /**
     * <p>
     * The identifier of the project where an asset published in an Amazon DataZone catalog exists.
     * </p>
     * 
     * @param owningProjectId
     *        The identifier of the project where an asset published in an Amazon DataZone catalog exists.
     */

    public void setOwningProjectId(String owningProjectId) {
        this.owningProjectId = owningProjectId;
    }

    /**
     * <p>
     * The identifier of the project where an asset published in an Amazon DataZone catalog exists.
     * </p>
     * 
     * @return The identifier of the project where an asset published in an Amazon DataZone catalog exists.
     */

    public String getOwningProjectId() {
        return this.owningProjectId;
    }

    /**
     * <p>
     * The identifier of the project where an asset published in an Amazon DataZone catalog exists.
     * </p>
     * 
     * @param owningProjectId
     *        The identifier of the project where an asset published in an Amazon DataZone catalog exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetListing withOwningProjectId(String owningProjectId) {
        setOwningProjectId(owningProjectId);
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getAssetRevision() != null)
            sb.append("AssetRevision: ").append(getAssetRevision()).append(",");
        if (getAssetType() != null)
            sb.append("AssetType: ").append(getAssetType()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getForms() != null)
            sb.append("Forms: ").append(getForms()).append(",");
        if (getGlossaryTerms() != null)
            sb.append("GlossaryTerms: ").append(getGlossaryTerms()).append(",");
        if (getLatestTimeSeriesDataPointForms() != null)
            sb.append("LatestTimeSeriesDataPointForms: ").append(getLatestTimeSeriesDataPointForms()).append(",");
        if (getOwningProjectId() != null)
            sb.append("OwningProjectId: ").append(getOwningProjectId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetListing == false)
            return false;
        AssetListing other = (AssetListing) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getAssetRevision() == null ^ this.getAssetRevision() == null)
            return false;
        if (other.getAssetRevision() != null && other.getAssetRevision().equals(this.getAssetRevision()) == false)
            return false;
        if (other.getAssetType() == null ^ this.getAssetType() == null)
            return false;
        if (other.getAssetType() != null && other.getAssetType().equals(this.getAssetType()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getForms() == null ^ this.getForms() == null)
            return false;
        if (other.getForms() != null && other.getForms().equals(this.getForms()) == false)
            return false;
        if (other.getGlossaryTerms() == null ^ this.getGlossaryTerms() == null)
            return false;
        if (other.getGlossaryTerms() != null && other.getGlossaryTerms().equals(this.getGlossaryTerms()) == false)
            return false;
        if (other.getLatestTimeSeriesDataPointForms() == null ^ this.getLatestTimeSeriesDataPointForms() == null)
            return false;
        if (other.getLatestTimeSeriesDataPointForms() != null
                && other.getLatestTimeSeriesDataPointForms().equals(this.getLatestTimeSeriesDataPointForms()) == false)
            return false;
        if (other.getOwningProjectId() == null ^ this.getOwningProjectId() == null)
            return false;
        if (other.getOwningProjectId() != null && other.getOwningProjectId().equals(this.getOwningProjectId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getAssetRevision() == null) ? 0 : getAssetRevision().hashCode());
        hashCode = prime * hashCode + ((getAssetType() == null) ? 0 : getAssetType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getForms() == null) ? 0 : getForms().hashCode());
        hashCode = prime * hashCode + ((getGlossaryTerms() == null) ? 0 : getGlossaryTerms().hashCode());
        hashCode = prime * hashCode + ((getLatestTimeSeriesDataPointForms() == null) ? 0 : getLatestTimeSeriesDataPointForms().hashCode());
        hashCode = prime * hashCode + ((getOwningProjectId() == null) ? 0 : getOwningProjectId().hashCode());
        return hashCode;
    }

    @Override
    public AssetListing clone() {
        try {
            return (AssetListing) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.AssetListingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
