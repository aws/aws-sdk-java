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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolFunctionPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSolFunctionPackageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Function package ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * ID of the function package.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Onboarding state of the function package.
     * </p>
     */
    private String onboardingState;
    /**
     * <p>
     * Operational state of the function package.
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
     * Usage state of the function package.
     * </p>
     */
    private String usageState;

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

    public CreateSolFunctionPackageResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * ID of the function package.
     * </p>
     * 
     * @param id
     *        ID of the function package.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * ID of the function package.
     * </p>
     * 
     * @return ID of the function package.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * ID of the function package.
     * </p>
     * 
     * @param id
     *        ID of the function package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolFunctionPackageResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Onboarding state of the function package.
     * </p>
     * 
     * @param onboardingState
     *        Onboarding state of the function package.
     * @see OnboardingState
     */

    public void setOnboardingState(String onboardingState) {
        this.onboardingState = onboardingState;
    }

    /**
     * <p>
     * Onboarding state of the function package.
     * </p>
     * 
     * @return Onboarding state of the function package.
     * @see OnboardingState
     */

    public String getOnboardingState() {
        return this.onboardingState;
    }

    /**
     * <p>
     * Onboarding state of the function package.
     * </p>
     * 
     * @param onboardingState
     *        Onboarding state of the function package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnboardingState
     */

    public CreateSolFunctionPackageResult withOnboardingState(String onboardingState) {
        setOnboardingState(onboardingState);
        return this;
    }

    /**
     * <p>
     * Onboarding state of the function package.
     * </p>
     * 
     * @param onboardingState
     *        Onboarding state of the function package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnboardingState
     */

    public CreateSolFunctionPackageResult withOnboardingState(OnboardingState onboardingState) {
        this.onboardingState = onboardingState.toString();
        return this;
    }

    /**
     * <p>
     * Operational state of the function package.
     * </p>
     * 
     * @param operationalState
     *        Operational state of the function package.
     * @see OperationalState
     */

    public void setOperationalState(String operationalState) {
        this.operationalState = operationalState;
    }

    /**
     * <p>
     * Operational state of the function package.
     * </p>
     * 
     * @return Operational state of the function package.
     * @see OperationalState
     */

    public String getOperationalState() {
        return this.operationalState;
    }

    /**
     * <p>
     * Operational state of the function package.
     * </p>
     * 
     * @param operationalState
     *        Operational state of the function package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationalState
     */

    public CreateSolFunctionPackageResult withOperationalState(String operationalState) {
        setOperationalState(operationalState);
        return this;
    }

    /**
     * <p>
     * Operational state of the function package.
     * </p>
     * 
     * @param operationalState
     *        Operational state of the function package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationalState
     */

    public CreateSolFunctionPackageResult withOperationalState(OperationalState operationalState) {
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

    public CreateSolFunctionPackageResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSolFunctionPackageResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolFunctionPackageResult addTagsEntry(String key, String value) {
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

    public CreateSolFunctionPackageResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Usage state of the function package.
     * </p>
     * 
     * @param usageState
     *        Usage state of the function package.
     * @see UsageState
     */

    public void setUsageState(String usageState) {
        this.usageState = usageState;
    }

    /**
     * <p>
     * Usage state of the function package.
     * </p>
     * 
     * @return Usage state of the function package.
     * @see UsageState
     */

    public String getUsageState() {
        return this.usageState;
    }

    /**
     * <p>
     * Usage state of the function package.
     * </p>
     * 
     * @param usageState
     *        Usage state of the function package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageState
     */

    public CreateSolFunctionPackageResult withUsageState(String usageState) {
        setUsageState(usageState);
        return this;
    }

    /**
     * <p>
     * Usage state of the function package.
     * </p>
     * 
     * @param usageState
     *        Usage state of the function package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageState
     */

    public CreateSolFunctionPackageResult withUsageState(UsageState usageState) {
        this.usageState = usageState.toString();
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
        if (getOnboardingState() != null)
            sb.append("OnboardingState: ").append(getOnboardingState()).append(",");
        if (getOperationalState() != null)
            sb.append("OperationalState: ").append(getOperationalState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getUsageState() != null)
            sb.append("UsageState: ").append(getUsageState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSolFunctionPackageResult == false)
            return false;
        CreateSolFunctionPackageResult other = (CreateSolFunctionPackageResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getOnboardingState() == null) ? 0 : getOnboardingState().hashCode());
        hashCode = prime * hashCode + ((getOperationalState() == null) ? 0 : getOperationalState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUsageState() == null) ? 0 : getUsageState().hashCode());
        return hashCode;
    }

    @Override
    public CreateSolFunctionPackageResult clone() {
        try {
            return (CreateSolFunctionPackageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
