/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#setDataRetrievalPolicy(SetDataRetrievalPolicyRequest) SetDataRetrievalPolicy operation}.
 * <p>
 * This operation sets and then enacts a data retrieval policy in the
 * region specified in the PUT request. You can set one policy per region
 * for an AWS account. The policy is enacted within a few minutes of a
 * successful PUT operation.
 * </p>
 * <p>
 * The set policy operation does not affect retrieval jobs that were in
 * progress before the policy was enacted. For more information about
 * data retrieval policies, see
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/data-retrieval-policy.html"> Amazon Glacier Data Retrieval Policies </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#setDataRetrievalPolicy(SetDataRetrievalPolicyRequest)
 */
public class SetDataRetrievalPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The <code>AccountId</code> value is the AWS account ID. This value
     * must match the AWS account ID associated with the credentials used to
     * sign the request. You can either specify an AWS account ID or
     * optionally a single '<code>-</code>' (hyphen), in which case Amazon
     * Glacier uses the AWS account ID associated with the credentials used
     * to sign the request. If you specify your account ID, do not include
     * any hyphens ('-') in the ID.
     */
    private String accountId;

    /**
     * The data retrieval policy in JSON format.
     */
    private DataRetrievalPolicy policy;

    /**
     * The <code>AccountId</code> value is the AWS account ID. This value
     * must match the AWS account ID associated with the credentials used to
     * sign the request. You can either specify an AWS account ID or
     * optionally a single '<code>-</code>' (hyphen), in which case Amazon
     * Glacier uses the AWS account ID associated with the credentials used
     * to sign the request. If you specify your account ID, do not include
     * any hyphens ('-') in the ID.
     *
     * @return The <code>AccountId</code> value is the AWS account ID. This value
     *         must match the AWS account ID associated with the credentials used to
     *         sign the request. You can either specify an AWS account ID or
     *         optionally a single '<code>-</code>' (hyphen), in which case Amazon
     *         Glacier uses the AWS account ID associated with the credentials used
     *         to sign the request. If you specify your account ID, do not include
     *         any hyphens ('-') in the ID.
     */
    public String getAccountId() {
        return accountId;
    }
    
    /**
     * The <code>AccountId</code> value is the AWS account ID. This value
     * must match the AWS account ID associated with the credentials used to
     * sign the request. You can either specify an AWS account ID or
     * optionally a single '<code>-</code>' (hyphen), in which case Amazon
     * Glacier uses the AWS account ID associated with the credentials used
     * to sign the request. If you specify your account ID, do not include
     * any hyphens ('-') in the ID.
     *
     * @param accountId The <code>AccountId</code> value is the AWS account ID. This value
     *         must match the AWS account ID associated with the credentials used to
     *         sign the request. You can either specify an AWS account ID or
     *         optionally a single '<code>-</code>' (hyphen), in which case Amazon
     *         Glacier uses the AWS account ID associated with the credentials used
     *         to sign the request. If you specify your account ID, do not include
     *         any hyphens ('-') in the ID.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    /**
     * The <code>AccountId</code> value is the AWS account ID. This value
     * must match the AWS account ID associated with the credentials used to
     * sign the request. You can either specify an AWS account ID or
     * optionally a single '<code>-</code>' (hyphen), in which case Amazon
     * Glacier uses the AWS account ID associated with the credentials used
     * to sign the request. If you specify your account ID, do not include
     * any hyphens ('-') in the ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountId The <code>AccountId</code> value is the AWS account ID. This value
     *         must match the AWS account ID associated with the credentials used to
     *         sign the request. You can either specify an AWS account ID or
     *         optionally a single '<code>-</code>' (hyphen), in which case Amazon
     *         Glacier uses the AWS account ID associated with the credentials used
     *         to sign the request. If you specify your account ID, do not include
     *         any hyphens ('-') in the ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetDataRetrievalPolicyRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * The data retrieval policy in JSON format.
     *
     * @return The data retrieval policy in JSON format.
     */
    public DataRetrievalPolicy getPolicy() {
        return policy;
    }
    
    /**
     * The data retrieval policy in JSON format.
     *
     * @param policy The data retrieval policy in JSON format.
     */
    public void setPolicy(DataRetrievalPolicy policy) {
        this.policy = policy;
    }
    
    /**
     * The data retrieval policy in JSON format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policy The data retrieval policy in JSON format.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetDataRetrievalPolicyRequest withPolicy(DataRetrievalPolicy policy) {
        this.policy = policy;
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
        if (getPolicy() != null) sb.append("Policy: " + getPolicy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode()); 
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetDataRetrievalPolicyRequest == false) return false;
        SetDataRetrievalPolicyRequest other = (SetDataRetrievalPolicyRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getPolicy() == null ^ this.getPolicy() == null) return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false) return false; 
        return true;
    }
    
    @Override
    public SetDataRetrievalPolicyRequest clone() {
        
            return (SetDataRetrievalPolicyRequest) super.clone();
    }

}
    