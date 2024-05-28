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
package com.amazonaws.services.trustedadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Organization Recommendation Resource Summary
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/OrganizationRecommendationResourceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationRecommendationResourceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account ID
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The ARN of the Recommendation Resource
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The AWS resource identifier
     * </p>
     */
    private String awsResourceId;
    /**
     * <p>
     * The exclusion status of the Recommendation Resource
     * </p>
     */
    private String exclusionStatus;
    /**
     * <p>
     * The ID of the Recommendation Resource
     * </p>
     */
    private String id;
    /**
     * <p>
     * When the Recommendation Resource was last updated
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * Metadata associated with the Recommendation Resource
     * </p>
     */
    private java.util.Map<String, String> metadata;
    /**
     * <p>
     * The Recommendation ARN
     * </p>
     */
    private String recommendationArn;
    /**
     * <p>
     * The AWS Region code that the Recommendation Resource is in
     * </p>
     */
    private String regionCode;
    /**
     * <p>
     * The current status of the Recommendation Resource
     * </p>
     */
    private String status;

    /**
     * <p>
     * The AWS account ID
     * </p>
     * 
     * @param accountId
     *        The AWS account ID
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID
     * </p>
     * 
     * @return The AWS account ID
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID
     * </p>
     * 
     * @param accountId
     *        The AWS account ID
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationRecommendationResourceSummary withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The ARN of the Recommendation Resource
     * </p>
     * 
     * @param arn
     *        The ARN of the Recommendation Resource
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the Recommendation Resource
     * </p>
     * 
     * @return The ARN of the Recommendation Resource
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the Recommendation Resource
     * </p>
     * 
     * @param arn
     *        The ARN of the Recommendation Resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationRecommendationResourceSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The AWS resource identifier
     * </p>
     * 
     * @param awsResourceId
     *        The AWS resource identifier
     */

    public void setAwsResourceId(String awsResourceId) {
        this.awsResourceId = awsResourceId;
    }

    /**
     * <p>
     * The AWS resource identifier
     * </p>
     * 
     * @return The AWS resource identifier
     */

    public String getAwsResourceId() {
        return this.awsResourceId;
    }

    /**
     * <p>
     * The AWS resource identifier
     * </p>
     * 
     * @param awsResourceId
     *        The AWS resource identifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationRecommendationResourceSummary withAwsResourceId(String awsResourceId) {
        setAwsResourceId(awsResourceId);
        return this;
    }

    /**
     * <p>
     * The exclusion status of the Recommendation Resource
     * </p>
     * 
     * @param exclusionStatus
     *        The exclusion status of the Recommendation Resource
     * @see ExclusionStatus
     */

    public void setExclusionStatus(String exclusionStatus) {
        this.exclusionStatus = exclusionStatus;
    }

    /**
     * <p>
     * The exclusion status of the Recommendation Resource
     * </p>
     * 
     * @return The exclusion status of the Recommendation Resource
     * @see ExclusionStatus
     */

    public String getExclusionStatus() {
        return this.exclusionStatus;
    }

    /**
     * <p>
     * The exclusion status of the Recommendation Resource
     * </p>
     * 
     * @param exclusionStatus
     *        The exclusion status of the Recommendation Resource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExclusionStatus
     */

    public OrganizationRecommendationResourceSummary withExclusionStatus(String exclusionStatus) {
        setExclusionStatus(exclusionStatus);
        return this;
    }

    /**
     * <p>
     * The exclusion status of the Recommendation Resource
     * </p>
     * 
     * @param exclusionStatus
     *        The exclusion status of the Recommendation Resource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExclusionStatus
     */

    public OrganizationRecommendationResourceSummary withExclusionStatus(ExclusionStatus exclusionStatus) {
        this.exclusionStatus = exclusionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Recommendation Resource
     * </p>
     * 
     * @param id
     *        The ID of the Recommendation Resource
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the Recommendation Resource
     * </p>
     * 
     * @return The ID of the Recommendation Resource
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the Recommendation Resource
     * </p>
     * 
     * @param id
     *        The ID of the Recommendation Resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationRecommendationResourceSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * When the Recommendation Resource was last updated
     * </p>
     * 
     * @param lastUpdatedAt
     *        When the Recommendation Resource was last updated
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * When the Recommendation Resource was last updated
     * </p>
     * 
     * @return When the Recommendation Resource was last updated
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * When the Recommendation Resource was last updated
     * </p>
     * 
     * @param lastUpdatedAt
     *        When the Recommendation Resource was last updated
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationRecommendationResourceSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * Metadata associated with the Recommendation Resource
     * </p>
     * 
     * @return Metadata associated with the Recommendation Resource
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * Metadata associated with the Recommendation Resource
     * </p>
     * 
     * @param metadata
     *        Metadata associated with the Recommendation Resource
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Metadata associated with the Recommendation Resource
     * </p>
     * 
     * @param metadata
     *        Metadata associated with the Recommendation Resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationRecommendationResourceSummary withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see OrganizationRecommendationResourceSummary#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationRecommendationResourceSummary addMetadataEntry(String key, String value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, String>();
        }
        if (this.metadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationRecommendationResourceSummary clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * The Recommendation ARN
     * </p>
     * 
     * @param recommendationArn
     *        The Recommendation ARN
     */

    public void setRecommendationArn(String recommendationArn) {
        this.recommendationArn = recommendationArn;
    }

    /**
     * <p>
     * The Recommendation ARN
     * </p>
     * 
     * @return The Recommendation ARN
     */

    public String getRecommendationArn() {
        return this.recommendationArn;
    }

    /**
     * <p>
     * The Recommendation ARN
     * </p>
     * 
     * @param recommendationArn
     *        The Recommendation ARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationRecommendationResourceSummary withRecommendationArn(String recommendationArn) {
        setRecommendationArn(recommendationArn);
        return this;
    }

    /**
     * <p>
     * The AWS Region code that the Recommendation Resource is in
     * </p>
     * 
     * @param regionCode
     *        The AWS Region code that the Recommendation Resource is in
     */

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /**
     * <p>
     * The AWS Region code that the Recommendation Resource is in
     * </p>
     * 
     * @return The AWS Region code that the Recommendation Resource is in
     */

    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * <p>
     * The AWS Region code that the Recommendation Resource is in
     * </p>
     * 
     * @param regionCode
     *        The AWS Region code that the Recommendation Resource is in
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationRecommendationResourceSummary withRegionCode(String regionCode) {
        setRegionCode(regionCode);
        return this;
    }

    /**
     * <p>
     * The current status of the Recommendation Resource
     * </p>
     * 
     * @param status
     *        The current status of the Recommendation Resource
     * @see ResourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the Recommendation Resource
     * </p>
     * 
     * @return The current status of the Recommendation Resource
     * @see ResourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the Recommendation Resource
     * </p>
     * 
     * @param status
     *        The current status of the Recommendation Resource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public OrganizationRecommendationResourceSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the Recommendation Resource
     * </p>
     * 
     * @param status
     *        The current status of the Recommendation Resource
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public OrganizationRecommendationResourceSummary withStatus(ResourceStatus status) {
        this.status = status.toString();
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
        if (getAwsResourceId() != null)
            sb.append("AwsResourceId: ").append(getAwsResourceId()).append(",");
        if (getExclusionStatus() != null)
            sb.append("ExclusionStatus: ").append(getExclusionStatus()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getRecommendationArn() != null)
            sb.append("RecommendationArn: ").append(getRecommendationArn()).append(",");
        if (getRegionCode() != null)
            sb.append("RegionCode: ").append(getRegionCode()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationRecommendationResourceSummary == false)
            return false;
        OrganizationRecommendationResourceSummary other = (OrganizationRecommendationResourceSummary) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAwsResourceId() == null ^ this.getAwsResourceId() == null)
            return false;
        if (other.getAwsResourceId() != null && other.getAwsResourceId().equals(this.getAwsResourceId()) == false)
            return false;
        if (other.getExclusionStatus() == null ^ this.getExclusionStatus() == null)
            return false;
        if (other.getExclusionStatus() != null && other.getExclusionStatus().equals(this.getExclusionStatus()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getRecommendationArn() == null ^ this.getRecommendationArn() == null)
            return false;
        if (other.getRecommendationArn() != null && other.getRecommendationArn().equals(this.getRecommendationArn()) == false)
            return false;
        if (other.getRegionCode() == null ^ this.getRegionCode() == null)
            return false;
        if (other.getRegionCode() != null && other.getRegionCode().equals(this.getRegionCode()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAwsResourceId() == null) ? 0 : getAwsResourceId().hashCode());
        hashCode = prime * hashCode + ((getExclusionStatus() == null) ? 0 : getExclusionStatus().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getRecommendationArn() == null) ? 0 : getRecommendationArn().hashCode());
        hashCode = prime * hashCode + ((getRegionCode() == null) ? 0 : getRegionCode().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationRecommendationResourceSummary clone() {
        try {
            return (OrganizationRecommendationResourceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.trustedadvisor.model.transform.OrganizationRecommendationResourceSummaryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
