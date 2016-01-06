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
 * Contains a list of AWS Lambda function configurations (see
 * FunctionConfiguration.
 * </p>
 */
public class ListFunctionsResult implements Serializable, Cloneable {

    /**
     * A string, present if there are more functions.
     */
    private String nextMarker;

    /**
     * A list of Lambda functions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<FunctionConfiguration> functions;

    /**
     * A string, present if there are more functions.
     *
     * @return A string, present if there are more functions.
     */
    public String getNextMarker() {
        return nextMarker;
    }
    
    /**
     * A string, present if there are more functions.
     *
     * @param nextMarker A string, present if there are more functions.
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }
    
    /**
     * A string, present if there are more functions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextMarker A string, present if there are more functions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListFunctionsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * A list of Lambda functions.
     *
     * @return A list of Lambda functions.
     */
    public java.util.List<FunctionConfiguration> getFunctions() {
        if (functions == null) {
              functions = new com.amazonaws.internal.ListWithAutoConstructFlag<FunctionConfiguration>();
              functions.setAutoConstruct(true);
        }
        return functions;
    }
    
    /**
     * A list of Lambda functions.
     *
     * @param functions A list of Lambda functions.
     */
    public void setFunctions(java.util.Collection<FunctionConfiguration> functions) {
        if (functions == null) {
            this.functions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<FunctionConfiguration> functionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<FunctionConfiguration>(functions.size());
        functionsCopy.addAll(functions);
        this.functions = functionsCopy;
    }
    
    /**
     * A list of Lambda functions.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFunctions(java.util.Collection)} or {@link
     * #withFunctions(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param functions A list of Lambda functions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListFunctionsResult withFunctions(FunctionConfiguration... functions) {
        if (getFunctions() == null) setFunctions(new java.util.ArrayList<FunctionConfiguration>(functions.length));
        for (FunctionConfiguration value : functions) {
            getFunctions().add(value);
        }
        return this;
    }
    
    /**
     * A list of Lambda functions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param functions A list of Lambda functions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListFunctionsResult withFunctions(java.util.Collection<FunctionConfiguration> functions) {
        if (functions == null) {
            this.functions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<FunctionConfiguration> functionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<FunctionConfiguration>(functions.size());
            functionsCopy.addAll(functions);
            this.functions = functionsCopy;
        }

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
        if (getNextMarker() != null) sb.append("NextMarker: " + getNextMarker() + ",");
        if (getFunctions() != null) sb.append("Functions: " + getFunctions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        hashCode = prime * hashCode + ((getFunctions() == null) ? 0 : getFunctions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListFunctionsResult == false) return false;
        ListFunctionsResult other = (ListFunctionsResult)obj;
        
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        if (other.getFunctions() == null ^ this.getFunctions() == null) return false;
        if (other.getFunctions() != null && other.getFunctions().equals(this.getFunctions()) == false) return false; 
        return true;
    }
    
    @Override
    public ListFunctionsResult clone() {
        try {
            return (ListFunctionsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    