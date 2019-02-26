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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about the remote access session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/RemoteAccessSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoteAccessSession implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the remote access session.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the remote access session.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The date and time the remote access session was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The status of the remote access session. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_CONCURRENCY: A pending concurrency status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_DEVICE: A pending device status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING: A processing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULING: A scheduling status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING: A preparing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING: A running status.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED: A completed status.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING: A stopping status.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The result of the remote access session. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * PASSED: A passing condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * WARNED: A warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: A failed condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED: A skipped condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERRORED: An error condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED: A stopped condition.
     * </p>
     * </li>
     * </ul>
     */
    private String result;
    /**
     * <p>
     * A message about the remote access session.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The date and time the remote access session was started.
     * </p>
     */
    private java.util.Date started;
    /**
     * <p>
     * The date and time the remote access session was stopped.
     * </p>
     */
    private java.util.Date stopped;
    /**
     * <p>
     * The device (phone or tablet) used in the remote access session.
     * </p>
     */
    private Device device;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * This flag is set to <code>true</code> if remote debugging is enabled for the remote access session.
     * </p>
     */
    private Boolean remoteDebugEnabled;
    /**
     * <p>
     * This flag is set to <code>true</code> if remote recording is enabled for the remote access session.
     * </p>
     */
    private Boolean remoteRecordEnabled;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the app to be recorded in the remote access session.
     * </p>
     */
    private String remoteRecordAppArn;
    /**
     * <p>
     * IP address of the EC2 host where you need to connect to remotely debug devices. Only returned if remote debugging
     * is enabled for the remote access session.
     * </p>
     */
    private String hostAddress;
    /**
     * <p>
     * Unique identifier of your client for the remote access session. Only returned if remote debugging is enabled for
     * the remote access session.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The billing method of the remote access session. Possible values include <code>METERED</code> or
     * <code>UNMETERED</code>. For more information about metered devices, see <a
     * href="https://docs.aws.amazon.com/devicefarm/latest/developerguide/welcome.html#welcome-terminology">AWS Device
     * Farm terminology</a>."
     * </p>
     */
    private String billingMethod;
    /**
     * <p>
     * The number of minutes a device is used in a remote access sesssion (including setup and teardown minutes).
     * </p>
     */
    private DeviceMinutes deviceMinutes;
    /**
     * <p>
     * The endpoint for the remote access sesssion.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * Unique device identifier for the remote device. Only returned if remote debugging is enabled for the remote
     * access session.
     * </p>
     */
    private String deviceUdid;
    /**
     * <p>
     * The interaction mode of the remote access session. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You
     * <b>cannot</b> run XCUITest framework-based tests in this mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_VIDEO: You are connected to the device but cannot interact with it or view the screen. This mode has the
     * fastest test execution speed. You <b>can</b> run XCUITest framework-based tests in this mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO_ONLY: You can view the screen but cannot touch or rotate it. You <b>can</b> run XCUITest framework-based
     * tests and watch the screen in this mode.
     * </p>
     * </li>
     * </ul>
     */
    private String interactionMode;
    /**
     * <p>
     * When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public devices,
     * Device Farm always signs your apps again and this parameter has no effect.
     * </p>
     * <p>
     * For more information about how Device Farm re-signs your app(s), see <a
     * href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm FAQs</i>.
     * </p>
     */
    private Boolean skipAppResign;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the remote access session.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the remote access session.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the remote access session.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the remote access session.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the remote access session.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the remote access session.
     * </p>
     * 
     * @param name
     *        The name of the remote access session.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the remote access session.
     * </p>
     * 
     * @return The name of the remote access session.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the remote access session.
     * </p>
     * 
     * @param name
     *        The name of the remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The date and time the remote access session was created.
     * </p>
     * 
     * @param created
     *        The date and time the remote access session was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time the remote access session was created.
     * </p>
     * 
     * @return The date and time the remote access session was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date and time the remote access session was created.
     * </p>
     * 
     * @param created
     *        The date and time the remote access session was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The status of the remote access session. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_CONCURRENCY: A pending concurrency status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_DEVICE: A pending device status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING: A processing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULING: A scheduling status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING: A preparing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING: A running status.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED: A completed status.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING: A stopping status.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the remote access session. Can be any of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_CONCURRENCY: A pending concurrency status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_DEVICE: A pending device status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PROCESSING: A processing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULING: A scheduling status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARING: A preparing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING: A running status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED: A completed status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPING: A stopping status.
     *        </p>
     *        </li>
     * @see ExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the remote access session. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_CONCURRENCY: A pending concurrency status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_DEVICE: A pending device status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING: A processing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULING: A scheduling status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING: A preparing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING: A running status.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED: A completed status.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING: A stopping status.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the remote access session. Can be any of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PENDING: A pending status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PENDING_CONCURRENCY: A pending concurrency status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PENDING_DEVICE: A pending device status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PROCESSING: A processing status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SCHEDULING: A scheduling status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PREPARING: A preparing status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RUNNING: A running status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         COMPLETED: A completed status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STOPPING: A stopping status.
     *         </p>
     *         </li>
     * @see ExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the remote access session. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_CONCURRENCY: A pending concurrency status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_DEVICE: A pending device status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING: A processing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULING: A scheduling status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING: A preparing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING: A running status.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED: A completed status.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING: A stopping status.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the remote access session. Can be any of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_CONCURRENCY: A pending concurrency status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_DEVICE: A pending device status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PROCESSING: A processing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULING: A scheduling status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARING: A preparing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING: A running status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED: A completed status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPING: A stopping status.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public RemoteAccessSession withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the remote access session. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_CONCURRENCY: A pending concurrency status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_DEVICE: A pending device status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING: A processing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULING: A scheduling status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING: A preparing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING: A running status.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED: A completed status.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING: A stopping status.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the remote access session. Can be any of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_CONCURRENCY: A pending concurrency status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_DEVICE: A pending device status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PROCESSING: A processing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULING: A scheduling status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARING: A preparing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING: A running status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED: A completed status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPING: A stopping status.
     *        </p>
     *        </li>
     * @see ExecutionStatus
     */

    public void setStatus(ExecutionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the remote access session. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_CONCURRENCY: A pending concurrency status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PENDING_DEVICE: A pending device status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PROCESSING: A processing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULING: A scheduling status.
     * </p>
     * </li>
     * <li>
     * <p>
     * PREPARING: A preparing status.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING: A running status.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETED: A completed status.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPING: A stopping status.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the remote access session. Can be any of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_CONCURRENCY: A pending concurrency status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PENDING_DEVICE: A pending device status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PROCESSING: A processing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULING: A scheduling status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PREPARING: A preparing status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING: A running status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETED: A completed status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPING: A stopping status.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public RemoteAccessSession withStatus(ExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The result of the remote access session. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * PASSED: A passing condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * WARNED: A warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: A failed condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED: A skipped condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERRORED: An error condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED: A stopped condition.
     * </p>
     * </li>
     * </ul>
     * 
     * @param result
     *        The result of the remote access session. Can be any of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PASSED: A passing condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WARNED: A warning condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED: A failed condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SKIPPED: A skipped condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ERRORED: An error condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPED: A stopped condition.
     *        </p>
     *        </li>
     * @see ExecutionResult
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * <p>
     * The result of the remote access session. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * PASSED: A passing condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * WARNED: A warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: A failed condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED: A skipped condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERRORED: An error condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED: A stopped condition.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The result of the remote access session. Can be any of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PENDING: A pending condition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PASSED: A passing condition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         WARNED: A warning condition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FAILED: A failed condition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SKIPPED: A skipped condition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ERRORED: An error condition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STOPPED: A stopped condition.
     *         </p>
     *         </li>
     * @see ExecutionResult
     */

    public String getResult() {
        return this.result;
    }

    /**
     * <p>
     * The result of the remote access session. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * PASSED: A passing condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * WARNED: A warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: A failed condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED: A skipped condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERRORED: An error condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED: A stopped condition.
     * </p>
     * </li>
     * </ul>
     * 
     * @param result
     *        The result of the remote access session. Can be any of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PASSED: A passing condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WARNED: A warning condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED: A failed condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SKIPPED: A skipped condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ERRORED: An error condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPED: A stopped condition.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionResult
     */

    public RemoteAccessSession withResult(String result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * The result of the remote access session. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * PASSED: A passing condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * WARNED: A warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: A failed condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED: A skipped condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERRORED: An error condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED: A stopped condition.
     * </p>
     * </li>
     * </ul>
     * 
     * @param result
     *        The result of the remote access session. Can be any of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PASSED: A passing condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WARNED: A warning condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED: A failed condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SKIPPED: A skipped condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ERRORED: An error condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPED: A stopped condition.
     *        </p>
     *        </li>
     * @see ExecutionResult
     */

    public void setResult(ExecutionResult result) {
        withResult(result);
    }

    /**
     * <p>
     * The result of the remote access session. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING: A pending condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * PASSED: A passing condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * WARNED: A warning condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED: A failed condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * SKIPPED: A skipped condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * ERRORED: An error condition.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOPPED: A stopped condition.
     * </p>
     * </li>
     * </ul>
     * 
     * @param result
     *        The result of the remote access session. Can be any of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING: A pending condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PASSED: A passing condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        WARNED: A warning condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED: A failed condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SKIPPED: A skipped condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ERRORED: An error condition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOPPED: A stopped condition.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionResult
     */

    public RemoteAccessSession withResult(ExecutionResult result) {
        this.result = result.toString();
        return this;
    }

    /**
     * <p>
     * A message about the remote access session.
     * </p>
     * 
     * @param message
     *        A message about the remote access session.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message about the remote access session.
     * </p>
     * 
     * @return A message about the remote access session.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message about the remote access session.
     * </p>
     * 
     * @param message
     *        A message about the remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The date and time the remote access session was started.
     * </p>
     * 
     * @param started
     *        The date and time the remote access session was started.
     */

    public void setStarted(java.util.Date started) {
        this.started = started;
    }

    /**
     * <p>
     * The date and time the remote access session was started.
     * </p>
     * 
     * @return The date and time the remote access session was started.
     */

    public java.util.Date getStarted() {
        return this.started;
    }

    /**
     * <p>
     * The date and time the remote access session was started.
     * </p>
     * 
     * @param started
     *        The date and time the remote access session was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withStarted(java.util.Date started) {
        setStarted(started);
        return this;
    }

    /**
     * <p>
     * The date and time the remote access session was stopped.
     * </p>
     * 
     * @param stopped
     *        The date and time the remote access session was stopped.
     */

    public void setStopped(java.util.Date stopped) {
        this.stopped = stopped;
    }

    /**
     * <p>
     * The date and time the remote access session was stopped.
     * </p>
     * 
     * @return The date and time the remote access session was stopped.
     */

    public java.util.Date getStopped() {
        return this.stopped;
    }

    /**
     * <p>
     * The date and time the remote access session was stopped.
     * </p>
     * 
     * @param stopped
     *        The date and time the remote access session was stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withStopped(java.util.Date stopped) {
        setStopped(stopped);
        return this;
    }

    /**
     * <p>
     * The device (phone or tablet) used in the remote access session.
     * </p>
     * 
     * @param device
     *        The device (phone or tablet) used in the remote access session.
     */

    public void setDevice(Device device) {
        this.device = device;
    }

    /**
     * <p>
     * The device (phone or tablet) used in the remote access session.
     * </p>
     * 
     * @return The device (phone or tablet) used in the remote access session.
     */

    public Device getDevice() {
        return this.device;
    }

    /**
     * <p>
     * The device (phone or tablet) used in the remote access session.
     * </p>
     * 
     * @param device
     *        The device (phone or tablet) used in the remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withDevice(Device device) {
        setDevice(device);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the instance.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the instance.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * This flag is set to <code>true</code> if remote debugging is enabled for the remote access session.
     * </p>
     * 
     * @param remoteDebugEnabled
     *        This flag is set to <code>true</code> if remote debugging is enabled for the remote access session.
     */

    public void setRemoteDebugEnabled(Boolean remoteDebugEnabled) {
        this.remoteDebugEnabled = remoteDebugEnabled;
    }

    /**
     * <p>
     * This flag is set to <code>true</code> if remote debugging is enabled for the remote access session.
     * </p>
     * 
     * @return This flag is set to <code>true</code> if remote debugging is enabled for the remote access session.
     */

    public Boolean getRemoteDebugEnabled() {
        return this.remoteDebugEnabled;
    }

    /**
     * <p>
     * This flag is set to <code>true</code> if remote debugging is enabled for the remote access session.
     * </p>
     * 
     * @param remoteDebugEnabled
     *        This flag is set to <code>true</code> if remote debugging is enabled for the remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withRemoteDebugEnabled(Boolean remoteDebugEnabled) {
        setRemoteDebugEnabled(remoteDebugEnabled);
        return this;
    }

    /**
     * <p>
     * This flag is set to <code>true</code> if remote debugging is enabled for the remote access session.
     * </p>
     * 
     * @return This flag is set to <code>true</code> if remote debugging is enabled for the remote access session.
     */

    public Boolean isRemoteDebugEnabled() {
        return this.remoteDebugEnabled;
    }

    /**
     * <p>
     * This flag is set to <code>true</code> if remote recording is enabled for the remote access session.
     * </p>
     * 
     * @param remoteRecordEnabled
     *        This flag is set to <code>true</code> if remote recording is enabled for the remote access session.
     */

    public void setRemoteRecordEnabled(Boolean remoteRecordEnabled) {
        this.remoteRecordEnabled = remoteRecordEnabled;
    }

    /**
     * <p>
     * This flag is set to <code>true</code> if remote recording is enabled for the remote access session.
     * </p>
     * 
     * @return This flag is set to <code>true</code> if remote recording is enabled for the remote access session.
     */

    public Boolean getRemoteRecordEnabled() {
        return this.remoteRecordEnabled;
    }

    /**
     * <p>
     * This flag is set to <code>true</code> if remote recording is enabled for the remote access session.
     * </p>
     * 
     * @param remoteRecordEnabled
     *        This flag is set to <code>true</code> if remote recording is enabled for the remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withRemoteRecordEnabled(Boolean remoteRecordEnabled) {
        setRemoteRecordEnabled(remoteRecordEnabled);
        return this;
    }

    /**
     * <p>
     * This flag is set to <code>true</code> if remote recording is enabled for the remote access session.
     * </p>
     * 
     * @return This flag is set to <code>true</code> if remote recording is enabled for the remote access session.
     */

    public Boolean isRemoteRecordEnabled() {
        return this.remoteRecordEnabled;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the app to be recorded in the remote access session.
     * </p>
     * 
     * @param remoteRecordAppArn
     *        The Amazon Resource Name (ARN) for the app to be recorded in the remote access session.
     */

    public void setRemoteRecordAppArn(String remoteRecordAppArn) {
        this.remoteRecordAppArn = remoteRecordAppArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the app to be recorded in the remote access session.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the app to be recorded in the remote access session.
     */

    public String getRemoteRecordAppArn() {
        return this.remoteRecordAppArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the app to be recorded in the remote access session.
     * </p>
     * 
     * @param remoteRecordAppArn
     *        The Amazon Resource Name (ARN) for the app to be recorded in the remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withRemoteRecordAppArn(String remoteRecordAppArn) {
        setRemoteRecordAppArn(remoteRecordAppArn);
        return this;
    }

    /**
     * <p>
     * IP address of the EC2 host where you need to connect to remotely debug devices. Only returned if remote debugging
     * is enabled for the remote access session.
     * </p>
     * 
     * @param hostAddress
     *        IP address of the EC2 host where you need to connect to remotely debug devices. Only returned if remote
     *        debugging is enabled for the remote access session.
     */

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    /**
     * <p>
     * IP address of the EC2 host where you need to connect to remotely debug devices. Only returned if remote debugging
     * is enabled for the remote access session.
     * </p>
     * 
     * @return IP address of the EC2 host where you need to connect to remotely debug devices. Only returned if remote
     *         debugging is enabled for the remote access session.
     */

    public String getHostAddress() {
        return this.hostAddress;
    }

    /**
     * <p>
     * IP address of the EC2 host where you need to connect to remotely debug devices. Only returned if remote debugging
     * is enabled for the remote access session.
     * </p>
     * 
     * @param hostAddress
     *        IP address of the EC2 host where you need to connect to remotely debug devices. Only returned if remote
     *        debugging is enabled for the remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withHostAddress(String hostAddress) {
        setHostAddress(hostAddress);
        return this;
    }

    /**
     * <p>
     * Unique identifier of your client for the remote access session. Only returned if remote debugging is enabled for
     * the remote access session.
     * </p>
     * 
     * @param clientId
     *        Unique identifier of your client for the remote access session. Only returned if remote debugging is
     *        enabled for the remote access session.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * Unique identifier of your client for the remote access session. Only returned if remote debugging is enabled for
     * the remote access session.
     * </p>
     * 
     * @return Unique identifier of your client for the remote access session. Only returned if remote debugging is
     *         enabled for the remote access session.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * Unique identifier of your client for the remote access session. Only returned if remote debugging is enabled for
     * the remote access session.
     * </p>
     * 
     * @param clientId
     *        Unique identifier of your client for the remote access session. Only returned if remote debugging is
     *        enabled for the remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The billing method of the remote access session. Possible values include <code>METERED</code> or
     * <code>UNMETERED</code>. For more information about metered devices, see <a
     * href="https://docs.aws.amazon.com/devicefarm/latest/developerguide/welcome.html#welcome-terminology">AWS Device
     * Farm terminology</a>."
     * </p>
     * 
     * @param billingMethod
     *        The billing method of the remote access session. Possible values include <code>METERED</code> or
     *        <code>UNMETERED</code>. For more information about metered devices, see <a
     *        href="https://docs.aws.amazon.com/devicefarm/latest/developerguide/welcome.html#welcome-terminology">AWS
     *        Device Farm terminology</a>."
     * @see BillingMethod
     */

    public void setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
    }

    /**
     * <p>
     * The billing method of the remote access session. Possible values include <code>METERED</code> or
     * <code>UNMETERED</code>. For more information about metered devices, see <a
     * href="https://docs.aws.amazon.com/devicefarm/latest/developerguide/welcome.html#welcome-terminology">AWS Device
     * Farm terminology</a>."
     * </p>
     * 
     * @return The billing method of the remote access session. Possible values include <code>METERED</code> or
     *         <code>UNMETERED</code>. For more information about metered devices, see <a
     *         href="https://docs.aws.amazon.com/devicefarm/latest/developerguide/welcome.html#welcome-terminology">AWS
     *         Device Farm terminology</a>."
     * @see BillingMethod
     */

    public String getBillingMethod() {
        return this.billingMethod;
    }

    /**
     * <p>
     * The billing method of the remote access session. Possible values include <code>METERED</code> or
     * <code>UNMETERED</code>. For more information about metered devices, see <a
     * href="https://docs.aws.amazon.com/devicefarm/latest/developerguide/welcome.html#welcome-terminology">AWS Device
     * Farm terminology</a>."
     * </p>
     * 
     * @param billingMethod
     *        The billing method of the remote access session. Possible values include <code>METERED</code> or
     *        <code>UNMETERED</code>. For more information about metered devices, see <a
     *        href="https://docs.aws.amazon.com/devicefarm/latest/developerguide/welcome.html#welcome-terminology">AWS
     *        Device Farm terminology</a>."
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMethod
     */

    public RemoteAccessSession withBillingMethod(String billingMethod) {
        setBillingMethod(billingMethod);
        return this;
    }

    /**
     * <p>
     * The billing method of the remote access session. Possible values include <code>METERED</code> or
     * <code>UNMETERED</code>. For more information about metered devices, see <a
     * href="https://docs.aws.amazon.com/devicefarm/latest/developerguide/welcome.html#welcome-terminology">AWS Device
     * Farm terminology</a>."
     * </p>
     * 
     * @param billingMethod
     *        The billing method of the remote access session. Possible values include <code>METERED</code> or
     *        <code>UNMETERED</code>. For more information about metered devices, see <a
     *        href="https://docs.aws.amazon.com/devicefarm/latest/developerguide/welcome.html#welcome-terminology">AWS
     *        Device Farm terminology</a>."
     * @see BillingMethod
     */

    public void setBillingMethod(BillingMethod billingMethod) {
        withBillingMethod(billingMethod);
    }

    /**
     * <p>
     * The billing method of the remote access session. Possible values include <code>METERED</code> or
     * <code>UNMETERED</code>. For more information about metered devices, see <a
     * href="https://docs.aws.amazon.com/devicefarm/latest/developerguide/welcome.html#welcome-terminology">AWS Device
     * Farm terminology</a>."
     * </p>
     * 
     * @param billingMethod
     *        The billing method of the remote access session. Possible values include <code>METERED</code> or
     *        <code>UNMETERED</code>. For more information about metered devices, see <a
     *        href="https://docs.aws.amazon.com/devicefarm/latest/developerguide/welcome.html#welcome-terminology">AWS
     *        Device Farm terminology</a>."
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMethod
     */

    public RemoteAccessSession withBillingMethod(BillingMethod billingMethod) {
        this.billingMethod = billingMethod.toString();
        return this;
    }

    /**
     * <p>
     * The number of minutes a device is used in a remote access sesssion (including setup and teardown minutes).
     * </p>
     * 
     * @param deviceMinutes
     *        The number of minutes a device is used in a remote access sesssion (including setup and teardown minutes).
     */

    public void setDeviceMinutes(DeviceMinutes deviceMinutes) {
        this.deviceMinutes = deviceMinutes;
    }

    /**
     * <p>
     * The number of minutes a device is used in a remote access sesssion (including setup and teardown minutes).
     * </p>
     * 
     * @return The number of minutes a device is used in a remote access sesssion (including setup and teardown
     *         minutes).
     */

    public DeviceMinutes getDeviceMinutes() {
        return this.deviceMinutes;
    }

    /**
     * <p>
     * The number of minutes a device is used in a remote access sesssion (including setup and teardown minutes).
     * </p>
     * 
     * @param deviceMinutes
     *        The number of minutes a device is used in a remote access sesssion (including setup and teardown minutes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withDeviceMinutes(DeviceMinutes deviceMinutes) {
        setDeviceMinutes(deviceMinutes);
        return this;
    }

    /**
     * <p>
     * The endpoint for the remote access sesssion.
     * </p>
     * 
     * @param endpoint
     *        The endpoint for the remote access sesssion.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint for the remote access sesssion.
     * </p>
     * 
     * @return The endpoint for the remote access sesssion.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint for the remote access sesssion.
     * </p>
     * 
     * @param endpoint
     *        The endpoint for the remote access sesssion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * Unique device identifier for the remote device. Only returned if remote debugging is enabled for the remote
     * access session.
     * </p>
     * 
     * @param deviceUdid
     *        Unique device identifier for the remote device. Only returned if remote debugging is enabled for the
     *        remote access session.
     */

    public void setDeviceUdid(String deviceUdid) {
        this.deviceUdid = deviceUdid;
    }

    /**
     * <p>
     * Unique device identifier for the remote device. Only returned if remote debugging is enabled for the remote
     * access session.
     * </p>
     * 
     * @return Unique device identifier for the remote device. Only returned if remote debugging is enabled for the
     *         remote access session.
     */

    public String getDeviceUdid() {
        return this.deviceUdid;
    }

    /**
     * <p>
     * Unique device identifier for the remote device. Only returned if remote debugging is enabled for the remote
     * access session.
     * </p>
     * 
     * @param deviceUdid
     *        Unique device identifier for the remote device. Only returned if remote debugging is enabled for the
     *        remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withDeviceUdid(String deviceUdid) {
        setDeviceUdid(deviceUdid);
        return this;
    }

    /**
     * <p>
     * The interaction mode of the remote access session. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You
     * <b>cannot</b> run XCUITest framework-based tests in this mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_VIDEO: You are connected to the device but cannot interact with it or view the screen. This mode has the
     * fastest test execution speed. You <b>can</b> run XCUITest framework-based tests in this mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO_ONLY: You can view the screen but cannot touch or rotate it. You <b>can</b> run XCUITest framework-based
     * tests and watch the screen in this mode.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interactionMode
     *        The interaction mode of the remote access session. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You
     *        <b>cannot</b> run XCUITest framework-based tests in this mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_VIDEO: You are connected to the device but cannot interact with it or view the screen. This mode has
     *        the fastest test execution speed. You <b>can</b> run XCUITest framework-based tests in this mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VIDEO_ONLY: You can view the screen but cannot touch or rotate it. You <b>can</b> run XCUITest
     *        framework-based tests and watch the screen in this mode.
     *        </p>
     *        </li>
     * @see InteractionMode
     */

    public void setInteractionMode(String interactionMode) {
        this.interactionMode = interactionMode;
    }

    /**
     * <p>
     * The interaction mode of the remote access session. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You
     * <b>cannot</b> run XCUITest framework-based tests in this mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_VIDEO: You are connected to the device but cannot interact with it or view the screen. This mode has the
     * fastest test execution speed. You <b>can</b> run XCUITest framework-based tests in this mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO_ONLY: You can view the screen but cannot touch or rotate it. You <b>can</b> run XCUITest framework-based
     * tests and watch the screen in this mode.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The interaction mode of the remote access session. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You
     *         <b>cannot</b> run XCUITest framework-based tests in this mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NO_VIDEO: You are connected to the device but cannot interact with it or view the screen. This mode has
     *         the fastest test execution speed. You <b>can</b> run XCUITest framework-based tests in this mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VIDEO_ONLY: You can view the screen but cannot touch or rotate it. You <b>can</b> run XCUITest
     *         framework-based tests and watch the screen in this mode.
     *         </p>
     *         </li>
     * @see InteractionMode
     */

    public String getInteractionMode() {
        return this.interactionMode;
    }

    /**
     * <p>
     * The interaction mode of the remote access session. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You
     * <b>cannot</b> run XCUITest framework-based tests in this mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_VIDEO: You are connected to the device but cannot interact with it or view the screen. This mode has the
     * fastest test execution speed. You <b>can</b> run XCUITest framework-based tests in this mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO_ONLY: You can view the screen but cannot touch or rotate it. You <b>can</b> run XCUITest framework-based
     * tests and watch the screen in this mode.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interactionMode
     *        The interaction mode of the remote access session. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You
     *        <b>cannot</b> run XCUITest framework-based tests in this mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_VIDEO: You are connected to the device but cannot interact with it or view the screen. This mode has
     *        the fastest test execution speed. You <b>can</b> run XCUITest framework-based tests in this mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VIDEO_ONLY: You can view the screen but cannot touch or rotate it. You <b>can</b> run XCUITest
     *        framework-based tests and watch the screen in this mode.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InteractionMode
     */

    public RemoteAccessSession withInteractionMode(String interactionMode) {
        setInteractionMode(interactionMode);
        return this;
    }

    /**
     * <p>
     * The interaction mode of the remote access session. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You
     * <b>cannot</b> run XCUITest framework-based tests in this mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_VIDEO: You are connected to the device but cannot interact with it or view the screen. This mode has the
     * fastest test execution speed. You <b>can</b> run XCUITest framework-based tests in this mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO_ONLY: You can view the screen but cannot touch or rotate it. You <b>can</b> run XCUITest framework-based
     * tests and watch the screen in this mode.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interactionMode
     *        The interaction mode of the remote access session. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You
     *        <b>cannot</b> run XCUITest framework-based tests in this mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_VIDEO: You are connected to the device but cannot interact with it or view the screen. This mode has
     *        the fastest test execution speed. You <b>can</b> run XCUITest framework-based tests in this mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VIDEO_ONLY: You can view the screen but cannot touch or rotate it. You <b>can</b> run XCUITest
     *        framework-based tests and watch the screen in this mode.
     *        </p>
     *        </li>
     * @see InteractionMode
     */

    public void setInteractionMode(InteractionMode interactionMode) {
        withInteractionMode(interactionMode);
    }

    /**
     * <p>
     * The interaction mode of the remote access session. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You
     * <b>cannot</b> run XCUITest framework-based tests in this mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_VIDEO: You are connected to the device but cannot interact with it or view the screen. This mode has the
     * fastest test execution speed. You <b>can</b> run XCUITest framework-based tests in this mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * VIDEO_ONLY: You can view the screen but cannot touch or rotate it. You <b>can</b> run XCUITest framework-based
     * tests and watch the screen in this mode.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interactionMode
     *        The interaction mode of the remote access session. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        INTERACTIVE: You can interact with the iOS device by viewing, touching, and rotating the screen. You
     *        <b>cannot</b> run XCUITest framework-based tests in this mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_VIDEO: You are connected to the device but cannot interact with it or view the screen. This mode has
     *        the fastest test execution speed. You <b>can</b> run XCUITest framework-based tests in this mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VIDEO_ONLY: You can view the screen but cannot touch or rotate it. You <b>can</b> run XCUITest
     *        framework-based tests and watch the screen in this mode.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InteractionMode
     */

    public RemoteAccessSession withInteractionMode(InteractionMode interactionMode) {
        this.interactionMode = interactionMode.toString();
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public devices,
     * Device Farm always signs your apps again and this parameter has no effect.
     * </p>
     * <p>
     * For more information about how Device Farm re-signs your app(s), see <a
     * href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm FAQs</i>.
     * </p>
     * 
     * @param skipAppResign
     *        When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public
     *        devices, Device Farm always signs your apps again and this parameter has no effect.</p>
     *        <p>
     *        For more information about how Device Farm re-signs your app(s), see <a
     *        href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm
     *        FAQs</i>.
     */

    public void setSkipAppResign(Boolean skipAppResign) {
        this.skipAppResign = skipAppResign;
    }

    /**
     * <p>
     * When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public devices,
     * Device Farm always signs your apps again and this parameter has no effect.
     * </p>
     * <p>
     * For more information about how Device Farm re-signs your app(s), see <a
     * href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm FAQs</i>.
     * </p>
     * 
     * @return When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public
     *         devices, Device Farm always signs your apps again and this parameter has no effect.</p>
     *         <p>
     *         For more information about how Device Farm re-signs your app(s), see <a
     *         href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm
     *         FAQs</i>.
     */

    public Boolean getSkipAppResign() {
        return this.skipAppResign;
    }

    /**
     * <p>
     * When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public devices,
     * Device Farm always signs your apps again and this parameter has no effect.
     * </p>
     * <p>
     * For more information about how Device Farm re-signs your app(s), see <a
     * href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm FAQs</i>.
     * </p>
     * 
     * @param skipAppResign
     *        When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public
     *        devices, Device Farm always signs your apps again and this parameter has no effect.</p>
     *        <p>
     *        For more information about how Device Farm re-signs your app(s), see <a
     *        href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm
     *        FAQs</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoteAccessSession withSkipAppResign(Boolean skipAppResign) {
        setSkipAppResign(skipAppResign);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public devices,
     * Device Farm always signs your apps again and this parameter has no effect.
     * </p>
     * <p>
     * For more information about how Device Farm re-signs your app(s), see <a
     * href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm FAQs</i>.
     * </p>
     * 
     * @return When set to <code>true</code>, for private devices, Device Farm will not sign your app again. For public
     *         devices, Device Farm always signs your apps again and this parameter has no effect.</p>
     *         <p>
     *         For more information about how Device Farm re-signs your app(s), see <a
     *         href="https://aws.amazon.com/device-farm/faq/">Do you modify my app?</a> in the <i>AWS Device Farm
     *         FAQs</i>.
     */

    public Boolean isSkipAppResign() {
        return this.skipAppResign;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getResult() != null)
            sb.append("Result: ").append(getResult()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getStarted() != null)
            sb.append("Started: ").append(getStarted()).append(",");
        if (getStopped() != null)
            sb.append("Stopped: ").append(getStopped()).append(",");
        if (getDevice() != null)
            sb.append("Device: ").append(getDevice()).append(",");
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getRemoteDebugEnabled() != null)
            sb.append("RemoteDebugEnabled: ").append(getRemoteDebugEnabled()).append(",");
        if (getRemoteRecordEnabled() != null)
            sb.append("RemoteRecordEnabled: ").append(getRemoteRecordEnabled()).append(",");
        if (getRemoteRecordAppArn() != null)
            sb.append("RemoteRecordAppArn: ").append(getRemoteRecordAppArn()).append(",");
        if (getHostAddress() != null)
            sb.append("HostAddress: ").append(getHostAddress()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getBillingMethod() != null)
            sb.append("BillingMethod: ").append(getBillingMethod()).append(",");
        if (getDeviceMinutes() != null)
            sb.append("DeviceMinutes: ").append(getDeviceMinutes()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getDeviceUdid() != null)
            sb.append("DeviceUdid: ").append(getDeviceUdid()).append(",");
        if (getInteractionMode() != null)
            sb.append("InteractionMode: ").append(getInteractionMode()).append(",");
        if (getSkipAppResign() != null)
            sb.append("SkipAppResign: ").append(getSkipAppResign());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoteAccessSession == false)
            return false;
        RemoteAccessSession other = (RemoteAccessSession) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getStarted() == null ^ this.getStarted() == null)
            return false;
        if (other.getStarted() != null && other.getStarted().equals(this.getStarted()) == false)
            return false;
        if (other.getStopped() == null ^ this.getStopped() == null)
            return false;
        if (other.getStopped() != null && other.getStopped().equals(this.getStopped()) == false)
            return false;
        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getRemoteDebugEnabled() == null ^ this.getRemoteDebugEnabled() == null)
            return false;
        if (other.getRemoteDebugEnabled() != null && other.getRemoteDebugEnabled().equals(this.getRemoteDebugEnabled()) == false)
            return false;
        if (other.getRemoteRecordEnabled() == null ^ this.getRemoteRecordEnabled() == null)
            return false;
        if (other.getRemoteRecordEnabled() != null && other.getRemoteRecordEnabled().equals(this.getRemoteRecordEnabled()) == false)
            return false;
        if (other.getRemoteRecordAppArn() == null ^ this.getRemoteRecordAppArn() == null)
            return false;
        if (other.getRemoteRecordAppArn() != null && other.getRemoteRecordAppArn().equals(this.getRemoteRecordAppArn()) == false)
            return false;
        if (other.getHostAddress() == null ^ this.getHostAddress() == null)
            return false;
        if (other.getHostAddress() != null && other.getHostAddress().equals(this.getHostAddress()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getBillingMethod() == null ^ this.getBillingMethod() == null)
            return false;
        if (other.getBillingMethod() != null && other.getBillingMethod().equals(this.getBillingMethod()) == false)
            return false;
        if (other.getDeviceMinutes() == null ^ this.getDeviceMinutes() == null)
            return false;
        if (other.getDeviceMinutes() != null && other.getDeviceMinutes().equals(this.getDeviceMinutes()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getDeviceUdid() == null ^ this.getDeviceUdid() == null)
            return false;
        if (other.getDeviceUdid() != null && other.getDeviceUdid().equals(this.getDeviceUdid()) == false)
            return false;
        if (other.getInteractionMode() == null ^ this.getInteractionMode() == null)
            return false;
        if (other.getInteractionMode() != null && other.getInteractionMode().equals(this.getInteractionMode()) == false)
            return false;
        if (other.getSkipAppResign() == null ^ this.getSkipAppResign() == null)
            return false;
        if (other.getSkipAppResign() != null && other.getSkipAppResign().equals(this.getSkipAppResign()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getStarted() == null) ? 0 : getStarted().hashCode());
        hashCode = prime * hashCode + ((getStopped() == null) ? 0 : getStopped().hashCode());
        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getRemoteDebugEnabled() == null) ? 0 : getRemoteDebugEnabled().hashCode());
        hashCode = prime * hashCode + ((getRemoteRecordEnabled() == null) ? 0 : getRemoteRecordEnabled().hashCode());
        hashCode = prime * hashCode + ((getRemoteRecordAppArn() == null) ? 0 : getRemoteRecordAppArn().hashCode());
        hashCode = prime * hashCode + ((getHostAddress() == null) ? 0 : getHostAddress().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getBillingMethod() == null) ? 0 : getBillingMethod().hashCode());
        hashCode = prime * hashCode + ((getDeviceMinutes() == null) ? 0 : getDeviceMinutes().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getDeviceUdid() == null) ? 0 : getDeviceUdid().hashCode());
        hashCode = prime * hashCode + ((getInteractionMode() == null) ? 0 : getInteractionMode().hashCode());
        hashCode = prime * hashCode + ((getSkipAppResign() == null) ? 0 : getSkipAppResign().hashCode());
        return hashCode;
    }

    @Override
    public RemoteAccessSession clone() {
        try {
            return (RemoteAccessSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.RemoteAccessSessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
