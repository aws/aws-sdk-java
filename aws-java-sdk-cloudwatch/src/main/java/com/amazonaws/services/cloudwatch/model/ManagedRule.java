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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the information that's required to enable a managed Contributor Insights rule for an Amazon Web Services
 * resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/ManagedRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedRule implements Serializable, Cloneable {

    /**
     * <p>
     * The template name for the managed Contributor Insights rule, as returned by <code>ListManagedInsightRules</code>.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The ARN of an Amazon Web Services resource that has managed Contributor Insights rules.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * A list of key-value pairs that you can associate with a managed Contributor Insights rule. You can associate as
     * many as 50 tags with a rule. Tags can help you organize and categorize your resources. You also can use them to
     * scope user permissions by granting a user permission to access or change only the resources that have certain tag
     * values. To associate tags with a rule, you must have the <code>cloudwatch:TagResource</code> permission in
     * addition to the <code>cloudwatch:PutInsightRule</code> permission. If you are using this operation to update an
     * existing Contributor Insights rule, any tags that you specify in this parameter are ignored. To change the tags
     * of an existing rule, use <code>TagResource</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The template name for the managed Contributor Insights rule, as returned by <code>ListManagedInsightRules</code>.
     * </p>
     * 
     * @param templateName
     *        The template name for the managed Contributor Insights rule, as returned by
     *        <code>ListManagedInsightRules</code>.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The template name for the managed Contributor Insights rule, as returned by <code>ListManagedInsightRules</code>.
     * </p>
     * 
     * @return The template name for the managed Contributor Insights rule, as returned by
     *         <code>ListManagedInsightRules</code>.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The template name for the managed Contributor Insights rule, as returned by <code>ListManagedInsightRules</code>.
     * </p>
     * 
     * @param templateName
     *        The template name for the managed Contributor Insights rule, as returned by
     *        <code>ListManagedInsightRules</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRule withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The ARN of an Amazon Web Services resource that has managed Contributor Insights rules.
     * </p>
     * 
     * @param resourceARN
     *        The ARN of an Amazon Web Services resource that has managed Contributor Insights rules.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The ARN of an Amazon Web Services resource that has managed Contributor Insights rules.
     * </p>
     * 
     * @return The ARN of an Amazon Web Services resource that has managed Contributor Insights rules.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * The ARN of an Amazon Web Services resource that has managed Contributor Insights rules.
     * </p>
     * 
     * @param resourceARN
     *        The ARN of an Amazon Web Services resource that has managed Contributor Insights rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRule withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that you can associate with a managed Contributor Insights rule. You can associate as
     * many as 50 tags with a rule. Tags can help you organize and categorize your resources. You also can use them to
     * scope user permissions by granting a user permission to access or change only the resources that have certain tag
     * values. To associate tags with a rule, you must have the <code>cloudwatch:TagResource</code> permission in
     * addition to the <code>cloudwatch:PutInsightRule</code> permission. If you are using this operation to update an
     * existing Contributor Insights rule, any tags that you specify in this parameter are ignored. To change the tags
     * of an existing rule, use <code>TagResource</code>.
     * </p>
     * 
     * @return A list of key-value pairs that you can associate with a managed Contributor Insights rule. You can
     *         associate as many as 50 tags with a rule. Tags can help you organize and categorize your resources. You
     *         also can use them to scope user permissions by granting a user permission to access or change only the
     *         resources that have certain tag values. To associate tags with a rule, you must have the
     *         <code>cloudwatch:TagResource</code> permission in addition to the <code>cloudwatch:PutInsightRule</code>
     *         permission. If you are using this operation to update an existing Contributor Insights rule, any tags
     *         that you specify in this parameter are ignored. To change the tags of an existing rule, use
     *         <code>TagResource</code>.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that you can associate with a managed Contributor Insights rule. You can associate as
     * many as 50 tags with a rule. Tags can help you organize and categorize your resources. You also can use them to
     * scope user permissions by granting a user permission to access or change only the resources that have certain tag
     * values. To associate tags with a rule, you must have the <code>cloudwatch:TagResource</code> permission in
     * addition to the <code>cloudwatch:PutInsightRule</code> permission. If you are using this operation to update an
     * existing Contributor Insights rule, any tags that you specify in this parameter are ignored. To change the tags
     * of an existing rule, use <code>TagResource</code>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that you can associate with a managed Contributor Insights rule. You can
     *        associate as many as 50 tags with a rule. Tags can help you organize and categorize your resources. You
     *        also can use them to scope user permissions by granting a user permission to access or change only the
     *        resources that have certain tag values. To associate tags with a rule, you must have the
     *        <code>cloudwatch:TagResource</code> permission in addition to the <code>cloudwatch:PutInsightRule</code>
     *        permission. If you are using this operation to update an existing Contributor Insights rule, any tags that
     *        you specify in this parameter are ignored. To change the tags of an existing rule, use
     *        <code>TagResource</code>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs that you can associate with a managed Contributor Insights rule. You can associate as
     * many as 50 tags with a rule. Tags can help you organize and categorize your resources. You also can use them to
     * scope user permissions by granting a user permission to access or change only the resources that have certain tag
     * values. To associate tags with a rule, you must have the <code>cloudwatch:TagResource</code> permission in
     * addition to the <code>cloudwatch:PutInsightRule</code> permission. If you are using this operation to update an
     * existing Contributor Insights rule, any tags that you specify in this parameter are ignored. To change the tags
     * of an existing rule, use <code>TagResource</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that you can associate with a managed Contributor Insights rule. You can
     *        associate as many as 50 tags with a rule. Tags can help you organize and categorize your resources. You
     *        also can use them to scope user permissions by granting a user permission to access or change only the
     *        resources that have certain tag values. To associate tags with a rule, you must have the
     *        <code>cloudwatch:TagResource</code> permission in addition to the <code>cloudwatch:PutInsightRule</code>
     *        permission. If you are using this operation to update an existing Contributor Insights rule, any tags that
     *        you specify in this parameter are ignored. To change the tags of an existing rule, use
     *        <code>TagResource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRule withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that you can associate with a managed Contributor Insights rule. You can associate as
     * many as 50 tags with a rule. Tags can help you organize and categorize your resources. You also can use them to
     * scope user permissions by granting a user permission to access or change only the resources that have certain tag
     * values. To associate tags with a rule, you must have the <code>cloudwatch:TagResource</code> permission in
     * addition to the <code>cloudwatch:PutInsightRule</code> permission. If you are using this operation to update an
     * existing Contributor Insights rule, any tags that you specify in this parameter are ignored. To change the tags
     * of an existing rule, use <code>TagResource</code>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that you can associate with a managed Contributor Insights rule. You can
     *        associate as many as 50 tags with a rule. Tags can help you organize and categorize your resources. You
     *        also can use them to scope user permissions by granting a user permission to access or change only the
     *        resources that have certain tag values. To associate tags with a rule, you must have the
     *        <code>cloudwatch:TagResource</code> permission in addition to the <code>cloudwatch:PutInsightRule</code>
     *        permission. If you are using this operation to update an existing Contributor Insights rule, any tags that
     *        you specify in this parameter are ignored. To change the tags of an existing rule, use
     *        <code>TagResource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRule withTags(java.util.Collection<Tag> tags) {
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
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
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

        if (obj instanceof ManagedRule == false)
            return false;
        ManagedRule other = (ManagedRule) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
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

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ManagedRule clone() {
        try {
            return (ManagedRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
