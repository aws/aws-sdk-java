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

package com.amazonaws.waiters;

import com.amazonaws.AmazonWebServiceRequest;

public final class WaiterParameters<Input extends AmazonWebServiceRequest> {

    /**
     * Represents the input of the operation.
     */
    private final Input request;

    /**
     * Represents the custom polling strategy. Will be null
     * if not defined
     */
    private final PollingStrategy pollingStrategy;

    public WaiterParameters() {
        this.request = null;
        this.pollingStrategy = null;
    }

    public WaiterParameters(Input request) {
        this.request = request;
        this.pollingStrategy = null;
    }

    /**
     * Constructs a new WaiterParameters with the given request
     * and polling strategy
     *
     * @param request         Input of the operation
     * @param pollingStrategy Custom polling strategy
     * @return WaiterParameters object with custom polling strategy defined
     */
    private WaiterParameters(Input request, PollingStrategy pollingStrategy) {
        this.request = request;
        this.pollingStrategy = pollingStrategy;
    }

    /**
     * Constructs a new WaiterParameters with the given request
     *
     * @param request Input of the operation
     * @return WaiterParameters Object
     */
    public WaiterParameters<Input> withRequest(Input request) {
        return new WaiterParameters<Input>(request, this.pollingStrategy);
    }

    /**
     * Constructs a new WaiterParameters with the given polling strategy
     *
     * @param pollingStrategy Custom polling strategy
     * @return WaiterParameters Object
     */
    public WaiterParameters<Input> withPollingStrategy(PollingStrategy pollingStrategy) {
        return new WaiterParameters<Input>(this.request, pollingStrategy);
    }

    /**
     * @return Input of the operation
     */
    public Input getRequest() {
        return this.request;
    }

    /**
     * @return Custom Polling Strategy
     */
    public PollingStrategy getPollingStrategy() {
        return this.pollingStrategy;
    }
}
