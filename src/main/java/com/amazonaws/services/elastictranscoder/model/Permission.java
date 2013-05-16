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
package com.amazonaws.services.elastictranscoder.model;
import java.io.Serializable;

/**
 * 
 */
public class Permission  implements Serializable  {

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Canonical$)|(^Email$)|(^Group$)<br/>
     */
    private String granteeType;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String grantee;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     */
    private java.util.List<String> access;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Canonical$)|(^Email$)|(^Group$)<br/>
     *
     * @return 
     */
    public String getGranteeType() {
        return granteeType;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Canonical$)|(^Email$)|(^Group$)<br/>
     *
     * @param granteeType 
     */
    public void setGranteeType(String granteeType) {
        this.granteeType = granteeType;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^Canonical$)|(^Email$)|(^Group$)<br/>
     *
     * @param granteeType 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Permission withGranteeType(String granteeType) {
        this.granteeType = granteeType;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return 
     */
    public String getGrantee() {
        return grantee;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param grantee 
     */
    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param grantee 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Permission withGrantee(String grantee) {
        this.grantee = grantee;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @return 
     */
    public java.util.List<String> getAccess() {
        
        if (access == null) {
            access = new java.util.ArrayList<String>();
        }
        return access;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param access 
     */
    public void setAccess(java.util.Collection<String> access) {
        if (access == null) {
            this.access = null;
            return;
        }

        java.util.List<String> accessCopy = new java.util.ArrayList<String>(access.size());
        accessCopy.addAll(access);
        this.access = accessCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param access 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Permission withAccess(String... access) {
        if (getAccess() == null) setAccess(new java.util.ArrayList<String>(access.length));
        for (String value : access) {
            getAccess().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 30<br/>
     *
     * @param access 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Permission withAccess(java.util.Collection<String> access) {
        if (access == null) {
            this.access = null;
        } else {
            java.util.List<String> accessCopy = new java.util.ArrayList<String>(access.size());
            accessCopy.addAll(access);
            this.access = accessCopy;
        }

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
        if (getGranteeType() != null) sb.append("GranteeType: " + getGranteeType() + ",");    	
        if (getGrantee() != null) sb.append("Grantee: " + getGrantee() + ",");    	
        if (getAccess() != null) sb.append("Access: " + getAccess() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGranteeType() == null) ? 0 : getGranteeType().hashCode()); 
        hashCode = prime * hashCode + ((getGrantee() == null) ? 0 : getGrantee().hashCode()); 
        hashCode = prime * hashCode + ((getAccess() == null) ? 0 : getAccess().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Permission == false) return false;
        Permission other = (Permission)obj;
        
        if (other.getGranteeType() == null ^ this.getGranteeType() == null) return false;
        if (other.getGranteeType() != null && other.getGranteeType().equals(this.getGranteeType()) == false) return false; 
        if (other.getGrantee() == null ^ this.getGrantee() == null) return false;
        if (other.getGrantee() != null && other.getGrantee().equals(this.getGrantee()) == false) return false; 
        if (other.getAccess() == null ^ this.getAccess() == null) return false;
        if (other.getAccess() != null && other.getAccess().equals(this.getAccess()) == false) return false; 
        return true;
    }
    
}
    