/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists iSCSI information about a VTL device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DeviceiSCSIAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceiSCSIAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) that encodes the iSCSI qualified name(iqn) of a tape drive or
     * media changer target.
     * </p>
     */
    private String targetARN;
    /**
     * <p>
     * The network interface identifier of the VTL device.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The port used to communicate with iSCSI VTL device targets.
     * </p>
     */
    private Integer networkInterfacePort;
    /**
     * <p>
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     * </p>
     */
    private Boolean chapEnabled;

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) that encodes the iSCSI qualified name(iqn) of a tape drive or
     * media changer target.
     * </p>
     * 
     * @param targetARN
     *        Specifies the unique Amazon Resource Name (ARN) that encodes the iSCSI qualified name(iqn) of a tape drive
     *        or media changer target.
     */

    public void setTargetARN(String targetARN) {
        this.targetARN = targetARN;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) that encodes the iSCSI qualified name(iqn) of a tape drive or
     * media changer target.
     * </p>
     * 
     * @return Specifies the unique Amazon Resource Name (ARN) that encodes the iSCSI qualified name(iqn) of a tape
     *         drive or media changer target.
     */

    public String getTargetARN() {
        return this.targetARN;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) that encodes the iSCSI qualified name(iqn) of a tape drive or
     * media changer target.
     * </p>
     * 
     * @param targetARN
     *        Specifies the unique Amazon Resource Name (ARN) that encodes the iSCSI qualified name(iqn) of a tape drive
     *        or media changer target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceiSCSIAttributes withTargetARN(String targetARN) {
        setTargetARN(targetARN);
        return this;
    }

    /**
     * <p>
     * The network interface identifier of the VTL device.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface identifier of the VTL device.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The network interface identifier of the VTL device.
     * </p>
     * 
     * @return The network interface identifier of the VTL device.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The network interface identifier of the VTL device.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface identifier of the VTL device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceiSCSIAttributes withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The port used to communicate with iSCSI VTL device targets.
     * </p>
     * 
     * @param networkInterfacePort
     *        The port used to communicate with iSCSI VTL device targets.
     */

    public void setNetworkInterfacePort(Integer networkInterfacePort) {
        this.networkInterfacePort = networkInterfacePort;
    }

    /**
     * <p>
     * The port used to communicate with iSCSI VTL device targets.
     * </p>
     * 
     * @return The port used to communicate with iSCSI VTL device targets.
     */

    public Integer getNetworkInterfacePort() {
        return this.networkInterfacePort;
    }

    /**
     * <p>
     * The port used to communicate with iSCSI VTL device targets.
     * </p>
     * 
     * @param networkInterfacePort
     *        The port used to communicate with iSCSI VTL device targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceiSCSIAttributes withNetworkInterfacePort(Integer networkInterfacePort) {
        setNetworkInterfacePort(networkInterfacePort);
        return this;
    }

    /**
     * <p>
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     * </p>
     * 
     * @param chapEnabled
     *        Indicates whether mutual CHAP is enabled for the iSCSI target.
     */

    public void setChapEnabled(Boolean chapEnabled) {
        this.chapEnabled = chapEnabled;
    }

    /**
     * <p>
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     * </p>
     * 
     * @return Indicates whether mutual CHAP is enabled for the iSCSI target.
     */

    public Boolean getChapEnabled() {
        return this.chapEnabled;
    }

    /**
     * <p>
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     * </p>
     * 
     * @param chapEnabled
     *        Indicates whether mutual CHAP is enabled for the iSCSI target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceiSCSIAttributes withChapEnabled(Boolean chapEnabled) {
        setChapEnabled(chapEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     * </p>
     * 
     * @return Indicates whether mutual CHAP is enabled for the iSCSI target.
     */

    public Boolean isChapEnabled() {
        return this.chapEnabled;
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
        if (getTargetARN() != null)
            sb.append("TargetARN: ").append(getTargetARN()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getNetworkInterfacePort() != null)
            sb.append("NetworkInterfacePort: ").append(getNetworkInterfacePort()).append(",");
        if (getChapEnabled() != null)
            sb.append("ChapEnabled: ").append(getChapEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceiSCSIAttributes == false)
            return false;
        DeviceiSCSIAttributes other = (DeviceiSCSIAttributes) obj;
        if (other.getTargetARN() == null ^ this.getTargetARN() == null)
            return false;
        if (other.getTargetARN() != null && other.getTargetARN().equals(this.getTargetARN()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getNetworkInterfacePort() == null ^ this.getNetworkInterfacePort() == null)
            return false;
        if (other.getNetworkInterfacePort() != null && other.getNetworkInterfacePort().equals(this.getNetworkInterfacePort()) == false)
            return false;
        if (other.getChapEnabled() == null ^ this.getChapEnabled() == null)
            return false;
        if (other.getChapEnabled() != null && other.getChapEnabled().equals(this.getChapEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetARN() == null) ? 0 : getTargetARN().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfacePort() == null) ? 0 : getNetworkInterfacePort().hashCode());
        hashCode = prime * hashCode + ((getChapEnabled() == null) ? 0 : getChapEnabled().hashCode());
        return hashCode;
    }

    @Override
    public DeviceiSCSIAttributes clone() {
        try {
            return (DeviceiSCSIAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.DeviceiSCSIAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
