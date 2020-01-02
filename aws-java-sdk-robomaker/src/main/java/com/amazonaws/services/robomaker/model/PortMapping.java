/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a port mapping.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/PortMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The port number on the simulation job instance to use as a remote connection point.
     * </p>
     */
    private Integer jobPort;
    /**
     * <p>
     * The port number on the application.
     * </p>
     */
    private Integer applicationPort;
    /**
     * <p>
     * A Boolean indicating whether to enable this port mapping on public IP.
     * </p>
     */
    private Boolean enableOnPublicIp;

    /**
     * <p>
     * The port number on the simulation job instance to use as a remote connection point.
     * </p>
     * 
     * @param jobPort
     *        The port number on the simulation job instance to use as a remote connection point.
     */

    public void setJobPort(Integer jobPort) {
        this.jobPort = jobPort;
    }

    /**
     * <p>
     * The port number on the simulation job instance to use as a remote connection point.
     * </p>
     * 
     * @return The port number on the simulation job instance to use as a remote connection point.
     */

    public Integer getJobPort() {
        return this.jobPort;
    }

    /**
     * <p>
     * The port number on the simulation job instance to use as a remote connection point.
     * </p>
     * 
     * @param jobPort
     *        The port number on the simulation job instance to use as a remote connection point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortMapping withJobPort(Integer jobPort) {
        setJobPort(jobPort);
        return this;
    }

    /**
     * <p>
     * The port number on the application.
     * </p>
     * 
     * @param applicationPort
     *        The port number on the application.
     */

    public void setApplicationPort(Integer applicationPort) {
        this.applicationPort = applicationPort;
    }

    /**
     * <p>
     * The port number on the application.
     * </p>
     * 
     * @return The port number on the application.
     */

    public Integer getApplicationPort() {
        return this.applicationPort;
    }

    /**
     * <p>
     * The port number on the application.
     * </p>
     * 
     * @param applicationPort
     *        The port number on the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortMapping withApplicationPort(Integer applicationPort) {
        setApplicationPort(applicationPort);
        return this;
    }

    /**
     * <p>
     * A Boolean indicating whether to enable this port mapping on public IP.
     * </p>
     * 
     * @param enableOnPublicIp
     *        A Boolean indicating whether to enable this port mapping on public IP.
     */

    public void setEnableOnPublicIp(Boolean enableOnPublicIp) {
        this.enableOnPublicIp = enableOnPublicIp;
    }

    /**
     * <p>
     * A Boolean indicating whether to enable this port mapping on public IP.
     * </p>
     * 
     * @return A Boolean indicating whether to enable this port mapping on public IP.
     */

    public Boolean getEnableOnPublicIp() {
        return this.enableOnPublicIp;
    }

    /**
     * <p>
     * A Boolean indicating whether to enable this port mapping on public IP.
     * </p>
     * 
     * @param enableOnPublicIp
     *        A Boolean indicating whether to enable this port mapping on public IP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortMapping withEnableOnPublicIp(Boolean enableOnPublicIp) {
        setEnableOnPublicIp(enableOnPublicIp);
        return this;
    }

    /**
     * <p>
     * A Boolean indicating whether to enable this port mapping on public IP.
     * </p>
     * 
     * @return A Boolean indicating whether to enable this port mapping on public IP.
     */

    public Boolean isEnableOnPublicIp() {
        return this.enableOnPublicIp;
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
        if (getJobPort() != null)
            sb.append("JobPort: ").append(getJobPort()).append(",");
        if (getApplicationPort() != null)
            sb.append("ApplicationPort: ").append(getApplicationPort()).append(",");
        if (getEnableOnPublicIp() != null)
            sb.append("EnableOnPublicIp: ").append(getEnableOnPublicIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortMapping == false)
            return false;
        PortMapping other = (PortMapping) obj;
        if (other.getJobPort() == null ^ this.getJobPort() == null)
            return false;
        if (other.getJobPort() != null && other.getJobPort().equals(this.getJobPort()) == false)
            return false;
        if (other.getApplicationPort() == null ^ this.getApplicationPort() == null)
            return false;
        if (other.getApplicationPort() != null && other.getApplicationPort().equals(this.getApplicationPort()) == false)
            return false;
        if (other.getEnableOnPublicIp() == null ^ this.getEnableOnPublicIp() == null)
            return false;
        if (other.getEnableOnPublicIp() != null && other.getEnableOnPublicIp().equals(this.getEnableOnPublicIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobPort() == null) ? 0 : getJobPort().hashCode());
        hashCode = prime * hashCode + ((getApplicationPort() == null) ? 0 : getApplicationPort().hashCode());
        hashCode = prime * hashCode + ((getEnableOnPublicIp() == null) ? 0 : getEnableOnPublicIp().hashCode());
        return hashCode;
    }

    @Override
    public PortMapping clone() {
        try {
            return (PortMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.PortMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
