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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains any warnings returned by the <code>GetTemplateSummary</code> API action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/Warnings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Warnings implements Serializable, Cloneable {

    /**
     * <p>
     * A list of all of the unrecognized resource types. This is only returned if the <code>TemplateSummaryConfig</code>
     * parameter has the <code>TreatUnrecognizedResourceTypesAsWarning</code> configuration set to <code>True</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> unrecognizedResourceTypes;

    /**
     * <p>
     * A list of all of the unrecognized resource types. This is only returned if the <code>TemplateSummaryConfig</code>
     * parameter has the <code>TreatUnrecognizedResourceTypesAsWarning</code> configuration set to <code>True</code>.
     * </p>
     * 
     * @return A list of all of the unrecognized resource types. This is only returned if the
     *         <code>TemplateSummaryConfig</code> parameter has the <code>TreatUnrecognizedResourceTypesAsWarning</code>
     *         configuration set to <code>True</code>.
     */

    public java.util.List<String> getUnrecognizedResourceTypes() {
        if (unrecognizedResourceTypes == null) {
            unrecognizedResourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return unrecognizedResourceTypes;
    }

    /**
     * <p>
     * A list of all of the unrecognized resource types. This is only returned if the <code>TemplateSummaryConfig</code>
     * parameter has the <code>TreatUnrecognizedResourceTypesAsWarning</code> configuration set to <code>True</code>.
     * </p>
     * 
     * @param unrecognizedResourceTypes
     *        A list of all of the unrecognized resource types. This is only returned if the
     *        <code>TemplateSummaryConfig</code> parameter has the <code>TreatUnrecognizedResourceTypesAsWarning</code>
     *        configuration set to <code>True</code>.
     */

    public void setUnrecognizedResourceTypes(java.util.Collection<String> unrecognizedResourceTypes) {
        if (unrecognizedResourceTypes == null) {
            this.unrecognizedResourceTypes = null;
            return;
        }

        this.unrecognizedResourceTypes = new com.amazonaws.internal.SdkInternalList<String>(unrecognizedResourceTypes);
    }

    /**
     * <p>
     * A list of all of the unrecognized resource types. This is only returned if the <code>TemplateSummaryConfig</code>
     * parameter has the <code>TreatUnrecognizedResourceTypesAsWarning</code> configuration set to <code>True</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnrecognizedResourceTypes(java.util.Collection)} or
     * {@link #withUnrecognizedResourceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unrecognizedResourceTypes
     *        A list of all of the unrecognized resource types. This is only returned if the
     *        <code>TemplateSummaryConfig</code> parameter has the <code>TreatUnrecognizedResourceTypesAsWarning</code>
     *        configuration set to <code>True</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Warnings withUnrecognizedResourceTypes(String... unrecognizedResourceTypes) {
        if (this.unrecognizedResourceTypes == null) {
            setUnrecognizedResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(unrecognizedResourceTypes.length));
        }
        for (String ele : unrecognizedResourceTypes) {
            this.unrecognizedResourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all of the unrecognized resource types. This is only returned if the <code>TemplateSummaryConfig</code>
     * parameter has the <code>TreatUnrecognizedResourceTypesAsWarning</code> configuration set to <code>True</code>.
     * </p>
     * 
     * @param unrecognizedResourceTypes
     *        A list of all of the unrecognized resource types. This is only returned if the
     *        <code>TemplateSummaryConfig</code> parameter has the <code>TreatUnrecognizedResourceTypesAsWarning</code>
     *        configuration set to <code>True</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Warnings withUnrecognizedResourceTypes(java.util.Collection<String> unrecognizedResourceTypes) {
        setUnrecognizedResourceTypes(unrecognizedResourceTypes);
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
        if (getUnrecognizedResourceTypes() != null)
            sb.append("UnrecognizedResourceTypes: ").append(getUnrecognizedResourceTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Warnings == false)
            return false;
        Warnings other = (Warnings) obj;
        if (other.getUnrecognizedResourceTypes() == null ^ this.getUnrecognizedResourceTypes() == null)
            return false;
        if (other.getUnrecognizedResourceTypes() != null && other.getUnrecognizedResourceTypes().equals(this.getUnrecognizedResourceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnrecognizedResourceTypes() == null) ? 0 : getUnrecognizedResourceTypes().hashCode());
        return hashCode;
    }

    @Override
    public Warnings clone() {
        try {
            return (Warnings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
