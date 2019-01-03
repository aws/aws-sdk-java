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
 * Describes the inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/SqlApplicationConfigurationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqlApplicationConfigurationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The array of <a>InputDescription</a> objects describing the input streams used by the application.
     * </p>
     */
    private java.util.List<InputDescription> inputDescriptions;
    /**
     * <p>
     * The array of <a>OutputDescription</a> objects describing the destination streams used by the application.
     * </p>
     */
    private java.util.List<OutputDescription> outputDescriptions;
    /**
     * <p>
     * The array of <a>ReferenceDataSourceDescription</a> objects describing the reference data sources used by the
     * application.
     * </p>
     */
    private java.util.List<ReferenceDataSourceDescription> referenceDataSourceDescriptions;

    /**
     * <p>
     * The array of <a>InputDescription</a> objects describing the input streams used by the application.
     * </p>
     * 
     * @return The array of <a>InputDescription</a> objects describing the input streams used by the application.
     */

    public java.util.List<InputDescription> getInputDescriptions() {
        return inputDescriptions;
    }

    /**
     * <p>
     * The array of <a>InputDescription</a> objects describing the input streams used by the application.
     * </p>
     * 
     * @param inputDescriptions
     *        The array of <a>InputDescription</a> objects describing the input streams used by the application.
     */

    public void setInputDescriptions(java.util.Collection<InputDescription> inputDescriptions) {
        if (inputDescriptions == null) {
            this.inputDescriptions = null;
            return;
        }

        this.inputDescriptions = new java.util.ArrayList<InputDescription>(inputDescriptions);
    }

    /**
     * <p>
     * The array of <a>InputDescription</a> objects describing the input streams used by the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDescriptions(java.util.Collection)} or {@link #withInputDescriptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inputDescriptions
     *        The array of <a>InputDescription</a> objects describing the input streams used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfigurationDescription withInputDescriptions(InputDescription... inputDescriptions) {
        if (this.inputDescriptions == null) {
            setInputDescriptions(new java.util.ArrayList<InputDescription>(inputDescriptions.length));
        }
        for (InputDescription ele : inputDescriptions) {
            this.inputDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of <a>InputDescription</a> objects describing the input streams used by the application.
     * </p>
     * 
     * @param inputDescriptions
     *        The array of <a>InputDescription</a> objects describing the input streams used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfigurationDescription withInputDescriptions(java.util.Collection<InputDescription> inputDescriptions) {
        setInputDescriptions(inputDescriptions);
        return this;
    }

    /**
     * <p>
     * The array of <a>OutputDescription</a> objects describing the destination streams used by the application.
     * </p>
     * 
     * @return The array of <a>OutputDescription</a> objects describing the destination streams used by the application.
     */

    public java.util.List<OutputDescription> getOutputDescriptions() {
        return outputDescriptions;
    }

    /**
     * <p>
     * The array of <a>OutputDescription</a> objects describing the destination streams used by the application.
     * </p>
     * 
     * @param outputDescriptions
     *        The array of <a>OutputDescription</a> objects describing the destination streams used by the application.
     */

    public void setOutputDescriptions(java.util.Collection<OutputDescription> outputDescriptions) {
        if (outputDescriptions == null) {
            this.outputDescriptions = null;
            return;
        }

        this.outputDescriptions = new java.util.ArrayList<OutputDescription>(outputDescriptions);
    }

    /**
     * <p>
     * The array of <a>OutputDescription</a> objects describing the destination streams used by the application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputDescriptions(java.util.Collection)} or {@link #withOutputDescriptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param outputDescriptions
     *        The array of <a>OutputDescription</a> objects describing the destination streams used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfigurationDescription withOutputDescriptions(OutputDescription... outputDescriptions) {
        if (this.outputDescriptions == null) {
            setOutputDescriptions(new java.util.ArrayList<OutputDescription>(outputDescriptions.length));
        }
        for (OutputDescription ele : outputDescriptions) {
            this.outputDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of <a>OutputDescription</a> objects describing the destination streams used by the application.
     * </p>
     * 
     * @param outputDescriptions
     *        The array of <a>OutputDescription</a> objects describing the destination streams used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfigurationDescription withOutputDescriptions(java.util.Collection<OutputDescription> outputDescriptions) {
        setOutputDescriptions(outputDescriptions);
        return this;
    }

    /**
     * <p>
     * The array of <a>ReferenceDataSourceDescription</a> objects describing the reference data sources used by the
     * application.
     * </p>
     * 
     * @return The array of <a>ReferenceDataSourceDescription</a> objects describing the reference data sources used by
     *         the application.
     */

    public java.util.List<ReferenceDataSourceDescription> getReferenceDataSourceDescriptions() {
        return referenceDataSourceDescriptions;
    }

    /**
     * <p>
     * The array of <a>ReferenceDataSourceDescription</a> objects describing the reference data sources used by the
     * application.
     * </p>
     * 
     * @param referenceDataSourceDescriptions
     *        The array of <a>ReferenceDataSourceDescription</a> objects describing the reference data sources used by
     *        the application.
     */

    public void setReferenceDataSourceDescriptions(java.util.Collection<ReferenceDataSourceDescription> referenceDataSourceDescriptions) {
        if (referenceDataSourceDescriptions == null) {
            this.referenceDataSourceDescriptions = null;
            return;
        }

        this.referenceDataSourceDescriptions = new java.util.ArrayList<ReferenceDataSourceDescription>(referenceDataSourceDescriptions);
    }

    /**
     * <p>
     * The array of <a>ReferenceDataSourceDescription</a> objects describing the reference data sources used by the
     * application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferenceDataSourceDescriptions(java.util.Collection)} or
     * {@link #withReferenceDataSourceDescriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param referenceDataSourceDescriptions
     *        The array of <a>ReferenceDataSourceDescription</a> objects describing the reference data sources used by
     *        the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfigurationDescription withReferenceDataSourceDescriptions(ReferenceDataSourceDescription... referenceDataSourceDescriptions) {
        if (this.referenceDataSourceDescriptions == null) {
            setReferenceDataSourceDescriptions(new java.util.ArrayList<ReferenceDataSourceDescription>(referenceDataSourceDescriptions.length));
        }
        for (ReferenceDataSourceDescription ele : referenceDataSourceDescriptions) {
            this.referenceDataSourceDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of <a>ReferenceDataSourceDescription</a> objects describing the reference data sources used by the
     * application.
     * </p>
     * 
     * @param referenceDataSourceDescriptions
     *        The array of <a>ReferenceDataSourceDescription</a> objects describing the reference data sources used by
     *        the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlApplicationConfigurationDescription withReferenceDataSourceDescriptions(
            java.util.Collection<ReferenceDataSourceDescription> referenceDataSourceDescriptions) {
        setReferenceDataSourceDescriptions(referenceDataSourceDescriptions);
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
        if (getInputDescriptions() != null)
            sb.append("InputDescriptions: ").append(getInputDescriptions()).append(",");
        if (getOutputDescriptions() != null)
            sb.append("OutputDescriptions: ").append(getOutputDescriptions()).append(",");
        if (getReferenceDataSourceDescriptions() != null)
            sb.append("ReferenceDataSourceDescriptions: ").append(getReferenceDataSourceDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqlApplicationConfigurationDescription == false)
            return false;
        SqlApplicationConfigurationDescription other = (SqlApplicationConfigurationDescription) obj;
        if (other.getInputDescriptions() == null ^ this.getInputDescriptions() == null)
            return false;
        if (other.getInputDescriptions() != null && other.getInputDescriptions().equals(this.getInputDescriptions()) == false)
            return false;
        if (other.getOutputDescriptions() == null ^ this.getOutputDescriptions() == null)
            return false;
        if (other.getOutputDescriptions() != null && other.getOutputDescriptions().equals(this.getOutputDescriptions()) == false)
            return false;
        if (other.getReferenceDataSourceDescriptions() == null ^ this.getReferenceDataSourceDescriptions() == null)
            return false;
        if (other.getReferenceDataSourceDescriptions() != null
                && other.getReferenceDataSourceDescriptions().equals(this.getReferenceDataSourceDescriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputDescriptions() == null) ? 0 : getInputDescriptions().hashCode());
        hashCode = prime * hashCode + ((getOutputDescriptions() == null) ? 0 : getOutputDescriptions().hashCode());
        hashCode = prime * hashCode + ((getReferenceDataSourceDescriptions() == null) ? 0 : getReferenceDataSourceDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public SqlApplicationConfigurationDescription clone() {
        try {
            return (SqlApplicationConfigurationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.SqlApplicationConfigurationDescriptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
