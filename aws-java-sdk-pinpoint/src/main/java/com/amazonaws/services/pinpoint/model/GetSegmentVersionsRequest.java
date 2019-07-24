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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSegmentVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported by the App Metrics and Campaign Metrics resources.
     * </p>
     */
    private String pageSize;
    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     */
    private String segmentId;
    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a paginated response.
     * </p>
     */
    private String token;

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *        Amazon Pinpoint console.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @return The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *         Amazon Pinpoint console.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *        Amazon Pinpoint console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSegmentVersionsRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported by the App Metrics and Campaign Metrics resources.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to include in each page of a paginated response. This parameter is currently
     *        not supported by the App Metrics and Campaign Metrics resources.
     */

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported by the App Metrics and Campaign Metrics resources.
     * </p>
     * 
     * @return The maximum number of items to include in each page of a paginated response. This parameter is currently
     *         not supported by the App Metrics and Campaign Metrics resources.
     */

    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported by the App Metrics and Campaign Metrics resources.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to include in each page of a paginated response. This parameter is currently
     *        not supported by the App Metrics and Campaign Metrics resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSegmentVersionsRequest withPageSize(String pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     * 
     * @param segmentId
     *        The unique identifier for the segment.
     */

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     * 
     * @return The unique identifier for the segment.
     */

    public String getSegmentId() {
        return this.segmentId;
    }

    /**
     * <p>
     * The unique identifier for the segment.
     * </p>
     * 
     * @param segmentId
     *        The unique identifier for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSegmentVersionsRequest withSegmentId(String segmentId) {
        setSegmentId(segmentId);
        return this;
    }

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a paginated response.
     * </p>
     * 
     * @param token
     *        The NextToken string that specifies which page of results to return in a paginated response.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a paginated response.
     * </p>
     * 
     * @return The NextToken string that specifies which page of results to return in a paginated response.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a paginated response.
     * </p>
     * 
     * @param token
     *        The NextToken string that specifies which page of results to return in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSegmentVersionsRequest withToken(String token) {
        setToken(token);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getSegmentId() != null)
            sb.append("SegmentId: ").append(getSegmentId()).append(",");
        if (getToken() != null)
            sb.append("Token: ").append(getToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSegmentVersionsRequest == false)
            return false;
        GetSegmentVersionsRequest other = (GetSegmentVersionsRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getSegmentId() == null ^ this.getSegmentId() == null)
            return false;
        if (other.getSegmentId() != null && other.getSegmentId().equals(this.getSegmentId()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getSegmentId() == null) ? 0 : getSegmentId().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSegmentVersionsRequest clone() {
        return (GetSegmentVersionsRequest) super.clone();
    }

}
