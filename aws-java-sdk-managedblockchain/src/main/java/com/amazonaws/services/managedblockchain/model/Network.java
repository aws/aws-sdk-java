/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Network configuration properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/Network" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Network implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the network.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the network.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Attributes of the blockchain framework for the network.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The blockchain framework that the network uses.
     * </p>
     */
    private String framework;
    /**
     * <p>
     * The version of the blockchain framework that the network uses.
     * </p>
     */
    private String frameworkVersion;
    /**
     * <p>
     * Attributes of the blockchain framework that the network uses.
     * </p>
     */
    private NetworkFrameworkAttributes frameworkAttributes;
    /**
     * <p>
     * The VPC endpoint service name of the VPC endpoint service of the network. Members use the VPC endpoint service
     * name to create a VPC endpoint to access network resources.
     * </p>
     */
    private String vpcEndpointServiceName;
    /**
     * <p>
     * The voting rules for the network to decide if a proposal is accepted.
     * </p>
     */
    private VotingPolicy votingPolicy;
    /**
     * <p>
     * The current status of the network.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time that the network was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The unique identifier of the network.
     * </p>
     * 
     * @param id
     *        The unique identifier of the network.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the network.
     * </p>
     * 
     * @return The unique identifier of the network.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the network.
     * </p>
     * 
     * @param id
     *        The unique identifier of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the network.
     * </p>
     * 
     * @param name
     *        The name of the network.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the network.
     * </p>
     * 
     * @return The name of the network.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the network.
     * </p>
     * 
     * @param name
     *        The name of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Attributes of the blockchain framework for the network.
     * </p>
     * 
     * @param description
     *        Attributes of the blockchain framework for the network.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Attributes of the blockchain framework for the network.
     * </p>
     * 
     * @return Attributes of the blockchain framework for the network.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Attributes of the blockchain framework for the network.
     * </p>
     * 
     * @param description
     *        Attributes of the blockchain framework for the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The blockchain framework that the network uses.
     * </p>
     * 
     * @param framework
     *        The blockchain framework that the network uses.
     * @see Framework
     */

    public void setFramework(String framework) {
        this.framework = framework;
    }

    /**
     * <p>
     * The blockchain framework that the network uses.
     * </p>
     * 
     * @return The blockchain framework that the network uses.
     * @see Framework
     */

    public String getFramework() {
        return this.framework;
    }

    /**
     * <p>
     * The blockchain framework that the network uses.
     * </p>
     * 
     * @param framework
     *        The blockchain framework that the network uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Framework
     */

    public Network withFramework(String framework) {
        setFramework(framework);
        return this;
    }

    /**
     * <p>
     * The blockchain framework that the network uses.
     * </p>
     * 
     * @param framework
     *        The blockchain framework that the network uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Framework
     */

    public Network withFramework(Framework framework) {
        this.framework = framework.toString();
        return this;
    }

    /**
     * <p>
     * The version of the blockchain framework that the network uses.
     * </p>
     * 
     * @param frameworkVersion
     *        The version of the blockchain framework that the network uses.
     */

    public void setFrameworkVersion(String frameworkVersion) {
        this.frameworkVersion = frameworkVersion;
    }

    /**
     * <p>
     * The version of the blockchain framework that the network uses.
     * </p>
     * 
     * @return The version of the blockchain framework that the network uses.
     */

    public String getFrameworkVersion() {
        return this.frameworkVersion;
    }

    /**
     * <p>
     * The version of the blockchain framework that the network uses.
     * </p>
     * 
     * @param frameworkVersion
     *        The version of the blockchain framework that the network uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withFrameworkVersion(String frameworkVersion) {
        setFrameworkVersion(frameworkVersion);
        return this;
    }

    /**
     * <p>
     * Attributes of the blockchain framework that the network uses.
     * </p>
     * 
     * @param frameworkAttributes
     *        Attributes of the blockchain framework that the network uses.
     */

    public void setFrameworkAttributes(NetworkFrameworkAttributes frameworkAttributes) {
        this.frameworkAttributes = frameworkAttributes;
    }

    /**
     * <p>
     * Attributes of the blockchain framework that the network uses.
     * </p>
     * 
     * @return Attributes of the blockchain framework that the network uses.
     */

    public NetworkFrameworkAttributes getFrameworkAttributes() {
        return this.frameworkAttributes;
    }

    /**
     * <p>
     * Attributes of the blockchain framework that the network uses.
     * </p>
     * 
     * @param frameworkAttributes
     *        Attributes of the blockchain framework that the network uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withFrameworkAttributes(NetworkFrameworkAttributes frameworkAttributes) {
        setFrameworkAttributes(frameworkAttributes);
        return this;
    }

    /**
     * <p>
     * The VPC endpoint service name of the VPC endpoint service of the network. Members use the VPC endpoint service
     * name to create a VPC endpoint to access network resources.
     * </p>
     * 
     * @param vpcEndpointServiceName
     *        The VPC endpoint service name of the VPC endpoint service of the network. Members use the VPC endpoint
     *        service name to create a VPC endpoint to access network resources.
     */

    public void setVpcEndpointServiceName(String vpcEndpointServiceName) {
        this.vpcEndpointServiceName = vpcEndpointServiceName;
    }

    /**
     * <p>
     * The VPC endpoint service name of the VPC endpoint service of the network. Members use the VPC endpoint service
     * name to create a VPC endpoint to access network resources.
     * </p>
     * 
     * @return The VPC endpoint service name of the VPC endpoint service of the network. Members use the VPC endpoint
     *         service name to create a VPC endpoint to access network resources.
     */

    public String getVpcEndpointServiceName() {
        return this.vpcEndpointServiceName;
    }

    /**
     * <p>
     * The VPC endpoint service name of the VPC endpoint service of the network. Members use the VPC endpoint service
     * name to create a VPC endpoint to access network resources.
     * </p>
     * 
     * @param vpcEndpointServiceName
     *        The VPC endpoint service name of the VPC endpoint service of the network. Members use the VPC endpoint
     *        service name to create a VPC endpoint to access network resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withVpcEndpointServiceName(String vpcEndpointServiceName) {
        setVpcEndpointServiceName(vpcEndpointServiceName);
        return this;
    }

    /**
     * <p>
     * The voting rules for the network to decide if a proposal is accepted.
     * </p>
     * 
     * @param votingPolicy
     *        The voting rules for the network to decide if a proposal is accepted.
     */

    public void setVotingPolicy(VotingPolicy votingPolicy) {
        this.votingPolicy = votingPolicy;
    }

    /**
     * <p>
     * The voting rules for the network to decide if a proposal is accepted.
     * </p>
     * 
     * @return The voting rules for the network to decide if a proposal is accepted.
     */

    public VotingPolicy getVotingPolicy() {
        return this.votingPolicy;
    }

    /**
     * <p>
     * The voting rules for the network to decide if a proposal is accepted.
     * </p>
     * 
     * @param votingPolicy
     *        The voting rules for the network to decide if a proposal is accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withVotingPolicy(VotingPolicy votingPolicy) {
        setVotingPolicy(votingPolicy);
        return this;
    }

    /**
     * <p>
     * The current status of the network.
     * </p>
     * 
     * @param status
     *        The current status of the network.
     * @see NetworkStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the network.
     * </p>
     * 
     * @return The current status of the network.
     * @see NetworkStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the network.
     * </p>
     * 
     * @param status
     *        The current status of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkStatus
     */

    public Network withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the network.
     * </p>
     * 
     * @param status
     *        The current status of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkStatus
     */

    public Network withStatus(NetworkStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the network was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time that the network was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time that the network was created.
     * </p>
     * 
     * @return The date and time that the network was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time that the network was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time that the network was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Network withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFramework() != null)
            sb.append("Framework: ").append(getFramework()).append(",");
        if (getFrameworkVersion() != null)
            sb.append("FrameworkVersion: ").append(getFrameworkVersion()).append(",");
        if (getFrameworkAttributes() != null)
            sb.append("FrameworkAttributes: ").append(getFrameworkAttributes()).append(",");
        if (getVpcEndpointServiceName() != null)
            sb.append("VpcEndpointServiceName: ").append(getVpcEndpointServiceName()).append(",");
        if (getVotingPolicy() != null)
            sb.append("VotingPolicy: ").append(getVotingPolicy()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Network == false)
            return false;
        Network other = (Network) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFramework() == null ^ this.getFramework() == null)
            return false;
        if (other.getFramework() != null && other.getFramework().equals(this.getFramework()) == false)
            return false;
        if (other.getFrameworkVersion() == null ^ this.getFrameworkVersion() == null)
            return false;
        if (other.getFrameworkVersion() != null && other.getFrameworkVersion().equals(this.getFrameworkVersion()) == false)
            return false;
        if (other.getFrameworkAttributes() == null ^ this.getFrameworkAttributes() == null)
            return false;
        if (other.getFrameworkAttributes() != null && other.getFrameworkAttributes().equals(this.getFrameworkAttributes()) == false)
            return false;
        if (other.getVpcEndpointServiceName() == null ^ this.getVpcEndpointServiceName() == null)
            return false;
        if (other.getVpcEndpointServiceName() != null && other.getVpcEndpointServiceName().equals(this.getVpcEndpointServiceName()) == false)
            return false;
        if (other.getVotingPolicy() == null ^ this.getVotingPolicy() == null)
            return false;
        if (other.getVotingPolicy() != null && other.getVotingPolicy().equals(this.getVotingPolicy()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFramework() == null) ? 0 : getFramework().hashCode());
        hashCode = prime * hashCode + ((getFrameworkVersion() == null) ? 0 : getFrameworkVersion().hashCode());
        hashCode = prime * hashCode + ((getFrameworkAttributes() == null) ? 0 : getFrameworkAttributes().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointServiceName() == null) ? 0 : getVpcEndpointServiceName().hashCode());
        hashCode = prime * hashCode + ((getVotingPolicy() == null) ? 0 : getVotingPolicy().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public Network clone() {
        try {
            return (Network) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.NetworkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
