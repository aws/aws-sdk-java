/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.gamelift.model;

import javax.annotation.Generated;

/**
 * <p>
 * The service is unable to resolve the routing for a particular alias because it has a terminal <a>RoutingStrategy</a>
 * associated with it. The message returned in this exception is the message defined in the routing strategy itself.
 * Such requests should only be retried if the routing strategy for the specified alias is modified.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminalRoutingStrategyException extends com.amazonaws.services.gamelift.model.AmazonGameLiftException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TerminalRoutingStrategyException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TerminalRoutingStrategyException(String message) {
        super(message);
    }

}
