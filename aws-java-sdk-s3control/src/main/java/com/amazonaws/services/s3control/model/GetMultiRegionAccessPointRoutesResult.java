/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPointRoutes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMultiRegionAccessPointRoutesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The Multi-Region Access Point ARN.
     * </p>
     */
    private String mrap;
    /**
     * <p>
     * The different routes that make up the route configuration. Active routes return a value of <code>100</code>, and
     * passive routes return a value of <code>0</code>.
     * </p>
     */
    private java.util.List<MultiRegionAccessPointRoute> routes;

    /**
     * <p>
     * The Multi-Region Access Point ARN.
     * </p>
     * 
     * @param mrap
     *        The Multi-Region Access Point ARN.
     */

    public void setMrap(String mrap) {
        this.mrap = mrap;
    }

    /**
     * <p>
     * The Multi-Region Access Point ARN.
     * </p>
     * 
     * @return The Multi-Region Access Point ARN.
     */

    public String getMrap() {
        return this.mrap;
    }

    /**
     * <p>
     * The Multi-Region Access Point ARN.
     * </p>
     * 
     * @param mrap
     *        The Multi-Region Access Point ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMultiRegionAccessPointRoutesResult withMrap(String mrap) {
        setMrap(mrap);
        return this;
    }

    /**
     * <p>
     * The different routes that make up the route configuration. Active routes return a value of <code>100</code>, and
     * passive routes return a value of <code>0</code>.
     * </p>
     * 
     * @return The different routes that make up the route configuration. Active routes return a value of
     *         <code>100</code>, and passive routes return a value of <code>0</code>.
     */

    public java.util.List<MultiRegionAccessPointRoute> getRoutes() {
        return routes;
    }

    /**
     * <p>
     * The different routes that make up the route configuration. Active routes return a value of <code>100</code>, and
     * passive routes return a value of <code>0</code>.
     * </p>
     * 
     * @param routes
     *        The different routes that make up the route configuration. Active routes return a value of
     *        <code>100</code>, and passive routes return a value of <code>0</code>.
     */

    public void setRoutes(java.util.Collection<MultiRegionAccessPointRoute> routes) {
        if (routes == null) {
            this.routes = null;
            return;
        }

        this.routes = new java.util.ArrayList<MultiRegionAccessPointRoute>(routes);
    }

    /**
     * <p>
     * The different routes that make up the route configuration. Active routes return a value of <code>100</code>, and
     * passive routes return a value of <code>0</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutes(java.util.Collection)} or {@link #withRoutes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param routes
     *        The different routes that make up the route configuration. Active routes return a value of
     *        <code>100</code>, and passive routes return a value of <code>0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMultiRegionAccessPointRoutesResult withRoutes(MultiRegionAccessPointRoute... routes) {
        if (this.routes == null) {
            setRoutes(new java.util.ArrayList<MultiRegionAccessPointRoute>(routes.length));
        }
        for (MultiRegionAccessPointRoute ele : routes) {
            this.routes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The different routes that make up the route configuration. Active routes return a value of <code>100</code>, and
     * passive routes return a value of <code>0</code>.
     * </p>
     * 
     * @param routes
     *        The different routes that make up the route configuration. Active routes return a value of
     *        <code>100</code>, and passive routes return a value of <code>0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMultiRegionAccessPointRoutesResult withRoutes(java.util.Collection<MultiRegionAccessPointRoute> routes) {
        setRoutes(routes);
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
        if (getMrap() != null)
            sb.append("Mrap: ").append(getMrap()).append(",");
        if (getRoutes() != null)
            sb.append("Routes: ").append(getRoutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMultiRegionAccessPointRoutesResult == false)
            return false;
        GetMultiRegionAccessPointRoutesResult other = (GetMultiRegionAccessPointRoutesResult) obj;
        if (other.getMrap() == null ^ this.getMrap() == null)
            return false;
        if (other.getMrap() != null && other.getMrap().equals(this.getMrap()) == false)
            return false;
        if (other.getRoutes() == null ^ this.getRoutes() == null)
            return false;
        if (other.getRoutes() != null && other.getRoutes().equals(this.getRoutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMrap() == null) ? 0 : getMrap().hashCode());
        hashCode = prime * hashCode + ((getRoutes() == null) ? 0 : getRoutes().hashCode());
        return hashCode;
    }

    @Override
    public GetMultiRegionAccessPointRoutesResult clone() {
        try {
            return (GetMultiRegionAccessPointRoutesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
