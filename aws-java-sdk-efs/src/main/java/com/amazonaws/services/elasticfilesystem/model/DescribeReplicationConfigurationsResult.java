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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeReplicationConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The collection of replication configurations that is returned.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReplicationConfigurationDescription> replications;
    /**
     * <p>
     * You can use the <code>NextToken</code> from the previous response in a subsequent request to fetch the additional
     * descriptions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The collection of replication configurations that is returned.
     * </p>
     * 
     * @return The collection of replication configurations that is returned.
     */

    public java.util.List<ReplicationConfigurationDescription> getReplications() {
        if (replications == null) {
            replications = new com.amazonaws.internal.SdkInternalList<ReplicationConfigurationDescription>();
        }
        return replications;
    }

    /**
     * <p>
     * The collection of replication configurations that is returned.
     * </p>
     * 
     * @param replications
     *        The collection of replication configurations that is returned.
     */

    public void setReplications(java.util.Collection<ReplicationConfigurationDescription> replications) {
        if (replications == null) {
            this.replications = null;
            return;
        }

        this.replications = new com.amazonaws.internal.SdkInternalList<ReplicationConfigurationDescription>(replications);
    }

    /**
     * <p>
     * The collection of replication configurations that is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplications(java.util.Collection)} or {@link #withReplications(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param replications
     *        The collection of replication configurations that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationConfigurationsResult withReplications(ReplicationConfigurationDescription... replications) {
        if (this.replications == null) {
            setReplications(new com.amazonaws.internal.SdkInternalList<ReplicationConfigurationDescription>(replications.length));
        }
        for (ReplicationConfigurationDescription ele : replications) {
            this.replications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The collection of replication configurations that is returned.
     * </p>
     * 
     * @param replications
     *        The collection of replication configurations that is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationConfigurationsResult withReplications(java.util.Collection<ReplicationConfigurationDescription> replications) {
        setReplications(replications);
        return this;
    }

    /**
     * <p>
     * You can use the <code>NextToken</code> from the previous response in a subsequent request to fetch the additional
     * descriptions.
     * </p>
     * 
     * @param nextToken
     *        You can use the <code>NextToken</code> from the previous response in a subsequent request to fetch the
     *        additional descriptions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * You can use the <code>NextToken</code> from the previous response in a subsequent request to fetch the additional
     * descriptions.
     * </p>
     * 
     * @return You can use the <code>NextToken</code> from the previous response in a subsequent request to fetch the
     *         additional descriptions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * You can use the <code>NextToken</code> from the previous response in a subsequent request to fetch the additional
     * descriptions.
     * </p>
     * 
     * @param nextToken
     *        You can use the <code>NextToken</code> from the previous response in a subsequent request to fetch the
     *        additional descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationConfigurationsResult withNextToken(String nextToken) {
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
        if (getReplications() != null)
            sb.append("Replications: ").append(getReplications()).append(",");
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

        if (obj instanceof DescribeReplicationConfigurationsResult == false)
            return false;
        DescribeReplicationConfigurationsResult other = (DescribeReplicationConfigurationsResult) obj;
        if (other.getReplications() == null ^ this.getReplications() == null)
            return false;
        if (other.getReplications() != null && other.getReplications().equals(this.getReplications()) == false)
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

        hashCode = prime * hashCode + ((getReplications() == null) ? 0 : getReplications().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicationConfigurationsResult clone() {
        try {
            return (DescribeReplicationConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
