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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetDevEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetDevEndpointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of DevEndpoint names, which may be the names returned from the <code>ListDevEndpoint</code> operation.
     * </p>
     */
    private java.util.List<String> devEndpointNames;

    /**
     * <p>
     * The list of DevEndpoint names, which may be the names returned from the <code>ListDevEndpoint</code> operation.
     * </p>
     * 
     * @return The list of DevEndpoint names, which may be the names returned from the <code>ListDevEndpoint</code>
     *         operation.
     */

    public java.util.List<String> getDevEndpointNames() {
        return devEndpointNames;
    }

    /**
     * <p>
     * The list of DevEndpoint names, which may be the names returned from the <code>ListDevEndpoint</code> operation.
     * </p>
     * 
     * @param devEndpointNames
     *        The list of DevEndpoint names, which may be the names returned from the <code>ListDevEndpoint</code>
     *        operation.
     */

    public void setDevEndpointNames(java.util.Collection<String> devEndpointNames) {
        if (devEndpointNames == null) {
            this.devEndpointNames = null;
            return;
        }

        this.devEndpointNames = new java.util.ArrayList<String>(devEndpointNames);
    }

    /**
     * <p>
     * The list of DevEndpoint names, which may be the names returned from the <code>ListDevEndpoint</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevEndpointNames(java.util.Collection)} or {@link #withDevEndpointNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param devEndpointNames
     *        The list of DevEndpoint names, which may be the names returned from the <code>ListDevEndpoint</code>
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDevEndpointsRequest withDevEndpointNames(String... devEndpointNames) {
        if (this.devEndpointNames == null) {
            setDevEndpointNames(new java.util.ArrayList<String>(devEndpointNames.length));
        }
        for (String ele : devEndpointNames) {
            this.devEndpointNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of DevEndpoint names, which may be the names returned from the <code>ListDevEndpoint</code> operation.
     * </p>
     * 
     * @param devEndpointNames
     *        The list of DevEndpoint names, which may be the names returned from the <code>ListDevEndpoint</code>
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDevEndpointsRequest withDevEndpointNames(java.util.Collection<String> devEndpointNames) {
        setDevEndpointNames(devEndpointNames);
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
        if (getDevEndpointNames() != null)
            sb.append("DevEndpointNames: ").append(getDevEndpointNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDevEndpointsRequest == false)
            return false;
        BatchGetDevEndpointsRequest other = (BatchGetDevEndpointsRequest) obj;
        if (other.getDevEndpointNames() == null ^ this.getDevEndpointNames() == null)
            return false;
        if (other.getDevEndpointNames() != null && other.getDevEndpointNames().equals(this.getDevEndpointNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevEndpointNames() == null) ? 0 : getDevEndpointNames().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetDevEndpointsRequest clone() {
        return (BatchGetDevEndpointsRequest) super.clone();
    }

}
