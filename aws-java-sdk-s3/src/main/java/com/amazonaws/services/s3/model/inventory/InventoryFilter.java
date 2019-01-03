/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model.inventory;

import java.io.Serializable;

/**
 * Specifies an inventory filter.
 * The inventory only includes objects that meet the filter's criteria.
 */
public class InventoryFilter implements Serializable {

    private InventoryFilterPredicate predicate;

    public InventoryFilter() { }

    public InventoryFilter(InventoryFilterPredicate predicate) {
        this.predicate = predicate;
    }

    /**
     * Returns the {@link InventoryFilterPredicate} to be used when evaluating an inventory filter.
     *
     * The predicate should be of type {@link InventoryPrefixPredicate}.
     */
    public InventoryFilterPredicate getPredicate() {
        return predicate;
    }

    /**
     * Sets the {@link InventoryFilterPredicate} to be used when evaluating an inventory filter.
     *
     * The predicate should be of type {@link InventoryPrefixPredicate}.
     */
    public void setPredicate(InventoryFilterPredicate predicate) {
        this.predicate = predicate;
    }

    /**
     * Sets the {@link InventoryFilterPredicate} to be used when evaluating an inventory filter
     * and returns the {@link InventoryFilter} object for method chaining.
     *
     * The predicate should be of type {@link InventoryPrefixPredicate}.
     */
    public InventoryFilter withPredicate(InventoryFilterPredicate predicate) {
        setPredicate(predicate);
        return this;
    }
}
