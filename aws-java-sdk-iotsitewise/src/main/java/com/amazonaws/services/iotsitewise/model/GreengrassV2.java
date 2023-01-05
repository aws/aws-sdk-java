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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details for a gateway that runs on IoT Greengrass V2. To create a gateway that runs on IoT Greengrass V2,
 * you must deploy the IoT SiteWise Edge component to your gateway device. Your <a
 * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/device-service-role.html">Greengrass device role</a>
 * must use the <code>AWSIoTSiteWiseEdgeAccess</code> policy. For more information, see <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/sw-gateways.html">Using IoT SiteWise at the edge</a>
 * in the <i>IoT SiteWise User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GreengrassV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GreengrassV2 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the IoT thing for your IoT Greengrass V2 core device.
     * </p>
     */
    private String coreDeviceThingName;

    /**
     * <p>
     * The name of the IoT thing for your IoT Greengrass V2 core device.
     * </p>
     * 
     * @param coreDeviceThingName
     *        The name of the IoT thing for your IoT Greengrass V2 core device.
     */

    public void setCoreDeviceThingName(String coreDeviceThingName) {
        this.coreDeviceThingName = coreDeviceThingName;
    }

    /**
     * <p>
     * The name of the IoT thing for your IoT Greengrass V2 core device.
     * </p>
     * 
     * @return The name of the IoT thing for your IoT Greengrass V2 core device.
     */

    public String getCoreDeviceThingName() {
        return this.coreDeviceThingName;
    }

    /**
     * <p>
     * The name of the IoT thing for your IoT Greengrass V2 core device.
     * </p>
     * 
     * @param coreDeviceThingName
     *        The name of the IoT thing for your IoT Greengrass V2 core device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GreengrassV2 withCoreDeviceThingName(String coreDeviceThingName) {
        setCoreDeviceThingName(coreDeviceThingName);
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
        if (getCoreDeviceThingName() != null)
            sb.append("CoreDeviceThingName: ").append(getCoreDeviceThingName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GreengrassV2 == false)
            return false;
        GreengrassV2 other = (GreengrassV2) obj;
        if (other.getCoreDeviceThingName() == null ^ this.getCoreDeviceThingName() == null)
            return false;
        if (other.getCoreDeviceThingName() != null && other.getCoreDeviceThingName().equals(this.getCoreDeviceThingName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreDeviceThingName() == null) ? 0 : getCoreDeviceThingName().hashCode());
        return hashCode;
    }

    @Override
    public GreengrassV2 clone() {
        try {
            return (GreengrassV2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.GreengrassV2Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
