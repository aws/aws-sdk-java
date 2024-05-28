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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A suggested fix for a vulnerability in your Lambda function code.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/SuggestedFix" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuggestedFix implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fix's code.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The fix's description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The fix's code.
     * </p>
     * 
     * @param code
     *        The fix's code.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The fix's code.
     * </p>
     * 
     * @return The fix's code.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The fix's code.
     * </p>
     * 
     * @param code
     *        The fix's code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestedFix withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The fix's description.
     * </p>
     * 
     * @param description
     *        The fix's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The fix's description.
     * </p>
     * 
     * @return The fix's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The fix's description.
     * </p>
     * 
     * @param description
     *        The fix's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuggestedFix withDescription(String description) {
        setDescription(description);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuggestedFix == false)
            return false;
        SuggestedFix other = (SuggestedFix) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public SuggestedFix clone() {
        try {
            return (SuggestedFix) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.SuggestedFixMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
