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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteOrganizationConformancePack"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteOrganizationConformancePackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of organization conformance pack that you want to delete.
     * </p>
     */
    private String organizationConformancePackName;

    /**
     * <p>
     * The name of organization conformance pack that you want to delete.
     * </p>
     * 
     * @param organizationConformancePackName
     *        The name of organization conformance pack that you want to delete.
     */

    public void setOrganizationConformancePackName(String organizationConformancePackName) {
        this.organizationConformancePackName = organizationConformancePackName;
    }

    /**
     * <p>
     * The name of organization conformance pack that you want to delete.
     * </p>
     * 
     * @return The name of organization conformance pack that you want to delete.
     */

    public String getOrganizationConformancePackName() {
        return this.organizationConformancePackName;
    }

    /**
     * <p>
     * The name of organization conformance pack that you want to delete.
     * </p>
     * 
     * @param organizationConformancePackName
     *        The name of organization conformance pack that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteOrganizationConformancePackRequest withOrganizationConformancePackName(String organizationConformancePackName) {
        setOrganizationConformancePackName(organizationConformancePackName);
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
        if (getOrganizationConformancePackName() != null)
            sb.append("OrganizationConformancePackName: ").append(getOrganizationConformancePackName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteOrganizationConformancePackRequest == false)
            return false;
        DeleteOrganizationConformancePackRequest other = (DeleteOrganizationConformancePackRequest) obj;
        if (other.getOrganizationConformancePackName() == null ^ this.getOrganizationConformancePackName() == null)
            return false;
        if (other.getOrganizationConformancePackName() != null
                && other.getOrganizationConformancePackName().equals(this.getOrganizationConformancePackName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationConformancePackName() == null) ? 0 : getOrganizationConformancePackName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteOrganizationConformancePackRequest clone() {
        return (DeleteOrganizationConformancePackRequest) super.clone();
    }

}
