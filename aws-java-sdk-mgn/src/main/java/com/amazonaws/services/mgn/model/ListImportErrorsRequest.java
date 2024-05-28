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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * List import errors request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListImportErrors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImportErrorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * List import errors request import id.
     * </p>
     */
    private String importID;
    /**
     * <p>
     * List import errors request max results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * List import errors request next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List import errors request import id.
     * </p>
     * 
     * @param importID
     *        List import errors request import id.
     */

    public void setImportID(String importID) {
        this.importID = importID;
    }

    /**
     * <p>
     * List import errors request import id.
     * </p>
     * 
     * @return List import errors request import id.
     */

    public String getImportID() {
        return this.importID;
    }

    /**
     * <p>
     * List import errors request import id.
     * </p>
     * 
     * @param importID
     *        List import errors request import id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportErrorsRequest withImportID(String importID) {
        setImportID(importID);
        return this;
    }

    /**
     * <p>
     * List import errors request max results.
     * </p>
     * 
     * @param maxResults
     *        List import errors request max results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * List import errors request max results.
     * </p>
     * 
     * @return List import errors request max results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * List import errors request max results.
     * </p>
     * 
     * @param maxResults
     *        List import errors request max results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportErrorsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * List import errors request next token.
     * </p>
     * 
     * @param nextToken
     *        List import errors request next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * List import errors request next token.
     * </p>
     * 
     * @return List import errors request next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * List import errors request next token.
     * </p>
     * 
     * @param nextToken
     *        List import errors request next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportErrorsRequest withNextToken(String nextToken) {
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
        if (getImportID() != null)
            sb.append("ImportID: ").append(getImportID()).append(",");
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

        if (obj instanceof ListImportErrorsRequest == false)
            return false;
        ListImportErrorsRequest other = (ListImportErrorsRequest) obj;
        if (other.getImportID() == null ^ this.getImportID() == null)
            return false;
        if (other.getImportID() != null && other.getImportID().equals(this.getImportID()) == false)
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

        hashCode = prime * hashCode + ((getImportID() == null) ? 0 : getImportID().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImportErrorsRequest clone() {
        return (ListImportErrorsRequest) super.clone();
    }

}
