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
 * Options for the <code>GetTemplateSummary</code> API action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/TemplateSummaryConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateSummaryConfig implements Serializable, Cloneable {

    /**
     * <p>
     * If set to <code>True</code>, any unrecognized resource types generate warnings and not an error. Any unrecognized
     * resource types are returned in the <code>Warnings</code> output parameter.
     * </p>
     */
    private Boolean treatUnrecognizedResourceTypesAsWarnings;

    /**
     * <p>
     * If set to <code>True</code>, any unrecognized resource types generate warnings and not an error. Any unrecognized
     * resource types are returned in the <code>Warnings</code> output parameter.
     * </p>
     * 
     * @param treatUnrecognizedResourceTypesAsWarnings
     *        If set to <code>True</code>, any unrecognized resource types generate warnings and not an error. Any
     *        unrecognized resource types are returned in the <code>Warnings</code> output parameter.
     */

    public void setTreatUnrecognizedResourceTypesAsWarnings(Boolean treatUnrecognizedResourceTypesAsWarnings) {
        this.treatUnrecognizedResourceTypesAsWarnings = treatUnrecognizedResourceTypesAsWarnings;
    }

    /**
     * <p>
     * If set to <code>True</code>, any unrecognized resource types generate warnings and not an error. Any unrecognized
     * resource types are returned in the <code>Warnings</code> output parameter.
     * </p>
     * 
     * @return If set to <code>True</code>, any unrecognized resource types generate warnings and not an error. Any
     *         unrecognized resource types are returned in the <code>Warnings</code> output parameter.
     */

    public Boolean getTreatUnrecognizedResourceTypesAsWarnings() {
        return this.treatUnrecognizedResourceTypesAsWarnings;
    }

    /**
     * <p>
     * If set to <code>True</code>, any unrecognized resource types generate warnings and not an error. Any unrecognized
     * resource types are returned in the <code>Warnings</code> output parameter.
     * </p>
     * 
     * @param treatUnrecognizedResourceTypesAsWarnings
     *        If set to <code>True</code>, any unrecognized resource types generate warnings and not an error. Any
     *        unrecognized resource types are returned in the <code>Warnings</code> output parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummaryConfig withTreatUnrecognizedResourceTypesAsWarnings(Boolean treatUnrecognizedResourceTypesAsWarnings) {
        setTreatUnrecognizedResourceTypesAsWarnings(treatUnrecognizedResourceTypesAsWarnings);
        return this;
    }

    /**
     * <p>
     * If set to <code>True</code>, any unrecognized resource types generate warnings and not an error. Any unrecognized
     * resource types are returned in the <code>Warnings</code> output parameter.
     * </p>
     * 
     * @return If set to <code>True</code>, any unrecognized resource types generate warnings and not an error. Any
     *         unrecognized resource types are returned in the <code>Warnings</code> output parameter.
     */

    public Boolean isTreatUnrecognizedResourceTypesAsWarnings() {
        return this.treatUnrecognizedResourceTypesAsWarnings;
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
        if (getTreatUnrecognizedResourceTypesAsWarnings() != null)
            sb.append("TreatUnrecognizedResourceTypesAsWarnings: ").append(getTreatUnrecognizedResourceTypesAsWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateSummaryConfig == false)
            return false;
        TemplateSummaryConfig other = (TemplateSummaryConfig) obj;
        if (other.getTreatUnrecognizedResourceTypesAsWarnings() == null ^ this.getTreatUnrecognizedResourceTypesAsWarnings() == null)
            return false;
        if (other.getTreatUnrecognizedResourceTypesAsWarnings() != null
                && other.getTreatUnrecognizedResourceTypesAsWarnings().equals(this.getTreatUnrecognizedResourceTypesAsWarnings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTreatUnrecognizedResourceTypesAsWarnings() == null) ? 0 : getTreatUnrecognizedResourceTypesAsWarnings().hashCode());
        return hashCode;
    }

    @Override
    public TemplateSummaryConfig clone() {
        try {
            return (TemplateSummaryConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
