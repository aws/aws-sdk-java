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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateGrant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGrantRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Grant name.
     * </p>
     */
    private String grantName;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the license.
     * </p>
     */
    private String licenseArn;
    /**
     * <p>
     * The grant principals.
     * </p>
     */
    private java.util.List<String> principals;
    /**
     * <p>
     * Home Region of the grant.
     * </p>
     */
    private String homeRegion;
    /**
     * <p>
     * Allowed operations for the grant.
     * </p>
     */
    private java.util.List<String> allowedOperations;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrantRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Grant name.
     * </p>
     * 
     * @param grantName
     *        Grant name.
     */

    public void setGrantName(String grantName) {
        this.grantName = grantName;
    }

    /**
     * <p>
     * Grant name.
     * </p>
     * 
     * @return Grant name.
     */

    public String getGrantName() {
        return this.grantName;
    }

    /**
     * <p>
     * Grant name.
     * </p>
     * 
     * @param grantName
     *        Grant name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrantRequest withGrantName(String grantName) {
        setGrantName(grantName);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license.
     * </p>
     * 
     * @param licenseArn
     *        Amazon Resource Name (ARN) of the license.
     */

    public void setLicenseArn(String licenseArn) {
        this.licenseArn = licenseArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the license.
     */

    public String getLicenseArn() {
        return this.licenseArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license.
     * </p>
     * 
     * @param licenseArn
     *        Amazon Resource Name (ARN) of the license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrantRequest withLicenseArn(String licenseArn) {
        setLicenseArn(licenseArn);
        return this;
    }

    /**
     * <p>
     * The grant principals.
     * </p>
     * 
     * @return The grant principals.
     */

    public java.util.List<String> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * The grant principals.
     * </p>
     * 
     * @param principals
     *        The grant principals.
     */

    public void setPrincipals(java.util.Collection<String> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<String>(principals);
    }

    /**
     * <p>
     * The grant principals.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        The grant principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrantRequest withPrincipals(String... principals) {
        if (this.principals == null) {
            setPrincipals(new java.util.ArrayList<String>(principals.length));
        }
        for (String ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The grant principals.
     * </p>
     * 
     * @param principals
     *        The grant principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrantRequest withPrincipals(java.util.Collection<String> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * Home Region of the grant.
     * </p>
     * 
     * @param homeRegion
     *        Home Region of the grant.
     */

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    /**
     * <p>
     * Home Region of the grant.
     * </p>
     * 
     * @return Home Region of the grant.
     */

    public String getHomeRegion() {
        return this.homeRegion;
    }

    /**
     * <p>
     * Home Region of the grant.
     * </p>
     * 
     * @param homeRegion
     *        Home Region of the grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrantRequest withHomeRegion(String homeRegion) {
        setHomeRegion(homeRegion);
        return this;
    }

    /**
     * <p>
     * Allowed operations for the grant.
     * </p>
     * 
     * @return Allowed operations for the grant.
     * @see AllowedOperation
     */

    public java.util.List<String> getAllowedOperations() {
        return allowedOperations;
    }

    /**
     * <p>
     * Allowed operations for the grant.
     * </p>
     * 
     * @param allowedOperations
     *        Allowed operations for the grant.
     * @see AllowedOperation
     */

    public void setAllowedOperations(java.util.Collection<String> allowedOperations) {
        if (allowedOperations == null) {
            this.allowedOperations = null;
            return;
        }

        this.allowedOperations = new java.util.ArrayList<String>(allowedOperations);
    }

    /**
     * <p>
     * Allowed operations for the grant.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedOperations(java.util.Collection)} or {@link #withAllowedOperations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param allowedOperations
     *        Allowed operations for the grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowedOperation
     */

    public CreateGrantRequest withAllowedOperations(String... allowedOperations) {
        if (this.allowedOperations == null) {
            setAllowedOperations(new java.util.ArrayList<String>(allowedOperations.length));
        }
        for (String ele : allowedOperations) {
            this.allowedOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Allowed operations for the grant.
     * </p>
     * 
     * @param allowedOperations
     *        Allowed operations for the grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowedOperation
     */

    public CreateGrantRequest withAllowedOperations(java.util.Collection<String> allowedOperations) {
        setAllowedOperations(allowedOperations);
        return this;
    }

    /**
     * <p>
     * Allowed operations for the grant.
     * </p>
     * 
     * @param allowedOperations
     *        Allowed operations for the grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowedOperation
     */

    public CreateGrantRequest withAllowedOperations(AllowedOperation... allowedOperations) {
        java.util.ArrayList<String> allowedOperationsCopy = new java.util.ArrayList<String>(allowedOperations.length);
        for (AllowedOperation value : allowedOperations) {
            allowedOperationsCopy.add(value.toString());
        }
        if (getAllowedOperations() == null) {
            setAllowedOperations(allowedOperationsCopy);
        } else {
            getAllowedOperations().addAll(allowedOperationsCopy);
        }
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getGrantName() != null)
            sb.append("GrantName: ").append(getGrantName()).append(",");
        if (getLicenseArn() != null)
            sb.append("LicenseArn: ").append(getLicenseArn()).append(",");
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getHomeRegion() != null)
            sb.append("HomeRegion: ").append(getHomeRegion()).append(",");
        if (getAllowedOperations() != null)
            sb.append("AllowedOperations: ").append(getAllowedOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGrantRequest == false)
            return false;
        CreateGrantRequest other = (CreateGrantRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getGrantName() == null ^ this.getGrantName() == null)
            return false;
        if (other.getGrantName() != null && other.getGrantName().equals(this.getGrantName()) == false)
            return false;
        if (other.getLicenseArn() == null ^ this.getLicenseArn() == null)
            return false;
        if (other.getLicenseArn() != null && other.getLicenseArn().equals(this.getLicenseArn()) == false)
            return false;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getHomeRegion() == null ^ this.getHomeRegion() == null)
            return false;
        if (other.getHomeRegion() != null && other.getHomeRegion().equals(this.getHomeRegion()) == false)
            return false;
        if (other.getAllowedOperations() == null ^ this.getAllowedOperations() == null)
            return false;
        if (other.getAllowedOperations() != null && other.getAllowedOperations().equals(this.getAllowedOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getGrantName() == null) ? 0 : getGrantName().hashCode());
        hashCode = prime * hashCode + ((getLicenseArn() == null) ? 0 : getLicenseArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getHomeRegion() == null) ? 0 : getHomeRegion().hashCode());
        hashCode = prime * hashCode + ((getAllowedOperations() == null) ? 0 : getAllowedOperations().hashCode());
        return hashCode;
    }

    @Override
    public CreateGrantRequest clone() {
        return (CreateGrantRequest) super.clone();
    }

}
