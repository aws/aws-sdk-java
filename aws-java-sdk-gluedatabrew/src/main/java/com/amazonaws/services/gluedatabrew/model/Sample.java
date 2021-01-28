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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the sample size and sampling type for DataBrew to use for interactive data analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/Sample" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Sample implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of rows in the sample.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The way in which DataBrew obtains rows from a dataset.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The number of rows in the sample.
     * </p>
     * 
     * @param size
     *        The number of rows in the sample.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The number of rows in the sample.
     * </p>
     * 
     * @return The number of rows in the sample.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The number of rows in the sample.
     * </p>
     * 
     * @param size
     *        The number of rows in the sample.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sample withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The way in which DataBrew obtains rows from a dataset.
     * </p>
     * 
     * @param type
     *        The way in which DataBrew obtains rows from a dataset.
     * @see SampleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The way in which DataBrew obtains rows from a dataset.
     * </p>
     * 
     * @return The way in which DataBrew obtains rows from a dataset.
     * @see SampleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The way in which DataBrew obtains rows from a dataset.
     * </p>
     * 
     * @param type
     *        The way in which DataBrew obtains rows from a dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SampleType
     */

    public Sample withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The way in which DataBrew obtains rows from a dataset.
     * </p>
     * 
     * @param type
     *        The way in which DataBrew obtains rows from a dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SampleType
     */

    public Sample withType(SampleType type) {
        this.type = type.toString();
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
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Sample == false)
            return false;
        Sample other = (Sample) obj;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Sample clone() {
        try {
            return (Sample) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.SampleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
