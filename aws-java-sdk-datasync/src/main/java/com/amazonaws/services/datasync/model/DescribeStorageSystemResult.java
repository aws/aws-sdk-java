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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeStorageSystem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStorageSystemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the on-premises storage system that the discovery job looked at.
     * </p>
     */
    private String storageSystemArn;
    /**
     * <p>
     * The server name and network port required to connect with your on-premises storage system's management interface.
     * </p>
     */
    private DiscoveryServerConfiguration serverConfiguration;
    /**
     * <p>
     * The type of on-premises storage system.
     * </p>
     * <note>
     * <p>
     * DataSync Discovery currently only supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF) systems
     * running ONTAP 9.7 or later.
     * </p>
     * </note>
     */
    private String systemType;
    /**
     * <p>
     * The ARN of the DataSync agent that connects to and reads from your on-premises storage system.
     * </p>
     */
    private java.util.List<String> agentArns;
    /**
     * <p>
     * The name that you gave your on-premises storage system when adding it to DataSync Discovery.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Describes the connectivity error that the DataSync agent is encountering with your on-premises storage system.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * Indicates whether your DataSync agent can connect to your on-premises storage system.
     * </p>
     */
    private String connectivityStatus;
    /**
     * <p>
     * The ARN of the Amazon CloudWatch log group that's used to monitor and log discovery job events.
     * </p>
     */
    private String cloudWatchLogGroupArn;
    /**
     * <p>
     * The time when you added the on-premises storage system to DataSync Discovery.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The ARN of the secret that stores your on-premises storage system's credentials. DataSync Discovery stores these
     * credentials in <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-configure-storage.html#discovery-add-storage"
     * >Secrets Manager</a>.
     * </p>
     */
    private String secretsManagerArn;

    /**
     * <p>
     * The ARN of the on-premises storage system that the discovery job looked at.
     * </p>
     * 
     * @param storageSystemArn
     *        The ARN of the on-premises storage system that the discovery job looked at.
     */

    public void setStorageSystemArn(String storageSystemArn) {
        this.storageSystemArn = storageSystemArn;
    }

    /**
     * <p>
     * The ARN of the on-premises storage system that the discovery job looked at.
     * </p>
     * 
     * @return The ARN of the on-premises storage system that the discovery job looked at.
     */

    public String getStorageSystemArn() {
        return this.storageSystemArn;
    }

    /**
     * <p>
     * The ARN of the on-premises storage system that the discovery job looked at.
     * </p>
     * 
     * @param storageSystemArn
     *        The ARN of the on-premises storage system that the discovery job looked at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResult withStorageSystemArn(String storageSystemArn) {
        setStorageSystemArn(storageSystemArn);
        return this;
    }

    /**
     * <p>
     * The server name and network port required to connect with your on-premises storage system's management interface.
     * </p>
     * 
     * @param serverConfiguration
     *        The server name and network port required to connect with your on-premises storage system's management
     *        interface.
     */

    public void setServerConfiguration(DiscoveryServerConfiguration serverConfiguration) {
        this.serverConfiguration = serverConfiguration;
    }

    /**
     * <p>
     * The server name and network port required to connect with your on-premises storage system's management interface.
     * </p>
     * 
     * @return The server name and network port required to connect with your on-premises storage system's management
     *         interface.
     */

    public DiscoveryServerConfiguration getServerConfiguration() {
        return this.serverConfiguration;
    }

    /**
     * <p>
     * The server name and network port required to connect with your on-premises storage system's management interface.
     * </p>
     * 
     * @param serverConfiguration
     *        The server name and network port required to connect with your on-premises storage system's management
     *        interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResult withServerConfiguration(DiscoveryServerConfiguration serverConfiguration) {
        setServerConfiguration(serverConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of on-premises storage system.
     * </p>
     * <note>
     * <p>
     * DataSync Discovery currently only supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF) systems
     * running ONTAP 9.7 or later.
     * </p>
     * </note>
     * 
     * @param systemType
     *        The type of on-premises storage system.</p> <note>
     *        <p>
     *        DataSync Discovery currently only supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF)
     *        systems running ONTAP 9.7 or later.
     *        </p>
     * @see DiscoverySystemType
     */

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    /**
     * <p>
     * The type of on-premises storage system.
     * </p>
     * <note>
     * <p>
     * DataSync Discovery currently only supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF) systems
     * running ONTAP 9.7 or later.
     * </p>
     * </note>
     * 
     * @return The type of on-premises storage system.</p> <note>
     *         <p>
     *         DataSync Discovery currently only supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF)
     *         systems running ONTAP 9.7 or later.
     *         </p>
     * @see DiscoverySystemType
     */

    public String getSystemType() {
        return this.systemType;
    }

    /**
     * <p>
     * The type of on-premises storage system.
     * </p>
     * <note>
     * <p>
     * DataSync Discovery currently only supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF) systems
     * running ONTAP 9.7 or later.
     * </p>
     * </note>
     * 
     * @param systemType
     *        The type of on-premises storage system.</p> <note>
     *        <p>
     *        DataSync Discovery currently only supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF)
     *        systems running ONTAP 9.7 or later.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoverySystemType
     */

    public DescribeStorageSystemResult withSystemType(String systemType) {
        setSystemType(systemType);
        return this;
    }

    /**
     * <p>
     * The type of on-premises storage system.
     * </p>
     * <note>
     * <p>
     * DataSync Discovery currently only supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF) systems
     * running ONTAP 9.7 or later.
     * </p>
     * </note>
     * 
     * @param systemType
     *        The type of on-premises storage system.</p> <note>
     *        <p>
     *        DataSync Discovery currently only supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF)
     *        systems running ONTAP 9.7 or later.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoverySystemType
     */

    public DescribeStorageSystemResult withSystemType(DiscoverySystemType systemType) {
        this.systemType = systemType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the DataSync agent that connects to and reads from your on-premises storage system.
     * </p>
     * 
     * @return The ARN of the DataSync agent that connects to and reads from your on-premises storage system.
     */

    public java.util.List<String> getAgentArns() {
        return agentArns;
    }

    /**
     * <p>
     * The ARN of the DataSync agent that connects to and reads from your on-premises storage system.
     * </p>
     * 
     * @param agentArns
     *        The ARN of the DataSync agent that connects to and reads from your on-premises storage system.
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
     * The ARN of the DataSync agent that connects to and reads from your on-premises storage system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentArns(java.util.Collection)} or {@link #withAgentArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentArns
     *        The ARN of the DataSync agent that connects to and reads from your on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResult withAgentArns(String... agentArns) {
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
     * The ARN of the DataSync agent that connects to and reads from your on-premises storage system.
     * </p>
     * 
     * @param agentArns
     *        The ARN of the DataSync agent that connects to and reads from your on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResult withAgentArns(java.util.Collection<String> agentArns) {
        setAgentArns(agentArns);
        return this;
    }

    /**
     * <p>
     * The name that you gave your on-premises storage system when adding it to DataSync Discovery.
     * </p>
     * 
     * @param name
     *        The name that you gave your on-premises storage system when adding it to DataSync Discovery.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you gave your on-premises storage system when adding it to DataSync Discovery.
     * </p>
     * 
     * @return The name that you gave your on-premises storage system when adding it to DataSync Discovery.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that you gave your on-premises storage system when adding it to DataSync Discovery.
     * </p>
     * 
     * @param name
     *        The name that you gave your on-premises storage system when adding it to DataSync Discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Describes the connectivity error that the DataSync agent is encountering with your on-premises storage system.
     * </p>
     * 
     * @param errorMessage
     *        Describes the connectivity error that the DataSync agent is encountering with your on-premises storage
     *        system.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Describes the connectivity error that the DataSync agent is encountering with your on-premises storage system.
     * </p>
     * 
     * @return Describes the connectivity error that the DataSync agent is encountering with your on-premises storage
     *         system.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Describes the connectivity error that the DataSync agent is encountering with your on-premises storage system.
     * </p>
     * 
     * @param errorMessage
     *        Describes the connectivity error that the DataSync agent is encountering with your on-premises storage
     *        system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * Indicates whether your DataSync agent can connect to your on-premises storage system.
     * </p>
     * 
     * @param connectivityStatus
     *        Indicates whether your DataSync agent can connect to your on-premises storage system.
     * @see StorageSystemConnectivityStatus
     */

    public void setConnectivityStatus(String connectivityStatus) {
        this.connectivityStatus = connectivityStatus;
    }

    /**
     * <p>
     * Indicates whether your DataSync agent can connect to your on-premises storage system.
     * </p>
     * 
     * @return Indicates whether your DataSync agent can connect to your on-premises storage system.
     * @see StorageSystemConnectivityStatus
     */

    public String getConnectivityStatus() {
        return this.connectivityStatus;
    }

    /**
     * <p>
     * Indicates whether your DataSync agent can connect to your on-premises storage system.
     * </p>
     * 
     * @param connectivityStatus
     *        Indicates whether your DataSync agent can connect to your on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageSystemConnectivityStatus
     */

    public DescribeStorageSystemResult withConnectivityStatus(String connectivityStatus) {
        setConnectivityStatus(connectivityStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether your DataSync agent can connect to your on-premises storage system.
     * </p>
     * 
     * @param connectivityStatus
     *        Indicates whether your DataSync agent can connect to your on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageSystemConnectivityStatus
     */

    public DescribeStorageSystemResult withConnectivityStatus(StorageSystemConnectivityStatus connectivityStatus) {
        this.connectivityStatus = connectivityStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon CloudWatch log group that's used to monitor and log discovery job events.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The ARN of the Amazon CloudWatch log group that's used to monitor and log discovery job events.
     */

    public void setCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The ARN of the Amazon CloudWatch log group that's used to monitor and log discovery job events.
     * </p>
     * 
     * @return The ARN of the Amazon CloudWatch log group that's used to monitor and log discovery job events.
     */

    public String getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The ARN of the Amazon CloudWatch log group that's used to monitor and log discovery job events.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The ARN of the Amazon CloudWatch log group that's used to monitor and log discovery job events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResult withCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        setCloudWatchLogGroupArn(cloudWatchLogGroupArn);
        return this;
    }

    /**
     * <p>
     * The time when you added the on-premises storage system to DataSync Discovery.
     * </p>
     * 
     * @param creationTime
     *        The time when you added the on-premises storage system to DataSync Discovery.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when you added the on-premises storage system to DataSync Discovery.
     * </p>
     * 
     * @return The time when you added the on-premises storage system to DataSync Discovery.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when you added the on-premises storage system to DataSync Discovery.
     * </p>
     * 
     * @param creationTime
     *        The time when you added the on-premises storage system to DataSync Discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The ARN of the secret that stores your on-premises storage system's credentials. DataSync Discovery stores these
     * credentials in <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-configure-storage.html#discovery-add-storage"
     * >Secrets Manager</a>.
     * </p>
     * 
     * @param secretsManagerArn
     *        The ARN of the secret that stores your on-premises storage system's credentials. DataSync Discovery stores
     *        these credentials in <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-configure-storage.html#discovery-add-storage"
     *        >Secrets Manager</a>.
     */

    public void setSecretsManagerArn(String secretsManagerArn) {
        this.secretsManagerArn = secretsManagerArn;
    }

    /**
     * <p>
     * The ARN of the secret that stores your on-premises storage system's credentials. DataSync Discovery stores these
     * credentials in <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-configure-storage.html#discovery-add-storage"
     * >Secrets Manager</a>.
     * </p>
     * 
     * @return The ARN of the secret that stores your on-premises storage system's credentials. DataSync Discovery
     *         stores these credentials in <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-configure-storage.html#discovery-add-storage"
     *         >Secrets Manager</a>.
     */

    public String getSecretsManagerArn() {
        return this.secretsManagerArn;
    }

    /**
     * <p>
     * The ARN of the secret that stores your on-premises storage system's credentials. DataSync Discovery stores these
     * credentials in <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-configure-storage.html#discovery-add-storage"
     * >Secrets Manager</a>.
     * </p>
     * 
     * @param secretsManagerArn
     *        The ARN of the secret that stores your on-premises storage system's credentials. DataSync Discovery stores
     *        these credentials in <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/discovery-configure-storage.html#discovery-add-storage"
     *        >Secrets Manager</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResult withSecretsManagerArn(String secretsManagerArn) {
        setSecretsManagerArn(secretsManagerArn);
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
        if (getSystemType() != null)
            sb.append("SystemType: ").append(getSystemType()).append(",");
        if (getAgentArns() != null)
            sb.append("AgentArns: ").append(getAgentArns()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getConnectivityStatus() != null)
            sb.append("ConnectivityStatus: ").append(getConnectivityStatus()).append(",");
        if (getCloudWatchLogGroupArn() != null)
            sb.append("CloudWatchLogGroupArn: ").append(getCloudWatchLogGroupArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getSecretsManagerArn() != null)
            sb.append("SecretsManagerArn: ").append(getSecretsManagerArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStorageSystemResult == false)
            return false;
        DescribeStorageSystemResult other = (DescribeStorageSystemResult) obj;
        if (other.getStorageSystemArn() == null ^ this.getStorageSystemArn() == null)
            return false;
        if (other.getStorageSystemArn() != null && other.getStorageSystemArn().equals(this.getStorageSystemArn()) == false)
            return false;
        if (other.getServerConfiguration() == null ^ this.getServerConfiguration() == null)
            return false;
        if (other.getServerConfiguration() != null && other.getServerConfiguration().equals(this.getServerConfiguration()) == false)
            return false;
        if (other.getSystemType() == null ^ this.getSystemType() == null)
            return false;
        if (other.getSystemType() != null && other.getSystemType().equals(this.getSystemType()) == false)
            return false;
        if (other.getAgentArns() == null ^ this.getAgentArns() == null)
            return false;
        if (other.getAgentArns() != null && other.getAgentArns().equals(this.getAgentArns()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getConnectivityStatus() == null ^ this.getConnectivityStatus() == null)
            return false;
        if (other.getConnectivityStatus() != null && other.getConnectivityStatus().equals(this.getConnectivityStatus()) == false)
            return false;
        if (other.getCloudWatchLogGroupArn() == null ^ this.getCloudWatchLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogGroupArn() != null && other.getCloudWatchLogGroupArn().equals(this.getCloudWatchLogGroupArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getSecretsManagerArn() == null ^ this.getSecretsManagerArn() == null)
            return false;
        if (other.getSecretsManagerArn() != null && other.getSecretsManagerArn().equals(this.getSecretsManagerArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageSystemArn() == null) ? 0 : getStorageSystemArn().hashCode());
        hashCode = prime * hashCode + ((getServerConfiguration() == null) ? 0 : getServerConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSystemType() == null) ? 0 : getSystemType().hashCode());
        hashCode = prime * hashCode + ((getAgentArns() == null) ? 0 : getAgentArns().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getConnectivityStatus() == null) ? 0 : getConnectivityStatus().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogGroupArn() == null) ? 0 : getCloudWatchLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerArn() == null) ? 0 : getSecretsManagerArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStorageSystemResult clone() {
        try {
            return (DescribeStorageSystemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
