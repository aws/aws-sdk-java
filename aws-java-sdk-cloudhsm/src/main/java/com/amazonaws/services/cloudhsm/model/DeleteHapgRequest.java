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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the inputs for the <a>DeleteHapg</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DeleteHapg" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteHapgRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the high-availability partition group to delete.
     * </p>
     */
    private String hapgArn;

    /**
     * <p>
     * The ARN of the high-availability partition group to delete.
     * </p>
     * 
     * @param hapgArn
     *        The ARN of the high-availability partition group to delete.
     */

    public void setHapgArn(String hapgArn) {
        this.hapgArn = hapgArn;
    }

    /**
     * <p>
     * The ARN of the high-availability partition group to delete.
     * </p>
     * 
     * @return The ARN of the high-availability partition group to delete.
     */

    public String getHapgArn() {
        return this.hapgArn;
    }

    /**
     * <p>
     * The ARN of the high-availability partition group to delete.
     * </p>
     * 
     * @param hapgArn
     *        The ARN of the high-availability partition group to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteHapgRequest withHapgArn(String hapgArn) {
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

        if (obj instanceof DeleteHapgRequest == false)
            return false;
        DeleteHapgRequest other = (DeleteHapgRequest) obj;
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
    public DeleteHapgRequest clone() {
        return (DeleteHapgRequest) super.clone();
    }

}
