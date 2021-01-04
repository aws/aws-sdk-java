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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLicenseVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * License issuer.
     * </p>
     */
    private Issuer issuer;
    /**
     * <p>
     * Home Region of the license.
     * </p>
     */
    private String homeRegion;
    /**
     * <p>
     * Date and time range during which the license is valid, in ISO8601-UTC format.
     * </p>
     */
    private DatetimeRange validity;
    /**
     * <p>
     * Information about the license.
     * </p>
     */
    private java.util.List<Metadata> licenseMetadata;
    /**
     * <p>
     * License entitlements.
     * </p>
     */
    private java.util.List<Entitlement> entitlements;
    /**
     * <p>
     * Configuration for consumption of the license. Choose a provisional configuration for workloads running with
     * continuous connectivity. Choose a borrow configuration for workloads with offline usage.
     * </p>
     */
    private ConsumptionConfiguration consumptionConfiguration;
    /**
     * <p>
     * License status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Current version of the license.
     * </p>
     */
    private String sourceVersion;

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

    public CreateLicenseVersionRequest withLicenseArn(String licenseArn) {
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

    public CreateLicenseVersionRequest withLicenseName(String licenseName) {
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

    public CreateLicenseVersionRequest withProductName(String productName) {
        setProductName(productName);
        return this;
    }

    /**
     * <p>
     * License issuer.
     * </p>
     * 
     * @param issuer
     *        License issuer.
     */

    public void setIssuer(Issuer issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * License issuer.
     * </p>
     * 
     * @return License issuer.
     */

    public Issuer getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * License issuer.
     * </p>
     * 
     * @param issuer
     *        License issuer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseVersionRequest withIssuer(Issuer issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * Home Region of the license.
     * </p>
     * 
     * @param homeRegion
     *        Home Region of the license.
     */

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    /**
     * <p>
     * Home Region of the license.
     * </p>
     * 
     * @return Home Region of the license.
     */

    public String getHomeRegion() {
        return this.homeRegion;
    }

    /**
     * <p>
     * Home Region of the license.
     * </p>
     * 
     * @param homeRegion
     *        Home Region of the license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseVersionRequest withHomeRegion(String homeRegion) {
        setHomeRegion(homeRegion);
        return this;
    }

    /**
     * <p>
     * Date and time range during which the license is valid, in ISO8601-UTC format.
     * </p>
     * 
     * @param validity
     *        Date and time range during which the license is valid, in ISO8601-UTC format.
     */

    public void setValidity(DatetimeRange validity) {
        this.validity = validity;
    }

    /**
     * <p>
     * Date and time range during which the license is valid, in ISO8601-UTC format.
     * </p>
     * 
     * @return Date and time range during which the license is valid, in ISO8601-UTC format.
     */

    public DatetimeRange getValidity() {
        return this.validity;
    }

    /**
     * <p>
     * Date and time range during which the license is valid, in ISO8601-UTC format.
     * </p>
     * 
     * @param validity
     *        Date and time range during which the license is valid, in ISO8601-UTC format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseVersionRequest withValidity(DatetimeRange validity) {
        setValidity(validity);
        return this;
    }

    /**
     * <p>
     * Information about the license.
     * </p>
     * 
     * @return Information about the license.
     */

    public java.util.List<Metadata> getLicenseMetadata() {
        return licenseMetadata;
    }

    /**
     * <p>
     * Information about the license.
     * </p>
     * 
     * @param licenseMetadata
     *        Information about the license.
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
     * Information about the license.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseMetadata(java.util.Collection)} or {@link #withLicenseMetadata(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param licenseMetadata
     *        Information about the license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseVersionRequest withLicenseMetadata(Metadata... licenseMetadata) {
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
     * Information about the license.
     * </p>
     * 
     * @param licenseMetadata
     *        Information about the license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseVersionRequest withLicenseMetadata(java.util.Collection<Metadata> licenseMetadata) {
        setLicenseMetadata(licenseMetadata);
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

    public CreateLicenseVersionRequest withEntitlements(Entitlement... entitlements) {
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

    public CreateLicenseVersionRequest withEntitlements(java.util.Collection<Entitlement> entitlements) {
        setEntitlements(entitlements);
        return this;
    }

    /**
     * <p>
     * Configuration for consumption of the license. Choose a provisional configuration for workloads running with
     * continuous connectivity. Choose a borrow configuration for workloads with offline usage.
     * </p>
     * 
     * @param consumptionConfiguration
     *        Configuration for consumption of the license. Choose a provisional configuration for workloads running
     *        with continuous connectivity. Choose a borrow configuration for workloads with offline usage.
     */

    public void setConsumptionConfiguration(ConsumptionConfiguration consumptionConfiguration) {
        this.consumptionConfiguration = consumptionConfiguration;
    }

    /**
     * <p>
     * Configuration for consumption of the license. Choose a provisional configuration for workloads running with
     * continuous connectivity. Choose a borrow configuration for workloads with offline usage.
     * </p>
     * 
     * @return Configuration for consumption of the license. Choose a provisional configuration for workloads running
     *         with continuous connectivity. Choose a borrow configuration for workloads with offline usage.
     */

    public ConsumptionConfiguration getConsumptionConfiguration() {
        return this.consumptionConfiguration;
    }

    /**
     * <p>
     * Configuration for consumption of the license. Choose a provisional configuration for workloads running with
     * continuous connectivity. Choose a borrow configuration for workloads with offline usage.
     * </p>
     * 
     * @param consumptionConfiguration
     *        Configuration for consumption of the license. Choose a provisional configuration for workloads running
     *        with continuous connectivity. Choose a borrow configuration for workloads with offline usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseVersionRequest withConsumptionConfiguration(ConsumptionConfiguration consumptionConfiguration) {
        setConsumptionConfiguration(consumptionConfiguration);
        return this;
    }

    /**
     * <p>
     * License status.
     * </p>
     * 
     * @param status
     *        License status.
     * @see LicenseStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * License status.
     * </p>
     * 
     * @return License status.
     * @see LicenseStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * License status.
     * </p>
     * 
     * @param status
     *        License status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseStatus
     */

    public CreateLicenseVersionRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * License status.
     * </p>
     * 
     * @param status
     *        License status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseStatus
     */

    public CreateLicenseVersionRequest withStatus(LicenseStatus status) {
        this.status = status.toString();
        return this;
    }

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

    public CreateLicenseVersionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Current version of the license.
     * </p>
     * 
     * @param sourceVersion
     *        Current version of the license.
     */

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * Current version of the license.
     * </p>
     * 
     * @return Current version of the license.
     */

    public String getSourceVersion() {
        return this.sourceVersion;
    }

    /**
     * <p>
     * Current version of the license.
     * </p>
     * 
     * @param sourceVersion
     *        Current version of the license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseVersionRequest withSourceVersion(String sourceVersion) {
        setSourceVersion(sourceVersion);
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
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer()).append(",");
        if (getHomeRegion() != null)
            sb.append("HomeRegion: ").append(getHomeRegion()).append(",");
        if (getValidity() != null)
            sb.append("Validity: ").append(getValidity()).append(",");
        if (getLicenseMetadata() != null)
            sb.append("LicenseMetadata: ").append(getLicenseMetadata()).append(",");
        if (getEntitlements() != null)
            sb.append("Entitlements: ").append(getEntitlements()).append(",");
        if (getConsumptionConfiguration() != null)
            sb.append("ConsumptionConfiguration: ").append(getConsumptionConfiguration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getSourceVersion() != null)
            sb.append("SourceVersion: ").append(getSourceVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLicenseVersionRequest == false)
            return false;
        CreateLicenseVersionRequest other = (CreateLicenseVersionRequest) obj;
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
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getHomeRegion() == null ^ this.getHomeRegion() == null)
            return false;
        if (other.getHomeRegion() != null && other.getHomeRegion().equals(this.getHomeRegion()) == false)
            return false;
        if (other.getValidity() == null ^ this.getValidity() == null)
            return false;
        if (other.getValidity() != null && other.getValidity().equals(this.getValidity()) == false)
            return false;
        if (other.getLicenseMetadata() == null ^ this.getLicenseMetadata() == null)
            return false;
        if (other.getLicenseMetadata() != null && other.getLicenseMetadata().equals(this.getLicenseMetadata()) == false)
            return false;
        if (other.getEntitlements() == null ^ this.getEntitlements() == null)
            return false;
        if (other.getEntitlements() != null && other.getEntitlements().equals(this.getEntitlements()) == false)
            return false;
        if (other.getConsumptionConfiguration() == null ^ this.getConsumptionConfiguration() == null)
            return false;
        if (other.getConsumptionConfiguration() != null && other.getConsumptionConfiguration().equals(this.getConsumptionConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null && other.getSourceVersion().equals(this.getSourceVersion()) == false)
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
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getHomeRegion() == null) ? 0 : getHomeRegion().hashCode());
        hashCode = prime * hashCode + ((getValidity() == null) ? 0 : getValidity().hashCode());
        hashCode = prime * hashCode + ((getLicenseMetadata() == null) ? 0 : getLicenseMetadata().hashCode());
        hashCode = prime * hashCode + ((getEntitlements() == null) ? 0 : getEntitlements().hashCode());
        hashCode = prime * hashCode + ((getConsumptionConfiguration() == null) ? 0 : getConsumptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateLicenseVersionRequest clone() {
        return (CreateLicenseVersionRequest) super.clone();
    }

}
