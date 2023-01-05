/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a Verified Access trust provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VerifiedAccessTrustProvider" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessTrustProvider implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access trust provider.
     * </p>
     */
    private String verifiedAccessTrustProviderId;
    /**
     * <p>
     * A description for the Amazon Web Services Verified Access trust provider.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of Verified Access trust provider.
     * </p>
     */
    private String trustProviderType;
    /**
     * <p>
     * The type of user-based trust provider.
     * </p>
     */
    private String userTrustProviderType;
    /**
     * <p>
     * The type of device-based trust provider.
     * </p>
     */
    private String deviceTrustProviderType;
    /**
     * <p>
     * The OpenID Connect details for an <code>oidc</code>-type, user-identity based trust provider.
     * </p>
     */
    private OidcOptions oidcOptions;
    /**
     * <p>
     * The options for device-identity type trust provider.
     * </p>
     */
    private DeviceOptions deviceOptions;
    /**
     * <p>
     * The identifier to be used when working with policy rules.
     * </p>
     */
    private String policyReferenceName;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The last updated time.
     * </p>
     */
    private String lastUpdatedTime;
    /**
     * <p>
     * The tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access trust provider.
     * </p>
     * 
     * @param verifiedAccessTrustProviderId
     *        The ID of the Amazon Web Services Verified Access trust provider.
     */

    public void setVerifiedAccessTrustProviderId(String verifiedAccessTrustProviderId) {
        this.verifiedAccessTrustProviderId = verifiedAccessTrustProviderId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access trust provider.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access trust provider.
     */

    public String getVerifiedAccessTrustProviderId() {
        return this.verifiedAccessTrustProviderId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access trust provider.
     * </p>
     * 
     * @param verifiedAccessTrustProviderId
     *        The ID of the Amazon Web Services Verified Access trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessTrustProvider withVerifiedAccessTrustProviderId(String verifiedAccessTrustProviderId) {
        setVerifiedAccessTrustProviderId(verifiedAccessTrustProviderId);
        return this;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access trust provider.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Web Services Verified Access trust provider.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access trust provider.
     * </p>
     * 
     * @return A description for the Amazon Web Services Verified Access trust provider.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access trust provider.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Web Services Verified Access trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessTrustProvider withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of Verified Access trust provider.
     * </p>
     * 
     * @param trustProviderType
     *        The type of Verified Access trust provider.
     * @see TrustProviderType
     */

    public void setTrustProviderType(String trustProviderType) {
        this.trustProviderType = trustProviderType;
    }

    /**
     * <p>
     * The type of Verified Access trust provider.
     * </p>
     * 
     * @return The type of Verified Access trust provider.
     * @see TrustProviderType
     */

    public String getTrustProviderType() {
        return this.trustProviderType;
    }

    /**
     * <p>
     * The type of Verified Access trust provider.
     * </p>
     * 
     * @param trustProviderType
     *        The type of Verified Access trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustProviderType
     */

    public VerifiedAccessTrustProvider withTrustProviderType(String trustProviderType) {
        setTrustProviderType(trustProviderType);
        return this;
    }

    /**
     * <p>
     * The type of Verified Access trust provider.
     * </p>
     * 
     * @param trustProviderType
     *        The type of Verified Access trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustProviderType
     */

    public VerifiedAccessTrustProvider withTrustProviderType(TrustProviderType trustProviderType) {
        this.trustProviderType = trustProviderType.toString();
        return this;
    }

    /**
     * <p>
     * The type of user-based trust provider.
     * </p>
     * 
     * @param userTrustProviderType
     *        The type of user-based trust provider.
     * @see UserTrustProviderType
     */

    public void setUserTrustProviderType(String userTrustProviderType) {
        this.userTrustProviderType = userTrustProviderType;
    }

    /**
     * <p>
     * The type of user-based trust provider.
     * </p>
     * 
     * @return The type of user-based trust provider.
     * @see UserTrustProviderType
     */

    public String getUserTrustProviderType() {
        return this.userTrustProviderType;
    }

    /**
     * <p>
     * The type of user-based trust provider.
     * </p>
     * 
     * @param userTrustProviderType
     *        The type of user-based trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserTrustProviderType
     */

    public VerifiedAccessTrustProvider withUserTrustProviderType(String userTrustProviderType) {
        setUserTrustProviderType(userTrustProviderType);
        return this;
    }

    /**
     * <p>
     * The type of user-based trust provider.
     * </p>
     * 
     * @param userTrustProviderType
     *        The type of user-based trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserTrustProviderType
     */

    public VerifiedAccessTrustProvider withUserTrustProviderType(UserTrustProviderType userTrustProviderType) {
        this.userTrustProviderType = userTrustProviderType.toString();
        return this;
    }

    /**
     * <p>
     * The type of device-based trust provider.
     * </p>
     * 
     * @param deviceTrustProviderType
     *        The type of device-based trust provider.
     * @see DeviceTrustProviderType
     */

    public void setDeviceTrustProviderType(String deviceTrustProviderType) {
        this.deviceTrustProviderType = deviceTrustProviderType;
    }

    /**
     * <p>
     * The type of device-based trust provider.
     * </p>
     * 
     * @return The type of device-based trust provider.
     * @see DeviceTrustProviderType
     */

    public String getDeviceTrustProviderType() {
        return this.deviceTrustProviderType;
    }

    /**
     * <p>
     * The type of device-based trust provider.
     * </p>
     * 
     * @param deviceTrustProviderType
     *        The type of device-based trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceTrustProviderType
     */

    public VerifiedAccessTrustProvider withDeviceTrustProviderType(String deviceTrustProviderType) {
        setDeviceTrustProviderType(deviceTrustProviderType);
        return this;
    }

    /**
     * <p>
     * The type of device-based trust provider.
     * </p>
     * 
     * @param deviceTrustProviderType
     *        The type of device-based trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceTrustProviderType
     */

    public VerifiedAccessTrustProvider withDeviceTrustProviderType(DeviceTrustProviderType deviceTrustProviderType) {
        this.deviceTrustProviderType = deviceTrustProviderType.toString();
        return this;
    }

    /**
     * <p>
     * The OpenID Connect details for an <code>oidc</code>-type, user-identity based trust provider.
     * </p>
     * 
     * @param oidcOptions
     *        The OpenID Connect details for an <code>oidc</code>-type, user-identity based trust provider.
     */

    public void setOidcOptions(OidcOptions oidcOptions) {
        this.oidcOptions = oidcOptions;
    }

    /**
     * <p>
     * The OpenID Connect details for an <code>oidc</code>-type, user-identity based trust provider.
     * </p>
     * 
     * @return The OpenID Connect details for an <code>oidc</code>-type, user-identity based trust provider.
     */

    public OidcOptions getOidcOptions() {
        return this.oidcOptions;
    }

    /**
     * <p>
     * The OpenID Connect details for an <code>oidc</code>-type, user-identity based trust provider.
     * </p>
     * 
     * @param oidcOptions
     *        The OpenID Connect details for an <code>oidc</code>-type, user-identity based trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessTrustProvider withOidcOptions(OidcOptions oidcOptions) {
        setOidcOptions(oidcOptions);
        return this;
    }

    /**
     * <p>
     * The options for device-identity type trust provider.
     * </p>
     * 
     * @param deviceOptions
     *        The options for device-identity type trust provider.
     */

    public void setDeviceOptions(DeviceOptions deviceOptions) {
        this.deviceOptions = deviceOptions;
    }

    /**
     * <p>
     * The options for device-identity type trust provider.
     * </p>
     * 
     * @return The options for device-identity type trust provider.
     */

    public DeviceOptions getDeviceOptions() {
        return this.deviceOptions;
    }

    /**
     * <p>
     * The options for device-identity type trust provider.
     * </p>
     * 
     * @param deviceOptions
     *        The options for device-identity type trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessTrustProvider withDeviceOptions(DeviceOptions deviceOptions) {
        setDeviceOptions(deviceOptions);
        return this;
    }

    /**
     * <p>
     * The identifier to be used when working with policy rules.
     * </p>
     * 
     * @param policyReferenceName
     *        The identifier to be used when working with policy rules.
     */

    public void setPolicyReferenceName(String policyReferenceName) {
        this.policyReferenceName = policyReferenceName;
    }

    /**
     * <p>
     * The identifier to be used when working with policy rules.
     * </p>
     * 
     * @return The identifier to be used when working with policy rules.
     */

    public String getPolicyReferenceName() {
        return this.policyReferenceName;
    }

    /**
     * <p>
     * The identifier to be used when working with policy rules.
     * </p>
     * 
     * @param policyReferenceName
     *        The identifier to be used when working with policy rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessTrustProvider withPolicyReferenceName(String policyReferenceName) {
        setPolicyReferenceName(policyReferenceName);
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @return The creation time.
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessTrustProvider withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last updated time.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last updated time.
     */

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last updated time.
     * </p>
     * 
     * @return The last updated time.
     */

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last updated time.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last updated time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessTrustProvider withLastUpdatedTime(String lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @return The tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessTrustProvider withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessTrustProvider withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getVerifiedAccessTrustProviderId() != null)
            sb.append("VerifiedAccessTrustProviderId: ").append(getVerifiedAccessTrustProviderId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTrustProviderType() != null)
            sb.append("TrustProviderType: ").append(getTrustProviderType()).append(",");
        if (getUserTrustProviderType() != null)
            sb.append("UserTrustProviderType: ").append(getUserTrustProviderType()).append(",");
        if (getDeviceTrustProviderType() != null)
            sb.append("DeviceTrustProviderType: ").append(getDeviceTrustProviderType()).append(",");
        if (getOidcOptions() != null)
            sb.append("OidcOptions: ").append(getOidcOptions()).append(",");
        if (getDeviceOptions() != null)
            sb.append("DeviceOptions: ").append(getDeviceOptions()).append(",");
        if (getPolicyReferenceName() != null)
            sb.append("PolicyReferenceName: ").append(getPolicyReferenceName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifiedAccessTrustProvider == false)
            return false;
        VerifiedAccessTrustProvider other = (VerifiedAccessTrustProvider) obj;
        if (other.getVerifiedAccessTrustProviderId() == null ^ this.getVerifiedAccessTrustProviderId() == null)
            return false;
        if (other.getVerifiedAccessTrustProviderId() != null
                && other.getVerifiedAccessTrustProviderId().equals(this.getVerifiedAccessTrustProviderId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTrustProviderType() == null ^ this.getTrustProviderType() == null)
            return false;
        if (other.getTrustProviderType() != null && other.getTrustProviderType().equals(this.getTrustProviderType()) == false)
            return false;
        if (other.getUserTrustProviderType() == null ^ this.getUserTrustProviderType() == null)
            return false;
        if (other.getUserTrustProviderType() != null && other.getUserTrustProviderType().equals(this.getUserTrustProviderType()) == false)
            return false;
        if (other.getDeviceTrustProviderType() == null ^ this.getDeviceTrustProviderType() == null)
            return false;
        if (other.getDeviceTrustProviderType() != null && other.getDeviceTrustProviderType().equals(this.getDeviceTrustProviderType()) == false)
            return false;
        if (other.getOidcOptions() == null ^ this.getOidcOptions() == null)
            return false;
        if (other.getOidcOptions() != null && other.getOidcOptions().equals(this.getOidcOptions()) == false)
            return false;
        if (other.getDeviceOptions() == null ^ this.getDeviceOptions() == null)
            return false;
        if (other.getDeviceOptions() != null && other.getDeviceOptions().equals(this.getDeviceOptions()) == false)
            return false;
        if (other.getPolicyReferenceName() == null ^ this.getPolicyReferenceName() == null)
            return false;
        if (other.getPolicyReferenceName() != null && other.getPolicyReferenceName().equals(this.getPolicyReferenceName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedAccessTrustProviderId() == null) ? 0 : getVerifiedAccessTrustProviderId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTrustProviderType() == null) ? 0 : getTrustProviderType().hashCode());
        hashCode = prime * hashCode + ((getUserTrustProviderType() == null) ? 0 : getUserTrustProviderType().hashCode());
        hashCode = prime * hashCode + ((getDeviceTrustProviderType() == null) ? 0 : getDeviceTrustProviderType().hashCode());
        hashCode = prime * hashCode + ((getOidcOptions() == null) ? 0 : getOidcOptions().hashCode());
        hashCode = prime * hashCode + ((getDeviceOptions() == null) ? 0 : getDeviceOptions().hashCode());
        hashCode = prime * hashCode + ((getPolicyReferenceName() == null) ? 0 : getPolicyReferenceName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public VerifiedAccessTrustProvider clone() {
        try {
            return (VerifiedAccessTrustProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
