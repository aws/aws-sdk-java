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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifier that contains details about the directory consumer account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ShareTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShareTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of the directory consumer account.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Type of identifier to be used in the <code>Id</code> field.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Identifier of the directory consumer account.
     * </p>
     * 
     * @param id
     *        Identifier of the directory consumer account.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Identifier of the directory consumer account.
     * </p>
     * 
     * @return Identifier of the directory consumer account.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Identifier of the directory consumer account.
     * </p>
     * 
     * @param id
     *        Identifier of the directory consumer account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShareTarget withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Type of identifier to be used in the <code>Id</code> field.
     * </p>
     * 
     * @param type
     *        Type of identifier to be used in the <code>Id</code> field.
     * @see TargetType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of identifier to be used in the <code>Id</code> field.
     * </p>
     * 
     * @return Type of identifier to be used in the <code>Id</code> field.
     * @see TargetType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of identifier to be used in the <code>Id</code> field.
     * </p>
     * 
     * @param type
     *        Type of identifier to be used in the <code>Id</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public ShareTarget withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of identifier to be used in the <code>Id</code> field.
     * </p>
     * 
     * @param type
     *        Type of identifier to be used in the <code>Id</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public ShareTarget withType(TargetType type) {
        this.type = type.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShareTarget == false)
            return false;
        ShareTarget other = (ShareTarget) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ShareTarget clone() {
        try {
            return (ShareTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.ShareTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
