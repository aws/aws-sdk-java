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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Vehicle Signal Specification (VSS) is a precise language used to describe and model signals in vehicle networks. The
 * JSON file collects signal specificiations in a VSS format.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/FormattedVss" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormattedVss implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides the VSS in JSON format.
     * </p>
     */
    private String vssJson;

    /**
     * <p>
     * Provides the VSS in JSON format.
     * </p>
     * 
     * @param vssJson
     *        Provides the VSS in JSON format.
     */

    public void setVssJson(String vssJson) {
        this.vssJson = vssJson;
    }

    /**
     * <p>
     * Provides the VSS in JSON format.
     * </p>
     * 
     * @return Provides the VSS in JSON format.
     */

    public String getVssJson() {
        return this.vssJson;
    }

    /**
     * <p>
     * Provides the VSS in JSON format.
     * </p>
     * 
     * @param vssJson
     *        Provides the VSS in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormattedVss withVssJson(String vssJson) {
        setVssJson(vssJson);
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
        if (getVssJson() != null)
            sb.append("VssJson: ").append(getVssJson());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FormattedVss == false)
            return false;
        FormattedVss other = (FormattedVss) obj;
        if (other.getVssJson() == null ^ this.getVssJson() == null)
            return false;
        if (other.getVssJson() != null && other.getVssJson().equals(this.getVssJson()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVssJson() == null) ? 0 : getVssJson().hashCode());
        return hashCode;
    }

    @Override
    public FormattedVss clone() {
        try {
            return (FormattedVss) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.FormattedVssMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
