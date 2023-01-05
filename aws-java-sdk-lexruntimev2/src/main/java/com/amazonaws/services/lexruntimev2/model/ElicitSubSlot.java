/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The specific constituent sub slot of the composite slot to elicit in dialog action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/ElicitSubSlot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElicitSubSlot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The field is not supported.
     * </p>
     */
    private ElicitSubSlot subSlotToElicit;

    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     * 
     * @param name
     *        The name of the slot that should be elicited from the user.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     * 
     * @return The name of the slot that should be elicited from the user.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     * 
     * @param name
     *        The name of the slot that should be elicited from the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElicitSubSlot withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The field is not supported.
     * </p>
     * 
     * @param subSlotToElicit
     *        The field is not supported.
     */

    public void setSubSlotToElicit(ElicitSubSlot subSlotToElicit) {
        this.subSlotToElicit = subSlotToElicit;
    }

    /**
     * <p>
     * The field is not supported.
     * </p>
     * 
     * @return The field is not supported.
     */

    public ElicitSubSlot getSubSlotToElicit() {
        return this.subSlotToElicit;
    }

    /**
     * <p>
     * The field is not supported.
     * </p>
     * 
     * @param subSlotToElicit
     *        The field is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElicitSubSlot withSubSlotToElicit(ElicitSubSlot subSlotToElicit) {
        setSubSlotToElicit(subSlotToElicit);
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
        if (getSubSlotToElicit() != null)
            sb.append("SubSlotToElicit: ").append(getSubSlotToElicit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElicitSubSlot == false)
            return false;
        ElicitSubSlot other = (ElicitSubSlot) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSubSlotToElicit() == null ^ this.getSubSlotToElicit() == null)
            return false;
        if (other.getSubSlotToElicit() != null && other.getSubSlotToElicit().equals(this.getSubSlotToElicit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSubSlotToElicit() == null) ? 0 : getSubSlotToElicit().hashCode());
        return hashCode;
    }

    @Override
    public ElicitSubSlot clone() {
        try {
            return (ElicitSubSlot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.ElicitSubSlotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
