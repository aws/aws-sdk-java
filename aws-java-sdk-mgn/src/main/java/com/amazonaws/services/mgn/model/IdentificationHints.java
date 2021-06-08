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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identification hints.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/IdentificationHints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentificationHints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * AWS Instance ID identification hint.
     * </p>
     */
    private String awsInstanceID;
    /**
     * <p>
     * FQDN address identification hint.
     * </p>
     */
    private String fqdn;
    /**
     * <p>
     * Hostname identification hint.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * vmWare UUID identification hint.
     * </p>
     */
    private String vmWareUuid;

    /**
     * <p>
     * AWS Instance ID identification hint.
     * </p>
     * 
     * @param awsInstanceID
     *        AWS Instance ID identification hint.
     */

    public void setAwsInstanceID(String awsInstanceID) {
        this.awsInstanceID = awsInstanceID;
    }

    /**
     * <p>
     * AWS Instance ID identification hint.
     * </p>
     * 
     * @return AWS Instance ID identification hint.
     */

    public String getAwsInstanceID() {
        return this.awsInstanceID;
    }

    /**
     * <p>
     * AWS Instance ID identification hint.
     * </p>
     * 
     * @param awsInstanceID
     *        AWS Instance ID identification hint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentificationHints withAwsInstanceID(String awsInstanceID) {
        setAwsInstanceID(awsInstanceID);
        return this;
    }

    /**
     * <p>
     * FQDN address identification hint.
     * </p>
     * 
     * @param fqdn
     *        FQDN address identification hint.
     */

    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
    }

    /**
     * <p>
     * FQDN address identification hint.
     * </p>
     * 
     * @return FQDN address identification hint.
     */

    public String getFqdn() {
        return this.fqdn;
    }

    /**
     * <p>
     * FQDN address identification hint.
     * </p>
     * 
     * @param fqdn
     *        FQDN address identification hint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentificationHints withFqdn(String fqdn) {
        setFqdn(fqdn);
        return this;
    }

    /**
     * <p>
     * Hostname identification hint.
     * </p>
     * 
     * @param hostname
     *        Hostname identification hint.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * Hostname identification hint.
     * </p>
     * 
     * @return Hostname identification hint.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * Hostname identification hint.
     * </p>
     * 
     * @param hostname
     *        Hostname identification hint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentificationHints withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * vmWare UUID identification hint.
     * </p>
     * 
     * @param vmWareUuid
     *        vmWare UUID identification hint.
     */

    public void setVmWareUuid(String vmWareUuid) {
        this.vmWareUuid = vmWareUuid;
    }

    /**
     * <p>
     * vmWare UUID identification hint.
     * </p>
     * 
     * @return vmWare UUID identification hint.
     */

    public String getVmWareUuid() {
        return this.vmWareUuid;
    }

    /**
     * <p>
     * vmWare UUID identification hint.
     * </p>
     * 
     * @param vmWareUuid
     *        vmWare UUID identification hint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentificationHints withVmWareUuid(String vmWareUuid) {
        setVmWareUuid(vmWareUuid);
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
        if (getAwsInstanceID() != null)
            sb.append("AwsInstanceID: ").append(getAwsInstanceID()).append(",");
        if (getFqdn() != null)
            sb.append("Fqdn: ").append(getFqdn()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getVmWareUuid() != null)
            sb.append("VmWareUuid: ").append(getVmWareUuid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentificationHints == false)
            return false;
        IdentificationHints other = (IdentificationHints) obj;
        if (other.getAwsInstanceID() == null ^ this.getAwsInstanceID() == null)
            return false;
        if (other.getAwsInstanceID() != null && other.getAwsInstanceID().equals(this.getAwsInstanceID()) == false)
            return false;
        if (other.getFqdn() == null ^ this.getFqdn() == null)
            return false;
        if (other.getFqdn() != null && other.getFqdn().equals(this.getFqdn()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getVmWareUuid() == null ^ this.getVmWareUuid() == null)
            return false;
        if (other.getVmWareUuid() != null && other.getVmWareUuid().equals(this.getVmWareUuid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsInstanceID() == null) ? 0 : getAwsInstanceID().hashCode());
        hashCode = prime * hashCode + ((getFqdn() == null) ? 0 : getFqdn().hashCode());
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getVmWareUuid() == null) ? 0 : getVmWareUuid().hashCode());
        return hashCode;
    }

    @Override
    public IdentificationHints clone() {
        try {
            return (IdentificationHints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.IdentificationHintsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
