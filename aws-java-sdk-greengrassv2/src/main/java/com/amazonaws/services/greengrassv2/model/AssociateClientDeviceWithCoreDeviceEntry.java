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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a request to associate a client device with a core device. The <a
 * href="https://docs.aws.amazon.com/greengrass/v2/APIReference/API_BatchAssociateClientDeviceWithCoreDevice.html"
 * >BatchAssociateClientDeviceWithCoreDevice</a> operation consumes a list of these requests.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/AssociateClientDeviceWithCoreDeviceEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateClientDeviceWithCoreDeviceEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AWS IoT thing that represents the client device to associate.
     * </p>
     */
    private String thingName;

    /**
     * <p>
     * The name of the AWS IoT thing that represents the client device to associate.
     * </p>
     * 
     * @param thingName
     *        The name of the AWS IoT thing that represents the client device to associate.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the AWS IoT thing that represents the client device to associate.
     * </p>
     * 
     * @return The name of the AWS IoT thing that represents the client device to associate.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the AWS IoT thing that represents the client device to associate.
     * </p>
     * 
     * @param thingName
     *        The name of the AWS IoT thing that represents the client device to associate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateClientDeviceWithCoreDeviceEntry withThingName(String thingName) {
        setThingName(thingName);
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
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateClientDeviceWithCoreDeviceEntry == false)
            return false;
        AssociateClientDeviceWithCoreDeviceEntry other = (AssociateClientDeviceWithCoreDeviceEntry) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        return hashCode;
    }

    @Override
    public AssociateClientDeviceWithCoreDeviceEntry clone() {
        try {
            return (AssociateClientDeviceWithCoreDeviceEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.AssociateClientDeviceWithCoreDeviceEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
