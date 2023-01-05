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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListBatchJobDefinitions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBatchJobDefinitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The maximum number of batch job definitions to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A pagination token returned from a previous call to this operation. This specifies the next item to return. To
     * return to the beginning of the list, exclude this parameter.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * If the batch job definition is a FileBatchJobDefinition, the prefix allows you to search on the file names of
     * FileBatchJobDefinitions.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The identifier of the application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the application.
     * </p>
     * 
     * @return The identifier of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobDefinitionsRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The maximum number of batch job definitions to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of batch job definitions to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of batch job definitions to return.
     * </p>
     * 
     * @return The maximum number of batch job definitions to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of batch job definitions to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of batch job definitions to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobDefinitionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A pagination token returned from a previous call to this operation. This specifies the next item to return. To
     * return to the beginning of the list, exclude this parameter.
     * </p>
     * 
     * @param nextToken
     *        A pagination token returned from a previous call to this operation. This specifies the next item to
     *        return. To return to the beginning of the list, exclude this parameter.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token returned from a previous call to this operation. This specifies the next item to return. To
     * return to the beginning of the list, exclude this parameter.
     * </p>
     * 
     * @return A pagination token returned from a previous call to this operation. This specifies the next item to
     *         return. To return to the beginning of the list, exclude this parameter.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token returned from a previous call to this operation. This specifies the next item to return. To
     * return to the beginning of the list, exclude this parameter.
     * </p>
     * 
     * @param nextToken
     *        A pagination token returned from a previous call to this operation. This specifies the next item to
     *        return. To return to the beginning of the list, exclude this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobDefinitionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * If the batch job definition is a FileBatchJobDefinition, the prefix allows you to search on the file names of
     * FileBatchJobDefinitions.
     * </p>
     * 
     * @param prefix
     *        If the batch job definition is a FileBatchJobDefinition, the prefix allows you to search on the file names
     *        of FileBatchJobDefinitions.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * If the batch job definition is a FileBatchJobDefinition, the prefix allows you to search on the file names of
     * FileBatchJobDefinitions.
     * </p>
     * 
     * @return If the batch job definition is a FileBatchJobDefinition, the prefix allows you to search on the file
     *         names of FileBatchJobDefinitions.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * If the batch job definition is a FileBatchJobDefinition, the prefix allows you to search on the file names of
     * FileBatchJobDefinitions.
     * </p>
     * 
     * @param prefix
     *        If the batch job definition is a FileBatchJobDefinition, the prefix allows you to search on the file names
     *        of FileBatchJobDefinitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBatchJobDefinitionsRequest withPrefix(String prefix) {
        setPrefix(prefix);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBatchJobDefinitionsRequest == false)
            return false;
        ListBatchJobDefinitionsRequest other = (ListBatchJobDefinitionsRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public ListBatchJobDefinitionsRequest clone() {
        return (ListBatchJobDefinitionsRequest) super.clone();
    }

}
