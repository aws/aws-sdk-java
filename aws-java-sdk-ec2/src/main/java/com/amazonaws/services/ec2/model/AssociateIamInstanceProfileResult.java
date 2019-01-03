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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateIamInstanceProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the IAM instance profile association.
     * </p>
     */
    private IamInstanceProfileAssociation iamInstanceProfileAssociation;

    /**
     * <p>
     * Information about the IAM instance profile association.
     * </p>
     * 
     * @param iamInstanceProfileAssociation
     *        Information about the IAM instance profile association.
     */

    public void setIamInstanceProfileAssociation(IamInstanceProfileAssociation iamInstanceProfileAssociation) {
        this.iamInstanceProfileAssociation = iamInstanceProfileAssociation;
    }

    /**
     * <p>
     * Information about the IAM instance profile association.
     * </p>
     * 
     * @return Information about the IAM instance profile association.
     */

    public IamInstanceProfileAssociation getIamInstanceProfileAssociation() {
        return this.iamInstanceProfileAssociation;
    }

    /**
     * <p>
     * Information about the IAM instance profile association.
     * </p>
     * 
     * @param iamInstanceProfileAssociation
     *        Information about the IAM instance profile association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIamInstanceProfileResult withIamInstanceProfileAssociation(IamInstanceProfileAssociation iamInstanceProfileAssociation) {
        setIamInstanceProfileAssociation(iamInstanceProfileAssociation);
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
        if (getIamInstanceProfileAssociation() != null)
            sb.append("IamInstanceProfileAssociation: ").append(getIamInstanceProfileAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateIamInstanceProfileResult == false)
            return false;
        AssociateIamInstanceProfileResult other = (AssociateIamInstanceProfileResult) obj;
        if (other.getIamInstanceProfileAssociation() == null ^ this.getIamInstanceProfileAssociation() == null)
            return false;
        if (other.getIamInstanceProfileAssociation() != null
                && other.getIamInstanceProfileAssociation().equals(this.getIamInstanceProfileAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIamInstanceProfileAssociation() == null) ? 0 : getIamInstanceProfileAssociation().hashCode());
        return hashCode;
    }

    @Override
    public AssociateIamInstanceProfileResult clone() {
        try {
            return (AssociateIamInstanceProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
