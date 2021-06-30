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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the JSON-specific options that define how input is to be interpreted by Glue DataBrew.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/JsonOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JsonOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value that specifies whether JSON input contains embedded new line characters.
     * </p>
     */
    private Boolean multiLine;

    /**
     * <p>
     * A value that specifies whether JSON input contains embedded new line characters.
     * </p>
     * 
     * @param multiLine
     *        A value that specifies whether JSON input contains embedded new line characters.
     */

    public void setMultiLine(Boolean multiLine) {
        this.multiLine = multiLine;
    }

    /**
     * <p>
     * A value that specifies whether JSON input contains embedded new line characters.
     * </p>
     * 
     * @return A value that specifies whether JSON input contains embedded new line characters.
     */

    public Boolean getMultiLine() {
        return this.multiLine;
    }

    /**
     * <p>
     * A value that specifies whether JSON input contains embedded new line characters.
     * </p>
     * 
     * @param multiLine
     *        A value that specifies whether JSON input contains embedded new line characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JsonOptions withMultiLine(Boolean multiLine) {
        setMultiLine(multiLine);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether JSON input contains embedded new line characters.
     * </p>
     * 
     * @return A value that specifies whether JSON input contains embedded new line characters.
     */

    public Boolean isMultiLine() {
        return this.multiLine;
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
        if (getMultiLine() != null)
            sb.append("MultiLine: ").append(getMultiLine());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JsonOptions == false)
            return false;
        JsonOptions other = (JsonOptions) obj;
        if (other.getMultiLine() == null ^ this.getMultiLine() == null)
            return false;
        if (other.getMultiLine() != null && other.getMultiLine().equals(this.getMultiLine()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMultiLine() == null) ? 0 : getMultiLine().hashCode());
        return hashCode;
    }

    @Override
    public JsonOptions clone() {
        try {
            return (JsonOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.JsonOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
