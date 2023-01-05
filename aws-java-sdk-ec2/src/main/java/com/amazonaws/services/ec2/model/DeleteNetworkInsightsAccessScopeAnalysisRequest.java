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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteNetworkInsightsAccessScopeAnalysisRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteNetworkInsightsAccessScopeAnalysisRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteNetworkInsightsAccessScopeAnalysisRequest> {

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     */
    private String networkInsightsAccessScopeAnalysisId;

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalysisId
     *        The ID of the Network Access Scope analysis.
     */

    public void setNetworkInsightsAccessScopeAnalysisId(String networkInsightsAccessScopeAnalysisId) {
        this.networkInsightsAccessScopeAnalysisId = networkInsightsAccessScopeAnalysisId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     * 
     * @return The ID of the Network Access Scope analysis.
     */

    public String getNetworkInsightsAccessScopeAnalysisId() {
        return this.networkInsightsAccessScopeAnalysisId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalysisId
     *        The ID of the Network Access Scope analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNetworkInsightsAccessScopeAnalysisRequest withNetworkInsightsAccessScopeAnalysisId(String networkInsightsAccessScopeAnalysisId) {
        setNetworkInsightsAccessScopeAnalysisId(networkInsightsAccessScopeAnalysisId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteNetworkInsightsAccessScopeAnalysisRequest> getDryRunRequest() {
        Request<DeleteNetworkInsightsAccessScopeAnalysisRequest> request = new DeleteNetworkInsightsAccessScopeAnalysisRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getNetworkInsightsAccessScopeAnalysisId() != null)
            sb.append("NetworkInsightsAccessScopeAnalysisId: ").append(getNetworkInsightsAccessScopeAnalysisId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteNetworkInsightsAccessScopeAnalysisRequest == false)
            return false;
        DeleteNetworkInsightsAccessScopeAnalysisRequest other = (DeleteNetworkInsightsAccessScopeAnalysisRequest) obj;
        if (other.getNetworkInsightsAccessScopeAnalysisId() == null ^ this.getNetworkInsightsAccessScopeAnalysisId() == null)
            return false;
        if (other.getNetworkInsightsAccessScopeAnalysisId() != null
                && other.getNetworkInsightsAccessScopeAnalysisId().equals(this.getNetworkInsightsAccessScopeAnalysisId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInsightsAccessScopeAnalysisId() == null) ? 0 : getNetworkInsightsAccessScopeAnalysisId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteNetworkInsightsAccessScopeAnalysisRequest clone() {
        return (DeleteNetworkInsightsAccessScopeAnalysisRequest) super.clone();
    }
}
