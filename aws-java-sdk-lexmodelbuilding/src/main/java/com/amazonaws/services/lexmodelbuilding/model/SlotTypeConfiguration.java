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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides configuration information for a slot type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/SlotTypeConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotTypeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     */
    private SlotTypeRegexConfiguration regexConfiguration;

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     * 
     * @param regexConfiguration
     *        A regular expression used to validate the value of a slot.
     */

    public void setRegexConfiguration(SlotTypeRegexConfiguration regexConfiguration) {
        this.regexConfiguration = regexConfiguration;
    }

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     * 
     * @return A regular expression used to validate the value of a slot.
     */

    public SlotTypeRegexConfiguration getRegexConfiguration() {
        return this.regexConfiguration;
    }

    /**
     * <p>
     * A regular expression used to validate the value of a slot.
     * </p>
     * 
     * @param regexConfiguration
     *        A regular expression used to validate the value of a slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotTypeConfiguration withRegexConfiguration(SlotTypeRegexConfiguration regexConfiguration) {
        setRegexConfiguration(regexConfiguration);
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
        if (getRegexConfiguration() != null)
            sb.append("RegexConfiguration: ").append(getRegexConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotTypeConfiguration == false)
            return false;
        SlotTypeConfiguration other = (SlotTypeConfiguration) obj;
        if (other.getRegexConfiguration() == null ^ this.getRegexConfiguration() == null)
            return false;
        if (other.getRegexConfiguration() != null && other.getRegexConfiguration().equals(this.getRegexConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegexConfiguration() == null) ? 0 : getRegexConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SlotTypeConfiguration clone() {
        try {
            return (SlotTypeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.SlotTypeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
