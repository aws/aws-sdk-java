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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#deleteArchive(DeleteArchiveRequest) DeleteArchive operation}.
 * <p>
 * This operation deletes an archive from a vault. Subsequent requests to initiate a retrieval of this archive will fail. Archive retrievals that are in
 * progress for this archive ID may or may not succeed according to the following scenarios:
 * </p>
 * 
 * <ul>
 * <li>If the archive retrieval job is actively preparing the data for download when Amazon Glacier receives the delete archive request, the archival
 * retrieval operation might fail. </li>
 * <li>If the archive retrieval job has successfully prepared the archive for download when Amazon Glacier receives the delete archive request, you will
 * be able to download the output. </li>
 * 
 * </ul>
 * <p>
 * This operation is idempotent. Attempting to delete an already-deleted archive does not result in an error.
 * </p>
 * <p>
 * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any
 * permissions by default. You must grant them explicit permission to perform specific actions. For more information, see <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html"> Access Control Using AWS Identity and Access
 * Management (IAM) </a> .
 * </p>
 * <p>
 * For conceptual information and underlying REST API, go to <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/deleting-an-archive.html"> Deleting an Archive in Amazon Glacier </a> and <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/api-archive-delete.html"> Delete Archive </a> in the <i>Amazon Glacier Developer
 * Guide</i> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#deleteArchive(DeleteArchiveRequest)
 */
public class DeleteArchiveRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     */
    private String accountId;

    /**
     * The name of the vault.
     */
    private String vaultName;

    /**
     * The ID of the archive to delete.
     */
    private String archiveId;

    /**
     * Default constructor for a new DeleteArchiveRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteArchiveRequest() {}
    
    /**
     * Constructs a new DeleteArchiveRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName The name of the vault.
     * @param archiveId The ID of the archive to delete.
     */
    public DeleteArchiveRequest(String vaultName, String archiveId) {
        setVaultName(vaultName);
        setArchiveId(archiveId);
    }

    /**
     * Constructs a new DeleteArchiveRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You
     * can specify either the AWS Account ID or optionally a '-', in which
     * case Amazon Glacier uses the AWS Account ID associated with the
     * credentials used to sign the request. If you specify your Account ID,
     * do not include hyphens in it.
     * @param vaultName The name of the vault.
     * @param archiveId The ID of the archive to delete.
     */
    public DeleteArchiveRequest(String accountId, String vaultName, String archiveId) {
        setAccountId(accountId);
        setVaultName(vaultName);
        setArchiveId(archiveId);
    }

    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     *
     * @return The <code>AccountId</code> is the AWS Account ID. You can specify
     *         either the AWS Account ID or optionally a '-', in which case Amazon
     *         Glacier uses the AWS Account ID associated with the credentials used
     *         to sign the request. If you specify your Account ID, do not include
     *         hyphens in it.
     */
    public String getAccountId() {
        return accountId;
    }
    
    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     *
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You can specify
     *         either the AWS Account ID or optionally a '-', in which case Amazon
     *         Glacier uses the AWS Account ID associated with the credentials used
     *         to sign the request. If you specify your Account ID, do not include
     *         hyphens in it.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You can specify
     *         either the AWS Account ID or optionally a '-', in which case Amazon
     *         Glacier uses the AWS Account ID associated with the credentials used
     *         to sign the request. If you specify your Account ID, do not include
     *         hyphens in it.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteArchiveRequest withAccountId(String accountId) {
        this.accountId = accountId;
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
    public DeleteArchiveRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * The ID of the archive to delete.
     *
     * @return The ID of the archive to delete.
     */
    public String getArchiveId() {
        return archiveId;
    }
    
    /**
     * The ID of the archive to delete.
     *
     * @param archiveId The ID of the archive to delete.
     */
    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }
    
    /**
     * The ID of the archive to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param archiveId The ID of the archive to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteArchiveRequest withArchiveId(String archiveId) {
        this.archiveId = archiveId;
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
        if (getVaultName() != null) sb.append("VaultName: " + getVaultName() + ",");
        if (getArchiveId() != null) sb.append("ArchiveId: " + getArchiveId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode()); 
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode()); 
        hashCode = prime * hashCode + ((getArchiveId() == null) ? 0 : getArchiveId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteArchiveRequest == false) return false;
        DeleteArchiveRequest other = (DeleteArchiveRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getArchiveId() == null ^ this.getArchiveId() == null) return false;
        if (other.getArchiveId() != null && other.getArchiveId().equals(this.getArchiveId()) == false) return false; 
        return true;
    }
    
}
    