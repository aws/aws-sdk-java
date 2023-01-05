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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeApplicationFleetAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationFleetAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the fleet.
     * </p>
     */
    private String fleetName;
    /**
     * <p>
     * The ARN of the application.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The maximum size of each page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param fleetName
     *        The name of the fleet.
     */

    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @return The name of the fleet.
     */

    public String getFleetName() {
        return this.fleetName;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param fleetName
     *        The name of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationFleetAssociationsRequest withFleetName(String fleetName) {
        setFleetName(fleetName);
        return this;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @param applicationArn
     *        The ARN of the application.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @return The ARN of the application.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @param applicationArn
     *        The ARN of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationFleetAssociationsRequest withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * The maximum size of each page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of each page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum size of each page of results.
     * </p>
     * 
     * @return The maximum size of each page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum size of each page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of each page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationFleetAssociationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @return The pagination token used to retrieve the next page of results for this operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationFleetAssociationsRequest withNextToken(String nextToken) {
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
        if (getFleetName() != null)
            sb.append("FleetName: ").append(getFleetName()).append(",");
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof DescribeApplicationFleetAssociationsRequest == false)
            return false;
        DescribeApplicationFleetAssociationsRequest other = (DescribeApplicationFleetAssociationsRequest) obj;
        if (other.getFleetName() == null ^ this.getFleetName() == null)
            return false;
        if (other.getFleetName() != null && other.getFleetName().equals(this.getFleetName()) == false)
            return false;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getFleetName() == null) ? 0 : getFleetName().hashCode());
        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationFleetAssociationsRequest clone() {
        return (DescribeApplicationFleetAssociationsRequest) super.clone();
    }

}
