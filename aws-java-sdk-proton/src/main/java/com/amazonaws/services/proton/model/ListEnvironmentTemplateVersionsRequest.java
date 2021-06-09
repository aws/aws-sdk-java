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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentTemplateVersions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentTemplateVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * To view a list of minor of versions under a major version of an environment template, include
     * <code>majorVersion</code>.
     * </p>
     * <p>
     * To view a list of major versions of an environment template, <i>exclude</i> <code>majorVersion</code>.
     * </p>
     */
    private String majorVersion;
    /**
     * <p>
     * The maximum number of major or minor versions of an environment template to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to indicate the location of the next major or minor version in the array of major or minor versions of an
     * environment template, after the list of major or minor versions that was previously requested.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The name of the environment template.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * To view a list of minor of versions under a major version of an environment template, include
     * <code>majorVersion</code>.
     * </p>
     * <p>
     * To view a list of major versions of an environment template, <i>exclude</i> <code>majorVersion</code>.
     * </p>
     * 
     * @param majorVersion
     *        To view a list of minor of versions under a major version of an environment template, include
     *        <code>majorVersion</code>.</p>
     *        <p>
     *        To view a list of major versions of an environment template, <i>exclude</i> <code>majorVersion</code>.
     */

    public void setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
    }

    /**
     * <p>
     * To view a list of minor of versions under a major version of an environment template, include
     * <code>majorVersion</code>.
     * </p>
     * <p>
     * To view a list of major versions of an environment template, <i>exclude</i> <code>majorVersion</code>.
     * </p>
     * 
     * @return To view a list of minor of versions under a major version of an environment template, include
     *         <code>majorVersion</code>.</p>
     *         <p>
     *         To view a list of major versions of an environment template, <i>exclude</i> <code>majorVersion</code>.
     */

    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * <p>
     * To view a list of minor of versions under a major version of an environment template, include
     * <code>majorVersion</code>.
     * </p>
     * <p>
     * To view a list of major versions of an environment template, <i>exclude</i> <code>majorVersion</code>.
     * </p>
     * 
     * @param majorVersion
     *        To view a list of minor of versions under a major version of an environment template, include
     *        <code>majorVersion</code>.</p>
     *        <p>
     *        To view a list of major versions of an environment template, <i>exclude</i> <code>majorVersion</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentTemplateVersionsRequest withMajorVersion(String majorVersion) {
        setMajorVersion(majorVersion);
        return this;
    }

    /**
     * <p>
     * The maximum number of major or minor versions of an environment template to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of major or minor versions of an environment template to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of major or minor versions of an environment template to list.
     * </p>
     * 
     * @return The maximum number of major or minor versions of an environment template to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of major or minor versions of an environment template to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of major or minor versions of an environment template to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentTemplateVersionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to indicate the location of the next major or minor version in the array of major or minor versions of an
     * environment template, after the list of major or minor versions that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next major or minor version in the array of major or minor
     *        versions of an environment template, after the list of major or minor versions that was previously
     *        requested.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next major or minor version in the array of major or minor versions of an
     * environment template, after the list of major or minor versions that was previously requested.
     * </p>
     * 
     * @return A token to indicate the location of the next major or minor version in the array of major or minor
     *         versions of an environment template, after the list of major or minor versions that was previously
     *         requested.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to indicate the location of the next major or minor version in the array of major or minor versions of an
     * environment template, after the list of major or minor versions that was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token to indicate the location of the next major or minor version in the array of major or minor
     *        versions of an environment template, after the list of major or minor versions that was previously
     *        requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentTemplateVersionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The name of the environment template.
     * </p>
     * 
     * @param templateName
     *        The name of the environment template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the environment template.
     * </p>
     * 
     * @return The name of the environment template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the environment template.
     * </p>
     * 
     * @param templateName
     *        The name of the environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentTemplateVersionsRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
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
        if (getMajorVersion() != null)
            sb.append("MajorVersion: ").append(getMajorVersion()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEnvironmentTemplateVersionsRequest == false)
            return false;
        ListEnvironmentTemplateVersionsRequest other = (ListEnvironmentTemplateVersionsRequest) obj;
        if (other.getMajorVersion() == null ^ this.getMajorVersion() == null)
            return false;
        if (other.getMajorVersion() != null && other.getMajorVersion().equals(this.getMajorVersion()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMajorVersion() == null) ? 0 : getMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public ListEnvironmentTemplateVersionsRequest clone() {
        return (ListEnvironmentTemplateVersionsRequest) super.clone();
    }

}
