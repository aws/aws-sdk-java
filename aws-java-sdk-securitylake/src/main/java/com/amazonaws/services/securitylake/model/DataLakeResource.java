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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details of Amazon Security Lake object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DataLakeResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLakeResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Retrieves the status of the configuration operation for an account in Amazon Security Lake.
     * </p>
     */
    private String createStatus;
    /**
     * <p>
     * The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about ARNs and
     * how to use them in policies, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/subscriber-management.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     */
    private String dataLakeArn;
    /**
     * <p>
     * Provides encryption details of Amazon Security Lake object.
     * </p>
     */
    private DataLakeEncryptionConfiguration encryptionConfiguration;
    /**
     * <p>
     * Provides lifecycle details of Amazon Security Lake object.
     * </p>
     */
    private DataLakeLifecycleConfiguration lifecycleConfiguration;
    /**
     * <p>
     * The Amazon Web Services Regions where Security Lake is enabled.
     * </p>
     */
    private String region;
    /**
     * <p>
     * Provides replication details of Amazon Security Lake object.
     * </p>
     */
    private DataLakeReplicationConfiguration replicationConfiguration;
    /**
     * <p>
     * The ARN for the Amazon Security Lake Amazon S3 bucket.
     * </p>
     */
    private String s3BucketArn;
    /**
     * <p>
     * The status of the last <code>UpdateDataLake </code>or <code>DeleteDataLake</code> API request.
     * </p>
     */
    private DataLakeUpdateStatus updateStatus;

    /**
     * <p>
     * Retrieves the status of the configuration operation for an account in Amazon Security Lake.
     * </p>
     * 
     * @param createStatus
     *        Retrieves the status of the configuration operation for an account in Amazon Security Lake.
     * @see DataLakeStatus
     */

    public void setCreateStatus(String createStatus) {
        this.createStatus = createStatus;
    }

    /**
     * <p>
     * Retrieves the status of the configuration operation for an account in Amazon Security Lake.
     * </p>
     * 
     * @return Retrieves the status of the configuration operation for an account in Amazon Security Lake.
     * @see DataLakeStatus
     */

    public String getCreateStatus() {
        return this.createStatus;
    }

    /**
     * <p>
     * Retrieves the status of the configuration operation for an account in Amazon Security Lake.
     * </p>
     * 
     * @param createStatus
     *        Retrieves the status of the configuration operation for an account in Amazon Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLakeStatus
     */

    public DataLakeResource withCreateStatus(String createStatus) {
        setCreateStatus(createStatus);
        return this;
    }

    /**
     * <p>
     * Retrieves the status of the configuration operation for an account in Amazon Security Lake.
     * </p>
     * 
     * @param createStatus
     *        Retrieves the status of the configuration operation for an account in Amazon Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataLakeStatus
     */

    public DataLakeResource withCreateStatus(DataLakeStatus createStatus) {
        this.createStatus = createStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about ARNs and
     * how to use them in policies, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/subscriber-management.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @param dataLakeArn
     *        The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about
     *        ARNs and how to use them in policies, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/subscriber-management.html">Amazon
     *        Security Lake User Guide</a>.
     */

    public void setDataLakeArn(String dataLakeArn) {
        this.dataLakeArn = dataLakeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about ARNs and
     * how to use them in policies, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/subscriber-management.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about
     *         ARNs and how to use them in policies, see the <a
     *         href="https://docs.aws.amazon.com/security-lake/latest/userguide/subscriber-management.html">Amazon
     *         Security Lake User Guide</a>.
     */

    public String getDataLakeArn() {
        return this.dataLakeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about ARNs and
     * how to use them in policies, see the <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/subscriber-management.html">Amazon Security Lake
     * User Guide</a>.
     * </p>
     * 
     * @param dataLakeArn
     *        The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about
     *        ARNs and how to use them in policies, see the <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/subscriber-management.html">Amazon
     *        Security Lake User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeResource withDataLakeArn(String dataLakeArn) {
        setDataLakeArn(dataLakeArn);
        return this;
    }

    /**
     * <p>
     * Provides encryption details of Amazon Security Lake object.
     * </p>
     * 
     * @param encryptionConfiguration
     *        Provides encryption details of Amazon Security Lake object.
     */

    public void setEncryptionConfiguration(DataLakeEncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * Provides encryption details of Amazon Security Lake object.
     * </p>
     * 
     * @return Provides encryption details of Amazon Security Lake object.
     */

    public DataLakeEncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * Provides encryption details of Amazon Security Lake object.
     * </p>
     * 
     * @param encryptionConfiguration
     *        Provides encryption details of Amazon Security Lake object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeResource withEncryptionConfiguration(DataLakeEncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides lifecycle details of Amazon Security Lake object.
     * </p>
     * 
     * @param lifecycleConfiguration
     *        Provides lifecycle details of Amazon Security Lake object.
     */

    public void setLifecycleConfiguration(DataLakeLifecycleConfiguration lifecycleConfiguration) {
        this.lifecycleConfiguration = lifecycleConfiguration;
    }

    /**
     * <p>
     * Provides lifecycle details of Amazon Security Lake object.
     * </p>
     * 
     * @return Provides lifecycle details of Amazon Security Lake object.
     */

    public DataLakeLifecycleConfiguration getLifecycleConfiguration() {
        return this.lifecycleConfiguration;
    }

    /**
     * <p>
     * Provides lifecycle details of Amazon Security Lake object.
     * </p>
     * 
     * @param lifecycleConfiguration
     *        Provides lifecycle details of Amazon Security Lake object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeResource withLifecycleConfiguration(DataLakeLifecycleConfiguration lifecycleConfiguration) {
        setLifecycleConfiguration(lifecycleConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Regions where Security Lake is enabled.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Regions where Security Lake is enabled.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Regions where Security Lake is enabled.
     * </p>
     * 
     * @return The Amazon Web Services Regions where Security Lake is enabled.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Regions where Security Lake is enabled.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Regions where Security Lake is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeResource withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * Provides replication details of Amazon Security Lake object.
     * </p>
     * 
     * @param replicationConfiguration
     *        Provides replication details of Amazon Security Lake object.
     */

    public void setReplicationConfiguration(DataLakeReplicationConfiguration replicationConfiguration) {
        this.replicationConfiguration = replicationConfiguration;
    }

    /**
     * <p>
     * Provides replication details of Amazon Security Lake object.
     * </p>
     * 
     * @return Provides replication details of Amazon Security Lake object.
     */

    public DataLakeReplicationConfiguration getReplicationConfiguration() {
        return this.replicationConfiguration;
    }

    /**
     * <p>
     * Provides replication details of Amazon Security Lake object.
     * </p>
     * 
     * @param replicationConfiguration
     *        Provides replication details of Amazon Security Lake object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeResource withReplicationConfiguration(DataLakeReplicationConfiguration replicationConfiguration) {
        setReplicationConfiguration(replicationConfiguration);
        return this;
    }

    /**
     * <p>
     * The ARN for the Amazon Security Lake Amazon S3 bucket.
     * </p>
     * 
     * @param s3BucketArn
     *        The ARN for the Amazon Security Lake Amazon S3 bucket.
     */

    public void setS3BucketArn(String s3BucketArn) {
        this.s3BucketArn = s3BucketArn;
    }

    /**
     * <p>
     * The ARN for the Amazon Security Lake Amazon S3 bucket.
     * </p>
     * 
     * @return The ARN for the Amazon Security Lake Amazon S3 bucket.
     */

    public String getS3BucketArn() {
        return this.s3BucketArn;
    }

    /**
     * <p>
     * The ARN for the Amazon Security Lake Amazon S3 bucket.
     * </p>
     * 
     * @param s3BucketArn
     *        The ARN for the Amazon Security Lake Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeResource withS3BucketArn(String s3BucketArn) {
        setS3BucketArn(s3BucketArn);
        return this;
    }

    /**
     * <p>
     * The status of the last <code>UpdateDataLake </code>or <code>DeleteDataLake</code> API request.
     * </p>
     * 
     * @param updateStatus
     *        The status of the last <code>UpdateDataLake </code>or <code>DeleteDataLake</code> API request.
     */

    public void setUpdateStatus(DataLakeUpdateStatus updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * The status of the last <code>UpdateDataLake </code>or <code>DeleteDataLake</code> API request.
     * </p>
     * 
     * @return The status of the last <code>UpdateDataLake </code>or <code>DeleteDataLake</code> API request.
     */

    public DataLakeUpdateStatus getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * <p>
     * The status of the last <code>UpdateDataLake </code>or <code>DeleteDataLake</code> API request.
     * </p>
     * 
     * @param updateStatus
     *        The status of the last <code>UpdateDataLake </code>or <code>DeleteDataLake</code> API request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLakeResource withUpdateStatus(DataLakeUpdateStatus updateStatus) {
        setUpdateStatus(updateStatus);
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
        if (getCreateStatus() != null)
            sb.append("CreateStatus: ").append(getCreateStatus()).append(",");
        if (getDataLakeArn() != null)
            sb.append("DataLakeArn: ").append(getDataLakeArn()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getLifecycleConfiguration() != null)
            sb.append("LifecycleConfiguration: ").append(getLifecycleConfiguration()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getReplicationConfiguration() != null)
            sb.append("ReplicationConfiguration: ").append(getReplicationConfiguration()).append(",");
        if (getS3BucketArn() != null)
            sb.append("S3BucketArn: ").append(getS3BucketArn()).append(",");
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: ").append(getUpdateStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataLakeResource == false)
            return false;
        DataLakeResource other = (DataLakeResource) obj;
        if (other.getCreateStatus() == null ^ this.getCreateStatus() == null)
            return false;
        if (other.getCreateStatus() != null && other.getCreateStatus().equals(this.getCreateStatus()) == false)
            return false;
        if (other.getDataLakeArn() == null ^ this.getDataLakeArn() == null)
            return false;
        if (other.getDataLakeArn() != null && other.getDataLakeArn().equals(this.getDataLakeArn()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getLifecycleConfiguration() == null ^ this.getLifecycleConfiguration() == null)
            return false;
        if (other.getLifecycleConfiguration() != null && other.getLifecycleConfiguration().equals(this.getLifecycleConfiguration()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getReplicationConfiguration() == null ^ this.getReplicationConfiguration() == null)
            return false;
        if (other.getReplicationConfiguration() != null && other.getReplicationConfiguration().equals(this.getReplicationConfiguration()) == false)
            return false;
        if (other.getS3BucketArn() == null ^ this.getS3BucketArn() == null)
            return false;
        if (other.getS3BucketArn() != null && other.getS3BucketArn().equals(this.getS3BucketArn()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateStatus() == null) ? 0 : getCreateStatus().hashCode());
        hashCode = prime * hashCode + ((getDataLakeArn() == null) ? 0 : getDataLakeArn().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLifecycleConfiguration() == null) ? 0 : getLifecycleConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getReplicationConfiguration() == null) ? 0 : getReplicationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getS3BucketArn() == null) ? 0 : getS3BucketArn().hashCode());
        hashCode = prime * hashCode + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        return hashCode;
    }

    @Override
    public DataLakeResource clone() {
        try {
            return (DataLakeResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.DataLakeResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
