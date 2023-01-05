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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Formatting options for a VCF file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/VcfOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VcfOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The file's ignore filter field setting.
     * </p>
     */
    private Boolean ignoreFilterField;
    /**
     * <p>
     * The file's ignore qual field setting.
     * </p>
     */
    private Boolean ignoreQualField;

    /**
     * <p>
     * The file's ignore filter field setting.
     * </p>
     * 
     * @param ignoreFilterField
     *        The file's ignore filter field setting.
     */

    public void setIgnoreFilterField(Boolean ignoreFilterField) {
        this.ignoreFilterField = ignoreFilterField;
    }

    /**
     * <p>
     * The file's ignore filter field setting.
     * </p>
     * 
     * @return The file's ignore filter field setting.
     */

    public Boolean getIgnoreFilterField() {
        return this.ignoreFilterField;
    }

    /**
     * <p>
     * The file's ignore filter field setting.
     * </p>
     * 
     * @param ignoreFilterField
     *        The file's ignore filter field setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VcfOptions withIgnoreFilterField(Boolean ignoreFilterField) {
        setIgnoreFilterField(ignoreFilterField);
        return this;
    }

    /**
     * <p>
     * The file's ignore filter field setting.
     * </p>
     * 
     * @return The file's ignore filter field setting.
     */

    public Boolean isIgnoreFilterField() {
        return this.ignoreFilterField;
    }

    /**
     * <p>
     * The file's ignore qual field setting.
     * </p>
     * 
     * @param ignoreQualField
     *        The file's ignore qual field setting.
     */

    public void setIgnoreQualField(Boolean ignoreQualField) {
        this.ignoreQualField = ignoreQualField;
    }

    /**
     * <p>
     * The file's ignore qual field setting.
     * </p>
     * 
     * @return The file's ignore qual field setting.
     */

    public Boolean getIgnoreQualField() {
        return this.ignoreQualField;
    }

    /**
     * <p>
     * The file's ignore qual field setting.
     * </p>
     * 
     * @param ignoreQualField
     *        The file's ignore qual field setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VcfOptions withIgnoreQualField(Boolean ignoreQualField) {
        setIgnoreQualField(ignoreQualField);
        return this;
    }

    /**
     * <p>
     * The file's ignore qual field setting.
     * </p>
     * 
     * @return The file's ignore qual field setting.
     */

    public Boolean isIgnoreQualField() {
        return this.ignoreQualField;
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
        if (getIgnoreFilterField() != null)
            sb.append("IgnoreFilterField: ").append(getIgnoreFilterField()).append(",");
        if (getIgnoreQualField() != null)
            sb.append("IgnoreQualField: ").append(getIgnoreQualField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VcfOptions == false)
            return false;
        VcfOptions other = (VcfOptions) obj;
        if (other.getIgnoreFilterField() == null ^ this.getIgnoreFilterField() == null)
            return false;
        if (other.getIgnoreFilterField() != null && other.getIgnoreFilterField().equals(this.getIgnoreFilterField()) == false)
            return false;
        if (other.getIgnoreQualField() == null ^ this.getIgnoreQualField() == null)
            return false;
        if (other.getIgnoreQualField() != null && other.getIgnoreQualField().equals(this.getIgnoreQualField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIgnoreFilterField() == null) ? 0 : getIgnoreFilterField().hashCode());
        hashCode = prime * hashCode + ((getIgnoreQualField() == null) ? 0 : getIgnoreQualField().hashCode());
        return hashCode;
    }

    @Override
    public VcfOptions clone() {
        try {
            return (VcfOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.VcfOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
