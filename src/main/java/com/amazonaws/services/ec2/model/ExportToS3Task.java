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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * Export To S3 Task
 */
public class ExportToS3Task implements Serializable {

    private String diskImageFormat;

    private String containerFormat;

    private String s3Bucket;

    private String s3Key;

    /**
     * Returns the value of the DiskImageFormat property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @return The value of the DiskImageFormat property for this object.
     *
     * @see DiskImageFormat
     */
    public String getDiskImageFormat() {
        return diskImageFormat;
    }
    
    /**
     * Sets the value of the DiskImageFormat property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param diskImageFormat The new value for the DiskImageFormat property for this object.
     *
     * @see DiskImageFormat
     */
    public void setDiskImageFormat(String diskImageFormat) {
        this.diskImageFormat = diskImageFormat;
    }
    
    /**
     * Sets the value of the DiskImageFormat property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param diskImageFormat The new value for the DiskImageFormat property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see DiskImageFormat
     */
    public ExportToS3Task withDiskImageFormat(String diskImageFormat) {
        this.diskImageFormat = diskImageFormat;
        return this;
    }

    /**
     * Sets the value of the DiskImageFormat property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param diskImageFormat The new value for the DiskImageFormat property for this object.
     *
     * @see DiskImageFormat
     */
    public void setDiskImageFormat(DiskImageFormat diskImageFormat) {
        this.diskImageFormat = diskImageFormat.toString();
    }
    
    /**
     * Sets the value of the DiskImageFormat property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMDK, RAW, VHD
     *
     * @param diskImageFormat The new value for the DiskImageFormat property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see DiskImageFormat
     */
    public ExportToS3Task withDiskImageFormat(DiskImageFormat diskImageFormat) {
        this.diskImageFormat = diskImageFormat.toString();
        return this;
    }

    /**
     * Returns the value of the ContainerFormat property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ova
     *
     * @return The value of the ContainerFormat property for this object.
     *
     * @see ContainerFormat
     */
    public String getContainerFormat() {
        return containerFormat;
    }
    
    /**
     * Sets the value of the ContainerFormat property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ova
     *
     * @param containerFormat The new value for the ContainerFormat property for this object.
     *
     * @see ContainerFormat
     */
    public void setContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
    }
    
    /**
     * Sets the value of the ContainerFormat property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ova
     *
     * @param containerFormat The new value for the ContainerFormat property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ContainerFormat
     */
    public ExportToS3Task withContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
        return this;
    }

    /**
     * Sets the value of the ContainerFormat property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ova
     *
     * @param containerFormat The new value for the ContainerFormat property for this object.
     *
     * @see ContainerFormat
     */
    public void setContainerFormat(ContainerFormat containerFormat) {
        this.containerFormat = containerFormat.toString();
    }
    
    /**
     * Sets the value of the ContainerFormat property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ova
     *
     * @param containerFormat The new value for the ContainerFormat property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ContainerFormat
     */
    public ExportToS3Task withContainerFormat(ContainerFormat containerFormat) {
        this.containerFormat = containerFormat.toString();
        return this;
    }

    /**
     * Returns the value of the S3Bucket property for this object.
     *
     * @return The value of the S3Bucket property for this object.
     */
    public String getS3Bucket() {
        return s3Bucket;
    }
    
    /**
     * Sets the value of the S3Bucket property for this object.
     *
     * @param s3Bucket The new value for the S3Bucket property for this object.
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }
    
    /**
     * Sets the value of the S3Bucket property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3Bucket The new value for the S3Bucket property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExportToS3Task withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * Returns the value of the S3Key property for this object.
     *
     * @return The value of the S3Key property for this object.
     */
    public String getS3Key() {
        return s3Key;
    }
    
    /**
     * Sets the value of the S3Key property for this object.
     *
     * @param s3Key The new value for the S3Key property for this object.
     */
    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }
    
    /**
     * Sets the value of the S3Key property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3Key The new value for the S3Key property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ExportToS3Task withS3Key(String s3Key) {
        this.s3Key = s3Key;
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
        if (getDiskImageFormat() != null) sb.append("DiskImageFormat: " + getDiskImageFormat() + ",");
        if (getContainerFormat() != null) sb.append("ContainerFormat: " + getContainerFormat() + ",");
        if (getS3Bucket() != null) sb.append("S3Bucket: " + getS3Bucket() + ",");
        if (getS3Key() != null) sb.append("S3Key: " + getS3Key() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDiskImageFormat() == null) ? 0 : getDiskImageFormat().hashCode()); 
        hashCode = prime * hashCode + ((getContainerFormat() == null) ? 0 : getContainerFormat().hashCode()); 
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode()); 
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ExportToS3Task == false) return false;
        ExportToS3Task other = (ExportToS3Task)obj;
        
        if (other.getDiskImageFormat() == null ^ this.getDiskImageFormat() == null) return false;
        if (other.getDiskImageFormat() != null && other.getDiskImageFormat().equals(this.getDiskImageFormat()) == false) return false; 
        if (other.getContainerFormat() == null ^ this.getContainerFormat() == null) return false;
        if (other.getContainerFormat() != null && other.getContainerFormat().equals(this.getContainerFormat()) == false) return false; 
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null) return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false) return false; 
        if (other.getS3Key() == null ^ this.getS3Key() == null) return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false) return false; 
        return true;
    }
    
}
    