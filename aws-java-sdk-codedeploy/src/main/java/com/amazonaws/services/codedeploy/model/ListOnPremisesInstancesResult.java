/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of list on-premises instances operation.
 * </p>
 */
public class ListOnPremisesInstancesResult implements Serializable, Cloneable {

    /**
     * The list of matching on-premises instance names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceNames;

    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list on-premises instances call to return the next set of on-premises
     * instances in the list.
     */
    private String nextToken;

    /**
     * The list of matching on-premises instance names.
     *
     * @return The list of matching on-premises instance names.
     */
    public java.util.List<String> getInstanceNames() {
        if (instanceNames == null) {
              instanceNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceNames.setAutoConstruct(true);
        }
        return instanceNames;
    }
    
    /**
     * The list of matching on-premises instance names.
     *
     * @param instanceNames The list of matching on-premises instance names.
     */
    public void setInstanceNames(java.util.Collection<String> instanceNames) {
        if (instanceNames == null) {
            this.instanceNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceNames.size());
        instanceNamesCopy.addAll(instanceNames);
        this.instanceNames = instanceNamesCopy;
    }
    
    /**
     * The list of matching on-premises instance names.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceNames(java.util.Collection)} or {@link
     * #withInstanceNames(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceNames The list of matching on-premises instance names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListOnPremisesInstancesResult withInstanceNames(String... instanceNames) {
        if (getInstanceNames() == null) setInstanceNames(new java.util.ArrayList<String>(instanceNames.length));
        for (String value : instanceNames) {
            getInstanceNames().add(value);
        }
        return this;
    }
    
    /**
     * The list of matching on-premises instance names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceNames The list of matching on-premises instance names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListOnPremisesInstancesResult withInstanceNames(java.util.Collection<String> instanceNames) {
        if (instanceNames == null) {
            this.instanceNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceNames.size());
            instanceNamesCopy.addAll(instanceNames);
            this.instanceNames = instanceNamesCopy;
        }

        return this;
    }

    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list on-premises instances call to return the next set of on-premises
     * instances in the list.
     *
     * @return If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list on-premises instances call to return the next set of on-premises
     *         instances in the list.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list on-premises instances call to return the next set of on-premises
     * instances in the list.
     *
     * @param nextToken If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list on-premises instances call to return the next set of on-premises
     *         instances in the list.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list on-premises instances call to return the next set of on-premises
     * instances in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list on-premises instances call to return the next set of on-premises
     *         instances in the list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListOnPremisesInstancesResult withNextToken(String nextToken) {
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
        if (getInstanceNames() != null) sb.append("InstanceNames: " + getInstanceNames() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceNames() == null) ? 0 : getInstanceNames().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListOnPremisesInstancesResult == false) return false;
        ListOnPremisesInstancesResult other = (ListOnPremisesInstancesResult)obj;
        
        if (other.getInstanceNames() == null ^ this.getInstanceNames() == null) return false;
        if (other.getInstanceNames() != null && other.getInstanceNames().equals(this.getInstanceNames()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public ListOnPremisesInstancesResult clone() {
        try {
            return (ListOnPremisesInstancesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    