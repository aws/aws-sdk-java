/*
 * Copyright 2011-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodb.datamodeling;

import com.amazonaws.services.dynamodb.model.AttributeValue;
import com.amazonaws.services.dynamodb.model.Condition;

public class DynamoDBQueryExpression {
    private boolean consistentRead = true;
    private boolean scanIndexForward = true;
    private AttributeValue hashKeyValue;
    private Condition rangeKeyCondition;


    public DynamoDBQueryExpression(AttributeValue hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
    }


    public boolean isConsistentRead() {
        return consistentRead;
    }

    public void setConsistentRead(boolean consistentRead) {
        this.consistentRead = consistentRead;
    }

    public boolean isScanIndexForward() {
        return scanIndexForward;
    }

    public void setScanIndexForward(boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
    }

    public AttributeValue getHashKeyValue() {
        return hashKeyValue;
    }

    public void setHashKeyValue(AttributeValue hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
    }

    public Condition getRangeKeyCondition() {
        return rangeKeyCondition;
    }

    public void setRangeKeyCondition(Condition rangeKeyCondition) {
        this.rangeKeyCondition = rangeKeyCondition;
    }

}
