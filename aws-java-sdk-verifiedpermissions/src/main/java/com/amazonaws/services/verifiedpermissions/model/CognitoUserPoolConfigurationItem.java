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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for an identity source that represents a connection to an Amazon Cognito user pool used as an
 * identity provider for Verified Permissions.
 * </p>
 * <p>
 * This data type is used as a field that is part of the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ConfigurationItem.html"
 * >ConfigurationItem</a> structure that is part of the response to <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ListIdentitySources.html"
 * >ListIdentitySources</a>.
 * </p>
 * <p>
 * Example:
 * <code>"CognitoUserPoolConfiguration":{"UserPoolArn":"arn:aws:cognito-idp:us-east-1:123456789012:userpool/us-east-1_1a2b3c4d5","ClientIds": ["a1b2c3d4e5f6g7h8i9j0kalbmc"],"groupConfiguration": {"groupEntityType": "MyCorp::Group"}}</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CognitoUserPoolConfigurationItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CognitoUserPoolConfigurationItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the Amazon Cognito user pool that contains the identities to be authorized.
     * </p>
     * <p>
     * Example: <code>"userPoolArn": "arn:aws:cognito-idp:us-east-1:123456789012:userpool/us-east-1_1a2b3c4d5"</code>
     * </p>
     */
    private String userPoolArn;
    /**
     * <p>
     * The unique application client IDs that are associated with the specified Amazon Cognito user pool.
     * </p>
     * <p>
     * Example: <code>"clientIds": ["&amp;ExampleCogClientId;"]</code>
     * </p>
     */
    private java.util.List<String> clientIds;
    /**
     * <p>
     * The OpenID Connect (OIDC) <code>issuer</code> ID of the Amazon Cognito user pool that contains the identities to
     * be authorized.
     * </p>
     * <p>
     * Example: <code>"issuer": "https://cognito-idp.us-east-1.amazonaws.com/us-east-1_1a2b3c4d5"</code>
     * </p>
     */
    private String issuer;
    /**
     * <p>
     * The type of entity that a policy store maps to groups from an Amazon Cognito user pool identity source.
     * </p>
     */
    private CognitoGroupConfigurationItem groupConfiguration;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the Amazon Cognito user pool that contains the identities to be authorized.
     * </p>
     * <p>
     * Example: <code>"userPoolArn": "arn:aws:cognito-idp:us-east-1:123456789012:userpool/us-east-1_1a2b3c4d5"</code>
     * </p>
     * 
     * @param userPoolArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of the Amazon Cognito user pool that contains the identities to be authorized.</p>
     *        <p>
     *        Example:
     *        <code>"userPoolArn": "arn:aws:cognito-idp:us-east-1:123456789012:userpool/us-east-1_1a2b3c4d5"</code>
     */

    public void setUserPoolArn(String userPoolArn) {
        this.userPoolArn = userPoolArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the Amazon Cognito user pool that contains the identities to be authorized.
     * </p>
     * <p>
     * Example: <code>"userPoolArn": "arn:aws:cognito-idp:us-east-1:123456789012:userpool/us-east-1_1a2b3c4d5"</code>
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *         Name (ARN)</a> of the Amazon Cognito user pool that contains the identities to be authorized.</p>
     *         <p>
     *         Example:
     *         <code>"userPoolArn": "arn:aws:cognito-idp:us-east-1:123456789012:userpool/us-east-1_1a2b3c4d5"</code>
     */

    public String getUserPoolArn() {
        return this.userPoolArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     * (ARN)</a> of the Amazon Cognito user pool that contains the identities to be authorized.
     * </p>
     * <p>
     * Example: <code>"userPoolArn": "arn:aws:cognito-idp:us-east-1:123456789012:userpool/us-east-1_1a2b3c4d5"</code>
     * </p>
     * 
     * @param userPoolArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     *        Name (ARN)</a> of the Amazon Cognito user pool that contains the identities to be authorized.</p>
     *        <p>
     *        Example:
     *        <code>"userPoolArn": "arn:aws:cognito-idp:us-east-1:123456789012:userpool/us-east-1_1a2b3c4d5"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoUserPoolConfigurationItem withUserPoolArn(String userPoolArn) {
        setUserPoolArn(userPoolArn);
        return this;
    }

    /**
     * <p>
     * The unique application client IDs that are associated with the specified Amazon Cognito user pool.
     * </p>
     * <p>
     * Example: <code>"clientIds": ["&amp;ExampleCogClientId;"]</code>
     * </p>
     * 
     * @return The unique application client IDs that are associated with the specified Amazon Cognito user pool.</p>
     *         <p>
     *         Example: <code>"clientIds": ["&amp;ExampleCogClientId;"]</code>
     */

    public java.util.List<String> getClientIds() {
        return clientIds;
    }

    /**
     * <p>
     * The unique application client IDs that are associated with the specified Amazon Cognito user pool.
     * </p>
     * <p>
     * Example: <code>"clientIds": ["&amp;ExampleCogClientId;"]</code>
     * </p>
     * 
     * @param clientIds
     *        The unique application client IDs that are associated with the specified Amazon Cognito user pool.</p>
     *        <p>
     *        Example: <code>"clientIds": ["&amp;ExampleCogClientId;"]</code>
     */

    public void setClientIds(java.util.Collection<String> clientIds) {
        if (clientIds == null) {
            this.clientIds = null;
            return;
        }

        this.clientIds = new java.util.ArrayList<String>(clientIds);
    }

    /**
     * <p>
     * The unique application client IDs that are associated with the specified Amazon Cognito user pool.
     * </p>
     * <p>
     * Example: <code>"clientIds": ["&amp;ExampleCogClientId;"]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClientIds(java.util.Collection)} or {@link #withClientIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param clientIds
     *        The unique application client IDs that are associated with the specified Amazon Cognito user pool.</p>
     *        <p>
     *        Example: <code>"clientIds": ["&amp;ExampleCogClientId;"]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoUserPoolConfigurationItem withClientIds(String... clientIds) {
        if (this.clientIds == null) {
            setClientIds(new java.util.ArrayList<String>(clientIds.length));
        }
        for (String ele : clientIds) {
            this.clientIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique application client IDs that are associated with the specified Amazon Cognito user pool.
     * </p>
     * <p>
     * Example: <code>"clientIds": ["&amp;ExampleCogClientId;"]</code>
     * </p>
     * 
     * @param clientIds
     *        The unique application client IDs that are associated with the specified Amazon Cognito user pool.</p>
     *        <p>
     *        Example: <code>"clientIds": ["&amp;ExampleCogClientId;"]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoUserPoolConfigurationItem withClientIds(java.util.Collection<String> clientIds) {
        setClientIds(clientIds);
        return this;
    }

    /**
     * <p>
     * The OpenID Connect (OIDC) <code>issuer</code> ID of the Amazon Cognito user pool that contains the identities to
     * be authorized.
     * </p>
     * <p>
     * Example: <code>"issuer": "https://cognito-idp.us-east-1.amazonaws.com/us-east-1_1a2b3c4d5"</code>
     * </p>
     * 
     * @param issuer
     *        The OpenID Connect (OIDC) <code>issuer</code> ID of the Amazon Cognito user pool that contains the
     *        identities to be authorized.</p>
     *        <p>
     *        Example: <code>"issuer": "https://cognito-idp.us-east-1.amazonaws.com/us-east-1_1a2b3c4d5"</code>
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The OpenID Connect (OIDC) <code>issuer</code> ID of the Amazon Cognito user pool that contains the identities to
     * be authorized.
     * </p>
     * <p>
     * Example: <code>"issuer": "https://cognito-idp.us-east-1.amazonaws.com/us-east-1_1a2b3c4d5"</code>
     * </p>
     * 
     * @return The OpenID Connect (OIDC) <code>issuer</code> ID of the Amazon Cognito user pool that contains the
     *         identities to be authorized.</p>
     *         <p>
     *         Example: <code>"issuer": "https://cognito-idp.us-east-1.amazonaws.com/us-east-1_1a2b3c4d5"</code>
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The OpenID Connect (OIDC) <code>issuer</code> ID of the Amazon Cognito user pool that contains the identities to
     * be authorized.
     * </p>
     * <p>
     * Example: <code>"issuer": "https://cognito-idp.us-east-1.amazonaws.com/us-east-1_1a2b3c4d5"</code>
     * </p>
     * 
     * @param issuer
     *        The OpenID Connect (OIDC) <code>issuer</code> ID of the Amazon Cognito user pool that contains the
     *        identities to be authorized.</p>
     *        <p>
     *        Example: <code>"issuer": "https://cognito-idp.us-east-1.amazonaws.com/us-east-1_1a2b3c4d5"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoUserPoolConfigurationItem withIssuer(String issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * The type of entity that a policy store maps to groups from an Amazon Cognito user pool identity source.
     * </p>
     * 
     * @param groupConfiguration
     *        The type of entity that a policy store maps to groups from an Amazon Cognito user pool identity source.
     */

    public void setGroupConfiguration(CognitoGroupConfigurationItem groupConfiguration) {
        this.groupConfiguration = groupConfiguration;
    }

    /**
     * <p>
     * The type of entity that a policy store maps to groups from an Amazon Cognito user pool identity source.
     * </p>
     * 
     * @return The type of entity that a policy store maps to groups from an Amazon Cognito user pool identity source.
     */

    public CognitoGroupConfigurationItem getGroupConfiguration() {
        return this.groupConfiguration;
    }

    /**
     * <p>
     * The type of entity that a policy store maps to groups from an Amazon Cognito user pool identity source.
     * </p>
     * 
     * @param groupConfiguration
     *        The type of entity that a policy store maps to groups from an Amazon Cognito user pool identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoUserPoolConfigurationItem withGroupConfiguration(CognitoGroupConfigurationItem groupConfiguration) {
        setGroupConfiguration(groupConfiguration);
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
        if (getUserPoolArn() != null)
            sb.append("UserPoolArn: ").append(getUserPoolArn()).append(",");
        if (getClientIds() != null)
            sb.append("ClientIds: ").append("***Sensitive Data Redacted***").append(",");
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer()).append(",");
        if (getGroupConfiguration() != null)
            sb.append("GroupConfiguration: ").append(getGroupConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CognitoUserPoolConfigurationItem == false)
            return false;
        CognitoUserPoolConfigurationItem other = (CognitoUserPoolConfigurationItem) obj;
        if (other.getUserPoolArn() == null ^ this.getUserPoolArn() == null)
            return false;
        if (other.getUserPoolArn() != null && other.getUserPoolArn().equals(this.getUserPoolArn()) == false)
            return false;
        if (other.getClientIds() == null ^ this.getClientIds() == null)
            return false;
        if (other.getClientIds() != null && other.getClientIds().equals(this.getClientIds()) == false)
            return false;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getGroupConfiguration() == null ^ this.getGroupConfiguration() == null)
            return false;
        if (other.getGroupConfiguration() != null && other.getGroupConfiguration().equals(this.getGroupConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolArn() == null) ? 0 : getUserPoolArn().hashCode());
        hashCode = prime * hashCode + ((getClientIds() == null) ? 0 : getClientIds().hashCode());
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getGroupConfiguration() == null) ? 0 : getGroupConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CognitoUserPoolConfigurationItem clone() {
        try {
            return (CognitoUserPoolConfigurationItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.CognitoUserPoolConfigurationItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
