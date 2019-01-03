/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListTemplates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array the contains the name and creation time stamp for each template in your Amazon SES account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TemplateMetadata> templatesMetadata;
    /**
     * <p>
     * A token indicating that there are additional email templates available to be listed. Pass this token to a
     * subsequent call to <code>ListTemplates</code> to retrieve the next 50 email templates.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array the contains the name and creation time stamp for each template in your Amazon SES account.
     * </p>
     * 
     * @return An array the contains the name and creation time stamp for each template in your Amazon SES account.
     */

    public java.util.List<TemplateMetadata> getTemplatesMetadata() {
        if (templatesMetadata == null) {
            templatesMetadata = new com.amazonaws.internal.SdkInternalList<TemplateMetadata>();
        }
        return templatesMetadata;
    }

    /**
     * <p>
     * An array the contains the name and creation time stamp for each template in your Amazon SES account.
     * </p>
     * 
     * @param templatesMetadata
     *        An array the contains the name and creation time stamp for each template in your Amazon SES account.
     */

    public void setTemplatesMetadata(java.util.Collection<TemplateMetadata> templatesMetadata) {
        if (templatesMetadata == null) {
            this.templatesMetadata = null;
            return;
        }

        this.templatesMetadata = new com.amazonaws.internal.SdkInternalList<TemplateMetadata>(templatesMetadata);
    }

    /**
     * <p>
     * An array the contains the name and creation time stamp for each template in your Amazon SES account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTemplatesMetadata(java.util.Collection)} or {@link #withTemplatesMetadata(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param templatesMetadata
     *        An array the contains the name and creation time stamp for each template in your Amazon SES account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplatesResult withTemplatesMetadata(TemplateMetadata... templatesMetadata) {
        if (this.templatesMetadata == null) {
            setTemplatesMetadata(new com.amazonaws.internal.SdkInternalList<TemplateMetadata>(templatesMetadata.length));
        }
        for (TemplateMetadata ele : templatesMetadata) {
            this.templatesMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array the contains the name and creation time stamp for each template in your Amazon SES account.
     * </p>
     * 
     * @param templatesMetadata
     *        An array the contains the name and creation time stamp for each template in your Amazon SES account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplatesResult withTemplatesMetadata(java.util.Collection<TemplateMetadata> templatesMetadata) {
        setTemplatesMetadata(templatesMetadata);
        return this;
    }

    /**
     * <p>
     * A token indicating that there are additional email templates available to be listed. Pass this token to a
     * subsequent call to <code>ListTemplates</code> to retrieve the next 50 email templates.
     * </p>
     * 
     * @param nextToken
     *        A token indicating that there are additional email templates available to be listed. Pass this token to a
     *        subsequent call to <code>ListTemplates</code> to retrieve the next 50 email templates.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token indicating that there are additional email templates available to be listed. Pass this token to a
     * subsequent call to <code>ListTemplates</code> to retrieve the next 50 email templates.
     * </p>
     * 
     * @return A token indicating that there are additional email templates available to be listed. Pass this token to a
     *         subsequent call to <code>ListTemplates</code> to retrieve the next 50 email templates.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token indicating that there are additional email templates available to be listed. Pass this token to a
     * subsequent call to <code>ListTemplates</code> to retrieve the next 50 email templates.
     * </p>
     * 
     * @param nextToken
     *        A token indicating that there are additional email templates available to be listed. Pass this token to a
     *        subsequent call to <code>ListTemplates</code> to retrieve the next 50 email templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getTemplatesMetadata() != null)
            sb.append("TemplatesMetadata: ").append(getTemplatesMetadata()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTemplatesResult == false)
            return false;
        ListTemplatesResult other = (ListTemplatesResult) obj;
        if (other.getTemplatesMetadata() == null ^ this.getTemplatesMetadata() == null)
            return false;
        if (other.getTemplatesMetadata() != null && other.getTemplatesMetadata().equals(this.getTemplatesMetadata()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplatesMetadata() == null) ? 0 : getTemplatesMetadata().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTemplatesResult clone() {
        try {
            return (ListTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
