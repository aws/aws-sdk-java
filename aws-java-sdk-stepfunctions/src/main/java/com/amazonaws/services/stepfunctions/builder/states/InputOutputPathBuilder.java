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
 * Interface for all builders that expose both 'InputPath' and 'OutputPath'.
 *
 * <p>This interface should not be implemented outside the SDK.</p>
 *
 * @param <BuilderT> Type of concrete builder (for method chaining).
 */
public interface InputOutputPathBuilder<BuilderT> {

    /**
     * OPTIONAL. The value of “InputPath” MUST be a Path, which is applied to a State’s raw input to select some or all of
     * it;
     * that selection is used by the state. If not provided then the whole output from the previous state is used as input to
     * this state.
     *
     * @param inputPath New path value.
     * @return This object for method chaining.
     */
    BuilderT inputPath(String inputPath);

    /**
     * OPTIONAL. The value of “OutputPath” MUST be a path, which is applied to the state’s output after the application of
     * ResultPath, leading in the generation of the raw input for the next state. If not provided then the whole output is
     * used.
     *
     * @param outputPath New path value.
     * @return This object for method chaining.
     */
    BuilderT outputPath(String outputPath);

}
