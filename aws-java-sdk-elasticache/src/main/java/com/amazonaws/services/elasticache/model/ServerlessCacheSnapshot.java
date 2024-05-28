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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The resource representing a serverless cache snapshot. Available for Redis only.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ServerlessCacheSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerlessCacheSnapshot implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of a serverless cache snapshot. Available for Redis only.
     * </p>
     */
    private String serverlessCacheSnapshotName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a serverless cache snapshot. Available for Redis only.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service (KMS) key of a serverless cache snapshot. Available for
     * Redis only.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The type of snapshot of serverless cache. Available for Redis only.
     * </p>
     */
    private String snapshotType;
    /**
     * <p>
     * The current status of the serverless cache. Available for Redis only.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time that the source serverless cache's metadata and cache data set was obtained for the snapshot.
     * Available for Redis only.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The time that the serverless cache snapshot will expire. Available for Redis only.
     * </p>
     */
    private java.util.Date expiryTime;
    /**
     * <p>
     * The total size of a serverless cache snapshot, in bytes. Available for Redis only.
     * </p>
     */
    private String bytesUsedForCache;
    /**
     * <p>
     * The configuration of the serverless cache, at the time the snapshot was taken. Available for Redis only.
     * </p>
     */
    private ServerlessCacheConfiguration serverlessCacheConfiguration;

    /**
     * <p>
     * The identifier of a serverless cache snapshot. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheSnapshotName
     *        The identifier of a serverless cache snapshot. Available for Redis only.
     */

    public void setServerlessCacheSnapshotName(String serverlessCacheSnapshotName) {
        this.serverlessCacheSnapshotName = serverlessCacheSnapshotName;
    }

    /**
     * <p>
     * The identifier of a serverless cache snapshot. Available for Redis only.
     * </p>
     * 
     * @return The identifier of a serverless cache snapshot. Available for Redis only.
     */

    public String getServerlessCacheSnapshotName() {
        return this.serverlessCacheSnapshotName;
    }

    /**
     * <p>
     * The identifier of a serverless cache snapshot. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheSnapshotName
     *        The identifier of a serverless cache snapshot. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCacheSnapshot withServerlessCacheSnapshotName(String serverlessCacheSnapshotName) {
        setServerlessCacheSnapshotName(serverlessCacheSnapshotName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a serverless cache snapshot. Available for Redis only.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of a serverless cache snapshot. Available for Redis only.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a serverless cache snapshot. Available for Redis only.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a serverless cache snapshot. Available for Redis only.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a serverless cache snapshot. Available for Redis only.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of a serverless cache snapshot. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCacheSnapshot withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service (KMS) key of a serverless cache snapshot. Available for
     * Redis only.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the Amazon Web Services Key Management Service (KMS) key of a serverless cache snapshot.
     *        Available for Redis only.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service (KMS) key of a serverless cache snapshot. Available for
     * Redis only.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Key Management Service (KMS) key of a serverless cache snapshot.
     *         Available for Redis only.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service (KMS) key of a serverless cache snapshot. Available for
     * Redis only.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the Amazon Web Services Key Management Service (KMS) key of a serverless cache snapshot.
     *        Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCacheSnapshot withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The type of snapshot of serverless cache. Available for Redis only.
     * </p>
     * 
     * @param snapshotType
     *        The type of snapshot of serverless cache. Available for Redis only.
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The type of snapshot of serverless cache. Available for Redis only.
     * </p>
     * 
     * @return The type of snapshot of serverless cache. Available for Redis only.
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p>
     * The type of snapshot of serverless cache. Available for Redis only.
     * </p>
     * 
     * @param snapshotType
     *        The type of snapshot of serverless cache. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCacheSnapshot withSnapshotType(String snapshotType) {
        setSnapshotType(snapshotType);
        return this;
    }

    /**
     * <p>
     * The current status of the serverless cache. Available for Redis only.
     * </p>
     * 
     * @param status
     *        The current status of the serverless cache. Available for Redis only.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the serverless cache. Available for Redis only.
     * </p>
     * 
     * @return The current status of the serverless cache. Available for Redis only.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the serverless cache. Available for Redis only.
     * </p>
     * 
     * @param status
     *        The current status of the serverless cache. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCacheSnapshot withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date and time that the source serverless cache's metadata and cache data set was obtained for the snapshot.
     * Available for Redis only.
     * </p>
     * 
     * @param createTime
     *        The date and time that the source serverless cache's metadata and cache data set was obtained for the
     *        snapshot. Available for Redis only.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time that the source serverless cache's metadata and cache data set was obtained for the snapshot.
     * Available for Redis only.
     * </p>
     * 
     * @return The date and time that the source serverless cache's metadata and cache data set was obtained for the
     *         snapshot. Available for Redis only.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The date and time that the source serverless cache's metadata and cache data set was obtained for the snapshot.
     * Available for Redis only.
     * </p>
     * 
     * @param createTime
     *        The date and time that the source serverless cache's metadata and cache data set was obtained for the
     *        snapshot. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCacheSnapshot withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The time that the serverless cache snapshot will expire. Available for Redis only.
     * </p>
     * 
     * @param expiryTime
     *        The time that the serverless cache snapshot will expire. Available for Redis only.
     */

    public void setExpiryTime(java.util.Date expiryTime) {
        this.expiryTime = expiryTime;
    }

    /**
     * <p>
     * The time that the serverless cache snapshot will expire. Available for Redis only.
     * </p>
     * 
     * @return The time that the serverless cache snapshot will expire. Available for Redis only.
     */

    public java.util.Date getExpiryTime() {
        return this.expiryTime;
    }

    /**
     * <p>
     * The time that the serverless cache snapshot will expire. Available for Redis only.
     * </p>
     * 
     * @param expiryTime
     *        The time that the serverless cache snapshot will expire. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCacheSnapshot withExpiryTime(java.util.Date expiryTime) {
        setExpiryTime(expiryTime);
        return this;
    }

    /**
     * <p>
     * The total size of a serverless cache snapshot, in bytes. Available for Redis only.
     * </p>
     * 
     * @param bytesUsedForCache
     *        The total size of a serverless cache snapshot, in bytes. Available for Redis only.
     */

    public void setBytesUsedForCache(String bytesUsedForCache) {
        this.bytesUsedForCache = bytesUsedForCache;
    }

    /**
     * <p>
     * The total size of a serverless cache snapshot, in bytes. Available for Redis only.
     * </p>
     * 
     * @return The total size of a serverless cache snapshot, in bytes. Available for Redis only.
     */

    public String getBytesUsedForCache() {
        return this.bytesUsedForCache;
    }

    /**
     * <p>
     * The total size of a serverless cache snapshot, in bytes. Available for Redis only.
     * </p>
     * 
     * @param bytesUsedForCache
     *        The total size of a serverless cache snapshot, in bytes. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCacheSnapshot withBytesUsedForCache(String bytesUsedForCache) {
        setBytesUsedForCache(bytesUsedForCache);
        return this;
    }

    /**
     * <p>
     * The configuration of the serverless cache, at the time the snapshot was taken. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheConfiguration
     *        The configuration of the serverless cache, at the time the snapshot was taken. Available for Redis only.
     */

    public void setServerlessCacheConfiguration(ServerlessCacheConfiguration serverlessCacheConfiguration) {
        this.serverlessCacheConfiguration = serverlessCacheConfiguration;
    }

    /**
     * <p>
     * The configuration of the serverless cache, at the time the snapshot was taken. Available for Redis only.
     * </p>
     * 
     * @return The configuration of the serverless cache, at the time the snapshot was taken. Available for Redis only.
     */

    public ServerlessCacheConfiguration getServerlessCacheConfiguration() {
        return this.serverlessCacheConfiguration;
    }

    /**
     * <p>
     * The configuration of the serverless cache, at the time the snapshot was taken. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheConfiguration
     *        The configuration of the serverless cache, at the time the snapshot was taken. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCacheSnapshot withServerlessCacheConfiguration(ServerlessCacheConfiguration serverlessCacheConfiguration) {
        setServerlessCacheConfiguration(serverlessCacheConfiguration);
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
        if (getServerlessCacheSnapshotName() != null)
            sb.append("ServerlessCacheSnapshotName: ").append(getServerlessCacheSnapshotName()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: ").append(getSnapshotType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getExpiryTime() != null)
            sb.append("ExpiryTime: ").append(getExpiryTime()).append(",");
        if (getBytesUsedForCache() != null)
            sb.append("BytesUsedForCache: ").append(getBytesUsedForCache()).append(",");
        if (getServerlessCacheConfiguration() != null)
            sb.append("ServerlessCacheConfiguration: ").append(getServerlessCacheConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerlessCacheSnapshot == false)
            return false;
        ServerlessCacheSnapshot other = (ServerlessCacheSnapshot) obj;
        if (other.getServerlessCacheSnapshotName() == null ^ this.getServerlessCacheSnapshotName() == null)
            return false;
        if (other.getServerlessCacheSnapshotName() != null && other.getServerlessCacheSnapshotName().equals(this.getServerlessCacheSnapshotName()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getExpiryTime() == null ^ this.getExpiryTime() == null)
            return false;
        if (other.getExpiryTime() != null && other.getExpiryTime().equals(this.getExpiryTime()) == false)
            return false;
        if (other.getBytesUsedForCache() == null ^ this.getBytesUsedForCache() == null)
            return false;
        if (other.getBytesUsedForCache() != null && other.getBytesUsedForCache().equals(this.getBytesUsedForCache()) == false)
            return false;
        if (other.getServerlessCacheConfiguration() == null ^ this.getServerlessCacheConfiguration() == null)
            return false;
        if (other.getServerlessCacheConfiguration() != null && other.getServerlessCacheConfiguration().equals(this.getServerlessCacheConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerlessCacheSnapshotName() == null) ? 0 : getServerlessCacheSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getExpiryTime() == null) ? 0 : getExpiryTime().hashCode());
        hashCode = prime * hashCode + ((getBytesUsedForCache() == null) ? 0 : getBytesUsedForCache().hashCode());
        hashCode = prime * hashCode + ((getServerlessCacheConfiguration() == null) ? 0 : getServerlessCacheConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ServerlessCacheSnapshot clone() {
        try {
            return (ServerlessCacheSnapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
