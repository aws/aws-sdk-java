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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolNetworkPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolNetworkPackageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Network package ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Network package ID.
     * </p>
     */
    private String id;

    private GetSolNetworkPackageMetadata metadata;
    /**
     * <p>
     * Network service descriptor ID.
     * </p>
     */
    private String nsdId;
    /**
     * <p>
     * Network service descriptor name.
     * </p>
     */
    private String nsdName;
    /**
     * <p>
     * Network service descriptor onboarding state.
     * </p>
     */
    private String nsdOnboardingState;
    /**
     * <p>
     * Network service descriptor operational state.
     * </p>
     */
    private String nsdOperationalState;
    /**
     * <p>
     * Network service descriptor usage state.
     * </p>
     */
    private String nsdUsageState;
    /**
     * <p>
     * Network service descriptor version.
     * </p>
     */
    private String nsdVersion;
    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Identifies the function package for the function package descriptor referenced by the onboarded network package.
     * </p>
     */
    private java.util.List<String> vnfPkgIds;

    /**
     * <p>
     * Network package ARN.
     * </p>
     * 
     * @param arn
     *        Network package ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Network package ARN.
     * </p>
     * 
     * @return Network package ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Network package ARN.
     * </p>
     * 
     * @param arn
     *        Network package ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkPackageResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Network package ID.
     * </p>
     * 
     * @param id
     *        Network package ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Network package ID.
     * </p>
     * 
     * @return Network package ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Network package ID.
     * </p>
     * 
     * @param id
     *        Network package ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkPackageResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param metadata
     */

    public void setMetadata(GetSolNetworkPackageMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * @return
     */

    public GetSolNetworkPackageMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * @param metadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkPackageResult withMetadata(GetSolNetworkPackageMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * Network service descriptor ID.
     * </p>
     * 
     * @param nsdId
     *        Network service descriptor ID.
     */

    public void setNsdId(String nsdId) {
        this.nsdId = nsdId;
    }

    /**
     * <p>
     * Network service descriptor ID.
     * </p>
     * 
     * @return Network service descriptor ID.
     */

    public String getNsdId() {
        return this.nsdId;
    }

    /**
     * <p>
     * Network service descriptor ID.
     * </p>
     * 
     * @param nsdId
     *        Network service descriptor ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkPackageResult withNsdId(String nsdId) {
        setNsdId(nsdId);
        return this;
    }

    /**
     * <p>
     * Network service descriptor name.
     * </p>
     * 
     * @param nsdName
     *        Network service descriptor name.
     */

    public void setNsdName(String nsdName) {
        this.nsdName = nsdName;
    }

    /**
     * <p>
     * Network service descriptor name.
     * </p>
     * 
     * @return Network service descriptor name.
     */

    public String getNsdName() {
        return this.nsdName;
    }

    /**
     * <p>
     * Network service descriptor name.
     * </p>
     * 
     * @param nsdName
     *        Network service descriptor name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkPackageResult withNsdName(String nsdName) {
        setNsdName(nsdName);
        return this;
    }

    /**
     * <p>
     * Network service descriptor onboarding state.
     * </p>
     * 
     * @param nsdOnboardingState
     *        Network service descriptor onboarding state.
     * @see NsdOnboardingState
     */

    public void setNsdOnboardingState(String nsdOnboardingState) {
        this.nsdOnboardingState = nsdOnboardingState;
    }

    /**
     * <p>
     * Network service descriptor onboarding state.
     * </p>
     * 
     * @return Network service descriptor onboarding state.
     * @see NsdOnboardingState
     */

    public String getNsdOnboardingState() {
        return this.nsdOnboardingState;
    }

    /**
     * <p>
     * Network service descriptor onboarding state.
     * </p>
     * 
     * @param nsdOnboardingState
     *        Network service descriptor onboarding state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdOnboardingState
     */

    public GetSolNetworkPackageResult withNsdOnboardingState(String nsdOnboardingState) {
        setNsdOnboardingState(nsdOnboardingState);
        return this;
    }

    /**
     * <p>
     * Network service descriptor onboarding state.
     * </p>
     * 
     * @param nsdOnboardingState
     *        Network service descriptor onboarding state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdOnboardingState
     */

    public GetSolNetworkPackageResult withNsdOnboardingState(NsdOnboardingState nsdOnboardingState) {
        this.nsdOnboardingState = nsdOnboardingState.toString();
        return this;
    }

    /**
     * <p>
     * Network service descriptor operational state.
     * </p>
     * 
     * @param nsdOperationalState
     *        Network service descriptor operational state.
     * @see NsdOperationalState
     */

    public void setNsdOperationalState(String nsdOperationalState) {
        this.nsdOperationalState = nsdOperationalState;
    }

    /**
     * <p>
     * Network service descriptor operational state.
     * </p>
     * 
     * @return Network service descriptor operational state.
     * @see NsdOperationalState
     */

    public String getNsdOperationalState() {
        return this.nsdOperationalState;
    }

    /**
     * <p>
     * Network service descriptor operational state.
     * </p>
     * 
     * @param nsdOperationalState
     *        Network service descriptor operational state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdOperationalState
     */

    public GetSolNetworkPackageResult withNsdOperationalState(String nsdOperationalState) {
        setNsdOperationalState(nsdOperationalState);
        return this;
    }

    /**
     * <p>
     * Network service descriptor operational state.
     * </p>
     * 
     * @param nsdOperationalState
     *        Network service descriptor operational state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdOperationalState
     */

    public GetSolNetworkPackageResult withNsdOperationalState(NsdOperationalState nsdOperationalState) {
        this.nsdOperationalState = nsdOperationalState.toString();
        return this;
    }

    /**
     * <p>
     * Network service descriptor usage state.
     * </p>
     * 
     * @param nsdUsageState
     *        Network service descriptor usage state.
     * @see NsdUsageState
     */

    public void setNsdUsageState(String nsdUsageState) {
        this.nsdUsageState = nsdUsageState;
    }

    /**
     * <p>
     * Network service descriptor usage state.
     * </p>
     * 
     * @return Network service descriptor usage state.
     * @see NsdUsageState
     */

    public String getNsdUsageState() {
        return this.nsdUsageState;
    }

    /**
     * <p>
     * Network service descriptor usage state.
     * </p>
     * 
     * @param nsdUsageState
     *        Network service descriptor usage state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdUsageState
     */

    public GetSolNetworkPackageResult withNsdUsageState(String nsdUsageState) {
        setNsdUsageState(nsdUsageState);
        return this;
    }

    /**
     * <p>
     * Network service descriptor usage state.
     * </p>
     * 
     * @param nsdUsageState
     *        Network service descriptor usage state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdUsageState
     */

    public GetSolNetworkPackageResult withNsdUsageState(NsdUsageState nsdUsageState) {
        this.nsdUsageState = nsdUsageState.toString();
        return this;
    }

    /**
     * <p>
     * Network service descriptor version.
     * </p>
     * 
     * @param nsdVersion
     *        Network service descriptor version.
     */

    public void setNsdVersion(String nsdVersion) {
        this.nsdVersion = nsdVersion;
    }

    /**
     * <p>
     * Network service descriptor version.
     * </p>
     * 
     * @return Network service descriptor version.
     */

    public String getNsdVersion() {
        return this.nsdVersion;
    }

    /**
     * <p>
     * Network service descriptor version.
     * </p>
     * 
     * @param nsdVersion
     *        Network service descriptor version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkPackageResult withNsdVersion(String nsdVersion) {
        setNsdVersion(nsdVersion);
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

    public GetSolNetworkPackageResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetSolNetworkPackageResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkPackageResult addTagsEntry(String key, String value) {
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

    public GetSolNetworkPackageResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Identifies the function package for the function package descriptor referenced by the onboarded network package.
     * </p>
     * 
     * @return Identifies the function package for the function package descriptor referenced by the onboarded network
     *         package.
     */

    public java.util.List<String> getVnfPkgIds() {
        return vnfPkgIds;
    }

    /**
     * <p>
     * Identifies the function package for the function package descriptor referenced by the onboarded network package.
     * </p>
     * 
     * @param vnfPkgIds
     *        Identifies the function package for the function package descriptor referenced by the onboarded network
     *        package.
     */

    public void setVnfPkgIds(java.util.Collection<String> vnfPkgIds) {
        if (vnfPkgIds == null) {
            this.vnfPkgIds = null;
            return;
        }

        this.vnfPkgIds = new java.util.ArrayList<String>(vnfPkgIds);
    }

    /**
     * <p>
     * Identifies the function package for the function package descriptor referenced by the onboarded network package.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVnfPkgIds(java.util.Collection)} or {@link #withVnfPkgIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vnfPkgIds
     *        Identifies the function package for the function package descriptor referenced by the onboarded network
     *        package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkPackageResult withVnfPkgIds(String... vnfPkgIds) {
        if (this.vnfPkgIds == null) {
            setVnfPkgIds(new java.util.ArrayList<String>(vnfPkgIds.length));
        }
        for (String ele : vnfPkgIds) {
            this.vnfPkgIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Identifies the function package for the function package descriptor referenced by the onboarded network package.
     * </p>
     * 
     * @param vnfPkgIds
     *        Identifies the function package for the function package descriptor referenced by the onboarded network
     *        package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolNetworkPackageResult withVnfPkgIds(java.util.Collection<String> vnfPkgIds) {
        setVnfPkgIds(vnfPkgIds);
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
        if (getNsdId() != null)
            sb.append("NsdId: ").append(getNsdId()).append(",");
        if (getNsdName() != null)
            sb.append("NsdName: ").append(getNsdName()).append(",");
        if (getNsdOnboardingState() != null)
            sb.append("NsdOnboardingState: ").append(getNsdOnboardingState()).append(",");
        if (getNsdOperationalState() != null)
            sb.append("NsdOperationalState: ").append(getNsdOperationalState()).append(",");
        if (getNsdUsageState() != null)
            sb.append("NsdUsageState: ").append(getNsdUsageState()).append(",");
        if (getNsdVersion() != null)
            sb.append("NsdVersion: ").append(getNsdVersion()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getVnfPkgIds() != null)
            sb.append("VnfPkgIds: ").append(getVnfPkgIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolNetworkPackageResult == false)
            return false;
        GetSolNetworkPackageResult other = (GetSolNetworkPackageResult) obj;
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
        if (other.getNsdId() == null ^ this.getNsdId() == null)
            return false;
        if (other.getNsdId() != null && other.getNsdId().equals(this.getNsdId()) == false)
            return false;
        if (other.getNsdName() == null ^ this.getNsdName() == null)
            return false;
        if (other.getNsdName() != null && other.getNsdName().equals(this.getNsdName()) == false)
            return false;
        if (other.getNsdOnboardingState() == null ^ this.getNsdOnboardingState() == null)
            return false;
        if (other.getNsdOnboardingState() != null && other.getNsdOnboardingState().equals(this.getNsdOnboardingState()) == false)
            return false;
        if (other.getNsdOperationalState() == null ^ this.getNsdOperationalState() == null)
            return false;
        if (other.getNsdOperationalState() != null && other.getNsdOperationalState().equals(this.getNsdOperationalState()) == false)
            return false;
        if (other.getNsdUsageState() == null ^ this.getNsdUsageState() == null)
            return false;
        if (other.getNsdUsageState() != null && other.getNsdUsageState().equals(this.getNsdUsageState()) == false)
            return false;
        if (other.getNsdVersion() == null ^ this.getNsdVersion() == null)
            return false;
        if (other.getNsdVersion() != null && other.getNsdVersion().equals(this.getNsdVersion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVnfPkgIds() == null ^ this.getVnfPkgIds() == null)
            return false;
        if (other.getVnfPkgIds() != null && other.getVnfPkgIds().equals(this.getVnfPkgIds()) == false)
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
        hashCode = prime * hashCode + ((getNsdId() == null) ? 0 : getNsdId().hashCode());
        hashCode = prime * hashCode + ((getNsdName() == null) ? 0 : getNsdName().hashCode());
        hashCode = prime * hashCode + ((getNsdOnboardingState() == null) ? 0 : getNsdOnboardingState().hashCode());
        hashCode = prime * hashCode + ((getNsdOperationalState() == null) ? 0 : getNsdOperationalState().hashCode());
        hashCode = prime * hashCode + ((getNsdUsageState() == null) ? 0 : getNsdUsageState().hashCode());
        hashCode = prime * hashCode + ((getNsdVersion() == null) ? 0 : getNsdVersion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVnfPkgIds() == null) ? 0 : getVnfPkgIds().hashCode());
        return hashCode;
    }

    @Override
    public GetSolNetworkPackageResult clone() {
        try {
            return (GetSolNetworkPackageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
