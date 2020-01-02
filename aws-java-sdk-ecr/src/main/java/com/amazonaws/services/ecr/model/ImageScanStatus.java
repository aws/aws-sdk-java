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
 * The current status of an image scan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ImageScanStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageScanStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current state of an image scan.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The description of the image scan status.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The current state of an image scan.
     * </p>
     * 
     * @param status
     *        The current state of an image scan.
     * @see ScanStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of an image scan.
     * </p>
     * 
     * @return The current state of an image scan.
     * @see ScanStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of an image scan.
     * </p>
     * 
     * @param status
     *        The current state of an image scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanStatus
     */

    public ImageScanStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of an image scan.
     * </p>
     * 
     * @param status
     *        The current state of an image scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanStatus
     */

    public ImageScanStatus withStatus(ScanStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The description of the image scan status.
     * </p>
     * 
     * @param description
     *        The description of the image scan status.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the image scan status.
     * </p>
     * 
     * @return The description of the image scan status.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the image scan status.
     * </p>
     * 
     * @param description
     *        The description of the image scan status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageScanStatus withDescription(String description) {
        setDescription(description);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageScanStatus == false)
            return false;
        ImageScanStatus other = (ImageScanStatus) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ImageScanStatus clone() {
        try {
            return (ImageScanStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.ImageScanStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
