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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The unique ID of your Amazon Pinpoint application. */
    private String applicationId;
    /** The unique ID of the endpoint. */
    private String endpointId;

    /**
     * The unique ID of your Amazon Pinpoint application.
     * 
     * @param applicationId
     *        The unique ID of your Amazon Pinpoint application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The unique ID of your Amazon Pinpoint application.
     * 
     * @return The unique ID of your Amazon Pinpoint application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The unique ID of your Amazon Pinpoint application.
     * 
     * @param applicationId
     *        The unique ID of your Amazon Pinpoint application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEndpointRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * The unique ID of the endpoint.
     * 
     * @param endpointId
     *        The unique ID of the endpoint.
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * The unique ID of the endpoint.
     * 
     * @return The unique ID of the endpoint.
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * The unique ID of the endpoint.
     * 
     * @param endpointId
     *        The unique ID of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEndpointRequest withEndpointId(String endpointId) {
        setEndpointId(endpointId);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append(getEndpointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEndpointRequest == false)
            return false;
        DeleteEndpointRequest other = (DeleteEndpointRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEndpointRequest clone() {
        return (DeleteEndpointRequest) super.clone();
    }

}
