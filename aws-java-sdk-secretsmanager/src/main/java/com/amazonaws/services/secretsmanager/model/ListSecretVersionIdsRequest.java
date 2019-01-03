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
     * The identifier for the secret containing the versions you want to list. You can specify either the Amazon
     * Resource Name (ARN) or the friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     */
    private String secretId;
    /**
     * <p>
     * (Optional) Limits the number of results that you want to include in the response. If you don't include this
     * parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that Secrets Manager might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * that indicates that there's more output available. In a subsequent call, set it to the value of the previous
     * call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * (Optional) Specifies that you want the results to include versions that do not have any staging labels attached
     * to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager as needed.
     * </p>
     */
    private Boolean includeDeprecated;

    /**
     * <p>
     * The identifier for the secret containing the versions you want to list. You can specify either the Amazon
     * Resource Name (ARN) or the friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     * 
     * @param secretId
     *        The identifier for the secret containing the versions you want to list. You can specify either the Amazon
     *        Resource Name (ARN) or the friendly name of the secret.</p> <note>
     *        <p>
     *        If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial
     *        ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager
     *        adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it
     *        uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six
     *        characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that
     *        as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete
     *        ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t
     *        create secret names that end with a hyphen followed by six characters.
     *        </p>
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * The identifier for the secret containing the versions you want to list. You can specify either the Amazon
     * Resource Name (ARN) or the friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     * 
     * @return The identifier for the secret containing the versions you want to list. You can specify either the Amazon
     *         Resource Name (ARN) or the friendly name of the secret.</p> <note>
     *         <p>
     *         If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial
     *         ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager
     *         adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it
     *         uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by
     *         six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use
     *         that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a
     *         complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you
     *         don’t create secret names that end with a hyphen followed by six characters.
     *         </p>
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * The identifier for the secret containing the versions you want to list. You can specify either the Amazon
     * Resource Name (ARN) or the friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     * 
     * @param secretId
     *        The identifier for the secret containing the versions you want to list. You can specify either the Amazon
     *        Resource Name (ARN) or the friendly name of the secret.</p> <note>
     *        <p>
     *        If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial
     *        ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager
     *        adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it
     *        uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six
     *        characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that
     *        as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete
     *        ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t
     *        create secret names that end with a hyphen followed by six characters.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretVersionIdsRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * (Optional) Limits the number of results that you want to include in the response. If you don't include this
     * parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that Secrets Manager might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Limits the number of results that you want to include in the response. If you don't include
     *        this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond
     *        the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't
     *        null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     *        operation to get the next part of the results. Note that Secrets Manager might return fewer results than
     *        the maximum even when there are more results available. You should check <code>NextToken</code> after
     *        every operation to ensure that you receive all of the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) Limits the number of results that you want to include in the response. If you don't include this
     * parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that Secrets Manager might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @return (Optional) Limits the number of results that you want to include in the response. If you don't include
     *         this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond
     *         the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't
     *         null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     *         operation to get the next part of the results. Note that Secrets Manager might return fewer results than
     *         the maximum even when there are more results available. You should check <code>NextToken</code> after
     *         every operation to ensure that you receive all of the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * (Optional) Limits the number of results that you want to include in the response. If you don't include this
     * parameter, it defaults to a value that's specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (isn't null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that Secrets Manager might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Limits the number of results that you want to include in the response. If you don't include
     *        this parameter, it defaults to a value that's specific to the operation. If additional items exist beyond
     *        the maximum you specify, the <code>NextToken</code> response element is present and has a value (isn't
     *        null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     *        operation to get the next part of the results. Note that Secrets Manager might return fewer results than
     *        the maximum even when there are more results available. You should check <code>NextToken</code> after
     *        every operation to ensure that you receive all of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretVersionIdsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * that indicates that there's more output available. In a subsequent call, set it to the value of the previous
     * call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous
     *        request that indicates that there's more output available. In a subsequent call, set it to the value of
     *        the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * that indicates that there's more output available. In a subsequent call, set it to the value of the previous
     * call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @return (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous
     *         request that indicates that there's more output available. In a subsequent call, set it to the value of
     *         the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * that indicates that there's more output available. In a subsequent call, set it to the value of the previous
     * call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous
     *        request that indicates that there's more output available. In a subsequent call, set it to the value of
     *        the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretVersionIdsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies that you want the results to include versions that do not have any staging labels attached
     * to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager as needed.
     * </p>
     * 
     * @param includeDeprecated
     *        (Optional) Specifies that you want the results to include versions that do not have any staging labels
     *        attached to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager
     *        as needed.
     */

    public void setIncludeDeprecated(Boolean includeDeprecated) {
        this.includeDeprecated = includeDeprecated;
    }

    /**
     * <p>
     * (Optional) Specifies that you want the results to include versions that do not have any staging labels attached
     * to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager as needed.
     * </p>
     * 
     * @return (Optional) Specifies that you want the results to include versions that do not have any staging labels
     *         attached to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager
     *         as needed.
     */

    public Boolean getIncludeDeprecated() {
        return this.includeDeprecated;
    }

    /**
     * <p>
     * (Optional) Specifies that you want the results to include versions that do not have any staging labels attached
     * to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager as needed.
     * </p>
     * 
     * @param includeDeprecated
     *        (Optional) Specifies that you want the results to include versions that do not have any staging labels
     *        attached to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager
     *        as needed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecretVersionIdsRequest withIncludeDeprecated(Boolean includeDeprecated) {
        setIncludeDeprecated(includeDeprecated);
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies that you want the results to include versions that do not have any staging labels attached
     * to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager as needed.
     * </p>
     * 
     * @return (Optional) Specifies that you want the results to include versions that do not have any staging labels
     *         attached to them. Such versions are considered deprecated and are subject to deletion by Secrets Manager
     *         as needed.
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
