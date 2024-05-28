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
 * List export errors request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListExportErrors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExportErrorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * List export errors request export id.
     * </p>
     */
    private String exportID;
    /**
     * <p>
     * List export errors request max results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * List export errors request next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List export errors request export id.
     * </p>
     * 
     * @param exportID
     *        List export errors request export id.
     */

    public void setExportID(String exportID) {
        this.exportID = exportID;
    }

    /**
     * <p>
     * List export errors request export id.
     * </p>
     * 
     * @return List export errors request export id.
     */

    public String getExportID() {
        return this.exportID;
    }

    /**
     * <p>
     * List export errors request export id.
     * </p>
     * 
     * @param exportID
     *        List export errors request export id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportErrorsRequest withExportID(String exportID) {
        setExportID(exportID);
        return this;
    }

    /**
     * <p>
     * List export errors request max results.
     * </p>
     * 
     * @param maxResults
     *        List export errors request max results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * List export errors request max results.
     * </p>
     * 
     * @return List export errors request max results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * List export errors request max results.
     * </p>
     * 
     * @param maxResults
     *        List export errors request max results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportErrorsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * List export errors request next token.
     * </p>
     * 
     * @param nextToken
     *        List export errors request next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * List export errors request next token.
     * </p>
     * 
     * @return List export errors request next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * List export errors request next token.
     * </p>
     * 
     * @param nextToken
     *        List export errors request next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportErrorsRequest withNextToken(String nextToken) {
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
        if (getExportID() != null)
            sb.append("ExportID: ").append(getExportID()).append(",");
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

        if (obj instanceof ListExportErrorsRequest == false)
            return false;
        ListExportErrorsRequest other = (ListExportErrorsRequest) obj;
        if (other.getExportID() == null ^ this.getExportID() == null)
            return false;
        if (other.getExportID() != null && other.getExportID().equals(this.getExportID()) == false)
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

        hashCode = prime * hashCode + ((getExportID() == null) ? 0 : getExportID().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExportErrorsRequest clone() {
        return (ListExportErrorsRequest) super.clone();
    }

}
