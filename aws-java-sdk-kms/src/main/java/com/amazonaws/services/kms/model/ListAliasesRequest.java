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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListAliases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAliasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Lists only aliases that refer to the specified CMK. The value of this parameter can be the ID or Amazon Resource
     * Name (ARN) of a CMK in the caller's account and region. You cannot use an alias name or alias ARN in this value.
     * </p>
     * <p>
     * This parameter is optional. If you omit it, <code>ListAliases</code> returns all aliases in the account and
     * region.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
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
     * Lists only aliases that refer to the specified CMK. The value of this parameter can be the ID or Amazon Resource
     * Name (ARN) of a CMK in the caller's account and region. You cannot use an alias name or alias ARN in this value.
     * </p>
     * <p>
     * This parameter is optional. If you omit it, <code>ListAliases</code> returns all aliases in the account and
     * region.
     * </p>
     * 
     * @param keyId
     *        Lists only aliases that refer to the specified CMK. The value of this parameter can be the ID or Amazon
     *        Resource Name (ARN) of a CMK in the caller's account and region. You cannot use an alias name or alias ARN
     *        in this value.</p>
     *        <p>
     *        This parameter is optional. If you omit it, <code>ListAliases</code> returns all aliases in the account
     *        and region.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Lists only aliases that refer to the specified CMK. The value of this parameter can be the ID or Amazon Resource
     * Name (ARN) of a CMK in the caller's account and region. You cannot use an alias name or alias ARN in this value.
     * </p>
     * <p>
     * This parameter is optional. If you omit it, <code>ListAliases</code> returns all aliases in the account and
     * region.
     * </p>
     * 
     * @return Lists only aliases that refer to the specified CMK. The value of this parameter can be the ID or Amazon
     *         Resource Name (ARN) of a CMK in the caller's account and region. You cannot use an alias name or alias
     *         ARN in this value.</p>
     *         <p>
     *         This parameter is optional. If you omit it, <code>ListAliases</code> returns all aliases in the account
     *         and region.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * Lists only aliases that refer to the specified CMK. The value of this parameter can be the ID or Amazon Resource
     * Name (ARN) of a CMK in the caller's account and region. You cannot use an alias name or alias ARN in this value.
     * </p>
     * <p>
     * This parameter is optional. If you omit it, <code>ListAliases</code> returns all aliases in the account and
     * region.
     * </p>
     * 
     * @param keyId
     *        Lists only aliases that refer to the specified CMK. The value of this parameter can be the ID or Amazon
     *        Resource Name (ARN) of a CMK in the caller's account and region. You cannot use an alias name or alias ARN
     *        in this value.</p>
     *        <p>
     *        This parameter is optional. If you omit it, <code>ListAliases</code> returns all aliases in the account
     *        and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
     * </p>
     * 
     * @param limit
     *        Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS
     *        does not return more than the specified number of items, but it might return fewer.</p>
     *        <p>
     *        This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not
     *        include a value, it defaults to 50.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
     * </p>
     * 
     * @return Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS
     *         does not return more than the specified number of items, but it might return fewer.</p>
     *         <p>
     *         This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not
     *         include a value, it defaults to 50.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
     * </p>
     * 
     * @param limit
     *        Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS
     *        does not return more than the specified number of items, but it might return fewer.</p>
     *        <p>
     *        This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not
     *        include a value, it defaults to 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withLimit(Integer limit) {
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

    public ListAliasesRequest withMarker(String marker) {
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
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
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

        if (obj instanceof ListAliasesRequest == false)
            return false;
        ListAliasesRequest other = (ListAliasesRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
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

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListAliasesRequest clone() {
        return (ListAliasesRequest) super.clone();
    }

}
