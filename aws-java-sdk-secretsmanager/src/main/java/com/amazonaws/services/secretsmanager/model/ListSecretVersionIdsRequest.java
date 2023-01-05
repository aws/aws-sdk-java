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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ListSecretVersionIds"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSecretVersionIdsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN or name of the secret whose versions you want to list.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     */
    private String secretId;
    /**
     * <p>
     * The number of results to include in the response.
     * </p>
     * <p>
     * If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To get the
     * next results, call <code>ListSecretVersionIds</code> again with the value from <code>NextToken</code>.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous call did not show all results. To get
     * the next results, call <code>ListSecretVersionIds</code> again with this value.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies whether to include versions of secrets that don't have any staging labels attached to them. Versions
     * without staging labels are considered deprecated and are subject to deletion by Secrets Manager.
     * </p>
     */
    private Boolean includeDeprecated;

    /**
     * <p>
     * The ARN or name of the secret whose versions you want to list.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret whose versions you want to list.</p>
     *        <p>
     *        For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *        >Finding a secret from a partial ARN</a>.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret whose versions you want to list.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @return The ARN or name of the secret whose versions you want to list.</p>
     *         <p>
     *         For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *         "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *         >Finding a secret from a partial ARN</a>.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * The ARN or name of the secret whose versions you want to list.
     * </p>
     * <p>
     * For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen">Finding
     * a secret from a partial ARN</a>.
     * </p>
     * 
     * @param secretId
     *        The ARN or name of the secret whose versions you want to list.</p>
     *        <p>
     *        For an ARN, we recommend that you specify a complete ARN rather than a partial ARN. See <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/troubleshoot.html#ARN_secretnamehyphen"
     *        >Finding a secret from a partial ARN</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretVersionIdsRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * The number of results to include in the response.
     * </p>
     * <p>
     * If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To get the
     * next results, call <code>ListSecretVersionIds</code> again with the value from <code>NextToken</code>.
     * </p>
     * 
     * @param maxResults
     *        The number of results to include in the response.</p>
     *        <p>
     *        If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To
     *        get the next results, call <code>ListSecretVersionIds</code> again with the value from
     *        <code>NextToken</code>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of results to include in the response.
     * </p>
     * <p>
     * If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To get the
     * next results, call <code>ListSecretVersionIds</code> again with the value from <code>NextToken</code>.
     * </p>
     * 
     * @return The number of results to include in the response.</p>
     *         <p>
     *         If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To
     *         get the next results, call <code>ListSecretVersionIds</code> again with the value from
     *         <code>NextToken</code>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of results to include in the response.
     * </p>
     * <p>
     * If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To get the
     * next results, call <code>ListSecretVersionIds</code> again with the value from <code>NextToken</code>.
     * </p>
     * 
     * @param maxResults
     *        The number of results to include in the response.</p>
     *        <p>
     *        If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To
     *        get the next results, call <code>ListSecretVersionIds</code> again with the value from
     *        <code>NextToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretVersionIdsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous call did not show all results. To get
     * the next results, call <code>ListSecretVersionIds</code> again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous call did not show all results.
     *        To get the next results, call <code>ListSecretVersionIds</code> again with this value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous call did not show all results. To get
     * the next results, call <code>ListSecretVersionIds</code> again with this value.
     * </p>
     * 
     * @return A token that indicates where the output should continue from, if a previous call did not show all
     *         results. To get the next results, call <code>ListSecretVersionIds</code> again with this value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous call did not show all results. To get
     * the next results, call <code>ListSecretVersionIds</code> again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous call did not show all results.
     *        To get the next results, call <code>ListSecretVersionIds</code> again with this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretVersionIdsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include versions of secrets that don't have any staging labels attached to them. Versions
     * without staging labels are considered deprecated and are subject to deletion by Secrets Manager.
     * </p>
     * 
     * @param includeDeprecated
     *        Specifies whether to include versions of secrets that don't have any staging labels attached to them.
     *        Versions without staging labels are considered deprecated and are subject to deletion by Secrets Manager.
     */

    public void setIncludeDeprecated(Boolean includeDeprecated) {
        this.includeDeprecated = includeDeprecated;
    }

    /**
     * <p>
     * Specifies whether to include versions of secrets that don't have any staging labels attached to them. Versions
     * without staging labels are considered deprecated and are subject to deletion by Secrets Manager.
     * </p>
     * 
     * @return Specifies whether to include versions of secrets that don't have any staging labels attached to them.
     *         Versions without staging labels are considered deprecated and are subject to deletion by Secrets Manager.
     */

    public Boolean getIncludeDeprecated() {
        return this.includeDeprecated;
    }

    /**
     * <p>
     * Specifies whether to include versions of secrets that don't have any staging labels attached to them. Versions
     * without staging labels are considered deprecated and are subject to deletion by Secrets Manager.
     * </p>
     * 
     * @param includeDeprecated
     *        Specifies whether to include versions of secrets that don't have any staging labels attached to them.
     *        Versions without staging labels are considered deprecated and are subject to deletion by Secrets Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretVersionIdsRequest withIncludeDeprecated(Boolean includeDeprecated) {
        setIncludeDeprecated(includeDeprecated);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include versions of secrets that don't have any staging labels attached to them. Versions
     * without staging labels are considered deprecated and are subject to deletion by Secrets Manager.
     * </p>
     * 
     * @return Specifies whether to include versions of secrets that don't have any staging labels attached to them.
     *         Versions without staging labels are considered deprecated and are subject to deletion by Secrets Manager.
     */

    public Boolean isIncludeDeprecated() {
        return this.includeDeprecated;
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
        if (getSecretId() != null)
            sb.append("SecretId: ").append(getSecretId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getIncludeDeprecated() != null)
            sb.append("IncludeDeprecated: ").append(getIncludeDeprecated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSecretVersionIdsRequest == false)
            return false;
        ListSecretVersionIdsRequest other = (ListSecretVersionIdsRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getIncludeDeprecated() == null ^ this.getIncludeDeprecated() == null)
            return false;
        if (other.getIncludeDeprecated() != null && other.getIncludeDeprecated().equals(this.getIncludeDeprecated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getIncludeDeprecated() == null) ? 0 : getIncludeDeprecated().hashCode());
        return hashCode;
    }

    @Override
    public ListSecretVersionIdsRequest clone() {
        return (ListSecretVersionIdsRequest) super.clone();
    }

}
