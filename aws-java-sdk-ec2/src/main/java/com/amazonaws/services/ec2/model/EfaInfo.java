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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the Elastic Fabric Adapters for the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/EfaInfo" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EfaInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of Elastic Fabric Adapters for the instance type.
     * </p>
     */
    private Integer maximumEfaInterfaces;

    /**
     * <p>
     * The maximum number of Elastic Fabric Adapters for the instance type.
     * </p>
     * 
     * @param maximumEfaInterfaces
     *        The maximum number of Elastic Fabric Adapters for the instance type.
     */

    public void setMaximumEfaInterfaces(Integer maximumEfaInterfaces) {
        this.maximumEfaInterfaces = maximumEfaInterfaces;
    }

    /**
     * <p>
     * The maximum number of Elastic Fabric Adapters for the instance type.
     * </p>
     * 
     * @return The maximum number of Elastic Fabric Adapters for the instance type.
     */

    public Integer getMaximumEfaInterfaces() {
        return this.maximumEfaInterfaces;
    }

    /**
     * <p>
     * The maximum number of Elastic Fabric Adapters for the instance type.
     * </p>
     * 
     * @param maximumEfaInterfaces
     *        The maximum number of Elastic Fabric Adapters for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EfaInfo withMaximumEfaInterfaces(Integer maximumEfaInterfaces) {
        setMaximumEfaInterfaces(maximumEfaInterfaces);
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
        if (getMaximumEfaInterfaces() != null)
            sb.append("MaximumEfaInterfaces: ").append(getMaximumEfaInterfaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EfaInfo == false)
            return false;
        EfaInfo other = (EfaInfo) obj;
        if (other.getMaximumEfaInterfaces() == null ^ this.getMaximumEfaInterfaces() == null)
            return false;
        if (other.getMaximumEfaInterfaces() != null && other.getMaximumEfaInterfaces().equals(this.getMaximumEfaInterfaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumEfaInterfaces() == null) ? 0 : getMaximumEfaInterfaces().hashCode());
        return hashCode;
    }

    @Override
    public EfaInfo clone() {
        try {
            return (EfaInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
