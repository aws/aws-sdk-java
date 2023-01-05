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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The upload storage root location (folder) on streaming workstations where files are uploaded.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StreamingSessionStorageRoot" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingSessionStorageRoot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The folder path in Linux workstations where files are uploaded.
     * </p>
     */
    private String linux;
    /**
     * <p>
     * The folder path in Windows workstations where files are uploaded.
     * </p>
     */
    private String windows;

    /**
     * <p>
     * The folder path in Linux workstations where files are uploaded.
     * </p>
     * 
     * @param linux
     *        The folder path in Linux workstations where files are uploaded.
     */

    public void setLinux(String linux) {
        this.linux = linux;
    }

    /**
     * <p>
     * The folder path in Linux workstations where files are uploaded.
     * </p>
     * 
     * @return The folder path in Linux workstations where files are uploaded.
     */

    public String getLinux() {
        return this.linux;
    }

    /**
     * <p>
     * The folder path in Linux workstations where files are uploaded.
     * </p>
     * 
     * @param linux
     *        The folder path in Linux workstations where files are uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSessionStorageRoot withLinux(String linux) {
        setLinux(linux);
        return this;
    }

    /**
     * <p>
     * The folder path in Windows workstations where files are uploaded.
     * </p>
     * 
     * @param windows
     *        The folder path in Windows workstations where files are uploaded.
     */

    public void setWindows(String windows) {
        this.windows = windows;
    }

    /**
     * <p>
     * The folder path in Windows workstations where files are uploaded.
     * </p>
     * 
     * @return The folder path in Windows workstations where files are uploaded.
     */

    public String getWindows() {
        return this.windows;
    }

    /**
     * <p>
     * The folder path in Windows workstations where files are uploaded.
     * </p>
     * 
     * @param windows
     *        The folder path in Windows workstations where files are uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingSessionStorageRoot withWindows(String windows) {
        setWindows(windows);
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
        if (getLinux() != null)
            sb.append("Linux: ").append("***Sensitive Data Redacted***").append(",");
        if (getWindows() != null)
            sb.append("Windows: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingSessionStorageRoot == false)
            return false;
        StreamingSessionStorageRoot other = (StreamingSessionStorageRoot) obj;
        if (other.getLinux() == null ^ this.getLinux() == null)
            return false;
        if (other.getLinux() != null && other.getLinux().equals(this.getLinux()) == false)
            return false;
        if (other.getWindows() == null ^ this.getWindows() == null)
            return false;
        if (other.getWindows() != null && other.getWindows().equals(this.getWindows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLinux() == null) ? 0 : getLinux().hashCode());
        hashCode = prime * hashCode + ((getWindows() == null) ? 0 : getWindows().hashCode());
        return hashCode;
    }

    @Override
    public StreamingSessionStorageRoot clone() {
        try {
            return (StreamingSessionStorageRoot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StreamingSessionStorageRootMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
