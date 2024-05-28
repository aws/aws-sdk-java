/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Optional. The member who can query can provide this placeholder for a literal data value in an analysis template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/AnalysisParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter. The name must use only alphanumeric, underscore (_), or hyphen (-) characters but
     * cannot start or end with a hyphen.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of parameter.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Optional. The default value that is applied in the analysis template. The member who can query can override this
     * value in the query editor.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The name of the parameter. The name must use only alphanumeric, underscore (_), or hyphen (-) characters but
     * cannot start or end with a hyphen.
     * </p>
     * 
     * @param name
     *        The name of the parameter. The name must use only alphanumeric, underscore (_), or hyphen (-) characters
     *        but cannot start or end with a hyphen.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter. The name must use only alphanumeric, underscore (_), or hyphen (-) characters but
     * cannot start or end with a hyphen.
     * </p>
     * 
     * @return The name of the parameter. The name must use only alphanumeric, underscore (_), or hyphen (-) characters
     *         but cannot start or end with a hyphen.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter. The name must use only alphanumeric, underscore (_), or hyphen (-) characters but
     * cannot start or end with a hyphen.
     * </p>
     * 
     * @param name
     *        The name of the parameter. The name must use only alphanumeric, underscore (_), or hyphen (-) characters
     *        but cannot start or end with a hyphen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisParameter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of parameter.
     * </p>
     * 
     * @param type
     *        The type of parameter.
     * @see ParameterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of parameter.
     * </p>
     * 
     * @return The type of parameter.
     * @see ParameterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of parameter.
     * </p>
     * 
     * @param type
     *        The type of parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public AnalysisParameter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of parameter.
     * </p>
     * 
     * @param type
     *        The type of parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public AnalysisParameter withType(ParameterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Optional. The default value that is applied in the analysis template. The member who can query can override this
     * value in the query editor.
     * </p>
     * 
     * @param defaultValue
     *        Optional. The default value that is applied in the analysis template. The member who can query can
     *        override this value in the query editor.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * Optional. The default value that is applied in the analysis template. The member who can query can override this
     * value in the query editor.
     * </p>
     * 
     * @return Optional. The default value that is applied in the analysis template. The member who can query can
     *         override this value in the query editor.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * Optional. The default value that is applied in the analysis template. The member who can query can override this
     * value in the query editor.
     * </p>
     * 
     * @param defaultValue
     *        Optional. The default value that is applied in the analysis template. The member who can query can
     *        override this value in the query editor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisParameter withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisParameter == false)
            return false;
        AnalysisParameter other = (AnalysisParameter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisParameter clone() {
        try {
            return (AnalysisParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.AnalysisParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
