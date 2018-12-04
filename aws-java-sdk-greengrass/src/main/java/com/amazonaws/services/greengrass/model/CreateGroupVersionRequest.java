/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    /** The client token used to request idempotent operations. */
    private String amznClientToken;
    /** Core definition version arn for this group. */
    private String coreDefinitionVersionArn;
    /** Device definition version arn for this group. */
    private String deviceDefinitionVersionArn;
    /** Function definition version arn for this group. */
    private String functionDefinitionVersionArn;
    /** The unique Id of the AWS Greengrass Group */
    private String groupId;
    /** Logger definition version arn for this group. */
    private String loggerDefinitionVersionArn;
    /** Resource definition version arn for this group. */
    private String resourceDefinitionVersionArn;
    /** Subscription definition version arn for this group. */
    private String subscriptionDefinitionVersionArn;

    /**
     * The client token used to request idempotent operations.
     * 
     * @param amznClientToken
     *        The client token used to request idempotent operations.
     */

    public void setAmznClientToken(String amznClientToken) {
        this.amznClientToken = amznClientToken;
    }

    /**
     * The client token used to request idempotent operations.
     * 
     * @return The client token used to request idempotent operations.
     */

    public String getAmznClientToken() {
        return this.amznClientToken;
    }

    /**
     * The client token used to request idempotent operations.
     * 
     * @param amznClientToken
     *        The client token used to request idempotent operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withAmznClientToken(String amznClientToken) {
        setAmznClientToken(amznClientToken);
        return this;
    }

    /**
     * Core definition version arn for this group.
     * 
     * @param coreDefinitionVersionArn
     *        Core definition version arn for this group.
     */

    public void setCoreDefinitionVersionArn(String coreDefinitionVersionArn) {
        this.coreDefinitionVersionArn = coreDefinitionVersionArn;
    }

    /**
     * Core definition version arn for this group.
     * 
     * @return Core definition version arn for this group.
     */

    public String getCoreDefinitionVersionArn() {
        return this.coreDefinitionVersionArn;
    }

    /**
     * Core definition version arn for this group.
     * 
     * @param coreDefinitionVersionArn
     *        Core definition version arn for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withCoreDefinitionVersionArn(String coreDefinitionVersionArn) {
        setCoreDefinitionVersionArn(coreDefinitionVersionArn);
        return this;
    }

    /**
     * Device definition version arn for this group.
     * 
     * @param deviceDefinitionVersionArn
     *        Device definition version arn for this group.
     */

    public void setDeviceDefinitionVersionArn(String deviceDefinitionVersionArn) {
        this.deviceDefinitionVersionArn = deviceDefinitionVersionArn;
    }

    /**
     * Device definition version arn for this group.
     * 
     * @return Device definition version arn for this group.
     */

    public String getDeviceDefinitionVersionArn() {
        return this.deviceDefinitionVersionArn;
    }

    /**
     * Device definition version arn for this group.
     * 
     * @param deviceDefinitionVersionArn
     *        Device definition version arn for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withDeviceDefinitionVersionArn(String deviceDefinitionVersionArn) {
        setDeviceDefinitionVersionArn(deviceDefinitionVersionArn);
        return this;
    }

    /**
     * Function definition version arn for this group.
     * 
     * @param functionDefinitionVersionArn
     *        Function definition version arn for this group.
     */

    public void setFunctionDefinitionVersionArn(String functionDefinitionVersionArn) {
        this.functionDefinitionVersionArn = functionDefinitionVersionArn;
    }

    /**
     * Function definition version arn for this group.
     * 
     * @return Function definition version arn for this group.
     */

    public String getFunctionDefinitionVersionArn() {
        return this.functionDefinitionVersionArn;
    }

    /**
     * Function definition version arn for this group.
     * 
     * @param functionDefinitionVersionArn
     *        Function definition version arn for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withFunctionDefinitionVersionArn(String functionDefinitionVersionArn) {
        setFunctionDefinitionVersionArn(functionDefinitionVersionArn);
        return this;
    }

    /**
     * The unique Id of the AWS Greengrass Group
     * 
     * @param groupId
     *        The unique Id of the AWS Greengrass Group
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * The unique Id of the AWS Greengrass Group
     * 
     * @return The unique Id of the AWS Greengrass Group
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * The unique Id of the AWS Greengrass Group
     * 
     * @param groupId
     *        The unique Id of the AWS Greengrass Group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * Logger definition version arn for this group.
     * 
     * @param loggerDefinitionVersionArn
     *        Logger definition version arn for this group.
     */

    public void setLoggerDefinitionVersionArn(String loggerDefinitionVersionArn) {
        this.loggerDefinitionVersionArn = loggerDefinitionVersionArn;
    }

    /**
     * Logger definition version arn for this group.
     * 
     * @return Logger definition version arn for this group.
     */

    public String getLoggerDefinitionVersionArn() {
        return this.loggerDefinitionVersionArn;
    }

    /**
     * Logger definition version arn for this group.
     * 
     * @param loggerDefinitionVersionArn
     *        Logger definition version arn for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withLoggerDefinitionVersionArn(String loggerDefinitionVersionArn) {
        setLoggerDefinitionVersionArn(loggerDefinitionVersionArn);
        return this;
    }

    /**
     * Resource definition version arn for this group.
     * 
     * @param resourceDefinitionVersionArn
     *        Resource definition version arn for this group.
     */

    public void setResourceDefinitionVersionArn(String resourceDefinitionVersionArn) {
        this.resourceDefinitionVersionArn = resourceDefinitionVersionArn;
    }

    /**
     * Resource definition version arn for this group.
     * 
     * @return Resource definition version arn for this group.
     */

    public String getResourceDefinitionVersionArn() {
        return this.resourceDefinitionVersionArn;
    }

    /**
     * Resource definition version arn for this group.
     * 
     * @param resourceDefinitionVersionArn
     *        Resource definition version arn for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withResourceDefinitionVersionArn(String resourceDefinitionVersionArn) {
        setResourceDefinitionVersionArn(resourceDefinitionVersionArn);
        return this;
    }

    /**
     * Subscription definition version arn for this group.
     * 
     * @param subscriptionDefinitionVersionArn
     *        Subscription definition version arn for this group.
     */

    public void setSubscriptionDefinitionVersionArn(String subscriptionDefinitionVersionArn) {
        this.subscriptionDefinitionVersionArn = subscriptionDefinitionVersionArn;
    }

    /**
     * Subscription definition version arn for this group.
     * 
     * @return Subscription definition version arn for this group.
     */

    public String getSubscriptionDefinitionVersionArn() {
        return this.subscriptionDefinitionVersionArn;
    }

    /**
     * Subscription definition version arn for this group.
     * 
     * @param subscriptionDefinitionVersionArn
     *        Subscription definition version arn for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupVersionRequest withSubscriptionDefinitionVersionArn(String subscriptionDefinitionVersionArn) {
        setSubscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
