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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The options that determine the negative value configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NegativeValueConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NegativeValueConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the display mode of the negative value configuration.
     * </p>
     */
    private String displayMode;

    /**
     * <p>
     * Determines the display mode of the negative value configuration.
     * </p>
     * 
     * @param displayMode
     *        Determines the display mode of the negative value configuration.
     * @see NegativeValueDisplayMode
     */

    public void setDisplayMode(String displayMode) {
        this.displayMode = displayMode;
    }

    /**
     * <p>
     * Determines the display mode of the negative value configuration.
     * </p>
     * 
     * @return Determines the display mode of the negative value configuration.
     * @see NegativeValueDisplayMode
     */

    public String getDisplayMode() {
        return this.displayMode;
    }

    /**
     * <p>
     * Determines the display mode of the negative value configuration.
     * </p>
     * 
     * @param displayMode
     *        Determines the display mode of the negative value configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NegativeValueDisplayMode
     */

    public NegativeValueConfiguration withDisplayMode(String displayMode) {
        setDisplayMode(displayMode);
        return this;
    }

    /**
     * <p>
     * Determines the display mode of the negative value configuration.
     * </p>
     * 
     * @param displayMode
     *        Determines the display mode of the negative value configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NegativeValueDisplayMode
     */

    public NegativeValueConfiguration withDisplayMode(NegativeValueDisplayMode displayMode) {
        this.displayMode = displayMode.toString();
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
        if (getDisplayMode() != null)
            sb.append("DisplayMode: ").append(getDisplayMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NegativeValueConfiguration == false)
            return false;
        NegativeValueConfiguration other = (NegativeValueConfiguration) obj;
        if (other.getDisplayMode() == null ^ this.getDisplayMode() == null)
            return false;
        if (other.getDisplayMode() != null && other.getDisplayMode().equals(this.getDisplayMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayMode() == null) ? 0 : getDisplayMode().hashCode());
        return hashCode;
    }

    @Override
    public NegativeValueConfiguration clone() {
        try {
            return (NegativeValueConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NegativeValueConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
