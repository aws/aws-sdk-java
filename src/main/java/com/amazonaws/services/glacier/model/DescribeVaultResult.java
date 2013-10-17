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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
public class DescribeVaultResult implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the vault.
     */
    private String vaultARN;

    /**
     * The name of the vault.
     */
    private String vaultName;

    /**
     * The UTC date when the vault was created. A string representation of
     * ISO 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     */
    private String creationDate;

    /**
     * The UTC date when Amazon Glacier completed the last vault inventory. A
     * string representation of ISO 8601 date format, for example,
     * "2012-03-20T17:03:43.221Z".
     */
    private String lastInventoryDate;

    /**
     * The number of archives in the vault as of the last inventory date.
     * This field will return <code>null</code> if an inventory has not yet
     * run on the vault, for example, if you just created the vault.
     */
    private Long numberOfArchives;

    /**
     * Total size, in bytes, of the archives in the vault as of the last
     * inventory date. This field will return null if an inventory has not
     * yet run on the vault, for example, if you just created the vault.
     */
    private Long sizeInBytes;

    /**
     * The Amazon Resource Name (ARN) of the vault.
     *
     * @return The Amazon Resource Name (ARN) of the vault.
     */
    public String getVaultARN() {
        return vaultARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the vault.
     *
     * @param vaultARN The Amazon Resource Name (ARN) of the vault.
     */
    public void setVaultARN(String vaultARN) {
        this.vaultARN = vaultARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the vault.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vaultARN The Amazon Resource Name (ARN) of the vault.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVaultResult withVaultARN(String vaultARN) {
        this.vaultARN = vaultARN;
        return this;
    }

    /**
     * The name of the vault.
     *
     * @return The name of the vault.
     */
    public String getVaultName() {
        return vaultName;
    }
    
    /**
     * The name of the vault.
     *
     * @param vaultName The name of the vault.
     */
    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }
    
    /**
     * The name of the vault.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vaultName The name of the vault.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVaultResult withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * The UTC date when the vault was created. A string representation of
     * ISO 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     *
     * @return The UTC date when the vault was created. A string representation of
     *         ISO 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     */
    public String getCreationDate() {
        return creationDate;
    }
    
    /**
     * The UTC date when the vault was created. A string representation of
     * ISO 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     *
     * @param creationDate The UTC date when the vault was created. A string representation of
     *         ISO 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * The UTC date when the vault was created. A string representation of
     * ISO 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate The UTC date when the vault was created. A string representation of
     *         ISO 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVaultResult withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * The UTC date when Amazon Glacier completed the last vault inventory. A
     * string representation of ISO 8601 date format, for example,
     * "2012-03-20T17:03:43.221Z".
     *
     * @return The UTC date when Amazon Glacier completed the last vault inventory. A
     *         string representation of ISO 8601 date format, for example,
     *         "2012-03-20T17:03:43.221Z".
     */
    public String getLastInventoryDate() {
        return lastInventoryDate;
    }
    
    /**
     * The UTC date when Amazon Glacier completed the last vault inventory. A
     * string representation of ISO 8601 date format, for example,
     * "2012-03-20T17:03:43.221Z".
     *
     * @param lastInventoryDate The UTC date when Amazon Glacier completed the last vault inventory. A
     *         string representation of ISO 8601 date format, for example,
     *         "2012-03-20T17:03:43.221Z".
     */
    public void setLastInventoryDate(String lastInventoryDate) {
        this.lastInventoryDate = lastInventoryDate;
    }
    
    /**
     * The UTC date when Amazon Glacier completed the last vault inventory. A
     * string representation of ISO 8601 date format, for example,
     * "2012-03-20T17:03:43.221Z".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastInventoryDate The UTC date when Amazon Glacier completed the last vault inventory. A
     *         string representation of ISO 8601 date format, for example,
     *         "2012-03-20T17:03:43.221Z".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVaultResult withLastInventoryDate(String lastInventoryDate) {
        this.lastInventoryDate = lastInventoryDate;
        return this;
    }

    /**
     * The number of archives in the vault as of the last inventory date.
     * This field will return <code>null</code> if an inventory has not yet
     * run on the vault, for example, if you just created the vault.
     *
     * @return The number of archives in the vault as of the last inventory date.
     *         This field will return <code>null</code> if an inventory has not yet
     *         run on the vault, for example, if you just created the vault.
     */
    public Long getNumberOfArchives() {
        return numberOfArchives;
    }
    
    /**
     * The number of archives in the vault as of the last inventory date.
     * This field will return <code>null</code> if an inventory has not yet
     * run on the vault, for example, if you just created the vault.
     *
     * @param numberOfArchives The number of archives in the vault as of the last inventory date.
     *         This field will return <code>null</code> if an inventory has not yet
     *         run on the vault, for example, if you just created the vault.
     */
    public void setNumberOfArchives(Long numberOfArchives) {
        this.numberOfArchives = numberOfArchives;
    }
    
    /**
     * The number of archives in the vault as of the last inventory date.
     * This field will return <code>null</code> if an inventory has not yet
     * run on the vault, for example, if you just created the vault.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numberOfArchives The number of archives in the vault as of the last inventory date.
     *         This field will return <code>null</code> if an inventory has not yet
     *         run on the vault, for example, if you just created the vault.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVaultResult withNumberOfArchives(Long numberOfArchives) {
        this.numberOfArchives = numberOfArchives;
        return this;
    }

    /**
     * Total size, in bytes, of the archives in the vault as of the last
     * inventory date. This field will return null if an inventory has not
     * yet run on the vault, for example, if you just created the vault.
     *
     * @return Total size, in bytes, of the archives in the vault as of the last
     *         inventory date. This field will return null if an inventory has not
     *         yet run on the vault, for example, if you just created the vault.
     */
    public Long getSizeInBytes() {
        return sizeInBytes;
    }
    
    /**
     * Total size, in bytes, of the archives in the vault as of the last
     * inventory date. This field will return null if an inventory has not
     * yet run on the vault, for example, if you just created the vault.
     *
     * @param sizeInBytes Total size, in bytes, of the archives in the vault as of the last
     *         inventory date. This field will return null if an inventory has not
     *         yet run on the vault, for example, if you just created the vault.
     */
    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }
    
    /**
     * Total size, in bytes, of the archives in the vault as of the last
     * inventory date. This field will return null if an inventory has not
     * yet run on the vault, for example, if you just created the vault.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sizeInBytes Total size, in bytes, of the archives in the vault as of the last
     *         inventory date. This field will return null if an inventory has not
     *         yet run on the vault, for example, if you just created the vault.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeVaultResult withSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
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
        if (getVaultARN() != null) sb.append("VaultARN: " + getVaultARN() + ",");
        if (getVaultName() != null) sb.append("VaultName: " + getVaultName() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (getLastInventoryDate() != null) sb.append("LastInventoryDate: " + getLastInventoryDate() + ",");
        if (getNumberOfArchives() != null) sb.append("NumberOfArchives: " + getNumberOfArchives() + ",");
        if (getSizeInBytes() != null) sb.append("SizeInBytes: " + getSizeInBytes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVaultARN() == null) ? 0 : getVaultARN().hashCode()); 
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        hashCode = prime * hashCode + ((getLastInventoryDate() == null) ? 0 : getLastInventoryDate().hashCode()); 
        hashCode = prime * hashCode + ((getNumberOfArchives() == null) ? 0 : getNumberOfArchives().hashCode()); 
        hashCode = prime * hashCode + ((getSizeInBytes() == null) ? 0 : getSizeInBytes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVaultResult == false) return false;
        DescribeVaultResult other = (DescribeVaultResult)obj;
        
        if (other.getVaultARN() == null ^ this.getVaultARN() == null) return false;
        if (other.getVaultARN() != null && other.getVaultARN().equals(this.getVaultARN()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        if (other.getLastInventoryDate() == null ^ this.getLastInventoryDate() == null) return false;
        if (other.getLastInventoryDate() != null && other.getLastInventoryDate().equals(this.getLastInventoryDate()) == false) return false; 
        if (other.getNumberOfArchives() == null ^ this.getNumberOfArchives() == null) return false;
        if (other.getNumberOfArchives() != null && other.getNumberOfArchives().equals(this.getNumberOfArchives()) == false) return false; 
        if (other.getSizeInBytes() == null ^ this.getSizeInBytes() == null) return false;
        if (other.getSizeInBytes() != null && other.getSizeInBytes().equals(this.getSizeInBytes()) == false) return false; 
        return true;
    }
    
}
    