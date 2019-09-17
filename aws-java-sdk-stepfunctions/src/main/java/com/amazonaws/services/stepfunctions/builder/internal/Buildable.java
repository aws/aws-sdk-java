/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.stepfunctions.builder.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Interface to build a particular type.
 *
 * @param <T> Type to build.
 */
public interface Buildable<T> {

    T build();

    /**
     * Utilities to convert collections of {@link Buildable}'s to collections of the thing being built.
     */
    class Utils {

        private Utils() {
        }

        /**
         * Converts the Map of {@link Buildable}s into a Map of the built object.
         *
         * @param buildableMap Map where values are {@link Buildable}s.
         * @param <K>          Key type
         * @param <T>          Type of object being built.
         * @return Unmodifiable map of built objects.
         */
        public static <K, T> Map<K, T> build(Map<K, ? extends Buildable<T>> buildableMap) {
            final Map<K, T> builtMap = new LinkedHashMap<K, T>(buildableMap.size());
            for (Map.Entry<K, ? extends Buildable<T>> entry : buildableMap.entrySet()) {
                builtMap.put(entry.getKey(), entry.getValue().build());
            }
            return Collections.unmodifiableMap(builtMap);
        }

        /**
         * Converts the List of {@link Buildable}s into a List of the built object.
         *
         * @param buildableList List of {@link Buildable}s to build.
         * @param <T>           Type of object being built
         * @return Unmodifiable list of built objects.
         */
        public static <T> List<T> build(List<? extends Buildable<T>> buildableList) {
            List<T> builtList = new ArrayList<T>(buildableList.size());
            for (Buildable<T> buildable : buildableList) {
                builtList.add(buildable.build());
            }
            return Collections.unmodifiableList(builtList);
        }
    }
}
