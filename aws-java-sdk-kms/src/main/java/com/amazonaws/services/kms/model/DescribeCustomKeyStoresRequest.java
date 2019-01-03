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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/DescribeCustomKeyStores" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomKeyStoresRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the key store ID.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores in the account and region. To limit the
     * output to a particular custom key store, you can use either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     */
    private String customKeyStoreId;
    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the friendly name of the custom key store.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores in the account and region. To limit the
     * output to a particular custom key store, you can use either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     */
    private String customKeyStoreName;
    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextMarker</code> from the truncated response you just received.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the key store ID.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores in the account and region. To limit the
     * output to a particular custom key store, you can use either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     * 
     * @param customKeyStoreId
     *        Gets only information about the specified custom key store. Enter the key store ID.</p>
     *        <p>
     *        By default, this operation gets information about all custom key stores in the account and region. To
     *        limit the output to a particular custom key store, you can use either the <code>CustomKeyStoreId</code> or
     *        <code>CustomKeyStoreName</code> parameter, but not both.
     */

    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the key store ID.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores in the account and region. To limit the
     * output to a particular custom key store, you can use either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     * 
     * @return Gets only information about the specified custom key store. Enter the key store ID.</p>
     *         <p>
     *         By default, this operation gets information about all custom key stores in the account and region. To
     *         limit the output to a particular custom key store, you can use either the <code>CustomKeyStoreId</code>
     *         or <code>CustomKeyStoreName</code> parameter, but not both.
     */

    public String getCustomKeyStoreId() {
        return this.customKeyStoreId;
    }

    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the key store ID.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores in the account and region. To limit the
     * output to a particular custom key store, you can use either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     * 
     * @param customKeyStoreId
     *        Gets only information about the specified custom key store. Enter the key store ID.</p>
     *        <p>
     *        By default, this operation gets information about all custom key stores in the account and region. To
     *        limit the output to a particular custom key store, you can use either the <code>CustomKeyStoreId</code> or
     *        <code>CustomKeyStoreName</code> parameter, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomKeyStoresRequest withCustomKeyStoreId(String customKeyStoreId) {
        setCustomKeyStoreId(customKeyStoreId);
        return this;
    }

    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the friendly name of the custom key store.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores in the account and region. To limit the
     * output to a particular custom key store, you can use either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     * 
     * @param customKeyStoreName
     *        Gets only information about the specified custom key store. Enter the friendly name of the custom key
     *        store.</p>
     *        <p>
     *        By default, this operation gets information about all custom key stores in the account and region. To
     *        limit the output to a particular custom key store, you can use either the <code>CustomKeyStoreId</code> or
     *        <code>CustomKeyStoreName</code> parameter, but not both.
     */

    public void setCustomKeyStoreName(String customKeyStoreName) {
        this.customKeyStoreName = customKeyStoreName;
    }

    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the friendly name of the custom key store.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores in the account and region. To limit the
     * output to a particular custom key store, you can use either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     * 
     * @return Gets only information about the specified custom key store. Enter the friendly name of the custom key
     *         store.</p>
     *         <p>
     *         By default, this operation gets information about all custom key stores in the account and region. To
     *         limit the output to a particular custom key store, you can use either the <code>CustomKeyStoreId</code>
     *         or <code>CustomKeyStoreName</code> parameter, but not both.
     */

    public String getCustomKeyStoreName() {
        return this.customKeyStoreName;
    }

    /**
     * <p>
     * Gets only information about the specified custom key store. Enter the friendly name of the custom key store.
     * </p>
     * <p>
     * By default, this operation gets information about all custom key stores in the account and region. To limit the
     * output to a particular custom key store, you can use either the <code>CustomKeyStoreId</code> or
     * <code>CustomKeyStoreName</code> parameter, but not both.
     * </p>
     * 
     * @param customKeyStoreName
     *        Gets only information about the specified custom key store. Enter the friendly name of the custom key
     *        store.</p>
     *        <p>
     *        By default, this operation gets information about all custom key stores in the account and region. To
     *        limit the output to a particular custom key store, you can use either the <code>CustomKeyStoreId</code> or
     *        <code>CustomKeyStoreName</code> parameter, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomKeyStoresRequest withCustomKeyStoreName(String customKeyStoreName) {
        setCustomKeyStoreName(customKeyStoreName);
        return this;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     * 
     * @param limit
     *        Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS
     *        does not return more than the specified number of items, but it might return fewer.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     * 
     * @return Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS
     *         does not return more than the specified number of items, but it might return fewer.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     * 
     * @param limit
     *        Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS
     *        does not return more than the specified number of items, but it might return fewer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomKeyStoresRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextMarker</code> from the truncated response you just received.
     * </p>
     * 
     * @param marker
     *        Use this parameter in a subsequent request after you receive a response with truncated results. Set it to
     *        the value of <code>NextMarker</code> from the truncated response you just received.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextMarker</code> from the truncated response you just received.
     * </p>
     * 
     * @return Use this parameter in a subsequent request after you receive a response with truncated results. Set it to
     *         the value of <code>NextMarker</code> from the truncated response you just received.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextMarker</code> from the truncated response you just received.
     * </p>
     * 
     * @param marker
     *        Use this parameter in a subsequent request after you receive a response with truncated results. Set it to
     *        the value of <code>NextMarker</code> from the truncated response you just received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomKeyStoresRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getCustomKeyStoreId() != null)
            sb.append("CustomKeyStoreId: ").append(getCustomKeyStoreId()).append(",");
        if (getCustomKeyStoreName() != null)
            sb.append("CustomKeyStoreName: ").append(getCustomKeyStoreName()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCustomKeyStoresRequest == false)
            return false;
        DescribeCustomKeyStoresRequest other = (DescribeCustomKeyStoresRequest) obj;
        if (other.getCustomKeyStoreId() == null ^ this.getCustomKeyStoreId() == null)
            return false;
        if (other.getCustomKeyStoreId() != null && other.getCustomKeyStoreId().equals(this.getCustomKeyStoreId()) == false)
            return false;
        if (other.getCustomKeyStoreName() == null ^ this.getCustomKeyStoreName() == null)
            return false;
        if (other.getCustomKeyStoreName() != null && other.getCustomKeyStoreName().equals(this.getCustomKeyStoreName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        hashCode = prime * hashCode + ((getCustomKeyStoreName() == null) ? 0 : getCustomKeyStoreName().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCustomKeyStoresRequest clone() {
        return (DescribeCustomKeyStoresRequest) super.clone();
    }

}
