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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/StartOrganizationServiceAccessUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartOrganizationServiceAccessUpdateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The status of the service access update request for an Amazon Web Services Organization.
     * </p>
     */
    private OrganizationStatus organizationStatus;

    /**
     * <p>
     * The status of the service access update request for an Amazon Web Services Organization.
     * </p>
     * 
     * @param organizationStatus
     *        The status of the service access update request for an Amazon Web Services Organization.
     */

    public void setOrganizationStatus(OrganizationStatus organizationStatus) {
        this.organizationStatus = organizationStatus;
    }

    /**
     * <p>
     * The status of the service access update request for an Amazon Web Services Organization.
     * </p>
     * 
     * @return The status of the service access update request for an Amazon Web Services Organization.
     */

    public OrganizationStatus getOrganizationStatus() {
        return this.organizationStatus;
    }

    /**
     * <p>
     * The status of the service access update request for an Amazon Web Services Organization.
     * </p>
     * 
     * @param organizationStatus
     *        The status of the service access update request for an Amazon Web Services Organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOrganizationServiceAccessUpdateResult withOrganizationStatus(OrganizationStatus organizationStatus) {
        setOrganizationStatus(organizationStatus);
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
        if (getOrganizationStatus() != null)
            sb.append("OrganizationStatus: ").append(getOrganizationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartOrganizationServiceAccessUpdateResult == false)
            return false;
        StartOrganizationServiceAccessUpdateResult other = (StartOrganizationServiceAccessUpdateResult) obj;
        if (other.getOrganizationStatus() == null ^ this.getOrganizationStatus() == null)
            return false;
        if (other.getOrganizationStatus() != null && other.getOrganizationStatus().equals(this.getOrganizationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationStatus() == null) ? 0 : getOrganizationStatus().hashCode());
        return hashCode;
    }

    @Override
    public StartOrganizationServiceAccessUpdateResult clone() {
        try {
            return (StartOrganizationServiceAccessUpdateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
