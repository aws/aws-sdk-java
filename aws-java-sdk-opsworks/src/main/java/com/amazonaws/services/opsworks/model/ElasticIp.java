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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Elastic IP address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/ElasticIp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticIp implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IP address.
     * </p>
     */
    private String ip;
    /**
     * <p>
     * The name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The domain.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The AWS region. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The ID of the instance that the address is attached to.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param ip
     *        The IP address.
     */

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @return The IP address.
     */

    public String getIp() {
        return this.ip;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param ip
     *        The IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticIp withIp(String ip) {
        setIp(ip);
        return this;
    }

    /**
     * <p>
     * The name.
     * </p>
     * 
     * @param name
     *        The name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name.
     * </p>
     * 
     * @return The name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name.
     * </p>
     * 
     * @param name
     *        The name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticIp withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The domain.
     * </p>
     * 
     * @param domain
     *        The domain.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain.
     * </p>
     * 
     * @return The domain.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain.
     * </p>
     * 
     * @param domain
     *        The domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticIp withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The AWS region. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param region
     *        The AWS region. For more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS region. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @return The AWS region. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS region. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param region
     *        The AWS region. For more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticIp withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The ID of the instance that the address is attached to.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance that the address is attached to.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance that the address is attached to.
     * </p>
     * 
     * @return The ID of the instance that the address is attached to.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance that the address is attached to.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance that the address is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticIp withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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
        if (getIp() != null)
            sb.append("Ip: ").append(getIp()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticIp == false)
            return false;
        ElasticIp other = (ElasticIp) obj;
        if (other.getIp() == null ^ this.getIp() == null)
            return false;
        if (other.getIp() != null && other.getIp().equals(this.getIp()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIp() == null) ? 0 : getIp().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public ElasticIp clone() {
        try {
            return (ElasticIp) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.ElasticIpMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
