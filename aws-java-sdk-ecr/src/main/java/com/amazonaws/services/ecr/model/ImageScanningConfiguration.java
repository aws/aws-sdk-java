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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The image scanning configuration for a repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ImageScanningConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageScanningConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The setting that determines whether images are scanned after being pushed to a repository. If set to
     * <code>true</code>, images will be scanned after being pushed. If this parameter is not specified, it will default
     * to <code>false</code> and images will not be scanned unless a scan is manually started with the
     * <a>StartImageScan</a> API.
     * </p>
     */
    private Boolean scanOnPush;

    /**
     * <p>
     * The setting that determines whether images are scanned after being pushed to a repository. If set to
     * <code>true</code>, images will be scanned after being pushed. If this parameter is not specified, it will default
     * to <code>false</code> and images will not be scanned unless a scan is manually started with the
     * <a>StartImageScan</a> API.
     * </p>
     * 
     * @param scanOnPush
     *        The setting that determines whether images are scanned after being pushed to a repository. If set to
     *        <code>true</code>, images will be scanned after being pushed. If this parameter is not specified, it will
     *        default to <code>false</code> and images will not be scanned unless a scan is manually started with the
     *        <a>StartImageScan</a> API.
     */

    public void setScanOnPush(Boolean scanOnPush) {
        this.scanOnPush = scanOnPush;
    }

    /**
     * <p>
     * The setting that determines whether images are scanned after being pushed to a repository. If set to
     * <code>true</code>, images will be scanned after being pushed. If this parameter is not specified, it will default
     * to <code>false</code> and images will not be scanned unless a scan is manually started with the
     * <a>StartImageScan</a> API.
     * </p>
     * 
     * @return The setting that determines whether images are scanned after being pushed to a repository. If set to
     *         <code>true</code>, images will be scanned after being pushed. If this parameter is not specified, it will
     *         default to <code>false</code> and images will not be scanned unless a scan is manually started with the
     *         <a>StartImageScan</a> API.
     */

    public Boolean getScanOnPush() {
        return this.scanOnPush;
    }

    /**
     * <p>
     * The setting that determines whether images are scanned after being pushed to a repository. If set to
     * <code>true</code>, images will be scanned after being pushed. If this parameter is not specified, it will default
     * to <code>false</code> and images will not be scanned unless a scan is manually started with the
     * <a>StartImageScan</a> API.
     * </p>
     * 
     * @param scanOnPush
     *        The setting that determines whether images are scanned after being pushed to a repository. If set to
     *        <code>true</code>, images will be scanned after being pushed. If this parameter is not specified, it will
     *        default to <code>false</code> and images will not be scanned unless a scan is manually started with the
     *        <a>StartImageScan</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanningConfiguration withScanOnPush(Boolean scanOnPush) {
        setScanOnPush(scanOnPush);
        return this;
    }

    /**
     * <p>
     * The setting that determines whether images are scanned after being pushed to a repository. If set to
     * <code>true</code>, images will be scanned after being pushed. If this parameter is not specified, it will default
     * to <code>false</code> and images will not be scanned unless a scan is manually started with the
     * <a>StartImageScan</a> API.
     * </p>
     * 
     * @return The setting that determines whether images are scanned after being pushed to a repository. If set to
     *         <code>true</code>, images will be scanned after being pushed. If this parameter is not specified, it will
     *         default to <code>false</code> and images will not be scanned unless a scan is manually started with the
     *         <a>StartImageScan</a> API.
     */

    public Boolean isScanOnPush() {
        return this.scanOnPush;
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
        if (getScanOnPush() != null)
            sb.append("ScanOnPush: ").append(getScanOnPush());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageScanningConfiguration == false)
            return false;
        ImageScanningConfiguration other = (ImageScanningConfiguration) obj;
        if (other.getScanOnPush() == null ^ this.getScanOnPush() == null)
            return false;
        if (other.getScanOnPush() != null && other.getScanOnPush().equals(this.getScanOnPush()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScanOnPush() == null) ? 0 : getScanOnPush().hashCode());
        return hashCode;
    }

    @Override
    public ImageScanningConfiguration clone() {
        try {
            return (ImageScanningConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.ImageScanningConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
