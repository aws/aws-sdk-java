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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sets the number of <i>concurrent processes</i> that transfer OData records from your SAP instance. A concurrent
 * process is query that retrieves a batch of records as part of a flow run. Amazon AppFlow can run multiple concurrent
 * processes in parallel to transfer data faster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SAPODataParallelismConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SAPODataParallelismConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of processes that Amazon AppFlow runs at the same time when it retrieves your data from your
     * SAP application.
     * </p>
     */
    private Integer maxParallelism;

    /**
     * <p>
     * The maximum number of processes that Amazon AppFlow runs at the same time when it retrieves your data from your
     * SAP application.
     * </p>
     * 
     * @param maxParallelism
     *        The maximum number of processes that Amazon AppFlow runs at the same time when it retrieves your data from
     *        your SAP application.
     */

    public void setMaxParallelism(Integer maxParallelism) {
        this.maxParallelism = maxParallelism;
    }

    /**
     * <p>
     * The maximum number of processes that Amazon AppFlow runs at the same time when it retrieves your data from your
     * SAP application.
     * </p>
     * 
     * @return The maximum number of processes that Amazon AppFlow runs at the same time when it retrieves your data
     *         from your SAP application.
     */

    public Integer getMaxParallelism() {
        return this.maxParallelism;
    }

    /**
     * <p>
     * The maximum number of processes that Amazon AppFlow runs at the same time when it retrieves your data from your
     * SAP application.
     * </p>
     * 
     * @param maxParallelism
     *        The maximum number of processes that Amazon AppFlow runs at the same time when it retrieves your data from
     *        your SAP application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAPODataParallelismConfig withMaxParallelism(Integer maxParallelism) {
        setMaxParallelism(maxParallelism);
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
        if (getMaxParallelism() != null)
            sb.append("MaxParallelism: ").append(getMaxParallelism());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SAPODataParallelismConfig == false)
            return false;
        SAPODataParallelismConfig other = (SAPODataParallelismConfig) obj;
        if (other.getMaxParallelism() == null ^ this.getMaxParallelism() == null)
            return false;
        if (other.getMaxParallelism() != null && other.getMaxParallelism().equals(this.getMaxParallelism()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxParallelism() == null) ? 0 : getMaxParallelism().hashCode());
        return hashCode;
    }

    @Override
    public SAPODataParallelismConfig clone() {
        try {
            return (SAPODataParallelismConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.SAPODataParallelismConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
