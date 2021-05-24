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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The field that contains a list of disk (local storage) metrics associated with the current instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/DiskResourceUtilization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiskResourceUtilization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of read operations per second.
     * </p>
     */
    private String diskReadOpsPerSecond;
    /**
     * <p>
     * The maximum number of write operations per second.
     * </p>
     */
    private String diskWriteOpsPerSecond;
    /**
     * <p>
     * The maximum read throughput operations per second.
     * </p>
     */
    private String diskReadBytesPerSecond;
    /**
     * <p>
     * The maximum write throughput operations per second.
     * </p>
     */
    private String diskWriteBytesPerSecond;

    /**
     * <p>
     * The maximum number of read operations per second.
     * </p>
     * 
     * @param diskReadOpsPerSecond
     *        The maximum number of read operations per second.
     */

    public void setDiskReadOpsPerSecond(String diskReadOpsPerSecond) {
        this.diskReadOpsPerSecond = diskReadOpsPerSecond;
    }

    /**
     * <p>
     * The maximum number of read operations per second.
     * </p>
     * 
     * @return The maximum number of read operations per second.
     */

    public String getDiskReadOpsPerSecond() {
        return this.diskReadOpsPerSecond;
    }

    /**
     * <p>
     * The maximum number of read operations per second.
     * </p>
     * 
     * @param diskReadOpsPerSecond
     *        The maximum number of read operations per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskResourceUtilization withDiskReadOpsPerSecond(String diskReadOpsPerSecond) {
        setDiskReadOpsPerSecond(diskReadOpsPerSecond);
        return this;
    }

    /**
     * <p>
     * The maximum number of write operations per second.
     * </p>
     * 
     * @param diskWriteOpsPerSecond
     *        The maximum number of write operations per second.
     */

    public void setDiskWriteOpsPerSecond(String diskWriteOpsPerSecond) {
        this.diskWriteOpsPerSecond = diskWriteOpsPerSecond;
    }

    /**
     * <p>
     * The maximum number of write operations per second.
     * </p>
     * 
     * @return The maximum number of write operations per second.
     */

    public String getDiskWriteOpsPerSecond() {
        return this.diskWriteOpsPerSecond;
    }

    /**
     * <p>
     * The maximum number of write operations per second.
     * </p>
     * 
     * @param diskWriteOpsPerSecond
     *        The maximum number of write operations per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskResourceUtilization withDiskWriteOpsPerSecond(String diskWriteOpsPerSecond) {
        setDiskWriteOpsPerSecond(diskWriteOpsPerSecond);
        return this;
    }

    /**
     * <p>
     * The maximum read throughput operations per second.
     * </p>
     * 
     * @param diskReadBytesPerSecond
     *        The maximum read throughput operations per second.
     */

    public void setDiskReadBytesPerSecond(String diskReadBytesPerSecond) {
        this.diskReadBytesPerSecond = diskReadBytesPerSecond;
    }

    /**
     * <p>
     * The maximum read throughput operations per second.
     * </p>
     * 
     * @return The maximum read throughput operations per second.
     */

    public String getDiskReadBytesPerSecond() {
        return this.diskReadBytesPerSecond;
    }

    /**
     * <p>
     * The maximum read throughput operations per second.
     * </p>
     * 
     * @param diskReadBytesPerSecond
     *        The maximum read throughput operations per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskResourceUtilization withDiskReadBytesPerSecond(String diskReadBytesPerSecond) {
        setDiskReadBytesPerSecond(diskReadBytesPerSecond);
        return this;
    }

    /**
     * <p>
     * The maximum write throughput operations per second.
     * </p>
     * 
     * @param diskWriteBytesPerSecond
     *        The maximum write throughput operations per second.
     */

    public void setDiskWriteBytesPerSecond(String diskWriteBytesPerSecond) {
        this.diskWriteBytesPerSecond = diskWriteBytesPerSecond;
    }

    /**
     * <p>
     * The maximum write throughput operations per second.
     * </p>
     * 
     * @return The maximum write throughput operations per second.
     */

    public String getDiskWriteBytesPerSecond() {
        return this.diskWriteBytesPerSecond;
    }

    /**
     * <p>
     * The maximum write throughput operations per second.
     * </p>
     * 
     * @param diskWriteBytesPerSecond
     *        The maximum write throughput operations per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiskResourceUtilization withDiskWriteBytesPerSecond(String diskWriteBytesPerSecond) {
        setDiskWriteBytesPerSecond(diskWriteBytesPerSecond);
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
        if (getDiskReadOpsPerSecond() != null)
            sb.append("DiskReadOpsPerSecond: ").append(getDiskReadOpsPerSecond()).append(",");
        if (getDiskWriteOpsPerSecond() != null)
            sb.append("DiskWriteOpsPerSecond: ").append(getDiskWriteOpsPerSecond()).append(",");
        if (getDiskReadBytesPerSecond() != null)
            sb.append("DiskReadBytesPerSecond: ").append(getDiskReadBytesPerSecond()).append(",");
        if (getDiskWriteBytesPerSecond() != null)
            sb.append("DiskWriteBytesPerSecond: ").append(getDiskWriteBytesPerSecond());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiskResourceUtilization == false)
            return false;
        DiskResourceUtilization other = (DiskResourceUtilization) obj;
        if (other.getDiskReadOpsPerSecond() == null ^ this.getDiskReadOpsPerSecond() == null)
            return false;
        if (other.getDiskReadOpsPerSecond() != null && other.getDiskReadOpsPerSecond().equals(this.getDiskReadOpsPerSecond()) == false)
            return false;
        if (other.getDiskWriteOpsPerSecond() == null ^ this.getDiskWriteOpsPerSecond() == null)
            return false;
        if (other.getDiskWriteOpsPerSecond() != null && other.getDiskWriteOpsPerSecond().equals(this.getDiskWriteOpsPerSecond()) == false)
            return false;
        if (other.getDiskReadBytesPerSecond() == null ^ this.getDiskReadBytesPerSecond() == null)
            return false;
        if (other.getDiskReadBytesPerSecond() != null && other.getDiskReadBytesPerSecond().equals(this.getDiskReadBytesPerSecond()) == false)
            return false;
        if (other.getDiskWriteBytesPerSecond() == null ^ this.getDiskWriteBytesPerSecond() == null)
            return false;
        if (other.getDiskWriteBytesPerSecond() != null && other.getDiskWriteBytesPerSecond().equals(this.getDiskWriteBytesPerSecond()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiskReadOpsPerSecond() == null) ? 0 : getDiskReadOpsPerSecond().hashCode());
        hashCode = prime * hashCode + ((getDiskWriteOpsPerSecond() == null) ? 0 : getDiskWriteOpsPerSecond().hashCode());
        hashCode = prime * hashCode + ((getDiskReadBytesPerSecond() == null) ? 0 : getDiskReadBytesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getDiskWriteBytesPerSecond() == null) ? 0 : getDiskWriteBytesPerSecond().hashCode());
        return hashCode;
    }

    @Override
    public DiskResourceUtilization clone() {
        try {
            return (DiskResourceUtilization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.DiskResourceUtilizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
