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
 * The configuration for default analysis settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AnalysisDefaults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisDefaults implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration for default new sheet settings.
     * </p>
     */
    private DefaultNewSheetConfiguration defaultNewSheetConfiguration;

    /**
     * <p>
     * The configuration for default new sheet settings.
     * </p>
     * 
     * @param defaultNewSheetConfiguration
     *        The configuration for default new sheet settings.
     */

    public void setDefaultNewSheetConfiguration(DefaultNewSheetConfiguration defaultNewSheetConfiguration) {
        this.defaultNewSheetConfiguration = defaultNewSheetConfiguration;
    }

    /**
     * <p>
     * The configuration for default new sheet settings.
     * </p>
     * 
     * @return The configuration for default new sheet settings.
     */

    public DefaultNewSheetConfiguration getDefaultNewSheetConfiguration() {
        return this.defaultNewSheetConfiguration;
    }

    /**
     * <p>
     * The configuration for default new sheet settings.
     * </p>
     * 
     * @param defaultNewSheetConfiguration
     *        The configuration for default new sheet settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisDefaults withDefaultNewSheetConfiguration(DefaultNewSheetConfiguration defaultNewSheetConfiguration) {
        setDefaultNewSheetConfiguration(defaultNewSheetConfiguration);
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
        if (getDefaultNewSheetConfiguration() != null)
            sb.append("DefaultNewSheetConfiguration: ").append(getDefaultNewSheetConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisDefaults == false)
            return false;
        AnalysisDefaults other = (AnalysisDefaults) obj;
        if (other.getDefaultNewSheetConfiguration() == null ^ this.getDefaultNewSheetConfiguration() == null)
            return false;
        if (other.getDefaultNewSheetConfiguration() != null && other.getDefaultNewSheetConfiguration().equals(this.getDefaultNewSheetConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultNewSheetConfiguration() == null) ? 0 : getDefaultNewSheetConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisDefaults clone() {
        try {
            return (AnalysisDefaults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AnalysisDefaultsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
