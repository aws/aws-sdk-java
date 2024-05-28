/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chatbot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeChimeWebhookConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChimeWebhookConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The maximum number of results to include in the response. If more results exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     */
    private Integer maxResults;
    /**
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     */
    private String nextToken;
    /** An optional ARN of a ChimeWebhookConfiguration to describe. */
    private String chatConfigurationArn;

    /**
     * The maximum number of results to include in the response. If more results exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If more results exist than the specified
     *        MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * The maximum number of results to include in the response. If more results exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * 
     * @return The maximum number of results to include in the response. If more results exist than the specified
     *         MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * The maximum number of results to include in the response. If more results exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If more results exist than the specified
     *        MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChimeWebhookConfigurationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response includes only results beyond the token, up to the
     *        value specified by MaxResults.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     * 
     * @return An optional token returned from a prior request. Use this token for pagination of results from this
     *         action. If this parameter is specified, the response includes only results beyond the token, up to the
     *         value specified by MaxResults.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response includes only results beyond the token, up to the
     *        value specified by MaxResults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChimeWebhookConfigurationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * An optional ARN of a ChimeWebhookConfiguration to describe.
     * 
     * @param chatConfigurationArn
     *        An optional ARN of a ChimeWebhookConfiguration to describe.
     */

    public void setChatConfigurationArn(String chatConfigurationArn) {
        this.chatConfigurationArn = chatConfigurationArn;
    }

    /**
     * An optional ARN of a ChimeWebhookConfiguration to describe.
     * 
     * @return An optional ARN of a ChimeWebhookConfiguration to describe.
     */

    public String getChatConfigurationArn() {
        return this.chatConfigurationArn;
    }

    /**
     * An optional ARN of a ChimeWebhookConfiguration to describe.
     * 
     * @param chatConfigurationArn
     *        An optional ARN of a ChimeWebhookConfiguration to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChimeWebhookConfigurationsRequest withChatConfigurationArn(String chatConfigurationArn) {
        setChatConfigurationArn(chatConfigurationArn);
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
        if (getChatConfigurationArn() != null)
            sb.append("ChatConfigurationArn: ").append(getChatConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChimeWebhookConfigurationsRequest == false)
            return false;
        DescribeChimeWebhookConfigurationsRequest other = (DescribeChimeWebhookConfigurationsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getChatConfigurationArn() == null ^ this.getChatConfigurationArn() == null)
            return false;
        if (other.getChatConfigurationArn() != null && other.getChatConfigurationArn().equals(this.getChatConfigurationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getChatConfigurationArn() == null) ? 0 : getChatConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeChimeWebhookConfigurationsRequest clone() {
        return (DescribeChimeWebhookConfigurationsRequest) super.clone();
    }

}
