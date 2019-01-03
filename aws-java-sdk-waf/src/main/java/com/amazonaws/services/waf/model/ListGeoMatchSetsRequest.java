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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListGeoMatchSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGeoMatchSetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If you specify a value for <code>Limit</code> and you have more <code>GeoMatchSet</code>s than the value of
     * <code>Limit</code>, AWS WAF returns a <code>NextMarker</code> value in the response that allows you to list
     * another group of <code>GeoMatchSet</code> objects. For the second and subsequent <code>ListGeoMatchSets</code>
     * requests, specify the value of <code>NextMarker</code> from the previous response to get information about
     * another batch of <code>GeoMatchSet</code> objects.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * Specifies the number of <code>GeoMatchSet</code> objects that you want AWS WAF to return for this request. If you
     * have more <code>GeoMatchSet</code> objects than the number you specify for <code>Limit</code>, the response
     * includes a <code>NextMarker</code> value that you can use to get another batch of <code>GeoMatchSet</code>
     * objects.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * If you specify a value for <code>Limit</code> and you have more <code>GeoMatchSet</code>s than the value of
     * <code>Limit</code>, AWS WAF returns a <code>NextMarker</code> value in the response that allows you to list
     * another group of <code>GeoMatchSet</code> objects. For the second and subsequent <code>ListGeoMatchSets</code>
     * requests, specify the value of <code>NextMarker</code> from the previous response to get information about
     * another batch of <code>GeoMatchSet</code> objects.
     * </p>
     * 
     * @param nextMarker
     *        If you specify a value for <code>Limit</code> and you have more <code>GeoMatchSet</code>s than the value
     *        of <code>Limit</code>, AWS WAF returns a <code>NextMarker</code> value in the response that allows you to
     *        list another group of <code>GeoMatchSet</code> objects. For the second and subsequent
     *        <code>ListGeoMatchSets</code> requests, specify the value of <code>NextMarker</code> from the previous
     *        response to get information about another batch of <code>GeoMatchSet</code> objects.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If you specify a value for <code>Limit</code> and you have more <code>GeoMatchSet</code>s than the value of
     * <code>Limit</code>, AWS WAF returns a <code>NextMarker</code> value in the response that allows you to list
     * another group of <code>GeoMatchSet</code> objects. For the second and subsequent <code>ListGeoMatchSets</code>
     * requests, specify the value of <code>NextMarker</code> from the previous response to get information about
     * another batch of <code>GeoMatchSet</code> objects.
     * </p>
     * 
     * @return If you specify a value for <code>Limit</code> and you have more <code>GeoMatchSet</code>s than the value
     *         of <code>Limit</code>, AWS WAF returns a <code>NextMarker</code> value in the response that allows you to
     *         list another group of <code>GeoMatchSet</code> objects. For the second and subsequent
     *         <code>ListGeoMatchSets</code> requests, specify the value of <code>NextMarker</code> from the previous
     *         response to get information about another batch of <code>GeoMatchSet</code> objects.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If you specify a value for <code>Limit</code> and you have more <code>GeoMatchSet</code>s than the value of
     * <code>Limit</code>, AWS WAF returns a <code>NextMarker</code> value in the response that allows you to list
     * another group of <code>GeoMatchSet</code> objects. For the second and subsequent <code>ListGeoMatchSets</code>
     * requests, specify the value of <code>NextMarker</code> from the previous response to get information about
     * another batch of <code>GeoMatchSet</code> objects.
     * </p>
     * 
     * @param nextMarker
     *        If you specify a value for <code>Limit</code> and you have more <code>GeoMatchSet</code>s than the value
     *        of <code>Limit</code>, AWS WAF returns a <code>NextMarker</code> value in the response that allows you to
     *        list another group of <code>GeoMatchSet</code> objects. For the second and subsequent
     *        <code>ListGeoMatchSets</code> requests, specify the value of <code>NextMarker</code> from the previous
     *        response to get information about another batch of <code>GeoMatchSet</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoMatchSetsRequest withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * Specifies the number of <code>GeoMatchSet</code> objects that you want AWS WAF to return for this request. If you
     * have more <code>GeoMatchSet</code> objects than the number you specify for <code>Limit</code>, the response
     * includes a <code>NextMarker</code> value that you can use to get another batch of <code>GeoMatchSet</code>
     * objects.
     * </p>
     * 
     * @param limit
     *        Specifies the number of <code>GeoMatchSet</code> objects that you want AWS WAF to return for this request.
     *        If you have more <code>GeoMatchSet</code> objects than the number you specify for <code>Limit</code>, the
     *        response includes a <code>NextMarker</code> value that you can use to get another batch of
     *        <code>GeoMatchSet</code> objects.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Specifies the number of <code>GeoMatchSet</code> objects that you want AWS WAF to return for this request. If you
     * have more <code>GeoMatchSet</code> objects than the number you specify for <code>Limit</code>, the response
     * includes a <code>NextMarker</code> value that you can use to get another batch of <code>GeoMatchSet</code>
     * objects.
     * </p>
     * 
     * @return Specifies the number of <code>GeoMatchSet</code> objects that you want AWS WAF to return for this
     *         request. If you have more <code>GeoMatchSet</code> objects than the number you specify for
     *         <code>Limit</code>, the response includes a <code>NextMarker</code> value that you can use to get another
     *         batch of <code>GeoMatchSet</code> objects.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Specifies the number of <code>GeoMatchSet</code> objects that you want AWS WAF to return for this request. If you
     * have more <code>GeoMatchSet</code> objects than the number you specify for <code>Limit</code>, the response
     * includes a <code>NextMarker</code> value that you can use to get another batch of <code>GeoMatchSet</code>
     * objects.
     * </p>
     * 
     * @param limit
     *        Specifies the number of <code>GeoMatchSet</code> objects that you want AWS WAF to return for this request.
     *        If you have more <code>GeoMatchSet</code> objects than the number you specify for <code>Limit</code>, the
     *        response includes a <code>NextMarker</code> value that you can use to get another batch of
     *        <code>GeoMatchSet</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoMatchSetsRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGeoMatchSetsRequest == false)
            return false;
        ListGeoMatchSetsRequest other = (ListGeoMatchSetsRequest) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public ListGeoMatchSetsRequest clone() {
        return (ListGeoMatchSetsRequest) super.clone();
    }

}
