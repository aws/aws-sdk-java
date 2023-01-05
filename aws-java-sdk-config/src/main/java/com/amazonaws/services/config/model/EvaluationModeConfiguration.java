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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration object for Config rule evaluation mode. The Supported valid values are Detective or Proactive.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/EvaluationModeConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationModeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The mode of an evaluation. The valid values are Detective or Proactive.
     * </p>
     */
    private String mode;

    /**
     * <p>
     * The mode of an evaluation. The valid values are Detective or Proactive.
     * </p>
     * 
     * @param mode
     *        The mode of an evaluation. The valid values are Detective or Proactive.
     * @see EvaluationMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The mode of an evaluation. The valid values are Detective or Proactive.
     * </p>
     * 
     * @return The mode of an evaluation. The valid values are Detective or Proactive.
     * @see EvaluationMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The mode of an evaluation. The valid values are Detective or Proactive.
     * </p>
     * 
     * @param mode
     *        The mode of an evaluation. The valid values are Detective or Proactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMode
     */

    public EvaluationModeConfiguration withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The mode of an evaluation. The valid values are Detective or Proactive.
     * </p>
     * 
     * @param mode
     *        The mode of an evaluation. The valid values are Detective or Proactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMode
     */

    public EvaluationModeConfiguration withMode(EvaluationMode mode) {
        this.mode = mode.toString();
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationModeConfiguration == false)
            return false;
        EvaluationModeConfiguration other = (EvaluationModeConfiguration) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationModeConfiguration clone() {
        try {
            return (EvaluationModeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.EvaluationModeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
