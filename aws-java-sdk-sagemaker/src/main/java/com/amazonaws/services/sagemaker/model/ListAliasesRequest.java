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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAliases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAliasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the image.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * The alias of the image version.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The version of the image. If image version is not specified, the aliases of all versions of the image are listed.
     * </p>
     */
    private Integer version;
    /**
     * <p>
     * The maximum number of aliases to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the previous call to <code>ListAliases</code> didn't return the full set of aliases, the call returns a token
     * for retrieving the next set of aliases.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param imageName
     *        The name of the image.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @return The name of the image.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * The name of the image.
     * </p>
     * 
     * @param imageName
     *        The name of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * The alias of the image version.
     * </p>
     * 
     * @param alias
     *        The alias of the image version.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias of the image version.
     * </p>
     * 
     * @return The alias of the image version.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias of the image version.
     * </p>
     * 
     * @param alias
     *        The alias of the image version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The version of the image. If image version is not specified, the aliases of all versions of the image are listed.
     * </p>
     * 
     * @param version
     *        The version of the image. If image version is not specified, the aliases of all versions of the image are
     *        listed.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the image. If image version is not specified, the aliases of all versions of the image are listed.
     * </p>
     * 
     * @return The version of the image. If image version is not specified, the aliases of all versions of the image are
     *         listed.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the image. If image version is not specified, the aliases of all versions of the image are listed.
     * </p>
     * 
     * @param version
     *        The version of the image. If image version is not specified, the aliases of all versions of the image are
     *        listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withVersion(Integer version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The maximum number of aliases to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of aliases to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of aliases to return.
     * </p>
     * 
     * @return The maximum number of aliases to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of aliases to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of aliases to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the previous call to <code>ListAliases</code> didn't return the full set of aliases, the call returns a token
     * for retrieving the next set of aliases.
     * </p>
     * 
     * @param nextToken
     *        If the previous call to <code>ListAliases</code> didn't return the full set of aliases, the call returns a
     *        token for retrieving the next set of aliases.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListAliases</code> didn't return the full set of aliases, the call returns a token
     * for retrieving the next set of aliases.
     * </p>
     * 
     * @return If the previous call to <code>ListAliases</code> didn't return the full set of aliases, the call returns
     *         a token for retrieving the next set of aliases.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListAliases</code> didn't return the full set of aliases, the call returns a token
     * for retrieving the next set of aliases.
     * </p>
     * 
     * @param nextToken
     *        If the previous call to <code>ListAliases</code> didn't return the full set of aliases, the call returns a
     *        token for retrieving the next set of aliases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withNextToken(String nextToken) {
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
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
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

        if (obj instanceof ListAliasesRequest == false)
            return false;
        ListAliasesRequest other = (ListAliasesRequest) obj;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
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

        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAliasesRequest clone() {
        return (ListAliasesRequest) super.clone();
    }

}
