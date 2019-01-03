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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/UpdateService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the service that you want to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A complex type that contains the new settings for the service.
     * </p>
     */
    private ServiceChange service;

    /**
     * <p>
     * The ID of the service that you want to update.
     * </p>
     * 
     * @param id
     *        The ID of the service that you want to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the service that you want to update.
     * </p>
     * 
     * @return The ID of the service that you want to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the service that you want to update.
     * </p>
     * 
     * @param id
     *        The ID of the service that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A complex type that contains the new settings for the service.
     * </p>
     * 
     * @param service
     *        A complex type that contains the new settings for the service.
     */

    public void setService(ServiceChange service) {
        this.service = service;
    }

    /**
     * <p>
     * A complex type that contains the new settings for the service.
     * </p>
     * 
     * @return A complex type that contains the new settings for the service.
     */

    public ServiceChange getService() {
        return this.service;
    }

    /**
     * <p>
     * A complex type that contains the new settings for the service.
     * </p>
     * 
     * @param service
     *        A complex type that contains the new settings for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceRequest withService(ServiceChange service) {
        setService(service);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceRequest == false)
            return false;
        UpdateServiceRequest other = (UpdateServiceRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceRequest clone() {
        return (UpdateServiceRequest) super.clone();
    }

}
