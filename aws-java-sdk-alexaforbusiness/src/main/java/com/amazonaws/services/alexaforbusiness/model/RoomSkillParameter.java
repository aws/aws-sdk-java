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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A skill parameter associated with a room.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RoomSkillParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoomSkillParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parameter key of a room skill parameter. ParameterKey is an enumerated type that only takes “DEFAULT” or
     * “SCOPE” as valid values.
     * </p>
     */
    private String parameterKey;
    /**
     * <p>
     * The parameter value of a room skill parameter.
     * </p>
     */
    private String parameterValue;

    /**
     * <p>
     * The parameter key of a room skill parameter. ParameterKey is an enumerated type that only takes “DEFAULT” or
     * “SCOPE” as valid values.
     * </p>
     * 
     * @param parameterKey
     *        The parameter key of a room skill parameter. ParameterKey is an enumerated type that only takes “DEFAULT”
     *        or “SCOPE” as valid values.
     */

    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }

    /**
     * <p>
     * The parameter key of a room skill parameter. ParameterKey is an enumerated type that only takes “DEFAULT” or
     * “SCOPE” as valid values.
     * </p>
     * 
     * @return The parameter key of a room skill parameter. ParameterKey is an enumerated type that only takes “DEFAULT”
     *         or “SCOPE” as valid values.
     */

    public String getParameterKey() {
        return this.parameterKey;
    }

    /**
     * <p>
     * The parameter key of a room skill parameter. ParameterKey is an enumerated type that only takes “DEFAULT” or
     * “SCOPE” as valid values.
     * </p>
     * 
     * @param parameterKey
     *        The parameter key of a room skill parameter. ParameterKey is an enumerated type that only takes “DEFAULT”
     *        or “SCOPE” as valid values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoomSkillParameter withParameterKey(String parameterKey) {
        setParameterKey(parameterKey);
        return this;
    }

    /**
     * <p>
     * The parameter value of a room skill parameter.
     * </p>
     * 
     * @param parameterValue
     *        The parameter value of a room skill parameter.
     */

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    /**
     * <p>
     * The parameter value of a room skill parameter.
     * </p>
     * 
     * @return The parameter value of a room skill parameter.
     */

    public String getParameterValue() {
        return this.parameterValue;
    }

    /**
     * <p>
     * The parameter value of a room skill parameter.
     * </p>
     * 
     * @param parameterValue
     *        The parameter value of a room skill parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoomSkillParameter withParameterValue(String parameterValue) {
        setParameterValue(parameterValue);
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
        if (getParameterKey() != null)
            sb.append("ParameterKey: ").append(getParameterKey()).append(",");
        if (getParameterValue() != null)
            sb.append("ParameterValue: ").append(getParameterValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoomSkillParameter == false)
            return false;
        RoomSkillParameter other = (RoomSkillParameter) obj;
        if (other.getParameterKey() == null ^ this.getParameterKey() == null)
            return false;
        if (other.getParameterKey() != null && other.getParameterKey().equals(this.getParameterKey()) == false)
            return false;
        if (other.getParameterValue() == null ^ this.getParameterValue() == null)
            return false;
        if (other.getParameterValue() != null && other.getParameterValue().equals(this.getParameterValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterKey() == null) ? 0 : getParameterKey().hashCode());
        hashCode = prime * hashCode + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode());
        return hashCode;
    }

    @Override
    public RoomSkillParameter clone() {
        try {
            return (RoomSkillParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.RoomSkillParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
