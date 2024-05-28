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
 * Provides details about a specified Amazon Route 53 hosted zone, including the four name servers assigned to the
 * hosted zone. A hosted zone represents a collection of records that can be managed together, belonging to a single
 * parent domain name.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRoute53HostedZoneDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRoute53HostedZoneDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains information about the specified hosted zone.
     * </p>
     */
    private AwsRoute53HostedZoneObjectDetails hostedZone;
    /**
     * <p>
     * An object that contains information about the Amazon Virtual Private Clouds (Amazon VPCs) that are associated
     * with the specified hosted zone.
     * </p>
     */
    private java.util.List<AwsRoute53HostedZoneVpcDetails> vpcs;
    /**
     * <p>
     * An object that contains a list of the authoritative name servers for a hosted zone or for a reusable delegation
     * set.
     * </p>
     */
    private java.util.List<String> nameServers;
    /**
     * <p>
     * An array that contains one <code>QueryLoggingConfig</code> element for each DNS query logging configuration that
     * is associated with the current Amazon Web Services account.
     * </p>
     */
    private AwsRoute53QueryLoggingConfigDetails queryLoggingConfig;

    /**
     * <p>
     * An object that contains information about the specified hosted zone.
     * </p>
     * 
     * @param hostedZone
     *        An object that contains information about the specified hosted zone.
     */

    public void setHostedZone(AwsRoute53HostedZoneObjectDetails hostedZone) {
        this.hostedZone = hostedZone;
    }

    /**
     * <p>
     * An object that contains information about the specified hosted zone.
     * </p>
     * 
     * @return An object that contains information about the specified hosted zone.
     */

    public AwsRoute53HostedZoneObjectDetails getHostedZone() {
        return this.hostedZone;
    }

    /**
     * <p>
     * An object that contains information about the specified hosted zone.
     * </p>
     * 
     * @param hostedZone
     *        An object that contains information about the specified hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRoute53HostedZoneDetails withHostedZone(AwsRoute53HostedZoneObjectDetails hostedZone) {
        setHostedZone(hostedZone);
        return this;
    }

    /**
     * <p>
     * An object that contains information about the Amazon Virtual Private Clouds (Amazon VPCs) that are associated
     * with the specified hosted zone.
     * </p>
     * 
     * @return An object that contains information about the Amazon Virtual Private Clouds (Amazon VPCs) that are
     *         associated with the specified hosted zone.
     */

    public java.util.List<AwsRoute53HostedZoneVpcDetails> getVpcs() {
        return vpcs;
    }

    /**
     * <p>
     * An object that contains information about the Amazon Virtual Private Clouds (Amazon VPCs) that are associated
     * with the specified hosted zone.
     * </p>
     * 
     * @param vpcs
     *        An object that contains information about the Amazon Virtual Private Clouds (Amazon VPCs) that are
     *        associated with the specified hosted zone.
     */

    public void setVpcs(java.util.Collection<AwsRoute53HostedZoneVpcDetails> vpcs) {
        if (vpcs == null) {
            this.vpcs = null;
            return;
        }

        this.vpcs = new java.util.ArrayList<AwsRoute53HostedZoneVpcDetails>(vpcs);
    }

    /**
     * <p>
     * An object that contains information about the Amazon Virtual Private Clouds (Amazon VPCs) that are associated
     * with the specified hosted zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcs(java.util.Collection)} or {@link #withVpcs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param vpcs
     *        An object that contains information about the Amazon Virtual Private Clouds (Amazon VPCs) that are
     *        associated with the specified hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRoute53HostedZoneDetails withVpcs(AwsRoute53HostedZoneVpcDetails... vpcs) {
        if (this.vpcs == null) {
            setVpcs(new java.util.ArrayList<AwsRoute53HostedZoneVpcDetails>(vpcs.length));
        }
        for (AwsRoute53HostedZoneVpcDetails ele : vpcs) {
            this.vpcs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that contains information about the Amazon Virtual Private Clouds (Amazon VPCs) that are associated
     * with the specified hosted zone.
     * </p>
     * 
     * @param vpcs
     *        An object that contains information about the Amazon Virtual Private Clouds (Amazon VPCs) that are
     *        associated with the specified hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRoute53HostedZoneDetails withVpcs(java.util.Collection<AwsRoute53HostedZoneVpcDetails> vpcs) {
        setVpcs(vpcs);
        return this;
    }

    /**
     * <p>
     * An object that contains a list of the authoritative name servers for a hosted zone or for a reusable delegation
     * set.
     * </p>
     * 
     * @return An object that contains a list of the authoritative name servers for a hosted zone or for a reusable
     *         delegation set.
     */

    public java.util.List<String> getNameServers() {
        return nameServers;
    }

    /**
     * <p>
     * An object that contains a list of the authoritative name servers for a hosted zone or for a reusable delegation
     * set.
     * </p>
     * 
     * @param nameServers
     *        An object that contains a list of the authoritative name servers for a hosted zone or for a reusable
     *        delegation set.
     */

    public void setNameServers(java.util.Collection<String> nameServers) {
        if (nameServers == null) {
            this.nameServers = null;
            return;
        }

        this.nameServers = new java.util.ArrayList<String>(nameServers);
    }

    /**
     * <p>
     * An object that contains a list of the authoritative name servers for a hosted zone or for a reusable delegation
     * set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNameServers(java.util.Collection)} or {@link #withNameServers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nameServers
     *        An object that contains a list of the authoritative name servers for a hosted zone or for a reusable
     *        delegation set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRoute53HostedZoneDetails withNameServers(String... nameServers) {
        if (this.nameServers == null) {
            setNameServers(new java.util.ArrayList<String>(nameServers.length));
        }
        for (String ele : nameServers) {
            this.nameServers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that contains a list of the authoritative name servers for a hosted zone or for a reusable delegation
     * set.
     * </p>
     * 
     * @param nameServers
     *        An object that contains a list of the authoritative name servers for a hosted zone or for a reusable
     *        delegation set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRoute53HostedZoneDetails withNameServers(java.util.Collection<String> nameServers) {
        setNameServers(nameServers);
        return this;
    }

    /**
     * <p>
     * An array that contains one <code>QueryLoggingConfig</code> element for each DNS query logging configuration that
     * is associated with the current Amazon Web Services account.
     * </p>
     * 
     * @param queryLoggingConfig
     *        An array that contains one <code>QueryLoggingConfig</code> element for each DNS query logging
     *        configuration that is associated with the current Amazon Web Services account.
     */

    public void setQueryLoggingConfig(AwsRoute53QueryLoggingConfigDetails queryLoggingConfig) {
        this.queryLoggingConfig = queryLoggingConfig;
    }

    /**
     * <p>
     * An array that contains one <code>QueryLoggingConfig</code> element for each DNS query logging configuration that
     * is associated with the current Amazon Web Services account.
     * </p>
     * 
     * @return An array that contains one <code>QueryLoggingConfig</code> element for each DNS query logging
     *         configuration that is associated with the current Amazon Web Services account.
     */

    public AwsRoute53QueryLoggingConfigDetails getQueryLoggingConfig() {
        return this.queryLoggingConfig;
    }

    /**
     * <p>
     * An array that contains one <code>QueryLoggingConfig</code> element for each DNS query logging configuration that
     * is associated with the current Amazon Web Services account.
     * </p>
     * 
     * @param queryLoggingConfig
     *        An array that contains one <code>QueryLoggingConfig</code> element for each DNS query logging
     *        configuration that is associated with the current Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRoute53HostedZoneDetails withQueryLoggingConfig(AwsRoute53QueryLoggingConfigDetails queryLoggingConfig) {
        setQueryLoggingConfig(queryLoggingConfig);
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
        if (getHostedZone() != null)
            sb.append("HostedZone: ").append(getHostedZone()).append(",");
        if (getVpcs() != null)
            sb.append("Vpcs: ").append(getVpcs()).append(",");
        if (getNameServers() != null)
            sb.append("NameServers: ").append(getNameServers()).append(",");
        if (getQueryLoggingConfig() != null)
            sb.append("QueryLoggingConfig: ").append(getQueryLoggingConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRoute53HostedZoneDetails == false)
            return false;
        AwsRoute53HostedZoneDetails other = (AwsRoute53HostedZoneDetails) obj;
        if (other.getHostedZone() == null ^ this.getHostedZone() == null)
            return false;
        if (other.getHostedZone() != null && other.getHostedZone().equals(this.getHostedZone()) == false)
            return false;
        if (other.getVpcs() == null ^ this.getVpcs() == null)
            return false;
        if (other.getVpcs() != null && other.getVpcs().equals(this.getVpcs()) == false)
            return false;
        if (other.getNameServers() == null ^ this.getNameServers() == null)
            return false;
        if (other.getNameServers() != null && other.getNameServers().equals(this.getNameServers()) == false)
            return false;
        if (other.getQueryLoggingConfig() == null ^ this.getQueryLoggingConfig() == null)
            return false;
        if (other.getQueryLoggingConfig() != null && other.getQueryLoggingConfig().equals(this.getQueryLoggingConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostedZone() == null) ? 0 : getHostedZone().hashCode());
        hashCode = prime * hashCode + ((getVpcs() == null) ? 0 : getVpcs().hashCode());
        hashCode = prime * hashCode + ((getNameServers() == null) ? 0 : getNameServers().hashCode());
        hashCode = prime * hashCode + ((getQueryLoggingConfig() == null) ? 0 : getQueryLoggingConfig().hashCode());
        return hashCode;
    }

    @Override
    public AwsRoute53HostedZoneDetails clone() {
        try {
            return (AwsRoute53HostedZoneDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRoute53HostedZoneDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
