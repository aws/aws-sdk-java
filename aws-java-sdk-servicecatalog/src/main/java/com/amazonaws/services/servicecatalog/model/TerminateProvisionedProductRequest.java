/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class TerminateProvisionedProductRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ProvisionedProduct object to terminate. You must specify either
     * <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * </p>
     */
    private String provisionedProductName;
    /**
     * <p>
     * The identifier of the ProvisionedProduct object to terminate. You must specify either
     * <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * </p>
     */
    private String provisionedProductId;
    /**
     * <p>
     * An idempotency token that uniquely identifies the termination request. This token is only valid during the
     * termination process. After the ProvisionedProduct object is terminated, further requests to terminate the same
     * ProvisionedProduct object always return <b>ResourceNotFound</b> regardless of the value of
     * <code>TerminateToken</code>.
     * </p>
     */
    private String terminateToken;
    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified ProvisionedProduct object even if it cannot
     * delete the underlying resources.
     * </p>
     */
    private Boolean ignoreErrors;
    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     */
    private String acceptLanguage;

    /**
     * <p>
     * The name of the ProvisionedProduct object to terminate. You must specify either
     * <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * </p>
     * 
     * @param provisionedProductName
     *        The name of the ProvisionedProduct object to terminate. You must specify either
     *        <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     */

    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * The name of the ProvisionedProduct object to terminate. You must specify either
     * <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * </p>
     * 
     * @return The name of the ProvisionedProduct object to terminate. You must specify either
     *         <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     */

    public String getProvisionedProductName() {
        return this.provisionedProductName;
    }

    /**
     * <p>
     * The name of the ProvisionedProduct object to terminate. You must specify either
     * <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * </p>
     * 
     * @param provisionedProductName
     *        The name of the ProvisionedProduct object to terminate. You must specify either
     *        <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateProvisionedProductRequest withProvisionedProductName(String provisionedProductName) {
        setProvisionedProductName(provisionedProductName);
        return this;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object to terminate. You must specify either
     * <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the ProvisionedProduct object to terminate. You must specify either
     *        <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     */

    public void setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object to terminate. You must specify either
     * <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * </p>
     * 
     * @return The identifier of the ProvisionedProduct object to terminate. You must specify either
     *         <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     */

    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object to terminate. You must specify either
     * <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the ProvisionedProduct object to terminate. You must specify either
     *        <code>ProvisionedProductName</code> or <code>ProvisionedProductId</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateProvisionedProductRequest withProvisionedProductId(String provisionedProductId) {
        setProvisionedProductId(provisionedProductId);
        return this;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the termination request. This token is only valid during the
     * termination process. After the ProvisionedProduct object is terminated, further requests to terminate the same
     * ProvisionedProduct object always return <b>ResourceNotFound</b> regardless of the value of
     * <code>TerminateToken</code>.
     * </p>
     * 
     * @param terminateToken
     *        An idempotency token that uniquely identifies the termination request. This token is only valid during the
     *        termination process. After the ProvisionedProduct object is terminated, further requests to terminate the
     *        same ProvisionedProduct object always return <b>ResourceNotFound</b> regardless of the value of
     *        <code>TerminateToken</code>.
     */

    public void setTerminateToken(String terminateToken) {
        this.terminateToken = terminateToken;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the termination request. This token is only valid during the
     * termination process. After the ProvisionedProduct object is terminated, further requests to terminate the same
     * ProvisionedProduct object always return <b>ResourceNotFound</b> regardless of the value of
     * <code>TerminateToken</code>.
     * </p>
     * 
     * @return An idempotency token that uniquely identifies the termination request. This token is only valid during
     *         the termination process. After the ProvisionedProduct object is terminated, further requests to terminate
     *         the same ProvisionedProduct object always return <b>ResourceNotFound</b> regardless of the value of
     *         <code>TerminateToken</code>.
     */

    public String getTerminateToken() {
        return this.terminateToken;
    }

    /**
     * <p>
     * An idempotency token that uniquely identifies the termination request. This token is only valid during the
     * termination process. After the ProvisionedProduct object is terminated, further requests to terminate the same
     * ProvisionedProduct object always return <b>ResourceNotFound</b> regardless of the value of
     * <code>TerminateToken</code>.
     * </p>
     * 
     * @param terminateToken
     *        An idempotency token that uniquely identifies the termination request. This token is only valid during the
     *        termination process. After the ProvisionedProduct object is terminated, further requests to terminate the
     *        same ProvisionedProduct object always return <b>ResourceNotFound</b> regardless of the value of
     *        <code>TerminateToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateProvisionedProductRequest withTerminateToken(String terminateToken) {
        setTerminateToken(terminateToken);
        return this;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified ProvisionedProduct object even if it cannot
     * delete the underlying resources.
     * </p>
     * 
     * @param ignoreErrors
     *        If set to true, AWS Service Catalog stops managing the specified ProvisionedProduct object even if it
     *        cannot delete the underlying resources.
     */

    public void setIgnoreErrors(Boolean ignoreErrors) {
        this.ignoreErrors = ignoreErrors;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified ProvisionedProduct object even if it cannot
     * delete the underlying resources.
     * </p>
     * 
     * @return If set to true, AWS Service Catalog stops managing the specified ProvisionedProduct object even if it
     *         cannot delete the underlying resources.
     */

    public Boolean getIgnoreErrors() {
        return this.ignoreErrors;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified ProvisionedProduct object even if it cannot
     * delete the underlying resources.
     * </p>
     * 
     * @param ignoreErrors
     *        If set to true, AWS Service Catalog stops managing the specified ProvisionedProduct object even if it
     *        cannot delete the underlying resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateProvisionedProductRequest withIgnoreErrors(Boolean ignoreErrors) {
        setIgnoreErrors(ignoreErrors);
        return this;
    }

    /**
     * <p>
     * If set to true, AWS Service Catalog stops managing the specified ProvisionedProduct object even if it cannot
     * delete the underlying resources.
     * </p>
     * 
     * @return If set to true, AWS Service Catalog stops managing the specified ProvisionedProduct object even if it
     *         cannot delete the underlying resources.
     */

    public Boolean isIgnoreErrors() {
        return this.ignoreErrors;
    }

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @param acceptLanguage
     *        The language code to use for this operation. Supported language codes are as follows:</p>
     *        <p>
     *        "en" (English)
     *        </p>
     *        <p>
     *        "jp" (Japanese)
     *        </p>
     *        <p>
     *        "zh" (Chinese)
     *        </p>
     *        <p>
     *        If no code is specified, "en" is used as the default.
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @return The language code to use for this operation. Supported language codes are as follows:</p>
     *         <p>
     *         "en" (English)
     *         </p>
     *         <p>
     *         "jp" (Japanese)
     *         </p>
     *         <p>
     *         "zh" (Chinese)
     *         </p>
     *         <p>
     *         If no code is specified, "en" is used as the default.
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The language code to use for this operation. Supported language codes are as follows:
     * </p>
     * <p>
     * "en" (English)
     * </p>
     * <p>
     * "jp" (Japanese)
     * </p>
     * <p>
     * "zh" (Chinese)
     * </p>
     * <p>
     * If no code is specified, "en" is used as the default.
     * </p>
     * 
     * @param acceptLanguage
     *        The language code to use for this operation. Supported language codes are as follows:</p>
     *        <p>
     *        "en" (English)
     *        </p>
     *        <p>
     *        "jp" (Japanese)
     *        </p>
     *        <p>
     *        "zh" (Chinese)
     *        </p>
     *        <p>
     *        If no code is specified, "en" is used as the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateProvisionedProductRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ProvisionedProductName: " + getProvisionedProductName() + ",");
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: " + getProvisionedProductId() + ",");
        if (getTerminateToken() != null)
            sb.append("TerminateToken: " + getTerminateToken() + ",");
        if (getIgnoreErrors() != null)
            sb.append("IgnoreErrors: " + getIgnoreErrors() + ",");
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: " + getAcceptLanguage());
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
