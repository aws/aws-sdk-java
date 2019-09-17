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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a logical operation for comparing the value of a field with a specified value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/Operator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Operator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The logical operation to be performed: equal (<code>EQ</code>), equal reference (<code>REF_EQ</code>), less than
     * or equal (<code>LE</code>), greater than or equal (<code>GE</code>), or between (<code>BETWEEN</code>). Equal
     * reference (<code>REF_EQ</code>) can be used only with reference fields. The other comparison types can be used
     * only with String fields. The comparison types you can use apply only to certain object fields, as detailed below.
     * </p>
     * <p>
     * The comparison operators EQ and REF_EQ act on the following fields:
     * </p>
     * <ul>
     * <li>name</li>
     * <li>@sphere</li>
     * <li>parent</li>
     * <li>@componentParent</li>
     * <li>@instanceParent</li>
     * <li>@status</li>
     * <li>@scheduledStartTime</li>
     * <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li>
     * <li>@actualEndTime</li>
     * </ul>
     * <p>
     * The comparison operators <code>GE</code>, <code>LE</code>, and <code>BETWEEN</code> act on the following fields:
     * </p>
     * <ul>
     * <li>@scheduledStartTime</li>
     * <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li>
     * <li>@actualEndTime</li>
     * </ul>
     * <p>
     * Note that fields beginning with the at sign (@) are read-only and set by the web service. When you name fields,
     * you should choose names containing only alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     * User-defined fields that you add to a pipeline should prefix their name with the string "my".
     * </p>
     */
    private String type;
    /**
     * <p>
     * The value that the actual field value will be compared with.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * The logical operation to be performed: equal (<code>EQ</code>), equal reference (<code>REF_EQ</code>), less than
     * or equal (<code>LE</code>), greater than or equal (<code>GE</code>), or between (<code>BETWEEN</code>). Equal
     * reference (<code>REF_EQ</code>) can be used only with reference fields. The other comparison types can be used
     * only with String fields. The comparison types you can use apply only to certain object fields, as detailed below.
     * </p>
     * <p>
     * The comparison operators EQ and REF_EQ act on the following fields:
     * </p>
     * <ul>
     * <li>name</li>
     * <li>@sphere</li>
     * <li>parent</li>
     * <li>@componentParent</li>
     * <li>@instanceParent</li>
     * <li>@status</li>
     * <li>@scheduledStartTime</li>
     * <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li>
     * <li>@actualEndTime</li>
     * </ul>
     * <p>
     * The comparison operators <code>GE</code>, <code>LE</code>, and <code>BETWEEN</code> act on the following fields:
     * </p>
     * <ul>
     * <li>@scheduledStartTime</li>
     * <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li>
     * <li>@actualEndTime</li>
     * </ul>
     * <p>
     * Note that fields beginning with the at sign (@) are read-only and set by the web service. When you name fields,
     * you should choose names containing only alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     * User-defined fields that you add to a pipeline should prefix their name with the string "my".
     * </p>
     * 
     * @param type
     *        The logical operation to be performed: equal (<code>EQ</code>), equal reference (<code>REF_EQ</code>),
     *        less than or equal (<code>LE</code>), greater than or equal (<code>GE</code>), or between (
     *        <code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be used only with reference fields. The
     *        other comparison types can be used only with String fields. The comparison types you can use apply only to
     *        certain object fields, as detailed below. </p>
     *        <p>
     *        The comparison operators EQ and REF_EQ act on the following fields:
     *        </p>
     *        <ul>
     *        <li>name</li>
     *        <li>@sphere</li>
     *        <li>parent</li>
     *        <li>@componentParent</li>
     *        <li>@instanceParent</li>
     *        <li>@status</li>
     *        <li>@scheduledStartTime</li>
     *        <li>@scheduledEndTime</li>
     *        <li>@actualStartTime</li>
     *        <li>@actualEndTime</li>
     *        </ul>
     *        <p>
     *        The comparison operators <code>GE</code>, <code>LE</code>, and <code>BETWEEN</code> act on the following
     *        fields:
     *        </p>
     *        <ul>
     *        <li>@scheduledStartTime</li>
     *        <li>@scheduledEndTime</li>
     *        <li>@actualStartTime</li>
     *        <li>@actualEndTime</li>
     *        </ul>
     *        <p>
     *        Note that fields beginning with the at sign (@) are read-only and set by the web service. When you name
     *        fields, you should choose names containing only alpha-numeric values, as symbols may be reserved by AWS
     *        Data Pipeline. User-defined fields that you add to a pipeline should prefix their name with the string
     *        "my".
     * @see OperatorType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The logical operation to be performed: equal (<code>EQ</code>), equal reference (<code>REF_EQ</code>), less than
     * or equal (<code>LE</code>), greater than or equal (<code>GE</code>), or between (<code>BETWEEN</code>). Equal
     * reference (<code>REF_EQ</code>) can be used only with reference fields. The other comparison types can be used
     * only with String fields. The comparison types you can use apply only to certain object fields, as detailed below.
     * </p>
     * <p>
     * The comparison operators EQ and REF_EQ act on the following fields:
     * </p>
     * <ul>
     * <li>name</li>
     * <li>@sphere</li>
     * <li>parent</li>
     * <li>@componentParent</li>
     * <li>@instanceParent</li>
     * <li>@status</li>
     * <li>@scheduledStartTime</li>
     * <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li>
     * <li>@actualEndTime</li>
     * </ul>
     * <p>
     * The comparison operators <code>GE</code>, <code>LE</code>, and <code>BETWEEN</code> act on the following fields:
     * </p>
     * <ul>
     * <li>@scheduledStartTime</li>
     * <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li>
     * <li>@actualEndTime</li>
     * </ul>
     * <p>
     * Note that fields beginning with the at sign (@) are read-only and set by the web service. When you name fields,
     * you should choose names containing only alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     * User-defined fields that you add to a pipeline should prefix their name with the string "my".
     * </p>
     * 
     * @return The logical operation to be performed: equal (<code>EQ</code>), equal reference (<code>REF_EQ</code>),
     *         less than or equal (<code>LE</code>), greater than or equal (<code>GE</code>), or between (
     *         <code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be used only with reference fields. The
     *         other comparison types can be used only with String fields. The comparison types you can use apply only
     *         to certain object fields, as detailed below. </p>
     *         <p>
     *         The comparison operators EQ and REF_EQ act on the following fields:
     *         </p>
     *         <ul>
     *         <li>name</li>
     *         <li>@sphere</li>
     *         <li>parent</li>
     *         <li>@componentParent</li>
     *         <li>@instanceParent</li>
     *         <li>@status</li>
     *         <li>@scheduledStartTime</li>
     *         <li>@scheduledEndTime</li>
     *         <li>@actualStartTime</li>
     *         <li>@actualEndTime</li>
     *         </ul>
     *         <p>
     *         The comparison operators <code>GE</code>, <code>LE</code>, and <code>BETWEEN</code> act on the following
     *         fields:
     *         </p>
     *         <ul>
     *         <li>@scheduledStartTime</li>
     *         <li>@scheduledEndTime</li>
     *         <li>@actualStartTime</li>
     *         <li>@actualEndTime</li>
     *         </ul>
     *         <p>
     *         Note that fields beginning with the at sign (@) are read-only and set by the web service. When you name
     *         fields, you should choose names containing only alpha-numeric values, as symbols may be reserved by AWS
     *         Data Pipeline. User-defined fields that you add to a pipeline should prefix their name with the string
     *         "my".
     * @see OperatorType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The logical operation to be performed: equal (<code>EQ</code>), equal reference (<code>REF_EQ</code>), less than
     * or equal (<code>LE</code>), greater than or equal (<code>GE</code>), or between (<code>BETWEEN</code>). Equal
     * reference (<code>REF_EQ</code>) can be used only with reference fields. The other comparison types can be used
     * only with String fields. The comparison types you can use apply only to certain object fields, as detailed below.
     * </p>
     * <p>
     * The comparison operators EQ and REF_EQ act on the following fields:
     * </p>
     * <ul>
     * <li>name</li>
     * <li>@sphere</li>
     * <li>parent</li>
     * <li>@componentParent</li>
     * <li>@instanceParent</li>
     * <li>@status</li>
     * <li>@scheduledStartTime</li>
     * <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li>
     * <li>@actualEndTime</li>
     * </ul>
     * <p>
     * The comparison operators <code>GE</code>, <code>LE</code>, and <code>BETWEEN</code> act on the following fields:
     * </p>
     * <ul>
     * <li>@scheduledStartTime</li>
     * <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li>
     * <li>@actualEndTime</li>
     * </ul>
     * <p>
     * Note that fields beginning with the at sign (@) are read-only and set by the web service. When you name fields,
     * you should choose names containing only alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     * User-defined fields that you add to a pipeline should prefix their name with the string "my".
     * </p>
     * 
     * @param type
     *        The logical operation to be performed: equal (<code>EQ</code>), equal reference (<code>REF_EQ</code>),
     *        less than or equal (<code>LE</code>), greater than or equal (<code>GE</code>), or between (
     *        <code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be used only with reference fields. The
     *        other comparison types can be used only with String fields. The comparison types you can use apply only to
     *        certain object fields, as detailed below. </p>
     *        <p>
     *        The comparison operators EQ and REF_EQ act on the following fields:
     *        </p>
     *        <ul>
     *        <li>name</li>
     *        <li>@sphere</li>
     *        <li>parent</li>
     *        <li>@componentParent</li>
     *        <li>@instanceParent</li>
     *        <li>@status</li>
     *        <li>@scheduledStartTime</li>
     *        <li>@scheduledEndTime</li>
     *        <li>@actualStartTime</li>
     *        <li>@actualEndTime</li>
     *        </ul>
     *        <p>
     *        The comparison operators <code>GE</code>, <code>LE</code>, and <code>BETWEEN</code> act on the following
     *        fields:
     *        </p>
     *        <ul>
     *        <li>@scheduledStartTime</li>
     *        <li>@scheduledEndTime</li>
     *        <li>@actualStartTime</li>
     *        <li>@actualEndTime</li>
     *        </ul>
     *        <p>
     *        Note that fields beginning with the at sign (@) are read-only and set by the web service. When you name
     *        fields, you should choose names containing only alpha-numeric values, as symbols may be reserved by AWS
     *        Data Pipeline. User-defined fields that you add to a pipeline should prefix their name with the string
     *        "my".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatorType
     */

    public Operator withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The logical operation to be performed: equal (<code>EQ</code>), equal reference (<code>REF_EQ</code>), less than
     * or equal (<code>LE</code>), greater than or equal (<code>GE</code>), or between (<code>BETWEEN</code>). Equal
     * reference (<code>REF_EQ</code>) can be used only with reference fields. The other comparison types can be used
     * only with String fields. The comparison types you can use apply only to certain object fields, as detailed below.
     * </p>
     * <p>
     * The comparison operators EQ and REF_EQ act on the following fields:
     * </p>
     * <ul>
     * <li>name</li>
     * <li>@sphere</li>
     * <li>parent</li>
     * <li>@componentParent</li>
     * <li>@instanceParent</li>
     * <li>@status</li>
     * <li>@scheduledStartTime</li>
     * <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li>
     * <li>@actualEndTime</li>
     * </ul>
     * <p>
     * The comparison operators <code>GE</code>, <code>LE</code>, and <code>BETWEEN</code> act on the following fields:
     * </p>
     * <ul>
     * <li>@scheduledStartTime</li>
     * <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li>
     * <li>@actualEndTime</li>
     * </ul>
     * <p>
     * Note that fields beginning with the at sign (@) are read-only and set by the web service. When you name fields,
     * you should choose names containing only alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     * User-defined fields that you add to a pipeline should prefix their name with the string "my".
     * </p>
     * 
     * @param type
     *        The logical operation to be performed: equal (<code>EQ</code>), equal reference (<code>REF_EQ</code>),
     *        less than or equal (<code>LE</code>), greater than or equal (<code>GE</code>), or between (
     *        <code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be used only with reference fields. The
     *        other comparison types can be used only with String fields. The comparison types you can use apply only to
     *        certain object fields, as detailed below. </p>
     *        <p>
     *        The comparison operators EQ and REF_EQ act on the following fields:
     *        </p>
     *        <ul>
     *        <li>name</li>
     *        <li>@sphere</li>
     *        <li>parent</li>
     *        <li>@componentParent</li>
     *        <li>@instanceParent</li>
     *        <li>@status</li>
     *        <li>@scheduledStartTime</li>
     *        <li>@scheduledEndTime</li>
     *        <li>@actualStartTime</li>
     *        <li>@actualEndTime</li>
     *        </ul>
     *        <p>
     *        The comparison operators <code>GE</code>, <code>LE</code>, and <code>BETWEEN</code> act on the following
     *        fields:
     *        </p>
     *        <ul>
     *        <li>@scheduledStartTime</li>
     *        <li>@scheduledEndTime</li>
     *        <li>@actualStartTime</li>
     *        <li>@actualEndTime</li>
     *        </ul>
     *        <p>
     *        Note that fields beginning with the at sign (@) are read-only and set by the web service. When you name
     *        fields, you should choose names containing only alpha-numeric values, as symbols may be reserved by AWS
     *        Data Pipeline. User-defined fields that you add to a pipeline should prefix their name with the string
     *        "my".
     * @see OperatorType
     */

    public void setType(OperatorType type) {
        withType(type);
    }

    /**
     * <p>
     * The logical operation to be performed: equal (<code>EQ</code>), equal reference (<code>REF_EQ</code>), less than
     * or equal (<code>LE</code>), greater than or equal (<code>GE</code>), or between (<code>BETWEEN</code>). Equal
     * reference (<code>REF_EQ</code>) can be used only with reference fields. The other comparison types can be used
     * only with String fields. The comparison types you can use apply only to certain object fields, as detailed below.
     * </p>
     * <p>
     * The comparison operators EQ and REF_EQ act on the following fields:
     * </p>
     * <ul>
     * <li>name</li>
     * <li>@sphere</li>
     * <li>parent</li>
     * <li>@componentParent</li>
     * <li>@instanceParent</li>
     * <li>@status</li>
     * <li>@scheduledStartTime</li>
     * <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li>
     * <li>@actualEndTime</li>
     * </ul>
     * <p>
     * The comparison operators <code>GE</code>, <code>LE</code>, and <code>BETWEEN</code> act on the following fields:
     * </p>
     * <ul>
     * <li>@scheduledStartTime</li>
     * <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li>
     * <li>@actualEndTime</li>
     * </ul>
     * <p>
     * Note that fields beginning with the at sign (@) are read-only and set by the web service. When you name fields,
     * you should choose names containing only alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     * User-defined fields that you add to a pipeline should prefix their name with the string "my".
     * </p>
     * 
     * @param type
     *        The logical operation to be performed: equal (<code>EQ</code>), equal reference (<code>REF_EQ</code>),
     *        less than or equal (<code>LE</code>), greater than or equal (<code>GE</code>), or between (
     *        <code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be used only with reference fields. The
     *        other comparison types can be used only with String fields. The comparison types you can use apply only to
     *        certain object fields, as detailed below. </p>
     *        <p>
     *        The comparison operators EQ and REF_EQ act on the following fields:
     *        </p>
     *        <ul>
     *        <li>name</li>
     *        <li>@sphere</li>
     *        <li>parent</li>
     *        <li>@componentParent</li>
     *        <li>@instanceParent</li>
     *        <li>@status</li>
     *        <li>@scheduledStartTime</li>
     *        <li>@scheduledEndTime</li>
     *        <li>@actualStartTime</li>
     *        <li>@actualEndTime</li>
     *        </ul>
     *        <p>
     *        The comparison operators <code>GE</code>, <code>LE</code>, and <code>BETWEEN</code> act on the following
     *        fields:
     *        </p>
     *        <ul>
     *        <li>@scheduledStartTime</li>
     *        <li>@scheduledEndTime</li>
     *        <li>@actualStartTime</li>
     *        <li>@actualEndTime</li>
     *        </ul>
     *        <p>
     *        Note that fields beginning with the at sign (@) are read-only and set by the web service. When you name
     *        fields, you should choose names containing only alpha-numeric values, as symbols may be reserved by AWS
     *        Data Pipeline. User-defined fields that you add to a pipeline should prefix their name with the string
     *        "my".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatorType
     */

    public Operator withType(OperatorType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The value that the actual field value will be compared with.
     * </p>
     * 
     * @return The value that the actual field value will be compared with.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * The value that the actual field value will be compared with.
     * </p>
     * 
     * @param values
     *        The value that the actual field value will be compared with.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * The value that the actual field value will be compared with.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value that the actual field value will be compared with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operator withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value that the actual field value will be compared with.
     * </p>
     * 
     * @param values
     *        The value that the actual field value will be compared with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operator withValues(java.util.Collection<String> values) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof Operator == false)
            return false;
        Operator other = (Operator) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public Operator clone() {
        try {
            return (Operator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datapipeline.model.transform.OperatorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
