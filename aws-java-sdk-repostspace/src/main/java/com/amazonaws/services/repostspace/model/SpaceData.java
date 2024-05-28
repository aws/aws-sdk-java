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
package com.amazonaws.services.repostspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains some information about a private re:Post in the account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/SpaceData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpaceData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the private re:Post.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The configuration status of the private re:Post.
     * </p>
     */
    private String configurationStatus;
    /**
     * <p>
     * The content size of the private re:Post.
     * </p>
     */
    private Long contentSize;
    /**
     * <p>
     * The date when the private re:Post was created.
     * </p>
     */
    private java.util.Date createDateTime;
    /**
     * <p>
     * The date when the private re:Post was deleted.
     * </p>
     */
    private java.util.Date deleteDateTime;
    /**
     * <p>
     * The description for the private re:Post. This is used only to help you identify this private re:Post.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name for the private re:Post.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The AWS generated subdomain of the private re:Post.
     * </p>
     */
    private String randomDomain;
    /**
     * <p>
     * The unique ID of the private re:Post.
     * </p>
     */
    private String spaceId;
    /**
     * <p>
     * The creation/deletion status of the private re:Post.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The storage limit of the private re:Post.
     * </p>
     */
    private Long storageLimit;
    /**
     * <p>
     * The pricing tier of the private re:Post.
     * </p>
     */
    private String tier;
    /**
     * <p>
     * The number of onboarded users to the private re:Post.
     * </p>
     */
    private Integer userCount;
    /**
     * <p>
     * The custom AWS KMS key ARN that’s used for the AWS KMS encryption.
     * </p>
     */
    private String userKMSKey;
    /**
     * <p>
     * This custom subdomain that you use to access your private re:Post. All custom subdomains must be approved by AWS
     * before use.
     * </p>
     */
    private String vanityDomain;
    /**
     * <p>
     * This approval status of the custom subdomain.
     * </p>
     */
    private String vanityDomainStatus;

    /**
     * <p>
     * The ARN of the private re:Post.
     * </p>
     * 
     * @param arn
     *        The ARN of the private re:Post.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the private re:Post.
     * </p>
     * 
     * @return The ARN of the private re:Post.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the private re:Post.
     * </p>
     * 
     * @param arn
     *        The ARN of the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceData withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The configuration status of the private re:Post.
     * </p>
     * 
     * @param configurationStatus
     *        The configuration status of the private re:Post.
     * @see ConfigurationStatus
     */

    public void setConfigurationStatus(String configurationStatus) {
        this.configurationStatus = configurationStatus;
    }

    /**
     * <p>
     * The configuration status of the private re:Post.
     * </p>
     * 
     * @return The configuration status of the private re:Post.
     * @see ConfigurationStatus
     */

    public String getConfigurationStatus() {
        return this.configurationStatus;
    }

    /**
     * <p>
     * The configuration status of the private re:Post.
     * </p>
     * 
     * @param configurationStatus
     *        The configuration status of the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationStatus
     */

    public SpaceData withConfigurationStatus(String configurationStatus) {
        setConfigurationStatus(configurationStatus);
        return this;
    }

    /**
     * <p>
     * The configuration status of the private re:Post.
     * </p>
     * 
     * @param configurationStatus
     *        The configuration status of the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationStatus
     */

    public SpaceData withConfigurationStatus(ConfigurationStatus configurationStatus) {
        this.configurationStatus = configurationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The content size of the private re:Post.
     * </p>
     * 
     * @param contentSize
     *        The content size of the private re:Post.
     */

    public void setContentSize(Long contentSize) {
        this.contentSize = contentSize;
    }

    /**
     * <p>
     * The content size of the private re:Post.
     * </p>
     * 
     * @return The content size of the private re:Post.
     */

    public Long getContentSize() {
        return this.contentSize;
    }

    /**
     * <p>
     * The content size of the private re:Post.
     * </p>
     * 
     * @param contentSize
     *        The content size of the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceData withContentSize(Long contentSize) {
        setContentSize(contentSize);
        return this;
    }

    /**
     * <p>
     * The date when the private re:Post was created.
     * </p>
     * 
     * @param createDateTime
     *        The date when the private re:Post was created.
     */

    public void setCreateDateTime(java.util.Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    /**
     * <p>
     * The date when the private re:Post was created.
     * </p>
     * 
     * @return The date when the private re:Post was created.
     */

    public java.util.Date getCreateDateTime() {
        return this.createDateTime;
    }

    /**
     * <p>
     * The date when the private re:Post was created.
     * </p>
     * 
     * @param createDateTime
     *        The date when the private re:Post was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceData withCreateDateTime(java.util.Date createDateTime) {
        setCreateDateTime(createDateTime);
        return this;
    }

    /**
     * <p>
     * The date when the private re:Post was deleted.
     * </p>
     * 
     * @param deleteDateTime
     *        The date when the private re:Post was deleted.
     */

    public void setDeleteDateTime(java.util.Date deleteDateTime) {
        this.deleteDateTime = deleteDateTime;
    }

    /**
     * <p>
     * The date when the private re:Post was deleted.
     * </p>
     * 
     * @return The date when the private re:Post was deleted.
     */

    public java.util.Date getDeleteDateTime() {
        return this.deleteDateTime;
    }

    /**
     * <p>
     * The date when the private re:Post was deleted.
     * </p>
     * 
     * @param deleteDateTime
     *        The date when the private re:Post was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceData withDeleteDateTime(java.util.Date deleteDateTime) {
        setDeleteDateTime(deleteDateTime);
        return this;
    }

    /**
     * <p>
     * The description for the private re:Post. This is used only to help you identify this private re:Post.
     * </p>
     * 
     * @param description
     *        The description for the private re:Post. This is used only to help you identify this private re:Post.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the private re:Post. This is used only to help you identify this private re:Post.
     * </p>
     * 
     * @return The description for the private re:Post. This is used only to help you identify this private re:Post.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the private re:Post. This is used only to help you identify this private re:Post.
     * </p>
     * 
     * @param description
     *        The description for the private re:Post. This is used only to help you identify this private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceData withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name for the private re:Post.
     * </p>
     * 
     * @param name
     *        The name for the private re:Post.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the private re:Post.
     * </p>
     * 
     * @return The name for the private re:Post.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the private re:Post.
     * </p>
     * 
     * @param name
     *        The name for the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceData withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The AWS generated subdomain of the private re:Post.
     * </p>
     * 
     * @param randomDomain
     *        The AWS generated subdomain of the private re:Post.
     */

    public void setRandomDomain(String randomDomain) {
        this.randomDomain = randomDomain;
    }

    /**
     * <p>
     * The AWS generated subdomain of the private re:Post.
     * </p>
     * 
     * @return The AWS generated subdomain of the private re:Post.
     */

    public String getRandomDomain() {
        return this.randomDomain;
    }

    /**
     * <p>
     * The AWS generated subdomain of the private re:Post.
     * </p>
     * 
     * @param randomDomain
     *        The AWS generated subdomain of the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceData withRandomDomain(String randomDomain) {
        setRandomDomain(randomDomain);
        return this;
    }

    /**
     * <p>
     * The unique ID of the private re:Post.
     * </p>
     * 
     * @param spaceId
     *        The unique ID of the private re:Post.
     */

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    /**
     * <p>
     * The unique ID of the private re:Post.
     * </p>
     * 
     * @return The unique ID of the private re:Post.
     */

    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * <p>
     * The unique ID of the private re:Post.
     * </p>
     * 
     * @param spaceId
     *        The unique ID of the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceData withSpaceId(String spaceId) {
        setSpaceId(spaceId);
        return this;
    }

    /**
     * <p>
     * The creation/deletion status of the private re:Post.
     * </p>
     * 
     * @param status
     *        The creation/deletion status of the private re:Post.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The creation/deletion status of the private re:Post.
     * </p>
     * 
     * @return The creation/deletion status of the private re:Post.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The creation/deletion status of the private re:Post.
     * </p>
     * 
     * @param status
     *        The creation/deletion status of the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceData withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The storage limit of the private re:Post.
     * </p>
     * 
     * @param storageLimit
     *        The storage limit of the private re:Post.
     */

    public void setStorageLimit(Long storageLimit) {
        this.storageLimit = storageLimit;
    }

    /**
     * <p>
     * The storage limit of the private re:Post.
     * </p>
     * 
     * @return The storage limit of the private re:Post.
     */

    public Long getStorageLimit() {
        return this.storageLimit;
    }

    /**
     * <p>
     * The storage limit of the private re:Post.
     * </p>
     * 
     * @param storageLimit
     *        The storage limit of the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceData withStorageLimit(Long storageLimit) {
        setStorageLimit(storageLimit);
        return this;
    }

    /**
     * <p>
     * The pricing tier of the private re:Post.
     * </p>
     * 
     * @param tier
     *        The pricing tier of the private re:Post.
     * @see TierLevel
     */

    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The pricing tier of the private re:Post.
     * </p>
     * 
     * @return The pricing tier of the private re:Post.
     * @see TierLevel
     */

    public String getTier() {
        return this.tier;
    }

    /**
     * <p>
     * The pricing tier of the private re:Post.
     * </p>
     * 
     * @param tier
     *        The pricing tier of the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TierLevel
     */

    public SpaceData withTier(String tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * The pricing tier of the private re:Post.
     * </p>
     * 
     * @param tier
     *        The pricing tier of the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TierLevel
     */

    public SpaceData withTier(TierLevel tier) {
        this.tier = tier.toString();
        return this;
    }

    /**
     * <p>
     * The number of onboarded users to the private re:Post.
     * </p>
     * 
     * @param userCount
     *        The number of onboarded users to the private re:Post.
     */

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    /**
     * <p>
     * The number of onboarded users to the private re:Post.
     * </p>
     * 
     * @return The number of onboarded users to the private re:Post.
     */

    public Integer getUserCount() {
        return this.userCount;
    }

    /**
     * <p>
     * The number of onboarded users to the private re:Post.
     * </p>
     * 
     * @param userCount
     *        The number of onboarded users to the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceData withUserCount(Integer userCount) {
        setUserCount(userCount);
        return this;
    }

    /**
     * <p>
     * The custom AWS KMS key ARN that’s used for the AWS KMS encryption.
     * </p>
     * 
     * @param userKMSKey
     *        The custom AWS KMS key ARN that’s used for the AWS KMS encryption.
     */

    public void setUserKMSKey(String userKMSKey) {
        this.userKMSKey = userKMSKey;
    }

    /**
     * <p>
     * The custom AWS KMS key ARN that’s used for the AWS KMS encryption.
     * </p>
     * 
     * @return The custom AWS KMS key ARN that’s used for the AWS KMS encryption.
     */

    public String getUserKMSKey() {
        return this.userKMSKey;
    }

    /**
     * <p>
     * The custom AWS KMS key ARN that’s used for the AWS KMS encryption.
     * </p>
     * 
     * @param userKMSKey
     *        The custom AWS KMS key ARN that’s used for the AWS KMS encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceData withUserKMSKey(String userKMSKey) {
        setUserKMSKey(userKMSKey);
        return this;
    }

    /**
     * <p>
     * This custom subdomain that you use to access your private re:Post. All custom subdomains must be approved by AWS
     * before use.
     * </p>
     * 
     * @param vanityDomain
     *        This custom subdomain that you use to access your private re:Post. All custom subdomains must be approved
     *        by AWS before use.
     */

    public void setVanityDomain(String vanityDomain) {
        this.vanityDomain = vanityDomain;
    }

    /**
     * <p>
     * This custom subdomain that you use to access your private re:Post. All custom subdomains must be approved by AWS
     * before use.
     * </p>
     * 
     * @return This custom subdomain that you use to access your private re:Post. All custom subdomains must be approved
     *         by AWS before use.
     */

    public String getVanityDomain() {
        return this.vanityDomain;
    }

    /**
     * <p>
     * This custom subdomain that you use to access your private re:Post. All custom subdomains must be approved by AWS
     * before use.
     * </p>
     * 
     * @param vanityDomain
     *        This custom subdomain that you use to access your private re:Post. All custom subdomains must be approved
     *        by AWS before use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceData withVanityDomain(String vanityDomain) {
        setVanityDomain(vanityDomain);
        return this;
    }

    /**
     * <p>
     * This approval status of the custom subdomain.
     * </p>
     * 
     * @param vanityDomainStatus
     *        This approval status of the custom subdomain.
     * @see VanityDomainStatus
     */

    public void setVanityDomainStatus(String vanityDomainStatus) {
        this.vanityDomainStatus = vanityDomainStatus;
    }

    /**
     * <p>
     * This approval status of the custom subdomain.
     * </p>
     * 
     * @return This approval status of the custom subdomain.
     * @see VanityDomainStatus
     */

    public String getVanityDomainStatus() {
        return this.vanityDomainStatus;
    }

    /**
     * <p>
     * This approval status of the custom subdomain.
     * </p>
     * 
     * @param vanityDomainStatus
     *        This approval status of the custom subdomain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VanityDomainStatus
     */

    public SpaceData withVanityDomainStatus(String vanityDomainStatus) {
        setVanityDomainStatus(vanityDomainStatus);
        return this;
    }

    /**
     * <p>
     * This approval status of the custom subdomain.
     * </p>
     * 
     * @param vanityDomainStatus
     *        This approval status of the custom subdomain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VanityDomainStatus
     */

    public SpaceData withVanityDomainStatus(VanityDomainStatus vanityDomainStatus) {
        this.vanityDomainStatus = vanityDomainStatus.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getConfigurationStatus() != null)
            sb.append("ConfigurationStatus: ").append(getConfigurationStatus()).append(",");
        if (getContentSize() != null)
            sb.append("ContentSize: ").append(getContentSize()).append(",");
        if (getCreateDateTime() != null)
            sb.append("CreateDateTime: ").append(getCreateDateTime()).append(",");
        if (getDeleteDateTime() != null)
            sb.append("DeleteDateTime: ").append(getDeleteDateTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getRandomDomain() != null)
            sb.append("RandomDomain: ").append(getRandomDomain()).append(",");
        if (getSpaceId() != null)
            sb.append("SpaceId: ").append(getSpaceId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStorageLimit() != null)
            sb.append("StorageLimit: ").append(getStorageLimit()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier()).append(",");
        if (getUserCount() != null)
            sb.append("UserCount: ").append(getUserCount()).append(",");
        if (getUserKMSKey() != null)
            sb.append("UserKMSKey: ").append(getUserKMSKey()).append(",");
        if (getVanityDomain() != null)
            sb.append("VanityDomain: ").append(getVanityDomain()).append(",");
        if (getVanityDomainStatus() != null)
            sb.append("VanityDomainStatus: ").append(getVanityDomainStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpaceData == false)
            return false;
        SpaceData other = (SpaceData) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getConfigurationStatus() == null ^ this.getConfigurationStatus() == null)
            return false;
        if (other.getConfigurationStatus() != null && other.getConfigurationStatus().equals(this.getConfigurationStatus()) == false)
            return false;
        if (other.getContentSize() == null ^ this.getContentSize() == null)
            return false;
        if (other.getContentSize() != null && other.getContentSize().equals(this.getContentSize()) == false)
            return false;
        if (other.getCreateDateTime() == null ^ this.getCreateDateTime() == null)
            return false;
        if (other.getCreateDateTime() != null && other.getCreateDateTime().equals(this.getCreateDateTime()) == false)
            return false;
        if (other.getDeleteDateTime() == null ^ this.getDeleteDateTime() == null)
            return false;
        if (other.getDeleteDateTime() != null && other.getDeleteDateTime().equals(this.getDeleteDateTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRandomDomain() == null ^ this.getRandomDomain() == null)
            return false;
        if (other.getRandomDomain() != null && other.getRandomDomain().equals(this.getRandomDomain()) == false)
            return false;
        if (other.getSpaceId() == null ^ this.getSpaceId() == null)
            return false;
        if (other.getSpaceId() != null && other.getSpaceId().equals(this.getSpaceId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStorageLimit() == null ^ this.getStorageLimit() == null)
            return false;
        if (other.getStorageLimit() != null && other.getStorageLimit().equals(this.getStorageLimit()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getUserCount() == null ^ this.getUserCount() == null)
            return false;
        if (other.getUserCount() != null && other.getUserCount().equals(this.getUserCount()) == false)
            return false;
        if (other.getUserKMSKey() == null ^ this.getUserKMSKey() == null)
            return false;
        if (other.getUserKMSKey() != null && other.getUserKMSKey().equals(this.getUserKMSKey()) == false)
            return false;
        if (other.getVanityDomain() == null ^ this.getVanityDomain() == null)
            return false;
        if (other.getVanityDomain() != null && other.getVanityDomain().equals(this.getVanityDomain()) == false)
            return false;
        if (other.getVanityDomainStatus() == null ^ this.getVanityDomainStatus() == null)
            return false;
        if (other.getVanityDomainStatus() != null && other.getVanityDomainStatus().equals(this.getVanityDomainStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getConfigurationStatus() == null) ? 0 : getConfigurationStatus().hashCode());
        hashCode = prime * hashCode + ((getContentSize() == null) ? 0 : getContentSize().hashCode());
        hashCode = prime * hashCode + ((getCreateDateTime() == null) ? 0 : getCreateDateTime().hashCode());
        hashCode = prime * hashCode + ((getDeleteDateTime() == null) ? 0 : getDeleteDateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRandomDomain() == null) ? 0 : getRandomDomain().hashCode());
        hashCode = prime * hashCode + ((getSpaceId() == null) ? 0 : getSpaceId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStorageLimit() == null) ? 0 : getStorageLimit().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getUserCount() == null) ? 0 : getUserCount().hashCode());
        hashCode = prime * hashCode + ((getUserKMSKey() == null) ? 0 : getUserKMSKey().hashCode());
        hashCode = prime * hashCode + ((getVanityDomain() == null) ? 0 : getVanityDomain().hashCode());
        hashCode = prime * hashCode + ((getVanityDomainStatus() == null) ? 0 : getVanityDomainStatus().hashCode());
        return hashCode;
    }

    @Override
    public SpaceData clone() {
        try {
            return (SpaceData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.repostspace.model.transform.SpaceDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
