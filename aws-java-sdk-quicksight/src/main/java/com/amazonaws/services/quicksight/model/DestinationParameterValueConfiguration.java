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
 * The configuration of destination parameter values.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DestinationParameterValueConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationParameterValueConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration of custom values for destination parameter in
     * <code>DestinationParameterValueConfiguration</code>.
     * </p>
     */
    private CustomValuesConfiguration customValuesConfiguration;
    /**
     * <p>
     * The configuration that selects all options.
     * </p>
     */
    private String selectAllValueOptions;
    /**
     * <p>
     * The source parameter name of the destination parameter.
     * </p>
     */
    private String sourceParameterName;
    /**
     * <p>
     * The source field ID of the destination parameter.
     * </p>
     */
    private String sourceField;

    /**
     * <p>
     * The configuration of custom values for destination parameter in
     * <code>DestinationParameterValueConfiguration</code>.
     * </p>
     * 
     * @param customValuesConfiguration
     *        The configuration of custom values for destination parameter in
     *        <code>DestinationParameterValueConfiguration</code>.
     */

    public void setCustomValuesConfiguration(CustomValuesConfiguration customValuesConfiguration) {
        this.customValuesConfiguration = customValuesConfiguration;
    }

    /**
     * <p>
     * The configuration of custom values for destination parameter in
     * <code>DestinationParameterValueConfiguration</code>.
     * </p>
     * 
     * @return The configuration of custom values for destination parameter in
     *         <code>DestinationParameterValueConfiguration</code>.
     */

    public CustomValuesConfiguration getCustomValuesConfiguration() {
        return this.customValuesConfiguration;
    }

    /**
     * <p>
     * The configuration of custom values for destination parameter in
     * <code>DestinationParameterValueConfiguration</code>.
     * </p>
     * 
     * @param customValuesConfiguration
     *        The configuration of custom values for destination parameter in
     *        <code>DestinationParameterValueConfiguration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationParameterValueConfiguration withCustomValuesConfiguration(CustomValuesConfiguration customValuesConfiguration) {
        setCustomValuesConfiguration(customValuesConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration that selects all options.
     * </p>
     * 
     * @param selectAllValueOptions
     *        The configuration that selects all options.
     * @see SelectAllValueOptions
     */

    public void setSelectAllValueOptions(String selectAllValueOptions) {
        this.selectAllValueOptions = selectAllValueOptions;
    }

    /**
     * <p>
     * The configuration that selects all options.
     * </p>
     * 
     * @return The configuration that selects all options.
     * @see SelectAllValueOptions
     */

    public String getSelectAllValueOptions() {
        return this.selectAllValueOptions;
    }

    /**
     * <p>
     * The configuration that selects all options.
     * </p>
     * 
     * @param selectAllValueOptions
     *        The configuration that selects all options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelectAllValueOptions
     */

    public DestinationParameterValueConfiguration withSelectAllValueOptions(String selectAllValueOptions) {
        setSelectAllValueOptions(selectAllValueOptions);
        return this;
    }

    /**
     * <p>
     * The configuration that selects all options.
     * </p>
     * 
     * @param selectAllValueOptions
     *        The configuration that selects all options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelectAllValueOptions
     */

    public DestinationParameterValueConfiguration withSelectAllValueOptions(SelectAllValueOptions selectAllValueOptions) {
        this.selectAllValueOptions = selectAllValueOptions.toString();
        return this;
    }

    /**
     * <p>
     * The source parameter name of the destination parameter.
     * </p>
     * 
     * @param sourceParameterName
     *        The source parameter name of the destination parameter.
     */

    public void setSourceParameterName(String sourceParameterName) {
        this.sourceParameterName = sourceParameterName;
    }

    /**
     * <p>
     * The source parameter name of the destination parameter.
     * </p>
     * 
     * @return The source parameter name of the destination parameter.
     */

    public String getSourceParameterName() {
        return this.sourceParameterName;
    }

    /**
     * <p>
     * The source parameter name of the destination parameter.
     * </p>
     * 
     * @param sourceParameterName
     *        The source parameter name of the destination parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationParameterValueConfiguration withSourceParameterName(String sourceParameterName) {
        setSourceParameterName(sourceParameterName);
        return this;
    }

    /**
     * <p>
     * The source field ID of the destination parameter.
     * </p>
     * 
     * @param sourceField
     *        The source field ID of the destination parameter.
     */

    public void setSourceField(String sourceField) {
        this.sourceField = sourceField;
    }

    /**
     * <p>
     * The source field ID of the destination parameter.
     * </p>
     * 
     * @return The source field ID of the destination parameter.
     */

    public String getSourceField() {
        return this.sourceField;
    }

    /**
     * <p>
     * The source field ID of the destination parameter.
     * </p>
     * 
     * @param sourceField
     *        The source field ID of the destination parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationParameterValueConfiguration withSourceField(String sourceField) {
        setSourceField(sourceField);
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
        if (getCustomValuesConfiguration() != null)
            sb.append("CustomValuesConfiguration: ").append(getCustomValuesConfiguration()).append(",");
        if (getSelectAllValueOptions() != null)
            sb.append("SelectAllValueOptions: ").append(getSelectAllValueOptions()).append(",");
        if (getSourceParameterName() != null)
            sb.append("SourceParameterName: ").append(getSourceParameterName()).append(",");
        if (getSourceField() != null)
            sb.append("SourceField: ").append(getSourceField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationParameterValueConfiguration == false)
            return false;
        DestinationParameterValueConfiguration other = (DestinationParameterValueConfiguration) obj;
        if (other.getCustomValuesConfiguration() == null ^ this.getCustomValuesConfiguration() == null)
            return false;
        if (other.getCustomValuesConfiguration() != null && other.getCustomValuesConfiguration().equals(this.getCustomValuesConfiguration()) == false)
            return false;
        if (other.getSelectAllValueOptions() == null ^ this.getSelectAllValueOptions() == null)
            return false;
        if (other.getSelectAllValueOptions() != null && other.getSelectAllValueOptions().equals(this.getSelectAllValueOptions()) == false)
            return false;
        if (other.getSourceParameterName() == null ^ this.getSourceParameterName() == null)
            return false;
        if (other.getSourceParameterName() != null && other.getSourceParameterName().equals(this.getSourceParameterName()) == false)
            return false;
        if (other.getSourceField() == null ^ this.getSourceField() == null)
            return false;
        if (other.getSourceField() != null && other.getSourceField().equals(this.getSourceField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomValuesConfiguration() == null) ? 0 : getCustomValuesConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSelectAllValueOptions() == null) ? 0 : getSelectAllValueOptions().hashCode());
        hashCode = prime * hashCode + ((getSourceParameterName() == null) ? 0 : getSourceParameterName().hashCode());
        hashCode = prime * hashCode + ((getSourceField() == null) ? 0 : getSourceField().hashCode());
        return hashCode;
    }

    @Override
    public DestinationParameterValueConfiguration clone() {
        try {
            return (DestinationParameterValueConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DestinationParameterValueConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
