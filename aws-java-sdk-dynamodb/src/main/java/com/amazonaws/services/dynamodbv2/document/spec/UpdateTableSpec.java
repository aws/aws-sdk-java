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
package com.amazonaws.services.dynamodbv2.document.spec;

import java.util.Collection;
import java.util.List;

import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndexUpdate;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.UpdateTableRequest;

/**
 * Full parameter specification for the UpdateTable API.
 */
public class UpdateTableSpec extends AbstractSpec<UpdateTableRequest> {
    public UpdateTableSpec() {
        super(new UpdateTableRequest());
    }

    public ProvisionedThroughput getProvisionedThroughput() {
        return getRequest().getProvisionedThroughput();
    }

    public UpdateTableSpec withProvisionedThroughput(
            ProvisionedThroughput provisionedThroughput) {
        getRequest().setProvisionedThroughput(provisionedThroughput);
        return this;
    }

    public List<AttributeDefinition> getAttributeDefinitions() {
        return getRequest().getAttributeDefinitions();
    }

    public UpdateTableSpec withAttributeDefinitions(
            AttributeDefinition... attributeDefinitions) {
        getRequest().withAttributeDefinitions(attributeDefinitions);
        return this;
    }

    public UpdateTableSpec withAttributeDefinitions(
            Collection<AttributeDefinition> attributeDefinitions) {
        getRequest().withAttributeDefinitions(attributeDefinitions);
        return this;
    }

    public UpdateTableSpec withGlobalSecondaryIndexUpdates(
            GlobalSecondaryIndexUpdate... globalSecondaryIndexUpdates) {
        getRequest().withGlobalSecondaryIndexUpdates(
                globalSecondaryIndexUpdates);
        return this;
    }

    public UpdateTableSpec withGlobalSecondaryIndexUpdates(
            Collection<GlobalSecondaryIndexUpdate> globalSecondaryIndexUpdates) {
        getRequest().withGlobalSecondaryIndexUpdates(
                globalSecondaryIndexUpdates);
        return this;
    }
}
