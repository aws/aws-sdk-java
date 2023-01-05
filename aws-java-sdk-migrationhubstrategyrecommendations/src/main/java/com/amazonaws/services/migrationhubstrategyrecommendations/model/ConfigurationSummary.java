/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary of the collector configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ConfigurationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * IP address based configurations.
     * </p>
     */
    private java.util.List<IPAddressBasedRemoteInfo> ipAddressBasedRemoteInfoList;
    /**
     * <p>
     * The list of pipeline info configurations.
     * </p>
     */
    private java.util.List<PipelineInfo> pipelineInfoList;
    /**
     * <p>
     * Info about the remote server source code configuration.
     * </p>
     */
    private RemoteSourceCodeAnalysisServerInfo remoteSourceCodeAnalysisServerInfo;
    /**
     * <p>
     * The list of vCenter configurations.
     * </p>
     */
    private java.util.List<VcenterBasedRemoteInfo> vcenterBasedRemoteInfoList;
    /**
     * <p>
     * The list of the version control configurations.
     * </p>
     */
    private java.util.List<VersionControlInfo> versionControlInfoList;

    /**
     * <p>
     * IP address based configurations.
     * </p>
     * 
     * @return IP address based configurations.
     */

    public java.util.List<IPAddressBasedRemoteInfo> getIpAddressBasedRemoteInfoList() {
        return ipAddressBasedRemoteInfoList;
    }

    /**
     * <p>
     * IP address based configurations.
     * </p>
     * 
     * @param ipAddressBasedRemoteInfoList
     *        IP address based configurations.
     */

    public void setIpAddressBasedRemoteInfoList(java.util.Collection<IPAddressBasedRemoteInfo> ipAddressBasedRemoteInfoList) {
        if (ipAddressBasedRemoteInfoList == null) {
            this.ipAddressBasedRemoteInfoList = null;
            return;
        }

        this.ipAddressBasedRemoteInfoList = new java.util.ArrayList<IPAddressBasedRemoteInfo>(ipAddressBasedRemoteInfoList);
    }

    /**
     * <p>
     * IP address based configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpAddressBasedRemoteInfoList(java.util.Collection)} or
     * {@link #withIpAddressBasedRemoteInfoList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param ipAddressBasedRemoteInfoList
     *        IP address based configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationSummary withIpAddressBasedRemoteInfoList(IPAddressBasedRemoteInfo... ipAddressBasedRemoteInfoList) {
        if (this.ipAddressBasedRemoteInfoList == null) {
            setIpAddressBasedRemoteInfoList(new java.util.ArrayList<IPAddressBasedRemoteInfo>(ipAddressBasedRemoteInfoList.length));
        }
        for (IPAddressBasedRemoteInfo ele : ipAddressBasedRemoteInfoList) {
            this.ipAddressBasedRemoteInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * IP address based configurations.
     * </p>
     * 
     * @param ipAddressBasedRemoteInfoList
     *        IP address based configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationSummary withIpAddressBasedRemoteInfoList(java.util.Collection<IPAddressBasedRemoteInfo> ipAddressBasedRemoteInfoList) {
        setIpAddressBasedRemoteInfoList(ipAddressBasedRemoteInfoList);
        return this;
    }

    /**
     * <p>
     * The list of pipeline info configurations.
     * </p>
     * 
     * @return The list of pipeline info configurations.
     */

    public java.util.List<PipelineInfo> getPipelineInfoList() {
        return pipelineInfoList;
    }

    /**
     * <p>
     * The list of pipeline info configurations.
     * </p>
     * 
     * @param pipelineInfoList
     *        The list of pipeline info configurations.
     */

    public void setPipelineInfoList(java.util.Collection<PipelineInfo> pipelineInfoList) {
        if (pipelineInfoList == null) {
            this.pipelineInfoList = null;
            return;
        }

        this.pipelineInfoList = new java.util.ArrayList<PipelineInfo>(pipelineInfoList);
    }

    /**
     * <p>
     * The list of pipeline info configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelineInfoList(java.util.Collection)} or {@link #withPipelineInfoList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pipelineInfoList
     *        The list of pipeline info configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationSummary withPipelineInfoList(PipelineInfo... pipelineInfoList) {
        if (this.pipelineInfoList == null) {
            setPipelineInfoList(new java.util.ArrayList<PipelineInfo>(pipelineInfoList.length));
        }
        for (PipelineInfo ele : pipelineInfoList) {
            this.pipelineInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of pipeline info configurations.
     * </p>
     * 
     * @param pipelineInfoList
     *        The list of pipeline info configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationSummary withPipelineInfoList(java.util.Collection<PipelineInfo> pipelineInfoList) {
        setPipelineInfoList(pipelineInfoList);
        return this;
    }

    /**
     * <p>
     * Info about the remote server source code configuration.
     * </p>
     * 
     * @param remoteSourceCodeAnalysisServerInfo
     *        Info about the remote server source code configuration.
     */

    public void setRemoteSourceCodeAnalysisServerInfo(RemoteSourceCodeAnalysisServerInfo remoteSourceCodeAnalysisServerInfo) {
        this.remoteSourceCodeAnalysisServerInfo = remoteSourceCodeAnalysisServerInfo;
    }

    /**
     * <p>
     * Info about the remote server source code configuration.
     * </p>
     * 
     * @return Info about the remote server source code configuration.
     */

    public RemoteSourceCodeAnalysisServerInfo getRemoteSourceCodeAnalysisServerInfo() {
        return this.remoteSourceCodeAnalysisServerInfo;
    }

    /**
     * <p>
     * Info about the remote server source code configuration.
     * </p>
     * 
     * @param remoteSourceCodeAnalysisServerInfo
     *        Info about the remote server source code configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationSummary withRemoteSourceCodeAnalysisServerInfo(RemoteSourceCodeAnalysisServerInfo remoteSourceCodeAnalysisServerInfo) {
        setRemoteSourceCodeAnalysisServerInfo(remoteSourceCodeAnalysisServerInfo);
        return this;
    }

    /**
     * <p>
     * The list of vCenter configurations.
     * </p>
     * 
     * @return The list of vCenter configurations.
     */

    public java.util.List<VcenterBasedRemoteInfo> getVcenterBasedRemoteInfoList() {
        return vcenterBasedRemoteInfoList;
    }

    /**
     * <p>
     * The list of vCenter configurations.
     * </p>
     * 
     * @param vcenterBasedRemoteInfoList
     *        The list of vCenter configurations.
     */

    public void setVcenterBasedRemoteInfoList(java.util.Collection<VcenterBasedRemoteInfo> vcenterBasedRemoteInfoList) {
        if (vcenterBasedRemoteInfoList == null) {
            this.vcenterBasedRemoteInfoList = null;
            return;
        }

        this.vcenterBasedRemoteInfoList = new java.util.ArrayList<VcenterBasedRemoteInfo>(vcenterBasedRemoteInfoList);
    }

    /**
     * <p>
     * The list of vCenter configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVcenterBasedRemoteInfoList(java.util.Collection)} or
     * {@link #withVcenterBasedRemoteInfoList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vcenterBasedRemoteInfoList
     *        The list of vCenter configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationSummary withVcenterBasedRemoteInfoList(VcenterBasedRemoteInfo... vcenterBasedRemoteInfoList) {
        if (this.vcenterBasedRemoteInfoList == null) {
            setVcenterBasedRemoteInfoList(new java.util.ArrayList<VcenterBasedRemoteInfo>(vcenterBasedRemoteInfoList.length));
        }
        for (VcenterBasedRemoteInfo ele : vcenterBasedRemoteInfoList) {
            this.vcenterBasedRemoteInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of vCenter configurations.
     * </p>
     * 
     * @param vcenterBasedRemoteInfoList
     *        The list of vCenter configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationSummary withVcenterBasedRemoteInfoList(java.util.Collection<VcenterBasedRemoteInfo> vcenterBasedRemoteInfoList) {
        setVcenterBasedRemoteInfoList(vcenterBasedRemoteInfoList);
        return this;
    }

    /**
     * <p>
     * The list of the version control configurations.
     * </p>
     * 
     * @return The list of the version control configurations.
     */

    public java.util.List<VersionControlInfo> getVersionControlInfoList() {
        return versionControlInfoList;
    }

    /**
     * <p>
     * The list of the version control configurations.
     * </p>
     * 
     * @param versionControlInfoList
     *        The list of the version control configurations.
     */

    public void setVersionControlInfoList(java.util.Collection<VersionControlInfo> versionControlInfoList) {
        if (versionControlInfoList == null) {
            this.versionControlInfoList = null;
            return;
        }

        this.versionControlInfoList = new java.util.ArrayList<VersionControlInfo>(versionControlInfoList);
    }

    /**
     * <p>
     * The list of the version control configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersionControlInfoList(java.util.Collection)} or
     * {@link #withVersionControlInfoList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param versionControlInfoList
     *        The list of the version control configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationSummary withVersionControlInfoList(VersionControlInfo... versionControlInfoList) {
        if (this.versionControlInfoList == null) {
            setVersionControlInfoList(new java.util.ArrayList<VersionControlInfo>(versionControlInfoList.length));
        }
        for (VersionControlInfo ele : versionControlInfoList) {
            this.versionControlInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of the version control configurations.
     * </p>
     * 
     * @param versionControlInfoList
     *        The list of the version control configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationSummary withVersionControlInfoList(java.util.Collection<VersionControlInfo> versionControlInfoList) {
        setVersionControlInfoList(versionControlInfoList);
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
        if (getIpAddressBasedRemoteInfoList() != null)
            sb.append("IpAddressBasedRemoteInfoList: ").append(getIpAddressBasedRemoteInfoList()).append(",");
        if (getPipelineInfoList() != null)
            sb.append("PipelineInfoList: ").append(getPipelineInfoList()).append(",");
        if (getRemoteSourceCodeAnalysisServerInfo() != null)
            sb.append("RemoteSourceCodeAnalysisServerInfo: ").append(getRemoteSourceCodeAnalysisServerInfo()).append(",");
        if (getVcenterBasedRemoteInfoList() != null)
            sb.append("VcenterBasedRemoteInfoList: ").append(getVcenterBasedRemoteInfoList()).append(",");
        if (getVersionControlInfoList() != null)
            sb.append("VersionControlInfoList: ").append(getVersionControlInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationSummary == false)
            return false;
        ConfigurationSummary other = (ConfigurationSummary) obj;
        if (other.getIpAddressBasedRemoteInfoList() == null ^ this.getIpAddressBasedRemoteInfoList() == null)
            return false;
        if (other.getIpAddressBasedRemoteInfoList() != null && other.getIpAddressBasedRemoteInfoList().equals(this.getIpAddressBasedRemoteInfoList()) == false)
            return false;
        if (other.getPipelineInfoList() == null ^ this.getPipelineInfoList() == null)
            return false;
        if (other.getPipelineInfoList() != null && other.getPipelineInfoList().equals(this.getPipelineInfoList()) == false)
            return false;
        if (other.getRemoteSourceCodeAnalysisServerInfo() == null ^ this.getRemoteSourceCodeAnalysisServerInfo() == null)
            return false;
        if (other.getRemoteSourceCodeAnalysisServerInfo() != null
                && other.getRemoteSourceCodeAnalysisServerInfo().equals(this.getRemoteSourceCodeAnalysisServerInfo()) == false)
            return false;
        if (other.getVcenterBasedRemoteInfoList() == null ^ this.getVcenterBasedRemoteInfoList() == null)
            return false;
        if (other.getVcenterBasedRemoteInfoList() != null && other.getVcenterBasedRemoteInfoList().equals(this.getVcenterBasedRemoteInfoList()) == false)
            return false;
        if (other.getVersionControlInfoList() == null ^ this.getVersionControlInfoList() == null)
            return false;
        if (other.getVersionControlInfoList() != null && other.getVersionControlInfoList().equals(this.getVersionControlInfoList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAddressBasedRemoteInfoList() == null) ? 0 : getIpAddressBasedRemoteInfoList().hashCode());
        hashCode = prime * hashCode + ((getPipelineInfoList() == null) ? 0 : getPipelineInfoList().hashCode());
        hashCode = prime * hashCode + ((getRemoteSourceCodeAnalysisServerInfo() == null) ? 0 : getRemoteSourceCodeAnalysisServerInfo().hashCode());
        hashCode = prime * hashCode + ((getVcenterBasedRemoteInfoList() == null) ? 0 : getVcenterBasedRemoteInfoList().hashCode());
        hashCode = prime * hashCode + ((getVersionControlInfoList() == null) ? 0 : getVersionControlInfoList().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationSummary clone() {
        try {
            return (ConfigurationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ConfigurationSummaryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
