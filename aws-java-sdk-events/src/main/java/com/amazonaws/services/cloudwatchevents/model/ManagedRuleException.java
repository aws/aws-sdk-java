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
package com.amazonaws.services.cloudwatchevents.model;

import javax.annotation.Generated;

/**
 * <p>
 * This rule was created by an AWS service on behalf of your account. It is managed by that service. If you see this
 * error in response to <code>DeleteRule</code> or <code>RemoveTargets</code>, you can use the <code>Force</code>
 * parameter in those calls to delete the rule or remove targets from the rule. You cannot modify these managed rules by
 * using <code>DisableRule</code>, <code>EnableRule</code>, <code>PutTargets</code>, <code>PutRule</code>,
 * <code>TagResource</code>, or <code>UntagResource</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedRuleException extends com.amazonaws.services.cloudwatchevents.model.AmazonCloudWatchEventsException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ManagedRuleException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ManagedRuleException(String message) {
        super(message);
    }

}
