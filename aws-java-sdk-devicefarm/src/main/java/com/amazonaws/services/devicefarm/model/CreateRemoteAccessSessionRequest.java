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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates and submits a request to start a remote access session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateRemoteAccessSession"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRemoteAccessSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     * </p>
     */
    private String deviceArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device instance for which you want to create a remote access session.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * The public key of the <code>ssh</code> key pair you want to use for connecting to remote devices in your remote
     * debugging session. This is only required if <code>remoteDebugEnabled</code> is set to <code>true</code>.
     * </p>
     */
    private String sshPublicKey;
    /**
     * <p>
     * Set to <code>true</code> if you want to access devices remotely for debugging in your remote access session.
     * </p>
     */
    private Boolean remoteDebugEnabled;
    /**
     * <p>
     * Set to <code>true</code> to enable remote recording for the remote access session.
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
     * The name of the remote access session that you wish to create.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Unique identifier for the client. If you want access to multiple devices on the same client, you should pass the
     * same <code>clientId</code> value in each call to <code>CreateRemoteAccessSession</code>. This is required only if
     * <code>remoteDebugEnabled</code> is set to <code>true</code>.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The configuration information for the remote access session request.
     * </p>
     */
    private CreateRemoteAccessSessionConfiguration configuration;
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
     * The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     * </p>
     * 
     * @param deviceArn
     *        The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     */

    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     */

    public String getDeviceArn() {
        return this.deviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     * </p>
     * 
     * @param deviceArn
     *        The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withDeviceArn(String deviceArn) {
        setDeviceArn(deviceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device instance for which you want to create a remote access session.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the device instance for which you want to create a remote access
     *        session.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device instance for which you want to create a remote access session.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device instance for which you want to create a remote access
     *         session.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device instance for which you want to create a remote access session.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the device instance for which you want to create a remote access
     *        session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The public key of the <code>ssh</code> key pair you want to use for connecting to remote devices in your remote
     * debugging session. This is only required if <code>remoteDebugEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param sshPublicKey
     *        The public key of the <code>ssh</code> key pair you want to use for connecting to remote devices in your
     *        remote debugging session. This is only required if <code>remoteDebugEnabled</code> is set to
     *        <code>true</code>.
     */

    public void setSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
    }

    /**
     * <p>
     * The public key of the <code>ssh</code> key pair you want to use for connecting to remote devices in your remote
     * debugging session. This is only required if <code>remoteDebugEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @return The public key of the <code>ssh</code> key pair you want to use for connecting to remote devices in your
     *         remote debugging session. This is only required if <code>remoteDebugEnabled</code> is set to
     *         <code>true</code>.
     */

    public String getSshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * <p>
     * The public key of the <code>ssh</code> key pair you want to use for connecting to remote devices in your remote
     * debugging session. This is only required if <code>remoteDebugEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param sshPublicKey
     *        The public key of the <code>ssh</code> key pair you want to use for connecting to remote devices in your
     *        remote debugging session. This is only required if <code>remoteDebugEnabled</code> is set to
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withSshPublicKey(String sshPublicKey) {
        setSshPublicKey(sshPublicKey);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> if you want to access devices remotely for debugging in your remote access session.
     * </p>
     * 
     * @param remoteDebugEnabled
     *        Set to <code>true</code> if you want to access devices remotely for debugging in your remote access
     *        session.
     */

    public void setRemoteDebugEnabled(Boolean remoteDebugEnabled) {
        this.remoteDebugEnabled = remoteDebugEnabled;
    }

    /**
     * <p>
     * Set to <code>true</code> if you want to access devices remotely for debugging in your remote access session.
     * </p>
     * 
     * @return Set to <code>true</code> if you want to access devices remotely for debugging in your remote access
     *         session.
     */

    public Boolean getRemoteDebugEnabled() {
        return this.remoteDebugEnabled;
    }

    /**
     * <p>
     * Set to <code>true</code> if you want to access devices remotely for debugging in your remote access session.
     * </p>
     * 
     * @param remoteDebugEnabled
     *        Set to <code>true</code> if you want to access devices remotely for debugging in your remote access
     *        session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withRemoteDebugEnabled(Boolean remoteDebugEnabled) {
        setRemoteDebugEnabled(remoteDebugEnabled);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> if you want to access devices remotely for debugging in your remote access session.
     * </p>
     * 
     * @return Set to <code>true</code> if you want to access devices remotely for debugging in your remote access
     *         session.
     */

    public Boolean isRemoteDebugEnabled() {
        return this.remoteDebugEnabled;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable remote recording for the remote access session.
     * </p>
     * 
     * @param remoteRecordEnabled
     *        Set to <code>true</code> to enable remote recording for the remote access session.
     */

    public void setRemoteRecordEnabled(Boolean remoteRecordEnabled) {
        this.remoteRecordEnabled = remoteRecordEnabled;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable remote recording for the remote access session.
     * </p>
     * 
     * @return Set to <code>true</code> to enable remote recording for the remote access session.
     */

    public Boolean getRemoteRecordEnabled() {
        return this.remoteRecordEnabled;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable remote recording for the remote access session.
     * </p>
     * 
     * @param remoteRecordEnabled
     *        Set to <code>true</code> to enable remote recording for the remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withRemoteRecordEnabled(Boolean remoteRecordEnabled) {
        setRemoteRecordEnabled(remoteRecordEnabled);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to enable remote recording for the remote access session.
     * </p>
     * 
     * @return Set to <code>true</code> to enable remote recording for the remote access session.
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

    public CreateRemoteAccessSessionRequest withRemoteRecordAppArn(String remoteRecordAppArn) {
        setRemoteRecordAppArn(remoteRecordAppArn);
        return this;
    }

    /**
     * <p>
     * The name of the remote access session that you wish to create.
     * </p>
     * 
     * @param name
     *        The name of the remote access session that you wish to create.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the remote access session that you wish to create.
     * </p>
     * 
     * @return The name of the remote access session that you wish to create.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the remote access session that you wish to create.
     * </p>
     * 
     * @param name
     *        The name of the remote access session that you wish to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Unique identifier for the client. If you want access to multiple devices on the same client, you should pass the
     * same <code>clientId</code> value in each call to <code>CreateRemoteAccessSession</code>. This is required only if
     * <code>remoteDebugEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param clientId
     *        Unique identifier for the client. If you want access to multiple devices on the same client, you should
     *        pass the same <code>clientId</code> value in each call to <code>CreateRemoteAccessSession</code>. This is
     *        required only if <code>remoteDebugEnabled</code> is set to <code>true</code>.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * Unique identifier for the client. If you want access to multiple devices on the same client, you should pass the
     * same <code>clientId</code> value in each call to <code>CreateRemoteAccessSession</code>. This is required only if
     * <code>remoteDebugEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @return Unique identifier for the client. If you want access to multiple devices on the same client, you should
     *         pass the same <code>clientId</code> value in each call to <code>CreateRemoteAccessSession</code>. This is
     *         required only if <code>remoteDebugEnabled</code> is set to <code>true</code>.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * Unique identifier for the client. If you want access to multiple devices on the same client, you should pass the
     * same <code>clientId</code> value in each call to <code>CreateRemoteAccessSession</code>. This is required only if
     * <code>remoteDebugEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param clientId
     *        Unique identifier for the client. If you want access to multiple devices on the same client, you should
     *        pass the same <code>clientId</code> value in each call to <code>CreateRemoteAccessSession</code>. This is
     *        required only if <code>remoteDebugEnabled</code> is set to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The configuration information for the remote access session request.
     * </p>
     * 
     * @param configuration
     *        The configuration information for the remote access session request.
     */

    public void setConfiguration(CreateRemoteAccessSessionConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration information for the remote access session request.
     * </p>
     * 
     * @return The configuration information for the remote access session request.
     */

    public CreateRemoteAccessSessionConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration information for the remote access session request.
     * </p>
     * 
     * @param configuration
     *        The configuration information for the remote access session request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withConfiguration(CreateRemoteAccessSessionConfiguration configuration) {
        setConfiguration(configuration);
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

    public CreateRemoteAccessSessionRequest withInteractionMode(String interactionMode) {
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
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InteractionMode
     */

    public CreateRemoteAccessSessionRequest withInteractionMode(InteractionMode interactionMode) {
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

    public CreateRemoteAccessSessionRequest withSkipAppResign(Boolean skipAppResign) {
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getDeviceArn() != null)
            sb.append("DeviceArn: ").append(getDeviceArn()).append(",");
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getSshPublicKey() != null)
            sb.append("SshPublicKey: ").append(getSshPublicKey()).append(",");
        if (getRemoteDebugEnabled() != null)
            sb.append("RemoteDebugEnabled: ").append(getRemoteDebugEnabled()).append(",");
        if (getRemoteRecordEnabled() != null)
            sb.append("RemoteRecordEnabled: ").append(getRemoteRecordEnabled()).append(",");
        if (getRemoteRecordAppArn() != null)
            sb.append("RemoteRecordAppArn: ").append(getRemoteRecordAppArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
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

        if (obj instanceof CreateRemoteAccessSessionRequest == false)
            return false;
        CreateRemoteAccessSessionRequest other = (CreateRemoteAccessSessionRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getSshPublicKey() == null ^ this.getSshPublicKey() == null)
            return false;
        if (other.getSshPublicKey() != null && other.getSshPublicKey().equals(this.getSshPublicKey()) == false)
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getSshPublicKey() == null) ? 0 : getSshPublicKey().hashCode());
        hashCode = prime * hashCode + ((getRemoteDebugEnabled() == null) ? 0 : getRemoteDebugEnabled().hashCode());
        hashCode = prime * hashCode + ((getRemoteRecordEnabled() == null) ? 0 : getRemoteRecordEnabled().hashCode());
        hashCode = prime * hashCode + ((getRemoteRecordAppArn() == null) ? 0 : getRemoteRecordAppArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInteractionMode() == null) ? 0 : getInteractionMode().hashCode());
        hashCode = prime * hashCode + ((getSkipAppResign() == null) ? 0 : getSkipAppResign().hashCode());
        return hashCode;
    }

    @Override
    public CreateRemoteAccessSessionRequest clone() {
        return (CreateRemoteAccessSessionRequest) super.clone();
    }

}
