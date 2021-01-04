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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A resource that represents the infrastructure where a third-party provider is installed. The host is used when you
 * create connections to an installed third-party provider type, such as GitHub Enterprise Server. You create one host
 * for all connections to that provider.
 * </p>
 * <note>
 * <p>
 * A host created through the CLI or the SDK is in `PENDING` status by default. You can make its status `AVAILABLE` by
 * setting up the host in the console.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/Host" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Host implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the host.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host.
     * </p>
     */
    private String hostArn;
    /**
     * <p>
     * The name of the installed provider to be associated with your connection. The host resource represents the
     * infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * The endpoint of the infrastructure where your provider type is installed.
     * </p>
     */
    private String providerEndpoint;
    /**
     * <p>
     * The VPC configuration provisioned for the host.
     * </p>
     */
    private VpcConfiguration vpcConfiguration;
    /**
     * <p>
     * The status of the host, such as PENDING, AVAILABLE, VPC_CONFIG_DELETING, VPC_CONFIG_INITIALIZING, and
     * VPC_CONFIG_FAILED_INITIALIZATION.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status description for the host.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The name of the host.
     * </p>
     * 
     * @param name
     *        The name of the host.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the host.
     * </p>
     * 
     * @return The name of the host.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the host.
     * </p>
     * 
     * @param name
     *        The name of the host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host.
     * </p>
     * 
     * @param hostArn
     *        The Amazon Resource Name (ARN) of the host.
     */

    public void setHostArn(String hostArn) {
        this.hostArn = hostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the host.
     */

    public String getHostArn() {
        return this.hostArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the host.
     * </p>
     * 
     * @param hostArn
     *        The Amazon Resource Name (ARN) of the host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withHostArn(String hostArn) {
        setHostArn(hostArn);
        return this;
    }

    /**
     * <p>
     * The name of the installed provider to be associated with your connection. The host resource represents the
     * infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * </p>
     * 
     * @param providerType
     *        The name of the installed provider to be associated with your connection. The host resource represents the
     *        infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * @see ProviderType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The name of the installed provider to be associated with your connection. The host resource represents the
     * infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * </p>
     * 
     * @return The name of the installed provider to be associated with your connection. The host resource represents
     *         the infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise
     *         Server.
     * @see ProviderType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The name of the installed provider to be associated with your connection. The host resource represents the
     * infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * </p>
     * 
     * @param providerType
     *        The name of the installed provider to be associated with your connection. The host resource represents the
     *        infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public Host withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The name of the installed provider to be associated with your connection. The host resource represents the
     * infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * </p>
     * 
     * @param providerType
     *        The name of the installed provider to be associated with your connection. The host resource represents the
     *        infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public Host withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The endpoint of the infrastructure where your provider type is installed.
     * </p>
     * 
     * @param providerEndpoint
     *        The endpoint of the infrastructure where your provider type is installed.
     */

    public void setProviderEndpoint(String providerEndpoint) {
        this.providerEndpoint = providerEndpoint;
    }

    /**
     * <p>
     * The endpoint of the infrastructure where your provider type is installed.
     * </p>
     * 
     * @return The endpoint of the infrastructure where your provider type is installed.
     */

    public String getProviderEndpoint() {
        return this.providerEndpoint;
    }

    /**
     * <p>
     * The endpoint of the infrastructure where your provider type is installed.
     * </p>
     * 
     * @param providerEndpoint
     *        The endpoint of the infrastructure where your provider type is installed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withProviderEndpoint(String providerEndpoint) {
        setProviderEndpoint(providerEndpoint);
        return this;
    }

    /**
     * <p>
     * The VPC configuration provisioned for the host.
     * </p>
     * 
     * @param vpcConfiguration
     *        The VPC configuration provisioned for the host.
     */

    public void setVpcConfiguration(VpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * The VPC configuration provisioned for the host.
     * </p>
     * 
     * @return The VPC configuration provisioned for the host.
     */

    public VpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * The VPC configuration provisioned for the host.
     * </p>
     * 
     * @param vpcConfiguration
     *        The VPC configuration provisioned for the host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withVpcConfiguration(VpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * The status of the host, such as PENDING, AVAILABLE, VPC_CONFIG_DELETING, VPC_CONFIG_INITIALIZING, and
     * VPC_CONFIG_FAILED_INITIALIZATION.
     * </p>
     * 
     * @param status
     *        The status of the host, such as PENDING, AVAILABLE, VPC_CONFIG_DELETING, VPC_CONFIG_INITIALIZING, and
     *        VPC_CONFIG_FAILED_INITIALIZATION.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the host, such as PENDING, AVAILABLE, VPC_CONFIG_DELETING, VPC_CONFIG_INITIALIZING, and
     * VPC_CONFIG_FAILED_INITIALIZATION.
     * </p>
     * 
     * @return The status of the host, such as PENDING, AVAILABLE, VPC_CONFIG_DELETING, VPC_CONFIG_INITIALIZING, and
     *         VPC_CONFIG_FAILED_INITIALIZATION.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the host, such as PENDING, AVAILABLE, VPC_CONFIG_DELETING, VPC_CONFIG_INITIALIZING, and
     * VPC_CONFIG_FAILED_INITIALIZATION.
     * </p>
     * 
     * @param status
     *        The status of the host, such as PENDING, AVAILABLE, VPC_CONFIG_DELETING, VPC_CONFIG_INITIALIZING, and
     *        VPC_CONFIG_FAILED_INITIALIZATION.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status description for the host.
     * </p>
     * 
     * @param statusMessage
     *        The status description for the host.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status description for the host.
     * </p>
     * 
     * @return The status description for the host.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status description for the host.
     * </p>
     * 
     * @param statusMessage
     *        The status description for the host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Host withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getHostArn() != null)
            sb.append("HostArn: ").append(getHostArn()).append(",");
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getProviderEndpoint() != null)
            sb.append("ProviderEndpoint: ").append(getProviderEndpoint()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Host == false)
            return false;
        Host other = (Host) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getHostArn() == null ^ this.getHostArn() == null)
            return false;
        if (other.getHostArn() != null && other.getHostArn().equals(this.getHostArn()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getProviderEndpoint() == null ^ this.getProviderEndpoint() == null)
            return false;
        if (other.getProviderEndpoint() != null && other.getProviderEndpoint().equals(this.getProviderEndpoint()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getHostArn() == null) ? 0 : getHostArn().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getProviderEndpoint() == null) ? 0 : getProviderEndpoint().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public Host clone() {
        try {
            return (Host) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestarconnections.model.transform.HostMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
