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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53profiles-2018-05-10/AssociateResourceToProfile"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateResourceToProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name for the resource association.
     * </p>
     */
    private String name;
    /**
     * <p>
     * ID of the Profile.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * Amazon resource number, ARN, of the DNS resource.
     * </p>
     */
    private String resourceArn;
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
     * Name for the resource association.
     * </p>
     * 
     * @param name
     *        Name for the resource association.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name for the resource association.
     * </p>
     * 
     * @return Name for the resource association.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name for the resource association.
     * </p>
     * 
     * @param name
     *        Name for the resource association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceToProfileRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * ID of the Profile.
     * </p>
     * 
     * @param profileId
     *        ID of the Profile.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * ID of the Profile.
     * </p>
     * 
     * @return ID of the Profile.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * ID of the Profile.
     * </p>
     * 
     * @param profileId
     *        ID of the Profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceToProfileRequest withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * Amazon resource number, ARN, of the DNS resource.
     * </p>
     * 
     * @param resourceArn
     *        Amazon resource number, ARN, of the DNS resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * Amazon resource number, ARN, of the DNS resource.
     * </p>
     * 
     * @return Amazon resource number, ARN, of the DNS resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * Amazon resource number, ARN, of the DNS resource.
     * </p>
     * 
     * @param resourceArn
     *        Amazon resource number, ARN, of the DNS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceToProfileRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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

    public AssociateResourceToProfileRequest withResourceProperties(String resourceProperties) {
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
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
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

        if (obj instanceof AssociateResourceToProfileRequest == false)
            return false;
        AssociateResourceToProfileRequest other = (AssociateResourceToProfileRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
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
        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceProperties() == null) ? 0 : getResourceProperties().hashCode());
        return hashCode;
    }

    @Override
    public AssociateResourceToProfileRequest clone() {
        return (AssociateResourceToProfileRequest) super.clone();
    }

}
