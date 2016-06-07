/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

/**
 * Manages capacity of a finite resource.  Capacity can be acquired and
 * released.
 */
public class CapacityManager {

    private volatile int availableCapacity;
    private final int maxCapacity;

    private final Object lock = new Object();

    /**
     * Creates a CapacityManager.
     *
     * @param maxCapacity maximum capacity of this resource.
     *                    available capacity will initially be set to this value.
     *                    if a negative value is provided the capacity manager will operate in a no-op
     *                    passthrough mode in which all acquire calls will return true.
     */
    public CapacityManager(final int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.availableCapacity = maxCapacity;
    }

    /**
     * Attempts to acquire a single capacity unit.
     * If acquired, capacity will be consumed from the available pool.

     * @return true if capacity can be acquired, false if not
     */
    public boolean acquire() {
        return acquire(1);
    }

    /**
     * Attempts to acquire a given amount of capacity.
     * If acquired, capacity will be consumed from the available pool.
     *
     * @param capacity capacity to acquire
     * @return true if capacity can be acquired, false if not
     * @throws IllegalArgumentException if given capacity is negative
     */
    public boolean acquire(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity to acquire cannot be negative");
        }

        if (availableCapacity < 0) {
            return true;
        }

        synchronized (lock) {
            if (availableCapacity - capacity >= 0) {
                availableCapacity -= capacity;
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Releases a single unit of capacity back to the pool, making it available
     * to consumers.
     */
    public void release() {
        release(1);
    }

    /**
     * Releases a given amount of capacity back to the pool, making it available
     * to consumers.
     *
     * @param capacity capacity to release
     * @throws IllegalArgumentException if given capacity is negative
     */
    public void release(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity to release cannot be negative");
        }

        // in the common 'good' case where we have our full capacity available we can
        // short circuit going any further and avoid unnecessary locking.
        if (availableCapacity >= 0 && availableCapacity != maxCapacity) {
            synchronized (lock) {
                availableCapacity = Math.min((availableCapacity + capacity), maxCapacity);
            }
        }
    }

    /**
     * Returns the currently consumed capacity.
     *
     * @return consumed capacity
     */
    public int consumedCapacity() {
        return (availableCapacity < 0) ? 0 : (maxCapacity - availableCapacity);
    }

    /**
     * Returns the currently available capacity.
     *
     * @return available capacity
     */
    public int availableCapacity() {
        return availableCapacity;
    }
}
