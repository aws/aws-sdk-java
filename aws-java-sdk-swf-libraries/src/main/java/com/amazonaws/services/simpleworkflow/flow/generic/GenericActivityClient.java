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
package com.amazonaws.services.simpleworkflow.flow.generic;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;

public interface GenericActivityClient {

    /**
     * Used to dynamically schedule an activity for execution
     * 
     * @param parameters
     *            An object which encapsulates all the information required to
     *            schedule an activity for execution
     * @return Promise to the result returned by the activity
     */
    public abstract Promise<String> scheduleActivityTask(ExecuteActivityParameters parameters);

    /**
     * Used to dynamically schedule an activity for execution
     * 
     * @param activity
     *            Name of activity
     * @param input
     *            A map of all input parameters to that activity
     * @return Promise to a result returned by the activity
     */
    public abstract Promise<String> scheduleActivityTask(String activity, String version, String input);

    /**
     * Used to dynamically schedule an activity using its name
     * 
     * @param activity
     *            name of activity to schedule
     * @param input
     *            a Value containing a map of all input parameters to that
     *            activity
     * @return a Value which contains a Map of results returned by the activity
     */
    public abstract Promise<String> scheduleActivityTask(final String activity, final String version, final Promise<String> input);

}
