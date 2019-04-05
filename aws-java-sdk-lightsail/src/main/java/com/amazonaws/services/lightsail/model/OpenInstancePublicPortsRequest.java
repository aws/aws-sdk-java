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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/OpenInstancePublicPorts" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenInstancePublicPortsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of key-value pairs containing information about the port mappings.
     * </p>
     */
    private PortInfo portInfo;
    /**
     * <p>
     * The name of the instance for which you want to open the public ports.
     * </p>
     */
    private String instanceName;

    /**
     * <p>
     * An array of key-value pairs containing information about the port mappings.
     * </p>
     * 
     * @param portInfo
     *        An array of key-value pairs containing information about the port mappings.
     */

    public void setPortInfo(PortInfo portInfo) {
        this.portInfo = portInfo;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the port mappings.
     * </p>
     * 
     * @return An array of key-value pairs containing information about the port mappings.
     */

    public PortInfo getPortInfo() {
        return this.portInfo;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the port mappings.
     * </p>
     * 
     * @param portInfo
     *        An array of key-value pairs containing information about the port mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenInstancePublicPortsRequest withPortInfo(PortInfo portInfo) {
        setPortInfo(portInfo);
        return this;
    }

    /**
     * <p>
     * The name of the instance for which you want to open the public ports.
     * </p>
     * 
     * @param instanceName
     *        The name of the instance for which you want to open the public ports.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the instance for which you want to open the public ports.
     * </p>
     * 
     * @return The name of the instance for which you want to open the public ports.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The name of the instance for which you want to open the public ports.
     * </p>
     * 
     * @param instanceName
     *        The name of the instance for which you want to open the public ports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenInstancePublicPortsRequest withInstanceName(String instanceName) {
        setInstanceName(instanceName);
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
        if (getPortInfo() != null)
            sb.append("PortInfo: ").append(getPortInfo()).append(",");
        if (getInstanceName() != null)
            sb.append("InstanceName: ").append(getInstanceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenInstancePublicPortsRequest == false)
            return false;
        OpenInstancePublicPortsRequest other = (OpenInstancePublicPortsRequest) obj;
        if (other.getPortInfo() == null ^ this.getPortInfo() == null)
            return false;
        if (other.getPortInfo() != null && other.getPortInfo().equals(this.getPortInfo()) == false)
            return false;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortInfo() == null) ? 0 : getPortInfo().hashCode());
        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        return hashCode;
    }

    @Override
    public OpenInstancePublicPortsRequest clone() {
        return (OpenInstancePublicPortsRequest) super.clone();
    }

}
