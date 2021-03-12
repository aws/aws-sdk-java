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
 * The configuration for avail suppression, also known as ad suppression. For more information about ad suppression, see
 * <a href="https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html">Ad Suppression</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/AvailSuppression" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailSuppression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets the ad suppression mode. By default, ad suppression is off and all ad breaks are filled with ads or slate.
     * When Mode is set to BEHIND_LIVE_EDGE, ad suppression is active and MediaTailor won't fill ad breaks on or behind
     * the ad suppression Value time in the manifest lookback window.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * A live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or behind this time in the manifest
     * lookback window. If Value is set to 00:00:00, it is in sync with the live edge, and MediaTailor won't fill any ad
     * breaks on or behind the live edge. If you set a Value time, MediaTailor won't fill any ad breaks on or behind
     * this time in the manifest lookback window. For example, if you set 00:45:00, then MediaTailor will fill ad breaks
     * that occur within 45 minutes behind the live edge, but won't fill ad breaks on or behind 45 minutes behind the
     * live edge.
     * </p>
     */
    private String value;

    /**
     * <p>
     * Sets the ad suppression mode. By default, ad suppression is off and all ad breaks are filled with ads or slate.
     * When Mode is set to BEHIND_LIVE_EDGE, ad suppression is active and MediaTailor won't fill ad breaks on or behind
     * the ad suppression Value time in the manifest lookback window.
     * </p>
     * 
     * @param mode
     *        Sets the ad suppression mode. By default, ad suppression is off and all ad breaks are filled with ads or
     *        slate. When Mode is set to BEHIND_LIVE_EDGE, ad suppression is active and MediaTailor won't fill ad breaks
     *        on or behind the ad suppression Value time in the manifest lookback window.
     * @see Mode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Sets the ad suppression mode. By default, ad suppression is off and all ad breaks are filled with ads or slate.
     * When Mode is set to BEHIND_LIVE_EDGE, ad suppression is active and MediaTailor won't fill ad breaks on or behind
     * the ad suppression Value time in the manifest lookback window.
     * </p>
     * 
     * @return Sets the ad suppression mode. By default, ad suppression is off and all ad breaks are filled with ads or
     *         slate. When Mode is set to BEHIND_LIVE_EDGE, ad suppression is active and MediaTailor won't fill ad
     *         breaks on or behind the ad suppression Value time in the manifest lookback window.
     * @see Mode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Sets the ad suppression mode. By default, ad suppression is off and all ad breaks are filled with ads or slate.
     * When Mode is set to BEHIND_LIVE_EDGE, ad suppression is active and MediaTailor won't fill ad breaks on or behind
     * the ad suppression Value time in the manifest lookback window.
     * </p>
     * 
     * @param mode
     *        Sets the ad suppression mode. By default, ad suppression is off and all ad breaks are filled with ads or
     *        slate. When Mode is set to BEHIND_LIVE_EDGE, ad suppression is active and MediaTailor won't fill ad breaks
     *        on or behind the ad suppression Value time in the manifest lookback window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public AvailSuppression withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Sets the ad suppression mode. By default, ad suppression is off and all ad breaks are filled with ads or slate.
     * When Mode is set to BEHIND_LIVE_EDGE, ad suppression is active and MediaTailor won't fill ad breaks on or behind
     * the ad suppression Value time in the manifest lookback window.
     * </p>
     * 
     * @param mode
     *        Sets the ad suppression mode. By default, ad suppression is off and all ad breaks are filled with ads or
     *        slate. When Mode is set to BEHIND_LIVE_EDGE, ad suppression is active and MediaTailor won't fill ad breaks
     *        on or behind the ad suppression Value time in the manifest lookback window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public AvailSuppression withMode(Mode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * A live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or behind this time in the manifest
     * lookback window. If Value is set to 00:00:00, it is in sync with the live edge, and MediaTailor won't fill any ad
     * breaks on or behind the live edge. If you set a Value time, MediaTailor won't fill any ad breaks on or behind
     * this time in the manifest lookback window. For example, if you set 00:45:00, then MediaTailor will fill ad breaks
     * that occur within 45 minutes behind the live edge, but won't fill ad breaks on or behind 45 minutes behind the
     * live edge.
     * </p>
     * 
     * @param value
     *        A live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or behind this time in the
     *        manifest lookback window. If Value is set to 00:00:00, it is in sync with the live edge, and MediaTailor
     *        won't fill any ad breaks on or behind the live edge. If you set a Value time, MediaTailor won't fill any
     *        ad breaks on or behind this time in the manifest lookback window. For example, if you set 00:45:00, then
     *        MediaTailor will fill ad breaks that occur within 45 minutes behind the live edge, but won't fill ad
     *        breaks on or behind 45 minutes behind the live edge.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or behind this time in the manifest
     * lookback window. If Value is set to 00:00:00, it is in sync with the live edge, and MediaTailor won't fill any ad
     * breaks on or behind the live edge. If you set a Value time, MediaTailor won't fill any ad breaks on or behind
     * this time in the manifest lookback window. For example, if you set 00:45:00, then MediaTailor will fill ad breaks
     * that occur within 45 minutes behind the live edge, but won't fill ad breaks on or behind 45 minutes behind the
     * live edge.
     * </p>
     * 
     * @return A live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or behind this time in the
     *         manifest lookback window. If Value is set to 00:00:00, it is in sync with the live edge, and MediaTailor
     *         won't fill any ad breaks on or behind the live edge. If you set a Value time, MediaTailor won't fill any
     *         ad breaks on or behind this time in the manifest lookback window. For example, if you set 00:45:00, then
     *         MediaTailor will fill ad breaks that occur within 45 minutes behind the live edge, but won't fill ad
     *         breaks on or behind 45 minutes behind the live edge.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or behind this time in the manifest
     * lookback window. If Value is set to 00:00:00, it is in sync with the live edge, and MediaTailor won't fill any ad
     * breaks on or behind the live edge. If you set a Value time, MediaTailor won't fill any ad breaks on or behind
     * this time in the manifest lookback window. For example, if you set 00:45:00, then MediaTailor will fill ad breaks
     * that occur within 45 minutes behind the live edge, but won't fill ad breaks on or behind 45 minutes behind the
     * live edge.
     * </p>
     * 
     * @param value
     *        A live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or behind this time in the
     *        manifest lookback window. If Value is set to 00:00:00, it is in sync with the live edge, and MediaTailor
     *        won't fill any ad breaks on or behind the live edge. If you set a Value time, MediaTailor won't fill any
     *        ad breaks on or behind this time in the manifest lookback window. For example, if you set 00:45:00, then
     *        MediaTailor will fill ad breaks that occur within 45 minutes behind the live edge, but won't fill ad
     *        breaks on or behind 45 minutes behind the live edge.
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
