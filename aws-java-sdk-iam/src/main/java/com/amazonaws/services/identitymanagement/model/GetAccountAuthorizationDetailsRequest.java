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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetAccountAuthorizationDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccountAuthorizationDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of entity types used to filter the results. Only the entities that match the types you specify are
     * included in the output. Use the value <code>LocalManagedPolicy</code> to include customer managed policies.
     * </p>
     * <p>
     * The format for this parameter is a comma-separated (if more than one) list of strings. Each string value in the
     * list must be one of the valid values listed below.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> filter;
    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of entity types used to filter the results. Only the entities that match the types you specify are
     * included in the output. Use the value <code>LocalManagedPolicy</code> to include customer managed policies.
     * </p>
     * <p>
     * The format for this parameter is a comma-separated (if more than one) list of strings. Each string value in the
     * list must be one of the valid values listed below.
     * </p>
     * 
     * @return A list of entity types used to filter the results. Only the entities that match the types you specify are
     *         included in the output. Use the value <code>LocalManagedPolicy</code> to include customer managed
     *         policies.</p>
     *         <p>
     *         The format for this parameter is a comma-separated (if more than one) list of strings. Each string value
     *         in the list must be one of the valid values listed below.
     * @see EntityType
     */

    public java.util.List<String> getFilter() {
        if (filter == null) {
            filter = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return filter;
    }

    /**
     * <p>
     * A list of entity types used to filter the results. Only the entities that match the types you specify are
     * included in the output. Use the value <code>LocalManagedPolicy</code> to include customer managed policies.
     * </p>
     * <p>
     * The format for this parameter is a comma-separated (if more than one) list of strings. Each string value in the
     * list must be one of the valid values listed below.
     * </p>
     * 
     * @param filter
     *        A list of entity types used to filter the results. Only the entities that match the types you specify are
     *        included in the output. Use the value <code>LocalManagedPolicy</code> to include customer managed
     *        policies.</p>
     *        <p>
     *        The format for this parameter is a comma-separated (if more than one) list of strings. Each string value
     *        in the list must be one of the valid values listed below.
     * @see EntityType
     */

    public void setFilter(java.util.Collection<String> filter) {
        if (filter == null) {
            this.filter = null;
            return;
        }

        this.filter = new com.amazonaws.internal.SdkInternalList<String>(filter);
    }

    /**
     * <p>
     * A list of entity types used to filter the results. Only the entities that match the types you specify are
     * included in the output. Use the value <code>LocalManagedPolicy</code> to include customer managed policies.
     * </p>
     * <p>
     * The format for this parameter is a comma-separated (if more than one) list of strings. Each string value in the
     * list must be one of the valid values listed below.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilter(java.util.Collection)} or {@link #withFilter(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param filter
     *        A list of entity types used to filter the results. Only the entities that match the types you specify are
     *        included in the output. Use the value <code>LocalManagedPolicy</code> to include customer managed
     *        policies.</p>
     *        <p>
     *        The format for this parameter is a comma-separated (if more than one) list of strings. Each string value
     *        in the list must be one of the valid values listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public GetAccountAuthorizationDetailsRequest withFilter(String... filter) {
        if (this.filter == null) {
            setFilter(new com.amazonaws.internal.SdkInternalList<String>(filter.length));
        }
        for (String ele : filter) {
            this.filter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of entity types used to filter the results. Only the entities that match the types you specify are
     * included in the output. Use the value <code>LocalManagedPolicy</code> to include customer managed policies.
     * </p>
     * <p>
     * The format for this parameter is a comma-separated (if more than one) list of strings. Each string value in the
     * list must be one of the valid values listed below.
     * </p>
     * 
     * @param filter
     *        A list of entity types used to filter the results. Only the entities that match the types you specify are
     *        included in the output. Use the value <code>LocalManagedPolicy</code> to include customer managed
     *        policies.</p>
     *        <p>
     *        The format for this parameter is a comma-separated (if more than one) list of strings. Each string value
     *        in the list must be one of the valid values listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public GetAccountAuthorizationDetailsRequest withFilter(java.util.Collection<String> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * A list of entity types used to filter the results. Only the entities that match the types you specify are
     * included in the output. Use the value <code>LocalManagedPolicy</code> to include customer managed policies.
     * </p>
     * <p>
     * The format for this parameter is a comma-separated (if more than one) list of strings. Each string value in the
     * list must be one of the valid values listed below.
     * </p>
     * 
     * @param filter
     *        A list of entity types used to filter the results. Only the entities that match the types you specify are
     *        included in the output. Use the value <code>LocalManagedPolicy</code> to include customer managed
     *        policies.</p>
     *        <p>
     *        The format for this parameter is a comma-separated (if more than one) list of strings. Each string value
     *        in the list must be one of the valid values listed below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public GetAccountAuthorizationDetailsRequest withFilter(EntityType... filter) {
        com.amazonaws.internal.SdkInternalList<String> filterCopy = new com.amazonaws.internal.SdkInternalList<String>(filter.length);
        for (EntityType value : filter) {
            filterCopy.add(value.toString());
        }
        if (getFilter() == null) {
            setFilter(filterCopy);
        } else {
            getFilter().addAll(filterCopy);
        }
        return this;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     * 
     * @param maxItems
     *        Use this only when paginating results to indicate the maximum number of items you want in the response. If
     *        additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     *        <code>true</code>.</p>
     *        <p>
     *        If you do not include this parameter, the number of items defaults to 100. Note that IAM might return
     *        fewer results, even when there are more results available. In that case, the <code>IsTruncated</code>
     *        response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the
     *        subsequent call that tells the service where to continue from.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     * 
     * @return Use this only when paginating results to indicate the maximum number of items you want in the response.
     *         If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>.</p>
     *         <p>
     *         If you do not include this parameter, the number of items defaults to 100. Note that IAM might return
     *         fewer results, even when there are more results available. In that case, the <code>IsTruncated</code>
     *         response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the
     *         subsequent call that tells the service where to continue from.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     * 
     * @param maxItems
     *        Use this only when paginating results to indicate the maximum number of items you want in the response. If
     *        additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     *        <code>true</code>.</p>
     *        <p>
     *        If you do not include this parameter, the number of items defaults to 100. Note that IAM might return
     *        fewer results, even when there are more results available. In that case, the <code>IsTruncated</code>
     *        response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the
     *        subsequent call that tells the service where to continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountAuthorizationDetailsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *        received to indicate where the next call should start.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @return Use this parameter only when paginating results and only after you receive a response indicating that the
     *         results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *         received to indicate where the next call should start.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *        received to indicate where the next call should start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountAuthorizationDetailsRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountAuthorizationDetailsRequest == false)
            return false;
        GetAccountAuthorizationDetailsRequest other = (GetAccountAuthorizationDetailsRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public GetAccountAuthorizationDetailsRequest clone() {
        return (GetAccountAuthorizationDetailsRequest) super.clone();
    }

}
