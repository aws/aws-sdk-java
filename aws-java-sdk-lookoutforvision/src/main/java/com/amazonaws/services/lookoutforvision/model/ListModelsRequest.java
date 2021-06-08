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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ListModels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project that contains the model versions that you want to list.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Lookout for Vision
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of models.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you
     * specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the project that contains the model versions that you want to list.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the model versions that you want to list.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project that contains the model versions that you want to list.
     * </p>
     * 
     * @return The name of the project that contains the model versions that you want to list.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project that contains the model versions that you want to list.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the model versions that you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelsRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Lookout for Vision
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of models.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Lookout for
     *        Vision returns a pagination token in the response. You can use this pagination token to retrieve the next
     *        set of models.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Lookout for Vision
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of models.
     * </p>
     * 
     * @return If the previous response was incomplete (because there is more data to retrieve), Amazon Lookout for
     *         Vision returns a pagination token in the response. You can use this pagination token to retrieve the next
     *         set of models.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Lookout for Vision
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of models.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Lookout for
     *        Vision returns a pagination token in the response. You can use this pagination token to retrieve the next
     *        set of models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you
     * specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per paginated call. The largest value you can specify is 100. If
     *        you specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you
     * specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     * </p>
     * 
     * @return The maximum number of results to return per paginated call. The largest value you can specify is 100. If
     *         you specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you
     * specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per paginated call. The largest value you can specify is 100. If
     *        you specify a value greater than 100, a ValidationException error occurs. The default value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelsRequest withMaxResults(Integer maxResults) {
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
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

        if (obj instanceof ListModelsRequest == false)
            return false;
        ListModelsRequest other = (ListModelsRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
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

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListModelsRequest clone() {
        return (ListModelsRequest) super.clone();
    }

}
