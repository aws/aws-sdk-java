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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDomainConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain configuration to be deleted.
     * </p>
     */
    private String domainConfigurationName;

    /**
     * <p>
     * The name of the domain configuration to be deleted.
     * </p>
     * 
     * @param domainConfigurationName
     *        The name of the domain configuration to be deleted.
     */

    public void setDomainConfigurationName(String domainConfigurationName) {
        this.domainConfigurationName = domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration to be deleted.
     * </p>
     * 
     * @return The name of the domain configuration to be deleted.
     */

    public String getDomainConfigurationName() {
        return this.domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration to be deleted.
     * </p>
     * 
     * @param domainConfigurationName
     *        The name of the domain configuration to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDomainConfigurationRequest withDomainConfigurationName(String domainConfigurationName) {
        setDomainConfigurationName(domainConfigurationName);
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
        if (getDomainConfigurationName() != null)
            sb.append("DomainConfigurationName: ").append(getDomainConfigurationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDomainConfigurationRequest == false)
            return false;
        DeleteDomainConfigurationRequest other = (DeleteDomainConfigurationRequest) obj;
        if (other.getDomainConfigurationName() == null ^ this.getDomainConfigurationName() == null)
            return false;
        if (other.getDomainConfigurationName() != null && other.getDomainConfigurationName().equals(this.getDomainConfigurationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainConfigurationName() == null) ? 0 : getDomainConfigurationName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDomainConfigurationRequest clone() {
        return (DeleteDomainConfigurationRequest) super.clone();
    }

}
