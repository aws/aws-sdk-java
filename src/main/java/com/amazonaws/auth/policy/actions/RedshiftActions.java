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
 * The available AWS access control policy actions for Amazon Redshift.
 */
public enum RedshiftActions implements Action {
    /** Represents any action executed on Amazon Redshift. */
    AllRedshiftActions("Redshift:*"),

    /** Action for the AuthorizeClusterSecurityGroupIngress operation. */
    AuthorizeClusterSecurityGroupIngress("Redshift:AuthorizeClusterSecurityGroupIngress"),

    /** Action for the CopyClusterSnapshot operation. */
    CopyClusterSnapshot("Redshift:CopyClusterSnapshot"),

    /** Action for the CreateCluster operation. */
    CreateCluster("Redshift:CreateCluster"),

    /** Action for the CreateClusterParameterGroup operation. */
    CreateClusterParameterGroup("Redshift:CreateClusterParameterGroup"),

    /** Action for the CreateClusterSecurityGroup operation. */
    CreateClusterSecurityGroup("Redshift:CreateClusterSecurityGroup"),

    /** Action for the CreateClusterSnapshot operation. */
    CreateClusterSnapshot("Redshift:CreateClusterSnapshot"),

    /** Action for the CreateClusterSubnetGroup operation. */
    CreateClusterSubnetGroup("Redshift:CreateClusterSubnetGroup"),

    /** Action for the DeleteCluster operation. */
    DeleteCluster("Redshift:DeleteCluster"),

    /** Action for the DeleteClusterParameterGroup operation. */
    DeleteClusterParameterGroup("Redshift:DeleteClusterParameterGroup"),

    /** Action for the DeleteClusterSecurityGroup operation. */
    DeleteClusterSecurityGroup("Redshift:DeleteClusterSecurityGroup"),

    /** Action for the DeleteClusterSnapshot operation. */
    DeleteClusterSnapshot("Redshift:DeleteClusterSnapshot"),

    /** Action for the DeleteClusterSubnetGroup operation. */
    DeleteClusterSubnetGroup("Redshift:DeleteClusterSubnetGroup"),

    /** Action for the DescribeClusterParameterGroups operation. */
    DescribeClusterParameterGroups("Redshift:DescribeClusterParameterGroups"),

    /** Action for the DescribeClusterParameters operation. */
    DescribeClusterParameters("Redshift:DescribeClusterParameters"),

    /** Action for the DescribeClusterSecurityGroups operation. */
    DescribeClusterSecurityGroups("Redshift:DescribeClusterSecurityGroups"),

    /** Action for the DescribeClusterSnapshots operation. */
    DescribeClusterSnapshots("Redshift:DescribeClusterSnapshots"),

    /** Action for the DescribeClusterSubnetGroups operation. */
    DescribeClusterSubnetGroups("Redshift:DescribeClusterSubnetGroups"),

    /** Action for the DescribeClusterVersions operation. */
    DescribeClusterVersions("Redshift:DescribeClusterVersions"),

    /** Action for the DescribeClusters operation. */
    DescribeClusters("Redshift:DescribeClusters"),

    /** Action for the DescribeDefaultClusterParameters operation. */
    DescribeDefaultClusterParameters("Redshift:DescribeDefaultClusterParameters"),

    /** Action for the DescribeEvents operation. */
    DescribeEvents("Redshift:DescribeEvents"),

    /** Action for the DescribeOrderableClusterOptions operation. */
    DescribeOrderableClusterOptions("Redshift:DescribeOrderableClusterOptions"),

    /** Action for the DescribeReservedNodeOfferings operation. */
    DescribeReservedNodeOfferings("Redshift:DescribeReservedNodeOfferings"),

    /** Action for the DescribeReservedNodes operation. */
    DescribeReservedNodes("Redshift:DescribeReservedNodes"),

    /** Action for the DescribeResize operation. */
    DescribeResize("Redshift:DescribeResize"),

    /** Action for the ModifyCluster operation. */
    ModifyCluster("Redshift:ModifyCluster"),

    /** Action for the ModifyClusterParameterGroup operation. */
    ModifyClusterParameterGroup("Redshift:ModifyClusterParameterGroup"),

    /** Action for the ModifyClusterSubnetGroup operation. */
    ModifyClusterSubnetGroup("Redshift:ModifyClusterSubnetGroup"),

    /** Action for the PurchaseReservedNodeOffering operation. */
    PurchaseReservedNodeOffering("Redshift:PurchaseReservedNodeOffering"),

    /** Action for the RebootCluster operation. */
    RebootCluster("Redshift:RebootCluster"),

    /** Action for the ResetClusterParameterGroup operation. */
    ResetClusterParameterGroup("Redshift:ResetClusterParameterGroup"),

    /** Action for the RestoreFromClusterSnapshot operation. */
    RestoreFromClusterSnapshot("Redshift:RestoreFromClusterSnapshot"),

    /** Action for the RevokeClusterSecurityGroupIngress operation. */
    RevokeClusterSecurityGroupIngress("Redshift:RevokeClusterSecurityGroupIngress");

    private final String action;

    private RedshiftActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
