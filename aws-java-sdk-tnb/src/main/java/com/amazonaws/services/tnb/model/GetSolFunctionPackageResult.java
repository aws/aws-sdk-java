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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolFunctionPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolFunctionPackageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Function package ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Function package ID.
     * </p>
     */
    private String id;

    private GetSolFunctionPackageMetadata metadata;
    /**
     * <p>
     * Function package onboarding state.
     * </p>
     */
    private String onboardingState;
    /**
     * <p>
     * Function package operational state.
     * </p>
     */
    private String operationalState;
    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Function package usage state.
     * </p>
     */
    private String usageState;
    /**
     * <p>
     * Network function product name.
     * </p>
     */
    private String vnfProductName;
    /**
     * <p>
     * Network function provider.
     * </p>
     */
    private String vnfProvider;
    /**
     * <p>
     * Function package descriptor ID.
     * </p>
     */
    private String vnfdId;
    /**
     * <p>
     * Function package descriptor version.
     * </p>
     */
    private String vnfdVersion;

    /**
     * <p>
     * Function package ARN.
     * </p>
     * 
     * @param arn
     *        Function package ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Function package ARN.
     * </p>
     * 
     * @return Function package ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Function package ARN.
     * </p>
     * 
     * @param arn
     *        Function package ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionPackageResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Function package ID.
     * </p>
     * 
     * @param id
     *        Function package ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Function package ID.
     * </p>
     * 
     * @return Function package ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Function package ID.
     * </p>
     * 
     * @param id
     *        Function package ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionPackageResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param metadata
     */

    public void setMetadata(GetSolFunctionPackageMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * @return
     */

    public GetSolFunctionPackageMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * @param metadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionPackageResult withMetadata(GetSolFunctionPackageMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * Function package onboarding state.
     * </p>
     * 
     * @param onboardingState
     *        Function package onboarding state.
     * @see OnboardingState
     */

    public void setOnboardingState(String onboardingState) {
        this.onboardingState = onboardingState;
    }

    /**
     * <p>
     * Function package onboarding state.
     * </p>
     * 
     * @return Function package onboarding state.
     * @see OnboardingState
     */

    public String getOnboardingState() {
        return this.onboardingState;
    }

    /**
     * <p>
     * Function package onboarding state.
     * </p>
     * 
     * @param onboardingState
     *        Function package onboarding state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnboardingState
     */

    public GetSolFunctionPackageResult withOnboardingState(String onboardingState) {
        setOnboardingState(onboardingState);
        return this;
    }

    /**
     * <p>
     * Function package onboarding state.
     * </p>
     * 
     * @param onboardingState
     *        Function package onboarding state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnboardingState
     */

    public GetSolFunctionPackageResult withOnboardingState(OnboardingState onboardingState) {
        this.onboardingState = onboardingState.toString();
        return this;
    }

    /**
     * <p>
     * Function package operational state.
     * </p>
     * 
     * @param operationalState
     *        Function package operational state.
     * @see OperationalState
     */

    public void setOperationalState(String operationalState) {
        this.operationalState = operationalState;
    }

    /**
     * <p>
     * Function package operational state.
     * </p>
     * 
     * @return Function package operational state.
     * @see OperationalState
     */

    public String getOperationalState() {
        return this.operationalState;
    }

    /**
     * <p>
     * Function package operational state.
     * </p>
     * 
     * @param operationalState
     *        Function package operational state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationalState
     */

    public GetSolFunctionPackageResult withOperationalState(String operationalState) {
        setOperationalState(operationalState);
        return this;
    }

    /**
     * <p>
     * Function package operational state.
     * </p>
     * 
     * @param operationalState
     *        Function package operational state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationalState
     */

    public GetSolFunctionPackageResult withOperationalState(OperationalState operationalState) {
        this.operationalState = operationalState.toString();
        return this;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @return A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *         optional value. You can use tags to search and filter your resources or track your Amazon Web Services
     *         costs.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @param tags
     *        A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *        optional value. You can use tags to search and filter your resources or track your Amazon Web Services
     *        costs.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @param tags
     *        A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *        optional value. You can use tags to search and filter your resources or track your Amazon Web Services
     *        costs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionPackageResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetSolFunctionPackageResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionPackageResult addTagsEntry(String key, String value) {
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

    public GetSolFunctionPackageResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Function package usage state.
     * </p>
     * 
     * @param usageState
     *        Function package usage state.
     * @see UsageState
     */

    public void setUsageState(String usageState) {
        this.usageState = usageState;
    }

    /**
     * <p>
     * Function package usage state.
     * </p>
     * 
     * @return Function package usage state.
     * @see UsageState
     */

    public String getUsageState() {
        return this.usageState;
    }

    /**
     * <p>
     * Function package usage state.
     * </p>
     * 
     * @param usageState
     *        Function package usage state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageState
     */

    public GetSolFunctionPackageResult withUsageState(String usageState) {
        setUsageState(usageState);
        return this;
    }

    /**
     * <p>
     * Function package usage state.
     * </p>
     * 
     * @param usageState
     *        Function package usage state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageState
     */

    public GetSolFunctionPackageResult withUsageState(UsageState usageState) {
        this.usageState = usageState.toString();
        return this;
    }

    /**
     * <p>
     * Network function product name.
     * </p>
     * 
     * @param vnfProductName
     *        Network function product name.
     */

    public void setVnfProductName(String vnfProductName) {
        this.vnfProductName = vnfProductName;
    }

    /**
     * <p>
     * Network function product name.
     * </p>
     * 
     * @return Network function product name.
     */

    public String getVnfProductName() {
        return this.vnfProductName;
    }

    /**
     * <p>
     * Network function product name.
     * </p>
     * 
     * @param vnfProductName
     *        Network function product name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionPackageResult withVnfProductName(String vnfProductName) {
        setVnfProductName(vnfProductName);
        return this;
    }

    /**
     * <p>
     * Network function provider.
     * </p>
     * 
     * @param vnfProvider
     *        Network function provider.
     */

    public void setVnfProvider(String vnfProvider) {
        this.vnfProvider = vnfProvider;
    }

    /**
     * <p>
     * Network function provider.
     * </p>
     * 
     * @return Network function provider.
     */

    public String getVnfProvider() {
        return this.vnfProvider;
    }

    /**
     * <p>
     * Network function provider.
     * </p>
     * 
     * @param vnfProvider
     *        Network function provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionPackageResult withVnfProvider(String vnfProvider) {
        setVnfProvider(vnfProvider);
        return this;
    }

    /**
     * <p>
     * Function package descriptor ID.
     * </p>
     * 
     * @param vnfdId
     *        Function package descriptor ID.
     */

    public void setVnfdId(String vnfdId) {
        this.vnfdId = vnfdId;
    }

    /**
     * <p>
     * Function package descriptor ID.
     * </p>
     * 
     * @return Function package descriptor ID.
     */

    public String getVnfdId() {
        return this.vnfdId;
    }

    /**
     * <p>
     * Function package descriptor ID.
     * </p>
     * 
     * @param vnfdId
     *        Function package descriptor ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionPackageResult withVnfdId(String vnfdId) {
        setVnfdId(vnfdId);
        return this;
    }

    /**
     * <p>
     * Function package descriptor version.
     * </p>
     * 
     * @param vnfdVersion
     *        Function package descriptor version.
     */

    public void setVnfdVersion(String vnfdVersion) {
        this.vnfdVersion = vnfdVersion;
    }

    /**
     * <p>
     * Function package descriptor version.
     * </p>
     * 
     * @return Function package descriptor version.
     */

    public String getVnfdVersion() {
        return this.vnfdVersion;
    }

    /**
     * <p>
     * Function package descriptor version.
     * </p>
     * 
     * @param vnfdVersion
     *        Function package descriptor version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolFunctionPackageResult withVnfdVersion(String vnfdVersion) {
        setVnfdVersion(vnfdVersion);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getOnboardingState() != null)
            sb.append("OnboardingState: ").append(getOnboardingState()).append(",");
        if (getOperationalState() != null)
            sb.append("OperationalState: ").append(getOperationalState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getUsageState() != null)
            sb.append("UsageState: ").append(getUsageState()).append(",");
        if (getVnfProductName() != null)
            sb.append("VnfProductName: ").append(getVnfProductName()).append(",");
        if (getVnfProvider() != null)
            sb.append("VnfProvider: ").append(getVnfProvider()).append(",");
        if (getVnfdId() != null)
            sb.append("VnfdId: ").append(getVnfdId()).append(",");
        if (getVnfdVersion() != null)
            sb.append("VnfdVersion: ").append(getVnfdVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolFunctionPackageResult == false)
            return false;
        GetSolFunctionPackageResult other = (GetSolFunctionPackageResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getOnboardingState() == null ^ this.getOnboardingState() == null)
            return false;
        if (other.getOnboardingState() != null && other.getOnboardingState().equals(this.getOnboardingState()) == false)
            return false;
        if (other.getOperationalState() == null ^ this.getOperationalState() == null)
            return false;
        if (other.getOperationalState() != null && other.getOperationalState().equals(this.getOperationalState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUsageState() == null ^ this.getUsageState() == null)
            return false;
        if (other.getUsageState() != null && other.getUsageState().equals(this.getUsageState()) == false)
            return false;
        if (other.getVnfProductName() == null ^ this.getVnfProductName() == null)
            return false;
        if (other.getVnfProductName() != null && other.getVnfProductName().equals(this.getVnfProductName()) == false)
            return false;
        if (other.getVnfProvider() == null ^ this.getVnfProvider() == null)
            return false;
        if (other.getVnfProvider() != null && other.getVnfProvider().equals(this.getVnfProvider()) == false)
            return false;
        if (other.getVnfdId() == null ^ this.getVnfdId() == null)
            return false;
        if (other.getVnfdId() != null && other.getVnfdId().equals(this.getVnfdId()) == false)
            return false;
        if (other.getVnfdVersion() == null ^ this.getVnfdVersion() == null)
            return false;
        if (other.getVnfdVersion() != null && other.getVnfdVersion().equals(this.getVnfdVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getOnboardingState() == null) ? 0 : getOnboardingState().hashCode());
        hashCode = prime * hashCode + ((getOperationalState() == null) ? 0 : getOperationalState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUsageState() == null) ? 0 : getUsageState().hashCode());
        hashCode = prime * hashCode + ((getVnfProductName() == null) ? 0 : getVnfProductName().hashCode());
        hashCode = prime * hashCode + ((getVnfProvider() == null) ? 0 : getVnfProvider().hashCode());
        hashCode = prime * hashCode + ((getVnfdId() == null) ? 0 : getVnfdId().hashCode());
        hashCode = prime * hashCode + ((getVnfdVersion() == null) ? 0 : getVnfdVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetSolFunctionPackageResult clone() {
        try {
            return (GetSolFunctionPackageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
