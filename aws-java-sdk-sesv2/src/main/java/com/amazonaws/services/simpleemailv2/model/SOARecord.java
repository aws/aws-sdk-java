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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about the start of authority (SOA) record associated with the identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SOARecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SOARecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Primary name server specified in the SOA record.
     * </p>
     */
    private String primaryNameServer;
    /**
     * <p>
     * Administrative contact email from the SOA record.
     * </p>
     */
    private String adminEmail;
    /**
     * <p>
     * Serial number from the SOA record.
     * </p>
     */
    private Long serialNumber;

    /**
     * <p>
     * Primary name server specified in the SOA record.
     * </p>
     * 
     * @param primaryNameServer
     *        Primary name server specified in the SOA record.
     */

    public void setPrimaryNameServer(String primaryNameServer) {
        this.primaryNameServer = primaryNameServer;
    }

    /**
     * <p>
     * Primary name server specified in the SOA record.
     * </p>
     * 
     * @return Primary name server specified in the SOA record.
     */

    public String getPrimaryNameServer() {
        return this.primaryNameServer;
    }

    /**
     * <p>
     * Primary name server specified in the SOA record.
     * </p>
     * 
     * @param primaryNameServer
     *        Primary name server specified in the SOA record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SOARecord withPrimaryNameServer(String primaryNameServer) {
        setPrimaryNameServer(primaryNameServer);
        return this;
    }

    /**
     * <p>
     * Administrative contact email from the SOA record.
     * </p>
     * 
     * @param adminEmail
     *        Administrative contact email from the SOA record.
     */

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    /**
     * <p>
     * Administrative contact email from the SOA record.
     * </p>
     * 
     * @return Administrative contact email from the SOA record.
     */

    public String getAdminEmail() {
        return this.adminEmail;
    }

    /**
     * <p>
     * Administrative contact email from the SOA record.
     * </p>
     * 
     * @param adminEmail
     *        Administrative contact email from the SOA record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SOARecord withAdminEmail(String adminEmail) {
        setAdminEmail(adminEmail);
        return this;
    }

    /**
     * <p>
     * Serial number from the SOA record.
     * </p>
     * 
     * @param serialNumber
     *        Serial number from the SOA record.
     */

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * Serial number from the SOA record.
     * </p>
     * 
     * @return Serial number from the SOA record.
     */

    public Long getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * Serial number from the SOA record.
     * </p>
     * 
     * @param serialNumber
     *        Serial number from the SOA record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SOARecord withSerialNumber(Long serialNumber) {
        setSerialNumber(serialNumber);
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
        if (getPrimaryNameServer() != null)
            sb.append("PrimaryNameServer: ").append(getPrimaryNameServer()).append(",");
        if (getAdminEmail() != null)
            sb.append("AdminEmail: ").append(getAdminEmail()).append(",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SOARecord == false)
            return false;
        SOARecord other = (SOARecord) obj;
        if (other.getPrimaryNameServer() == null ^ this.getPrimaryNameServer() == null)
            return false;
        if (other.getPrimaryNameServer() != null && other.getPrimaryNameServer().equals(this.getPrimaryNameServer()) == false)
            return false;
        if (other.getAdminEmail() == null ^ this.getAdminEmail() == null)
            return false;
        if (other.getAdminEmail() != null && other.getAdminEmail().equals(this.getAdminEmail()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimaryNameServer() == null) ? 0 : getPrimaryNameServer().hashCode());
        hashCode = prime * hashCode + ((getAdminEmail() == null) ? 0 : getAdminEmail().hashCode());
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        return hashCode;
    }

    @Override
    public SOARecord clone() {
        try {
            return (SOARecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.SOARecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
