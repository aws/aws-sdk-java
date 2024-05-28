/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateWorker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The farm ID of the farm to connect to the worker.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The fleet ID to connect to the worker.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The IP address and host name of the worker.
     * </p>
     */
    private HostPropertiesRequest hostProperties;

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @return The unique token which the server uses to recognize retries of the same request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkerRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The farm ID of the farm to connect to the worker.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm to connect to the worker.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the farm to connect to the worker.
     * </p>
     * 
     * @return The farm ID of the farm to connect to the worker.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the farm to connect to the worker.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm to connect to the worker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkerRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The fleet ID to connect to the worker.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID to connect to the worker.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The fleet ID to connect to the worker.
     * </p>
     * 
     * @return The fleet ID to connect to the worker.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The fleet ID to connect to the worker.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID to connect to the worker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkerRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The IP address and host name of the worker.
     * </p>
     * 
     * @param hostProperties
     *        The IP address and host name of the worker.
     */

    public void setHostProperties(HostPropertiesRequest hostProperties) {
        this.hostProperties = hostProperties;
    }

    /**
     * <p>
     * The IP address and host name of the worker.
     * </p>
     * 
     * @return The IP address and host name of the worker.
     */

    public HostPropertiesRequest getHostProperties() {
        return this.hostProperties;
    }

    /**
     * <p>
     * The IP address and host name of the worker.
     * </p>
     * 
     * @param hostProperties
     *        The IP address and host name of the worker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkerRequest withHostProperties(HostPropertiesRequest hostProperties) {
        setHostProperties(hostProperties);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getHostProperties() != null)
            sb.append("HostProperties: ").append(getHostProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkerRequest == false)
            return false;
        CreateWorkerRequest other = (CreateWorkerRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getHostProperties() == null ^ this.getHostProperties() == null)
            return false;
        if (other.getHostProperties() != null && other.getHostProperties().equals(this.getHostProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getHostProperties() == null) ? 0 : getHostProperties().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkerRequest clone() {
        return (CreateWorkerRequest) super.clone();
    }

}
