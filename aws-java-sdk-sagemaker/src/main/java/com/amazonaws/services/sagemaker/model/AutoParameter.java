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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The name and an example value of the hyperparameter that you want to use in Autotune. If Automatic model tuning (AMT)
 * determines that your hyperparameter is eligible for Autotune, an optimal hyperparameter range is selected for you.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the hyperparameter to optimize using Autotune.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An example value of the hyperparameter to optimize using Autotune.
     * </p>
     */
    private String valueHint;

    /**
     * <p>
     * The name of the hyperparameter to optimize using Autotune.
     * </p>
     * 
     * @param name
     *        The name of the hyperparameter to optimize using Autotune.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the hyperparameter to optimize using Autotune.
     * </p>
     * 
     * @return The name of the hyperparameter to optimize using Autotune.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the hyperparameter to optimize using Autotune.
     * </p>
     * 
     * @param name
     *        The name of the hyperparameter to optimize using Autotune.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoParameter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An example value of the hyperparameter to optimize using Autotune.
     * </p>
     * 
     * @param valueHint
     *        An example value of the hyperparameter to optimize using Autotune.
     */

    public void setValueHint(String valueHint) {
        this.valueHint = valueHint;
    }

    /**
     * <p>
     * An example value of the hyperparameter to optimize using Autotune.
     * </p>
     * 
     * @return An example value of the hyperparameter to optimize using Autotune.
     */

    public String getValueHint() {
        return this.valueHint;
    }

    /**
     * <p>
     * An example value of the hyperparameter to optimize using Autotune.
     * </p>
     * 
     * @param valueHint
     *        An example value of the hyperparameter to optimize using Autotune.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoParameter withValueHint(String valueHint) {
        setValueHint(valueHint);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValueHint() != null)
            sb.append("ValueHint: ").append(getValueHint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoParameter == false)
            return false;
        AutoParameter other = (AutoParameter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValueHint() == null ^ this.getValueHint() == null)
            return false;
        if (other.getValueHint() != null && other.getValueHint().equals(this.getValueHint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValueHint() == null) ? 0 : getValueHint().hashCode());
        return hashCode;
    }

    @Override
    public AutoParameter clone() {
        try {
            return (AutoParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
