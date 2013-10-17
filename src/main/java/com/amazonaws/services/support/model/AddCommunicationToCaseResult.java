/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.support.model;

import java.io.Serializable;


/**
 * <p>
 * Returns the objects or data listed below if successful. Otherwise, returns an error.
 * </p>
 */
public class AddCommunicationToCaseResult implements Serializable {

    /**
     * Returns true if the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_AddCommunicationToCase.html"
     * title="AddCommunicationToCase">AddCommunicationToCase</a> succeeds.
     * Returns an error otherwise.
     */
    private Boolean result;

    /**
     * Returns true if the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_AddCommunicationToCase.html"
     * title="AddCommunicationToCase">AddCommunicationToCase</a> succeeds.
     * Returns an error otherwise.
     *
     * @return Returns true if the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_AddCommunicationToCase.html"
     *         title="AddCommunicationToCase">AddCommunicationToCase</a> succeeds.
     *         Returns an error otherwise.
     */
    public Boolean isResult() {
        return result;
    }
    
    /**
     * Returns true if the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_AddCommunicationToCase.html"
     * title="AddCommunicationToCase">AddCommunicationToCase</a> succeeds.
     * Returns an error otherwise.
     *
     * @param result Returns true if the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_AddCommunicationToCase.html"
     *         title="AddCommunicationToCase">AddCommunicationToCase</a> succeeds.
     *         Returns an error otherwise.
     */
    public void setResult(Boolean result) {
        this.result = result;
    }
    
    /**
     * Returns true if the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_AddCommunicationToCase.html"
     * title="AddCommunicationToCase">AddCommunicationToCase</a> succeeds.
     * Returns an error otherwise.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param result Returns true if the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_AddCommunicationToCase.html"
     *         title="AddCommunicationToCase">AddCommunicationToCase</a> succeeds.
     *         Returns an error otherwise.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AddCommunicationToCaseResult withResult(Boolean result) {
        this.result = result;
        return this;
    }

    /**
     * Returns true if the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_AddCommunicationToCase.html"
     * title="AddCommunicationToCase">AddCommunicationToCase</a> succeeds.
     * Returns an error otherwise.
     *
     * @return Returns true if the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_AddCommunicationToCase.html"
     *         title="AddCommunicationToCase">AddCommunicationToCase</a> succeeds.
     *         Returns an error otherwise.
     */
    public Boolean getResult() {
        return result;
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
        if (isResult() != null) sb.append("Result: " + isResult() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isResult() == null) ? 0 : isResult().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddCommunicationToCaseResult == false) return false;
        AddCommunicationToCaseResult other = (AddCommunicationToCaseResult)obj;
        
        if (other.isResult() == null ^ this.isResult() == null) return false;
        if (other.isResult() != null && other.isResult().equals(this.isResult()) == false) return false; 
        return true;
    }
    
}
    