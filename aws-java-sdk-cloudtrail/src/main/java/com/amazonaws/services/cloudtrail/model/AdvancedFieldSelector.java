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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/AdvancedFieldSelector" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdvancedFieldSelector implements Serializable, Cloneable, StructuredPojo {

    private String field;

    private com.amazonaws.internal.SdkInternalList<String> equals;

    private com.amazonaws.internal.SdkInternalList<String> startsWith;

    private com.amazonaws.internal.SdkInternalList<String> endsWith;

    private com.amazonaws.internal.SdkInternalList<String> notEquals;

    private com.amazonaws.internal.SdkInternalList<String> notStartsWith;

    private com.amazonaws.internal.SdkInternalList<String> notEndsWith;

    /**
     * @param field
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * @return
     */

    public String getField() {
        return this.field;
    }

    /**
     * @param field
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withField(String field) {
        setField(field);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getEquals() {
        if (equals == null) {
            equals = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return equals;
    }

    /**
     * @param equals
     */

    public void setEquals(java.util.Collection<String> equals) {
        if (equals == null) {
            this.equals = null;
            return;
        }

        this.equals = new com.amazonaws.internal.SdkInternalList<String>(equals);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEquals(java.util.Collection)} or {@link #withEquals(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param equals
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withEquals(String... equals) {
        if (this.equals == null) {
            setEquals(new com.amazonaws.internal.SdkInternalList<String>(equals.length));
        }
        for (String ele : equals) {
            this.equals.add(ele);
        }
        return this;
    }

    /**
     * @param equals
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withEquals(java.util.Collection<String> equals) {
        setEquals(equals);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getStartsWith() {
        if (startsWith == null) {
            startsWith = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return startsWith;
    }

    /**
     * @param startsWith
     */

    public void setStartsWith(java.util.Collection<String> startsWith) {
        if (startsWith == null) {
            this.startsWith = null;
            return;
        }

        this.startsWith = new com.amazonaws.internal.SdkInternalList<String>(startsWith);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStartsWith(java.util.Collection)} or {@link #withStartsWith(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param startsWith
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withStartsWith(String... startsWith) {
        if (this.startsWith == null) {
            setStartsWith(new com.amazonaws.internal.SdkInternalList<String>(startsWith.length));
        }
        for (String ele : startsWith) {
            this.startsWith.add(ele);
        }
        return this;
    }

    /**
     * @param startsWith
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withStartsWith(java.util.Collection<String> startsWith) {
        setStartsWith(startsWith);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getEndsWith() {
        if (endsWith == null) {
            endsWith = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return endsWith;
    }

    /**
     * @param endsWith
     */

    public void setEndsWith(java.util.Collection<String> endsWith) {
        if (endsWith == null) {
            this.endsWith = null;
            return;
        }

        this.endsWith = new com.amazonaws.internal.SdkInternalList<String>(endsWith);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndsWith(java.util.Collection)} or {@link #withEndsWith(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param endsWith
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withEndsWith(String... endsWith) {
        if (this.endsWith == null) {
            setEndsWith(new com.amazonaws.internal.SdkInternalList<String>(endsWith.length));
        }
        for (String ele : endsWith) {
            this.endsWith.add(ele);
        }
        return this;
    }

    /**
     * @param endsWith
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withEndsWith(java.util.Collection<String> endsWith) {
        setEndsWith(endsWith);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getNotEquals() {
        if (notEquals == null) {
            notEquals = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return notEquals;
    }

    /**
     * @param notEquals
     */

    public void setNotEquals(java.util.Collection<String> notEquals) {
        if (notEquals == null) {
            this.notEquals = null;
            return;
        }

        this.notEquals = new com.amazonaws.internal.SdkInternalList<String>(notEquals);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotEquals(java.util.Collection)} or {@link #withNotEquals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param notEquals
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotEquals(String... notEquals) {
        if (this.notEquals == null) {
            setNotEquals(new com.amazonaws.internal.SdkInternalList<String>(notEquals.length));
        }
        for (String ele : notEquals) {
            this.notEquals.add(ele);
        }
        return this;
    }

    /**
     * @param notEquals
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotEquals(java.util.Collection<String> notEquals) {
        setNotEquals(notEquals);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getNotStartsWith() {
        if (notStartsWith == null) {
            notStartsWith = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return notStartsWith;
    }

    /**
     * @param notStartsWith
     */

    public void setNotStartsWith(java.util.Collection<String> notStartsWith) {
        if (notStartsWith == null) {
            this.notStartsWith = null;
            return;
        }

        this.notStartsWith = new com.amazonaws.internal.SdkInternalList<String>(notStartsWith);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotStartsWith(java.util.Collection)} or {@link #withNotStartsWith(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param notStartsWith
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotStartsWith(String... notStartsWith) {
        if (this.notStartsWith == null) {
            setNotStartsWith(new com.amazonaws.internal.SdkInternalList<String>(notStartsWith.length));
        }
        for (String ele : notStartsWith) {
            this.notStartsWith.add(ele);
        }
        return this;
    }

    /**
     * @param notStartsWith
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotStartsWith(java.util.Collection<String> notStartsWith) {
        setNotStartsWith(notStartsWith);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getNotEndsWith() {
        if (notEndsWith == null) {
            notEndsWith = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return notEndsWith;
    }

    /**
     * @param notEndsWith
     */

    public void setNotEndsWith(java.util.Collection<String> notEndsWith) {
        if (notEndsWith == null) {
            this.notEndsWith = null;
            return;
        }

        this.notEndsWith = new com.amazonaws.internal.SdkInternalList<String>(notEndsWith);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotEndsWith(java.util.Collection)} or {@link #withNotEndsWith(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param notEndsWith
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotEndsWith(String... notEndsWith) {
        if (this.notEndsWith == null) {
            setNotEndsWith(new com.amazonaws.internal.SdkInternalList<String>(notEndsWith.length));
        }
        for (String ele : notEndsWith) {
            this.notEndsWith.add(ele);
        }
        return this;
    }

    /**
     * @param notEndsWith
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotEndsWith(java.util.Collection<String> notEndsWith) {
        setNotEndsWith(notEndsWith);
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
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
        if (getEquals() != null)
            sb.append("Equals: ").append(getEquals()).append(",");
        if (getStartsWith() != null)
            sb.append("StartsWith: ").append(getStartsWith()).append(",");
        if (getEndsWith() != null)
            sb.append("EndsWith: ").append(getEndsWith()).append(",");
        if (getNotEquals() != null)
            sb.append("NotEquals: ").append(getNotEquals()).append(",");
        if (getNotStartsWith() != null)
            sb.append("NotStartsWith: ").append(getNotStartsWith()).append(",");
        if (getNotEndsWith() != null)
            sb.append("NotEndsWith: ").append(getNotEndsWith());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdvancedFieldSelector == false)
            return false;
        AdvancedFieldSelector other = (AdvancedFieldSelector) obj;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getEquals() == null ^ this.getEquals() == null)
            return false;
        if (other.getEquals() != null && other.getEquals().equals(this.getEquals()) == false)
            return false;
        if (other.getStartsWith() == null ^ this.getStartsWith() == null)
            return false;
        if (other.getStartsWith() != null && other.getStartsWith().equals(this.getStartsWith()) == false)
            return false;
        if (other.getEndsWith() == null ^ this.getEndsWith() == null)
            return false;
        if (other.getEndsWith() != null && other.getEndsWith().equals(this.getEndsWith()) == false)
            return false;
        if (other.getNotEquals() == null ^ this.getNotEquals() == null)
            return false;
        if (other.getNotEquals() != null && other.getNotEquals().equals(this.getNotEquals()) == false)
            return false;
        if (other.getNotStartsWith() == null ^ this.getNotStartsWith() == null)
            return false;
        if (other.getNotStartsWith() != null && other.getNotStartsWith().equals(this.getNotStartsWith()) == false)
            return false;
        if (other.getNotEndsWith() == null ^ this.getNotEndsWith() == null)
            return false;
        if (other.getNotEndsWith() != null && other.getNotEndsWith().equals(this.getNotEndsWith()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getEquals() == null) ? 0 : getEquals().hashCode());
        hashCode = prime * hashCode + ((getStartsWith() == null) ? 0 : getStartsWith().hashCode());
        hashCode = prime * hashCode + ((getEndsWith() == null) ? 0 : getEndsWith().hashCode());
        hashCode = prime * hashCode + ((getNotEquals() == null) ? 0 : getNotEquals().hashCode());
        hashCode = prime * hashCode + ((getNotStartsWith() == null) ? 0 : getNotStartsWith().hashCode());
        hashCode = prime * hashCode + ((getNotEndsWith() == null) ? 0 : getNotEndsWith().hashCode());
        return hashCode;
    }

    @Override
    public AdvancedFieldSelector clone() {
        try {
            return (AdvancedFieldSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.AdvancedFieldSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
