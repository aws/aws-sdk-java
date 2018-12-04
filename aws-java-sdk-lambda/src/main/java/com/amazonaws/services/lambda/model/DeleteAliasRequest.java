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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Lambda function name for which the alias is created. Deleting an alias does not delete the function version
     * to which it is pointing. Note that the length constraint applies only to the ARN. If you specify only the
     * function name, it is limited to 64 characters in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * Name of the alias to delete.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Lambda function name for which the alias is created. Deleting an alias does not delete the function version
     * to which it is pointing. Note that the length constraint applies only to the ARN. If you specify only the
     * function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @param functionName
     *        The Lambda function name for which the alias is created. Deleting an alias does not delete the function
     *        version to which it is pointing. Note that the length constraint applies only to the ARN. If you specify
     *        only the function name, it is limited to 64 characters in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The Lambda function name for which the alias is created. Deleting an alias does not delete the function version
     * to which it is pointing. Note that the length constraint applies only to the ARN. If you specify only the
     * function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @return The Lambda function name for which the alias is created. Deleting an alias does not delete the function
     *         version to which it is pointing. Note that the length constraint applies only to the ARN. If you specify
     *         only the function name, it is limited to 64 characters in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The Lambda function name for which the alias is created. Deleting an alias does not delete the function version
     * to which it is pointing. Note that the length constraint applies only to the ARN. If you specify only the
     * function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @param functionName
     *        The Lambda function name for which the alias is created. Deleting an alias does not delete the function
     *        version to which it is pointing. Note that the length constraint applies only to the ARN. If you specify
     *        only the function name, it is limited to 64 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAliasRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * Name of the alias to delete.
     * </p>
     * 
     * @param name
     *        Name of the alias to delete.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the alias to delete.
     * </p>
     * 
     * @return Name of the alias to delete.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the alias to delete.
     * </p>
     * 
     * @param name
     *        Name of the alias to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAliasRequest withName(String name) {
        setName(name);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAliasRequest == false)
            return false;
        DeleteAliasRequest other = (DeleteAliasRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAliasRequest clone() {
        return (DeleteAliasRequest) super.clone();
    }

}
