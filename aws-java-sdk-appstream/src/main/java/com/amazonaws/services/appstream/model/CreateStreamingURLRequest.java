/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStreamingURL" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStreamingURLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The stack for which the URL is generated.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The fleet for which the URL is generated.
     * </p>
     */
    private String fleetName;
    /**
     * <p>
     * A unique user ID for whom the URL is generated.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The ID of the application that must be launched after the session starts.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The validity duration of the URL in seconds. After this duration, the URL returned by this operation becomes
     * invalid.
     * </p>
     */
    private Long validity;
    /**
     * <p>
     * The sessionContext of the streaming URL.
     * </p>
     */
    private String sessionContext;

    /**
     * <p>
     * The stack for which the URL is generated.
     * </p>
     * 
     * @param stackName
     *        The stack for which the URL is generated.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The stack for which the URL is generated.
     * </p>
     * 
     * @return The stack for which the URL is generated.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The stack for which the URL is generated.
     * </p>
     * 
     * @param stackName
     *        The stack for which the URL is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingURLRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The fleet for which the URL is generated.
     * </p>
     * 
     * @param fleetName
     *        The fleet for which the URL is generated.
     */

    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    /**
     * <p>
     * The fleet for which the URL is generated.
     * </p>
     * 
     * @return The fleet for which the URL is generated.
     */

    public String getFleetName() {
        return this.fleetName;
    }

    /**
     * <p>
     * The fleet for which the URL is generated.
     * </p>
     * 
     * @param fleetName
     *        The fleet for which the URL is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingURLRequest withFleetName(String fleetName) {
        setFleetName(fleetName);
        return this;
    }

    /**
     * <p>
     * A unique user ID for whom the URL is generated.
     * </p>
     * 
     * @param userId
     *        A unique user ID for whom the URL is generated.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * A unique user ID for whom the URL is generated.
     * </p>
     * 
     * @return A unique user ID for whom the URL is generated.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * A unique user ID for whom the URL is generated.
     * </p>
     * 
     * @param userId
     *        A unique user ID for whom the URL is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingURLRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The ID of the application that must be launched after the session starts.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application that must be launched after the session starts.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application that must be launched after the session starts.
     * </p>
     * 
     * @return The ID of the application that must be launched after the session starts.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application that must be launched after the session starts.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application that must be launched after the session starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingURLRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The validity duration of the URL in seconds. After this duration, the URL returned by this operation becomes
     * invalid.
     * </p>
     * 
     * @param validity
     *        The validity duration of the URL in seconds. After this duration, the URL returned by this operation
     *        becomes invalid.
     */

    public void setValidity(Long validity) {
        this.validity = validity;
    }

    /**
     * <p>
     * The validity duration of the URL in seconds. After this duration, the URL returned by this operation becomes
     * invalid.
     * </p>
     * 
     * @return The validity duration of the URL in seconds. After this duration, the URL returned by this operation
     *         becomes invalid.
     */

    public Long getValidity() {
        return this.validity;
    }

    /**
     * <p>
     * The validity duration of the URL in seconds. After this duration, the URL returned by this operation becomes
     * invalid.
     * </p>
     * 
     * @param validity
     *        The validity duration of the URL in seconds. After this duration, the URL returned by this operation
     *        becomes invalid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingURLRequest withValidity(Long validity) {
        setValidity(validity);
        return this;
    }

    /**
     * <p>
     * The sessionContext of the streaming URL.
     * </p>
     * 
     * @param sessionContext
     *        The sessionContext of the streaming URL.
     */

    public void setSessionContext(String sessionContext) {
        this.sessionContext = sessionContext;
    }

    /**
     * <p>
     * The sessionContext of the streaming URL.
     * </p>
     * 
     * @return The sessionContext of the streaming URL.
     */

    public String getSessionContext() {
        return this.sessionContext;
    }

    /**
     * <p>
     * The sessionContext of the streaming URL.
     * </p>
     * 
     * @param sessionContext
     *        The sessionContext of the streaming URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingURLRequest withSessionContext(String sessionContext) {
        setSessionContext(sessionContext);
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getFleetName() != null)
            sb.append("FleetName: ").append(getFleetName()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getValidity() != null)
            sb.append("Validity: ").append(getValidity()).append(",");
        if (getSessionContext() != null)
            sb.append("SessionContext: ").append(getSessionContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamingURLRequest == false)
            return false;
        CreateStreamingURLRequest other = (CreateStreamingURLRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getFleetName() == null ^ this.getFleetName() == null)
            return false;
        if (other.getFleetName() != null && other.getFleetName().equals(this.getFleetName()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getValidity() == null ^ this.getValidity() == null)
            return false;
        if (other.getValidity() != null && other.getValidity().equals(this.getValidity()) == false)
            return false;
        if (other.getSessionContext() == null ^ this.getSessionContext() == null)
            return false;
        if (other.getSessionContext() != null && other.getSessionContext().equals(this.getSessionContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getFleetName() == null) ? 0 : getFleetName().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getValidity() == null) ? 0 : getValidity().hashCode());
        hashCode = prime * hashCode + ((getSessionContext() == null) ? 0 : getSessionContext().hashCode());
        return hashCode;
    }

    @Override
    public CreateStreamingURLRequest clone() {
        return (CreateStreamingURLRequest) super.clone();
    }

}
