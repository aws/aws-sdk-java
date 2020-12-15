/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains parameters for a Lambda function that runs on AWS IoT Greengrass.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/LambdaExecutionParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaExecutionParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of event sources to which to subscribe to receive work messages. The Lambda function runs when it
     * receives a message from an event source. You can subscribe this function to local publish/subscribe messages and
     * AWS IoT Core MQTT messages.
     * </p>
     */
    private java.util.List<LambdaEventSource> eventSources;
    /**
     * <p>
     * The maximum size of the message queue for the Lambda function component. The AWS IoT Greengrass core stores
     * messages in a FIFO (first-in-first-out) queue until it can run the Lambda function to consume each message.
     * </p>
     */
    private Integer maxQueueSize;
    /**
     * <p>
     * The maximum number of instances that a non-pinned Lambda function can run at the same time.
     * </p>
     */
    private Integer maxInstancesCount;
    /**
     * <p>
     * The maximum amount of time in seconds that a non-pinned Lambda function can idle before the AWS IoT Greengrass
     * Core software stops its process.
     * </p>
     */
    private Integer maxIdleTimeInSeconds;
    /**
     * <p>
     * The maximum amount of time in seconds that the Lambda function can process a work item.
     * </p>
     */
    private Integer timeoutInSeconds;
    /**
     * <p>
     * The interval in seconds at which a pinned (also known as long-lived) Lambda function component sends status
     * updates to the Lambda manager component.
     * </p>
     */
    private Integer statusTimeoutInSeconds;
    /**
     * <p>
     * Whether or not the Lambda function is pinned, or long-lived.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A pinned Lambda function starts when AWS IoT Greengrass starts and keeps running in its own container.
     * </p>
     * </li>
     * <li>
     * <p>
     * A non-pinned Lambda function starts only when it receives a work item and exists after it idles for
     * <code>maxIdleTimeInSeconds</code>. If the function has multiple work items, the AWS IoT Greengrass Core software
     * creates multiple instances of the function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean pinned;
    /**
     * <p>
     * The encoding type that the Lambda function supports.
     * </p>
     * <p>
     * Default: <code>json</code>
     * </p>
     */
    private String inputPayloadEncodingType;
    /**
     * <p>
     * The list of arguments to pass to the Lambda function when it runs.
     * </p>
     */
    private java.util.List<String> execArgs;
    /**
     * <p>
     * The map of environment variables that are available to the Lambda function when it runs.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;
    /**
     * <p>
     * The parameters for the Linux process that contains the Lambda function.
     * </p>
     */
    private LambdaLinuxProcessParams linuxProcessParams;

    /**
     * <p>
     * The list of event sources to which to subscribe to receive work messages. The Lambda function runs when it
     * receives a message from an event source. You can subscribe this function to local publish/subscribe messages and
     * AWS IoT Core MQTT messages.
     * </p>
     * 
     * @return The list of event sources to which to subscribe to receive work messages. The Lambda function runs when
     *         it receives a message from an event source. You can subscribe this function to local publish/subscribe
     *         messages and AWS IoT Core MQTT messages.
     */

    public java.util.List<LambdaEventSource> getEventSources() {
        return eventSources;
    }

    /**
     * <p>
     * The list of event sources to which to subscribe to receive work messages. The Lambda function runs when it
     * receives a message from an event source. You can subscribe this function to local publish/subscribe messages and
     * AWS IoT Core MQTT messages.
     * </p>
     * 
     * @param eventSources
     *        The list of event sources to which to subscribe to receive work messages. The Lambda function runs when it
     *        receives a message from an event source. You can subscribe this function to local publish/subscribe
     *        messages and AWS IoT Core MQTT messages.
     */

    public void setEventSources(java.util.Collection<LambdaEventSource> eventSources) {
        if (eventSources == null) {
            this.eventSources = null;
            return;
        }

        this.eventSources = new java.util.ArrayList<LambdaEventSource>(eventSources);
    }

    /**
     * <p>
     * The list of event sources to which to subscribe to receive work messages. The Lambda function runs when it
     * receives a message from an event source. You can subscribe this function to local publish/subscribe messages and
     * AWS IoT Core MQTT messages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventSources(java.util.Collection)} or {@link #withEventSources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventSources
     *        The list of event sources to which to subscribe to receive work messages. The Lambda function runs when it
     *        receives a message from an event source. You can subscribe this function to local publish/subscribe
     *        messages and AWS IoT Core MQTT messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaExecutionParameters withEventSources(LambdaEventSource... eventSources) {
        if (this.eventSources == null) {
            setEventSources(new java.util.ArrayList<LambdaEventSource>(eventSources.length));
        }
        for (LambdaEventSource ele : eventSources) {
            this.eventSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of event sources to which to subscribe to receive work messages. The Lambda function runs when it
     * receives a message from an event source. You can subscribe this function to local publish/subscribe messages and
     * AWS IoT Core MQTT messages.
     * </p>
     * 
     * @param eventSources
     *        The list of event sources to which to subscribe to receive work messages. The Lambda function runs when it
     *        receives a message from an event source. You can subscribe this function to local publish/subscribe
     *        messages and AWS IoT Core MQTT messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaExecutionParameters withEventSources(java.util.Collection<LambdaEventSource> eventSources) {
        setEventSources(eventSources);
        return this;
    }

    /**
     * <p>
     * The maximum size of the message queue for the Lambda function component. The AWS IoT Greengrass core stores
     * messages in a FIFO (first-in-first-out) queue until it can run the Lambda function to consume each message.
     * </p>
     * 
     * @param maxQueueSize
     *        The maximum size of the message queue for the Lambda function component. The AWS IoT Greengrass core
     *        stores messages in a FIFO (first-in-first-out) queue until it can run the Lambda function to consume each
     *        message.
     */

    public void setMaxQueueSize(Integer maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
    }

    /**
     * <p>
     * The maximum size of the message queue for the Lambda function component. The AWS IoT Greengrass core stores
     * messages in a FIFO (first-in-first-out) queue until it can run the Lambda function to consume each message.
     * </p>
     * 
     * @return The maximum size of the message queue for the Lambda function component. The AWS IoT Greengrass core
     *         stores messages in a FIFO (first-in-first-out) queue until it can run the Lambda function to consume each
     *         message.
     */

    public Integer getMaxQueueSize() {
        return this.maxQueueSize;
    }

    /**
     * <p>
     * The maximum size of the message queue for the Lambda function component. The AWS IoT Greengrass core stores
     * messages in a FIFO (first-in-first-out) queue until it can run the Lambda function to consume each message.
     * </p>
     * 
     * @param maxQueueSize
     *        The maximum size of the message queue for the Lambda function component. The AWS IoT Greengrass core
     *        stores messages in a FIFO (first-in-first-out) queue until it can run the Lambda function to consume each
     *        message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaExecutionParameters withMaxQueueSize(Integer maxQueueSize) {
        setMaxQueueSize(maxQueueSize);
        return this;
    }

    /**
     * <p>
     * The maximum number of instances that a non-pinned Lambda function can run at the same time.
     * </p>
     * 
     * @param maxInstancesCount
     *        The maximum number of instances that a non-pinned Lambda function can run at the same time.
     */

    public void setMaxInstancesCount(Integer maxInstancesCount) {
        this.maxInstancesCount = maxInstancesCount;
    }

    /**
     * <p>
     * The maximum number of instances that a non-pinned Lambda function can run at the same time.
     * </p>
     * 
     * @return The maximum number of instances that a non-pinned Lambda function can run at the same time.
     */

    public Integer getMaxInstancesCount() {
        return this.maxInstancesCount;
    }

    /**
     * <p>
     * The maximum number of instances that a non-pinned Lambda function can run at the same time.
     * </p>
     * 
     * @param maxInstancesCount
     *        The maximum number of instances that a non-pinned Lambda function can run at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaExecutionParameters withMaxInstancesCount(Integer maxInstancesCount) {
        setMaxInstancesCount(maxInstancesCount);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time in seconds that a non-pinned Lambda function can idle before the AWS IoT Greengrass
     * Core software stops its process.
     * </p>
     * 
     * @param maxIdleTimeInSeconds
     *        The maximum amount of time in seconds that a non-pinned Lambda function can idle before the AWS IoT
     *        Greengrass Core software stops its process.
     */

    public void setMaxIdleTimeInSeconds(Integer maxIdleTimeInSeconds) {
        this.maxIdleTimeInSeconds = maxIdleTimeInSeconds;
    }

    /**
     * <p>
     * The maximum amount of time in seconds that a non-pinned Lambda function can idle before the AWS IoT Greengrass
     * Core software stops its process.
     * </p>
     * 
     * @return The maximum amount of time in seconds that a non-pinned Lambda function can idle before the AWS IoT
     *         Greengrass Core software stops its process.
     */

    public Integer getMaxIdleTimeInSeconds() {
        return this.maxIdleTimeInSeconds;
    }

    /**
     * <p>
     * The maximum amount of time in seconds that a non-pinned Lambda function can idle before the AWS IoT Greengrass
     * Core software stops its process.
     * </p>
     * 
     * @param maxIdleTimeInSeconds
     *        The maximum amount of time in seconds that a non-pinned Lambda function can idle before the AWS IoT
     *        Greengrass Core software stops its process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaExecutionParameters withMaxIdleTimeInSeconds(Integer maxIdleTimeInSeconds) {
        setMaxIdleTimeInSeconds(maxIdleTimeInSeconds);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time in seconds that the Lambda function can process a work item.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The maximum amount of time in seconds that the Lambda function can process a work item.
     */

    public void setTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * The maximum amount of time in seconds that the Lambda function can process a work item.
     * </p>
     * 
     * @return The maximum amount of time in seconds that the Lambda function can process a work item.
     */

    public Integer getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * The maximum amount of time in seconds that the Lambda function can process a work item.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The maximum amount of time in seconds that the Lambda function can process a work item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaExecutionParameters withTimeoutInSeconds(Integer timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * The interval in seconds at which a pinned (also known as long-lived) Lambda function component sends status
     * updates to the Lambda manager component.
     * </p>
     * 
     * @param statusTimeoutInSeconds
     *        The interval in seconds at which a pinned (also known as long-lived) Lambda function component sends
     *        status updates to the Lambda manager component.
     */

    public void setStatusTimeoutInSeconds(Integer statusTimeoutInSeconds) {
        this.statusTimeoutInSeconds = statusTimeoutInSeconds;
    }

    /**
     * <p>
     * The interval in seconds at which a pinned (also known as long-lived) Lambda function component sends status
     * updates to the Lambda manager component.
     * </p>
     * 
     * @return The interval in seconds at which a pinned (also known as long-lived) Lambda function component sends
     *         status updates to the Lambda manager component.
     */

    public Integer getStatusTimeoutInSeconds() {
        return this.statusTimeoutInSeconds;
    }

    /**
     * <p>
     * The interval in seconds at which a pinned (also known as long-lived) Lambda function component sends status
     * updates to the Lambda manager component.
     * </p>
     * 
     * @param statusTimeoutInSeconds
     *        The interval in seconds at which a pinned (also known as long-lived) Lambda function component sends
     *        status updates to the Lambda manager component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaExecutionParameters withStatusTimeoutInSeconds(Integer statusTimeoutInSeconds) {
        setStatusTimeoutInSeconds(statusTimeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * Whether or not the Lambda function is pinned, or long-lived.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A pinned Lambda function starts when AWS IoT Greengrass starts and keeps running in its own container.
     * </p>
     * </li>
     * <li>
     * <p>
     * A non-pinned Lambda function starts only when it receives a work item and exists after it idles for
     * <code>maxIdleTimeInSeconds</code>. If the function has multiple work items, the AWS IoT Greengrass Core software
     * creates multiple instances of the function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param pinned
     *        Whether or not the Lambda function is pinned, or long-lived.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A pinned Lambda function starts when AWS IoT Greengrass starts and keeps running in its own container.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A non-pinned Lambda function starts only when it receives a work item and exists after it idles for
     *        <code>maxIdleTimeInSeconds</code>. If the function has multiple work items, the AWS IoT Greengrass Core
     *        software creates multiple instances of the function.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>true</code>
     */

    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    /**
     * <p>
     * Whether or not the Lambda function is pinned, or long-lived.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A pinned Lambda function starts when AWS IoT Greengrass starts and keeps running in its own container.
     * </p>
     * </li>
     * <li>
     * <p>
     * A non-pinned Lambda function starts only when it receives a work item and exists after it idles for
     * <code>maxIdleTimeInSeconds</code>. If the function has multiple work items, the AWS IoT Greengrass Core software
     * creates multiple instances of the function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Whether or not the Lambda function is pinned, or long-lived.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A pinned Lambda function starts when AWS IoT Greengrass starts and keeps running in its own container.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A non-pinned Lambda function starts only when it receives a work item and exists after it idles for
     *         <code>maxIdleTimeInSeconds</code>. If the function has multiple work items, the AWS IoT Greengrass Core
     *         software creates multiple instances of the function.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean getPinned() {
        return this.pinned;
    }

    /**
     * <p>
     * Whether or not the Lambda function is pinned, or long-lived.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A pinned Lambda function starts when AWS IoT Greengrass starts and keeps running in its own container.
     * </p>
     * </li>
     * <li>
     * <p>
     * A non-pinned Lambda function starts only when it receives a work item and exists after it idles for
     * <code>maxIdleTimeInSeconds</code>. If the function has multiple work items, the AWS IoT Greengrass Core software
     * creates multiple instances of the function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param pinned
     *        Whether or not the Lambda function is pinned, or long-lived.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A pinned Lambda function starts when AWS IoT Greengrass starts and keeps running in its own container.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A non-pinned Lambda function starts only when it receives a work item and exists after it idles for
     *        <code>maxIdleTimeInSeconds</code>. If the function has multiple work items, the AWS IoT Greengrass Core
     *        software creates multiple instances of the function.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaExecutionParameters withPinned(Boolean pinned) {
        setPinned(pinned);
        return this;
    }

    /**
     * <p>
     * Whether or not the Lambda function is pinned, or long-lived.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A pinned Lambda function starts when AWS IoT Greengrass starts and keeps running in its own container.
     * </p>
     * </li>
     * <li>
     * <p>
     * A non-pinned Lambda function starts only when it receives a work item and exists after it idles for
     * <code>maxIdleTimeInSeconds</code>. If the function has multiple work items, the AWS IoT Greengrass Core software
     * creates multiple instances of the function.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Whether or not the Lambda function is pinned, or long-lived.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A pinned Lambda function starts when AWS IoT Greengrass starts and keeps running in its own container.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A non-pinned Lambda function starts only when it receives a work item and exists after it idles for
     *         <code>maxIdleTimeInSeconds</code>. If the function has multiple work items, the AWS IoT Greengrass Core
     *         software creates multiple instances of the function.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean isPinned() {
        return this.pinned;
    }

    /**
     * <p>
     * The encoding type that the Lambda function supports.
     * </p>
     * <p>
     * Default: <code>json</code>
     * </p>
     * 
     * @param inputPayloadEncodingType
     *        The encoding type that the Lambda function supports.</p>
     *        <p>
     *        Default: <code>json</code>
     * @see LambdaInputPayloadEncodingType
     */

    public void setInputPayloadEncodingType(String inputPayloadEncodingType) {
        this.inputPayloadEncodingType = inputPayloadEncodingType;
    }

    /**
     * <p>
     * The encoding type that the Lambda function supports.
     * </p>
     * <p>
     * Default: <code>json</code>
     * </p>
     * 
     * @return The encoding type that the Lambda function supports.</p>
     *         <p>
     *         Default: <code>json</code>
     * @see LambdaInputPayloadEncodingType
     */

    public String getInputPayloadEncodingType() {
        return this.inputPayloadEncodingType;
    }

    /**
     * <p>
     * The encoding type that the Lambda function supports.
     * </p>
     * <p>
     * Default: <code>json</code>
     * </p>
     * 
     * @param inputPayloadEncodingType
     *        The encoding type that the Lambda function supports.</p>
     *        <p>
     *        Default: <code>json</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaInputPayloadEncodingType
     */

    public LambdaExecutionParameters withInputPayloadEncodingType(String inputPayloadEncodingType) {
        setInputPayloadEncodingType(inputPayloadEncodingType);
        return this;
    }

    /**
     * <p>
     * The encoding type that the Lambda function supports.
     * </p>
     * <p>
     * Default: <code>json</code>
     * </p>
     * 
     * @param inputPayloadEncodingType
     *        The encoding type that the Lambda function supports.</p>
     *        <p>
     *        Default: <code>json</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaInputPayloadEncodingType
     */

    public LambdaExecutionParameters withInputPayloadEncodingType(LambdaInputPayloadEncodingType inputPayloadEncodingType) {
        this.inputPayloadEncodingType = inputPayloadEncodingType.toString();
        return this;
    }

    /**
     * <p>
     * The list of arguments to pass to the Lambda function when it runs.
     * </p>
     * 
     * @return The list of arguments to pass to the Lambda function when it runs.
     */

    public java.util.List<String> getExecArgs() {
        return execArgs;
    }

    /**
     * <p>
     * The list of arguments to pass to the Lambda function when it runs.
     * </p>
     * 
     * @param execArgs
     *        The list of arguments to pass to the Lambda function when it runs.
     */

    public void setExecArgs(java.util.Collection<String> execArgs) {
        if (execArgs == null) {
            this.execArgs = null;
            return;
        }

        this.execArgs = new java.util.ArrayList<String>(execArgs);
    }

    /**
     * <p>
     * The list of arguments to pass to the Lambda function when it runs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExecArgs(java.util.Collection)} or {@link #withExecArgs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param execArgs
     *        The list of arguments to pass to the Lambda function when it runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaExecutionParameters withExecArgs(String... execArgs) {
        if (this.execArgs == null) {
            setExecArgs(new java.util.ArrayList<String>(execArgs.length));
        }
        for (String ele : execArgs) {
            this.execArgs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of arguments to pass to the Lambda function when it runs.
     * </p>
     * 
     * @param execArgs
     *        The list of arguments to pass to the Lambda function when it runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaExecutionParameters withExecArgs(java.util.Collection<String> execArgs) {
        setExecArgs(execArgs);
        return this;
    }

    /**
     * <p>
     * The map of environment variables that are available to the Lambda function when it runs.
     * </p>
     * 
     * @return The map of environment variables that are available to the Lambda function when it runs.
     */

    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * The map of environment variables that are available to the Lambda function when it runs.
     * </p>
     * 
     * @param environmentVariables
     *        The map of environment variables that are available to the Lambda function when it runs.
     */

    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * The map of environment variables that are available to the Lambda function when it runs.
     * </p>
     * 
     * @param environmentVariables
     *        The map of environment variables that are available to the Lambda function when it runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaExecutionParameters withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * Add a single EnvironmentVariables entry
     *
     * @see LambdaExecutionParameters#withEnvironmentVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LambdaExecutionParameters addEnvironmentVariablesEntry(String key, String value) {
        if (null == this.environmentVariables) {
            this.environmentVariables = new java.util.HashMap<String, String>();
        }
        if (this.environmentVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environmentVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EnvironmentVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaExecutionParameters clearEnvironmentVariablesEntries() {
        this.environmentVariables = null;
        return this;
    }

    /**
     * <p>
     * The parameters for the Linux process that contains the Lambda function.
     * </p>
     * 
     * @param linuxProcessParams
     *        The parameters for the Linux process that contains the Lambda function.
     */

    public void setLinuxProcessParams(LambdaLinuxProcessParams linuxProcessParams) {
        this.linuxProcessParams = linuxProcessParams;
    }

    /**
     * <p>
     * The parameters for the Linux process that contains the Lambda function.
     * </p>
     * 
     * @return The parameters for the Linux process that contains the Lambda function.
     */

    public LambdaLinuxProcessParams getLinuxProcessParams() {
        return this.linuxProcessParams;
    }

    /**
     * <p>
     * The parameters for the Linux process that contains the Lambda function.
     * </p>
     * 
     * @param linuxProcessParams
     *        The parameters for the Linux process that contains the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaExecutionParameters withLinuxProcessParams(LambdaLinuxProcessParams linuxProcessParams) {
        setLinuxProcessParams(linuxProcessParams);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEventSources() != null)
            sb.append("EventSources: ").append(getEventSources()).append(",");
        if (getMaxQueueSize() != null)
            sb.append("MaxQueueSize: ").append(getMaxQueueSize()).append(",");
        if (getMaxInstancesCount() != null)
            sb.append("MaxInstancesCount: ").append(getMaxInstancesCount()).append(",");
        if (getMaxIdleTimeInSeconds() != null)
            sb.append("MaxIdleTimeInSeconds: ").append(getMaxIdleTimeInSeconds()).append(",");
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: ").append(getTimeoutInSeconds()).append(",");
        if (getStatusTimeoutInSeconds() != null)
            sb.append("StatusTimeoutInSeconds: ").append(getStatusTimeoutInSeconds()).append(",");
        if (getPinned() != null)
            sb.append("Pinned: ").append(getPinned()).append(",");
        if (getInputPayloadEncodingType() != null)
            sb.append("InputPayloadEncodingType: ").append(getInputPayloadEncodingType()).append(",");
        if (getExecArgs() != null)
            sb.append("ExecArgs: ").append(getExecArgs()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables()).append(",");
        if (getLinuxProcessParams() != null)
            sb.append("LinuxProcessParams: ").append(getLinuxProcessParams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaExecutionParameters == false)
            return false;
        LambdaExecutionParameters other = (LambdaExecutionParameters) obj;
        if (other.getEventSources() == null ^ this.getEventSources() == null)
            return false;
        if (other.getEventSources() != null && other.getEventSources().equals(this.getEventSources()) == false)
            return false;
        if (other.getMaxQueueSize() == null ^ this.getMaxQueueSize() == null)
            return false;
        if (other.getMaxQueueSize() != null && other.getMaxQueueSize().equals(this.getMaxQueueSize()) == false)
            return false;
        if (other.getMaxInstancesCount() == null ^ this.getMaxInstancesCount() == null)
            return false;
        if (other.getMaxInstancesCount() != null && other.getMaxInstancesCount().equals(this.getMaxInstancesCount()) == false)
            return false;
        if (other.getMaxIdleTimeInSeconds() == null ^ this.getMaxIdleTimeInSeconds() == null)
            return false;
        if (other.getMaxIdleTimeInSeconds() != null && other.getMaxIdleTimeInSeconds().equals(this.getMaxIdleTimeInSeconds()) == false)
            return false;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        if (other.getStatusTimeoutInSeconds() == null ^ this.getStatusTimeoutInSeconds() == null)
            return false;
        if (other.getStatusTimeoutInSeconds() != null && other.getStatusTimeoutInSeconds().equals(this.getStatusTimeoutInSeconds()) == false)
            return false;
        if (other.getPinned() == null ^ this.getPinned() == null)
            return false;
        if (other.getPinned() != null && other.getPinned().equals(this.getPinned()) == false)
            return false;
        if (other.getInputPayloadEncodingType() == null ^ this.getInputPayloadEncodingType() == null)
            return false;
        if (other.getInputPayloadEncodingType() != null && other.getInputPayloadEncodingType().equals(this.getInputPayloadEncodingType()) == false)
            return false;
        if (other.getExecArgs() == null ^ this.getExecArgs() == null)
            return false;
        if (other.getExecArgs() != null && other.getExecArgs().equals(this.getExecArgs()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        if (other.getLinuxProcessParams() == null ^ this.getLinuxProcessParams() == null)
            return false;
        if (other.getLinuxProcessParams() != null && other.getLinuxProcessParams().equals(this.getLinuxProcessParams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventSources() == null) ? 0 : getEventSources().hashCode());
        hashCode = prime * hashCode + ((getMaxQueueSize() == null) ? 0 : getMaxQueueSize().hashCode());
        hashCode = prime * hashCode + ((getMaxInstancesCount() == null) ? 0 : getMaxInstancesCount().hashCode());
        hashCode = prime * hashCode + ((getMaxIdleTimeInSeconds() == null) ? 0 : getMaxIdleTimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getStatusTimeoutInSeconds() == null) ? 0 : getStatusTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getPinned() == null) ? 0 : getPinned().hashCode());
        hashCode = prime * hashCode + ((getInputPayloadEncodingType() == null) ? 0 : getInputPayloadEncodingType().hashCode());
        hashCode = prime * hashCode + ((getExecArgs() == null) ? 0 : getExecArgs().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        hashCode = prime * hashCode + ((getLinuxProcessParams() == null) ? 0 : getLinuxProcessParams().hashCode());
        return hashCode;
    }

    @Override
    public LambdaExecutionParameters clone() {
        try {
            return (LambdaExecutionParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.LambdaExecutionParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
