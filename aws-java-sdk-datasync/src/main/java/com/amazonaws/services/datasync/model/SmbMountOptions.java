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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the mount options that are available for DataSync to access an SMB location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/SmbMountOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SmbMountOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The specific SMB version that you want DataSync to use to mount your SMB share. If you don't specify a version,
     * DataSync defaults to <code>AUTOMATIC</code>. That is, DataSync automatically selects a version based on
     * negotiation with the SMB Server server.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The specific SMB version that you want DataSync to use to mount your SMB share. If you don't specify a version,
     * DataSync defaults to <code>AUTOMATIC</code>. That is, DataSync automatically selects a version based on
     * negotiation with the SMB Server server.
     * </p>
     * 
     * @param version
     *        The specific SMB version that you want DataSync to use to mount your SMB share. If you don't specify a
     *        version, DataSync defaults to <code>AUTOMATIC</code>. That is, DataSync automatically selects a version
     *        based on negotiation with the SMB Server server.
     * @see SmbVersion
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The specific SMB version that you want DataSync to use to mount your SMB share. If you don't specify a version,
     * DataSync defaults to <code>AUTOMATIC</code>. That is, DataSync automatically selects a version based on
     * negotiation with the SMB Server server.
     * </p>
     * 
     * @return The specific SMB version that you want DataSync to use to mount your SMB share. If you don't specify a
     *         version, DataSync defaults to <code>AUTOMATIC</code>. That is, DataSync automatically selects a version
     *         based on negotiation with the SMB Server server.
     * @see SmbVersion
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The specific SMB version that you want DataSync to use to mount your SMB share. If you don't specify a version,
     * DataSync defaults to <code>AUTOMATIC</code>. That is, DataSync automatically selects a version based on
     * negotiation with the SMB Server server.
     * </p>
     * 
     * @param version
     *        The specific SMB version that you want DataSync to use to mount your SMB share. If you don't specify a
     *        version, DataSync defaults to <code>AUTOMATIC</code>. That is, DataSync automatically selects a version
     *        based on negotiation with the SMB Server server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmbVersion
     */

    public SmbMountOptions withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The specific SMB version that you want DataSync to use to mount your SMB share. If you don't specify a version,
     * DataSync defaults to <code>AUTOMATIC</code>. That is, DataSync automatically selects a version based on
     * negotiation with the SMB Server server.
     * </p>
     * 
     * @param version
     *        The specific SMB version that you want DataSync to use to mount your SMB share. If you don't specify a
     *        version, DataSync defaults to <code>AUTOMATIC</code>. That is, DataSync automatically selects a version
     *        based on negotiation with the SMB Server server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmbVersion
     */

    public SmbMountOptions withVersion(SmbVersion version) {
        this.version = version.toString();
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SmbMountOptions == false)
            return false;
        SmbMountOptions other = (SmbMountOptions) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public SmbMountOptions clone() {
        try {
            return (SmbMountOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.SmbMountOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
