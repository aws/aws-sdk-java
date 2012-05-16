/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitytoken.model;

/**
 * <p>
 * Contains the result of a successful invocation of the GetFederationToken action.
 * </p>
 */
public class GetFederationTokenResult {

    /**
     * Credentials for the service API authentication.
     */
    private Credentials credentials;

    /**
     * Identifiers for the federated user associated with the credentials.
     * You can use the federated user's ARN in your resource policies.
     */
    private FederatedUser federatedUser;

    /**
     * A percentage value indicating the size of the policy in packed form.
     * Policies for which the packed size is greater than 100% of the allowed
     * value are rejected by the service.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer packedPolicySize;

    /**
     * Credentials for the service API authentication.
     *
     * @return Credentials for the service API authentication.
     */
    public Credentials getCredentials() {
        return credentials;
    }
    
    /**
     * Credentials for the service API authentication.
     *
     * @param credentials Credentials for the service API authentication.
     */
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }
    
    /**
     * Credentials for the service API authentication.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param credentials Credentials for the service API authentication.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetFederationTokenResult withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }
    
    
    /**
     * Identifiers for the federated user associated with the credentials.
     * You can use the federated user's ARN in your resource policies.
     *
     * @return Identifiers for the federated user associated with the credentials.
     *         You can use the federated user's ARN in your resource policies.
     */
    public FederatedUser getFederatedUser() {
        return federatedUser;
    }
    
    /**
     * Identifiers for the federated user associated with the credentials.
     * You can use the federated user's ARN in your resource policies.
     *
     * @param federatedUser Identifiers for the federated user associated with the credentials.
     *         You can use the federated user's ARN in your resource policies.
     */
    public void setFederatedUser(FederatedUser federatedUser) {
        this.federatedUser = federatedUser;
    }
    
    /**
     * Identifiers for the federated user associated with the credentials.
     * You can use the federated user's ARN in your resource policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param federatedUser Identifiers for the federated user associated with the credentials.
     *         You can use the federated user's ARN in your resource policies.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetFederationTokenResult withFederatedUser(FederatedUser federatedUser) {
        this.federatedUser = federatedUser;
        return this;
    }
    
    
    /**
     * A percentage value indicating the size of the policy in packed form.
     * Policies for which the packed size is greater than 100% of the allowed
     * value are rejected by the service.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A percentage value indicating the size of the policy in packed form.
     *         Policies for which the packed size is greater than 100% of the allowed
     *         value are rejected by the service.
     */
    public Integer getPackedPolicySize() {
        return packedPolicySize;
    }
    
    /**
     * A percentage value indicating the size of the policy in packed form.
     * Policies for which the packed size is greater than 100% of the allowed
     * value are rejected by the service.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param packedPolicySize A percentage value indicating the size of the policy in packed form.
     *         Policies for which the packed size is greater than 100% of the allowed
     *         value are rejected by the service.
     */
    public void setPackedPolicySize(Integer packedPolicySize) {
        this.packedPolicySize = packedPolicySize;
    }
    
    /**
     * A percentage value indicating the size of the policy in packed form.
     * Policies for which the packed size is greater than 100% of the allowed
     * value are rejected by the service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param packedPolicySize A percentage value indicating the size of the policy in packed form.
     *         Policies for which the packed size is greater than 100% of the allowed
     *         value are rejected by the service.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetFederationTokenResult withPackedPolicySize(Integer packedPolicySize) {
        this.packedPolicySize = packedPolicySize;
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
        if (credentials != null) sb.append("Credentials: " + credentials + ", ");
        if (federatedUser != null) sb.append("FederatedUser: " + federatedUser + ", ");
        if (packedPolicySize != null) sb.append("PackedPolicySize: " + packedPolicySize + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode()); 
        hashCode = prime * hashCode + ((getFederatedUser() == null) ? 0 : getFederatedUser().hashCode()); 
        hashCode = prime * hashCode + ((getPackedPolicySize() == null) ? 0 : getPackedPolicySize().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof GetFederationTokenResult == false) return false;
        GetFederationTokenResult other = (GetFederationTokenResult)obj;
        
        if (other.getCredentials() == null ^ this.getCredentials() == null) return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false) return false; 
        if (other.getFederatedUser() == null ^ this.getFederatedUser() == null) return false;
        if (other.getFederatedUser() != null && other.getFederatedUser().equals(this.getFederatedUser()) == false) return false; 
        if (other.getPackedPolicySize() == null ^ this.getPackedPolicySize() == null) return false;
        if (other.getPackedPolicySize() != null && other.getPackedPolicySize().equals(this.getPackedPolicySize()) == false) return false; 
        return true;
    }
    
}
    