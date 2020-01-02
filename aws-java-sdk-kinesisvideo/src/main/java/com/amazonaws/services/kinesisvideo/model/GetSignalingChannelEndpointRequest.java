/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/GetSignalingChannelEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSignalingChannelEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the signalling channel for which you want to get an endpoint.
     * </p>
     */
    private String channelARN;
    /**
     * <p>
     * A structure containing the endpoint configuration for the <code>SINGLE_MASTER</code> channel type.
     * </p>
     */
    private SingleMasterChannelEndpointConfiguration singleMasterChannelEndpointConfiguration;

    /**
     * <p>
     * The ARN of the signalling channel for which you want to get an endpoint.
     * </p>
     * 
     * @param channelARN
     *        The ARN of the signalling channel for which you want to get an endpoint.
     */

    public void setChannelARN(String channelARN) {
        this.channelARN = channelARN;
    }

    /**
     * <p>
     * The ARN of the signalling channel for which you want to get an endpoint.
     * </p>
     * 
     * @return The ARN of the signalling channel for which you want to get an endpoint.
     */

    public String getChannelARN() {
        return this.channelARN;
    }

    /**
     * <p>
     * The ARN of the signalling channel for which you want to get an endpoint.
     * </p>
     * 
     * @param channelARN
     *        The ARN of the signalling channel for which you want to get an endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSignalingChannelEndpointRequest withChannelARN(String channelARN) {
        setChannelARN(channelARN);
        return this;
    }

    /**
     * <p>
     * A structure containing the endpoint configuration for the <code>SINGLE_MASTER</code> channel type.
     * </p>
     * 
     * @param singleMasterChannelEndpointConfiguration
     *        A structure containing the endpoint configuration for the <code>SINGLE_MASTER</code> channel type.
     */

    public void setSingleMasterChannelEndpointConfiguration(SingleMasterChannelEndpointConfiguration singleMasterChannelEndpointConfiguration) {
        this.singleMasterChannelEndpointConfiguration = singleMasterChannelEndpointConfiguration;
    }

    /**
     * <p>
     * A structure containing the endpoint configuration for the <code>SINGLE_MASTER</code> channel type.
     * </p>
     * 
     * @return A structure containing the endpoint configuration for the <code>SINGLE_MASTER</code> channel type.
     */

    public SingleMasterChannelEndpointConfiguration getSingleMasterChannelEndpointConfiguration() {
        return this.singleMasterChannelEndpointConfiguration;
    }

    /**
     * <p>
     * A structure containing the endpoint configuration for the <code>SINGLE_MASTER</code> channel type.
     * </p>
     * 
     * @param singleMasterChannelEndpointConfiguration
     *        A structure containing the endpoint configuration for the <code>SINGLE_MASTER</code> channel type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSignalingChannelEndpointRequest withSingleMasterChannelEndpointConfiguration(
            SingleMasterChannelEndpointConfiguration singleMasterChannelEndpointConfiguration) {
        setSingleMasterChannelEndpointConfiguration(singleMasterChannelEndpointConfiguration);
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
        if (getChannelARN() != null)
            sb.append("ChannelARN: ").append(getChannelARN()).append(",");
        if (getSingleMasterChannelEndpointConfiguration() != null)
            sb.append("SingleMasterChannelEndpointConfiguration: ").append(getSingleMasterChannelEndpointConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSignalingChannelEndpointRequest == false)
            return false;
        GetSignalingChannelEndpointRequest other = (GetSignalingChannelEndpointRequest) obj;
        if (other.getChannelARN() == null ^ this.getChannelARN() == null)
            return false;
        if (other.getChannelARN() != null && other.getChannelARN().equals(this.getChannelARN()) == false)
            return false;
        if (other.getSingleMasterChannelEndpointConfiguration() == null ^ this.getSingleMasterChannelEndpointConfiguration() == null)
            return false;
        if (other.getSingleMasterChannelEndpointConfiguration() != null
                && other.getSingleMasterChannelEndpointConfiguration().equals(this.getSingleMasterChannelEndpointConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelARN() == null) ? 0 : getChannelARN().hashCode());
        hashCode = prime * hashCode + ((getSingleMasterChannelEndpointConfiguration() == null) ? 0 : getSingleMasterChannelEndpointConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetSignalingChannelEndpointRequest clone() {
        return (GetSignalingChannelEndpointRequest) super.clone();
    }

}
