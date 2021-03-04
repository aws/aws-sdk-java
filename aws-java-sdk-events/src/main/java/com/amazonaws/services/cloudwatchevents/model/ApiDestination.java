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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about an API destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ApiDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the API destination.
     * </p>
     */
    private String apiDestinationArn;
    /**
     * <p>
     * The name of the API destination.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The state of the API destination.
     * </p>
     */
    private String apiDestinationState;
    /**
     * <p>
     * The ARN of the connection specified for the API destination.
     * </p>
     */
    private String connectionArn;
    /**
     * <p>
     * The URL to the endpoint for the API destination.
     * </p>
     */
    private String invocationEndpoint;
    /**
     * <p>
     * The method to use to connect to the HTTP endpoint.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * The maximum number of invocations per second to send to the HTTP endpoint.
     * </p>
     */
    private Integer invocationRateLimitPerSecond;
    /**
     * <p>
     * A time stamp for the time that the API destination was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A time stamp for the time that the API destination was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The ARN of the API destination.
     * </p>
     * 
     * @param apiDestinationArn
     *        The ARN of the API destination.
     */

    public void setApiDestinationArn(String apiDestinationArn) {
        this.apiDestinationArn = apiDestinationArn;
    }

    /**
     * <p>
     * The ARN of the API destination.
     * </p>
     * 
     * @return The ARN of the API destination.
     */

    public String getApiDestinationArn() {
        return this.apiDestinationArn;
    }

    /**
     * <p>
     * The ARN of the API destination.
     * </p>
     * 
     * @param apiDestinationArn
     *        The ARN of the API destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiDestination withApiDestinationArn(String apiDestinationArn) {
        setApiDestinationArn(apiDestinationArn);
        return this;
    }

    /**
     * <p>
     * The name of the API destination.
     * </p>
     * 
     * @param name
     *        The name of the API destination.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the API destination.
     * </p>
     * 
     * @return The name of the API destination.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the API destination.
     * </p>
     * 
     * @param name
     *        The name of the API destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiDestination withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The state of the API destination.
     * </p>
     * 
     * @param apiDestinationState
     *        The state of the API destination.
     * @see ApiDestinationState
     */

    public void setApiDestinationState(String apiDestinationState) {
        this.apiDestinationState = apiDestinationState;
    }

    /**
     * <p>
     * The state of the API destination.
     * </p>
     * 
     * @return The state of the API destination.
     * @see ApiDestinationState
     */

    public String getApiDestinationState() {
        return this.apiDestinationState;
    }

    /**
     * <p>
     * The state of the API destination.
     * </p>
     * 
     * @param apiDestinationState
     *        The state of the API destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiDestinationState
     */

    public ApiDestination withApiDestinationState(String apiDestinationState) {
        setApiDestinationState(apiDestinationState);
        return this;
    }

    /**
     * <p>
     * The state of the API destination.
     * </p>
     * 
     * @param apiDestinationState
     *        The state of the API destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiDestinationState
     */

    public ApiDestination withApiDestinationState(ApiDestinationState apiDestinationState) {
        this.apiDestinationState = apiDestinationState.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the connection specified for the API destination.
     * </p>
     * 
     * @param connectionArn
     *        The ARN of the connection specified for the API destination.
     */

    public void setConnectionArn(String connectionArn) {
        this.connectionArn = connectionArn;
    }

    /**
     * <p>
     * The ARN of the connection specified for the API destination.
     * </p>
     * 
     * @return The ARN of the connection specified for the API destination.
     */

    public String getConnectionArn() {
        return this.connectionArn;
    }

    /**
     * <p>
     * The ARN of the connection specified for the API destination.
     * </p>
     * 
     * @param connectionArn
     *        The ARN of the connection specified for the API destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiDestination withConnectionArn(String connectionArn) {
        setConnectionArn(connectionArn);
        return this;
    }

    /**
     * <p>
     * The URL to the endpoint for the API destination.
     * </p>
     * 
     * @param invocationEndpoint
     *        The URL to the endpoint for the API destination.
     */

    public void setInvocationEndpoint(String invocationEndpoint) {
        this.invocationEndpoint = invocationEndpoint;
    }

    /**
     * <p>
     * The URL to the endpoint for the API destination.
     * </p>
     * 
     * @return The URL to the endpoint for the API destination.
     */

    public String getInvocationEndpoint() {
        return this.invocationEndpoint;
    }

    /**
     * <p>
     * The URL to the endpoint for the API destination.
     * </p>
     * 
     * @param invocationEndpoint
     *        The URL to the endpoint for the API destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiDestination withInvocationEndpoint(String invocationEndpoint) {
        setInvocationEndpoint(invocationEndpoint);
        return this;
    }

    /**
     * <p>
     * The method to use to connect to the HTTP endpoint.
     * </p>
     * 
     * @param httpMethod
     *        The method to use to connect to the HTTP endpoint.
     * @see ApiDestinationHttpMethod
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * The method to use to connect to the HTTP endpoint.
     * </p>
     * 
     * @return The method to use to connect to the HTTP endpoint.
     * @see ApiDestinationHttpMethod
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * The method to use to connect to the HTTP endpoint.
     * </p>
     * 
     * @param httpMethod
     *        The method to use to connect to the HTTP endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiDestinationHttpMethod
     */

    public ApiDestination withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * The method to use to connect to the HTTP endpoint.
     * </p>
     * 
     * @param httpMethod
     *        The method to use to connect to the HTTP endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiDestinationHttpMethod
     */

    public ApiDestination withHttpMethod(ApiDestinationHttpMethod httpMethod) {
        this.httpMethod = httpMethod.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of invocations per second to send to the HTTP endpoint.
     * </p>
     * 
     * @param invocationRateLimitPerSecond
     *        The maximum number of invocations per second to send to the HTTP endpoint.
     */

    public void setInvocationRateLimitPerSecond(Integer invocationRateLimitPerSecond) {
        this.invocationRateLimitPerSecond = invocationRateLimitPerSecond;
    }

    /**
     * <p>
     * The maximum number of invocations per second to send to the HTTP endpoint.
     * </p>
     * 
     * @return The maximum number of invocations per second to send to the HTTP endpoint.
     */

    public Integer getInvocationRateLimitPerSecond() {
        return this.invocationRateLimitPerSecond;
    }

    /**
     * <p>
     * The maximum number of invocations per second to send to the HTTP endpoint.
     * </p>
     * 
     * @param invocationRateLimitPerSecond
     *        The maximum number of invocations per second to send to the HTTP endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiDestination withInvocationRateLimitPerSecond(Integer invocationRateLimitPerSecond) {
        setInvocationRateLimitPerSecond(invocationRateLimitPerSecond);
        return this;
    }

    /**
     * <p>
     * A time stamp for the time that the API destination was created.
     * </p>
     * 
     * @param creationTime
     *        A time stamp for the time that the API destination was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A time stamp for the time that the API destination was created.
     * </p>
     * 
     * @return A time stamp for the time that the API destination was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A time stamp for the time that the API destination was created.
     * </p>
     * 
     * @param creationTime
     *        A time stamp for the time that the API destination was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiDestination withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A time stamp for the time that the API destination was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A time stamp for the time that the API destination was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A time stamp for the time that the API destination was last modified.
     * </p>
     * 
     * @return A time stamp for the time that the API destination was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A time stamp for the time that the API destination was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A time stamp for the time that the API destination was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiDestination withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getApiDestinationArn() != null)
            sb.append("ApiDestinationArn: ").append(getApiDestinationArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getApiDestinationState() != null)
            sb.append("ApiDestinationState: ").append(getApiDestinationState()).append(",");
        if (getConnectionArn() != null)
            sb.append("ConnectionArn: ").append(getConnectionArn()).append(",");
        if (getInvocationEndpoint() != null)
            sb.append("InvocationEndpoint: ").append(getInvocationEndpoint()).append(",");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: ").append(getHttpMethod()).append(",");
        if (getInvocationRateLimitPerSecond() != null)
            sb.append("InvocationRateLimitPerSecond: ").append(getInvocationRateLimitPerSecond()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiDestination == false)
            return false;
        ApiDestination other = (ApiDestination) obj;
        if (other.getApiDestinationArn() == null ^ this.getApiDestinationArn() == null)
            return false;
        if (other.getApiDestinationArn() != null && other.getApiDestinationArn().equals(this.getApiDestinationArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getApiDestinationState() == null ^ this.getApiDestinationState() == null)
            return false;
        if (other.getApiDestinationState() != null && other.getApiDestinationState().equals(this.getApiDestinationState()) == false)
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
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiDestinationArn() == null) ? 0 : getApiDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getApiDestinationState() == null) ? 0 : getApiDestinationState().hashCode());
        hashCode = prime * hashCode + ((getConnectionArn() == null) ? 0 : getConnectionArn().hashCode());
        hashCode = prime * hashCode + ((getInvocationEndpoint() == null) ? 0 : getInvocationEndpoint().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getInvocationRateLimitPerSecond() == null) ? 0 : getInvocationRateLimitPerSecond().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public ApiDestination clone() {
        try {
            return (ApiDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.ApiDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
