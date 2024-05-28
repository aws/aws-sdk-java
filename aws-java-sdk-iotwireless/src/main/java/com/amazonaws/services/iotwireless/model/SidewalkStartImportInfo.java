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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an import task created for bulk provisioning.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SidewalkStartImportInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SidewalkStartImportInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CSV file contained in an S3 bucket that's used for adding devices to an import task.
     * </p>
     */
    private String deviceCreationFile;
    /**
     * <p>
     * The IAM role that allows AWS IoT Wireless to access the CSV file in the S3 bucket.
     * </p>
     */
    private String role;

    /**
     * <p>
     * The CSV file contained in an S3 bucket that's used for adding devices to an import task.
     * </p>
     * 
     * @param deviceCreationFile
     *        The CSV file contained in an S3 bucket that's used for adding devices to an import task.
     */

    public void setDeviceCreationFile(String deviceCreationFile) {
        this.deviceCreationFile = deviceCreationFile;
    }

    /**
     * <p>
     * The CSV file contained in an S3 bucket that's used for adding devices to an import task.
     * </p>
     * 
     * @return The CSV file contained in an S3 bucket that's used for adding devices to an import task.
     */

    public String getDeviceCreationFile() {
        return this.deviceCreationFile;
    }

    /**
     * <p>
     * The CSV file contained in an S3 bucket that's used for adding devices to an import task.
     * </p>
     * 
     * @param deviceCreationFile
     *        The CSV file contained in an S3 bucket that's used for adding devices to an import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkStartImportInfo withDeviceCreationFile(String deviceCreationFile) {
        setDeviceCreationFile(deviceCreationFile);
        return this;
    }

    /**
     * <p>
     * The IAM role that allows AWS IoT Wireless to access the CSV file in the S3 bucket.
     * </p>
     * 
     * @param role
     *        The IAM role that allows AWS IoT Wireless to access the CSV file in the S3 bucket.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The IAM role that allows AWS IoT Wireless to access the CSV file in the S3 bucket.
     * </p>
     * 
     * @return The IAM role that allows AWS IoT Wireless to access the CSV file in the S3 bucket.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The IAM role that allows AWS IoT Wireless to access the CSV file in the S3 bucket.
     * </p>
     * 
     * @param role
     *        The IAM role that allows AWS IoT Wireless to access the CSV file in the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkStartImportInfo withRole(String role) {
        setRole(role);
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
        if (getDeviceCreationFile() != null)
            sb.append("DeviceCreationFile: ").append(getDeviceCreationFile()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SidewalkStartImportInfo == false)
            return false;
        SidewalkStartImportInfo other = (SidewalkStartImportInfo) obj;
        if (other.getDeviceCreationFile() == null ^ this.getDeviceCreationFile() == null)
            return false;
        if (other.getDeviceCreationFile() != null && other.getDeviceCreationFile().equals(this.getDeviceCreationFile()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceCreationFile() == null) ? 0 : getDeviceCreationFile().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        return hashCode;
    }

    @Override
    public SidewalkStartImportInfo clone() {
        try {
            return (SidewalkStartImportInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SidewalkStartImportInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
