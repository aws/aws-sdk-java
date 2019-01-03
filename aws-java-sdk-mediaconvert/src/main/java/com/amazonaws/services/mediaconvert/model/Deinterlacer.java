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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for deinterlacer
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Deinterlacer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Deinterlacer implements Serializable, Cloneable, StructuredPojo {

    private String algorithm;

    private String control;

    private String mode;

    /**
     * @param algorithm
     * @see DeinterlaceAlgorithm
     */

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * @return
     * @see DeinterlaceAlgorithm
     */

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @param algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeinterlaceAlgorithm
     */

    public Deinterlacer withAlgorithm(String algorithm) {
        setAlgorithm(algorithm);
        return this;
    }

    /**
     * @param algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeinterlaceAlgorithm
     */

    public Deinterlacer withAlgorithm(DeinterlaceAlgorithm algorithm) {
        this.algorithm = algorithm.toString();
        return this;
    }

    /**
     * @param control
     * @see DeinterlacerControl
     */

    public void setControl(String control) {
        this.control = control;
    }

    /**
     * @return
     * @see DeinterlacerControl
     */

    public String getControl() {
        return this.control;
    }

    /**
     * @param control
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeinterlacerControl
     */

    public Deinterlacer withControl(String control) {
        setControl(control);
        return this;
    }

    /**
     * @param control
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeinterlacerControl
     */

    public Deinterlacer withControl(DeinterlacerControl control) {
        this.control = control.toString();
        return this;
    }

    /**
     * @param mode
     * @see DeinterlacerMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * @return
     * @see DeinterlacerMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * @param mode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeinterlacerMode
     */

    public Deinterlacer withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * @param mode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeinterlacerMode
     */

    public Deinterlacer withMode(DeinterlacerMode mode) {
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
        if (getAlgorithm() != null)
            sb.append("Algorithm: ").append(getAlgorithm()).append(",");
        if (getControl() != null)
            sb.append("Control: ").append(getControl()).append(",");
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

        if (obj instanceof Deinterlacer == false)
            return false;
        Deinterlacer other = (Deinterlacer) obj;
        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
        if (other.getControl() == null ^ this.getControl() == null)
            return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public Deinterlacer clone() {
        try {
            return (Deinterlacer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.DeinterlacerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
