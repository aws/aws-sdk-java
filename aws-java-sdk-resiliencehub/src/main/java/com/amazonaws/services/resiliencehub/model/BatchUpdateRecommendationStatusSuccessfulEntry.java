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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List of operational recommendations that were successfully included or excluded.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/BatchUpdateRecommendationStatusSuccessfulEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateRecommendationStatusSuccessfulEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier for an entry in this batch that is used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>entryId</code>s of a batch request need to be unique within a request.
     * </p>
     * </note>
     */
    private String entryId;
    /**
     * <p>
     * Indicates the reason for excluding an operational recommendation.
     * </p>
     */
    private String excludeReason;
    /**
     * <p>
     * Indicates if the operational recommendation was successfully excluded.
     * </p>
     */
    private Boolean excluded;
    /**
     * <p>
     * The operational recommendation item.
     * </p>
     */
    private UpdateRecommendationStatusItem item;
    /**
     * <p>
     * Reference identifier of the operational recommendation.
     * </p>
     */
    private String referenceId;

    /**
     * <p>
     * An identifier for an entry in this batch that is used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>entryId</code>s of a batch request need to be unique within a request.
     * </p>
     * </note>
     * 
     * @param entryId
     *        An identifier for an entry in this batch that is used to communicate the result.</p> <note>
     *        <p>
     *        The <code>entryId</code>s of a batch request need to be unique within a request.
     *        </p>
     */

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * <p>
     * An identifier for an entry in this batch that is used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>entryId</code>s of a batch request need to be unique within a request.
     * </p>
     * </note>
     * 
     * @return An identifier for an entry in this batch that is used to communicate the result.</p> <note>
     *         <p>
     *         The <code>entryId</code>s of a batch request need to be unique within a request.
     *         </p>
     */

    public String getEntryId() {
        return this.entryId;
    }

    /**
     * <p>
     * An identifier for an entry in this batch that is used to communicate the result.
     * </p>
     * <note>
     * <p>
     * The <code>entryId</code>s of a batch request need to be unique within a request.
     * </p>
     * </note>
     * 
     * @param entryId
     *        An identifier for an entry in this batch that is used to communicate the result.</p> <note>
     *        <p>
     *        The <code>entryId</code>s of a batch request need to be unique within a request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationStatusSuccessfulEntry withEntryId(String entryId) {
        setEntryId(entryId);
        return this;
    }

    /**
     * <p>
     * Indicates the reason for excluding an operational recommendation.
     * </p>
     * 
     * @param excludeReason
     *        Indicates the reason for excluding an operational recommendation.
     * @see ExcludeRecommendationReason
     */

    public void setExcludeReason(String excludeReason) {
        this.excludeReason = excludeReason;
    }

    /**
     * <p>
     * Indicates the reason for excluding an operational recommendation.
     * </p>
     * 
     * @return Indicates the reason for excluding an operational recommendation.
     * @see ExcludeRecommendationReason
     */

    public String getExcludeReason() {
        return this.excludeReason;
    }

    /**
     * <p>
     * Indicates the reason for excluding an operational recommendation.
     * </p>
     * 
     * @param excludeReason
     *        Indicates the reason for excluding an operational recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExcludeRecommendationReason
     */

    public BatchUpdateRecommendationStatusSuccessfulEntry withExcludeReason(String excludeReason) {
        setExcludeReason(excludeReason);
        return this;
    }

    /**
     * <p>
     * Indicates the reason for excluding an operational recommendation.
     * </p>
     * 
     * @param excludeReason
     *        Indicates the reason for excluding an operational recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExcludeRecommendationReason
     */

    public BatchUpdateRecommendationStatusSuccessfulEntry withExcludeReason(ExcludeRecommendationReason excludeReason) {
        this.excludeReason = excludeReason.toString();
        return this;
    }

    /**
     * <p>
     * Indicates if the operational recommendation was successfully excluded.
     * </p>
     * 
     * @param excluded
     *        Indicates if the operational recommendation was successfully excluded.
     */

    public void setExcluded(Boolean excluded) {
        this.excluded = excluded;
    }

    /**
     * <p>
     * Indicates if the operational recommendation was successfully excluded.
     * </p>
     * 
     * @return Indicates if the operational recommendation was successfully excluded.
     */

    public Boolean getExcluded() {
        return this.excluded;
    }

    /**
     * <p>
     * Indicates if the operational recommendation was successfully excluded.
     * </p>
     * 
     * @param excluded
     *        Indicates if the operational recommendation was successfully excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationStatusSuccessfulEntry withExcluded(Boolean excluded) {
        setExcluded(excluded);
        return this;
    }

    /**
     * <p>
     * Indicates if the operational recommendation was successfully excluded.
     * </p>
     * 
     * @return Indicates if the operational recommendation was successfully excluded.
     */

    public Boolean isExcluded() {
        return this.excluded;
    }

    /**
     * <p>
     * The operational recommendation item.
     * </p>
     * 
     * @param item
     *        The operational recommendation item.
     */

    public void setItem(UpdateRecommendationStatusItem item) {
        this.item = item;
    }

    /**
     * <p>
     * The operational recommendation item.
     * </p>
     * 
     * @return The operational recommendation item.
     */

    public UpdateRecommendationStatusItem getItem() {
        return this.item;
    }

    /**
     * <p>
     * The operational recommendation item.
     * </p>
     * 
     * @param item
     *        The operational recommendation item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationStatusSuccessfulEntry withItem(UpdateRecommendationStatusItem item) {
        setItem(item);
        return this;
    }

    /**
     * <p>
     * Reference identifier of the operational recommendation.
     * </p>
     * 
     * @param referenceId
     *        Reference identifier of the operational recommendation.
     */

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * Reference identifier of the operational recommendation.
     * </p>
     * 
     * @return Reference identifier of the operational recommendation.
     */

    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * Reference identifier of the operational recommendation.
     * </p>
     * 
     * @param referenceId
     *        Reference identifier of the operational recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationStatusSuccessfulEntry withReferenceId(String referenceId) {
        setReferenceId(referenceId);
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
        if (getEntryId() != null)
            sb.append("EntryId: ").append(getEntryId()).append(",");
        if (getExcludeReason() != null)
            sb.append("ExcludeReason: ").append(getExcludeReason()).append(",");
        if (getExcluded() != null)
            sb.append("Excluded: ").append(getExcluded()).append(",");
        if (getItem() != null)
            sb.append("Item: ").append(getItem()).append(",");
        if (getReferenceId() != null)
            sb.append("ReferenceId: ").append(getReferenceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateRecommendationStatusSuccessfulEntry == false)
            return false;
        BatchUpdateRecommendationStatusSuccessfulEntry other = (BatchUpdateRecommendationStatusSuccessfulEntry) obj;
        if (other.getEntryId() == null ^ this.getEntryId() == null)
            return false;
        if (other.getEntryId() != null && other.getEntryId().equals(this.getEntryId()) == false)
            return false;
        if (other.getExcludeReason() == null ^ this.getExcludeReason() == null)
            return false;
        if (other.getExcludeReason() != null && other.getExcludeReason().equals(this.getExcludeReason()) == false)
            return false;
        if (other.getExcluded() == null ^ this.getExcluded() == null)
            return false;
        if (other.getExcluded() != null && other.getExcluded().equals(this.getExcluded()) == false)
            return false;
        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        hashCode = prime * hashCode + ((getExcludeReason() == null) ? 0 : getExcludeReason().hashCode());
        hashCode = prime * hashCode + ((getExcluded() == null) ? 0 : getExcluded().hashCode());
        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateRecommendationStatusSuccessfulEntry clone() {
        try {
            return (BatchUpdateRecommendationStatusSuccessfulEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.BatchUpdateRecommendationStatusSuccessfulEntryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
