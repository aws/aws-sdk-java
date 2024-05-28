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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/RegisterTargets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterTargetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The targets that were successfully registered.
     * </p>
     */
    private java.util.List<Target> successful;
    /**
     * <p>
     * The targets that were not registered.
     * </p>
     */
    private java.util.List<TargetFailure> unsuccessful;

    /**
     * <p>
     * The targets that were successfully registered.
     * </p>
     * 
     * @return The targets that were successfully registered.
     */

    public java.util.List<Target> getSuccessful() {
        return successful;
    }

    /**
     * <p>
     * The targets that were successfully registered.
     * </p>
     * 
     * @param successful
     *        The targets that were successfully registered.
     */

    public void setSuccessful(java.util.Collection<Target> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new java.util.ArrayList<Target>(successful);
    }

    /**
     * <p>
     * The targets that were successfully registered.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessful(java.util.Collection)} or {@link #withSuccessful(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param successful
     *        The targets that were successfully registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTargetsResult withSuccessful(Target... successful) {
        if (this.successful == null) {
            setSuccessful(new java.util.ArrayList<Target>(successful.length));
        }
        for (Target ele : successful) {
            this.successful.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targets that were successfully registered.
     * </p>
     * 
     * @param successful
     *        The targets that were successfully registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTargetsResult withSuccessful(java.util.Collection<Target> successful) {
        setSuccessful(successful);
        return this;
    }

    /**
     * <p>
     * The targets that were not registered.
     * </p>
     * 
     * @return The targets that were not registered.
     */

    public java.util.List<TargetFailure> getUnsuccessful() {
        return unsuccessful;
    }

    /**
     * <p>
     * The targets that were not registered.
     * </p>
     * 
     * @param unsuccessful
     *        The targets that were not registered.
     */

    public void setUnsuccessful(java.util.Collection<TargetFailure> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
            return;
        }

        this.unsuccessful = new java.util.ArrayList<TargetFailure>(unsuccessful);
    }

    /**
     * <p>
     * The targets that were not registered.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnsuccessful(java.util.Collection)} or {@link #withUnsuccessful(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param unsuccessful
     *        The targets that were not registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTargetsResult withUnsuccessful(TargetFailure... unsuccessful) {
        if (this.unsuccessful == null) {
            setUnsuccessful(new java.util.ArrayList<TargetFailure>(unsuccessful.length));
        }
        for (TargetFailure ele : unsuccessful) {
            this.unsuccessful.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targets that were not registered.
     * </p>
     * 
     * @param unsuccessful
     *        The targets that were not registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterTargetsResult withUnsuccessful(java.util.Collection<TargetFailure> unsuccessful) {
        setUnsuccessful(unsuccessful);
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
        if (getSuccessful() != null)
            sb.append("Successful: ").append(getSuccessful()).append(",");
        if (getUnsuccessful() != null)
            sb.append("Unsuccessful: ").append(getUnsuccessful());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterTargetsResult == false)
            return false;
        RegisterTargetsResult other = (RegisterTargetsResult) obj;
        if (other.getSuccessful() == null ^ this.getSuccessful() == null)
            return false;
        if (other.getSuccessful() != null && other.getSuccessful().equals(this.getSuccessful()) == false)
            return false;
        if (other.getUnsuccessful() == null ^ this.getUnsuccessful() == null)
            return false;
        if (other.getUnsuccessful() != null && other.getUnsuccessful().equals(this.getUnsuccessful()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode());
        hashCode = prime * hashCode + ((getUnsuccessful() == null) ? 0 : getUnsuccessful().hashCode());
        return hashCode;
    }

    @Override
    public RegisterTargetsResult clone() {
        try {
            return (RegisterTargetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
