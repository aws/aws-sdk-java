/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about an Amazon Route 53 hosted zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRoute53HostedZoneObjectDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRoute53HostedZoneObjectDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID that Route 53 assigns to the hosted zone when you create it.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the domain. For public hosted zones, this is the name that you have registered with your DNS
     * registrar.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An object that includes the <code>Comment</code> element.
     * </p>
     */
    private AwsRoute53HostedZoneConfigDetails config;

    /**
     * <p>
     * The ID that Route 53 assigns to the hosted zone when you create it.
     * </p>
     * 
     * @param id
     *        The ID that Route 53 assigns to the hosted zone when you create it.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that Route 53 assigns to the hosted zone when you create it.
     * </p>
     * 
     * @return The ID that Route 53 assigns to the hosted zone when you create it.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID that Route 53 assigns to the hosted zone when you create it.
     * </p>
     * 
     * @param id
     *        The ID that Route 53 assigns to the hosted zone when you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRoute53HostedZoneObjectDetails withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the domain. For public hosted zones, this is the name that you have registered with your DNS
     * registrar.
     * </p>
     * 
     * @param name
     *        The name of the domain. For public hosted zones, this is the name that you have registered with your DNS
     *        registrar.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain. For public hosted zones, this is the name that you have registered with your DNS
     * registrar.
     * </p>
     * 
     * @return The name of the domain. For public hosted zones, this is the name that you have registered with your DNS
     *         registrar.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain. For public hosted zones, this is the name that you have registered with your DNS
     * registrar.
     * </p>
     * 
     * @param name
     *        The name of the domain. For public hosted zones, this is the name that you have registered with your DNS
     *        registrar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRoute53HostedZoneObjectDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An object that includes the <code>Comment</code> element.
     * </p>
     * 
     * @param config
     *        An object that includes the <code>Comment</code> element.
     */

    public void setConfig(AwsRoute53HostedZoneConfigDetails config) {
        this.config = config;
    }

    /**
     * <p>
     * An object that includes the <code>Comment</code> element.
     * </p>
     * 
     * @return An object that includes the <code>Comment</code> element.
     */

    public AwsRoute53HostedZoneConfigDetails getConfig() {
        return this.config;
    }

    /**
     * <p>
     * An object that includes the <code>Comment</code> element.
     * </p>
     * 
     * @param config
     *        An object that includes the <code>Comment</code> element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRoute53HostedZoneObjectDetails withConfig(AwsRoute53HostedZoneConfigDetails config) {
        setConfig(config);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getConfig() != null)
            sb.append("Config: ").append(getConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRoute53HostedZoneObjectDetails == false)
            return false;
        AwsRoute53HostedZoneObjectDetails other = (AwsRoute53HostedZoneObjectDetails) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode());
        return hashCode;
    }

    @Override
    public AwsRoute53HostedZoneObjectDetails clone() {
        try {
            return (AwsRoute53HostedZoneObjectDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRoute53HostedZoneObjectDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
