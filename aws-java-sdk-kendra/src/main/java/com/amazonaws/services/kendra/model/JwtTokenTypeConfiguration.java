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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for the JWT token type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/JwtTokenTypeConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JwtTokenTypeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location of the key.
     * </p>
     */
    private String keyLocation;
    /**
     * <p>
     * The signing key URL.
     * </p>
     */
    private String uRL;
    /**
     * <p>
     * The Amazon Resource Name (arn) of the secret.
     * </p>
     */
    private String secretManagerArn;
    /**
     * <p>
     * The user name attribute field.
     * </p>
     */
    private String userNameAttributeField;
    /**
     * <p>
     * The group attribute field.
     * </p>
     */
    private String groupAttributeField;
    /**
     * <p>
     * The issuer of the token.
     * </p>
     */
    private String issuer;
    /**
     * <p>
     * The regular expression that identifies the claim.
     * </p>
     */
    private String claimRegex;

    /**
     * <p>
     * The location of the key.
     * </p>
     * 
     * @param keyLocation
     *        The location of the key.
     * @see KeyLocation
     */

    public void setKeyLocation(String keyLocation) {
        this.keyLocation = keyLocation;
    }

    /**
     * <p>
     * The location of the key.
     * </p>
     * 
     * @return The location of the key.
     * @see KeyLocation
     */

    public String getKeyLocation() {
        return this.keyLocation;
    }

    /**
     * <p>
     * The location of the key.
     * </p>
     * 
     * @param keyLocation
     *        The location of the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyLocation
     */

    public JwtTokenTypeConfiguration withKeyLocation(String keyLocation) {
        setKeyLocation(keyLocation);
        return this;
    }

    /**
     * <p>
     * The location of the key.
     * </p>
     * 
     * @param keyLocation
     *        The location of the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyLocation
     */

    public JwtTokenTypeConfiguration withKeyLocation(KeyLocation keyLocation) {
        this.keyLocation = keyLocation.toString();
        return this;
    }

    /**
     * <p>
     * The signing key URL.
     * </p>
     * 
     * @param uRL
     *        The signing key URL.
     */

    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    /**
     * <p>
     * The signing key URL.
     * </p>
     * 
     * @return The signing key URL.
     */

    public String getURL() {
        return this.uRL;
    }

    /**
     * <p>
     * The signing key URL.
     * </p>
     * 
     * @param uRL
     *        The signing key URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JwtTokenTypeConfiguration withURL(String uRL) {
        setURL(uRL);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the secret.
     * </p>
     * 
     * @param secretManagerArn
     *        The Amazon Resource Name (arn) of the secret.
     */

    public void setSecretManagerArn(String secretManagerArn) {
        this.secretManagerArn = secretManagerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the secret.
     * </p>
     * 
     * @return The Amazon Resource Name (arn) of the secret.
     */

    public String getSecretManagerArn() {
        return this.secretManagerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the secret.
     * </p>
     * 
     * @param secretManagerArn
     *        The Amazon Resource Name (arn) of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JwtTokenTypeConfiguration withSecretManagerArn(String secretManagerArn) {
        setSecretManagerArn(secretManagerArn);
        return this;
    }

    /**
     * <p>
     * The user name attribute field.
     * </p>
     * 
     * @param userNameAttributeField
     *        The user name attribute field.
     */

    public void setUserNameAttributeField(String userNameAttributeField) {
        this.userNameAttributeField = userNameAttributeField;
    }

    /**
     * <p>
     * The user name attribute field.
     * </p>
     * 
     * @return The user name attribute field.
     */

    public String getUserNameAttributeField() {
        return this.userNameAttributeField;
    }

    /**
     * <p>
     * The user name attribute field.
     * </p>
     * 
     * @param userNameAttributeField
     *        The user name attribute field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JwtTokenTypeConfiguration withUserNameAttributeField(String userNameAttributeField) {
        setUserNameAttributeField(userNameAttributeField);
        return this;
    }

    /**
     * <p>
     * The group attribute field.
     * </p>
     * 
     * @param groupAttributeField
     *        The group attribute field.
     */

    public void setGroupAttributeField(String groupAttributeField) {
        this.groupAttributeField = groupAttributeField;
    }

    /**
     * <p>
     * The group attribute field.
     * </p>
     * 
     * @return The group attribute field.
     */

    public String getGroupAttributeField() {
        return this.groupAttributeField;
    }

    /**
     * <p>
     * The group attribute field.
     * </p>
     * 
     * @param groupAttributeField
     *        The group attribute field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JwtTokenTypeConfiguration withGroupAttributeField(String groupAttributeField) {
        setGroupAttributeField(groupAttributeField);
        return this;
    }

    /**
     * <p>
     * The issuer of the token.
     * </p>
     * 
     * @param issuer
     *        The issuer of the token.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The issuer of the token.
     * </p>
     * 
     * @return The issuer of the token.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The issuer of the token.
     * </p>
     * 
     * @param issuer
     *        The issuer of the token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JwtTokenTypeConfiguration withIssuer(String issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * The regular expression that identifies the claim.
     * </p>
     * 
     * @param claimRegex
     *        The regular expression that identifies the claim.
     */

    public void setClaimRegex(String claimRegex) {
        this.claimRegex = claimRegex;
    }

    /**
     * <p>
     * The regular expression that identifies the claim.
     * </p>
     * 
     * @return The regular expression that identifies the claim.
     */

    public String getClaimRegex() {
        return this.claimRegex;
    }

    /**
     * <p>
     * The regular expression that identifies the claim.
     * </p>
     * 
     * @param claimRegex
     *        The regular expression that identifies the claim.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JwtTokenTypeConfiguration withClaimRegex(String claimRegex) {
        setClaimRegex(claimRegex);
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
        if (getKeyLocation() != null)
            sb.append("KeyLocation: ").append(getKeyLocation()).append(",");
        if (getURL() != null)
            sb.append("URL: ").append(getURL()).append(",");
        if (getSecretManagerArn() != null)
            sb.append("SecretManagerArn: ").append(getSecretManagerArn()).append(",");
        if (getUserNameAttributeField() != null)
            sb.append("UserNameAttributeField: ").append(getUserNameAttributeField()).append(",");
        if (getGroupAttributeField() != null)
            sb.append("GroupAttributeField: ").append(getGroupAttributeField()).append(",");
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer()).append(",");
        if (getClaimRegex() != null)
            sb.append("ClaimRegex: ").append(getClaimRegex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JwtTokenTypeConfiguration == false)
            return false;
        JwtTokenTypeConfiguration other = (JwtTokenTypeConfiguration) obj;
        if (other.getKeyLocation() == null ^ this.getKeyLocation() == null)
            return false;
        if (other.getKeyLocation() != null && other.getKeyLocation().equals(this.getKeyLocation()) == false)
            return false;
        if (other.getURL() == null ^ this.getURL() == null)
            return false;
        if (other.getURL() != null && other.getURL().equals(this.getURL()) == false)
            return false;
        if (other.getSecretManagerArn() == null ^ this.getSecretManagerArn() == null)
            return false;
        if (other.getSecretManagerArn() != null && other.getSecretManagerArn().equals(this.getSecretManagerArn()) == false)
            return false;
        if (other.getUserNameAttributeField() == null ^ this.getUserNameAttributeField() == null)
            return false;
        if (other.getUserNameAttributeField() != null && other.getUserNameAttributeField().equals(this.getUserNameAttributeField()) == false)
            return false;
        if (other.getGroupAttributeField() == null ^ this.getGroupAttributeField() == null)
            return false;
        if (other.getGroupAttributeField() != null && other.getGroupAttributeField().equals(this.getGroupAttributeField()) == false)
            return false;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getClaimRegex() == null ^ this.getClaimRegex() == null)
            return false;
        if (other.getClaimRegex() != null && other.getClaimRegex().equals(this.getClaimRegex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyLocation() == null) ? 0 : getKeyLocation().hashCode());
        hashCode = prime * hashCode + ((getURL() == null) ? 0 : getURL().hashCode());
        hashCode = prime * hashCode + ((getSecretManagerArn() == null) ? 0 : getSecretManagerArn().hashCode());
        hashCode = prime * hashCode + ((getUserNameAttributeField() == null) ? 0 : getUserNameAttributeField().hashCode());
        hashCode = prime * hashCode + ((getGroupAttributeField() == null) ? 0 : getGroupAttributeField().hashCode());
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getClaimRegex() == null) ? 0 : getClaimRegex().hashCode());
        return hashCode;
    }

    @Override
    public JwtTokenTypeConfiguration clone() {
        try {
            return (JwtTokenTypeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.JwtTokenTypeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
