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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes prefixes for AWS services.
 * </p>
 */
public class PrefixList implements Serializable, Cloneable {

    /**
     * The ID of the prefix.
     */
    private String prefixListId;

    /**
     * The name of the prefix.
     */
    private String prefixListName;

    /**
     * The IP address range of the AWS service.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> cidrs;

    /**
     * The ID of the prefix.
     *
     * @return The ID of the prefix.
     */
    public String getPrefixListId() {
        return prefixListId;
    }
    
    /**
     * The ID of the prefix.
     *
     * @param prefixListId The ID of the prefix.
     */
    public void setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
    }
    
    /**
     * The ID of the prefix.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param prefixListId The ID of the prefix.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PrefixList withPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
        return this;
    }

    /**
     * The name of the prefix.
     *
     * @return The name of the prefix.
     */
    public String getPrefixListName() {
        return prefixListName;
    }
    
    /**
     * The name of the prefix.
     *
     * @param prefixListName The name of the prefix.
     */
    public void setPrefixListName(String prefixListName) {
        this.prefixListName = prefixListName;
    }
    
    /**
     * The name of the prefix.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param prefixListName The name of the prefix.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PrefixList withPrefixListName(String prefixListName) {
        this.prefixListName = prefixListName;
        return this;
    }

    /**
     * The IP address range of the AWS service.
     *
     * @return The IP address range of the AWS service.
     */
    public java.util.List<String> getCidrs() {
        if (cidrs == null) {
              cidrs = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              cidrs.setAutoConstruct(true);
        }
        return cidrs;
    }
    
    /**
     * The IP address range of the AWS service.
     *
     * @param cidrs The IP address range of the AWS service.
     */
    public void setCidrs(java.util.Collection<String> cidrs) {
        if (cidrs == null) {
            this.cidrs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> cidrsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(cidrs.size());
        cidrsCopy.addAll(cidrs);
        this.cidrs = cidrsCopy;
    }
    
    /**
     * The IP address range of the AWS service.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCidrs(java.util.Collection)} or {@link
     * #withCidrs(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrs The IP address range of the AWS service.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PrefixList withCidrs(String... cidrs) {
        if (getCidrs() == null) setCidrs(new java.util.ArrayList<String>(cidrs.length));
        for (String value : cidrs) {
            getCidrs().add(value);
        }
        return this;
    }
    
    /**
     * The IP address range of the AWS service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrs The IP address range of the AWS service.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PrefixList withCidrs(java.util.Collection<String> cidrs) {
        if (cidrs == null) {
            this.cidrs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> cidrsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(cidrs.size());
            cidrsCopy.addAll(cidrs);
            this.cidrs = cidrsCopy;
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
        if (getPrefixListId() != null) sb.append("PrefixListId: " + getPrefixListId() + ",");
        if (getPrefixListName() != null) sb.append("PrefixListName: " + getPrefixListName() + ",");
        if (getCidrs() != null) sb.append("Cidrs: " + getCidrs() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode()); 
        hashCode = prime * hashCode + ((getPrefixListName() == null) ? 0 : getPrefixListName().hashCode()); 
        hashCode = prime * hashCode + ((getCidrs() == null) ? 0 : getCidrs().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PrefixList == false) return false;
        PrefixList other = (PrefixList)obj;
        
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null) return false;
        if (other.getPrefixListId() != null && other.getPrefixListId().equals(this.getPrefixListId()) == false) return false; 
        if (other.getPrefixListName() == null ^ this.getPrefixListName() == null) return false;
        if (other.getPrefixListName() != null && other.getPrefixListName().equals(this.getPrefixListName()) == false) return false; 
        if (other.getCidrs() == null ^ this.getCidrs() == null) return false;
        if (other.getCidrs() != null && other.getCidrs().equals(this.getCidrs()) == false) return false; 
        return true;
    }
    
    @Override
    public PrefixList clone() {
        try {
            return (PrefixList) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    