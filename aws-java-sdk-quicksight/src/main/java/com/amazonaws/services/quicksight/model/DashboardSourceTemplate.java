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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Dashboard source template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DashboardSourceTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashboardSourceTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Dataset references.
     * </p>
     */
    private java.util.List<DataSetReference> dataSetReferences;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * Dataset references.
     * </p>
     * 
     * @return Dataset references.
     */

    public java.util.List<DataSetReference> getDataSetReferences() {
        return dataSetReferences;
    }

    /**
     * <p>
     * Dataset references.
     * </p>
     * 
     * @param dataSetReferences
     *        Dataset references.
     */

    public void setDataSetReferences(java.util.Collection<DataSetReference> dataSetReferences) {
        if (dataSetReferences == null) {
            this.dataSetReferences = null;
            return;
        }

        this.dataSetReferences = new java.util.ArrayList<DataSetReference>(dataSetReferences);
    }

    /**
     * <p>
     * Dataset references.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSetReferences(java.util.Collection)} or {@link #withDataSetReferences(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dataSetReferences
     *        Dataset references.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardSourceTemplate withDataSetReferences(DataSetReference... dataSetReferences) {
        if (this.dataSetReferences == null) {
            setDataSetReferences(new java.util.ArrayList<DataSetReference>(dataSetReferences.length));
        }
        for (DataSetReference ele : dataSetReferences) {
            this.dataSetReferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Dataset references.
     * </p>
     * 
     * @param dataSetReferences
     *        Dataset references.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardSourceTemplate withDataSetReferences(java.util.Collection<DataSetReference> dataSetReferences) {
        setDataSetReferences(dataSetReferences);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardSourceTemplate withArn(String arn) {
        setArn(arn);
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
        if (getDataSetReferences() != null)
            sb.append("DataSetReferences: ").append(getDataSetReferences()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashboardSourceTemplate == false)
            return false;
        DashboardSourceTemplate other = (DashboardSourceTemplate) obj;
        if (other.getDataSetReferences() == null ^ this.getDataSetReferences() == null)
            return false;
        if (other.getDataSetReferences() != null && other.getDataSetReferences().equals(this.getDataSetReferences()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetReferences() == null) ? 0 : getDataSetReferences().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public DashboardSourceTemplate clone() {
        try {
            return (DashboardSourceTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DashboardSourceTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
