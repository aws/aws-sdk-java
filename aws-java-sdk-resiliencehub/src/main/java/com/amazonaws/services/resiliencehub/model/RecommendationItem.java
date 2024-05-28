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
 * Defines a recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/RecommendationItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies if the recommendation has already been implemented.
     * </p>
     */
    private Boolean alreadyImplemented;
    /**
     * <p>
     * Indicates the reason for excluding an operational recommendation.
     * </p>
     */
    private String excludeReason;
    /**
     * <p>
     * Indicates if an operational recommendation item is excluded.
     * </p>
     */
    private Boolean excluded;
    /**
     * <p>
     * Identifier of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Identifier of the target account.
     * </p>
     */
    private String targetAccountId;
    /**
     * <p>
     * The target region.
     * </p>
     */
    private String targetRegion;

    /**
     * <p>
     * Specifies if the recommendation has already been implemented.
     * </p>
     * 
     * @param alreadyImplemented
     *        Specifies if the recommendation has already been implemented.
     */

    public void setAlreadyImplemented(Boolean alreadyImplemented) {
        this.alreadyImplemented = alreadyImplemented;
    }

    /**
     * <p>
     * Specifies if the recommendation has already been implemented.
     * </p>
     * 
     * @return Specifies if the recommendation has already been implemented.
     */

    public Boolean getAlreadyImplemented() {
        return this.alreadyImplemented;
    }

    /**
     * <p>
     * Specifies if the recommendation has already been implemented.
     * </p>
     * 
     * @param alreadyImplemented
     *        Specifies if the recommendation has already been implemented.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationItem withAlreadyImplemented(Boolean alreadyImplemented) {
        setAlreadyImplemented(alreadyImplemented);
        return this;
    }

    /**
     * <p>
     * Specifies if the recommendation has already been implemented.
     * </p>
     * 
     * @return Specifies if the recommendation has already been implemented.
     */

    public Boolean isAlreadyImplemented() {
        return this.alreadyImplemented;
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

    public RecommendationItem withExcludeReason(String excludeReason) {
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

    public RecommendationItem withExcludeReason(ExcludeRecommendationReason excludeReason) {
        this.excludeReason = excludeReason.toString();
        return this;
    }

    /**
     * <p>
     * Indicates if an operational recommendation item is excluded.
     * </p>
     * 
     * @param excluded
     *        Indicates if an operational recommendation item is excluded.
     */

    public void setExcluded(Boolean excluded) {
        this.excluded = excluded;
    }

    /**
     * <p>
     * Indicates if an operational recommendation item is excluded.
     * </p>
     * 
     * @return Indicates if an operational recommendation item is excluded.
     */

    public Boolean getExcluded() {
        return this.excluded;
    }

    /**
     * <p>
     * Indicates if an operational recommendation item is excluded.
     * </p>
     * 
     * @param excluded
     *        Indicates if an operational recommendation item is excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationItem withExcluded(Boolean excluded) {
        setExcluded(excluded);
        return this;
    }

    /**
     * <p>
     * Indicates if an operational recommendation item is excluded.
     * </p>
     * 
     * @return Indicates if an operational recommendation item is excluded.
     */

    public Boolean isExcluded() {
        return this.excluded;
    }

    /**
     * <p>
     * Identifier of the resource.
     * </p>
     * 
     * @param resourceId
     *        Identifier of the resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Identifier of the resource.
     * </p>
     * 
     * @return Identifier of the resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Identifier of the resource.
     * </p>
     * 
     * @param resourceId
     *        Identifier of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationItem withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Identifier of the target account.
     * </p>
     * 
     * @param targetAccountId
     *        Identifier of the target account.
     */

    public void setTargetAccountId(String targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    /**
     * <p>
     * Identifier of the target account.
     * </p>
     * 
     * @return Identifier of the target account.
     */

    public String getTargetAccountId() {
        return this.targetAccountId;
    }

    /**
     * <p>
     * Identifier of the target account.
     * </p>
     * 
     * @param targetAccountId
     *        Identifier of the target account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationItem withTargetAccountId(String targetAccountId) {
        setTargetAccountId(targetAccountId);
        return this;
    }

    /**
     * <p>
     * The target region.
     * </p>
     * 
     * @param targetRegion
     *        The target region.
     */

    public void setTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
    }

    /**
     * <p>
     * The target region.
     * </p>
     * 
     * @return The target region.
     */

    public String getTargetRegion() {
        return this.targetRegion;
    }

    /**
     * <p>
     * The target region.
     * </p>
     * 
     * @param targetRegion
     *        The target region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationItem withTargetRegion(String targetRegion) {
        setTargetRegion(targetRegion);
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
        if (getAlreadyImplemented() != null)
            sb.append("AlreadyImplemented: ").append(getAlreadyImplemented()).append(",");
        if (getExcludeReason() != null)
            sb.append("ExcludeReason: ").append(getExcludeReason()).append(",");
        if (getExcluded() != null)
            sb.append("Excluded: ").append(getExcluded()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getTargetAccountId() != null)
            sb.append("TargetAccountId: ").append(getTargetAccountId()).append(",");
        if (getTargetRegion() != null)
            sb.append("TargetRegion: ").append(getTargetRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationItem == false)
            return false;
        RecommendationItem other = (RecommendationItem) obj;
        if (other.getAlreadyImplemented() == null ^ this.getAlreadyImplemented() == null)
            return false;
        if (other.getAlreadyImplemented() != null && other.getAlreadyImplemented().equals(this.getAlreadyImplemented()) == false)
            return false;
        if (other.getExcludeReason() == null ^ this.getExcludeReason() == null)
            return false;
        if (other.getExcludeReason() != null && other.getExcludeReason().equals(this.getExcludeReason()) == false)
            return false;
        if (other.getExcluded() == null ^ this.getExcluded() == null)
            return false;
        if (other.getExcluded() != null && other.getExcluded().equals(this.getExcluded()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getTargetAccountId() == null ^ this.getTargetAccountId() == null)
            return false;
        if (other.getTargetAccountId() != null && other.getTargetAccountId().equals(this.getTargetAccountId()) == false)
            return false;
        if (other.getTargetRegion() == null ^ this.getTargetRegion() == null)
            return false;
        if (other.getTargetRegion() != null && other.getTargetRegion().equals(this.getTargetRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlreadyImplemented() == null) ? 0 : getAlreadyImplemented().hashCode());
        hashCode = prime * hashCode + ((getExcludeReason() == null) ? 0 : getExcludeReason().hashCode());
        hashCode = prime * hashCode + ((getExcluded() == null) ? 0 : getExcluded().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTargetAccountId() == null) ? 0 : getTargetAccountId().hashCode());
        hashCode = prime * hashCode + ((getTargetRegion() == null) ? 0 : getTargetRegion().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationItem clone() {
        try {
            return (RecommendationItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.RecommendationItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
