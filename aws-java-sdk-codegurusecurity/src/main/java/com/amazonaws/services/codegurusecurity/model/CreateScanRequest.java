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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/CreateScan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateScanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of analysis you want CodeGuru Security to perform in the scan, either <code>Security</code> or
     * <code>All</code>. The <code>Security</code> type only generates findings related to security. The
     * <code>All</code> type generates both security findings and quality findings. Defaults to <code>Security</code>
     * type if missing.
     * </p>
     */
    private String analysisType;
    /**
     * <p>
     * The idempotency token for the request. Amazon CodeGuru Security uses this value to prevent the accidental
     * creation of duplicate scans if there are failures and retries.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The identifier for an input resource used to create a scan.
     * </p>
     */
    private ResourceId resourceId;
    /**
     * <p>
     * The unique name that CodeGuru Security uses to track revisions across multiple scans of the same resource. Only
     * allowed for a <code>STANDARD</code> scan type. If not specified, it will be auto generated.
     * </p>
     */
    private String scanName;
    /**
     * <p>
     * The type of scan, either <code>Standard</code> or <code>Express</code>. Defaults to <code>Standard</code> type if
     * missing.
     * </p>
     * <p>
     * <code>Express</code> scans run on limited resources and use a limited set of detectors to analyze your code in
     * near-real time. <code>Standard</code> scans have standard resource limits and use the full set of detectors to
     * analyze your code.
     * </p>
     */
    private String scanType;
    /**
     * <p>
     * An array of key-value pairs used to tag a scan. A tag is a custom attribute label with two parts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A tag key. For example, <code>CostCenter</code>, <code>Environment</code>, or <code>Secret</code>. Tag keys are
     * case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * An optional tag value field. For example, <code>111122223333</code>, <code>Production</code>, or a team name.
     * Omitting the tag value is the same as using an empty string. Tag values are case sensitive.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The type of analysis you want CodeGuru Security to perform in the scan, either <code>Security</code> or
     * <code>All</code>. The <code>Security</code> type only generates findings related to security. The
     * <code>All</code> type generates both security findings and quality findings. Defaults to <code>Security</code>
     * type if missing.
     * </p>
     * 
     * @param analysisType
     *        The type of analysis you want CodeGuru Security to perform in the scan, either <code>Security</code> or
     *        <code>All</code>. The <code>Security</code> type only generates findings related to security. The
     *        <code>All</code> type generates both security findings and quality findings. Defaults to
     *        <code>Security</code> type if missing.
     * @see AnalysisType
     */

    public void setAnalysisType(String analysisType) {
        this.analysisType = analysisType;
    }

    /**
     * <p>
     * The type of analysis you want CodeGuru Security to perform in the scan, either <code>Security</code> or
     * <code>All</code>. The <code>Security</code> type only generates findings related to security. The
     * <code>All</code> type generates both security findings and quality findings. Defaults to <code>Security</code>
     * type if missing.
     * </p>
     * 
     * @return The type of analysis you want CodeGuru Security to perform in the scan, either <code>Security</code> or
     *         <code>All</code>. The <code>Security</code> type only generates findings related to security. The
     *         <code>All</code> type generates both security findings and quality findings. Defaults to
     *         <code>Security</code> type if missing.
     * @see AnalysisType
     */

    public String getAnalysisType() {
        return this.analysisType;
    }

    /**
     * <p>
     * The type of analysis you want CodeGuru Security to perform in the scan, either <code>Security</code> or
     * <code>All</code>. The <code>Security</code> type only generates findings related to security. The
     * <code>All</code> type generates both security findings and quality findings. Defaults to <code>Security</code>
     * type if missing.
     * </p>
     * 
     * @param analysisType
     *        The type of analysis you want CodeGuru Security to perform in the scan, either <code>Security</code> or
     *        <code>All</code>. The <code>Security</code> type only generates findings related to security. The
     *        <code>All</code> type generates both security findings and quality findings. Defaults to
     *        <code>Security</code> type if missing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisType
     */

    public CreateScanRequest withAnalysisType(String analysisType) {
        setAnalysisType(analysisType);
        return this;
    }

    /**
     * <p>
     * The type of analysis you want CodeGuru Security to perform in the scan, either <code>Security</code> or
     * <code>All</code>. The <code>Security</code> type only generates findings related to security. The
     * <code>All</code> type generates both security findings and quality findings. Defaults to <code>Security</code>
     * type if missing.
     * </p>
     * 
     * @param analysisType
     *        The type of analysis you want CodeGuru Security to perform in the scan, either <code>Security</code> or
     *        <code>All</code>. The <code>Security</code> type only generates findings related to security. The
     *        <code>All</code> type generates both security findings and quality findings. Defaults to
     *        <code>Security</code> type if missing.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisType
     */

    public CreateScanRequest withAnalysisType(AnalysisType analysisType) {
        this.analysisType = analysisType.toString();
        return this;
    }

    /**
     * <p>
     * The idempotency token for the request. Amazon CodeGuru Security uses this value to prevent the accidental
     * creation of duplicate scans if there are failures and retries.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the request. Amazon CodeGuru Security uses this value to prevent the accidental
     *        creation of duplicate scans if there are failures and retries.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for the request. Amazon CodeGuru Security uses this value to prevent the accidental
     * creation of duplicate scans if there are failures and retries.
     * </p>
     * 
     * @return The idempotency token for the request. Amazon CodeGuru Security uses this value to prevent the accidental
     *         creation of duplicate scans if there are failures and retries.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token for the request. Amazon CodeGuru Security uses this value to prevent the accidental
     * creation of duplicate scans if there are failures and retries.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the request. Amazon CodeGuru Security uses this value to prevent the accidental
     *        creation of duplicate scans if there are failures and retries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScanRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The identifier for an input resource used to create a scan.
     * </p>
     * 
     * @param resourceId
     *        The identifier for an input resource used to create a scan.
     */

    public void setResourceId(ResourceId resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier for an input resource used to create a scan.
     * </p>
     * 
     * @return The identifier for an input resource used to create a scan.
     */

    public ResourceId getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier for an input resource used to create a scan.
     * </p>
     * 
     * @param resourceId
     *        The identifier for an input resource used to create a scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScanRequest withResourceId(ResourceId resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The unique name that CodeGuru Security uses to track revisions across multiple scans of the same resource. Only
     * allowed for a <code>STANDARD</code> scan type. If not specified, it will be auto generated.
     * </p>
     * 
     * @param scanName
     *        The unique name that CodeGuru Security uses to track revisions across multiple scans of the same resource.
     *        Only allowed for a <code>STANDARD</code> scan type. If not specified, it will be auto generated.
     */

    public void setScanName(String scanName) {
        this.scanName = scanName;
    }

    /**
     * <p>
     * The unique name that CodeGuru Security uses to track revisions across multiple scans of the same resource. Only
     * allowed for a <code>STANDARD</code> scan type. If not specified, it will be auto generated.
     * </p>
     * 
     * @return The unique name that CodeGuru Security uses to track revisions across multiple scans of the same
     *         resource. Only allowed for a <code>STANDARD</code> scan type. If not specified, it will be auto
     *         generated.
     */

    public String getScanName() {
        return this.scanName;
    }

    /**
     * <p>
     * The unique name that CodeGuru Security uses to track revisions across multiple scans of the same resource. Only
     * allowed for a <code>STANDARD</code> scan type. If not specified, it will be auto generated.
     * </p>
     * 
     * @param scanName
     *        The unique name that CodeGuru Security uses to track revisions across multiple scans of the same resource.
     *        Only allowed for a <code>STANDARD</code> scan type. If not specified, it will be auto generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScanRequest withScanName(String scanName) {
        setScanName(scanName);
        return this;
    }

    /**
     * <p>
     * The type of scan, either <code>Standard</code> or <code>Express</code>. Defaults to <code>Standard</code> type if
     * missing.
     * </p>
     * <p>
     * <code>Express</code> scans run on limited resources and use a limited set of detectors to analyze your code in
     * near-real time. <code>Standard</code> scans have standard resource limits and use the full set of detectors to
     * analyze your code.
     * </p>
     * 
     * @param scanType
     *        The type of scan, either <code>Standard</code> or <code>Express</code>. Defaults to <code>Standard</code>
     *        type if missing.</p>
     *        <p>
     *        <code>Express</code> scans run on limited resources and use a limited set of detectors to analyze your
     *        code in near-real time. <code>Standard</code> scans have standard resource limits and use the full set of
     *        detectors to analyze your code.
     * @see ScanType
     */

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    /**
     * <p>
     * The type of scan, either <code>Standard</code> or <code>Express</code>. Defaults to <code>Standard</code> type if
     * missing.
     * </p>
     * <p>
     * <code>Express</code> scans run on limited resources and use a limited set of detectors to analyze your code in
     * near-real time. <code>Standard</code> scans have standard resource limits and use the full set of detectors to
     * analyze your code.
     * </p>
     * 
     * @return The type of scan, either <code>Standard</code> or <code>Express</code>. Defaults to <code>Standard</code>
     *         type if missing.</p>
     *         <p>
     *         <code>Express</code> scans run on limited resources and use a limited set of detectors to analyze your
     *         code in near-real time. <code>Standard</code> scans have standard resource limits and use the full set of
     *         detectors to analyze your code.
     * @see ScanType
     */

    public String getScanType() {
        return this.scanType;
    }

    /**
     * <p>
     * The type of scan, either <code>Standard</code> or <code>Express</code>. Defaults to <code>Standard</code> type if
     * missing.
     * </p>
     * <p>
     * <code>Express</code> scans run on limited resources and use a limited set of detectors to analyze your code in
     * near-real time. <code>Standard</code> scans have standard resource limits and use the full set of detectors to
     * analyze your code.
     * </p>
     * 
     * @param scanType
     *        The type of scan, either <code>Standard</code> or <code>Express</code>. Defaults to <code>Standard</code>
     *        type if missing.</p>
     *        <p>
     *        <code>Express</code> scans run on limited resources and use a limited set of detectors to analyze your
     *        code in near-real time. <code>Standard</code> scans have standard resource limits and use the full set of
     *        detectors to analyze your code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanType
     */

    public CreateScanRequest withScanType(String scanType) {
        setScanType(scanType);
        return this;
    }

    /**
     * <p>
     * The type of scan, either <code>Standard</code> or <code>Express</code>. Defaults to <code>Standard</code> type if
     * missing.
     * </p>
     * <p>
     * <code>Express</code> scans run on limited resources and use a limited set of detectors to analyze your code in
     * near-real time. <code>Standard</code> scans have standard resource limits and use the full set of detectors to
     * analyze your code.
     * </p>
     * 
     * @param scanType
     *        The type of scan, either <code>Standard</code> or <code>Express</code>. Defaults to <code>Standard</code>
     *        type if missing.</p>
     *        <p>
     *        <code>Express</code> scans run on limited resources and use a limited set of detectors to analyze your
     *        code in near-real time. <code>Standard</code> scans have standard resource limits and use the full set of
     *        detectors to analyze your code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanType
     */

    public CreateScanRequest withScanType(ScanType scanType) {
        this.scanType = scanType.toString();
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs used to tag a scan. A tag is a custom attribute label with two parts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A tag key. For example, <code>CostCenter</code>, <code>Environment</code>, or <code>Secret</code>. Tag keys are
     * case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * An optional tag value field. For example, <code>111122223333</code>, <code>Production</code>, or a team name.
     * Omitting the tag value is the same as using an empty string. Tag values are case sensitive.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of key-value pairs used to tag a scan. A tag is a custom attribute label with two parts:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A tag key. For example, <code>CostCenter</code>, <code>Environment</code>, or <code>Secret</code>. Tag
     *         keys are case sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An optional tag value field. For example, <code>111122223333</code>, <code>Production</code>, or a team
     *         name. Omitting the tag value is the same as using an empty string. Tag values are case sensitive.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs used to tag a scan. A tag is a custom attribute label with two parts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A tag key. For example, <code>CostCenter</code>, <code>Environment</code>, or <code>Secret</code>. Tag keys are
     * case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * An optional tag value field. For example, <code>111122223333</code>, <code>Production</code>, or a team name.
     * Omitting the tag value is the same as using an empty string. Tag values are case sensitive.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        An array of key-value pairs used to tag a scan. A tag is a custom attribute label with two parts:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A tag key. For example, <code>CostCenter</code>, <code>Environment</code>, or <code>Secret</code>. Tag
     *        keys are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An optional tag value field. For example, <code>111122223333</code>, <code>Production</code>, or a team
     *        name. Omitting the tag value is the same as using an empty string. Tag values are case sensitive.
     *        </p>
     *        </li>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * An array of key-value pairs used to tag a scan. A tag is a custom attribute label with two parts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A tag key. For example, <code>CostCenter</code>, <code>Environment</code>, or <code>Secret</code>. Tag keys are
     * case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * An optional tag value field. For example, <code>111122223333</code>, <code>Production</code>, or a team name.
     * Omitting the tag value is the same as using an empty string. Tag values are case sensitive.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        An array of key-value pairs used to tag a scan. A tag is a custom attribute label with two parts:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A tag key. For example, <code>CostCenter</code>, <code>Environment</code>, or <code>Secret</code>. Tag
     *        keys are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An optional tag value field. For example, <code>111122223333</code>, <code>Production</code>, or a team
     *        name. Omitting the tag value is the same as using an empty string. Tag values are case sensitive.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScanRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateScanRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateScanRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScanRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAnalysisType() != null)
            sb.append("AnalysisType: ").append(getAnalysisType()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getScanName() != null)
            sb.append("ScanName: ").append(getScanName()).append(",");
        if (getScanType() != null)
            sb.append("ScanType: ").append(getScanType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateScanRequest == false)
            return false;
        CreateScanRequest other = (CreateScanRequest) obj;
        if (other.getAnalysisType() == null ^ this.getAnalysisType() == null)
            return false;
        if (other.getAnalysisType() != null && other.getAnalysisType().equals(this.getAnalysisType()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getScanName() == null ^ this.getScanName() == null)
            return false;
        if (other.getScanName() != null && other.getScanName().equals(this.getScanName()) == false)
            return false;
        if (other.getScanType() == null ^ this.getScanType() == null)
            return false;
        if (other.getScanType() != null && other.getScanType().equals(this.getScanType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalysisType() == null) ? 0 : getAnalysisType().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getScanName() == null) ? 0 : getScanName().hashCode());
        hashCode = prime * hashCode + ((getScanType() == null) ? 0 : getScanType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateScanRequest clone() {
        return (CreateScanRequest) super.clone();
    }

}
