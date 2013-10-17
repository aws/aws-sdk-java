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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;


/**
 * <p>
 * Result message containing a list of environment descriptions.
 * </p>
 */
public class DescribeEnvironmentsResult implements Serializable {

    /**
     * Returns an <a>EnvironmentDescription</a> list.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EnvironmentDescription> environments;

    /**
     * Returns an <a>EnvironmentDescription</a> list.
     *
     * @return Returns an <a>EnvironmentDescription</a> list.
     */
    public java.util.List<EnvironmentDescription> getEnvironments() {
        if (environments == null) {
              environments = new com.amazonaws.internal.ListWithAutoConstructFlag<EnvironmentDescription>();
              environments.setAutoConstruct(true);
        }
        return environments;
    }
    
    /**
     * Returns an <a>EnvironmentDescription</a> list.
     *
     * @param environments Returns an <a>EnvironmentDescription</a> list.
     */
    public void setEnvironments(java.util.Collection<EnvironmentDescription> environments) {
        if (environments == null) {
            this.environments = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EnvironmentDescription> environmentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EnvironmentDescription>(environments.size());
        environmentsCopy.addAll(environments);
        this.environments = environmentsCopy;
    }
    
    /**
     * Returns an <a>EnvironmentDescription</a> list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environments Returns an <a>EnvironmentDescription</a> list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEnvironmentsResult withEnvironments(EnvironmentDescription... environments) {
        if (getEnvironments() == null) setEnvironments(new java.util.ArrayList<EnvironmentDescription>(environments.length));
        for (EnvironmentDescription value : environments) {
            getEnvironments().add(value);
        }
        return this;
    }
    
    /**
     * Returns an <a>EnvironmentDescription</a> list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environments Returns an <a>EnvironmentDescription</a> list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEnvironmentsResult withEnvironments(java.util.Collection<EnvironmentDescription> environments) {
        if (environments == null) {
            this.environments = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EnvironmentDescription> environmentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EnvironmentDescription>(environments.size());
            environmentsCopy.addAll(environments);
            this.environments = environmentsCopy;
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
        if (getEnvironments() != null) sb.append("Environments: " + getEnvironments() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEnvironments() == null) ? 0 : getEnvironments().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeEnvironmentsResult == false) return false;
        DescribeEnvironmentsResult other = (DescribeEnvironmentsResult)obj;
        
        if (other.getEnvironments() == null ^ this.getEnvironments() == null) return false;
        if (other.getEnvironments() != null && other.getEnvironments().equals(this.getEnvironments()) == false) return false; 
        return true;
    }
    
}
    