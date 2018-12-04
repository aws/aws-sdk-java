/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    /** the unique Id of the lambda definition */
    private String functionDefinitionId;
    /** Function definition version Id */
    private String functionDefinitionVersionId;

    /**
     * the unique Id of the lambda definition
     * 
     * @param functionDefinitionId
     *        the unique Id of the lambda definition
     */

    public void setFunctionDefinitionId(String functionDefinitionId) {
        this.functionDefinitionId = functionDefinitionId;
    }

    /**
     * the unique Id of the lambda definition
     * 
     * @return the unique Id of the lambda definition
     */

    public String getFunctionDefinitionId() {
        return this.functionDefinitionId;
    }

    /**
     * the unique Id of the lambda definition
     * 
     * @param functionDefinitionId
     *        the unique Id of the lambda definition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionDefinitionVersionRequest withFunctionDefinitionId(String functionDefinitionId) {
        setFunctionDefinitionId(functionDefinitionId);
        return this;
    }

    /**
     * Function definition version Id
     * 
     * @param functionDefinitionVersionId
     *        Function definition version Id
     */

    public void setFunctionDefinitionVersionId(String functionDefinitionVersionId) {
        this.functionDefinitionVersionId = functionDefinitionVersionId;
    }

    /**
     * Function definition version Id
     * 
     * @return Function definition version Id
     */

    public String getFunctionDefinitionVersionId() {
        return this.functionDefinitionVersionId;
    }

    /**
     * Function definition version Id
     * 
     * @param functionDefinitionVersionId
     *        Function definition version Id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionDefinitionVersionRequest withFunctionDefinitionVersionId(String functionDefinitionVersionId) {
        setFunctionDefinitionVersionId(functionDefinitionVersionId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("FunctionDefinitionVersionId: ").append(getFunctionDefinitionVersionId());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionDefinitionId() == null) ? 0 : getFunctionDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getFunctionDefinitionVersionId() == null) ? 0 : getFunctionDefinitionVersionId().hashCode());
        return hashCode;
    }

    @Override
    public GetFunctionDefinitionVersionRequest clone() {
        return (GetFunctionDefinitionVersionRequest) super.clone();
    }

}
