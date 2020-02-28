/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProvisionedProductProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProvisionedProductPropertiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     */
    private String provisionedProductId;
    /**
     * <p>
     * A map that contains the provisioned product properties to be updated.
     * </p>
     * <p>
     * The <code>OWNER</code> key only accepts user ARNs. The owner is the user that is allowed to see, update,
     * terminate, and execute service actions in the provisioned product.
     * </p>
     * <p>
     * The administrator can change the owner of a provisioned product to another IAM user within the same account. Both
     * end user owners and administrators can see ownership history of the provisioned product using the
     * <code>ListRecordHistory</code> API. The new owner can describe all past records for the provisioned product using
     * the <code>DescribeRecord</code> API. The previous owner can no longer use <code>DescribeRecord</code>, but can
     * still see the product's history from when he was an owner using <code>ListRecordHistory</code>.
     * </p>
     * <p>
     * If a provisioned product ownership is assigned to an end user, they can see and perform any action through the
     * API or Service Catalog console such as update, terminate, and execute service actions. If an end user provisions
     * a product and the owner is updated to someone else, they will no longer be able to see or perform any actions
     * through API or the Service Catalog console on that provisioned product.
     * </p>
     */
    private java.util.Map<String, String> provisionedProductProperties;
    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning product update request.
     * </p>
     */
    private String idempotencyToken;

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

    public UpdateProvisionedProductPropertiesRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

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

    public UpdateProvisionedProductPropertiesRequest withProvisionedProductId(String provisionedProductId) {
        setProvisionedProductId(provisionedProductId);
        return this;
    }

    /**
     * <p>
     * A map that contains the provisioned product properties to be updated.
     * </p>
     * <p>
     * The <code>OWNER</code> key only accepts user ARNs. The owner is the user that is allowed to see, update,
     * terminate, and execute service actions in the provisioned product.
     * </p>
     * <p>
     * The administrator can change the owner of a provisioned product to another IAM user within the same account. Both
     * end user owners and administrators can see ownership history of the provisioned product using the
     * <code>ListRecordHistory</code> API. The new owner can describe all past records for the provisioned product using
     * the <code>DescribeRecord</code> API. The previous owner can no longer use <code>DescribeRecord</code>, but can
     * still see the product's history from when he was an owner using <code>ListRecordHistory</code>.
     * </p>
     * <p>
     * If a provisioned product ownership is assigned to an end user, they can see and perform any action through the
     * API or Service Catalog console such as update, terminate, and execute service actions. If an end user provisions
     * a product and the owner is updated to someone else, they will no longer be able to see or perform any actions
     * through API or the Service Catalog console on that provisioned product.
     * </p>
     * 
     * @return A map that contains the provisioned product properties to be updated.</p>
     *         <p>
     *         The <code>OWNER</code> key only accepts user ARNs. The owner is the user that is allowed to see, update,
     *         terminate, and execute service actions in the provisioned product.
     *         </p>
     *         <p>
     *         The administrator can change the owner of a provisioned product to another IAM user within the same
     *         account. Both end user owners and administrators can see ownership history of the provisioned product
     *         using the <code>ListRecordHistory</code> API. The new owner can describe all past records for the
     *         provisioned product using the <code>DescribeRecord</code> API. The previous owner can no longer use
     *         <code>DescribeRecord</code>, but can still see the product's history from when he was an owner using
     *         <code>ListRecordHistory</code>.
     *         </p>
     *         <p>
     *         If a provisioned product ownership is assigned to an end user, they can see and perform any action
     *         through the API or Service Catalog console such as update, terminate, and execute service actions. If an
     *         end user provisions a product and the owner is updated to someone else, they will no longer be able to
     *         see or perform any actions through API or the Service Catalog console on that provisioned product.
     */

    public java.util.Map<String, String> getProvisionedProductProperties() {
        return provisionedProductProperties;
    }

    /**
     * <p>
     * A map that contains the provisioned product properties to be updated.
     * </p>
     * <p>
     * The <code>OWNER</code> key only accepts user ARNs. The owner is the user that is allowed to see, update,
     * terminate, and execute service actions in the provisioned product.
     * </p>
     * <p>
     * The administrator can change the owner of a provisioned product to another IAM user within the same account. Both
     * end user owners and administrators can see ownership history of the provisioned product using the
     * <code>ListRecordHistory</code> API. The new owner can describe all past records for the provisioned product using
     * the <code>DescribeRecord</code> API. The previous owner can no longer use <code>DescribeRecord</code>, but can
     * still see the product's history from when he was an owner using <code>ListRecordHistory</code>.
     * </p>
     * <p>
     * If a provisioned product ownership is assigned to an end user, they can see and perform any action through the
     * API or Service Catalog console such as update, terminate, and execute service actions. If an end user provisions
     * a product and the owner is updated to someone else, they will no longer be able to see or perform any actions
     * through API or the Service Catalog console on that provisioned product.
     * </p>
     * 
     * @param provisionedProductProperties
     *        A map that contains the provisioned product properties to be updated.</p>
     *        <p>
     *        The <code>OWNER</code> key only accepts user ARNs. The owner is the user that is allowed to see, update,
     *        terminate, and execute service actions in the provisioned product.
     *        </p>
     *        <p>
     *        The administrator can change the owner of a provisioned product to another IAM user within the same
     *        account. Both end user owners and administrators can see ownership history of the provisioned product
     *        using the <code>ListRecordHistory</code> API. The new owner can describe all past records for the
     *        provisioned product using the <code>DescribeRecord</code> API. The previous owner can no longer use
     *        <code>DescribeRecord</code>, but can still see the product's history from when he was an owner using
     *        <code>ListRecordHistory</code>.
     *        </p>
     *        <p>
     *        If a provisioned product ownership is assigned to an end user, they can see and perform any action through
     *        the API or Service Catalog console such as update, terminate, and execute service actions. If an end user
     *        provisions a product and the owner is updated to someone else, they will no longer be able to see or
     *        perform any actions through API or the Service Catalog console on that provisioned product.
     */

    public void setProvisionedProductProperties(java.util.Map<String, String> provisionedProductProperties) {
        this.provisionedProductProperties = provisionedProductProperties;
    }

    /**
     * <p>
     * A map that contains the provisioned product properties to be updated.
     * </p>
     * <p>
     * The <code>OWNER</code> key only accepts user ARNs. The owner is the user that is allowed to see, update,
     * terminate, and execute service actions in the provisioned product.
     * </p>
     * <p>
     * The administrator can change the owner of a provisioned product to another IAM user within the same account. Both
     * end user owners and administrators can see ownership history of the provisioned product using the
     * <code>ListRecordHistory</code> API. The new owner can describe all past records for the provisioned product using
     * the <code>DescribeRecord</code> API. The previous owner can no longer use <code>DescribeRecord</code>, but can
     * still see the product's history from when he was an owner using <code>ListRecordHistory</code>.
     * </p>
     * <p>
     * If a provisioned product ownership is assigned to an end user, they can see and perform any action through the
     * API or Service Catalog console such as update, terminate, and execute service actions. If an end user provisions
     * a product and the owner is updated to someone else, they will no longer be able to see or perform any actions
     * through API or the Service Catalog console on that provisioned product.
     * </p>
     * 
     * @param provisionedProductProperties
     *        A map that contains the provisioned product properties to be updated.</p>
     *        <p>
     *        The <code>OWNER</code> key only accepts user ARNs. The owner is the user that is allowed to see, update,
     *        terminate, and execute service actions in the provisioned product.
     *        </p>
     *        <p>
     *        The administrator can change the owner of a provisioned product to another IAM user within the same
     *        account. Both end user owners and administrators can see ownership history of the provisioned product
     *        using the <code>ListRecordHistory</code> API. The new owner can describe all past records for the
     *        provisioned product using the <code>DescribeRecord</code> API. The previous owner can no longer use
     *        <code>DescribeRecord</code>, but can still see the product's history from when he was an owner using
     *        <code>ListRecordHistory</code>.
     *        </p>
     *        <p>
     *        If a provisioned product ownership is assigned to an end user, they can see and perform any action through
     *        the API or Service Catalog console such as update, terminate, and execute service actions. If an end user
     *        provisions a product and the owner is updated to someone else, they will no longer be able to see or
     *        perform any actions through API or the Service Catalog console on that provisioned product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductPropertiesRequest withProvisionedProductProperties(java.util.Map<String, String> provisionedProductProperties) {
        setProvisionedProductProperties(provisionedProductProperties);
        return this;
    }

    /**
     * Add a single ProvisionedProductProperties entry
     *
     * @see UpdateProvisionedProductPropertiesRequest#withProvisionedProductProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductPropertiesRequest addProvisionedProductPropertiesEntry(String key, String value) {
        if (null == this.provisionedProductProperties) {
            this.provisionedProductProperties = new java.util.HashMap<String, String>();
        }
        if (this.provisionedProductProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.provisionedProductProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProvisionedProductProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductPropertiesRequest clearProvisionedProductPropertiesEntries() {
        this.provisionedProductProperties = null;
        return this;
    }

    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning product update request.
     * </p>
     * 
     * @param idempotencyToken
     *        The idempotency token that uniquely identifies the provisioning product update request.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning product update request.
     * </p>
     * 
     * @return The idempotency token that uniquely identifies the provisioning product update request.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * The idempotency token that uniquely identifies the provisioning product update request.
     * </p>
     * 
     * @param idempotencyToken
     *        The idempotency token that uniquely identifies the provisioning product update request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisionedProductPropertiesRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage()).append(",");
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: ").append(getProvisionedProductId()).append(",");
        if (getProvisionedProductProperties() != null)
            sb.append("ProvisionedProductProperties: ").append(getProvisionedProductProperties()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisionedProductPropertiesRequest == false)
            return false;
        UpdateProvisionedProductPropertiesRequest other = (UpdateProvisionedProductPropertiesRequest) obj;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        if (other.getProvisionedProductId() == null ^ this.getProvisionedProductId() == null)
            return false;
        if (other.getProvisionedProductId() != null && other.getProvisionedProductId().equals(this.getProvisionedProductId()) == false)
            return false;
        if (other.getProvisionedProductProperties() == null ^ this.getProvisionedProductProperties() == null)
            return false;
        if (other.getProvisionedProductProperties() != null && other.getProvisionedProductProperties().equals(this.getProvisionedProductProperties()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductId() == null) ? 0 : getProvisionedProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductProperties() == null) ? 0 : getProvisionedProductProperties().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProvisionedProductPropertiesRequest clone() {
        return (UpdateProvisionedProductPropertiesRequest) super.clone();
    }

}
