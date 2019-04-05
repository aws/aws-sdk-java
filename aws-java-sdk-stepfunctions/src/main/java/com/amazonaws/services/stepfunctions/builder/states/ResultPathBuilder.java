/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Interface for all builders that expose 'ResultPath'.
 *
 * <p>This interface should not be implemented outside the SDK.</p>
 *
 * @param <BuilderT> Type of concrete builder (for method chaining).
 */
public interface ResultPathBuilder<BuilderT> {

    /**
     * OPTIONAL. The value of “ResultPath” MUST be a Reference Path, which specifies the combination with or replacement of
     * the state’s result with its raw input. If not provided then the output completely replaces the input.
     *
     * @param resultPath New path value.
     * @return This object for method chaining.
     */
    BuilderT resultPath(String resultPath);

}
