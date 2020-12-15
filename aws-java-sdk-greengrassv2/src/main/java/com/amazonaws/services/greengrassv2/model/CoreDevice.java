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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a AWS IoT Greengrass core device, which is an AWS IoT thing that runs the AWS IoT
 * Greengrass Core software.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CoreDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreDevice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     */
    private String coreDeviceThingName;
    /**
     * <p>
     * The status of the core device. Core devices can have the following statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device without
     * issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the core
     * device.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The time at which the core device's status last updated, expressed in ISO 8601 format.
     * </p>
     */
    private java.util.Date lastStatusUpdateTimestamp;

    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     * 
     * @param coreDeviceThingName
     *        The name of the core device. This is also the name of the AWS IoT thing.
     */

    public void setCoreDeviceThingName(String coreDeviceThingName) {
        this.coreDeviceThingName = coreDeviceThingName;
    }

    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     * 
     * @return The name of the core device. This is also the name of the AWS IoT thing.
     */

    public String getCoreDeviceThingName() {
        return this.coreDeviceThingName;
    }

    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     * 
     * @param coreDeviceThingName
     *        The name of the core device. This is also the name of the AWS IoT thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreDevice withCoreDeviceThingName(String coreDeviceThingName) {
        setCoreDeviceThingName(coreDeviceThingName);
        return this;
    }

    /**
     * <p>
     * The status of the core device. Core devices can have the following statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device without
     * issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the core
     * device.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the core device. Core devices can have the following statuses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device
     *        without issue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the
     *        core device.
     *        </p>
     *        </li>
     * @see CoreDeviceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the core device. Core devices can have the following statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device without
     * issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the core
     * device.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the core device. Core devices can have the following statuses:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device
     *         without issue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the
     *         core device.
     *         </p>
     *         </li>
     * @see CoreDeviceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the core device. Core devices can have the following statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device without
     * issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the core
     * device.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the core device. Core devices can have the following statuses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device
     *        without issue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the
     *        core device.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoreDeviceStatus
     */

    public CoreDevice withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the core device. Core devices can have the following statuses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device without
     * issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the core
     * device.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the core device. Core devices can have the following statuses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> – The AWS IoT Greengrass Core software and all components run on the core device
     *        without issue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNHEALTHY</code> – The AWS IoT Greengrass Core software or a component is in a failed state on the
     *        core device.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoreDeviceStatus
     */

    public CoreDevice withStatus(CoreDeviceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the core device's status last updated, expressed in ISO 8601 format.
     * </p>
     * 
     * @param lastStatusUpdateTimestamp
     *        The time at which the core device's status last updated, expressed in ISO 8601 format.
     */

    public void setLastStatusUpdateTimestamp(java.util.Date lastStatusUpdateTimestamp) {
        this.lastStatusUpdateTimestamp = lastStatusUpdateTimestamp;
    }

    /**
     * <p>
     * The time at which the core device's status last updated, expressed in ISO 8601 format.
     * </p>
     * 
     * @return The time at which the core device's status last updated, expressed in ISO 8601 format.
     */

    public java.util.Date getLastStatusUpdateTimestamp() {
        return this.lastStatusUpdateTimestamp;
    }

    /**
     * <p>
     * The time at which the core device's status last updated, expressed in ISO 8601 format.
     * </p>
     * 
     * @param lastStatusUpdateTimestamp
     *        The time at which the core device's status last updated, expressed in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreDevice withLastStatusUpdateTimestamp(java.util.Date lastStatusUpdateTimestamp) {
        setLastStatusUpdateTimestamp(lastStatusUpdateTimestamp);
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
            sb.append("CoreDeviceThingName: ").append(getCoreDeviceThingName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastStatusUpdateTimestamp() != null)
            sb.append("LastStatusUpdateTimestamp: ").append(getLastStatusUpdateTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoreDevice == false)
            return false;
        CoreDevice other = (CoreDevice) obj;
        if (other.getCoreDeviceThingName() == null ^ this.getCoreDeviceThingName() == null)
            return false;
        if (other.getCoreDeviceThingName() != null && other.getCoreDeviceThingName().equals(this.getCoreDeviceThingName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastStatusUpdateTimestamp() == null ^ this.getLastStatusUpdateTimestamp() == null)
            return false;
        if (other.getLastStatusUpdateTimestamp() != null && other.getLastStatusUpdateTimestamp().equals(this.getLastStatusUpdateTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreDeviceThingName() == null) ? 0 : getCoreDeviceThingName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastStatusUpdateTimestamp() == null) ? 0 : getLastStatusUpdateTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public CoreDevice clone() {
        try {
            return (CoreDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.CoreDeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
