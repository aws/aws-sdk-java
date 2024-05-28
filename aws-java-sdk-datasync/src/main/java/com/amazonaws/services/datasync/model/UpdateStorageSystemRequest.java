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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateStorageSystem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStorageSystemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ARN of the on-premises storage system that you want reconfigure.
     * </p>
     */
    private String storageSystemArn;
    /**
     * <p>
     * Specifies the server name and network port required to connect with your on-premises storage system's management
     * interface.
     * </p>
     */
    private DiscoveryServerConfiguration serverConfiguration;
    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads your on-premises
     * storage system. You can only specify one ARN.
     * </p>
     */
    private java.util.List<String> agentArns;
    /**
     * <p>
     * Specifies a familiar name for your on-premises storage system.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
     * </p>
     */
    private String cloudWatchLogGroupArn;
    /**
     * <p>
     * Specifies the user name and password for accessing your on-premises storage system's management interface.
     * </p>
     */
    private Credentials credentials;

    /**
     * <p>
     * Specifies the ARN of the on-premises storage system that you want reconfigure.
     * </p>
     * 
     * @param storageSystemArn
     *        Specifies the ARN of the on-premises storage system that you want reconfigure.
     */

    public void setStorageSystemArn(String storageSystemArn) {
        this.storageSystemArn = storageSystemArn;
    }

    /**
     * <p>
     * Specifies the ARN of the on-premises storage system that you want reconfigure.
     * </p>
     * 
     * @return Specifies the ARN of the on-premises storage system that you want reconfigure.
     */

    public String getStorageSystemArn() {
        return this.storageSystemArn;
    }

    /**
     * <p>
     * Specifies the ARN of the on-premises storage system that you want reconfigure.
     * </p>
     * 
     * @param storageSystemArn
     *        Specifies the ARN of the on-premises storage system that you want reconfigure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageSystemRequest withStorageSystemArn(String storageSystemArn) {
        setStorageSystemArn(storageSystemArn);
        return this;
    }

    /**
     * <p>
     * Specifies the server name and network port required to connect with your on-premises storage system's management
     * interface.
     * </p>
     * 
     * @param serverConfiguration
     *        Specifies the server name and network port required to connect with your on-premises storage system's
     *        management interface.
     */

    public void setServerConfiguration(DiscoveryServerConfiguration serverConfiguration) {
        this.serverConfiguration = serverConfiguration;
    }

    /**
     * <p>
     * Specifies the server name and network port required to connect with your on-premises storage system's management
     * interface.
     * </p>
     * 
     * @return Specifies the server name and network port required to connect with your on-premises storage system's
     *         management interface.
     */

    public DiscoveryServerConfiguration getServerConfiguration() {
        return this.serverConfiguration;
    }

    /**
     * <p>
     * Specifies the server name and network port required to connect with your on-premises storage system's management
     * interface.
     * </p>
     * 
     * @param serverConfiguration
     *        Specifies the server name and network port required to connect with your on-premises storage system's
     *        management interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageSystemRequest withServerConfiguration(DiscoveryServerConfiguration serverConfiguration) {
        setServerConfiguration(serverConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads your on-premises
     * storage system. You can only specify one ARN.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads your
     *         on-premises storage system. You can only specify one ARN.
     */

    public java.util.List<String> getAgentArns() {
        return agentArns;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads your on-premises
     * storage system. You can only specify one ARN.
     * </p>
     * 
     * @param agentArns
     *        Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads your on-premises
     *        storage system. You can only specify one ARN.
     */

    public void setAgentArns(java.util.Collection<String> agentArns) {
        if (agentArns == null) {
            this.agentArns = null;
            return;
        }

        this.agentArns = new java.util.ArrayList<String>(agentArns);
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads your on-premises
     * storage system. You can only specify one ARN.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentArns(java.util.Collection)} or {@link #withAgentArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentArns
     *        Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads your on-premises
     *        storage system. You can only specify one ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageSystemRequest withAgentArns(String... agentArns) {
        if (this.agentArns == null) {
            setAgentArns(new java.util.ArrayList<String>(agentArns.length));
        }
        for (String ele : agentArns) {
            this.agentArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads your on-premises
     * storage system. You can only specify one ARN.
     * </p>
     * 
     * @param agentArns
     *        Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads your on-premises
     *        storage system. You can only specify one ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageSystemRequest withAgentArns(java.util.Collection<String> agentArns) {
        setAgentArns(agentArns);
        return this;
    }

    /**
     * <p>
     * Specifies a familiar name for your on-premises storage system.
     * </p>
     * 
     * @param name
     *        Specifies a familiar name for your on-premises storage system.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies a familiar name for your on-premises storage system.
     * </p>
     * 
     * @return Specifies a familiar name for your on-premises storage system.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies a familiar name for your on-premises storage system.
     * </p>
     * 
     * @param name
     *        Specifies a familiar name for your on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageSystemRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
     */

    public void setCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
     * </p>
     * 
     * @return Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
     */

    public String getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageSystemRequest withCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        setCloudWatchLogGroupArn(cloudWatchLogGroupArn);
        return this;
    }

    /**
     * <p>
     * Specifies the user name and password for accessing your on-premises storage system's management interface.
     * </p>
     * 
     * @param credentials
     *        Specifies the user name and password for accessing your on-premises storage system's management interface.
     */

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * Specifies the user name and password for accessing your on-premises storage system's management interface.
     * </p>
     * 
     * @return Specifies the user name and password for accessing your on-premises storage system's management
     *         interface.
     */

    public Credentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * Specifies the user name and password for accessing your on-premises storage system's management interface.
     * </p>
     * 
     * @param credentials
     *        Specifies the user name and password for accessing your on-premises storage system's management interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageSystemRequest withCredentials(Credentials credentials) {
        setCredentials(credentials);
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
        if (getStorageSystemArn() != null)
            sb.append("StorageSystemArn: ").append(getStorageSystemArn()).append(",");
        if (getServerConfiguration() != null)
            sb.append("ServerConfiguration: ").append(getServerConfiguration()).append(",");
        if (getAgentArns() != null)
            sb.append("AgentArns: ").append(getAgentArns()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCloudWatchLogGroupArn() != null)
            sb.append("CloudWatchLogGroupArn: ").append(getCloudWatchLogGroupArn()).append(",");
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStorageSystemRequest == false)
            return false;
        UpdateStorageSystemRequest other = (UpdateStorageSystemRequest) obj;
        if (other.getStorageSystemArn() == null ^ this.getStorageSystemArn() == null)
            return false;
        if (other.getStorageSystemArn() != null && other.getStorageSystemArn().equals(this.getStorageSystemArn()) == false)
            return false;
        if (other.getServerConfiguration() == null ^ this.getServerConfiguration() == null)
            return false;
        if (other.getServerConfiguration() != null && other.getServerConfiguration().equals(this.getServerConfiguration()) == false)
            return false;
        if (other.getAgentArns() == null ^ this.getAgentArns() == null)
            return false;
        if (other.getAgentArns() != null && other.getAgentArns().equals(this.getAgentArns()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCloudWatchLogGroupArn() == null ^ this.getCloudWatchLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogGroupArn() != null && other.getCloudWatchLogGroupArn().equals(this.getCloudWatchLogGroupArn()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageSystemArn() == null) ? 0 : getStorageSystemArn().hashCode());
        hashCode = prime * hashCode + ((getServerConfiguration() == null) ? 0 : getServerConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAgentArns() == null) ? 0 : getAgentArns().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogGroupArn() == null) ? 0 : getCloudWatchLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStorageSystemRequest clone() {
        return (UpdateStorageSystemRequest) super.clone();
    }

}
