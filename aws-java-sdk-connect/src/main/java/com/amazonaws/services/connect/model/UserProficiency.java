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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about proficiency of a user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UserProficiency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserProficiency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of user's proficiency. You must use name of predefined attribute present in the Amazon Connect instance.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The value of user's proficiency. You must use value of predefined attribute present in the Amazon Connect
     * instance.
     * </p>
     */
    private String attributeValue;
    /**
     * <p>
     * The level of the proficiency. The valid values are 1, 2, 3, 4 and 5.
     * </p>
     */
    private Float level;

    /**
     * <p>
     * The name of user's proficiency. You must use name of predefined attribute present in the Amazon Connect instance.
     * </p>
     * 
     * @param attributeName
     *        The name of user's proficiency. You must use name of predefined attribute present in the Amazon Connect
     *        instance.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of user's proficiency. You must use name of predefined attribute present in the Amazon Connect instance.
     * </p>
     * 
     * @return The name of user's proficiency. You must use name of predefined attribute present in the Amazon Connect
     *         instance.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of user's proficiency. You must use name of predefined attribute present in the Amazon Connect instance.
     * </p>
     * 
     * @param attributeName
     *        The name of user's proficiency. You must use name of predefined attribute present in the Amazon Connect
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserProficiency withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The value of user's proficiency. You must use value of predefined attribute present in the Amazon Connect
     * instance.
     * </p>
     * 
     * @param attributeValue
     *        The value of user's proficiency. You must use value of predefined attribute present in the Amazon Connect
     *        instance.
     */

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The value of user's proficiency. You must use value of predefined attribute present in the Amazon Connect
     * instance.
     * </p>
     * 
     * @return The value of user's proficiency. You must use value of predefined attribute present in the Amazon Connect
     *         instance.
     */

    public String getAttributeValue() {
        return this.attributeValue;
    }

    /**
     * <p>
     * The value of user's proficiency. You must use value of predefined attribute present in the Amazon Connect
     * instance.
     * </p>
     * 
     * @param attributeValue
     *        The value of user's proficiency. You must use value of predefined attribute present in the Amazon Connect
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserProficiency withAttributeValue(String attributeValue) {
        setAttributeValue(attributeValue);
        return this;
    }

    /**
     * <p>
     * The level of the proficiency. The valid values are 1, 2, 3, 4 and 5.
     * </p>
     * 
     * @param level
     *        The level of the proficiency. The valid values are 1, 2, 3, 4 and 5.
     */

    public void setLevel(Float level) {
        this.level = level;
    }

    /**
     * <p>
     * The level of the proficiency. The valid values are 1, 2, 3, 4 and 5.
     * </p>
     * 
     * @return The level of the proficiency. The valid values are 1, 2, 3, 4 and 5.
     */

    public Float getLevel() {
        return this.level;
    }

    /**
     * <p>
     * The level of the proficiency. The valid values are 1, 2, 3, 4 and 5.
     * </p>
     * 
     * @param level
     *        The level of the proficiency. The valid values are 1, 2, 3, 4 and 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserProficiency withLevel(Float level) {
        setLevel(level);
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getAttributeValue() != null)
            sb.append("AttributeValue: ").append(getAttributeValue()).append(",");
        if (getLevel() != null)
            sb.append("Level: ").append(getLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserProficiency == false)
            return false;
        UserProficiency other = (UserProficiency) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        return hashCode;
    }

    @Override
    public UserProficiency clone() {
        try {
            return (UserProficiency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.UserProficiencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
