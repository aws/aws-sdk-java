/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.kms.AWSKMS#putKeyPolicy(PutKeyPolicyRequest) PutKeyPolicy operation}.
 * <p>
 * Attaches a policy to the specified key.
 * </p>
 *
 * @see com.amazonaws.services.kms.AWSKMS#putKeyPolicy(PutKeyPolicyRequest)
 */
public class PutKeyPolicyRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Unique identifier of the key. This can be an ARN, an alias, or a
     * globally unique identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * Name of the policy to be attached. Currently, the only supported name
     * is "default".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String policyName;

    /**
     * The policy, in JSON format, to be attached to the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     */
    private String policy;

    /**
     * Unique identifier of the key. This can be an ARN, an alias, or a
     * globally unique identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Unique identifier of the key. This can be an ARN, an alias, or a
     *         globally unique identifier.
     */
    public String getKeyId() {
        return keyId;
    }
    
    /**
     * Unique identifier of the key. This can be an ARN, an alias, or a
     * globally unique identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier of the key. This can be an ARN, an alias, or a
     *         globally unique identifier.
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    
    /**
     * Unique identifier of the key. This can be an ARN, an alias, or a
     * globally unique identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier of the key. This can be an ARN, an alias, or a
     *         globally unique identifier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutKeyPolicyRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Name of the policy to be attached. Currently, the only supported name
     * is "default".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return Name of the policy to be attached. Currently, the only supported name
     *         is "default".
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * Name of the policy to be attached. Currently, the only supported name
     * is "default".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param policyName Name of the policy to be attached. Currently, the only supported name
     *         is "default".
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * Name of the policy to be attached. Currently, the only supported name
     * is "default".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param policyName Name of the policy to be attached. Currently, the only supported name
     *         is "default".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutKeyPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * The policy, in JSON format, to be attached to the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return The policy, in JSON format, to be attached to the key.
     */
    public String getPolicy() {
        return policy;
    }
    
    /**
     * The policy, in JSON format, to be attached to the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param policy The policy, in JSON format, to be attached to the key.
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }
    
    /**
     * The policy, in JSON format, to be attached to the key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param policy The policy, in JSON format, to be attached to the key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutKeyPolicyRequest withPolicy(String policy) {
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
        if (getKeyId() != null) sb.append("KeyId: " + getKeyId() + ",");
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicy() != null) sb.append("Policy: " + getPolicy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutKeyPolicyRequest == false) return false;
        PutKeyPolicyRequest other = (PutKeyPolicyRequest)obj;
        
        if (other.getKeyId() == null ^ this.getKeyId() == null) return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false) return false; 
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getPolicy() == null ^ this.getPolicy() == null) return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false) return false; 
        return true;
    }
    
}
    