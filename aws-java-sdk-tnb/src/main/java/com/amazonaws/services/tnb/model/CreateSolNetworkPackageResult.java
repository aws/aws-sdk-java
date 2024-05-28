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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolNetworkPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSolNetworkPackageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Network package ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * ID of the network package.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Onboarding state of the network service descriptor in the network package.
     * </p>
     */
    private String nsdOnboardingState;
    /**
     * <p>
     * Operational state of the network service descriptor in the network package.
     * </p>
     */
    private String nsdOperationalState;
    /**
     * <p>
     * Usage state of the network service descriptor in the network package.
     * </p>
     */
    private String nsdUsageState;
    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     */
    private java.util.Map<String, String> tags;

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

    public CreateSolNetworkPackageResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * ID of the network package.
     * </p>
     * 
     * @param id
     *        ID of the network package.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * ID of the network package.
     * </p>
     * 
     * @return ID of the network package.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * ID of the network package.
     * </p>
     * 
     * @param id
     *        ID of the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolNetworkPackageResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Onboarding state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdOnboardingState
     *        Onboarding state of the network service descriptor in the network package.
     * @see NsdOnboardingState
     */

    public void setNsdOnboardingState(String nsdOnboardingState) {
        this.nsdOnboardingState = nsdOnboardingState;
    }

    /**
     * <p>
     * Onboarding state of the network service descriptor in the network package.
     * </p>
     * 
     * @return Onboarding state of the network service descriptor in the network package.
     * @see NsdOnboardingState
     */

    public String getNsdOnboardingState() {
        return this.nsdOnboardingState;
    }

    /**
     * <p>
     * Onboarding state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdOnboardingState
     *        Onboarding state of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdOnboardingState
     */

    public CreateSolNetworkPackageResult withNsdOnboardingState(String nsdOnboardingState) {
        setNsdOnboardingState(nsdOnboardingState);
        return this;
    }

    /**
     * <p>
     * Onboarding state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdOnboardingState
     *        Onboarding state of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdOnboardingState
     */

    public CreateSolNetworkPackageResult withNsdOnboardingState(NsdOnboardingState nsdOnboardingState) {
        this.nsdOnboardingState = nsdOnboardingState.toString();
        return this;
    }

    /**
     * <p>
     * Operational state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdOperationalState
     *        Operational state of the network service descriptor in the network package.
     * @see NsdOperationalState
     */

    public void setNsdOperationalState(String nsdOperationalState) {
        this.nsdOperationalState = nsdOperationalState;
    }

    /**
     * <p>
     * Operational state of the network service descriptor in the network package.
     * </p>
     * 
     * @return Operational state of the network service descriptor in the network package.
     * @see NsdOperationalState
     */

    public String getNsdOperationalState() {
        return this.nsdOperationalState;
    }

    /**
     * <p>
     * Operational state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdOperationalState
     *        Operational state of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdOperationalState
     */

    public CreateSolNetworkPackageResult withNsdOperationalState(String nsdOperationalState) {
        setNsdOperationalState(nsdOperationalState);
        return this;
    }

    /**
     * <p>
     * Operational state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdOperationalState
     *        Operational state of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdOperationalState
     */

    public CreateSolNetworkPackageResult withNsdOperationalState(NsdOperationalState nsdOperationalState) {
        this.nsdOperationalState = nsdOperationalState.toString();
        return this;
    }

    /**
     * <p>
     * Usage state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdUsageState
     *        Usage state of the network service descriptor in the network package.
     * @see NsdUsageState
     */

    public void setNsdUsageState(String nsdUsageState) {
        this.nsdUsageState = nsdUsageState;
    }

    /**
     * <p>
     * Usage state of the network service descriptor in the network package.
     * </p>
     * 
     * @return Usage state of the network service descriptor in the network package.
     * @see NsdUsageState
     */

    public String getNsdUsageState() {
        return this.nsdUsageState;
    }

    /**
     * <p>
     * Usage state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdUsageState
     *        Usage state of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdUsageState
     */

    public CreateSolNetworkPackageResult withNsdUsageState(String nsdUsageState) {
        setNsdUsageState(nsdUsageState);
        return this;
    }

    /**
     * <p>
     * Usage state of the network service descriptor in the network package.
     * </p>
     * 
     * @param nsdUsageState
     *        Usage state of the network service descriptor in the network package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NsdUsageState
     */

    public CreateSolNetworkPackageResult withNsdUsageState(NsdUsageState nsdUsageState) {
        this.nsdUsageState = nsdUsageState.toString();
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

    public CreateSolNetworkPackageResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSolNetworkPackageResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolNetworkPackageResult addTagsEntry(String key, String value) {
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

    public CreateSolNetworkPackageResult clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getNsdOnboardingState() != null)
            sb.append("NsdOnboardingState: ").append(getNsdOnboardingState()).append(",");
        if (getNsdOperationalState() != null)
            sb.append("NsdOperationalState: ").append(getNsdOperationalState()).append(",");
        if (getNsdUsageState() != null)
            sb.append("NsdUsageState: ").append(getNsdUsageState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSolNetworkPackageResult == false)
            return false;
        CreateSolNetworkPackageResult other = (CreateSolNetworkPackageResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getNsdOnboardingState() == null) ? 0 : getNsdOnboardingState().hashCode());
        hashCode = prime * hashCode + ((getNsdOperationalState() == null) ? 0 : getNsdOperationalState().hashCode());
        hashCode = prime * hashCode + ((getNsdUsageState() == null) ? 0 : getNsdUsageState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSolNetworkPackageResult clone() {
        try {
            return (CreateSolNetworkPackageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
