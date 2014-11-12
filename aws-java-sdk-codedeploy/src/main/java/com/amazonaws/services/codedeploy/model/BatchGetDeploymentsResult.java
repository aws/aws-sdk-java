/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the output of a batch get deployments operation.
 * </p>
 */
public class BatchGetDeploymentsResult implements Serializable {

    /**
     * Information about the deployments.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DeploymentInfo> deploymentsInfo;

    /**
     * Information about the deployments.
     *
     * @return Information about the deployments.
     */
    public java.util.List<DeploymentInfo> getDeploymentsInfo() {
        if (deploymentsInfo == null) {
              deploymentsInfo = new com.amazonaws.internal.ListWithAutoConstructFlag<DeploymentInfo>();
              deploymentsInfo.setAutoConstruct(true);
        }
        return deploymentsInfo;
    }
    
    /**
     * Information about the deployments.
     *
     * @param deploymentsInfo Information about the deployments.
     */
    public void setDeploymentsInfo(java.util.Collection<DeploymentInfo> deploymentsInfo) {
        if (deploymentsInfo == null) {
            this.deploymentsInfo = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DeploymentInfo> deploymentsInfoCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DeploymentInfo>(deploymentsInfo.size());
        deploymentsInfoCopy.addAll(deploymentsInfo);
        this.deploymentsInfo = deploymentsInfoCopy;
    }
    
    /**
     * Information about the deployments.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentsInfo Information about the deployments.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BatchGetDeploymentsResult withDeploymentsInfo(DeploymentInfo... deploymentsInfo) {
        if (getDeploymentsInfo() == null) setDeploymentsInfo(new java.util.ArrayList<DeploymentInfo>(deploymentsInfo.length));
        for (DeploymentInfo value : deploymentsInfo) {
            getDeploymentsInfo().add(value);
        }
        return this;
    }
    
    /**
     * Information about the deployments.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentsInfo Information about the deployments.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BatchGetDeploymentsResult withDeploymentsInfo(java.util.Collection<DeploymentInfo> deploymentsInfo) {
        if (deploymentsInfo == null) {
            this.deploymentsInfo = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DeploymentInfo> deploymentsInfoCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DeploymentInfo>(deploymentsInfo.size());
            deploymentsInfoCopy.addAll(deploymentsInfo);
            this.deploymentsInfo = deploymentsInfoCopy;
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
        if (getDeploymentsInfo() != null) sb.append("DeploymentsInfo: " + getDeploymentsInfo() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeploymentsInfo() == null) ? 0 : getDeploymentsInfo().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BatchGetDeploymentsResult == false) return false;
        BatchGetDeploymentsResult other = (BatchGetDeploymentsResult)obj;
        
        if (other.getDeploymentsInfo() == null ^ this.getDeploymentsInfo() == null) return false;
        if (other.getDeploymentsInfo() != null && other.getDeploymentsInfo().equals(this.getDeploymentsInfo()) == false) return false; 
        return true;
    }
    
}
    