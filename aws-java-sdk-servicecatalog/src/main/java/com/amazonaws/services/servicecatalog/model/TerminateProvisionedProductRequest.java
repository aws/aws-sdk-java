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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/TerminateProvisionedProduct"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateProvisionedProductRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     */
    private String provisionedProductName;
    /**
     * <p>
     * The identifier of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     */
    private String provisionedProductId;
    /**
     * <p>
     * An idempotency token that uniquely identifies the termination request. This token is only valid during the
     * termination process. After the provisioned product is terminated, subsequent requests to terminate the same
     * provisioned product always return <b>ResourceNotFound</b>.
     * </p>
     */
    private String terminateToken;
    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the
     * underlying resources.
     * </p>
     */
    private Boolean ignoreErrors;
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
     * The name of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     * 
     * @param provisionedProductName
     *        The name of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     *        <code>ProvisionedProductId</code>.
     */

    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * The name of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     * 
     * @return The name of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     *         <code>ProvisionedProductId</code>.
     */

    public String getProvisionedProductName() {
        return this.provisionedProductName;
    }

    /**
     * <p>
     * The name of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     * 
     * @param provisionedProductName
     *        The name of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     *        <code>ProvisionedProductId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateProvisionedProductRequest withProvisionedProductName(String provisionedProductName) {
        setProvisionedProductName(provisionedProductName);
        return this;
    }

    /**
     * <p>
     * The identifier of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     *        <code>ProvisionedProductId</code>.
     */

    public void setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     * 
     * @return The identifier of the provisioned product. You cannot specify both <code>ProvisionedProductName</code>
     *         and <code>ProvisionedProductId</code>.
     */

    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     * <code>ProvisionedProductId</code>.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the provisioned product. You cannot specify both <code>ProvisionedProductName</code> and
     *        <code>ProvisionedProductId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateProvisionedProductRequest withProvisionedProductId(String provisionedProductId) {
        setProvisionedProductId(provisionedProductId);
        return this;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the termination request. This token is only valid during the
     * termination process. After the provisioned product is terminated, subsequent requests to terminate the same
     * provisioned product always return <b>ResourceNotFound</b>.
     * </p>
     * 
     * @param terminateToken
     *        An idempotency token that uniquely identifies the termination request. This token is only valid during the
     *        termination process. After the provisioned product is terminated, subsequent requests to terminate the
     *        same provisioned product always return <b>ResourceNotFound</b>.
     */

    public void setTerminateToken(String terminateToken) {
        this.terminateToken = terminateToken;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the termination request. This token is only valid during the
     * termination process. After the provisioned product is terminated, subsequent requests to terminate the same
     * provisioned product always return <b>ResourceNotFound</b>.
     * </p>
     * 
     * @return An idempotency token that uniquely identifies the termination request. This token is only valid during
     *         the termination process. After the provisioned product is terminated, subsequent requests to terminate
     *         the same provisioned product always return <b>ResourceNotFound</b>.
     */

    public String getTerminateToken() {
        return this.terminateToken;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the termination request. This token is only valid during the
     * termination process. After the provisioned product is terminated, subsequent requests to terminate the same
     * provisioned product always return <b>ResourceNotFound</b>.
     * </p>
     * 
     * @param terminateToken
     *        An idempotency token that uniquely identifies the termination request. This token is only valid during the
     *        termination process. After the provisioned product is terminated, subsequent requests to terminate the
     *        same provisioned product always return <b>ResourceNotFound</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateProvisionedProductRequest withTerminateToken(String terminateToken) {
        setTerminateToken(terminateToken);
        return this;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the
     * underlying resources.
     * </p>
     * 
     * @param ignoreErrors
     *        If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot
     *        delete the underlying resources.
     */

    public void setIgnoreErrors(Boolean ignoreErrors) {
        this.ignoreErrors = ignoreErrors;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the
     * underlying resources.
     * </p>
     * 
     * @return If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot
     *         delete the underlying resources.
     */

    public Boolean getIgnoreErrors() {
        return this.ignoreErrors;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the
     * underlying resources.
     * </p>
     * 
     * @param ignoreErrors
     *        If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot
     *        delete the underlying resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateProvisionedProductRequest withIgnoreErrors(Boolean ignoreErrors) {
        setIgnoreErrors(ignoreErrors);
        return this;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the
     * underlying resources.
     * </p>
     * 
     * @return If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot
     *         delete the underlying resources.
     */

    public Boolean isIgnoreErrors() {
        return this.ignoreErrors;
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

    public TerminateProvisionedProductRequest withAcceptLanguage(String acceptLanguage) {
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
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: ").append(getProvisionedProductName()).append(",");
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: ").append(getProvisionedProductId()).append(",");
        if (getTerminateToken() != null)
            sb.append("TerminateToken: ").append(getTerminateToken()).append(",");
        if (getIgnoreErrors() != null)
            sb.append("IgnoreErrors: ").append(getIgnoreErrors()).append(",");
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

        if (obj instanceof TerminateProvisionedProductRequest == false)
            return false;
        TerminateProvisionedProductRequest other = (TerminateProvisionedProductRequest) obj;
        if (other.getProvisionedProductName() == null ^ this.getProvisionedProductName() == null)
            return false;
        if (other.getProvisionedProductName() != null && other.getProvisionedProductName().equals(this.getProvisionedProductName()) == false)
            return false;
        if (other.getProvisionedProductId() == null ^ this.getProvisionedProductId() == null)
            return false;
        if (other.getProvisionedProductId() != null && other.getProvisionedProductId().equals(this.getProvisionedProductId()) == false)
            return false;
        if (other.getTerminateToken() == null ^ this.getTerminateToken() == null)
            return false;
        if (other.getTerminateToken() != null && other.getTerminateToken().equals(this.getTerminateToken()) == false)
            return false;
        if (other.getIgnoreErrors() == null ^ this.getIgnoreErrors() == null)
            return false;
        if (other.getIgnoreErrors() != null && other.getIgnoreErrors().equals(this.getIgnoreErrors()) == false)
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

        hashCode = prime * hashCode + ((getProvisionedProductName() == null) ? 0 : getProvisionedProductName().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductId() == null) ? 0 : getProvisionedProductId().hashCode());
        hashCode = prime * hashCode + ((getTerminateToken() == null) ? 0 : getTerminateToken().hashCode());
        hashCode = prime * hashCode + ((getIgnoreErrors() == null) ? 0 : getIgnoreErrors().hashCode());
        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        return hashCode;
    }

    @Override
    public TerminateProvisionedProductRequest clone() {
        return (TerminateProvisionedProductRequest) super.clone();
    }

}
