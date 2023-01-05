/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An action defines the tasks the extension performs during the AppConfig workflow. Each action includes an action
 * point such as <code>ON_CREATE_HOSTED_CONFIGURATION</code>, <code>PRE_DEPLOYMENT</code>, or <code>ON_DEPLOYMENT</code>
 * . Each action also includes a name, a URI to an Lambda function, and an Amazon Resource Name (ARN) for an Identity
 * and Access Management assume role. You specify the name, URI, and ARN for each <i>action point</i> defined in the
 * extension. You can specify the following actions for an extension:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>PRE_CREATE_HOSTED_CONFIGURATION_VERSION</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PRE_START_DEPLOYMENT</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ON_DEPLOYMENT_START</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ON_DEPLOYMENT_STEP</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ON_DEPLOYMENT_BAKING</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ON_DEPLOYMENT_COMPLETE</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ON_DEPLOYMENT_ROLLED_BACK</code>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/Action" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Information about the action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The extension URI associated to the action point in the extension definition. The URI can be an Amazon Resource
     * Name (ARN) for one of the following: an Lambda function, an Amazon Simple Queue Service queue, an Amazon Simple
     * Notification Service topic, or the Amazon EventBridge default event bus.
     * </p>
     */
    private String uri;
    /**
     * <p>
     * An Amazon Resource Name (ARN) for an Identity and Access Management assume role.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The action name.
     * </p>
     * 
     * @param name
     *        The action name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The action name.
     * </p>
     * 
     * @return The action name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The action name.
     * </p>
     * 
     * @param name
     *        The action name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Information about the action.
     * </p>
     * 
     * @param description
     *        Information about the action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Information about the action.
     * </p>
     * 
     * @return Information about the action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Information about the action.
     * </p>
     * 
     * @param description
     *        Information about the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The extension URI associated to the action point in the extension definition. The URI can be an Amazon Resource
     * Name (ARN) for one of the following: an Lambda function, an Amazon Simple Queue Service queue, an Amazon Simple
     * Notification Service topic, or the Amazon EventBridge default event bus.
     * </p>
     * 
     * @param uri
     *        The extension URI associated to the action point in the extension definition. The URI can be an Amazon
     *        Resource Name (ARN) for one of the following: an Lambda function, an Amazon Simple Queue Service queue, an
     *        Amazon Simple Notification Service topic, or the Amazon EventBridge default event bus.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The extension URI associated to the action point in the extension definition. The URI can be an Amazon Resource
     * Name (ARN) for one of the following: an Lambda function, an Amazon Simple Queue Service queue, an Amazon Simple
     * Notification Service topic, or the Amazon EventBridge default event bus.
     * </p>
     * 
     * @return The extension URI associated to the action point in the extension definition. The URI can be an Amazon
     *         Resource Name (ARN) for one of the following: an Lambda function, an Amazon Simple Queue Service queue,
     *         an Amazon Simple Notification Service topic, or the Amazon EventBridge default event bus.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * The extension URI associated to the action point in the extension definition. The URI can be an Amazon Resource
     * Name (ARN) for one of the following: an Lambda function, an Amazon Simple Queue Service queue, an Amazon Simple
     * Notification Service topic, or the Amazon EventBridge default event bus.
     * </p>
     * 
     * @param uri
     *        The extension URI associated to the action point in the extension definition. The URI can be an Amazon
     *        Resource Name (ARN) for one of the following: an Lambda function, an Amazon Simple Queue Service queue, an
     *        Amazon Simple Notification Service topic, or the Amazon EventBridge default event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) for an Identity and Access Management assume role.
     * </p>
     * 
     * @param roleArn
     *        An Amazon Resource Name (ARN) for an Identity and Access Management assume role.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) for an Identity and Access Management assume role.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) for an Identity and Access Management assume role.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) for an Identity and Access Management assume role.
     * </p>
     * 
     * @param roleArn
     *        An Amazon Resource Name (ARN) for an Identity and Access Management assume role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public Action clone() {
        try {
            return (Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appconfig.model.transform.ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
