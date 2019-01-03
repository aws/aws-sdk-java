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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an elastic inference accelerator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ElasticInferenceAccelerator" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticInferenceAccelerator implements Serializable, Cloneable {

    /**
     * <p>
     * The type of elastic inference accelerator. The possible values are eia1.small, eia1.medium, and eia1.large.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The type of elastic inference accelerator. The possible values are eia1.small, eia1.medium, and eia1.large.
     * </p>
     * 
     * @param type
     *        The type of elastic inference accelerator. The possible values are eia1.small, eia1.medium, and
     *        eia1.large.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of elastic inference accelerator. The possible values are eia1.small, eia1.medium, and eia1.large.
     * </p>
     * 
     * @return The type of elastic inference accelerator. The possible values are eia1.small, eia1.medium, and
     *         eia1.large.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of elastic inference accelerator. The possible values are eia1.small, eia1.medium, and eia1.large.
     * </p>
     * 
     * @param type
     *        The type of elastic inference accelerator. The possible values are eia1.small, eia1.medium, and
     *        eia1.large.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticInferenceAccelerator withType(String type) {
        setType(type);
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticInferenceAccelerator == false)
            return false;
        ElasticInferenceAccelerator other = (ElasticInferenceAccelerator) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ElasticInferenceAccelerator clone() {
        try {
            return (ElasticInferenceAccelerator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
