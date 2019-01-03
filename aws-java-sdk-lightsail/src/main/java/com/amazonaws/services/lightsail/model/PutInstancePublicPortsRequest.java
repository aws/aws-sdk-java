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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PutInstancePublicPorts" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutInstancePublicPortsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies information about the public port(s).
     * </p>
     */
    private java.util.List<PortInfo> portInfos;
    /**
     * <p>
     * The Lightsail instance name of the public port(s) you are setting.
     * </p>
     */
    private String instanceName;

    /**
     * <p>
     * Specifies information about the public port(s).
     * </p>
     * 
     * @return Specifies information about the public port(s).
     */

    public java.util.List<PortInfo> getPortInfos() {
        return portInfos;
    }

    /**
     * <p>
     * Specifies information about the public port(s).
     * </p>
     * 
     * @param portInfos
     *        Specifies information about the public port(s).
     */

    public void setPortInfos(java.util.Collection<PortInfo> portInfos) {
        if (portInfos == null) {
            this.portInfos = null;
            return;
        }

        this.portInfos = new java.util.ArrayList<PortInfo>(portInfos);
    }

    /**
     * <p>
     * Specifies information about the public port(s).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPortInfos(java.util.Collection)} or {@link #withPortInfos(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param portInfos
     *        Specifies information about the public port(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInstancePublicPortsRequest withPortInfos(PortInfo... portInfos) {
        if (this.portInfos == null) {
            setPortInfos(new java.util.ArrayList<PortInfo>(portInfos.length));
        }
        for (PortInfo ele : portInfos) {
            this.portInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies information about the public port(s).
     * </p>
     * 
     * @param portInfos
     *        Specifies information about the public port(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInstancePublicPortsRequest withPortInfos(java.util.Collection<PortInfo> portInfos) {
        setPortInfos(portInfos);
        return this;
    }

    /**
     * <p>
     * The Lightsail instance name of the public port(s) you are setting.
     * </p>
     * 
     * @param instanceName
     *        The Lightsail instance name of the public port(s) you are setting.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The Lightsail instance name of the public port(s) you are setting.
     * </p>
     * 
     * @return The Lightsail instance name of the public port(s) you are setting.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The Lightsail instance name of the public port(s) you are setting.
     * </p>
     * 
     * @param instanceName
     *        The Lightsail instance name of the public port(s) you are setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutInstancePublicPortsRequest withInstanceName(String instanceName) {
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
        if (getPortInfos() != null)
            sb.append("PortInfos: ").append(getPortInfos()).append(",");
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

        if (obj instanceof PutInstancePublicPortsRequest == false)
            return false;
        PutInstancePublicPortsRequest other = (PutInstancePublicPortsRequest) obj;
        if (other.getPortInfos() == null ^ this.getPortInfos() == null)
            return false;
        if (other.getPortInfos() != null && other.getPortInfos().equals(this.getPortInfos()) == false)
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

        hashCode = prime * hashCode + ((getPortInfos() == null) ? 0 : getPortInfos().hashCode());
        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        return hashCode;
    }

    @Override
    public PutInstancePublicPortsRequest clone() {
        return (PutInstancePublicPortsRequest) super.clone();
    }

}
