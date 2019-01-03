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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about one or more IP address blocks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/IpRouteInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpRouteInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier (ID) of the directory associated with the IP addresses.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * IP address block in the <a>IpRoute</a>.
     * </p>
     */
    private String cidrIp;
    /**
     * <p>
     * The status of the IP address block.
     * </p>
     */
    private String ipRouteStatusMsg;
    /**
     * <p>
     * The date and time the address block was added to the directory.
     * </p>
     */
    private java.util.Date addedDateTime;
    /**
     * <p>
     * The reason for the IpRouteStatusMsg.
     * </p>
     */
    private String ipRouteStatusReason;
    /**
     * <p>
     * Description of the <a>IpRouteInfo</a>.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Identifier (ID) of the directory associated with the IP addresses.
     * </p>
     * 
     * @param directoryId
     *        Identifier (ID) of the directory associated with the IP addresses.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * Identifier (ID) of the directory associated with the IP addresses.
     * </p>
     * 
     * @return Identifier (ID) of the directory associated with the IP addresses.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * Identifier (ID) of the directory associated with the IP addresses.
     * </p>
     * 
     * @param directoryId
     *        Identifier (ID) of the directory associated with the IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpRouteInfo withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * IP address block in the <a>IpRoute</a>.
     * </p>
     * 
     * @param cidrIp
     *        IP address block in the <a>IpRoute</a>.
     */

    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    /**
     * <p>
     * IP address block in the <a>IpRoute</a>.
     * </p>
     * 
     * @return IP address block in the <a>IpRoute</a>.
     */

    public String getCidrIp() {
        return this.cidrIp;
    }

    /**
     * <p>
     * IP address block in the <a>IpRoute</a>.
     * </p>
     * 
     * @param cidrIp
     *        IP address block in the <a>IpRoute</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpRouteInfo withCidrIp(String cidrIp) {
        setCidrIp(cidrIp);
        return this;
    }

    /**
     * <p>
     * The status of the IP address block.
     * </p>
     * 
     * @param ipRouteStatusMsg
     *        The status of the IP address block.
     * @see IpRouteStatusMsg
     */

    public void setIpRouteStatusMsg(String ipRouteStatusMsg) {
        this.ipRouteStatusMsg = ipRouteStatusMsg;
    }

    /**
     * <p>
     * The status of the IP address block.
     * </p>
     * 
     * @return The status of the IP address block.
     * @see IpRouteStatusMsg
     */

    public String getIpRouteStatusMsg() {
        return this.ipRouteStatusMsg;
    }

    /**
     * <p>
     * The status of the IP address block.
     * </p>
     * 
     * @param ipRouteStatusMsg
     *        The status of the IP address block.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpRouteStatusMsg
     */

    public IpRouteInfo withIpRouteStatusMsg(String ipRouteStatusMsg) {
        setIpRouteStatusMsg(ipRouteStatusMsg);
        return this;
    }

    /**
     * <p>
     * The status of the IP address block.
     * </p>
     * 
     * @param ipRouteStatusMsg
     *        The status of the IP address block.
     * @see IpRouteStatusMsg
     */

    public void setIpRouteStatusMsg(IpRouteStatusMsg ipRouteStatusMsg) {
        withIpRouteStatusMsg(ipRouteStatusMsg);
    }

    /**
     * <p>
     * The status of the IP address block.
     * </p>
     * 
     * @param ipRouteStatusMsg
     *        The status of the IP address block.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpRouteStatusMsg
     */

    public IpRouteInfo withIpRouteStatusMsg(IpRouteStatusMsg ipRouteStatusMsg) {
        this.ipRouteStatusMsg = ipRouteStatusMsg.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the address block was added to the directory.
     * </p>
     * 
     * @param addedDateTime
     *        The date and time the address block was added to the directory.
     */

    public void setAddedDateTime(java.util.Date addedDateTime) {
        this.addedDateTime = addedDateTime;
    }

    /**
     * <p>
     * The date and time the address block was added to the directory.
     * </p>
     * 
     * @return The date and time the address block was added to the directory.
     */

    public java.util.Date getAddedDateTime() {
        return this.addedDateTime;
    }

    /**
     * <p>
     * The date and time the address block was added to the directory.
     * </p>
     * 
     * @param addedDateTime
     *        The date and time the address block was added to the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpRouteInfo withAddedDateTime(java.util.Date addedDateTime) {
        setAddedDateTime(addedDateTime);
        return this;
    }

    /**
     * <p>
     * The reason for the IpRouteStatusMsg.
     * </p>
     * 
     * @param ipRouteStatusReason
     *        The reason for the IpRouteStatusMsg.
     */

    public void setIpRouteStatusReason(String ipRouteStatusReason) {
        this.ipRouteStatusReason = ipRouteStatusReason;
    }

    /**
     * <p>
     * The reason for the IpRouteStatusMsg.
     * </p>
     * 
     * @return The reason for the IpRouteStatusMsg.
     */

    public String getIpRouteStatusReason() {
        return this.ipRouteStatusReason;
    }

    /**
     * <p>
     * The reason for the IpRouteStatusMsg.
     * </p>
     * 
     * @param ipRouteStatusReason
     *        The reason for the IpRouteStatusMsg.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpRouteInfo withIpRouteStatusReason(String ipRouteStatusReason) {
        setIpRouteStatusReason(ipRouteStatusReason);
        return this;
    }

    /**
     * <p>
     * Description of the <a>IpRouteInfo</a>.
     * </p>
     * 
     * @param description
     *        Description of the <a>IpRouteInfo</a>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the <a>IpRouteInfo</a>.
     * </p>
     * 
     * @return Description of the <a>IpRouteInfo</a>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the <a>IpRouteInfo</a>.
     * </p>
     * 
     * @param description
     *        Description of the <a>IpRouteInfo</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpRouteInfo withDescription(String description) {
        setDescription(description);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getCidrIp() != null)
            sb.append("CidrIp: ").append(getCidrIp()).append(",");
        if (getIpRouteStatusMsg() != null)
            sb.append("IpRouteStatusMsg: ").append(getIpRouteStatusMsg()).append(",");
        if (getAddedDateTime() != null)
            sb.append("AddedDateTime: ").append(getAddedDateTime()).append(",");
        if (getIpRouteStatusReason() != null)
            sb.append("IpRouteStatusReason: ").append(getIpRouteStatusReason()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpRouteInfo == false)
            return false;
        IpRouteInfo other = (IpRouteInfo) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getCidrIp() == null ^ this.getCidrIp() == null)
            return false;
        if (other.getCidrIp() != null && other.getCidrIp().equals(this.getCidrIp()) == false)
            return false;
        if (other.getIpRouteStatusMsg() == null ^ this.getIpRouteStatusMsg() == null)
            return false;
        if (other.getIpRouteStatusMsg() != null && other.getIpRouteStatusMsg().equals(this.getIpRouteStatusMsg()) == false)
            return false;
        if (other.getAddedDateTime() == null ^ this.getAddedDateTime() == null)
            return false;
        if (other.getAddedDateTime() != null && other.getAddedDateTime().equals(this.getAddedDateTime()) == false)
            return false;
        if (other.getIpRouteStatusReason() == null ^ this.getIpRouteStatusReason() == null)
            return false;
        if (other.getIpRouteStatusReason() != null && other.getIpRouteStatusReason().equals(this.getIpRouteStatusReason()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getCidrIp() == null) ? 0 : getCidrIp().hashCode());
        hashCode = prime * hashCode + ((getIpRouteStatusMsg() == null) ? 0 : getIpRouteStatusMsg().hashCode());
        hashCode = prime * hashCode + ((getAddedDateTime() == null) ? 0 : getAddedDateTime().hashCode());
        hashCode = prime * hashCode + ((getIpRouteStatusReason() == null) ? 0 : getIpRouteStatusReason().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public IpRouteInfo clone() {
        try {
            return (IpRouteInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.IpRouteInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
