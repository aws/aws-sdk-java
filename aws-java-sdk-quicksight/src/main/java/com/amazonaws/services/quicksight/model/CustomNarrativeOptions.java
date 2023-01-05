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
 * The custom narrative options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CustomNarrativeOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomNarrativeOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The string input of custom narrative.
     * </p>
     */
    private String narrative;

    /**
     * <p>
     * The string input of custom narrative.
     * </p>
     * 
     * @param narrative
     *        The string input of custom narrative.
     */

    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    /**
     * <p>
     * The string input of custom narrative.
     * </p>
     * 
     * @return The string input of custom narrative.
     */

    public String getNarrative() {
        return this.narrative;
    }

    /**
     * <p>
     * The string input of custom narrative.
     * </p>
     * 
     * @param narrative
     *        The string input of custom narrative.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomNarrativeOptions withNarrative(String narrative) {
        setNarrative(narrative);
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
        if (getNarrative() != null)
            sb.append("Narrative: ").append(getNarrative());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomNarrativeOptions == false)
            return false;
        CustomNarrativeOptions other = (CustomNarrativeOptions) obj;
        if (other.getNarrative() == null ^ this.getNarrative() == null)
            return false;
        if (other.getNarrative() != null && other.getNarrative().equals(this.getNarrative()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNarrative() == null) ? 0 : getNarrative().hashCode());
        return hashCode;
    }

    @Override
    public CustomNarrativeOptions clone() {
        try {
            return (CustomNarrativeOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CustomNarrativeOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
