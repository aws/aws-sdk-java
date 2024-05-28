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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportLicenseRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportLicenseRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the Amazon Web Services accounts for which to export license recommendations.
     * </p>
     * <p>
     * If your account is the management account of an organization, use this parameter to specify the member account
     * for which you want to export recommendations.
     * </p>
     * <p>
     * This parameter can't be specified together with the include member accounts parameter. The parameters are
     * mutually exclusive.
     * </p>
     * <p>
     * If this parameter is omitted, recommendations for member accounts aren't included in the export.
     * </p>
     * <p>
     * You can specify multiple account IDs per request.
     * </p>
     */
    private java.util.List<String> accountIds;
    /**
     * <p>
     * An array of objects to specify a filter that exports a more specific set of license recommendations.
     * </p>
     */
    private java.util.List<LicenseRecommendationFilter> filters;
    /**
     * <p>
     * The recommendations data to include in the export file. For more information about the fields that can be
     * exported, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html#exported-files"
     * >Exported files</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     */
    private java.util.List<String> fieldsToExport;

    private S3DestinationConfig s3DestinationConfig;
    /**
     * <p>
     * The format of the export file.
     * </p>
     * <p>
     * A CSV file is the only export format currently supported.
     * </p>
     */
    private String fileFormat;
    /**
     * <p>
     * Indicates whether to include recommendations for resources in all member accounts of the organization if your
     * account is the management account of an organization.
     * </p>
     * <p>
     * The member accounts must also be opted in to Compute Optimizer, and trusted access for Compute Optimizer must be
     * enabled in the organization account. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/security-iam.html#trusted-service-access">Compute
     * Optimizer and Amazon Web Services Organizations trusted access</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * If this parameter is omitted, recommendations for member accounts of the organization aren't included in the
     * export file .
     * </p>
     * <p>
     * This parameter cannot be specified together with the account IDs parameter. The parameters are mutually
     * exclusive.
     * </p>
     */
    private Boolean includeMemberAccounts;

    /**
     * <p>
     * The IDs of the Amazon Web Services accounts for which to export license recommendations.
     * </p>
     * <p>
     * If your account is the management account of an organization, use this parameter to specify the member account
     * for which you want to export recommendations.
     * </p>
     * <p>
     * This parameter can't be specified together with the include member accounts parameter. The parameters are
     * mutually exclusive.
     * </p>
     * <p>
     * If this parameter is omitted, recommendations for member accounts aren't included in the export.
     * </p>
     * <p>
     * You can specify multiple account IDs per request.
     * </p>
     * 
     * @return The IDs of the Amazon Web Services accounts for which to export license recommendations.</p>
     *         <p>
     *         If your account is the management account of an organization, use this parameter to specify the member
     *         account for which you want to export recommendations.
     *         </p>
     *         <p>
     *         This parameter can't be specified together with the include member accounts parameter. The parameters are
     *         mutually exclusive.
     *         </p>
     *         <p>
     *         If this parameter is omitted, recommendations for member accounts aren't included in the export.
     *         </p>
     *         <p>
     *         You can specify multiple account IDs per request.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services accounts for which to export license recommendations.
     * </p>
     * <p>
     * If your account is the management account of an organization, use this parameter to specify the member account
     * for which you want to export recommendations.
     * </p>
     * <p>
     * This parameter can't be specified together with the include member accounts parameter. The parameters are
     * mutually exclusive.
     * </p>
     * <p>
     * If this parameter is omitted, recommendations for member accounts aren't included in the export.
     * </p>
     * <p>
     * You can specify multiple account IDs per request.
     * </p>
     * 
     * @param accountIds
     *        The IDs of the Amazon Web Services accounts for which to export license recommendations.</p>
     *        <p>
     *        If your account is the management account of an organization, use this parameter to specify the member
     *        account for which you want to export recommendations.
     *        </p>
     *        <p>
     *        This parameter can't be specified together with the include member accounts parameter. The parameters are
     *        mutually exclusive.
     *        </p>
     *        <p>
     *        If this parameter is omitted, recommendations for member accounts aren't included in the export.
     *        </p>
     *        <p>
     *        You can specify multiple account IDs per request.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services accounts for which to export license recommendations.
     * </p>
     * <p>
     * If your account is the management account of an organization, use this parameter to specify the member account
     * for which you want to export recommendations.
     * </p>
     * <p>
     * This parameter can't be specified together with the include member accounts parameter. The parameters are
     * mutually exclusive.
     * </p>
     * <p>
     * If this parameter is omitted, recommendations for member accounts aren't included in the export.
     * </p>
     * <p>
     * You can specify multiple account IDs per request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        The IDs of the Amazon Web Services accounts for which to export license recommendations.</p>
     *        <p>
     *        If your account is the management account of an organization, use this parameter to specify the member
     *        account for which you want to export recommendations.
     *        </p>
     *        <p>
     *        This parameter can't be specified together with the include member accounts parameter. The parameters are
     *        mutually exclusive.
     *        </p>
     *        <p>
     *        If this parameter is omitted, recommendations for member accounts aren't included in the export.
     *        </p>
     *        <p>
     *        You can specify multiple account IDs per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportLicenseRecommendationsRequest withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services accounts for which to export license recommendations.
     * </p>
     * <p>
     * If your account is the management account of an organization, use this parameter to specify the member account
     * for which you want to export recommendations.
     * </p>
     * <p>
     * This parameter can't be specified together with the include member accounts parameter. The parameters are
     * mutually exclusive.
     * </p>
     * <p>
     * If this parameter is omitted, recommendations for member accounts aren't included in the export.
     * </p>
     * <p>
     * You can specify multiple account IDs per request.
     * </p>
     * 
     * @param accountIds
     *        The IDs of the Amazon Web Services accounts for which to export license recommendations.</p>
     *        <p>
     *        If your account is the management account of an organization, use this parameter to specify the member
     *        account for which you want to export recommendations.
     *        </p>
     *        <p>
     *        This parameter can't be specified together with the include member accounts parameter. The parameters are
     *        mutually exclusive.
     *        </p>
     *        <p>
     *        If this parameter is omitted, recommendations for member accounts aren't included in the export.
     *        </p>
     *        <p>
     *        You can specify multiple account IDs per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportLicenseRecommendationsRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * An array of objects to specify a filter that exports a more specific set of license recommendations.
     * </p>
     * 
     * @return An array of objects to specify a filter that exports a more specific set of license recommendations.
     */

    public java.util.List<LicenseRecommendationFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of objects to specify a filter that exports a more specific set of license recommendations.
     * </p>
     * 
     * @param filters
     *        An array of objects to specify a filter that exports a more specific set of license recommendations.
     */

    public void setFilters(java.util.Collection<LicenseRecommendationFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<LicenseRecommendationFilter>(filters);
    }

    /**
     * <p>
     * An array of objects to specify a filter that exports a more specific set of license recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of objects to specify a filter that exports a more specific set of license recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportLicenseRecommendationsRequest withFilters(LicenseRecommendationFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<LicenseRecommendationFilter>(filters.length));
        }
        for (LicenseRecommendationFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects to specify a filter that exports a more specific set of license recommendations.
     * </p>
     * 
     * @param filters
     *        An array of objects to specify a filter that exports a more specific set of license recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportLicenseRecommendationsRequest withFilters(java.util.Collection<LicenseRecommendationFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The recommendations data to include in the export file. For more information about the fields that can be
     * exported, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html#exported-files"
     * >Exported files</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @return The recommendations data to include in the export file. For more information about the fields that can be
     *         exported, see <a href=
     *         "https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html#exported-files"
     *         >Exported files</a> in the <i>Compute Optimizer User Guide</i>.
     * @see ExportableLicenseField
     */

    public java.util.List<String> getFieldsToExport() {
        return fieldsToExport;
    }

    /**
     * <p>
     * The recommendations data to include in the export file. For more information about the fields that can be
     * exported, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html#exported-files"
     * >Exported files</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param fieldsToExport
     *        The recommendations data to include in the export file. For more information about the fields that can be
     *        exported, see <a href=
     *        "https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html#exported-files"
     *        >Exported files</a> in the <i>Compute Optimizer User Guide</i>.
     * @see ExportableLicenseField
     */

    public void setFieldsToExport(java.util.Collection<String> fieldsToExport) {
        if (fieldsToExport == null) {
            this.fieldsToExport = null;
            return;
        }

        this.fieldsToExport = new java.util.ArrayList<String>(fieldsToExport);
    }

    /**
     * <p>
     * The recommendations data to include in the export file. For more information about the fields that can be
     * exported, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html#exported-files"
     * >Exported files</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldsToExport(java.util.Collection)} or {@link #withFieldsToExport(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fieldsToExport
     *        The recommendations data to include in the export file. For more information about the fields that can be
     *        exported, see <a href=
     *        "https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html#exported-files"
     *        >Exported files</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportableLicenseField
     */

    public ExportLicenseRecommendationsRequest withFieldsToExport(String... fieldsToExport) {
        if (this.fieldsToExport == null) {
            setFieldsToExport(new java.util.ArrayList<String>(fieldsToExport.length));
        }
        for (String ele : fieldsToExport) {
            this.fieldsToExport.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recommendations data to include in the export file. For more information about the fields that can be
     * exported, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html#exported-files"
     * >Exported files</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param fieldsToExport
     *        The recommendations data to include in the export file. For more information about the fields that can be
     *        exported, see <a href=
     *        "https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html#exported-files"
     *        >Exported files</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportableLicenseField
     */

    public ExportLicenseRecommendationsRequest withFieldsToExport(java.util.Collection<String> fieldsToExport) {
        setFieldsToExport(fieldsToExport);
        return this;
    }

    /**
     * <p>
     * The recommendations data to include in the export file. For more information about the fields that can be
     * exported, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html#exported-files"
     * >Exported files</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * 
     * @param fieldsToExport
     *        The recommendations data to include in the export file. For more information about the fields that can be
     *        exported, see <a href=
     *        "https://docs.aws.amazon.com/compute-optimizer/latest/ug/exporting-recommendations.html#exported-files"
     *        >Exported files</a> in the <i>Compute Optimizer User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportableLicenseField
     */

    public ExportLicenseRecommendationsRequest withFieldsToExport(ExportableLicenseField... fieldsToExport) {
        java.util.ArrayList<String> fieldsToExportCopy = new java.util.ArrayList<String>(fieldsToExport.length);
        for (ExportableLicenseField value : fieldsToExport) {
            fieldsToExportCopy.add(value.toString());
        }
        if (getFieldsToExport() == null) {
            setFieldsToExport(fieldsToExportCopy);
        } else {
            getFieldsToExport().addAll(fieldsToExportCopy);
        }
        return this;
    }

    /**
     * @param s3DestinationConfig
     */

    public void setS3DestinationConfig(S3DestinationConfig s3DestinationConfig) {
        this.s3DestinationConfig = s3DestinationConfig;
    }

    /**
     * @return
     */

    public S3DestinationConfig getS3DestinationConfig() {
        return this.s3DestinationConfig;
    }

    /**
     * @param s3DestinationConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportLicenseRecommendationsRequest withS3DestinationConfig(S3DestinationConfig s3DestinationConfig) {
        setS3DestinationConfig(s3DestinationConfig);
        return this;
    }

    /**
     * <p>
     * The format of the export file.
     * </p>
     * <p>
     * A CSV file is the only export format currently supported.
     * </p>
     * 
     * @param fileFormat
     *        The format of the export file.</p>
     *        <p>
     *        A CSV file is the only export format currently supported.
     * @see FileFormat
     */

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * <p>
     * The format of the export file.
     * </p>
     * <p>
     * A CSV file is the only export format currently supported.
     * </p>
     * 
     * @return The format of the export file.</p>
     *         <p>
     *         A CSV file is the only export format currently supported.
     * @see FileFormat
     */

    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * <p>
     * The format of the export file.
     * </p>
     * <p>
     * A CSV file is the only export format currently supported.
     * </p>
     * 
     * @param fileFormat
     *        The format of the export file.</p>
     *        <p>
     *        A CSV file is the only export format currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileFormat
     */

    public ExportLicenseRecommendationsRequest withFileFormat(String fileFormat) {
        setFileFormat(fileFormat);
        return this;
    }

    /**
     * <p>
     * The format of the export file.
     * </p>
     * <p>
     * A CSV file is the only export format currently supported.
     * </p>
     * 
     * @param fileFormat
     *        The format of the export file.</p>
     *        <p>
     *        A CSV file is the only export format currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileFormat
     */

    public ExportLicenseRecommendationsRequest withFileFormat(FileFormat fileFormat) {
        this.fileFormat = fileFormat.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether to include recommendations for resources in all member accounts of the organization if your
     * account is the management account of an organization.
     * </p>
     * <p>
     * The member accounts must also be opted in to Compute Optimizer, and trusted access for Compute Optimizer must be
     * enabled in the organization account. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/security-iam.html#trusted-service-access">Compute
     * Optimizer and Amazon Web Services Organizations trusted access</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * If this parameter is omitted, recommendations for member accounts of the organization aren't included in the
     * export file .
     * </p>
     * <p>
     * This parameter cannot be specified together with the account IDs parameter. The parameters are mutually
     * exclusive.
     * </p>
     * 
     * @param includeMemberAccounts
     *        Indicates whether to include recommendations for resources in all member accounts of the organization if
     *        your account is the management account of an organization.</p>
     *        <p>
     *        The member accounts must also be opted in to Compute Optimizer, and trusted access for Compute Optimizer
     *        must be enabled in the organization account. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/security-iam.html#trusted-service-access"
     *        >Compute Optimizer and Amazon Web Services Organizations trusted access</a> in the <i>Compute Optimizer
     *        User Guide</i>.
     *        </p>
     *        <p>
     *        If this parameter is omitted, recommendations for member accounts of the organization aren't included in
     *        the export file .
     *        </p>
     *        <p>
     *        This parameter cannot be specified together with the account IDs parameter. The parameters are mutually
     *        exclusive.
     */

    public void setIncludeMemberAccounts(Boolean includeMemberAccounts) {
        this.includeMemberAccounts = includeMemberAccounts;
    }

    /**
     * <p>
     * Indicates whether to include recommendations for resources in all member accounts of the organization if your
     * account is the management account of an organization.
     * </p>
     * <p>
     * The member accounts must also be opted in to Compute Optimizer, and trusted access for Compute Optimizer must be
     * enabled in the organization account. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/security-iam.html#trusted-service-access">Compute
     * Optimizer and Amazon Web Services Organizations trusted access</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * If this parameter is omitted, recommendations for member accounts of the organization aren't included in the
     * export file .
     * </p>
     * <p>
     * This parameter cannot be specified together with the account IDs parameter. The parameters are mutually
     * exclusive.
     * </p>
     * 
     * @return Indicates whether to include recommendations for resources in all member accounts of the organization if
     *         your account is the management account of an organization.</p>
     *         <p>
     *         The member accounts must also be opted in to Compute Optimizer, and trusted access for Compute Optimizer
     *         must be enabled in the organization account. For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/security-iam.html#trusted-service-access"
     *         >Compute Optimizer and Amazon Web Services Organizations trusted access</a> in the <i>Compute Optimizer
     *         User Guide</i>.
     *         </p>
     *         <p>
     *         If this parameter is omitted, recommendations for member accounts of the organization aren't included in
     *         the export file .
     *         </p>
     *         <p>
     *         This parameter cannot be specified together with the account IDs parameter. The parameters are mutually
     *         exclusive.
     */

    public Boolean getIncludeMemberAccounts() {
        return this.includeMemberAccounts;
    }

    /**
     * <p>
     * Indicates whether to include recommendations for resources in all member accounts of the organization if your
     * account is the management account of an organization.
     * </p>
     * <p>
     * The member accounts must also be opted in to Compute Optimizer, and trusted access for Compute Optimizer must be
     * enabled in the organization account. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/security-iam.html#trusted-service-access">Compute
     * Optimizer and Amazon Web Services Organizations trusted access</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * If this parameter is omitted, recommendations for member accounts of the organization aren't included in the
     * export file .
     * </p>
     * <p>
     * This parameter cannot be specified together with the account IDs parameter. The parameters are mutually
     * exclusive.
     * </p>
     * 
     * @param includeMemberAccounts
     *        Indicates whether to include recommendations for resources in all member accounts of the organization if
     *        your account is the management account of an organization.</p>
     *        <p>
     *        The member accounts must also be opted in to Compute Optimizer, and trusted access for Compute Optimizer
     *        must be enabled in the organization account. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/security-iam.html#trusted-service-access"
     *        >Compute Optimizer and Amazon Web Services Organizations trusted access</a> in the <i>Compute Optimizer
     *        User Guide</i>.
     *        </p>
     *        <p>
     *        If this parameter is omitted, recommendations for member accounts of the organization aren't included in
     *        the export file .
     *        </p>
     *        <p>
     *        This parameter cannot be specified together with the account IDs parameter. The parameters are mutually
     *        exclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportLicenseRecommendationsRequest withIncludeMemberAccounts(Boolean includeMemberAccounts) {
        setIncludeMemberAccounts(includeMemberAccounts);
        return this;
    }

    /**
     * <p>
     * Indicates whether to include recommendations for resources in all member accounts of the organization if your
     * account is the management account of an organization.
     * </p>
     * <p>
     * The member accounts must also be opted in to Compute Optimizer, and trusted access for Compute Optimizer must be
     * enabled in the organization account. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/security-iam.html#trusted-service-access">Compute
     * Optimizer and Amazon Web Services Organizations trusted access</a> in the <i>Compute Optimizer User Guide</i>.
     * </p>
     * <p>
     * If this parameter is omitted, recommendations for member accounts of the organization aren't included in the
     * export file .
     * </p>
     * <p>
     * This parameter cannot be specified together with the account IDs parameter. The parameters are mutually
     * exclusive.
     * </p>
     * 
     * @return Indicates whether to include recommendations for resources in all member accounts of the organization if
     *         your account is the management account of an organization.</p>
     *         <p>
     *         The member accounts must also be opted in to Compute Optimizer, and trusted access for Compute Optimizer
     *         must be enabled in the organization account. For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/security-iam.html#trusted-service-access"
     *         >Compute Optimizer and Amazon Web Services Organizations trusted access</a> in the <i>Compute Optimizer
     *         User Guide</i>.
     *         </p>
     *         <p>
     *         If this parameter is omitted, recommendations for member accounts of the organization aren't included in
     *         the export file .
     *         </p>
     *         <p>
     *         This parameter cannot be specified together with the account IDs parameter. The parameters are mutually
     *         exclusive.
     */

    public Boolean isIncludeMemberAccounts() {
        return this.includeMemberAccounts;
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
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getFieldsToExport() != null)
            sb.append("FieldsToExport: ").append(getFieldsToExport()).append(",");
        if (getS3DestinationConfig() != null)
            sb.append("S3DestinationConfig: ").append(getS3DestinationConfig()).append(",");
        if (getFileFormat() != null)
            sb.append("FileFormat: ").append(getFileFormat()).append(",");
        if (getIncludeMemberAccounts() != null)
            sb.append("IncludeMemberAccounts: ").append(getIncludeMemberAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportLicenseRecommendationsRequest == false)
            return false;
        ExportLicenseRecommendationsRequest other = (ExportLicenseRecommendationsRequest) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getFieldsToExport() == null ^ this.getFieldsToExport() == null)
            return false;
        if (other.getFieldsToExport() != null && other.getFieldsToExport().equals(this.getFieldsToExport()) == false)
            return false;
        if (other.getS3DestinationConfig() == null ^ this.getS3DestinationConfig() == null)
            return false;
        if (other.getS3DestinationConfig() != null && other.getS3DestinationConfig().equals(this.getS3DestinationConfig()) == false)
            return false;
        if (other.getFileFormat() == null ^ this.getFileFormat() == null)
            return false;
        if (other.getFileFormat() != null && other.getFileFormat().equals(this.getFileFormat()) == false)
            return false;
        if (other.getIncludeMemberAccounts() == null ^ this.getIncludeMemberAccounts() == null)
            return false;
        if (other.getIncludeMemberAccounts() != null && other.getIncludeMemberAccounts().equals(this.getIncludeMemberAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getFieldsToExport() == null) ? 0 : getFieldsToExport().hashCode());
        hashCode = prime * hashCode + ((getS3DestinationConfig() == null) ? 0 : getS3DestinationConfig().hashCode());
        hashCode = prime * hashCode + ((getFileFormat() == null) ? 0 : getFileFormat().hashCode());
        hashCode = prime * hashCode + ((getIncludeMemberAccounts() == null) ? 0 : getIncludeMemberAccounts().hashCode());
        return hashCode;
    }

    @Override
    public ExportLicenseRecommendationsRequest clone() {
        return (ExportLicenseRecommendationsRequest) super.clone();
    }

}
