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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/UpdateACL" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateACLResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The updated Access Control List
     * </p>
     */
    private ACL aCL;

    /**
     * <p>
     * The updated Access Control List
     * </p>
     * 
     * @param aCL
     *        The updated Access Control List
     */

    public void setACL(ACL aCL) {
        this.aCL = aCL;
    }

    /**
     * <p>
     * The updated Access Control List
     * </p>
     * 
     * @return The updated Access Control List
     */

    public ACL getACL() {
        return this.aCL;
    }

    /**
     * <p>
     * The updated Access Control List
     * </p>
     * 
     * @param aCL
     *        The updated Access Control List
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateACLResult withACL(ACL aCL) {
        setACL(aCL);
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
        if (getACL() != null)
            sb.append("ACL: ").append(getACL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateACLResult == false)
            return false;
        UpdateACLResult other = (UpdateACLResult) obj;
        if (other.getACL() == null ^ this.getACL() == null)
            return false;
        if (other.getACL() != null && other.getACL().equals(this.getACL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getACL() == null) ? 0 : getACL().hashCode());
        return hashCode;
    }

    @Override
    public UpdateACLResult clone() {
        try {
            return (UpdateACLResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
