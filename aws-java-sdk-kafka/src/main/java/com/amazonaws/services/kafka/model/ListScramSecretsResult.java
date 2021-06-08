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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListScramSecrets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListScramSecretsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Paginated results marker.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of scram secrets associated with the cluster.
     * </p>
     */
    private java.util.List<String> secretArnList;

    /**
     * <p>
     * Paginated results marker.
     * </p>
     * 
     * @param nextToken
     *        <p>
     *        Paginated results marker.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Paginated results marker.
     * </p>
     * 
     * @return <p>
     *         Paginated results marker.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Paginated results marker.
     * </p>
     * 
     * @param nextToken
     *        <p>
     *        Paginated results marker.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScramSecretsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of scram secrets associated with the cluster.
     * </p>
     * 
     * @return <p>
     *         The list of scram secrets associated with the cluster.
     *         </p>
     */

    public java.util.List<String> getSecretArnList() {
        return secretArnList;
    }

    /**
     * <p>
     * The list of scram secrets associated with the cluster.
     * </p>
     * 
     * @param secretArnList
     *        <p>
     *        The list of scram secrets associated with the cluster.
     *        </p>
     */

    public void setSecretArnList(java.util.Collection<String> secretArnList) {
        if (secretArnList == null) {
            this.secretArnList = null;
            return;
        }

        this.secretArnList = new java.util.ArrayList<String>(secretArnList);
    }

    /**
     * <p>
     * The list of scram secrets associated with the cluster.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecretArnList(java.util.Collection)} or {@link #withSecretArnList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param secretArnList
     *        <p>
     *        The list of scram secrets associated with the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScramSecretsResult withSecretArnList(String... secretArnList) {
        if (this.secretArnList == null) {
            setSecretArnList(new java.util.ArrayList<String>(secretArnList.length));
        }
        for (String ele : secretArnList) {
            this.secretArnList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of scram secrets associated with the cluster.
     * </p>
     * 
     * @param secretArnList
     *        <p>
     *        The list of scram secrets associated with the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScramSecretsResult withSecretArnList(java.util.Collection<String> secretArnList) {
        setSecretArnList(secretArnList);
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
        if (getSecretArnList() != null)
            sb.append("SecretArnList: ").append(getSecretArnList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListScramSecretsResult == false)
            return false;
        ListScramSecretsResult other = (ListScramSecretsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSecretArnList() == null ^ this.getSecretArnList() == null)
            return false;
        if (other.getSecretArnList() != null && other.getSecretArnList().equals(this.getSecretArnList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSecretArnList() == null) ? 0 : getSecretArnList().hashCode());
        return hashCode;
    }

    @Override
    public ListScramSecretsResult clone() {
        try {
            return (ListScramSecretsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
