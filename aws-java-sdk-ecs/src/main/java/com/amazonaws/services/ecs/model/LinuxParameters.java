/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Linux-specific options that are applied to the container, such as Linux <a>KernelCapabilities</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/LinuxParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LinuxParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Linux capabilities for the container that are added to or dropped from the default configuration provided by
     * Docker.
     * </p>
     */
    private KernelCapabilities capabilities;

    /**
     * <p>
     * The Linux capabilities for the container that are added to or dropped from the default configuration provided by
     * Docker.
     * </p>
     * 
     * @param capabilities
     *        The Linux capabilities for the container that are added to or dropped from the default configuration
     *        provided by Docker.
     */

    public void setCapabilities(KernelCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * <p>
     * The Linux capabilities for the container that are added to or dropped from the default configuration provided by
     * Docker.
     * </p>
     * 
     * @return The Linux capabilities for the container that are added to or dropped from the default configuration
     *         provided by Docker.
     */

    public KernelCapabilities getCapabilities() {
        return this.capabilities;
    }

    /**
     * <p>
     * The Linux capabilities for the container that are added to or dropped from the default configuration provided by
     * Docker.
     * </p>
     * 
     * @param capabilities
     *        The Linux capabilities for the container that are added to or dropped from the default configuration
     *        provided by Docker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinuxParameters withCapabilities(KernelCapabilities capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LinuxParameters == false)
            return false;
        LinuxParameters other = (LinuxParameters) obj;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        return hashCode;
    }

    @Override
    public LinuxParameters clone() {
        try {
            return (LinuxParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.LinuxParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
