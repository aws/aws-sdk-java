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

import java.util.Arrays;
import java.util.Collection;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.dynamodbv2.document.KeyAttribute;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;

/**
 * Common base class for parameter specification that involves a primary key.
 */
public class AbstractSpecWithPrimaryKey<T extends AmazonWebServiceRequest>
        extends AbstractSpec<T> {
    private Collection<KeyAttribute> keyComponents;

    protected AbstractSpecWithPrimaryKey(T request) {
        super(request);
    }

    /**
     * Returns the primary key components that has been specified.
     */
    public final Collection<KeyAttribute> getKeyComponents() {
        return keyComponents;
    }

    /**
     * Sets the primary key with the specified key components.
     */
    public AbstractSpecWithPrimaryKey<T> withPrimaryKey(KeyAttribute ... components) {
        if (components == null)
            this.keyComponents = null;
        else
            this.keyComponents = Arrays.asList(components);
        return this;
    }

    /**
     * Sets the primary key.
     */
    public AbstractSpecWithPrimaryKey<T> withPrimaryKey(PrimaryKey primaryKey) {
        if (primaryKey == null)
            this.keyComponents = null;
        else {
            this.keyComponents = primaryKey.getComponents();
        }
        return this;
    }

    /**
     * Sets the primary key with the specified hash-only key name and value.
     */
    public AbstractSpecWithPrimaryKey<T> withPrimaryKey(String hashKeyName, Object hashKeyValue) {
        if (hashKeyName == null)
            throw new IllegalArgumentException();
        withPrimaryKey(new PrimaryKey(hashKeyName, hashKeyValue));
        return this;
    }

    /**
     * Sets the primary key with the specified hash key and range key.
     */
    public AbstractSpecWithPrimaryKey<T> withPrimaryKey(String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue) {
        if (hashKeyName == null)
            throw new IllegalArgumentException("Invalid hash key name");
        if (rangeKeyName == null)
            throw new IllegalArgumentException("Invalid range key name");
        if (hashKeyName.equals(rangeKeyName))
            throw new IllegalArgumentException("Names of hash and range keys must not be the same");
        withPrimaryKey(new PrimaryKey(hashKeyName, hashKeyValue, 
            rangeKeyName, rangeKeyValue));
        return this;
    }
}
