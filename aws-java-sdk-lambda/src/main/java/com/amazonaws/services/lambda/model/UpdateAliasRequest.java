/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#updateAlias(UpdateAliasRequest) UpdateAlias operation}.
 * <p>
 * Using this API you can update the function version to which the alias
 * points and the alias description. For more information, see
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html"> Introduction to AWS Lambda Aliases </a>
 * .
 * </p>
 * <p>
 * This requires permission for the lambda:UpdateAlias action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#updateAlias(UpdateAliasRequest)
 */
public class UpdateAliasRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The function name for which the alias is created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String functionName;

    /**
     * The alias name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(?!^[0-9]+$)([a-zA-Z0-9-_]+)<br/>
     */
    private String name;

    /**
     * Using this parameter you can change the Lambda function version to
     * which the alias points.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     */
    private String functionVersion;

    /**
     * You can change the description of the alias using this parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String description;

    /**
     * The function name for which the alias is created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return The function name for which the alias is created.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * The function name for which the alias is created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The function name for which the alias is created.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * The function name for which the alias is created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The function name for which the alias is created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateAliasRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * The alias name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(?!^[0-9]+$)([a-zA-Z0-9-_]+)<br/>
     *
     * @return The alias name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The alias name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(?!^[0-9]+$)([a-zA-Z0-9-_]+)<br/>
     *
     * @param name The alias name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The alias name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>(?!^[0-9]+$)([a-zA-Z0-9-_]+)<br/>
     *
     * @param name The alias name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateAliasRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Using this parameter you can change the Lambda function version to
     * which the alias points.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @return Using this parameter you can change the Lambda function version to
     *         which the alias points.
     */
    public String getFunctionVersion() {
        return functionVersion;
    }
    
    /**
     * Using this parameter you can change the Lambda function version to
     * which the alias points.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @param functionVersion Using this parameter you can change the Lambda function version to
     *         which the alias points.
     */
    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }
    
    /**
     * Using this parameter you can change the Lambda function version to
     * which the alias points.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @param functionVersion Using this parameter you can change the Lambda function version to
     *         which the alias points.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateAliasRequest withFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
        return this;
    }

    /**
     * You can change the description of the alias using this parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return You can change the description of the alias using this parameter.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * You can change the description of the alias using this parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description You can change the description of the alias using this parameter.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * You can change the description of the alias using this parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description You can change the description of the alias using this parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateAliasRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFunctionName() != null) sb.append("FunctionName: " + getFunctionName() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getFunctionVersion() != null) sb.append("FunctionVersion: " + getFunctionVersion() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateAliasRequest == false) return false;
        UpdateAliasRequest other = (UpdateAliasRequest)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getFunctionVersion() == null ^ this.getFunctionVersion() == null) return false;
        if (other.getFunctionVersion() != null && other.getFunctionVersion().equals(this.getFunctionVersion()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateAliasRequest clone() {
        
            return (UpdateAliasRequest) super.clone();
    }

}
    