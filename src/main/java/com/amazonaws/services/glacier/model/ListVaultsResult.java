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
package com.amazonaws.services.glacier.model;

/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
public class ListVaultsResult {

    /**
     * List of vaults.
     */
    private java.util.List<DescribeVaultOutput> vaultList;

    /**
     * The vault ARN at which to continue pagination of the results. You use
     * the marker in another List Vaults request to obtain more vaults in the
     * list.
     */
    private String marker;

    /**
     * List of vaults.
     *
     * @return List of vaults.
     */
    public java.util.List<DescribeVaultOutput> getVaultList() {
        
        if (vaultList == null) {
            vaultList = new java.util.ArrayList<DescribeVaultOutput>();
        }
        return vaultList;
    }
    
    /**
     * List of vaults.
     *
     * @param vaultList List of vaults.
     */
    public void setVaultList(java.util.Collection<DescribeVaultOutput> vaultList) {
        if (vaultList == null) {
            this.vaultList = null;
            return;
        }

        java.util.List<DescribeVaultOutput> vaultListCopy = new java.util.ArrayList<DescribeVaultOutput>(vaultList.size());
        vaultListCopy.addAll(vaultList);
        this.vaultList = vaultListCopy;
    }
    
    /**
     * List of vaults.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vaultList List of vaults.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListVaultsResult withVaultList(DescribeVaultOutput... vaultList) {
        if (getVaultList() == null) setVaultList(new java.util.ArrayList<DescribeVaultOutput>(vaultList.length));
        for (DescribeVaultOutput value : vaultList) {
            getVaultList().add(value);
        }
        return this;
    }
    
    /**
     * List of vaults.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vaultList List of vaults.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListVaultsResult withVaultList(java.util.Collection<DescribeVaultOutput> vaultList) {
        if (vaultList == null) {
            this.vaultList = null;
        } else {
            java.util.List<DescribeVaultOutput> vaultListCopy = new java.util.ArrayList<DescribeVaultOutput>(vaultList.size());
            vaultListCopy.addAll(vaultList);
            this.vaultList = vaultListCopy;
        }

        return this;
    }
    
    /**
     * The vault ARN at which to continue pagination of the results. You use
     * the marker in another List Vaults request to obtain more vaults in the
     * list.
     *
     * @return The vault ARN at which to continue pagination of the results. You use
     *         the marker in another List Vaults request to obtain more vaults in the
     *         list.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The vault ARN at which to continue pagination of the results. You use
     * the marker in another List Vaults request to obtain more vaults in the
     * list.
     *
     * @param marker The vault ARN at which to continue pagination of the results. You use
     *         the marker in another List Vaults request to obtain more vaults in the
     *         list.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The vault ARN at which to continue pagination of the results. You use
     * the marker in another List Vaults request to obtain more vaults in the
     * list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The vault ARN at which to continue pagination of the results. You use
     *         the marker in another List Vaults request to obtain more vaults in the
     *         list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListVaultsResult withMarker(String marker) {
        this.marker = marker;
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
        if (vaultList != null) sb.append("VaultList: " + vaultList + ", ");
        if (marker != null) sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVaultList() == null) ? 0 : getVaultList().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ListVaultsResult == false) return false;
        ListVaultsResult other = (ListVaultsResult)obj;
        
        if (other.getVaultList() == null ^ this.getVaultList() == null) return false;
        if (other.getVaultList() != null && other.getVaultList().equals(this.getVaultList()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    