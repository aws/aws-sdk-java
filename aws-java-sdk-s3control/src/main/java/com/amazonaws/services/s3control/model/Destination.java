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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Specifies information about the replication destination bucket and its settings for an S3 on Outposts replication
 * configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/Destination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Destination implements Serializable, Cloneable {

    /**
     * <p>
     * The destination bucket owner's account ID.
     * </p>
     */
    private String account;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access point for the destination bucket where you want S3 on Outposts to
     * store the replication results.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * A container that specifies S3 Replication Time Control (S3 RTC) settings, including whether S3 RTC is enabled and
     * the time when all objects and operations on objects must be replicated. Must be specified together with a
     * <code>Metrics</code> block.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private ReplicationTime replicationTime;
    /**
     * <p>
     * Specify this property only in a cross-account scenario (where the source and destination bucket owners are not
     * the same), and you want to change replica ownership to the Amazon Web Services account that owns the destination
     * bucket. If this property is not specified in the replication configuration, the replicas are owned by same Amazon
     * Web Services account that owns the source object.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private AccessControlTranslation accessControlTranslation;
    /**
     * <p>
     * A container that provides information about encryption. If <code>SourceSelectionCriteria</code> is specified, you
     * must specify this element.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     */
    private EncryptionConfiguration encryptionConfiguration;
    /**
     * <p>
     * A container that specifies replication metrics-related settings.
     * </p>
     */
    private Metrics metrics;
    /**
     * <p>
     * The storage class to use when replicating objects. All objects stored on S3 on Outposts are stored in the
     * <code>OUTPOSTS</code> storage class. S3 on Outposts uses the <code>OUTPOSTS</code> storage class to create the
     * object replicas.
     * </p>
     * <note>
     * <p>
     * Values other than <code>OUTPOSTS</code> aren't supported by Amazon S3 on Outposts.
     * </p>
     * </note>
     */
    private String storageClass;

    /**
     * <p>
     * The destination bucket owner's account ID.
     * </p>
     * 
     * @param account
     *        The destination bucket owner's account ID.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The destination bucket owner's account ID.
     * </p>
     * 
     * @return The destination bucket owner's account ID.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The destination bucket owner's account ID.
     * </p>
     * 
     * @param account
     *        The destination bucket owner's account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withAccount(String account) {
        setAccount(account);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access point for the destination bucket where you want S3 on Outposts to
     * store the replication results.
     * </p>
     * 
     * @param bucket
     *        The Amazon Resource Name (ARN) of the access point for the destination bucket where you want S3 on
     *        Outposts to store the replication results.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access point for the destination bucket where you want S3 on Outposts to
     * store the replication results.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the access point for the destination bucket where you want S3 on
     *         Outposts to store the replication results.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the access point for the destination bucket where you want S3 on Outposts to
     * store the replication results.
     * </p>
     * 
     * @param bucket
     *        The Amazon Resource Name (ARN) of the access point for the destination bucket where you want S3 on
     *        Outposts to store the replication results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * A container that specifies S3 Replication Time Control (S3 RTC) settings, including whether S3 RTC is enabled and
     * the time when all objects and operations on objects must be replicated. Must be specified together with a
     * <code>Metrics</code> block.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param replicationTime
     *        A container that specifies S3 Replication Time Control (S3 RTC) settings, including whether S3 RTC is
     *        enabled and the time when all objects and operations on objects must be replicated. Must be specified
     *        together with a <code>Metrics</code> block. </p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setReplicationTime(ReplicationTime replicationTime) {
        this.replicationTime = replicationTime;
    }

    /**
     * <p>
     * A container that specifies S3 Replication Time Control (S3 RTC) settings, including whether S3 RTC is enabled and
     * the time when all objects and operations on objects must be replicated. Must be specified together with a
     * <code>Metrics</code> block.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return A container that specifies S3 Replication Time Control (S3 RTC) settings, including whether S3 RTC is
     *         enabled and the time when all objects and operations on objects must be replicated. Must be specified
     *         together with a <code>Metrics</code> block. </p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public ReplicationTime getReplicationTime() {
        return this.replicationTime;
    }

    /**
     * <p>
     * A container that specifies S3 Replication Time Control (S3 RTC) settings, including whether S3 RTC is enabled and
     * the time when all objects and operations on objects must be replicated. Must be specified together with a
     * <code>Metrics</code> block.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param replicationTime
     *        A container that specifies S3 Replication Time Control (S3 RTC) settings, including whether S3 RTC is
     *        enabled and the time when all objects and operations on objects must be replicated. Must be specified
     *        together with a <code>Metrics</code> block. </p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withReplicationTime(ReplicationTime replicationTime) {
        setReplicationTime(replicationTime);
        return this;
    }

    /**
     * <p>
     * Specify this property only in a cross-account scenario (where the source and destination bucket owners are not
     * the same), and you want to change replica ownership to the Amazon Web Services account that owns the destination
     * bucket. If this property is not specified in the replication configuration, the replicas are owned by same Amazon
     * Web Services account that owns the source object.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param accessControlTranslation
     *        Specify this property only in a cross-account scenario (where the source and destination bucket owners are
     *        not the same), and you want to change replica ownership to the Amazon Web Services account that owns the
     *        destination bucket. If this property is not specified in the replication configuration, the replicas are
     *        owned by same Amazon Web Services account that owns the source object.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setAccessControlTranslation(AccessControlTranslation accessControlTranslation) {
        this.accessControlTranslation = accessControlTranslation;
    }

    /**
     * <p>
     * Specify this property only in a cross-account scenario (where the source and destination bucket owners are not
     * the same), and you want to change replica ownership to the Amazon Web Services account that owns the destination
     * bucket. If this property is not specified in the replication configuration, the replicas are owned by same Amazon
     * Web Services account that owns the source object.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return Specify this property only in a cross-account scenario (where the source and destination bucket owners
     *         are not the same), and you want to change replica ownership to the Amazon Web Services account that owns
     *         the destination bucket. If this property is not specified in the replication configuration, the replicas
     *         are owned by same Amazon Web Services account that owns the source object.</p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public AccessControlTranslation getAccessControlTranslation() {
        return this.accessControlTranslation;
    }

    /**
     * <p>
     * Specify this property only in a cross-account scenario (where the source and destination bucket owners are not
     * the same), and you want to change replica ownership to the Amazon Web Services account that owns the destination
     * bucket. If this property is not specified in the replication configuration, the replicas are owned by same Amazon
     * Web Services account that owns the source object.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param accessControlTranslation
     *        Specify this property only in a cross-account scenario (where the source and destination bucket owners are
     *        not the same), and you want to change replica ownership to the Amazon Web Services account that owns the
     *        destination bucket. If this property is not specified in the replication configuration, the replicas are
     *        owned by same Amazon Web Services account that owns the source object.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withAccessControlTranslation(AccessControlTranslation accessControlTranslation) {
        setAccessControlTranslation(accessControlTranslation);
        return this;
    }

    /**
     * <p>
     * A container that provides information about encryption. If <code>SourceSelectionCriteria</code> is specified, you
     * must specify this element.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param encryptionConfiguration
     *        A container that provides information about encryption. If <code>SourceSelectionCriteria</code> is
     *        specified, you must specify this element.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * A container that provides information about encryption. If <code>SourceSelectionCriteria</code> is specified, you
     * must specify this element.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @return A container that provides information about encryption. If <code>SourceSelectionCriteria</code> is
     *         specified, you must specify this element.</p> <note>
     *         <p>
     *         This is not supported by Amazon S3 on Outposts buckets.
     *         </p>
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * A container that provides information about encryption. If <code>SourceSelectionCriteria</code> is specified, you
     * must specify this element.
     * </p>
     * <note>
     * <p>
     * This is not supported by Amazon S3 on Outposts buckets.
     * </p>
     * </note>
     * 
     * @param encryptionConfiguration
     *        A container that provides information about encryption. If <code>SourceSelectionCriteria</code> is
     *        specified, you must specify this element.</p> <note>
     *        <p>
     *        This is not supported by Amazon S3 on Outposts buckets.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * A container that specifies replication metrics-related settings.
     * </p>
     * 
     * @param metrics
     *        A container that specifies replication metrics-related settings.
     */

    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * A container that specifies replication metrics-related settings.
     * </p>
     * 
     * @return A container that specifies replication metrics-related settings.
     */

    public Metrics getMetrics() {
        return this.metrics;
    }

    /**
     * <p>
     * A container that specifies replication metrics-related settings.
     * </p>
     * 
     * @param metrics
     *        A container that specifies replication metrics-related settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withMetrics(Metrics metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * The storage class to use when replicating objects. All objects stored on S3 on Outposts are stored in the
     * <code>OUTPOSTS</code> storage class. S3 on Outposts uses the <code>OUTPOSTS</code> storage class to create the
     * object replicas.
     * </p>
     * <note>
     * <p>
     * Values other than <code>OUTPOSTS</code> aren't supported by Amazon S3 on Outposts.
     * </p>
     * </note>
     * 
     * @param storageClass
     *        The storage class to use when replicating objects. All objects stored on S3 on Outposts are stored in the
     *        <code>OUTPOSTS</code> storage class. S3 on Outposts uses the <code>OUTPOSTS</code> storage class to create
     *        the object replicas. </p> <note>
     *        <p>
     *        Values other than <code>OUTPOSTS</code> aren't supported by Amazon S3 on Outposts.
     *        </p>
     * @see ReplicationStorageClass
     */

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The storage class to use when replicating objects. All objects stored on S3 on Outposts are stored in the
     * <code>OUTPOSTS</code> storage class. S3 on Outposts uses the <code>OUTPOSTS</code> storage class to create the
     * object replicas.
     * </p>
     * <note>
     * <p>
     * Values other than <code>OUTPOSTS</code> aren't supported by Amazon S3 on Outposts.
     * </p>
     * </note>
     * 
     * @return The storage class to use when replicating objects. All objects stored on S3 on Outposts are stored in the
     *         <code>OUTPOSTS</code> storage class. S3 on Outposts uses the <code>OUTPOSTS</code> storage class to
     *         create the object replicas. </p> <note>
     *         <p>
     *         Values other than <code>OUTPOSTS</code> aren't supported by Amazon S3 on Outposts.
     *         </p>
     * @see ReplicationStorageClass
     */

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p>
     * The storage class to use when replicating objects. All objects stored on S3 on Outposts are stored in the
     * <code>OUTPOSTS</code> storage class. S3 on Outposts uses the <code>OUTPOSTS</code> storage class to create the
     * object replicas.
     * </p>
     * <note>
     * <p>
     * Values other than <code>OUTPOSTS</code> aren't supported by Amazon S3 on Outposts.
     * </p>
     * </note>
     * 
     * @param storageClass
     *        The storage class to use when replicating objects. All objects stored on S3 on Outposts are stored in the
     *        <code>OUTPOSTS</code> storage class. S3 on Outposts uses the <code>OUTPOSTS</code> storage class to create
     *        the object replicas. </p> <note>
     *        <p>
     *        Values other than <code>OUTPOSTS</code> aren't supported by Amazon S3 on Outposts.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationStorageClass
     */

    public Destination withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * <p>
     * The storage class to use when replicating objects. All objects stored on S3 on Outposts are stored in the
     * <code>OUTPOSTS</code> storage class. S3 on Outposts uses the <code>OUTPOSTS</code> storage class to create the
     * object replicas.
     * </p>
     * <note>
     * <p>
     * Values other than <code>OUTPOSTS</code> aren't supported by Amazon S3 on Outposts.
     * </p>
     * </note>
     * 
     * @param storageClass
     *        The storage class to use when replicating objects. All objects stored on S3 on Outposts are stored in the
     *        <code>OUTPOSTS</code> storage class. S3 on Outposts uses the <code>OUTPOSTS</code> storage class to create
     *        the object replicas. </p> <note>
     *        <p>
     *        Values other than <code>OUTPOSTS</code> aren't supported by Amazon S3 on Outposts.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationStorageClass
     */

    public Destination withStorageClass(ReplicationStorageClass storageClass) {
        this.storageClass = storageClass.toString();
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
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getReplicationTime() != null)
            sb.append("ReplicationTime: ").append(getReplicationTime()).append(",");
        if (getAccessControlTranslation() != null)
            sb.append("AccessControlTranslation: ").append(getAccessControlTranslation()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getStorageClass() != null)
            sb.append("StorageClass: ").append(getStorageClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Destination == false)
            return false;
        Destination other = (Destination) obj;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getReplicationTime() == null ^ this.getReplicationTime() == null)
            return false;
        if (other.getReplicationTime() != null && other.getReplicationTime().equals(this.getReplicationTime()) == false)
            return false;
        if (other.getAccessControlTranslation() == null ^ this.getAccessControlTranslation() == null)
            return false;
        if (other.getAccessControlTranslation() != null && other.getAccessControlTranslation().equals(this.getAccessControlTranslation()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getReplicationTime() == null) ? 0 : getReplicationTime().hashCode());
        hashCode = prime * hashCode + ((getAccessControlTranslation() == null) ? 0 : getAccessControlTranslation().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        return hashCode;
    }

    @Override
    public Destination clone() {
        try {
            return (Destination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
