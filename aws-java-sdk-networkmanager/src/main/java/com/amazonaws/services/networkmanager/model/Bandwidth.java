/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes bandwidth information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/Bandwidth" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Bandwidth implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Upload speed in Mbps.
     * </p>
     */
    private Integer uploadSpeed;
    /**
     * <p>
     * Download speed in Mbps.
     * </p>
     */
    private Integer downloadSpeed;

    /**
     * <p>
     * Upload speed in Mbps.
     * </p>
     * 
     * @param uploadSpeed
     *        Upload speed in Mbps.
     */

    public void setUploadSpeed(Integer uploadSpeed) {
        this.uploadSpeed = uploadSpeed;
    }

    /**
     * <p>
     * Upload speed in Mbps.
     * </p>
     * 
     * @return Upload speed in Mbps.
     */

    public Integer getUploadSpeed() {
        return this.uploadSpeed;
    }

    /**
     * <p>
     * Upload speed in Mbps.
     * </p>
     * 
     * @param uploadSpeed
     *        Upload speed in Mbps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bandwidth withUploadSpeed(Integer uploadSpeed) {
        setUploadSpeed(uploadSpeed);
        return this;
    }

    /**
     * <p>
     * Download speed in Mbps.
     * </p>
     * 
     * @param downloadSpeed
     *        Download speed in Mbps.
     */

    public void setDownloadSpeed(Integer downloadSpeed) {
        this.downloadSpeed = downloadSpeed;
    }

    /**
     * <p>
     * Download speed in Mbps.
     * </p>
     * 
     * @return Download speed in Mbps.
     */

    public Integer getDownloadSpeed() {
        return this.downloadSpeed;
    }

    /**
     * <p>
     * Download speed in Mbps.
     * </p>
     * 
     * @param downloadSpeed
     *        Download speed in Mbps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bandwidth withDownloadSpeed(Integer downloadSpeed) {
        setDownloadSpeed(downloadSpeed);
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
        if (getUploadSpeed() != null)
            sb.append("UploadSpeed: ").append(getUploadSpeed()).append(",");
        if (getDownloadSpeed() != null)
            sb.append("DownloadSpeed: ").append(getDownloadSpeed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Bandwidth == false)
            return false;
        Bandwidth other = (Bandwidth) obj;
        if (other.getUploadSpeed() == null ^ this.getUploadSpeed() == null)
            return false;
        if (other.getUploadSpeed() != null && other.getUploadSpeed().equals(this.getUploadSpeed()) == false)
            return false;
        if (other.getDownloadSpeed() == null ^ this.getDownloadSpeed() == null)
            return false;
        if (other.getDownloadSpeed() != null && other.getDownloadSpeed().equals(this.getDownloadSpeed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUploadSpeed() == null) ? 0 : getUploadSpeed().hashCode());
        hashCode = prime * hashCode + ((getDownloadSpeed() == null) ? 0 : getDownloadSpeed().hashCode());
        return hashCode;
    }

    @Override
    public Bandwidth clone() {
        try {
            return (Bandwidth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.BandwidthMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
