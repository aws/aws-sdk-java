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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/SubmitMultiRegionAccessPointRoutes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubmitMultiRegionAccessPointRoutesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Multi-Region Access Point ARN.
     * </p>
     */
    private String mrap;
    /**
     * <p>
     * The different routes that make up the new route configuration. Active routes return a value of <code>100</code>,
     * and passive routes return a value of <code>0</code>.
     * </p>
     */
    private java.util.List<MultiRegionAccessPointRoute> routeUpdates;

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     * 
     * @return The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitMultiRegionAccessPointRoutesRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

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

    public SubmitMultiRegionAccessPointRoutesRequest withMrap(String mrap) {
        setMrap(mrap);
        return this;
    }

    /**
     * <p>
     * The different routes that make up the new route configuration. Active routes return a value of <code>100</code>,
     * and passive routes return a value of <code>0</code>.
     * </p>
     * 
     * @return The different routes that make up the new route configuration. Active routes return a value of
     *         <code>100</code>, and passive routes return a value of <code>0</code>.
     */

    public java.util.List<MultiRegionAccessPointRoute> getRouteUpdates() {
        return routeUpdates;
    }

    /**
     * <p>
     * The different routes that make up the new route configuration. Active routes return a value of <code>100</code>,
     * and passive routes return a value of <code>0</code>.
     * </p>
     * 
     * @param routeUpdates
     *        The different routes that make up the new route configuration. Active routes return a value of
     *        <code>100</code>, and passive routes return a value of <code>0</code>.
     */

    public void setRouteUpdates(java.util.Collection<MultiRegionAccessPointRoute> routeUpdates) {
        if (routeUpdates == null) {
            this.routeUpdates = null;
            return;
        }

        this.routeUpdates = new java.util.ArrayList<MultiRegionAccessPointRoute>(routeUpdates);
    }

    /**
     * <p>
     * The different routes that make up the new route configuration. Active routes return a value of <code>100</code>,
     * and passive routes return a value of <code>0</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteUpdates(java.util.Collection)} or {@link #withRouteUpdates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param routeUpdates
     *        The different routes that make up the new route configuration. Active routes return a value of
     *        <code>100</code>, and passive routes return a value of <code>0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitMultiRegionAccessPointRoutesRequest withRouteUpdates(MultiRegionAccessPointRoute... routeUpdates) {
        if (this.routeUpdates == null) {
            setRouteUpdates(new java.util.ArrayList<MultiRegionAccessPointRoute>(routeUpdates.length));
        }
        for (MultiRegionAccessPointRoute ele : routeUpdates) {
            this.routeUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The different routes that make up the new route configuration. Active routes return a value of <code>100</code>,
     * and passive routes return a value of <code>0</code>.
     * </p>
     * 
     * @param routeUpdates
     *        The different routes that make up the new route configuration. Active routes return a value of
     *        <code>100</code>, and passive routes return a value of <code>0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitMultiRegionAccessPointRoutesRequest withRouteUpdates(java.util.Collection<MultiRegionAccessPointRoute> routeUpdates) {
        setRouteUpdates(routeUpdates);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getMrap() != null)
            sb.append("Mrap: ").append(getMrap()).append(",");
        if (getRouteUpdates() != null)
            sb.append("RouteUpdates: ").append(getRouteUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubmitMultiRegionAccessPointRoutesRequest == false)
            return false;
        SubmitMultiRegionAccessPointRoutesRequest other = (SubmitMultiRegionAccessPointRoutesRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getMrap() == null ^ this.getMrap() == null)
            return false;
        if (other.getMrap() != null && other.getMrap().equals(this.getMrap()) == false)
            return false;
        if (other.getRouteUpdates() == null ^ this.getRouteUpdates() == null)
            return false;
        if (other.getRouteUpdates() != null && other.getRouteUpdates().equals(this.getRouteUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getMrap() == null) ? 0 : getMrap().hashCode());
        hashCode = prime * hashCode + ((getRouteUpdates() == null) ? 0 : getRouteUpdates().hashCode());
        return hashCode;
    }

    @Override
    public SubmitMultiRegionAccessPointRoutesRequest clone() {
        return (SubmitMultiRegionAccessPointRoutesRequest) super.clone();
    }

}
