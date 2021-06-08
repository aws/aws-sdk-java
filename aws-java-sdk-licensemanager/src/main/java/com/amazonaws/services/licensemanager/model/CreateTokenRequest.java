/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license. The ARN is mapped to the aud claim of the JWT token.
     * </p>
     */
    private String licenseArn;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM roles to embed in the token. License Manager does not check whether the
     * roles are in use.
     * </p>
     */
    private java.util.List<String> roleArns;
    /**
     * <p>
     * Token expiration, in days, counted from token creation. The default is 365 days.
     * </p>
     */
    private Integer expirationInDays;
    /**
     * <p>
     * Data specified by the caller to be included in the JWT token. The data is mapped to the amr claim of the JWT
     * token.
     * </p>
     */
    private java.util.List<String> tokenProperties;
    /**
     * <p>
     * Idempotency token, valid for 10 minutes.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license. The ARN is mapped to the aud claim of the JWT token.
     * </p>
     * 
     * @param licenseArn
     *        Amazon Resource Name (ARN) of the license. The ARN is mapped to the aud claim of the JWT token.
     */

    public void setLicenseArn(String licenseArn) {
        this.licenseArn = licenseArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license. The ARN is mapped to the aud claim of the JWT token.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the license. The ARN is mapped to the aud claim of the JWT token.
     */

    public String getLicenseArn() {
        return this.licenseArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license. The ARN is mapped to the aud claim of the JWT token.
     * </p>
     * 
     * @param licenseArn
     *        Amazon Resource Name (ARN) of the license. The ARN is mapped to the aud claim of the JWT token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withLicenseArn(String licenseArn) {
        setLicenseArn(licenseArn);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM roles to embed in the token. License Manager does not check whether the
     * roles are in use.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the IAM roles to embed in the token. License Manager does not check whether
     *         the roles are in use.
     */

    public java.util.List<String> getRoleArns() {
        return roleArns;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM roles to embed in the token. License Manager does not check whether the
     * roles are in use.
     * </p>
     * 
     * @param roleArns
     *        Amazon Resource Name (ARN) of the IAM roles to embed in the token. License Manager does not check whether
     *        the roles are in use.
     */

    public void setRoleArns(java.util.Collection<String> roleArns) {
        if (roleArns == null) {
            this.roleArns = null;
            return;
        }

        this.roleArns = new java.util.ArrayList<String>(roleArns);
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM roles to embed in the token. License Manager does not check whether the
     * roles are in use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoleArns(java.util.Collection)} or {@link #withRoleArns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param roleArns
     *        Amazon Resource Name (ARN) of the IAM roles to embed in the token. License Manager does not check whether
     *        the roles are in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withRoleArns(String... roleArns) {
        if (this.roleArns == null) {
            setRoleArns(new java.util.ArrayList<String>(roleArns.length));
        }
        for (String ele : roleArns) {
            this.roleArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM roles to embed in the token. License Manager does not check whether the
     * roles are in use.
     * </p>
     * 
     * @param roleArns
     *        Amazon Resource Name (ARN) of the IAM roles to embed in the token. License Manager does not check whether
     *        the roles are in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withRoleArns(java.util.Collection<String> roleArns) {
        setRoleArns(roleArns);
        return this;
    }

    /**
     * <p>
     * Token expiration, in days, counted from token creation. The default is 365 days.
     * </p>
     * 
     * @param expirationInDays
     *        Token expiration, in days, counted from token creation. The default is 365 days.
     */

    public void setExpirationInDays(Integer expirationInDays) {
        this.expirationInDays = expirationInDays;
    }

    /**
     * <p>
     * Token expiration, in days, counted from token creation. The default is 365 days.
     * </p>
     * 
     * @return Token expiration, in days, counted from token creation. The default is 365 days.
     */

    public Integer getExpirationInDays() {
        return this.expirationInDays;
    }

    /**
     * <p>
     * Token expiration, in days, counted from token creation. The default is 365 days.
     * </p>
     * 
     * @param expirationInDays
     *        Token expiration, in days, counted from token creation. The default is 365 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withExpirationInDays(Integer expirationInDays) {
        setExpirationInDays(expirationInDays);
        return this;
    }

    /**
     * <p>
     * Data specified by the caller to be included in the JWT token. The data is mapped to the amr claim of the JWT
     * token.
     * </p>
     * 
     * @return Data specified by the caller to be included in the JWT token. The data is mapped to the amr claim of the
     *         JWT token.
     */

    public java.util.List<String> getTokenProperties() {
        return tokenProperties;
    }

    /**
     * <p>
     * Data specified by the caller to be included in the JWT token. The data is mapped to the amr claim of the JWT
     * token.
     * </p>
     * 
     * @param tokenProperties
     *        Data specified by the caller to be included in the JWT token. The data is mapped to the amr claim of the
     *        JWT token.
     */

    public void setTokenProperties(java.util.Collection<String> tokenProperties) {
        if (tokenProperties == null) {
            this.tokenProperties = null;
            return;
        }

        this.tokenProperties = new java.util.ArrayList<String>(tokenProperties);
    }

    /**
     * <p>
     * Data specified by the caller to be included in the JWT token. The data is mapped to the amr claim of the JWT
     * token.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTokenProperties(java.util.Collection)} or {@link #withTokenProperties(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param tokenProperties
     *        Data specified by the caller to be included in the JWT token. The data is mapped to the amr claim of the
     *        JWT token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withTokenProperties(String... tokenProperties) {
        if (this.tokenProperties == null) {
            setTokenProperties(new java.util.ArrayList<String>(tokenProperties.length));
        }
        for (String ele : tokenProperties) {
            this.tokenProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Data specified by the caller to be included in the JWT token. The data is mapped to the amr claim of the JWT
     * token.
     * </p>
     * 
     * @param tokenProperties
     *        Data specified by the caller to be included in the JWT token. The data is mapped to the amr claim of the
     *        JWT token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withTokenProperties(java.util.Collection<String> tokenProperties) {
        setTokenProperties(tokenProperties);
        return this;
    }

    /**
     * <p>
     * Idempotency token, valid for 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        Idempotency token, valid for 10 minutes.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Idempotency token, valid for 10 minutes.
     * </p>
     * 
     * @return Idempotency token, valid for 10 minutes.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Idempotency token, valid for 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        Idempotency token, valid for 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getLicenseArn() != null)
            sb.append("LicenseArn: ").append(getLicenseArn()).append(",");
        if (getRoleArns() != null)
            sb.append("RoleArns: ").append(getRoleArns()).append(",");
        if (getExpirationInDays() != null)
            sb.append("ExpirationInDays: ").append(getExpirationInDays()).append(",");
        if (getTokenProperties() != null)
            sb.append("TokenProperties: ").append(getTokenProperties()).append(",");
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

        if (obj instanceof CreateTokenRequest == false)
            return false;
        CreateTokenRequest other = (CreateTokenRequest) obj;
        if (other.getLicenseArn() == null ^ this.getLicenseArn() == null)
            return false;
        if (other.getLicenseArn() != null && other.getLicenseArn().equals(this.getLicenseArn()) == false)
            return false;
        if (other.getRoleArns() == null ^ this.getRoleArns() == null)
            return false;
        if (other.getRoleArns() != null && other.getRoleArns().equals(this.getRoleArns()) == false)
            return false;
        if (other.getExpirationInDays() == null ^ this.getExpirationInDays() == null)
            return false;
        if (other.getExpirationInDays() != null && other.getExpirationInDays().equals(this.getExpirationInDays()) == false)
            return false;
        if (other.getTokenProperties() == null ^ this.getTokenProperties() == null)
            return false;
        if (other.getTokenProperties() != null && other.getTokenProperties().equals(this.getTokenProperties()) == false)
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

        hashCode = prime * hashCode + ((getLicenseArn() == null) ? 0 : getLicenseArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArns() == null) ? 0 : getRoleArns().hashCode());
        hashCode = prime * hashCode + ((getExpirationInDays() == null) ? 0 : getExpirationInDays().hashCode());
        hashCode = prime * hashCode + ((getTokenProperties() == null) ? 0 : getTokenProperties().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateTokenRequest clone() {
        return (CreateTokenRequest) super.clone();
    }

}
