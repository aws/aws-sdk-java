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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProjectPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the project for which you want to list the project policies.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 5. If you
     * specify a value greater than 5, a ValidationException error occurs. The default value is 5.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARN of the project for which you want to list the project policies.
     * </p>
     * 
     * @param projectArn
     *        The ARN of the project for which you want to list the project policies.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The ARN of the project for which you want to list the project policies.
     * </p>
     * 
     * @return The ARN of the project for which you want to list the project policies.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The ARN of the project for which you want to list the project policies.
     * </p>
     * 
     * @param projectArn
     *        The ARN of the project for which you want to list the project policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectPoliciesRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition
     *        Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve
     *        the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     * 
     * @return If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition
     *         Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve
     *         the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom
     * Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition
     *        Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve
     *        the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectPoliciesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 5. If you
     * specify a value greater than 5, a ValidationException error occurs. The default value is 5.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per paginated call. The largest value you can specify is 5. If you
     *        specify a value greater than 5, a ValidationException error occurs. The default value is 5.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 5. If you
     * specify a value greater than 5, a ValidationException error occurs. The default value is 5.
     * </p>
     * 
     * @return The maximum number of results to return per paginated call. The largest value you can specify is 5. If
     *         you specify a value greater than 5, a ValidationException error occurs. The default value is 5.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 5. If you
     * specify a value greater than 5, a ValidationException error occurs. The default value is 5.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per paginated call. The largest value you can specify is 5. If you
     *        specify a value greater than 5, a ValidationException error occurs. The default value is 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProjectPoliciesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProjectPoliciesRequest == false)
            return false;
        ListProjectPoliciesRequest other = (ListProjectPoliciesRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListProjectPoliciesRequest clone() {
        return (ListProjectPoliciesRequest) super.clone();
    }

}
