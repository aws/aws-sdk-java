/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateAccountCustomization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccountCustomizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the AWS account that you want to customize QuickSight for.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The QuickSight namespace that you want to add customizations to.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The QuickSight customizations you're adding in the current AWS Region. You can add these to an AWS account and a
     * QuickSight namespace.
     * </p>
     * <p>
     * For example, you can add a default theme by setting <code>AccountCustomization</code> to the midnight theme:
     * <code>"AccountCustomization": { "DefaultTheme": "arn:aws:quicksight::aws:theme/MIDNIGHT" }</code>. Or, you can
     * add a custom theme by specifying
     * <code>"AccountCustomization": { "DefaultTheme": "arn:aws:quicksight:us-west-2:111122223333:theme/bdb844d0-0fe9-4d9d-b520-0fe602d93639" }</code>
     * .
     * </p>
     */
    private AccountCustomization accountCustomization;
    /**
     * <p>
     * A list of the tags that you want to attach to this resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID for the AWS account that you want to customize QuickSight for.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that you want to customize QuickSight for.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that you want to customize QuickSight for.
     * </p>
     * 
     * @return The ID for the AWS account that you want to customize QuickSight for.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that you want to customize QuickSight for.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that you want to customize QuickSight for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountCustomizationRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The QuickSight namespace that you want to add customizations to.
     * </p>
     * 
     * @param namespace
     *        The QuickSight namespace that you want to add customizations to.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The QuickSight namespace that you want to add customizations to.
     * </p>
     * 
     * @return The QuickSight namespace that you want to add customizations to.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The QuickSight namespace that you want to add customizations to.
     * </p>
     * 
     * @param namespace
     *        The QuickSight namespace that you want to add customizations to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountCustomizationRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The QuickSight customizations you're adding in the current AWS Region. You can add these to an AWS account and a
     * QuickSight namespace.
     * </p>
     * <p>
     * For example, you can add a default theme by setting <code>AccountCustomization</code> to the midnight theme:
     * <code>"AccountCustomization": { "DefaultTheme": "arn:aws:quicksight::aws:theme/MIDNIGHT" }</code>. Or, you can
     * add a custom theme by specifying
     * <code>"AccountCustomization": { "DefaultTheme": "arn:aws:quicksight:us-west-2:111122223333:theme/bdb844d0-0fe9-4d9d-b520-0fe602d93639" }</code>
     * .
     * </p>
     * 
     * @param accountCustomization
     *        The QuickSight customizations you're adding in the current AWS Region. You can add these to an AWS account
     *        and a QuickSight namespace. </p>
     *        <p>
     *        For example, you can add a default theme by setting <code>AccountCustomization</code> to the midnight
     *        theme: <code>"AccountCustomization": { "DefaultTheme": "arn:aws:quicksight::aws:theme/MIDNIGHT" }</code>.
     *        Or, you can add a custom theme by specifying
     *        <code>"AccountCustomization": { "DefaultTheme": "arn:aws:quicksight:us-west-2:111122223333:theme/bdb844d0-0fe9-4d9d-b520-0fe602d93639" }</code>.
     */

    public void setAccountCustomization(AccountCustomization accountCustomization) {
        this.accountCustomization = accountCustomization;
    }

    /**
     * <p>
     * The QuickSight customizations you're adding in the current AWS Region. You can add these to an AWS account and a
     * QuickSight namespace.
     * </p>
     * <p>
     * For example, you can add a default theme by setting <code>AccountCustomization</code> to the midnight theme:
     * <code>"AccountCustomization": { "DefaultTheme": "arn:aws:quicksight::aws:theme/MIDNIGHT" }</code>. Or, you can
     * add a custom theme by specifying
     * <code>"AccountCustomization": { "DefaultTheme": "arn:aws:quicksight:us-west-2:111122223333:theme/bdb844d0-0fe9-4d9d-b520-0fe602d93639" }</code>
     * .
     * </p>
     * 
     * @return The QuickSight customizations you're adding in the current AWS Region. You can add these to an AWS
     *         account and a QuickSight namespace. </p>
     *         <p>
     *         For example, you can add a default theme by setting <code>AccountCustomization</code> to the midnight
     *         theme: <code>"AccountCustomization": { "DefaultTheme": "arn:aws:quicksight::aws:theme/MIDNIGHT" }</code>.
     *         Or, you can add a custom theme by specifying
     *         <code>"AccountCustomization": { "DefaultTheme": "arn:aws:quicksight:us-west-2:111122223333:theme/bdb844d0-0fe9-4d9d-b520-0fe602d93639" }</code>.
     */

    public AccountCustomization getAccountCustomization() {
        return this.accountCustomization;
    }

    /**
     * <p>
     * The QuickSight customizations you're adding in the current AWS Region. You can add these to an AWS account and a
     * QuickSight namespace.
     * </p>
     * <p>
     * For example, you can add a default theme by setting <code>AccountCustomization</code> to the midnight theme:
     * <code>"AccountCustomization": { "DefaultTheme": "arn:aws:quicksight::aws:theme/MIDNIGHT" }</code>. Or, you can
     * add a custom theme by specifying
     * <code>"AccountCustomization": { "DefaultTheme": "arn:aws:quicksight:us-west-2:111122223333:theme/bdb844d0-0fe9-4d9d-b520-0fe602d93639" }</code>
     * .
     * </p>
     * 
     * @param accountCustomization
     *        The QuickSight customizations you're adding in the current AWS Region. You can add these to an AWS account
     *        and a QuickSight namespace. </p>
     *        <p>
     *        For example, you can add a default theme by setting <code>AccountCustomization</code> to the midnight
     *        theme: <code>"AccountCustomization": { "DefaultTheme": "arn:aws:quicksight::aws:theme/MIDNIGHT" }</code>.
     *        Or, you can add a custom theme by specifying
     *        <code>"AccountCustomization": { "DefaultTheme": "arn:aws:quicksight:us-west-2:111122223333:theme/bdb844d0-0fe9-4d9d-b520-0fe602d93639" }</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountCustomizationRequest withAccountCustomization(AccountCustomization accountCustomization) {
        setAccountCustomization(accountCustomization);
        return this;
    }

    /**
     * <p>
     * A list of the tags that you want to attach to this resource.
     * </p>
     * 
     * @return A list of the tags that you want to attach to this resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of the tags that you want to attach to this resource.
     * </p>
     * 
     * @param tags
     *        A list of the tags that you want to attach to this resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of the tags that you want to attach to this resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of the tags that you want to attach to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountCustomizationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the tags that you want to attach to this resource.
     * </p>
     * 
     * @param tags
     *        A list of the tags that you want to attach to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountCustomizationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getAccountCustomization() != null)
            sb.append("AccountCustomization: ").append(getAccountCustomization()).append(",");
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

        if (obj instanceof CreateAccountCustomizationRequest == false)
            return false;
        CreateAccountCustomizationRequest other = (CreateAccountCustomizationRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getAccountCustomization() == null ^ this.getAccountCustomization() == null)
            return false;
        if (other.getAccountCustomization() != null && other.getAccountCustomization().equals(this.getAccountCustomization()) == false)
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

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getAccountCustomization() == null) ? 0 : getAccountCustomization().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccountCustomizationRequest clone() {
        return (CreateAccountCustomizationRequest) super.clone();
    }

}
