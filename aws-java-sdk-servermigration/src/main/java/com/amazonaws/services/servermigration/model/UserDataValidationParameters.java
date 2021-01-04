/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains validation parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/UserDataValidationParameters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserDataValidationParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location of the validation script.
     * </p>
     */
    private Source source;
    /**
     * <p>
     * The type of validation script.
     * </p>
     */
    private String scriptType;

    /**
     * <p>
     * The location of the validation script.
     * </p>
     * 
     * @param source
     *        The location of the validation script.
     */

    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * <p>
     * The location of the validation script.
     * </p>
     * 
     * @return The location of the validation script.
     */

    public Source getSource() {
        return this.source;
    }

    /**
     * <p>
     * The location of the validation script.
     * </p>
     * 
     * @param source
     *        The location of the validation script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDataValidationParameters withSource(Source source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The type of validation script.
     * </p>
     * 
     * @param scriptType
     *        The type of validation script.
     * @see ScriptType
     */

    public void setScriptType(String scriptType) {
        this.scriptType = scriptType;
    }

    /**
     * <p>
     * The type of validation script.
     * </p>
     * 
     * @return The type of validation script.
     * @see ScriptType
     */

    public String getScriptType() {
        return this.scriptType;
    }

    /**
     * <p>
     * The type of validation script.
     * </p>
     * 
     * @param scriptType
     *        The type of validation script.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScriptType
     */

    public UserDataValidationParameters withScriptType(String scriptType) {
        setScriptType(scriptType);
        return this;
    }

    /**
     * <p>
     * The type of validation script.
     * </p>
     * 
     * @param scriptType
     *        The type of validation script.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScriptType
     */

    public UserDataValidationParameters withScriptType(ScriptType scriptType) {
        this.scriptType = scriptType.toString();
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getScriptType() != null)
            sb.append("ScriptType: ").append(getScriptType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserDataValidationParameters == false)
            return false;
        UserDataValidationParameters other = (UserDataValidationParameters) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getScriptType() == null ^ this.getScriptType() == null)
            return false;
        if (other.getScriptType() != null && other.getScriptType().equals(this.getScriptType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getScriptType() == null) ? 0 : getScriptType().hashCode());
        return hashCode;
    }

    @Override
    public UserDataValidationParameters clone() {
        try {
            return (UserDataValidationParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.UserDataValidationParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
