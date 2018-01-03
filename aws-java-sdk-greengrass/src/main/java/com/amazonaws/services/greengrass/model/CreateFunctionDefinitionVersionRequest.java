/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Function definition version
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateFunctionDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFunctionDefinitionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The client token used to request idempotent operations. */
    private String amznClientToken;
    /** the unique Id of the lambda definition */
    private String functionDefinitionId;
    /** Lambda functions in this function definition version. */
    private java.util.List<Function> functions;

    /**
     * The client token used to request idempotent operations.
     * 
     * @param amznClientToken
     *        The client token used to request idempotent operations.
     */

    public void setAmznClientToken(String amznClientToken) {
        this.amznClientToken = amznClientToken;
    }

    /**
     * The client token used to request idempotent operations.
     * 
     * @return The client token used to request idempotent operations.
     */

    public String getAmznClientToken() {
        return this.amznClientToken;
    }

    /**
     * The client token used to request idempotent operations.
     * 
     * @param amznClientToken
     *        The client token used to request idempotent operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionDefinitionVersionRequest withAmznClientToken(String amznClientToken) {
        setAmznClientToken(amznClientToken);
        return this;
    }

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

    public CreateFunctionDefinitionVersionRequest withFunctionDefinitionId(String functionDefinitionId) {
        setFunctionDefinitionId(functionDefinitionId);
        return this;
    }

    /**
     * Lambda functions in this function definition version.
     * 
     * @return Lambda functions in this function definition version.
     */

    public java.util.List<Function> getFunctions() {
        return functions;
    }

    /**
     * Lambda functions in this function definition version.
     * 
     * @param functions
     *        Lambda functions in this function definition version.
     */

    public void setFunctions(java.util.Collection<Function> functions) {
        if (functions == null) {
            this.functions = null;
            return;
        }

        this.functions = new java.util.ArrayList<Function>(functions);
    }

    /**
     * Lambda functions in this function definition version.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFunctions(java.util.Collection)} or {@link #withFunctions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param functions
     *        Lambda functions in this function definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionDefinitionVersionRequest withFunctions(Function... functions) {
        if (this.functions == null) {
            setFunctions(new java.util.ArrayList<Function>(functions.length));
        }
        for (Function ele : functions) {
            this.functions.add(ele);
        }
        return this;
    }

    /**
     * Lambda functions in this function definition version.
     * 
     * @param functions
     *        Lambda functions in this function definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionDefinitionVersionRequest withFunctions(java.util.Collection<Function> functions) {
        setFunctions(functions);
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
        if (getAmznClientToken() != null)
            sb.append("AmznClientToken: ").append(getAmznClientToken()).append(",");
        if (getFunctionDefinitionId() != null)
            sb.append("FunctionDefinitionId: ").append(getFunctionDefinitionId()).append(",");
        if (getFunctions() != null)
            sb.append("Functions: ").append(getFunctions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFunctionDefinitionVersionRequest == false)
            return false;
        CreateFunctionDefinitionVersionRequest other = (CreateFunctionDefinitionVersionRequest) obj;
        if (other.getAmznClientToken() == null ^ this.getAmznClientToken() == null)
            return false;
        if (other.getAmznClientToken() != null && other.getAmznClientToken().equals(this.getAmznClientToken()) == false)
            return false;
        if (other.getFunctionDefinitionId() == null ^ this.getFunctionDefinitionId() == null)
            return false;
        if (other.getFunctionDefinitionId() != null && other.getFunctionDefinitionId().equals(this.getFunctionDefinitionId()) == false)
            return false;
        if (other.getFunctions() == null ^ this.getFunctions() == null)
            return false;
        if (other.getFunctions() != null && other.getFunctions().equals(this.getFunctions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmznClientToken() == null) ? 0 : getAmznClientToken().hashCode());
        hashCode = prime * hashCode + ((getFunctionDefinitionId() == null) ? 0 : getFunctionDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getFunctions() == null) ? 0 : getFunctions().hashCode());
        return hashCode;
    }

    @Override
    public CreateFunctionDefinitionVersionRequest clone() {
        return (CreateFunctionDefinitionVersionRequest) super.clone();
    }

}
