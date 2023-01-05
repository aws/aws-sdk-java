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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains detailed information about a report setting.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ReportSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies the report template for the report. Reports are built using a report template. The report templates
     * are:
     * </p>
     * <p>
     * <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * </p>
     */
    private String reportTemplate;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * </p>
     */
    private java.util.List<String> frameworkArns;
    /**
     * <p>
     * The number of frameworks a report covers.
     * </p>
     */
    private Integer numberOfFrameworks;
    /**
     * <p>
     * These are the accounts to be included in the report.
     * </p>
     */
    private java.util.List<String> accounts;
    /**
     * <p>
     * These are the Organizational Units to be included in the report.
     * </p>
     */
    private java.util.List<String> organizationUnits;
    /**
     * <p>
     * These are the Regions to be included in the report.
     * </p>
     */
    private java.util.List<String> regions;

    /**
     * <p>
     * Identifies the report template for the report. Reports are built using a report template. The report templates
     * are:
     * </p>
     * <p>
     * <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * </p>
     * 
     * @param reportTemplate
     *        Identifies the report template for the report. Reports are built using a report template. The report
     *        templates are:</p>
     *        <p>
     *        <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     */

    public void setReportTemplate(String reportTemplate) {
        this.reportTemplate = reportTemplate;
    }

    /**
     * <p>
     * Identifies the report template for the report. Reports are built using a report template. The report templates
     * are:
     * </p>
     * <p>
     * <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * </p>
     * 
     * @return Identifies the report template for the report. Reports are built using a report template. The report
     *         templates are:</p>
     *         <p>
     *         <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     */

    public String getReportTemplate() {
        return this.reportTemplate;
    }

    /**
     * <p>
     * Identifies the report template for the report. Reports are built using a report template. The report templates
     * are:
     * </p>
     * <p>
     * <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * </p>
     * 
     * @param reportTemplate
     *        Identifies the report template for the report. Reports are built using a report template. The report
     *        templates are:</p>
     *        <p>
     *        <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportSetting withReportTemplate(String reportTemplate) {
        setReportTemplate(reportTemplate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the frameworks a report covers.
     */

    public java.util.List<String> getFrameworkArns() {
        return frameworkArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * </p>
     * 
     * @param frameworkArns
     *        The Amazon Resource Names (ARNs) of the frameworks a report covers.
     */

    public void setFrameworkArns(java.util.Collection<String> frameworkArns) {
        if (frameworkArns == null) {
            this.frameworkArns = null;
            return;
        }

        this.frameworkArns = new java.util.ArrayList<String>(frameworkArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFrameworkArns(java.util.Collection)} or {@link #withFrameworkArns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param frameworkArns
     *        The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportSetting withFrameworkArns(String... frameworkArns) {
        if (this.frameworkArns == null) {
            setFrameworkArns(new java.util.ArrayList<String>(frameworkArns.length));
        }
        for (String ele : frameworkArns) {
            this.frameworkArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * </p>
     * 
     * @param frameworkArns
     *        The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportSetting withFrameworkArns(java.util.Collection<String> frameworkArns) {
        setFrameworkArns(frameworkArns);
        return this;
    }

    /**
     * <p>
     * The number of frameworks a report covers.
     * </p>
     * 
     * @param numberOfFrameworks
     *        The number of frameworks a report covers.
     */

    public void setNumberOfFrameworks(Integer numberOfFrameworks) {
        this.numberOfFrameworks = numberOfFrameworks;
    }

    /**
     * <p>
     * The number of frameworks a report covers.
     * </p>
     * 
     * @return The number of frameworks a report covers.
     */

    public Integer getNumberOfFrameworks() {
        return this.numberOfFrameworks;
    }

    /**
     * <p>
     * The number of frameworks a report covers.
     * </p>
     * 
     * @param numberOfFrameworks
     *        The number of frameworks a report covers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportSetting withNumberOfFrameworks(Integer numberOfFrameworks) {
        setNumberOfFrameworks(numberOfFrameworks);
        return this;
    }

    /**
     * <p>
     * These are the accounts to be included in the report.
     * </p>
     * 
     * @return These are the accounts to be included in the report.
     */

    public java.util.List<String> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * These are the accounts to be included in the report.
     * </p>
     * 
     * @param accounts
     *        These are the accounts to be included in the report.
     */

    public void setAccounts(java.util.Collection<String> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<String>(accounts);
    }

    /**
     * <p>
     * These are the accounts to be included in the report.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        These are the accounts to be included in the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportSetting withAccounts(String... accounts) {
        if (this.accounts == null) {
            setAccounts(new java.util.ArrayList<String>(accounts.length));
        }
        for (String ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * These are the accounts to be included in the report.
     * </p>
     * 
     * @param accounts
     *        These are the accounts to be included in the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportSetting withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * These are the Organizational Units to be included in the report.
     * </p>
     * 
     * @return These are the Organizational Units to be included in the report.
     */

    public java.util.List<String> getOrganizationUnits() {
        return organizationUnits;
    }

    /**
     * <p>
     * These are the Organizational Units to be included in the report.
     * </p>
     * 
     * @param organizationUnits
     *        These are the Organizational Units to be included in the report.
     */

    public void setOrganizationUnits(java.util.Collection<String> organizationUnits) {
        if (organizationUnits == null) {
            this.organizationUnits = null;
            return;
        }

        this.organizationUnits = new java.util.ArrayList<String>(organizationUnits);
    }

    /**
     * <p>
     * These are the Organizational Units to be included in the report.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationUnits(java.util.Collection)} or {@link #withOrganizationUnits(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param organizationUnits
     *        These are the Organizational Units to be included in the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportSetting withOrganizationUnits(String... organizationUnits) {
        if (this.organizationUnits == null) {
            setOrganizationUnits(new java.util.ArrayList<String>(organizationUnits.length));
        }
        for (String ele : organizationUnits) {
            this.organizationUnits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * These are the Organizational Units to be included in the report.
     * </p>
     * 
     * @param organizationUnits
     *        These are the Organizational Units to be included in the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportSetting withOrganizationUnits(java.util.Collection<String> organizationUnits) {
        setOrganizationUnits(organizationUnits);
        return this;
    }

    /**
     * <p>
     * These are the Regions to be included in the report.
     * </p>
     * 
     * @return These are the Regions to be included in the report.
     */

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * These are the Regions to be included in the report.
     * </p>
     * 
     * @param regions
     *        These are the Regions to be included in the report.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>
     * These are the Regions to be included in the report.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        These are the Regions to be included in the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportSetting withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * These are the Regions to be included in the report.
     * </p>
     * 
     * @param regions
     *        These are the Regions to be included in the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportSetting withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
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
        if (getReportTemplate() != null)
            sb.append("ReportTemplate: ").append(getReportTemplate()).append(",");
        if (getFrameworkArns() != null)
            sb.append("FrameworkArns: ").append(getFrameworkArns()).append(",");
        if (getNumberOfFrameworks() != null)
            sb.append("NumberOfFrameworks: ").append(getNumberOfFrameworks()).append(",");
        if (getAccounts() != null)
            sb.append("Accounts: ").append(getAccounts()).append(",");
        if (getOrganizationUnits() != null)
            sb.append("OrganizationUnits: ").append(getOrganizationUnits()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportSetting == false)
            return false;
        ReportSetting other = (ReportSetting) obj;
        if (other.getReportTemplate() == null ^ this.getReportTemplate() == null)
            return false;
        if (other.getReportTemplate() != null && other.getReportTemplate().equals(this.getReportTemplate()) == false)
            return false;
        if (other.getFrameworkArns() == null ^ this.getFrameworkArns() == null)
            return false;
        if (other.getFrameworkArns() != null && other.getFrameworkArns().equals(this.getFrameworkArns()) == false)
            return false;
        if (other.getNumberOfFrameworks() == null ^ this.getNumberOfFrameworks() == null)
            return false;
        if (other.getNumberOfFrameworks() != null && other.getNumberOfFrameworks().equals(this.getNumberOfFrameworks()) == false)
            return false;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getOrganizationUnits() == null ^ this.getOrganizationUnits() == null)
            return false;
        if (other.getOrganizationUnits() != null && other.getOrganizationUnits().equals(this.getOrganizationUnits()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportTemplate() == null) ? 0 : getReportTemplate().hashCode());
        hashCode = prime * hashCode + ((getFrameworkArns() == null) ? 0 : getFrameworkArns().hashCode());
        hashCode = prime * hashCode + ((getNumberOfFrameworks() == null) ? 0 : getNumberOfFrameworks().hashCode());
        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getOrganizationUnits() == null) ? 0 : getOrganizationUnits().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        return hashCode;
    }

    @Override
    public ReportSetting clone() {
        try {
            return (ReportSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.ReportSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
