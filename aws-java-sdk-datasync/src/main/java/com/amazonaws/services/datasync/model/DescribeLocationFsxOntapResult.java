/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationFsxOntap" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocationFsxOntapResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The time that the location was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The ARN of the FSx for ONTAP file system location.
     * </p>
     */
    private String locationArn;
    /**
     * <p>
     * The uniform resource identifier (URI) of the FSx for ONTAP file system location.
     * </p>
     */
    private String locationUri;

    private FsxProtocol protocol;
    /**
     * <p>
     * The security groups that DataSync uses to access your FSx for ONTAP file system.
     * </p>
     */
    private java.util.List<String> securityGroupArns;
    /**
     * <p>
     * The ARN of the storage virtual machine (SVM) on your FSx for ONTAP file system where you're copying data to or
     * from.
     * </p>
     */
    private String storageVirtualMachineArn;
    /**
     * <p>
     * The ARN of the FSx for ONTAP file system.
     * </p>
     */
    private String fsxFilesystemArn;

    /**
     * <p>
     * The time that the location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the location was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the location was created.
     * </p>
     * 
     * @return The time that the location was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the location was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxOntapResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The ARN of the FSx for ONTAP file system location.
     * </p>
     * 
     * @param locationArn
     *        The ARN of the FSx for ONTAP file system location.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * The ARN of the FSx for ONTAP file system location.
     * </p>
     * 
     * @return The ARN of the FSx for ONTAP file system location.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * The ARN of the FSx for ONTAP file system location.
     * </p>
     * 
     * @param locationArn
     *        The ARN of the FSx for ONTAP file system location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxOntapResult withLocationArn(String locationArn) {
        setLocationArn(locationArn);
        return this;
    }

    /**
     * <p>
     * The uniform resource identifier (URI) of the FSx for ONTAP file system location.
     * </p>
     * 
     * @param locationUri
     *        The uniform resource identifier (URI) of the FSx for ONTAP file system location.
     */

    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * The uniform resource identifier (URI) of the FSx for ONTAP file system location.
     * </p>
     * 
     * @return The uniform resource identifier (URI) of the FSx for ONTAP file system location.
     */

    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * <p>
     * The uniform resource identifier (URI) of the FSx for ONTAP file system location.
     * </p>
     * 
     * @param locationUri
     *        The uniform resource identifier (URI) of the FSx for ONTAP file system location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxOntapResult withLocationUri(String locationUri) {
        setLocationUri(locationUri);
        return this;
    }

    /**
     * @param protocol
     */

    public void setProtocol(FsxProtocol protocol) {
        this.protocol = protocol;
    }

    /**
     * @return
     */

    public FsxProtocol getProtocol() {
        return this.protocol;
    }

    /**
     * @param protocol
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxOntapResult withProtocol(FsxProtocol protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The security groups that DataSync uses to access your FSx for ONTAP file system.
     * </p>
     * 
     * @return The security groups that DataSync uses to access your FSx for ONTAP file system.
     */

    public java.util.List<String> getSecurityGroupArns() {
        return securityGroupArns;
    }

    /**
     * <p>
     * The security groups that DataSync uses to access your FSx for ONTAP file system.
     * </p>
     * 
     * @param securityGroupArns
     *        The security groups that DataSync uses to access your FSx for ONTAP file system.
     */

    public void setSecurityGroupArns(java.util.Collection<String> securityGroupArns) {
        if (securityGroupArns == null) {
            this.securityGroupArns = null;
            return;
        }

        this.securityGroupArns = new java.util.ArrayList<String>(securityGroupArns);
    }

    /**
     * <p>
     * The security groups that DataSync uses to access your FSx for ONTAP file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupArns(java.util.Collection)} or {@link #withSecurityGroupArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityGroupArns
     *        The security groups that DataSync uses to access your FSx for ONTAP file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxOntapResult withSecurityGroupArns(String... securityGroupArns) {
        if (this.securityGroupArns == null) {
            setSecurityGroupArns(new java.util.ArrayList<String>(securityGroupArns.length));
        }
        for (String ele : securityGroupArns) {
            this.securityGroupArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups that DataSync uses to access your FSx for ONTAP file system.
     * </p>
     * 
     * @param securityGroupArns
     *        The security groups that DataSync uses to access your FSx for ONTAP file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxOntapResult withSecurityGroupArns(java.util.Collection<String> securityGroupArns) {
        setSecurityGroupArns(securityGroupArns);
        return this;
    }

    /**
     * <p>
     * The ARN of the storage virtual machine (SVM) on your FSx for ONTAP file system where you're copying data to or
     * from.
     * </p>
     * 
     * @param storageVirtualMachineArn
     *        The ARN of the storage virtual machine (SVM) on your FSx for ONTAP file system where you're copying data
     *        to or from.
     */

    public void setStorageVirtualMachineArn(String storageVirtualMachineArn) {
        this.storageVirtualMachineArn = storageVirtualMachineArn;
    }

    /**
     * <p>
     * The ARN of the storage virtual machine (SVM) on your FSx for ONTAP file system where you're copying data to or
     * from.
     * </p>
     * 
     * @return The ARN of the storage virtual machine (SVM) on your FSx for ONTAP file system where you're copying data
     *         to or from.
     */

    public String getStorageVirtualMachineArn() {
        return this.storageVirtualMachineArn;
    }

    /**
     * <p>
     * The ARN of the storage virtual machine (SVM) on your FSx for ONTAP file system where you're copying data to or
     * from.
     * </p>
     * 
     * @param storageVirtualMachineArn
     *        The ARN of the storage virtual machine (SVM) on your FSx for ONTAP file system where you're copying data
     *        to or from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxOntapResult withStorageVirtualMachineArn(String storageVirtualMachineArn) {
        setStorageVirtualMachineArn(storageVirtualMachineArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the FSx for ONTAP file system.
     * </p>
     * 
     * @param fsxFilesystemArn
     *        The ARN of the FSx for ONTAP file system.
     */

    public void setFsxFilesystemArn(String fsxFilesystemArn) {
        this.fsxFilesystemArn = fsxFilesystemArn;
    }

    /**
     * <p>
     * The ARN of the FSx for ONTAP file system.
     * </p>
     * 
     * @return The ARN of the FSx for ONTAP file system.
     */

    public String getFsxFilesystemArn() {
        return this.fsxFilesystemArn;
    }

    /**
     * <p>
     * The ARN of the FSx for ONTAP file system.
     * </p>
     * 
     * @param fsxFilesystemArn
     *        The ARN of the FSx for ONTAP file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationFsxOntapResult withFsxFilesystemArn(String fsxFilesystemArn) {
        setFsxFilesystemArn(fsxFilesystemArn);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLocationArn() != null)
            sb.append("LocationArn: ").append(getLocationArn()).append(",");
        if (getLocationUri() != null)
            sb.append("LocationUri: ").append(getLocationUri()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getSecurityGroupArns() != null)
            sb.append("SecurityGroupArns: ").append(getSecurityGroupArns()).append(",");
        if (getStorageVirtualMachineArn() != null)
            sb.append("StorageVirtualMachineArn: ").append(getStorageVirtualMachineArn()).append(",");
        if (getFsxFilesystemArn() != null)
            sb.append("FsxFilesystemArn: ").append(getFsxFilesystemArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLocationFsxOntapResult == false)
            return false;
        DescribeLocationFsxOntapResult other = (DescribeLocationFsxOntapResult) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLocationArn() == null ^ this.getLocationArn() == null)
            return false;
        if (other.getLocationArn() != null && other.getLocationArn().equals(this.getLocationArn()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getSecurityGroupArns() == null ^ this.getSecurityGroupArns() == null)
            return false;
        if (other.getSecurityGroupArns() != null && other.getSecurityGroupArns().equals(this.getSecurityGroupArns()) == false)
            return false;
        if (other.getStorageVirtualMachineArn() == null ^ this.getStorageVirtualMachineArn() == null)
            return false;
        if (other.getStorageVirtualMachineArn() != null && other.getStorageVirtualMachineArn().equals(this.getStorageVirtualMachineArn()) == false)
            return false;
        if (other.getFsxFilesystemArn() == null ^ this.getFsxFilesystemArn() == null)
            return false;
        if (other.getFsxFilesystemArn() != null && other.getFsxFilesystemArn().equals(this.getFsxFilesystemArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLocationArn() == null) ? 0 : getLocationArn().hashCode());
        hashCode = prime * hashCode + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupArns() == null) ? 0 : getSecurityGroupArns().hashCode());
        hashCode = prime * hashCode + ((getStorageVirtualMachineArn() == null) ? 0 : getStorageVirtualMachineArn().hashCode());
        hashCode = prime * hashCode + ((getFsxFilesystemArn() == null) ? 0 : getFsxFilesystemArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLocationFsxOntapResult clone() {
        try {
            return (DescribeLocationFsxOntapResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
