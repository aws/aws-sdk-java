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
 * The configuration for pre-roll ad insertion.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/LivePreRollConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LivePreRollConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL for the ad decision server (ADS) for pre-roll ads. This includes the specification of static parameters
     * and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and
     * session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static
     * VAST URL. The maximum length is 25,000 characters.
     * </p>
     */
    private String adDecisionServerUrl;
    /**
     * The maximum allowed duration for the pre-roll ad avail. AWS Elemental MediaTailor won't play pre-roll ads to
     * exceed this duration, regardless of the total duration of ads that the ADS returns.
     */
    private Integer maxDurationSeconds;

    /**
     * <p>
     * The URL for the ad decision server (ADS) for pre-roll ads. This includes the specification of static parameters
     * and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and
     * session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static
     * VAST URL. The maximum length is 25,000 characters.
     * </p>
     * 
     * @param adDecisionServerUrl
     *        The URL for the ad decision server (ADS) for pre-roll ads. This includes the specification of static
     *        parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific
     *        and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide
     *        a static VAST URL. The maximum length is 25,000 characters.
     */

    public void setAdDecisionServerUrl(String adDecisionServerUrl) {
        this.adDecisionServerUrl = adDecisionServerUrl;
    }

    /**
     * <p>
     * The URL for the ad decision server (ADS) for pre-roll ads. This includes the specification of static parameters
     * and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and
     * session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static
     * VAST URL. The maximum length is 25,000 characters.
     * </p>
     * 
     * @return The URL for the ad decision server (ADS) for pre-roll ads. This includes the specification of static
     *         parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific
     *         and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide
     *         a static VAST URL. The maximum length is 25,000 characters.
     */

    public String getAdDecisionServerUrl() {
        return this.adDecisionServerUrl;
    }

    /**
     * <p>
     * The URL for the ad decision server (ADS) for pre-roll ads. This includes the specification of static parameters
     * and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and
     * session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static
     * VAST URL. The maximum length is 25,000 characters.
     * </p>
     * 
     * @param adDecisionServerUrl
     *        The URL for the ad decision server (ADS) for pre-roll ads. This includes the specification of static
     *        parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific
     *        and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide
     *        a static VAST URL. The maximum length is 25,000 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LivePreRollConfiguration withAdDecisionServerUrl(String adDecisionServerUrl) {
        setAdDecisionServerUrl(adDecisionServerUrl);
        return this;
    }

    /**
     * The maximum allowed duration for the pre-roll ad avail. AWS Elemental MediaTailor won't play pre-roll ads to
     * exceed this duration, regardless of the total duration of ads that the ADS returns.
     * 
     * @param maxDurationSeconds
     *        The maximum allowed duration for the pre-roll ad avail. AWS Elemental MediaTailor won't play pre-roll ads
     *        to exceed this duration, regardless of the total duration of ads that the ADS returns.
     */

    public void setMaxDurationSeconds(Integer maxDurationSeconds) {
        this.maxDurationSeconds = maxDurationSeconds;
    }

    /**
     * The maximum allowed duration for the pre-roll ad avail. AWS Elemental MediaTailor won't play pre-roll ads to
     * exceed this duration, regardless of the total duration of ads that the ADS returns.
     * 
     * @return The maximum allowed duration for the pre-roll ad avail. AWS Elemental MediaTailor won't play pre-roll ads
     *         to exceed this duration, regardless of the total duration of ads that the ADS returns.
     */

    public Integer getMaxDurationSeconds() {
        return this.maxDurationSeconds;
    }

    /**
     * The maximum allowed duration for the pre-roll ad avail. AWS Elemental MediaTailor won't play pre-roll ads to
     * exceed this duration, regardless of the total duration of ads that the ADS returns.
     * 
     * @param maxDurationSeconds
     *        The maximum allowed duration for the pre-roll ad avail. AWS Elemental MediaTailor won't play pre-roll ads
     *        to exceed this duration, regardless of the total duration of ads that the ADS returns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LivePreRollConfiguration withMaxDurationSeconds(Integer maxDurationSeconds) {
        setMaxDurationSeconds(maxDurationSeconds);
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
        if (getAdDecisionServerUrl() != null)
            sb.append("AdDecisionServerUrl: ").append(getAdDecisionServerUrl()).append(",");
        if (getMaxDurationSeconds() != null)
            sb.append("MaxDurationSeconds: ").append(getMaxDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LivePreRollConfiguration == false)
            return false;
        LivePreRollConfiguration other = (LivePreRollConfiguration) obj;
        if (other.getAdDecisionServerUrl() == null ^ this.getAdDecisionServerUrl() == null)
            return false;
        if (other.getAdDecisionServerUrl() != null && other.getAdDecisionServerUrl().equals(this.getAdDecisionServerUrl()) == false)
            return false;
        if (other.getMaxDurationSeconds() == null ^ this.getMaxDurationSeconds() == null)
            return false;
        if (other.getMaxDurationSeconds() != null && other.getMaxDurationSeconds().equals(this.getMaxDurationSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdDecisionServerUrl() == null) ? 0 : getAdDecisionServerUrl().hashCode());
        hashCode = prime * hashCode + ((getMaxDurationSeconds() == null) ? 0 : getMaxDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public LivePreRollConfiguration clone() {
        try {
            return (LivePreRollConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.LivePreRollConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
