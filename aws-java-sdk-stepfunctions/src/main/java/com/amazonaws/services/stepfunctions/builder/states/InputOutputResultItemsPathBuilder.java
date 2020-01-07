/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.stepfunctions.builder.states;

/**
 * Interface for all builders that expose all of 'InputPath', 'OutputPath', 'ResultPath', and 'ItemsPath'
 *
 * <p>This interface should not be implemented outside the SDK.</p>
 *
 * @param <BuilderT> Type of concrete builder (for method chaining).
 */
public interface InputOutputResultItemsPathBuilder<BuilderT>
        extends InputOutputResultPathBuilder<BuilderT> {
    /**
     * OPTIONAL. The value of “ItemsPath” MUST be a path, with is a reference path identifying where in the effective
     * input the array field is found. If not provided then the whole input is used.
     * used.
     *
     * @param itemsPath New path value.
     * @return This object for method chaining.
     */
    BuilderT itemsPath(String itemsPath);
}
