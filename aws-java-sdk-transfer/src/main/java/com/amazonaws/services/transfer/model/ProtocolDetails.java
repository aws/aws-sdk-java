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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The protocol settings that are configured for your server.
 * </p>
 * <note>
 * <p>
 * This type is only valid in the <code>UpdateServer</code> API.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ProtocolDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtocolDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates passive mode, for FTP and FTPS protocols. Enter a single dotted-quad IPv4 address, such as the external
     * IP address of a firewall, router, or load balancer. For example:
     * </p>
     * <p>
     * <code> aws transfer update-server --protocol-details PassiveIp=<i>0.0.0.0</i> </code>
     * </p>
     * <p>
     * Replace <code> <i>0.0.0.0</i> </code> in the example above with the actual IP address you want to use.
     * </p>
     */
    private String passiveIp;

    /**
     * <p>
     * Indicates passive mode, for FTP and FTPS protocols. Enter a single dotted-quad IPv4 address, such as the external
     * IP address of a firewall, router, or load balancer. For example:
     * </p>
     * <p>
     * <code> aws transfer update-server --protocol-details PassiveIp=<i>0.0.0.0</i> </code>
     * </p>
     * <p>
     * Replace <code> <i>0.0.0.0</i> </code> in the example above with the actual IP address you want to use.
     * </p>
     * 
     * @param passiveIp
     *        Indicates passive mode, for FTP and FTPS protocols. Enter a single dotted-quad IPv4 address, such as the
     *        external IP address of a firewall, router, or load balancer. For example: </p>
     *        <p>
     *        <code> aws transfer update-server --protocol-details PassiveIp=<i>0.0.0.0</i> </code>
     *        </p>
     *        <p>
     *        Replace <code> <i>0.0.0.0</i> </code> in the example above with the actual IP address you want to use.
     */

    public void setPassiveIp(String passiveIp) {
        this.passiveIp = passiveIp;
    }

    /**
     * <p>
     * Indicates passive mode, for FTP and FTPS protocols. Enter a single dotted-quad IPv4 address, such as the external
     * IP address of a firewall, router, or load balancer. For example:
     * </p>
     * <p>
     * <code> aws transfer update-server --protocol-details PassiveIp=<i>0.0.0.0</i> </code>
     * </p>
     * <p>
     * Replace <code> <i>0.0.0.0</i> </code> in the example above with the actual IP address you want to use.
     * </p>
     * 
     * @return Indicates passive mode, for FTP and FTPS protocols. Enter a single dotted-quad IPv4 address, such as the
     *         external IP address of a firewall, router, or load balancer. For example: </p>
     *         <p>
     *         <code> aws transfer update-server --protocol-details PassiveIp=<i>0.0.0.0</i> </code>
     *         </p>
     *         <p>
     *         Replace <code> <i>0.0.0.0</i> </code> in the example above with the actual IP address you want to use.
     */

    public String getPassiveIp() {
        return this.passiveIp;
    }

    /**
     * <p>
     * Indicates passive mode, for FTP and FTPS protocols. Enter a single dotted-quad IPv4 address, such as the external
     * IP address of a firewall, router, or load balancer. For example:
     * </p>
     * <p>
     * <code> aws transfer update-server --protocol-details PassiveIp=<i>0.0.0.0</i> </code>
     * </p>
     * <p>
     * Replace <code> <i>0.0.0.0</i> </code> in the example above with the actual IP address you want to use.
     * </p>
     * 
     * @param passiveIp
     *        Indicates passive mode, for FTP and FTPS protocols. Enter a single dotted-quad IPv4 address, such as the
     *        external IP address of a firewall, router, or load balancer. For example: </p>
     *        <p>
     *        <code> aws transfer update-server --protocol-details PassiveIp=<i>0.0.0.0</i> </code>
     *        </p>
     *        <p>
     *        Replace <code> <i>0.0.0.0</i> </code> in the example above with the actual IP address you want to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolDetails withPassiveIp(String passiveIp) {
        setPassiveIp(passiveIp);
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
        if (getPassiveIp() != null)
            sb.append("PassiveIp: ").append(getPassiveIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtocolDetails == false)
            return false;
        ProtocolDetails other = (ProtocolDetails) obj;
        if (other.getPassiveIp() == null ^ this.getPassiveIp() == null)
            return false;
        if (other.getPassiveIp() != null && other.getPassiveIp().equals(this.getPassiveIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPassiveIp() == null) ? 0 : getPassiveIp().hashCode());
        return hashCode;
    }

    @Override
    public ProtocolDetails clone() {
        try {
            return (ProtocolDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ProtocolDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
