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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachStaticIp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachStaticIpRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the static IP.
     * </p>
     */
    private String staticIpName;
    /**
     * <p>
     * The instance name to which you want to attach the static IP address.
     * </p>
     */
    private String instanceName;

    /**
     * <p>
     * The name of the static IP.
     * </p>
     * 
     * @param staticIpName
     *        The name of the static IP.
     */

    public void setStaticIpName(String staticIpName) {
        this.staticIpName = staticIpName;
    }

    /**
     * <p>
     * The name of the static IP.
     * </p>
     * 
     * @return The name of the static IP.
     */

    public String getStaticIpName() {
        return this.staticIpName;
    }

    /**
     * <p>
     * The name of the static IP.
     * </p>
     * 
     * @param staticIpName
     *        The name of the static IP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachStaticIpRequest withStaticIpName(String staticIpName) {
        setStaticIpName(staticIpName);
        return this;
    }

    /**
     * <p>
     * The instance name to which you want to attach the static IP address.
     * </p>
     * 
     * @param instanceName
     *        The instance name to which you want to attach the static IP address.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The instance name to which you want to attach the static IP address.
     * </p>
     * 
     * @return The instance name to which you want to attach the static IP address.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The instance name to which you want to attach the static IP address.
     * </p>
     * 
     * @param instanceName
     *        The instance name to which you want to attach the static IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachStaticIpRequest withInstanceName(String instanceName) {
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
        if (getStaticIpName() != null)
            sb.append("StaticIpName: ").append(getStaticIpName()).append(",");
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

        if (obj instanceof AttachStaticIpRequest == false)
            return false;
        AttachStaticIpRequest other = (AttachStaticIpRequest) obj;
        if (other.getStaticIpName() == null ^ this.getStaticIpName() == null)
            return false;
        if (other.getStaticIpName() != null && other.getStaticIpName().equals(this.getStaticIpName()) == false)
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

        hashCode = prime * hashCode + ((getStaticIpName() == null) ? 0 : getStaticIpName().hashCode());
        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        return hashCode;
    }

    @Override
    public AttachStaticIpRequest clone() {
        return (AttachStaticIpRequest) super.clone();
    }

}
