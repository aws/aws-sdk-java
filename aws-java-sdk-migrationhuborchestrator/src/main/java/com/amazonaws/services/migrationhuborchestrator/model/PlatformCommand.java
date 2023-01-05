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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Command to be run on a particular operating system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/PlatformCommand"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlatformCommand implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Command for Linux.
     * </p>
     */
    private String linux;
    /**
     * <p>
     * Command for Windows.
     * </p>
     */
    private String windows;

    /**
     * <p>
     * Command for Linux.
     * </p>
     * 
     * @param linux
     *        Command for Linux.
     */

    public void setLinux(String linux) {
        this.linux = linux;
    }

    /**
     * <p>
     * Command for Linux.
     * </p>
     * 
     * @return Command for Linux.
     */

    public String getLinux() {
        return this.linux;
    }

    /**
     * <p>
     * Command for Linux.
     * </p>
     * 
     * @param linux
     *        Command for Linux.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformCommand withLinux(String linux) {
        setLinux(linux);
        return this;
    }

    /**
     * <p>
     * Command for Windows.
     * </p>
     * 
     * @param windows
     *        Command for Windows.
     */

    public void setWindows(String windows) {
        this.windows = windows;
    }

    /**
     * <p>
     * Command for Windows.
     * </p>
     * 
     * @return Command for Windows.
     */

    public String getWindows() {
        return this.windows;
    }

    /**
     * <p>
     * Command for Windows.
     * </p>
     * 
     * @param windows
     *        Command for Windows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformCommand withWindows(String windows) {
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
            sb.append("Linux: ").append(getLinux()).append(",");
        if (getWindows() != null)
            sb.append("Windows: ").append(getWindows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlatformCommand == false)
            return false;
        PlatformCommand other = (PlatformCommand) obj;
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
    public PlatformCommand clone() {
        try {
            return (PlatformCommand) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhuborchestrator.model.transform.PlatformCommandMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
