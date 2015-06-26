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
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     */
    private String grantToken;

    /**
     * Unique grant identifier. You can use the <i>GrantId</i> value to
     * revoke a grant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String grantId;

    /**
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @return For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     *         Tokens</a>.
     */
    public String getGrantToken() {
        return grantToken;
    }
    
    /**
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @param grantToken For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     *         Tokens</a>.
     */
    public void setGrantToken(String grantToken) {
        this.grantToken = grantToken;
    }
    
    /**
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8192<br/>
     *
     * @param grantToken For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     *         Tokens</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateGrantResult withGrantToken(String grantToken) {
        this.grantToken = grantToken;
        return this;
    }

    /**
     * Unique grant identifier. You can use the <i>GrantId</i> value to
     * revoke a grant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return Unique grant identifier. You can use the <i>GrantId</i> value to
     *         revoke a grant.
     */
    public String getGrantId() {
        return grantId;
    }
    
    /**
     * Unique grant identifier. You can use the <i>GrantId</i> value to
     * revoke a grant.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId Unique grant identifier. You can use the <i>GrantId</i> value to
     *         revoke a grant.
     */
    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }
    
    /**
     * Unique grant identifier. You can use the <i>GrantId</i> value to
     * revoke a grant.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param grantId Unique grant identifier. You can use the <i>GrantId</i> value to
     *         revoke a grant.
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
    