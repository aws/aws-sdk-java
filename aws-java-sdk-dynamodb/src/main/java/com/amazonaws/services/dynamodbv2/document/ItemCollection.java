/*
 * Copyright 2014-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.document;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.document.internal.PageBasedCollection;
import com.amazonaws.services.dynamodbv2.model.Capacity;
import com.amazonaws.services.dynamodbv2.model.ConsumedCapacity;

/**
 * A collection of <code>Item</code>'s.
 * 
 * An <code>ItemCollection</code> object maintains a cursor pointing to its
 * current pages of data. Initially the cursor is positioned before the first page.
 * The next method moves the cursor to the next row, and because it returns
 * false when there are no more rows in the <code>ItemCollection</code> object,
 * it can be used in a while loop to iterate through the collection.
 * 
 * Network calls can be triggered when the collection is iterated across page
 * boundaries.
 *
 * @param <R> low level result type
 */
public abstract class ItemCollection<R> extends PageBasedCollection<Item, R> {
    private int totalCount;
    private int totalScannedCount;
    private ConsumedCapacity totalConsumedCapacity;

    protected final void accumulateStats(ConsumedCapacity consumedCapacity,
            Integer count, Integer scannedCount) {
        if (consumedCapacity != null) {
            if (totalConsumedCapacity == null) {
                // Create a new consumed capacity by cloning the one passed in
                this.totalConsumedCapacity = new ConsumedCapacity();
                totalConsumedCapacity.setCapacityUnits(consumedCapacity.getCapacityUnits());
                totalConsumedCapacity.setGlobalSecondaryIndexes(
                    clone(consumedCapacity.getGlobalSecondaryIndexes()));
                totalConsumedCapacity.setLocalSecondaryIndexes(
                    clone(consumedCapacity.getLocalSecondaryIndexes()));
                totalConsumedCapacity.setTable(clone(consumedCapacity.getTable()));
                totalConsumedCapacity.setTableName(consumedCapacity.getTableName());
            } else {
                // Accumulate the capacity units 
                final Double capunit = totalConsumedCapacity.getCapacityUnits();
                final Double delta = consumedCapacity.getCapacityUnits();
                if (capunit == null) {
                    totalConsumedCapacity.setCapacityUnits(delta);
                } else {
                    totalConsumedCapacity.setCapacityUnits(capunit.doubleValue() 
                        + (delta == null ? 0 : delta.doubleValue()));
                }
                // Accumulate the GSI capacities
                final Map<String, Capacity> gsi = totalConsumedCapacity.getGlobalSecondaryIndexes();
                if (gsi == null) {
                    totalConsumedCapacity.setGlobalSecondaryIndexes(
                        clone(consumedCapacity.getGlobalSecondaryIndexes()));
                } else {
                    totalConsumedCapacity.setGlobalSecondaryIndexes(add(
                        consumedCapacity.getGlobalSecondaryIndexes(),
                        totalConsumedCapacity.getGlobalSecondaryIndexes()));
                }
                // Accumulate the LSI capacities
                final Map<String, Capacity> lsi = totalConsumedCapacity.getLocalSecondaryIndexes();
                if (lsi == null) {
                    totalConsumedCapacity.setLocalSecondaryIndexes(
                        clone(consumedCapacity.getLocalSecondaryIndexes()));
                } else {
                    totalConsumedCapacity.setLocalSecondaryIndexes(add(
                        consumedCapacity.getLocalSecondaryIndexes(),
                        totalConsumedCapacity.getLocalSecondaryIndexes()));
                }
            }
        }
        if (count != null) {
            this.totalCount += count.intValue();
        }
        if (scannedCount != null) {
            this.totalScannedCount += scannedCount.intValue();
        }
    }

    private Map<String, Capacity> add(Map<String, Capacity> from, Map<String, Capacity> to) {
        if (to == null)
            return clone(from);
        if (from != null) {
            for (Map.Entry<String, Capacity> entryFrom : from.entrySet()) {
                final String key = entryFrom.getKey();
                final Capacity tocap = to.get(key);
                final Capacity fromcap = entryFrom.getValue();
                if (tocap == null) {
                    to.put(key, clone(fromcap));
                } else {
                    to.put(key, new Capacity().withCapacityUnits(
                        doubleOf(tocap) + doubleOf(fromcap)));
                }
            }
        }
        return to;
    }

    private Map<String, Capacity> clone(Map<String, Capacity> capacityMap) {
        if (capacityMap == null)
            return null;
        Map<String,Capacity> clone =
            new HashMap<String,Capacity>(capacityMap.size());
        for (Map.Entry<String, Capacity> e : capacityMap.entrySet())
            clone.put(e.getKey(), clone(e.getValue()));
        return clone;
    }
    
    private Capacity clone(Capacity capacity) {
        return capacity == null 
             ? null
             : new Capacity().withCapacityUnits(capacity.getCapacityUnits());
    }
    
    private double doubleOf(Capacity cap) {
        if (cap == null)
            return 0.0;
        Double val = cap.getCapacityUnits();
        return val == null ? 0.0 : val.doubleValue();
    }

    /**
     * Returns the total count accumulated so far.
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Returns the total scanned count accumulated so far.
     */
    public int getTotalScannedCount() {
        return totalScannedCount;
    }

    /**
     * Returns the total consumed capacity accumulated so far.
     */
    public ConsumedCapacity getTotalConsumedCapacity() {
        return totalConsumedCapacity;
    }
}
