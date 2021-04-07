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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DisassociateFileSystem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateFileSystemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system association to be deleted.
     * </p>
     */
    private String fileSystemAssociationARN;
    /**
     * <p>
     * If this value is set to true, the operation disassociates an Amazon FSx file system immediately. It ends all data
     * uploads to the file system, and the file system association enters the <code>FORCE_DELETING</code> status. If
     * this value is set to false, the Amazon FSx file system does not disassociate until all data is uploaded.
     * </p>
     */
    private Boolean forceDelete;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system association to be deleted.
     * </p>
     * 
     * @param fileSystemAssociationARN
     *        The Amazon Resource Name (ARN) of the file system association to be deleted.
     */

    public void setFileSystemAssociationARN(String fileSystemAssociationARN) {
        this.fileSystemAssociationARN = fileSystemAssociationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system association to be deleted.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the file system association to be deleted.
     */

    public String getFileSystemAssociationARN() {
        return this.fileSystemAssociationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system association to be deleted.
     * </p>
     * 
     * @param fileSystemAssociationARN
     *        The Amazon Resource Name (ARN) of the file system association to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateFileSystemRequest withFileSystemAssociationARN(String fileSystemAssociationARN) {
        setFileSystemAssociationARN(fileSystemAssociationARN);
        return this;
    }

    /**
     * <p>
     * If this value is set to true, the operation disassociates an Amazon FSx file system immediately. It ends all data
     * uploads to the file system, and the file system association enters the <code>FORCE_DELETING</code> status. If
     * this value is set to false, the Amazon FSx file system does not disassociate until all data is uploaded.
     * </p>
     * 
     * @param forceDelete
     *        If this value is set to true, the operation disassociates an Amazon FSx file system immediately. It ends
     *        all data uploads to the file system, and the file system association enters the
     *        <code>FORCE_DELETING</code> status. If this value is set to false, the Amazon FSx file system does not
     *        disassociate until all data is uploaded.
     */

    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * If this value is set to true, the operation disassociates an Amazon FSx file system immediately. It ends all data
     * uploads to the file system, and the file system association enters the <code>FORCE_DELETING</code> status. If
     * this value is set to false, the Amazon FSx file system does not disassociate until all data is uploaded.
     * </p>
     * 
     * @return If this value is set to true, the operation disassociates an Amazon FSx file system immediately. It ends
     *         all data uploads to the file system, and the file system association enters the
     *         <code>FORCE_DELETING</code> status. If this value is set to false, the Amazon FSx file system does not
     *         disassociate until all data is uploaded.
     */

    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    /**
     * <p>
     * If this value is set to true, the operation disassociates an Amazon FSx file system immediately. It ends all data
     * uploads to the file system, and the file system association enters the <code>FORCE_DELETING</code> status. If
     * this value is set to false, the Amazon FSx file system does not disassociate until all data is uploaded.
     * </p>
     * 
     * @param forceDelete
     *        If this value is set to true, the operation disassociates an Amazon FSx file system immediately. It ends
     *        all data uploads to the file system, and the file system association enters the
     *        <code>FORCE_DELETING</code> status. If this value is set to false, the Amazon FSx file system does not
     *        disassociate until all data is uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateFileSystemRequest withForceDelete(Boolean forceDelete) {
        setForceDelete(forceDelete);
        return this;
    }

    /**
     * <p>
     * If this value is set to true, the operation disassociates an Amazon FSx file system immediately. It ends all data
     * uploads to the file system, and the file system association enters the <code>FORCE_DELETING</code> status. If
     * this value is set to false, the Amazon FSx file system does not disassociate until all data is uploaded.
     * </p>
     * 
     * @return If this value is set to true, the operation disassociates an Amazon FSx file system immediately. It ends
     *         all data uploads to the file system, and the file system association enters the
     *         <code>FORCE_DELETING</code> status. If this value is set to false, the Amazon FSx file system does not
     *         disassociate until all data is uploaded.
     */

    public Boolean isForceDelete() {
        return this.forceDelete;
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
        if (getForceDelete() != null)
            sb.append("ForceDelete: ").append(getForceDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateFileSystemRequest == false)
            return false;
        DisassociateFileSystemRequest other = (DisassociateFileSystemRequest) obj;
        if (other.getFileSystemAssociationARN() == null ^ this.getFileSystemAssociationARN() == null)
            return false;
        if (other.getFileSystemAssociationARN() != null && other.getFileSystemAssociationARN().equals(this.getFileSystemAssociationARN()) == false)
            return false;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null && other.getForceDelete().equals(this.getForceDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemAssociationARN() == null) ? 0 : getFileSystemAssociationARN().hashCode());
        hashCode = prime * hashCode + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateFileSystemRequest clone() {
        return (DisassociateFileSystemRequest) super.clone();
    }

}
