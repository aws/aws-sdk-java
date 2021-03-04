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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/UpdateApiDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApiDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the API destination to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the API destination to update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the connection to use for the API destination.
     * </p>
     */
    private String connectionArn;
    /**
     * <p>
     * The URL to the endpoint to use for the API destination.
     * </p>
     */
    private String invocationEndpoint;
    /**
     * <p>
     * The method to use for the API destination.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * The maximum number of invocations per second to send to the API destination.
     * </p>
     */
    private Integer invocationRateLimitPerSecond;

    /**
     * <p>
     * The name of the API destination to update.
     * </p>
     * 
     * @param name
     *        The name of the API destination to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the API destination to update.
     * </p>
     * 
     * @return The name of the API destination to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the API destination to update.
     * </p>
     * 
     * @param name
     *        The name of the API destination to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApiDestinationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the API destination to update.
     * </p>
     * 
     * @param description
     *        The name of the API destination to update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The name of the API destination to update.
     * </p>
     * 
     * @return The name of the API destination to update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The name of the API destination to update.
     * </p>
     * 
     * @param description
     *        The name of the API destination to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApiDestinationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the connection to use for the API destination.
     * </p>
     * 
     * @param connectionArn
     *        The ARN of the connection to use for the API destination.
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The ARN of the connection to use for the API destination.
     * </p>
     * 
     * @return The ARN of the connection to use for the API destination.
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The ARN of the connection to use for the API destination.
     * </p>
     * 
     * @param connectionArn
     *        The ARN of the connection to use for the API destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApiDestinationRequest withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
        return this;
    }

    /**
     * <p>
     * The URL to the endpoint to use for the API destination.
     * </p>
     * 
     * @param invocationEndpoint
     *        The URL to the endpoint to use for the API destination.
     */

    public void setInvocationEndpoint(String invocationEndpoint) {
        this.invocationEndpoint = invocationEndpoint;
    }

    /**
     * <p>
     * The URL to the endpoint to use for the API destination.
     * </p>
     * 
     * @return The URL to the endpoint to use for the API destination.
     */

    public String getInvocationEndpoint() {
        return this.invocationEndpoint;
    }

    /**
     * <p>
     * The URL to the endpoint to use for the API destination.
     * </p>
     * 
     * @param invocationEndpoint
     *        The URL to the endpoint to use for the API destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApiDestinationRequest withInvocationEndpoint(String invocationEndpoint) {
        setInvocationEndpoint(invocationEndpoint);
        return this;
    }

    /**
     * <p>
     * The method to use for the API destination.
     * </p>
     * 
     * @param httpMethod
     *        The method to use for the API destination.
     * @see ApiDestinationHttpMethod
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * The method to use for the API destination.
     * </p>
     * 
     * @return The method to use for the API destination.
     * @see ApiDestinationHttpMethod
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * The method to use for the API destination.
     * </p>
     * 
     * @param httpMethod
     *        The method to use for the API destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiDestinationHttpMethod
     */

    public UpdateApiDestinationRequest withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * The method to use for the API destination.
     * </p>
     * 
     * @param httpMethod
     *        The method to use for the API destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiDestinationHttpMethod
     */

    public UpdateApiDestinationRequest withHttpMethod(ApiDestinationHttpMethod httpMethod) {
        this.httpMethod = httpMethod.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of invocations per second to send to the API destination.
     * </p>
     * 
     * @param invocationRateLimitPerSecond
     *        The maximum number of invocations per second to send to the API destination.
     */

    public void setInvocationRateLimitPerSecond(Integer invocationRateLimitPerSecond) {
        this.invocationRateLimitPerSecond = invocationRateLimitPerSecond;
    }

    /**
     * <p>
     * The maximum number of invocations per second to send to the API destination.
     * </p>
     * 
     * @return The maximum number of invocations per second to send to the API destination.
     */

    public Integer getInvocationRateLimitPerSecond() {
        return this.invocationRateLimitPerSecond;
    }

    /**
     * <p>
     * The maximum number of invocations per second to send to the API destination.
     * </p>
     * 
     * @param invocationRateLimitPerSecond
     *        The maximum number of invocations per second to send to the API destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApiDestinationRequest withInvocationRateLimitPerSecond(Integer invocationRateLimitPerSecond) {
        setInvocationRateLimitPerSecond(invocationRateLimitPerSecond);
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
        if (getConnectionArn() != null)
            sb.append("ConnectionArn: ").append(getConnectionArn()).append(",");
        if (getInvocationEndpoint() != null)
            sb.append("InvocationEndpoint: ").append(getInvocationEndpoint()).append(",");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: ").append(getHttpMethod()).append(",");
        if (getInvocationRateLimitPerSecond() != null)
            sb.append("InvocationRateLimitPerSecond: ").append(getInvocationRateLimitPerSecond());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApiDestinationRequest == false)
            return false;
        UpdateApiDestinationRequest other = (UpdateApiDestinationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getConnectionArn() == null ^ this.getConnectionArn() == null)
            return false;
        if (other.getConnectionArn() != null && other.getConnectionArn().equals(this.getConnectionArn()) == false)
            return false;
        if (other.getInvocationEndpoint() == null ^ this.getInvocationEndpoint() == null)
            return false;
        if (other.getInvocationEndpoint() != null && other.getInvocationEndpoint().equals(this.getInvocationEndpoint()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getInvocationRateLimitPerSecond() == null ^ this.getInvocationRateLimitPerSecond() == null)
            return false;
        if (other.getInvocationRateLimitPerSecond() != null && other.getInvocationRateLimitPerSecond().equals(this.getInvocationRateLimitPerSecond()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getInvocationEndpoint() == null) ? 0 : getInvocationEndpoint().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getInvocationRateLimitPerSecond() == null) ? 0 : getInvocationRateLimitPerSecond().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApiDestinationRequest clone() {
        return (UpdateApiDestinationRequest) super.clone();
    }

}
