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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information on the usage of a data source package in the behavior graph.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DatasourcePackageUsageInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasourcePackageUsageInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Total volume of data in bytes per day ingested for a given data source package.
     * </p>
     */
    private Long volumeUsageInBytes;
    /**
     * <p>
     * The data and time when the member account data volume was last updated. The value is an ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     */
    private java.util.Date volumeUsageUpdateTime;

    /**
     * <p>
     * Total volume of data in bytes per day ingested for a given data source package.
     * </p>
     * 
     * @param volumeUsageInBytes
     *        Total volume of data in bytes per day ingested for a given data source package.
     */

    public void setVolumeUsageInBytes(Long volumeUsageInBytes) {
        this.volumeUsageInBytes = volumeUsageInBytes;
    }

    /**
     * <p>
     * Total volume of data in bytes per day ingested for a given data source package.
     * </p>
     * 
     * @return Total volume of data in bytes per day ingested for a given data source package.
     */

    public Long getVolumeUsageInBytes() {
        return this.volumeUsageInBytes;
    }

    /**
     * <p>
     * Total volume of data in bytes per day ingested for a given data source package.
     * </p>
     * 
     * @param volumeUsageInBytes
     *        Total volume of data in bytes per day ingested for a given data source package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasourcePackageUsageInfo withVolumeUsageInBytes(Long volumeUsageInBytes) {
        setVolumeUsageInBytes(volumeUsageInBytes);
        return this;
    }

    /**
     * <p>
     * The data and time when the member account data volume was last updated. The value is an ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param volumeUsageUpdateTime
     *        The data and time when the member account data volume was last updated. The value is an ISO8601 formatted
     *        string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public void setVolumeUsageUpdateTime(java.util.Date volumeUsageUpdateTime) {
        this.volumeUsageUpdateTime = volumeUsageUpdateTime;
    }

    /**
     * <p>
     * The data and time when the member account data volume was last updated. The value is an ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @return The data and time when the member account data volume was last updated. The value is an ISO8601 formatted
     *         string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public java.util.Date getVolumeUsageUpdateTime() {
        return this.volumeUsageUpdateTime;
    }

    /**
     * <p>
     * The data and time when the member account data volume was last updated. The value is an ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param volumeUsageUpdateTime
     *        The data and time when the member account data volume was last updated. The value is an ISO8601 formatted
     *        string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasourcePackageUsageInfo withVolumeUsageUpdateTime(java.util.Date volumeUsageUpdateTime) {
        setVolumeUsageUpdateTime(volumeUsageUpdateTime);
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
        if (getVolumeUsageInBytes() != null)
            sb.append("VolumeUsageInBytes: ").append(getVolumeUsageInBytes()).append(",");
        if (getVolumeUsageUpdateTime() != null)
            sb.append("VolumeUsageUpdateTime: ").append(getVolumeUsageUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasourcePackageUsageInfo == false)
            return false;
        DatasourcePackageUsageInfo other = (DatasourcePackageUsageInfo) obj;
        if (other.getVolumeUsageInBytes() == null ^ this.getVolumeUsageInBytes() == null)
            return false;
        if (other.getVolumeUsageInBytes() != null && other.getVolumeUsageInBytes().equals(this.getVolumeUsageInBytes()) == false)
            return false;
        if (other.getVolumeUsageUpdateTime() == null ^ this.getVolumeUsageUpdateTime() == null)
            return false;
        if (other.getVolumeUsageUpdateTime() != null && other.getVolumeUsageUpdateTime().equals(this.getVolumeUsageUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeUsageInBytes() == null) ? 0 : getVolumeUsageInBytes().hashCode());
        hashCode = prime * hashCode + ((getVolumeUsageUpdateTime() == null) ? 0 : getVolumeUsageUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public DatasourcePackageUsageInfo clone() {
        try {
            return (DatasourcePackageUsageInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.DatasourcePackageUsageInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
