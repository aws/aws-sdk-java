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
 * Lists iSCSI information about a volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/VolumeiSCSIAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeiSCSIAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     */
    private String targetARN;
    /**
     * <p>
     * The network interface identifier.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The port used to communicate with iSCSI targets.
     * </p>
     */
    private Integer networkInterfacePort;
    /**
     * <p>
     * The logical disk number.
     * </p>
     */
    private Integer lunNumber;
    /**
     * <p>
     * Indicates whether mutual CHAP is enabled for the iSCSI target.
     * </p>
     */
    private Boolean chapEnabled;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     * 
     * @param targetARN
     *        The Amazon Resource Name (ARN) of the volume target.
     */

    public void setTargetARN(String targetARN) {
        this.targetARN = targetARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the volume target.
     */

    public String getTargetARN() {
        return this.targetARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume target.
     * </p>
     * 
     * @param targetARN
     *        The Amazon Resource Name (ARN) of the volume target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeiSCSIAttributes withTargetARN(String targetARN) {
        setTargetARN(targetARN);
        return this;
    }

    /**
     * <p>
     * The network interface identifier.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface identifier.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The network interface identifier.
     * </p>
     * 
     * @return The network interface identifier.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The network interface identifier.
     * </p>
     * 
     * @param networkInterfaceId
     *        The network interface identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeiSCSIAttributes withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The port used to communicate with iSCSI targets.
     * </p>
     * 
     * @param networkInterfacePort
     *        The port used to communicate with iSCSI targets.
     */

    public void setNetworkInterfacePort(Integer networkInterfacePort) {
        this.networkInterfacePort = networkInterfacePort;
    }

    /**
     * <p>
     * The port used to communicate with iSCSI targets.
     * </p>
     * 
     * @return The port used to communicate with iSCSI targets.
     */

    public Integer getNetworkInterfacePort() {
        return this.networkInterfacePort;
    }

    /**
     * <p>
     * The port used to communicate with iSCSI targets.
     * </p>
     * 
     * @param networkInterfacePort
     *        The port used to communicate with iSCSI targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeiSCSIAttributes withNetworkInterfacePort(Integer networkInterfacePort) {
        setNetworkInterfacePort(networkInterfacePort);
        return this;
    }

    /**
     * <p>
     * The logical disk number.
     * </p>
     * 
     * @param lunNumber
     *        The logical disk number.
     */

    public void setLunNumber(Integer lunNumber) {
        this.lunNumber = lunNumber;
    }

    /**
     * <p>
     * The logical disk number.
     * </p>
     * 
     * @return The logical disk number.
     */

    public Integer getLunNumber() {
        return this.lunNumber;
    }

    /**
     * <p>
     * The logical disk number.
     * </p>
     * 
     * @param lunNumber
     *        The logical disk number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeiSCSIAttributes withLunNumber(Integer lunNumber) {
        setLunNumber(lunNumber);
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

    public VolumeiSCSIAttributes withChapEnabled(Boolean chapEnabled) {
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
        if (getLunNumber() != null)
            sb.append("LunNumber: ").append(getLunNumber()).append(",");
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

        if (obj instanceof VolumeiSCSIAttributes == false)
            return false;
        VolumeiSCSIAttributes other = (VolumeiSCSIAttributes) obj;
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
        if (other.getLunNumber() == null ^ this.getLunNumber() == null)
            return false;
        if (other.getLunNumber() != null && other.getLunNumber().equals(this.getLunNumber()) == false)
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
        hashCode = prime * hashCode + ((getLunNumber() == null) ? 0 : getLunNumber().hashCode());
        hashCode = prime * hashCode + ((getChapEnabled() == null) ? 0 : getChapEnabled().hashCode());
        return hashCode;
    }

    @Override
    public VolumeiSCSIAttributes clone() {
        try {
            return (VolumeiSCSIAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.VolumeiSCSIAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
