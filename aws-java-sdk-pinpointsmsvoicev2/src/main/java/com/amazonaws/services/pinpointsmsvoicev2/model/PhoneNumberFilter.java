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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information for a phone number that meets a specified criteria.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PhoneNumberFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhoneNumberFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the attribute to filter on.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An array values to filter for.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the attribute to filter on.
     * </p>
     * 
     * @param name
     *        The name of the attribute to filter on.
     * @see PhoneNumberFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the attribute to filter on.
     * </p>
     * 
     * @return The name of the attribute to filter on.
     * @see PhoneNumberFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the attribute to filter on.
     * </p>
     * 
     * @param name
     *        The name of the attribute to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberFilterName
     */

    public PhoneNumberFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the attribute to filter on.
     * </p>
     * 
     * @param name
     *        The name of the attribute to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberFilterName
     */

    public PhoneNumberFilter withName(PhoneNumberFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * An array values to filter for.
     * </p>
     * 
     * @return An array values to filter for.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * An array values to filter for.
     * </p>
     * 
     * @param values
     *        An array values to filter for.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * An array values to filter for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        An array values to filter for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array values to filter for.
     * </p>
     * 
     * @param values
     *        An array values to filter for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberFilter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumberFilter == false)
            return false;
        PhoneNumberFilter other = (PhoneNumberFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public PhoneNumberFilter clone() {
        try {
            return (PhoneNumberFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.PhoneNumberFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
