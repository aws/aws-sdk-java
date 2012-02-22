/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;

/**
 * <p>
 * Provides details of the <code>CompleteWorkflowExecution</code>
 * decision.
 * </p>
 */
public class CompleteWorkflowExecutionDecisionAttributes {

    /**
     * The result of the workflow execution. The form of the result is
     * implementation defined.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String result;

    /**
     * The result of the workflow execution. The form of the result is
     * implementation defined.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return The result of the workflow execution. The form of the result is
     *         implementation defined.
     */
    public String getResult() {
        return result;
    }
    
    /**
     * The result of the workflow execution. The form of the result is
     * implementation defined.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param result The result of the workflow execution. The form of the result is
     *         implementation defined.
     */
    public void setResult(String result) {
        this.result = result;
    }
    
    /**
     * The result of the workflow execution. The form of the result is
     * implementation defined.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param result The result of the workflow execution. The form of the result is
     *         implementation defined.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CompleteWorkflowExecutionDecisionAttributes withResult(String result) {
        this.result = result;
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
        if (result != null) sb.append("Result: " + result + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CompleteWorkflowExecutionDecisionAttributes == false) return false;
        CompleteWorkflowExecutionDecisionAttributes other = (CompleteWorkflowExecutionDecisionAttributes)obj;
        
        if (other.getResult() == null ^ this.getResult() == null) return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false) return false; 
        return true;
    }
    
}
    