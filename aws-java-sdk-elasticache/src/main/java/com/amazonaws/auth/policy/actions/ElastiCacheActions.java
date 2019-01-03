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
package com.amazonaws.auth.policy.actions;

import javax.annotation.Generated;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Amazon ElastiCache.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ElastiCacheActions implements Action {

    /** Represents any action executed on Amazon ElastiCache. */
    AllElastiCacheActions("elasticache:*"),

    /** Action for the AddTagsToResource operation. */
    AddTagsToResource("elasticache:AddTagsToResource"),
    /** Action for the AuthorizeCacheSecurityGroupIngress operation. */
    AuthorizeCacheSecurityGroupIngress("elasticache:AuthorizeCacheSecurityGroupIngress"),
    /** Action for the CopySnapshot operation. */
    CopySnapshot("elasticache:CopySnapshot"),
    /** Action for the CreateCacheCluster operation. */
    CreateCacheCluster("elasticache:CreateCacheCluster"),
    /** Action for the CreateCacheParameterGroup operation. */
    CreateCacheParameterGroup("elasticache:CreateCacheParameterGroup"),
    /** Action for the CreateCacheSecurityGroup operation. */
    CreateCacheSecurityGroup("elasticache:CreateCacheSecurityGroup"),
    /** Action for the CreateCacheSubnetGroup operation. */
    CreateCacheSubnetGroup("elasticache:CreateCacheSubnetGroup"),
    /** Action for the CreateReplicationGroup operation. */
    CreateReplicationGroup("elasticache:CreateReplicationGroup"),
    /** Action for the CreateSnapshot operation. */
    CreateSnapshot("elasticache:CreateSnapshot"),
    /** Action for the DecreaseReplicaCount operation. */
    DecreaseReplicaCount("elasticache:DecreaseReplicaCount"),
    /** Action for the DeleteCacheCluster operation. */
    DeleteCacheCluster("elasticache:DeleteCacheCluster"),
    /** Action for the DeleteCacheParameterGroup operation. */
    DeleteCacheParameterGroup("elasticache:DeleteCacheParameterGroup"),
    /** Action for the DeleteCacheSecurityGroup operation. */
    DeleteCacheSecurityGroup("elasticache:DeleteCacheSecurityGroup"),
    /** Action for the DeleteCacheSubnetGroup operation. */
    DeleteCacheSubnetGroup("elasticache:DeleteCacheSubnetGroup"),
    /** Action for the DeleteReplicationGroup operation. */
    DeleteReplicationGroup("elasticache:DeleteReplicationGroup"),
    /** Action for the DeleteSnapshot operation. */
    DeleteSnapshot("elasticache:DeleteSnapshot"),
    /** Action for the DescribeCacheClusters operation. */
    DescribeCacheClusters("elasticache:DescribeCacheClusters"),
    /** Action for the DescribeCacheEngineVersions operation. */
    DescribeCacheEngineVersions("elasticache:DescribeCacheEngineVersions"),
    /** Action for the DescribeCacheParameterGroups operation. */
    DescribeCacheParameterGroups("elasticache:DescribeCacheParameterGroups"),
    /** Action for the DescribeCacheParameters operation. */
    DescribeCacheParameters("elasticache:DescribeCacheParameters"),
    /** Action for the DescribeCacheSecurityGroups operation. */
    DescribeCacheSecurityGroups("elasticache:DescribeCacheSecurityGroups"),
    /** Action for the DescribeCacheSubnetGroups operation. */
    DescribeCacheSubnetGroups("elasticache:DescribeCacheSubnetGroups"),
    /** Action for the DescribeEngineDefaultParameters operation. */
    DescribeEngineDefaultParameters("elasticache:DescribeEngineDefaultParameters"),
    /** Action for the DescribeEvents operation. */
    DescribeEvents("elasticache:DescribeEvents"),
    /** Action for the DescribeReplicationGroups operation. */
    DescribeReplicationGroups("elasticache:DescribeReplicationGroups"),
    /** Action for the DescribeReservedCacheNodes operation. */
    DescribeReservedCacheNodes("elasticache:DescribeReservedCacheNodes"),
    /** Action for the DescribeReservedCacheNodesOfferings operation. */
    DescribeReservedCacheNodesOfferings("elasticache:DescribeReservedCacheNodesOfferings"),
    /** Action for the DescribeSnapshots operation. */
    DescribeSnapshots("elasticache:DescribeSnapshots"),
    /** Action for the IncreaseReplicaCount operation. */
    IncreaseReplicaCount("elasticache:IncreaseReplicaCount"),
    /** Action for the ListAllowedNodeTypeModifications operation. */
    ListAllowedNodeTypeModifications("elasticache:ListAllowedNodeTypeModifications"),
    /** Action for the ListTagsForResource operation. */
    ListTagsForResource("elasticache:ListTagsForResource"),
    /** Action for the ModifyCacheCluster operation. */
    ModifyCacheCluster("elasticache:ModifyCacheCluster"),
    /** Action for the ModifyCacheParameterGroup operation. */
    ModifyCacheParameterGroup("elasticache:ModifyCacheParameterGroup"),
    /** Action for the ModifyCacheSubnetGroup operation. */
    ModifyCacheSubnetGroup("elasticache:ModifyCacheSubnetGroup"),
    /** Action for the ModifyReplicationGroup operation. */
    ModifyReplicationGroup("elasticache:ModifyReplicationGroup"),
    /** Action for the ModifyReplicationGroupShardConfiguration operation. */
    ModifyReplicationGroupShardConfiguration("elasticache:ModifyReplicationGroupShardConfiguration"),
    /** Action for the PurchaseReservedCacheNodesOffering operation. */
    PurchaseReservedCacheNodesOffering("elasticache:PurchaseReservedCacheNodesOffering"),
    /** Action for the RebootCacheCluster operation. */
    RebootCacheCluster("elasticache:RebootCacheCluster"),
    /** Action for the RemoveTagsFromResource operation. */
    RemoveTagsFromResource("elasticache:RemoveTagsFromResource"),
    /** Action for the ResetCacheParameterGroup operation. */
    ResetCacheParameterGroup("elasticache:ResetCacheParameterGroup"),
    /** Action for the RevokeCacheSecurityGroupIngress operation. */
    RevokeCacheSecurityGroupIngress("elasticache:RevokeCacheSecurityGroupIngress"),
    /** Action for the TestFailover operation. */
    TestFailover("elasticache:TestFailover"),

    ;

    private final String action;

    private ElastiCacheActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
