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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/ListLogAnomalyDetectors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLogAnomalyDetectorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use this to optionally filter the results to only include anomaly detectors that are associated with the
     * specified log group.
     * </p>
     */
    private String filterLogGroupArn;
    /**
     * <p>
     * The maximum number of items to return. If you don't specify a value, the default maximum value of 50 items is
     * used.
     * </p>
     */
    private Integer limit;

    private String nextToken;

    /**
     * <p>
     * Use this to optionally filter the results to only include anomaly detectors that are associated with the
     * specified log group.
     * </p>
     * 
     * @param filterLogGroupArn
     *        Use this to optionally filter the results to only include anomaly detectors that are associated with the
     *        specified log group.
     */

    public void setFilterLogGroupArn(String filterLogGroupArn) {
        this.filterLogGroupArn = filterLogGroupArn;
    }

    /**
     * <p>
     * Use this to optionally filter the results to only include anomaly detectors that are associated with the
     * specified log group.
     * </p>
     * 
     * @return Use this to optionally filter the results to only include anomaly detectors that are associated with the
     *         specified log group.
     */

    public String getFilterLogGroupArn() {
        return this.filterLogGroupArn;
    }

    /**
     * <p>
     * Use this to optionally filter the results to only include anomaly detectors that are associated with the
     * specified log group.
     * </p>
     * 
     * @param filterLogGroupArn
     *        Use this to optionally filter the results to only include anomaly detectors that are associated with the
     *        specified log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogAnomalyDetectorsRequest withFilterLogGroupArn(String filterLogGroupArn) {
        setFilterLogGroupArn(filterLogGroupArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return. If you don't specify a value, the default maximum value of 50 items is
     * used.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return. If you don't specify a value, the default maximum value of 50 items
     *        is used.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items to return. If you don't specify a value, the default maximum value of 50 items is
     * used.
     * </p>
     * 
     * @return The maximum number of items to return. If you don't specify a value, the default maximum value of 50
     *         items is used.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items to return. If you don't specify a value, the default maximum value of 50 items is
     * used.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return. If you don't specify a value, the default maximum value of 50 items
     *        is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogAnomalyDetectorsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLogAnomalyDetectorsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getFilterLogGroupArn() != null)
            sb.append("FilterLogGroupArn: ").append(getFilterLogGroupArn()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLogAnomalyDetectorsRequest == false)
            return false;
        ListLogAnomalyDetectorsRequest other = (ListLogAnomalyDetectorsRequest) obj;
        if (other.getFilterLogGroupArn() == null ^ this.getFilterLogGroupArn() == null)
            return false;
        if (other.getFilterLogGroupArn() != null && other.getFilterLogGroupArn().equals(this.getFilterLogGroupArn()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterLogGroupArn() == null) ? 0 : getFilterLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLogAnomalyDetectorsRequest clone() {
        return (ListLogAnomalyDetectorsRequest) super.clone();
    }

}
