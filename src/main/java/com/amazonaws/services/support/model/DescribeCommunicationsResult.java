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
public class DescribeCommunicationsResult implements Serializable {

    /**
     * Contains a list of <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_Communication.html"
     * title="Communication">Communications</a> objects.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Communication> communications;

    /**
     * Defines a resumption point for pagination.
     */
    private String nextToken;

    /**
     * Contains a list of <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_Communication.html"
     * title="Communication">Communications</a> objects.
     *
     * @return Contains a list of <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_Communication.html"
     *         title="Communication">Communications</a> objects.
     */
    public java.util.List<Communication> getCommunications() {
        if (communications == null) {
              communications = new com.amazonaws.internal.ListWithAutoConstructFlag<Communication>();
              communications.setAutoConstruct(true);
        }
        return communications;
    }
    
    /**
     * Contains a list of <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_Communication.html"
     * title="Communication">Communications</a> objects.
     *
     * @param communications Contains a list of <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_Communication.html"
     *         title="Communication">Communications</a> objects.
     */
    public void setCommunications(java.util.Collection<Communication> communications) {
        if (communications == null) {
            this.communications = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Communication> communicationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Communication>(communications.size());
        communicationsCopy.addAll(communications);
        this.communications = communicationsCopy;
    }
    
    /**
     * Contains a list of <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_Communication.html"
     * title="Communication">Communications</a> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param communications Contains a list of <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_Communication.html"
     *         title="Communication">Communications</a> objects.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCommunicationsResult withCommunications(Communication... communications) {
        if (getCommunications() == null) setCommunications(new java.util.ArrayList<Communication>(communications.length));
        for (Communication value : communications) {
            getCommunications().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_Communication.html"
     * title="Communication">Communications</a> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param communications Contains a list of <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_Communication.html"
     *         title="Communication">Communications</a> objects.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCommunicationsResult withCommunications(java.util.Collection<Communication> communications) {
        if (communications == null) {
            this.communications = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Communication> communicationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Communication>(communications.size());
            communicationsCopy.addAll(communications);
            this.communications = communicationsCopy;
        }

        return this;
    }

    /**
     * Defines a resumption point for pagination.
     *
     * @return Defines a resumption point for pagination.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Defines a resumption point for pagination.
     *
     * @param nextToken Defines a resumption point for pagination.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Defines a resumption point for pagination.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken Defines a resumption point for pagination.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCommunicationsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getCommunications() != null) sb.append("Communications: " + getCommunications() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCommunications() == null) ? 0 : getCommunications().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCommunicationsResult == false) return false;
        DescribeCommunicationsResult other = (DescribeCommunicationsResult)obj;
        
        if (other.getCommunications() == null ^ this.getCommunications() == null) return false;
        if (other.getCommunications() != null && other.getCommunications().equals(this.getCommunications()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    