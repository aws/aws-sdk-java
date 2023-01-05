/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeLocationHdfs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocationHdfsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the HDFS cluster location.
     * </p>
     */
    private String locationArn;
    /**
     * <p>
     * The URI of the HDFS cluster location.
     * </p>
     */
    private String locationUri;
    /**
     * <p>
     * The NameNode that manage the HDFS namespace.
     * </p>
     */
    private java.util.List<HdfsNameNode> nameNodes;
    /**
     * <p>
     * The size of the data blocks to write into the HDFS cluster.
     * </p>
     */
    private Integer blockSize;
    /**
     * <p>
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster.
     * </p>
     */
    private Integer replicationFactor;
    /**
     * <p>
     * The URI of the HDFS cluster's Key Management Server (KMS).
     * </p>
     */
    private String kmsKeyProviderUri;
    /**
     * <p>
     * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer
     * protection settings configured on the Hadoop Distributed File System (HDFS) cluster.
     * </p>
     */
    private QopConfiguration qopConfiguration;
    /**
     * <p>
     * The type of authentication used to determine the identity of the user.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The user name used to identify the client on the host operating system. This parameter is used if the
     * <code>AuthenticationType</code> is defined as <code>SIMPLE</code>.
     * </p>
     */
    private String simpleUser;
    /**
     * <p>
     * The Kerberos principal with access to the files and folders on the HDFS cluster. This parameter is used if the
     * <code>AuthenticationType</code> is defined as <code>KERBEROS</code>.
     * </p>
     */
    private String kerberosPrincipal;
    /**
     * <p>
     * The ARNs of the agents that are used to connect to the HDFS cluster.
     * </p>
     */
    private java.util.List<String> agentArns;
    /**
     * <p>
     * The time that the HDFS location was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The ARN of the HDFS cluster location.
     * </p>
     * 
     * @param locationArn
     *        The ARN of the HDFS cluster location.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * The ARN of the HDFS cluster location.
     * </p>
     * 
     * @return The ARN of the HDFS cluster location.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * The ARN of the HDFS cluster location.
     * </p>
     * 
     * @param locationArn
     *        The ARN of the HDFS cluster location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationHdfsResult withLocationArn(String locationArn) {
        setLocationArn(locationArn);
        return this;
    }

    /**
     * <p>
     * The URI of the HDFS cluster location.
     * </p>
     * 
     * @param locationUri
     *        The URI of the HDFS cluster location.
     */

    public void setLocationUri(String locationUri) {
        this.locationUri = locationUri;
    }

    /**
     * <p>
     * The URI of the HDFS cluster location.
     * </p>
     * 
     * @return The URI of the HDFS cluster location.
     */

    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * <p>
     * The URI of the HDFS cluster location.
     * </p>
     * 
     * @param locationUri
     *        The URI of the HDFS cluster location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationHdfsResult withLocationUri(String locationUri) {
        setLocationUri(locationUri);
        return this;
    }

    /**
     * <p>
     * The NameNode that manage the HDFS namespace.
     * </p>
     * 
     * @return The NameNode that manage the HDFS namespace.
     */

    public java.util.List<HdfsNameNode> getNameNodes() {
        return nameNodes;
    }

    /**
     * <p>
     * The NameNode that manage the HDFS namespace.
     * </p>
     * 
     * @param nameNodes
     *        The NameNode that manage the HDFS namespace.
     */

    public void setNameNodes(java.util.Collection<HdfsNameNode> nameNodes) {
        if (nameNodes == null) {
            this.nameNodes = null;
            return;
        }

        this.nameNodes = new java.util.ArrayList<HdfsNameNode>(nameNodes);
    }

    /**
     * <p>
     * The NameNode that manage the HDFS namespace.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNameNodes(java.util.Collection)} or {@link #withNameNodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nameNodes
     *        The NameNode that manage the HDFS namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationHdfsResult withNameNodes(HdfsNameNode... nameNodes) {
        if (this.nameNodes == null) {
            setNameNodes(new java.util.ArrayList<HdfsNameNode>(nameNodes.length));
        }
        for (HdfsNameNode ele : nameNodes) {
            this.nameNodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The NameNode that manage the HDFS namespace.
     * </p>
     * 
     * @param nameNodes
     *        The NameNode that manage the HDFS namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationHdfsResult withNameNodes(java.util.Collection<HdfsNameNode> nameNodes) {
        setNameNodes(nameNodes);
        return this;
    }

    /**
     * <p>
     * The size of the data blocks to write into the HDFS cluster.
     * </p>
     * 
     * @param blockSize
     *        The size of the data blocks to write into the HDFS cluster.
     */

    public void setBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
    }

    /**
     * <p>
     * The size of the data blocks to write into the HDFS cluster.
     * </p>
     * 
     * @return The size of the data blocks to write into the HDFS cluster.
     */

    public Integer getBlockSize() {
        return this.blockSize;
    }

    /**
     * <p>
     * The size of the data blocks to write into the HDFS cluster.
     * </p>
     * 
     * @param blockSize
     *        The size of the data blocks to write into the HDFS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationHdfsResult withBlockSize(Integer blockSize) {
        setBlockSize(blockSize);
        return this;
    }

    /**
     * <p>
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster.
     * </p>
     * 
     * @param replicationFactor
     *        The number of DataNodes to replicate the data to when writing to the HDFS cluster.
     */

    public void setReplicationFactor(Integer replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    /**
     * <p>
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster.
     * </p>
     * 
     * @return The number of DataNodes to replicate the data to when writing to the HDFS cluster.
     */

    public Integer getReplicationFactor() {
        return this.replicationFactor;
    }

    /**
     * <p>
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster.
     * </p>
     * 
     * @param replicationFactor
     *        The number of DataNodes to replicate the data to when writing to the HDFS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationHdfsResult withReplicationFactor(Integer replicationFactor) {
        setReplicationFactor(replicationFactor);
        return this;
    }

    /**
     * <p>
     * The URI of the HDFS cluster's Key Management Server (KMS).
     * </p>
     * 
     * @param kmsKeyProviderUri
     *        The URI of the HDFS cluster's Key Management Server (KMS).
     */

    public void setKmsKeyProviderUri(String kmsKeyProviderUri) {
        this.kmsKeyProviderUri = kmsKeyProviderUri;
    }

    /**
     * <p>
     * The URI of the HDFS cluster's Key Management Server (KMS).
     * </p>
     * 
     * @return The URI of the HDFS cluster's Key Management Server (KMS).
     */

    public String getKmsKeyProviderUri() {
        return this.kmsKeyProviderUri;
    }

    /**
     * <p>
     * The URI of the HDFS cluster's Key Management Server (KMS).
     * </p>
     * 
     * @param kmsKeyProviderUri
     *        The URI of the HDFS cluster's Key Management Server (KMS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationHdfsResult withKmsKeyProviderUri(String kmsKeyProviderUri) {
        setKmsKeyProviderUri(kmsKeyProviderUri);
        return this;
    }

    /**
     * <p>
     * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer
     * protection settings configured on the Hadoop Distributed File System (HDFS) cluster.
     * </p>
     * 
     * @param qopConfiguration
     *        The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer
     *        protection settings configured on the Hadoop Distributed File System (HDFS) cluster.
     */

    public void setQopConfiguration(QopConfiguration qopConfiguration) {
        this.qopConfiguration = qopConfiguration;
    }

    /**
     * <p>
     * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer
     * protection settings configured on the Hadoop Distributed File System (HDFS) cluster.
     * </p>
     * 
     * @return The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer
     *         protection settings configured on the Hadoop Distributed File System (HDFS) cluster.
     */

    public QopConfiguration getQopConfiguration() {
        return this.qopConfiguration;
    }

    /**
     * <p>
     * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer
     * protection settings configured on the Hadoop Distributed File System (HDFS) cluster.
     * </p>
     * 
     * @param qopConfiguration
     *        The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer
     *        protection settings configured on the Hadoop Distributed File System (HDFS) cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationHdfsResult withQopConfiguration(QopConfiguration qopConfiguration) {
        setQopConfiguration(qopConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of authentication used to determine the identity of the user.
     * </p>
     * 
     * @param authenticationType
     *        The type of authentication used to determine the identity of the user.
     * @see HdfsAuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The type of authentication used to determine the identity of the user.
     * </p>
     * 
     * @return The type of authentication used to determine the identity of the user.
     * @see HdfsAuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The type of authentication used to determine the identity of the user.
     * </p>
     * 
     * @param authenticationType
     *        The type of authentication used to determine the identity of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HdfsAuthenticationType
     */

    public DescribeLocationHdfsResult withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The type of authentication used to determine the identity of the user.
     * </p>
     * 
     * @param authenticationType
     *        The type of authentication used to determine the identity of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HdfsAuthenticationType
     */

    public DescribeLocationHdfsResult withAuthenticationType(HdfsAuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * The user name used to identify the client on the host operating system. This parameter is used if the
     * <code>AuthenticationType</code> is defined as <code>SIMPLE</code>.
     * </p>
     * 
     * @param simpleUser
     *        The user name used to identify the client on the host operating system. This parameter is used if the
     *        <code>AuthenticationType</code> is defined as <code>SIMPLE</code>.
     */

    public void setSimpleUser(String simpleUser) {
        this.simpleUser = simpleUser;
    }

    /**
     * <p>
     * The user name used to identify the client on the host operating system. This parameter is used if the
     * <code>AuthenticationType</code> is defined as <code>SIMPLE</code>.
     * </p>
     * 
     * @return The user name used to identify the client on the host operating system. This parameter is used if the
     *         <code>AuthenticationType</code> is defined as <code>SIMPLE</code>.
     */

    public String getSimpleUser() {
        return this.simpleUser;
    }

    /**
     * <p>
     * The user name used to identify the client on the host operating system. This parameter is used if the
     * <code>AuthenticationType</code> is defined as <code>SIMPLE</code>.
     * </p>
     * 
     * @param simpleUser
     *        The user name used to identify the client on the host operating system. This parameter is used if the
     *        <code>AuthenticationType</code> is defined as <code>SIMPLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationHdfsResult withSimpleUser(String simpleUser) {
        setSimpleUser(simpleUser);
        return this;
    }

    /**
     * <p>
     * The Kerberos principal with access to the files and folders on the HDFS cluster. This parameter is used if the
     * <code>AuthenticationType</code> is defined as <code>KERBEROS</code>.
     * </p>
     * 
     * @param kerberosPrincipal
     *        The Kerberos principal with access to the files and folders on the HDFS cluster. This parameter is used if
     *        the <code>AuthenticationType</code> is defined as <code>KERBEROS</code>.
     */

    public void setKerberosPrincipal(String kerberosPrincipal) {
        this.kerberosPrincipal = kerberosPrincipal;
    }

    /**
     * <p>
     * The Kerberos principal with access to the files and folders on the HDFS cluster. This parameter is used if the
     * <code>AuthenticationType</code> is defined as <code>KERBEROS</code>.
     * </p>
     * 
     * @return The Kerberos principal with access to the files and folders on the HDFS cluster. This parameter is used
     *         if the <code>AuthenticationType</code> is defined as <code>KERBEROS</code>.
     */

    public String getKerberosPrincipal() {
        return this.kerberosPrincipal;
    }

    /**
     * <p>
     * The Kerberos principal with access to the files and folders on the HDFS cluster. This parameter is used if the
     * <code>AuthenticationType</code> is defined as <code>KERBEROS</code>.
     * </p>
     * 
     * @param kerberosPrincipal
     *        The Kerberos principal with access to the files and folders on the HDFS cluster. This parameter is used if
     *        the <code>AuthenticationType</code> is defined as <code>KERBEROS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationHdfsResult withKerberosPrincipal(String kerberosPrincipal) {
        setKerberosPrincipal(kerberosPrincipal);
        return this;
    }

    /**
     * <p>
     * The ARNs of the agents that are used to connect to the HDFS cluster.
     * </p>
     * 
     * @return The ARNs of the agents that are used to connect to the HDFS cluster.
     */

    public java.util.List<String> getAgentArns() {
        return agentArns;
    }

    /**
     * <p>
     * The ARNs of the agents that are used to connect to the HDFS cluster.
     * </p>
     * 
     * @param agentArns
     *        The ARNs of the agents that are used to connect to the HDFS cluster.
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
     * The ARNs of the agents that are used to connect to the HDFS cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentArns(java.util.Collection)} or {@link #withAgentArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentArns
     *        The ARNs of the agents that are used to connect to the HDFS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationHdfsResult withAgentArns(String... agentArns) {
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
     * The ARNs of the agents that are used to connect to the HDFS cluster.
     * </p>
     * 
     * @param agentArns
     *        The ARNs of the agents that are used to connect to the HDFS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationHdfsResult withAgentArns(java.util.Collection<String> agentArns) {
        setAgentArns(agentArns);
        return this;
    }

    /**
     * <p>
     * The time that the HDFS location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the HDFS location was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the HDFS location was created.
     * </p>
     * 
     * @return The time that the HDFS location was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the HDFS location was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the HDFS location was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocationHdfsResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getLocationArn() != null)
            sb.append("LocationArn: ").append(getLocationArn()).append(",");
        if (getLocationUri() != null)
            sb.append("LocationUri: ").append(getLocationUri()).append(",");
        if (getNameNodes() != null)
            sb.append("NameNodes: ").append(getNameNodes()).append(",");
        if (getBlockSize() != null)
            sb.append("BlockSize: ").append(getBlockSize()).append(",");
        if (getReplicationFactor() != null)
            sb.append("ReplicationFactor: ").append(getReplicationFactor()).append(",");
        if (getKmsKeyProviderUri() != null)
            sb.append("KmsKeyProviderUri: ").append(getKmsKeyProviderUri()).append(",");
        if (getQopConfiguration() != null)
            sb.append("QopConfiguration: ").append(getQopConfiguration()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getSimpleUser() != null)
            sb.append("SimpleUser: ").append(getSimpleUser()).append(",");
        if (getKerberosPrincipal() != null)
            sb.append("KerberosPrincipal: ").append(getKerberosPrincipal()).append(",");
        if (getAgentArns() != null)
            sb.append("AgentArns: ").append(getAgentArns()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLocationHdfsResult == false)
            return false;
        DescribeLocationHdfsResult other = (DescribeLocationHdfsResult) obj;
        if (other.getLocationArn() == null ^ this.getLocationArn() == null)
            return false;
        if (other.getLocationArn() != null && other.getLocationArn().equals(this.getLocationArn()) == false)
            return false;
        if (other.getLocationUri() == null ^ this.getLocationUri() == null)
            return false;
        if (other.getLocationUri() != null && other.getLocationUri().equals(this.getLocationUri()) == false)
            return false;
        if (other.getNameNodes() == null ^ this.getNameNodes() == null)
            return false;
        if (other.getNameNodes() != null && other.getNameNodes().equals(this.getNameNodes()) == false)
            return false;
        if (other.getBlockSize() == null ^ this.getBlockSize() == null)
            return false;
        if (other.getBlockSize() != null && other.getBlockSize().equals(this.getBlockSize()) == false)
            return false;
        if (other.getReplicationFactor() == null ^ this.getReplicationFactor() == null)
            return false;
        if (other.getReplicationFactor() != null && other.getReplicationFactor().equals(this.getReplicationFactor()) == false)
            return false;
        if (other.getKmsKeyProviderUri() == null ^ this.getKmsKeyProviderUri() == null)
            return false;
        if (other.getKmsKeyProviderUri() != null && other.getKmsKeyProviderUri().equals(this.getKmsKeyProviderUri()) == false)
            return false;
        if (other.getQopConfiguration() == null ^ this.getQopConfiguration() == null)
            return false;
        if (other.getQopConfiguration() != null && other.getQopConfiguration().equals(this.getQopConfiguration()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getSimpleUser() == null ^ this.getSimpleUser() == null)
            return false;
        if (other.getSimpleUser() != null && other.getSimpleUser().equals(this.getSimpleUser()) == false)
            return false;
        if (other.getKerberosPrincipal() == null ^ this.getKerberosPrincipal() == null)
            return false;
        if (other.getKerberosPrincipal() != null && other.getKerberosPrincipal().equals(this.getKerberosPrincipal()) == false)
            return false;
        if (other.getAgentArns() == null ^ this.getAgentArns() == null)
            return false;
        if (other.getAgentArns() != null && other.getAgentArns().equals(this.getAgentArns()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationArn() == null) ? 0 : getLocationArn().hashCode());
        hashCode = prime * hashCode + ((getLocationUri() == null) ? 0 : getLocationUri().hashCode());
        hashCode = prime * hashCode + ((getNameNodes() == null) ? 0 : getNameNodes().hashCode());
        hashCode = prime * hashCode + ((getBlockSize() == null) ? 0 : getBlockSize().hashCode());
        hashCode = prime * hashCode + ((getReplicationFactor() == null) ? 0 : getReplicationFactor().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyProviderUri() == null) ? 0 : getKmsKeyProviderUri().hashCode());
        hashCode = prime * hashCode + ((getQopConfiguration() == null) ? 0 : getQopConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getSimpleUser() == null) ? 0 : getSimpleUser().hashCode());
        hashCode = prime * hashCode + ((getKerberosPrincipal() == null) ? 0 : getKerberosPrincipal().hashCode());
        hashCode = prime * hashCode + ((getAgentArns() == null) ? 0 : getAgentArns().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLocationHdfsResult clone() {
        try {
            return (DescribeLocationHdfsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
