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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on suspicious IP addresses identified as indicators of compromise. This indicator is derived
 * from Amazon Web Services threat intelligence.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/FlaggedIpAddressDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlaggedIpAddressDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * IP address of the suspicious entity.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * Details the reason the IP address was flagged as suspicious.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * IP address of the suspicious entity.
     * </p>
     * 
     * @param ipAddress
     *        IP address of the suspicious entity.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * IP address of the suspicious entity.
     * </p>
     * 
     * @return IP address of the suspicious entity.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * IP address of the suspicious entity.
     * </p>
     * 
     * @param ipAddress
     *        IP address of the suspicious entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlaggedIpAddressDetail withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * Details the reason the IP address was flagged as suspicious.
     * </p>
     * 
     * @param reason
     *        Details the reason the IP address was flagged as suspicious.
     * @see Reason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Details the reason the IP address was flagged as suspicious.
     * </p>
     * 
     * @return Details the reason the IP address was flagged as suspicious.
     * @see Reason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * Details the reason the IP address was flagged as suspicious.
     * </p>
     * 
     * @param reason
     *        Details the reason the IP address was flagged as suspicious.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Reason
     */

    public FlaggedIpAddressDetail withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * Details the reason the IP address was flagged as suspicious.
     * </p>
     * 
     * @param reason
     *        Details the reason the IP address was flagged as suspicious.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Reason
     */

    public FlaggedIpAddressDetail withReason(Reason reason) {
        this.reason = reason.toString();
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
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlaggedIpAddressDetail == false)
            return false;
        FlaggedIpAddressDetail other = (FlaggedIpAddressDetail) obj;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public FlaggedIpAddressDetail clone() {
        try {
            return (FlaggedIpAddressDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.FlaggedIpAddressDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
