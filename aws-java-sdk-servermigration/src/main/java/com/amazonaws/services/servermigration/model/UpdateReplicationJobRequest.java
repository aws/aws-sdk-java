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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/UpdateReplicationJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReplicationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the replication job.
     * </p>
     */
    private String replicationJobId;
    /**
     * <p>
     * The time between consecutive replication runs, in hours.
     * </p>
     */
    private Integer frequency;
    /**
     * <p>
     * The start time of the next replication run.
     * </p>
     */
    private java.util.Date nextReplicationRunStartTime;
    /**
     * <p>
     * The license type to be used for the AMI created by a successful replication run.
     * </p>
     */
    private String licenseType;
    /**
     * <p>
     * The name of the IAM role to be used by AWS SMS.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The description of the replication job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The maximum number of SMS-created AMIs to retain. The oldest will be deleted once the maximum number is reached
     * and a new AMI is created.
     * </p>
     */
    private Integer numberOfRecentAmisToKeep;
    /**
     * <p>
     * When true, the replication job produces encrypted AMIs . See also <code>KmsKeyId</code> below.
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
     * The identifier of the replication job.
     * </p>
     * 
     * @param replicationJobId
     *        The identifier of the replication job.
     */

    public void setReplicationJobId(String replicationJobId) {
        this.replicationJobId = replicationJobId;
    }

    /**
     * <p>
     * The identifier of the replication job.
     * </p>
     * 
     * @return The identifier of the replication job.
     */

    public String getReplicationJobId() {
        return this.replicationJobId;
    }

    /**
     * <p>
     * The identifier of the replication job.
     * </p>
     * 
     * @param replicationJobId
     *        The identifier of the replication job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationJobRequest withReplicationJobId(String replicationJobId) {
        setReplicationJobId(replicationJobId);
        return this;
    }

    /**
     * <p>
     * The time between consecutive replication runs, in hours.
     * </p>
     * 
     * @param frequency
     *        The time between consecutive replication runs, in hours.
     */

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * The time between consecutive replication runs, in hours.
     * </p>
     * 
     * @return The time between consecutive replication runs, in hours.
     */

    public Integer getFrequency() {
        return this.frequency;
    }

    /**
     * <p>
     * The time between consecutive replication runs, in hours.
     * </p>
     * 
     * @param frequency
     *        The time between consecutive replication runs, in hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationJobRequest withFrequency(Integer frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p>
     * The start time of the next replication run.
     * </p>
     * 
     * @param nextReplicationRunStartTime
     *        The start time of the next replication run.
     */

    public void setNextReplicationRunStartTime(java.util.Date nextReplicationRunStartTime) {
        this.nextReplicationRunStartTime = nextReplicationRunStartTime;
    }

    /**
     * <p>
     * The start time of the next replication run.
     * </p>
     * 
     * @return The start time of the next replication run.
     */

    public java.util.Date getNextReplicationRunStartTime() {
        return this.nextReplicationRunStartTime;
    }

    /**
     * <p>
     * The start time of the next replication run.
     * </p>
     * 
     * @param nextReplicationRunStartTime
     *        The start time of the next replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationJobRequest withNextReplicationRunStartTime(java.util.Date nextReplicationRunStartTime) {
        setNextReplicationRunStartTime(nextReplicationRunStartTime);
        return this;
    }

    /**
     * <p>
     * The license type to be used for the AMI created by a successful replication run.
     * </p>
     * 
     * @param licenseType
     *        The license type to be used for the AMI created by a successful replication run.
     * @see LicenseType
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The license type to be used for the AMI created by a successful replication run.
     * </p>
     * 
     * @return The license type to be used for the AMI created by a successful replication run.
     * @see LicenseType
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * The license type to be used for the AMI created by a successful replication run.
     * </p>
     * 
     * @param licenseType
     *        The license type to be used for the AMI created by a successful replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public UpdateReplicationJobRequest withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * The license type to be used for the AMI created by a successful replication run.
     * </p>
     * 
     * @param licenseType
     *        The license type to be used for the AMI created by a successful replication run.
     * @see LicenseType
     */

    public void setLicenseType(LicenseType licenseType) {
        withLicenseType(licenseType);
    }

    /**
     * <p>
     * The license type to be used for the AMI created by a successful replication run.
     * </p>
     * 
     * @param licenseType
     *        The license type to be used for the AMI created by a successful replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public UpdateReplicationJobRequest withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the IAM role to be used by AWS SMS.
     * </p>
     * 
     * @param roleName
     *        The name of the IAM role to be used by AWS SMS.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the IAM role to be used by AWS SMS.
     * </p>
     * 
     * @return The name of the IAM role to be used by AWS SMS.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the IAM role to be used by AWS SMS.
     * </p>
     * 
     * @param roleName
     *        The name of the IAM role to be used by AWS SMS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationJobRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The description of the replication job.
     * </p>
     * 
     * @param description
     *        The description of the replication job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the replication job.
     * </p>
     * 
     * @return The description of the replication job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the replication job.
     * </p>
     * 
     * @param description
     *        The description of the replication job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationJobRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The maximum number of SMS-created AMIs to retain. The oldest will be deleted once the maximum number is reached
     * and a new AMI is created.
     * </p>
     * 
     * @param numberOfRecentAmisToKeep
     *        The maximum number of SMS-created AMIs to retain. The oldest will be deleted once the maximum number is
     *        reached and a new AMI is created.
     */

    public void setNumberOfRecentAmisToKeep(Integer numberOfRecentAmisToKeep) {
        this.numberOfRecentAmisToKeep = numberOfRecentAmisToKeep;
    }

    /**
     * <p>
     * The maximum number of SMS-created AMIs to retain. The oldest will be deleted once the maximum number is reached
     * and a new AMI is created.
     * </p>
     * 
     * @return The maximum number of SMS-created AMIs to retain. The oldest will be deleted once the maximum number is
     *         reached and a new AMI is created.
     */

    public Integer getNumberOfRecentAmisToKeep() {
        return this.numberOfRecentAmisToKeep;
    }

    /**
     * <p>
     * The maximum number of SMS-created AMIs to retain. The oldest will be deleted once the maximum number is reached
     * and a new AMI is created.
     * </p>
     * 
     * @param numberOfRecentAmisToKeep
     *        The maximum number of SMS-created AMIs to retain. The oldest will be deleted once the maximum number is
     *        reached and a new AMI is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationJobRequest withNumberOfRecentAmisToKeep(Integer numberOfRecentAmisToKeep) {
        setNumberOfRecentAmisToKeep(numberOfRecentAmisToKeep);
        return this;
    }

    /**
     * <p>
     * When true, the replication job produces encrypted AMIs . See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @param encrypted
     *        When true, the replication job produces encrypted AMIs . See also <code>KmsKeyId</code> below.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * When true, the replication job produces encrypted AMIs . See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @return When true, the replication job produces encrypted AMIs . See also <code>KmsKeyId</code> below.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * When true, the replication job produces encrypted AMIs . See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @param encrypted
     *        When true, the replication job produces encrypted AMIs . See also <code>KmsKeyId</code> below.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationJobRequest withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * When true, the replication job produces encrypted AMIs . See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @return When true, the replication job produces encrypted AMIs . See also <code>KmsKeyId</code> below.
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

    public UpdateReplicationJobRequest withKmsKeyId(String kmsKeyId) {
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
        if (getReplicationJobId() != null)
            sb.append("ReplicationJobId: ").append(getReplicationJobId()).append(",");
        if (getFrequency() != null)
            sb.append("Frequency: ").append(getFrequency()).append(",");
        if (getNextReplicationRunStartTime() != null)
            sb.append("NextReplicationRunStartTime: ").append(getNextReplicationRunStartTime()).append(",");
        if (getLicenseType() != null)
            sb.append("LicenseType: ").append(getLicenseType()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof UpdateReplicationJobRequest == false)
            return false;
        UpdateReplicationJobRequest other = (UpdateReplicationJobRequest) obj;
        if (other.getReplicationJobId() == null ^ this.getReplicationJobId() == null)
            return false;
        if (other.getReplicationJobId() != null && other.getReplicationJobId().equals(this.getReplicationJobId()) == false)
            return false;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getNextReplicationRunStartTime() == null ^ this.getNextReplicationRunStartTime() == null)
            return false;
        if (other.getNextReplicationRunStartTime() != null && other.getNextReplicationRunStartTime().equals(this.getNextReplicationRunStartTime()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getReplicationJobId() == null) ? 0 : getReplicationJobId().hashCode());
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getNextReplicationRunStartTime() == null) ? 0 : getNextReplicationRunStartTime().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNumberOfRecentAmisToKeep() == null) ? 0 : getNumberOfRecentAmisToKeep().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReplicationJobRequest clone() {
        return (UpdateReplicationJobRequest) super.clone();
    }

}
