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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a grant.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/Grant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Grant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the grant.
     * </p>
     */
    private String grantArn;
    /**
     * <p>
     * Grant name.
     * </p>
     */
    private String grantName;
    /**
     * <p>
     * Parent ARN.
     * </p>
     */
    private String parentArn;
    /**
     * <p>
     * License ARN.
     * </p>
     */
    private String licenseArn;
    /**
     * <p>
     * The grantee principal ARN.
     * </p>
     */
    private String granteePrincipalArn;
    /**
     * <p>
     * Home Region of the grant.
     * </p>
     */
    private String homeRegion;
    /**
     * <p>
     * Grant status.
     * </p>
     */
    private String grantStatus;
    /**
     * <p>
     * Grant status reason.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * Grant version.
     * </p>
     */
    private String version;
    /**
     * <p>
     * Granted operations.
     * </p>
     */
    private java.util.List<String> grantedOperations;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the grant.
     * </p>
     * 
     * @param grantArn
     *        Amazon Resource Name (ARN) of the grant.
     */

    public void setGrantArn(String grantArn) {
        this.grantArn = grantArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the grant.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the grant.
     */

    public String getGrantArn() {
        return this.grantArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the grant.
     * </p>
     * 
     * @param grantArn
     *        Amazon Resource Name (ARN) of the grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grant withGrantArn(String grantArn) {
        setGrantArn(grantArn);
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

    public Grant withGrantName(String grantName) {
        setGrantName(grantName);
        return this;
    }

    /**
     * <p>
     * Parent ARN.
     * </p>
     * 
     * @param parentArn
     *        Parent ARN.
     */

    public void setParentArn(String parentArn) {
        this.parentArn = parentArn;
    }

    /**
     * <p>
     * Parent ARN.
     * </p>
     * 
     * @return Parent ARN.
     */

    public String getParentArn() {
        return this.parentArn;
    }

    /**
     * <p>
     * Parent ARN.
     * </p>
     * 
     * @param parentArn
     *        Parent ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grant withParentArn(String parentArn) {
        setParentArn(parentArn);
        return this;
    }

    /**
     * <p>
     * License ARN.
     * </p>
     * 
     * @param licenseArn
     *        License ARN.
     */

    public void setLicenseArn(String licenseArn) {
        this.licenseArn = licenseArn;
    }

    /**
     * <p>
     * License ARN.
     * </p>
     * 
     * @return License ARN.
     */

    public String getLicenseArn() {
        return this.licenseArn;
    }

    /**
     * <p>
     * License ARN.
     * </p>
     * 
     * @param licenseArn
     *        License ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grant withLicenseArn(String licenseArn) {
        setLicenseArn(licenseArn);
        return this;
    }

    /**
     * <p>
     * The grantee principal ARN.
     * </p>
     * 
     * @param granteePrincipalArn
     *        The grantee principal ARN.
     */

    public void setGranteePrincipalArn(String granteePrincipalArn) {
        this.granteePrincipalArn = granteePrincipalArn;
    }

    /**
     * <p>
     * The grantee principal ARN.
     * </p>
     * 
     * @return The grantee principal ARN.
     */

    public String getGranteePrincipalArn() {
        return this.granteePrincipalArn;
    }

    /**
     * <p>
     * The grantee principal ARN.
     * </p>
     * 
     * @param granteePrincipalArn
     *        The grantee principal ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grant withGranteePrincipalArn(String granteePrincipalArn) {
        setGranteePrincipalArn(granteePrincipalArn);
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

    public Grant withHomeRegion(String homeRegion) {
        setHomeRegion(homeRegion);
        return this;
    }

    /**
     * <p>
     * Grant status.
     * </p>
     * 
     * @param grantStatus
     *        Grant status.
     * @see GrantStatus
     */

    public void setGrantStatus(String grantStatus) {
        this.grantStatus = grantStatus;
    }

    /**
     * <p>
     * Grant status.
     * </p>
     * 
     * @return Grant status.
     * @see GrantStatus
     */

    public String getGrantStatus() {
        return this.grantStatus;
    }

    /**
     * <p>
     * Grant status.
     * </p>
     * 
     * @param grantStatus
     *        Grant status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrantStatus
     */

    public Grant withGrantStatus(String grantStatus) {
        setGrantStatus(grantStatus);
        return this;
    }

    /**
     * <p>
     * Grant status.
     * </p>
     * 
     * @param grantStatus
     *        Grant status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrantStatus
     */

    public Grant withGrantStatus(GrantStatus grantStatus) {
        this.grantStatus = grantStatus.toString();
        return this;
    }

    /**
     * <p>
     * Grant status reason.
     * </p>
     * 
     * @param statusReason
     *        Grant status reason.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Grant status reason.
     * </p>
     * 
     * @return Grant status reason.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * Grant status reason.
     * </p>
     * 
     * @param statusReason
     *        Grant status reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grant withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * Grant version.
     * </p>
     * 
     * @param version
     *        Grant version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Grant version.
     * </p>
     * 
     * @return Grant version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Grant version.
     * </p>
     * 
     * @param version
     *        Grant version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grant withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Granted operations.
     * </p>
     * 
     * @return Granted operations.
     * @see AllowedOperation
     */

    public java.util.List<String> getGrantedOperations() {
        return grantedOperations;
    }

    /**
     * <p>
     * Granted operations.
     * </p>
     * 
     * @param grantedOperations
     *        Granted operations.
     * @see AllowedOperation
     */

    public void setGrantedOperations(java.util.Collection<String> grantedOperations) {
        if (grantedOperations == null) {
            this.grantedOperations = null;
            return;
        }

        this.grantedOperations = new java.util.ArrayList<String>(grantedOperations);
    }

    /**
     * <p>
     * Granted operations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGrantedOperations(java.util.Collection)} or {@link #withGrantedOperations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param grantedOperations
     *        Granted operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowedOperation
     */

    public Grant withGrantedOperations(String... grantedOperations) {
        if (this.grantedOperations == null) {
            setGrantedOperations(new java.util.ArrayList<String>(grantedOperations.length));
        }
        for (String ele : grantedOperations) {
            this.grantedOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Granted operations.
     * </p>
     * 
     * @param grantedOperations
     *        Granted operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowedOperation
     */

    public Grant withGrantedOperations(java.util.Collection<String> grantedOperations) {
        setGrantedOperations(grantedOperations);
        return this;
    }

    /**
     * <p>
     * Granted operations.
     * </p>
     * 
     * @param grantedOperations
     *        Granted operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowedOperation
     */

    public Grant withGrantedOperations(AllowedOperation... grantedOperations) {
        java.util.ArrayList<String> grantedOperationsCopy = new java.util.ArrayList<String>(grantedOperations.length);
        for (AllowedOperation value : grantedOperations) {
            grantedOperationsCopy.add(value.toString());
        }
        if (getGrantedOperations() == null) {
            setGrantedOperations(grantedOperationsCopy);
        } else {
            getGrantedOperations().addAll(grantedOperationsCopy);
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
        if (getGrantArn() != null)
            sb.append("GrantArn: ").append(getGrantArn()).append(",");
        if (getGrantName() != null)
            sb.append("GrantName: ").append(getGrantName()).append(",");
        if (getParentArn() != null)
            sb.append("ParentArn: ").append(getParentArn()).append(",");
        if (getLicenseArn() != null)
            sb.append("LicenseArn: ").append(getLicenseArn()).append(",");
        if (getGranteePrincipalArn() != null)
            sb.append("GranteePrincipalArn: ").append(getGranteePrincipalArn()).append(",");
        if (getHomeRegion() != null)
            sb.append("HomeRegion: ").append(getHomeRegion()).append(",");
        if (getGrantStatus() != null)
            sb.append("GrantStatus: ").append(getGrantStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getGrantedOperations() != null)
            sb.append("GrantedOperations: ").append(getGrantedOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Grant == false)
            return false;
        Grant other = (Grant) obj;
        if (other.getGrantArn() == null ^ this.getGrantArn() == null)
            return false;
        if (other.getGrantArn() != null && other.getGrantArn().equals(this.getGrantArn()) == false)
            return false;
        if (other.getGrantName() == null ^ this.getGrantName() == null)
            return false;
        if (other.getGrantName() != null && other.getGrantName().equals(this.getGrantName()) == false)
            return false;
        if (other.getParentArn() == null ^ this.getParentArn() == null)
            return false;
        if (other.getParentArn() != null && other.getParentArn().equals(this.getParentArn()) == false)
            return false;
        if (other.getLicenseArn() == null ^ this.getLicenseArn() == null)
            return false;
        if (other.getLicenseArn() != null && other.getLicenseArn().equals(this.getLicenseArn()) == false)
            return false;
        if (other.getGranteePrincipalArn() == null ^ this.getGranteePrincipalArn() == null)
            return false;
        if (other.getGranteePrincipalArn() != null && other.getGranteePrincipalArn().equals(this.getGranteePrincipalArn()) == false)
            return false;
        if (other.getHomeRegion() == null ^ this.getHomeRegion() == null)
            return false;
        if (other.getHomeRegion() != null && other.getHomeRegion().equals(this.getHomeRegion()) == false)
            return false;
        if (other.getGrantStatus() == null ^ this.getGrantStatus() == null)
            return false;
        if (other.getGrantStatus() != null && other.getGrantStatus().equals(this.getGrantStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getGrantedOperations() == null ^ this.getGrantedOperations() == null)
            return false;
        if (other.getGrantedOperations() != null && other.getGrantedOperations().equals(this.getGrantedOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrantArn() == null) ? 0 : getGrantArn().hashCode());
        hashCode = prime * hashCode + ((getGrantName() == null) ? 0 : getGrantName().hashCode());
        hashCode = prime * hashCode + ((getParentArn() == null) ? 0 : getParentArn().hashCode());
        hashCode = prime * hashCode + ((getLicenseArn() == null) ? 0 : getLicenseArn().hashCode());
        hashCode = prime * hashCode + ((getGranteePrincipalArn() == null) ? 0 : getGranteePrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getHomeRegion() == null) ? 0 : getHomeRegion().hashCode());
        hashCode = prime * hashCode + ((getGrantStatus() == null) ? 0 : getGrantStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getGrantedOperations() == null) ? 0 : getGrantedOperations().hashCode());
        return hashCode;
    }

    @Override
    public Grant clone() {
        try {
            return (Grant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.GrantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
