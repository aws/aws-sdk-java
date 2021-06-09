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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateServiceTemplateVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceTemplateVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The service template version summary of detail data that's returned by AWS Proton.
     * </p>
     */
    private ServiceTemplateVersion serviceTemplateVersion;

    /**
     * <p>
     * The service template version summary of detail data that's returned by AWS Proton.
     * </p>
     * 
     * @param serviceTemplateVersion
     *        The service template version summary of detail data that's returned by AWS Proton.
     */

    public void setServiceTemplateVersion(ServiceTemplateVersion serviceTemplateVersion) {
        this.serviceTemplateVersion = serviceTemplateVersion;
    }

    /**
     * <p>
     * The service template version summary of detail data that's returned by AWS Proton.
     * </p>
     * 
     * @return The service template version summary of detail data that's returned by AWS Proton.
     */

    public ServiceTemplateVersion getServiceTemplateVersion() {
        return this.serviceTemplateVersion;
    }

    /**
     * <p>
     * The service template version summary of detail data that's returned by AWS Proton.
     * </p>
     * 
     * @param serviceTemplateVersion
     *        The service template version summary of detail data that's returned by AWS Proton.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceTemplateVersionResult withServiceTemplateVersion(ServiceTemplateVersion serviceTemplateVersion) {
        setServiceTemplateVersion(serviceTemplateVersion);
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
        if (getServiceTemplateVersion() != null)
            sb.append("ServiceTemplateVersion: ").append(getServiceTemplateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceTemplateVersionResult == false)
            return false;
        CreateServiceTemplateVersionResult other = (CreateServiceTemplateVersionResult) obj;
        if (other.getServiceTemplateVersion() == null ^ this.getServiceTemplateVersion() == null)
            return false;
        if (other.getServiceTemplateVersion() != null && other.getServiceTemplateVersion().equals(this.getServiceTemplateVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceTemplateVersion() == null) ? 0 : getServiceTemplateVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceTemplateVersionResult clone() {
        try {
            return (CreateServiceTemplateVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
