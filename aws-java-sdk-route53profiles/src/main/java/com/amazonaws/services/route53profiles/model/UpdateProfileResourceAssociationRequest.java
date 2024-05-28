/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53profiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/UpdateProfileResourceAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProfileResourceAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the resource association.
     * </p>
     */
    private String name;
    /**
     * <p>
     * ID of the resource association.
     * </p>
     */
    private String profileResourceAssociationId;
    /**
     * <p>
     * If you are adding a DNS Firewall rule group, include also a priority. The priority indicates the processing order
     * for the rule groups, starting with the priority assinged the lowest value.
     * </p>
     * <p>
     * The allowed values for priority are between 100 and 9900.
     * </p>
     */
    private String resourceProperties;

    /**
     * <p>
     * Name of the resource association.
     * </p>
     * 
     * @param name
     *        Name of the resource association.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the resource association.
     * </p>
     * 
     * @return Name of the resource association.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the resource association.
     * </p>
     * 
     * @param name
     *        Name of the resource association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileResourceAssociationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * ID of the resource association.
     * </p>
     * 
     * @param profileResourceAssociationId
     *        ID of the resource association.
     */

    public void setProfileResourceAssociationId(String profileResourceAssociationId) {
        this.profileResourceAssociationId = profileResourceAssociationId;
    }

    /**
     * <p>
     * ID of the resource association.
     * </p>
     * 
     * @return ID of the resource association.
     */

    public String getProfileResourceAssociationId() {
        return this.profileResourceAssociationId;
    }

    /**
     * <p>
     * ID of the resource association.
     * </p>
     * 
     * @param profileResourceAssociationId
     *        ID of the resource association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileResourceAssociationRequest withProfileResourceAssociationId(String profileResourceAssociationId) {
        setProfileResourceAssociationId(profileResourceAssociationId);
        return this;
    }

    /**
     * <p>
     * If you are adding a DNS Firewall rule group, include also a priority. The priority indicates the processing order
     * for the rule groups, starting with the priority assinged the lowest value.
     * </p>
     * <p>
     * The allowed values for priority are between 100 and 9900.
     * </p>
     * 
     * @param resourceProperties
     *        If you are adding a DNS Firewall rule group, include also a priority. The priority indicates the
     *        processing order for the rule groups, starting with the priority assinged the lowest value. </p>
     *        <p>
     *        The allowed values for priority are between 100 and 9900.
     */

    public void setResourceProperties(String resourceProperties) {
        this.resourceProperties = resourceProperties;
    }

    /**
     * <p>
     * If you are adding a DNS Firewall rule group, include also a priority. The priority indicates the processing order
     * for the rule groups, starting with the priority assinged the lowest value.
     * </p>
     * <p>
     * The allowed values for priority are between 100 and 9900.
     * </p>
     * 
     * @return If you are adding a DNS Firewall rule group, include also a priority. The priority indicates the
     *         processing order for the rule groups, starting with the priority assinged the lowest value. </p>
     *         <p>
     *         The allowed values for priority are between 100 and 9900.
     */

    public String getResourceProperties() {
        return this.resourceProperties;
    }

    /**
     * <p>
     * If you are adding a DNS Firewall rule group, include also a priority. The priority indicates the processing order
     * for the rule groups, starting with the priority assinged the lowest value.
     * </p>
     * <p>
     * The allowed values for priority are between 100 and 9900.
     * </p>
     * 
     * @param resourceProperties
     *        If you are adding a DNS Firewall rule group, include also a priority. The priority indicates the
     *        processing order for the rule groups, starting with the priority assinged the lowest value. </p>
     *        <p>
     *        The allowed values for priority are between 100 and 9900.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileResourceAssociationRequest withResourceProperties(String resourceProperties) {
        setResourceProperties(resourceProperties);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProfileResourceAssociationId() != null)
            sb.append("ProfileResourceAssociationId: ").append(getProfileResourceAssociationId()).append(",");
        if (getResourceProperties() != null)
            sb.append("ResourceProperties: ").append(getResourceProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProfileResourceAssociationRequest == false)
            return false;
        UpdateProfileResourceAssociationRequest other = (UpdateProfileResourceAssociationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProfileResourceAssociationId() == null ^ this.getProfileResourceAssociationId() == null)
            return false;
        if (other.getProfileResourceAssociationId() != null && other.getProfileResourceAssociationId().equals(this.getProfileResourceAssociationId()) == false)
            return false;
        if (other.getResourceProperties() == null ^ this.getResourceProperties() == null)
            return false;
        if (other.getResourceProperties() != null && other.getResourceProperties().equals(this.getResourceProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProfileResourceAssociationId() == null) ? 0 : getProfileResourceAssociationId().hashCode());
        hashCode = prime * hashCode + ((getResourceProperties() == null) ? 0 : getResourceProperties().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProfileResourceAssociationRequest clone() {
        return (UpdateProfileResourceAssociationRequest) super.clone();
    }

}
