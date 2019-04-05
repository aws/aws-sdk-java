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
 * Information needed to create a function definition version.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateFunctionDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFunctionDefinitionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A client token used to correlate requests and responses. */
    private String amznClientToken;
    /**
     * The default configuration that applies to all Lambda functions in this function definition version. Individual
     * Lambda functions can override these settings.
     */
    private FunctionDefaultConfig defaultConfig;
    /** The ID of the Lambda function definition. */
    private String functionDefinitionId;
    /** A list of Lambda functions in this function definition version. */
    private java.util.List<Function> functions;

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     */

    public void setAmznClientToken(String amznClientToken) {
        this.amznClientToken = amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @return A client token used to correlate requests and responses.
     */

    public String getAmznClientToken() {
        return this.amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionDefinitionVersionRequest withAmznClientToken(String amznClientToken) {
        setAmznClientToken(amznClientToken);
        return this;
    }

    /**
     * The default configuration that applies to all Lambda functions in this function definition version. Individual
     * Lambda functions can override these settings.
     * 
     * @param defaultConfig
     *        The default configuration that applies to all Lambda functions in this function definition version.
     *        Individual Lambda functions can override these settings.
     */

    public void setDefaultConfig(FunctionDefaultConfig defaultConfig) {
        this.defaultConfig = defaultConfig;
    }

    /**
     * The default configuration that applies to all Lambda functions in this function definition version. Individual
     * Lambda functions can override these settings.
     * 
     * @return The default configuration that applies to all Lambda functions in this function definition version.
     *         Individual Lambda functions can override these settings.
     */

    public FunctionDefaultConfig getDefaultConfig() {
        return this.defaultConfig;
    }

    /**
     * The default configuration that applies to all Lambda functions in this function definition version. Individual
     * Lambda functions can override these settings.
     * 
     * @param defaultConfig
     *        The default configuration that applies to all Lambda functions in this function definition version.
     *        Individual Lambda functions can override these settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionDefinitionVersionRequest withDefaultConfig(FunctionDefaultConfig defaultConfig) {
        setDefaultConfig(defaultConfig);
        return this;
    }

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

    public CreateFunctionDefinitionVersionRequest withFunctionDefinitionId(String functionDefinitionId) {
        setFunctionDefinitionId(functionDefinitionId);
        return this;
    }

    /**
     * A list of Lambda functions in this function definition version.
     * 
     * @return A list of Lambda functions in this function definition version.
     */

    public java.util.List<Function> getFunctions() {
        return functions;
    }

    /**
     * A list of Lambda functions in this function definition version.
     * 
     * @param functions
     *        A list of Lambda functions in this function definition version.
     */

    public void setFunctions(java.util.Collection<Function> functions) {
        if (functions == null) {
            this.functions = null;
            return;
        }

        this.functions = new java.util.ArrayList<Function>(functions);
    }

    /**
     * A list of Lambda functions in this function definition version.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFunctions(java.util.Collection)} or {@link #withFunctions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param functions
     *        A list of Lambda functions in this function definition version.
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
     * A list of Lambda functions in this function definition version.
     * 
     * @param functions
     *        A list of Lambda functions in this function definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionDefinitionVersionRequest withFunctions(java.util.Collection<Function> functions) {
        setFunctions(functions);
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
        if (getAmznClientToken() != null)
            sb.append("AmznClientToken: ").append(getAmznClientToken()).append(",");
        if (getDefaultConfig() != null)
            sb.append("DefaultConfig: ").append(getDefaultConfig()).append(",");
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
        if (other.getDefaultConfig() == null ^ this.getDefaultConfig() == null)
            return false;
        if (other.getDefaultConfig() != null && other.getDefaultConfig().equals(this.getDefaultConfig()) == false)
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
        hashCode = prime * hashCode + ((getDefaultConfig() == null) ? 0 : getDefaultConfig().hashCode());
        hashCode = prime * hashCode + ((getFunctionDefinitionId() == null) ? 0 : getFunctionDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getFunctions() == null) ? 0 : getFunctions().hashCode());
        return hashCode;
    }

    @Override
    public CreateFunctionDefinitionVersionRequest clone() {
        return (CreateFunctionDefinitionVersionRequest) super.clone();
    }

}
