/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The target parameter specifies the identifier to which the home region is applied, which is always an
 * <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/Target" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Target implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target type is always an <code>ACCOUNT</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The <code>TargetID</code> is a 12-character identifier of the <code>ACCOUNT</code> for which the control was
     * created. (This must be the current account.)
     * </p>
     */
    private String id;

    /**
     * <p>
     * The target type is always an <code>ACCOUNT</code>.
     * </p>
     * 
     * @param type
     *        The target type is always an <code>ACCOUNT</code>.
     * @see TargetType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The target type is always an <code>ACCOUNT</code>.
     * </p>
     * 
     * @return The target type is always an <code>ACCOUNT</code>.
     * @see TargetType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The target type is always an <code>ACCOUNT</code>.
     * </p>
     * 
     * @param type
     *        The target type is always an <code>ACCOUNT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public Target withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The target type is always an <code>ACCOUNT</code>.
     * </p>
     * 
     * @param type
     *        The target type is always an <code>ACCOUNT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public Target withType(TargetType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The <code>TargetID</code> is a 12-character identifier of the <code>ACCOUNT</code> for which the control was
     * created. (This must be the current account.)
     * </p>
     * 
     * @param id
     *        The <code>TargetID</code> is a 12-character identifier of the <code>ACCOUNT</code> for which the control
     *        was created. (This must be the current account.)
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The <code>TargetID</code> is a 12-character identifier of the <code>ACCOUNT</code> for which the control was
     * created. (This must be the current account.)
     * </p>
     * 
     * @return The <code>TargetID</code> is a 12-character identifier of the <code>ACCOUNT</code> for which the control
     *         was created. (This must be the current account.)
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The <code>TargetID</code> is a 12-character identifier of the <code>ACCOUNT</code> for which the control was
     * created. (This must be the current account.)
     * </p>
     * 
     * @param id
     *        The <code>TargetID</code> is a 12-character identifier of the <code>ACCOUNT</code> for which the control
     *        was created. (This must be the current account.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withId(String id) {
        setId(id);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Target == false)
            return false;
        Target other = (Target) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public Target clone() {
        try {
            return (Target) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubconfig.model.transform.TargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
