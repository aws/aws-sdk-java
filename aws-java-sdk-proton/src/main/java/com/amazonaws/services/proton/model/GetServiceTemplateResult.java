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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The service template detail data that's returned by AWS Proton.
     * </p>
     */
    private ServiceTemplate serviceTemplate;

    /**
     * <p>
     * The service template detail data that's returned by AWS Proton.
     * </p>
     * 
     * @param serviceTemplate
     *        The service template detail data that's returned by AWS Proton.
     */

    public void setServiceTemplate(ServiceTemplate serviceTemplate) {
        this.serviceTemplate = serviceTemplate;
    }

    /**
     * <p>
     * The service template detail data that's returned by AWS Proton.
     * </p>
     * 
     * @return The service template detail data that's returned by AWS Proton.
     */

    public ServiceTemplate getServiceTemplate() {
        return this.serviceTemplate;
    }

    /**
     * <p>
     * The service template detail data that's returned by AWS Proton.
     * </p>
     * 
     * @param serviceTemplate
     *        The service template detail data that's returned by AWS Proton.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceTemplateResult withServiceTemplate(ServiceTemplate serviceTemplate) {
        setServiceTemplate(serviceTemplate);
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
        if (getServiceTemplate() != null)
            sb.append("ServiceTemplate: ").append(getServiceTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceTemplateResult == false)
            return false;
        GetServiceTemplateResult other = (GetServiceTemplateResult) obj;
        if (other.getServiceTemplate() == null ^ this.getServiceTemplate() == null)
            return false;
        if (other.getServiceTemplate() != null && other.getServiceTemplate().equals(this.getServiceTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceTemplate() == null) ? 0 : getServiceTemplate().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceTemplateResult clone() {
        try {
            return (GetServiceTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
