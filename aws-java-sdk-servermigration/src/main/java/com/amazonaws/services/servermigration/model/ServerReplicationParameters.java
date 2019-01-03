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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Replication parameters for replicating a server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ServerReplicationParameters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerReplicationParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Seed time for creating a replication job for the server.
     * </p>
     */
    private java.util.Date seedTime;
    /**
     * <p>
     * Frequency of creating replication jobs for the server.
     * </p>
     */
    private Integer frequency;
    /** <p/> */
    private Boolean runOnce;
    /**
     * <p>
     * License type for creating a replication job for the server.
     * </p>
     */
    private String licenseType;
    /**
     * <p>
     * Number of recent AMIs to keep when creating a replication job for this server.
     * </p>
     */
    private Integer numberOfRecentAmisToKeep;
    /**
     * <p>
     * When true, the replication job produces encrypted AMIs. See also <code>KmsKeyId</code> below.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p/>
     * <p>
     * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS key alias
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key alias
     * </p>
     * </li>
     * </ul>
     * <p>
     * If encrypted is <i>true</i> but a KMS key id is not specified, the customer's default KMS key for EBS is used.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Seed time for creating a replication job for the server.
     * </p>
     * 
     * @param seedTime
     *        Seed time for creating a replication job for the server.
     */

    public void setSeedTime(java.util.Date seedTime) {
        this.seedTime = seedTime;
    }

    /**
     * <p>
     * Seed time for creating a replication job for the server.
     * </p>
     * 
     * @return Seed time for creating a replication job for the server.
     */

    public java.util.Date getSeedTime() {
        return this.seedTime;
    }

    /**
     * <p>
     * Seed time for creating a replication job for the server.
     * </p>
     * 
     * @param seedTime
     *        Seed time for creating a replication job for the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerReplicationParameters withSeedTime(java.util.Date seedTime) {
        setSeedTime(seedTime);
        return this;
    }

    /**
     * <p>
     * Frequency of creating replication jobs for the server.
     * </p>
     * 
     * @param frequency
     *        Frequency of creating replication jobs for the server.
     */

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * Frequency of creating replication jobs for the server.
     * </p>
     * 
     * @return Frequency of creating replication jobs for the server.
     */

    public Integer getFrequency() {
        return this.frequency;
    }

    /**
     * <p>
     * Frequency of creating replication jobs for the server.
     * </p>
     * 
     * @param frequency
     *        Frequency of creating replication jobs for the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerReplicationParameters withFrequency(Integer frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p/>
     * 
     * @param runOnce
     */

    public void setRunOnce(Boolean runOnce) {
        this.runOnce = runOnce;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean getRunOnce() {
        return this.runOnce;
    }

    /**
     * <p/>
     * 
     * @param runOnce
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerReplicationParameters withRunOnce(Boolean runOnce) {
        setRunOnce(runOnce);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean isRunOnce() {
        return this.runOnce;
    }

    /**
     * <p>
     * License type for creating a replication job for the server.
     * </p>
     * 
     * @param licenseType
     *        License type for creating a replication job for the server.
     * @see LicenseType
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * License type for creating a replication job for the server.
     * </p>
     * 
     * @return License type for creating a replication job for the server.
     * @see LicenseType
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * License type for creating a replication job for the server.
     * </p>
     * 
     * @param licenseType
     *        License type for creating a replication job for the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public ServerReplicationParameters withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * License type for creating a replication job for the server.
     * </p>
     * 
     * @param licenseType
     *        License type for creating a replication job for the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public ServerReplicationParameters withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType.toString();
        return this;
    }

    /**
     * <p>
     * Number of recent AMIs to keep when creating a replication job for this server.
     * </p>
     * 
     * @param numberOfRecentAmisToKeep
     *        Number of recent AMIs to keep when creating a replication job for this server.
     */

    public void setNumberOfRecentAmisToKeep(Integer numberOfRecentAmisToKeep) {
        this.numberOfRecentAmisToKeep = numberOfRecentAmisToKeep;
    }

    /**
     * <p>
     * Number of recent AMIs to keep when creating a replication job for this server.
     * </p>
     * 
     * @return Number of recent AMIs to keep when creating a replication job for this server.
     */

    public Integer getNumberOfRecentAmisToKeep() {
        return this.numberOfRecentAmisToKeep;
    }

    /**
     * <p>
     * Number of recent AMIs to keep when creating a replication job for this server.
     * </p>
     * 
     * @param numberOfRecentAmisToKeep
     *        Number of recent AMIs to keep when creating a replication job for this server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerReplicationParameters withNumberOfRecentAmisToKeep(Integer numberOfRecentAmisToKeep) {
        setNumberOfRecentAmisToKeep(numberOfRecentAmisToKeep);
        return this;
    }

    /**
     * <p>
     * When true, the replication job produces encrypted AMIs. See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @param encrypted
     *        When true, the replication job produces encrypted AMIs. See also <code>KmsKeyId</code> below.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * When true, the replication job produces encrypted AMIs. See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @return When true, the replication job produces encrypted AMIs. See also <code>KmsKeyId</code> below.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * When true, the replication job produces encrypted AMIs. See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @param encrypted
     *        When true, the replication job produces encrypted AMIs. See also <code>KmsKeyId</code> below.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerReplicationParameters withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * When true, the replication job produces encrypted AMIs. See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @return When true, the replication job produces encrypted AMIs. See also <code>KmsKeyId</code> below.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p/>
     * <p>
     * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS key alias
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key alias
     * </p>
     * </li>
     * </ul>
     * <p>
     * If encrypted is <i>true</i> but a KMS key id is not specified, the customer's default KMS key for EBS is used.
     * </p>
     * 
     * @param kmsKeyId
     *        <p>
     *        KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS key ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KMS key alias
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN referring to KMS key ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN referring to KMS key alias
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If encrypted is <i>true</i> but a KMS key id is not specified, the customer's default KMS key for EBS is
     *        used.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p/>
     * <p>
     * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS key alias
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key alias
     * </p>
     * </li>
     * </ul>
     * <p>
     * If encrypted is <i>true</i> but a KMS key id is not specified, the customer's default KMS key for EBS is used.
     * </p>
     * 
     * @return <p>
     *         KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS key ID
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         KMS key alias
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN referring to KMS key ID
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN referring to KMS key alias
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If encrypted is <i>true</i> but a KMS key id is not specified, the customer's default KMS key for EBS is
     *         used.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p/>
     * <p>
     * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS key alias
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key alias
     * </p>
     * </li>
     * </ul>
     * <p>
     * If encrypted is <i>true</i> but a KMS key id is not specified, the customer's default KMS key for EBS is used.
     * </p>
     * 
     * @param kmsKeyId
     *        <p>
     *        KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS key ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KMS key alias
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN referring to KMS key ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN referring to KMS key alias
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If encrypted is <i>true</i> but a KMS key id is not specified, the customer's default KMS key for EBS is
     *        used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerReplicationParameters withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getSeedTime() != null)
            sb.append("SeedTime: ").append(getSeedTime()).append(",");
        if (getFrequency() != null)
            sb.append("Frequency: ").append(getFrequency()).append(",");
        if (getRunOnce() != null)
            sb.append("RunOnce: ").append(getRunOnce()).append(",");
        if (getLicenseType() != null)
            sb.append("LicenseType: ").append(getLicenseType()).append(",");
        if (getNumberOfRecentAmisToKeep() != null)
            sb.append("NumberOfRecentAmisToKeep: ").append(getNumberOfRecentAmisToKeep()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerReplicationParameters == false)
            return false;
        ServerReplicationParameters other = (ServerReplicationParameters) obj;
        if (other.getSeedTime() == null ^ this.getSeedTime() == null)
            return false;
        if (other.getSeedTime() != null && other.getSeedTime().equals(this.getSeedTime()) == false)
            return false;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getRunOnce() == null ^ this.getRunOnce() == null)
            return false;
        if (other.getRunOnce() != null && other.getRunOnce().equals(this.getRunOnce()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getNumberOfRecentAmisToKeep() == null ^ this.getNumberOfRecentAmisToKeep() == null)
            return false;
        if (other.getNumberOfRecentAmisToKeep() != null && other.getNumberOfRecentAmisToKeep().equals(this.getNumberOfRecentAmisToKeep()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSeedTime() == null) ? 0 : getSeedTime().hashCode());
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getRunOnce() == null) ? 0 : getRunOnce().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfRecentAmisToKeep() == null) ? 0 : getNumberOfRecentAmisToKeep().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public ServerReplicationParameters clone() {
        try {
            return (ServerReplicationParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ServerReplicationParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
