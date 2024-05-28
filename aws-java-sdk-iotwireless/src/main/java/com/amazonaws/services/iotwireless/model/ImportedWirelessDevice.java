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
 * Information about a wireless device that has been added to an import task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ImportedWirelessDevice" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportedWirelessDevice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Sidewalk-related information about a device that has been added to an import task.
     * </p>
     */
    private ImportedSidewalkDevice sidewalk;

    /**
     * <p>
     * The Sidewalk-related information about a device that has been added to an import task.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk-related information about a device that has been added to an import task.
     */

    public void setSidewalk(ImportedSidewalkDevice sidewalk) {
        this.sidewalk = sidewalk;
    }

    /**
     * <p>
     * The Sidewalk-related information about a device that has been added to an import task.
     * </p>
     * 
     * @return The Sidewalk-related information about a device that has been added to an import task.
     */

    public ImportedSidewalkDevice getSidewalk() {
        return this.sidewalk;
    }

    /**
     * <p>
     * The Sidewalk-related information about a device that has been added to an import task.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk-related information about a device that has been added to an import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportedWirelessDevice withSidewalk(ImportedSidewalkDevice sidewalk) {
        setSidewalk(sidewalk);
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
        if (getSidewalk() != null)
            sb.append("Sidewalk: ").append(getSidewalk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportedWirelessDevice == false)
            return false;
        ImportedWirelessDevice other = (ImportedWirelessDevice) obj;
        if (other.getSidewalk() == null ^ this.getSidewalk() == null)
            return false;
        if (other.getSidewalk() != null && other.getSidewalk().equals(this.getSidewalk()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSidewalk() == null) ? 0 : getSidewalk().hashCode());
        return hashCode;
    }

    @Override
    public ImportedWirelessDevice clone() {
        try {
            return (ImportedWirelessDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.ImportedWirelessDeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
