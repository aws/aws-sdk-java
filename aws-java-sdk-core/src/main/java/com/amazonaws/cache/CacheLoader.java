/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.cache;

/**
 * Calls downstream service to get the endpoint for a service.
 *
 * Requires a client instance and must transform request into endpoint discovery request
 * Reload uses an executor to asynchronously reload
 * @param <K>
 * @param <V>
 */
public interface CacheLoader<K, V> {

    V load(String key);
}
