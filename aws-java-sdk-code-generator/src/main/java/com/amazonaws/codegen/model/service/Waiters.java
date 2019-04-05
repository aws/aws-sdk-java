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

package com.amazonaws.codegen.model.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Waiters {

    public static final Waiters NONE = new Waiters(Collections.emptyMap());

    private final Map<String, WaiterDefinition> waiters;

    // Needed for JSON deserialization
    private Waiters() {
        this(new HashMap<>());
    }

    private Waiters(Map<String, WaiterDefinition> waiters){
        this.waiters = waiters;
    }

    public Map<String, WaiterDefinition> getWaiters() {
        return waiters;
    }

    public WaiterDefinition getWaiterDefinition(String waiterName){
        return waiters.get(waiterName);
    }

}
