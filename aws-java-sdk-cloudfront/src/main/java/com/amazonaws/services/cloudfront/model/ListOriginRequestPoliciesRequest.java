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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListOriginRequestPolicies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOriginRequestPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A filter to return only the specified kinds of origin request policies. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>managed</code> – Returns only the managed policies created by AWS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom</code> – Returns only the custom policies created in your AWS account.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Use this field when paginating results to indicate where to begin in your list of origin request policies. The
     * response includes origin request policies in the list that occur after the marker. To get the next page of the
     * list, set this field’s value to the value of <code>NextMarker</code> from the current page’s response.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of origin request policies that you want in the response.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A filter to return only the specified kinds of origin request policies. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>managed</code> – Returns only the managed policies created by AWS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom</code> – Returns only the custom policies created in your AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        A filter to return only the specified kinds of origin request policies. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>managed</code> – Returns only the managed policies created by AWS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom</code> – Returns only the custom policies created in your AWS account.
     *        </p>
     *        </li>
     * @see OriginRequestPolicyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * A filter to return only the specified kinds of origin request policies. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>managed</code> – Returns only the managed policies created by AWS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom</code> – Returns only the custom policies created in your AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A filter to return only the specified kinds of origin request policies. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>managed</code> – Returns only the managed policies created by AWS.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>custom</code> – Returns only the custom policies created in your AWS account.
     *         </p>
     *         </li>
     * @see OriginRequestPolicyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * A filter to return only the specified kinds of origin request policies. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>managed</code> – Returns only the managed policies created by AWS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom</code> – Returns only the custom policies created in your AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        A filter to return only the specified kinds of origin request policies. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>managed</code> – Returns only the managed policies created by AWS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom</code> – Returns only the custom policies created in your AWS account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginRequestPolicyType
     */

    public ListOriginRequestPoliciesRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A filter to return only the specified kinds of origin request policies. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>managed</code> – Returns only the managed policies created by AWS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom</code> – Returns only the custom policies created in your AWS account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        A filter to return only the specified kinds of origin request policies. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>managed</code> – Returns only the managed policies created by AWS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom</code> – Returns only the custom policies created in your AWS account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginRequestPolicyType
     */

    public ListOriginRequestPoliciesRequest withType(OriginRequestPolicyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Use this field when paginating results to indicate where to begin in your list of origin request policies. The
     * response includes origin request policies in the list that occur after the marker. To get the next page of the
     * list, set this field’s value to the value of <code>NextMarker</code> from the current page’s response.
     * </p>
     * 
     * @param marker
     *        Use this field when paginating results to indicate where to begin in your list of origin request policies.
     *        The response includes origin request policies in the list that occur after the marker. To get the next
     *        page of the list, set this field’s value to the value of <code>NextMarker</code> from the current page’s
     *        response.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this field when paginating results to indicate where to begin in your list of origin request policies. The
     * response includes origin request policies in the list that occur after the marker. To get the next page of the
     * list, set this field’s value to the value of <code>NextMarker</code> from the current page’s response.
     * </p>
     * 
     * @return Use this field when paginating results to indicate where to begin in your list of origin request
     *         policies. The response includes origin request policies in the list that occur after the marker. To get
     *         the next page of the list, set this field’s value to the value of <code>NextMarker</code> from the
     *         current page’s response.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this field when paginating results to indicate where to begin in your list of origin request policies. The
     * response includes origin request policies in the list that occur after the marker. To get the next page of the
     * list, set this field’s value to the value of <code>NextMarker</code> from the current page’s response.
     * </p>
     * 
     * @param marker
     *        Use this field when paginating results to indicate where to begin in your list of origin request policies.
     *        The response includes origin request policies in the list that occur after the marker. To get the next
     *        page of the list, set this field’s value to the value of <code>NextMarker</code> from the current page’s
     *        response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOriginRequestPoliciesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of origin request policies that you want in the response.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of origin request policies that you want in the response.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of origin request policies that you want in the response.
     * </p>
     * 
     * @return The maximum number of origin request policies that you want in the response.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of origin request policies that you want in the response.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of origin request policies that you want in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOriginRequestPoliciesRequest withMaxItems(String maxItems) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof ListOriginRequestPoliciesRequest == false)
            return false;
        ListOriginRequestPoliciesRequest other = (ListOriginRequestPoliciesRequest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListOriginRequestPoliciesRequest clone() {
        return (ListOriginRequestPoliciesRequest) super.clone();
    }

}
