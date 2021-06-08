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
 * Describes a license that is granted to a grantee.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GrantedLicense" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrantedLicense implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the license.
     * </p>
     */
    private String licenseArn;
    /**
     * <p>
     * License name.
     * </p>
     */
    private String licenseName;
    /**
     * <p>
     * Product name.
     * </p>
     */
    private String productName;
    /**
     * <p>
     * Product SKU.
     * </p>
     */
    private String productSKU;
    /**
     * <p>
     * Granted license issuer.
     * </p>
     */
    private IssuerDetails issuer;
    /**
     * <p>
     * Home Region of the granted license.
     * </p>
     */
    private String homeRegion;
    /**
     * <p>
     * Granted license status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Date and time range during which the granted license is valid, in ISO8601-UTC format.
     * </p>
     */
    private DatetimeRange validity;
    /**
     * <p>
     * Granted license beneficiary.
     * </p>
     */
    private String beneficiary;
    /**
     * <p>
     * License entitlements.
     * </p>
     */
    private java.util.List<Entitlement> entitlements;
    /**
     * <p>
     * Configuration for consumption of the license.
     * </p>
     */
    private ConsumptionConfiguration consumptionConfiguration;
    /**
     * <p>
     * Granted license metadata.
     * </p>
     */
    private java.util.List<Metadata> licenseMetadata;
    /**
     * <p>
     * Creation time of the granted license.
     * </p>
     */
    private String createTime;
    /**
     * <p>
     * Version of the granted license.
     * </p>
     */
    private String version;
    /**
     * <p>
     * Granted license received metadata.
     * </p>
     */
    private ReceivedMetadata receivedMetadata;

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

    public GrantedLicense withLicenseArn(String licenseArn) {
        setLicenseArn(licenseArn);
        return this;
    }

    /**
     * <p>
     * License name.
     * </p>
     * 
     * @param licenseName
     *        License name.
     */

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    /**
     * <p>
     * License name.
     * </p>
     * 
     * @return License name.
     */

    public String getLicenseName() {
        return this.licenseName;
    }

    /**
     * <p>
     * License name.
     * </p>
     * 
     * @param licenseName
     *        License name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedLicense withLicenseName(String licenseName) {
        setLicenseName(licenseName);
        return this;
    }

    /**
     * <p>
     * Product name.
     * </p>
     * 
     * @param productName
     *        Product name.
     */

    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * <p>
     * Product name.
     * </p>
     * 
     * @return Product name.
     */

    public String getProductName() {
        return this.productName;
    }

    /**
     * <p>
     * Product name.
     * </p>
     * 
     * @param productName
     *        Product name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedLicense withProductName(String productName) {
        setProductName(productName);
        return this;
    }

    /**
     * <p>
     * Product SKU.
     * </p>
     * 
     * @param productSKU
     *        Product SKU.
     */

    public void setProductSKU(String productSKU) {
        this.productSKU = productSKU;
    }

    /**
     * <p>
     * Product SKU.
     * </p>
     * 
     * @return Product SKU.
     */

    public String getProductSKU() {
        return this.productSKU;
    }

    /**
     * <p>
     * Product SKU.
     * </p>
     * 
     * @param productSKU
     *        Product SKU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedLicense withProductSKU(String productSKU) {
        setProductSKU(productSKU);
        return this;
    }

    /**
     * <p>
     * Granted license issuer.
     * </p>
     * 
     * @param issuer
     *        Granted license issuer.
     */

    public void setIssuer(IssuerDetails issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * Granted license issuer.
     * </p>
     * 
     * @return Granted license issuer.
     */

    public IssuerDetails getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * Granted license issuer.
     * </p>
     * 
     * @param issuer
     *        Granted license issuer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedLicense withIssuer(IssuerDetails issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * Home Region of the granted license.
     * </p>
     * 
     * @param homeRegion
     *        Home Region of the granted license.
     */

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    /**
     * <p>
     * Home Region of the granted license.
     * </p>
     * 
     * @return Home Region of the granted license.
     */

    public String getHomeRegion() {
        return this.homeRegion;
    }

    /**
     * <p>
     * Home Region of the granted license.
     * </p>
     * 
     * @param homeRegion
     *        Home Region of the granted license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedLicense withHomeRegion(String homeRegion) {
        setHomeRegion(homeRegion);
        return this;
    }

    /**
     * <p>
     * Granted license status.
     * </p>
     * 
     * @param status
     *        Granted license status.
     * @see LicenseStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Granted license status.
     * </p>
     * 
     * @return Granted license status.
     * @see LicenseStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Granted license status.
     * </p>
     * 
     * @param status
     *        Granted license status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseStatus
     */

    public GrantedLicense withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Granted license status.
     * </p>
     * 
     * @param status
     *        Granted license status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseStatus
     */

    public GrantedLicense withStatus(LicenseStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Date and time range during which the granted license is valid, in ISO8601-UTC format.
     * </p>
     * 
     * @param validity
     *        Date and time range during which the granted license is valid, in ISO8601-UTC format.
     */

    public void setValidity(DatetimeRange validity) {
        this.validity = validity;
    }

    /**
     * <p>
     * Date and time range during which the granted license is valid, in ISO8601-UTC format.
     * </p>
     * 
     * @return Date and time range during which the granted license is valid, in ISO8601-UTC format.
     */

    public DatetimeRange getValidity() {
        return this.validity;
    }

    /**
     * <p>
     * Date and time range during which the granted license is valid, in ISO8601-UTC format.
     * </p>
     * 
     * @param validity
     *        Date and time range during which the granted license is valid, in ISO8601-UTC format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedLicense withValidity(DatetimeRange validity) {
        setValidity(validity);
        return this;
    }

    /**
     * <p>
     * Granted license beneficiary.
     * </p>
     * 
     * @param beneficiary
     *        Granted license beneficiary.
     */

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    /**
     * <p>
     * Granted license beneficiary.
     * </p>
     * 
     * @return Granted license beneficiary.
     */

    public String getBeneficiary() {
        return this.beneficiary;
    }

    /**
     * <p>
     * Granted license beneficiary.
     * </p>
     * 
     * @param beneficiary
     *        Granted license beneficiary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedLicense withBeneficiary(String beneficiary) {
        setBeneficiary(beneficiary);
        return this;
    }

    /**
     * <p>
     * License entitlements.
     * </p>
     * 
     * @return License entitlements.
     */

    public java.util.List<Entitlement> getEntitlements() {
        return entitlements;
    }

    /**
     * <p>
     * License entitlements.
     * </p>
     * 
     * @param entitlements
     *        License entitlements.
     */

    public void setEntitlements(java.util.Collection<Entitlement> entitlements) {
        if (entitlements == null) {
            this.entitlements = null;
            return;
        }

        this.entitlements = new java.util.ArrayList<Entitlement>(entitlements);
    }

    /**
     * <p>
     * License entitlements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntitlements(java.util.Collection)} or {@link #withEntitlements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entitlements
     *        License entitlements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedLicense withEntitlements(Entitlement... entitlements) {
        if (this.entitlements == null) {
            setEntitlements(new java.util.ArrayList<Entitlement>(entitlements.length));
        }
        for (Entitlement ele : entitlements) {
            this.entitlements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * License entitlements.
     * </p>
     * 
     * @param entitlements
     *        License entitlements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedLicense withEntitlements(java.util.Collection<Entitlement> entitlements) {
        setEntitlements(entitlements);
        return this;
    }

    /**
     * <p>
     * Configuration for consumption of the license.
     * </p>
     * 
     * @param consumptionConfiguration
     *        Configuration for consumption of the license.
     */

    public void setConsumptionConfiguration(ConsumptionConfiguration consumptionConfiguration) {
        this.consumptionConfiguration = consumptionConfiguration;
    }

    /**
     * <p>
     * Configuration for consumption of the license.
     * </p>
     * 
     * @return Configuration for consumption of the license.
     */

    public ConsumptionConfiguration getConsumptionConfiguration() {
        return this.consumptionConfiguration;
    }

    /**
     * <p>
     * Configuration for consumption of the license.
     * </p>
     * 
     * @param consumptionConfiguration
     *        Configuration for consumption of the license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedLicense withConsumptionConfiguration(ConsumptionConfiguration consumptionConfiguration) {
        setConsumptionConfiguration(consumptionConfiguration);
        return this;
    }

    /**
     * <p>
     * Granted license metadata.
     * </p>
     * 
     * @return Granted license metadata.
     */

    public java.util.List<Metadata> getLicenseMetadata() {
        return licenseMetadata;
    }

    /**
     * <p>
     * Granted license metadata.
     * </p>
     * 
     * @param licenseMetadata
     *        Granted license metadata.
     */

    public void setLicenseMetadata(java.util.Collection<Metadata> licenseMetadata) {
        if (licenseMetadata == null) {
            this.licenseMetadata = null;
            return;
        }

        this.licenseMetadata = new java.util.ArrayList<Metadata>(licenseMetadata);
    }

    /**
     * <p>
     * Granted license metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseMetadata(java.util.Collection)} or {@link #withLicenseMetadata(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param licenseMetadata
     *        Granted license metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedLicense withLicenseMetadata(Metadata... licenseMetadata) {
        if (this.licenseMetadata == null) {
            setLicenseMetadata(new java.util.ArrayList<Metadata>(licenseMetadata.length));
        }
        for (Metadata ele : licenseMetadata) {
            this.licenseMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Granted license metadata.
     * </p>
     * 
     * @param licenseMetadata
     *        Granted license metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedLicense withLicenseMetadata(java.util.Collection<Metadata> licenseMetadata) {
        setLicenseMetadata(licenseMetadata);
        return this;
    }

    /**
     * <p>
     * Creation time of the granted license.
     * </p>
     * 
     * @param createTime
     *        Creation time of the granted license.
     */

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * Creation time of the granted license.
     * </p>
     * 
     * @return Creation time of the granted license.
     */

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * Creation time of the granted license.
     * </p>
     * 
     * @param createTime
     *        Creation time of the granted license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedLicense withCreateTime(String createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * Version of the granted license.
     * </p>
     * 
     * @param version
     *        Version of the granted license.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Version of the granted license.
     * </p>
     * 
     * @return Version of the granted license.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version of the granted license.
     * </p>
     * 
     * @param version
     *        Version of the granted license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedLicense withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Granted license received metadata.
     * </p>
     * 
     * @param receivedMetadata
     *        Granted license received metadata.
     */

    public void setReceivedMetadata(ReceivedMetadata receivedMetadata) {
        this.receivedMetadata = receivedMetadata;
    }

    /**
     * <p>
     * Granted license received metadata.
     * </p>
     * 
     * @return Granted license received metadata.
     */

    public ReceivedMetadata getReceivedMetadata() {
        return this.receivedMetadata;
    }

    /**
     * <p>
     * Granted license received metadata.
     * </p>
     * 
     * @param receivedMetadata
     *        Granted license received metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantedLicense withReceivedMetadata(ReceivedMetadata receivedMetadata) {
        setReceivedMetadata(receivedMetadata);
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
        if (getLicenseArn() != null)
            sb.append("LicenseArn: ").append(getLicenseArn()).append(",");
        if (getLicenseName() != null)
            sb.append("LicenseName: ").append(getLicenseName()).append(",");
        if (getProductName() != null)
            sb.append("ProductName: ").append(getProductName()).append(",");
        if (getProductSKU() != null)
            sb.append("ProductSKU: ").append(getProductSKU()).append(",");
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer()).append(",");
        if (getHomeRegion() != null)
            sb.append("HomeRegion: ").append(getHomeRegion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getValidity() != null)
            sb.append("Validity: ").append(getValidity()).append(",");
        if (getBeneficiary() != null)
            sb.append("Beneficiary: ").append(getBeneficiary()).append(",");
        if (getEntitlements() != null)
            sb.append("Entitlements: ").append(getEntitlements()).append(",");
        if (getConsumptionConfiguration() != null)
            sb.append("ConsumptionConfiguration: ").append(getConsumptionConfiguration()).append(",");
        if (getLicenseMetadata() != null)
            sb.append("LicenseMetadata: ").append(getLicenseMetadata()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getReceivedMetadata() != null)
            sb.append("ReceivedMetadata: ").append(getReceivedMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrantedLicense == false)
            return false;
        GrantedLicense other = (GrantedLicense) obj;
        if (other.getLicenseArn() == null ^ this.getLicenseArn() == null)
            return false;
        if (other.getLicenseArn() != null && other.getLicenseArn().equals(this.getLicenseArn()) == false)
            return false;
        if (other.getLicenseName() == null ^ this.getLicenseName() == null)
            return false;
        if (other.getLicenseName() != null && other.getLicenseName().equals(this.getLicenseName()) == false)
            return false;
        if (other.getProductName() == null ^ this.getProductName() == null)
            return false;
        if (other.getProductName() != null && other.getProductName().equals(this.getProductName()) == false)
            return false;
        if (other.getProductSKU() == null ^ this.getProductSKU() == null)
            return false;
        if (other.getProductSKU() != null && other.getProductSKU().equals(this.getProductSKU()) == false)
            return false;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getHomeRegion() == null ^ this.getHomeRegion() == null)
            return false;
        if (other.getHomeRegion() != null && other.getHomeRegion().equals(this.getHomeRegion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getValidity() == null ^ this.getValidity() == null)
            return false;
        if (other.getValidity() != null && other.getValidity().equals(this.getValidity()) == false)
            return false;
        if (other.getBeneficiary() == null ^ this.getBeneficiary() == null)
            return false;
        if (other.getBeneficiary() != null && other.getBeneficiary().equals(this.getBeneficiary()) == false)
            return false;
        if (other.getEntitlements() == null ^ this.getEntitlements() == null)
            return false;
        if (other.getEntitlements() != null && other.getEntitlements().equals(this.getEntitlements()) == false)
            return false;
        if (other.getConsumptionConfiguration() == null ^ this.getConsumptionConfiguration() == null)
            return false;
        if (other.getConsumptionConfiguration() != null && other.getConsumptionConfiguration().equals(this.getConsumptionConfiguration()) == false)
            return false;
        if (other.getLicenseMetadata() == null ^ this.getLicenseMetadata() == null)
            return false;
        if (other.getLicenseMetadata() != null && other.getLicenseMetadata().equals(this.getLicenseMetadata()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getReceivedMetadata() == null ^ this.getReceivedMetadata() == null)
            return false;
        if (other.getReceivedMetadata() != null && other.getReceivedMetadata().equals(this.getReceivedMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseArn() == null) ? 0 : getLicenseArn().hashCode());
        hashCode = prime * hashCode + ((getLicenseName() == null) ? 0 : getLicenseName().hashCode());
        hashCode = prime * hashCode + ((getProductName() == null) ? 0 : getProductName().hashCode());
        hashCode = prime * hashCode + ((getProductSKU() == null) ? 0 : getProductSKU().hashCode());
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getHomeRegion() == null) ? 0 : getHomeRegion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getValidity() == null) ? 0 : getValidity().hashCode());
        hashCode = prime * hashCode + ((getBeneficiary() == null) ? 0 : getBeneficiary().hashCode());
        hashCode = prime * hashCode + ((getEntitlements() == null) ? 0 : getEntitlements().hashCode());
        hashCode = prime * hashCode + ((getConsumptionConfiguration() == null) ? 0 : getConsumptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLicenseMetadata() == null) ? 0 : getLicenseMetadata().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getReceivedMetadata() == null) ? 0 : getReceivedMetadata().hashCode());
        return hashCode;
    }

    @Override
    public GrantedLicense clone() {
        try {
            return (GrantedLicense) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.GrantedLicenseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
