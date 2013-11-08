/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for AWS ElastiCache.
 */
public enum ElastiCacheActions implements Action {
    /** Represents any action executed on AWS ElastiCache. */
    AllElastiCacheActions("ElastiCache:*"),

    /** Action for the AuthorizeCacheSecurityGroupIngress operation. */
    AuthorizeCacheSecurityGroupIngress("ElastiCache:AuthorizeCacheSecurityGroupIngress"),

    /** Action for the CreateCacheCluster operation. */
    CreateCacheCluster("ElastiCache:CreateCacheCluster"),

    /** Action for the CreateCacheParameterGroup operation. */
    CreateCacheParameterGroup("ElastiCache:CreateCacheParameterGroup"),

    /** Action for the CreateCacheSecurityGroup operation. */
    CreateCacheSecurityGroup("ElastiCache:CreateCacheSecurityGroup"),

    /** Action for the DeleteCacheCluster operation. */
    DeleteCacheCluster("ElastiCache:DeleteCacheCluster"),

    /** Action for the DeleteCacheParameterGroup operation. */
    DeleteCacheParameterGroup("ElastiCache:DeleteCacheParameterGroup"),

    /** Action for the DeleteCacheSecurityGroup operation. */
    DeleteCacheSecurityGroup("ElastiCache:DeleteCacheSecurityGroup"),

    /** Action for the DescribeCacheClusters operation. */
    DescribeCacheClusters("ElastiCache:DescribeCacheClusters"),

    /** Action for the DescribeCacheParameterGroups operation. */
    DescribeCacheParameterGroups("ElastiCache:DescribeCacheParameterGroups"),

    /** Action for the DescribeCacheParameters operation. */
    DescribeCacheParameters("ElastiCache:DescribeCacheParameters"),

    /** Action for the DescribeCacheSecurityGroups operation. */
    DescribeCacheSecurityGroups("ElastiCache:DescribeCacheSecurityGroups"),

    /** Action for the DescribeEngineDefaultParameters operation. */
    DescribeEngineDefaultParameters("ElastiCache:DescribeEngineDefaultParameters"),

    /** Action for the DescribeEvents operation. */
    DescribeEvents("ElastiCache:DescribeEvents"),

    /** Action for the ModifyCacheCluster operation. */
    ModifyCacheCluster("ElastiCache:ModifyCacheCluster"),

    /** Action for the ModifyCacheParameterGroup operation. */
    ModifyCacheParameterGroup("ElastiCache:ModifyCacheParameterGroup"),

    /** Action for the RebootCacheCluster operation. */
    RebootCacheCluster("ElastiCache:RebootCacheCluster"),

    /** Action for the ResetCacheParameterGroup operation. */
    ResetCacheParameterGroup("ElastiCache:ResetCacheParameterGroup"),

    /** Action for the RevokeCacheSecurityGroupIngress operation. */
    RevokeCacheSecurityGroupIngress("ElastiCache:RevokeCacheSecurityGroupIngress");

    private final String action;

    private ElastiCacheActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
