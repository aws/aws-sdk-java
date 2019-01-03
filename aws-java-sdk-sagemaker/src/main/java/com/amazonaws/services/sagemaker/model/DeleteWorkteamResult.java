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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteWorkteam" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteWorkteamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns <code>true</code> if the work team was successfully deleted; otherwise, returns <code>false</code>.
     * </p>
     */
    private Boolean success;

    /**
     * <p>
     * Returns <code>true</code> if the work team was successfully deleted; otherwise, returns <code>false</code>.
     * </p>
     * 
     * @param success
     *        Returns <code>true</code> if the work team was successfully deleted; otherwise, returns <code>false</code>
     *        .
     */

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * <p>
     * Returns <code>true</code> if the work team was successfully deleted; otherwise, returns <code>false</code>.
     * </p>
     * 
     * @return Returns <code>true</code> if the work team was successfully deleted; otherwise, returns
     *         <code>false</code>.
     */

    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * <p>
     * Returns <code>true</code> if the work team was successfully deleted; otherwise, returns <code>false</code>.
     * </p>
     * 
     * @param success
     *        Returns <code>true</code> if the work team was successfully deleted; otherwise, returns <code>false</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWorkteamResult withSuccess(Boolean success) {
        setSuccess(success);
        return this;
    }

    /**
     * <p>
     * Returns <code>true</code> if the work team was successfully deleted; otherwise, returns <code>false</code>.
     * </p>
     * 
     * @return Returns <code>true</code> if the work team was successfully deleted; otherwise, returns
     *         <code>false</code>.
     */

    public Boolean isSuccess() {
        return this.success;
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
        if (getSuccess() != null)
            sb.append("Success: ").append(getSuccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteWorkteamResult == false)
            return false;
        DeleteWorkteamResult other = (DeleteWorkteamResult) obj;
        if (other.getSuccess() == null ^ this.getSuccess() == null)
            return false;
        if (other.getSuccess() != null && other.getSuccess().equals(this.getSuccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccess() == null) ? 0 : getSuccess().hashCode());
        return hashCode;
    }

    @Override
    public DeleteWorkteamResult clone() {
        try {
            return (DeleteWorkteamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
