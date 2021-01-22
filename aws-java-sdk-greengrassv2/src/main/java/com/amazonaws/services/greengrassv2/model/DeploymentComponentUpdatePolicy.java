/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about a deployment's policy that defines when components are safe to update.
 * </p>
 * <p>
 * Each component on a device can report whether or not it's ready to update. After a component and its dependencies are
 * ready, they can apply the update in the deployment. You can configure whether or not the deployment notifies
 * components of an update and waits for a response. You specify the amount of time each component has to respond to the
 * update notification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/DeploymentComponentUpdatePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentComponentUpdatePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of time in seconds that each component on a device has to report that it's safe to update. If the
     * component waits for longer than this timeout, then the deployment proceeds on the device.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     */
    private Integer timeoutInSeconds;
    /**
     * <p>
     * Whether or not to notify components and wait for components to become safe to update. Choose from the following
     * options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOTIFY_COMPONENTS</code> – The deployment notifies each component before it stops and updates that
     * component. Components can use the <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetocomponentupdates"
     * >SubscribeToComponentUpdates</a> IPC operation to receive these notifications. Then, components can respond with
     * the <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-defercomponentupdate"
     * >DeferComponentUpdate</a> IPC operation. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html">Create deployments</a> in
     * the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIP_NOTIFY_COMPONENTS</code> – The deployment doesn't notify components or wait for them to be safe to
     * update.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>NOTIFY_COMPONENTS</code>
     * </p>
     */
    private String action;

    /**
     * <p>
     * The amount of time in seconds that each component on a device has to report that it's safe to update. If the
     * component waits for longer than this timeout, then the deployment proceeds on the device.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     * 
     * @param timeoutInSeconds
     *        The amount of time in seconds that each component on a device has to report that it's safe to update. If
     *        the component waits for longer than this timeout, then the deployment proceeds on the device.</p>
     *        <p>
     *        Default: <code>60</code>
     */

    public void setTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time in seconds that each component on a device has to report that it's safe to update. If the
     * component waits for longer than this timeout, then the deployment proceeds on the device.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     * 
     * @return The amount of time in seconds that each component on a device has to report that it's safe to update. If
     *         the component waits for longer than this timeout, then the deployment proceeds on the device.</p>
     *         <p>
     *         Default: <code>60</code>
     */

    public Integer getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time in seconds that each component on a device has to report that it's safe to update. If the
     * component waits for longer than this timeout, then the deployment proceeds on the device.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     * 
     * @param timeoutInSeconds
     *        The amount of time in seconds that each component on a device has to report that it's safe to update. If
     *        the component waits for longer than this timeout, then the deployment proceeds on the device.</p>
     *        <p>
     *        Default: <code>60</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentComponentUpdatePolicy withTimeoutInSeconds(Integer timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * Whether or not to notify components and wait for components to become safe to update. Choose from the following
     * options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOTIFY_COMPONENTS</code> – The deployment notifies each component before it stops and updates that
     * component. Components can use the <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetocomponentupdates"
     * >SubscribeToComponentUpdates</a> IPC operation to receive these notifications. Then, components can respond with
     * the <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-defercomponentupdate"
     * >DeferComponentUpdate</a> IPC operation. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html">Create deployments</a> in
     * the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIP_NOTIFY_COMPONENTS</code> – The deployment doesn't notify components or wait for them to be safe to
     * update.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>NOTIFY_COMPONENTS</code>
     * </p>
     * 
     * @param action
     *        Whether or not to notify components and wait for components to become safe to update. Choose from the
     *        following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NOTIFY_COMPONENTS</code> – The deployment notifies each component before it stops and updates that
     *        component. Components can use the <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetocomponentupdates"
     *        >SubscribeToComponentUpdates</a> IPC operation to receive these notifications. Then, components can
     *        respond with the <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-defercomponentupdate"
     *        >DeferComponentUpdate</a> IPC operation. For more information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html">Create
     *        deployments</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIP_NOTIFY_COMPONENTS</code> – The deployment doesn't notify components or wait for them to be safe
     *        to update.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>NOTIFY_COMPONENTS</code>
     * @see DeploymentComponentUpdatePolicyAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Whether or not to notify components and wait for components to become safe to update. Choose from the following
     * options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOTIFY_COMPONENTS</code> – The deployment notifies each component before it stops and updates that
     * component. Components can use the <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetocomponentupdates"
     * >SubscribeToComponentUpdates</a> IPC operation to receive these notifications. Then, components can respond with
     * the <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-defercomponentupdate"
     * >DeferComponentUpdate</a> IPC operation. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html">Create deployments</a> in
     * the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIP_NOTIFY_COMPONENTS</code> – The deployment doesn't notify components or wait for them to be safe to
     * update.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>NOTIFY_COMPONENTS</code>
     * </p>
     * 
     * @return Whether or not to notify components and wait for components to become safe to update. Choose from the
     *         following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NOTIFY_COMPONENTS</code> – The deployment notifies each component before it stops and updates that
     *         component. Components can use the <a href=
     *         "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetocomponentupdates"
     *         >SubscribeToComponentUpdates</a> IPC operation to receive these notifications. Then, components can
     *         respond with the <a href=
     *         "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-defercomponentupdate"
     *         >DeferComponentUpdate</a> IPC operation. For more information, see <a
     *         href="https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html">Create
     *         deployments</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SKIP_NOTIFY_COMPONENTS</code> – The deployment doesn't notify components or wait for them to be
     *         safe to update.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>NOTIFY_COMPONENTS</code>
     * @see DeploymentComponentUpdatePolicyAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Whether or not to notify components and wait for components to become safe to update. Choose from the following
     * options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOTIFY_COMPONENTS</code> – The deployment notifies each component before it stops and updates that
     * component. Components can use the <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetocomponentupdates"
     * >SubscribeToComponentUpdates</a> IPC operation to receive these notifications. Then, components can respond with
     * the <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-defercomponentupdate"
     * >DeferComponentUpdate</a> IPC operation. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html">Create deployments</a> in
     * the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIP_NOTIFY_COMPONENTS</code> – The deployment doesn't notify components or wait for them to be safe to
     * update.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>NOTIFY_COMPONENTS</code>
     * </p>
     * 
     * @param action
     *        Whether or not to notify components and wait for components to become safe to update. Choose from the
     *        following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NOTIFY_COMPONENTS</code> – The deployment notifies each component before it stops and updates that
     *        component. Components can use the <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetocomponentupdates"
     *        >SubscribeToComponentUpdates</a> IPC operation to receive these notifications. Then, components can
     *        respond with the <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-defercomponentupdate"
     *        >DeferComponentUpdate</a> IPC operation. For more information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html">Create
     *        deployments</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIP_NOTIFY_COMPONENTS</code> – The deployment doesn't notify components or wait for them to be safe
     *        to update.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>NOTIFY_COMPONENTS</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentComponentUpdatePolicyAction
     */

    public DeploymentComponentUpdatePolicy withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Whether or not to notify components and wait for components to become safe to update. Choose from the following
     * options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NOTIFY_COMPONENTS</code> – The deployment notifies each component before it stops and updates that
     * component. Components can use the <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetocomponentupdates"
     * >SubscribeToComponentUpdates</a> IPC operation to receive these notifications. Then, components can respond with
     * the <a href=
     * "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-defercomponentupdate"
     * >DeferComponentUpdate</a> IPC operation. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html">Create deployments</a> in
     * the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIP_NOTIFY_COMPONENTS</code> – The deployment doesn't notify components or wait for them to be safe to
     * update.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>NOTIFY_COMPONENTS</code>
     * </p>
     * 
     * @param action
     *        Whether or not to notify components and wait for components to become safe to update. Choose from the
     *        following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NOTIFY_COMPONENTS</code> – The deployment notifies each component before it stops and updates that
     *        component. Components can use the <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetocomponentupdates"
     *        >SubscribeToComponentUpdates</a> IPC operation to receive these notifications. Then, components can
     *        respond with the <a href=
     *        "https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-defercomponentupdate"
     *        >DeferComponentUpdate</a> IPC operation. For more information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html">Create
     *        deployments</a> in the <i>AWS IoT Greengrass V2 Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIP_NOTIFY_COMPONENTS</code> – The deployment doesn't notify components or wait for them to be safe
     *        to update.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>NOTIFY_COMPONENTS</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentComponentUpdatePolicyAction
     */

    public DeploymentComponentUpdatePolicy withAction(DeploymentComponentUpdatePolicyAction action) {
        this.action = action.toString();
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
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: ").append(getTimeoutInSeconds()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentComponentUpdatePolicy == false)
            return false;
        DeploymentComponentUpdatePolicy other = (DeploymentComponentUpdatePolicy) obj;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentComponentUpdatePolicy clone() {
        try {
            return (DeploymentComponentUpdatePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.DeploymentComponentUpdatePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
