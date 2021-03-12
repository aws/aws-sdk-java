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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Program transition configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/Transition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Transition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The position where this program will be inserted relative to the RelativeProgram. Possible values are:
     * AFTER_PROGRAM, and BEFORE_PROGRAM.
     * </p>
     */
    private String relativePosition;
    /**
     * <p>
     * The name of the program that this program will be inserted next to, as defined by RelativePosition.
     * </p>
     */
    private String relativeProgram;
    /**
     * <p>
     * When the program should be played. RELATIVE means that programs will be played back-to-back.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The position where this program will be inserted relative to the RelativeProgram. Possible values are:
     * AFTER_PROGRAM, and BEFORE_PROGRAM.
     * </p>
     * 
     * @param relativePosition
     *        The position where this program will be inserted relative to the RelativeProgram. Possible values are:
     *        AFTER_PROGRAM, and BEFORE_PROGRAM.
     * @see RelativePosition
     */

    public void setRelativePosition(String relativePosition) {
        this.relativePosition = relativePosition;
    }

    /**
     * <p>
     * The position where this program will be inserted relative to the RelativeProgram. Possible values are:
     * AFTER_PROGRAM, and BEFORE_PROGRAM.
     * </p>
     * 
     * @return The position where this program will be inserted relative to the RelativeProgram. Possible values are:
     *         AFTER_PROGRAM, and BEFORE_PROGRAM.
     * @see RelativePosition
     */

    public String getRelativePosition() {
        return this.relativePosition;
    }

    /**
     * <p>
     * The position where this program will be inserted relative to the RelativeProgram. Possible values are:
     * AFTER_PROGRAM, and BEFORE_PROGRAM.
     * </p>
     * 
     * @param relativePosition
     *        The position where this program will be inserted relative to the RelativeProgram. Possible values are:
     *        AFTER_PROGRAM, and BEFORE_PROGRAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelativePosition
     */

    public Transition withRelativePosition(String relativePosition) {
        setRelativePosition(relativePosition);
        return this;
    }

    /**
     * <p>
     * The position where this program will be inserted relative to the RelativeProgram. Possible values are:
     * AFTER_PROGRAM, and BEFORE_PROGRAM.
     * </p>
     * 
     * @param relativePosition
     *        The position where this program will be inserted relative to the RelativeProgram. Possible values are:
     *        AFTER_PROGRAM, and BEFORE_PROGRAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelativePosition
     */

    public Transition withRelativePosition(RelativePosition relativePosition) {
        this.relativePosition = relativePosition.toString();
        return this;
    }

    /**
     * <p>
     * The name of the program that this program will be inserted next to, as defined by RelativePosition.
     * </p>
     * 
     * @param relativeProgram
     *        The name of the program that this program will be inserted next to, as defined by RelativePosition.
     */

    public void setRelativeProgram(String relativeProgram) {
        this.relativeProgram = relativeProgram;
    }

    /**
     * <p>
     * The name of the program that this program will be inserted next to, as defined by RelativePosition.
     * </p>
     * 
     * @return The name of the program that this program will be inserted next to, as defined by RelativePosition.
     */

    public String getRelativeProgram() {
        return this.relativeProgram;
    }

    /**
     * <p>
     * The name of the program that this program will be inserted next to, as defined by RelativePosition.
     * </p>
     * 
     * @param relativeProgram
     *        The name of the program that this program will be inserted next to, as defined by RelativePosition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transition withRelativeProgram(String relativeProgram) {
        setRelativeProgram(relativeProgram);
        return this;
    }

    /**
     * <p>
     * When the program should be played. RELATIVE means that programs will be played back-to-back.
     * </p>
     * 
     * @param type
     *        When the program should be played. RELATIVE means that programs will be played back-to-back.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * When the program should be played. RELATIVE means that programs will be played back-to-back.
     * </p>
     * 
     * @return When the program should be played. RELATIVE means that programs will be played back-to-back.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * When the program should be played. RELATIVE means that programs will be played back-to-back.
     * </p>
     * 
     * @param type
     *        When the program should be played. RELATIVE means that programs will be played back-to-back.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transition withType(String type) {
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
        if (getRelativePosition() != null)
            sb.append("RelativePosition: ").append(getRelativePosition()).append(",");
        if (getRelativeProgram() != null)
            sb.append("RelativeProgram: ").append(getRelativeProgram()).append(",");
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

        if (obj instanceof Transition == false)
            return false;
        Transition other = (Transition) obj;
        if (other.getRelativePosition() == null ^ this.getRelativePosition() == null)
            return false;
        if (other.getRelativePosition() != null && other.getRelativePosition().equals(this.getRelativePosition()) == false)
            return false;
        if (other.getRelativeProgram() == null ^ this.getRelativeProgram() == null)
            return false;
        if (other.getRelativeProgram() != null && other.getRelativeProgram().equals(this.getRelativeProgram()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getRelativePosition() == null) ? 0 : getRelativePosition().hashCode());
        hashCode = prime * hashCode + ((getRelativeProgram() == null) ? 0 : getRelativeProgram().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Transition clone() {
        try {
            return (Transition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.TransitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
