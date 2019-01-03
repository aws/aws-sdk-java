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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the output of the <a>CreateHAPartitionGroup</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/CreateHapg" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHapgResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the high-availability partition group.
     * </p>
     */
    private String hapgArn;

    /**
     * <p>
     * The ARN of the high-availability partition group.
     * </p>
     * 
     * @param hapgArn
     *        The ARN of the high-availability partition group.
     */

    public void setHapgArn(String hapgArn) {
        this.hapgArn = hapgArn;
    }

    /**
     * <p>
     * The ARN of the high-availability partition group.
     * </p>
     * 
     * @return The ARN of the high-availability partition group.
     */

    public String getHapgArn() {
        return this.hapgArn;
    }

    /**
     * <p>
     * The ARN of the high-availability partition group.
     * </p>
     * 
     * @param hapgArn
     *        The ARN of the high-availability partition group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHapgResult withHapgArn(String hapgArn) {
        setHapgArn(hapgArn);
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
        if (getHapgArn() != null)
            sb.append("HapgArn: ").append(getHapgArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHapgResult == false)
            return false;
        CreateHapgResult other = (CreateHapgResult) obj;
        if (other.getHapgArn() == null ^ this.getHapgArn() == null)
            return false;
        if (other.getHapgArn() != null && other.getHapgArn().equals(this.getHapgArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHapgArn() == null) ? 0 : getHapgArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateHapgResult clone() {
        try {
            return (CreateHapgResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
