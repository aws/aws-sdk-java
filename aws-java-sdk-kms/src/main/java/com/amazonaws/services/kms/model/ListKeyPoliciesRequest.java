/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.kms.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ListKeyPoliciesRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * <li>Alias Name Example - alias/MyAliasName</li>
     * </ul>
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * When paginating results, specify the maximum number of items to return in
     * the response. If additional items exist beyond the number you specify,
     * the <code>Truncated</code> element in the response is set to true.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 1000, inclusive. If you do not include a value, it defaults to 100.
     * </p>
     * <p>
     * Currently only 1 policy can be attached to a key.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Use this parameter only when paginating results and only in a subsequent
     * request after you've received a response with truncated results. Set it
     * to the value of <code>NextMarker</code> from the response you just
     * received.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * <li>Alias Name Example - alias/MyAliasName</li>
     * </ul>
     * </p>
     * 
     * @param keyId
     *        A unique identifier for the customer master key. This value can be
     *        a globally unique identifier, a fully specified ARN to either an
     *        alias or a key, or an alias name prefixed by "alias/".
     *        <ul>
     *        <li>Key ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:key/12345678
     *        -1234-1234-1234-123456789012</li>
     *        <li>Alias ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     *        <li>Globally Unique Key ID Example -
     *        12345678-1234-1234-1234-123456789012</li>
     *        <li>Alias Name Example - alias/MyAliasName</li>
     *        </ul>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * <li>Alias Name Example - alias/MyAliasName</li>
     * </ul>
     * </p>
     * 
     * @return A unique identifier for the customer master key. This value can
     *         be a globally unique identifier, a fully specified ARN to either
     *         an alias or a key, or an alias name prefixed by "alias/".
     *         <ul>
     *         <li>Key ARN Example -
     *         arn:aws:kms:us-east-1:123456789012:key/12345678
     *         -1234-1234-1234-123456789012</li>
     *         <li>Alias ARN Example -
     *         arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     *         <li>Globally Unique Key ID Example -
     *         12345678-1234-1234-1234-123456789012</li>
     *         <li>Alias Name Example - alias/MyAliasName</li>
     *         </ul>
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * <li>Alias Name Example - alias/MyAliasName</li>
     * </ul>
     * </p>
     * 
     * @param keyId
     *        A unique identifier for the customer master key. This value can be
     *        a globally unique identifier, a fully specified ARN to either an
     *        alias or a key, or an alias name prefixed by "alias/".
     *        <ul>
     *        <li>Key ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:key/12345678
     *        -1234-1234-1234-123456789012</li>
     *        <li>Alias ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     *        <li>Globally Unique Key ID Example -
     *        12345678-1234-1234-1234-123456789012</li>
     *        <li>Alias Name Example - alias/MyAliasName</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListKeyPoliciesRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * When paginating results, specify the maximum number of items to return in
     * the response. If additional items exist beyond the number you specify,
     * the <code>Truncated</code> element in the response is set to true.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 1000, inclusive. If you do not include a value, it defaults to 100.
     * </p>
     * <p>
     * Currently only 1 policy can be attached to a key.
     * </p>
     * 
     * @param limit
     *        When paginating results, specify the maximum number of items to
     *        return in the response. If additional items exist beyond the
     *        number you specify, the <code>Truncated</code> element in the
     *        response is set to true.</p>
     *        <p>
     *        This value is optional. If you include a value, it must be between
     *        1 and 1000, inclusive. If you do not include a value, it defaults
     *        to 100.
     *        </p>
     *        <p>
     *        Currently only 1 policy can be attached to a key.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * When paginating results, specify the maximum number of items to return in
     * the response. If additional items exist beyond the number you specify,
     * the <code>Truncated</code> element in the response is set to true.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 1000, inclusive. If you do not include a value, it defaults to 100.
     * </p>
     * <p>
     * Currently only 1 policy can be attached to a key.
     * </p>
     * 
     * @return When paginating results, specify the maximum number of items to
     *         return in the response. If additional items exist beyond the
     *         number you specify, the <code>Truncated</code> element in the
     *         response is set to true.</p>
     *         <p>
     *         This value is optional. If you include a value, it must be
     *         between 1 and 1000, inclusive. If you do not include a value, it
     *         defaults to 100.
     *         </p>
     *         <p>
     *         Currently only 1 policy can be attached to a key.
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * When paginating results, specify the maximum number of items to return in
     * the response. If additional items exist beyond the number you specify,
     * the <code>Truncated</code> element in the response is set to true.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and
     * 1000, inclusive. If you do not include a value, it defaults to 100.
     * </p>
     * <p>
     * Currently only 1 policy can be attached to a key.
     * </p>
     * 
     * @param limit
     *        When paginating results, specify the maximum number of items to
     *        return in the response. If additional items exist beyond the
     *        number you specify, the <code>Truncated</code> element in the
     *        response is set to true.</p>
     *        <p>
     *        This value is optional. If you include a value, it must be between
     *        1 and 1000, inclusive. If you do not include a value, it defaults
     *        to 100.
     *        </p>
     *        <p>
     *        Currently only 1 policy can be attached to a key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListKeyPoliciesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only in a subsequent
     * request after you've received a response with truncated results. Set it
     * to the value of <code>NextMarker</code> from the response you just
     * received.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only in a
     *        subsequent request after you've received a response with truncated
     *        results. Set it to the value of <code>NextMarker</code> from the
     *        response you just received.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only in a subsequent
     * request after you've received a response with truncated results. Set it
     * to the value of <code>NextMarker</code> from the response you just
     * received.
     * </p>
     * 
     * @return Use this parameter only when paginating results and only in a
     *         subsequent request after you've received a response with
     *         truncated results. Set it to the value of <code>NextMarker</code>
     *         from the response you just received.
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only in a subsequent
     * request after you've received a response with truncated results. Set it
     * to the value of <code>NextMarker</code> from the response you just
     * received.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only in a
     *        subsequent request after you've received a response with truncated
     *        results. Set it to the value of <code>NextMarker</code> from the
     *        response you just received.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListKeyPoliciesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("KeyId: " + getKeyId() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListKeyPoliciesRequest == false)
            return false;
        ListKeyPoliciesRequest other = (ListKeyPoliciesRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null
                && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null
                && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListKeyPoliciesRequest clone() {
        return (ListKeyPoliciesRequest) super.clone();
    }
}