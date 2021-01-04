/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDevicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of results to select.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Select fleets where the job was updated after X
     * </p>
     */
    private java.util.Date latestHeartbeatAfter;
    /**
     * <p>
     * A filter that searches devices that contains this name in any of their models.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * Filter for fleets containing this name in their device fleet name.
     * </p>
     */
    private String deviceFleetName;

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     * 
     * @param nextToken
     *        The response from the last list when returning a list large enough to need tokening.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     * 
     * @return The response from the last list when returning a list large enough to need tokening.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     * 
     * @param nextToken
     *        The response from the last list when returning a list large enough to need tokening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to select.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to select.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to select.
     * </p>
     * 
     * @return Maximum number of results to select.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to select.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to select.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Select fleets where the job was updated after X
     * </p>
     * 
     * @param latestHeartbeatAfter
     *        Select fleets where the job was updated after X
     */

    public void setLatestHeartbeatAfter(java.util.Date latestHeartbeatAfter) {
        this.latestHeartbeatAfter = latestHeartbeatAfter;
    }

    /**
     * <p>
     * Select fleets where the job was updated after X
     * </p>
     * 
     * @return Select fleets where the job was updated after X
     */

    public java.util.Date getLatestHeartbeatAfter() {
        return this.latestHeartbeatAfter;
    }

    /**
     * <p>
     * Select fleets where the job was updated after X
     * </p>
     * 
     * @param latestHeartbeatAfter
     *        Select fleets where the job was updated after X
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesRequest withLatestHeartbeatAfter(java.util.Date latestHeartbeatAfter) {
        setLatestHeartbeatAfter(latestHeartbeatAfter);
        return this;
    }

    /**
     * <p>
     * A filter that searches devices that contains this name in any of their models.
     * </p>
     * 
     * @param modelName
     *        A filter that searches devices that contains this name in any of their models.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * A filter that searches devices that contains this name in any of their models.
     * </p>
     * 
     * @return A filter that searches devices that contains this name in any of their models.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * A filter that searches devices that contains this name in any of their models.
     * </p>
     * 
     * @param modelName
     *        A filter that searches devices that contains this name in any of their models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesRequest withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * Filter for fleets containing this name in their device fleet name.
     * </p>
     * 
     * @param deviceFleetName
     *        Filter for fleets containing this name in their device fleet name.
     */

    public void setDeviceFleetName(String deviceFleetName) {
        this.deviceFleetName = deviceFleetName;
    }

    /**
     * <p>
     * Filter for fleets containing this name in their device fleet name.
     * </p>
     * 
     * @return Filter for fleets containing this name in their device fleet name.
     */

    public String getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * <p>
     * Filter for fleets containing this name in their device fleet name.
     * </p>
     * 
     * @param deviceFleetName
     *        Filter for fleets containing this name in their device fleet name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesRequest withDeviceFleetName(String deviceFleetName) {
        setDeviceFleetName(deviceFleetName);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getLatestHeartbeatAfter() != null)
            sb.append("LatestHeartbeatAfter: ").append(getLatestHeartbeatAfter()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getDeviceFleetName() != null)
            sb.append("DeviceFleetName: ").append(getDeviceFleetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDevicesRequest == false)
            return false;
        ListDevicesRequest other = (ListDevicesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getLatestHeartbeatAfter() == null ^ this.getLatestHeartbeatAfter() == null)
            return false;
        if (other.getLatestHeartbeatAfter() != null && other.getLatestHeartbeatAfter().equals(this.getLatestHeartbeatAfter()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getDeviceFleetName() == null ^ this.getDeviceFleetName() == null)
            return false;
        if (other.getDeviceFleetName() != null && other.getDeviceFleetName().equals(this.getDeviceFleetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getLatestHeartbeatAfter() == null) ? 0 : getLatestHeartbeatAfter().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getDeviceFleetName() == null) ? 0 : getDeviceFleetName().hashCode());
        return hashCode;
    }

    @Override
    public ListDevicesRequest clone() {
        return (ListDevicesRequest) super.clone();
    }

}
