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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides options to retrieve the vault list owned by the calling user's account. The list provides metadata
 * information for each vault.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVaultsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID associated with
     * the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '
     * <code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials
     * used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * A string used for pagination. The marker specifies the vault ARN after which the listing of vaults should begin.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of vaults to be returned. The default limit is 10. The number of vaults returned might be
     * fewer than the specified limit, but the number of returned vaults never exceeds the limit.
     * </p>
     */
    private String limit;

    /**
     * Default constructor for ListVaultsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public ListVaultsRequest() {
    }

    /**
     * Constructs a new ListVaultsRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID
     *        associated with the credentials used to sign the request. You can either specify an AWS account ID or
     *        optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID
     *        associated with the credentials used to sign the request. If you specify your account ID, do not include
     *        any hyphens ('-') in the ID.
     */
    public ListVaultsRequest(String accountId) {
        setAccountId(accountId);
    }

    /**
     * Constructs a new ListVaultsRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID
     *        associated with the credentials used to sign the request. You can either specify an AWS account ID or
     *        optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID
     *        associated with the credentials used to sign the request. If you specify your account ID, do not include
     *        any hyphens ('-') in the ID.
     * @param marker
     *        A string used for pagination. The marker specifies the vault ARN after which the listing of vaults should
     *        begin.
     * @param limit
     *        The maximum number of vaults to be returned. The default limit is 10. The number of vaults returned might
     *        be fewer than the specified limit, but the number of returned vaults never exceeds the limit.
     */
    public ListVaultsRequest(String accountId, String marker, String limit) {
        setAccountId(accountId);
        setMarker(marker);
        setLimit(limit);
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID associated with
     * the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '
     * <code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials
     * used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID
     *        associated with the credentials used to sign the request. You can either specify an AWS account ID or
     *        optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID
     *        associated with the credentials used to sign the request. If you specify your account ID, do not include
     *        any hyphens ('-') in the ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID associated with
     * the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '
     * <code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials
     * used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
     * </p>
     * 
     * @return The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID
     *         associated with the credentials used to sign the request. You can either specify an AWS account ID or
     *         optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID
     *         associated with the credentials used to sign the request. If you specify your account ID, do not include
     *         any hyphens ('-') in the ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID associated with
     * the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '
     * <code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials
     * used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID. This value must match the AWS account ID
     *        associated with the credentials used to sign the request. You can either specify an AWS account ID or
     *        optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID
     *        associated with the credentials used to sign the request. If you specify your account ID, do not include
     *        any hyphens ('-') in the ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVaultsRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * A string used for pagination. The marker specifies the vault ARN after which the listing of vaults should begin.
     * </p>
     * 
     * @param marker
     *        A string used for pagination. The marker specifies the vault ARN after which the listing of vaults should
     *        begin.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A string used for pagination. The marker specifies the vault ARN after which the listing of vaults should begin.
     * </p>
     * 
     * @return A string used for pagination. The marker specifies the vault ARN after which the listing of vaults should
     *         begin.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A string used for pagination. The marker specifies the vault ARN after which the listing of vaults should begin.
     * </p>
     * 
     * @param marker
     *        A string used for pagination. The marker specifies the vault ARN after which the listing of vaults should
     *        begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVaultsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of vaults to be returned. The default limit is 10. The number of vaults returned might be
     * fewer than the specified limit, but the number of returned vaults never exceeds the limit.
     * </p>
     * 
     * @param limit
     *        The maximum number of vaults to be returned. The default limit is 10. The number of vaults returned might
     *        be fewer than the specified limit, but the number of returned vaults never exceeds the limit.
     */

    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of vaults to be returned. The default limit is 10. The number of vaults returned might be
     * fewer than the specified limit, but the number of returned vaults never exceeds the limit.
     * </p>
     * 
     * @return The maximum number of vaults to be returned. The default limit is 10. The number of vaults returned might
     *         be fewer than the specified limit, but the number of returned vaults never exceeds the limit.
     */

    public String getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of vaults to be returned. The default limit is 10. The number of vaults returned might be
     * fewer than the specified limit, but the number of returned vaults never exceeds the limit.
     * </p>
     * 
     * @param limit
     *        The maximum number of vaults to be returned. The default limit is 10. The number of vaults returned might
     *        be fewer than the specified limit, but the number of returned vaults never exceeds the limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVaultsRequest withLimit(String limit) {
        setLimit(limit);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVaultsRequest == false)
            return false;
        ListVaultsRequest other = (ListVaultsRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public ListVaultsRequest clone() {
        return (ListVaultsRequest) super.clone();
    }

}
