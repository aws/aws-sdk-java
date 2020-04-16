/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The configuration for Avail Suppression. Ad suppression can be used to turn off ad personalization in a long
 * manifest, or if a viewer joins mid-break.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/AvailSuppression" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailSuppression implements Serializable, Cloneable, StructuredPojo {

    /**
     * Sets the mode for avail suppression, also known as ad suppression. By default, ad suppression is off and all ad
     * breaks are filled by MediaTailor with ads or slate.
     */
    private String mode;
    /**
     * The avail suppression value is a live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or behind
     * this time in the manifest lookback window.
     */
    private String value;

    /**
     * Sets the mode for avail suppression, also known as ad suppression. By default, ad suppression is off and all ad
     * breaks are filled by MediaTailor with ads or slate.
     * 
     * @param mode
     *        Sets the mode for avail suppression, also known as ad suppression. By default, ad suppression is off and
     *        all ad breaks are filled by MediaTailor with ads or slate.
     * @see Mode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Sets the mode for avail suppression, also known as ad suppression. By default, ad suppression is off and all ad
     * breaks are filled by MediaTailor with ads or slate.
     * 
     * @return Sets the mode for avail suppression, also known as ad suppression. By default, ad suppression is off and
     *         all ad breaks are filled by MediaTailor with ads or slate.
     * @see Mode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * Sets the mode for avail suppression, also known as ad suppression. By default, ad suppression is off and all ad
     * breaks are filled by MediaTailor with ads or slate.
     * 
     * @param mode
     *        Sets the mode for avail suppression, also known as ad suppression. By default, ad suppression is off and
     *        all ad breaks are filled by MediaTailor with ads or slate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public AvailSuppression withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * Sets the mode for avail suppression, also known as ad suppression. By default, ad suppression is off and all ad
     * breaks are filled by MediaTailor with ads or slate.
     * 
     * @param mode
     *        Sets the mode for avail suppression, also known as ad suppression. By default, ad suppression is off and
     *        all ad breaks are filled by MediaTailor with ads or slate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public AvailSuppression withMode(Mode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * The avail suppression value is a live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or behind
     * this time in the manifest lookback window.
     * 
     * @param value
     *        The avail suppression value is a live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or
     *        behind this time in the manifest lookback window.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The avail suppression value is a live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or behind
     * this time in the manifest lookback window.
     * 
     * @return The avail suppression value is a live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on
     *         or behind this time in the manifest lookback window.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * The avail suppression value is a live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or behind
     * this time in the manifest lookback window.
     * 
     * @param value
     *        The avail suppression value is a live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or
     *        behind this time in the manifest lookback window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailSuppression withValue(String value) {
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
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

        if (obj instanceof AvailSuppression == false)
            return false;
        AvailSuppression other = (AvailSuppression) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
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

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AvailSuppression clone() {
        try {
            return (AvailSuppression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.AvailSuppressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
