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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateIntegration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIntegrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String workloadId;

    private String clientRequestToken;
    /**
     * <p>
     * Which integrated service to update.
     * </p>
     */
    private String integratingService;

    /**
     * @param workloadId
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * @return
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @param workloadId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntegrationRequest withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIntegrationRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Which integrated service to update.
     * </p>
     * 
     * @param integratingService
     *        Which integrated service to update.
     * @see IntegratingService
     */

    public void setIntegratingService(String integratingService) {
        this.integratingService = integratingService;
    }

    /**
     * <p>
     * Which integrated service to update.
     * </p>
     * 
     * @return Which integrated service to update.
     * @see IntegratingService
     */

    public String getIntegratingService() {
        return this.integratingService;
    }

    /**
     * <p>
     * Which integrated service to update.
     * </p>
     * 
     * @param integratingService
     *        Which integrated service to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegratingService
     */

    public UpdateIntegrationRequest withIntegratingService(String integratingService) {
        setIntegratingService(integratingService);
        return this;
    }

    /**
     * <p>
     * Which integrated service to update.
     * </p>
     * 
     * @param integratingService
     *        Which integrated service to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegratingService
     */

    public UpdateIntegrationRequest withIntegratingService(IntegratingService integratingService) {
        this.integratingService = integratingService.toString();
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
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getIntegratingService() != null)
            sb.append("IntegratingService: ").append(getIntegratingService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIntegrationRequest == false)
            return false;
        UpdateIntegrationRequest other = (UpdateIntegrationRequest) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getIntegratingService() == null ^ this.getIntegratingService() == null)
            return false;
        if (other.getIntegratingService() != null && other.getIntegratingService().equals(this.getIntegratingService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getIntegratingService() == null) ? 0 : getIntegratingService().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIntegrationRequest clone() {
        return (UpdateIntegrationRequest) super.clone();
    }

}
