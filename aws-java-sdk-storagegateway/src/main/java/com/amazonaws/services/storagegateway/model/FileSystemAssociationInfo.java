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
 * Describes the object returned by <code>DescribeFileSystemAssociations</code> that describes a created file system
 * association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/FileSystemAssociationInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileSystemAssociationInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system association.
     * </p>
     */
    private String fileSystemAssociationARN;
    /**
     * <p>
     * The ARN of the backend Amazon FSx file system used for storing file data. For information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_FileSystem.html">FileSystem</a> in the <i>Amazon
     * FSx API Reference</i>.
     * </p>
     */
    private String locationARN;
    /**
     * <p>
     * The status of the file system association. Valid Values: <code>AVAILABLE</code> | <code>CREATING</code> |
     * <code>DELETING</code> | <code>FORCE_DELETING</code> | <code>UPDATING</code> | <code>ERROR</code>
     * </p>
     */
    private String fileSystemAssociationStatus;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * </p>
     */
    private String auditDestinationARN;

    private String gatewayARN;
    /**
     * <p>
     * A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     * key-value pair.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    private CacheAttributes cacheAttributes;
    /**
     * <p>
     * Specifies network configuration information for the gateway associated with the Amazon FSx file system.
     * </p>
     * <note>
     * <p>
     * If multiple file systems are associated with this gateway, this parameter's <code>IpAddresses</code> field is
     * required.
     * </p>
     * </note>
     */
    private EndpointNetworkConfiguration endpointNetworkConfiguration;

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

    public FileSystemAssociationInfo withFileSystemAssociationARN(String fileSystemAssociationARN) {
        setFileSystemAssociationARN(fileSystemAssociationARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the backend Amazon FSx file system used for storing file data. For information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_FileSystem.html">FileSystem</a> in the <i>Amazon
     * FSx API Reference</i>.
     * </p>
     * 
     * @param locationARN
     *        The ARN of the backend Amazon FSx file system used for storing file data. For information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_FileSystem.html">FileSystem</a> in the
     *        <i>Amazon FSx API Reference</i>.
     */

    public void setLocationARN(String locationARN) {
        this.locationARN = locationARN;
    }

    /**
     * <p>
     * The ARN of the backend Amazon FSx file system used for storing file data. For information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_FileSystem.html">FileSystem</a> in the <i>Amazon
     * FSx API Reference</i>.
     * </p>
     * 
     * @return The ARN of the backend Amazon FSx file system used for storing file data. For information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_FileSystem.html">FileSystem</a> in the
     *         <i>Amazon FSx API Reference</i>.
     */

    public String getLocationARN() {
        return this.locationARN;
    }

    /**
     * <p>
     * The ARN of the backend Amazon FSx file system used for storing file data. For information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_FileSystem.html">FileSystem</a> in the <i>Amazon
     * FSx API Reference</i>.
     * </p>
     * 
     * @param locationARN
     *        The ARN of the backend Amazon FSx file system used for storing file data. For information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_FileSystem.html">FileSystem</a> in the
     *        <i>Amazon FSx API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemAssociationInfo withLocationARN(String locationARN) {
        setLocationARN(locationARN);
        return this;
    }

    /**
     * <p>
     * The status of the file system association. Valid Values: <code>AVAILABLE</code> | <code>CREATING</code> |
     * <code>DELETING</code> | <code>FORCE_DELETING</code> | <code>UPDATING</code> | <code>ERROR</code>
     * </p>
     * 
     * @param fileSystemAssociationStatus
     *        The status of the file system association. Valid Values: <code>AVAILABLE</code> | <code>CREATING</code> |
     *        <code>DELETING</code> | <code>FORCE_DELETING</code> | <code>UPDATING</code> | <code>ERROR</code>
     */

    public void setFileSystemAssociationStatus(String fileSystemAssociationStatus) {
        this.fileSystemAssociationStatus = fileSystemAssociationStatus;
    }

    /**
     * <p>
     * The status of the file system association. Valid Values: <code>AVAILABLE</code> | <code>CREATING</code> |
     * <code>DELETING</code> | <code>FORCE_DELETING</code> | <code>UPDATING</code> | <code>ERROR</code>
     * </p>
     * 
     * @return The status of the file system association. Valid Values: <code>AVAILABLE</code> | <code>CREATING</code> |
     *         <code>DELETING</code> | <code>FORCE_DELETING</code> | <code>UPDATING</code> | <code>ERROR</code>
     */

    public String getFileSystemAssociationStatus() {
        return this.fileSystemAssociationStatus;
    }

    /**
     * <p>
     * The status of the file system association. Valid Values: <code>AVAILABLE</code> | <code>CREATING</code> |
     * <code>DELETING</code> | <code>FORCE_DELETING</code> | <code>UPDATING</code> | <code>ERROR</code>
     * </p>
     * 
     * @param fileSystemAssociationStatus
     *        The status of the file system association. Valid Values: <code>AVAILABLE</code> | <code>CREATING</code> |
     *        <code>DELETING</code> | <code>FORCE_DELETING</code> | <code>UPDATING</code> | <code>ERROR</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemAssociationInfo withFileSystemAssociationStatus(String fileSystemAssociationStatus) {
        setFileSystemAssociationStatus(fileSystemAssociationStatus);
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

    public FileSystemAssociationInfo withAuditDestinationARN(String auditDestinationARN) {
        setAuditDestinationARN(auditDestinationARN);
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

    public FileSystemAssociationInfo withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     * key-value pair.
     * </p>
     * 
     * @return A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     *         key-value pair.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     * key-value pair.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     *        key-value pair.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     * key-value pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     *        key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemAssociationInfo withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     * key-value pair.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags assigned to the SMB file share, sorted alphabetically by key name. Each tag is a
     *        key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemAssociationInfo withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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

    public FileSystemAssociationInfo withCacheAttributes(CacheAttributes cacheAttributes) {
        setCacheAttributes(cacheAttributes);
        return this;
    }

    /**
     * <p>
     * Specifies network configuration information for the gateway associated with the Amazon FSx file system.
     * </p>
     * <note>
     * <p>
     * If multiple file systems are associated with this gateway, this parameter's <code>IpAddresses</code> field is
     * required.
     * </p>
     * </note>
     * 
     * @param endpointNetworkConfiguration
     *        Specifies network configuration information for the gateway associated with the Amazon FSx file
     *        system.</p> <note>
     *        <p>
     *        If multiple file systems are associated with this gateway, this parameter's <code>IpAddresses</code> field
     *        is required.
     *        </p>
     */

    public void setEndpointNetworkConfiguration(EndpointNetworkConfiguration endpointNetworkConfiguration) {
        this.endpointNetworkConfiguration = endpointNetworkConfiguration;
    }

    /**
     * <p>
     * Specifies network configuration information for the gateway associated with the Amazon FSx file system.
     * </p>
     * <note>
     * <p>
     * If multiple file systems are associated with this gateway, this parameter's <code>IpAddresses</code> field is
     * required.
     * </p>
     * </note>
     * 
     * @return Specifies network configuration information for the gateway associated with the Amazon FSx file
     *         system.</p> <note>
     *         <p>
     *         If multiple file systems are associated with this gateway, this parameter's <code>IpAddresses</code>
     *         field is required.
     *         </p>
     */

    public EndpointNetworkConfiguration getEndpointNetworkConfiguration() {
        return this.endpointNetworkConfiguration;
    }

    /**
     * <p>
     * Specifies network configuration information for the gateway associated with the Amazon FSx file system.
     * </p>
     * <note>
     * <p>
     * If multiple file systems are associated with this gateway, this parameter's <code>IpAddresses</code> field is
     * required.
     * </p>
     * </note>
     * 
     * @param endpointNetworkConfiguration
     *        Specifies network configuration information for the gateway associated with the Amazon FSx file
     *        system.</p> <note>
     *        <p>
     *        If multiple file systems are associated with this gateway, this parameter's <code>IpAddresses</code> field
     *        is required.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemAssociationInfo withEndpointNetworkConfiguration(EndpointNetworkConfiguration endpointNetworkConfiguration) {
        setEndpointNetworkConfiguration(endpointNetworkConfiguration);
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
        if (getLocationARN() != null)
            sb.append("LocationARN: ").append(getLocationARN()).append(",");
        if (getFileSystemAssociationStatus() != null)
            sb.append("FileSystemAssociationStatus: ").append(getFileSystemAssociationStatus()).append(",");
        if (getAuditDestinationARN() != null)
            sb.append("AuditDestinationARN: ").append(getAuditDestinationARN()).append(",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCacheAttributes() != null)
            sb.append("CacheAttributes: ").append(getCacheAttributes()).append(",");
        if (getEndpointNetworkConfiguration() != null)
            sb.append("EndpointNetworkConfiguration: ").append(getEndpointNetworkConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSystemAssociationInfo == false)
            return false;
        FileSystemAssociationInfo other = (FileSystemAssociationInfo) obj;
        if (other.getFileSystemAssociationARN() == null ^ this.getFileSystemAssociationARN() == null)
            return false;
        if (other.getFileSystemAssociationARN() != null && other.getFileSystemAssociationARN().equals(this.getFileSystemAssociationARN()) == false)
            return false;
        if (other.getLocationARN() == null ^ this.getLocationARN() == null)
            return false;
        if (other.getLocationARN() != null && other.getLocationARN().equals(this.getLocationARN()) == false)
            return false;
        if (other.getFileSystemAssociationStatus() == null ^ this.getFileSystemAssociationStatus() == null)
            return false;
        if (other.getFileSystemAssociationStatus() != null && other.getFileSystemAssociationStatus().equals(this.getFileSystemAssociationStatus()) == false)
            return false;
        if (other.getAuditDestinationARN() == null ^ this.getAuditDestinationARN() == null)
            return false;
        if (other.getAuditDestinationARN() != null && other.getAuditDestinationARN().equals(this.getAuditDestinationARN()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCacheAttributes() == null ^ this.getCacheAttributes() == null)
            return false;
        if (other.getCacheAttributes() != null && other.getCacheAttributes().equals(this.getCacheAttributes()) == false)
            return false;
        if (other.getEndpointNetworkConfiguration() == null ^ this.getEndpointNetworkConfiguration() == null)
            return false;
        if (other.getEndpointNetworkConfiguration() != null && other.getEndpointNetworkConfiguration().equals(this.getEndpointNetworkConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemAssociationARN() == null) ? 0 : getFileSystemAssociationARN().hashCode());
        hashCode = prime * hashCode + ((getLocationARN() == null) ? 0 : getLocationARN().hashCode());
        hashCode = prime * hashCode + ((getFileSystemAssociationStatus() == null) ? 0 : getFileSystemAssociationStatus().hashCode());
        hashCode = prime * hashCode + ((getAuditDestinationARN() == null) ? 0 : getAuditDestinationARN().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCacheAttributes() == null) ? 0 : getCacheAttributes().hashCode());
        hashCode = prime * hashCode + ((getEndpointNetworkConfiguration() == null) ? 0 : getEndpointNetworkConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public FileSystemAssociationInfo clone() {
        try {
            return (FileSystemAssociationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.FileSystemAssociationInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
