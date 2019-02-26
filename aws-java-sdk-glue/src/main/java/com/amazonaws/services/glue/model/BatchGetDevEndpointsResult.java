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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetDevEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetDevEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of DevEndpoint definitions.
     * </p>
     */
    private java.util.List<DevEndpoint> devEndpoints;
    /**
     * <p>
     * A list of DevEndpoints not found.
     * </p>
     */
    private java.util.List<String> devEndpointsNotFound;

    /**
     * <p>
     * A list of DevEndpoint definitions.
     * </p>
     * 
     * @return A list of DevEndpoint definitions.
     */

    public java.util.List<DevEndpoint> getDevEndpoints() {
        return devEndpoints;
    }

    /**
     * <p>
     * A list of DevEndpoint definitions.
     * </p>
     * 
     * @param devEndpoints
     *        A list of DevEndpoint definitions.
     */

    public void setDevEndpoints(java.util.Collection<DevEndpoint> devEndpoints) {
        if (devEndpoints == null) {
            this.devEndpoints = null;
            return;
        }

        this.devEndpoints = new java.util.ArrayList<DevEndpoint>(devEndpoints);
    }

    /**
     * <p>
     * A list of DevEndpoint definitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevEndpoints(java.util.Collection)} or {@link #withDevEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param devEndpoints
     *        A list of DevEndpoint definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDevEndpointsResult withDevEndpoints(DevEndpoint... devEndpoints) {
        if (this.devEndpoints == null) {
            setDevEndpoints(new java.util.ArrayList<DevEndpoint>(devEndpoints.length));
        }
        for (DevEndpoint ele : devEndpoints) {
            this.devEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DevEndpoint definitions.
     * </p>
     * 
     * @param devEndpoints
     *        A list of DevEndpoint definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDevEndpointsResult withDevEndpoints(java.util.Collection<DevEndpoint> devEndpoints) {
        setDevEndpoints(devEndpoints);
        return this;
    }

    /**
     * <p>
     * A list of DevEndpoints not found.
     * </p>
     * 
     * @return A list of DevEndpoints not found.
     */

    public java.util.List<String> getDevEndpointsNotFound() {
        return devEndpointsNotFound;
    }

    /**
     * <p>
     * A list of DevEndpoints not found.
     * </p>
     * 
     * @param devEndpointsNotFound
     *        A list of DevEndpoints not found.
     */

    public void setDevEndpointsNotFound(java.util.Collection<String> devEndpointsNotFound) {
        if (devEndpointsNotFound == null) {
            this.devEndpointsNotFound = null;
            return;
        }

        this.devEndpointsNotFound = new java.util.ArrayList<String>(devEndpointsNotFound);
    }

    /**
     * <p>
     * A list of DevEndpoints not found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevEndpointsNotFound(java.util.Collection)} or {@link #withDevEndpointsNotFound(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param devEndpointsNotFound
     *        A list of DevEndpoints not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDevEndpointsResult withDevEndpointsNotFound(String... devEndpointsNotFound) {
        if (this.devEndpointsNotFound == null) {
            setDevEndpointsNotFound(new java.util.ArrayList<String>(devEndpointsNotFound.length));
        }
        for (String ele : devEndpointsNotFound) {
            this.devEndpointsNotFound.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DevEndpoints not found.
     * </p>
     * 
     * @param devEndpointsNotFound
     *        A list of DevEndpoints not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDevEndpointsResult withDevEndpointsNotFound(java.util.Collection<String> devEndpointsNotFound) {
        setDevEndpointsNotFound(devEndpointsNotFound);
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
        if (getDevEndpoints() != null)
            sb.append("DevEndpoints: ").append(getDevEndpoints()).append(",");
        if (getDevEndpointsNotFound() != null)
            sb.append("DevEndpointsNotFound: ").append(getDevEndpointsNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDevEndpointsResult == false)
            return false;
        BatchGetDevEndpointsResult other = (BatchGetDevEndpointsResult) obj;
        if (other.getDevEndpoints() == null ^ this.getDevEndpoints() == null)
            return false;
        if (other.getDevEndpoints() != null && other.getDevEndpoints().equals(this.getDevEndpoints()) == false)
            return false;
        if (other.getDevEndpointsNotFound() == null ^ this.getDevEndpointsNotFound() == null)
            return false;
        if (other.getDevEndpointsNotFound() != null && other.getDevEndpointsNotFound().equals(this.getDevEndpointsNotFound()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevEndpoints() == null) ? 0 : getDevEndpoints().hashCode());
        hashCode = prime * hashCode + ((getDevEndpointsNotFound() == null) ? 0 : getDevEndpointsNotFound().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetDevEndpointsResult clone() {
        try {
            return (BatchGetDevEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
