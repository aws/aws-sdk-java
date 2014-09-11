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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#getId(GetIdRequest) GetId operation}.
 * <p>
 * Generates (or retrieves) a Cognito ID. Supplying multiple logins will
 * create an implicit linked account.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity#getId(GetIdRequest)
 */
public class GetIdRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A standard AWS account ID (9+ digits).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     * <b>Pattern: </b>\d+<br/>
     */
    private String accountId;

    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * A set of optional name/value pairs that map provider names to provider
     * tokens.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     */
    private java.util.Map<String,String> logins;

    /**
     * A standard AWS account ID (9+ digits).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @return A standard AWS account ID (9+ digits).
     */
    public String getAccountId() {
        return accountId;
    }
    
    /**
     * A standard AWS account ID (9+ digits).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param accountId A standard AWS account ID (9+ digits).
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    /**
     * A standard AWS account ID (9+ digits).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param accountId A standard AWS account ID (9+ digits).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetIdRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return An identity pool ID in the format REGION:GUID.
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }
    
    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId An identity pool ID in the format REGION:GUID.
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }
    
    /**
     * An identity pool ID in the format REGION:GUID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId An identity pool ID in the format REGION:GUID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetIdRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * A set of optional name/value pairs that map provider names to provider
     * tokens.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @return A set of optional name/value pairs that map provider names to provider
     *         tokens.
     */
    public java.util.Map<String,String> getLogins() {
        
        return logins;
    }
    
    /**
     * A set of optional name/value pairs that map provider names to provider
     * tokens.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param logins A set of optional name/value pairs that map provider names to provider
     *         tokens.
     */
    public void setLogins(java.util.Map<String,String> logins) {
        this.logins = logins;
    }
    
    /**
     * A set of optional name/value pairs that map provider names to provider
     * tokens.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param logins A set of optional name/value pairs that map provider names to provider
     *         tokens.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetIdRequest withLogins(java.util.Map<String,String> logins) {
        setLogins(logins);
        return this;
    }

    /**
     * A set of optional name/value pairs that map provider names to provider
     * tokens.
     * <p>
     * The method adds a new key-value pair into Logins parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 3<br/>
     *
     * @param key The key of the entry to be added into Logins.
     * @param value The corresponding value of the entry to be added into Logins.
     */
    public GetIdRequest addLoginsEntry(String key, String value) {
        if (null == this.logins) {
            this.logins = new java.util.HashMap<String,String>();
        }
        if (this.logins.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.logins.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Logins.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public GetIdRequest clearLoginsEntries() {
        this.logins = null;
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
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getLogins() != null) sb.append("Logins: " + getLogins() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode()); 
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getLogins() == null) ? 0 : getLogins().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetIdRequest == false) return false;
        GetIdRequest other = (GetIdRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getLogins() == null ^ this.getLogins() == null) return false;
        if (other.getLogins() != null && other.getLogins().equals(this.getLogins()) == false) return false; 
        return true;
    }
    
}
    