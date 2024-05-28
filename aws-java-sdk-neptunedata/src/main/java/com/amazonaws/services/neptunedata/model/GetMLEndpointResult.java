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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetMLEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMLEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the inference endpoint.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The unique identifier of the inference endpoint.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The endpoint definition.
     * </p>
     */
    private MlResourceDefinition endpoint;
    /**
     * <p>
     * The endpoint configuration
     * </p>
     */
    private MlConfigDefinition endpointConfig;

    /**
     * <p>
     * The status of the inference endpoint.
     * </p>
     * 
     * @param status
     *        The status of the inference endpoint.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the inference endpoint.
     * </p>
     * 
     * @return The status of the inference endpoint.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the inference endpoint.
     * </p>
     * 
     * @param status
     *        The status of the inference endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLEndpointResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the inference endpoint.
     * </p>
     * 
     * @param id
     *        The unique identifier of the inference endpoint.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the inference endpoint.
     * </p>
     * 
     * @return The unique identifier of the inference endpoint.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the inference endpoint.
     * </p>
     * 
     * @param id
     *        The unique identifier of the inference endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLEndpointResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The endpoint definition.
     * </p>
     * 
     * @param endpoint
     *        The endpoint definition.
     */

    public void setEndpoint(MlResourceDefinition endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint definition.
     * </p>
     * 
     * @return The endpoint definition.
     */

    public MlResourceDefinition getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint definition.
     * </p>
     * 
     * @param endpoint
     *        The endpoint definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLEndpointResult withEndpoint(MlResourceDefinition endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The endpoint configuration
     * </p>
     * 
     * @param endpointConfig
     *        The endpoint configuration
     */

    public void setEndpointConfig(MlConfigDefinition endpointConfig) {
        this.endpointConfig = endpointConfig;
    }

    /**
     * <p>
     * The endpoint configuration
     * </p>
     * 
     * @return The endpoint configuration
     */

    public MlConfigDefinition getEndpointConfig() {
        return this.endpointConfig;
    }

    /**
     * <p>
     * The endpoint configuration
     * </p>
     * 
     * @param endpointConfig
     *        The endpoint configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMLEndpointResult withEndpointConfig(MlConfigDefinition endpointConfig) {
        setEndpointConfig(endpointConfig);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getEndpointConfig() != null)
            sb.append("EndpointConfig: ").append(getEndpointConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMLEndpointResult == false)
            return false;
        GetMLEndpointResult other = (GetMLEndpointResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getEndpointConfig() == null ^ this.getEndpointConfig() == null)
            return false;
        if (other.getEndpointConfig() != null && other.getEndpointConfig().equals(this.getEndpointConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfig() == null) ? 0 : getEndpointConfig().hashCode());
        return hashCode;
    }

    @Override
    public GetMLEndpointResult clone() {
        try {
            return (GetMLEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
