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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;


/**
 * <p>
 * This data type is used as a response element in the DescribeLoadBalancers action to describe the configuration of the back-end server.
 * </p>
 */
public class BackendServerDescription implements Serializable {

    /**
     * Provides the port on which the back-end server is listening.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     */
    private Integer instancePort;

    /**
     * Provides a list of policy names enabled for the back-end server.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNames;

    /**
     * Provides the port on which the back-end server is listening.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @return Provides the port on which the back-end server is listening.
     */
    public Integer getInstancePort() {
        return instancePort;
    }
    
    /**
     * Provides the port on which the back-end server is listening.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param instancePort Provides the port on which the back-end server is listening.
     */
    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }
    
    /**
     * Provides the port on which the back-end server is listening.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param instancePort Provides the port on which the back-end server is listening.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BackendServerDescription withInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }

    /**
     * Provides a list of policy names enabled for the back-end server.
     *
     * @return Provides a list of policy names enabled for the back-end server.
     */
    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
              policyNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              policyNames.setAutoConstruct(true);
        }
        return policyNames;
    }
    
    /**
     * Provides a list of policy names enabled for the back-end server.
     *
     * @param policyNames Provides a list of policy names enabled for the back-end server.
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyNames.size());
        policyNamesCopy.addAll(policyNames);
        this.policyNames = policyNamesCopy;
    }
    
    /**
     * Provides a list of policy names enabled for the back-end server.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames Provides a list of policy names enabled for the back-end server.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BackendServerDescription withPolicyNames(String... policyNames) {
        if (getPolicyNames() == null) setPolicyNames(new java.util.ArrayList<String>(policyNames.length));
        for (String value : policyNames) {
            getPolicyNames().add(value);
        }
        return this;
    }
    
    /**
     * Provides a list of policy names enabled for the back-end server.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames Provides a list of policy names enabled for the back-end server.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BackendServerDescription withPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyNames.size());
            policyNamesCopy.addAll(policyNames);
            this.policyNames = policyNamesCopy;
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
        if (getInstancePort() != null) sb.append("InstancePort: " + getInstancePort() + ",");
        if (getPolicyNames() != null) sb.append("PolicyNames: " + getPolicyNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstancePort() == null) ? 0 : getInstancePort().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BackendServerDescription == false) return false;
        BackendServerDescription other = (BackendServerDescription)obj;
        
        if (other.getInstancePort() == null ^ this.getInstancePort() == null) return false;
        if (other.getInstancePort() != null && other.getInstancePort().equals(this.getInstancePort()) == false) return false; 
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null) return false;
        if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false) return false; 
        return true;
    }
    
}
    