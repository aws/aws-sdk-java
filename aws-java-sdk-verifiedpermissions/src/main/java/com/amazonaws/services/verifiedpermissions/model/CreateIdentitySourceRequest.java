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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreateIdentitySource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIdentitySourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>ConflictException</code> error.
     * </p>
     * <p>
     * Verified Permissions recognizes a <code>ClientToken</code> for eight hours. After eight hours, the next request
     * with the same parameters performs the operation again regardless of the value of <code>ClientToken</code>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specifies the ID of the policy store in which you want to store this identity source. Only policies and requests
     * made using this policy store can reference identities from the identity provider configured in the new identity
     * source.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * Specifies the details required to communicate with the identity provider (IdP) associated with this identity
     * source.
     * </p>
     * <note>
     * <p>
     * At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
     * </p>
     * <p>
     * You must specify a <code>UserPoolArn</code>, and optionally, a <code>ClientId</code>.
     * </p>
     * </note>
     */
    private Configuration configuration;
    /**
     * <p>
     * Specifies the namespace and data type of the principals generated for identities authenticated by the new
     * identity source.
     * </p>
     */
    private String principalEntityType;

    /**
     * <p>
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>ConflictException</code> error.
     * </p>
     * <p>
     * Verified Permissions recognizes a <code>ClientToken</code> for eight hours. After eight hours, the next request
     * with the same parameters performs the operation again regardless of the value of <code>ClientToken</code>.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets
     *        you safely retry the request without accidentally performing the same operation a second time. Passing the
     *        same value to a later call to an operation requires that you also pass the same value for all other
     *        parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>ConflictException</code> error.
     *        </p>
     *        <p>
     *        Verified Permissions recognizes a <code>ClientToken</code> for eight hours. After eight hours, the next
     *        request with the same parameters performs the operation again regardless of the value of
     *        <code>ClientToken</code>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>ConflictException</code> error.
     * </p>
     * <p>
     * Verified Permissions recognizes a <code>ClientToken</code> for eight hours. After eight hours, the next request
     * with the same parameters performs the operation again regardless of the value of <code>ClientToken</code>.
     * </p>
     * 
     * @return Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This
     *         lets you safely retry the request without accidentally performing the same operation a second time.
     *         Passing the same value to a later call to an operation requires that you also pass the same value for all
     *         other parameters. We recommend that you use a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *         <p>
     *         If you don't provide this value, then Amazon Web Services generates a random one for you.
     *         </p>
     *         <p>
     *         If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *         retry fails with an <code>ConflictException</code> error.
     *         </p>
     *         <p>
     *         Verified Permissions recognizes a <code>ClientToken</code> for eight hours. After eight hours, the next
     *         request with the same parameters performs the operation again regardless of the value of
     *         <code>ClientToken</code>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets you
     * safely retry the request without accidentally performing the same operation a second time. Passing the same value
     * to a later call to an operation requires that you also pass the same value for all other parameters. We recommend
     * that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>ConflictException</code> error.
     * </p>
     * <p>
     * Verified Permissions recognizes a <code>ClientToken</code> for eight hours. After eight hours, the next request
     * with the same parameters performs the operation again regardless of the value of <code>ClientToken</code>.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive ID that you provide to ensure the idempotency of the request. This lets
     *        you safely retry the request without accidentally performing the same operation a second time. Passing the
     *        same value to a later call to an operation requires that you also pass the same value for all other
     *        parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>ConflictException</code> error.
     *        </p>
     *        <p>
     *        Verified Permissions recognizes a <code>ClientToken</code> for eight hours. After eight hours, the next
     *        request with the same parameters performs the operation again regardless of the value of
     *        <code>ClientToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentitySourceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies the ID of the policy store in which you want to store this identity source. Only policies and requests
     * made using this policy store can reference identities from the identity provider configured in the new identity
     * source.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store in which you want to store this identity source. Only policies and
     *        requests made using this policy store can reference identities from the identity provider configured in
     *        the new identity source.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store in which you want to store this identity source. Only policies and requests
     * made using this policy store can reference identities from the identity provider configured in the new identity
     * source.
     * </p>
     * 
     * @return Specifies the ID of the policy store in which you want to store this identity source. Only policies and
     *         requests made using this policy store can reference identities from the identity provider configured in
     *         the new identity source.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store in which you want to store this identity source. Only policies and requests
     * made using this policy store can reference identities from the identity provider configured in the new identity
     * source.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store in which you want to store this identity source. Only policies and
     *        requests made using this policy store can reference identities from the identity provider configured in
     *        the new identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentitySourceRequest withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * Specifies the details required to communicate with the identity provider (IdP) associated with this identity
     * source.
     * </p>
     * <note>
     * <p>
     * At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
     * </p>
     * <p>
     * You must specify a <code>UserPoolArn</code>, and optionally, a <code>ClientId</code>.
     * </p>
     * </note>
     * 
     * @param configuration
     *        Specifies the details required to communicate with the identity provider (IdP) associated with this
     *        identity source.</p> <note>
     *        <p>
     *        At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
     *        </p>
     *        <p>
     *        You must specify a <code>UserPoolArn</code>, and optionally, a <code>ClientId</code>.
     *        </p>
     */

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Specifies the details required to communicate with the identity provider (IdP) associated with this identity
     * source.
     * </p>
     * <note>
     * <p>
     * At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
     * </p>
     * <p>
     * You must specify a <code>UserPoolArn</code>, and optionally, a <code>ClientId</code>.
     * </p>
     * </note>
     * 
     * @return Specifies the details required to communicate with the identity provider (IdP) associated with this
     *         identity source.</p> <note>
     *         <p>
     *         At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
     *         </p>
     *         <p>
     *         You must specify a <code>UserPoolArn</code>, and optionally, a <code>ClientId</code>.
     *         </p>
     */

    public Configuration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Specifies the details required to communicate with the identity provider (IdP) associated with this identity
     * source.
     * </p>
     * <note>
     * <p>
     * At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
     * </p>
     * <p>
     * You must specify a <code>UserPoolArn</code>, and optionally, a <code>ClientId</code>.
     * </p>
     * </note>
     * 
     * @param configuration
     *        Specifies the details required to communicate with the identity provider (IdP) associated with this
     *        identity source.</p> <note>
     *        <p>
     *        At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
     *        </p>
     *        <p>
     *        You must specify a <code>UserPoolArn</code>, and optionally, a <code>ClientId</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentitySourceRequest withConfiguration(Configuration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * Specifies the namespace and data type of the principals generated for identities authenticated by the new
     * identity source.
     * </p>
     * 
     * @param principalEntityType
     *        Specifies the namespace and data type of the principals generated for identities authenticated by the new
     *        identity source.
     */

    public void setPrincipalEntityType(String principalEntityType) {
        this.principalEntityType = principalEntityType;
    }

    /**
     * <p>
     * Specifies the namespace and data type of the principals generated for identities authenticated by the new
     * identity source.
     * </p>
     * 
     * @return Specifies the namespace and data type of the principals generated for identities authenticated by the new
     *         identity source.
     */

    public String getPrincipalEntityType() {
        return this.principalEntityType;
    }

    /**
     * <p>
     * Specifies the namespace and data type of the principals generated for identities authenticated by the new
     * identity source.
     * </p>
     * 
     * @param principalEntityType
     *        Specifies the namespace and data type of the principals generated for identities authenticated by the new
     *        identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentitySourceRequest withPrincipalEntityType(String principalEntityType) {
        setPrincipalEntityType(principalEntityType);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getPolicyStoreId() != null)
            sb.append("PolicyStoreId: ").append(getPolicyStoreId()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getPrincipalEntityType() != null)
            sb.append("PrincipalEntityType: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIdentitySourceRequest == false)
            return false;
        CreateIdentitySourceRequest other = (CreateIdentitySourceRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getPrincipalEntityType() == null ^ this.getPrincipalEntityType() == null)
            return false;
        if (other.getPrincipalEntityType() != null && other.getPrincipalEntityType().equals(this.getPrincipalEntityType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPrincipalEntityType() == null) ? 0 : getPrincipalEntityType().hashCode());
        return hashCode;
    }

    @Override
    public CreateIdentitySourceRequest clone() {
        return (CreateIdentitySourceRequest) super.clone();
    }

}
