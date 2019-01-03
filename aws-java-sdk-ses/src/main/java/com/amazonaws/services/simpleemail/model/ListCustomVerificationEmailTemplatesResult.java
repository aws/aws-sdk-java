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
 * <p>
 * A paginated list of custom verification email templates.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListCustomVerificationEmailTemplates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCustomVerificationEmailTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of the custom verification email templates that exist in your account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CustomVerificationEmailTemplate> customVerificationEmailTemplates;
    /**
     * <p>
     * A token indicating that there are additional custom verification email templates available to be listed. Pass
     * this token to a subsequent call to <code>ListTemplates</code> to retrieve the next 50 custom verification email
     * templates.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the custom verification email templates that exist in your account.
     * </p>
     * 
     * @return A list of the custom verification email templates that exist in your account.
     */

    public java.util.List<CustomVerificationEmailTemplate> getCustomVerificationEmailTemplates() {
        if (customVerificationEmailTemplates == null) {
            customVerificationEmailTemplates = new com.amazonaws.internal.SdkInternalList<CustomVerificationEmailTemplate>();
        }
        return customVerificationEmailTemplates;
    }

    /**
     * <p>
     * A list of the custom verification email templates that exist in your account.
     * </p>
     * 
     * @param customVerificationEmailTemplates
     *        A list of the custom verification email templates that exist in your account.
     */

    public void setCustomVerificationEmailTemplates(java.util.Collection<CustomVerificationEmailTemplate> customVerificationEmailTemplates) {
        if (customVerificationEmailTemplates == null) {
            this.customVerificationEmailTemplates = null;
            return;
        }

        this.customVerificationEmailTemplates = new com.amazonaws.internal.SdkInternalList<CustomVerificationEmailTemplate>(customVerificationEmailTemplates);
    }

    /**
     * <p>
     * A list of the custom verification email templates that exist in your account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomVerificationEmailTemplates(java.util.Collection)} or
     * {@link #withCustomVerificationEmailTemplates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customVerificationEmailTemplates
     *        A list of the custom verification email templates that exist in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomVerificationEmailTemplatesResult withCustomVerificationEmailTemplates(CustomVerificationEmailTemplate... customVerificationEmailTemplates) {
        if (this.customVerificationEmailTemplates == null) {
            setCustomVerificationEmailTemplates(new com.amazonaws.internal.SdkInternalList<CustomVerificationEmailTemplate>(
                    customVerificationEmailTemplates.length));
        }
        for (CustomVerificationEmailTemplate ele : customVerificationEmailTemplates) {
            this.customVerificationEmailTemplates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the custom verification email templates that exist in your account.
     * </p>
     * 
     * @param customVerificationEmailTemplates
     *        A list of the custom verification email templates that exist in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomVerificationEmailTemplatesResult withCustomVerificationEmailTemplates(
            java.util.Collection<CustomVerificationEmailTemplate> customVerificationEmailTemplates) {
        setCustomVerificationEmailTemplates(customVerificationEmailTemplates);
        return this;
    }

    /**
     * <p>
     * A token indicating that there are additional custom verification email templates available to be listed. Pass
     * this token to a subsequent call to <code>ListTemplates</code> to retrieve the next 50 custom verification email
     * templates.
     * </p>
     * 
     * @param nextToken
     *        A token indicating that there are additional custom verification email templates available to be listed.
     *        Pass this token to a subsequent call to <code>ListTemplates</code> to retrieve the next 50 custom
     *        verification email templates.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token indicating that there are additional custom verification email templates available to be listed. Pass
     * this token to a subsequent call to <code>ListTemplates</code> to retrieve the next 50 custom verification email
     * templates.
     * </p>
     * 
     * @return A token indicating that there are additional custom verification email templates available to be listed.
     *         Pass this token to a subsequent call to <code>ListTemplates</code> to retrieve the next 50 custom
     *         verification email templates.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token indicating that there are additional custom verification email templates available to be listed. Pass
     * this token to a subsequent call to <code>ListTemplates</code> to retrieve the next 50 custom verification email
     * templates.
     * </p>
     * 
     * @param nextToken
     *        A token indicating that there are additional custom verification email templates available to be listed.
     *        Pass this token to a subsequent call to <code>ListTemplates</code> to retrieve the next 50 custom
     *        verification email templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomVerificationEmailTemplatesResult withNextToken(String nextToken) {
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
        if (getCustomVerificationEmailTemplates() != null)
            sb.append("CustomVerificationEmailTemplates: ").append(getCustomVerificationEmailTemplates()).append(",");
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

        if (obj instanceof ListCustomVerificationEmailTemplatesResult == false)
            return false;
        ListCustomVerificationEmailTemplatesResult other = (ListCustomVerificationEmailTemplatesResult) obj;
        if (other.getCustomVerificationEmailTemplates() == null ^ this.getCustomVerificationEmailTemplates() == null)
            return false;
        if (other.getCustomVerificationEmailTemplates() != null
                && other.getCustomVerificationEmailTemplates().equals(this.getCustomVerificationEmailTemplates()) == false)
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

        hashCode = prime * hashCode + ((getCustomVerificationEmailTemplates() == null) ? 0 : getCustomVerificationEmailTemplates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCustomVerificationEmailTemplatesResult clone() {
        try {
            return (ListCustomVerificationEmailTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
