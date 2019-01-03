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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ImportTerminology" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTerminologyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The properties of the custom terminology being imported.
     * </p>
     */
    private TerminologyProperties terminologyProperties;

    /**
     * <p>
     * The properties of the custom terminology being imported.
     * </p>
     * 
     * @param terminologyProperties
     *        The properties of the custom terminology being imported.
     */

    public void setTerminologyProperties(TerminologyProperties terminologyProperties) {
        this.terminologyProperties = terminologyProperties;
    }

    /**
     * <p>
     * The properties of the custom terminology being imported.
     * </p>
     * 
     * @return The properties of the custom terminology being imported.
     */

    public TerminologyProperties getTerminologyProperties() {
        return this.terminologyProperties;
    }

    /**
     * <p>
     * The properties of the custom terminology being imported.
     * </p>
     * 
     * @param terminologyProperties
     *        The properties of the custom terminology being imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTerminologyResult withTerminologyProperties(TerminologyProperties terminologyProperties) {
        setTerminologyProperties(terminologyProperties);
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
        if (getTerminologyProperties() != null)
            sb.append("TerminologyProperties: ").append(getTerminologyProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportTerminologyResult == false)
            return false;
        ImportTerminologyResult other = (ImportTerminologyResult) obj;
        if (other.getTerminologyProperties() == null ^ this.getTerminologyProperties() == null)
            return false;
        if (other.getTerminologyProperties() != null && other.getTerminologyProperties().equals(this.getTerminologyProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTerminologyProperties() == null) ? 0 : getTerminologyProperties().hashCode());
        return hashCode;
    }

    @Override
    public ImportTerminologyResult clone() {
        try {
            return (ImportTerminologyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
