/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RequestSpotFleetRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#requestSpotFleet(RequestSpotFleetRequest) RequestSpotFleet operation}.
 * <p>
 * Creates a Spot fleet request.
 * </p>
 * <p>
 * You can submit a single request that includes multiple launch
 * specifications that vary by instance type, AMI, Availability Zone, or
 * subnet.
 * </p>
 * <p>
 * By default, the Spot fleet requests Spot instances in the Spot pool
 * where the price per unit is the lowest. Each launch specification can
 * include its own instance weighting that reflects the value of the
 * instance type to your application workload.
 * </p>
 * <p>
 * Alternatively, you can specify that the Spot fleet distribute the
 * target capacity across the Spot pools included in its launch
 * specifications. By ensuring that the Spot instances in your Spot fleet
 * are in different Spot pools, you can improve the availability of your
 * fleet.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html"> Spot Fleet Requests </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#requestSpotFleet(RequestSpotFleetRequest)
 */
public class RequestSpotFleetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<RequestSpotFleetRequest> {

    /**
     * The configuration for the Spot fleet request.
     */
    private SpotFleetRequestConfigData spotFleetRequestConfig;

    /**
     * The configuration for the Spot fleet request.
     *
     * @return The configuration for the Spot fleet request.
     */
    public SpotFleetRequestConfigData getSpotFleetRequestConfig() {
        return spotFleetRequestConfig;
    }
    
    /**
     * The configuration for the Spot fleet request.
     *
     * @param spotFleetRequestConfig The configuration for the Spot fleet request.
     */
    public void setSpotFleetRequestConfig(SpotFleetRequestConfigData spotFleetRequestConfig) {
        this.spotFleetRequestConfig = spotFleetRequestConfig;
    }
    
    /**
     * The configuration for the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotFleetRequestConfig The configuration for the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RequestSpotFleetRequest withSpotFleetRequestConfig(SpotFleetRequestConfigData spotFleetRequestConfig) {
        this.spotFleetRequestConfig = spotFleetRequestConfig;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<RequestSpotFleetRequest> getDryRunRequest() {
        Request<RequestSpotFleetRequest> request = new RequestSpotFleetRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSpotFleetRequestConfig() != null) sb.append("SpotFleetRequestConfig: " + getSpotFleetRequestConfig() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotFleetRequestConfig() == null) ? 0 : getSpotFleetRequestConfig().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RequestSpotFleetRequest == false) return false;
        RequestSpotFleetRequest other = (RequestSpotFleetRequest)obj;
        
        if (other.getSpotFleetRequestConfig() == null ^ this.getSpotFleetRequestConfig() == null) return false;
        if (other.getSpotFleetRequestConfig() != null && other.getSpotFleetRequestConfig().equals(this.getSpotFleetRequestConfig()) == false) return false; 
        return true;
    }
    
    @Override
    public RequestSpotFleetRequest clone() {
        
            return (RequestSpotFleetRequest) super.clone();
    }

}
    