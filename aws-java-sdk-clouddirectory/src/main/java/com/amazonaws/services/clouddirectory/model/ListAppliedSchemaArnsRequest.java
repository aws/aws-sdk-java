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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListAppliedSchemaArns"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppliedSchemaArnsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the directory you are listing.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * The response for <code>ListAppliedSchemaArns</code> when this parameter is used will list all minor version ARNs
     * for a major version.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARN of the directory you are listing.
     * </p>
     * 
     * @param directoryArn
     *        The ARN of the directory you are listing.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The ARN of the directory you are listing.
     * </p>
     * 
     * @return The ARN of the directory you are listing.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The ARN of the directory you are listing.
     * </p>
     * 
     * @param directoryArn
     *        The ARN of the directory you are listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppliedSchemaArnsRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * The response for <code>ListAppliedSchemaArns</code> when this parameter is used will list all minor version ARNs
     * for a major version.
     * </p>
     * 
     * @param schemaArn
     *        The response for <code>ListAppliedSchemaArns</code> when this parameter is used will list all minor
     *        version ARNs for a major version.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The response for <code>ListAppliedSchemaArns</code> when this parameter is used will list all minor version ARNs
     * for a major version.
     * </p>
     * 
     * @return The response for <code>ListAppliedSchemaArns</code> when this parameter is used will list all minor
     *         version ARNs for a major version.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The response for <code>ListAppliedSchemaArns</code> when this parameter is used will list all minor version ARNs
     * for a major version.
     * </p>
     * 
     * @param schemaArn
     *        The response for <code>ListAppliedSchemaArns</code> when this parameter is used will list all minor
     *        version ARNs for a major version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppliedSchemaArnsRequest withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppliedSchemaArnsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to retrieve.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     * 
     * @return The maximum number of results to retrieve.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppliedSchemaArnsRequest withMaxResults(Integer maxResults) {
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
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn()).append(",");
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
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

        if (obj instanceof ListAppliedSchemaArnsRequest == false)
            return false;
        ListAppliedSchemaArnsRequest other = (ListAppliedSchemaArnsRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
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

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAppliedSchemaArnsRequest clone() {
        return (ListAppliedSchemaArnsRequest) super.clone();
    }

}
