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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes updates to the input streams, destination streams, and reference data sources for an SQL-based Kinesis Data
 * Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/SqlApplicationConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqlApplicationConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The array of <a>InputUpdate</a> objects describing the new input streams used by the application.
     * </p>
     */
    private java.util.List<InputUpdate> inputUpdates;
    /**
     * <p>
     * The array of <a>OutputUpdate</a> objects describing the new destination streams used by the application.
     * </p>
     */
    private java.util.List<OutputUpdate> outputUpdates;
    /**
     * <p>
     * The array of <a>ReferenceDataSourceUpdate</a> objects describing the new reference data sources used by the
     * application.
     * </p>
     */
    private java.util.List<ReferenceDataSourceUpdate> referenceDataSourceUpdates;

    /**
     * <p>
     * The array of <a>InputUpdate</a> objects describing the new input streams used by the application.
     * </p>
     * 
     * @return The array of <a>InputUpdate</a> objects describing the new input streams used by the application.
     */

    public java.util.List<InputUpdate> getInputUpdates() {
        return inputUpdates;
    }

    /**
     * <p>
     * The array of <a>InputUpdate</a> objects describing the new input streams used by the application.
     * </p>
     * 
     * @param inputUpdates
     *        The array of <a>InputUpdate</a> objects describing the new input streams used by the application.
     */

    public void setInputUpdates(java.util.Collection<InputUpdate> inputUpdates) {
        if (inputUpdates == null) {
            this.inputUpdates = null;
            return;
        }

        this.inputUpdates = new java.util.ArrayList<InputUpdate>(inputUpdates);
    }

    /**
     * <p>
     * The array of <a>InputUpdate</a> objects describing the new input streams used by the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputUpdates(java.util.Collection)} or {@link #withInputUpdates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param inputUpdates
     *        The array of <a>InputUpdate</a> objects describing the new input streams used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfigurationUpdate withInputUpdates(InputUpdate... inputUpdates) {
        if (this.inputUpdates == null) {
            setInputUpdates(new java.util.ArrayList<InputUpdate>(inputUpdates.length));
        }
        for (InputUpdate ele : inputUpdates) {
            this.inputUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of <a>InputUpdate</a> objects describing the new input streams used by the application.
     * </p>
     * 
     * @param inputUpdates
     *        The array of <a>InputUpdate</a> objects describing the new input streams used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfigurationUpdate withInputUpdates(java.util.Collection<InputUpdate> inputUpdates) {
        setInputUpdates(inputUpdates);
        return this;
    }

    /**
     * <p>
     * The array of <a>OutputUpdate</a> objects describing the new destination streams used by the application.
     * </p>
     * 
     * @return The array of <a>OutputUpdate</a> objects describing the new destination streams used by the application.
     */

    public java.util.List<OutputUpdate> getOutputUpdates() {
        return outputUpdates;
    }

    /**
     * <p>
     * The array of <a>OutputUpdate</a> objects describing the new destination streams used by the application.
     * </p>
     * 
     * @param outputUpdates
     *        The array of <a>OutputUpdate</a> objects describing the new destination streams used by the application.
     */

    public void setOutputUpdates(java.util.Collection<OutputUpdate> outputUpdates) {
        if (outputUpdates == null) {
            this.outputUpdates = null;
            return;
        }

        this.outputUpdates = new java.util.ArrayList<OutputUpdate>(outputUpdates);
    }

    /**
     * <p>
     * The array of <a>OutputUpdate</a> objects describing the new destination streams used by the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputUpdates(java.util.Collection)} or {@link #withOutputUpdates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputUpdates
     *        The array of <a>OutputUpdate</a> objects describing the new destination streams used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfigurationUpdate withOutputUpdates(OutputUpdate... outputUpdates) {
        if (this.outputUpdates == null) {
            setOutputUpdates(new java.util.ArrayList<OutputUpdate>(outputUpdates.length));
        }
        for (OutputUpdate ele : outputUpdates) {
            this.outputUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of <a>OutputUpdate</a> objects describing the new destination streams used by the application.
     * </p>
     * 
     * @param outputUpdates
     *        The array of <a>OutputUpdate</a> objects describing the new destination streams used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfigurationUpdate withOutputUpdates(java.util.Collection<OutputUpdate> outputUpdates) {
        setOutputUpdates(outputUpdates);
        return this;
    }

    /**
     * <p>
     * The array of <a>ReferenceDataSourceUpdate</a> objects describing the new reference data sources used by the
     * application.
     * </p>
     * 
     * @return The array of <a>ReferenceDataSourceUpdate</a> objects describing the new reference data sources used by
     *         the application.
     */

    public java.util.List<ReferenceDataSourceUpdate> getReferenceDataSourceUpdates() {
        return referenceDataSourceUpdates;
    }

    /**
     * <p>
     * The array of <a>ReferenceDataSourceUpdate</a> objects describing the new reference data sources used by the
     * application.
     * </p>
     * 
     * @param referenceDataSourceUpdates
     *        The array of <a>ReferenceDataSourceUpdate</a> objects describing the new reference data sources used by
     *        the application.
     */

    public void setReferenceDataSourceUpdates(java.util.Collection<ReferenceDataSourceUpdate> referenceDataSourceUpdates) {
        if (referenceDataSourceUpdates == null) {
            this.referenceDataSourceUpdates = null;
            return;
        }

        this.referenceDataSourceUpdates = new java.util.ArrayList<ReferenceDataSourceUpdate>(referenceDataSourceUpdates);
    }

    /**
     * <p>
     * The array of <a>ReferenceDataSourceUpdate</a> objects describing the new reference data sources used by the
     * application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferenceDataSourceUpdates(java.util.Collection)} or
     * {@link #withReferenceDataSourceUpdates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param referenceDataSourceUpdates
     *        The array of <a>ReferenceDataSourceUpdate</a> objects describing the new reference data sources used by
     *        the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfigurationUpdate withReferenceDataSourceUpdates(ReferenceDataSourceUpdate... referenceDataSourceUpdates) {
        if (this.referenceDataSourceUpdates == null) {
            setReferenceDataSourceUpdates(new java.util.ArrayList<ReferenceDataSourceUpdate>(referenceDataSourceUpdates.length));
        }
        for (ReferenceDataSourceUpdate ele : referenceDataSourceUpdates) {
            this.referenceDataSourceUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of <a>ReferenceDataSourceUpdate</a> objects describing the new reference data sources used by the
     * application.
     * </p>
     * 
     * @param referenceDataSourceUpdates
     *        The array of <a>ReferenceDataSourceUpdate</a> objects describing the new reference data sources used by
     *        the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfigurationUpdate withReferenceDataSourceUpdates(java.util.Collection<ReferenceDataSourceUpdate> referenceDataSourceUpdates) {
        setReferenceDataSourceUpdates(referenceDataSourceUpdates);
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
        if (getInputUpdates() != null)
            sb.append("InputUpdates: ").append(getInputUpdates()).append(",");
        if (getOutputUpdates() != null)
            sb.append("OutputUpdates: ").append(getOutputUpdates()).append(",");
        if (getReferenceDataSourceUpdates() != null)
            sb.append("ReferenceDataSourceUpdates: ").append(getReferenceDataSourceUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqlApplicationConfigurationUpdate == false)
            return false;
        SqlApplicationConfigurationUpdate other = (SqlApplicationConfigurationUpdate) obj;
        if (other.getInputUpdates() == null ^ this.getInputUpdates() == null)
            return false;
        if (other.getInputUpdates() != null && other.getInputUpdates().equals(this.getInputUpdates()) == false)
            return false;
        if (other.getOutputUpdates() == null ^ this.getOutputUpdates() == null)
            return false;
        if (other.getOutputUpdates() != null && other.getOutputUpdates().equals(this.getOutputUpdates()) == false)
            return false;
        if (other.getReferenceDataSourceUpdates() == null ^ this.getReferenceDataSourceUpdates() == null)
            return false;
        if (other.getReferenceDataSourceUpdates() != null && other.getReferenceDataSourceUpdates().equals(this.getReferenceDataSourceUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputUpdates() == null) ? 0 : getInputUpdates().hashCode());
        hashCode = prime * hashCode + ((getOutputUpdates() == null) ? 0 : getOutputUpdates().hashCode());
        hashCode = prime * hashCode + ((getReferenceDataSourceUpdates() == null) ? 0 : getReferenceDataSourceUpdates().hashCode());
        return hashCode;
    }

    @Override
    public SqlApplicationConfigurationUpdate clone() {
        try {
            return (SqlApplicationConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.SqlApplicationConfigurationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
