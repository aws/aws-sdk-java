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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Option for host instance type.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/BrokerInstanceOption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BrokerInstanceOption implements Serializable, Cloneable, StructuredPojo {

    /** The list of available az. */
    private java.util.List<AvailabilityZone> availabilityZones;
    /** The type of broker engine. */
    private String engineType;
    /** The type of broker instance. */
    private String hostInstanceType;
    /** The list of supported engine versions. */
    private java.util.List<String> supportedEngineVersions;

    /**
     * The list of available az.
     * 
     * @return The list of available az.
     */

    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * The list of available az.
     * 
     * @param availabilityZones
     *        The list of available az.
     */

    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<AvailabilityZone>(availabilityZones);
    }

    /**
     * The list of available az.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The list of available az.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerInstanceOption withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<AvailabilityZone>(availabilityZones.length));
        }
        for (AvailabilityZone ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * The list of available az.
     * 
     * @param availabilityZones
     *        The list of available az.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerInstanceOption withAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * The type of broker engine.
     * 
     * @param engineType
     *        The type of broker engine.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * The type of broker engine.
     * 
     * @return The type of broker engine.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * The type of broker engine.
     * 
     * @param engineType
     *        The type of broker engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public BrokerInstanceOption withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * The type of broker engine.
     * 
     * @param engineType
     *        The type of broker engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public BrokerInstanceOption withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * The type of broker instance.
     * 
     * @param hostInstanceType
     *        The type of broker instance.
     */

    public void setHostInstanceType(String hostInstanceType) {
        this.hostInstanceType = hostInstanceType;
    }

    /**
     * The type of broker instance.
     * 
     * @return The type of broker instance.
     */

    public String getHostInstanceType() {
        return this.hostInstanceType;
    }

    /**
     * The type of broker instance.
     * 
     * @param hostInstanceType
     *        The type of broker instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerInstanceOption withHostInstanceType(String hostInstanceType) {
        setHostInstanceType(hostInstanceType);
        return this;
    }

    /**
     * The list of supported engine versions.
     * 
     * @return The list of supported engine versions.
     */

    public java.util.List<String> getSupportedEngineVersions() {
        return supportedEngineVersions;
    }

    /**
     * The list of supported engine versions.
     * 
     * @param supportedEngineVersions
     *        The list of supported engine versions.
     */

    public void setSupportedEngineVersions(java.util.Collection<String> supportedEngineVersions) {
        if (supportedEngineVersions == null) {
            this.supportedEngineVersions = null;
            return;
        }

        this.supportedEngineVersions = new java.util.ArrayList<String>(supportedEngineVersions);
    }

    /**
     * The list of supported engine versions.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedEngineVersions(java.util.Collection)} or
     * {@link #withSupportedEngineVersions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedEngineVersions
     *        The list of supported engine versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerInstanceOption withSupportedEngineVersions(String... supportedEngineVersions) {
        if (this.supportedEngineVersions == null) {
            setSupportedEngineVersions(new java.util.ArrayList<String>(supportedEngineVersions.length));
        }
        for (String ele : supportedEngineVersions) {
            this.supportedEngineVersions.add(ele);
        }
        return this;
    }

    /**
     * The list of supported engine versions.
     * 
     * @param supportedEngineVersions
     *        The list of supported engine versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerInstanceOption withSupportedEngineVersions(java.util.Collection<String> supportedEngineVersions) {
        setSupportedEngineVersions(supportedEngineVersions);
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getHostInstanceType() != null)
            sb.append("HostInstanceType: ").append(getHostInstanceType()).append(",");
        if (getSupportedEngineVersions() != null)
            sb.append("SupportedEngineVersions: ").append(getSupportedEngineVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BrokerInstanceOption == false)
            return false;
        BrokerInstanceOption other = (BrokerInstanceOption) obj;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        if (other.getHostInstanceType() == null ^ this.getHostInstanceType() == null)
            return false;
        if (other.getHostInstanceType() != null && other.getHostInstanceType().equals(this.getHostInstanceType()) == false)
            return false;
        if (other.getSupportedEngineVersions() == null ^ this.getSupportedEngineVersions() == null)
            return false;
        if (other.getSupportedEngineVersions() != null && other.getSupportedEngineVersions().equals(this.getSupportedEngineVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getHostInstanceType() == null) ? 0 : getHostInstanceType().hashCode());
        hashCode = prime * hashCode + ((getSupportedEngineVersions() == null) ? 0 : getSupportedEngineVersions().hashCode());
        return hashCode;
    }

    @Override
    public BrokerInstanceOption clone() {
        try {
            return (BrokerInstanceOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.BrokerInstanceOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
