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
package com.amazonaws.services.connectcampaign.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * GetInstanceOnboardingJobStatusRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/GetInstanceOnboardingJobStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstanceOnboardingJobStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String connectInstanceId;

    /**
     * @param connectInstanceId
     */

    public void setConnectInstanceId(String connectInstanceId) {
        this.connectInstanceId = connectInstanceId;
    }

    /**
     * @return
     */

    public String getConnectInstanceId() {
        return this.connectInstanceId;
    }

    /**
     * @param connectInstanceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceOnboardingJobStatusRequest withConnectInstanceId(String connectInstanceId) {
        setConnectInstanceId(connectInstanceId);
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
        if (getConnectInstanceId() != null)
            sb.append("ConnectInstanceId: ").append(getConnectInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceOnboardingJobStatusRequest == false)
            return false;
        GetInstanceOnboardingJobStatusRequest other = (GetInstanceOnboardingJobStatusRequest) obj;
        if (other.getConnectInstanceId() == null ^ this.getConnectInstanceId() == null)
            return false;
        if (other.getConnectInstanceId() != null && other.getConnectInstanceId().equals(this.getConnectInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectInstanceId() == null) ? 0 : getConnectInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceOnboardingJobStatusRequest clone() {
        return (GetInstanceOnboardingJobStatusRequest) super.clone();
    }

}
