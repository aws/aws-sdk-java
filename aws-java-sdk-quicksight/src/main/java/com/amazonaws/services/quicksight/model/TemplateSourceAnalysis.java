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
 * The source analysis of the template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TemplateSourceAnalysis" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateSourceAnalysis implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A structure containing information about the dataset references used as placeholders in the template.
     * </p>
     */
    private java.util.List<DataSetReference> dataSetReferences;

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

    public TemplateSourceAnalysis withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A structure containing information about the dataset references used as placeholders in the template.
     * </p>
     * 
     * @return A structure containing information about the dataset references used as placeholders in the template.
     */

    public java.util.List<DataSetReference> getDataSetReferences() {
        return dataSetReferences;
    }

    /**
     * <p>
     * A structure containing information about the dataset references used as placeholders in the template.
     * </p>
     * 
     * @param dataSetReferences
     *        A structure containing information about the dataset references used as placeholders in the template.
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
     * A structure containing information about the dataset references used as placeholders in the template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSetReferences(java.util.Collection)} or {@link #withDataSetReferences(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dataSetReferences
     *        A structure containing information about the dataset references used as placeholders in the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSourceAnalysis withDataSetReferences(DataSetReference... dataSetReferences) {
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
     * A structure containing information about the dataset references used as placeholders in the template.
     * </p>
     * 
     * @param dataSetReferences
     *        A structure containing information about the dataset references used as placeholders in the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSourceAnalysis withDataSetReferences(java.util.Collection<DataSetReference> dataSetReferences) {
        setDataSetReferences(dataSetReferences);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDataSetReferences() != null)
            sb.append("DataSetReferences: ").append(getDataSetReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateSourceAnalysis == false)
            return false;
        TemplateSourceAnalysis other = (TemplateSourceAnalysis) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDataSetReferences() == null ^ this.getDataSetReferences() == null)
            return false;
        if (other.getDataSetReferences() != null && other.getDataSetReferences().equals(this.getDataSetReferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDataSetReferences() == null) ? 0 : getDataSetReferences().hashCode());
        return hashCode;
    }

    @Override
    public TemplateSourceAnalysis clone() {
        try {
            return (TemplateSourceAnalysis) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TemplateSourceAnalysisMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
