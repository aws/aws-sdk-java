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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAttachedPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The group for which the policies will be listed.
     * </p>
     */
    private String target;
    /**
     * <p>
     * When true, recursively list attached policies.
     * </p>
     */
    private Boolean recursive;
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     */
    private Integer pageSize;

    /**
     * <p>
     * The group for which the policies will be listed.
     * </p>
     * 
     * @param target
     *        The group for which the policies will be listed.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The group for which the policies will be listed.
     * </p>
     * 
     * @return The group for which the policies will be listed.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The group for which the policies will be listed.
     * </p>
     * 
     * @param target
     *        The group for which the policies will be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachedPoliciesRequest withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * When true, recursively list attached policies.
     * </p>
     * 
     * @param recursive
     *        When true, recursively list attached policies.
     */

    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    /**
     * <p>
     * When true, recursively list attached policies.
     * </p>
     * 
     * @return When true, recursively list attached policies.
     */

    public Boolean getRecursive() {
        return this.recursive;
    }

    /**
     * <p>
     * When true, recursively list attached policies.
     * </p>
     * 
     * @param recursive
     *        When true, recursively list attached policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachedPoliciesRequest withRecursive(Boolean recursive) {
        setRecursive(recursive);
        return this;
    }

    /**
     * <p>
     * When true, recursively list attached policies.
     * </p>
     * 
     * @return When true, recursively list attached policies.
     */

    public Boolean isRecursive() {
        return this.recursive;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param marker
     *        The token to retrieve the next set of results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param marker
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachedPoliciesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of results to be returned per request.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @return The maximum number of results to be returned per request.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of results to be returned per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachedPoliciesRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
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
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getRecursive() != null)
            sb.append("Recursive: ").append(getRecursive()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAttachedPoliciesRequest == false)
            return false;
        ListAttachedPoliciesRequest other = (ListAttachedPoliciesRequest) obj;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getRecursive() == null ^ this.getRecursive() == null)
            return false;
        if (other.getRecursive() != null && other.getRecursive().equals(this.getRecursive()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getRecursive() == null) ? 0 : getRecursive().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public ListAttachedPoliciesRequest clone() {
        return (ListAttachedPoliciesRequest) super.clone();
    }

}
