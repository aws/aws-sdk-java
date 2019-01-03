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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a validation warning. Validation warnings do not prevent pipeline activation. The set of validation warnings
 * that can be returned are defined by AWS Data Pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ValidationWarning" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationWarning implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the object that contains the validation warning.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A description of the validation warning.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> warnings;

    /**
     * <p>
     * The identifier of the object that contains the validation warning.
     * </p>
     * 
     * @param id
     *        The identifier of the object that contains the validation warning.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the object that contains the validation warning.
     * </p>
     * 
     * @return The identifier of the object that contains the validation warning.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the object that contains the validation warning.
     * </p>
     * 
     * @param id
     *        The identifier of the object that contains the validation warning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationWarning withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A description of the validation warning.
     * </p>
     * 
     * @return A description of the validation warning.
     */

    public java.util.List<String> getWarnings() {
        if (warnings == null) {
            warnings = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return warnings;
    }

    /**
     * <p>
     * A description of the validation warning.
     * </p>
     * 
     * @param warnings
     *        A description of the validation warning.
     */

    public void setWarnings(java.util.Collection<String> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new com.amazonaws.internal.SdkInternalList<String>(warnings);
    }

    /**
     * <p>
     * A description of the validation warning.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     *        A description of the validation warning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationWarning withWarnings(String... warnings) {
        if (this.warnings == null) {
            setWarnings(new com.amazonaws.internal.SdkInternalList<String>(warnings.length));
        }
        for (String ele : warnings) {
            this.warnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A description of the validation warning.
     * </p>
     * 
     * @param warnings
     *        A description of the validation warning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationWarning withWarnings(java.util.Collection<String> warnings) {
        setWarnings(warnings);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidationWarning == false)
            return false;
        ValidationWarning other = (ValidationWarning) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        return hashCode;
    }

    @Override
    public ValidationWarning clone() {
        try {
            return (ValidationWarning) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datapipeline.model.transform.ValidationWarningMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
