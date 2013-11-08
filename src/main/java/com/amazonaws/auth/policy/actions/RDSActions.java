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
 * The available AWS access control policy actions for Amazon RDS.
 */
public enum RDSActions implements Action {
    /** Represents any action executed on Amazon RDS. */
    AllRDSActions("RDS:*"),

    /** Action for the AuthorizeDBSecurityGroupIngress operation. */
    AuthorizeDBSecurityGroupIngress("RDS:AuthorizeDBSecurityGroupIngress"),

    /** Action for the CreateDBInstance operation. */
    CreateDBInstance("RDS:CreateDBInstance"),

    /** Action for the CreateDBInstanceReadReplica operation. */
    CreateDBInstanceReadReplica("RDS:CreateDBInstanceReadReplica"),

    /** Action for the CreateDBParameterGroup operation. */
    CreateDBParameterGroup("RDS:CreateDBParameterGroup"),

    /** Action for the CreateDBSecurityGroup operation. */
    CreateDBSecurityGroup("RDS:CreateDBSecurityGroup"),

    /** Action for the CreateDBSnapshot operation. */
    CreateDBSnapshot("RDS:CreateDBSnapshot"),

    /** Action for the DeleteDBInstance operation. */
    DeleteDBInstance("RDS:DeleteDBInstance"),

    /** Action for the DeleteDBParameterGroup operation. */
    DeleteDBParameterGroup("RDS:DeleteDBParameterGroup"),

    /** Action for the DeleteDBSecurityGroup operation. */
    DeleteDBSecurityGroup("RDS:DeleteDBSecurityGroup"),

    /** Action for the DeleteDBSnapshot operation. */
    DeleteDBSnapshot("RDS:DeleteDBSnapshot"),

    /** Action for the DescribeDBEngineVersions operation. */
    DescribeDBEngineVersions("RDS:DescribeDBEngineVersions"),

    /** Action for the DescribeDBInstances operation. */
    DescribeDBInstances("RDS:DescribeDBInstances"),

    /** Action for the DescribeDBParameterGroups operation. */
    DescribeDBParameterGroups("RDS:DescribeDBParameterGroups"),

    /** Action for the DescribeDBParameters operation. */
    DescribeDBParameters("RDS:DescribeDBParameters"),

    /** Action for the DescribeDBSecurityGroups operation. */
    DescribeDBSecurityGroups("RDS:DescribeDBSecurityGroups"),

    /** Action for the DescribeDBSnapshots operation. */
    DescribeDBSnapshots("RDS:DescribeDBSnapshots"),

    /** Action for the DescribeEngineDefaultParameters operation. */
    DescribeEngineDefaultParameters("RDS:DescribeEngineDefaultParameters"),

    /** Action for the DescribeEvents operation. */
    DescribeEvents("RDS:DescribeEvents"),

    /** Action for the DescribeReservedDBInstances operation. */
    DescribeReservedDBInstances("RDS:DescribeReservedDBInstances"),

    /** Action for the DescribeReservedDBInstancesOfferings operation. */
    DescribeReservedDBInstancesOfferings("RDS:DescribeReservedDBInstancesOfferings"),

    /** Action for the ListTagsForResource operation. */
    ListTagsForResource("RDS:ListTagsForResource"),

    /** Action for the ModifyDBInstance operation. */
    ModifyDBInstance("RDS:ModifyDBInstance"),

    /** Action for the ModifyDBParameterGroup operation. */
    ModifyDBParameterGroup("RDS:ModifyDBParameterGroup"),

    /** Action for the PurchaseReservedDBInstancesOffering operation. */
    PurchaseReservedDBInstancesOffering("RDS:PurchaseReservedDBInstancesOffering"),

    /** Action for the RebootDBInstance operation. */
    RebootDBInstance("RDS:RebootDBInstance"),

    /** Action for the ResetDBParameterGroup operation. */
    ResetDBParameterGroup("RDS:ResetDBParameterGroup"),

    /** Action for the RestoreDBInstanceFromDBSnapshot operation. */
    RestoreDBInstanceFromDBSnapshot("RDS:RestoreDBInstanceFromDBSnapshot"),

    /** Action for the RestoreDBInstanceToPointInTime operation. */
    RestoreDBInstanceToPointInTime("RDS:RestoreDBInstanceToPointInTime"),

    /** Action for the RevokeDBSecurityGroupIngress operation. */
    RevokeDBSecurityGroupIngress("RDS:RevokeDBSecurityGroupIngress");

    private final String action;

    private RDSActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
