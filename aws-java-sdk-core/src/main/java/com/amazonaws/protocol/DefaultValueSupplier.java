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
package com.amazonaws.protocol;

import com.amazonaws.annotation.SdkProtectedApi;

/**
 * Interface to provide a default value for a null member during marshalling. Currently used for
 * members that have the idempotency trait applied and for Glacier's account ID member (which defaults to '-' indicating
 * the current account).
 *
 * @param <T> Type of the member to provide the default value for.
 */
@SdkProtectedApi
public interface DefaultValueSupplier<T> {

    /**
     * @return The default value to use if the value is null.
     */
    T get();
}
