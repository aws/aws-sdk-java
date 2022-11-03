/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServicePipelineOutputs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServicePipelineOutputsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token that indicates the location of the next output in the array of outputs, after the list of outputs that
     * was previously requested.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The name of the service whose pipeline's outputs you want.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * A token that indicates the location of the next output in the array of outputs, after the list of outputs that
     * was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next output in the array of outputs, after the list of outputs
     *        that was previously requested.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next output in the array of outputs, after the list of outputs that
     * was previously requested.
     * </p>
     * 
     * @return A token that indicates the location of the next output in the array of outputs, after the list of outputs
     *         that was previously requested.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next output in the array of outputs, after the list of outputs that
     * was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next output in the array of outputs, after the list of outputs
     *        that was previously requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicePipelineOutputsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The name of the service whose pipeline's outputs you want.
     * </p>
     * 
     * @param serviceName
     *        The name of the service whose pipeline's outputs you want.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service whose pipeline's outputs you want.
     * </p>
     * 
     * @return The name of the service whose pipeline's outputs you want.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service whose pipeline's outputs you want.
     * </p>
     * 
     * @param serviceName
     *        The name of the service whose pipeline's outputs you want.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicePipelineOutputsRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServicePipelineOutputsRequest == false)
            return false;
        ListServicePipelineOutputsRequest other = (ListServicePipelineOutputsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public ListServicePipelineOutputsRequest clone() {
        return (ListServicePipelineOutputsRequest) super.clone();
    }

}
