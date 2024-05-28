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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeStorageSystemResourceMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStorageSystemResourceMetricsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your on-premises
     * storage system.
     * </p>
     */
    private String discoveryJobArn;
    /**
     * <p>
     * Specifies the kind of storage system resource that you want information about.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Specifies the universally unique identifier (UUID) of the storage system resource that you want information
     * about.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Specifies a time within the total duration that the discovery job ran. To see information gathered during a
     * certain time frame, use this parameter with <code>EndTime</code>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Specifies a time within the total duration that the discovery job ran. To see information gathered during a
     * certain time frame, use this parameter with <code>StartTime</code>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Specifies how many results that you want in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies an opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your on-premises
     * storage system.
     * </p>
     * 
     * @param discoveryJobArn
     *        Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your
     *        on-premises storage system.
     */

    public void setDiscoveryJobArn(String discoveryJobArn) {
        this.discoveryJobArn = discoveryJobArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your on-premises
     * storage system.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your
     *         on-premises storage system.
     */

    public String getDiscoveryJobArn() {
        return this.discoveryJobArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your on-premises
     * storage system.
     * </p>
     * 
     * @param discoveryJobArn
     *        Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your
     *        on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourceMetricsRequest withDiscoveryJobArn(String discoveryJobArn) {
        setDiscoveryJobArn(discoveryJobArn);
        return this;
    }

    /**
     * <p>
     * Specifies the kind of storage system resource that you want information about.
     * </p>
     * 
     * @param resourceType
     *        Specifies the kind of storage system resource that you want information about.
     * @see DiscoveryResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Specifies the kind of storage system resource that you want information about.
     * </p>
     * 
     * @return Specifies the kind of storage system resource that you want information about.
     * @see DiscoveryResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Specifies the kind of storage system resource that you want information about.
     * </p>
     * 
     * @param resourceType
     *        Specifies the kind of storage system resource that you want information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryResourceType
     */

    public DescribeStorageSystemResourceMetricsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Specifies the kind of storage system resource that you want information about.
     * </p>
     * 
     * @param resourceType
     *        Specifies the kind of storage system resource that you want information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryResourceType
     */

    public DescribeStorageSystemResourceMetricsRequest withResourceType(DiscoveryResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the universally unique identifier (UUID) of the storage system resource that you want information
     * about.
     * </p>
     * 
     * @param resourceId
     *        Specifies the universally unique identifier (UUID) of the storage system resource that you want
     *        information about.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Specifies the universally unique identifier (UUID) of the storage system resource that you want information
     * about.
     * </p>
     * 
     * @return Specifies the universally unique identifier (UUID) of the storage system resource that you want
     *         information about.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Specifies the universally unique identifier (UUID) of the storage system resource that you want information
     * about.
     * </p>
     * 
     * @param resourceId
     *        Specifies the universally unique identifier (UUID) of the storage system resource that you want
     *        information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourceMetricsRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Specifies a time within the total duration that the discovery job ran. To see information gathered during a
     * certain time frame, use this parameter with <code>EndTime</code>.
     * </p>
     * 
     * @param startTime
     *        Specifies a time within the total duration that the discovery job ran. To see information gathered during
     *        a certain time frame, use this parameter with <code>EndTime</code>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Specifies a time within the total duration that the discovery job ran. To see information gathered during a
     * certain time frame, use this parameter with <code>EndTime</code>.
     * </p>
     * 
     * @return Specifies a time within the total duration that the discovery job ran. To see information gathered during
     *         a certain time frame, use this parameter with <code>EndTime</code>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Specifies a time within the total duration that the discovery job ran. To see information gathered during a
     * certain time frame, use this parameter with <code>EndTime</code>.
     * </p>
     * 
     * @param startTime
     *        Specifies a time within the total duration that the discovery job ran. To see information gathered during
     *        a certain time frame, use this parameter with <code>EndTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourceMetricsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Specifies a time within the total duration that the discovery job ran. To see information gathered during a
     * certain time frame, use this parameter with <code>StartTime</code>.
     * </p>
     * 
     * @param endTime
     *        Specifies a time within the total duration that the discovery job ran. To see information gathered during
     *        a certain time frame, use this parameter with <code>StartTime</code>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Specifies a time within the total duration that the discovery job ran. To see information gathered during a
     * certain time frame, use this parameter with <code>StartTime</code>.
     * </p>
     * 
     * @return Specifies a time within the total duration that the discovery job ran. To see information gathered during
     *         a certain time frame, use this parameter with <code>StartTime</code>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Specifies a time within the total duration that the discovery job ran. To see information gathered during a
     * certain time frame, use this parameter with <code>StartTime</code>.
     * </p>
     * 
     * @param endTime
     *        Specifies a time within the total duration that the discovery job ran. To see information gathered during
     *        a certain time frame, use this parameter with <code>StartTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourceMetricsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Specifies how many results that you want in the response.
     * </p>
     * 
     * @param maxResults
     *        Specifies how many results that you want in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies how many results that you want in the response.
     * </p>
     * 
     * @return Specifies how many results that you want in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies how many results that you want in the response.
     * </p>
     * 
     * @param maxResults
     *        Specifies how many results that you want in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourceMetricsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies an opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @param nextToken
     *        Specifies an opaque string that indicates the position to begin the next list of results in the response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specifies an opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @return Specifies an opaque string that indicates the position to begin the next list of results in the response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specifies an opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @param nextToken
     *        Specifies an opaque string that indicates the position to begin the next list of results in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourceMetricsRequest withNextToken(String nextToken) {
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
        if (getDiscoveryJobArn() != null)
            sb.append("DiscoveryJobArn: ").append(getDiscoveryJobArn()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
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

        if (obj instanceof DescribeStorageSystemResourceMetricsRequest == false)
            return false;
        DescribeStorageSystemResourceMetricsRequest other = (DescribeStorageSystemResourceMetricsRequest) obj;
        if (other.getDiscoveryJobArn() == null ^ this.getDiscoveryJobArn() == null)
            return false;
        if (other.getDiscoveryJobArn() != null && other.getDiscoveryJobArn().equals(this.getDiscoveryJobArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
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

        hashCode = prime * hashCode + ((getDiscoveryJobArn() == null) ? 0 : getDiscoveryJobArn().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStorageSystemResourceMetricsRequest clone() {
        return (DescribeStorageSystemResourceMetricsRequest) super.clone();
    }

}
