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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an AWS CloudHSM cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/Cluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cluster's backup policy.
     * </p>
     */
    private String backupPolicy;
    /**
     * <p>
     * The cluster's identifier (ID).
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The date and time when the cluster was created.
     * </p>
     */
    private java.util.Date createTimestamp;
    /**
     * <p>
     * Contains information about the HSMs in the cluster.
     * </p>
     */
    private java.util.List<Hsm> hsms;
    /**
     * <p>
     * The type of HSM that the cluster contains.
     * </p>
     */
    private String hsmType;
    /**
     * <p>
     * The default password for the cluster's Pre-Crypto Officer (PRECO) user.
     * </p>
     */
    private String preCoPassword;
    /**
     * <p>
     * The identifier (ID) of the cluster's security group.
     * </p>
     */
    private String securityGroup;
    /**
     * <p>
     * The identifier (ID) of the backup used to create the cluster. This value exists only when the cluster was created
     * from a backup.
     * </p>
     */
    private String sourceBackupId;
    /**
     * <p>
     * The cluster's state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * A description of the cluster's state.
     * </p>
     */
    private String stateMessage;
    /**
     * <p>
     * A map of the cluster's subnets and their corresponding Availability Zones.
     * </p>
     */
    private java.util.Map<String, String> subnetMapping;
    /**
     * <p>
     * The identifier (ID) of the virtual private cloud (VPC) that contains the cluster.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Contains one or more certificates or a certificate signing request (CSR).
     * </p>
     */
    private Certificates certificates;

    /**
     * <p>
     * The cluster's backup policy.
     * </p>
     * 
     * @param backupPolicy
     *        The cluster's backup policy.
     * @see BackupPolicy
     */

    public void setBackupPolicy(String backupPolicy) {
        this.backupPolicy = backupPolicy;
    }

    /**
     * <p>
     * The cluster's backup policy.
     * </p>
     * 
     * @return The cluster's backup policy.
     * @see BackupPolicy
     */

    public String getBackupPolicy() {
        return this.backupPolicy;
    }

    /**
     * <p>
     * The cluster's backup policy.
     * </p>
     * 
     * @param backupPolicy
     *        The cluster's backup policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupPolicy
     */

    public Cluster withBackupPolicy(String backupPolicy) {
        setBackupPolicy(backupPolicy);
        return this;
    }

    /**
     * <p>
     * The cluster's backup policy.
     * </p>
     * 
     * @param backupPolicy
     *        The cluster's backup policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupPolicy
     */

    public Cluster withBackupPolicy(BackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The cluster's identifier (ID).
     * </p>
     * 
     * @param clusterId
     *        The cluster's identifier (ID).
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The cluster's identifier (ID).
     * </p>
     * 
     * @return The cluster's identifier (ID).
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The cluster's identifier (ID).
     * </p>
     * 
     * @param clusterId
     *        The cluster's identifier (ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The date and time when the cluster was created.
     * </p>
     * 
     * @param createTimestamp
     *        The date and time when the cluster was created.
     */

    public void setCreateTimestamp(java.util.Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * <p>
     * The date and time when the cluster was created.
     * </p>
     * 
     * @return The date and time when the cluster was created.
     */

    public java.util.Date getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * <p>
     * The date and time when the cluster was created.
     * </p>
     * 
     * @param createTimestamp
     *        The date and time when the cluster was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withCreateTimestamp(java.util.Date createTimestamp) {
        setCreateTimestamp(createTimestamp);
        return this;
    }

    /**
     * <p>
     * Contains information about the HSMs in the cluster.
     * </p>
     * 
     * @return Contains information about the HSMs in the cluster.
     */

    public java.util.List<Hsm> getHsms() {
        return hsms;
    }

    /**
     * <p>
     * Contains information about the HSMs in the cluster.
     * </p>
     * 
     * @param hsms
     *        Contains information about the HSMs in the cluster.
     */

    public void setHsms(java.util.Collection<Hsm> hsms) {
        if (hsms == null) {
            this.hsms = null;
            return;
        }

        this.hsms = new java.util.ArrayList<Hsm>(hsms);
    }

    /**
     * <p>
     * Contains information about the HSMs in the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHsms(java.util.Collection)} or {@link #withHsms(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param hsms
     *        Contains information about the HSMs in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withHsms(Hsm... hsms) {
        if (this.hsms == null) {
            setHsms(new java.util.ArrayList<Hsm>(hsms.length));
        }
        for (Hsm ele : hsms) {
            this.hsms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about the HSMs in the cluster.
     * </p>
     * 
     * @param hsms
     *        Contains information about the HSMs in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withHsms(java.util.Collection<Hsm> hsms) {
        setHsms(hsms);
        return this;
    }

    /**
     * <p>
     * The type of HSM that the cluster contains.
     * </p>
     * 
     * @param hsmType
     *        The type of HSM that the cluster contains.
     */

    public void setHsmType(String hsmType) {
        this.hsmType = hsmType;
    }

    /**
     * <p>
     * The type of HSM that the cluster contains.
     * </p>
     * 
     * @return The type of HSM that the cluster contains.
     */

    public String getHsmType() {
        return this.hsmType;
    }

    /**
     * <p>
     * The type of HSM that the cluster contains.
     * </p>
     * 
     * @param hsmType
     *        The type of HSM that the cluster contains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withHsmType(String hsmType) {
        setHsmType(hsmType);
        return this;
    }

    /**
     * <p>
     * The default password for the cluster's Pre-Crypto Officer (PRECO) user.
     * </p>
     * 
     * @param preCoPassword
     *        The default password for the cluster's Pre-Crypto Officer (PRECO) user.
     */

    public void setPreCoPassword(String preCoPassword) {
        this.preCoPassword = preCoPassword;
    }

    /**
     * <p>
     * The default password for the cluster's Pre-Crypto Officer (PRECO) user.
     * </p>
     * 
     * @return The default password for the cluster's Pre-Crypto Officer (PRECO) user.
     */

    public String getPreCoPassword() {
        return this.preCoPassword;
    }

    /**
     * <p>
     * The default password for the cluster's Pre-Crypto Officer (PRECO) user.
     * </p>
     * 
     * @param preCoPassword
     *        The default password for the cluster's Pre-Crypto Officer (PRECO) user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withPreCoPassword(String preCoPassword) {
        setPreCoPassword(preCoPassword);
        return this;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster's security group.
     * </p>
     * 
     * @param securityGroup
     *        The identifier (ID) of the cluster's security group.
     */

    public void setSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster's security group.
     * </p>
     * 
     * @return The identifier (ID) of the cluster's security group.
     */

    public String getSecurityGroup() {
        return this.securityGroup;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster's security group.
     * </p>
     * 
     * @param securityGroup
     *        The identifier (ID) of the cluster's security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSecurityGroup(String securityGroup) {
        setSecurityGroup(securityGroup);
        return this;
    }

    /**
     * <p>
     * The identifier (ID) of the backup used to create the cluster. This value exists only when the cluster was created
     * from a backup.
     * </p>
     * 
     * @param sourceBackupId
     *        The identifier (ID) of the backup used to create the cluster. This value exists only when the cluster was
     *        created from a backup.
     */

    public void setSourceBackupId(String sourceBackupId) {
        this.sourceBackupId = sourceBackupId;
    }

    /**
     * <p>
     * The identifier (ID) of the backup used to create the cluster. This value exists only when the cluster was created
     * from a backup.
     * </p>
     * 
     * @return The identifier (ID) of the backup used to create the cluster. This value exists only when the cluster was
     *         created from a backup.
     */

    public String getSourceBackupId() {
        return this.sourceBackupId;
    }

    /**
     * <p>
     * The identifier (ID) of the backup used to create the cluster. This value exists only when the cluster was created
     * from a backup.
     * </p>
     * 
     * @param sourceBackupId
     *        The identifier (ID) of the backup used to create the cluster. This value exists only when the cluster was
     *        created from a backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSourceBackupId(String sourceBackupId) {
        setSourceBackupId(sourceBackupId);
        return this;
    }

    /**
     * <p>
     * The cluster's state.
     * </p>
     * 
     * @param state
     *        The cluster's state.
     * @see ClusterState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The cluster's state.
     * </p>
     * 
     * @return The cluster's state.
     * @see ClusterState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The cluster's state.
     * </p>
     * 
     * @param state
     *        The cluster's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public Cluster withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The cluster's state.
     * </p>
     * 
     * @param state
     *        The cluster's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public Cluster withState(ClusterState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A description of the cluster's state.
     * </p>
     * 
     * @param stateMessage
     *        A description of the cluster's state.
     */

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    /**
     * <p>
     * A description of the cluster's state.
     * </p>
     * 
     * @return A description of the cluster's state.
     */

    public String getStateMessage() {
        return this.stateMessage;
    }

    /**
     * <p>
     * A description of the cluster's state.
     * </p>
     * 
     * @param stateMessage
     *        A description of the cluster's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withStateMessage(String stateMessage) {
        setStateMessage(stateMessage);
        return this;
    }

    /**
     * <p>
     * A map of the cluster's subnets and their corresponding Availability Zones.
     * </p>
     * 
     * @return A map of the cluster's subnets and their corresponding Availability Zones.
     */

    public java.util.Map<String, String> getSubnetMapping() {
        return subnetMapping;
    }

    /**
     * <p>
     * A map of the cluster's subnets and their corresponding Availability Zones.
     * </p>
     * 
     * @param subnetMapping
     *        A map of the cluster's subnets and their corresponding Availability Zones.
     */

    public void setSubnetMapping(java.util.Map<String, String> subnetMapping) {
        this.subnetMapping = subnetMapping;
    }

    /**
     * <p>
     * A map of the cluster's subnets and their corresponding Availability Zones.
     * </p>
     * 
     * @param subnetMapping
     *        A map of the cluster's subnets and their corresponding Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSubnetMapping(java.util.Map<String, String> subnetMapping) {
        setSubnetMapping(subnetMapping);
        return this;
    }

    public Cluster addSubnetMappingEntry(String key, String value) {
        if (null == this.subnetMapping) {
            this.subnetMapping = new java.util.HashMap<String, String>();
        }
        if (this.subnetMapping.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.subnetMapping.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SubnetMapping.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster clearSubnetMappingEntries() {
        this.subnetMapping = null;
        return this;
    }

    /**
     * <p>
     * The identifier (ID) of the virtual private cloud (VPC) that contains the cluster.
     * </p>
     * 
     * @param vpcId
     *        The identifier (ID) of the virtual private cloud (VPC) that contains the cluster.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier (ID) of the virtual private cloud (VPC) that contains the cluster.
     * </p>
     * 
     * @return The identifier (ID) of the virtual private cloud (VPC) that contains the cluster.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier (ID) of the virtual private cloud (VPC) that contains the cluster.
     * </p>
     * 
     * @param vpcId
     *        The identifier (ID) of the virtual private cloud (VPC) that contains the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Contains one or more certificates or a certificate signing request (CSR).
     * </p>
     * 
     * @param certificates
     *        Contains one or more certificates or a certificate signing request (CSR).
     */

    public void setCertificates(Certificates certificates) {
        this.certificates = certificates;
    }

    /**
     * <p>
     * Contains one or more certificates or a certificate signing request (CSR).
     * </p>
     * 
     * @return Contains one or more certificates or a certificate signing request (CSR).
     */

    public Certificates getCertificates() {
        return this.certificates;
    }

    /**
     * <p>
     * Contains one or more certificates or a certificate signing request (CSR).
     * </p>
     * 
     * @param certificates
     *        Contains one or more certificates or a certificate signing request (CSR).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withCertificates(Certificates certificates) {
        setCertificates(certificates);
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
        if (getBackupPolicy() != null)
            sb.append("BackupPolicy: ").append(getBackupPolicy()).append(",");
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getCreateTimestamp() != null)
            sb.append("CreateTimestamp: ").append(getCreateTimestamp()).append(",");
        if (getHsms() != null)
            sb.append("Hsms: ").append(getHsms()).append(",");
        if (getHsmType() != null)
            sb.append("HsmType: ").append(getHsmType()).append(",");
        if (getPreCoPassword() != null)
            sb.append("PreCoPassword: ").append(getPreCoPassword()).append(",");
        if (getSecurityGroup() != null)
            sb.append("SecurityGroup: ").append(getSecurityGroup()).append(",");
        if (getSourceBackupId() != null)
            sb.append("SourceBackupId: ").append(getSourceBackupId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateMessage() != null)
            sb.append("StateMessage: ").append(getStateMessage()).append(",");
        if (getSubnetMapping() != null)
            sb.append("SubnetMapping: ").append(getSubnetMapping()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getCertificates() != null)
            sb.append("Certificates: ").append(getCertificates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cluster == false)
            return false;
        Cluster other = (Cluster) obj;
        if (other.getBackupPolicy() == null ^ this.getBackupPolicy() == null)
            return false;
        if (other.getBackupPolicy() != null && other.getBackupPolicy().equals(this.getBackupPolicy()) == false)
            return false;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getCreateTimestamp() == null ^ this.getCreateTimestamp() == null)
            return false;
        if (other.getCreateTimestamp() != null && other.getCreateTimestamp().equals(this.getCreateTimestamp()) == false)
            return false;
        if (other.getHsms() == null ^ this.getHsms() == null)
            return false;
        if (other.getHsms() != null && other.getHsms().equals(this.getHsms()) == false)
            return false;
        if (other.getHsmType() == null ^ this.getHsmType() == null)
            return false;
        if (other.getHsmType() != null && other.getHsmType().equals(this.getHsmType()) == false)
            return false;
        if (other.getPreCoPassword() == null ^ this.getPreCoPassword() == null)
            return false;
        if (other.getPreCoPassword() != null && other.getPreCoPassword().equals(this.getPreCoPassword()) == false)
            return false;
        if (other.getSecurityGroup() == null ^ this.getSecurityGroup() == null)
            return false;
        if (other.getSecurityGroup() != null && other.getSecurityGroup().equals(this.getSecurityGroup()) == false)
            return false;
        if (other.getSourceBackupId() == null ^ this.getSourceBackupId() == null)
            return false;
        if (other.getSourceBackupId() != null && other.getSourceBackupId().equals(this.getSourceBackupId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateMessage() == null ^ this.getStateMessage() == null)
            return false;
        if (other.getStateMessage() != null && other.getStateMessage().equals(this.getStateMessage()) == false)
            return false;
        if (other.getSubnetMapping() == null ^ this.getSubnetMapping() == null)
            return false;
        if (other.getSubnetMapping() != null && other.getSubnetMapping().equals(this.getSubnetMapping()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getCertificates() == null ^ this.getCertificates() == null)
            return false;
        if (other.getCertificates() != null && other.getCertificates().equals(this.getCertificates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupPolicy() == null) ? 0 : getBackupPolicy().hashCode());
        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getHsms() == null) ? 0 : getHsms().hashCode());
        hashCode = prime * hashCode + ((getHsmType() == null) ? 0 : getHsmType().hashCode());
        hashCode = prime * hashCode + ((getPreCoPassword() == null) ? 0 : getPreCoPassword().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroup() == null) ? 0 : getSecurityGroup().hashCode());
        hashCode = prime * hashCode + ((getSourceBackupId() == null) ? 0 : getSourceBackupId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateMessage() == null) ? 0 : getStateMessage().hashCode());
        hashCode = prime * hashCode + ((getSubnetMapping() == null) ? 0 : getSubnetMapping().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
        return hashCode;
    }

    @Override
    public Cluster clone() {
        try {
            return (Cluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudhsmv2.model.transform.ClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
