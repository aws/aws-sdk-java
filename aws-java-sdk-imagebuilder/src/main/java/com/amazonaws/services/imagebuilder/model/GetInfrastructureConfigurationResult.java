/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * GetInfrastructureConfiguration response object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetInfrastructureConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInfrastructureConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The infrastructure configuration object.
     * </p>
     */
    private InfrastructureConfiguration infrastructureConfiguration;

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @return The request ID that uniquely identifies this request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInfrastructureConfigurationResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The infrastructure configuration object.
     * </p>
     * 
     * @param infrastructureConfiguration
     *        The infrastructure configuration object.
     */

    public void setInfrastructureConfiguration(InfrastructureConfiguration infrastructureConfiguration) {
        this.infrastructureConfiguration = infrastructureConfiguration;
    }

    /**
     * <p>
     * The infrastructure configuration object.
     * </p>
     * 
     * @return The infrastructure configuration object.
     */

    public InfrastructureConfiguration getInfrastructureConfiguration() {
        return this.infrastructureConfiguration;
    }

    /**
     * <p>
     * The infrastructure configuration object.
     * </p>
     * 
     * @param infrastructureConfiguration
     *        The infrastructure configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInfrastructureConfigurationResult withInfrastructureConfiguration(InfrastructureConfiguration infrastructureConfiguration) {
        setInfrastructureConfiguration(infrastructureConfiguration);
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
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getInfrastructureConfiguration() != null)
            sb.append("InfrastructureConfiguration: ").append(getInfrastructureConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInfrastructureConfigurationResult == false)
            return false;
        GetInfrastructureConfigurationResult other = (GetInfrastructureConfigurationResult) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getInfrastructureConfiguration() == null ^ this.getInfrastructureConfiguration() == null)
            return false;
        if (other.getInfrastructureConfiguration() != null && other.getInfrastructureConfiguration().equals(this.getInfrastructureConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getInfrastructureConfiguration() == null) ? 0 : getInfrastructureConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetInfrastructureConfigurationResult clone() {
        try {
            return (GetInfrastructureConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
