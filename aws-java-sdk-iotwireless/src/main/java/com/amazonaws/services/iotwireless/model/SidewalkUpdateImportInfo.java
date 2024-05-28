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
 * Sidewalk object information for updating an import task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SidewalkUpdateImportInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SidewalkUpdateImportInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CSV file contained in an S3 bucket that's used for appending devices to an existing import task.
     * </p>
     */
    private String deviceCreationFile;

    /**
     * <p>
     * The CSV file contained in an S3 bucket that's used for appending devices to an existing import task.
     * </p>
     * 
     * @param deviceCreationFile
     *        The CSV file contained in an S3 bucket that's used for appending devices to an existing import task.
     */

    public void setDeviceCreationFile(String deviceCreationFile) {
        this.deviceCreationFile = deviceCreationFile;
    }

    /**
     * <p>
     * The CSV file contained in an S3 bucket that's used for appending devices to an existing import task.
     * </p>
     * 
     * @return The CSV file contained in an S3 bucket that's used for appending devices to an existing import task.
     */

    public String getDeviceCreationFile() {
        return this.deviceCreationFile;
    }

    /**
     * <p>
     * The CSV file contained in an S3 bucket that's used for appending devices to an existing import task.
     * </p>
     * 
     * @param deviceCreationFile
     *        The CSV file contained in an S3 bucket that's used for appending devices to an existing import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkUpdateImportInfo withDeviceCreationFile(String deviceCreationFile) {
        setDeviceCreationFile(deviceCreationFile);
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
            sb.append("DeviceCreationFile: ").append(getDeviceCreationFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SidewalkUpdateImportInfo == false)
            return false;
        SidewalkUpdateImportInfo other = (SidewalkUpdateImportInfo) obj;
        if (other.getDeviceCreationFile() == null ^ this.getDeviceCreationFile() == null)
            return false;
        if (other.getDeviceCreationFile() != null && other.getDeviceCreationFile().equals(this.getDeviceCreationFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceCreationFile() == null) ? 0 : getDeviceCreationFile().hashCode());
        return hashCode;
    }

    @Override
    public SidewalkUpdateImportInfo clone() {
        try {
            return (SidewalkUpdateImportInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SidewalkUpdateImportInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
