/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Interface for all builders that expose the 'ResultSelector' field.
 *
 * <p>This interface should not be implemented outside the SDK.</p>
 *
 * @param <BuilderT> Type of concrete builder (for method chaining).
 */
public interface ResultSelectorBuilder<BuilderT> {
    /**
     * OPTIONAL. The value of "ResultSelector" MUST be a Payload Template which is a JSON object, whose input is the result,
     * and whose payload replaces and becomes the effective result. Values from the result of the state can be interpolated
     * via a JSON path expression. To be interpolated the field name of the JSON object must end in the suffix ".$". See example below.
     *
     * </p>Given the following ResultSelector and ResultPath definition.
     * <pre>
     * {@code
     * {
     * ...
     *   "ResultSelector": {
     *     "ClusterId.$": "$.output.ClusterId",
     *     "ResourceType.$": "$.resourceType"
     *   },
     *   "ResultPath": "$.EMROutput"
     * ...
     * }
     * }
     * </pre>
     *
     * Suppose the result of the Task is as follows:
     * <pre>
     * {@code
     * {
     * ...
     *   "resourceType": "elasticmapreduce",
     *   "output": {
     *     "ClusterId": "AKIAIOSFODNN7EXAMPLE"
     *   }
     * ...
     * }
     * }
     * </pre>
     *
     * Then the effective result from the task will be as follows:
     * <pre>
     * {@code
     * {
     * ...
     *   "EMROutput": {
     *     "ClusterId": "AKIAIOSFODNN7EXAMPLE",
     *     "ResourceType": "elasticmapreduce"
     *   }
     * ...
     * }
     *
     * }
     * </pre>
     *
     * @param resultSelector Raw JSON string representing ResultSelector value.
     * @return This object for method chaining.
     */
    BuilderT resultSelector(String resultSelector);

    /**
     * OPTIONAL. The value of "ResultSelector" MUST be a Payload Template which is a JSON object, whose input is the result,
     * and whose payload replaces and becomes the effective result. Values from the result of the state can be interpolated
     * via a JSON path expression. To be interpolated the field name of the JSON object must end in the suffix ".$". See example below.
     *
     * </p>Given the following ResultSelector and ResultPath definition.
     * <pre>
     * {@code
     * {
     * ...
     *   "ResultSelector": {
     *     "ClusterId.$": "$.output.ClusterId",
     *     "ResourceType.$": "$.resourceType"
     *   },
     *   "ResultPath": "$.EMROutput"
     * ...
     * }
     * }
     * </pre>
     *
     * Suppose the result of the Task is as follows:
     * <pre>
     * {@code
     * {
     * ...
     *   "resourceType": "elasticmapreduce",
     *   "output": {
     *     "ClusterId": "AKIAIOSFODNN7EXAMPLE"
     *   }
     * ...
     * }
     * }
     * </pre>
     *
     * Then the effective result from the task will be as follows:
     * <pre>
     * {@code
     * {
     * ...
     *   "EMROutput": {
     *     "ClusterId": "AKIAIOSFODNN7EXAMPLE",
     *     "ResourceType": "elasticmapreduce"
     *   }
     * ...
     * }
     *
     * }
     * </pre>
     *
     * @param resultSelector Object that will be serialized into the JSON document representing this state's ResultSelector.
     * @return This object for method chaining.
     */
    BuilderT resultSelector(Object resultSelector);
}
