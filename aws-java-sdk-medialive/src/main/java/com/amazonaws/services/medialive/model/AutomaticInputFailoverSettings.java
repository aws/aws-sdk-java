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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The settings for Automatic Input Failover.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AutomaticInputFailoverSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomaticInputFailoverSettings implements Serializable, Cloneable, StructuredPojo {

    /** Input preference when deciding which input to make active when a previously failed input has recovered. */
    private String inputPreference;
    /** The input ID of the secondary input in the automatic input failover pair. */
    private String secondaryInputId;

    /**
     * Input preference when deciding which input to make active when a previously failed input has recovered.
     * 
     * @param inputPreference
     *        Input preference when deciding which input to make active when a previously failed input has recovered.
     * @see InputPreference
     */

    public void setInputPreference(String inputPreference) {
        this.inputPreference = inputPreference;
    }

    /**
     * Input preference when deciding which input to make active when a previously failed input has recovered.
     * 
     * @return Input preference when deciding which input to make active when a previously failed input has recovered.
     * @see InputPreference
     */

    public String getInputPreference() {
        return this.inputPreference;
    }

    /**
     * Input preference when deciding which input to make active when a previously failed input has recovered.
     * 
     * @param inputPreference
     *        Input preference when deciding which input to make active when a previously failed input has recovered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputPreference
     */

    public AutomaticInputFailoverSettings withInputPreference(String inputPreference) {
        setInputPreference(inputPreference);
        return this;
    }

    /**
     * Input preference when deciding which input to make active when a previously failed input has recovered.
     * 
     * @param inputPreference
     *        Input preference when deciding which input to make active when a previously failed input has recovered.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputPreference
     */

    public AutomaticInputFailoverSettings withInputPreference(InputPreference inputPreference) {
        this.inputPreference = inputPreference.toString();
        return this;
    }

    /**
     * The input ID of the secondary input in the automatic input failover pair.
     * 
     * @param secondaryInputId
     *        The input ID of the secondary input in the automatic input failover pair.
     */

    public void setSecondaryInputId(String secondaryInputId) {
        this.secondaryInputId = secondaryInputId;
    }

    /**
     * The input ID of the secondary input in the automatic input failover pair.
     * 
     * @return The input ID of the secondary input in the automatic input failover pair.
     */

    public String getSecondaryInputId() {
        return this.secondaryInputId;
    }

    /**
     * The input ID of the secondary input in the automatic input failover pair.
     * 
     * @param secondaryInputId
     *        The input ID of the secondary input in the automatic input failover pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomaticInputFailoverSettings withSecondaryInputId(String secondaryInputId) {
        setSecondaryInputId(secondaryInputId);
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
        if (getInputPreference() != null)
            sb.append("InputPreference: ").append(getInputPreference()).append(",");
        if (getSecondaryInputId() != null)
            sb.append("SecondaryInputId: ").append(getSecondaryInputId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomaticInputFailoverSettings == false)
            return false;
        AutomaticInputFailoverSettings other = (AutomaticInputFailoverSettings) obj;
        if (other.getInputPreference() == null ^ this.getInputPreference() == null)
            return false;
        if (other.getInputPreference() != null && other.getInputPreference().equals(this.getInputPreference()) == false)
            return false;
        if (other.getSecondaryInputId() == null ^ this.getSecondaryInputId() == null)
            return false;
        if (other.getSecondaryInputId() != null && other.getSecondaryInputId().equals(this.getSecondaryInputId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputPreference() == null) ? 0 : getInputPreference().hashCode());
        hashCode = prime * hashCode + ((getSecondaryInputId() == null) ? 0 : getSecondaryInputId().hashCode());
        return hashCode;
    }

    @Override
    public AutomaticInputFailoverSettings clone() {
        try {
            return (AutomaticInputFailoverSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AutomaticInputFailoverSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
