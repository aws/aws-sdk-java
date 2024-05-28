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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreatePrivacyBudgetTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePrivacyBudgetTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The privacy budget template is created in
     * the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * How often the privacy budget refreshes.
     * </p>
     * <important>
     * <p>
     * If you plan to regularly bring new data into the collaboration, you can use <code>CALENDAR_MONTH</code> to
     * automatically get a new privacy budget for the collaboration every calendar month. Choosing this option allows
     * arbitrary amounts of information to be revealed about rows of the data when repeatedly queries across refreshes.
     * Avoid choosing this if the same rows will be repeatedly queried between privacy budget refreshes.
     * </p>
     * </important>
     */
    private String autoRefresh;
    /**
     * <p>
     * Specifies the type of the privacy budget template.
     * </p>
     */
    private String privacyBudgetType;
    /**
     * <p>
     * Specifies your parameters for the privacy budget template.
     * </p>
     */
    private PrivacyBudgetTemplateParametersInput parameters;
    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The privacy budget template is created in
     * the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for one of your memberships for a collaboration. The privacy budget template is
     *        created in the collaboration that this membership belongs to. Accepts a membership ID.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The privacy budget template is created in
     * the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     * 
     * @return A unique identifier for one of your memberships for a collaboration. The privacy budget template is
     *         created in the collaboration that this membership belongs to. Accepts a membership ID.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for one of your memberships for a collaboration. The privacy budget template is created in
     * the collaboration that this membership belongs to. Accepts a membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for one of your memberships for a collaboration. The privacy budget template is
     *        created in the collaboration that this membership belongs to. Accepts a membership ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePrivacyBudgetTemplateRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * How often the privacy budget refreshes.
     * </p>
     * <important>
     * <p>
     * If you plan to regularly bring new data into the collaboration, you can use <code>CALENDAR_MONTH</code> to
     * automatically get a new privacy budget for the collaboration every calendar month. Choosing this option allows
     * arbitrary amounts of information to be revealed about rows of the data when repeatedly queries across refreshes.
     * Avoid choosing this if the same rows will be repeatedly queried between privacy budget refreshes.
     * </p>
     * </important>
     * 
     * @param autoRefresh
     *        How often the privacy budget refreshes.</p> <important>
     *        <p>
     *        If you plan to regularly bring new data into the collaboration, you can use <code>CALENDAR_MONTH</code> to
     *        automatically get a new privacy budget for the collaboration every calendar month. Choosing this option
     *        allows arbitrary amounts of information to be revealed about rows of the data when repeatedly queries
     *        across refreshes. Avoid choosing this if the same rows will be repeatedly queried between privacy budget
     *        refreshes.
     *        </p>
     * @see PrivacyBudgetTemplateAutoRefresh
     */

    public void setAutoRefresh(String autoRefresh) {
        this.autoRefresh = autoRefresh;
    }

    /**
     * <p>
     * How often the privacy budget refreshes.
     * </p>
     * <important>
     * <p>
     * If you plan to regularly bring new data into the collaboration, you can use <code>CALENDAR_MONTH</code> to
     * automatically get a new privacy budget for the collaboration every calendar month. Choosing this option allows
     * arbitrary amounts of information to be revealed about rows of the data when repeatedly queries across refreshes.
     * Avoid choosing this if the same rows will be repeatedly queried between privacy budget refreshes.
     * </p>
     * </important>
     * 
     * @return How often the privacy budget refreshes.</p> <important>
     *         <p>
     *         If you plan to regularly bring new data into the collaboration, you can use <code>CALENDAR_MONTH</code>
     *         to automatically get a new privacy budget for the collaboration every calendar month. Choosing this
     *         option allows arbitrary amounts of information to be revealed about rows of the data when repeatedly
     *         queries across refreshes. Avoid choosing this if the same rows will be repeatedly queried between privacy
     *         budget refreshes.
     *         </p>
     * @see PrivacyBudgetTemplateAutoRefresh
     */

    public String getAutoRefresh() {
        return this.autoRefresh;
    }

    /**
     * <p>
     * How often the privacy budget refreshes.
     * </p>
     * <important>
     * <p>
     * If you plan to regularly bring new data into the collaboration, you can use <code>CALENDAR_MONTH</code> to
     * automatically get a new privacy budget for the collaboration every calendar month. Choosing this option allows
     * arbitrary amounts of information to be revealed about rows of the data when repeatedly queries across refreshes.
     * Avoid choosing this if the same rows will be repeatedly queried between privacy budget refreshes.
     * </p>
     * </important>
     * 
     * @param autoRefresh
     *        How often the privacy budget refreshes.</p> <important>
     *        <p>
     *        If you plan to regularly bring new data into the collaboration, you can use <code>CALENDAR_MONTH</code> to
     *        automatically get a new privacy budget for the collaboration every calendar month. Choosing this option
     *        allows arbitrary amounts of information to be revealed about rows of the data when repeatedly queries
     *        across refreshes. Avoid choosing this if the same rows will be repeatedly queried between privacy budget
     *        refreshes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivacyBudgetTemplateAutoRefresh
     */

    public CreatePrivacyBudgetTemplateRequest withAutoRefresh(String autoRefresh) {
        setAutoRefresh(autoRefresh);
        return this;
    }

    /**
     * <p>
     * How often the privacy budget refreshes.
     * </p>
     * <important>
     * <p>
     * If you plan to regularly bring new data into the collaboration, you can use <code>CALENDAR_MONTH</code> to
     * automatically get a new privacy budget for the collaboration every calendar month. Choosing this option allows
     * arbitrary amounts of information to be revealed about rows of the data when repeatedly queries across refreshes.
     * Avoid choosing this if the same rows will be repeatedly queried between privacy budget refreshes.
     * </p>
     * </important>
     * 
     * @param autoRefresh
     *        How often the privacy budget refreshes.</p> <important>
     *        <p>
     *        If you plan to regularly bring new data into the collaboration, you can use <code>CALENDAR_MONTH</code> to
     *        automatically get a new privacy budget for the collaboration every calendar month. Choosing this option
     *        allows arbitrary amounts of information to be revealed about rows of the data when repeatedly queries
     *        across refreshes. Avoid choosing this if the same rows will be repeatedly queried between privacy budget
     *        refreshes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivacyBudgetTemplateAutoRefresh
     */

    public CreatePrivacyBudgetTemplateRequest withAutoRefresh(PrivacyBudgetTemplateAutoRefresh autoRefresh) {
        this.autoRefresh = autoRefresh.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget template.
     * </p>
     * 
     * @param privacyBudgetType
     *        Specifies the type of the privacy budget template.
     * @see PrivacyBudgetType
     */

    public void setPrivacyBudgetType(String privacyBudgetType) {
        this.privacyBudgetType = privacyBudgetType;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget template.
     * </p>
     * 
     * @return Specifies the type of the privacy budget template.
     * @see PrivacyBudgetType
     */

    public String getPrivacyBudgetType() {
        return this.privacyBudgetType;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget template.
     * </p>
     * 
     * @param privacyBudgetType
     *        Specifies the type of the privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivacyBudgetType
     */

    public CreatePrivacyBudgetTemplateRequest withPrivacyBudgetType(String privacyBudgetType) {
        setPrivacyBudgetType(privacyBudgetType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget template.
     * </p>
     * 
     * @param privacyBudgetType
     *        Specifies the type of the privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivacyBudgetType
     */

    public CreatePrivacyBudgetTemplateRequest withPrivacyBudgetType(PrivacyBudgetType privacyBudgetType) {
        this.privacyBudgetType = privacyBudgetType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies your parameters for the privacy budget template.
     * </p>
     * 
     * @param parameters
     *        Specifies your parameters for the privacy budget template.
     */

    public void setParameters(PrivacyBudgetTemplateParametersInput parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Specifies your parameters for the privacy budget template.
     * </p>
     * 
     * @return Specifies your parameters for the privacy budget template.
     */

    public PrivacyBudgetTemplateParametersInput getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * Specifies your parameters for the privacy budget template.
     * </p>
     * 
     * @param parameters
     *        Specifies your parameters for the privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePrivacyBudgetTemplateRequest withParameters(PrivacyBudgetTemplateParametersInput parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     * 
     * @return An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     *         optional value, both of which you define. When you use tagging, you can also use tag-based access control
     *         in IAM policies to control access to this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     * 
     * @param tags
     *        An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     *        optional value, both of which you define. When you use tagging, you can also use tag-based access control
     *        in IAM policies to control access to this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     * optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM
     * policies to control access to this resource.
     * </p>
     * 
     * @param tags
     *        An optional label that you can assign to a resource when you create it. Each tag consists of a key and an
     *        optional value, both of which you define. When you use tagging, you can also use tag-based access control
     *        in IAM policies to control access to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePrivacyBudgetTemplateRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreatePrivacyBudgetTemplateRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreatePrivacyBudgetTemplateRequest addTagsEntry(String key, String value) {
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

    public CreatePrivacyBudgetTemplateRequest clearTagsEntries() {
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
        if (getMembershipIdentifier() != null)
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getAutoRefresh() != null)
            sb.append("AutoRefresh: ").append(getAutoRefresh()).append(",");
        if (getPrivacyBudgetType() != null)
            sb.append("PrivacyBudgetType: ").append(getPrivacyBudgetType()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
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

        if (obj instanceof CreatePrivacyBudgetTemplateRequest == false)
            return false;
        CreatePrivacyBudgetTemplateRequest other = (CreatePrivacyBudgetTemplateRequest) obj;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getAutoRefresh() == null ^ this.getAutoRefresh() == null)
            return false;
        if (other.getAutoRefresh() != null && other.getAutoRefresh().equals(this.getAutoRefresh()) == false)
            return false;
        if (other.getPrivacyBudgetType() == null ^ this.getPrivacyBudgetType() == null)
            return false;
        if (other.getPrivacyBudgetType() != null && other.getPrivacyBudgetType().equals(this.getPrivacyBudgetType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
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

        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAutoRefresh() == null) ? 0 : getAutoRefresh().hashCode());
        hashCode = prime * hashCode + ((getPrivacyBudgetType() == null) ? 0 : getPrivacyBudgetType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePrivacyBudgetTemplateRequest clone() {
        return (CreatePrivacyBudgetTemplateRequest) super.clone();
    }

}
