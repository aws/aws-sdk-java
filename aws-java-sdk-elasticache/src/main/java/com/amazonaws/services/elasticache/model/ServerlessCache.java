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
 * The resource representing a serverless cache.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ServerlessCache" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerlessCache implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the serverless cache.
     * </p>
     */
    private String serverlessCacheName;
    /**
     * <p>
     * A description of the serverless cache.
     * </p>
     */
    private String description;
    /**
     * <p>
     * When the serverless cache was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The current status of the serverless cache. The allowed values are CREATING, AVAILABLE, DELETING, CREATE-FAILED
     * and MODIFYING.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The engine the serverless cache is compatible with.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version number of the engine the serverless cache is compatible with.
     * </p>
     */
    private String majorEngineVersion;
    /**
     * <p>
     * The name and version number of the engine the serverless cache is compatible with.
     * </p>
     */
    private String fullEngineVersion;
    /**
     * <p>
     * The cache usage limit for the serverless cache.
     * </p>
     */
    private CacheUsageLimits cacheUsageLimits;
    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service (KMS) key that is used to encrypt data at rest in the
     * serverless cache.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The IDs of the EC2 security groups associated with the serverless cache.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;

    private Endpoint endpoint;

    private Endpoint readerEndpoint;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the serverless cache.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The identifier of the user group associated with the serverless cache. Available for Redis only. Default is NULL.
     * </p>
     */
    private String userGroupId;
    /**
     * <p>
     * If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2 default subnets across
     * AZs in your VPC. For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default subnets
     * across AZs in your default VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;
    /**
     * <p>
     * The current setting for the number of serverless cache snapshots the system will retain. Available for Redis
     * only.
     * </p>
     */
    private Integer snapshotRetentionLimit;
    /**
     * <p>
     * The daily time that a cache snapshot will be created. Default is NULL, i.e. snapshots will not be created at a
     * specific time on a daily basis. Available for Redis only.
     * </p>
     */
    private String dailySnapshotTime;

    /**
     * <p>
     * The unique identifier of the serverless cache.
     * </p>
     * 
     * @param serverlessCacheName
     *        The unique identifier of the serverless cache.
     */

    public void setServerlessCacheName(String serverlessCacheName) {
        this.serverlessCacheName = serverlessCacheName;
    }

    /**
     * <p>
     * The unique identifier of the serverless cache.
     * </p>
     * 
     * @return The unique identifier of the serverless cache.
     */

    public String getServerlessCacheName() {
        return this.serverlessCacheName;
    }

    /**
     * <p>
     * The unique identifier of the serverless cache.
     * </p>
     * 
     * @param serverlessCacheName
     *        The unique identifier of the serverless cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withServerlessCacheName(String serverlessCacheName) {
        setServerlessCacheName(serverlessCacheName);
        return this;
    }

    /**
     * <p>
     * A description of the serverless cache.
     * </p>
     * 
     * @param description
     *        A description of the serverless cache.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the serverless cache.
     * </p>
     * 
     * @return A description of the serverless cache.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the serverless cache.
     * </p>
     * 
     * @param description
     *        A description of the serverless cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * When the serverless cache was created.
     * </p>
     * 
     * @param createTime
     *        When the serverless cache was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * When the serverless cache was created.
     * </p>
     * 
     * @return When the serverless cache was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * When the serverless cache was created.
     * </p>
     * 
     * @param createTime
     *        When the serverless cache was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The current status of the serverless cache. The allowed values are CREATING, AVAILABLE, DELETING, CREATE-FAILED
     * and MODIFYING.
     * </p>
     * 
     * @param status
     *        The current status of the serverless cache. The allowed values are CREATING, AVAILABLE, DELETING,
     *        CREATE-FAILED and MODIFYING.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the serverless cache. The allowed values are CREATING, AVAILABLE, DELETING, CREATE-FAILED
     * and MODIFYING.
     * </p>
     * 
     * @return The current status of the serverless cache. The allowed values are CREATING, AVAILABLE, DELETING,
     *         CREATE-FAILED and MODIFYING.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the serverless cache. The allowed values are CREATING, AVAILABLE, DELETING, CREATE-FAILED
     * and MODIFYING.
     * </p>
     * 
     * @param status
     *        The current status of the serverless cache. The allowed values are CREATING, AVAILABLE, DELETING,
     *        CREATE-FAILED and MODIFYING.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The engine the serverless cache is compatible with.
     * </p>
     * 
     * @param engine
     *        The engine the serverless cache is compatible with.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The engine the serverless cache is compatible with.
     * </p>
     * 
     * @return The engine the serverless cache is compatible with.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The engine the serverless cache is compatible with.
     * </p>
     * 
     * @param engine
     *        The engine the serverless cache is compatible with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version number of the engine the serverless cache is compatible with.
     * </p>
     * 
     * @param majorEngineVersion
     *        The version number of the engine the serverless cache is compatible with.
     */

    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }

    /**
     * <p>
     * The version number of the engine the serverless cache is compatible with.
     * </p>
     * 
     * @return The version number of the engine the serverless cache is compatible with.
     */

    public String getMajorEngineVersion() {
        return this.majorEngineVersion;
    }

    /**
     * <p>
     * The version number of the engine the serverless cache is compatible with.
     * </p>
     * 
     * @param majorEngineVersion
     *        The version number of the engine the serverless cache is compatible with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withMajorEngineVersion(String majorEngineVersion) {
        setMajorEngineVersion(majorEngineVersion);
        return this;
    }

    /**
     * <p>
     * The name and version number of the engine the serverless cache is compatible with.
     * </p>
     * 
     * @param fullEngineVersion
     *        The name and version number of the engine the serverless cache is compatible with.
     */

    public void setFullEngineVersion(String fullEngineVersion) {
        this.fullEngineVersion = fullEngineVersion;
    }

    /**
     * <p>
     * The name and version number of the engine the serverless cache is compatible with.
     * </p>
     * 
     * @return The name and version number of the engine the serverless cache is compatible with.
     */

    public String getFullEngineVersion() {
        return this.fullEngineVersion;
    }

    /**
     * <p>
     * The name and version number of the engine the serverless cache is compatible with.
     * </p>
     * 
     * @param fullEngineVersion
     *        The name and version number of the engine the serverless cache is compatible with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withFullEngineVersion(String fullEngineVersion) {
        setFullEngineVersion(fullEngineVersion);
        return this;
    }

    /**
     * <p>
     * The cache usage limit for the serverless cache.
     * </p>
     * 
     * @param cacheUsageLimits
     *        The cache usage limit for the serverless cache.
     */

    public void setCacheUsageLimits(CacheUsageLimits cacheUsageLimits) {
        this.cacheUsageLimits = cacheUsageLimits;
    }

    /**
     * <p>
     * The cache usage limit for the serverless cache.
     * </p>
     * 
     * @return The cache usage limit for the serverless cache.
     */

    public CacheUsageLimits getCacheUsageLimits() {
        return this.cacheUsageLimits;
    }

    /**
     * <p>
     * The cache usage limit for the serverless cache.
     * </p>
     * 
     * @param cacheUsageLimits
     *        The cache usage limit for the serverless cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withCacheUsageLimits(CacheUsageLimits cacheUsageLimits) {
        setCacheUsageLimits(cacheUsageLimits);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service (KMS) key that is used to encrypt data at rest in the
     * serverless cache.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the Amazon Web Services Key Management Service (KMS) key that is used to encrypt data at rest in
     *        the serverless cache.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service (KMS) key that is used to encrypt data at rest in the
     * serverless cache.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Key Management Service (KMS) key that is used to encrypt data at rest
     *         in the serverless cache.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service (KMS) key that is used to encrypt data at rest in the
     * serverless cache.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the Amazon Web Services Key Management Service (KMS) key that is used to encrypt data at rest in
     *        the serverless cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The IDs of the EC2 security groups associated with the serverless cache.
     * </p>
     * 
     * @return The IDs of the EC2 security groups associated with the serverless cache.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * The IDs of the EC2 security groups associated with the serverless cache.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the EC2 security groups associated with the serverless cache.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The IDs of the EC2 security groups associated with the serverless cache.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the EC2 security groups associated with the serverless cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the EC2 security groups associated with the serverless cache.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of the EC2 security groups associated with the serverless cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * @param endpoint
     */

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * @return
     */

    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * @param endpoint
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withEndpoint(Endpoint endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * @param readerEndpoint
     */

    public void setReaderEndpoint(Endpoint readerEndpoint) {
        this.readerEndpoint = readerEndpoint;
    }

    /**
     * @return
     */

    public Endpoint getReaderEndpoint() {
        return this.readerEndpoint;
    }

    /**
     * @param readerEndpoint
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withReaderEndpoint(Endpoint readerEndpoint) {
        setReaderEndpoint(readerEndpoint);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the serverless cache.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the serverless cache.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the serverless cache.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the serverless cache.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the serverless cache.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the serverless cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The identifier of the user group associated with the serverless cache. Available for Redis only. Default is NULL.
     * </p>
     * 
     * @param userGroupId
     *        The identifier of the user group associated with the serverless cache. Available for Redis only. Default
     *        is NULL.
     */

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    /**
     * <p>
     * The identifier of the user group associated with the serverless cache. Available for Redis only. Default is NULL.
     * </p>
     * 
     * @return The identifier of the user group associated with the serverless cache. Available for Redis only. Default
     *         is NULL.
     */

    public String getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * <p>
     * The identifier of the user group associated with the serverless cache. Available for Redis only. Default is NULL.
     * </p>
     * 
     * @param userGroupId
     *        The identifier of the user group associated with the serverless cache. Available for Redis only. Default
     *        is NULL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withUserGroupId(String userGroupId) {
        setUserGroupId(userGroupId);
        return this;
    }

    /**
     * <p>
     * If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2 default subnets across
     * AZs in your VPC. For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default subnets
     * across AZs in your default VPC.
     * </p>
     * 
     * @return If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2 default subnets
     *         across AZs in your VPC. For all other Regions, if no subnet IDs are given then ElastiCache will select 3
     *         default subnets across AZs in your default VPC.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2 default subnets across
     * AZs in your VPC. For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default subnets
     * across AZs in your default VPC.
     * </p>
     * 
     * @param subnetIds
     *        If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2 default subnets
     *        across AZs in your VPC. For all other Regions, if no subnet IDs are given then ElastiCache will select 3
     *        default subnets across AZs in your default VPC.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2 default subnets across
     * AZs in your VPC. For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default subnets
     * across AZs in your default VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2 default subnets
     *        across AZs in your VPC. For all other Regions, if no subnet IDs are given then ElastiCache will select 3
     *        default subnets across AZs in your default VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2 default subnets across
     * AZs in your VPC. For all other Regions, if no subnet IDs are given then ElastiCache will select 3 default subnets
     * across AZs in your default VPC.
     * </p>
     * 
     * @param subnetIds
     *        If no subnet IDs are given and your VPC is in us-west-1, then ElastiCache will select 2 default subnets
     *        across AZs in your VPC. For all other Regions, if no subnet IDs are given then ElastiCache will select 3
     *        default subnets across AZs in your default VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The current setting for the number of serverless cache snapshots the system will retain. Available for Redis
     * only.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The current setting for the number of serverless cache snapshots the system will retain. Available for
     *        Redis only.
     */

    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The current setting for the number of serverless cache snapshots the system will retain. Available for Redis
     * only.
     * </p>
     * 
     * @return The current setting for the number of serverless cache snapshots the system will retain. Available for
     *         Redis only.
     */

    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }

    /**
     * <p>
     * The current setting for the number of serverless cache snapshots the system will retain. Available for Redis
     * only.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The current setting for the number of serverless cache snapshots the system will retain. Available for
     *        Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        setSnapshotRetentionLimit(snapshotRetentionLimit);
        return this;
    }

    /**
     * <p>
     * The daily time that a cache snapshot will be created. Default is NULL, i.e. snapshots will not be created at a
     * specific time on a daily basis. Available for Redis only.
     * </p>
     * 
     * @param dailySnapshotTime
     *        The daily time that a cache snapshot will be created. Default is NULL, i.e. snapshots will not be created
     *        at a specific time on a daily basis. Available for Redis only.
     */

    public void setDailySnapshotTime(String dailySnapshotTime) {
        this.dailySnapshotTime = dailySnapshotTime;
    }

    /**
     * <p>
     * The daily time that a cache snapshot will be created. Default is NULL, i.e. snapshots will not be created at a
     * specific time on a daily basis. Available for Redis only.
     * </p>
     * 
     * @return The daily time that a cache snapshot will be created. Default is NULL, i.e. snapshots will not be created
     *         at a specific time on a daily basis. Available for Redis only.
     */

    public String getDailySnapshotTime() {
        return this.dailySnapshotTime;
    }

    /**
     * <p>
     * The daily time that a cache snapshot will be created. Default is NULL, i.e. snapshots will not be created at a
     * specific time on a daily basis. Available for Redis only.
     * </p>
     * 
     * @param dailySnapshotTime
     *        The daily time that a cache snapshot will be created. Default is NULL, i.e. snapshots will not be created
     *        at a specific time on a daily basis. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCache withDailySnapshotTime(String dailySnapshotTime) {
        setDailySnapshotTime(dailySnapshotTime);
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
        if (getServerlessCacheName() != null)
            sb.append("ServerlessCacheName: ").append(getServerlessCacheName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getMajorEngineVersion() != null)
            sb.append("MajorEngineVersion: ").append(getMajorEngineVersion()).append(",");
        if (getFullEngineVersion() != null)
            sb.append("FullEngineVersion: ").append(getFullEngineVersion()).append(",");
        if (getCacheUsageLimits() != null)
            sb.append("CacheUsageLimits: ").append(getCacheUsageLimits()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getReaderEndpoint() != null)
            sb.append("ReaderEndpoint: ").append(getReaderEndpoint()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getUserGroupId() != null)
            sb.append("UserGroupId: ").append(getUserGroupId()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: ").append(getSnapshotRetentionLimit()).append(",");
        if (getDailySnapshotTime() != null)
            sb.append("DailySnapshotTime: ").append(getDailySnapshotTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerlessCache == false)
            return false;
        ServerlessCache other = (ServerlessCache) obj;
        if (other.getServerlessCacheName() == null ^ this.getServerlessCacheName() == null)
            return false;
        if (other.getServerlessCacheName() != null && other.getServerlessCacheName().equals(this.getServerlessCacheName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getMajorEngineVersion() == null ^ this.getMajorEngineVersion() == null)
            return false;
        if (other.getMajorEngineVersion() != null && other.getMajorEngineVersion().equals(this.getMajorEngineVersion()) == false)
            return false;
        if (other.getFullEngineVersion() == null ^ this.getFullEngineVersion() == null)
            return false;
        if (other.getFullEngineVersion() != null && other.getFullEngineVersion().equals(this.getFullEngineVersion()) == false)
            return false;
        if (other.getCacheUsageLimits() == null ^ this.getCacheUsageLimits() == null)
            return false;
        if (other.getCacheUsageLimits() != null && other.getCacheUsageLimits().equals(this.getCacheUsageLimits()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getReaderEndpoint() == null ^ this.getReaderEndpoint() == null)
            return false;
        if (other.getReaderEndpoint() != null && other.getReaderEndpoint().equals(this.getReaderEndpoint()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getUserGroupId() == null ^ this.getUserGroupId() == null)
            return false;
        if (other.getUserGroupId() != null && other.getUserGroupId().equals(this.getUserGroupId()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSnapshotRetentionLimit() == null ^ this.getSnapshotRetentionLimit() == null)
            return false;
        if (other.getSnapshotRetentionLimit() != null && other.getSnapshotRetentionLimit().equals(this.getSnapshotRetentionLimit()) == false)
            return false;
        if (other.getDailySnapshotTime() == null ^ this.getDailySnapshotTime() == null)
            return false;
        if (other.getDailySnapshotTime() != null && other.getDailySnapshotTime().equals(this.getDailySnapshotTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerlessCacheName() == null) ? 0 : getServerlessCacheName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getMajorEngineVersion() == null) ? 0 : getMajorEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getFullEngineVersion() == null) ? 0 : getFullEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getCacheUsageLimits() == null) ? 0 : getCacheUsageLimits().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getReaderEndpoint() == null) ? 0 : getReaderEndpoint().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getUserGroupId() == null) ? 0 : getUserGroupId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode());
        hashCode = prime * hashCode + ((getDailySnapshotTime() == null) ? 0 : getDailySnapshotTime().hashCode());
        return hashCode;
    }

    @Override
    public ServerlessCache clone() {
        try {
            return (ServerlessCache) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
