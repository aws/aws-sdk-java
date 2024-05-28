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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreatePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * Specifies the <code>PolicyStoreId</code> of the policy store you want to store the policy in.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * A structure that specifies the policy type and content to use for the new policy. You must include either a
     * static or a templateLinked element. The policy content must be written in the Cedar policy language.
     * </p>
     */
    private PolicyDefinition definition;

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

    public CreatePolicyRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>PolicyStoreId</code> of the policy store you want to store the policy in.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the <code>PolicyStoreId</code> of the policy store you want to store the policy in.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * Specifies the <code>PolicyStoreId</code> of the policy store you want to store the policy in.
     * </p>
     * 
     * @return Specifies the <code>PolicyStoreId</code> of the policy store you want to store the policy in.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * Specifies the <code>PolicyStoreId</code> of the policy store you want to store the policy in.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the <code>PolicyStoreId</code> of the policy store you want to store the policy in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyRequest withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * A structure that specifies the policy type and content to use for the new policy. You must include either a
     * static or a templateLinked element. The policy content must be written in the Cedar policy language.
     * </p>
     * 
     * @param definition
     *        A structure that specifies the policy type and content to use for the new policy. You must include either
     *        a static or a templateLinked element. The policy content must be written in the Cedar policy language.
     */

    public void setDefinition(PolicyDefinition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * A structure that specifies the policy type and content to use for the new policy. You must include either a
     * static or a templateLinked element. The policy content must be written in the Cedar policy language.
     * </p>
     * 
     * @return A structure that specifies the policy type and content to use for the new policy. You must include either
     *         a static or a templateLinked element. The policy content must be written in the Cedar policy language.
     */

    public PolicyDefinition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * A structure that specifies the policy type and content to use for the new policy. You must include either a
     * static or a templateLinked element. The policy content must be written in the Cedar policy language.
     * </p>
     * 
     * @param definition
     *        A structure that specifies the policy type and content to use for the new policy. You must include either
     *        a static or a templateLinked element. The policy content must be written in the Cedar policy language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyRequest withDefinition(PolicyDefinition definition) {
        setDefinition(definition);
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
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePolicyRequest == false)
            return false;
        CreatePolicyRequest other = (CreatePolicyRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        return hashCode;
    }

    @Override
    public CreatePolicyRequest clone() {
        return (CreatePolicyRequest) super.clone();
    }

}
