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
 * Describes the directory owner account details that have been shared to the directory consumer account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/OwnerDirectoryDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OwnerDirectoryDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of the AWS Managed Microsoft AD directory in the directory owner account.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * Identifier of the directory owner account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * IP address of the directory’s domain controllers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dnsIpAddrs;
    /**
     * <p>
     * Information about the VPC settings for the directory.
     * </p>
     */
    private DirectoryVpcSettingsDescription vpcSettings;
    /**
     * <p>
     * A <a>RadiusSettings</a> object that contains information about the RADIUS server.
     * </p>
     */
    private RadiusSettings radiusSettings;
    /**
     * <p>
     * Information about the status of the RADIUS server.
     * </p>
     */
    private String radiusStatus;

    /**
     * <p>
     * Identifier of the AWS Managed Microsoft AD directory in the directory owner account.
     * </p>
     * 
     * @param directoryId
     *        Identifier of the AWS Managed Microsoft AD directory in the directory owner account.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * Identifier of the AWS Managed Microsoft AD directory in the directory owner account.
     * </p>
     * 
     * @return Identifier of the AWS Managed Microsoft AD directory in the directory owner account.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * Identifier of the AWS Managed Microsoft AD directory in the directory owner account.
     * </p>
     * 
     * @param directoryId
     *        Identifier of the AWS Managed Microsoft AD directory in the directory owner account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OwnerDirectoryDescription withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * Identifier of the directory owner account.
     * </p>
     * 
     * @param accountId
     *        Identifier of the directory owner account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * Identifier of the directory owner account.
     * </p>
     * 
     * @return Identifier of the directory owner account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * Identifier of the directory owner account.
     * </p>
     * 
     * @param accountId
     *        Identifier of the directory owner account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OwnerDirectoryDescription withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * IP address of the directory’s domain controllers.
     * </p>
     * 
     * @return IP address of the directory’s domain controllers.
     */

    public java.util.List<String> getDnsIpAddrs() {
        if (dnsIpAddrs == null) {
            dnsIpAddrs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dnsIpAddrs;
    }

    /**
     * <p>
     * IP address of the directory’s domain controllers.
     * </p>
     * 
     * @param dnsIpAddrs
     *        IP address of the directory’s domain controllers.
     */

    public void setDnsIpAddrs(java.util.Collection<String> dnsIpAddrs) {
        if (dnsIpAddrs == null) {
            this.dnsIpAddrs = null;
            return;
        }

        this.dnsIpAddrs = new com.amazonaws.internal.SdkInternalList<String>(dnsIpAddrs);
    }

    /**
     * <p>
     * IP address of the directory’s domain controllers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsIpAddrs(java.util.Collection)} or {@link #withDnsIpAddrs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsIpAddrs
     *        IP address of the directory’s domain controllers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OwnerDirectoryDescription withDnsIpAddrs(String... dnsIpAddrs) {
        if (this.dnsIpAddrs == null) {
            setDnsIpAddrs(new com.amazonaws.internal.SdkInternalList<String>(dnsIpAddrs.length));
        }
        for (String ele : dnsIpAddrs) {
            this.dnsIpAddrs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * IP address of the directory’s domain controllers.
     * </p>
     * 
     * @param dnsIpAddrs
     *        IP address of the directory’s domain controllers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OwnerDirectoryDescription withDnsIpAddrs(java.util.Collection<String> dnsIpAddrs) {
        setDnsIpAddrs(dnsIpAddrs);
        return this;
    }

    /**
     * <p>
     * Information about the VPC settings for the directory.
     * </p>
     * 
     * @param vpcSettings
     *        Information about the VPC settings for the directory.
     */

    public void setVpcSettings(DirectoryVpcSettingsDescription vpcSettings) {
        this.vpcSettings = vpcSettings;
    }

    /**
     * <p>
     * Information about the VPC settings for the directory.
     * </p>
     * 
     * @return Information about the VPC settings for the directory.
     */

    public DirectoryVpcSettingsDescription getVpcSettings() {
        return this.vpcSettings;
    }

    /**
     * <p>
     * Information about the VPC settings for the directory.
     * </p>
     * 
     * @param vpcSettings
     *        Information about the VPC settings for the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OwnerDirectoryDescription withVpcSettings(DirectoryVpcSettingsDescription vpcSettings) {
        setVpcSettings(vpcSettings);
        return this;
    }

    /**
     * <p>
     * A <a>RadiusSettings</a> object that contains information about the RADIUS server.
     * </p>
     * 
     * @param radiusSettings
     *        A <a>RadiusSettings</a> object that contains information about the RADIUS server.
     */

    public void setRadiusSettings(RadiusSettings radiusSettings) {
        this.radiusSettings = radiusSettings;
    }

    /**
     * <p>
     * A <a>RadiusSettings</a> object that contains information about the RADIUS server.
     * </p>
     * 
     * @return A <a>RadiusSettings</a> object that contains information about the RADIUS server.
     */

    public RadiusSettings getRadiusSettings() {
        return this.radiusSettings;
    }

    /**
     * <p>
     * A <a>RadiusSettings</a> object that contains information about the RADIUS server.
     * </p>
     * 
     * @param radiusSettings
     *        A <a>RadiusSettings</a> object that contains information about the RADIUS server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OwnerDirectoryDescription withRadiusSettings(RadiusSettings radiusSettings) {
        setRadiusSettings(radiusSettings);
        return this;
    }

    /**
     * <p>
     * Information about the status of the RADIUS server.
     * </p>
     * 
     * @param radiusStatus
     *        Information about the status of the RADIUS server.
     * @see RadiusStatus
     */

    public void setRadiusStatus(String radiusStatus) {
        this.radiusStatus = radiusStatus;
    }

    /**
     * <p>
     * Information about the status of the RADIUS server.
     * </p>
     * 
     * @return Information about the status of the RADIUS server.
     * @see RadiusStatus
     */

    public String getRadiusStatus() {
        return this.radiusStatus;
    }

    /**
     * <p>
     * Information about the status of the RADIUS server.
     * </p>
     * 
     * @param radiusStatus
     *        Information about the status of the RADIUS server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RadiusStatus
     */

    public OwnerDirectoryDescription withRadiusStatus(String radiusStatus) {
        setRadiusStatus(radiusStatus);
        return this;
    }

    /**
     * <p>
     * Information about the status of the RADIUS server.
     * </p>
     * 
     * @param radiusStatus
     *        Information about the status of the RADIUS server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RadiusStatus
     */

    public OwnerDirectoryDescription withRadiusStatus(RadiusStatus radiusStatus) {
        this.radiusStatus = radiusStatus.toString();
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getDnsIpAddrs() != null)
            sb.append("DnsIpAddrs: ").append(getDnsIpAddrs()).append(",");
        if (getVpcSettings() != null)
            sb.append("VpcSettings: ").append(getVpcSettings()).append(",");
        if (getRadiusSettings() != null)
            sb.append("RadiusSettings: ").append(getRadiusSettings()).append(",");
        if (getRadiusStatus() != null)
            sb.append("RadiusStatus: ").append(getRadiusStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OwnerDirectoryDescription == false)
            return false;
        OwnerDirectoryDescription other = (OwnerDirectoryDescription) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getDnsIpAddrs() == null ^ this.getDnsIpAddrs() == null)
            return false;
        if (other.getDnsIpAddrs() != null && other.getDnsIpAddrs().equals(this.getDnsIpAddrs()) == false)
            return false;
        if (other.getVpcSettings() == null ^ this.getVpcSettings() == null)
            return false;
        if (other.getVpcSettings() != null && other.getVpcSettings().equals(this.getVpcSettings()) == false)
            return false;
        if (other.getRadiusSettings() == null ^ this.getRadiusSettings() == null)
            return false;
        if (other.getRadiusSettings() != null && other.getRadiusSettings().equals(this.getRadiusSettings()) == false)
            return false;
        if (other.getRadiusStatus() == null ^ this.getRadiusStatus() == null)
            return false;
        if (other.getRadiusStatus() != null && other.getRadiusStatus().equals(this.getRadiusStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getDnsIpAddrs() == null) ? 0 : getDnsIpAddrs().hashCode());
        hashCode = prime * hashCode + ((getVpcSettings() == null) ? 0 : getVpcSettings().hashCode());
        hashCode = prime * hashCode + ((getRadiusSettings() == null) ? 0 : getRadiusSettings().hashCode());
        hashCode = prime * hashCode + ((getRadiusStatus() == null) ? 0 : getRadiusStatus().hashCode());
        return hashCode;
    }

    @Override
    public OwnerDirectoryDescription clone() {
        try {
            return (OwnerDirectoryDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.OwnerDirectoryDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
