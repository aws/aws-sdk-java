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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListManagedJobTemplatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional parameter for template name. If specified, only the versions of the managed job templates that have
     * the specified template name will be returned.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * Maximum number of entries that can be returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An optional parameter for template name. If specified, only the versions of the managed job templates that have
     * the specified template name will be returned.
     * </p>
     * 
     * @param templateName
     *        An optional parameter for template name. If specified, only the versions of the managed job templates that
     *        have the specified template name will be returned.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * An optional parameter for template name. If specified, only the versions of the managed job templates that have
     * the specified template name will be returned.
     * </p>
     * 
     * @return An optional parameter for template name. If specified, only the versions of the managed job templates
     *         that have the specified template name will be returned.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * An optional parameter for template name. If specified, only the versions of the managed job templates that have
     * the specified template name will be returned.
     * </p>
     * 
     * @param templateName
     *        An optional parameter for template name. If specified, only the versions of the managed job templates that
     *        have the specified template name will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedJobTemplatesRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * Maximum number of entries that can be returned.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of entries that can be returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of entries that can be returned.
     * </p>
     * 
     * @return Maximum number of entries that can be returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of entries that can be returned.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of entries that can be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedJobTemplatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListManagedJobTemplatesRequest withNextToken(String nextToken) {
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
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListManagedJobTemplatesRequest == false)
            return false;
        ListManagedJobTemplatesRequest other = (ListManagedJobTemplatesRequest) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListManagedJobTemplatesRequest clone() {
        return (ListManagedJobTemplatesRequest) super.clone();
    }

}
