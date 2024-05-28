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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListFlywheelIterationHistory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFlywheelIterationHistoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the flywheel.
     * </p>
     */
    private String flywheelArn;
    /**
     * <p>
     * Filter the flywheel iteration history based on creation time.
     * </p>
     */
    private FlywheelIterationFilter filter;
    /**
     * <p>
     * Next token
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of iteration history results to return
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARN of the flywheel.
     * </p>
     * 
     * @param flywheelArn
     *        The ARN of the flywheel.
     */

    public void setFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
    }

    /**
     * <p>
     * The ARN of the flywheel.
     * </p>
     * 
     * @return The ARN of the flywheel.
     */

    public String getFlywheelArn() {
        return this.flywheelArn;
    }

    /**
     * <p>
     * The ARN of the flywheel.
     * </p>
     * 
     * @param flywheelArn
     *        The ARN of the flywheel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlywheelIterationHistoryRequest withFlywheelArn(String flywheelArn) {
        setFlywheelArn(flywheelArn);
        return this;
    }

    /**
     * <p>
     * Filter the flywheel iteration history based on creation time.
     * </p>
     * 
     * @param filter
     *        Filter the flywheel iteration history based on creation time.
     */

    public void setFilter(FlywheelIterationFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filter the flywheel iteration history based on creation time.
     * </p>
     * 
     * @return Filter the flywheel iteration history based on creation time.
     */

    public FlywheelIterationFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Filter the flywheel iteration history based on creation time.
     * </p>
     * 
     * @param filter
     *        Filter the flywheel iteration history based on creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlywheelIterationHistoryRequest withFilter(FlywheelIterationFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Next token
     * </p>
     * 
     * @param nextToken
     *        Next token
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token
     * </p>
     * 
     * @return Next token
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token
     * </p>
     * 
     * @param nextToken
     *        Next token
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlywheelIterationHistoryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of iteration history results to return
     * </p>
     * 
     * @param maxResults
     *        Maximum number of iteration history results to return
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of iteration history results to return
     * </p>
     * 
     * @return Maximum number of iteration history results to return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of iteration history results to return
     * </p>
     * 
     * @param maxResults
     *        Maximum number of iteration history results to return
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlywheelIterationHistoryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getFlywheelArn() != null)
            sb.append("FlywheelArn: ").append(getFlywheelArn()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFlywheelIterationHistoryRequest == false)
            return false;
        ListFlywheelIterationHistoryRequest other = (ListFlywheelIterationHistoryRequest) obj;
        if (other.getFlywheelArn() == null ^ this.getFlywheelArn() == null)
            return false;
        if (other.getFlywheelArn() != null && other.getFlywheelArn().equals(this.getFlywheelArn()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlywheelArn() == null) ? 0 : getFlywheelArn().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListFlywheelIterationHistoryRequest clone() {
        return (ListFlywheelIterationHistoryRequest) super.clone();
    }

}
