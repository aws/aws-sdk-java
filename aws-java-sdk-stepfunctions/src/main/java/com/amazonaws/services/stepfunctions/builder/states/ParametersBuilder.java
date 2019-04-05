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
 * Interface for all builders that expose the 'Parameters' field.
 *
 * <p>This interface should not be implemented outside the SDK.</p>
 *
 * @param <BuilderT> Type of concrete builder (for method chaining).
 */
public interface ParametersBuilder<BuilderT> {

    /**
     * OPTIONAL. The value of "Parameters" MUST be a valid JSON document. This field forms the effective input to the Task
     * if present. Values from the input to the state can be interpolated via a JSON path expression. To be interpolated the
     * field name of the JSON object must end in the suffix ".$". See example below.
     *
     * <p/>Given the following Parameters definition.
     * <pre>
     * {@code
     * {
     * ...
     *   "Parameters": {
     *      "flagged": true,
     *      "parts": {
     *         "first.$": "$.vals[0]",
     *         "last3.$": "$.vals[3:]"
     *      }
     *   }
     * ...
     * }
     * }
     * </pre>
     *
     * And suppose that the input to the state is as follows:
     * <pre>
     * {@code
     * {
     *    "flagged": 7,
     *    "vals": [0, 10, 20, 30, 40, 50]
     * }
     * }
     * </pre>
     *
     * Then the effective input to the task will be as follows:
     * <pre>
     * {@code
     * {
     *    "flagged": true,
     *    "parts": {
     *       "first": 0,
     *       "last3": [30, 40, 50]
     *    }
     * }
     * }
     * </pre>
     *
     * @param parameters Raw JSON string representing Parameters value.
     * @return This object for method chaining.
     */
    BuilderT parameters(String parameters);

    /**
     * OPTIONAL. The value of "Parameters" MUST be a valid JSON document. This field forms the effective input to the Task
     * if present. Values from the input to the state can be interpolated via a JSON path expression. To be interpolated the
     * field name of the JSON object must end in the suffix ".$". See example below.
     *
     * <p/>Given the following Parameters definition.
     * <pre>
     * {@code
     * {
     * ...
     *   "Parameters": {
     *      "flagged": true,
     *      "parts": {
     *         "first.$": "$.vals[0]",
     *         "last3.$": "$.vals[3:]"
     *      }
     *   }
     * ...
     * }
     * }
     * </pre>
     *
     * And suppose that the input to the state is as follows:
     * <pre>
     * {@code
     * {
     *    "flagged": 7,
     *    "vals": [0, 10, 20, 30, 40, 50]
     * }
     * }
     * </pre>
     *
     * Then the effective input to the task will be as follows:
     * <pre>
     * {@code
     * {
     *    "flagged": true,
     *    "parts": {
     *       "first": 0,
     *       "last3": [30, 40, 50]
     *    }
     * }
     * }
     * </pre>
     *
     * @param parameters Object that will be serialized into the JSON document representing this states parameters.
     * @return This object for method chaining.
     */
    BuilderT parameters(Object parameters);

}
