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
 * The available AWS access control policy actions for Amazon Redshift.
 */
public enum RedshiftActions implements Action {
    /** Represents any action executed on Amazon Redshift. */
    AllRedshiftActions("redshift:*"),

    /** Action for the AuthorizeClusterSecurityGroupIngress operation. */
    AuthorizeClusterSecurityGroupIngress("redshift:AuthorizeClusterSecurityGroupIngress"),

    /** Action for the CopyClusterSnapshot operation. */
    CopyClusterSnapshot("redshift:CopyClusterSnapshot"),

    /** Action for the CreateCluster operation. */
    CreateCluster("redshift:CreateCluster"),

    /** Action for the CreateClusterParameterGroup operation. */
    CreateClusterParameterGroup("redshift:CreateClusterParameterGroup"),

    /** Action for the CreateClusterSecurityGroup operation. */
    CreateClusterSecurityGroup("redshift:CreateClusterSecurityGroup"),

    /** Action for the CreateClusterSnapshot operation. */
    CreateClusterSnapshot("redshift:CreateClusterSnapshot"),

    /** Action for the CreateClusterSubnetGroup operation. */
    CreateClusterSubnetGroup("redshift:CreateClusterSubnetGroup"),

    /** Action for the DeleteCluster operation. */
    DeleteCluster("redshift:DeleteCluster"),

    /** Action for the DeleteClusterParameterGroup operation. */
    DeleteClusterParameterGroup("redshift:DeleteClusterParameterGroup"),

    /** Action for the DeleteClusterSecurityGroup operation. */
    DeleteClusterSecurityGroup("redshift:DeleteClusterSecurityGroup"),

    /** Action for the DeleteClusterSnapshot operation. */
    DeleteClusterSnapshot("redshift:DeleteClusterSnapshot"),

    /** Action for the DeleteClusterSubnetGroup operation. */
    DeleteClusterSubnetGroup("redshift:DeleteClusterSubnetGroup"),

    /** Action for the DescribeClusterParameterGroups operation. */
    DescribeClusterParameterGroups("redshift:DescribeClusterParameterGroups"),

    /** Action for the DescribeClusterParameters operation. */
    DescribeClusterParameters("redshift:DescribeClusterParameters"),

    /** Action for the DescribeClusterSecurityGroups operation. */
    DescribeClusterSecurityGroups("redshift:DescribeClusterSecurityGroups"),

    /** Action for the DescribeClusterSnapshots operation. */
    DescribeClusterSnapshots("redshift:DescribeClusterSnapshots"),

    /** Action for the DescribeClusterSubnetGroups operation. */
    DescribeClusterSubnetGroups("redshift:DescribeClusterSubnetGroups"),

    /** Action for the DescribeClusterVersions operation. */
    DescribeClusterVersions("redshift:DescribeClusterVersions"),

    /** Action for the DescribeClusters operation. */
    DescribeClusters("redshift:DescribeClusters"),

    /** Action for the DescribeDefaultClusterParameters operation. */
    DescribeDefaultClusterParameters("redshift:DescribeDefaultClusterParameters"),

    /** Action for the DescribeEvents operation. */
    DescribeEvents("redshift:DescribeEvents"),

    /** Action for the DescribeOrderableClusterOptions operation. */
    DescribeOrderableClusterOptions("redshift:DescribeOrderableClusterOptions"),

    /** Action for the DescribeReservedNodeOfferings operation. */
    DescribeReservedNodeOfferings("redshift:DescribeReservedNodeOfferings"),

    /** Action for the DescribeReservedNodes operation. */
    DescribeReservedNodes("redshift:DescribeReservedNodes"),

    /** Action for the DescribeResize operation. */
    DescribeResize("redshift:DescribeResize"),

    /** Action for the ModifyCluster operation. */
    ModifyCluster("redshift:ModifyCluster"),

    /** Action for the ModifyClusterParameterGroup operation. */
    ModifyClusterParameterGroup("redshift:ModifyClusterParameterGroup"),

    /** Action for the ModifyClusterSubnetGroup operation. */
    ModifyClusterSubnetGroup("redshift:ModifyClusterSubnetGroup"),

    /** Action for the PurchaseReservedNodeOffering operation. */
    PurchaseReservedNodeOffering("redshift:PurchaseReservedNodeOffering"),

    /** Action for the RebootCluster operation. */
    RebootCluster("redshift:RebootCluster"),

    /** Action for the ResetClusterParameterGroup operation. */
    ResetClusterParameterGroup("redshift:ResetClusterParameterGroup"),

    /** Action for the RestoreFromClusterSnapshot operation. */
    RestoreFromClusterSnapshot("redshift:RestoreFromClusterSnapshot"),

    /** Action for the RevokeClusterSecurityGroupIngress operation. */
    RevokeClusterSecurityGroupIngress("redshift:RevokeClusterSecurityGroupIngress");

    private final String action;

    private RedshiftActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
