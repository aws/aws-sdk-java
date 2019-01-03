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
 * The available AWS access control policy actions for Amazon Redshift.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum RedshiftActions implements Action {

    /** Represents any action executed on Amazon Redshift. */
    AllRedshiftActions("redshift:*"),

    /** Action for the AcceptReservedNodeExchange operation. */
    AcceptReservedNodeExchange("redshift:AcceptReservedNodeExchange"),
    /** Action for the AuthorizeClusterSecurityGroupIngress operation. */
    AuthorizeClusterSecurityGroupIngress("redshift:AuthorizeClusterSecurityGroupIngress"),
    /** Action for the AuthorizeSnapshotAccess operation. */
    AuthorizeSnapshotAccess("redshift:AuthorizeSnapshotAccess"),
    /** Action for the BatchDeleteClusterSnapshots operation. */
    BatchDeleteClusterSnapshots("redshift:BatchDeleteClusterSnapshots"),
    /** Action for the BatchModifyClusterSnapshots operation. */
    BatchModifyClusterSnapshots("redshift:BatchModifyClusterSnapshots"),
    /** Action for the CancelResize operation. */
    CancelResize("redshift:CancelResize"),
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
    /** Action for the CreateEventSubscription operation. */
    CreateEventSubscription("redshift:CreateEventSubscription"),
    /** Action for the CreateHsmClientCertificate operation. */
    CreateHsmClientCertificate("redshift:CreateHsmClientCertificate"),
    /** Action for the CreateHsmConfiguration operation. */
    CreateHsmConfiguration("redshift:CreateHsmConfiguration"),
    /** Action for the CreateSnapshotCopyGrant operation. */
    CreateSnapshotCopyGrant("redshift:CreateSnapshotCopyGrant"),
    /** Action for the CreateSnapshotSchedule operation. */
    CreateSnapshotSchedule("redshift:CreateSnapshotSchedule"),
    /** Action for the CreateTags operation. */
    CreateTags("redshift:CreateTags"),
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
    /** Action for the DeleteEventSubscription operation. */
    DeleteEventSubscription("redshift:DeleteEventSubscription"),
    /** Action for the DeleteHsmClientCertificate operation. */
    DeleteHsmClientCertificate("redshift:DeleteHsmClientCertificate"),
    /** Action for the DeleteHsmConfiguration operation. */
    DeleteHsmConfiguration("redshift:DeleteHsmConfiguration"),
    /** Action for the DeleteSnapshotCopyGrant operation. */
    DeleteSnapshotCopyGrant("redshift:DeleteSnapshotCopyGrant"),
    /** Action for the DeleteSnapshotSchedule operation. */
    DeleteSnapshotSchedule("redshift:DeleteSnapshotSchedule"),
    /** Action for the DeleteTags operation. */
    DeleteTags("redshift:DeleteTags"),
    /** Action for the DescribeAccountAttributes operation. */
    DescribeAccountAttributes("redshift:DescribeAccountAttributes"),
    /** Action for the DescribeClusterDbRevisions operation. */
    DescribeClusterDbRevisions("redshift:DescribeClusterDbRevisions"),
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
    /** Action for the DescribeClusterTracks operation. */
    DescribeClusterTracks("redshift:DescribeClusterTracks"),
    /** Action for the DescribeClusterVersions operation. */
    DescribeClusterVersions("redshift:DescribeClusterVersions"),
    /** Action for the DescribeClusters operation. */
    DescribeClusters("redshift:DescribeClusters"),
    /** Action for the DescribeDefaultClusterParameters operation. */
    DescribeDefaultClusterParameters("redshift:DescribeDefaultClusterParameters"),
    /** Action for the DescribeEventCategories operation. */
    DescribeEventCategories("redshift:DescribeEventCategories"),
    /** Action for the DescribeEventSubscriptions operation. */
    DescribeEventSubscriptions("redshift:DescribeEventSubscriptions"),
    /** Action for the DescribeEvents operation. */
    DescribeEvents("redshift:DescribeEvents"),
    /** Action for the DescribeHsmClientCertificates operation. */
    DescribeHsmClientCertificates("redshift:DescribeHsmClientCertificates"),
    /** Action for the DescribeHsmConfigurations operation. */
    DescribeHsmConfigurations("redshift:DescribeHsmConfigurations"),
    /** Action for the DescribeLoggingStatus operation. */
    DescribeLoggingStatus("redshift:DescribeLoggingStatus"),
    /** Action for the DescribeOrderableClusterOptions operation. */
    DescribeOrderableClusterOptions("redshift:DescribeOrderableClusterOptions"),
    /** Action for the DescribeReservedNodeOfferings operation. */
    DescribeReservedNodeOfferings("redshift:DescribeReservedNodeOfferings"),
    /** Action for the DescribeReservedNodes operation. */
    DescribeReservedNodes("redshift:DescribeReservedNodes"),
    /** Action for the DescribeResize operation. */
    DescribeResize("redshift:DescribeResize"),
    /** Action for the DescribeSnapshotCopyGrants operation. */
    DescribeSnapshotCopyGrants("redshift:DescribeSnapshotCopyGrants"),
    /** Action for the DescribeSnapshotSchedules operation. */
    DescribeSnapshotSchedules("redshift:DescribeSnapshotSchedules"),
    /** Action for the DescribeStorage operation. */
    DescribeStorage("redshift:DescribeStorage"),
    /** Action for the DescribeTableRestoreStatus operation. */
    DescribeTableRestoreStatus("redshift:DescribeTableRestoreStatus"),
    /** Action for the DescribeTags operation. */
    DescribeTags("redshift:DescribeTags"),
    /** Action for the DisableLogging operation. */
    DisableLogging("redshift:DisableLogging"),
    /** Action for the DisableSnapshotCopy operation. */
    DisableSnapshotCopy("redshift:DisableSnapshotCopy"),
    /** Action for the EnableLogging operation. */
    EnableLogging("redshift:EnableLogging"),
    /** Action for the EnableSnapshotCopy operation. */
    EnableSnapshotCopy("redshift:EnableSnapshotCopy"),
    /** Action for the GetClusterCredentials operation. */
    GetClusterCredentials("redshift:GetClusterCredentials"),
    /** Action for the GetReservedNodeExchangeOfferings operation. */
    GetReservedNodeExchangeOfferings("redshift:GetReservedNodeExchangeOfferings"),
    /** Action for the ModifyCluster operation. */
    ModifyCluster("redshift:ModifyCluster"),
    /** Action for the ModifyClusterDbRevision operation. */
    ModifyClusterDbRevision("redshift:ModifyClusterDbRevision"),
    /** Action for the ModifyClusterIamRoles operation. */
    ModifyClusterIamRoles("redshift:ModifyClusterIamRoles"),
    /** Action for the ModifyClusterMaintenance operation. */
    ModifyClusterMaintenance("redshift:ModifyClusterMaintenance"),
    /** Action for the ModifyClusterParameterGroup operation. */
    ModifyClusterParameterGroup("redshift:ModifyClusterParameterGroup"),
    /** Action for the ModifyClusterSnapshot operation. */
    ModifyClusterSnapshot("redshift:ModifyClusterSnapshot"),
    /** Action for the ModifyClusterSnapshotSchedule operation. */
    ModifyClusterSnapshotSchedule("redshift:ModifyClusterSnapshotSchedule"),
    /** Action for the ModifyClusterSubnetGroup operation. */
    ModifyClusterSubnetGroup("redshift:ModifyClusterSubnetGroup"),
    /** Action for the ModifyEventSubscription operation. */
    ModifyEventSubscription("redshift:ModifyEventSubscription"),
    /** Action for the ModifySnapshotCopyRetentionPeriod operation. */
    ModifySnapshotCopyRetentionPeriod("redshift:ModifySnapshotCopyRetentionPeriod"),
    /** Action for the ModifySnapshotSchedule operation. */
    ModifySnapshotSchedule("redshift:ModifySnapshotSchedule"),
    /** Action for the PurchaseReservedNodeOffering operation. */
    PurchaseReservedNodeOffering("redshift:PurchaseReservedNodeOffering"),
    /** Action for the RebootCluster operation. */
    RebootCluster("redshift:RebootCluster"),
    /** Action for the ResetClusterParameterGroup operation. */
    ResetClusterParameterGroup("redshift:ResetClusterParameterGroup"),
    /** Action for the ResizeCluster operation. */
    ResizeCluster("redshift:ResizeCluster"),
    /** Action for the RestoreFromClusterSnapshot operation. */
    RestoreFromClusterSnapshot("redshift:RestoreFromClusterSnapshot"),
    /** Action for the RestoreTableFromClusterSnapshot operation. */
    RestoreTableFromClusterSnapshot("redshift:RestoreTableFromClusterSnapshot"),
    /** Action for the RevokeClusterSecurityGroupIngress operation. */
    RevokeClusterSecurityGroupIngress("redshift:RevokeClusterSecurityGroupIngress"),
    /** Action for the RevokeSnapshotAccess operation. */
    RevokeSnapshotAccess("redshift:RevokeSnapshotAccess"),
    /** Action for the RotateEncryptionKey operation. */
    RotateEncryptionKey("redshift:RotateEncryptionKey"),

    ;

    private final String action;

    private RedshiftActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
