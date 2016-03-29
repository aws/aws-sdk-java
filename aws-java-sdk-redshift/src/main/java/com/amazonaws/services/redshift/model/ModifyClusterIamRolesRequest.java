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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#modifyClusterIamRoles(ModifyClusterIamRolesRequest) ModifyClusterIamRoles operation}.
 * <p>
 * Modifies the list of AWS Identity and Access Management (IAM) roles
 * that can be used by the cluster to access other AWS services.
 * </p>
 * <p>
 * A cluster can have up to 10 IAM roles associated at any time.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#modifyClusterIamRoles(ModifyClusterIamRolesRequest)
 */
public class ModifyClusterIamRolesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The unique identifier of the cluster for which you want to associate
     * or disassociate IAM roles.
     */
    private String clusterIdentifier;

    /**
     * Zero or more IAM roles (in their ARN format) to associate with the
     * cluster. You can associate up to 10 IAM roles with a single cluster in
     * a single request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> addIamRoles;

    /**
     * Zero or more IAM roles (in their ARN format) to disassociate from the
     * cluster. You can disassociate up to 10 IAM roles from a single cluster
     * in a single request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> removeIamRoles;

    /**
     * The unique identifier of the cluster for which you want to associate
     * or disassociate IAM roles.
     *
     * @return The unique identifier of the cluster for which you want to associate
     *         or disassociate IAM roles.
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The unique identifier of the cluster for which you want to associate
     * or disassociate IAM roles.
     *
     * @param clusterIdentifier The unique identifier of the cluster for which you want to associate
     *         or disassociate IAM roles.
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The unique identifier of the cluster for which you want to associate
     * or disassociate IAM roles.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The unique identifier of the cluster for which you want to associate
     *         or disassociate IAM roles.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyClusterIamRolesRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * Zero or more IAM roles (in their ARN format) to associate with the
     * cluster. You can associate up to 10 IAM roles with a single cluster in
     * a single request.
     *
     * @return Zero or more IAM roles (in their ARN format) to associate with the
     *         cluster. You can associate up to 10 IAM roles with a single cluster in
     *         a single request.
     */
    public java.util.List<String> getAddIamRoles() {
        if (addIamRoles == null) {
              addIamRoles = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              addIamRoles.setAutoConstruct(true);
        }
        return addIamRoles;
    }
    
    /**
     * Zero or more IAM roles (in their ARN format) to associate with the
     * cluster. You can associate up to 10 IAM roles with a single cluster in
     * a single request.
     *
     * @param addIamRoles Zero or more IAM roles (in their ARN format) to associate with the
     *         cluster. You can associate up to 10 IAM roles with a single cluster in
     *         a single request.
     */
    public void setAddIamRoles(java.util.Collection<String> addIamRoles) {
        if (addIamRoles == null) {
            this.addIamRoles = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> addIamRolesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(addIamRoles.size());
        addIamRolesCopy.addAll(addIamRoles);
        this.addIamRoles = addIamRolesCopy;
    }
    
    /**
     * Zero or more IAM roles (in their ARN format) to associate with the
     * cluster. You can associate up to 10 IAM roles with a single cluster in
     * a single request.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAddIamRoles(java.util.Collection)} or {@link
     * #withAddIamRoles(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param addIamRoles Zero or more IAM roles (in their ARN format) to associate with the
     *         cluster. You can associate up to 10 IAM roles with a single cluster in
     *         a single request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyClusterIamRolesRequest withAddIamRoles(String... addIamRoles) {
        if (getAddIamRoles() == null) setAddIamRoles(new java.util.ArrayList<String>(addIamRoles.length));
        for (String value : addIamRoles) {
            getAddIamRoles().add(value);
        }
        return this;
    }
    
    /**
     * Zero or more IAM roles (in their ARN format) to associate with the
     * cluster. You can associate up to 10 IAM roles with a single cluster in
     * a single request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param addIamRoles Zero or more IAM roles (in their ARN format) to associate with the
     *         cluster. You can associate up to 10 IAM roles with a single cluster in
     *         a single request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyClusterIamRolesRequest withAddIamRoles(java.util.Collection<String> addIamRoles) {
        if (addIamRoles == null) {
            this.addIamRoles = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> addIamRolesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(addIamRoles.size());
            addIamRolesCopy.addAll(addIamRoles);
            this.addIamRoles = addIamRolesCopy;
        }

        return this;
    }

    /**
     * Zero or more IAM roles (in their ARN format) to disassociate from the
     * cluster. You can disassociate up to 10 IAM roles from a single cluster
     * in a single request.
     *
     * @return Zero or more IAM roles (in their ARN format) to disassociate from the
     *         cluster. You can disassociate up to 10 IAM roles from a single cluster
     *         in a single request.
     */
    public java.util.List<String> getRemoveIamRoles() {
        if (removeIamRoles == null) {
              removeIamRoles = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              removeIamRoles.setAutoConstruct(true);
        }
        return removeIamRoles;
    }
    
    /**
     * Zero or more IAM roles (in their ARN format) to disassociate from the
     * cluster. You can disassociate up to 10 IAM roles from a single cluster
     * in a single request.
     *
     * @param removeIamRoles Zero or more IAM roles (in their ARN format) to disassociate from the
     *         cluster. You can disassociate up to 10 IAM roles from a single cluster
     *         in a single request.
     */
    public void setRemoveIamRoles(java.util.Collection<String> removeIamRoles) {
        if (removeIamRoles == null) {
            this.removeIamRoles = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> removeIamRolesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(removeIamRoles.size());
        removeIamRolesCopy.addAll(removeIamRoles);
        this.removeIamRoles = removeIamRolesCopy;
    }
    
    /**
     * Zero or more IAM roles (in their ARN format) to disassociate from the
     * cluster. You can disassociate up to 10 IAM roles from a single cluster
     * in a single request.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRemoveIamRoles(java.util.Collection)} or {@link
     * #withRemoveIamRoles(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param removeIamRoles Zero or more IAM roles (in their ARN format) to disassociate from the
     *         cluster. You can disassociate up to 10 IAM roles from a single cluster
     *         in a single request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyClusterIamRolesRequest withRemoveIamRoles(String... removeIamRoles) {
        if (getRemoveIamRoles() == null) setRemoveIamRoles(new java.util.ArrayList<String>(removeIamRoles.length));
        for (String value : removeIamRoles) {
            getRemoveIamRoles().add(value);
        }
        return this;
    }
    
    /**
     * Zero or more IAM roles (in their ARN format) to disassociate from the
     * cluster. You can disassociate up to 10 IAM roles from a single cluster
     * in a single request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param removeIamRoles Zero or more IAM roles (in their ARN format) to disassociate from the
     *         cluster. You can disassociate up to 10 IAM roles from a single cluster
     *         in a single request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyClusterIamRolesRequest withRemoveIamRoles(java.util.Collection<String> removeIamRoles) {
        if (removeIamRoles == null) {
            this.removeIamRoles = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> removeIamRolesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(removeIamRoles.size());
            removeIamRolesCopy.addAll(removeIamRoles);
            this.removeIamRoles = removeIamRolesCopy;
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
        if (getClusterIdentifier() != null) sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getAddIamRoles() != null) sb.append("AddIamRoles: " + getAddIamRoles() + ",");
        if (getRemoveIamRoles() != null) sb.append("RemoveIamRoles: " + getRemoveIamRoles() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getAddIamRoles() == null) ? 0 : getAddIamRoles().hashCode()); 
        hashCode = prime * hashCode + ((getRemoveIamRoles() == null) ? 0 : getRemoveIamRoles().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyClusterIamRolesRequest == false) return false;
        ModifyClusterIamRolesRequest other = (ModifyClusterIamRolesRequest)obj;
        
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.getAddIamRoles() == null ^ this.getAddIamRoles() == null) return false;
        if (other.getAddIamRoles() != null && other.getAddIamRoles().equals(this.getAddIamRoles()) == false) return false; 
        if (other.getRemoveIamRoles() == null ^ this.getRemoveIamRoles() == null) return false;
        if (other.getRemoveIamRoles() != null && other.getRemoveIamRoles().equals(this.getRemoveIamRoles()) == false) return false; 
        return true;
    }
    
    @Override
    public ModifyClusterIamRolesRequest clone() {
        
            return (ModifyClusterIamRolesRequest) super.clone();
    }

}
    