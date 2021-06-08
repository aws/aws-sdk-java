/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRouteRequestParameterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The route request parameter key.
     * </p>
     */
    private String requestParameterKey;
    /**
     * <p>
     * The route ID.
     * </p>
     */
    private String routeId;

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @return The API identifier.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRouteRequestParameterRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The route request parameter key.
     * </p>
     * 
     * @param requestParameterKey
     *        The route request parameter key.
     */

    public void setRequestParameterKey(String requestParameterKey) {
        this.requestParameterKey = requestParameterKey;
    }

    /**
     * <p>
     * The route request parameter key.
     * </p>
     * 
     * @return The route request parameter key.
     */

    public String getRequestParameterKey() {
        return this.requestParameterKey;
    }

    /**
     * <p>
     * The route request parameter key.
     * </p>
     * 
     * @param requestParameterKey
     *        The route request parameter key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRouteRequestParameterRequest withRequestParameterKey(String requestParameterKey) {
        setRequestParameterKey(requestParameterKey);
        return this;
    }

    /**
     * <p>
     * The route ID.
     * </p>
     * 
     * @param routeId
     *        The route ID.
     */

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    /**
     * <p>
     * The route ID.
     * </p>
     * 
     * @return The route ID.
     */

    public String getRouteId() {
        return this.routeId;
    }

    /**
     * <p>
     * The route ID.
     * </p>
     * 
     * @param routeId
     *        The route ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRouteRequestParameterRequest withRouteId(String routeId) {
        setRouteId(routeId);
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getRequestParameterKey() != null)
            sb.append("RequestParameterKey: ").append(getRequestParameterKey()).append(",");
        if (getRouteId() != null)
            sb.append("RouteId: ").append(getRouteId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRouteRequestParameterRequest == false)
            return false;
        DeleteRouteRequestParameterRequest other = (DeleteRouteRequestParameterRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getRequestParameterKey() == null ^ this.getRequestParameterKey() == null)
            return false;
        if (other.getRequestParameterKey() != null && other.getRequestParameterKey().equals(this.getRequestParameterKey()) == false)
            return false;
        if (other.getRouteId() == null ^ this.getRouteId() == null)
            return false;
        if (other.getRouteId() != null && other.getRouteId().equals(this.getRouteId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getRequestParameterKey() == null) ? 0 : getRequestParameterKey().hashCode());
        hashCode = prime * hashCode + ((getRouteId() == null) ? 0 : getRouteId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRouteRequestParameterRequest clone() {
        return (DeleteRouteRequestParameterRequest) super.clone();
    }

}
