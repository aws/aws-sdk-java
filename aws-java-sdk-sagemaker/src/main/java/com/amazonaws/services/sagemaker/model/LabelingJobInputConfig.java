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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Input configuration information for a labeling job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LabelingJobInputConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelingJobInputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location of the input data.
     * </p>
     */
    private LabelingJobDataSource dataSource;
    /**
     * <p>
     * Attributes of the data specified by the customer.
     * </p>
     */
    private LabelingJobDataAttributes dataAttributes;

    /**
     * <p>
     * The location of the input data.
     * </p>
     * 
     * @param dataSource
     *        The location of the input data.
     */

    public void setDataSource(LabelingJobDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The location of the input data.
     * </p>
     * 
     * @return The location of the input data.
     */

    public LabelingJobDataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The location of the input data.
     * </p>
     * 
     * @param dataSource
     *        The location of the input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobInputConfig withDataSource(LabelingJobDataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * Attributes of the data specified by the customer.
     * </p>
     * 
     * @param dataAttributes
     *        Attributes of the data specified by the customer.
     */

    public void setDataAttributes(LabelingJobDataAttributes dataAttributes) {
        this.dataAttributes = dataAttributes;
    }

    /**
     * <p>
     * Attributes of the data specified by the customer.
     * </p>
     * 
     * @return Attributes of the data specified by the customer.
     */

    public LabelingJobDataAttributes getDataAttributes() {
        return this.dataAttributes;
    }

    /**
     * <p>
     * Attributes of the data specified by the customer.
     * </p>
     * 
     * @param dataAttributes
     *        Attributes of the data specified by the customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobInputConfig withDataAttributes(LabelingJobDataAttributes dataAttributes) {
        setDataAttributes(dataAttributes);
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getDataAttributes() != null)
            sb.append("DataAttributes: ").append(getDataAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobInputConfig == false)
            return false;
        LabelingJobInputConfig other = (LabelingJobInputConfig) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getDataAttributes() == null ^ this.getDataAttributes() == null)
            return false;
        if (other.getDataAttributes() != null && other.getDataAttributes().equals(this.getDataAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getDataAttributes() == null) ? 0 : getDataAttributes().hashCode());
        return hashCode;
    }

    @Override
    public LabelingJobInputConfig clone() {
        try {
            return (LabelingJobInputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LabelingJobInputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
