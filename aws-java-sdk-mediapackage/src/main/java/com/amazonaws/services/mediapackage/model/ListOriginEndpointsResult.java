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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListOriginEndpoints" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOriginEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A token that can be used to resume pagination from the end of the collection. */
    private String nextToken;
    /** A list of OriginEndpoint records. */
    private java.util.List<OriginEndpoint> originEndpoints;

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * 
     * @param nextToken
     *        A token that can be used to resume pagination from the end of the collection.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * 
     * @return A token that can be used to resume pagination from the end of the collection.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token that can be used to resume pagination from the end of the collection.
     * 
     * @param nextToken
     *        A token that can be used to resume pagination from the end of the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOriginEndpointsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * A list of OriginEndpoint records.
     * 
     * @return A list of OriginEndpoint records.
     */

    public java.util.List<OriginEndpoint> getOriginEndpoints() {
        return originEndpoints;
    }

    /**
     * A list of OriginEndpoint records.
     * 
     * @param originEndpoints
     *        A list of OriginEndpoint records.
     */

    public void setOriginEndpoints(java.util.Collection<OriginEndpoint> originEndpoints) {
        if (originEndpoints == null) {
            this.originEndpoints = null;
            return;
        }

        this.originEndpoints = new java.util.ArrayList<OriginEndpoint>(originEndpoints);
    }

    /**
     * A list of OriginEndpoint records.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOriginEndpoints(java.util.Collection)} or {@link #withOriginEndpoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param originEndpoints
     *        A list of OriginEndpoint records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOriginEndpointsResult withOriginEndpoints(OriginEndpoint... originEndpoints) {
        if (this.originEndpoints == null) {
            setOriginEndpoints(new java.util.ArrayList<OriginEndpoint>(originEndpoints.length));
        }
        for (OriginEndpoint ele : originEndpoints) {
            this.originEndpoints.add(ele);
        }
        return this;
    }

    /**
     * A list of OriginEndpoint records.
     * 
     * @param originEndpoints
     *        A list of OriginEndpoint records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOriginEndpointsResult withOriginEndpoints(java.util.Collection<OriginEndpoint> originEndpoints) {
        setOriginEndpoints(originEndpoints);
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
        if (getOriginEndpoints() != null)
            sb.append("OriginEndpoints: ").append(getOriginEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOriginEndpointsResult == false)
            return false;
        ListOriginEndpointsResult other = (ListOriginEndpointsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOriginEndpoints() == null ^ this.getOriginEndpoints() == null)
            return false;
        if (other.getOriginEndpoints() != null && other.getOriginEndpoints().equals(this.getOriginEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOriginEndpoints() == null) ? 0 : getOriginEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public ListOriginEndpointsResult clone() {
        try {
            return (ListOriginEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
