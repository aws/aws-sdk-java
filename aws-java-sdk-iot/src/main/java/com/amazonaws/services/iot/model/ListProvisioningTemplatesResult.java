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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProvisioningTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of fleet provisioning templates
     * </p>
     */
    private java.util.List<ProvisioningTemplateSummary> templates;
    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of fleet provisioning templates
     * </p>
     * 
     * @return A list of fleet provisioning templates
     */

    public java.util.List<ProvisioningTemplateSummary> getTemplates() {
        return templates;
    }

    /**
     * <p>
     * A list of fleet provisioning templates
     * </p>
     * 
     * @param templates
     *        A list of fleet provisioning templates
     */

    public void setTemplates(java.util.Collection<ProvisioningTemplateSummary> templates) {
        if (templates == null) {
            this.templates = null;
            return;
        }

        this.templates = new java.util.ArrayList<ProvisioningTemplateSummary>(templates);
    }

    /**
     * <p>
     * A list of fleet provisioning templates
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTemplates(java.util.Collection)} or {@link #withTemplates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param templates
     *        A list of fleet provisioning templates
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisioningTemplatesResult withTemplates(ProvisioningTemplateSummary... templates) {
        if (this.templates == null) {
            setTemplates(new java.util.ArrayList<ProvisioningTemplateSummary>(templates.length));
        }
        for (ProvisioningTemplateSummary ele : templates) {
            this.templates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of fleet provisioning templates
     * </p>
     * 
     * @param templates
     *        A list of fleet provisioning templates
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisioningTemplatesResult withTemplates(java.util.Collection<ProvisioningTemplateSummary> templates) {
        setTemplates(templates);
        return this;
    }

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     * 
     * @return A token to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisioningTemplatesResult withNextToken(String nextToken) {
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
        if (getTemplates() != null)
            sb.append("Templates: ").append(getTemplates()).append(",");
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

        if (obj instanceof ListProvisioningTemplatesResult == false)
            return false;
        ListProvisioningTemplatesResult other = (ListProvisioningTemplatesResult) obj;
        if (other.getTemplates() == null ^ this.getTemplates() == null)
            return false;
        if (other.getTemplates() != null && other.getTemplates().equals(this.getTemplates()) == false)
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

        hashCode = prime * hashCode + ((getTemplates() == null) ? 0 : getTemplates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProvisioningTemplatesResult clone() {
        try {
            return (ListProvisioningTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
