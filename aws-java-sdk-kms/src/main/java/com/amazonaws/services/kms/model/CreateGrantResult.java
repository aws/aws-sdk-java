/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 */
public class CreateGrantResult implements Serializable, Cloneable {

    /**
     * The grant token. <p>For more information about using grant tokens, see
     * <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     */
    private String grantToken;

    /**
     * The unique identifier for the grant. <p>You can use the
     * <code>GrantId</code> in a subsequent <a>RetireGrant</a> or
     * <a>RevokeGrant</a> operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String grantId;

    /**
     * The grant token. <p>For more information about using grant tokens, see
     * <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @return The grant token. <p>For more information about using grant tokens, see
     *         <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     *         Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
     */
    public String getGrantToken() {
        return grantToken;
    }
    
    /**
     * The grant token. <p>For more information about using grant tokens, see
     * <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @param grantToken The grant token. <p>For more information about using grant tokens, see
     *         <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     *         Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
     */
    public void setGrantToken(String grantToken) {
        this.grantToken = grantToken;
    }
    
    /**
     * The grant token. <p>For more information about using grant tokens, see
     * <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @param grantToken The grant token. <p>For more information about using grant tokens, see
     *         <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     *         Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateGrantResult withGrantToken(String grantToken) {
        this.grantToken = grantToken;
        return this;
    }

    /**
     * The unique identifier for the grant. <p>You can use the
     * <code>GrantId</code> in a subsequent <a>RetireGrant</a> or
     * <a>RevokeGrant</a> operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return The unique identifier for the grant. <p>You can use the
     *         <code>GrantId</code> in a subsequent <a>RetireGrant</a> or
     *         <a>RevokeGrant</a> operation.
     */
    public String getGrantId() {
        return grantId;
    }
    
    /**
     * The unique identifier for the grant. <p>You can use the
     * <code>GrantId</code> in a subsequent <a>RetireGrant</a> or
     * <a>RevokeGrant</a> operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId The unique identifier for the grant. <p>You can use the
     *         <code>GrantId</code> in a subsequent <a>RetireGrant</a> or
     *         <a>RevokeGrant</a> operation.
     */
    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }
    
    /**
     * The unique identifier for the grant. <p>You can use the
     * <code>GrantId</code> in a subsequent <a>RetireGrant</a> or
     * <a>RevokeGrant</a> operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId The unique identifier for the grant. <p>You can use the
     *         <code>GrantId</code> in a subsequent <a>RetireGrant</a> or
     *         <a>RevokeGrant</a> operation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateGrantResult withGrantId(String grantId) {
        this.grantId = grantId;
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
        if (getGrantToken() != null) sb.append("GrantToken: " + getGrantToken() + ",");
        if (getGrantId() != null) sb.append("GrantId: " + getGrantId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGrantToken() == null) ? 0 : getGrantToken().hashCode()); 
        hashCode = prime * hashCode + ((getGrantId() == null) ? 0 : getGrantId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateGrantResult == false) return false;
        CreateGrantResult other = (CreateGrantResult)obj;
        
        if (other.getGrantToken() == null ^ this.getGrantToken() == null) return false;
        if (other.getGrantToken() != null && other.getGrantToken().equals(this.getGrantToken()) == false) return false; 
        if (other.getGrantId() == null ^ this.getGrantId() == null) return false;
        if (other.getGrantId() != null && other.getGrantId().equals(this.getGrantId()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateGrantResult clone() {
        try {
            return (CreateGrantResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    