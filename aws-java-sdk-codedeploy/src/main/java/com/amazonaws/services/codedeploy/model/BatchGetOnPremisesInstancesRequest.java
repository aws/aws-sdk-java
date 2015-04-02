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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.codedeploy.AmazonCodeDeploy#batchGetOnPremisesInstances(BatchGetOnPremisesInstancesRequest) BatchGetOnPremisesInstances operation}.
 * <p>
 * Gets information about one or more on-premises instances.
 * </p>
 *
 * @see com.amazonaws.services.codedeploy.AmazonCodeDeploy#batchGetOnPremisesInstances(BatchGetOnPremisesInstancesRequest)
 */
public class BatchGetOnPremisesInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The names of the on-premises instances to get information about.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceNames;

    /**
     * The names of the on-premises instances to get information about.
     *
     * @return The names of the on-premises instances to get information about.
     */
    public java.util.List<String> getInstanceNames() {
        if (instanceNames == null) {
              instanceNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceNames.setAutoConstruct(true);
        }
        return instanceNames;
    }
    
    /**
     * The names of the on-premises instances to get information about.
     *
     * @param instanceNames The names of the on-premises instances to get information about.
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
     * The names of the on-premises instances to get information about.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceNames The names of the on-premises instances to get information about.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BatchGetOnPremisesInstancesRequest withInstanceNames(String... instanceNames) {
        if (getInstanceNames() == null) setInstanceNames(new java.util.ArrayList<String>(instanceNames.length));
        for (String value : instanceNames) {
            getInstanceNames().add(value);
        }
        return this;
    }
    
    /**
     * The names of the on-premises instances to get information about.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceNames The names of the on-premises instances to get information about.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BatchGetOnPremisesInstancesRequest withInstanceNames(java.util.Collection<String> instanceNames) {
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
        if (getInstanceNames() != null) sb.append("InstanceNames: " + getInstanceNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceNames() == null) ? 0 : getInstanceNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BatchGetOnPremisesInstancesRequest == false) return false;
        BatchGetOnPremisesInstancesRequest other = (BatchGetOnPremisesInstancesRequest)obj;
        
        if (other.getInstanceNames() == null ^ this.getInstanceNames() == null) return false;
        if (other.getInstanceNames() != null && other.getInstanceNames().equals(this.getInstanceNames()) == false) return false; 
        return true;
    }
    
    @Override
    public BatchGetOnPremisesInstancesRequest clone() {
        
            return (BatchGetOnPremisesInstancesRequest) super.clone();
    }

}
    