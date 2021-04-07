/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/UpdateFileSystemAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileSystemAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system association that you want to update.
     * </p>
     */
    private String fileSystemAssociationARN;
    /**
     * <p>
     * The user name of the user credential that has permission to access the root share D$ of the Amazon FSx file
     * system. The user account must belong to the Amazon FSx delegated admin user group.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The password of the user credential.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * </p>
     */
    private String auditDestinationARN;

    private CacheAttributes cacheAttributes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system association that you want to update.
     * </p>
     * 
     * @param fileSystemAssociationARN
     *        The Amazon Resource Name (ARN) of the file system association that you want to update.
     */

    public void setFileSystemAssociationARN(String fileSystemAssociationARN) {
        this.fileSystemAssociationARN = fileSystemAssociationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system association that you want to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the file system association that you want to update.
     */

    public String getFileSystemAssociationARN() {
        return this.fileSystemAssociationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system association that you want to update.
     * </p>
     * 
     * @param fileSystemAssociationARN
     *        The Amazon Resource Name (ARN) of the file system association that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemAssociationRequest withFileSystemAssociationARN(String fileSystemAssociationARN) {
        setFileSystemAssociationARN(fileSystemAssociationARN);
        return this;
    }

    /**
     * <p>
     * The user name of the user credential that has permission to access the root share D$ of the Amazon FSx file
     * system. The user account must belong to the Amazon FSx delegated admin user group.
     * </p>
     * 
     * @param userName
     *        The user name of the user credential that has permission to access the root share D$ of the Amazon FSx
     *        file system. The user account must belong to the Amazon FSx delegated admin user group.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user name of the user credential that has permission to access the root share D$ of the Amazon FSx file
     * system. The user account must belong to the Amazon FSx delegated admin user group.
     * </p>
     * 
     * @return The user name of the user credential that has permission to access the root share D$ of the Amazon FSx
     *         file system. The user account must belong to the Amazon FSx delegated admin user group.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The user name of the user credential that has permission to access the root share D$ of the Amazon FSx file
     * system. The user account must belong to the Amazon FSx delegated admin user group.
     * </p>
     * 
     * @param userName
     *        The user name of the user credential that has permission to access the root share D$ of the Amazon FSx
     *        file system. The user account must belong to the Amazon FSx delegated admin user group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemAssociationRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The password of the user credential.
     * </p>
     * 
     * @param password
     *        The password of the user credential.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password of the user credential.
     * </p>
     * 
     * @return The password of the user credential.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password of the user credential.
     * </p>
     * 
     * @param password
     *        The password of the user credential.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemAssociationRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * </p>
     * 
     * @param auditDestinationARN
     *        The Amazon Resource Name (ARN) of the storage used for the audit logs.
     */

    public void setAuditDestinationARN(String auditDestinationARN) {
        this.auditDestinationARN = auditDestinationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the storage used for the audit logs.
     */

    public String getAuditDestinationARN() {
        return this.auditDestinationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * </p>
     * 
     * @param auditDestinationARN
     *        The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemAssociationRequest withAuditDestinationARN(String auditDestinationARN) {
        setAuditDestinationARN(auditDestinationARN);
        return this;
    }

    /**
     * @param cacheAttributes
     */

    public void setCacheAttributes(CacheAttributes cacheAttributes) {
        this.cacheAttributes = cacheAttributes;
    }

    /**
     * @return
     */

    public CacheAttributes getCacheAttributes() {
        return this.cacheAttributes;
    }

    /**
     * @param cacheAttributes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemAssociationRequest withCacheAttributes(CacheAttributes cacheAttributes) {
        setCacheAttributes(cacheAttributes);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFileSystemAssociationARN() != null)
            sb.append("FileSystemAssociationARN: ").append(getFileSystemAssociationARN()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getAuditDestinationARN() != null)
            sb.append("AuditDestinationARN: ").append(getAuditDestinationARN()).append(",");
        if (getCacheAttributes() != null)
            sb.append("CacheAttributes: ").append(getCacheAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemAssociationRequest == false)
            return false;
        UpdateFileSystemAssociationRequest other = (UpdateFileSystemAssociationRequest) obj;
        if (other.getFileSystemAssociationARN() == null ^ this.getFileSystemAssociationARN() == null)
            return false;
        if (other.getFileSystemAssociationARN() != null && other.getFileSystemAssociationARN().equals(this.getFileSystemAssociationARN()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getAuditDestinationARN() == null ^ this.getAuditDestinationARN() == null)
            return false;
        if (other.getAuditDestinationARN() != null && other.getAuditDestinationARN().equals(this.getAuditDestinationARN()) == false)
            return false;
        if (other.getCacheAttributes() == null ^ this.getCacheAttributes() == null)
            return false;
        if (other.getCacheAttributes() != null && other.getCacheAttributes().equals(this.getCacheAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemAssociationARN() == null) ? 0 : getFileSystemAssociationARN().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getAuditDestinationARN() == null) ? 0 : getAuditDestinationARN().hashCode());
        hashCode = prime * hashCode + ((getCacheAttributes() == null) ? 0 : getCacheAttributes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFileSystemAssociationRequest clone() {
        return (UpdateFileSystemAssociationRequest) super.clone();
    }

}
