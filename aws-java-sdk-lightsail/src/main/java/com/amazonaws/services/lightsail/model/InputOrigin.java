/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the origin resource of an Amazon Lightsail content delivery network (CDN) distribution.
 * </p>
 * <p>
 * An origin can be a Lightsail instance or load balancer. A distribution pulls content from an origin, caches it, and
 * serves it to viewers via a worldwide network of edge servers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/InputOrigin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputOrigin implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the origin resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The AWS Region name of the origin resource.
     * </p>
     */
    private String regionName;
    /**
     * <p>
     * The protocol that your Amazon Lightsail distribution uses when establishing a connection with your origin to pull
     * content.
     * </p>
     */
    private String protocolPolicy;

    /**
     * <p>
     * The name of the origin resource.
     * </p>
     * 
     * @param name
     *        The name of the origin resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the origin resource.
     * </p>
     * 
     * @return The name of the origin resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the origin resource.
     * </p>
     * 
     * @param name
     *        The name of the origin resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputOrigin withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The AWS Region name of the origin resource.
     * </p>
     * 
     * @param regionName
     *        The AWS Region name of the origin resource.
     * @see RegionName
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The AWS Region name of the origin resource.
     * </p>
     * 
     * @return The AWS Region name of the origin resource.
     * @see RegionName
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The AWS Region name of the origin resource.
     * </p>
     * 
     * @param regionName
     *        The AWS Region name of the origin resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionName
     */

    public InputOrigin withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * The AWS Region name of the origin resource.
     * </p>
     * 
     * @param regionName
     *        The AWS Region name of the origin resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionName
     */

    public InputOrigin withRegionName(RegionName regionName) {
        this.regionName = regionName.toString();
        return this;
    }

    /**
     * <p>
     * The protocol that your Amazon Lightsail distribution uses when establishing a connection with your origin to pull
     * content.
     * </p>
     * 
     * @param protocolPolicy
     *        The protocol that your Amazon Lightsail distribution uses when establishing a connection with your origin
     *        to pull content.
     * @see OriginProtocolPolicyEnum
     */

    public void setProtocolPolicy(String protocolPolicy) {
        this.protocolPolicy = protocolPolicy;
    }

    /**
     * <p>
     * The protocol that your Amazon Lightsail distribution uses when establishing a connection with your origin to pull
     * content.
     * </p>
     * 
     * @return The protocol that your Amazon Lightsail distribution uses when establishing a connection with your origin
     *         to pull content.
     * @see OriginProtocolPolicyEnum
     */

    public String getProtocolPolicy() {
        return this.protocolPolicy;
    }

    /**
     * <p>
     * The protocol that your Amazon Lightsail distribution uses when establishing a connection with your origin to pull
     * content.
     * </p>
     * 
     * @param protocolPolicy
     *        The protocol that your Amazon Lightsail distribution uses when establishing a connection with your origin
     *        to pull content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginProtocolPolicyEnum
     */

    public InputOrigin withProtocolPolicy(String protocolPolicy) {
        setProtocolPolicy(protocolPolicy);
        return this;
    }

    /**
     * <p>
     * The protocol that your Amazon Lightsail distribution uses when establishing a connection with your origin to pull
     * content.
     * </p>
     * 
     * @param protocolPolicy
     *        The protocol that your Amazon Lightsail distribution uses when establishing a connection with your origin
     *        to pull content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginProtocolPolicyEnum
     */

    public InputOrigin withProtocolPolicy(OriginProtocolPolicyEnum protocolPolicy) {
        this.protocolPolicy = protocolPolicy.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRegionName() != null)
            sb.append("RegionName: ").append(getRegionName()).append(",");
        if (getProtocolPolicy() != null)
            sb.append("ProtocolPolicy: ").append(getProtocolPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputOrigin == false)
            return false;
        InputOrigin other = (InputOrigin) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getProtocolPolicy() == null ^ this.getProtocolPolicy() == null)
            return false;
        if (other.getProtocolPolicy() != null && other.getProtocolPolicy().equals(this.getProtocolPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getProtocolPolicy() == null) ? 0 : getProtocolPolicy().hashCode());
        return hashCode;
    }

    @Override
    public InputOrigin clone() {
        try {
            return (InputOrigin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.InputOriginMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
