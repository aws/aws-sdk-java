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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a token.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/TokenData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TokenData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Token ID.
     * </p>
     */
    private String tokenId;
    /**
     * <p>
     * Type of token generated. The supported value is <code>REFRESH_TOKEN</code>.
     * </p>
     */
    private String tokenType;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the license.
     * </p>
     */
    private String licenseArn;
    /**
     * <p>
     * Token expiration time, in ISO8601-UTC format.
     * </p>
     */
    private String expirationTime;
    /**
     * <p>
     * Data specified by the caller.
     * </p>
     */
    private java.util.List<String> tokenProperties;
    /**
     * <p>
     * Amazon Resource Names (ARN) of the roles included in the token.
     * </p>
     */
    private java.util.List<String> roleArns;
    /**
     * <p>
     * Token status. The possible values are <code>AVAILABLE</code> and <code>DELETED</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Token ID.
     * </p>
     * 
     * @param tokenId
     *        Token ID.
     */

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    /**
     * <p>
     * Token ID.
     * </p>
     * 
     * @return Token ID.
     */

    public String getTokenId() {
        return this.tokenId;
    }

    /**
     * <p>
     * Token ID.
     * </p>
     * 
     * @param tokenId
     *        Token ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenData withTokenId(String tokenId) {
        setTokenId(tokenId);
        return this;
    }

    /**
     * <p>
     * Type of token generated. The supported value is <code>REFRESH_TOKEN</code>.
     * </p>
     * 
     * @param tokenType
     *        Type of token generated. The supported value is <code>REFRESH_TOKEN</code>.
     */

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * <p>
     * Type of token generated. The supported value is <code>REFRESH_TOKEN</code>.
     * </p>
     * 
     * @return Type of token generated. The supported value is <code>REFRESH_TOKEN</code>.
     */

    public String getTokenType() {
        return this.tokenType;
    }

    /**
     * <p>
     * Type of token generated. The supported value is <code>REFRESH_TOKEN</code>.
     * </p>
     * 
     * @param tokenType
     *        Type of token generated. The supported value is <code>REFRESH_TOKEN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenData withTokenType(String tokenType) {
        setTokenType(tokenType);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license.
     * </p>
     * 
     * @param licenseArn
     *        Amazon Resource Name (ARN) of the license.
     */

    public void setLicenseArn(String licenseArn) {
        this.licenseArn = licenseArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the license.
     */

    public String getLicenseArn() {
        return this.licenseArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license.
     * </p>
     * 
     * @param licenseArn
     *        Amazon Resource Name (ARN) of the license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenData withLicenseArn(String licenseArn) {
        setLicenseArn(licenseArn);
        return this;
    }

    /**
     * <p>
     * Token expiration time, in ISO8601-UTC format.
     * </p>
     * 
     * @param expirationTime
     *        Token expiration time, in ISO8601-UTC format.
     */

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * <p>
     * Token expiration time, in ISO8601-UTC format.
     * </p>
     * 
     * @return Token expiration time, in ISO8601-UTC format.
     */

    public String getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * <p>
     * Token expiration time, in ISO8601-UTC format.
     * </p>
     * 
     * @param expirationTime
     *        Token expiration time, in ISO8601-UTC format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenData withExpirationTime(String expirationTime) {
        setExpirationTime(expirationTime);
        return this;
    }

    /**
     * <p>
     * Data specified by the caller.
     * </p>
     * 
     * @return Data specified by the caller.
     */

    public java.util.List<String> getTokenProperties() {
        return tokenProperties;
    }

    /**
     * <p>
     * Data specified by the caller.
     * </p>
     * 
     * @param tokenProperties
     *        Data specified by the caller.
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
     * Data specified by the caller.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTokenProperties(java.util.Collection)} or {@link #withTokenProperties(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param tokenProperties
     *        Data specified by the caller.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenData withTokenProperties(String... tokenProperties) {
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
     * Data specified by the caller.
     * </p>
     * 
     * @param tokenProperties
     *        Data specified by the caller.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenData withTokenProperties(java.util.Collection<String> tokenProperties) {
        setTokenProperties(tokenProperties);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Names (ARN) of the roles included in the token.
     * </p>
     * 
     * @return Amazon Resource Names (ARN) of the roles included in the token.
     */

    public java.util.List<String> getRoleArns() {
        return roleArns;
    }

    /**
     * <p>
     * Amazon Resource Names (ARN) of the roles included in the token.
     * </p>
     * 
     * @param roleArns
     *        Amazon Resource Names (ARN) of the roles included in the token.
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
     * Amazon Resource Names (ARN) of the roles included in the token.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoleArns(java.util.Collection)} or {@link #withRoleArns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param roleArns
     *        Amazon Resource Names (ARN) of the roles included in the token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenData withRoleArns(String... roleArns) {
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
     * Amazon Resource Names (ARN) of the roles included in the token.
     * </p>
     * 
     * @param roleArns
     *        Amazon Resource Names (ARN) of the roles included in the token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenData withRoleArns(java.util.Collection<String> roleArns) {
        setRoleArns(roleArns);
        return this;
    }

    /**
     * <p>
     * Token status. The possible values are <code>AVAILABLE</code> and <code>DELETED</code>.
     * </p>
     * 
     * @param status
     *        Token status. The possible values are <code>AVAILABLE</code> and <code>DELETED</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Token status. The possible values are <code>AVAILABLE</code> and <code>DELETED</code>.
     * </p>
     * 
     * @return Token status. The possible values are <code>AVAILABLE</code> and <code>DELETED</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Token status. The possible values are <code>AVAILABLE</code> and <code>DELETED</code>.
     * </p>
     * 
     * @param status
     *        Token status. The possible values are <code>AVAILABLE</code> and <code>DELETED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TokenData withStatus(String status) {
        setStatus(status);
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
        if (getTokenId() != null)
            sb.append("TokenId: ").append(getTokenId()).append(",");
        if (getTokenType() != null)
            sb.append("TokenType: ").append(getTokenType()).append(",");
        if (getLicenseArn() != null)
            sb.append("LicenseArn: ").append(getLicenseArn()).append(",");
        if (getExpirationTime() != null)
            sb.append("ExpirationTime: ").append(getExpirationTime()).append(",");
        if (getTokenProperties() != null)
            sb.append("TokenProperties: ").append(getTokenProperties()).append(",");
        if (getRoleArns() != null)
            sb.append("RoleArns: ").append(getRoleArns()).append(",");
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

        if (obj instanceof TokenData == false)
            return false;
        TokenData other = (TokenData) obj;
        if (other.getTokenId() == null ^ this.getTokenId() == null)
            return false;
        if (other.getTokenId() != null && other.getTokenId().equals(this.getTokenId()) == false)
            return false;
        if (other.getTokenType() == null ^ this.getTokenType() == null)
            return false;
        if (other.getTokenType() != null && other.getTokenType().equals(this.getTokenType()) == false)
            return false;
        if (other.getLicenseArn() == null ^ this.getLicenseArn() == null)
            return false;
        if (other.getLicenseArn() != null && other.getLicenseArn().equals(this.getLicenseArn()) == false)
            return false;
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null)
            return false;
        if (other.getExpirationTime() != null && other.getExpirationTime().equals(this.getExpirationTime()) == false)
            return false;
        if (other.getTokenProperties() == null ^ this.getTokenProperties() == null)
            return false;
        if (other.getTokenProperties() != null && other.getTokenProperties().equals(this.getTokenProperties()) == false)
            return false;
        if (other.getRoleArns() == null ^ this.getRoleArns() == null)
            return false;
        if (other.getRoleArns() != null && other.getRoleArns().equals(this.getRoleArns()) == false)
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

        hashCode = prime * hashCode + ((getTokenId() == null) ? 0 : getTokenId().hashCode());
        hashCode = prime * hashCode + ((getTokenType() == null) ? 0 : getTokenType().hashCode());
        hashCode = prime * hashCode + ((getLicenseArn() == null) ? 0 : getLicenseArn().hashCode());
        hashCode = prime * hashCode + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getTokenProperties() == null) ? 0 : getTokenProperties().hashCode());
        hashCode = prime * hashCode + ((getRoleArns() == null) ? 0 : getRoleArns().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public TokenData clone() {
        try {
            return (TokenData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.TokenDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
