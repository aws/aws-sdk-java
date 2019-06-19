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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Input Loss Behavior
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputLossBehavior" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputLossBehavior implements Serializable, Cloneable, StructuredPojo {

    /** Documentation update needed */
    private Integer blackFrameMsec;
    /**
     * When input loss image type is "color" this field specifies the color to use. Value: 6 hex characters representing
     * the values of RGB.
     */
    private String inputLossImageColor;
    /** When input loss image type is "slate" these fields specify the parameters for accessing the slate. */
    private InputLocation inputLossImageSlate;
    /**
     * Indicates whether to substitute a solid color or a slate into the output after input loss exceeds blackFrameMsec.
     */
    private String inputLossImageType;
    /** Documentation update needed */
    private Integer repeatFrameMsec;

    /**
     * Documentation update needed
     * 
     * @param blackFrameMsec
     *        Documentation update needed
     */

    public void setBlackFrameMsec(Integer blackFrameMsec) {
        this.blackFrameMsec = blackFrameMsec;
    }

    /**
     * Documentation update needed
     * 
     * @return Documentation update needed
     */

    public Integer getBlackFrameMsec() {
        return this.blackFrameMsec;
    }

    /**
     * Documentation update needed
     * 
     * @param blackFrameMsec
     *        Documentation update needed
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputLossBehavior withBlackFrameMsec(Integer blackFrameMsec) {
        setBlackFrameMsec(blackFrameMsec);
        return this;
    }

    /**
     * When input loss image type is "color" this field specifies the color to use. Value: 6 hex characters representing
     * the values of RGB.
     * 
     * @param inputLossImageColor
     *        When input loss image type is "color" this field specifies the color to use. Value: 6 hex characters
     *        representing the values of RGB.
     */

    public void setInputLossImageColor(String inputLossImageColor) {
        this.inputLossImageColor = inputLossImageColor;
    }

    /**
     * When input loss image type is "color" this field specifies the color to use. Value: 6 hex characters representing
     * the values of RGB.
     * 
     * @return When input loss image type is "color" this field specifies the color to use. Value: 6 hex characters
     *         representing the values of RGB.
     */

    public String getInputLossImageColor() {
        return this.inputLossImageColor;
    }

    /**
     * When input loss image type is "color" this field specifies the color to use. Value: 6 hex characters representing
     * the values of RGB.
     * 
     * @param inputLossImageColor
     *        When input loss image type is "color" this field specifies the color to use. Value: 6 hex characters
     *        representing the values of RGB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputLossBehavior withInputLossImageColor(String inputLossImageColor) {
        setInputLossImageColor(inputLossImageColor);
        return this;
    }

    /**
     * When input loss image type is "slate" these fields specify the parameters for accessing the slate.
     * 
     * @param inputLossImageSlate
     *        When input loss image type is "slate" these fields specify the parameters for accessing the slate.
     */

    public void setInputLossImageSlate(InputLocation inputLossImageSlate) {
        this.inputLossImageSlate = inputLossImageSlate;
    }

    /**
     * When input loss image type is "slate" these fields specify the parameters for accessing the slate.
     * 
     * @return When input loss image type is "slate" these fields specify the parameters for accessing the slate.
     */

    public InputLocation getInputLossImageSlate() {
        return this.inputLossImageSlate;
    }

    /**
     * When input loss image type is "slate" these fields specify the parameters for accessing the slate.
     * 
     * @param inputLossImageSlate
     *        When input loss image type is "slate" these fields specify the parameters for accessing the slate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputLossBehavior withInputLossImageSlate(InputLocation inputLossImageSlate) {
        setInputLossImageSlate(inputLossImageSlate);
        return this;
    }

    /**
     * Indicates whether to substitute a solid color or a slate into the output after input loss exceeds blackFrameMsec.
     * 
     * @param inputLossImageType
     *        Indicates whether to substitute a solid color or a slate into the output after input loss exceeds
     *        blackFrameMsec.
     * @see InputLossImageType
     */

    public void setInputLossImageType(String inputLossImageType) {
        this.inputLossImageType = inputLossImageType;
    }

    /**
     * Indicates whether to substitute a solid color or a slate into the output after input loss exceeds blackFrameMsec.
     * 
     * @return Indicates whether to substitute a solid color or a slate into the output after input loss exceeds
     *         blackFrameMsec.
     * @see InputLossImageType
     */

    public String getInputLossImageType() {
        return this.inputLossImageType;
    }

    /**
     * Indicates whether to substitute a solid color or a slate into the output after input loss exceeds blackFrameMsec.
     * 
     * @param inputLossImageType
     *        Indicates whether to substitute a solid color or a slate into the output after input loss exceeds
     *        blackFrameMsec.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputLossImageType
     */

    public InputLossBehavior withInputLossImageType(String inputLossImageType) {
        setInputLossImageType(inputLossImageType);
        return this;
    }

    /**
     * Indicates whether to substitute a solid color or a slate into the output after input loss exceeds blackFrameMsec.
     * 
     * @param inputLossImageType
     *        Indicates whether to substitute a solid color or a slate into the output after input loss exceeds
     *        blackFrameMsec.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputLossImageType
     */

    public InputLossBehavior withInputLossImageType(InputLossImageType inputLossImageType) {
        this.inputLossImageType = inputLossImageType.toString();
        return this;
    }

    /**
     * Documentation update needed
     * 
     * @param repeatFrameMsec
     *        Documentation update needed
     */

    public void setRepeatFrameMsec(Integer repeatFrameMsec) {
        this.repeatFrameMsec = repeatFrameMsec;
    }

    /**
     * Documentation update needed
     * 
     * @return Documentation update needed
     */

    public Integer getRepeatFrameMsec() {
        return this.repeatFrameMsec;
    }

    /**
     * Documentation update needed
     * 
     * @param repeatFrameMsec
     *        Documentation update needed
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputLossBehavior withRepeatFrameMsec(Integer repeatFrameMsec) {
        setRepeatFrameMsec(repeatFrameMsec);
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
        if (getBlackFrameMsec() != null)
            sb.append("BlackFrameMsec: ").append(getBlackFrameMsec()).append(",");
        if (getInputLossImageColor() != null)
            sb.append("InputLossImageColor: ").append(getInputLossImageColor()).append(",");
        if (getInputLossImageSlate() != null)
            sb.append("InputLossImageSlate: ").append(getInputLossImageSlate()).append(",");
        if (getInputLossImageType() != null)
            sb.append("InputLossImageType: ").append(getInputLossImageType()).append(",");
        if (getRepeatFrameMsec() != null)
            sb.append("RepeatFrameMsec: ").append(getRepeatFrameMsec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputLossBehavior == false)
            return false;
        InputLossBehavior other = (InputLossBehavior) obj;
        if (other.getBlackFrameMsec() == null ^ this.getBlackFrameMsec() == null)
            return false;
        if (other.getBlackFrameMsec() != null && other.getBlackFrameMsec().equals(this.getBlackFrameMsec()) == false)
            return false;
        if (other.getInputLossImageColor() == null ^ this.getInputLossImageColor() == null)
            return false;
        if (other.getInputLossImageColor() != null && other.getInputLossImageColor().equals(this.getInputLossImageColor()) == false)
            return false;
        if (other.getInputLossImageSlate() == null ^ this.getInputLossImageSlate() == null)
            return false;
        if (other.getInputLossImageSlate() != null && other.getInputLossImageSlate().equals(this.getInputLossImageSlate()) == false)
            return false;
        if (other.getInputLossImageType() == null ^ this.getInputLossImageType() == null)
            return false;
        if (other.getInputLossImageType() != null && other.getInputLossImageType().equals(this.getInputLossImageType()) == false)
            return false;
        if (other.getRepeatFrameMsec() == null ^ this.getRepeatFrameMsec() == null)
            return false;
        if (other.getRepeatFrameMsec() != null && other.getRepeatFrameMsec().equals(this.getRepeatFrameMsec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlackFrameMsec() == null) ? 0 : getBlackFrameMsec().hashCode());
        hashCode = prime * hashCode + ((getInputLossImageColor() == null) ? 0 : getInputLossImageColor().hashCode());
        hashCode = prime * hashCode + ((getInputLossImageSlate() == null) ? 0 : getInputLossImageSlate().hashCode());
        hashCode = prime * hashCode + ((getInputLossImageType() == null) ? 0 : getInputLossImageType().hashCode());
        hashCode = prime * hashCode + ((getRepeatFrameMsec() == null) ? 0 : getRepeatFrameMsec().hashCode());
        return hashCode;
    }

    @Override
    public InputLossBehavior clone() {
        try {
            return (InputLossBehavior) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputLossBehaviorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
