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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Export errors data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ExportErrorData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportErrorData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Export errors data raw error.
     * </p>
     */
    private String rawError;

    /**
     * <p>
     * Export errors data raw error.
     * </p>
     * 
     * @param rawError
     *        Export errors data raw error.
     */

    public void setRawError(String rawError) {
        this.rawError = rawError;
    }

    /**
     * <p>
     * Export errors data raw error.
     * </p>
     * 
     * @return Export errors data raw error.
     */

    public String getRawError() {
        return this.rawError;
    }

    /**
     * <p>
     * Export errors data raw error.
     * </p>
     * 
     * @param rawError
     *        Export errors data raw error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportErrorData withRawError(String rawError) {
        setRawError(rawError);
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
        if (getRawError() != null)
            sb.append("RawError: ").append(getRawError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportErrorData == false)
            return false;
        ExportErrorData other = (ExportErrorData) obj;
        if (other.getRawError() == null ^ this.getRawError() == null)
            return false;
        if (other.getRawError() != null && other.getRawError().equals(this.getRawError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRawError() == null) ? 0 : getRawError().hashCode());
        return hashCode;
    }

    @Override
    public ExportErrorData clone() {
        try {
            return (ExportErrorData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ExportErrorDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
