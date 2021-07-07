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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Gets the summary returned by <code>ListFileSystemAssociation</code>, which is a summary of a created file system
 * association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/FileSystemAssociationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileSystemAssociationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the file system association.
     * </p>
     */
    private String fileSystemAssociationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system association.
     * </p>
     */
    private String fileSystemAssociationARN;
    /**
     * <p>
     * The status of the file share. Valid Values: <code>AVAILABLE</code> | <code>CREATING</code> |
     * <code>DELETING</code> | <code>FORCE_DELETING</code> | <code>UPDATING</code> | <code>ERROR</code>
     * </p>
     */
    private String fileSystemAssociationStatus;

    private String gatewayARN;

    /**
     * <p>
     * The ID of the file system association.
     * </p>
     * 
     * @param fileSystemAssociationId
     *        The ID of the file system association.
     */

    public void setFileSystemAssociationId(String fileSystemAssociationId) {
        this.fileSystemAssociationId = fileSystemAssociationId;
    }

    /**
     * <p>
     * The ID of the file system association.
     * </p>
     * 
     * @return The ID of the file system association.
     */

    public String getFileSystemAssociationId() {
        return this.fileSystemAssociationId;
    }

    /**
     * <p>
     * The ID of the file system association.
     * </p>
     * 
     * @param fileSystemAssociationId
     *        The ID of the file system association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemAssociationSummary withFileSystemAssociationId(String fileSystemAssociationId) {
        setFileSystemAssociationId(fileSystemAssociationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system association.
     * </p>
     * 
     * @param fileSystemAssociationARN
     *        The Amazon Resource Name (ARN) of the file system association.
     */

    public void setFileSystemAssociationARN(String fileSystemAssociationARN) {
        this.fileSystemAssociationARN = fileSystemAssociationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the file system association.
     */

    public String getFileSystemAssociationARN() {
        return this.fileSystemAssociationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system association.
     * </p>
     * 
     * @param fileSystemAssociationARN
     *        The Amazon Resource Name (ARN) of the file system association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemAssociationSummary withFileSystemAssociationARN(String fileSystemAssociationARN) {
        setFileSystemAssociationARN(fileSystemAssociationARN);
        return this;
    }

    /**
     * <p>
     * The status of the file share. Valid Values: <code>AVAILABLE</code> | <code>CREATING</code> |
     * <code>DELETING</code> | <code>FORCE_DELETING</code> | <code>UPDATING</code> | <code>ERROR</code>
     * </p>
     * 
     * @param fileSystemAssociationStatus
     *        The status of the file share. Valid Values: <code>AVAILABLE</code> | <code>CREATING</code> |
     *        <code>DELETING</code> | <code>FORCE_DELETING</code> | <code>UPDATING</code> | <code>ERROR</code>
     */

    public void setFileSystemAssociationStatus(String fileSystemAssociationStatus) {
        this.fileSystemAssociationStatus = fileSystemAssociationStatus;
    }

    /**
     * <p>
     * The status of the file share. Valid Values: <code>AVAILABLE</code> | <code>CREATING</code> |
     * <code>DELETING</code> | <code>FORCE_DELETING</code> | <code>UPDATING</code> | <code>ERROR</code>
     * </p>
     * 
     * @return The status of the file share. Valid Values: <code>AVAILABLE</code> | <code>CREATING</code> |
     *         <code>DELETING</code> | <code>FORCE_DELETING</code> | <code>UPDATING</code> | <code>ERROR</code>
     */

    public String getFileSystemAssociationStatus() {
        return this.fileSystemAssociationStatus;
    }

    /**
     * <p>
     * The status of the file share. Valid Values: <code>AVAILABLE</code> | <code>CREATING</code> |
     * <code>DELETING</code> | <code>FORCE_DELETING</code> | <code>UPDATING</code> | <code>ERROR</code>
     * </p>
     * 
     * @param fileSystemAssociationStatus
     *        The status of the file share. Valid Values: <code>AVAILABLE</code> | <code>CREATING</code> |
     *        <code>DELETING</code> | <code>FORCE_DELETING</code> | <code>UPDATING</code> | <code>ERROR</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemAssociationSummary withFileSystemAssociationStatus(String fileSystemAssociationStatus) {
        setFileSystemAssociationStatus(fileSystemAssociationStatus);
        return this;
    }

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemAssociationSummary withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
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
        if (getFileSystemAssociationId() != null)
            sb.append("FileSystemAssociationId: ").append(getFileSystemAssociationId()).append(",");
        if (getFileSystemAssociationARN() != null)
            sb.append("FileSystemAssociationARN: ").append(getFileSystemAssociationARN()).append(",");
        if (getFileSystemAssociationStatus() != null)
            sb.append("FileSystemAssociationStatus: ").append(getFileSystemAssociationStatus()).append(",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSystemAssociationSummary == false)
            return false;
        FileSystemAssociationSummary other = (FileSystemAssociationSummary) obj;
        if (other.getFileSystemAssociationId() == null ^ this.getFileSystemAssociationId() == null)
            return false;
        if (other.getFileSystemAssociationId() != null && other.getFileSystemAssociationId().equals(this.getFileSystemAssociationId()) == false)
            return false;
        if (other.getFileSystemAssociationARN() == null ^ this.getFileSystemAssociationARN() == null)
            return false;
        if (other.getFileSystemAssociationARN() != null && other.getFileSystemAssociationARN().equals(this.getFileSystemAssociationARN()) == false)
            return false;
        if (other.getFileSystemAssociationStatus() == null ^ this.getFileSystemAssociationStatus() == null)
            return false;
        if (other.getFileSystemAssociationStatus() != null && other.getFileSystemAssociationStatus().equals(this.getFileSystemAssociationStatus()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemAssociationId() == null) ? 0 : getFileSystemAssociationId().hashCode());
        hashCode = prime * hashCode + ((getFileSystemAssociationARN() == null) ? 0 : getFileSystemAssociationARN().hashCode());
        hashCode = prime * hashCode + ((getFileSystemAssociationStatus() == null) ? 0 : getFileSystemAssociationStatus().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        return hashCode;
    }

    @Override
    public FileSystemAssociationSummary clone() {
        try {
            return (FileSystemAssociationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.FileSystemAssociationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
