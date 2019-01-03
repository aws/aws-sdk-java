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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateGroupVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGroupVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A client token used to correlate requests and responses. */
    private String amznClientToken;
    /** The ARN of the connector definition version for this group. */
    private String connectorDefinitionVersionArn;
    /** The ARN of the core definition version for this group. */
    private String coreDefinitionVersionArn;
    /** The ARN of the device definition version for this group. */
    private String deviceDefinitionVersionArn;
    /** The ARN of the function definition version for this group. */
    private String functionDefinitionVersionArn;
    /** The ID of the Greengrass group. */
    private String groupId;
    /** The ARN of the logger definition version for this group. */
    private String loggerDefinitionVersionArn;
    /** The ARN of the resource definition version for this group. */
    private String resourceDefinitionVersionArn;
    /** The ARN of the subscription definition version for this group. */
    private String subscriptionDefinitionVersionArn;

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     */

    public void setAmznClientToken(String amznClientToken) {
        this.amznClientToken = amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @return A client token used to correlate requests and responses.
     */

    public String getAmznClientToken() {
        return this.amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withAmznClientToken(String amznClientToken) {
        setAmznClientToken(amznClientToken);
        return this;
    }

    /**
     * The ARN of the connector definition version for this group.
     * 
     * @param connectorDefinitionVersionArn
     *        The ARN of the connector definition version for this group.
     */

    public void setConnectorDefinitionVersionArn(String connectorDefinitionVersionArn) {
        this.connectorDefinitionVersionArn = connectorDefinitionVersionArn;
    }

    /**
     * The ARN of the connector definition version for this group.
     * 
     * @return The ARN of the connector definition version for this group.
     */

    public String getConnectorDefinitionVersionArn() {
        return this.connectorDefinitionVersionArn;
    }

    /**
     * The ARN of the connector definition version for this group.
     * 
     * @param connectorDefinitionVersionArn
     *        The ARN of the connector definition version for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withConnectorDefinitionVersionArn(String connectorDefinitionVersionArn) {
        setConnectorDefinitionVersionArn(connectorDefinitionVersionArn);
        return this;
    }

    /**
     * The ARN of the core definition version for this group.
     * 
     * @param coreDefinitionVersionArn
     *        The ARN of the core definition version for this group.
     */

    public void setCoreDefinitionVersionArn(String coreDefinitionVersionArn) {
        this.coreDefinitionVersionArn = coreDefinitionVersionArn;
    }

    /**
     * The ARN of the core definition version for this group.
     * 
     * @return The ARN of the core definition version for this group.
     */

    public String getCoreDefinitionVersionArn() {
        return this.coreDefinitionVersionArn;
    }

    /**
     * The ARN of the core definition version for this group.
     * 
     * @param coreDefinitionVersionArn
     *        The ARN of the core definition version for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withCoreDefinitionVersionArn(String coreDefinitionVersionArn) {
        setCoreDefinitionVersionArn(coreDefinitionVersionArn);
        return this;
    }

    /**
     * The ARN of the device definition version for this group.
     * 
     * @param deviceDefinitionVersionArn
     *        The ARN of the device definition version for this group.
     */

    public void setDeviceDefinitionVersionArn(String deviceDefinitionVersionArn) {
        this.deviceDefinitionVersionArn = deviceDefinitionVersionArn;
    }

    /**
     * The ARN of the device definition version for this group.
     * 
     * @return The ARN of the device definition version for this group.
     */

    public String getDeviceDefinitionVersionArn() {
        return this.deviceDefinitionVersionArn;
    }

    /**
     * The ARN of the device definition version for this group.
     * 
     * @param deviceDefinitionVersionArn
     *        The ARN of the device definition version for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withDeviceDefinitionVersionArn(String deviceDefinitionVersionArn) {
        setDeviceDefinitionVersionArn(deviceDefinitionVersionArn);
        return this;
    }

    /**
     * The ARN of the function definition version for this group.
     * 
     * @param functionDefinitionVersionArn
     *        The ARN of the function definition version for this group.
     */

    public void setFunctionDefinitionVersionArn(String functionDefinitionVersionArn) {
        this.functionDefinitionVersionArn = functionDefinitionVersionArn;
    }

    /**
     * The ARN of the function definition version for this group.
     * 
     * @return The ARN of the function definition version for this group.
     */

    public String getFunctionDefinitionVersionArn() {
        return this.functionDefinitionVersionArn;
    }

    /**
     * The ARN of the function definition version for this group.
     * 
     * @param functionDefinitionVersionArn
     *        The ARN of the function definition version for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withFunctionDefinitionVersionArn(String functionDefinitionVersionArn) {
        setFunctionDefinitionVersionArn(functionDefinitionVersionArn);
        return this;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @param groupId
     *        The ID of the Greengrass group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @return The ID of the Greengrass group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @param groupId
     *        The ID of the Greengrass group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * The ARN of the logger definition version for this group.
     * 
     * @param loggerDefinitionVersionArn
     *        The ARN of the logger definition version for this group.
     */

    public void setLoggerDefinitionVersionArn(String loggerDefinitionVersionArn) {
        this.loggerDefinitionVersionArn = loggerDefinitionVersionArn;
    }

    /**
     * The ARN of the logger definition version for this group.
     * 
     * @return The ARN of the logger definition version for this group.
     */

    public String getLoggerDefinitionVersionArn() {
        return this.loggerDefinitionVersionArn;
    }

    /**
     * The ARN of the logger definition version for this group.
     * 
     * @param loggerDefinitionVersionArn
     *        The ARN of the logger definition version for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withLoggerDefinitionVersionArn(String loggerDefinitionVersionArn) {
        setLoggerDefinitionVersionArn(loggerDefinitionVersionArn);
        return this;
    }

    /**
     * The ARN of the resource definition version for this group.
     * 
     * @param resourceDefinitionVersionArn
     *        The ARN of the resource definition version for this group.
     */

    public void setResourceDefinitionVersionArn(String resourceDefinitionVersionArn) {
        this.resourceDefinitionVersionArn = resourceDefinitionVersionArn;
    }

    /**
     * The ARN of the resource definition version for this group.
     * 
     * @return The ARN of the resource definition version for this group.
     */

    public String getResourceDefinitionVersionArn() {
        return this.resourceDefinitionVersionArn;
    }

    /**
     * The ARN of the resource definition version for this group.
     * 
     * @param resourceDefinitionVersionArn
     *        The ARN of the resource definition version for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withResourceDefinitionVersionArn(String resourceDefinitionVersionArn) {
        setResourceDefinitionVersionArn(resourceDefinitionVersionArn);
        return this;
    }

    /**
     * The ARN of the subscription definition version for this group.
     * 
     * @param subscriptionDefinitionVersionArn
     *        The ARN of the subscription definition version for this group.
     */

    public void setSubscriptionDefinitionVersionArn(String subscriptionDefinitionVersionArn) {
        this.subscriptionDefinitionVersionArn = subscriptionDefinitionVersionArn;
    }

    /**
     * The ARN of the subscription definition version for this group.
     * 
     * @return The ARN of the subscription definition version for this group.
     */

    public String getSubscriptionDefinitionVersionArn() {
        return this.subscriptionDefinitionVersionArn;
    }

    /**
     * The ARN of the subscription definition version for this group.
     * 
     * @param subscriptionDefinitionVersionArn
     *        The ARN of the subscription definition version for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withSubscriptionDefinitionVersionArn(String subscriptionDefinitionVersionArn) {
        setSubscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn);
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
        if (getAmznClientToken() != null)
            sb.append("AmznClientToken: ").append(getAmznClientToken()).append(",");
        if (getConnectorDefinitionVersionArn() != null)
            sb.append("ConnectorDefinitionVersionArn: ").append(getConnectorDefinitionVersionArn()).append(",");
        if (getCoreDefinitionVersionArn() != null)
            sb.append("CoreDefinitionVersionArn: ").append(getCoreDefinitionVersionArn()).append(",");
        if (getDeviceDefinitionVersionArn() != null)
            sb.append("DeviceDefinitionVersionArn: ").append(getDeviceDefinitionVersionArn()).append(",");
        if (getFunctionDefinitionVersionArn() != null)
            sb.append("FunctionDefinitionVersionArn: ").append(getFunctionDefinitionVersionArn()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getLoggerDefinitionVersionArn() != null)
            sb.append("LoggerDefinitionVersionArn: ").append(getLoggerDefinitionVersionArn()).append(",");
        if (getResourceDefinitionVersionArn() != null)
            sb.append("ResourceDefinitionVersionArn: ").append(getResourceDefinitionVersionArn()).append(",");
        if (getSubscriptionDefinitionVersionArn() != null)
            sb.append("SubscriptionDefinitionVersionArn: ").append(getSubscriptionDefinitionVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGroupVersionRequest == false)
            return false;
        CreateGroupVersionRequest other = (CreateGroupVersionRequest) obj;
        if (other.getAmznClientToken() == null ^ this.getAmznClientToken() == null)
            return false;
        if (other.getAmznClientToken() != null && other.getAmznClientToken().equals(this.getAmznClientToken()) == false)
            return false;
        if (other.getConnectorDefinitionVersionArn() == null ^ this.getConnectorDefinitionVersionArn() == null)
            return false;
        if (other.getConnectorDefinitionVersionArn() != null
                && other.getConnectorDefinitionVersionArn().equals(this.getConnectorDefinitionVersionArn()) == false)
            return false;
        if (other.getCoreDefinitionVersionArn() == null ^ this.getCoreDefinitionVersionArn() == null)
            return false;
        if (other.getCoreDefinitionVersionArn() != null && other.getCoreDefinitionVersionArn().equals(this.getCoreDefinitionVersionArn()) == false)
            return false;
        if (other.getDeviceDefinitionVersionArn() == null ^ this.getDeviceDefinitionVersionArn() == null)
            return false;
        if (other.getDeviceDefinitionVersionArn() != null && other.getDeviceDefinitionVersionArn().equals(this.getDeviceDefinitionVersionArn()) == false)
            return false;
        if (other.getFunctionDefinitionVersionArn() == null ^ this.getFunctionDefinitionVersionArn() == null)
            return false;
        if (other.getFunctionDefinitionVersionArn() != null && other.getFunctionDefinitionVersionArn().equals(this.getFunctionDefinitionVersionArn()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getLoggerDefinitionVersionArn() == null ^ this.getLoggerDefinitionVersionArn() == null)
            return false;
        if (other.getLoggerDefinitionVersionArn() != null && other.getLoggerDefinitionVersionArn().equals(this.getLoggerDefinitionVersionArn()) == false)
            return false;
        if (other.getResourceDefinitionVersionArn() == null ^ this.getResourceDefinitionVersionArn() == null)
            return false;
        if (other.getResourceDefinitionVersionArn() != null && other.getResourceDefinitionVersionArn().equals(this.getResourceDefinitionVersionArn()) == false)
            return false;
        if (other.getSubscriptionDefinitionVersionArn() == null ^ this.getSubscriptionDefinitionVersionArn() == null)
            return false;
        if (other.getSubscriptionDefinitionVersionArn() != null
                && other.getSubscriptionDefinitionVersionArn().equals(this.getSubscriptionDefinitionVersionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmznClientToken() == null) ? 0 : getAmznClientToken().hashCode());
        hashCode = prime * hashCode + ((getConnectorDefinitionVersionArn() == null) ? 0 : getConnectorDefinitionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getCoreDefinitionVersionArn() == null) ? 0 : getCoreDefinitionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceDefinitionVersionArn() == null) ? 0 : getDeviceDefinitionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionDefinitionVersionArn() == null) ? 0 : getFunctionDefinitionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getLoggerDefinitionVersionArn() == null) ? 0 : getLoggerDefinitionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getResourceDefinitionVersionArn() == null) ? 0 : getResourceDefinitionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionDefinitionVersionArn() == null) ? 0 : getSubscriptionDefinitionVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateGroupVersionRequest clone() {
        return (CreateGroupVersionRequest) super.clone();
    }

}
