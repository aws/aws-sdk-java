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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ExecuteProvisionedProductServiceAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteProvisionedProductServiceActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     */
    private String provisionedProductId;
    /**
     * <p>
     * The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     * </p>
     */
    private String serviceActionId;
    /**
     * <p>
     * An idempotency token that uniquely identifies the execute request.
     * </p>
     */
    private String executeToken;
    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     */
    private String acceptLanguage;

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the provisioned product.
     */

    public void setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * 
     * @return The identifier of the provisioned product.
     */

    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the provisioned product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteProvisionedProductServiceActionRequest withProvisionedProductId(String provisionedProductId) {
        setProvisionedProductId(provisionedProductId);
        return this;
    }

    /**
     * <p>
     * The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     * </p>
     * 
     * @param serviceActionId
     *        The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     */

    public void setServiceActionId(String serviceActionId) {
        this.serviceActionId = serviceActionId;
    }

    /**
     * <p>
     * The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     * </p>
     * 
     * @return The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     */

    public String getServiceActionId() {
        return this.serviceActionId;
    }

    /**
     * <p>
     * The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     * </p>
     * 
     * @param serviceActionId
     *        The self-service action identifier. For example, <code>act-fs7abcd89wxyz</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteProvisionedProductServiceActionRequest withServiceActionId(String serviceActionId) {
        setServiceActionId(serviceActionId);
        return this;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the execute request.
     * </p>
     * 
     * @param executeToken
     *        An idempotency token that uniquely identifies the execute request.
     */

    public void setExecuteToken(String executeToken) {
        this.executeToken = executeToken;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the execute request.
     * </p>
     * 
     * @return An idempotency token that uniquely identifies the execute request.
     */

    public String getExecuteToken() {
        return this.executeToken;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the execute request.
     * </p>
     * 
     * @param executeToken
     *        An idempotency token that uniquely identifies the execute request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteProvisionedProductServiceActionRequest withExecuteToken(String executeToken) {
        setExecuteToken(executeToken);
        return this;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code> - English (default)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>jp</code> - Japanese
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh</code> - Chinese
     *         </p>
     *         </li>
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code> - English (default)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>jp</code> - Japanese
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh</code> - Chinese
     * </p>
     * </li>
     * </ul>
     * 
     * @param acceptLanguage
     *        The language code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code> - English (default)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>jp</code> - Japanese
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh</code> - Chinese
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteProvisionedProductServiceActionRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
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
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: ").append(getProvisionedProductId()).append(",");
        if (getServiceActionId() != null)
            sb.append("ServiceActionId: ").append(getServiceActionId()).append(",");
        if (getExecuteToken() != null)
            sb.append("ExecuteToken: ").append(getExecuteToken()).append(",");
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteProvisionedProductServiceActionRequest == false)
            return false;
        ExecuteProvisionedProductServiceActionRequest other = (ExecuteProvisionedProductServiceActionRequest) obj;
        if (other.getProvisionedProductId() == null ^ this.getProvisionedProductId() == null)
            return false;
        if (other.getProvisionedProductId() != null && other.getProvisionedProductId().equals(this.getProvisionedProductId()) == false)
            return false;
        if (other.getServiceActionId() == null ^ this.getServiceActionId() == null)
            return false;
        if (other.getServiceActionId() != null && other.getServiceActionId().equals(this.getServiceActionId()) == false)
            return false;
        if (other.getExecuteToken() == null ^ this.getExecuteToken() == null)
            return false;
        if (other.getExecuteToken() != null && other.getExecuteToken().equals(this.getExecuteToken()) == false)
            return false;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisionedProductId() == null) ? 0 : getProvisionedProductId().hashCode());
        hashCode = prime * hashCode + ((getServiceActionId() == null) ? 0 : getServiceActionId().hashCode());
        hashCode = prime * hashCode + ((getExecuteToken() == null) ? 0 : getExecuteToken().hashCode());
        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteProvisionedProductServiceActionRequest clone() {
        return (ExecuteProvisionedProductServiceActionRequest) super.clone();
    }

}
