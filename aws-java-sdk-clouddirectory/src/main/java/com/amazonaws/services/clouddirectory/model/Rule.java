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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains an Amazon Resource Name (ARN) and parameters that are associated with the rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/Rule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Rule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of attribute validation rule.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The minimum and maximum parameters that are associated with the rule.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The type of attribute validation rule.
     * </p>
     * 
     * @param type
     *        The type of attribute validation rule.
     * @see RuleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of attribute validation rule.
     * </p>
     * 
     * @return The type of attribute validation rule.
     * @see RuleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of attribute validation rule.
     * </p>
     * 
     * @param type
     *        The type of attribute validation rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleType
     */

    public Rule withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of attribute validation rule.
     * </p>
     * 
     * @param type
     *        The type of attribute validation rule.
     * @see RuleType
     */

    public void setType(RuleType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of attribute validation rule.
     * </p>
     * 
     * @param type
     *        The type of attribute validation rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleType
     */

    public Rule withType(RuleType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The minimum and maximum parameters that are associated with the rule.
     * </p>
     * 
     * @return The minimum and maximum parameters that are associated with the rule.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The minimum and maximum parameters that are associated with the rule.
     * </p>
     * 
     * @param parameters
     *        The minimum and maximum parameters that are associated with the rule.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The minimum and maximum parameters that are associated with the rule.
     * </p>
     * 
     * @param parameters
     *        The minimum and maximum parameters that are associated with the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public Rule addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule clearParametersEntries() {
        this.parameters = null;
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public Rule clone() {
        try {
            return (Rule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.RuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
