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
package com.amazonaws.services.simpleworkflow.flow.common;

public final class FlowConstants {

    public static final int NONE = -1;

    public static final int USE_REGISTERED_DEFAULTS = -2;

    /**
     * Do not specify task list on registration. Which means that task list is
     * required when scheduling activity.
     */
    public static final String NO_DEFAULT_TASK_LIST = "NO_DEFAULT_TASK_LIST";

    /**
     * Use task list of the {@link ActivityWorker} or {@link WorkflowWorker}
     * that is used to register activity or workflow as the defalt task list for
     * the activity or workflow type.
     */
    public static final String USE_WORKER_TASK_LIST = "USE_WORKER_TASK_LIST";

}
