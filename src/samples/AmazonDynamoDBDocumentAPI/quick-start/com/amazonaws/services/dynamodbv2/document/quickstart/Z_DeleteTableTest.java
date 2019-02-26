/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.document.quickstart;

import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.utils.AbstractQuickStart;
import com.amazonaws.services.dynamodbv2.model.TableDescription;

/**
 * Sample code to delete a DynamoDB table.
 */
public class Z_DeleteTableTest extends AbstractQuickStart {
//    @Test
    public void howToDeleteTable() throws InterruptedException {
        String TABLE_NAME = "myTableForMidLevelApi";
        Table table = dynamo.getTable(TABLE_NAME);
        // Wait for the table to become active or deleted
        TableDescription desc = table.waitForActiveOrDelete();
        if (desc == null) {
            System.out.println("Table " + table.getTableName()
                    + " does not exist.");
        } else {
            table.delete();
            // No need to wait, but you could
            table.waitForDelete();
            System.out.println("Table " + table.getTableName()
                    + " has been deleted");
        }
    }

}
