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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an uplink echo <code>Config</code>.
 * </p>
 * <p>
 * Parameters from the <code>AntennaUplinkConfig</code>, corresponding to the specified
 * <code>AntennaUplinkConfigArn</code>, are used when this <code>UplinkEchoConfig</code> is used in a contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UplinkEchoConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UplinkEchoConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of an uplink <code>Config</code>.
     * </p>
     */
    private String antennaUplinkConfigArn;
    /**
     * <p>
     * Whether or not an uplink <code>Config</code> is enabled.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * ARN of an uplink <code>Config</code>.
     * </p>
     * 
     * @param antennaUplinkConfigArn
     *        ARN of an uplink <code>Config</code>.
     */

    public void setAntennaUplinkConfigArn(String antennaUplinkConfigArn) {
        this.antennaUplinkConfigArn = antennaUplinkConfigArn;
    }

    /**
     * <p>
     * ARN of an uplink <code>Config</code>.
     * </p>
     * 
     * @return ARN of an uplink <code>Config</code>.
     */

    public String getAntennaUplinkConfigArn() {
        return this.antennaUplinkConfigArn;
    }

    /**
     * <p>
     * ARN of an uplink <code>Config</code>.
     * </p>
     * 
     * @param antennaUplinkConfigArn
     *        ARN of an uplink <code>Config</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UplinkEchoConfig withAntennaUplinkConfigArn(String antennaUplinkConfigArn) {
        setAntennaUplinkConfigArn(antennaUplinkConfigArn);
        return this;
    }

    /**
     * <p>
     * Whether or not an uplink <code>Config</code> is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether or not an uplink <code>Config</code> is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether or not an uplink <code>Config</code> is enabled.
     * </p>
     * 
     * @return Whether or not an uplink <code>Config</code> is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether or not an uplink <code>Config</code> is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether or not an uplink <code>Config</code> is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UplinkEchoConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether or not an uplink <code>Config</code> is enabled.
     * </p>
     * 
     * @return Whether or not an uplink <code>Config</code> is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getAntennaUplinkConfigArn() != null)
            sb.append("AntennaUplinkConfigArn: ").append(getAntennaUplinkConfigArn()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UplinkEchoConfig == false)
            return false;
        UplinkEchoConfig other = (UplinkEchoConfig) obj;
        if (other.getAntennaUplinkConfigArn() == null ^ this.getAntennaUplinkConfigArn() == null)
            return false;
        if (other.getAntennaUplinkConfigArn() != null && other.getAntennaUplinkConfigArn().equals(this.getAntennaUplinkConfigArn()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAntennaUplinkConfigArn() == null) ? 0 : getAntennaUplinkConfigArn().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public UplinkEchoConfig clone() {
        try {
            return (UplinkEchoConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.UplinkEchoConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
