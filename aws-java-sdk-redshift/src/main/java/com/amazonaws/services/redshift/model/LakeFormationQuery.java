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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The Lake Formation scope.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/LakeFormationQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LakeFormationQuery implements Serializable, Cloneable {

    /**
     * <p>
     * Determines whether the query scope is enabled or disabled.
     * </p>
     */
    private String authorization;

    /**
     * <p>
     * Determines whether the query scope is enabled or disabled.
     * </p>
     * 
     * @param authorization
     *        Determines whether the query scope is enabled or disabled.
     * @see ServiceAuthorization
     */

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    /**
     * <p>
     * Determines whether the query scope is enabled or disabled.
     * </p>
     * 
     * @return Determines whether the query scope is enabled or disabled.
     * @see ServiceAuthorization
     */

    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * <p>
     * Determines whether the query scope is enabled or disabled.
     * </p>
     * 
     * @param authorization
     *        Determines whether the query scope is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceAuthorization
     */

    public LakeFormationQuery withAuthorization(String authorization) {
        setAuthorization(authorization);
        return this;
    }

    /**
     * <p>
     * Determines whether the query scope is enabled or disabled.
     * </p>
     * 
     * @param authorization
     *        Determines whether the query scope is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceAuthorization
     */

    public LakeFormationQuery withAuthorization(ServiceAuthorization authorization) {
        this.authorization = authorization.toString();
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
        if (getAuthorization() != null)
            sb.append("Authorization: ").append(getAuthorization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LakeFormationQuery == false)
            return false;
        LakeFormationQuery other = (LakeFormationQuery) obj;
        if (other.getAuthorization() == null ^ this.getAuthorization() == null)
            return false;
        if (other.getAuthorization() != null && other.getAuthorization().equals(this.getAuthorization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorization() == null) ? 0 : getAuthorization().hashCode());
        return hashCode;
    }

    @Override
    public LakeFormationQuery clone() {
        try {
            return (LakeFormationQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
