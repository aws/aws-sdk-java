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
 * The rendering rules of a sheet that uses a free-form layout.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SheetElementRenderingRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SheetElementRenderingRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The expression of the rendering rules of a sheet.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * The override configuration of the rendering rules of a sheet.
     * </p>
     */
    private SheetElementConfigurationOverrides configurationOverrides;

    /**
     * <p>
     * The expression of the rendering rules of a sheet.
     * </p>
     * 
     * @param expression
     *        The expression of the rendering rules of a sheet.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The expression of the rendering rules of a sheet.
     * </p>
     * 
     * @return The expression of the rendering rules of a sheet.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The expression of the rendering rules of a sheet.
     * </p>
     * 
     * @param expression
     *        The expression of the rendering rules of a sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetElementRenderingRule withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * The override configuration of the rendering rules of a sheet.
     * </p>
     * 
     * @param configurationOverrides
     *        The override configuration of the rendering rules of a sheet.
     */

    public void setConfigurationOverrides(SheetElementConfigurationOverrides configurationOverrides) {
        this.configurationOverrides = configurationOverrides;
    }

    /**
     * <p>
     * The override configuration of the rendering rules of a sheet.
     * </p>
     * 
     * @return The override configuration of the rendering rules of a sheet.
     */

    public SheetElementConfigurationOverrides getConfigurationOverrides() {
        return this.configurationOverrides;
    }

    /**
     * <p>
     * The override configuration of the rendering rules of a sheet.
     * </p>
     * 
     * @param configurationOverrides
     *        The override configuration of the rendering rules of a sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetElementRenderingRule withConfigurationOverrides(SheetElementConfigurationOverrides configurationOverrides) {
        setConfigurationOverrides(configurationOverrides);
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
        if (getExpression() != null)
            sb.append("Expression: ").append("***Sensitive Data Redacted***").append(",");
        if (getConfigurationOverrides() != null)
            sb.append("ConfigurationOverrides: ").append(getConfigurationOverrides());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SheetElementRenderingRule == false)
            return false;
        SheetElementRenderingRule other = (SheetElementRenderingRule) obj;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getConfigurationOverrides() == null ^ this.getConfigurationOverrides() == null)
            return false;
        if (other.getConfigurationOverrides() != null && other.getConfigurationOverrides().equals(this.getConfigurationOverrides()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getConfigurationOverrides() == null) ? 0 : getConfigurationOverrides().hashCode());
        return hashCode;
    }

    @Override
    public SheetElementRenderingRule clone() {
        try {
            return (SheetElementRenderingRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SheetElementRenderingRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
