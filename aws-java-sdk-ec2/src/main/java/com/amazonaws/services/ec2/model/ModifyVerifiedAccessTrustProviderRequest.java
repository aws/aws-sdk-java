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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyVerifiedAccessTrustProviderRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVerifiedAccessTrustProviderRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyVerifiedAccessTrustProviderRequest> {

    /**
     * <p>
     * The ID of the Verified Access trust provider.
     * </p>
     */
    private String verifiedAccessTrustProviderId;
    /**
     * <p>
     * The options for an OpenID Connect-compatible user-identity trust provider.
     * </p>
     */
    private ModifyVerifiedAccessTrustProviderOidcOptions oidcOptions;
    /**
     * <p>
     * The options for a device-based trust provider. This parameter is required when the provider type is
     * <code>device</code>.
     * </p>
     */
    private ModifyVerifiedAccessTrustProviderDeviceOptions deviceOptions;
    /**
     * <p>
     * A description for the Verified Access trust provider.
     * </p>
     */
    private String description;
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
     * The options for server side encryption.
     * </p>
     */
    private VerifiedAccessSseSpecificationRequest sseSpecification;

    /**
     * <p>
     * The ID of the Verified Access trust provider.
     * </p>
     * 
     * @param verifiedAccessTrustProviderId
     *        The ID of the Verified Access trust provider.
     */

    public void setVerifiedAccessTrustProviderId(String verifiedAccessTrustProviderId) {
        this.verifiedAccessTrustProviderId = verifiedAccessTrustProviderId;
    }

    /**
     * <p>
     * The ID of the Verified Access trust provider.
     * </p>
     * 
     * @return The ID of the Verified Access trust provider.
     */

    public String getVerifiedAccessTrustProviderId() {
        return this.verifiedAccessTrustProviderId;
    }

    /**
     * <p>
     * The ID of the Verified Access trust provider.
     * </p>
     * 
     * @param verifiedAccessTrustProviderId
     *        The ID of the Verified Access trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessTrustProviderRequest withVerifiedAccessTrustProviderId(String verifiedAccessTrustProviderId) {
        setVerifiedAccessTrustProviderId(verifiedAccessTrustProviderId);
        return this;
    }

    /**
     * <p>
     * The options for an OpenID Connect-compatible user-identity trust provider.
     * </p>
     * 
     * @param oidcOptions
     *        The options for an OpenID Connect-compatible user-identity trust provider.
     */

    public void setOidcOptions(ModifyVerifiedAccessTrustProviderOidcOptions oidcOptions) {
        this.oidcOptions = oidcOptions;
    }

    /**
     * <p>
     * The options for an OpenID Connect-compatible user-identity trust provider.
     * </p>
     * 
     * @return The options for an OpenID Connect-compatible user-identity trust provider.
     */

    public ModifyVerifiedAccessTrustProviderOidcOptions getOidcOptions() {
        return this.oidcOptions;
    }

    /**
     * <p>
     * The options for an OpenID Connect-compatible user-identity trust provider.
     * </p>
     * 
     * @param oidcOptions
     *        The options for an OpenID Connect-compatible user-identity trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessTrustProviderRequest withOidcOptions(ModifyVerifiedAccessTrustProviderOidcOptions oidcOptions) {
        setOidcOptions(oidcOptions);
        return this;
    }

    /**
     * <p>
     * The options for a device-based trust provider. This parameter is required when the provider type is
     * <code>device</code>.
     * </p>
     * 
     * @param deviceOptions
     *        The options for a device-based trust provider. This parameter is required when the provider type is
     *        <code>device</code>.
     */

    public void setDeviceOptions(ModifyVerifiedAccessTrustProviderDeviceOptions deviceOptions) {
        this.deviceOptions = deviceOptions;
    }

    /**
     * <p>
     * The options for a device-based trust provider. This parameter is required when the provider type is
     * <code>device</code>.
     * </p>
     * 
     * @return The options for a device-based trust provider. This parameter is required when the provider type is
     *         <code>device</code>.
     */

    public ModifyVerifiedAccessTrustProviderDeviceOptions getDeviceOptions() {
        return this.deviceOptions;
    }

    /**
     * <p>
     * The options for a device-based trust provider. This parameter is required when the provider type is
     * <code>device</code>.
     * </p>
     * 
     * @param deviceOptions
     *        The options for a device-based trust provider. This parameter is required when the provider type is
     *        <code>device</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessTrustProviderRequest withDeviceOptions(ModifyVerifiedAccessTrustProviderDeviceOptions deviceOptions) {
        setDeviceOptions(deviceOptions);
        return this;
    }

    /**
     * <p>
     * A description for the Verified Access trust provider.
     * </p>
     * 
     * @param description
     *        A description for the Verified Access trust provider.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the Verified Access trust provider.
     * </p>
     * 
     * @return A description for the Verified Access trust provider.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the Verified Access trust provider.
     * </p>
     * 
     * @param description
     *        A description for the Verified Access trust provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessTrustProviderRequest withDescription(String description) {
        setDescription(description);
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

    public ModifyVerifiedAccessTrustProviderRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The options for server side encryption.
     * </p>
     * 
     * @param sseSpecification
     *        The options for server side encryption.
     */

    public void setSseSpecification(VerifiedAccessSseSpecificationRequest sseSpecification) {
        this.sseSpecification = sseSpecification;
    }

    /**
     * <p>
     * The options for server side encryption.
     * </p>
     * 
     * @return The options for server side encryption.
     */

    public VerifiedAccessSseSpecificationRequest getSseSpecification() {
        return this.sseSpecification;
    }

    /**
     * <p>
     * The options for server side encryption.
     * </p>
     * 
     * @param sseSpecification
     *        The options for server side encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessTrustProviderRequest withSseSpecification(VerifiedAccessSseSpecificationRequest sseSpecification) {
        setSseSpecification(sseSpecification);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVerifiedAccessTrustProviderRequest> getDryRunRequest() {
        Request<ModifyVerifiedAccessTrustProviderRequest> request = new ModifyVerifiedAccessTrustProviderRequestMarshaller().marshall(this);
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
        if (getVerifiedAccessTrustProviderId() != null)
            sb.append("VerifiedAccessTrustProviderId: ").append(getVerifiedAccessTrustProviderId()).append(",");
        if (getOidcOptions() != null)
            sb.append("OidcOptions: ").append(getOidcOptions()).append(",");
        if (getDeviceOptions() != null)
            sb.append("DeviceOptions: ").append(getDeviceOptions()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getSseSpecification() != null)
            sb.append("SseSpecification: ").append(getSseSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVerifiedAccessTrustProviderRequest == false)
            return false;
        ModifyVerifiedAccessTrustProviderRequest other = (ModifyVerifiedAccessTrustProviderRequest) obj;
        if (other.getVerifiedAccessTrustProviderId() == null ^ this.getVerifiedAccessTrustProviderId() == null)
            return false;
        if (other.getVerifiedAccessTrustProviderId() != null
                && other.getVerifiedAccessTrustProviderId().equals(this.getVerifiedAccessTrustProviderId()) == false)
            return false;
        if (other.getOidcOptions() == null ^ this.getOidcOptions() == null)
            return false;
        if (other.getOidcOptions() != null && other.getOidcOptions().equals(this.getOidcOptions()) == false)
            return false;
        if (other.getDeviceOptions() == null ^ this.getDeviceOptions() == null)
            return false;
        if (other.getDeviceOptions() != null && other.getDeviceOptions().equals(this.getDeviceOptions()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getSseSpecification() == null ^ this.getSseSpecification() == null)
            return false;
        if (other.getSseSpecification() != null && other.getSseSpecification().equals(this.getSseSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedAccessTrustProviderId() == null) ? 0 : getVerifiedAccessTrustProviderId().hashCode());
        hashCode = prime * hashCode + ((getOidcOptions() == null) ? 0 : getOidcOptions().hashCode());
        hashCode = prime * hashCode + ((getDeviceOptions() == null) ? 0 : getDeviceOptions().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getSseSpecification() == null) ? 0 : getSseSpecification().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVerifiedAccessTrustProviderRequest clone() {
        return (ModifyVerifiedAccessTrustProviderRequest) super.clone();
    }
}
