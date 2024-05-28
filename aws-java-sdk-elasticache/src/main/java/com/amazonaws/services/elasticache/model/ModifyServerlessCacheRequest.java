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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyServerlessCache" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyServerlessCacheRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * User-provided identifier for the serverless cache to be modified.
     * </p>
     */
    private String serverlessCacheName;
    /**
     * <p>
     * User provided description for the serverless cache. Default = NULL, i.e. the existing description is not
     * removed/modified. The description has a maximum length of 255 characters.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Modify the cache usage limit for the serverless cache.
     * </p>
     */
    private CacheUsageLimits cacheUsageLimits;
    /**
     * <p>
     * The identifier of the UserGroup to be removed from association with the Redis serverless cache. Available for
     * Redis only. Default is NULL.
     * </p>
     */
    private Boolean removeUserGroup;
    /**
     * <p>
     * The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is
     * NULL - the existing UserGroup is not removed.
     * </p>
     */
    private String userGroupId;
    /**
     * <p>
     * The new list of VPC security groups to be associated with the serverless cache. Populating this list means the
     * current VPC security groups will be removed. This security group is used to authorize traffic access for the VPC
     * end-point (private-link). Default = NULL - the existing list of VPC security groups is not removed.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * The number of days for which Elasticache retains automatic snapshots before deleting them. Available for Redis
     * only. Default = NULL, i.e. the existing snapshot-retention-limit will not be removed or modified. The maximum
     * value allowed is 35 days.
     * </p>
     */
    private Integer snapshotRetentionLimit;
    /**
     * <p>
     * The daily time during which Elasticache begins taking a daily snapshot of the serverless cache. Available for
     * Redis only. The default is NULL, i.e. the existing snapshot time configured for the cluster is not removed.
     * </p>
     */
    private String dailySnapshotTime;

    /**
     * <p>
     * User-provided identifier for the serverless cache to be modified.
     * </p>
     * 
     * @param serverlessCacheName
     *        User-provided identifier for the serverless cache to be modified.
     */

    public void setServerlessCacheName(String serverlessCacheName) {
        this.serverlessCacheName = serverlessCacheName;
    }

    /**
     * <p>
     * User-provided identifier for the serverless cache to be modified.
     * </p>
     * 
     * @return User-provided identifier for the serverless cache to be modified.
     */

    public String getServerlessCacheName() {
        return this.serverlessCacheName;
    }

    /**
     * <p>
     * User-provided identifier for the serverless cache to be modified.
     * </p>
     * 
     * @param serverlessCacheName
     *        User-provided identifier for the serverless cache to be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyServerlessCacheRequest withServerlessCacheName(String serverlessCacheName) {
        setServerlessCacheName(serverlessCacheName);
        return this;
    }

    /**
     * <p>
     * User provided description for the serverless cache. Default = NULL, i.e. the existing description is not
     * removed/modified. The description has a maximum length of 255 characters.
     * </p>
     * 
     * @param description
     *        User provided description for the serverless cache. Default = NULL, i.e. the existing description is not
     *        removed/modified. The description has a maximum length of 255 characters.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * User provided description for the serverless cache. Default = NULL, i.e. the existing description is not
     * removed/modified. The description has a maximum length of 255 characters.
     * </p>
     * 
     * @return User provided description for the serverless cache. Default = NULL, i.e. the existing description is not
     *         removed/modified. The description has a maximum length of 255 characters.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * User provided description for the serverless cache. Default = NULL, i.e. the existing description is not
     * removed/modified. The description has a maximum length of 255 characters.
     * </p>
     * 
     * @param description
     *        User provided description for the serverless cache. Default = NULL, i.e. the existing description is not
     *        removed/modified. The description has a maximum length of 255 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyServerlessCacheRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Modify the cache usage limit for the serverless cache.
     * </p>
     * 
     * @param cacheUsageLimits
     *        Modify the cache usage limit for the serverless cache.
     */

    public void setCacheUsageLimits(CacheUsageLimits cacheUsageLimits) {
        this.cacheUsageLimits = cacheUsageLimits;
    }

    /**
     * <p>
     * Modify the cache usage limit for the serverless cache.
     * </p>
     * 
     * @return Modify the cache usage limit for the serverless cache.
     */

    public CacheUsageLimits getCacheUsageLimits() {
        return this.cacheUsageLimits;
    }

    /**
     * <p>
     * Modify the cache usage limit for the serverless cache.
     * </p>
     * 
     * @param cacheUsageLimits
     *        Modify the cache usage limit for the serverless cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyServerlessCacheRequest withCacheUsageLimits(CacheUsageLimits cacheUsageLimits) {
        setCacheUsageLimits(cacheUsageLimits);
        return this;
    }

    /**
     * <p>
     * The identifier of the UserGroup to be removed from association with the Redis serverless cache. Available for
     * Redis only. Default is NULL.
     * </p>
     * 
     * @param removeUserGroup
     *        The identifier of the UserGroup to be removed from association with the Redis serverless cache. Available
     *        for Redis only. Default is NULL.
     */

    public void setRemoveUserGroup(Boolean removeUserGroup) {
        this.removeUserGroup = removeUserGroup;
    }

    /**
     * <p>
     * The identifier of the UserGroup to be removed from association with the Redis serverless cache. Available for
     * Redis only. Default is NULL.
     * </p>
     * 
     * @return The identifier of the UserGroup to be removed from association with the Redis serverless cache. Available
     *         for Redis only. Default is NULL.
     */

    public Boolean getRemoveUserGroup() {
        return this.removeUserGroup;
    }

    /**
     * <p>
     * The identifier of the UserGroup to be removed from association with the Redis serverless cache. Available for
     * Redis only. Default is NULL.
     * </p>
     * 
     * @param removeUserGroup
     *        The identifier of the UserGroup to be removed from association with the Redis serverless cache. Available
     *        for Redis only. Default is NULL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyServerlessCacheRequest withRemoveUserGroup(Boolean removeUserGroup) {
        setRemoveUserGroup(removeUserGroup);
        return this;
    }

    /**
     * <p>
     * The identifier of the UserGroup to be removed from association with the Redis serverless cache. Available for
     * Redis only. Default is NULL.
     * </p>
     * 
     * @return The identifier of the UserGroup to be removed from association with the Redis serverless cache. Available
     *         for Redis only. Default is NULL.
     */

    public Boolean isRemoveUserGroup() {
        return this.removeUserGroup;
    }

    /**
     * <p>
     * The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is
     * NULL - the existing UserGroup is not removed.
     * </p>
     * 
     * @param userGroupId
     *        The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only.
     *        Default is NULL - the existing UserGroup is not removed.
     */

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    /**
     * <p>
     * The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is
     * NULL - the existing UserGroup is not removed.
     * </p>
     * 
     * @return The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only.
     *         Default is NULL - the existing UserGroup is not removed.
     */

    public String getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * <p>
     * The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only. Default is
     * NULL - the existing UserGroup is not removed.
     * </p>
     * 
     * @param userGroupId
     *        The identifier of the UserGroup to be associated with the serverless cache. Available for Redis only.
     *        Default is NULL - the existing UserGroup is not removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyServerlessCacheRequest withUserGroupId(String userGroupId) {
        setUserGroupId(userGroupId);
        return this;
    }

    /**
     * <p>
     * The new list of VPC security groups to be associated with the serverless cache. Populating this list means the
     * current VPC security groups will be removed. This security group is used to authorize traffic access for the VPC
     * end-point (private-link). Default = NULL - the existing list of VPC security groups is not removed.
     * </p>
     * 
     * @return The new list of VPC security groups to be associated with the serverless cache. Populating this list
     *         means the current VPC security groups will be removed. This security group is used to authorize traffic
     *         access for the VPC end-point (private-link). Default = NULL - the existing list of VPC security groups is
     *         not removed.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * The new list of VPC security groups to be associated with the serverless cache. Populating this list means the
     * current VPC security groups will be removed. This security group is used to authorize traffic access for the VPC
     * end-point (private-link). Default = NULL - the existing list of VPC security groups is not removed.
     * </p>
     * 
     * @param securityGroupIds
     *        The new list of VPC security groups to be associated with the serverless cache. Populating this list means
     *        the current VPC security groups will be removed. This security group is used to authorize traffic access
     *        for the VPC end-point (private-link). Default = NULL - the existing list of VPC security groups is not
     *        removed.
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
     * The new list of VPC security groups to be associated with the serverless cache. Populating this list means the
     * current VPC security groups will be removed. This security group is used to authorize traffic access for the VPC
     * end-point (private-link). Default = NULL - the existing list of VPC security groups is not removed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The new list of VPC security groups to be associated with the serverless cache. Populating this list means
     *        the current VPC security groups will be removed. This security group is used to authorize traffic access
     *        for the VPC end-point (private-link). Default = NULL - the existing list of VPC security groups is not
     *        removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyServerlessCacheRequest withSecurityGroupIds(String... securityGroupIds) {
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
     * The new list of VPC security groups to be associated with the serverless cache. Populating this list means the
     * current VPC security groups will be removed. This security group is used to authorize traffic access for the VPC
     * end-point (private-link). Default = NULL - the existing list of VPC security groups is not removed.
     * </p>
     * 
     * @param securityGroupIds
     *        The new list of VPC security groups to be associated with the serverless cache. Populating this list means
     *        the current VPC security groups will be removed. This security group is used to authorize traffic access
     *        for the VPC end-point (private-link). Default = NULL - the existing list of VPC security groups is not
     *        removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyServerlessCacheRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The number of days for which Elasticache retains automatic snapshots before deleting them. Available for Redis
     * only. Default = NULL, i.e. the existing snapshot-retention-limit will not be removed or modified. The maximum
     * value allowed is 35 days.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which Elasticache retains automatic snapshots before deleting them. Available for
     *        Redis only. Default = NULL, i.e. the existing snapshot-retention-limit will not be removed or modified.
     *        The maximum value allowed is 35 days.
     */

    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which Elasticache retains automatic snapshots before deleting them. Available for Redis
     * only. Default = NULL, i.e. the existing snapshot-retention-limit will not be removed or modified. The maximum
     * value allowed is 35 days.
     * </p>
     * 
     * @return The number of days for which Elasticache retains automatic snapshots before deleting them. Available for
     *         Redis only. Default = NULL, i.e. the existing snapshot-retention-limit will not be removed or modified.
     *         The maximum value allowed is 35 days.
     */

    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }

    /**
     * <p>
     * The number of days for which Elasticache retains automatic snapshots before deleting them. Available for Redis
     * only. Default = NULL, i.e. the existing snapshot-retention-limit will not be removed or modified. The maximum
     * value allowed is 35 days.
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The number of days for which Elasticache retains automatic snapshots before deleting them. Available for
     *        Redis only. Default = NULL, i.e. the existing snapshot-retention-limit will not be removed or modified.
     *        The maximum value allowed is 35 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyServerlessCacheRequest withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        setSnapshotRetentionLimit(snapshotRetentionLimit);
        return this;
    }

    /**
     * <p>
     * The daily time during which Elasticache begins taking a daily snapshot of the serverless cache. Available for
     * Redis only. The default is NULL, i.e. the existing snapshot time configured for the cluster is not removed.
     * </p>
     * 
     * @param dailySnapshotTime
     *        The daily time during which Elasticache begins taking a daily snapshot of the serverless cache. Available
     *        for Redis only. The default is NULL, i.e. the existing snapshot time configured for the cluster is not
     *        removed.
     */

    public void setDailySnapshotTime(String dailySnapshotTime) {
        this.dailySnapshotTime = dailySnapshotTime;
    }

    /**
     * <p>
     * The daily time during which Elasticache begins taking a daily snapshot of the serverless cache. Available for
     * Redis only. The default is NULL, i.e. the existing snapshot time configured for the cluster is not removed.
     * </p>
     * 
     * @return The daily time during which Elasticache begins taking a daily snapshot of the serverless cache. Available
     *         for Redis only. The default is NULL, i.e. the existing snapshot time configured for the cluster is not
     *         removed.
     */

    public String getDailySnapshotTime() {
        return this.dailySnapshotTime;
    }

    /**
     * <p>
     * The daily time during which Elasticache begins taking a daily snapshot of the serverless cache. Available for
     * Redis only. The default is NULL, i.e. the existing snapshot time configured for the cluster is not removed.
     * </p>
     * 
     * @param dailySnapshotTime
     *        The daily time during which Elasticache begins taking a daily snapshot of the serverless cache. Available
     *        for Redis only. The default is NULL, i.e. the existing snapshot time configured for the cluster is not
     *        removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyServerlessCacheRequest withDailySnapshotTime(String dailySnapshotTime) {
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
        if (getCacheUsageLimits() != null)
            sb.append("CacheUsageLimits: ").append(getCacheUsageLimits()).append(",");
        if (getRemoveUserGroup() != null)
            sb.append("RemoveUserGroup: ").append(getRemoveUserGroup()).append(",");
        if (getUserGroupId() != null)
            sb.append("UserGroupId: ").append(getUserGroupId()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
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

        if (obj instanceof ModifyServerlessCacheRequest == false)
            return false;
        ModifyServerlessCacheRequest other = (ModifyServerlessCacheRequest) obj;
        if (other.getServerlessCacheName() == null ^ this.getServerlessCacheName() == null)
            return false;
        if (other.getServerlessCacheName() != null && other.getServerlessCacheName().equals(this.getServerlessCacheName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCacheUsageLimits() == null ^ this.getCacheUsageLimits() == null)
            return false;
        if (other.getCacheUsageLimits() != null && other.getCacheUsageLimits().equals(this.getCacheUsageLimits()) == false)
            return false;
        if (other.getRemoveUserGroup() == null ^ this.getRemoveUserGroup() == null)
            return false;
        if (other.getRemoveUserGroup() != null && other.getRemoveUserGroup().equals(this.getRemoveUserGroup()) == false)
            return false;
        if (other.getUserGroupId() == null ^ this.getUserGroupId() == null)
            return false;
        if (other.getUserGroupId() != null && other.getUserGroupId().equals(this.getUserGroupId()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
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
        hashCode = prime * hashCode + ((getCacheUsageLimits() == null) ? 0 : getCacheUsageLimits().hashCode());
        hashCode = prime * hashCode + ((getRemoveUserGroup() == null) ? 0 : getRemoveUserGroup().hashCode());
        hashCode = prime * hashCode + ((getUserGroupId() == null) ? 0 : getUserGroupId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode());
        hashCode = prime * hashCode + ((getDailySnapshotTime() == null) ? 0 : getDailySnapshotTime().hashCode());
        return hashCode;
    }

    @Override
    public ModifyServerlessCacheRequest clone() {
        return (ModifyServerlessCacheRequest) super.clone();
    }

}
