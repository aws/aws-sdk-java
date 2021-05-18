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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateLicenseManagerReportGenerator"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLicenseManagerReportGeneratorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Number (ARN) of the report generator to update.
     * </p>
     */
    private String licenseManagerReportGeneratorArn;
    /**
     * <p>
     * Name of the report generator.
     * </p>
     */
    private String reportGeneratorName;
    /**
     * <p>
     * Type of reports to generate. The following report types an be generated:
     * </p>
     * <ul>
     * <li>
     * <p>
     * License configuration report - Reports on the number and details of consumed licenses for a license
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Resource report - Reports on the tracked licenses and resource consumption for a license configuration.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> type;
    /**
     * <p>
     * ?
     * </p>
     */
    private ReportContext reportContext;
    /**
     * <p>
     * Frequency by which reports are generated. The following options are avaiable:
     * </p>
     * <p>
     * ??? What are the APi value options?
     * </p>
     */
    private ReportFrequency reportFrequency;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Description of the report generator.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Amazon Resource Number (ARN) of the report generator to update.
     * </p>
     * 
     * @param licenseManagerReportGeneratorArn
     *        Amazon Resource Number (ARN) of the report generator to update.
     */

    public void setLicenseManagerReportGeneratorArn(String licenseManagerReportGeneratorArn) {
        this.licenseManagerReportGeneratorArn = licenseManagerReportGeneratorArn;
    }

    /**
     * <p>
     * Amazon Resource Number (ARN) of the report generator to update.
     * </p>
     * 
     * @return Amazon Resource Number (ARN) of the report generator to update.
     */

    public String getLicenseManagerReportGeneratorArn() {
        return this.licenseManagerReportGeneratorArn;
    }

    /**
     * <p>
     * Amazon Resource Number (ARN) of the report generator to update.
     * </p>
     * 
     * @param licenseManagerReportGeneratorArn
     *        Amazon Resource Number (ARN) of the report generator to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseManagerReportGeneratorRequest withLicenseManagerReportGeneratorArn(String licenseManagerReportGeneratorArn) {
        setLicenseManagerReportGeneratorArn(licenseManagerReportGeneratorArn);
        return this;
    }

    /**
     * <p>
     * Name of the report generator.
     * </p>
     * 
     * @param reportGeneratorName
     *        Name of the report generator.
     */

    public void setReportGeneratorName(String reportGeneratorName) {
        this.reportGeneratorName = reportGeneratorName;
    }

    /**
     * <p>
     * Name of the report generator.
     * </p>
     * 
     * @return Name of the report generator.
     */

    public String getReportGeneratorName() {
        return this.reportGeneratorName;
    }

    /**
     * <p>
     * Name of the report generator.
     * </p>
     * 
     * @param reportGeneratorName
     *        Name of the report generator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseManagerReportGeneratorRequest withReportGeneratorName(String reportGeneratorName) {
        setReportGeneratorName(reportGeneratorName);
        return this;
    }

    /**
     * <p>
     * Type of reports to generate. The following report types an be generated:
     * </p>
     * <ul>
     * <li>
     * <p>
     * License configuration report - Reports on the number and details of consumed licenses for a license
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Resource report - Reports on the tracked licenses and resource consumption for a license configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Type of reports to generate. The following report types an be generated:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         License configuration report - Reports on the number and details of consumed licenses for a license
     *         configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Resource report - Reports on the tracked licenses and resource consumption for a license configuration.
     *         </p>
     *         </li>
     * @see ReportType
     */

    public java.util.List<String> getType() {
        return type;
    }

    /**
     * <p>
     * Type of reports to generate. The following report types an be generated:
     * </p>
     * <ul>
     * <li>
     * <p>
     * License configuration report - Reports on the number and details of consumed licenses for a license
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Resource report - Reports on the tracked licenses and resource consumption for a license configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Type of reports to generate. The following report types an be generated:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        License configuration report - Reports on the number and details of consumed licenses for a license
     *        configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Resource report - Reports on the tracked licenses and resource consumption for a license configuration.
     *        </p>
     *        </li>
     * @see ReportType
     */

    public void setType(java.util.Collection<String> type) {
        if (type == null) {
            this.type = null;
            return;
        }

        this.type = new java.util.ArrayList<String>(type);
    }

    /**
     * <p>
     * Type of reports to generate. The following report types an be generated:
     * </p>
     * <ul>
     * <li>
     * <p>
     * License configuration report - Reports on the number and details of consumed licenses for a license
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Resource report - Reports on the tracked licenses and resource consumption for a license configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setType(java.util.Collection)} or {@link #withType(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param type
     *        Type of reports to generate. The following report types an be generated:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        License configuration report - Reports on the number and details of consumed licenses for a license
     *        configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Resource report - Reports on the tracked licenses and resource consumption for a license configuration.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public UpdateLicenseManagerReportGeneratorRequest withType(String... type) {
        if (this.type == null) {
            setType(new java.util.ArrayList<String>(type.length));
        }
        for (String ele : type) {
            this.type.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Type of reports to generate. The following report types an be generated:
     * </p>
     * <ul>
     * <li>
     * <p>
     * License configuration report - Reports on the number and details of consumed licenses for a license
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Resource report - Reports on the tracked licenses and resource consumption for a license configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Type of reports to generate. The following report types an be generated:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        License configuration report - Reports on the number and details of consumed licenses for a license
     *        configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Resource report - Reports on the tracked licenses and resource consumption for a license configuration.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public UpdateLicenseManagerReportGeneratorRequest withType(java.util.Collection<String> type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of reports to generate. The following report types an be generated:
     * </p>
     * <ul>
     * <li>
     * <p>
     * License configuration report - Reports on the number and details of consumed licenses for a license
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Resource report - Reports on the tracked licenses and resource consumption for a license configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Type of reports to generate. The following report types an be generated:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        License configuration report - Reports on the number and details of consumed licenses for a license
     *        configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Resource report - Reports on the tracked licenses and resource consumption for a license configuration.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportType
     */

    public UpdateLicenseManagerReportGeneratorRequest withType(ReportType... type) {
        java.util.ArrayList<String> typeCopy = new java.util.ArrayList<String>(type.length);
        for (ReportType value : type) {
            typeCopy.add(value.toString());
        }
        if (getType() == null) {
            setType(typeCopy);
        } else {
            getType().addAll(typeCopy);
        }
        return this;
    }

    /**
     * <p>
     * ?
     * </p>
     * 
     * @param reportContext
     *        ?
     */

    public void setReportContext(ReportContext reportContext) {
        this.reportContext = reportContext;
    }

    /**
     * <p>
     * ?
     * </p>
     * 
     * @return ?
     */

    public ReportContext getReportContext() {
        return this.reportContext;
    }

    /**
     * <p>
     * ?
     * </p>
     * 
     * @param reportContext
     *        ?
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseManagerReportGeneratorRequest withReportContext(ReportContext reportContext) {
        setReportContext(reportContext);
        return this;
    }

    /**
     * <p>
     * Frequency by which reports are generated. The following options are avaiable:
     * </p>
     * <p>
     * ??? What are the APi value options?
     * </p>
     * 
     * @param reportFrequency
     *        Frequency by which reports are generated. The following options are avaiable:</p>
     *        <p>
     *        ??? What are the APi value options?
     */

    public void setReportFrequency(ReportFrequency reportFrequency) {
        this.reportFrequency = reportFrequency;
    }

    /**
     * <p>
     * Frequency by which reports are generated. The following options are avaiable:
     * </p>
     * <p>
     * ??? What are the APi value options?
     * </p>
     * 
     * @return Frequency by which reports are generated. The following options are avaiable:</p>
     *         <p>
     *         ??? What are the APi value options?
     */

    public ReportFrequency getReportFrequency() {
        return this.reportFrequency;
    }

    /**
     * <p>
     * Frequency by which reports are generated. The following options are avaiable:
     * </p>
     * <p>
     * ??? What are the APi value options?
     * </p>
     * 
     * @param reportFrequency
     *        Frequency by which reports are generated. The following options are avaiable:</p>
     *        <p>
     *        ??? What are the APi value options?
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseManagerReportGeneratorRequest withReportFrequency(ReportFrequency reportFrequency) {
        setReportFrequency(reportFrequency);
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

    public UpdateLicenseManagerReportGeneratorRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Description of the report generator.
     * </p>
     * 
     * @param description
     *        Description of the report generator.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the report generator.
     * </p>
     * 
     * @return Description of the report generator.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the report generator.
     * </p>
     * 
     * @param description
     *        Description of the report generator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLicenseManagerReportGeneratorRequest withDescription(String description) {
        setDescription(description);
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
        if (getLicenseManagerReportGeneratorArn() != null)
            sb.append("LicenseManagerReportGeneratorArn: ").append(getLicenseManagerReportGeneratorArn()).append(",");
        if (getReportGeneratorName() != null)
            sb.append("ReportGeneratorName: ").append(getReportGeneratorName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getReportContext() != null)
            sb.append("ReportContext: ").append(getReportContext()).append(",");
        if (getReportFrequency() != null)
            sb.append("ReportFrequency: ").append(getReportFrequency()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLicenseManagerReportGeneratorRequest == false)
            return false;
        UpdateLicenseManagerReportGeneratorRequest other = (UpdateLicenseManagerReportGeneratorRequest) obj;
        if (other.getLicenseManagerReportGeneratorArn() == null ^ this.getLicenseManagerReportGeneratorArn() == null)
            return false;
        if (other.getLicenseManagerReportGeneratorArn() != null
                && other.getLicenseManagerReportGeneratorArn().equals(this.getLicenseManagerReportGeneratorArn()) == false)
            return false;
        if (other.getReportGeneratorName() == null ^ this.getReportGeneratorName() == null)
            return false;
        if (other.getReportGeneratorName() != null && other.getReportGeneratorName().equals(this.getReportGeneratorName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getReportContext() == null ^ this.getReportContext() == null)
            return false;
        if (other.getReportContext() != null && other.getReportContext().equals(this.getReportContext()) == false)
            return false;
        if (other.getReportFrequency() == null ^ this.getReportFrequency() == null)
            return false;
        if (other.getReportFrequency() != null && other.getReportFrequency().equals(this.getReportFrequency()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseManagerReportGeneratorArn() == null) ? 0 : getLicenseManagerReportGeneratorArn().hashCode());
        hashCode = prime * hashCode + ((getReportGeneratorName() == null) ? 0 : getReportGeneratorName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getReportContext() == null) ? 0 : getReportContext().hashCode());
        hashCode = prime * hashCode + ((getReportFrequency() == null) ? 0 : getReportFrequency().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLicenseManagerReportGeneratorRequest clone() {
        return (UpdateLicenseManagerReportGeneratorRequest) super.clone();
    }

}
