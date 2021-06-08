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
 * Specifies the document attribute to use to sort the response to a Amazon Kendra query. You can specify a single
 * attribute for sorting. The attribute must have the <code>Sortable</code> flag set to <code>true</code>, otherwise
 * Amazon Kendra returns an exception.
 * </p>
 * <p>
 * You can sort attributes of the following types.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Date value
 * </p>
 * </li>
 * <li>
 * <p>
 * Long value
 * </p>
 * </li>
 * <li>
 * <p>
 * String value
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can't sort attributes of the following type.
 * </p>
 * <ul>
 * <li>
 * <p>
 * String list value
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SortingConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SortingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the document attribute used to sort the response. You can use any field that has the
     * <code>Sortable</code> flag set to true.
     * </p>
     * <p>
     * You can also sort by any of the following built-in attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * _category
     * </p>
     * </li>
     * <li>
     * <p>
     * _created_at
     * </p>
     * </li>
     * <li>
     * <p>
     * _last_updated_at
     * </p>
     * </li>
     * <li>
     * <p>
     * _version
     * </p>
     * </li>
     * <li>
     * <p>
     * _view_count
     * </p>
     * </li>
     * </ul>
     */
    private String documentAttributeKey;
    /**
     * <p>
     * The order that the results should be returned in. In case of ties, the relevance assigned to the result by Amazon
     * Kendra is used as the tie-breaker.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The name of the document attribute used to sort the response. You can use any field that has the
     * <code>Sortable</code> flag set to true.
     * </p>
     * <p>
     * You can also sort by any of the following built-in attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * _category
     * </p>
     * </li>
     * <li>
     * <p>
     * _created_at
     * </p>
     * </li>
     * <li>
     * <p>
     * _last_updated_at
     * </p>
     * </li>
     * <li>
     * <p>
     * _version
     * </p>
     * </li>
     * <li>
     * <p>
     * _view_count
     * </p>
     * </li>
     * </ul>
     * 
     * @param documentAttributeKey
     *        The name of the document attribute used to sort the response. You can use any field that has the
     *        <code>Sortable</code> flag set to true.</p>
     *        <p>
     *        You can also sort by any of the following built-in attributes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        _category
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _created_at
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _last_updated_at
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _version
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _view_count
     *        </p>
     *        </li>
     */

    public void setDocumentAttributeKey(String documentAttributeKey) {
        this.documentAttributeKey = documentAttributeKey;
    }

    /**
     * <p>
     * The name of the document attribute used to sort the response. You can use any field that has the
     * <code>Sortable</code> flag set to true.
     * </p>
     * <p>
     * You can also sort by any of the following built-in attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * _category
     * </p>
     * </li>
     * <li>
     * <p>
     * _created_at
     * </p>
     * </li>
     * <li>
     * <p>
     * _last_updated_at
     * </p>
     * </li>
     * <li>
     * <p>
     * _version
     * </p>
     * </li>
     * <li>
     * <p>
     * _view_count
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the document attribute used to sort the response. You can use any field that has the
     *         <code>Sortable</code> flag set to true.</p>
     *         <p>
     *         You can also sort by any of the following built-in attributes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         _category
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         _created_at
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         _last_updated_at
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         _version
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         _view_count
     *         </p>
     *         </li>
     */

    public String getDocumentAttributeKey() {
        return this.documentAttributeKey;
    }

    /**
     * <p>
     * The name of the document attribute used to sort the response. You can use any field that has the
     * <code>Sortable</code> flag set to true.
     * </p>
     * <p>
     * You can also sort by any of the following built-in attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * _category
     * </p>
     * </li>
     * <li>
     * <p>
     * _created_at
     * </p>
     * </li>
     * <li>
     * <p>
     * _last_updated_at
     * </p>
     * </li>
     * <li>
     * <p>
     * _version
     * </p>
     * </li>
     * <li>
     * <p>
     * _view_count
     * </p>
     * </li>
     * </ul>
     * 
     * @param documentAttributeKey
     *        The name of the document attribute used to sort the response. You can use any field that has the
     *        <code>Sortable</code> flag set to true.</p>
     *        <p>
     *        You can also sort by any of the following built-in attributes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        _category
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _created_at
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _last_updated_at
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _version
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        _view_count
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SortingConfiguration withDocumentAttributeKey(String documentAttributeKey) {
        setDocumentAttributeKey(documentAttributeKey);
        return this;
    }

    /**
     * <p>
     * The order that the results should be returned in. In case of ties, the relevance assigned to the result by Amazon
     * Kendra is used as the tie-breaker.
     * </p>
     * 
     * @param sortOrder
     *        The order that the results should be returned in. In case of ties, the relevance assigned to the result by
     *        Amazon Kendra is used as the tie-breaker.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order that the results should be returned in. In case of ties, the relevance assigned to the result by Amazon
     * Kendra is used as the tie-breaker.
     * </p>
     * 
     * @return The order that the results should be returned in. In case of ties, the relevance assigned to the result
     *         by Amazon Kendra is used as the tie-breaker.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order that the results should be returned in. In case of ties, the relevance assigned to the result by Amazon
     * Kendra is used as the tie-breaker.
     * </p>
     * 
     * @param sortOrder
     *        The order that the results should be returned in. In case of ties, the relevance assigned to the result by
     *        Amazon Kendra is used as the tie-breaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SortingConfiguration withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order that the results should be returned in. In case of ties, the relevance assigned to the result by Amazon
     * Kendra is used as the tie-breaker.
     * </p>
     * 
     * @param sortOrder
     *        The order that the results should be returned in. In case of ties, the relevance assigned to the result by
     *        Amazon Kendra is used as the tie-breaker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SortingConfiguration withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getDocumentAttributeKey() != null)
            sb.append("DocumentAttributeKey: ").append(getDocumentAttributeKey()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SortingConfiguration == false)
            return false;
        SortingConfiguration other = (SortingConfiguration) obj;
        if (other.getDocumentAttributeKey() == null ^ this.getDocumentAttributeKey() == null)
            return false;
        if (other.getDocumentAttributeKey() != null && other.getDocumentAttributeKey().equals(this.getDocumentAttributeKey()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentAttributeKey() == null) ? 0 : getDocumentAttributeKey().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public SortingConfiguration clone() {
        try {
            return (SortingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.SortingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
