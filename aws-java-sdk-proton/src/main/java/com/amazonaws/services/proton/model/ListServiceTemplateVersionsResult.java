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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListServiceTemplateVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceTemplateVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token to indicate the location of the next major or minor version in the array of major or minor versions of a
     * service template, after the list of major or minor versions that was previously requested.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of major or minor versions of a service template with detail data.
     * </p>
     */
    private java.util.List<ServiceTemplateVersionSummary> templateVersions;

    /**
     * <p>
     * A token to indicate the location of the next major or minor version in the array of major or minor versions of a
     * service template, after the list of major or minor versions that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next major or minor version in the array of major or minor
     *        versions of a service template, after the list of major or minor versions that was previously requested.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next major or minor version in the array of major or minor versions of a
     * service template, after the list of major or minor versions that was previously requested.
     * </p>
     * 
     * @return A token to indicate the location of the next major or minor version in the array of major or minor
     *         versions of a service template, after the list of major or minor versions that was previously requested.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next major or minor version in the array of major or minor versions of a
     * service template, after the list of major or minor versions that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next major or minor version in the array of major or minor
     *        versions of a service template, after the list of major or minor versions that was previously requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceTemplateVersionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of major or minor versions of a service template with detail data.
     * </p>
     * 
     * @return An array of major or minor versions of a service template with detail data.
     */

    public java.util.List<ServiceTemplateVersionSummary> getTemplateVersions() {
        return templateVersions;
    }

    /**
     * <p>
     * An array of major or minor versions of a service template with detail data.
     * </p>
     * 
     * @param templateVersions
     *        An array of major or minor versions of a service template with detail data.
     */

    public void setTemplateVersions(java.util.Collection<ServiceTemplateVersionSummary> templateVersions) {
        if (templateVersions == null) {
            this.templateVersions = null;
            return;
        }

        this.templateVersions = new java.util.ArrayList<ServiceTemplateVersionSummary>(templateVersions);
    }

    /**
     * <p>
     * An array of major or minor versions of a service template with detail data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTemplateVersions(java.util.Collection)} or {@link #withTemplateVersions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param templateVersions
     *        An array of major or minor versions of a service template with detail data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceTemplateVersionsResult withTemplateVersions(ServiceTemplateVersionSummary... templateVersions) {
        if (this.templateVersions == null) {
            setTemplateVersions(new java.util.ArrayList<ServiceTemplateVersionSummary>(templateVersions.length));
        }
        for (ServiceTemplateVersionSummary ele : templateVersions) {
            this.templateVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of major or minor versions of a service template with detail data.
     * </p>
     * 
     * @param templateVersions
     *        An array of major or minor versions of a service template with detail data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceTemplateVersionsResult withTemplateVersions(java.util.Collection<ServiceTemplateVersionSummary> templateVersions) {
        setTemplateVersions(templateVersions);
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
        if (getTemplateVersions() != null)
            sb.append("TemplateVersions: ").append(getTemplateVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServiceTemplateVersionsResult == false)
            return false;
        ListServiceTemplateVersionsResult other = (ListServiceTemplateVersionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTemplateVersions() == null ^ this.getTemplateVersions() == null)
            return false;
        if (other.getTemplateVersions() != null && other.getTemplateVersions().equals(this.getTemplateVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTemplateVersions() == null) ? 0 : getTemplateVersions().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceTemplateVersionsResult clone() {
        try {
            return (ListServiceTemplateVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
