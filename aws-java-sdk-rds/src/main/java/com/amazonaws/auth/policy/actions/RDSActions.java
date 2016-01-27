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
 * The available AWS access control policy actions for Amazon RDS.
 */
public enum RDSActions implements Action {
    /** Represents any action executed on Amazon RDS. */
    AllRDSActions("rds:*"),

    /** Action for the AuthorizeDBSecurityGroupIngress operation. */
    AuthorizeDBSecurityGroupIngress("rds:AuthorizeDBSecurityGroupIngress"),

    /** Action for the CreateDBInstance operation. */
    CreateDBInstance("rds:CreateDBInstance"),

    /** Action for the CreateDBInstanceReadReplica operation. */
    CreateDBInstanceReadReplica("rds:CreateDBInstanceReadReplica"),

    /** Action for the CreateDBParameterGroup operation. */
    CreateDBParameterGroup("rds:CreateDBParameterGroup"),

    /** Action for the CreateDBSecurityGroup operation. */
    CreateDBSecurityGroup("rds:CreateDBSecurityGroup"),

    /** Action for the CreateDBSnapshot operation. */
    CreateDBSnapshot("rds:CreateDBSnapshot"),

    /** Action for the DeleteDBInstance operation. */
    DeleteDBInstance("rds:DeleteDBInstance"),

    /** Action for the DeleteDBParameterGroup operation. */
    DeleteDBParameterGroup("rds:DeleteDBParameterGroup"),

    /** Action for the DeleteDBSecurityGroup operation. */
    DeleteDBSecurityGroup("rds:DeleteDBSecurityGroup"),

    /** Action for the DeleteDBSnapshot operation. */
    DeleteDBSnapshot("rds:DeleteDBSnapshot"),

    /** Action for the DescribeDBEngineVersions operation. */
    DescribeDBEngineVersions("rds:DescribeDBEngineVersions"),

    /** Action for the DescribeDBInstances operation. */
    DescribeDBInstances("rds:DescribeDBInstances"),

    /** Action for the DescribeDBParameterGroups operation. */
    DescribeDBParameterGroups("rds:DescribeDBParameterGroups"),

    /** Action for the DescribeDBParameters operation. */
    DescribeDBParameters("rds:DescribeDBParameters"),

    /** Action for the DescribeDBSecurityGroups operation. */
    DescribeDBSecurityGroups("rds:DescribeDBSecurityGroups"),

    /** Action for the DescribeDBSnapshots operation. */
    DescribeDBSnapshots("rds:DescribeDBSnapshots"),

    /** Action for the DescribeEngineDefaultParameters operation. */
    DescribeEngineDefaultParameters("rds:DescribeEngineDefaultParameters"),

    /** Action for the DescribeEvents operation. */
    DescribeEvents("rds:DescribeEvents"),

    /** Action for the DescribeReservedDBInstances operation. */
    DescribeReservedDBInstances("rds:DescribeReservedDBInstances"),

    /** Action for the DescribeReservedDBInstancesOfferings operation. */
    DescribeReservedDBInstancesOfferings("rds:DescribeReservedDBInstancesOfferings"),

    /** Action for the ListTagsForResource operation. */
    ListTagsForResource("rds:ListTagsForResource"),

    /** Action for the ModifyDBInstance operation. */
    ModifyDBInstance("rds:ModifyDBInstance"),

    /** Action for the ModifyDBParameterGroup operation. */
    ModifyDBParameterGroup("rds:ModifyDBParameterGroup"),

    /** Action for the PurchaseReservedDBInstancesOffering operation. */
    PurchaseReservedDBInstancesOffering("rds:PurchaseReservedDBInstancesOffering"),

    /** Action for the RebootDBInstance operation. */
    RebootDBInstance("rds:RebootDBInstance"),

    /** Action for the ResetDBParameterGroup operation. */
    ResetDBParameterGroup("rds:ResetDBParameterGroup"),

    /** Action for the RestoreDBInstanceFromDBSnapshot operation. */
    RestoreDBInstanceFromDBSnapshot("rds:RestoreDBInstanceFromDBSnapshot"),

    /** Action for the RestoreDBInstanceToPointInTime operation. */
    RestoreDBInstanceToPointInTime("rds:RestoreDBInstanceToPointInTime"),

    /** Action for the RevokeDBSecurityGroupIngress operation. */
    RevokeDBSecurityGroupIngress("rds:RevokeDBSecurityGroupIngress");

    private final String action;

    private RDSActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
