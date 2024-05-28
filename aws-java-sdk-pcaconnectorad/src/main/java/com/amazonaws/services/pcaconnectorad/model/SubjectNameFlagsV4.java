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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information to include in the subject name and alternate subject name of the certificate. The subject name can be
 * common name, directory path, DNS as common name, or left blank. You can optionally include email to the subject name
 * for user templates. If you leave the subject name blank then you must set a subject alternate name. The subject
 * alternate name (SAN) can include globally unique identifier (GUID), DNS, domain DNS, email, service principal name
 * (SPN), and user principal name (UPN). You can leave the SAN blank. If you leave the SAN blank, then you must set a
 * subject name.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/SubjectNameFlagsV4"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubjectNameFlagsV4 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Include the common name in the subject name.
     * </p>
     */
    private Boolean requireCommonName;
    /**
     * <p>
     * Include the directory path in the subject name.
     * </p>
     */
    private Boolean requireDirectoryPath;
    /**
     * <p>
     * Include the DNS as common name in the subject name.
     * </p>
     */
    private Boolean requireDnsAsCn;
    /**
     * <p>
     * Include the subject's email in the subject name.
     * </p>
     */
    private Boolean requireEmail;
    /**
     * <p>
     * Include the globally unique identifier (GUID) in the subject alternate name.
     * </p>
     */
    private Boolean sanRequireDirectoryGuid;
    /**
     * <p>
     * Include the DNS in the subject alternate name.
     * </p>
     */
    private Boolean sanRequireDns;
    /**
     * <p>
     * Include the domain DNS in the subject alternate name.
     * </p>
     */
    private Boolean sanRequireDomainDns;
    /**
     * <p>
     * Include the subject's email in the subject alternate name.
     * </p>
     */
    private Boolean sanRequireEmail;
    /**
     * <p>
     * Include the service principal name (SPN) in the subject alternate name.
     * </p>
     */
    private Boolean sanRequireSpn;
    /**
     * <p>
     * Include the user principal name (UPN) in the subject alternate name.
     * </p>
     */
    private Boolean sanRequireUpn;

    /**
     * <p>
     * Include the common name in the subject name.
     * </p>
     * 
     * @param requireCommonName
     *        Include the common name in the subject name.
     */

    public void setRequireCommonName(Boolean requireCommonName) {
        this.requireCommonName = requireCommonName;
    }

    /**
     * <p>
     * Include the common name in the subject name.
     * </p>
     * 
     * @return Include the common name in the subject name.
     */

    public Boolean getRequireCommonName() {
        return this.requireCommonName;
    }

    /**
     * <p>
     * Include the common name in the subject name.
     * </p>
     * 
     * @param requireCommonName
     *        Include the common name in the subject name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectNameFlagsV4 withRequireCommonName(Boolean requireCommonName) {
        setRequireCommonName(requireCommonName);
        return this;
    }

    /**
     * <p>
     * Include the common name in the subject name.
     * </p>
     * 
     * @return Include the common name in the subject name.
     */

    public Boolean isRequireCommonName() {
        return this.requireCommonName;
    }

    /**
     * <p>
     * Include the directory path in the subject name.
     * </p>
     * 
     * @param requireDirectoryPath
     *        Include the directory path in the subject name.
     */

    public void setRequireDirectoryPath(Boolean requireDirectoryPath) {
        this.requireDirectoryPath = requireDirectoryPath;
    }

    /**
     * <p>
     * Include the directory path in the subject name.
     * </p>
     * 
     * @return Include the directory path in the subject name.
     */

    public Boolean getRequireDirectoryPath() {
        return this.requireDirectoryPath;
    }

    /**
     * <p>
     * Include the directory path in the subject name.
     * </p>
     * 
     * @param requireDirectoryPath
     *        Include the directory path in the subject name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectNameFlagsV4 withRequireDirectoryPath(Boolean requireDirectoryPath) {
        setRequireDirectoryPath(requireDirectoryPath);
        return this;
    }

    /**
     * <p>
     * Include the directory path in the subject name.
     * </p>
     * 
     * @return Include the directory path in the subject name.
     */

    public Boolean isRequireDirectoryPath() {
        return this.requireDirectoryPath;
    }

    /**
     * <p>
     * Include the DNS as common name in the subject name.
     * </p>
     * 
     * @param requireDnsAsCn
     *        Include the DNS as common name in the subject name.
     */

    public void setRequireDnsAsCn(Boolean requireDnsAsCn) {
        this.requireDnsAsCn = requireDnsAsCn;
    }

    /**
     * <p>
     * Include the DNS as common name in the subject name.
     * </p>
     * 
     * @return Include the DNS as common name in the subject name.
     */

    public Boolean getRequireDnsAsCn() {
        return this.requireDnsAsCn;
    }

    /**
     * <p>
     * Include the DNS as common name in the subject name.
     * </p>
     * 
     * @param requireDnsAsCn
     *        Include the DNS as common name in the subject name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectNameFlagsV4 withRequireDnsAsCn(Boolean requireDnsAsCn) {
        setRequireDnsAsCn(requireDnsAsCn);
        return this;
    }

    /**
     * <p>
     * Include the DNS as common name in the subject name.
     * </p>
     * 
     * @return Include the DNS as common name in the subject name.
     */

    public Boolean isRequireDnsAsCn() {
        return this.requireDnsAsCn;
    }

    /**
     * <p>
     * Include the subject's email in the subject name.
     * </p>
     * 
     * @param requireEmail
     *        Include the subject's email in the subject name.
     */

    public void setRequireEmail(Boolean requireEmail) {
        this.requireEmail = requireEmail;
    }

    /**
     * <p>
     * Include the subject's email in the subject name.
     * </p>
     * 
     * @return Include the subject's email in the subject name.
     */

    public Boolean getRequireEmail() {
        return this.requireEmail;
    }

    /**
     * <p>
     * Include the subject's email in the subject name.
     * </p>
     * 
     * @param requireEmail
     *        Include the subject's email in the subject name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectNameFlagsV4 withRequireEmail(Boolean requireEmail) {
        setRequireEmail(requireEmail);
        return this;
    }

    /**
     * <p>
     * Include the subject's email in the subject name.
     * </p>
     * 
     * @return Include the subject's email in the subject name.
     */

    public Boolean isRequireEmail() {
        return this.requireEmail;
    }

    /**
     * <p>
     * Include the globally unique identifier (GUID) in the subject alternate name.
     * </p>
     * 
     * @param sanRequireDirectoryGuid
     *        Include the globally unique identifier (GUID) in the subject alternate name.
     */

    public void setSanRequireDirectoryGuid(Boolean sanRequireDirectoryGuid) {
        this.sanRequireDirectoryGuid = sanRequireDirectoryGuid;
    }

    /**
     * <p>
     * Include the globally unique identifier (GUID) in the subject alternate name.
     * </p>
     * 
     * @return Include the globally unique identifier (GUID) in the subject alternate name.
     */

    public Boolean getSanRequireDirectoryGuid() {
        return this.sanRequireDirectoryGuid;
    }

    /**
     * <p>
     * Include the globally unique identifier (GUID) in the subject alternate name.
     * </p>
     * 
     * @param sanRequireDirectoryGuid
     *        Include the globally unique identifier (GUID) in the subject alternate name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectNameFlagsV4 withSanRequireDirectoryGuid(Boolean sanRequireDirectoryGuid) {
        setSanRequireDirectoryGuid(sanRequireDirectoryGuid);
        return this;
    }

    /**
     * <p>
     * Include the globally unique identifier (GUID) in the subject alternate name.
     * </p>
     * 
     * @return Include the globally unique identifier (GUID) in the subject alternate name.
     */

    public Boolean isSanRequireDirectoryGuid() {
        return this.sanRequireDirectoryGuid;
    }

    /**
     * <p>
     * Include the DNS in the subject alternate name.
     * </p>
     * 
     * @param sanRequireDns
     *        Include the DNS in the subject alternate name.
     */

    public void setSanRequireDns(Boolean sanRequireDns) {
        this.sanRequireDns = sanRequireDns;
    }

    /**
     * <p>
     * Include the DNS in the subject alternate name.
     * </p>
     * 
     * @return Include the DNS in the subject alternate name.
     */

    public Boolean getSanRequireDns() {
        return this.sanRequireDns;
    }

    /**
     * <p>
     * Include the DNS in the subject alternate name.
     * </p>
     * 
     * @param sanRequireDns
     *        Include the DNS in the subject alternate name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectNameFlagsV4 withSanRequireDns(Boolean sanRequireDns) {
        setSanRequireDns(sanRequireDns);
        return this;
    }

    /**
     * <p>
     * Include the DNS in the subject alternate name.
     * </p>
     * 
     * @return Include the DNS in the subject alternate name.
     */

    public Boolean isSanRequireDns() {
        return this.sanRequireDns;
    }

    /**
     * <p>
     * Include the domain DNS in the subject alternate name.
     * </p>
     * 
     * @param sanRequireDomainDns
     *        Include the domain DNS in the subject alternate name.
     */

    public void setSanRequireDomainDns(Boolean sanRequireDomainDns) {
        this.sanRequireDomainDns = sanRequireDomainDns;
    }

    /**
     * <p>
     * Include the domain DNS in the subject alternate name.
     * </p>
     * 
     * @return Include the domain DNS in the subject alternate name.
     */

    public Boolean getSanRequireDomainDns() {
        return this.sanRequireDomainDns;
    }

    /**
     * <p>
     * Include the domain DNS in the subject alternate name.
     * </p>
     * 
     * @param sanRequireDomainDns
     *        Include the domain DNS in the subject alternate name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectNameFlagsV4 withSanRequireDomainDns(Boolean sanRequireDomainDns) {
        setSanRequireDomainDns(sanRequireDomainDns);
        return this;
    }

    /**
     * <p>
     * Include the domain DNS in the subject alternate name.
     * </p>
     * 
     * @return Include the domain DNS in the subject alternate name.
     */

    public Boolean isSanRequireDomainDns() {
        return this.sanRequireDomainDns;
    }

    /**
     * <p>
     * Include the subject's email in the subject alternate name.
     * </p>
     * 
     * @param sanRequireEmail
     *        Include the subject's email in the subject alternate name.
     */

    public void setSanRequireEmail(Boolean sanRequireEmail) {
        this.sanRequireEmail = sanRequireEmail;
    }

    /**
     * <p>
     * Include the subject's email in the subject alternate name.
     * </p>
     * 
     * @return Include the subject's email in the subject alternate name.
     */

    public Boolean getSanRequireEmail() {
        return this.sanRequireEmail;
    }

    /**
     * <p>
     * Include the subject's email in the subject alternate name.
     * </p>
     * 
     * @param sanRequireEmail
     *        Include the subject's email in the subject alternate name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectNameFlagsV4 withSanRequireEmail(Boolean sanRequireEmail) {
        setSanRequireEmail(sanRequireEmail);
        return this;
    }

    /**
     * <p>
     * Include the subject's email in the subject alternate name.
     * </p>
     * 
     * @return Include the subject's email in the subject alternate name.
     */

    public Boolean isSanRequireEmail() {
        return this.sanRequireEmail;
    }

    /**
     * <p>
     * Include the service principal name (SPN) in the subject alternate name.
     * </p>
     * 
     * @param sanRequireSpn
     *        Include the service principal name (SPN) in the subject alternate name.
     */

    public void setSanRequireSpn(Boolean sanRequireSpn) {
        this.sanRequireSpn = sanRequireSpn;
    }

    /**
     * <p>
     * Include the service principal name (SPN) in the subject alternate name.
     * </p>
     * 
     * @return Include the service principal name (SPN) in the subject alternate name.
     */

    public Boolean getSanRequireSpn() {
        return this.sanRequireSpn;
    }

    /**
     * <p>
     * Include the service principal name (SPN) in the subject alternate name.
     * </p>
     * 
     * @param sanRequireSpn
     *        Include the service principal name (SPN) in the subject alternate name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectNameFlagsV4 withSanRequireSpn(Boolean sanRequireSpn) {
        setSanRequireSpn(sanRequireSpn);
        return this;
    }

    /**
     * <p>
     * Include the service principal name (SPN) in the subject alternate name.
     * </p>
     * 
     * @return Include the service principal name (SPN) in the subject alternate name.
     */

    public Boolean isSanRequireSpn() {
        return this.sanRequireSpn;
    }

    /**
     * <p>
     * Include the user principal name (UPN) in the subject alternate name.
     * </p>
     * 
     * @param sanRequireUpn
     *        Include the user principal name (UPN) in the subject alternate name.
     */

    public void setSanRequireUpn(Boolean sanRequireUpn) {
        this.sanRequireUpn = sanRequireUpn;
    }

    /**
     * <p>
     * Include the user principal name (UPN) in the subject alternate name.
     * </p>
     * 
     * @return Include the user principal name (UPN) in the subject alternate name.
     */

    public Boolean getSanRequireUpn() {
        return this.sanRequireUpn;
    }

    /**
     * <p>
     * Include the user principal name (UPN) in the subject alternate name.
     * </p>
     * 
     * @param sanRequireUpn
     *        Include the user principal name (UPN) in the subject alternate name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectNameFlagsV4 withSanRequireUpn(Boolean sanRequireUpn) {
        setSanRequireUpn(sanRequireUpn);
        return this;
    }

    /**
     * <p>
     * Include the user principal name (UPN) in the subject alternate name.
     * </p>
     * 
     * @return Include the user principal name (UPN) in the subject alternate name.
     */

    public Boolean isSanRequireUpn() {
        return this.sanRequireUpn;
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
        if (getRequireCommonName() != null)
            sb.append("RequireCommonName: ").append(getRequireCommonName()).append(",");
        if (getRequireDirectoryPath() != null)
            sb.append("RequireDirectoryPath: ").append(getRequireDirectoryPath()).append(",");
        if (getRequireDnsAsCn() != null)
            sb.append("RequireDnsAsCn: ").append(getRequireDnsAsCn()).append(",");
        if (getRequireEmail() != null)
            sb.append("RequireEmail: ").append(getRequireEmail()).append(",");
        if (getSanRequireDirectoryGuid() != null)
            sb.append("SanRequireDirectoryGuid: ").append(getSanRequireDirectoryGuid()).append(",");
        if (getSanRequireDns() != null)
            sb.append("SanRequireDns: ").append(getSanRequireDns()).append(",");
        if (getSanRequireDomainDns() != null)
            sb.append("SanRequireDomainDns: ").append(getSanRequireDomainDns()).append(",");
        if (getSanRequireEmail() != null)
            sb.append("SanRequireEmail: ").append(getSanRequireEmail()).append(",");
        if (getSanRequireSpn() != null)
            sb.append("SanRequireSpn: ").append(getSanRequireSpn()).append(",");
        if (getSanRequireUpn() != null)
            sb.append("SanRequireUpn: ").append(getSanRequireUpn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubjectNameFlagsV4 == false)
            return false;
        SubjectNameFlagsV4 other = (SubjectNameFlagsV4) obj;
        if (other.getRequireCommonName() == null ^ this.getRequireCommonName() == null)
            return false;
        if (other.getRequireCommonName() != null && other.getRequireCommonName().equals(this.getRequireCommonName()) == false)
            return false;
        if (other.getRequireDirectoryPath() == null ^ this.getRequireDirectoryPath() == null)
            return false;
        if (other.getRequireDirectoryPath() != null && other.getRequireDirectoryPath().equals(this.getRequireDirectoryPath()) == false)
            return false;
        if (other.getRequireDnsAsCn() == null ^ this.getRequireDnsAsCn() == null)
            return false;
        if (other.getRequireDnsAsCn() != null && other.getRequireDnsAsCn().equals(this.getRequireDnsAsCn()) == false)
            return false;
        if (other.getRequireEmail() == null ^ this.getRequireEmail() == null)
            return false;
        if (other.getRequireEmail() != null && other.getRequireEmail().equals(this.getRequireEmail()) == false)
            return false;
        if (other.getSanRequireDirectoryGuid() == null ^ this.getSanRequireDirectoryGuid() == null)
            return false;
        if (other.getSanRequireDirectoryGuid() != null && other.getSanRequireDirectoryGuid().equals(this.getSanRequireDirectoryGuid()) == false)
            return false;
        if (other.getSanRequireDns() == null ^ this.getSanRequireDns() == null)
            return false;
        if (other.getSanRequireDns() != null && other.getSanRequireDns().equals(this.getSanRequireDns()) == false)
            return false;
        if (other.getSanRequireDomainDns() == null ^ this.getSanRequireDomainDns() == null)
            return false;
        if (other.getSanRequireDomainDns() != null && other.getSanRequireDomainDns().equals(this.getSanRequireDomainDns()) == false)
            return false;
        if (other.getSanRequireEmail() == null ^ this.getSanRequireEmail() == null)
            return false;
        if (other.getSanRequireEmail() != null && other.getSanRequireEmail().equals(this.getSanRequireEmail()) == false)
            return false;
        if (other.getSanRequireSpn() == null ^ this.getSanRequireSpn() == null)
            return false;
        if (other.getSanRequireSpn() != null && other.getSanRequireSpn().equals(this.getSanRequireSpn()) == false)
            return false;
        if (other.getSanRequireUpn() == null ^ this.getSanRequireUpn() == null)
            return false;
        if (other.getSanRequireUpn() != null && other.getSanRequireUpn().equals(this.getSanRequireUpn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequireCommonName() == null) ? 0 : getRequireCommonName().hashCode());
        hashCode = prime * hashCode + ((getRequireDirectoryPath() == null) ? 0 : getRequireDirectoryPath().hashCode());
        hashCode = prime * hashCode + ((getRequireDnsAsCn() == null) ? 0 : getRequireDnsAsCn().hashCode());
        hashCode = prime * hashCode + ((getRequireEmail() == null) ? 0 : getRequireEmail().hashCode());
        hashCode = prime * hashCode + ((getSanRequireDirectoryGuid() == null) ? 0 : getSanRequireDirectoryGuid().hashCode());
        hashCode = prime * hashCode + ((getSanRequireDns() == null) ? 0 : getSanRequireDns().hashCode());
        hashCode = prime * hashCode + ((getSanRequireDomainDns() == null) ? 0 : getSanRequireDomainDns().hashCode());
        hashCode = prime * hashCode + ((getSanRequireEmail() == null) ? 0 : getSanRequireEmail().hashCode());
        hashCode = prime * hashCode + ((getSanRequireSpn() == null) ? 0 : getSanRequireSpn().hashCode());
        hashCode = prime * hashCode + ((getSanRequireUpn() == null) ? 0 : getSanRequireUpn().hashCode());
        return hashCode;
    }

    @Override
    public SubjectNameFlagsV4 clone() {
        try {
            return (SubjectNameFlagsV4) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.SubjectNameFlagsV4Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
