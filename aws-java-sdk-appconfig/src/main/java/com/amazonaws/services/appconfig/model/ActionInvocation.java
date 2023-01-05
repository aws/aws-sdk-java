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
 * An extension that was invoked as part of a deployment event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ActionInvocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionInvocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     */
    private String extensionIdentifier;
    /**
     * <p>
     * The name of the action.
     * </p>
     */
    private String actionName;
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
     * The error message when an extension invocation fails.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The error code when an extension invocation fails.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * A system-generated ID for this invocation.
     * </p>
     */
    private String invocationId;

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @param extensionIdentifier
     *        The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     */

    public void setExtensionIdentifier(String extensionIdentifier) {
        this.extensionIdentifier = extensionIdentifier;
    }

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @return The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     */

    public String getExtensionIdentifier() {
        return this.extensionIdentifier;
    }

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @param extensionIdentifier
     *        The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionInvocation withExtensionIdentifier(String extensionIdentifier) {
        setExtensionIdentifier(extensionIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param actionName
     *        The name of the action.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @return The name of the action.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param actionName
     *        The name of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionInvocation withActionName(String actionName) {
        setActionName(actionName);
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

    public ActionInvocation withUri(String uri) {
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

    public ActionInvocation withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The error message when an extension invocation fails.
     * </p>
     * 
     * @param errorMessage
     *        The error message when an extension invocation fails.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message when an extension invocation fails.
     * </p>
     * 
     * @return The error message when an extension invocation fails.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message when an extension invocation fails.
     * </p>
     * 
     * @param errorMessage
     *        The error message when an extension invocation fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionInvocation withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The error code when an extension invocation fails.
     * </p>
     * 
     * @param errorCode
     *        The error code when an extension invocation fails.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code when an extension invocation fails.
     * </p>
     * 
     * @return The error code when an extension invocation fails.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code when an extension invocation fails.
     * </p>
     * 
     * @param errorCode
     *        The error code when an extension invocation fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionInvocation withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * A system-generated ID for this invocation.
     * </p>
     * 
     * @param invocationId
     *        A system-generated ID for this invocation.
     */

    public void setInvocationId(String invocationId) {
        this.invocationId = invocationId;
    }

    /**
     * <p>
     * A system-generated ID for this invocation.
     * </p>
     * 
     * @return A system-generated ID for this invocation.
     */

    public String getInvocationId() {
        return this.invocationId;
    }

    /**
     * <p>
     * A system-generated ID for this invocation.
     * </p>
     * 
     * @param invocationId
     *        A system-generated ID for this invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionInvocation withInvocationId(String invocationId) {
        setInvocationId(invocationId);
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
        if (getExtensionIdentifier() != null)
            sb.append("ExtensionIdentifier: ").append(getExtensionIdentifier()).append(",");
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getInvocationId() != null)
            sb.append("InvocationId: ").append(getInvocationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionInvocation == false)
            return false;
        ActionInvocation other = (ActionInvocation) obj;
        if (other.getExtensionIdentifier() == null ^ this.getExtensionIdentifier() == null)
            return false;
        if (other.getExtensionIdentifier() != null && other.getExtensionIdentifier().equals(this.getExtensionIdentifier()) == false)
            return false;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getInvocationId() == null ^ this.getInvocationId() == null)
            return false;
        if (other.getInvocationId() != null && other.getInvocationId().equals(this.getInvocationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExtensionIdentifier() == null) ? 0 : getExtensionIdentifier().hashCode());
        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getInvocationId() == null) ? 0 : getInvocationId().hashCode());
        return hashCode;
    }

    @Override
    public ActionInvocation clone() {
        try {
            return (ActionInvocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appconfig.model.transform.ActionInvocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
