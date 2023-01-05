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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Auto-Tune action. For more information, see <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html">Auto-Tune for Amazon
 * OpenSearch Service</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoTune implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of Auto-Tune action.
     * </p>
     */
    private String autoTuneType;
    /**
     * <p>
     * Details about an Auto-Tune action.
     * </p>
     */
    private AutoTuneDetails autoTuneDetails;

    /**
     * <p>
     * The type of Auto-Tune action.
     * </p>
     * 
     * @param autoTuneType
     *        The type of Auto-Tune action.
     * @see AutoTuneType
     */

    public void setAutoTuneType(String autoTuneType) {
        this.autoTuneType = autoTuneType;
    }

    /**
     * <p>
     * The type of Auto-Tune action.
     * </p>
     * 
     * @return The type of Auto-Tune action.
     * @see AutoTuneType
     */

    public String getAutoTuneType() {
        return this.autoTuneType;
    }

    /**
     * <p>
     * The type of Auto-Tune action.
     * </p>
     * 
     * @param autoTuneType
     *        The type of Auto-Tune action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoTuneType
     */

    public AutoTune withAutoTuneType(String autoTuneType) {
        setAutoTuneType(autoTuneType);
        return this;
    }

    /**
     * <p>
     * The type of Auto-Tune action.
     * </p>
     * 
     * @param autoTuneType
     *        The type of Auto-Tune action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoTuneType
     */

    public AutoTune withAutoTuneType(AutoTuneType autoTuneType) {
        this.autoTuneType = autoTuneType.toString();
        return this;
    }

    /**
     * <p>
     * Details about an Auto-Tune action.
     * </p>
     * 
     * @param autoTuneDetails
     *        Details about an Auto-Tune action.
     */

    public void setAutoTuneDetails(AutoTuneDetails autoTuneDetails) {
        this.autoTuneDetails = autoTuneDetails;
    }

    /**
     * <p>
     * Details about an Auto-Tune action.
     * </p>
     * 
     * @return Details about an Auto-Tune action.
     */

    public AutoTuneDetails getAutoTuneDetails() {
        return this.autoTuneDetails;
    }

    /**
     * <p>
     * Details about an Auto-Tune action.
     * </p>
     * 
     * @param autoTuneDetails
     *        Details about an Auto-Tune action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoTune withAutoTuneDetails(AutoTuneDetails autoTuneDetails) {
        setAutoTuneDetails(autoTuneDetails);
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
        if (getAutoTuneType() != null)
            sb.append("AutoTuneType: ").append(getAutoTuneType()).append(",");
        if (getAutoTuneDetails() != null)
            sb.append("AutoTuneDetails: ").append(getAutoTuneDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoTune == false)
            return false;
        AutoTune other = (AutoTune) obj;
        if (other.getAutoTuneType() == null ^ this.getAutoTuneType() == null)
            return false;
        if (other.getAutoTuneType() != null && other.getAutoTuneType().equals(this.getAutoTuneType()) == false)
            return false;
        if (other.getAutoTuneDetails() == null ^ this.getAutoTuneDetails() == null)
            return false;
        if (other.getAutoTuneDetails() != null && other.getAutoTuneDetails().equals(this.getAutoTuneDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoTuneType() == null) ? 0 : getAutoTuneType().hashCode());
        hashCode = prime * hashCode + ((getAutoTuneDetails() == null) ? 0 : getAutoTuneDetails().hashCode());
        return hashCode;
    }

    @Override
    public AutoTune clone() {
        try {
            return (AutoTune) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.AutoTuneMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
