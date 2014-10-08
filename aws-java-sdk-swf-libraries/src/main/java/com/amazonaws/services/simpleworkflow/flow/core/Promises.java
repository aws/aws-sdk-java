/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Promises {

    private Promises() {}
    
    public static <T> Promise<List<T>> listOfPromisesToPromise(final List<Promise<T>> list) {
        final Settable<List<T>> result = new Settable<List<T>>();
        @SuppressWarnings({ "rawtypes", "unchecked" })
        AndPromise andPromise = new AndPromise((Collection)list);
        new Task(andPromise) {

            @Override
            protected void doExecute() throws Throwable {
                List<T> extracted = new ArrayList<T>(list.size());
                for (Promise<T> promise : list) {
                    extracted.add(promise.get());
                }
                result.set(extracted);
            }

        };
        return result;
    }

    public static <K, V> Promise<Map<K, V>> mapOfPromisesToPromise(final Map<K, Promise<V>> map) {
        final Settable<Map<K, V>> result = new Settable<Map<K, V>>();
        @SuppressWarnings({ "rawtypes", "unchecked" })
        AndPromise andPromise = new AndPromise((Collection) map.values());
        new Task(andPromise) {

            @Override
            protected void doExecute() throws Throwable {
                Map<K, V> extracted = new HashMap<K, V>(map.size());
                for (Entry<K, Promise<V>> pair : map.entrySet()) {
                    extracted.put(pair.getKey(), pair.getValue().get());
                }
                result.set(extracted);
            }
        };
        return result;
    }

    public static <T> Promise<Set<T>> setOfPromisesToPromise(final Set<Promise<T>> set) {
        final Settable<Set<T>> result = new Settable<Set<T>>();
        @SuppressWarnings({ "rawtypes", "unchecked" })
        AndPromise andPromise = new AndPromise((Collection) set);
        new Task(andPromise) {

            @Override
            protected void doExecute() throws Throwable {
                Set<T> extracted = new HashSet<T>(set.size());
                for (Promise<T> promise : set) {
                    extracted.add(promise.get());
                }
                result.set(extracted);
            }

        };
        return result;
    }
}
