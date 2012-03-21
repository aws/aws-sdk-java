/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow.examples.common;

import com.amazonaws.services.simpleworkflow.flow.common.FlowConstants;

public final class RegistrationDefaults {
	private static final long SECONDS_IN_MINUTE = 60;
    //private static final long SECONDS_IN_HOUR = 60 * SECONDS_IN_MINUTE;
    //private static final long SECONDS_IN_DAY = 24 * SECONDS_IN_HOUR;

    public static final long ACTIVITY_REGISTRATION_OPTIONS_DEFAULT_TASK_SCHEDULE_TO_START_TIMEOUT_SECONDS = FlowConstants.NONE;
    public static final long ACTIVITY_REGISTRATION_OPTIONS_DEFAULT_TASK_HEARTBEAT_TIMEOUT_SECONDS = FlowConstants.NONE;
    public static final long ACTIVITY_REGISTRATION_OPTIONS_DEFAULT_TASK_SCHEDULE_TO_CLOSE_TIMEOUT_SECONDS = 5 * SECONDS_IN_MINUTE;
    public static final long ACTIVITY_REGISTRATION_OPTIONS_DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_SECONDS =  5 * SECONDS_IN_MINUTE;
    
    public static final long WORKFLOW_REGISTRATION_OPTIONS_DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_SECONDS =  10 * SECONDS_IN_MINUTE;
    public static final long WORKFLOW_REGISTRATION_OPTIONS_DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_SECONDS =  1 * SECONDS_IN_MINUTE;

}
