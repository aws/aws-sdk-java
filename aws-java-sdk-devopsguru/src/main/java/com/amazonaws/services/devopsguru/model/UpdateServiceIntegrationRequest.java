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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateServiceIntegration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceIntegrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An <code>IntegratedServiceConfig</code> object used to specify the integrated service you want to update, and
     * whether you want to update it to enabled or disabled.
     * </p>
     */
    private UpdateServiceIntegrationConfig serviceIntegration;

    /**
     * <p>
     * An <code>IntegratedServiceConfig</code> object used to specify the integrated service you want to update, and
     * whether you want to update it to enabled or disabled.
     * </p>
     * 
     * @param serviceIntegration
     *        An <code>IntegratedServiceConfig</code> object used to specify the integrated service you want to update,
     *        and whether you want to update it to enabled or disabled.
     */

    public void setServiceIntegration(UpdateServiceIntegrationConfig serviceIntegration) {
        this.serviceIntegration = serviceIntegration;
    }

    /**
     * <p>
     * An <code>IntegratedServiceConfig</code> object used to specify the integrated service you want to update, and
     * whether you want to update it to enabled or disabled.
     * </p>
     * 
     * @return An <code>IntegratedServiceConfig</code> object used to specify the integrated service you want to update,
     *         and whether you want to update it to enabled or disabled.
     */

    public UpdateServiceIntegrationConfig getServiceIntegration() {
        return this.serviceIntegration;
    }

    /**
     * <p>
     * An <code>IntegratedServiceConfig</code> object used to specify the integrated service you want to update, and
     * whether you want to update it to enabled or disabled.
     * </p>
     * 
     * @param serviceIntegration
     *        An <code>IntegratedServiceConfig</code> object used to specify the integrated service you want to update,
     *        and whether you want to update it to enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceIntegrationRequest withServiceIntegration(UpdateServiceIntegrationConfig serviceIntegration) {
        setServiceIntegration(serviceIntegration);
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
        if (getServiceIntegration() != null)
            sb.append("ServiceIntegration: ").append(getServiceIntegration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceIntegrationRequest == false)
            return false;
        UpdateServiceIntegrationRequest other = (UpdateServiceIntegrationRequest) obj;
        if (other.getServiceIntegration() == null ^ this.getServiceIntegration() == null)
            return false;
        if (other.getServiceIntegration() != null && other.getServiceIntegration().equals(this.getServiceIntegration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceIntegration() == null) ? 0 : getServiceIntegration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceIntegrationRequest clone() {
        return (UpdateServiceIntegrationRequest) super.clone();
    }

}
