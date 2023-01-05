/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListAvailableResourceDimensions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAvailableResourceDimensionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The dimension information returned for requested metric types.
     * </p>
     */
    private java.util.List<MetricDimensionGroups> metricDimensions;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The dimension information returned for requested metric types.
     * </p>
     * 
     * @return The dimension information returned for requested metric types.
     */

    public java.util.List<MetricDimensionGroups> getMetricDimensions() {
        return metricDimensions;
    }

    /**
     * <p>
     * The dimension information returned for requested metric types.
     * </p>
     * 
     * @param metricDimensions
     *        The dimension information returned for requested metric types.
     */

    public void setMetricDimensions(java.util.Collection<MetricDimensionGroups> metricDimensions) {
        if (metricDimensions == null) {
            this.metricDimensions = null;
            return;
        }

        this.metricDimensions = new java.util.ArrayList<MetricDimensionGroups>(metricDimensions);
    }

    /**
     * <p>
     * The dimension information returned for requested metric types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDimensions(java.util.Collection)} or {@link #withMetricDimensions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param metricDimensions
     *        The dimension information returned for requested metric types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableResourceDimensionsResult withMetricDimensions(MetricDimensionGroups... metricDimensions) {
        if (this.metricDimensions == null) {
            setMetricDimensions(new java.util.ArrayList<MetricDimensionGroups>(metricDimensions.length));
        }
        for (MetricDimensionGroups ele : metricDimensions) {
            this.metricDimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dimension information returned for requested metric types.
     * </p>
     * 
     * @param metricDimensions
     *        The dimension information returned for requested metric types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableResourceDimensionsResult withMetricDimensions(java.util.Collection<MetricDimensionGroups> metricDimensions) {
        setMetricDimensions(metricDimensions);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param nextToken
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param nextToken
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableResourceDimensionsResult withNextToken(String nextToken) {
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
        if (getMetricDimensions() != null)
            sb.append("MetricDimensions: ").append(getMetricDimensions()).append(",");
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

        if (obj instanceof ListAvailableResourceDimensionsResult == false)
            return false;
        ListAvailableResourceDimensionsResult other = (ListAvailableResourceDimensionsResult) obj;
        if (other.getMetricDimensions() == null ^ this.getMetricDimensions() == null)
            return false;
        if (other.getMetricDimensions() != null && other.getMetricDimensions().equals(this.getMetricDimensions()) == false)
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

        hashCode = prime * hashCode + ((getMetricDimensions() == null) ? 0 : getMetricDimensions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAvailableResourceDimensionsResult clone() {
        try {
            return (ListAvailableResourceDimensionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
