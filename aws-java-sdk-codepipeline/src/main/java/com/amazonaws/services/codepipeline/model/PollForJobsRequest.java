/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a poll for jobs action.
 * </p>
 */
public class PollForJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private ActionTypeId actionTypeId;
    /**
     * <p>
     * The maximum number of jobs to return in a poll for jobs call.
     * </p>
     */
    private Integer maxBatchSize;
    /**
     * <p>
     * A map of property names and values. For an action type with no queryable properties, this value must be null or
     * an empty map. For an action type with a queryable property, you must supply that property as a key in the map.
     * Only jobs whose action configuration matches the mapped value will be returned.
     * </p>
     */
    private java.util.Map<String, String> queryParam;

    /**
     * @param actionTypeId
     */

    public void setActionTypeId(ActionTypeId actionTypeId) {
        this.actionTypeId = actionTypeId;
    }

    /**
     * @return
     */

    public ActionTypeId getActionTypeId() {
        return this.actionTypeId;
    }

    /**
     * @param actionTypeId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PollForJobsRequest withActionTypeId(ActionTypeId actionTypeId) {
        setActionTypeId(actionTypeId);
        return this;
    }

    /**
     * <p>
     * The maximum number of jobs to return in a poll for jobs call.
     * </p>
     * 
     * @param maxBatchSize
     *        The maximum number of jobs to return in a poll for jobs call.
     */

    public void setMaxBatchSize(Integer maxBatchSize) {
        this.maxBatchSize = maxBatchSize;
    }

    /**
     * <p>
     * The maximum number of jobs to return in a poll for jobs call.
     * </p>
     * 
     * @return The maximum number of jobs to return in a poll for jobs call.
     */

    public Integer getMaxBatchSize() {
        return this.maxBatchSize;
    }

    /**
     * <p>
     * The maximum number of jobs to return in a poll for jobs call.
     * </p>
     * 
     * @param maxBatchSize
     *        The maximum number of jobs to return in a poll for jobs call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PollForJobsRequest withMaxBatchSize(Integer maxBatchSize) {
        setMaxBatchSize(maxBatchSize);
        return this;
    }

    /**
     * <p>
     * A map of property names and values. For an action type with no queryable properties, this value must be null or
     * an empty map. For an action type with a queryable property, you must supply that property as a key in the map.
     * Only jobs whose action configuration matches the mapped value will be returned.
     * </p>
     * 
     * @return A map of property names and values. For an action type with no queryable properties, this value must be
     *         null or an empty map. For an action type with a queryable property, you must supply that property as a
     *         key in the map. Only jobs whose action configuration matches the mapped value will be returned.
     */

    public java.util.Map<String, String> getQueryParam() {
        return queryParam;
    }

    /**
     * <p>
     * A map of property names and values. For an action type with no queryable properties, this value must be null or
     * an empty map. For an action type with a queryable property, you must supply that property as a key in the map.
     * Only jobs whose action configuration matches the mapped value will be returned.
     * </p>
     * 
     * @param queryParam
     *        A map of property names and values. For an action type with no queryable properties, this value must be
     *        null or an empty map. For an action type with a queryable property, you must supply that property as a key
     *        in the map. Only jobs whose action configuration matches the mapped value will be returned.
     */

    public void setQueryParam(java.util.Map<String, String> queryParam) {
        this.queryParam = queryParam;
    }

    /**
     * <p>
     * A map of property names and values. For an action type with no queryable properties, this value must be null or
     * an empty map. For an action type with a queryable property, you must supply that property as a key in the map.
     * Only jobs whose action configuration matches the mapped value will be returned.
     * </p>
     * 
     * @param queryParam
     *        A map of property names and values. For an action type with no queryable properties, this value must be
     *        null or an empty map. For an action type with a queryable property, you must supply that property as a key
     *        in the map. Only jobs whose action configuration matches the mapped value will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PollForJobsRequest withQueryParam(java.util.Map<String, String> queryParam) {
        setQueryParam(queryParam);
        return this;
    }

    public PollForJobsRequest addQueryParamEntry(String key, String value) {
        if (null == this.queryParam) {
            this.queryParam = new java.util.HashMap<String, String>();
        }
        if (this.queryParam.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.queryParam.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into QueryParam.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PollForJobsRequest clearQueryParamEntries() {
        this.queryParam = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getActionTypeId() != null)
            sb.append("ActionTypeId: " + getActionTypeId() + ",");
        if (getMaxBatchSize() != null)
            sb.append("MaxBatchSize: " + getMaxBatchSize() + ",");
        if (getQueryParam() != null)
            sb.append("QueryParam: " + getQueryParam());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PollForJobsRequest == false)
            return false;
        PollForJobsRequest other = (PollForJobsRequest) obj;
        if (other.getActionTypeId() == null ^ this.getActionTypeId() == null)
            return false;
        if (other.getActionTypeId() != null && other.getActionTypeId().equals(this.getActionTypeId()) == false)
            return false;
        if (other.getMaxBatchSize() == null ^ this.getMaxBatchSize() == null)
            return false;
        if (other.getMaxBatchSize() != null && other.getMaxBatchSize().equals(this.getMaxBatchSize()) == false)
            return false;
        if (other.getQueryParam() == null ^ this.getQueryParam() == null)
            return false;
        if (other.getQueryParam() != null && other.getQueryParam().equals(this.getQueryParam()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionTypeId() == null) ? 0 : getActionTypeId().hashCode());
        hashCode = prime * hashCode + ((getMaxBatchSize() == null) ? 0 : getMaxBatchSize().hashCode());
        hashCode = prime * hashCode + ((getQueryParam() == null) ? 0 : getQueryParam().hashCode());
        return hashCode;
    }

    @Override
    public PollForJobsRequest clone() {
        return (PollForJobsRequest) super.clone();
    }
}
