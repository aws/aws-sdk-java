/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;


/**
 * <p>
 * Contains a logical operation for comparing the value of a field with a specified value.
 * </p>
 */
public class Operator implements Serializable {

    /**
     * The logical operation to be performed: equal (<code>EQ</code>), equal
     * reference (<code>REF_EQ</code>), less than or equal (<code>LE</code>),
     * greater than or equal (<code>GE</code>), or between
     * (<code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be
     * used only with reference fields. The other comparison types can be
     * used only with String fields. The comparison types you can use apply
     * only to certain object fields, as detailed below. <p> The comparison
     * operators EQ and REF_EQ act on the following fields: <ul>
     * <li>name</li> <li>@sphere</li> <li>parent</li>
     * <li>@componentParent</li> <li>@instanceParent</li> <li>@status</li>
     * <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p> The
     * comparison operators <code>GE</code>, <code>LE</code>, and
     * <code>BETWEEN</code> act on the following fields: <ul>
     * <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p>Note that
     * fields beginning with the at sign (@) are read-only and set by the web
     * service. When you name fields, you should choose names containing only
     * alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     * User-defined fields that you add to a pipeline should prefix their
     * name with the string "my".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, REF_EQ, LE, GE, BETWEEN
     */
    private String type;

    /**
     * The value that the actual field value will be compared with.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> values;

    /**
     * The logical operation to be performed: equal (<code>EQ</code>), equal
     * reference (<code>REF_EQ</code>), less than or equal (<code>LE</code>),
     * greater than or equal (<code>GE</code>), or between
     * (<code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be
     * used only with reference fields. The other comparison types can be
     * used only with String fields. The comparison types you can use apply
     * only to certain object fields, as detailed below. <p> The comparison
     * operators EQ and REF_EQ act on the following fields: <ul>
     * <li>name</li> <li>@sphere</li> <li>parent</li>
     * <li>@componentParent</li> <li>@instanceParent</li> <li>@status</li>
     * <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p> The
     * comparison operators <code>GE</code>, <code>LE</code>, and
     * <code>BETWEEN</code> act on the following fields: <ul>
     * <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p>Note that
     * fields beginning with the at sign (@) are read-only and set by the web
     * service. When you name fields, you should choose names containing only
     * alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     * User-defined fields that you add to a pipeline should prefix their
     * name with the string "my".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, REF_EQ, LE, GE, BETWEEN
     *
     * @return The logical operation to be performed: equal (<code>EQ</code>), equal
     *         reference (<code>REF_EQ</code>), less than or equal (<code>LE</code>),
     *         greater than or equal (<code>GE</code>), or between
     *         (<code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be
     *         used only with reference fields. The other comparison types can be
     *         used only with String fields. The comparison types you can use apply
     *         only to certain object fields, as detailed below. <p> The comparison
     *         operators EQ and REF_EQ act on the following fields: <ul>
     *         <li>name</li> <li>@sphere</li> <li>parent</li>
     *         <li>@componentParent</li> <li>@instanceParent</li> <li>@status</li>
     *         <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     *         <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p> The
     *         comparison operators <code>GE</code>, <code>LE</code>, and
     *         <code>BETWEEN</code> act on the following fields: <ul>
     *         <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     *         <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p>Note that
     *         fields beginning with the at sign (@) are read-only and set by the web
     *         service. When you name fields, you should choose names containing only
     *         alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     *         User-defined fields that you add to a pipeline should prefix their
     *         name with the string "my".
     *
     * @see OperatorType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The logical operation to be performed: equal (<code>EQ</code>), equal
     * reference (<code>REF_EQ</code>), less than or equal (<code>LE</code>),
     * greater than or equal (<code>GE</code>), or between
     * (<code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be
     * used only with reference fields. The other comparison types can be
     * used only with String fields. The comparison types you can use apply
     * only to certain object fields, as detailed below. <p> The comparison
     * operators EQ and REF_EQ act on the following fields: <ul>
     * <li>name</li> <li>@sphere</li> <li>parent</li>
     * <li>@componentParent</li> <li>@instanceParent</li> <li>@status</li>
     * <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p> The
     * comparison operators <code>GE</code>, <code>LE</code>, and
     * <code>BETWEEN</code> act on the following fields: <ul>
     * <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p>Note that
     * fields beginning with the at sign (@) are read-only and set by the web
     * service. When you name fields, you should choose names containing only
     * alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     * User-defined fields that you add to a pipeline should prefix their
     * name with the string "my".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, REF_EQ, LE, GE, BETWEEN
     *
     * @param type The logical operation to be performed: equal (<code>EQ</code>), equal
     *         reference (<code>REF_EQ</code>), less than or equal (<code>LE</code>),
     *         greater than or equal (<code>GE</code>), or between
     *         (<code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be
     *         used only with reference fields. The other comparison types can be
     *         used only with String fields. The comparison types you can use apply
     *         only to certain object fields, as detailed below. <p> The comparison
     *         operators EQ and REF_EQ act on the following fields: <ul>
     *         <li>name</li> <li>@sphere</li> <li>parent</li>
     *         <li>@componentParent</li> <li>@instanceParent</li> <li>@status</li>
     *         <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     *         <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p> The
     *         comparison operators <code>GE</code>, <code>LE</code>, and
     *         <code>BETWEEN</code> act on the following fields: <ul>
     *         <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     *         <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p>Note that
     *         fields beginning with the at sign (@) are read-only and set by the web
     *         service. When you name fields, you should choose names containing only
     *         alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     *         User-defined fields that you add to a pipeline should prefix their
     *         name with the string "my".
     *
     * @see OperatorType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The logical operation to be performed: equal (<code>EQ</code>), equal
     * reference (<code>REF_EQ</code>), less than or equal (<code>LE</code>),
     * greater than or equal (<code>GE</code>), or between
     * (<code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be
     * used only with reference fields. The other comparison types can be
     * used only with String fields. The comparison types you can use apply
     * only to certain object fields, as detailed below. <p> The comparison
     * operators EQ and REF_EQ act on the following fields: <ul>
     * <li>name</li> <li>@sphere</li> <li>parent</li>
     * <li>@componentParent</li> <li>@instanceParent</li> <li>@status</li>
     * <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p> The
     * comparison operators <code>GE</code>, <code>LE</code>, and
     * <code>BETWEEN</code> act on the following fields: <ul>
     * <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p>Note that
     * fields beginning with the at sign (@) are read-only and set by the web
     * service. When you name fields, you should choose names containing only
     * alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     * User-defined fields that you add to a pipeline should prefix their
     * name with the string "my".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, REF_EQ, LE, GE, BETWEEN
     *
     * @param type The logical operation to be performed: equal (<code>EQ</code>), equal
     *         reference (<code>REF_EQ</code>), less than or equal (<code>LE</code>),
     *         greater than or equal (<code>GE</code>), or between
     *         (<code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be
     *         used only with reference fields. The other comparison types can be
     *         used only with String fields. The comparison types you can use apply
     *         only to certain object fields, as detailed below. <p> The comparison
     *         operators EQ and REF_EQ act on the following fields: <ul>
     *         <li>name</li> <li>@sphere</li> <li>parent</li>
     *         <li>@componentParent</li> <li>@instanceParent</li> <li>@status</li>
     *         <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     *         <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p> The
     *         comparison operators <code>GE</code>, <code>LE</code>, and
     *         <code>BETWEEN</code> act on the following fields: <ul>
     *         <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     *         <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p>Note that
     *         fields beginning with the at sign (@) are read-only and set by the web
     *         service. When you name fields, you should choose names containing only
     *         alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     *         User-defined fields that you add to a pipeline should prefix their
     *         name with the string "my".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see OperatorType
     */
    public Operator withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The logical operation to be performed: equal (<code>EQ</code>), equal
     * reference (<code>REF_EQ</code>), less than or equal (<code>LE</code>),
     * greater than or equal (<code>GE</code>), or between
     * (<code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be
     * used only with reference fields. The other comparison types can be
     * used only with String fields. The comparison types you can use apply
     * only to certain object fields, as detailed below. <p> The comparison
     * operators EQ and REF_EQ act on the following fields: <ul>
     * <li>name</li> <li>@sphere</li> <li>parent</li>
     * <li>@componentParent</li> <li>@instanceParent</li> <li>@status</li>
     * <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p> The
     * comparison operators <code>GE</code>, <code>LE</code>, and
     * <code>BETWEEN</code> act on the following fields: <ul>
     * <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p>Note that
     * fields beginning with the at sign (@) are read-only and set by the web
     * service. When you name fields, you should choose names containing only
     * alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     * User-defined fields that you add to a pipeline should prefix their
     * name with the string "my".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, REF_EQ, LE, GE, BETWEEN
     *
     * @param type The logical operation to be performed: equal (<code>EQ</code>), equal
     *         reference (<code>REF_EQ</code>), less than or equal (<code>LE</code>),
     *         greater than or equal (<code>GE</code>), or between
     *         (<code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be
     *         used only with reference fields. The other comparison types can be
     *         used only with String fields. The comparison types you can use apply
     *         only to certain object fields, as detailed below. <p> The comparison
     *         operators EQ and REF_EQ act on the following fields: <ul>
     *         <li>name</li> <li>@sphere</li> <li>parent</li>
     *         <li>@componentParent</li> <li>@instanceParent</li> <li>@status</li>
     *         <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     *         <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p> The
     *         comparison operators <code>GE</code>, <code>LE</code>, and
     *         <code>BETWEEN</code> act on the following fields: <ul>
     *         <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     *         <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p>Note that
     *         fields beginning with the at sign (@) are read-only and set by the web
     *         service. When you name fields, you should choose names containing only
     *         alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     *         User-defined fields that you add to a pipeline should prefix their
     *         name with the string "my".
     *
     * @see OperatorType
     */
    public void setType(OperatorType type) {
        this.type = type.toString();
    }
    
    /**
     * The logical operation to be performed: equal (<code>EQ</code>), equal
     * reference (<code>REF_EQ</code>), less than or equal (<code>LE</code>),
     * greater than or equal (<code>GE</code>), or between
     * (<code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be
     * used only with reference fields. The other comparison types can be
     * used only with String fields. The comparison types you can use apply
     * only to certain object fields, as detailed below. <p> The comparison
     * operators EQ and REF_EQ act on the following fields: <ul>
     * <li>name</li> <li>@sphere</li> <li>parent</li>
     * <li>@componentParent</li> <li>@instanceParent</li> <li>@status</li>
     * <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p> The
     * comparison operators <code>GE</code>, <code>LE</code>, and
     * <code>BETWEEN</code> act on the following fields: <ul>
     * <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     * <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p>Note that
     * fields beginning with the at sign (@) are read-only and set by the web
     * service. When you name fields, you should choose names containing only
     * alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     * User-defined fields that you add to a pipeline should prefix their
     * name with the string "my".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, REF_EQ, LE, GE, BETWEEN
     *
     * @param type The logical operation to be performed: equal (<code>EQ</code>), equal
     *         reference (<code>REF_EQ</code>), less than or equal (<code>LE</code>),
     *         greater than or equal (<code>GE</code>), or between
     *         (<code>BETWEEN</code>). Equal reference (<code>REF_EQ</code>) can be
     *         used only with reference fields. The other comparison types can be
     *         used only with String fields. The comparison types you can use apply
     *         only to certain object fields, as detailed below. <p> The comparison
     *         operators EQ and REF_EQ act on the following fields: <ul>
     *         <li>name</li> <li>@sphere</li> <li>parent</li>
     *         <li>@componentParent</li> <li>@instanceParent</li> <li>@status</li>
     *         <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     *         <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p> The
     *         comparison operators <code>GE</code>, <code>LE</code>, and
     *         <code>BETWEEN</code> act on the following fields: <ul>
     *         <li>@scheduledStartTime</li> <li>@scheduledEndTime</li>
     *         <li>@actualStartTime</li> <li>@actualEndTime</li> </ul> <p>Note that
     *         fields beginning with the at sign (@) are read-only and set by the web
     *         service. When you name fields, you should choose names containing only
     *         alpha-numeric values, as symbols may be reserved by AWS Data Pipeline.
     *         User-defined fields that you add to a pipeline should prefix their
     *         name with the string "my".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see OperatorType
     */
    public Operator withType(OperatorType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * The value that the actual field value will be compared with.
     *
     * @return The value that the actual field value will be compared with.
     */
    public java.util.List<String> getValues() {
        if (values == null) {
              values = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              values.setAutoConstruct(true);
        }
        return values;
    }
    
    /**
     * The value that the actual field value will be compared with.
     *
     * @param values The value that the actual field value will be compared with.
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> valuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(values.size());
        valuesCopy.addAll(values);
        this.values = valuesCopy;
    }
    
    /**
     * The value that the actual field value will be compared with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values The value that the actual field value will be compared with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Operator withValues(String... values) {
        if (getValues() == null) setValues(new java.util.ArrayList<String>(values.length));
        for (String value : values) {
            getValues().add(value);
        }
        return this;
    }
    
    /**
     * The value that the actual field value will be compared with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param values The value that the actual field value will be compared with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Operator withValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> valuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(values.size());
            valuesCopy.addAll(values);
            this.values = valuesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getValues() != null) sb.append("Values: " + getValues() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Operator == false) return false;
        Operator other = (Operator)obj;
        
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getValues() == null ^ this.getValues() == null) return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false) return false; 
        return true;
    }
    
}
    