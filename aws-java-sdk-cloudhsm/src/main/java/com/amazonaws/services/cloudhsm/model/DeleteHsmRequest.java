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
 * Contains the inputs for the <a>DeleteHsm</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DeleteHsm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteHsmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the HSM to delete.
     * </p>
     */
    private String hsmArn;

    /**
     * <p>
     * The ARN of the HSM to delete.
     * </p>
     * 
     * @param hsmArn
     *        The ARN of the HSM to delete.
     */

    public void setHsmArn(String hsmArn) {
        this.hsmArn = hsmArn;
    }

    /**
     * <p>
     * The ARN of the HSM to delete.
     * </p>
     * 
     * @return The ARN of the HSM to delete.
     */

    public String getHsmArn() {
        return this.hsmArn;
    }

    /**
     * <p>
     * The ARN of the HSM to delete.
     * </p>
     * 
     * @param hsmArn
     *        The ARN of the HSM to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteHsmRequest withHsmArn(String hsmArn) {
        setHsmArn(hsmArn);
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
        if (getHsmArn() != null)
            sb.append("HsmArn: ").append(getHsmArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteHsmRequest == false)
            return false;
        DeleteHsmRequest other = (DeleteHsmRequest) obj;
        if (other.getHsmArn() == null ^ this.getHsmArn() == null)
            return false;
        if (other.getHsmArn() != null && other.getHsmArn().equals(this.getHsmArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHsmArn() == null) ? 0 : getHsmArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteHsmRequest clone() {
        return (DeleteHsmRequest) super.clone();
    }

}
