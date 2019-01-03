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
public class ListOTAUpdatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token used to retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The OTA update job status.
     * </p>
     */
    private String otaUpdateStatus;

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @return The maximum number of results to return at one time.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOTAUpdatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token used to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token used to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used to retrieve the next set of results.
     * </p>
     * 
     * @return A token used to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token used to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOTAUpdatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The OTA update job status.
     * </p>
     * 
     * @param otaUpdateStatus
     *        The OTA update job status.
     * @see OTAUpdateStatus
     */

    public void setOtaUpdateStatus(String otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus;
    }

    /**
     * <p>
     * The OTA update job status.
     * </p>
     * 
     * @return The OTA update job status.
     * @see OTAUpdateStatus
     */

    public String getOtaUpdateStatus() {
        return this.otaUpdateStatus;
    }

    /**
     * <p>
     * The OTA update job status.
     * </p>
     * 
     * @param otaUpdateStatus
     *        The OTA update job status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OTAUpdateStatus
     */

    public ListOTAUpdatesRequest withOtaUpdateStatus(String otaUpdateStatus) {
        setOtaUpdateStatus(otaUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The OTA update job status.
     * </p>
     * 
     * @param otaUpdateStatus
     *        The OTA update job status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OTAUpdateStatus
     */

    public ListOTAUpdatesRequest withOtaUpdateStatus(OTAUpdateStatus otaUpdateStatus) {
        this.otaUpdateStatus = otaUpdateStatus.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOtaUpdateStatus() != null)
            sb.append("OtaUpdateStatus: ").append(getOtaUpdateStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOTAUpdatesRequest == false)
            return false;
        ListOTAUpdatesRequest other = (ListOTAUpdatesRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOtaUpdateStatus() == null ^ this.getOtaUpdateStatus() == null)
            return false;
        if (other.getOtaUpdateStatus() != null && other.getOtaUpdateStatus().equals(this.getOtaUpdateStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOtaUpdateStatus() == null) ? 0 : getOtaUpdateStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListOTAUpdatesRequest clone() {
        return (ListOTAUpdatesRequest) super.clone();
    }

}
