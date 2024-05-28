/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import javax.annotation.Generated;

/**
 * <p>
 * For <code>PutInsightSelectors</code>, this exception is thrown when the formatting or syntax of the
 * <code>InsightSelectors</code> JSON statement is not valid, or the specified <code>InsightType</code> in the
 * <code>InsightSelectors</code> statement is not valid. Valid values for <code>InsightType</code> are
 * <code>ApiCallRateInsight</code> and <code>ApiErrorRateInsight</code>. To enable Insights on an event data store, the
 * destination event data store specified by the <code>InsightsDestination</code> parameter must log Insights events and
 * the source event data store specified by the <code>EventDataStore</code> parameter must log management events.
 * </p>
 * <p>
 * For <code>UpdateEventDataStore</code>, this exception is thrown if Insights are enabled on the event data store and
 * the updated advanced event selectors are not compatible with the configured <code>InsightSelectors</code>. If the
 * <code>InsightSelectors</code> includes an <code>InsightType</code> of <code>ApiCallRateInsight</code>, the source
 * event data store must log <code>write</code> management events. If the <code>InsightSelectors</code> includes an
 * <code>InsightType</code> of <code>ApiErrorRateInsight</code>, the source event data store must log management events.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidInsightSelectorsException extends com.amazonaws.services.cloudtrail.model.AWSCloudTrailException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidInsightSelectorsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidInsightSelectorsException(String message) {
        super(message);
    }

}
