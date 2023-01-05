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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateVerifiedAccessTrustProviderRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVerifiedAccessTrustProviderRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateVerifiedAccessTrustProviderRequest> {

    /**
     * <p>
     * The type of trust provider can be either user or device-based.
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
    private CreateVerifiedAccessTrustProviderOidcOptions oidcOptions;
    /**
     * <p>
     * The options for device identity based trust providers.
     * </p>
     */
    private CreateVerifiedAccessTrustProviderDeviceOptions deviceOptions;
    /**
     * <p>
     * The identifier to be used when working with policy rules.
     * </p>
     */
    private String policyReferenceName;
    /**
     * <p>
     * A description for the Amazon Web Services Verified Access trust provider.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The tags to assign to the Amazon Web Services Verified Access trust provider.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;
    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The type of trust provider can be either user or device-based.
     * </p>
     * 
     * @param trustProviderType
     *        The type of trust provider can be either user or device-based.
     * @see TrustProviderType
     */

    public void setTrustProviderType(String trustProviderType) {
        this.trustProviderType = trustProviderType;
    }

    /**
     * <p>
     * The type of trust provider can be either user or device-based.
     * </p>
     * 
     * @return The type of trust provider can be either user or device-based.
     * @see TrustProviderType
     */

    public String getTrustProviderType() {
        return this.trustProviderType;
    }

    /**
     * <p>
     * The type of trust provider can be either user or device-based.
     * </p>
     * 
     * @param trustProviderType
     *        The type of trust provider can be either user or device-based.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustProviderType
     */

    public CreateVerifiedAccessTrustProviderRequest withTrustProviderType(String trustProviderType) {
        setTrustProviderType(trustProviderType);
        return this;
    }

    /**
     * <p>
     * The type of trust provider can be either user or device-based.
     * </p>
     * 
     * @param trustProviderType
     *        The type of trust provider can be either user or device-based.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustProviderType
     */

    public CreateVerifiedAccessTrustProviderRequest withTrustProviderType(TrustProviderType trustProviderType) {
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

    public CreateVerifiedAccessTrustProviderRequest withUserTrustProviderType(String userTrustProviderType) {
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

    public CreateVerifiedAccessTrustProviderRequest withUserTrustProviderType(UserTrustProviderType userTrustProviderType) {
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

    public CreateVerifiedAccessTrustProviderRequest withDeviceTrustProviderType(String deviceTrustProviderType) {
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

    public CreateVerifiedAccessTrustProviderRequest withDeviceTrustProviderType(DeviceTrustProviderType deviceTrustProviderType) {
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

    public void setOidcOptions(CreateVerifiedAccessTrustProviderOidcOptions oidcOptions) {
        this.oidcOptions = oidcOptions;
    }

    /**
     * <p>
     * The OpenID Connect details for an <code>oidc</code>-type, user-identity based trust provider.
     * </p>
     * 
     * @return The OpenID Connect details for an <code>oidc</code>-type, user-identity based trust provider.
     */

    public CreateVerifiedAccessTrustProviderOidcOptions getOidcOptions() {
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

    public CreateVerifiedAccessTrustProviderRequest withOidcOptions(CreateVerifiedAccessTrustProviderOidcOptions oidcOptions) {
        setOidcOptions(oidcOptions);
        return this;
    }

    /**
     * <p>
     * The options for device identity based trust providers.
     * </p>
     * 
     * @param deviceOptions
     *        The options for device identity based trust providers.
     */

    public void setDeviceOptions(CreateVerifiedAccessTrustProviderDeviceOptions deviceOptions) {
        this.deviceOptions = deviceOptions;
    }

    /**
     * <p>
     * The options for device identity based trust providers.
     * </p>
     * 
     * @return The options for device identity based trust providers.
     */

    public CreateVerifiedAccessTrustProviderDeviceOptions getDeviceOptions() {
        return this.deviceOptions;
    }

    /**
     * <p>
     * The options for device identity based trust providers.
     * </p>
     * 
     * @param deviceOptions
     *        The options for device identity based trust providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessTrustProviderRequest withDeviceOptions(CreateVerifiedAccessTrustProviderDeviceOptions deviceOptions) {
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

    public CreateVerifiedAccessTrustProviderRequest withPolicyReferenceName(String policyReferenceName) {
        setPolicyReferenceName(policyReferenceName);
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

    public CreateVerifiedAccessTrustProviderRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The tags to assign to the Amazon Web Services Verified Access trust provider.
     * </p>
     * 
     * @return The tags to assign to the Amazon Web Services Verified Access trust provider.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to assign to the Amazon Web Services Verified Access trust provider.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the Amazon Web Services Verified Access trust provider.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to assign to the Amazon Web Services Verified Access trust provider.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the Amazon Web Services Verified Access trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessTrustProviderRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to assign to the Amazon Web Services Verified Access trust provider.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to assign to the Amazon Web Services Verified Access trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessTrustProviderRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessTrustProviderRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateVerifiedAccessTrustProviderRequest> getDryRunRequest() {
        Request<CreateVerifiedAccessTrustProviderRequest> request = new CreateVerifiedAccessTrustProviderRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVerifiedAccessTrustProviderRequest == false)
            return false;
        CreateVerifiedAccessTrustProviderRequest other = (CreateVerifiedAccessTrustProviderRequest) obj;
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrustProviderType() == null) ? 0 : getTrustProviderType().hashCode());
        hashCode = prime * hashCode + ((getUserTrustProviderType() == null) ? 0 : getUserTrustProviderType().hashCode());
        hashCode = prime * hashCode + ((getDeviceTrustProviderType() == null) ? 0 : getDeviceTrustProviderType().hashCode());
        hashCode = prime * hashCode + ((getOidcOptions() == null) ? 0 : getOidcOptions().hashCode());
        hashCode = prime * hashCode + ((getDeviceOptions() == null) ? 0 : getDeviceOptions().hashCode());
        hashCode = prime * hashCode + ((getPolicyReferenceName() == null) ? 0 : getPolicyReferenceName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateVerifiedAccessTrustProviderRequest clone() {
        return (CreateVerifiedAccessTrustProviderRequest) super.clone();
    }
}
