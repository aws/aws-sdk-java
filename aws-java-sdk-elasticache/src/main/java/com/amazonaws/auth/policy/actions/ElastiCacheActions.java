/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
    AllElastiCacheActions("elasticache:*"),

    /** Action for the AuthorizeCacheSecurityGroupIngress operation. */
    AuthorizeCacheSecurityGroupIngress("elasticache:AuthorizeCacheSecurityGroupIngress"),

    /** Action for the CreateCacheCluster operation. */
    CreateCacheCluster("elasticache:CreateCacheCluster"),

    /** Action for the CreateCacheParameterGroup operation. */
    CreateCacheParameterGroup("elasticache:CreateCacheParameterGroup"),

    /** Action for the CreateCacheSecurityGroup operation. */
    CreateCacheSecurityGroup("elasticache:CreateCacheSecurityGroup"),

    /** Action for the DeleteCacheCluster operation. */
    DeleteCacheCluster("elasticache:DeleteCacheCluster"),

    /** Action for the DeleteCacheParameterGroup operation. */
    DeleteCacheParameterGroup("elasticache:DeleteCacheParameterGroup"),

    /** Action for the DeleteCacheSecurityGroup operation. */
    DeleteCacheSecurityGroup("elasticache:DeleteCacheSecurityGroup"),

    /** Action for the DescribeCacheClusters operation. */
    DescribeCacheClusters("elasticache:DescribeCacheClusters"),

    /** Action for the DescribeCacheParameterGroups operation. */
    DescribeCacheParameterGroups("elasticache:DescribeCacheParameterGroups"),

    /** Action for the DescribeCacheParameters operation. */
    DescribeCacheParameters("elasticache:DescribeCacheParameters"),

    /** Action for the DescribeCacheSecurityGroups operation. */
    DescribeCacheSecurityGroups("elasticache:DescribeCacheSecurityGroups"),

    /** Action for the DescribeEngineDefaultParameters operation. */
    DescribeEngineDefaultParameters("elasticache:DescribeEngineDefaultParameters"),

    /** Action for the DescribeEvents operation. */
    DescribeEvents("elasticache:DescribeEvents"),

    /** Action for the ModifyCacheCluster operation. */
    ModifyCacheCluster("elasticache:ModifyCacheCluster"),

    /** Action for the ModifyCacheParameterGroup operation. */
    ModifyCacheParameterGroup("elasticache:ModifyCacheParameterGroup"),

    /** Action for the RebootCacheCluster operation. */
    RebootCacheCluster("elasticache:RebootCacheCluster"),

    /** Action for the ResetCacheParameterGroup operation. */
    ResetCacheParameterGroup("elasticache:ResetCacheParameterGroup"),

    /** Action for the RevokeCacheSecurityGroupIngress operation. */
    RevokeCacheSecurityGroupIngress("elasticache:RevokeCacheSecurityGroupIngress");

    private final String action;

    private ElastiCacheActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
