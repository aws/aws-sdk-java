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
 * The available AWS access control policy actions for Amazon SimpleDB.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SimpleDBActions implements Action {

    /** Represents any action executed on Amazon SimpleDB. */
    AllSimpleDBActions("sdb:*"),

    /** Action for the BatchDeleteAttributes operation. */
    BatchDeleteAttributes("sdb:BatchDeleteAttributes"),
    /** Action for the BatchPutAttributes operation. */
    BatchPutAttributes("sdb:BatchPutAttributes"),
    /** Action for the CreateDomain operation. */
    CreateDomain("sdb:CreateDomain"),
    /** Action for the DeleteAttributes operation. */
    DeleteAttributes("sdb:DeleteAttributes"),
    /** Action for the DeleteDomain operation. */
    DeleteDomain("sdb:DeleteDomain"),
    /** Action for the DomainMetadata operation. */
    DomainMetadata("sdb:DomainMetadata"),
    /** Action for the GetAttributes operation. */
    GetAttributes("sdb:GetAttributes"),
    /** Action for the ListDomains operation. */
    ListDomains("sdb:ListDomains"),
    /** Action for the PutAttributes operation. */
    PutAttributes("sdb:PutAttributes"),
    /** Action for the Select operation. */
    Select("sdb:Select"),

    ;

    private final String action;

    private SimpleDBActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
