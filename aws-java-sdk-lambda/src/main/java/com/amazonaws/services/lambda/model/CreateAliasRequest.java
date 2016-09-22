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
public class CreateAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the Lambda function for which you want to create an alias.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * Name for the alias you are creating.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Lambda function version for which you are creating the alias.
     * </p>
     */
    private String functionVersion;
    /**
     * <p>
     * Description of the alias.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Name of the Lambda function for which you want to create an alias.
     * </p>
     * 
     * @param functionName
     *        Name of the Lambda function for which you want to create an alias.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * Name of the Lambda function for which you want to create an alias.
     * </p>
     * 
     * @return Name of the Lambda function for which you want to create an alias.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * Name of the Lambda function for which you want to create an alias.
     * </p>
     * 
     * @param functionName
     *        Name of the Lambda function for which you want to create an alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * Name for the alias you are creating.
     * </p>
     * 
     * @param name
     *        Name for the alias you are creating.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name for the alias you are creating.
     * </p>
     * 
     * @return Name for the alias you are creating.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name for the alias you are creating.
     * </p>
     * 
     * @param name
     *        Name for the alias you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Lambda function version for which you are creating the alias.
     * </p>
     * 
     * @param functionVersion
     *        Lambda function version for which you are creating the alias.
     */

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    /**
     * <p>
     * Lambda function version for which you are creating the alias.
     * </p>
     * 
     * @return Lambda function version for which you are creating the alias.
     */

    public String getFunctionVersion() {
        return this.functionVersion;
    }

    /**
     * <p>
     * Lambda function version for which you are creating the alias.
     * </p>
     * 
     * @param functionVersion
     *        Lambda function version for which you are creating the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withFunctionVersion(String functionVersion) {
        setFunctionVersion(functionVersion);
        return this;
    }

    /**
     * <p>
     * Description of the alias.
     * </p>
     * 
     * @param description
     *        Description of the alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the alias.
     * </p>
     * 
     * @return Description of the alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the alias.
     * </p>
     * 
     * @param description
     *        Description of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAliasRequest withDescription(String description) {
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

        if (obj instanceof CreateAliasRequest == false)
            return false;
        CreateAliasRequest other = (CreateAliasRequest) obj;
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
    public CreateAliasRequest clone() {
        return (CreateAliasRequest) super.clone();
    }
}
