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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchTransitGatewayRoutesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the routes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TransitGatewayRoute> routes;
    /**
     * <p>
     * Indicates whether there are additional routes available.
     * </p>
     */
    private Boolean additionalRoutesAvailable;

    /**
     * <p>
     * Information about the routes.
     * </p>
     * 
     * @return Information about the routes.
     */

    public java.util.List<TransitGatewayRoute> getRoutes() {
        if (routes == null) {
            routes = new com.amazonaws.internal.SdkInternalList<TransitGatewayRoute>();
        }
        return routes;
    }

    /**
     * <p>
     * Information about the routes.
     * </p>
     * 
     * @param routes
     *        Information about the routes.
     */

    public void setRoutes(java.util.Collection<TransitGatewayRoute> routes) {
        if (routes == null) {
            this.routes = null;
            return;
        }

        this.routes = new com.amazonaws.internal.SdkInternalList<TransitGatewayRoute>(routes);
    }

    /**
     * <p>
     * Information about the routes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutes(java.util.Collection)} or {@link #withRoutes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param routes
     *        Information about the routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTransitGatewayRoutesResult withRoutes(TransitGatewayRoute... routes) {
        if (this.routes == null) {
            setRoutes(new com.amazonaws.internal.SdkInternalList<TransitGatewayRoute>(routes.length));
        }
        for (TransitGatewayRoute ele : routes) {
            this.routes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the routes.
     * </p>
     * 
     * @param routes
     *        Information about the routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTransitGatewayRoutesResult withRoutes(java.util.Collection<TransitGatewayRoute> routes) {
        setRoutes(routes);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are additional routes available.
     * </p>
     * 
     * @param additionalRoutesAvailable
     *        Indicates whether there are additional routes available.
     */

    public void setAdditionalRoutesAvailable(Boolean additionalRoutesAvailable) {
        this.additionalRoutesAvailable = additionalRoutesAvailable;
    }

    /**
     * <p>
     * Indicates whether there are additional routes available.
     * </p>
     * 
     * @return Indicates whether there are additional routes available.
     */

    public Boolean getAdditionalRoutesAvailable() {
        return this.additionalRoutesAvailable;
    }

    /**
     * <p>
     * Indicates whether there are additional routes available.
     * </p>
     * 
     * @param additionalRoutesAvailable
     *        Indicates whether there are additional routes available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTransitGatewayRoutesResult withAdditionalRoutesAvailable(Boolean additionalRoutesAvailable) {
        setAdditionalRoutesAvailable(additionalRoutesAvailable);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are additional routes available.
     * </p>
     * 
     * @return Indicates whether there are additional routes available.
     */

    public Boolean isAdditionalRoutesAvailable() {
        return this.additionalRoutesAvailable;
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
        if (getRoutes() != null)
            sb.append("Routes: ").append(getRoutes()).append(",");
        if (getAdditionalRoutesAvailable() != null)
            sb.append("AdditionalRoutesAvailable: ").append(getAdditionalRoutesAvailable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchTransitGatewayRoutesResult == false)
            return false;
        SearchTransitGatewayRoutesResult other = (SearchTransitGatewayRoutesResult) obj;
        if (other.getRoutes() == null ^ this.getRoutes() == null)
            return false;
        if (other.getRoutes() != null && other.getRoutes().equals(this.getRoutes()) == false)
            return false;
        if (other.getAdditionalRoutesAvailable() == null ^ this.getAdditionalRoutesAvailable() == null)
            return false;
        if (other.getAdditionalRoutesAvailable() != null && other.getAdditionalRoutesAvailable().equals(this.getAdditionalRoutesAvailable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoutes() == null) ? 0 : getRoutes().hashCode());
        hashCode = prime * hashCode + ((getAdditionalRoutesAvailable() == null) ? 0 : getAdditionalRoutesAvailable().hashCode());
        return hashCode;
    }

    @Override
    public SearchTransitGatewayRoutesResult clone() {
        try {
            return (SearchTransitGatewayRoutesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
