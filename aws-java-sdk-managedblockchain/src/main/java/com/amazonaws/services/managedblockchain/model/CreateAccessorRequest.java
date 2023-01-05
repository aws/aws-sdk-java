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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateAccessor" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     * idempotent operation completes no more than once. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an Amazon Web Services SDK or the Amazon
     * Web Services CLI.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The type of accessor.
     * </p>
     * <note>
     * <p>
     * Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     * </p>
     * </note>
     */
    private String accessorType;

    /**
     * <p>
     * This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     * idempotent operation completes no more than once. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an Amazon Web Services SDK or the Amazon
     * Web Services CLI.
     * </p>
     * 
     * @param clientRequestToken
     *        This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation.
     *        An idempotent operation completes no more than once. This identifier is required only if you make a
     *        service request directly using an HTTP client. It is generated automatically if you use an Amazon Web
     *        Services SDK or the Amazon Web Services CLI.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     * idempotent operation completes no more than once. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an Amazon Web Services SDK or the Amazon
     * Web Services CLI.
     * </p>
     * 
     * @return This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation.
     *         An idempotent operation completes no more than once. This identifier is required only if you make a
     *         service request directly using an HTTP client. It is generated automatically if you use an Amazon Web
     *         Services SDK or the Amazon Web Services CLI.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     * idempotent operation completes no more than once. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an Amazon Web Services SDK or the Amazon
     * Web Services CLI.
     * </p>
     * 
     * @param clientRequestToken
     *        This is a unique, case-sensitive identifier that you provide to ensure the idempotency of the operation.
     *        An idempotent operation completes no more than once. This identifier is required only if you make a
     *        service request directly using an HTTP client. It is generated automatically if you use an Amazon Web
     *        Services SDK or the Amazon Web Services CLI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessorRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The type of accessor.
     * </p>
     * <note>
     * <p>
     * Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     * </p>
     * </note>
     * 
     * @param accessorType
     *        The type of accessor.</p> <note>
     *        <p>
     *        Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     *        </p>
     * @see AccessorType
     */

    public void setAccessorType(String accessorType) {
        this.accessorType = accessorType;
    }

    /**
     * <p>
     * The type of accessor.
     * </p>
     * <note>
     * <p>
     * Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     * </p>
     * </note>
     * 
     * @return The type of accessor.</p> <note>
     *         <p>
     *         Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     *         </p>
     * @see AccessorType
     */

    public String getAccessorType() {
        return this.accessorType;
    }

    /**
     * <p>
     * The type of accessor.
     * </p>
     * <note>
     * <p>
     * Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     * </p>
     * </note>
     * 
     * @param accessorType
     *        The type of accessor.</p> <note>
     *        <p>
     *        Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessorType
     */

    public CreateAccessorRequest withAccessorType(String accessorType) {
        setAccessorType(accessorType);
        return this;
    }

    /**
     * <p>
     * The type of accessor.
     * </p>
     * <note>
     * <p>
     * Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     * </p>
     * </note>
     * 
     * @param accessorType
     *        The type of accessor.</p> <note>
     *        <p>
     *        Currently accessor type is restricted to <code>BILLING_TOKEN</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessorType
     */

    public CreateAccessorRequest withAccessorType(AccessorType accessorType) {
        this.accessorType = accessorType.toString();
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getAccessorType() != null)
            sb.append("AccessorType: ").append(getAccessorType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessorRequest == false)
            return false;
        CreateAccessorRequest other = (CreateAccessorRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getAccessorType() == null ^ this.getAccessorType() == null)
            return false;
        if (other.getAccessorType() != null && other.getAccessorType().equals(this.getAccessorType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getAccessorType() == null) ? 0 : getAccessorType().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccessorRequest clone() {
        return (CreateAccessorRequest) super.clone();
    }

}
