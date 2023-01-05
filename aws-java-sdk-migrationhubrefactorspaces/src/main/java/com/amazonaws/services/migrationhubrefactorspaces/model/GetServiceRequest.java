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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetService"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String applicationIdentifier;
    /**
     * <p>
     * The ID of the environment.
     * </p>
     */
    private String environmentIdentifier;
    /**
     * <p>
     * The ID of the service.
     * </p>
     */
    private String serviceIdentifier;

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationIdentifier
     *        The ID of the application.
     */

    public void setApplicationIdentifier(String applicationIdentifier) {
        this.applicationIdentifier = applicationIdentifier;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationIdentifier
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceRequest withApplicationIdentifier(String applicationIdentifier) {
        setApplicationIdentifier(applicationIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the environment.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment.
     */

    public void setEnvironmentIdentifier(String environmentIdentifier) {
        this.environmentIdentifier = environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment.
     * </p>
     * 
     * @return The ID of the environment.
     */

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceRequest withEnvironmentIdentifier(String environmentIdentifier) {
        setEnvironmentIdentifier(environmentIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID of the service.
     */

    public void setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @return The ID of the service.
     */

    public String getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceRequest withServiceIdentifier(String serviceIdentifier) {
        setServiceIdentifier(serviceIdentifier);
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
        if (getApplicationIdentifier() != null)
            sb.append("ApplicationIdentifier: ").append(getApplicationIdentifier()).append(",");
        if (getEnvironmentIdentifier() != null)
            sb.append("EnvironmentIdentifier: ").append(getEnvironmentIdentifier()).append(",");
        if (getServiceIdentifier() != null)
            sb.append("ServiceIdentifier: ").append(getServiceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceRequest == false)
            return false;
        GetServiceRequest other = (GetServiceRequest) obj;
        if (other.getApplicationIdentifier() == null ^ this.getApplicationIdentifier() == null)
            return false;
        if (other.getApplicationIdentifier() != null && other.getApplicationIdentifier().equals(this.getApplicationIdentifier()) == false)
            return false;
        if (other.getEnvironmentIdentifier() == null ^ this.getEnvironmentIdentifier() == null)
            return false;
        if (other.getEnvironmentIdentifier() != null && other.getEnvironmentIdentifier().equals(this.getEnvironmentIdentifier()) == false)
            return false;
        if (other.getServiceIdentifier() == null ^ this.getServiceIdentifier() == null)
            return false;
        if (other.getServiceIdentifier() != null && other.getServiceIdentifier().equals(this.getServiceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationIdentifier() == null) ? 0 : getApplicationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentIdentifier() == null) ? 0 : getEnvironmentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getServiceIdentifier() == null) ? 0 : getServiceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceRequest clone() {
        return (GetServiceRequest) super.clone();
    }

}
