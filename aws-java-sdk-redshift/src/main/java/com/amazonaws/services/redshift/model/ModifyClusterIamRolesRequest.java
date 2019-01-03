/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterIamRoles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClusterIamRolesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the cluster for which you want to associate or disassociate IAM roles.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * Zero or more IAM roles to associate with the cluster. The roles must be in their Amazon Resource Name (ARN)
     * format. You can associate up to 10 IAM roles with a single cluster in a single request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> addIamRoles;
    /**
     * <p>
     * Zero or more IAM roles in ARN format to disassociate from the cluster. You can disassociate up to 10 IAM roles
     * from a single cluster in a single request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeIamRoles;

    /**
     * <p>
     * The unique identifier of the cluster for which you want to associate or disassociate IAM roles.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster for which you want to associate or disassociate IAM roles.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster for which you want to associate or disassociate IAM roles.
     * </p>
     * 
     * @return The unique identifier of the cluster for which you want to associate or disassociate IAM roles.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster for which you want to associate or disassociate IAM roles.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster for which you want to associate or disassociate IAM roles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterIamRolesRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Zero or more IAM roles to associate with the cluster. The roles must be in their Amazon Resource Name (ARN)
     * format. You can associate up to 10 IAM roles with a single cluster in a single request.
     * </p>
     * 
     * @return Zero or more IAM roles to associate with the cluster. The roles must be in their Amazon Resource Name
     *         (ARN) format. You can associate up to 10 IAM roles with a single cluster in a single request.
     */

    public java.util.List<String> getAddIamRoles() {
        if (addIamRoles == null) {
            addIamRoles = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return addIamRoles;
    }

    /**
     * <p>
     * Zero or more IAM roles to associate with the cluster. The roles must be in their Amazon Resource Name (ARN)
     * format. You can associate up to 10 IAM roles with a single cluster in a single request.
     * </p>
     * 
     * @param addIamRoles
     *        Zero or more IAM roles to associate with the cluster. The roles must be in their Amazon Resource Name
     *        (ARN) format. You can associate up to 10 IAM roles with a single cluster in a single request.
     */

    public void setAddIamRoles(java.util.Collection<String> addIamRoles) {
        if (addIamRoles == null) {
            this.addIamRoles = null;
            return;
        }

        this.addIamRoles = new com.amazonaws.internal.SdkInternalList<String>(addIamRoles);
    }

    /**
     * <p>
     * Zero or more IAM roles to associate with the cluster. The roles must be in their Amazon Resource Name (ARN)
     * format. You can associate up to 10 IAM roles with a single cluster in a single request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddIamRoles(java.util.Collection)} or {@link #withAddIamRoles(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addIamRoles
     *        Zero or more IAM roles to associate with the cluster. The roles must be in their Amazon Resource Name
     *        (ARN) format. You can associate up to 10 IAM roles with a single cluster in a single request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterIamRolesRequest withAddIamRoles(String... addIamRoles) {
        if (this.addIamRoles == null) {
            setAddIamRoles(new com.amazonaws.internal.SdkInternalList<String>(addIamRoles.length));
        }
        for (String ele : addIamRoles) {
            this.addIamRoles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Zero or more IAM roles to associate with the cluster. The roles must be in their Amazon Resource Name (ARN)
     * format. You can associate up to 10 IAM roles with a single cluster in a single request.
     * </p>
     * 
     * @param addIamRoles
     *        Zero or more IAM roles to associate with the cluster. The roles must be in their Amazon Resource Name
     *        (ARN) format. You can associate up to 10 IAM roles with a single cluster in a single request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterIamRolesRequest withAddIamRoles(java.util.Collection<String> addIamRoles) {
        setAddIamRoles(addIamRoles);
        return this;
    }

    /**
     * <p>
     * Zero or more IAM roles in ARN format to disassociate from the cluster. You can disassociate up to 10 IAM roles
     * from a single cluster in a single request.
     * </p>
     * 
     * @return Zero or more IAM roles in ARN format to disassociate from the cluster. You can disassociate up to 10 IAM
     *         roles from a single cluster in a single request.
     */

    public java.util.List<String> getRemoveIamRoles() {
        if (removeIamRoles == null) {
            removeIamRoles = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeIamRoles;
    }

    /**
     * <p>
     * Zero or more IAM roles in ARN format to disassociate from the cluster. You can disassociate up to 10 IAM roles
     * from a single cluster in a single request.
     * </p>
     * 
     * @param removeIamRoles
     *        Zero or more IAM roles in ARN format to disassociate from the cluster. You can disassociate up to 10 IAM
     *        roles from a single cluster in a single request.
     */

    public void setRemoveIamRoles(java.util.Collection<String> removeIamRoles) {
        if (removeIamRoles == null) {
            this.removeIamRoles = null;
            return;
        }

        this.removeIamRoles = new com.amazonaws.internal.SdkInternalList<String>(removeIamRoles);
    }

    /**
     * <p>
     * Zero or more IAM roles in ARN format to disassociate from the cluster. You can disassociate up to 10 IAM roles
     * from a single cluster in a single request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveIamRoles(java.util.Collection)} or {@link #withRemoveIamRoles(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param removeIamRoles
     *        Zero or more IAM roles in ARN format to disassociate from the cluster. You can disassociate up to 10 IAM
     *        roles from a single cluster in a single request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterIamRolesRequest withRemoveIamRoles(String... removeIamRoles) {
        if (this.removeIamRoles == null) {
            setRemoveIamRoles(new com.amazonaws.internal.SdkInternalList<String>(removeIamRoles.length));
        }
        for (String ele : removeIamRoles) {
            this.removeIamRoles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Zero or more IAM roles in ARN format to disassociate from the cluster. You can disassociate up to 10 IAM roles
     * from a single cluster in a single request.
     * </p>
     * 
     * @param removeIamRoles
     *        Zero or more IAM roles in ARN format to disassociate from the cluster. You can disassociate up to 10 IAM
     *        roles from a single cluster in a single request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterIamRolesRequest withRemoveIamRoles(java.util.Collection<String> removeIamRoles) {
        setRemoveIamRoles(removeIamRoles);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getAddIamRoles() != null)
            sb.append("AddIamRoles: ").append(getAddIamRoles()).append(",");
        if (getRemoveIamRoles() != null)
            sb.append("RemoveIamRoles: ").append(getRemoveIamRoles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterIamRolesRequest == false)
            return false;
        ModifyClusterIamRolesRequest other = (ModifyClusterIamRolesRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getAddIamRoles() == null ^ this.getAddIamRoles() == null)
            return false;
        if (other.getAddIamRoles() != null && other.getAddIamRoles().equals(this.getAddIamRoles()) == false)
            return false;
        if (other.getRemoveIamRoles() == null ^ this.getRemoveIamRoles() == null)
            return false;
        if (other.getRemoveIamRoles() != null && other.getRemoveIamRoles().equals(this.getRemoveIamRoles()) == false)
            return false;
        return true;
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
    public ModifyClusterIamRolesRequest clone() {
        return (ModifyClusterIamRolesRequest) super.clone();
    }

}
