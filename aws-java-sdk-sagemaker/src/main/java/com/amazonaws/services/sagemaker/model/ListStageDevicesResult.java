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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListStageDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStageDevicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of summaries of devices allocated to the stage.
     * </p>
     */
    private java.util.List<DeviceDeploymentSummary> deviceDeploymentSummaries;
    /**
     * <p>
     * The token to use when calling the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of summaries of devices allocated to the stage.
     * </p>
     * 
     * @return List of summaries of devices allocated to the stage.
     */

    public java.util.List<DeviceDeploymentSummary> getDeviceDeploymentSummaries() {
        return deviceDeploymentSummaries;
    }

    /**
     * <p>
     * List of summaries of devices allocated to the stage.
     * </p>
     * 
     * @param deviceDeploymentSummaries
     *        List of summaries of devices allocated to the stage.
     */

    public void setDeviceDeploymentSummaries(java.util.Collection<DeviceDeploymentSummary> deviceDeploymentSummaries) {
        if (deviceDeploymentSummaries == null) {
            this.deviceDeploymentSummaries = null;
            return;
        }

        this.deviceDeploymentSummaries = new java.util.ArrayList<DeviceDeploymentSummary>(deviceDeploymentSummaries);
    }

    /**
     * <p>
     * List of summaries of devices allocated to the stage.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceDeploymentSummaries(java.util.Collection)} or
     * {@link #withDeviceDeploymentSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param deviceDeploymentSummaries
     *        List of summaries of devices allocated to the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStageDevicesResult withDeviceDeploymentSummaries(DeviceDeploymentSummary... deviceDeploymentSummaries) {
        if (this.deviceDeploymentSummaries == null) {
            setDeviceDeploymentSummaries(new java.util.ArrayList<DeviceDeploymentSummary>(deviceDeploymentSummaries.length));
        }
        for (DeviceDeploymentSummary ele : deviceDeploymentSummaries) {
            this.deviceDeploymentSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of summaries of devices allocated to the stage.
     * </p>
     * 
     * @param deviceDeploymentSummaries
     *        List of summaries of devices allocated to the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStageDevicesResult withDeviceDeploymentSummaries(java.util.Collection<DeviceDeploymentSummary> deviceDeploymentSummaries) {
        setDeviceDeploymentSummaries(deviceDeploymentSummaries);
        return this;
    }

    /**
     * <p>
     * The token to use when calling the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use when calling the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when calling the next page of results.
     * </p>
     * 
     * @return The token to use when calling the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when calling the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use when calling the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStageDevicesResult withNextToken(String nextToken) {
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
        if (getDeviceDeploymentSummaries() != null)
            sb.append("DeviceDeploymentSummaries: ").append(getDeviceDeploymentSummaries()).append(",");
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

        if (obj instanceof ListStageDevicesResult == false)
            return false;
        ListStageDevicesResult other = (ListStageDevicesResult) obj;
        if (other.getDeviceDeploymentSummaries() == null ^ this.getDeviceDeploymentSummaries() == null)
            return false;
        if (other.getDeviceDeploymentSummaries() != null && other.getDeviceDeploymentSummaries().equals(this.getDeviceDeploymentSummaries()) == false)
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

        hashCode = prime * hashCode + ((getDeviceDeploymentSummaries() == null) ? 0 : getDeviceDeploymentSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStageDevicesResult clone() {
        try {
            return (ListStageDevicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
