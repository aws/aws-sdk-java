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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to retrieve a list of the health checks that are associated with the current AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHealthChecks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHealthChecksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was <code>true</code>, you have more health
     * checks. To get another group, submit another <code>ListHealthChecks</code> request.
     * </p>
     * <p>
     * For the value of <code>marker</code>, specify the value of <code>NextMarker</code> from the previous response,
     * which is the ID of the first health check that Amazon Route 53 will return if you submit another request.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was <code>false</code>, there are no more
     * health checks to get.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of health checks that you want <code>ListHealthChecks</code> to return in response to the
     * current request. Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value
     * greater than 100, Route 53 returns only the first 100 health checks.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was <code>true</code>, you have more health
     * checks. To get another group, submit another <code>ListHealthChecks</code> request.
     * </p>
     * <p>
     * For the value of <code>marker</code>, specify the value of <code>NextMarker</code> from the previous response,
     * which is the ID of the first health check that Amazon Route 53 will return if you submit another request.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was <code>false</code>, there are no more
     * health checks to get.
     * </p>
     * 
     * @param marker
     *        If the value of <code>IsTruncated</code> in the previous response was <code>true</code>, you have more
     *        health checks. To get another group, submit another <code>ListHealthChecks</code> request. </p>
     *        <p>
     *        For the value of <code>marker</code>, specify the value of <code>NextMarker</code> from the previous
     *        response, which is the ID of the first health check that Amazon Route 53 will return if you submit another
     *        request.
     *        </p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response was <code>false</code>, there are no
     *        more health checks to get.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was <code>true</code>, you have more health
     * checks. To get another group, submit another <code>ListHealthChecks</code> request.
     * </p>
     * <p>
     * For the value of <code>marker</code>, specify the value of <code>NextMarker</code> from the previous response,
     * which is the ID of the first health check that Amazon Route 53 will return if you submit another request.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was <code>false</code>, there are no more
     * health checks to get.
     * </p>
     * 
     * @return If the value of <code>IsTruncated</code> in the previous response was <code>true</code>, you have more
     *         health checks. To get another group, submit another <code>ListHealthChecks</code> request. </p>
     *         <p>
     *         For the value of <code>marker</code>, specify the value of <code>NextMarker</code> from the previous
     *         response, which is the ID of the first health check that Amazon Route 53 will return if you submit
     *         another request.
     *         </p>
     *         <p>
     *         If the value of <code>IsTruncated</code> in the previous response was <code>false</code>, there are no
     *         more health checks to get.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was <code>true</code>, you have more health
     * checks. To get another group, submit another <code>ListHealthChecks</code> request.
     * </p>
     * <p>
     * For the value of <code>marker</code>, specify the value of <code>NextMarker</code> from the previous response,
     * which is the ID of the first health check that Amazon Route 53 will return if you submit another request.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was <code>false</code>, there are no more
     * health checks to get.
     * </p>
     * 
     * @param marker
     *        If the value of <code>IsTruncated</code> in the previous response was <code>true</code>, you have more
     *        health checks. To get another group, submit another <code>ListHealthChecks</code> request. </p>
     *        <p>
     *        For the value of <code>marker</code>, specify the value of <code>NextMarker</code> from the previous
     *        response, which is the ID of the first health check that Amazon Route 53 will return if you submit another
     *        request.
     *        </p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response was <code>false</code>, there are no
     *        more health checks to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthChecksRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of health checks that you want <code>ListHealthChecks</code> to return in response to the
     * current request. Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value
     * greater than 100, Route 53 returns only the first 100 health checks.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of health checks that you want <code>ListHealthChecks</code> to return in response to
     *        the current request. Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a
     *        value greater than 100, Route 53 returns only the first 100 health checks.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of health checks that you want <code>ListHealthChecks</code> to return in response to the
     * current request. Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value
     * greater than 100, Route 53 returns only the first 100 health checks.
     * </p>
     * 
     * @return The maximum number of health checks that you want <code>ListHealthChecks</code> to return in response to
     *         the current request. Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to
     *         a value greater than 100, Route 53 returns only the first 100 health checks.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of health checks that you want <code>ListHealthChecks</code> to return in response to the
     * current request. Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value
     * greater than 100, Route 53 returns only the first 100 health checks.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of health checks that you want <code>ListHealthChecks</code> to return in response to
     *        the current request. Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a
     *        value greater than 100, Route 53 returns only the first 100 health checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHealthChecksRequest withMaxItems(String maxItems) {
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
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

        if (obj instanceof ListHealthChecksRequest == false)
            return false;
        ListHealthChecksRequest other = (ListHealthChecksRequest) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
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

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListHealthChecksRequest clone() {
        return (ListHealthChecksRequest) super.clone();
    }

}
