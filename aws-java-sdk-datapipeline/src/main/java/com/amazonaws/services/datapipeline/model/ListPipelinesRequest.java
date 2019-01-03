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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for ListPipelines.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ListPipelines" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipelinesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The starting point for the results to be returned. For the first call, this value should be empty. As long as
     * there are more results, continue to call <code>ListPipelines</code> with the marker value from the previous call
     * to retrieve the next set of results.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The starting point for the results to be returned. For the first call, this value should be empty. As long as
     * there are more results, continue to call <code>ListPipelines</code> with the marker value from the previous call
     * to retrieve the next set of results.
     * </p>
     * 
     * @param marker
     *        The starting point for the results to be returned. For the first call, this value should be empty. As long
     *        as there are more results, continue to call <code>ListPipelines</code> with the marker value from the
     *        previous call to retrieve the next set of results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The starting point for the results to be returned. For the first call, this value should be empty. As long as
     * there are more results, continue to call <code>ListPipelines</code> with the marker value from the previous call
     * to retrieve the next set of results.
     * </p>
     * 
     * @return The starting point for the results to be returned. For the first call, this value should be empty. As
     *         long as there are more results, continue to call <code>ListPipelines</code> with the marker value from
     *         the previous call to retrieve the next set of results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The starting point for the results to be returned. For the first call, this value should be empty. As long as
     * there are more results, continue to call <code>ListPipelines</code> with the marker value from the previous call
     * to retrieve the next set of results.
     * </p>
     * 
     * @param marker
     *        The starting point for the results to be returned. For the first call, this value should be empty. As long
     *        as there are more results, continue to call <code>ListPipelines</code> with the marker value from the
     *        previous call to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesRequest withMarker(String marker) {
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

        if (obj instanceof ListPipelinesRequest == false)
            return false;
        ListPipelinesRequest other = (ListPipelinesRequest) obj;
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

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListPipelinesRequest clone() {
        return (ListPipelinesRequest) super.clone();
    }

}
