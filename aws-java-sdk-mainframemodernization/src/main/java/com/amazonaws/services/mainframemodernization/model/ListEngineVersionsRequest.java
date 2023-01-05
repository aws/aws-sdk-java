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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListEngineVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEngineVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of target platform.
     * </p>
     */
    private String engineType;
    /**
     * <p>
     * The maximum number of objects to return.
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
     * The type of target platform.
     * </p>
     * 
     * @param engineType
     *        The type of target platform.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * <p>
     * The type of target platform.
     * </p>
     * 
     * @return The type of target platform.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * <p>
     * The type of target platform.
     * </p>
     * 
     * @param engineType
     *        The type of target platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public ListEngineVersionsRequest withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * <p>
     * The type of target platform.
     * </p>
     * 
     * @param engineType
     *        The type of target platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public ListEngineVersionsRequest withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of objects to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects to return.
     * </p>
     * 
     * @return The maximum number of objects to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEngineVersionsRequest withMaxResults(Integer maxResults) {
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

    public ListEngineVersionsRequest withNextToken(String nextToken) {
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
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
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

        if (obj instanceof ListEngineVersionsRequest == false)
            return false;
        ListEngineVersionsRequest other = (ListEngineVersionsRequest) obj;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
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

        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEngineVersionsRequest clone() {
        return (ListEngineVersionsRequest) super.clone();
    }

}
