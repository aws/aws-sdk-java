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
 * Details about the server in vCenter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/VcenterBasedRemoteInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VcenterBasedRemoteInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the operating system.
     * </p>
     */
    private String osType;
    /**
     * <p>
     * The time when the remote server based on vCenter was last configured.
     * </p>
     */
    private String vcenterConfigurationTimeStamp;

    /**
     * <p>
     * The type of the operating system.
     * </p>
     * 
     * @param osType
     *        The type of the operating system.
     * @see OSType
     */

    public void setOsType(String osType) {
        this.osType = osType;
    }

    /**
     * <p>
     * The type of the operating system.
     * </p>
     * 
     * @return The type of the operating system.
     * @see OSType
     */

    public String getOsType() {
        return this.osType;
    }

    /**
     * <p>
     * The type of the operating system.
     * </p>
     * 
     * @param osType
     *        The type of the operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OSType
     */

    public VcenterBasedRemoteInfo withOsType(String osType) {
        setOsType(osType);
        return this;
    }

    /**
     * <p>
     * The type of the operating system.
     * </p>
     * 
     * @param osType
     *        The type of the operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OSType
     */

    public VcenterBasedRemoteInfo withOsType(OSType osType) {
        this.osType = osType.toString();
        return this;
    }

    /**
     * <p>
     * The time when the remote server based on vCenter was last configured.
     * </p>
     * 
     * @param vcenterConfigurationTimeStamp
     *        The time when the remote server based on vCenter was last configured.
     */

    public void setVcenterConfigurationTimeStamp(String vcenterConfigurationTimeStamp) {
        this.vcenterConfigurationTimeStamp = vcenterConfigurationTimeStamp;
    }

    /**
     * <p>
     * The time when the remote server based on vCenter was last configured.
     * </p>
     * 
     * @return The time when the remote server based on vCenter was last configured.
     */

    public String getVcenterConfigurationTimeStamp() {
        return this.vcenterConfigurationTimeStamp;
    }

    /**
     * <p>
     * The time when the remote server based on vCenter was last configured.
     * </p>
     * 
     * @param vcenterConfigurationTimeStamp
     *        The time when the remote server based on vCenter was last configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VcenterBasedRemoteInfo withVcenterConfigurationTimeStamp(String vcenterConfigurationTimeStamp) {
        setVcenterConfigurationTimeStamp(vcenterConfigurationTimeStamp);
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
        if (getOsType() != null)
            sb.append("OsType: ").append(getOsType()).append(",");
        if (getVcenterConfigurationTimeStamp() != null)
            sb.append("VcenterConfigurationTimeStamp: ").append(getVcenterConfigurationTimeStamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VcenterBasedRemoteInfo == false)
            return false;
        VcenterBasedRemoteInfo other = (VcenterBasedRemoteInfo) obj;
        if (other.getOsType() == null ^ this.getOsType() == null)
            return false;
        if (other.getOsType() != null && other.getOsType().equals(this.getOsType()) == false)
            return false;
        if (other.getVcenterConfigurationTimeStamp() == null ^ this.getVcenterConfigurationTimeStamp() == null)
            return false;
        if (other.getVcenterConfigurationTimeStamp() != null
                && other.getVcenterConfigurationTimeStamp().equals(this.getVcenterConfigurationTimeStamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOsType() == null) ? 0 : getOsType().hashCode());
        hashCode = prime * hashCode + ((getVcenterConfigurationTimeStamp() == null) ? 0 : getVcenterConfigurationTimeStamp().hashCode());
        return hashCode;
    }

    @Override
    public VcenterBasedRemoteInfo clone() {
        try {
            return (VcenterBasedRemoteInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.VcenterBasedRemoteInfoMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
