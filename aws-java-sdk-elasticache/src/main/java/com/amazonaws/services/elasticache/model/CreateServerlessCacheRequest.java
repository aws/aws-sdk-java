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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateServerlessCache" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServerlessCacheRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * User-provided identifier for the serverless cache. This parameter is stored as a lowercase string.
     * </p>
     */
    private String serverlessCacheName;
    /**
     * <p>
     * User-provided description for the serverless cache. The default is NULL, i.e. if no description is provided then
     * an empty string will be returned. The maximum length is 255 characters.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the cache engine to be used for creating the serverless cache.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version of the cache engine that will be used to create the serverless cache.
     * </p>
     */
    private String majorEngineVersion;
    /**
     * <p>
     * Sets the cache usage limits for storage and ElastiCache Processing Units for the cache.
     * </p>
     */
    private CacheUsageLimits cacheUsageLimits;
    /**
     * <p>
     * ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default service key
     * is used.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A list of the one or more VPC security groups to be associated with the serverless cache. The security group will
     * authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the
     * VPC’s Default Security Group that is associated with the cluster VPC end-point.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * The ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> snapshotArnsToRestore;
    /**
     * <p>
     * The list of tags (key, value) pairs to be added to the serverless cache resource. Default is NULL.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is
     * NULL.
     * </p>
     */
    private String userGroupId;
    /**
     * <p>
     * A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All
     * the subnetIds must belong to the same VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;
    /**
     * <p>
     * The number of snapshots that will be retained for the serverless cache that is being created. As new snapshots
     * beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available for Redis only.
     * </p>
     */
    private Integer snapshotRetentionLimit;
    /**
     * <p>
     * The daily time that snapshots will be created from the new serverless cache. By default this number is populated
     * with 0, i.e. no snapshots will be created on an automatic daily basis. Available for Redis only.
     * </p>
     */
    private String dailySnapshotTime;

    /**
     * <p>
     * User-provided identifier for the serverless cache. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param serverlessCacheName
     *        User-provided identifier for the serverless cache. This parameter is stored as a lowercase string.
     */

    public void setServerlessCacheName(String serverlessCacheName) {
        this.serverlessCacheName = serverlessCacheName;
    }

    /**
     * <p>
     * User-provided identifier for the serverless cache. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @return User-provided identifier for the serverless cache. This parameter is stored as a lowercase string.
     */

    public String getServerlessCacheName() {
        return this.serverlessCacheName;
    }

    /**
     * <p>
     * User-provided identifier for the serverless cache. This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param serverlessCacheName
     *        User-provided identifier for the serverless cache. This parameter is stored as a lowercase string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withServerlessCacheName(String serverlessCacheName) {
        setServerlessCacheName(serverlessCacheName);
        return this;
    }

    /**
     * <p>
     * User-provided description for the serverless cache. The default is NULL, i.e. if no description is provided then
     * an empty string will be returned. The maximum length is 255 characters.
     * </p>
     * 
     * @param description
     *        User-provided description for the serverless cache. The default is NULL, i.e. if no description is
     *        provided then an empty string will be returned. The maximum length is 255 characters.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * User-provided description for the serverless cache. The default is NULL, i.e. if no description is provided then
     * an empty string will be returned. The maximum length is 255 characters.
     * </p>
     * 
     * @return User-provided description for the serverless cache. The default is NULL, i.e. if no description is
     *         provided then an empty string will be returned. The maximum length is 255 characters.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * User-provided description for the serverless cache. The default is NULL, i.e. if no description is provided then
     * an empty string will be returned. The maximum length is 255 characters.
     * </p>
     * 
     * @param description
     *        User-provided description for the serverless cache. The default is NULL, i.e. if no description is
     *        provided then an empty string will be returned. The maximum length is 255 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the cache engine to be used for creating the serverless cache.
     * </p>
     * 
     * @param engine
     *        The name of the cache engine to be used for creating the serverless cache.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the cache engine to be used for creating the serverless cache.
     * </p>
     * 
     * @return The name of the cache engine to be used for creating the serverless cache.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the cache engine to be used for creating the serverless cache.
     * </p>
     * 
     * @param engine
     *        The name of the cache engine to be used for creating the serverless cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version of the cache engine that will be used to create the serverless cache.
     * </p>
     * 
     * @param majorEngineVersion
     *        The version of the cache engine that will be used to create the serverless cache.
     */

    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }

    /**
     * <p>
     * The version of the cache engine that will be used to create the serverless cache.
     * </p>
     * 
     * @return The version of the cache engine that will be used to create the serverless cache.
     */

    public String getMajorEngineVersion() {
        return this.majorEngineVersion;
    }

    /**
     * <p>
     * The version of the cache engine that will be used to create the serverless cache.
     * </p>
     * 
     * @param majorEngineVersion
     *        The version of the cache engine that will be used to create the serverless cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withMajorEngineVersion(String majorEngineVersion) {
        setMajorEngineVersion(majorEngineVersion);
        return this;
    }

    /**
     * <p>
     * Sets the cache usage limits for storage and ElastiCache Processing Units for the cache.
     * </p>
     * 
     * @param cacheUsageLimits
     *        Sets the cache usage limits for storage and ElastiCache Processing Units for the cache.
     */

    public void setCacheUsageLimits(CacheUsageLimits cacheUsageLimits) {
        this.cacheUsageLimits = cacheUsageLimits;
    }

    /**
     * <p>
     * Sets the cache usage limits for storage and ElastiCache Processing Units for the cache.
     * </p>
     * 
     * @return Sets the cache usage limits for storage and ElastiCache Processing Units for the cache.
     */

    public CacheUsageLimits getCacheUsageLimits() {
        return this.cacheUsageLimits;
    }

    /**
     * <p>
     * Sets the cache usage limits for storage and ElastiCache Processing Units for the cache.
     * </p>
     * 
     * @param cacheUsageLimits
     *        Sets the cache usage limits for storage and ElastiCache Processing Units for the cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withCacheUsageLimits(CacheUsageLimits cacheUsageLimits) {
        setCacheUsageLimits(cacheUsageLimits);
        return this;
    }

    /**
     * <p>
     * ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default service key
     * is used.
     * </p>
     * 
     * @param kmsKeyId
     *        ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default
     *        service key is used.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default service key
     * is used.
     * </p>
     * 
     * @return ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default
     *         service key is used.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default service key
     * is used.
     * </p>
     * 
     * @param kmsKeyId
     *        ARN of the customer managed key for encrypting the data at rest. If no KMS key is provided, a default
     *        service key is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A list of the one or more VPC security groups to be associated with the serverless cache. The security group will
     * authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the
     * VPC’s Default Security Group that is associated with the cluster VPC end-point.
     * </p>
     * 
     * @return A list of the one or more VPC security groups to be associated with the serverless cache. The security
     *         group will authorize traffic access for the VPC end-point (private-link). If no other information is
     *         given this will be the VPC’s Default Security Group that is associated with the cluster VPC end-point.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of the one or more VPC security groups to be associated with the serverless cache. The security group will
     * authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the
     * VPC’s Default Security Group that is associated with the cluster VPC end-point.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of the one or more VPC security groups to be associated with the serverless cache. The security
     *        group will authorize traffic access for the VPC end-point (private-link). If no other information is given
     *        this will be the VPC’s Default Security Group that is associated with the cluster VPC end-point.
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
     * A list of the one or more VPC security groups to be associated with the serverless cache. The security group will
     * authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the
     * VPC’s Default Security Group that is associated with the cluster VPC end-point.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of the one or more VPC security groups to be associated with the serverless cache. The security
     *        group will authorize traffic access for the VPC end-point (private-link). If no other information is given
     *        this will be the VPC’s Default Security Group that is associated with the cluster VPC end-point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * A list of the one or more VPC security groups to be associated with the serverless cache. The security group will
     * authorize traffic access for the VPC end-point (private-link). If no other information is given this will be the
     * VPC’s Default Security Group that is associated with the cluster VPC end-point.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of the one or more VPC security groups to be associated with the serverless cache. The security
     *        group will authorize traffic access for the VPC end-point (private-link). If no other information is given
     *        this will be the VPC’s Default Security Group that is associated with the cluster VPC end-point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
     * </p>
     * 
     * @return The ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
     */

    public java.util.List<String> getSnapshotArnsToRestore() {
        if (snapshotArnsToRestore == null) {
            snapshotArnsToRestore = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return snapshotArnsToRestore;
    }

    /**
     * <p>
     * The ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
     * </p>
     * 
     * @param snapshotArnsToRestore
     *        The ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
     */

    public void setSnapshotArnsToRestore(java.util.Collection<String> snapshotArnsToRestore) {
        if (snapshotArnsToRestore == null) {
            this.snapshotArnsToRestore = null;
            return;
        }

        this.snapshotArnsToRestore = new com.amazonaws.internal.SdkInternalList<String>(snapshotArnsToRestore);
    }

    /**
     * <p>
     * The ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotArnsToRestore(java.util.Collection)} or
     * {@link #withSnapshotArnsToRestore(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param snapshotArnsToRestore
     *        The ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withSnapshotArnsToRestore(String... snapshotArnsToRestore) {
        if (this.snapshotArnsToRestore == null) {
            setSnapshotArnsToRestore(new com.amazonaws.internal.SdkInternalList<String>(snapshotArnsToRestore.length));
        }
        for (String ele : snapshotArnsToRestore) {
            this.snapshotArnsToRestore.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
     * </p>
     * 
     * @param snapshotArnsToRestore
     *        The ARN(s) of the snapshot that the new serverless cache will be created from. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withSnapshotArnsToRestore(java.util.Collection<String> snapshotArnsToRestore) {
        setSnapshotArnsToRestore(snapshotArnsToRestore);
        return this;
    }

    /**
     * <p>
     * The list of tags (key, value) pairs to be added to the serverless cache resource. Default is NULL.
     * </p>
     * 
     * @return The list of tags (key, value) pairs to be added to the serverless cache resource. Default is NULL.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tags (key, value) pairs to be added to the serverless cache resource. Default is NULL.
     * </p>
     * 
     * @param tags
     *        The list of tags (key, value) pairs to be added to the serverless cache resource. Default is NULL.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags (key, value) pairs to be added to the serverless cache resource. Default is NULL.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags (key, value) pairs to be added to the serverless cache resource. Default is NULL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags (key, value) pairs to be added to the serverless cache resource. Default is NULL.
     * </p>
     * 
     * @param tags
     *        The list of tags (key, value) pairs to be added to the serverless cache resource. Default is NULL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is
     * NULL.
     * </p>
     * 
     * @param userGroupId
     *        The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only.
     *        Default is NULL.
     */

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    /**
     * <p>
     * The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is
     * NULL.
     * </p>
     * 
     * @return The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only.
     *         Default is NULL.
     */

    public String getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * <p>
     * The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is
     * NULL.
     * </p>
     * 
     * @param userGroupId
     *        The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only.
     *        Default is NULL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withUserGroupId(String userGroupId) {
        setUserGroupId(userGroupId);
        return this;
    }

    /**
     * <p>
     * A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All
     * the subnetIds must belong to the same VPC.
     * </p>
     * 
     * @return A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be
     *         deployed. All the subnetIds must belong to the same VPC.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All
     * the subnetIds must belong to the same VPC.
     * </p>
     * 
     * @param subnetIds
     *        A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed.
     *        All the subnetIds must belong to the same VPC.
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
     * A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All
     * the subnetIds must belong to the same VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed.
     *        All the subnetIds must belong to the same VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withSubnetIds(String... subnetIds) {
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
     * A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed. All
     * the subnetIds must belong to the same VPC.
     * </p>
     * 
     * @param subnetIds
     *        A list of the identifiers of the subnets where the VPC endpoint for the serverless cache will be deployed.
     *        All the subnetIds must belong to the same VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The number of snapshots that will be retained for the serverless cache that is being created. As new snapshots
     * beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available for Redis only.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of snapshots that will be retained for the serverless cache that is being created. As new
     *        snapshots beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available
     *        for Redis only.
     */

    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of snapshots that will be retained for the serverless cache that is being created. As new snapshots
     * beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available for Redis only.
     * </p>
     * 
     * @return The number of snapshots that will be retained for the serverless cache that is being created. As new
     *         snapshots beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available
     *         for Redis only.
     */

    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of snapshots that will be retained for the serverless cache that is being created. As new snapshots
     * beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available for Redis only.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of snapshots that will be retained for the serverless cache that is being created. As new
     *        snapshots beyond this limit are added, the oldest snapshots will be deleted on a rolling basis. Available
     *        for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        setSnapshotRetentionLimit(snapshotRetentionLimit);
        return this;
    }

    /**
     * <p>
     * The daily time that snapshots will be created from the new serverless cache. By default this number is populated
     * with 0, i.e. no snapshots will be created on an automatic daily basis. Available for Redis only.
     * </p>
     * 
     * @param dailySnapshotTime
     *        The daily time that snapshots will be created from the new serverless cache. By default this number is
     *        populated with 0, i.e. no snapshots will be created on an automatic daily basis. Available for Redis only.
     */

    public void setDailySnapshotTime(String dailySnapshotTime) {
        this.dailySnapshotTime = dailySnapshotTime;
    }

    /**
     * <p>
     * The daily time that snapshots will be created from the new serverless cache. By default this number is populated
     * with 0, i.e. no snapshots will be created on an automatic daily basis. Available for Redis only.
     * </p>
     * 
     * @return The daily time that snapshots will be created from the new serverless cache. By default this number is
     *         populated with 0, i.e. no snapshots will be created on an automatic daily basis. Available for Redis
     *         only.
     */

    public String getDailySnapshotTime() {
        return this.dailySnapshotTime;
    }

    /**
     * <p>
     * The daily time that snapshots will be created from the new serverless cache. By default this number is populated
     * with 0, i.e. no snapshots will be created on an automatic daily basis. Available for Redis only.
     * </p>
     * 
     * @param dailySnapshotTime
     *        The daily time that snapshots will be created from the new serverless cache. By default this number is
     *        populated with 0, i.e. no snapshots will be created on an automatic daily basis. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServerlessCacheRequest withDailySnapshotTime(String dailySnapshotTime) {
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
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getMajorEngineVersion() != null)
            sb.append("MajorEngineVersion: ").append(getMajorEngineVersion()).append(",");
        if (getCacheUsageLimits() != null)
            sb.append("CacheUsageLimits: ").append(getCacheUsageLimits()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSnapshotArnsToRestore() != null)
            sb.append("SnapshotArnsToRestore: ").append(getSnapshotArnsToRestore()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateServerlessCacheRequest == false)
            return false;
        CreateServerlessCacheRequest other = (CreateServerlessCacheRequest) obj;
        if (other.getServerlessCacheName() == null ^ this.getServerlessCacheName() == null)
            return false;
        if (other.getServerlessCacheName() != null && other.getServerlessCacheName().equals(this.getServerlessCacheName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getMajorEngineVersion() == null ^ this.getMajorEngineVersion() == null)
            return false;
        if (other.getMajorEngineVersion() != null && other.getMajorEngineVersion().equals(this.getMajorEngineVersion()) == false)
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
        if (other.getSnapshotArnsToRestore() == null ^ this.getSnapshotArnsToRestore() == null)
            return false;
        if (other.getSnapshotArnsToRestore() != null && other.getSnapshotArnsToRestore().equals(this.getSnapshotArnsToRestore()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getMajorEngineVersion() == null) ? 0 : getMajorEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getCacheUsageLimits() == null) ? 0 : getCacheUsageLimits().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSnapshotArnsToRestore() == null) ? 0 : getSnapshotArnsToRestore().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUserGroupId() == null) ? 0 : getUserGroupId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode());
        hashCode = prime * hashCode + ((getDailySnapshotTime() == null) ? 0 : getDailySnapshotTime().hashCode());
        return hashCode;
    }

    @Override
    public CreateServerlessCacheRequest clone() {
        return (CreateServerlessCacheRequest) super.clone();
    }

}
