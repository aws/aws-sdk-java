/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information identifying the non-compliant resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the certificate attached to the resource.
     * </p>
     */
    private String deviceCertificateId;
    /**
     * <p>
     * The ID of the CA certificate used to authorize the certificate.
     * </p>
     */
    private String caCertificateId;
    /**
     * <p>
     * The ID of the Cognito Identity Pool.
     * </p>
     */
    private String cognitoIdentityPoolId;
    /**
     * <p>
     * The client ID.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The version of the policy associated with the resource.
     * </p>
     */
    private PolicyVersionIdentifier policyVersionIdentifier;
    /**
     * <p>
     * The account with which the resource is associated.
     * </p>
     */
    private String account;

    /**
     * <p>
     * The ID of the certificate attached to the resource.
     * </p>
     * 
     * @param deviceCertificateId
     *        The ID of the certificate attached to the resource.
     */

    public void setDeviceCertificateId(String deviceCertificateId) {
        this.deviceCertificateId = deviceCertificateId;
    }

    /**
     * <p>
     * The ID of the certificate attached to the resource.
     * </p>
     * 
     * @return The ID of the certificate attached to the resource.
     */

    public String getDeviceCertificateId() {
        return this.deviceCertificateId;
    }

    /**
     * <p>
     * The ID of the certificate attached to the resource.
     * </p>
     * 
     * @param deviceCertificateId
     *        The ID of the certificate attached to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceIdentifier withDeviceCertificateId(String deviceCertificateId) {
        setDeviceCertificateId(deviceCertificateId);
        return this;
    }

    /**
     * <p>
     * The ID of the CA certificate used to authorize the certificate.
     * </p>
     * 
     * @param caCertificateId
     *        The ID of the CA certificate used to authorize the certificate.
     */

    public void setCaCertificateId(String caCertificateId) {
        this.caCertificateId = caCertificateId;
    }

    /**
     * <p>
     * The ID of the CA certificate used to authorize the certificate.
     * </p>
     * 
     * @return The ID of the CA certificate used to authorize the certificate.
     */

    public String getCaCertificateId() {
        return this.caCertificateId;
    }

    /**
     * <p>
     * The ID of the CA certificate used to authorize the certificate.
     * </p>
     * 
     * @param caCertificateId
     *        The ID of the CA certificate used to authorize the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceIdentifier withCaCertificateId(String caCertificateId) {
        setCaCertificateId(caCertificateId);
        return this;
    }

    /**
     * <p>
     * The ID of the Cognito Identity Pool.
     * </p>
     * 
     * @param cognitoIdentityPoolId
     *        The ID of the Cognito Identity Pool.
     */

    public void setCognitoIdentityPoolId(String cognitoIdentityPoolId) {
        this.cognitoIdentityPoolId = cognitoIdentityPoolId;
    }

    /**
     * <p>
     * The ID of the Cognito Identity Pool.
     * </p>
     * 
     * @return The ID of the Cognito Identity Pool.
     */

    public String getCognitoIdentityPoolId() {
        return this.cognitoIdentityPoolId;
    }

    /**
     * <p>
     * The ID of the Cognito Identity Pool.
     * </p>
     * 
     * @param cognitoIdentityPoolId
     *        The ID of the Cognito Identity Pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceIdentifier withCognitoIdentityPoolId(String cognitoIdentityPoolId) {
        setCognitoIdentityPoolId(cognitoIdentityPoolId);
        return this;
    }

    /**
     * <p>
     * The client ID.
     * </p>
     * 
     * @param clientId
     *        The client ID.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The client ID.
     * </p>
     * 
     * @return The client ID.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The client ID.
     * </p>
     * 
     * @param clientId
     *        The client ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceIdentifier withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The version of the policy associated with the resource.
     * </p>
     * 
     * @param policyVersionIdentifier
     *        The version of the policy associated with the resource.
     */

    public void setPolicyVersionIdentifier(PolicyVersionIdentifier policyVersionIdentifier) {
        this.policyVersionIdentifier = policyVersionIdentifier;
    }

    /**
     * <p>
     * The version of the policy associated with the resource.
     * </p>
     * 
     * @return The version of the policy associated with the resource.
     */

    public PolicyVersionIdentifier getPolicyVersionIdentifier() {
        return this.policyVersionIdentifier;
    }

    /**
     * <p>
     * The version of the policy associated with the resource.
     * </p>
     * 
     * @param policyVersionIdentifier
     *        The version of the policy associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceIdentifier withPolicyVersionIdentifier(PolicyVersionIdentifier policyVersionIdentifier) {
        setPolicyVersionIdentifier(policyVersionIdentifier);
        return this;
    }

    /**
     * <p>
     * The account with which the resource is associated.
     * </p>
     * 
     * @param account
     *        The account with which the resource is associated.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The account with which the resource is associated.
     * </p>
     * 
     * @return The account with which the resource is associated.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The account with which the resource is associated.
     * </p>
     * 
     * @param account
     *        The account with which the resource is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceIdentifier withAccount(String account) {
        setAccount(account);
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
        if (getDeviceCertificateId() != null)
            sb.append("DeviceCertificateId: ").append(getDeviceCertificateId()).append(",");
        if (getCaCertificateId() != null)
            sb.append("CaCertificateId: ").append(getCaCertificateId()).append(",");
        if (getCognitoIdentityPoolId() != null)
            sb.append("CognitoIdentityPoolId: ").append(getCognitoIdentityPoolId()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getPolicyVersionIdentifier() != null)
            sb.append("PolicyVersionIdentifier: ").append(getPolicyVersionIdentifier()).append(",");
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceIdentifier == false)
            return false;
        ResourceIdentifier other = (ResourceIdentifier) obj;
        if (other.getDeviceCertificateId() == null ^ this.getDeviceCertificateId() == null)
            return false;
        if (other.getDeviceCertificateId() != null && other.getDeviceCertificateId().equals(this.getDeviceCertificateId()) == false)
            return false;
        if (other.getCaCertificateId() == null ^ this.getCaCertificateId() == null)
            return false;
        if (other.getCaCertificateId() != null && other.getCaCertificateId().equals(this.getCaCertificateId()) == false)
            return false;
        if (other.getCognitoIdentityPoolId() == null ^ this.getCognitoIdentityPoolId() == null)
            return false;
        if (other.getCognitoIdentityPoolId() != null && other.getCognitoIdentityPoolId().equals(this.getCognitoIdentityPoolId()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getPolicyVersionIdentifier() == null ^ this.getPolicyVersionIdentifier() == null)
            return false;
        if (other.getPolicyVersionIdentifier() != null && other.getPolicyVersionIdentifier().equals(this.getPolicyVersionIdentifier()) == false)
            return false;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceCertificateId() == null) ? 0 : getDeviceCertificateId().hashCode());
        hashCode = prime * hashCode + ((getCaCertificateId() == null) ? 0 : getCaCertificateId().hashCode());
        hashCode = prime * hashCode + ((getCognitoIdentityPoolId() == null) ? 0 : getCognitoIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getPolicyVersionIdentifier() == null) ? 0 : getPolicyVersionIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        return hashCode;
    }

    @Override
    public ResourceIdentifier clone() {
        try {
            return (ResourceIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ResourceIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
