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
 * The available AWS access control policy actions for Amazon Route 53.
 */
public enum Route53Actions implements Action {
    /** Represents any action executed on Amazon Route 53. */
    AllRoute53Actions("Route53:*"),

    /** Action for the ChangeResourceRecordSets operation. */
    ChangeResourceRecordSets("Route53:ChangeResourceRecordSets"),

    /** Action for the CreateHostedZone operation. */
    CreateHostedZone("Route53:CreateHostedZone"),

    /** Action for the DeleteHostedZone operation. */
    DeleteHostedZone("Route53:DeleteHostedZone"),

    /** Action for the GetChange operation. */
    GetChange("Route53:GetChange"),

    /** Action for the GetHostedZone operation. */
    GetHostedZone("Route53:GetHostedZone"),

    /** Action for the ListHostedZones operation. */
    ListHostedZones("Route53:ListHostedZones"),

    /** Action for the ListResourceRecordSets operation. */
    ListResourceRecordSets("Route53:ListResourceRecordSets");

    private final String action;

    private Route53Actions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
