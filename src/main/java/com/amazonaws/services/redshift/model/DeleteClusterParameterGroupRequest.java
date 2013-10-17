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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#deleteClusterParameterGroup(DeleteClusterParameterGroupRequest) DeleteClusterParameterGroup operation}.
 * <p>
 * Deletes a specified Amazon Redshift parameter group. <p>
 * <b>NOTE:</b>You cannot delete a parameter group if it is associated with a cluster.
 * </p>
 * 
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#deleteClusterParameterGroup(DeleteClusterParameterGroupRequest)
 */
public class DeleteClusterParameterGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the parameter group to be deleted. <p>Constraints: <ul>
     * <li>Must be the name of an existing cluster parameter group.</li>
     * <li>Cannot delete a default cluster parameter group.</li> </ul>
     */
    private String parameterGroupName;

    /**
     * The name of the parameter group to be deleted. <p>Constraints: <ul>
     * <li>Must be the name of an existing cluster parameter group.</li>
     * <li>Cannot delete a default cluster parameter group.</li> </ul>
     *
     * @return The name of the parameter group to be deleted. <p>Constraints: <ul>
     *         <li>Must be the name of an existing cluster parameter group.</li>
     *         <li>Cannot delete a default cluster parameter group.</li> </ul>
     */
    public String getParameterGroupName() {
        return parameterGroupName;
    }
    
    /**
     * The name of the parameter group to be deleted. <p>Constraints: <ul>
     * <li>Must be the name of an existing cluster parameter group.</li>
     * <li>Cannot delete a default cluster parameter group.</li> </ul>
     *
     * @param parameterGroupName The name of the parameter group to be deleted. <p>Constraints: <ul>
     *         <li>Must be the name of an existing cluster parameter group.</li>
     *         <li>Cannot delete a default cluster parameter group.</li> </ul>
     */
    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }
    
    /**
     * The name of the parameter group to be deleted. <p>Constraints: <ul>
     * <li>Must be the name of an existing cluster parameter group.</li>
     * <li>Cannot delete a default cluster parameter group.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterGroupName The name of the parameter group to be deleted. <p>Constraints: <ul>
     *         <li>Must be the name of an existing cluster parameter group.</li>
     *         <li>Cannot delete a default cluster parameter group.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteClusterParameterGroupRequest withParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
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
        if (getParameterGroupName() != null) sb.append("ParameterGroupName: " + getParameterGroupName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteClusterParameterGroupRequest == false) return false;
        DeleteClusterParameterGroupRequest other = (DeleteClusterParameterGroupRequest)obj;
        
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null) return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false) return false; 
        return true;
    }
    
}
    