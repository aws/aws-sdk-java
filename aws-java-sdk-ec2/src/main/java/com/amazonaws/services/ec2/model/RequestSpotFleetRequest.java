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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RequestSpotFleetRequestMarshaller;

/**
 * <p>
 * Contains the parameters for RequestSpotFleet.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestSpotFleetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<RequestSpotFleetRequest> {

    /**
     * <p>
     * The configuration for the Spot Fleet request.
     * </p>
     */
    private SpotFleetRequestConfigData spotFleetRequestConfig;

    /**
     * <p>
     * The configuration for the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestConfig
     *        The configuration for the Spot Fleet request.
     */

    public void setSpotFleetRequestConfig(SpotFleetRequestConfigData spotFleetRequestConfig) {
        this.spotFleetRequestConfig = spotFleetRequestConfig;
    }

    /**
     * <p>
     * The configuration for the Spot Fleet request.
     * </p>
     * 
     * @return The configuration for the Spot Fleet request.
     */

    public SpotFleetRequestConfigData getSpotFleetRequestConfig() {
        return this.spotFleetRequestConfig;
    }

    /**
     * <p>
     * The configuration for the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestConfig
     *        The configuration for the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestSpotFleetRequest withSpotFleetRequestConfig(SpotFleetRequestConfigData spotFleetRequestConfig) {
        setSpotFleetRequestConfig(spotFleetRequestConfig);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<RequestSpotFleetRequest> getDryRunRequest() {
        Request<RequestSpotFleetRequest> request = new RequestSpotFleetRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSpotFleetRequestConfig() != null)
            sb.append("SpotFleetRequestConfig: ").append(getSpotFleetRequestConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestSpotFleetRequest == false)
            return false;
        RequestSpotFleetRequest other = (RequestSpotFleetRequest) obj;
        if (other.getSpotFleetRequestConfig() == null ^ this.getSpotFleetRequestConfig() == null)
            return false;
        if (other.getSpotFleetRequestConfig() != null && other.getSpotFleetRequestConfig().equals(this.getSpotFleetRequestConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpotFleetRequestConfig() == null) ? 0 : getSpotFleetRequestConfig().hashCode());
        return hashCode;
    }

    @Override
    public RequestSpotFleetRequest clone() {
        return (RequestSpotFleetRequest) super.clone();
    }
}
