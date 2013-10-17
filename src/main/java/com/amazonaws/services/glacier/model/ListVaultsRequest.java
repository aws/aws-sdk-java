/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#listVaults(ListVaultsRequest) ListVaults operation}.
 * <p>
 * This operation lists all vaults owned by the calling user's account. The list returned in the response is ASCII-sorted by vault name.
 * </p>
 * <p>
 * By default, this operation returns up to 1,000 items. If there are more vaults to list, the response <code>marker</code> field contains the vault
 * Amazon Resource Name (ARN) at which to continue the list with a new List Vaults request; otherwise, the <code>marker</code> field is <code>null</code>
 * . To return a list of vaults that begins at a specific vault, set the <code>marker</code> request parameter to the vault ARN you obtained from a
 * previous List Vaults request. You can also limit the number of vaults returned in the response by specifying the <code>limit</code> parameter in the
 * request.
 * </p>
 * <p>
 * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any
 * permissions by default. You must grant them explicit permission to perform specific actions. For more information, see <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html"> Access Control Using AWS Identity and Access
 * Management (IAM) </a> .
 * </p>
 * <p>
 * For conceptual information and underlying REST API, go to <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/retrieving-vault-info.html"> Retrieving Vault Metadata in Amazon Glacier </a> and <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/api-vaults-get.html"> List Vaults </a> in the <i>Amazon Glacier Developer Guide</i>
 * .
 * 
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#listVaults(ListVaultsRequest)
 */
public class ListVaultsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     */
    private String accountId;

    /**
     * A string used for pagination. The marker specifies the vault ARN after
     * which the listing of vaults should begin.
     */
    private String marker;

    /**
     * The maximum number of items returned in the response. If you don't
     * specify a value, the List Vaults operation returns up to 1,000 items.
     */
    private String limit;

    /**
     * Default constructor for a new ListVaultsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListVaultsRequest() {}
    
    /**
     * Constructs a new ListVaultsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You
     * can specify either the AWS Account ID or optionally a '-', in which
     * case Amazon Glacier uses the AWS Account ID associated with the
     * credentials used to sign the request. If you specify your Account ID,
     * do not include hyphens in it.
     */
    public ListVaultsRequest(String accountId) {
        setAccountId(accountId);
    }

    /**
     * Constructs a new ListVaultsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You
     * can specify either the AWS Account ID or optionally a '-', in which
     * case Amazon Glacier uses the AWS Account ID associated with the
     * credentials used to sign the request. If you specify your Account ID,
     * do not include hyphens in it.
     * @param marker A string used for pagination. The marker specifies the
     * vault ARN after which the listing of vaults should begin.
     * @param limit The maximum number of items returned in the response. If
     * you don't specify a value, the List Vaults operation returns up to
     * 1,000 items.
     */
    public ListVaultsRequest(String accountId, String marker, String limit) {
        setAccountId(accountId);
        setMarker(marker);
        setLimit(limit);
    }

    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     *
     * @return The <code>AccountId</code> is the AWS Account ID. You can specify
     *         either the AWS Account ID or optionally a '-', in which case Amazon
     *         Glacier uses the AWS Account ID associated with the credentials used
     *         to sign the request. If you specify your Account ID, do not include
     *         hyphens in it.
     */
    public String getAccountId() {
        return accountId;
    }
    
    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     *
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You can specify
     *         either the AWS Account ID or optionally a '-', in which case Amazon
     *         Glacier uses the AWS Account ID associated with the credentials used
     *         to sign the request. If you specify your Account ID, do not include
     *         hyphens in it.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You can specify
     *         either the AWS Account ID or optionally a '-', in which case Amazon
     *         Glacier uses the AWS Account ID associated with the credentials used
     *         to sign the request. If you specify your Account ID, do not include
     *         hyphens in it.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListVaultsRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * A string used for pagination. The marker specifies the vault ARN after
     * which the listing of vaults should begin.
     *
     * @return A string used for pagination. The marker specifies the vault ARN after
     *         which the listing of vaults should begin.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A string used for pagination. The marker specifies the vault ARN after
     * which the listing of vaults should begin.
     *
     * @param marker A string used for pagination. The marker specifies the vault ARN after
     *         which the listing of vaults should begin.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A string used for pagination. The marker specifies the vault ARN after
     * which the listing of vaults should begin.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A string used for pagination. The marker specifies the vault ARN after
     *         which the listing of vaults should begin.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListVaultsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * The maximum number of items returned in the response. If you don't
     * specify a value, the List Vaults operation returns up to 1,000 items.
     *
     * @return The maximum number of items returned in the response. If you don't
     *         specify a value, the List Vaults operation returns up to 1,000 items.
     */
    public String getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of items returned in the response. If you don't
     * specify a value, the List Vaults operation returns up to 1,000 items.
     *
     * @param limit The maximum number of items returned in the response. If you don't
     *         specify a value, the List Vaults operation returns up to 1,000 items.
     */
    public void setLimit(String limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of items returned in the response. If you don't
     * specify a value, the List Vaults operation returns up to 1,000 items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param limit The maximum number of items returned in the response. If you don't
     *         specify a value, the List Vaults operation returns up to 1,000 items.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListVaultsRequest withLimit(String limit) {
        this.limit = limit;
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
        if (getAccountId() != null) sb.append("AccountId: " + getAccountId() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListVaultsRequest == false) return false;
        ListVaultsRequest other = (ListVaultsRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        return true;
    }
    
}
    