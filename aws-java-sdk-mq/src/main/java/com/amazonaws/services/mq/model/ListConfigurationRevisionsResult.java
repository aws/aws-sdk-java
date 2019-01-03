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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ListConfigurationRevisions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfigurationRevisionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The unique ID that Amazon MQ generates for the configuration. */
    private String configurationId;
    /**
     * The maximum number of configuration revisions that can be returned per page (20 by default). This value must be
     * an integer from 5 to 100.
     */
    private Integer maxResults;
    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     */
    private String nextToken;
    /** The list of all revisions for the specified configuration. */
    private java.util.List<ConfigurationRevision> revisions;

    /**
     * The unique ID that Amazon MQ generates for the configuration.
     * 
     * @param configurationId
     *        The unique ID that Amazon MQ generates for the configuration.
     */

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * The unique ID that Amazon MQ generates for the configuration.
     * 
     * @return The unique ID that Amazon MQ generates for the configuration.
     */

    public String getConfigurationId() {
        return this.configurationId;
    }

    /**
     * The unique ID that Amazon MQ generates for the configuration.
     * 
     * @param configurationId
     *        The unique ID that Amazon MQ generates for the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationRevisionsResult withConfigurationId(String configurationId) {
        setConfigurationId(configurationId);
        return this;
    }

    /**
     * The maximum number of configuration revisions that can be returned per page (20 by default). This value must be
     * an integer from 5 to 100.
     * 
     * @param maxResults
     *        The maximum number of configuration revisions that can be returned per page (20 by default). This value
     *        must be an integer from 5 to 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * The maximum number of configuration revisions that can be returned per page (20 by default). This value must be
     * an integer from 5 to 100.
     * 
     * @return The maximum number of configuration revisions that can be returned per page (20 by default). This value
     *         must be an integer from 5 to 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * The maximum number of configuration revisions that can be returned per page (20 by default). This value must be
     * an integer from 5 to 100.
     * 
     * @param maxResults
     *        The maximum number of configuration revisions that can be returned per page (20 by default). This value
     *        must be an integer from 5 to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationRevisionsResult withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * 
     * @param nextToken
     *        The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *        leave nextToken empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * 
     * @return The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *         leave nextToken empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave
     * nextToken empty.
     * 
     * @param nextToken
     *        The token that specifies the next page of results Amazon MQ should return. To request the first page,
     *        leave nextToken empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationRevisionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * The list of all revisions for the specified configuration.
     * 
     * @return The list of all revisions for the specified configuration.
     */

    public java.util.List<ConfigurationRevision> getRevisions() {
        return revisions;
    }

    /**
     * The list of all revisions for the specified configuration.
     * 
     * @param revisions
     *        The list of all revisions for the specified configuration.
     */

    public void setRevisions(java.util.Collection<ConfigurationRevision> revisions) {
        if (revisions == null) {
            this.revisions = null;
            return;
        }

        this.revisions = new java.util.ArrayList<ConfigurationRevision>(revisions);
    }

    /**
     * The list of all revisions for the specified configuration.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRevisions(java.util.Collection)} or {@link #withRevisions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param revisions
     *        The list of all revisions for the specified configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationRevisionsResult withRevisions(ConfigurationRevision... revisions) {
        if (this.revisions == null) {
            setRevisions(new java.util.ArrayList<ConfigurationRevision>(revisions.length));
        }
        for (ConfigurationRevision ele : revisions) {
            this.revisions.add(ele);
        }
        return this;
    }

    /**
     * The list of all revisions for the specified configuration.
     * 
     * @param revisions
     *        The list of all revisions for the specified configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationRevisionsResult withRevisions(java.util.Collection<ConfigurationRevision> revisions) {
        setRevisions(revisions);
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
        if (getConfigurationId() != null)
            sb.append("ConfigurationId: ").append(getConfigurationId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRevisions() != null)
            sb.append("Revisions: ").append(getRevisions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConfigurationRevisionsResult == false)
            return false;
        ListConfigurationRevisionsResult other = (ListConfigurationRevisionsResult) obj;
        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null && other.getConfigurationId().equals(this.getConfigurationId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRevisions() == null ^ this.getRevisions() == null)
            return false;
        if (other.getRevisions() != null && other.getRevisions().equals(this.getRevisions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRevisions() == null) ? 0 : getRevisions().hashCode());
        return hashCode;
    }

    @Override
    public ListConfigurationRevisionsResult clone() {
        try {
            return (ListConfigurationRevisionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
