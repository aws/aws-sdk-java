/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * LoRaWANServiceProfile object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANServiceProfile" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANServiceProfile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AddGWMetaData value.
     * </p>
     */
    private Boolean addGwMetadata;

    /**
     * <p>
     * The AddGWMetaData value.
     * </p>
     * 
     * @param addGwMetadata
     *        The AddGWMetaData value.
     */

    public void setAddGwMetadata(Boolean addGwMetadata) {
        this.addGwMetadata = addGwMetadata;
    }

    /**
     * <p>
     * The AddGWMetaData value.
     * </p>
     * 
     * @return The AddGWMetaData value.
     */

    public Boolean getAddGwMetadata() {
        return this.addGwMetadata;
    }

    /**
     * <p>
     * The AddGWMetaData value.
     * </p>
     * 
     * @param addGwMetadata
     *        The AddGWMetaData value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANServiceProfile withAddGwMetadata(Boolean addGwMetadata) {
        setAddGwMetadata(addGwMetadata);
        return this;
    }

    /**
     * <p>
     * The AddGWMetaData value.
     * </p>
     * 
     * @return The AddGWMetaData value.
     */

    public Boolean isAddGwMetadata() {
        return this.addGwMetadata;
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
        if (getAddGwMetadata() != null)
            sb.append("AddGwMetadata: ").append(getAddGwMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANServiceProfile == false)
            return false;
        LoRaWANServiceProfile other = (LoRaWANServiceProfile) obj;
        if (other.getAddGwMetadata() == null ^ this.getAddGwMetadata() == null)
            return false;
        if (other.getAddGwMetadata() != null && other.getAddGwMetadata().equals(this.getAddGwMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddGwMetadata() == null) ? 0 : getAddGwMetadata().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANServiceProfile clone() {
        try {
            return (LoRaWANServiceProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANServiceProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
