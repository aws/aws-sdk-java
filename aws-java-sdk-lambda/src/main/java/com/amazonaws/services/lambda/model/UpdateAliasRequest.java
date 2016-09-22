/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The function name for which the alias is created.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The alias name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Using this parameter you can change the Lambda function version to which the alias points.
     * </p>
     */
    private String functionVersion;
    /**
     * <p>
     * You can change the description of the alias using this parameter.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The function name for which the alias is created.
     * </p>
     * 
     * @param functionName
     *        The function name for which the alias is created.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The function name for which the alias is created.
     * </p>
     * 
     * @return The function name for which the alias is created.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The function name for which the alias is created.
     * </p>
     * 
     * @param functionName
     *        The function name for which the alias is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAliasRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The alias name.
     * </p>
     * 
     * @param name
     *        The alias name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The alias name.
     * </p>
     * 
     * @return The alias name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The alias name.
     * </p>
     * 
     * @param name
     *        The alias name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAliasRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Using this parameter you can change the Lambda function version to which the alias points.
     * </p>
     * 
     * @param functionVersion
     *        Using this parameter you can change the Lambda function version to which the alias points.
     */

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    /**
     * <p>
     * Using this parameter you can change the Lambda function version to which the alias points.
     * </p>
     * 
     * @return Using this parameter you can change the Lambda function version to which the alias points.
     */

    public String getFunctionVersion() {
        return this.functionVersion;
    }

    /**
     * <p>
     * Using this parameter you can change the Lambda function version to which the alias points.
     * </p>
     * 
     * @param functionVersion
     *        Using this parameter you can change the Lambda function version to which the alias points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAliasRequest withFunctionVersion(String functionVersion) {
        setFunctionVersion(functionVersion);
        return this;
    }

    /**
     * <p>
     * You can change the description of the alias using this parameter.
     * </p>
     * 
     * @param description
     *        You can change the description of the alias using this parameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * You can change the description of the alias using this parameter.
     * </p>
     * 
     * @return You can change the description of the alias using this parameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * You can change the description of the alias using this parameter.
     * </p>
     * 
     * @param description
     *        You can change the description of the alias using this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAliasRequest withDescription(String description) {
        setDescription(description);
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
            sb.append("FunctionName: " + getFunctionName() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getFunctionVersion() != null)
            sb.append("FunctionVersion: " + getFunctionVersion() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAliasRequest == false)
            return false;
        UpdateAliasRequest other = (UpdateAliasRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFunctionVersion() == null ^ this.getFunctionVersion() == null)
            return false;
        if (other.getFunctionVersion() != null && other.getFunctionVersion().equals(this.getFunctionVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFunctionVersion() == null) ? 0 : getFunctionVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAliasRequest clone() {
        return (UpdateAliasRequest) super.clone();
    }
}
