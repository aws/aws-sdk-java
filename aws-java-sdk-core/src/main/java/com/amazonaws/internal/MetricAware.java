/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.internal;

/**
 * Used to check if any metrics gathering activity is already turned on in one
 * of the underlying wrapped objects.
 */
public interface MetricAware {
    /**
     * Returns true if this object or one of it's inner wrapped objects has
     * metrics gathering activity turned on; false otherwise.
     */
    public boolean isMetricActivated();
}
