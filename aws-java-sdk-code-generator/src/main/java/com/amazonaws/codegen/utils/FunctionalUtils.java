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
package com.amazonaws.codegen.utils;

import java.util.function.Function;

public class FunctionalUtils {

    /**
     * Takes a functional interface that throws an exception and returns a {@link Function} that deals with that exception by
     * wrapping in a runtime exception. Useful for APIs that use the standard Java functional interfaces that don't throw checked
     * exceptions.
     *
     * @param unsafeFunc Functional interface that throws checked exception.
     * @param <T>        Input
     * @param <R>        Output
     * @return New {@link Function} that handles checked exception.
     */
    public static <T, R> Function<T, R> safeFunction(ExceptionThrowingFunction<T, R> unsafeFunc) {
        return t -> {
            try {
                return unsafeFunc.apply(t);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    /**
     * Equivalent of {@link Function} that throws a checked exception.
     */
    @FunctionalInterface
    public interface ExceptionThrowingFunction<T, R> {
        R apply(T t) throws Exception;
    }

}
