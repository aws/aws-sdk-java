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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains the response to a <code>ListHealthChecks</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHealthChecks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHealthChecksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains one <code>HealthCheck</code> element for each health check that is associated with
     * the current AWS account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<HealthCheck> healthChecks;
    /**
     * <p>
     * For the second and subsequent calls to <code>ListHealthChecks</code>, <code>Marker</code> is the value that you
     * specified for the <code>marker</code> parameter in the previous request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A flag that indicates whether there are more health checks to be listed. If the response was truncated, you can
     * get the next group of health checks by submitting another <code>ListHealthChecks</code> request and specifying
     * the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextMarker</code> identifies the first
     * health check that Amazon Route 53 returns if you submit another <code>ListHealthChecks</code> request and specify
     * the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to <code>ListHealthChecks</code>
     * that produced the current response.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A complex type that contains one <code>HealthCheck</code> element for each health check that is associated with
     * the current AWS account.
     * </p>
     * 
     * @return A complex type that contains one <code>HealthCheck</code> element for each health check that is
     *         associated with the current AWS account.
     */

    public java.util.List<HealthCheck> getHealthChecks() {
        if (healthChecks == null) {
            healthChecks = new com.amazonaws.internal.SdkInternalList<HealthCheck>();
        }
        return healthChecks;
    }

    /**
     * <p>
     * A complex type that contains one <code>HealthCheck</code> element for each health check that is associated with
     * the current AWS account.
     * </p>
     * 
     * @param healthChecks
     *        A complex type that contains one <code>HealthCheck</code> element for each health check that is associated
     *        with the current AWS account.
     */

    public void setHealthChecks(java.util.Collection<HealthCheck> healthChecks) {
        if (healthChecks == null) {
            this.healthChecks = null;
            return;
        }

        this.healthChecks = new com.amazonaws.internal.SdkInternalList<HealthCheck>(healthChecks);
    }

    /**
     * <p>
     * A complex type that contains one <code>HealthCheck</code> element for each health check that is associated with
     * the current AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHealthChecks(java.util.Collection)} or {@link #withHealthChecks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param healthChecks
     *        A complex type that contains one <code>HealthCheck</code> element for each health check that is associated
     *        with the current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthChecksResult withHealthChecks(HealthCheck... healthChecks) {
        if (this.healthChecks == null) {
            setHealthChecks(new com.amazonaws.internal.SdkInternalList<HealthCheck>(healthChecks.length));
        }
        for (HealthCheck ele : healthChecks) {
            this.healthChecks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>HealthCheck</code> element for each health check that is associated with
     * the current AWS account.
     * </p>
     * 
     * @param healthChecks
     *        A complex type that contains one <code>HealthCheck</code> element for each health check that is associated
     *        with the current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthChecksResult withHealthChecks(java.util.Collection<HealthCheck> healthChecks) {
        setHealthChecks(healthChecks);
        return this;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHealthChecks</code>, <code>Marker</code> is the value that you
     * specified for the <code>marker</code> parameter in the previous request.
     * </p>
     * 
     * @param marker
     *        For the second and subsequent calls to <code>ListHealthChecks</code>, <code>Marker</code> is the value
     *        that you specified for the <code>marker</code> parameter in the previous request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHealthChecks</code>, <code>Marker</code> is the value that you
     * specified for the <code>marker</code> parameter in the previous request.
     * </p>
     * 
     * @return For the second and subsequent calls to <code>ListHealthChecks</code>, <code>Marker</code> is the value
     *         that you specified for the <code>marker</code> parameter in the previous request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHealthChecks</code>, <code>Marker</code> is the value that you
     * specified for the <code>marker</code> parameter in the previous request.
     * </p>
     * 
     * @param marker
     *        For the second and subsequent calls to <code>ListHealthChecks</code>, <code>Marker</code> is the value
     *        that you specified for the <code>marker</code> parameter in the previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthChecksResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more health checks to be listed. If the response was truncated, you can
     * get the next group of health checks by submitting another <code>ListHealthChecks</code> request and specifying
     * the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more health checks to be listed. If the response was truncated,
     *        you can get the next group of health checks by submitting another <code>ListHealthChecks</code> request
     *        and specifying the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more health checks to be listed. If the response was truncated, you can
     * get the next group of health checks by submitting another <code>ListHealthChecks</code> request and specifying
     * the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @return A flag that indicates whether there are more health checks to be listed. If the response was truncated,
     *         you can get the next group of health checks by submitting another <code>ListHealthChecks</code> request
     *         and specifying the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more health checks to be listed. If the response was truncated, you can
     * get the next group of health checks by submitting another <code>ListHealthChecks</code> request and specifying
     * the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more health checks to be listed. If the response was truncated,
     *        you can get the next group of health checks by submitting another <code>ListHealthChecks</code> request
     *        and specifying the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthChecksResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more health checks to be listed. If the response was truncated, you can
     * get the next group of health checks by submitting another <code>ListHealthChecks</code> request and specifying
     * the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @return A flag that indicates whether there are more health checks to be listed. If the response was truncated,
     *         you can get the next group of health checks by submitting another <code>ListHealthChecks</code> request
     *         and specifying the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextMarker</code> identifies the first
     * health check that Amazon Route 53 returns if you submit another <code>ListHealthChecks</code> request and specify
     * the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @param nextMarker
     *        If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextMarker</code> identifies the
     *        first health check that Amazon Route 53 returns if you submit another <code>ListHealthChecks</code>
     *        request and specify the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextMarker</code> identifies the first
     * health check that Amazon Route 53 returns if you submit another <code>ListHealthChecks</code> request and specify
     * the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @return If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextMarker</code> identifies the
     *         first health check that Amazon Route 53 returns if you submit another <code>ListHealthChecks</code>
     *         request and specify the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextMarker</code> identifies the first
     * health check that Amazon Route 53 returns if you submit another <code>ListHealthChecks</code> request and specify
     * the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @param nextMarker
     *        If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextMarker</code> identifies the
     *        first health check that Amazon Route 53 returns if you submit another <code>ListHealthChecks</code>
     *        request and specify the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthChecksResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to <code>ListHealthChecks</code>
     * that produced the current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>maxitems</code> parameter in the call to
     *        <code>ListHealthChecks</code> that produced the current response.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to <code>ListHealthChecks</code>
     * that produced the current response.
     * </p>
     * 
     * @return The value that you specified for the <code>maxitems</code> parameter in the call to
     *         <code>ListHealthChecks</code> that produced the current response.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to <code>ListHealthChecks</code>
     * that produced the current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>maxitems</code> parameter in the call to
     *        <code>ListHealthChecks</code> that produced the current response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthChecksResult withMaxItems(String maxItems) {
        setMaxItems(maxItems);
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
        if (getHealthChecks() != null)
            sb.append("HealthChecks: ").append(getHealthChecks()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHealthChecksResult == false)
            return false;
        ListHealthChecksResult other = (ListHealthChecksResult) obj;
        if (other.getHealthChecks() == null ^ this.getHealthChecks() == null)
            return false;
        if (other.getHealthChecks() != null && other.getHealthChecks().equals(this.getHealthChecks()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthChecks() == null) ? 0 : getHealthChecks().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListHealthChecksResult clone() {
        try {
            return (ListHealthChecksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
