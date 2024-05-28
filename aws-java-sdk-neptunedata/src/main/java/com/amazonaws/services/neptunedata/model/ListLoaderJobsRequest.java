/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/ListLoaderJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLoaderJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The number of load IDs to list. Must be a positive integer greater than zero and not more than <code>100</code>
     * (which is the default).
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * An optional parameter that can be used to exclude the load IDs of queued load requests when requesting a list of
     * load IDs by setting the parameter to <code>FALSE</code>. The default value is <code>TRUE</code>.
     * </p>
     */
    private Boolean includeQueuedLoads;

    /**
     * <p>
     * The number of load IDs to list. Must be a positive integer greater than zero and not more than <code>100</code>
     * (which is the default).
     * </p>
     * 
     * @param limit
     *        The number of load IDs to list. Must be a positive integer greater than zero and not more than
     *        <code>100</code> (which is the default).
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The number of load IDs to list. Must be a positive integer greater than zero and not more than <code>100</code>
     * (which is the default).
     * </p>
     * 
     * @return The number of load IDs to list. Must be a positive integer greater than zero and not more than
     *         <code>100</code> (which is the default).
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The number of load IDs to list. Must be a positive integer greater than zero and not more than <code>100</code>
     * (which is the default).
     * </p>
     * 
     * @param limit
     *        The number of load IDs to list. Must be a positive integer greater than zero and not more than
     *        <code>100</code> (which is the default).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLoaderJobsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * An optional parameter that can be used to exclude the load IDs of queued load requests when requesting a list of
     * load IDs by setting the parameter to <code>FALSE</code>. The default value is <code>TRUE</code>.
     * </p>
     * 
     * @param includeQueuedLoads
     *        An optional parameter that can be used to exclude the load IDs of queued load requests when requesting a
     *        list of load IDs by setting the parameter to <code>FALSE</code>. The default value is <code>TRUE</code>.
     */

    public void setIncludeQueuedLoads(Boolean includeQueuedLoads) {
        this.includeQueuedLoads = includeQueuedLoads;
    }

    /**
     * <p>
     * An optional parameter that can be used to exclude the load IDs of queued load requests when requesting a list of
     * load IDs by setting the parameter to <code>FALSE</code>. The default value is <code>TRUE</code>.
     * </p>
     * 
     * @return An optional parameter that can be used to exclude the load IDs of queued load requests when requesting a
     *         list of load IDs by setting the parameter to <code>FALSE</code>. The default value is <code>TRUE</code>.
     */

    public Boolean getIncludeQueuedLoads() {
        return this.includeQueuedLoads;
    }

    /**
     * <p>
     * An optional parameter that can be used to exclude the load IDs of queued load requests when requesting a list of
     * load IDs by setting the parameter to <code>FALSE</code>. The default value is <code>TRUE</code>.
     * </p>
     * 
     * @param includeQueuedLoads
     *        An optional parameter that can be used to exclude the load IDs of queued load requests when requesting a
     *        list of load IDs by setting the parameter to <code>FALSE</code>. The default value is <code>TRUE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLoaderJobsRequest withIncludeQueuedLoads(Boolean includeQueuedLoads) {
        setIncludeQueuedLoads(includeQueuedLoads);
        return this;
    }

    /**
     * <p>
     * An optional parameter that can be used to exclude the load IDs of queued load requests when requesting a list of
     * load IDs by setting the parameter to <code>FALSE</code>. The default value is <code>TRUE</code>.
     * </p>
     * 
     * @return An optional parameter that can be used to exclude the load IDs of queued load requests when requesting a
     *         list of load IDs by setting the parameter to <code>FALSE</code>. The default value is <code>TRUE</code>.
     */

    public Boolean isIncludeQueuedLoads() {
        return this.includeQueuedLoads;
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getIncludeQueuedLoads() != null)
            sb.append("IncludeQueuedLoads: ").append(getIncludeQueuedLoads());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLoaderJobsRequest == false)
            return false;
        ListLoaderJobsRequest other = (ListLoaderJobsRequest) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getIncludeQueuedLoads() == null ^ this.getIncludeQueuedLoads() == null)
            return false;
        if (other.getIncludeQueuedLoads() != null && other.getIncludeQueuedLoads().equals(this.getIncludeQueuedLoads()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getIncludeQueuedLoads() == null) ? 0 : getIncludeQueuedLoads().hashCode());
        return hashCode;
    }

    @Override
    public ListLoaderJobsRequest clone() {
        return (ListLoaderJobsRequest) super.clone();
    }

}
