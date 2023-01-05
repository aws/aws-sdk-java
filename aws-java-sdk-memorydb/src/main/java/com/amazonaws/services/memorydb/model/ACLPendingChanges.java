/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns the updates being applied to the ACL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ACLPendingChanges" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ACLPendingChanges implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of user names being removed from the ACL
     * </p>
     */
    private java.util.List<String> userNamesToRemove;
    /**
     * <p>
     * A list of users being added to the ACL
     * </p>
     */
    private java.util.List<String> userNamesToAdd;

    /**
     * <p>
     * A list of user names being removed from the ACL
     * </p>
     * 
     * @return A list of user names being removed from the ACL
     */

    public java.util.List<String> getUserNamesToRemove() {
        return userNamesToRemove;
    }

    /**
     * <p>
     * A list of user names being removed from the ACL
     * </p>
     * 
     * @param userNamesToRemove
     *        A list of user names being removed from the ACL
     */

    public void setUserNamesToRemove(java.util.Collection<String> userNamesToRemove) {
        if (userNamesToRemove == null) {
            this.userNamesToRemove = null;
            return;
        }

        this.userNamesToRemove = new java.util.ArrayList<String>(userNamesToRemove);
    }

    /**
     * <p>
     * A list of user names being removed from the ACL
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserNamesToRemove(java.util.Collection)} or {@link #withUserNamesToRemove(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param userNamesToRemove
     *        A list of user names being removed from the ACL
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ACLPendingChanges withUserNamesToRemove(String... userNamesToRemove) {
        if (this.userNamesToRemove == null) {
            setUserNamesToRemove(new java.util.ArrayList<String>(userNamesToRemove.length));
        }
        for (String ele : userNamesToRemove) {
            this.userNamesToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of user names being removed from the ACL
     * </p>
     * 
     * @param userNamesToRemove
     *        A list of user names being removed from the ACL
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ACLPendingChanges withUserNamesToRemove(java.util.Collection<String> userNamesToRemove) {
        setUserNamesToRemove(userNamesToRemove);
        return this;
    }

    /**
     * <p>
     * A list of users being added to the ACL
     * </p>
     * 
     * @return A list of users being added to the ACL
     */

    public java.util.List<String> getUserNamesToAdd() {
        return userNamesToAdd;
    }

    /**
     * <p>
     * A list of users being added to the ACL
     * </p>
     * 
     * @param userNamesToAdd
     *        A list of users being added to the ACL
     */

    public void setUserNamesToAdd(java.util.Collection<String> userNamesToAdd) {
        if (userNamesToAdd == null) {
            this.userNamesToAdd = null;
            return;
        }

        this.userNamesToAdd = new java.util.ArrayList<String>(userNamesToAdd);
    }

    /**
     * <p>
     * A list of users being added to the ACL
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserNamesToAdd(java.util.Collection)} or {@link #withUserNamesToAdd(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userNamesToAdd
     *        A list of users being added to the ACL
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ACLPendingChanges withUserNamesToAdd(String... userNamesToAdd) {
        if (this.userNamesToAdd == null) {
            setUserNamesToAdd(new java.util.ArrayList<String>(userNamesToAdd.length));
        }
        for (String ele : userNamesToAdd) {
            this.userNamesToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of users being added to the ACL
     * </p>
     * 
     * @param userNamesToAdd
     *        A list of users being added to the ACL
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ACLPendingChanges withUserNamesToAdd(java.util.Collection<String> userNamesToAdd) {
        setUserNamesToAdd(userNamesToAdd);
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
        if (getUserNamesToRemove() != null)
            sb.append("UserNamesToRemove: ").append(getUserNamesToRemove()).append(",");
        if (getUserNamesToAdd() != null)
            sb.append("UserNamesToAdd: ").append(getUserNamesToAdd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ACLPendingChanges == false)
            return false;
        ACLPendingChanges other = (ACLPendingChanges) obj;
        if (other.getUserNamesToRemove() == null ^ this.getUserNamesToRemove() == null)
            return false;
        if (other.getUserNamesToRemove() != null && other.getUserNamesToRemove().equals(this.getUserNamesToRemove()) == false)
            return false;
        if (other.getUserNamesToAdd() == null ^ this.getUserNamesToAdd() == null)
            return false;
        if (other.getUserNamesToAdd() != null && other.getUserNamesToAdd().equals(this.getUserNamesToAdd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserNamesToRemove() == null) ? 0 : getUserNamesToRemove().hashCode());
        hashCode = prime * hashCode + ((getUserNamesToAdd() == null) ? 0 : getUserNamesToAdd().hashCode());
        return hashCode;
    }

    @Override
    public ACLPendingChanges clone() {
        try {
            return (ACLPendingChanges) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.ACLPendingChangesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
