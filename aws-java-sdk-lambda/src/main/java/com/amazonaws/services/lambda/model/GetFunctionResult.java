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

/**
 * <p>
 * This response contains the object for the Lambda function location
 * (see API_FunctionCodeLocation.
 * </p>
 */
public class GetFunctionResult implements Serializable, Cloneable {

    /**
     * A complex type that describes function metadata.
     */
    private FunctionConfiguration configuration;

    /**
     * The object for the Lambda function location.
     */
    private FunctionCodeLocation code;

    /**
     * A complex type that describes function metadata.
     *
     * @return A complex type that describes function metadata.
     */
    public FunctionConfiguration getConfiguration() {
        return configuration;
    }
    
    /**
     * A complex type that describes function metadata.
     *
     * @param configuration A complex type that describes function metadata.
     */
    public void setConfiguration(FunctionConfiguration configuration) {
        this.configuration = configuration;
    }
    
    /**
     * A complex type that describes function metadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configuration A complex type that describes function metadata.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetFunctionResult withConfiguration(FunctionConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * The object for the Lambda function location.
     *
     * @return The object for the Lambda function location.
     */
    public FunctionCodeLocation getCode() {
        return code;
    }
    
    /**
     * The object for the Lambda function location.
     *
     * @param code The object for the Lambda function location.
     */
    public void setCode(FunctionCodeLocation code) {
        this.code = code;
    }
    
    /**
     * The object for the Lambda function location.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code The object for the Lambda function location.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetFunctionResult withCode(FunctionCodeLocation code) {
        this.code = code;
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
        if (getConfiguration() != null) sb.append("Configuration: " + getConfiguration() + ",");
        if (getCode() != null) sb.append("Code: " + getCode() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode()); 
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetFunctionResult == false) return false;
        GetFunctionResult other = (GetFunctionResult)obj;
        
        if (other.getConfiguration() == null ^ this.getConfiguration() == null) return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false) return false; 
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        return true;
    }
    
    @Override
    public GetFunctionResult clone() {
        try {
            return (GetFunctionResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    