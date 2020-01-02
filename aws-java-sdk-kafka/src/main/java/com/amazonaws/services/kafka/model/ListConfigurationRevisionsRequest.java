/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListConfigurationRevisions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfigurationRevisionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The maximum number of results to return in the response. If there are more results, the response includes a
     * NextToken parameter.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The paginated results marker. When the result of the operation is truncated, the call returns NextToken in the
     * response. To get the next batch, provide this token in your next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
     * </p>
     * 
     * @param arn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
     *        </p>
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
     *         </p>
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
     * </p>
     * 
     * @param arn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationRevisionsRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. If there are more results, the response includes a
     * NextToken parameter.
     * </p>
     * 
     * @param maxResults
     *        <p>
     *        The maximum number of results to return in the response. If there are more results, the response includes
     *        a NextToken parameter.
     *        </p>
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. If there are more results, the response includes a
     * NextToken parameter.
     * </p>
     * 
     * @return <p>
     *         The maximum number of results to return in the response. If there are more results, the response includes
     *         a NextToken parameter.
     *         </p>
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. If there are more results, the response includes a
     * NextToken parameter.
     * </p>
     * 
     * @param maxResults
     *        <p>
     *        The maximum number of results to return in the response. If there are more results, the response includes
     *        a NextToken parameter.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationRevisionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The paginated results marker. When the result of the operation is truncated, the call returns NextToken in the
     * response. To get the next batch, provide this token in your next request.
     * </p>
     * 
     * @param nextToken
     *        <p>
     *        The paginated results marker. When the result of the operation is truncated, the call returns NextToken in
     *        the response. To get the next batch, provide this token in your next request.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The paginated results marker. When the result of the operation is truncated, the call returns NextToken in the
     * response. To get the next batch, provide this token in your next request.
     * </p>
     * 
     * @return <p>
     *         The paginated results marker. When the result of the operation is truncated, the call returns NextToken
     *         in the response. To get the next batch, provide this token in your next request.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The paginated results marker. When the result of the operation is truncated, the call returns NextToken in the
     * response. To get the next batch, provide this token in your next request.
     * </p>
     * 
     * @param nextToken
     *        <p>
     *        The paginated results marker. When the result of the operation is truncated, the call returns NextToken in
     *        the response. To get the next batch, provide this token in your next request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationRevisionsRequest withNextToken(String nextToken) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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

        if (obj instanceof ListConfigurationRevisionsRequest == false)
            return false;
        ListConfigurationRevisionsRequest other = (ListConfigurationRevisionsRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListConfigurationRevisionsRequest clone() {
        return (ListConfigurationRevisionsRequest) super.clone();
    }

}
