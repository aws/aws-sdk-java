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
package com.amazonaws.services.simpleworkflow.flow;

import java.util.Map;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.ContinueAsNewWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.ExecuteActivityParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.SignalExternalWorkflowParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.StartChildWorkflowExecutionParameters;
/**
 */
public interface DynamicClient {

  
    /**
     * Used to dynamically schedule an activity using its name
     * 
     * @param activity 
     *      name of activity to schedule
     * @param input
     *      a Value containing a map of all input parameters to that activity 
     * @return
     *      a Value which contains a Map of results returned by the activity
     */
    public Promise<Map<String, Object>> scheduleActivityTask(final String activity, final String version, 
            final Promise<Object[]> input);

    /**
     * Used to dynamically schedule an activity for execution
     * 
     * @param activity
     *      Name of activity
     * @param input
     *      A map of all input parameters to that activity
     * @return
     *      A Value which contains a Map of results returned by the activity
     */
    public abstract Promise<Map<String, Object>> scheduleActivityTask(String activity, String version, Object[] input);
    
    /**
     * Used to dynamically schedule an activity for execution
     * 
     * @param parameters
     *      An object which encapsulates all the information required to schedule an activity
     *      for execution
     * @return
     *      An object which can be used to cancel the activity or retrieve the Value 
     *      containing the result for the activity
     */
    public abstract Promise<String> scheduleActivityTask(ExecuteActivityParameters parameters);

    /**
     * Used to dynamically schedule an activity for execution
     * 
     * @param activity
     *      Name of activity
     * @param input
     *      A map of all input parameters to that activity
     * @param converter
     *      Data converter to use for serialization of input parameters and deserialization of
     *      output result
     * @return
     *      A Value which contains a Map of results returned by the activity
     */
    public abstract Promise<Map<String, Object>> scheduleActivityTask(String activity, String version, 
            Object[] input, DataConverter converter);
    
    public abstract Promise<String> startChildWorkflow(StartChildWorkflowExecutionParameters parameters);
    
    public abstract Promise<Map<String, Object>> startChildWorkflow(String workflow, String version, Object[] input);
    
    public abstract Promise<Map<String, Object>> startChildWorkflow(String workflow, String version, 
            Object[] input, DataConverter converter);
    
    public abstract Promise<Map<String, Object>> startChildWorkflow(final String workflow, final String version, 
            final Promise<Object[]> input);

    public abstract Promise<Void> signalWorkflowExecution(SignalExternalWorkflowParameters parameters);

    /**
     * Start a new generation of the workflow instance.
     * 
     * @param input
     *      Map containing input parameters to the workflow
     */
    public abstract void continueAsNewOnCompletion(Object[] input);
    
    public abstract void continueAsNewOnCompletion(ContinueAsNewWorkflowExecutionParameters parameters);
    
}
