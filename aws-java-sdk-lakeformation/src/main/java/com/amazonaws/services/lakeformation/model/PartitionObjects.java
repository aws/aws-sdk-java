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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing a list of partition values and table objects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/PartitionObjects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PartitionObjects implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of partition values.
     * </p>
     */
    private java.util.List<String> partitionValues;
    /**
     * <p>
     * A list of table objects
     * </p>
     */
    private java.util.List<TableObject> objects;

    /**
     * <p>
     * A list of partition values.
     * </p>
     * 
     * @return A list of partition values.
     */

    public java.util.List<String> getPartitionValues() {
        return partitionValues;
    }

    /**
     * <p>
     * A list of partition values.
     * </p>
     * 
     * @param partitionValues
     *        A list of partition values.
     */

    public void setPartitionValues(java.util.Collection<String> partitionValues) {
        if (partitionValues == null) {
            this.partitionValues = null;
            return;
        }

        this.partitionValues = new java.util.ArrayList<String>(partitionValues);
    }

    /**
     * <p>
     * A list of partition values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionValues(java.util.Collection)} or {@link #withPartitionValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param partitionValues
     *        A list of partition values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartitionObjects withPartitionValues(String... partitionValues) {
        if (this.partitionValues == null) {
            setPartitionValues(new java.util.ArrayList<String>(partitionValues.length));
        }
        for (String ele : partitionValues) {
            this.partitionValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of partition values.
     * </p>
     * 
     * @param partitionValues
     *        A list of partition values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartitionObjects withPartitionValues(java.util.Collection<String> partitionValues) {
        setPartitionValues(partitionValues);
        return this;
    }

    /**
     * <p>
     * A list of table objects
     * </p>
     * 
     * @return A list of table objects
     */

    public java.util.List<TableObject> getObjects() {
        return objects;
    }

    /**
     * <p>
     * A list of table objects
     * </p>
     * 
     * @param objects
     *        A list of table objects
     */

    public void setObjects(java.util.Collection<TableObject> objects) {
        if (objects == null) {
            this.objects = null;
            return;
        }

        this.objects = new java.util.ArrayList<TableObject>(objects);
    }

    /**
     * <p>
     * A list of table objects
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjects(java.util.Collection)} or {@link #withObjects(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param objects
     *        A list of table objects
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartitionObjects withObjects(TableObject... objects) {
        if (this.objects == null) {
            setObjects(new java.util.ArrayList<TableObject>(objects.length));
        }
        for (TableObject ele : objects) {
            this.objects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of table objects
     * </p>
     * 
     * @param objects
     *        A list of table objects
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartitionObjects withObjects(java.util.Collection<TableObject> objects) {
        setObjects(objects);
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
        if (getPartitionValues() != null)
            sb.append("PartitionValues: ").append(getPartitionValues()).append(",");
        if (getObjects() != null)
            sb.append("Objects: ").append(getObjects());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PartitionObjects == false)
            return false;
        PartitionObjects other = (PartitionObjects) obj;
        if (other.getPartitionValues() == null ^ this.getPartitionValues() == null)
            return false;
        if (other.getPartitionValues() != null && other.getPartitionValues().equals(this.getPartitionValues()) == false)
            return false;
        if (other.getObjects() == null ^ this.getObjects() == null)
            return false;
        if (other.getObjects() != null && other.getObjects().equals(this.getObjects()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartitionValues() == null) ? 0 : getPartitionValues().hashCode());
        hashCode = prime * hashCode + ((getObjects() == null) ? 0 : getObjects().hashCode());
        return hashCode;
    }

    @Override
    public PartitionObjects clone() {
        try {
            return (PartitionObjects) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.PartitionObjectsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
