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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetFunctionDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFunctionDefinitionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the Lambda function definition. */
    private String functionDefinitionId;
    /** The ID of the function definition version. */
    private String functionDefinitionVersionId;
    /** The token for the next set of results, or ''null'' if there are no additional results. */
    private String nextToken;

    /**
     * The ID of the Lambda function definition.
     * 
     * @param functionDefinitionId
     *        The ID of the Lambda function definition.
     */

    public void setFunctionDefinitionId(String functionDefinitionId) {
        this.functionDefinitionId = functionDefinitionId;
    }

    /**
     * The ID of the Lambda function definition.
     * 
     * @return The ID of the Lambda function definition.
     */

    public String getFunctionDefinitionId() {
        return this.functionDefinitionId;
    }

    /**
     * The ID of the Lambda function definition.
     * 
     * @param functionDefinitionId
     *        The ID of the Lambda function definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionDefinitionVersionRequest withFunctionDefinitionId(String functionDefinitionId) {
        setFunctionDefinitionId(functionDefinitionId);
        return this;
    }

    /**
     * The ID of the function definition version.
     * 
     * @param functionDefinitionVersionId
     *        The ID of the function definition version.
     */

    public void setFunctionDefinitionVersionId(String functionDefinitionVersionId) {
        this.functionDefinitionVersionId = functionDefinitionVersionId;
    }

    /**
     * The ID of the function definition version.
     * 
     * @return The ID of the function definition version.
     */

    public String getFunctionDefinitionVersionId() {
        return this.functionDefinitionVersionId;
    }

    /**
     * The ID of the function definition version.
     * 
     * @param functionDefinitionVersionId
     *        The ID of the function definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionDefinitionVersionRequest withFunctionDefinitionVersionId(String functionDefinitionVersionId) {
        setFunctionDefinitionVersionId(functionDefinitionVersionId);
        return this;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @param nextToken
     *        The token for the next set of results, or ''null'' if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @return The token for the next set of results, or ''null'' if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @param nextToken
     *        The token for the next set of results, or ''null'' if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionDefinitionVersionRequest withNextToken(String nextToken) {
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
        if (getFunctionDefinitionId() != null)
            sb.append("FunctionDefinitionId: ").append(getFunctionDefinitionId()).append(",");
        if (getFunctionDefinitionVersionId() != null)
            sb.append("FunctionDefinitionVersionId: ").append(getFunctionDefinitionVersionId()).append(",");
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

        if (obj instanceof GetFunctionDefinitionVersionRequest == false)
            return false;
        GetFunctionDefinitionVersionRequest other = (GetFunctionDefinitionVersionRequest) obj;
        if (other.getFunctionDefinitionId() == null ^ this.getFunctionDefinitionId() == null)
            return false;
        if (other.getFunctionDefinitionId() != null && other.getFunctionDefinitionId().equals(this.getFunctionDefinitionId()) == false)
            return false;
        if (other.getFunctionDefinitionVersionId() == null ^ this.getFunctionDefinitionVersionId() == null)
            return false;
        if (other.getFunctionDefinitionVersionId() != null && other.getFunctionDefinitionVersionId().equals(this.getFunctionDefinitionVersionId()) == false)
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

        hashCode = prime * hashCode + ((getFunctionDefinitionId() == null) ? 0 : getFunctionDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getFunctionDefinitionVersionId() == null) ? 0 : getFunctionDefinitionVersionId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetFunctionDefinitionVersionRequest clone() {
        return (GetFunctionDefinitionVersionRequest) super.clone();
    }

}
