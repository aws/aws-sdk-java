/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a parameter in a cluster parameter group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/Parameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Parameter implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the parameter.
     * </p>
     */
    private String parameterName;
    /**
     * <p>
     * The value of the parameter.
     * </p>
     */
    private String parameterValue;
    /**
     * <p>
     * A description of the parameter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The source of the parameter value, such as "engine-default" or "user".
     * </p>
     */
    private String source;
    /**
     * <p>
     * The data type of the parameter.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     */
    private String allowedValues;
    /**
     * <p>
     * Specifies how to apply the WLM configuration parameter. Some properties can be applied dynamically, while other
     * properties require that any associated clusters be rebooted for the configuration changes to be applied. For more
     * information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     */
    private String applyType;
    /**
     * <p>
     * If <code>true</code>, the parameter can be modified. Some parameters have security or operational implications
     * that prevent them from being changed.
     * </p>
     */
    private Boolean isModifiable;
    /**
     * <p>
     * The earliest engine version to which the parameter can apply.
     * </p>
     */
    private String minimumEngineVersion;

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param parameterName
     *        The name of the parameter.
     */

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @return The name of the parameter.
     */

    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param parameterName
     *        The name of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withParameterName(String parameterName) {
        setParameterName(parameterName);
        return this;
    }

    /**
     * <p>
     * The value of the parameter.
     * </p>
     * 
     * @param parameterValue
     *        The value of the parameter.
     */

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    /**
     * <p>
     * The value of the parameter.
     * </p>
     * 
     * @return The value of the parameter.
     */

    public String getParameterValue() {
        return this.parameterValue;
    }

    /**
     * <p>
     * The value of the parameter.
     * </p>
     * 
     * @param parameterValue
     *        The value of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withParameterValue(String parameterValue) {
        setParameterValue(parameterValue);
        return this;
    }

    /**
     * <p>
     * A description of the parameter.
     * </p>
     * 
     * @param description
     *        A description of the parameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the parameter.
     * </p>
     * 
     * @return A description of the parameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the parameter.
     * </p>
     * 
     * @param description
     *        A description of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The source of the parameter value, such as "engine-default" or "user".
     * </p>
     * 
     * @param source
     *        The source of the parameter value, such as "engine-default" or "user".
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the parameter value, such as "engine-default" or "user".
     * </p>
     * 
     * @return The source of the parameter value, such as "engine-default" or "user".
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the parameter value, such as "engine-default" or "user".
     * </p>
     * 
     * @param source
     *        The source of the parameter value, such as "engine-default" or "user".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The data type of the parameter.
     * </p>
     * 
     * @param dataType
     *        The data type of the parameter.
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the parameter.
     * </p>
     * 
     * @return The data type of the parameter.
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The data type of the parameter.
     * </p>
     * 
     * @param dataType
     *        The data type of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     * 
     * @param allowedValues
     *        The valid range of values for the parameter.
     */

    public void setAllowedValues(String allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     * 
     * @return The valid range of values for the parameter.
     */

    public String getAllowedValues() {
        return this.allowedValues;
    }

    /**
     * <p>
     * The valid range of values for the parameter.
     * </p>
     * 
     * @param allowedValues
     *        The valid range of values for the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withAllowedValues(String allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * Specifies how to apply the WLM configuration parameter. Some properties can be applied dynamically, while other
     * properties require that any associated clusters be rebooted for the configuration changes to be applied. For more
     * information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param applyType
     *        Specifies how to apply the WLM configuration parameter. Some properties can be applied dynamically, while
     *        other properties require that any associated clusters be rebooted for the configuration changes to be
     *        applied. For more information about parameters and parameter groups, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     *        Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @see ParameterApplyType
     */

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    /**
     * <p>
     * Specifies how to apply the WLM configuration parameter. Some properties can be applied dynamically, while other
     * properties require that any associated clusters be rebooted for the configuration changes to be applied. For more
     * information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @return Specifies how to apply the WLM configuration parameter. Some properties can be applied dynamically, while
     *         other properties require that any associated clusters be rebooted for the configuration changes to be
     *         applied. For more information about parameters and parameter groups, go to <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon
     *         Redshift Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @see ParameterApplyType
     */

    public String getApplyType() {
        return this.applyType;
    }

    /**
     * <p>
     * Specifies how to apply the WLM configuration parameter. Some properties can be applied dynamically, while other
     * properties require that any associated clusters be rebooted for the configuration changes to be applied. For more
     * information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param applyType
     *        Specifies how to apply the WLM configuration parameter. Some properties can be applied dynamically, while
     *        other properties require that any associated clusters be rebooted for the configuration changes to be
     *        applied. For more information about parameters and parameter groups, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     *        Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterApplyType
     */

    public Parameter withApplyType(String applyType) {
        setApplyType(applyType);
        return this;
    }

    /**
     * <p>
     * Specifies how to apply the WLM configuration parameter. Some properties can be applied dynamically, while other
     * properties require that any associated clusters be rebooted for the configuration changes to be applied. For more
     * information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param applyType
     *        Specifies how to apply the WLM configuration parameter. Some properties can be applied dynamically, while
     *        other properties require that any associated clusters be rebooted for the configuration changes to be
     *        applied. For more information about parameters and parameter groups, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     *        Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @see ParameterApplyType
     */

    public void setApplyType(ParameterApplyType applyType) {
        withApplyType(applyType);
    }

    /**
     * <p>
     * Specifies how to apply the WLM configuration parameter. Some properties can be applied dynamically, while other
     * properties require that any associated clusters be rebooted for the configuration changes to be applied. For more
     * information about parameters and parameter groups, go to <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     * Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param applyType
     *        Specifies how to apply the WLM configuration parameter. Some properties can be applied dynamically, while
     *        other properties require that any associated clusters be rebooted for the configuration changes to be
     *        applied. For more information about parameters and parameter groups, go to <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html">Amazon Redshift
     *        Parameter Groups</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterApplyType
     */

    public Parameter withApplyType(ParameterApplyType applyType) {
        this.applyType = applyType.toString();
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the parameter can be modified. Some parameters have security or operational implications
     * that prevent them from being changed.
     * </p>
     * 
     * @param isModifiable
     *        If <code>true</code>, the parameter can be modified. Some parameters have security or operational
     *        implications that prevent them from being changed.
     */

    public void setIsModifiable(Boolean isModifiable) {
        this.isModifiable = isModifiable;
    }

    /**
     * <p>
     * If <code>true</code>, the parameter can be modified. Some parameters have security or operational implications
     * that prevent them from being changed.
     * </p>
     * 
     * @return If <code>true</code>, the parameter can be modified. Some parameters have security or operational
     *         implications that prevent them from being changed.
     */

    public Boolean getIsModifiable() {
        return this.isModifiable;
    }

    /**
     * <p>
     * If <code>true</code>, the parameter can be modified. Some parameters have security or operational implications
     * that prevent them from being changed.
     * </p>
     * 
     * @param isModifiable
     *        If <code>true</code>, the parameter can be modified. Some parameters have security or operational
     *        implications that prevent them from being changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withIsModifiable(Boolean isModifiable) {
        setIsModifiable(isModifiable);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the parameter can be modified. Some parameters have security or operational implications
     * that prevent them from being changed.
     * </p>
     * 
     * @return If <code>true</code>, the parameter can be modified. Some parameters have security or operational
     *         implications that prevent them from being changed.
     */

    public Boolean isModifiable() {
        return this.isModifiable;
    }

    /**
     * <p>
     * The earliest engine version to which the parameter can apply.
     * </p>
     * 
     * @param minimumEngineVersion
     *        The earliest engine version to which the parameter can apply.
     */

    public void setMinimumEngineVersion(String minimumEngineVersion) {
        this.minimumEngineVersion = minimumEngineVersion;
    }

    /**
     * <p>
     * The earliest engine version to which the parameter can apply.
     * </p>
     * 
     * @return The earliest engine version to which the parameter can apply.
     */

    public String getMinimumEngineVersion() {
        return this.minimumEngineVersion;
    }

    /**
     * <p>
     * The earliest engine version to which the parameter can apply.
     * </p>
     * 
     * @param minimumEngineVersion
     *        The earliest engine version to which the parameter can apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withMinimumEngineVersion(String minimumEngineVersion) {
        setMinimumEngineVersion(minimumEngineVersion);
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
        if (getParameterName() != null)
            sb.append("ParameterName: ").append(getParameterName()).append(",");
        if (getParameterValue() != null)
            sb.append("ParameterValue: ").append(getParameterValue()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getApplyType() != null)
            sb.append("ApplyType: ").append(getApplyType()).append(",");
        if (getIsModifiable() != null)
            sb.append("IsModifiable: ").append(getIsModifiable()).append(",");
        if (getMinimumEngineVersion() != null)
            sb.append("MinimumEngineVersion: ").append(getMinimumEngineVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parameter == false)
            return false;
        Parameter other = (Parameter) obj;
        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false)
            return false;
        if (other.getParameterValue() == null ^ this.getParameterValue() == null)
            return false;
        if (other.getParameterValue() != null && other.getParameterValue().equals(this.getParameterValue()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getApplyType() == null ^ this.getApplyType() == null)
            return false;
        if (other.getApplyType() != null && other.getApplyType().equals(this.getApplyType()) == false)
            return false;
        if (other.getIsModifiable() == null ^ this.getIsModifiable() == null)
            return false;
        if (other.getIsModifiable() != null && other.getIsModifiable().equals(this.getIsModifiable()) == false)
            return false;
        if (other.getMinimumEngineVersion() == null ^ this.getMinimumEngineVersion() == null)
            return false;
        if (other.getMinimumEngineVersion() != null && other.getMinimumEngineVersion().equals(this.getMinimumEngineVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getApplyType() == null) ? 0 : getApplyType().hashCode());
        hashCode = prime * hashCode + ((getIsModifiable() == null) ? 0 : getIsModifiable().hashCode());
        hashCode = prime * hashCode + ((getMinimumEngineVersion() == null) ? 0 : getMinimumEngineVersion().hashCode());
        return hashCode;
    }

    @Override
    public Parameter clone() {
        try {
            return (Parameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
