/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/DeleteToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the request succeeded or failed.
     * </p>
     */
    private Boolean isSuccess;

    /**
     * <p>
     * Indicates whether the request succeeded or failed.
     * </p>
     * 
     * @param isSuccess
     *        Indicates whether the request succeeded or failed.
     */

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    /**
     * <p>
     * Indicates whether the request succeeded or failed.
     * </p>
     * 
     * @return Indicates whether the request succeeded or failed.
     */

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * <p>
     * Indicates whether the request succeeded or failed.
     * </p>
     * 
     * @param isSuccess
     *        Indicates whether the request succeeded or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTokenResult withIsSuccess(Boolean isSuccess) {
        setIsSuccess(isSuccess);
        return this;
    }

    /**
     * <p>
     * Indicates whether the request succeeded or failed.
     * </p>
     * 
     * @return Indicates whether the request succeeded or failed.
     */

    public Boolean isSuccess() {
        return this.isSuccess;
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
        if (getIsSuccess() != null)
            sb.append("IsSuccess: ").append(getIsSuccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTokenResult == false)
            return false;
        DeleteTokenResult other = (DeleteTokenResult) obj;
        if (other.getIsSuccess() == null ^ this.getIsSuccess() == null)
            return false;
        if (other.getIsSuccess() != null && other.getIsSuccess().equals(this.getIsSuccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsSuccess() == null) ? 0 : getIsSuccess().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTokenResult clone() {
        try {
            return (DeleteTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
