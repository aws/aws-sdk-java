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
 * Container for the parameters to the {@link com.amazonaws.services.kms.AWSKMS#retireGrant(RetireGrantRequest) RetireGrant operation}.
 * <p>
 * Retires a grant. You can retire a grant when you're done using it to
 * clean up. You should revoke a grant when you intend to actively deny
 * operations that depend on it.
 * </p>
 *
 * @see com.amazonaws.services.kms.AWSKMS#retireGrant(RetireGrantRequest)
 */
public class RetireGrantRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Token that identifies the grant to be retired.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     */
    private String grantToken;

    /**
     * Token that identifies the grant to be retired.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @return Token that identifies the grant to be retired.
     */
    public String getGrantToken() {
        return grantToken;
    }
    
    /**
     * Token that identifies the grant to be retired.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @param grantToken Token that identifies the grant to be retired.
     */
    public void setGrantToken(String grantToken) {
        this.grantToken = grantToken;
    }
    
    /**
     * Token that identifies the grant to be retired.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @param grantToken Token that identifies the grant to be retired.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RetireGrantRequest withGrantToken(String grantToken) {
        this.grantToken = grantToken;
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
        if (getGrantToken() != null) sb.append("GrantToken: " + getGrantToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGrantToken() == null) ? 0 : getGrantToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RetireGrantRequest == false) return false;
        RetireGrantRequest other = (RetireGrantRequest)obj;
        
        if (other.getGrantToken() == null ^ this.getGrantToken() == null) return false;
        if (other.getGrantToken() != null && other.getGrantToken().equals(this.getGrantToken()) == false) return false; 
        return true;
    }
    
}
    