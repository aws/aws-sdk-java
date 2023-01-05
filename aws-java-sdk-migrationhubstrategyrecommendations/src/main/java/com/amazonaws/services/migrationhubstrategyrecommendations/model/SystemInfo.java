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
 * Information about the server that hosts application components.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/SystemInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SystemInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * CPU architecture type for the server.
     * </p>
     */
    private String cpuArchitecture;
    /**
     * <p>
     * File system type for the server.
     * </p>
     */
    private String fileSystemType;
    /**
     * <p>
     * Networking information related to a server.
     * </p>
     */
    private java.util.List<NetworkInfo> networkInfoList;
    /**
     * <p>
     * Operating system corresponding to a server.
     * </p>
     */
    private OSInfo osInfo;

    /**
     * <p>
     * CPU architecture type for the server.
     * </p>
     * 
     * @param cpuArchitecture
     *        CPU architecture type for the server.
     */

    public void setCpuArchitecture(String cpuArchitecture) {
        this.cpuArchitecture = cpuArchitecture;
    }

    /**
     * <p>
     * CPU architecture type for the server.
     * </p>
     * 
     * @return CPU architecture type for the server.
     */

    public String getCpuArchitecture() {
        return this.cpuArchitecture;
    }

    /**
     * <p>
     * CPU architecture type for the server.
     * </p>
     * 
     * @param cpuArchitecture
     *        CPU architecture type for the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInfo withCpuArchitecture(String cpuArchitecture) {
        setCpuArchitecture(cpuArchitecture);
        return this;
    }

    /**
     * <p>
     * File system type for the server.
     * </p>
     * 
     * @param fileSystemType
     *        File system type for the server.
     */

    public void setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
    }

    /**
     * <p>
     * File system type for the server.
     * </p>
     * 
     * @return File system type for the server.
     */

    public String getFileSystemType() {
        return this.fileSystemType;
    }

    /**
     * <p>
     * File system type for the server.
     * </p>
     * 
     * @param fileSystemType
     *        File system type for the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInfo withFileSystemType(String fileSystemType) {
        setFileSystemType(fileSystemType);
        return this;
    }

    /**
     * <p>
     * Networking information related to a server.
     * </p>
     * 
     * @return Networking information related to a server.
     */

    public java.util.List<NetworkInfo> getNetworkInfoList() {
        return networkInfoList;
    }

    /**
     * <p>
     * Networking information related to a server.
     * </p>
     * 
     * @param networkInfoList
     *        Networking information related to a server.
     */

    public void setNetworkInfoList(java.util.Collection<NetworkInfo> networkInfoList) {
        if (networkInfoList == null) {
            this.networkInfoList = null;
            return;
        }

        this.networkInfoList = new java.util.ArrayList<NetworkInfo>(networkInfoList);
    }

    /**
     * <p>
     * Networking information related to a server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInfoList(java.util.Collection)} or {@link #withNetworkInfoList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param networkInfoList
     *        Networking information related to a server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInfo withNetworkInfoList(NetworkInfo... networkInfoList) {
        if (this.networkInfoList == null) {
            setNetworkInfoList(new java.util.ArrayList<NetworkInfo>(networkInfoList.length));
        }
        for (NetworkInfo ele : networkInfoList) {
            this.networkInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Networking information related to a server.
     * </p>
     * 
     * @param networkInfoList
     *        Networking information related to a server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInfo withNetworkInfoList(java.util.Collection<NetworkInfo> networkInfoList) {
        setNetworkInfoList(networkInfoList);
        return this;
    }

    /**
     * <p>
     * Operating system corresponding to a server.
     * </p>
     * 
     * @param osInfo
     *        Operating system corresponding to a server.
     */

    public void setOsInfo(OSInfo osInfo) {
        this.osInfo = osInfo;
    }

    /**
     * <p>
     * Operating system corresponding to a server.
     * </p>
     * 
     * @return Operating system corresponding to a server.
     */

    public OSInfo getOsInfo() {
        return this.osInfo;
    }

    /**
     * <p>
     * Operating system corresponding to a server.
     * </p>
     * 
     * @param osInfo
     *        Operating system corresponding to a server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SystemInfo withOsInfo(OSInfo osInfo) {
        setOsInfo(osInfo);
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
        if (getCpuArchitecture() != null)
            sb.append("CpuArchitecture: ").append(getCpuArchitecture()).append(",");
        if (getFileSystemType() != null)
            sb.append("FileSystemType: ").append(getFileSystemType()).append(",");
        if (getNetworkInfoList() != null)
            sb.append("NetworkInfoList: ").append(getNetworkInfoList()).append(",");
        if (getOsInfo() != null)
            sb.append("OsInfo: ").append(getOsInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SystemInfo == false)
            return false;
        SystemInfo other = (SystemInfo) obj;
        if (other.getCpuArchitecture() == null ^ this.getCpuArchitecture() == null)
            return false;
        if (other.getCpuArchitecture() != null && other.getCpuArchitecture().equals(this.getCpuArchitecture()) == false)
            return false;
        if (other.getFileSystemType() == null ^ this.getFileSystemType() == null)
            return false;
        if (other.getFileSystemType() != null && other.getFileSystemType().equals(this.getFileSystemType()) == false)
            return false;
        if (other.getNetworkInfoList() == null ^ this.getNetworkInfoList() == null)
            return false;
        if (other.getNetworkInfoList() != null && other.getNetworkInfoList().equals(this.getNetworkInfoList()) == false)
            return false;
        if (other.getOsInfo() == null ^ this.getOsInfo() == null)
            return false;
        if (other.getOsInfo() != null && other.getOsInfo().equals(this.getOsInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpuArchitecture() == null) ? 0 : getCpuArchitecture().hashCode());
        hashCode = prime * hashCode + ((getFileSystemType() == null) ? 0 : getFileSystemType().hashCode());
        hashCode = prime * hashCode + ((getNetworkInfoList() == null) ? 0 : getNetworkInfoList().hashCode());
        hashCode = prime * hashCode + ((getOsInfo() == null) ? 0 : getOsInfo().hashCode());
        return hashCode;
    }

    @Override
    public SystemInfo clone() {
        try {
            return (SystemInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.SystemInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
