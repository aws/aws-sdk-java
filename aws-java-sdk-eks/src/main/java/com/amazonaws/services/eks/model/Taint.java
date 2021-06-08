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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A property that allows a node to repel a set of pods.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/Taint" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Taint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key of the taint.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value of the taint.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The effect of the taint.
     * </p>
     */
    private String effect;

    /**
     * <p>
     * The key of the taint.
     * </p>
     * 
     * @param key
     *        The key of the taint.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the taint.
     * </p>
     * 
     * @return The key of the taint.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key of the taint.
     * </p>
     * 
     * @param key
     *        The key of the taint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Taint withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value of the taint.
     * </p>
     * 
     * @param value
     *        The value of the taint.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the taint.
     * </p>
     * 
     * @return The value of the taint.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the taint.
     * </p>
     * 
     * @param value
     *        The value of the taint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Taint withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The effect of the taint.
     * </p>
     * 
     * @param effect
     *        The effect of the taint.
     * @see TaintEffect
     */

    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * <p>
     * The effect of the taint.
     * </p>
     * 
     * @return The effect of the taint.
     * @see TaintEffect
     */

    public String getEffect() {
        return this.effect;
    }

    /**
     * <p>
     * The effect of the taint.
     * </p>
     * 
     * @param effect
     *        The effect of the taint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaintEffect
     */

    public Taint withEffect(String effect) {
        setEffect(effect);
        return this;
    }

    /**
     * <p>
     * The effect of the taint.
     * </p>
     * 
     * @param effect
     *        The effect of the taint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaintEffect
     */

    public Taint withEffect(TaintEffect effect) {
        this.effect = effect.toString();
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getEffect() != null)
            sb.append("Effect: ").append(getEffect());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Taint == false)
            return false;
        Taint other = (Taint) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getEffect() == null ^ this.getEffect() == null)
            return false;
        if (other.getEffect() != null && other.getEffect().equals(this.getEffect()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getEffect() == null) ? 0 : getEffect().hashCode());
        return hashCode;
    }

    @Override
    public Taint clone() {
        try {
            return (Taint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.TaintMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
