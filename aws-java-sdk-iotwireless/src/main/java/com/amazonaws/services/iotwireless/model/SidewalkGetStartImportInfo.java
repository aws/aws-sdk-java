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
 * Sidewalk-related information for devices in an import task that are being onboarded.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SidewalkGetStartImportInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SidewalkGetStartImportInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of Sidewalk devices that are added to the import task.
     * </p>
     */
    private java.util.List<String> deviceCreationFileList;
    /**
     * <p>
     * The IAM role that allows AWS IoT Wireless to access the CSV file in the S3 bucket.
     * </p>
     */
    private String role;

    /**
     * <p>
     * List of Sidewalk devices that are added to the import task.
     * </p>
     * 
     * @return List of Sidewalk devices that are added to the import task.
     */

    public java.util.List<String> getDeviceCreationFileList() {
        return deviceCreationFileList;
    }

    /**
     * <p>
     * List of Sidewalk devices that are added to the import task.
     * </p>
     * 
     * @param deviceCreationFileList
     *        List of Sidewalk devices that are added to the import task.
     */

    public void setDeviceCreationFileList(java.util.Collection<String> deviceCreationFileList) {
        if (deviceCreationFileList == null) {
            this.deviceCreationFileList = null;
            return;
        }

        this.deviceCreationFileList = new java.util.ArrayList<String>(deviceCreationFileList);
    }

    /**
     * <p>
     * List of Sidewalk devices that are added to the import task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceCreationFileList(java.util.Collection)} or
     * {@link #withDeviceCreationFileList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param deviceCreationFileList
     *        List of Sidewalk devices that are added to the import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkGetStartImportInfo withDeviceCreationFileList(String... deviceCreationFileList) {
        if (this.deviceCreationFileList == null) {
            setDeviceCreationFileList(new java.util.ArrayList<String>(deviceCreationFileList.length));
        }
        for (String ele : deviceCreationFileList) {
            this.deviceCreationFileList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of Sidewalk devices that are added to the import task.
     * </p>
     * 
     * @param deviceCreationFileList
     *        List of Sidewalk devices that are added to the import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkGetStartImportInfo withDeviceCreationFileList(java.util.Collection<String> deviceCreationFileList) {
        setDeviceCreationFileList(deviceCreationFileList);
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

    public SidewalkGetStartImportInfo withRole(String role) {
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
        if (getDeviceCreationFileList() != null)
            sb.append("DeviceCreationFileList: ").append(getDeviceCreationFileList()).append(",");
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

        if (obj instanceof SidewalkGetStartImportInfo == false)
            return false;
        SidewalkGetStartImportInfo other = (SidewalkGetStartImportInfo) obj;
        if (other.getDeviceCreationFileList() == null ^ this.getDeviceCreationFileList() == null)
            return false;
        if (other.getDeviceCreationFileList() != null && other.getDeviceCreationFileList().equals(this.getDeviceCreationFileList()) == false)
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

        hashCode = prime * hashCode + ((getDeviceCreationFileList() == null) ? 0 : getDeviceCreationFileList().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        return hashCode;
    }

    @Override
    public SidewalkGetStartImportInfo clone() {
        try {
            return (SidewalkGetStartImportInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SidewalkGetStartImportInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
