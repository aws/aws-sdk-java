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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/DeleteService"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Deletes a Refactor Spaces service.
     * </p>
     * <note>
     * <p>
     * The <code>RefactorSpacesSecurityGroup</code> security group must be removed from all Amazon Web Services
     * resources in the virtual private cloud (VPC) prior to deleting a service with a URL endpoint in a VPC.
     * </p>
     * </note>
     */
    private String applicationIdentifier;
    /**
     * <p>
     * The ID of the environment that the service is in.
     * </p>
     */
    private String environmentIdentifier;
    /**
     * <p>
     * The ID of the service to delete.
     * </p>
     */
    private String serviceIdentifier;

    /**
     * <p>
     * Deletes a Refactor Spaces service.
     * </p>
     * <note>
     * <p>
     * The <code>RefactorSpacesSecurityGroup</code> security group must be removed from all Amazon Web Services
     * resources in the virtual private cloud (VPC) prior to deleting a service with a URL endpoint in a VPC.
     * </p>
     * </note>
     * 
     * @param applicationIdentifier
     *        Deletes a Refactor Spaces service.</p> <note>
     *        <p>
     *        The <code>RefactorSpacesSecurityGroup</code> security group must be removed from all Amazon Web Services
     *        resources in the virtual private cloud (VPC) prior to deleting a service with a URL endpoint in a VPC.
     *        </p>
     */

    public void setApplicationIdentifier(String applicationIdentifier) {
        this.applicationIdentifier = applicationIdentifier;
    }

    /**
     * <p>
     * Deletes a Refactor Spaces service.
     * </p>
     * <note>
     * <p>
     * The <code>RefactorSpacesSecurityGroup</code> security group must be removed from all Amazon Web Services
     * resources in the virtual private cloud (VPC) prior to deleting a service with a URL endpoint in a VPC.
     * </p>
     * </note>
     * 
     * @return Deletes a Refactor Spaces service.</p> <note>
     *         <p>
     *         The <code>RefactorSpacesSecurityGroup</code> security group must be removed from all Amazon Web Services
     *         resources in the virtual private cloud (VPC) prior to deleting a service with a URL endpoint in a VPC.
     *         </p>
     */

    public String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    /**
     * <p>
     * Deletes a Refactor Spaces service.
     * </p>
     * <note>
     * <p>
     * The <code>RefactorSpacesSecurityGroup</code> security group must be removed from all Amazon Web Services
     * resources in the virtual private cloud (VPC) prior to deleting a service with a URL endpoint in a VPC.
     * </p>
     * </note>
     * 
     * @param applicationIdentifier
     *        Deletes a Refactor Spaces service.</p> <note>
     *        <p>
     *        The <code>RefactorSpacesSecurityGroup</code> security group must be removed from all Amazon Web Services
     *        resources in the virtual private cloud (VPC) prior to deleting a service with a URL endpoint in a VPC.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServiceRequest withApplicationIdentifier(String applicationIdentifier) {
        setApplicationIdentifier(applicationIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the environment that the service is in.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment that the service is in.
     */

    public void setEnvironmentIdentifier(String environmentIdentifier) {
        this.environmentIdentifier = environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment that the service is in.
     * </p>
     * 
     * @return The ID of the environment that the service is in.
     */

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment that the service is in.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment that the service is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServiceRequest withEnvironmentIdentifier(String environmentIdentifier) {
        setEnvironmentIdentifier(environmentIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the service to delete.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID of the service to delete.
     */

    public void setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }

    /**
     * <p>
     * The ID of the service to delete.
     * </p>
     * 
     * @return The ID of the service to delete.
     */

    public String getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    /**
     * <p>
     * The ID of the service to delete.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID of the service to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServiceRequest withServiceIdentifier(String serviceIdentifier) {
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

        if (obj instanceof DeleteServiceRequest == false)
            return false;
        DeleteServiceRequest other = (DeleteServiceRequest) obj;
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
    public DeleteServiceRequest clone() {
        return (DeleteServiceRequest) super.clone();
    }

}
