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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/GetDataEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream that you want to get the endpoint for. You must specify either this parameter or a
     * <code>StreamARN</code> in the request.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to get the endpoint for. You must specify either this
     * parameter or a <code>StreamName</code> in the request.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The name of the API action for which to get an endpoint.
     * </p>
     */
    private String aPIName;

    /**
     * <p>
     * The name of the stream that you want to get the endpoint for. You must specify either this parameter or a
     * <code>StreamARN</code> in the request.
     * </p>
     * 
     * @param streamName
     *        The name of the stream that you want to get the endpoint for. You must specify either this parameter or a
     *        <code>StreamARN</code> in the request.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream that you want to get the endpoint for. You must specify either this parameter or a
     * <code>StreamARN</code> in the request.
     * </p>
     * 
     * @return The name of the stream that you want to get the endpoint for. You must specify either this parameter or a
     *         <code>StreamARN</code> in the request.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream that you want to get the endpoint for. You must specify either this parameter or a
     * <code>StreamARN</code> in the request.
     * </p>
     * 
     * @param streamName
     *        The name of the stream that you want to get the endpoint for. You must specify either this parameter or a
     *        <code>StreamARN</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataEndpointRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to get the endpoint for. You must specify either this
     * parameter or a <code>StreamName</code> in the request.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream that you want to get the endpoint for. You must specify
     *        either this parameter or a <code>StreamName</code> in the request.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to get the endpoint for. You must specify either this
     * parameter or a <code>StreamName</code> in the request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stream that you want to get the endpoint for. You must specify
     *         either this parameter or a <code>StreamName</code> in the request.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream that you want to get the endpoint for. You must specify either this
     * parameter or a <code>StreamName</code> in the request.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream that you want to get the endpoint for. You must specify
     *        either this parameter or a <code>StreamName</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataEndpointRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The name of the API action for which to get an endpoint.
     * </p>
     * 
     * @param aPIName
     *        The name of the API action for which to get an endpoint.
     * @see APIName
     */

    public void setAPIName(String aPIName) {
        this.aPIName = aPIName;
    }

    /**
     * <p>
     * The name of the API action for which to get an endpoint.
     * </p>
     * 
     * @return The name of the API action for which to get an endpoint.
     * @see APIName
     */

    public String getAPIName() {
        return this.aPIName;
    }

    /**
     * <p>
     * The name of the API action for which to get an endpoint.
     * </p>
     * 
     * @param aPIName
     *        The name of the API action for which to get an endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see APIName
     */

    public GetDataEndpointRequest withAPIName(String aPIName) {
        setAPIName(aPIName);
        return this;
    }

    /**
     * <p>
     * The name of the API action for which to get an endpoint.
     * </p>
     * 
     * @param aPIName
     *        The name of the API action for which to get an endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see APIName
     */

    public GetDataEndpointRequest withAPIName(APIName aPIName) {
        this.aPIName = aPIName.toString();
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getAPIName() != null)
            sb.append("APIName: ").append(getAPIName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataEndpointRequest == false)
            return false;
        GetDataEndpointRequest other = (GetDataEndpointRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getAPIName() == null ^ this.getAPIName() == null)
            return false;
        if (other.getAPIName() != null && other.getAPIName().equals(this.getAPIName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getAPIName() == null) ? 0 : getAPIName().hashCode());
        return hashCode;
    }

    @Override
    public GetDataEndpointRequest clone() {
        return (GetDataEndpointRequest) super.clone();
    }

}
