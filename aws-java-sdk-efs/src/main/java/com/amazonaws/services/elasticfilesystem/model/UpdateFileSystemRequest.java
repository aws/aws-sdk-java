/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/UpdateFileSystem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileSystemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the file system that you want to update.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * (Optional) The throughput mode that you want your file system to use. If you're not updating your throughput
     * mode, you don't need to provide this value in your request.
     * </p>
     */
    private String throughputMode;
    /**
     * <p>
     * (Optional) The amount of throughput, in MiB/s, that you want to provision for your file system. If you're not
     * updating the amount of provisioned throughput for your file system, you don't need to provide this value in your
     * request.
     * </p>
     */
    private Double provisionedThroughputInMibps;

    /**
     * <p>
     * The ID of the file system that you want to update.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system that you want to update.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system that you want to update.
     * </p>
     * 
     * @return The ID of the file system that you want to update.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system that you want to update.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * (Optional) The throughput mode that you want your file system to use. If you're not updating your throughput
     * mode, you don't need to provide this value in your request.
     * </p>
     * 
     * @param throughputMode
     *        (Optional) The throughput mode that you want your file system to use. If you're not updating your
     *        throughput mode, you don't need to provide this value in your request.
     * @see ThroughputMode
     */

    public void setThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
    }

    /**
     * <p>
     * (Optional) The throughput mode that you want your file system to use. If you're not updating your throughput
     * mode, you don't need to provide this value in your request.
     * </p>
     * 
     * @return (Optional) The throughput mode that you want your file system to use. If you're not updating your
     *         throughput mode, you don't need to provide this value in your request.
     * @see ThroughputMode
     */

    public String getThroughputMode() {
        return this.throughputMode;
    }

    /**
     * <p>
     * (Optional) The throughput mode that you want your file system to use. If you're not updating your throughput
     * mode, you don't need to provide this value in your request.
     * </p>
     * 
     * @param throughputMode
     *        (Optional) The throughput mode that you want your file system to use. If you're not updating your
     *        throughput mode, you don't need to provide this value in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThroughputMode
     */

    public UpdateFileSystemRequest withThroughputMode(String throughputMode) {
        setThroughputMode(throughputMode);
        return this;
    }

    /**
     * <p>
     * (Optional) The throughput mode that you want your file system to use. If you're not updating your throughput
     * mode, you don't need to provide this value in your request.
     * </p>
     * 
     * @param throughputMode
     *        (Optional) The throughput mode that you want your file system to use. If you're not updating your
     *        throughput mode, you don't need to provide this value in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThroughputMode
     */

    public UpdateFileSystemRequest withThroughputMode(ThroughputMode throughputMode) {
        this.throughputMode = throughputMode.toString();
        return this;
    }

    /**
     * <p>
     * (Optional) The amount of throughput, in MiB/s, that you want to provision for your file system. If you're not
     * updating the amount of provisioned throughput for your file system, you don't need to provide this value in your
     * request.
     * </p>
     * 
     * @param provisionedThroughputInMibps
     *        (Optional) The amount of throughput, in MiB/s, that you want to provision for your file system. If you're
     *        not updating the amount of provisioned throughput for your file system, you don't need to provide this
     *        value in your request.
     */

    public void setProvisionedThroughputInMibps(Double provisionedThroughputInMibps) {
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
    }

    /**
     * <p>
     * (Optional) The amount of throughput, in MiB/s, that you want to provision for your file system. If you're not
     * updating the amount of provisioned throughput for your file system, you don't need to provide this value in your
     * request.
     * </p>
     * 
     * @return (Optional) The amount of throughput, in MiB/s, that you want to provision for your file system. If you're
     *         not updating the amount of provisioned throughput for your file system, you don't need to provide this
     *         value in your request.
     */

    public Double getProvisionedThroughputInMibps() {
        return this.provisionedThroughputInMibps;
    }

    /**
     * <p>
     * (Optional) The amount of throughput, in MiB/s, that you want to provision for your file system. If you're not
     * updating the amount of provisioned throughput for your file system, you don't need to provide this value in your
     * request.
     * </p>
     * 
     * @param provisionedThroughputInMibps
     *        (Optional) The amount of throughput, in MiB/s, that you want to provision for your file system. If you're
     *        not updating the amount of provisioned throughput for your file system, you don't need to provide this
     *        value in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemRequest withProvisionedThroughputInMibps(Double provisionedThroughputInMibps) {
        setProvisionedThroughputInMibps(provisionedThroughputInMibps);
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getThroughputMode() != null)
            sb.append("ThroughputMode: ").append(getThroughputMode()).append(",");
        if (getProvisionedThroughputInMibps() != null)
            sb.append("ProvisionedThroughputInMibps: ").append(getProvisionedThroughputInMibps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemRequest == false)
            return false;
        UpdateFileSystemRequest other = (UpdateFileSystemRequest) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getThroughputMode() == null ^ this.getThroughputMode() == null)
            return false;
        if (other.getThroughputMode() != null && other.getThroughputMode().equals(this.getThroughputMode()) == false)
            return false;
        if (other.getProvisionedThroughputInMibps() == null ^ this.getProvisionedThroughputInMibps() == null)
            return false;
        if (other.getProvisionedThroughputInMibps() != null && other.getProvisionedThroughputInMibps().equals(this.getProvisionedThroughputInMibps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getThroughputMode() == null) ? 0 : getThroughputMode().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughputInMibps() == null) ? 0 : getProvisionedThroughputInMibps().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFileSystemRequest clone() {
        return (UpdateFileSystemRequest) super.clone();
    }

}
