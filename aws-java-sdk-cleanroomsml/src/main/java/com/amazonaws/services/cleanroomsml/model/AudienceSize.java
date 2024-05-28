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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The size of the generated audience. Must match one of the sizes in the configured audience model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/AudienceSize" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudienceSize implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether the audience size is defined in absolute terms or as a percentage. You can use the <code>ABSOLUTE</code>
     * <a>AudienceSize</a> to configure out audience sizes using the count of identifiers in the output. You can use the
     * <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Specify an audience size value.
     * </p>
     */
    private Integer value;

    /**
     * <p>
     * Whether the audience size is defined in absolute terms or as a percentage. You can use the <code>ABSOLUTE</code>
     * <a>AudienceSize</a> to configure out audience sizes using the count of identifiers in the output. You can use the
     * <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
     * </p>
     * 
     * @param type
     *        Whether the audience size is defined in absolute terms or as a percentage. You can use the
     *        <code>ABSOLUTE</code> <a>AudienceSize</a> to configure out audience sizes using the count of identifiers
     *        in the output. You can use the <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range
     *        1-100 percent.
     * @see AudienceSizeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Whether the audience size is defined in absolute terms or as a percentage. You can use the <code>ABSOLUTE</code>
     * <a>AudienceSize</a> to configure out audience sizes using the count of identifiers in the output. You can use the
     * <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
     * </p>
     * 
     * @return Whether the audience size is defined in absolute terms or as a percentage. You can use the
     *         <code>ABSOLUTE</code> <a>AudienceSize</a> to configure out audience sizes using the count of identifiers
     *         in the output. You can use the <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the
     *         range 1-100 percent.
     * @see AudienceSizeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Whether the audience size is defined in absolute terms or as a percentage. You can use the <code>ABSOLUTE</code>
     * <a>AudienceSize</a> to configure out audience sizes using the count of identifiers in the output. You can use the
     * <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
     * </p>
     * 
     * @param type
     *        Whether the audience size is defined in absolute terms or as a percentage. You can use the
     *        <code>ABSOLUTE</code> <a>AudienceSize</a> to configure out audience sizes using the count of identifiers
     *        in the output. You can use the <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range
     *        1-100 percent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudienceSizeType
     */

    public AudienceSize withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Whether the audience size is defined in absolute terms or as a percentage. You can use the <code>ABSOLUTE</code>
     * <a>AudienceSize</a> to configure out audience sizes using the count of identifiers in the output. You can use the
     * <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range 1-100 percent.
     * </p>
     * 
     * @param type
     *        Whether the audience size is defined in absolute terms or as a percentage. You can use the
     *        <code>ABSOLUTE</code> <a>AudienceSize</a> to configure out audience sizes using the count of identifiers
     *        in the output. You can use the <code>Percentage</code> <a>AudienceSize</a> to configure sizes in the range
     *        1-100 percent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudienceSizeType
     */

    public AudienceSize withType(AudienceSizeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Specify an audience size value.
     * </p>
     * 
     * @param value
     *        Specify an audience size value.
     */

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * Specify an audience size value.
     * </p>
     * 
     * @return Specify an audience size value.
     */

    public Integer getValue() {
        return this.value;
    }

    /**
     * <p>
     * Specify an audience size value.
     * </p>
     * 
     * @param value
     *        Specify an audience size value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceSize withValue(Integer value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudienceSize == false)
            return false;
        AudienceSize other = (AudienceSize) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AudienceSize clone() {
        try {
            return (AudienceSize) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanroomsml.model.transform.AudienceSizeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
