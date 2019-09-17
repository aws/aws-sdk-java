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

/**
 * Supported protocols for the new marshalling style. Currently only includes JSON based services.
 */
public enum Protocol {

    /**
     * RPC protocol that sends all data in the payload as JSON and sends the X-Amz-Target header to indicate the
     * operation to invoke.
     */
    AWS_JSON,

    /**
     * Protocol that supports RESTful bindings. Members can be bound to the headers, query params, path, or payload. Supports
     * binary and streaming data. Operation is identified by HTTP verb and resource path combination.
     */
    REST_JSON,

    /**
     * A variation of REST_JSON for externally generated, API Gateway clients.
     */
    API_GATEWAY
}
