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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateMembership" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMembershipRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID for the associated collaboration.
     * </p>
     */
    private String collaborationIdentifier;
    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the membership.
     * </p>
     */
    private String queryLogStatus;
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
     * The default protected query result configuration as specified by the member who can receive results.
     * </p>
     */
    private MembershipProtectedQueryResultConfiguration defaultResultConfiguration;
    /**
     * <p>
     * The payment responsibilities accepted by the collaboration member.
     * </p>
     * <p>
     * Not required if the collaboration member has the member ability to run queries.
     * </p>
     * <p>
     * Required if the collaboration member doesn't have the member ability to run queries but is configured as a payer
     * by the collaboration creator.
     * </p>
     */
    private MembershipPaymentConfiguration paymentConfiguration;

    /**
     * <p>
     * The unique ID for the associated collaboration.
     * </p>
     * 
     * @param collaborationIdentifier
     *        The unique ID for the associated collaboration.
     */

    public void setCollaborationIdentifier(String collaborationIdentifier) {
        this.collaborationIdentifier = collaborationIdentifier;
    }

    /**
     * <p>
     * The unique ID for the associated collaboration.
     * </p>
     * 
     * @return The unique ID for the associated collaboration.
     */

    public String getCollaborationIdentifier() {
        return this.collaborationIdentifier;
    }

    /**
     * <p>
     * The unique ID for the associated collaboration.
     * </p>
     * 
     * @param collaborationIdentifier
     *        The unique ID for the associated collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembershipRequest withCollaborationIdentifier(String collaborationIdentifier) {
        setCollaborationIdentifier(collaborationIdentifier);
        return this;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the membership.
     * </p>
     * 
     * @param queryLogStatus
     *        An indicator as to whether query logging has been enabled or disabled for the membership.
     * @see MembershipQueryLogStatus
     */

    public void setQueryLogStatus(String queryLogStatus) {
        this.queryLogStatus = queryLogStatus;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the membership.
     * </p>
     * 
     * @return An indicator as to whether query logging has been enabled or disabled for the membership.
     * @see MembershipQueryLogStatus
     */

    public String getQueryLogStatus() {
        return this.queryLogStatus;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the membership.
     * </p>
     * 
     * @param queryLogStatus
     *        An indicator as to whether query logging has been enabled or disabled for the membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipQueryLogStatus
     */

    public CreateMembershipRequest withQueryLogStatus(String queryLogStatus) {
        setQueryLogStatus(queryLogStatus);
        return this;
    }

    /**
     * <p>
     * An indicator as to whether query logging has been enabled or disabled for the membership.
     * </p>
     * 
     * @param queryLogStatus
     *        An indicator as to whether query logging has been enabled or disabled for the membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipQueryLogStatus
     */

    public CreateMembershipRequest withQueryLogStatus(MembershipQueryLogStatus queryLogStatus) {
        this.queryLogStatus = queryLogStatus.toString();
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

    public CreateMembershipRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateMembershipRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembershipRequest addTagsEntry(String key, String value) {
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

    public CreateMembershipRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The default protected query result configuration as specified by the member who can receive results.
     * </p>
     * 
     * @param defaultResultConfiguration
     *        The default protected query result configuration as specified by the member who can receive results.
     */

    public void setDefaultResultConfiguration(MembershipProtectedQueryResultConfiguration defaultResultConfiguration) {
        this.defaultResultConfiguration = defaultResultConfiguration;
    }

    /**
     * <p>
     * The default protected query result configuration as specified by the member who can receive results.
     * </p>
     * 
     * @return The default protected query result configuration as specified by the member who can receive results.
     */

    public MembershipProtectedQueryResultConfiguration getDefaultResultConfiguration() {
        return this.defaultResultConfiguration;
    }

    /**
     * <p>
     * The default protected query result configuration as specified by the member who can receive results.
     * </p>
     * 
     * @param defaultResultConfiguration
     *        The default protected query result configuration as specified by the member who can receive results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembershipRequest withDefaultResultConfiguration(MembershipProtectedQueryResultConfiguration defaultResultConfiguration) {
        setDefaultResultConfiguration(defaultResultConfiguration);
        return this;
    }

    /**
     * <p>
     * The payment responsibilities accepted by the collaboration member.
     * </p>
     * <p>
     * Not required if the collaboration member has the member ability to run queries.
     * </p>
     * <p>
     * Required if the collaboration member doesn't have the member ability to run queries but is configured as a payer
     * by the collaboration creator.
     * </p>
     * 
     * @param paymentConfiguration
     *        The payment responsibilities accepted by the collaboration member.</p>
     *        <p>
     *        Not required if the collaboration member has the member ability to run queries.
     *        </p>
     *        <p>
     *        Required if the collaboration member doesn't have the member ability to run queries but is configured as a
     *        payer by the collaboration creator.
     */

    public void setPaymentConfiguration(MembershipPaymentConfiguration paymentConfiguration) {
        this.paymentConfiguration = paymentConfiguration;
    }

    /**
     * <p>
     * The payment responsibilities accepted by the collaboration member.
     * </p>
     * <p>
     * Not required if the collaboration member has the member ability to run queries.
     * </p>
     * <p>
     * Required if the collaboration member doesn't have the member ability to run queries but is configured as a payer
     * by the collaboration creator.
     * </p>
     * 
     * @return The payment responsibilities accepted by the collaboration member.</p>
     *         <p>
     *         Not required if the collaboration member has the member ability to run queries.
     *         </p>
     *         <p>
     *         Required if the collaboration member doesn't have the member ability to run queries but is configured as
     *         a payer by the collaboration creator.
     */

    public MembershipPaymentConfiguration getPaymentConfiguration() {
        return this.paymentConfiguration;
    }

    /**
     * <p>
     * The payment responsibilities accepted by the collaboration member.
     * </p>
     * <p>
     * Not required if the collaboration member has the member ability to run queries.
     * </p>
     * <p>
     * Required if the collaboration member doesn't have the member ability to run queries but is configured as a payer
     * by the collaboration creator.
     * </p>
     * 
     * @param paymentConfiguration
     *        The payment responsibilities accepted by the collaboration member.</p>
     *        <p>
     *        Not required if the collaboration member has the member ability to run queries.
     *        </p>
     *        <p>
     *        Required if the collaboration member doesn't have the member ability to run queries but is configured as a
     *        payer by the collaboration creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembershipRequest withPaymentConfiguration(MembershipPaymentConfiguration paymentConfiguration) {
        setPaymentConfiguration(paymentConfiguration);
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
        if (getCollaborationIdentifier() != null)
            sb.append("CollaborationIdentifier: ").append(getCollaborationIdentifier()).append(",");
        if (getQueryLogStatus() != null)
            sb.append("QueryLogStatus: ").append(getQueryLogStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDefaultResultConfiguration() != null)
            sb.append("DefaultResultConfiguration: ").append(getDefaultResultConfiguration()).append(",");
        if (getPaymentConfiguration() != null)
            sb.append("PaymentConfiguration: ").append(getPaymentConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMembershipRequest == false)
            return false;
        CreateMembershipRequest other = (CreateMembershipRequest) obj;
        if (other.getCollaborationIdentifier() == null ^ this.getCollaborationIdentifier() == null)
            return false;
        if (other.getCollaborationIdentifier() != null && other.getCollaborationIdentifier().equals(this.getCollaborationIdentifier()) == false)
            return false;
        if (other.getQueryLogStatus() == null ^ this.getQueryLogStatus() == null)
            return false;
        if (other.getQueryLogStatus() != null && other.getQueryLogStatus().equals(this.getQueryLogStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDefaultResultConfiguration() == null ^ this.getDefaultResultConfiguration() == null)
            return false;
        if (other.getDefaultResultConfiguration() != null && other.getDefaultResultConfiguration().equals(this.getDefaultResultConfiguration()) == false)
            return false;
        if (other.getPaymentConfiguration() == null ^ this.getPaymentConfiguration() == null)
            return false;
        if (other.getPaymentConfiguration() != null && other.getPaymentConfiguration().equals(this.getPaymentConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollaborationIdentifier() == null) ? 0 : getCollaborationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getQueryLogStatus() == null) ? 0 : getQueryLogStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDefaultResultConfiguration() == null) ? 0 : getDefaultResultConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPaymentConfiguration() == null) ? 0 : getPaymentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateMembershipRequest clone() {
        return (CreateMembershipRequest) super.clone();
    }

}
