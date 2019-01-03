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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DeleteSubnetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSubnetGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A user-specified message for this action (i.e., a reason for deleting the subnet group).
     * </p>
     */
    private String deletionMessage;

    /**
     * <p>
     * A user-specified message for this action (i.e., a reason for deleting the subnet group).
     * </p>
     * 
     * @param deletionMessage
     *        A user-specified message for this action (i.e., a reason for deleting the subnet group).
     */

    public void setDeletionMessage(String deletionMessage) {
        this.deletionMessage = deletionMessage;
    }

    /**
     * <p>
     * A user-specified message for this action (i.e., a reason for deleting the subnet group).
     * </p>
     * 
     * @return A user-specified message for this action (i.e., a reason for deleting the subnet group).
     */

    public String getDeletionMessage() {
        return this.deletionMessage;
    }

    /**
     * <p>
     * A user-specified message for this action (i.e., a reason for deleting the subnet group).
     * </p>
     * 
     * @param deletionMessage
     *        A user-specified message for this action (i.e., a reason for deleting the subnet group).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSubnetGroupResult withDeletionMessage(String deletionMessage) {
        setDeletionMessage(deletionMessage);
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
        if (getDeletionMessage() != null)
            sb.append("DeletionMessage: ").append(getDeletionMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSubnetGroupResult == false)
            return false;
        DeleteSubnetGroupResult other = (DeleteSubnetGroupResult) obj;
        if (other.getDeletionMessage() == null ^ this.getDeletionMessage() == null)
            return false;
        if (other.getDeletionMessage() != null && other.getDeletionMessage().equals(this.getDeletionMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeletionMessage() == null) ? 0 : getDeletionMessage().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSubnetGroupResult clone() {
        try {
            return (DeleteSubnetGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
