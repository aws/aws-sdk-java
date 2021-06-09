/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceTemplates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token to indicate the location of the next service template in the array of service templates, after the
     * current requested list of service templates.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of service templates with detail data.
     * </p>
     */
    private java.util.List<ServiceTemplateSummary> templates;

    /**
     * <p>
     * A token to indicate the location of the next service template in the array of service templates, after the
     * current requested list of service templates.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next service template in the array of service templates, after the
     *        current requested list of service templates.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next service template in the array of service templates, after the
     * current requested list of service templates.
     * </p>
     * 
     * @return A token to indicate the location of the next service template in the array of service templates, after
     *         the current requested list of service templates.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next service template in the array of service templates, after the
     * current requested list of service templates.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next service template in the array of service templates, after the
     *        current requested list of service templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceTemplatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of service templates with detail data.
     * </p>
     * 
     * @return An array of service templates with detail data.
     */

    public java.util.List<ServiceTemplateSummary> getTemplates() {
        return templates;
    }

    /**
     * <p>
     * An array of service templates with detail data.
     * </p>
     * 
     * @param templates
     *        An array of service templates with detail data.
     */

    public void setTemplates(java.util.Collection<ServiceTemplateSummary> templates) {
        if (templates == null) {
            this.templates = null;
            return;
        }

        this.templates = new java.util.ArrayList<ServiceTemplateSummary>(templates);
    }

    /**
     * <p>
     * An array of service templates with detail data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTemplates(java.util.Collection)} or {@link #withTemplates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param templates
     *        An array of service templates with detail data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceTemplatesResult withTemplates(ServiceTemplateSummary... templates) {
        if (this.templates == null) {
            setTemplates(new java.util.ArrayList<ServiceTemplateSummary>(templates.length));
        }
        for (ServiceTemplateSummary ele : templates) {
            this.templates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of service templates with detail data.
     * </p>
     * 
     * @param templates
     *        An array of service templates with detail data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceTemplatesResult withTemplates(java.util.Collection<ServiceTemplateSummary> templates) {
        setTemplates(templates);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTemplates() != null)
            sb.append("Templates: ").append(getTemplates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServiceTemplatesResult == false)
            return false;
        ListServiceTemplatesResult other = (ListServiceTemplatesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTemplates() == null ^ this.getTemplates() == null)
            return false;
        if (other.getTemplates() != null && other.getTemplates().equals(this.getTemplates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTemplates() == null) ? 0 : getTemplates().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceTemplatesResult clone() {
        try {
            return (ListServiceTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
