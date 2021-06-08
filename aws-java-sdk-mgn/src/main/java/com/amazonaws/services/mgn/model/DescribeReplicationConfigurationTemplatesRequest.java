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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeReplicationConfigurationTemplates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationConfigurationTemplatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Request to describe Replication Configuration template by max results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Request to describe Replication Configuration template by next token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Request to describe Replication Configuration template by template IDs.
     * </p>
     */
    private java.util.List<String> replicationConfigurationTemplateIDs;

    /**
     * <p>
     * Request to describe Replication Configuration template by max results.
     * </p>
     * 
     * @param maxResults
     *        Request to describe Replication Configuration template by max results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Request to describe Replication Configuration template by max results.
     * </p>
     * 
     * @return Request to describe Replication Configuration template by max results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Request to describe Replication Configuration template by max results.
     * </p>
     * 
     * @param maxResults
     *        Request to describe Replication Configuration template by max results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationConfigurationTemplatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Request to describe Replication Configuration template by next token.
     * </p>
     * 
     * @param nextToken
     *        Request to describe Replication Configuration template by next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Request to describe Replication Configuration template by next token.
     * </p>
     * 
     * @return Request to describe Replication Configuration template by next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Request to describe Replication Configuration template by next token.
     * </p>
     * 
     * @param nextToken
     *        Request to describe Replication Configuration template by next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationConfigurationTemplatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Request to describe Replication Configuration template by template IDs.
     * </p>
     * 
     * @return Request to describe Replication Configuration template by template IDs.
     */

    public java.util.List<String> getReplicationConfigurationTemplateIDs() {
        return replicationConfigurationTemplateIDs;
    }

    /**
     * <p>
     * Request to describe Replication Configuration template by template IDs.
     * </p>
     * 
     * @param replicationConfigurationTemplateIDs
     *        Request to describe Replication Configuration template by template IDs.
     */

    public void setReplicationConfigurationTemplateIDs(java.util.Collection<String> replicationConfigurationTemplateIDs) {
        if (replicationConfigurationTemplateIDs == null) {
            this.replicationConfigurationTemplateIDs = null;
            return;
        }

        this.replicationConfigurationTemplateIDs = new java.util.ArrayList<String>(replicationConfigurationTemplateIDs);
    }

    /**
     * <p>
     * Request to describe Replication Configuration template by template IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationConfigurationTemplateIDs(java.util.Collection)} or
     * {@link #withReplicationConfigurationTemplateIDs(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param replicationConfigurationTemplateIDs
     *        Request to describe Replication Configuration template by template IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationConfigurationTemplatesRequest withReplicationConfigurationTemplateIDs(String... replicationConfigurationTemplateIDs) {
        if (this.replicationConfigurationTemplateIDs == null) {
            setReplicationConfigurationTemplateIDs(new java.util.ArrayList<String>(replicationConfigurationTemplateIDs.length));
        }
        for (String ele : replicationConfigurationTemplateIDs) {
            this.replicationConfigurationTemplateIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Request to describe Replication Configuration template by template IDs.
     * </p>
     * 
     * @param replicationConfigurationTemplateIDs
     *        Request to describe Replication Configuration template by template IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationConfigurationTemplatesRequest withReplicationConfigurationTemplateIDs(
            java.util.Collection<String> replicationConfigurationTemplateIDs) {
        setReplicationConfigurationTemplateIDs(replicationConfigurationTemplateIDs);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getReplicationConfigurationTemplateIDs() != null)
            sb.append("ReplicationConfigurationTemplateIDs: ").append(getReplicationConfigurationTemplateIDs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationConfigurationTemplatesRequest == false)
            return false;
        DescribeReplicationConfigurationTemplatesRequest other = (DescribeReplicationConfigurationTemplatesRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReplicationConfigurationTemplateIDs() == null ^ this.getReplicationConfigurationTemplateIDs() == null)
            return false;
        if (other.getReplicationConfigurationTemplateIDs() != null
                && other.getReplicationConfigurationTemplateIDs().equals(this.getReplicationConfigurationTemplateIDs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReplicationConfigurationTemplateIDs() == null) ? 0 : getReplicationConfigurationTemplateIDs().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicationConfigurationTemplatesRequest clone() {
        return (DescribeReplicationConfigurationTemplatesRequest) super.clone();
    }

}
