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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the call to action button configuration for the form.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/FormCTA" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormCTA implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Displays a cancel button.
     * </p>
     */
    private FormButton cancel;
    /**
     * <p>
     * Displays a clear button.
     * </p>
     */
    private FormButton clear;
    /**
     * <p>
     * The position of the button.
     * </p>
     */
    private String position;
    /**
     * <p>
     * Displays a submit button.
     * </p>
     */
    private FormButton submit;

    /**
     * <p>
     * Displays a cancel button.
     * </p>
     * 
     * @param cancel
     *        Displays a cancel button.
     */

    public void setCancel(FormButton cancel) {
        this.cancel = cancel;
    }

    /**
     * <p>
     * Displays a cancel button.
     * </p>
     * 
     * @return Displays a cancel button.
     */

    public FormButton getCancel() {
        return this.cancel;
    }

    /**
     * <p>
     * Displays a cancel button.
     * </p>
     * 
     * @param cancel
     *        Displays a cancel button.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormCTA withCancel(FormButton cancel) {
        setCancel(cancel);
        return this;
    }

    /**
     * <p>
     * Displays a clear button.
     * </p>
     * 
     * @param clear
     *        Displays a clear button.
     */

    public void setClear(FormButton clear) {
        this.clear = clear;
    }

    /**
     * <p>
     * Displays a clear button.
     * </p>
     * 
     * @return Displays a clear button.
     */

    public FormButton getClear() {
        return this.clear;
    }

    /**
     * <p>
     * Displays a clear button.
     * </p>
     * 
     * @param clear
     *        Displays a clear button.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormCTA withClear(FormButton clear) {
        setClear(clear);
        return this;
    }

    /**
     * <p>
     * The position of the button.
     * </p>
     * 
     * @param position
     *        The position of the button.
     * @see FormButtonsPosition
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * The position of the button.
     * </p>
     * 
     * @return The position of the button.
     * @see FormButtonsPosition
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * The position of the button.
     * </p>
     * 
     * @param position
     *        The position of the button.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormButtonsPosition
     */

    public FormCTA withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The position of the button.
     * </p>
     * 
     * @param position
     *        The position of the button.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormButtonsPosition
     */

    public FormCTA withPosition(FormButtonsPosition position) {
        this.position = position.toString();
        return this;
    }

    /**
     * <p>
     * Displays a submit button.
     * </p>
     * 
     * @param submit
     *        Displays a submit button.
     */

    public void setSubmit(FormButton submit) {
        this.submit = submit;
    }

    /**
     * <p>
     * Displays a submit button.
     * </p>
     * 
     * @return Displays a submit button.
     */

    public FormButton getSubmit() {
        return this.submit;
    }

    /**
     * <p>
     * Displays a submit button.
     * </p>
     * 
     * @param submit
     *        Displays a submit button.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormCTA withSubmit(FormButton submit) {
        setSubmit(submit);
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
        if (getCancel() != null)
            sb.append("Cancel: ").append(getCancel()).append(",");
        if (getClear() != null)
            sb.append("Clear: ").append(getClear()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getSubmit() != null)
            sb.append("Submit: ").append(getSubmit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FormCTA == false)
            return false;
        FormCTA other = (FormCTA) obj;
        if (other.getCancel() == null ^ this.getCancel() == null)
            return false;
        if (other.getCancel() != null && other.getCancel().equals(this.getCancel()) == false)
            return false;
        if (other.getClear() == null ^ this.getClear() == null)
            return false;
        if (other.getClear() != null && other.getClear().equals(this.getClear()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getSubmit() == null ^ this.getSubmit() == null)
            return false;
        if (other.getSubmit() != null && other.getSubmit().equals(this.getSubmit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCancel() == null) ? 0 : getCancel().hashCode());
        hashCode = prime * hashCode + ((getClear() == null) ? 0 : getClear().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getSubmit() == null) ? 0 : getSubmit().hashCode());
        return hashCode;
    }

    @Override
    public FormCTA clone() {
        try {
            return (FormCTA) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.FormCTAMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
