/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteInstanceProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteInstanceProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the instance profile to delete.
     * </p>
     */
    private String instanceProfileIdentifier;

    /**
     * <p>
     * The identifier of the instance profile to delete.
     * </p>
     * 
     * @param instanceProfileIdentifier
     *        The identifier of the instance profile to delete.
     */

    public void setInstanceProfileIdentifier(String instanceProfileIdentifier) {
        this.instanceProfileIdentifier = instanceProfileIdentifier;
    }

    /**
     * <p>
     * The identifier of the instance profile to delete.
     * </p>
     * 
     * @return The identifier of the instance profile to delete.
     */

    public String getInstanceProfileIdentifier() {
        return this.instanceProfileIdentifier;
    }

    /**
     * <p>
     * The identifier of the instance profile to delete.
     * </p>
     * 
     * @param instanceProfileIdentifier
     *        The identifier of the instance profile to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInstanceProfileRequest withInstanceProfileIdentifier(String instanceProfileIdentifier) {
        setInstanceProfileIdentifier(instanceProfileIdentifier);
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
        if (getInstanceProfileIdentifier() != null)
            sb.append("InstanceProfileIdentifier: ").append(getInstanceProfileIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInstanceProfileRequest == false)
            return false;
        DeleteInstanceProfileRequest other = (DeleteInstanceProfileRequest) obj;
        if (other.getInstanceProfileIdentifier() == null ^ this.getInstanceProfileIdentifier() == null)
            return false;
        if (other.getInstanceProfileIdentifier() != null && other.getInstanceProfileIdentifier().equals(this.getInstanceProfileIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceProfileIdentifier() == null) ? 0 : getInstanceProfileIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInstanceProfileRequest clone() {
        return (DeleteInstanceProfileRequest) super.clone();
    }

}
