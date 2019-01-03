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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseSpecificationsForResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLicenseSpecificationsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN for an AWS server resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * License configuration ARNs to be added to a resource.
     * </p>
     */
    private java.util.List<LicenseSpecification> addLicenseSpecifications;
    /**
     * <p>
     * License configuration ARNs to be removed from a resource.
     * </p>
     */
    private java.util.List<LicenseSpecification> removeLicenseSpecifications;

    /**
     * <p>
     * ARN for an AWS server resource.
     * </p>
     * 
     * @param resourceArn
     *        ARN for an AWS server resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * ARN for an AWS server resource.
     * </p>
     * 
     * @return ARN for an AWS server resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * ARN for an AWS server resource.
     * </p>
     * 
     * @param resourceArn
     *        ARN for an AWS server resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseSpecificationsForResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * License configuration ARNs to be added to a resource.
     * </p>
     * 
     * @return License configuration ARNs to be added to a resource.
     */

    public java.util.List<LicenseSpecification> getAddLicenseSpecifications() {
        return addLicenseSpecifications;
    }

    /**
     * <p>
     * License configuration ARNs to be added to a resource.
     * </p>
     * 
     * @param addLicenseSpecifications
     *        License configuration ARNs to be added to a resource.
     */

    public void setAddLicenseSpecifications(java.util.Collection<LicenseSpecification> addLicenseSpecifications) {
        if (addLicenseSpecifications == null) {
            this.addLicenseSpecifications = null;
            return;
        }

        this.addLicenseSpecifications = new java.util.ArrayList<LicenseSpecification>(addLicenseSpecifications);
    }

    /**
     * <p>
     * License configuration ARNs to be added to a resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddLicenseSpecifications(java.util.Collection)} or
     * {@link #withAddLicenseSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param addLicenseSpecifications
     *        License configuration ARNs to be added to a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseSpecificationsForResourceRequest withAddLicenseSpecifications(LicenseSpecification... addLicenseSpecifications) {
        if (this.addLicenseSpecifications == null) {
            setAddLicenseSpecifications(new java.util.ArrayList<LicenseSpecification>(addLicenseSpecifications.length));
        }
        for (LicenseSpecification ele : addLicenseSpecifications) {
            this.addLicenseSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * License configuration ARNs to be added to a resource.
     * </p>
     * 
     * @param addLicenseSpecifications
     *        License configuration ARNs to be added to a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseSpecificationsForResourceRequest withAddLicenseSpecifications(java.util.Collection<LicenseSpecification> addLicenseSpecifications) {
        setAddLicenseSpecifications(addLicenseSpecifications);
        return this;
    }

    /**
     * <p>
     * License configuration ARNs to be removed from a resource.
     * </p>
     * 
     * @return License configuration ARNs to be removed from a resource.
     */

    public java.util.List<LicenseSpecification> getRemoveLicenseSpecifications() {
        return removeLicenseSpecifications;
    }

    /**
     * <p>
     * License configuration ARNs to be removed from a resource.
     * </p>
     * 
     * @param removeLicenseSpecifications
     *        License configuration ARNs to be removed from a resource.
     */

    public void setRemoveLicenseSpecifications(java.util.Collection<LicenseSpecification> removeLicenseSpecifications) {
        if (removeLicenseSpecifications == null) {
            this.removeLicenseSpecifications = null;
            return;
        }

        this.removeLicenseSpecifications = new java.util.ArrayList<LicenseSpecification>(removeLicenseSpecifications);
    }

    /**
     * <p>
     * License configuration ARNs to be removed from a resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveLicenseSpecifications(java.util.Collection)} or
     * {@link #withRemoveLicenseSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param removeLicenseSpecifications
     *        License configuration ARNs to be removed from a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseSpecificationsForResourceRequest withRemoveLicenseSpecifications(LicenseSpecification... removeLicenseSpecifications) {
        if (this.removeLicenseSpecifications == null) {
            setRemoveLicenseSpecifications(new java.util.ArrayList<LicenseSpecification>(removeLicenseSpecifications.length));
        }
        for (LicenseSpecification ele : removeLicenseSpecifications) {
            this.removeLicenseSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * License configuration ARNs to be removed from a resource.
     * </p>
     * 
     * @param removeLicenseSpecifications
     *        License configuration ARNs to be removed from a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseSpecificationsForResourceRequest withRemoveLicenseSpecifications(java.util.Collection<LicenseSpecification> removeLicenseSpecifications) {
        setRemoveLicenseSpecifications(removeLicenseSpecifications);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getAddLicenseSpecifications() != null)
            sb.append("AddLicenseSpecifications: ").append(getAddLicenseSpecifications()).append(",");
        if (getRemoveLicenseSpecifications() != null)
            sb.append("RemoveLicenseSpecifications: ").append(getRemoveLicenseSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLicenseSpecificationsForResourceRequest == false)
            return false;
        UpdateLicenseSpecificationsForResourceRequest other = (UpdateLicenseSpecificationsForResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getAddLicenseSpecifications() == null ^ this.getAddLicenseSpecifications() == null)
            return false;
        if (other.getAddLicenseSpecifications() != null && other.getAddLicenseSpecifications().equals(this.getAddLicenseSpecifications()) == false)
            return false;
        if (other.getRemoveLicenseSpecifications() == null ^ this.getRemoveLicenseSpecifications() == null)
            return false;
        if (other.getRemoveLicenseSpecifications() != null && other.getRemoveLicenseSpecifications().equals(this.getRemoveLicenseSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getAddLicenseSpecifications() == null) ? 0 : getAddLicenseSpecifications().hashCode());
        hashCode = prime * hashCode + ((getRemoveLicenseSpecifications() == null) ? 0 : getRemoveLicenseSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLicenseSpecificationsForResourceRequest clone() {
        return (UpdateLicenseSpecificationsForResourceRequest) super.clone();
    }

}
