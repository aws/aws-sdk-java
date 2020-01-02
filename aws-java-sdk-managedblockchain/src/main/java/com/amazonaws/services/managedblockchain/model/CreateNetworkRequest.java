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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/CreateNetwork" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The name of the network.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional description for the network.
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
     * Configuration properties of the blockchain framework relevant to the network configuration.
     * </p>
     */
    private NetworkFrameworkConfiguration frameworkConfiguration;
    /**
     * <p>
     * The voting rules used by the network to determine if a proposal is approved.
     * </p>
     */
    private VotingPolicy votingPolicy;
    /**
     * <p>
     * Configuration properties for the first member within the network.
     * </p>
     */
    private MemberConfiguration memberConfiguration;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than one time. This identifier is required only if you make a
     *        service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the
     *        AWS CLI.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *         idempotent operation completes no more than one time. This identifier is required only if you make a
     *         service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the
     *         AWS CLI.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time. This identifier is required only if you make a service request
     * directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than one time. This identifier is required only if you make a
     *        service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the
     *        AWS CLI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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

    public CreateNetworkRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An optional description for the network.
     * </p>
     * 
     * @param description
     *        An optional description for the network.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the network.
     * </p>
     * 
     * @return An optional description for the network.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for the network.
     * </p>
     * 
     * @param description
     *        An optional description for the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkRequest withDescription(String description) {
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

    public CreateNetworkRequest withFramework(String framework) {
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

    public CreateNetworkRequest withFramework(Framework framework) {
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

    public CreateNetworkRequest withFrameworkVersion(String frameworkVersion) {
        setFrameworkVersion(frameworkVersion);
        return this;
    }

    /**
     * <p>
     * Configuration properties of the blockchain framework relevant to the network configuration.
     * </p>
     * 
     * @param frameworkConfiguration
     *        Configuration properties of the blockchain framework relevant to the network configuration.
     */

    public void setFrameworkConfiguration(NetworkFrameworkConfiguration frameworkConfiguration) {
        this.frameworkConfiguration = frameworkConfiguration;
    }

    /**
     * <p>
     * Configuration properties of the blockchain framework relevant to the network configuration.
     * </p>
     * 
     * @return Configuration properties of the blockchain framework relevant to the network configuration.
     */

    public NetworkFrameworkConfiguration getFrameworkConfiguration() {
        return this.frameworkConfiguration;
    }

    /**
     * <p>
     * Configuration properties of the blockchain framework relevant to the network configuration.
     * </p>
     * 
     * @param frameworkConfiguration
     *        Configuration properties of the blockchain framework relevant to the network configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkRequest withFrameworkConfiguration(NetworkFrameworkConfiguration frameworkConfiguration) {
        setFrameworkConfiguration(frameworkConfiguration);
        return this;
    }

    /**
     * <p>
     * The voting rules used by the network to determine if a proposal is approved.
     * </p>
     * 
     * @param votingPolicy
     *        The voting rules used by the network to determine if a proposal is approved.
     */

    public void setVotingPolicy(VotingPolicy votingPolicy) {
        this.votingPolicy = votingPolicy;
    }

    /**
     * <p>
     * The voting rules used by the network to determine if a proposal is approved.
     * </p>
     * 
     * @return The voting rules used by the network to determine if a proposal is approved.
     */

    public VotingPolicy getVotingPolicy() {
        return this.votingPolicy;
    }

    /**
     * <p>
     * The voting rules used by the network to determine if a proposal is approved.
     * </p>
     * 
     * @param votingPolicy
     *        The voting rules used by the network to determine if a proposal is approved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkRequest withVotingPolicy(VotingPolicy votingPolicy) {
        setVotingPolicy(votingPolicy);
        return this;
    }

    /**
     * <p>
     * Configuration properties for the first member within the network.
     * </p>
     * 
     * @param memberConfiguration
     *        Configuration properties for the first member within the network.
     */

    public void setMemberConfiguration(MemberConfiguration memberConfiguration) {
        this.memberConfiguration = memberConfiguration;
    }

    /**
     * <p>
     * Configuration properties for the first member within the network.
     * </p>
     * 
     * @return Configuration properties for the first member within the network.
     */

    public MemberConfiguration getMemberConfiguration() {
        return this.memberConfiguration;
    }

    /**
     * <p>
     * Configuration properties for the first member within the network.
     * </p>
     * 
     * @param memberConfiguration
     *        Configuration properties for the first member within the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkRequest withMemberConfiguration(MemberConfiguration memberConfiguration) {
        setMemberConfiguration(memberConfiguration);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFramework() != null)
            sb.append("Framework: ").append(getFramework()).append(",");
        if (getFrameworkVersion() != null)
            sb.append("FrameworkVersion: ").append(getFrameworkVersion()).append(",");
        if (getFrameworkConfiguration() != null)
            sb.append("FrameworkConfiguration: ").append(getFrameworkConfiguration()).append(",");
        if (getVotingPolicy() != null)
            sb.append("VotingPolicy: ").append(getVotingPolicy()).append(",");
        if (getMemberConfiguration() != null)
            sb.append("MemberConfiguration: ").append(getMemberConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNetworkRequest == false)
            return false;
        CreateNetworkRequest other = (CreateNetworkRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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
        if (other.getFrameworkConfiguration() == null ^ this.getFrameworkConfiguration() == null)
            return false;
        if (other.getFrameworkConfiguration() != null && other.getFrameworkConfiguration().equals(this.getFrameworkConfiguration()) == false)
            return false;
        if (other.getVotingPolicy() == null ^ this.getVotingPolicy() == null)
            return false;
        if (other.getVotingPolicy() != null && other.getVotingPolicy().equals(this.getVotingPolicy()) == false)
            return false;
        if (other.getMemberConfiguration() == null ^ this.getMemberConfiguration() == null)
            return false;
        if (other.getMemberConfiguration() != null && other.getMemberConfiguration().equals(this.getMemberConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFramework() == null) ? 0 : getFramework().hashCode());
        hashCode = prime * hashCode + ((getFrameworkVersion() == null) ? 0 : getFrameworkVersion().hashCode());
        hashCode = prime * hashCode + ((getFrameworkConfiguration() == null) ? 0 : getFrameworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVotingPolicy() == null) ? 0 : getVotingPolicy().hashCode());
        hashCode = prime * hashCode + ((getMemberConfiguration() == null) ? 0 : getMemberConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateNetworkRequest clone() {
        return (CreateNetworkRequest) super.clone();
    }

}
