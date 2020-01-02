/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The type of elastic inference accelerator. The possible values are <code>eia1.medium</code>,
     * <code>eia1.large</code>, and <code>eia1.xlarge</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The number of elastic inference accelerators to attach to the instance.
     * </p>
     * <p>
     * Default: 1
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The type of elastic inference accelerator. The possible values are <code>eia1.medium</code>,
     * <code>eia1.large</code>, and <code>eia1.xlarge</code>.
     * </p>
     * 
     * @param type
     *        The type of elastic inference accelerator. The possible values are <code>eia1.medium</code>,
     *        <code>eia1.large</code>, and <code>eia1.xlarge</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of elastic inference accelerator. The possible values are <code>eia1.medium</code>,
     * <code>eia1.large</code>, and <code>eia1.xlarge</code>.
     * </p>
     * 
     * @return The type of elastic inference accelerator. The possible values are <code>eia1.medium</code>,
     *         <code>eia1.large</code>, and <code>eia1.xlarge</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of elastic inference accelerator. The possible values are <code>eia1.medium</code>,
     * <code>eia1.large</code>, and <code>eia1.xlarge</code>.
     * </p>
     * 
     * @param type
     *        The type of elastic inference accelerator. The possible values are <code>eia1.medium</code>,
     *        <code>eia1.large</code>, and <code>eia1.xlarge</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticInferenceAccelerator withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The number of elastic inference accelerators to attach to the instance.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @param count
     *        The number of elastic inference accelerators to attach to the instance. </p>
     *        <p>
     *        Default: 1
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of elastic inference accelerators to attach to the instance.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @return The number of elastic inference accelerators to attach to the instance. </p>
     *         <p>
     *         Default: 1
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of elastic inference accelerators to attach to the instance.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * 
     * @param count
     *        The number of elastic inference accelerators to attach to the instance. </p>
     *        <p>
     *        Default: 1
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticInferenceAccelerator withCount(Integer count) {
        setCount(count);
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
            sb.append("Type: ").append(getType()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
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
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
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
