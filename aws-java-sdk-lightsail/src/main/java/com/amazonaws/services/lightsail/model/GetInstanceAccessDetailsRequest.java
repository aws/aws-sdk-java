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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceAccessDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstanceAccessDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the instance to access.
     * </p>
     */
    private String instanceName;
    /**
     * <p>
     * The protocol to use to connect to your instance. Defaults to <code>ssh</code>.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The name of the instance to access.
     * </p>
     * 
     * @param instanceName
     *        The name of the instance to access.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the instance to access.
     * </p>
     * 
     * @return The name of the instance to access.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The name of the instance to access.
     * </p>
     * 
     * @param instanceName
     *        The name of the instance to access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceAccessDetailsRequest withInstanceName(String instanceName) {
        setInstanceName(instanceName);
        return this;
    }

    /**
     * <p>
     * The protocol to use to connect to your instance. Defaults to <code>ssh</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol to use to connect to your instance. Defaults to <code>ssh</code>.
     * @see InstanceAccessProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to use to connect to your instance. Defaults to <code>ssh</code>.
     * </p>
     * 
     * @return The protocol to use to connect to your instance. Defaults to <code>ssh</code>.
     * @see InstanceAccessProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol to use to connect to your instance. Defaults to <code>ssh</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol to use to connect to your instance. Defaults to <code>ssh</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceAccessProtocol
     */

    public GetInstanceAccessDetailsRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol to use to connect to your instance. Defaults to <code>ssh</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol to use to connect to your instance. Defaults to <code>ssh</code>.
     * @see InstanceAccessProtocol
     */

    public void setProtocol(InstanceAccessProtocol protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The protocol to use to connect to your instance. Defaults to <code>ssh</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol to use to connect to your instance. Defaults to <code>ssh</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceAccessProtocol
     */

    public GetInstanceAccessDetailsRequest withProtocol(InstanceAccessProtocol protocol) {
        this.protocol = protocol.toString();
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
        if (getInstanceName() != null)
            sb.append("InstanceName: ").append(getInstanceName()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceAccessDetailsRequest == false)
            return false;
        GetInstanceAccessDetailsRequest other = (GetInstanceAccessDetailsRequest) obj;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceAccessDetailsRequest clone() {
        return (GetInstanceAccessDetailsRequest) super.clone();
    }

}
