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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Total number of scanned files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ScannedItemCount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScannedItemCount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Total GB of files scanned for malware.
     * </p>
     */
    private Integer totalGb;
    /**
     * <p>
     * Number of files scanned.
     * </p>
     */
    private Integer files;
    /**
     * <p>
     * Total number of scanned volumes.
     * </p>
     */
    private Integer volumes;

    /**
     * <p>
     * Total GB of files scanned for malware.
     * </p>
     * 
     * @param totalGb
     *        Total GB of files scanned for malware.
     */

    public void setTotalGb(Integer totalGb) {
        this.totalGb = totalGb;
    }

    /**
     * <p>
     * Total GB of files scanned for malware.
     * </p>
     * 
     * @return Total GB of files scanned for malware.
     */

    public Integer getTotalGb() {
        return this.totalGb;
    }

    /**
     * <p>
     * Total GB of files scanned for malware.
     * </p>
     * 
     * @param totalGb
     *        Total GB of files scanned for malware.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScannedItemCount withTotalGb(Integer totalGb) {
        setTotalGb(totalGb);
        return this;
    }

    /**
     * <p>
     * Number of files scanned.
     * </p>
     * 
     * @param files
     *        Number of files scanned.
     */

    public void setFiles(Integer files) {
        this.files = files;
    }

    /**
     * <p>
     * Number of files scanned.
     * </p>
     * 
     * @return Number of files scanned.
     */

    public Integer getFiles() {
        return this.files;
    }

    /**
     * <p>
     * Number of files scanned.
     * </p>
     * 
     * @param files
     *        Number of files scanned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScannedItemCount withFiles(Integer files) {
        setFiles(files);
        return this;
    }

    /**
     * <p>
     * Total number of scanned volumes.
     * </p>
     * 
     * @param volumes
     *        Total number of scanned volumes.
     */

    public void setVolumes(Integer volumes) {
        this.volumes = volumes;
    }

    /**
     * <p>
     * Total number of scanned volumes.
     * </p>
     * 
     * @return Total number of scanned volumes.
     */

    public Integer getVolumes() {
        return this.volumes;
    }

    /**
     * <p>
     * Total number of scanned volumes.
     * </p>
     * 
     * @param volumes
     *        Total number of scanned volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScannedItemCount withVolumes(Integer volumes) {
        setVolumes(volumes);
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
        if (getTotalGb() != null)
            sb.append("TotalGb: ").append(getTotalGb()).append(",");
        if (getFiles() != null)
            sb.append("Files: ").append(getFiles()).append(",");
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScannedItemCount == false)
            return false;
        ScannedItemCount other = (ScannedItemCount) obj;
        if (other.getTotalGb() == null ^ this.getTotalGb() == null)
            return false;
        if (other.getTotalGb() != null && other.getTotalGb().equals(this.getTotalGb()) == false)
            return false;
        if (other.getFiles() == null ^ this.getFiles() == null)
            return false;
        if (other.getFiles() != null && other.getFiles().equals(this.getFiles()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalGb() == null) ? 0 : getTotalGb().hashCode());
        hashCode = prime * hashCode + ((getFiles() == null) ? 0 : getFiles().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        return hashCode;
    }

    @Override
    public ScannedItemCount clone() {
        try {
            return (ScannedItemCount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ScannedItemCountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
