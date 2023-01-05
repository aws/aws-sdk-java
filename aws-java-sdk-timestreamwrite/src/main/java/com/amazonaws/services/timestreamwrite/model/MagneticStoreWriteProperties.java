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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The set of properties on a table for configuring magnetic store writes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/MagneticStoreWriteProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MagneticStoreWriteProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A flag to enable magnetic store writes.
     * </p>
     */
    private Boolean enableMagneticStoreWrites;
    /**
     * <p>
     * The location to write error reports for records rejected asynchronously during magnetic store writes.
     * </p>
     */
    private MagneticStoreRejectedDataLocation magneticStoreRejectedDataLocation;

    /**
     * <p>
     * A flag to enable magnetic store writes.
     * </p>
     * 
     * @param enableMagneticStoreWrites
     *        A flag to enable magnetic store writes.
     */

    public void setEnableMagneticStoreWrites(Boolean enableMagneticStoreWrites) {
        this.enableMagneticStoreWrites = enableMagneticStoreWrites;
    }

    /**
     * <p>
     * A flag to enable magnetic store writes.
     * </p>
     * 
     * @return A flag to enable magnetic store writes.
     */

    public Boolean getEnableMagneticStoreWrites() {
        return this.enableMagneticStoreWrites;
    }

    /**
     * <p>
     * A flag to enable magnetic store writes.
     * </p>
     * 
     * @param enableMagneticStoreWrites
     *        A flag to enable magnetic store writes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MagneticStoreWriteProperties withEnableMagneticStoreWrites(Boolean enableMagneticStoreWrites) {
        setEnableMagneticStoreWrites(enableMagneticStoreWrites);
        return this;
    }

    /**
     * <p>
     * A flag to enable magnetic store writes.
     * </p>
     * 
     * @return A flag to enable magnetic store writes.
     */

    public Boolean isEnableMagneticStoreWrites() {
        return this.enableMagneticStoreWrites;
    }

    /**
     * <p>
     * The location to write error reports for records rejected asynchronously during magnetic store writes.
     * </p>
     * 
     * @param magneticStoreRejectedDataLocation
     *        The location to write error reports for records rejected asynchronously during magnetic store writes.
     */

    public void setMagneticStoreRejectedDataLocation(MagneticStoreRejectedDataLocation magneticStoreRejectedDataLocation) {
        this.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
    }

    /**
     * <p>
     * The location to write error reports for records rejected asynchronously during magnetic store writes.
     * </p>
     * 
     * @return The location to write error reports for records rejected asynchronously during magnetic store writes.
     */

    public MagneticStoreRejectedDataLocation getMagneticStoreRejectedDataLocation() {
        return this.magneticStoreRejectedDataLocation;
    }

    /**
     * <p>
     * The location to write error reports for records rejected asynchronously during magnetic store writes.
     * </p>
     * 
     * @param magneticStoreRejectedDataLocation
     *        The location to write error reports for records rejected asynchronously during magnetic store writes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MagneticStoreWriteProperties withMagneticStoreRejectedDataLocation(MagneticStoreRejectedDataLocation magneticStoreRejectedDataLocation) {
        setMagneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation);
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
        if (getEnableMagneticStoreWrites() != null)
            sb.append("EnableMagneticStoreWrites: ").append(getEnableMagneticStoreWrites()).append(",");
        if (getMagneticStoreRejectedDataLocation() != null)
            sb.append("MagneticStoreRejectedDataLocation: ").append(getMagneticStoreRejectedDataLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MagneticStoreWriteProperties == false)
            return false;
        MagneticStoreWriteProperties other = (MagneticStoreWriteProperties) obj;
        if (other.getEnableMagneticStoreWrites() == null ^ this.getEnableMagneticStoreWrites() == null)
            return false;
        if (other.getEnableMagneticStoreWrites() != null && other.getEnableMagneticStoreWrites().equals(this.getEnableMagneticStoreWrites()) == false)
            return false;
        if (other.getMagneticStoreRejectedDataLocation() == null ^ this.getMagneticStoreRejectedDataLocation() == null)
            return false;
        if (other.getMagneticStoreRejectedDataLocation() != null
                && other.getMagneticStoreRejectedDataLocation().equals(this.getMagneticStoreRejectedDataLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableMagneticStoreWrites() == null) ? 0 : getEnableMagneticStoreWrites().hashCode());
        hashCode = prime * hashCode + ((getMagneticStoreRejectedDataLocation() == null) ? 0 : getMagneticStoreRejectedDataLocation().hashCode());
        return hashCode;
    }

    @Override
    public MagneticStoreWriteProperties clone() {
        try {
            return (MagneticStoreWriteProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.MagneticStoreWritePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
