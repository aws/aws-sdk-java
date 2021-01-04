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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a field in a ProfileObjectType.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ObjectTypeField" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectTypeField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A field of a ProfileObject. For example: _source.FirstName, where “_source” is a ProfileObjectType of a Zendesk
     * user and “FirstName” is a field in that ObjectType.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The location of the data in the standard ProfileObject model. For example: _profile.Address.PostalCode.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The content type of the field. Used for determining equality when searching.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * A field of a ProfileObject. For example: _source.FirstName, where “_source” is a ProfileObjectType of a Zendesk
     * user and “FirstName” is a field in that ObjectType.
     * </p>
     * 
     * @param source
     *        A field of a ProfileObject. For example: _source.FirstName, where “_source” is a ProfileObjectType of a
     *        Zendesk user and “FirstName” is a field in that ObjectType.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * A field of a ProfileObject. For example: _source.FirstName, where “_source” is a ProfileObjectType of a Zendesk
     * user and “FirstName” is a field in that ObjectType.
     * </p>
     * 
     * @return A field of a ProfileObject. For example: _source.FirstName, where “_source” is a ProfileObjectType of a
     *         Zendesk user and “FirstName” is a field in that ObjectType.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * A field of a ProfileObject. For example: _source.FirstName, where “_source” is a ProfileObjectType of a Zendesk
     * user and “FirstName” is a field in that ObjectType.
     * </p>
     * 
     * @param source
     *        A field of a ProfileObject. For example: _source.FirstName, where “_source” is a ProfileObjectType of a
     *        Zendesk user and “FirstName” is a field in that ObjectType.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectTypeField withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The location of the data in the standard ProfileObject model. For example: _profile.Address.PostalCode.
     * </p>
     * 
     * @param target
     *        The location of the data in the standard ProfileObject model. For example: _profile.Address.PostalCode.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The location of the data in the standard ProfileObject model. For example: _profile.Address.PostalCode.
     * </p>
     * 
     * @return The location of the data in the standard ProfileObject model. For example: _profile.Address.PostalCode.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The location of the data in the standard ProfileObject model. For example: _profile.Address.PostalCode.
     * </p>
     * 
     * @param target
     *        The location of the data in the standard ProfileObject model. For example: _profile.Address.PostalCode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectTypeField withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The content type of the field. Used for determining equality when searching.
     * </p>
     * 
     * @param contentType
     *        The content type of the field. Used for determining equality when searching.
     * @see FieldContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the field. Used for determining equality when searching.
     * </p>
     * 
     * @return The content type of the field. Used for determining equality when searching.
     * @see FieldContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the field. Used for determining equality when searching.
     * </p>
     * 
     * @param contentType
     *        The content type of the field. Used for determining equality when searching.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldContentType
     */

    public ObjectTypeField withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The content type of the field. Used for determining equality when searching.
     * </p>
     * 
     * @param contentType
     *        The content type of the field. Used for determining equality when searching.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldContentType
     */

    public ObjectTypeField withContentType(FieldContentType contentType) {
        this.contentType = contentType.toString();
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectTypeField == false)
            return false;
        ObjectTypeField other = (ObjectTypeField) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public ObjectTypeField clone() {
        try {
            return (ObjectTypeField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.ObjectTypeFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
