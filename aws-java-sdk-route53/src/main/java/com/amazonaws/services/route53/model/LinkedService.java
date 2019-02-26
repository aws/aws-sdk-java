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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * If a health check or hosted zone was created by another service, <code>LinkedService</code> is a complex type that
 * describes the service that created the resource. When a resource is created by another service, you can't edit or
 * delete it using Amazon Route 53.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/LinkedService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LinkedService implements Serializable, Cloneable {

    /**
     * <p>
     * If the health check or hosted zone was created by another service, the service that created the resource. When a
     * resource is created by another service, you can't edit or delete it using Amazon Route 53.
     * </p>
     */
    private String servicePrincipal;
    /**
     * <p>
     * If the health check or hosted zone was created by another service, an optional description that can be provided
     * by the other service. When a resource is created by another service, you can't edit or delete it using Amazon
     * Route 53.
     * </p>
     */
    private String description;

    /**
     * <p>
     * If the health check or hosted zone was created by another service, the service that created the resource. When a
     * resource is created by another service, you can't edit or delete it using Amazon Route 53.
     * </p>
     * 
     * @param servicePrincipal
     *        If the health check or hosted zone was created by another service, the service that created the resource.
     *        When a resource is created by another service, you can't edit or delete it using Amazon Route 53.
     */

    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    /**
     * <p>
     * If the health check or hosted zone was created by another service, the service that created the resource. When a
     * resource is created by another service, you can't edit or delete it using Amazon Route 53.
     * </p>
     * 
     * @return If the health check or hosted zone was created by another service, the service that created the resource.
     *         When a resource is created by another service, you can't edit or delete it using Amazon Route 53.
     */

    public String getServicePrincipal() {
        return this.servicePrincipal;
    }

    /**
     * <p>
     * If the health check or hosted zone was created by another service, the service that created the resource. When a
     * resource is created by another service, you can't edit or delete it using Amazon Route 53.
     * </p>
     * 
     * @param servicePrincipal
     *        If the health check or hosted zone was created by another service, the service that created the resource.
     *        When a resource is created by another service, you can't edit or delete it using Amazon Route 53.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinkedService withServicePrincipal(String servicePrincipal) {
        setServicePrincipal(servicePrincipal);
        return this;
    }

    /**
     * <p>
     * If the health check or hosted zone was created by another service, an optional description that can be provided
     * by the other service. When a resource is created by another service, you can't edit or delete it using Amazon
     * Route 53.
     * </p>
     * 
     * @param description
     *        If the health check or hosted zone was created by another service, an optional description that can be
     *        provided by the other service. When a resource is created by another service, you can't edit or delete it
     *        using Amazon Route 53.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * If the health check or hosted zone was created by another service, an optional description that can be provided
     * by the other service. When a resource is created by another service, you can't edit or delete it using Amazon
     * Route 53.
     * </p>
     * 
     * @return If the health check or hosted zone was created by another service, an optional description that can be
     *         provided by the other service. When a resource is created by another service, you can't edit or delete it
     *         using Amazon Route 53.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * If the health check or hosted zone was created by another service, an optional description that can be provided
     * by the other service. When a resource is created by another service, you can't edit or delete it using Amazon
     * Route 53.
     * </p>
     * 
     * @param description
     *        If the health check or hosted zone was created by another service, an optional description that can be
     *        provided by the other service. When a resource is created by another service, you can't edit or delete it
     *        using Amazon Route 53.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinkedService withDescription(String description) {
        setDescription(description);
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
        if (getServicePrincipal() != null)
            sb.append("ServicePrincipal: ").append(getServicePrincipal()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LinkedService == false)
            return false;
        LinkedService other = (LinkedService) obj;
        if (other.getServicePrincipal() == null ^ this.getServicePrincipal() == null)
            return false;
        if (other.getServicePrincipal() != null && other.getServicePrincipal().equals(this.getServicePrincipal()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServicePrincipal() == null) ? 0 : getServicePrincipal().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public LinkedService clone() {
        try {
            return (LinkedService) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
