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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDevEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDevEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of DevEndpoint definitions.
     * </p>
     */
    private java.util.List<DevEndpoint> devEndpoints;
    /**
     * <p>
     * A continuation token, if not all DevEndpoint definitions have yet been returned.
     * </p>
     */
    private String nextToken;

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

    public GetDevEndpointsResult withDevEndpoints(DevEndpoint... devEndpoints) {
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

    public GetDevEndpointsResult withDevEndpoints(java.util.Collection<DevEndpoint> devEndpoints) {
        setDevEndpoints(devEndpoints);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all DevEndpoint definitions have yet been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all DevEndpoint definitions have yet been returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all DevEndpoint definitions have yet been returned.
     * </p>
     * 
     * @return A continuation token, if not all DevEndpoint definitions have yet been returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all DevEndpoint definitions have yet been returned.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if not all DevEndpoint definitions have yet been returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevEndpointsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDevEndpointsResult == false)
            return false;
        GetDevEndpointsResult other = (GetDevEndpointsResult) obj;
        if (other.getDevEndpoints() == null ^ this.getDevEndpoints() == null)
            return false;
        if (other.getDevEndpoints() != null && other.getDevEndpoints().equals(this.getDevEndpoints()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevEndpoints() == null) ? 0 : getDevEndpoints().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDevEndpointsResult clone() {
        try {
            return (GetDevEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
