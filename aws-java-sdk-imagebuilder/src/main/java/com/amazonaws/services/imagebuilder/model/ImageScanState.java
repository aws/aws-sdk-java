/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Shows the vulnerability scan status for a specific image, and the reason for that status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImageScanState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageScanState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current state of vulnerability scans for the image.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the scan status for the image.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The current state of vulnerability scans for the image.
     * </p>
     * 
     * @param status
     *        The current state of vulnerability scans for the image.
     * @see ImageScanStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of vulnerability scans for the image.
     * </p>
     * 
     * @return The current state of vulnerability scans for the image.
     * @see ImageScanStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of vulnerability scans for the image.
     * </p>
     * 
     * @param status
     *        The current state of vulnerability scans for the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageScanStatus
     */

    public ImageScanState withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of vulnerability scans for the image.
     * </p>
     * 
     * @param status
     *        The current state of vulnerability scans for the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageScanStatus
     */

    public ImageScanState withStatus(ImageScanStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the scan status for the image.
     * </p>
     * 
     * @param reason
     *        The reason for the scan status for the image.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the scan status for the image.
     * </p>
     * 
     * @return The reason for the scan status for the image.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the scan status for the image.
     * </p>
     * 
     * @param reason
     *        The reason for the scan status for the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanState withReason(String reason) {
        setReason(reason);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageScanState == false)
            return false;
        ImageScanState other = (ImageScanState) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public ImageScanState clone() {
        try {
            return (ImageScanState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ImageScanStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
