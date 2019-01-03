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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddApplicationOutputResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     */
    private String applicationARN;
    /**
     * <p>
     * The updated application version ID. Kinesis Data Analytics increments this ID when the application is updated.
     * </p>
     */
    private Long applicationVersionId;
    /**
     * <p>
     * Describes the application output configuration. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring Application
     * Output</a>.
     * </p>
     */
    private java.util.List<OutputDescription> outputDescriptions;

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     * 
     * @param applicationARN
     *        The application Amazon Resource Name (ARN).
     */

    public void setApplicationARN(String applicationARN) {
        this.applicationARN = applicationARN;
    }

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The application Amazon Resource Name (ARN).
     */

    public String getApplicationARN() {
        return this.applicationARN;
    }

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     * 
     * @param applicationARN
     *        The application Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationOutputResult withApplicationARN(String applicationARN) {
        setApplicationARN(applicationARN);
        return this;
    }

    /**
     * <p>
     * The updated application version ID. Kinesis Data Analytics increments this ID when the application is updated.
     * </p>
     * 
     * @param applicationVersionId
     *        The updated application version ID. Kinesis Data Analytics increments this ID when the application is
     *        updated.
     */

    public void setApplicationVersionId(Long applicationVersionId) {
        this.applicationVersionId = applicationVersionId;
    }

    /**
     * <p>
     * The updated application version ID. Kinesis Data Analytics increments this ID when the application is updated.
     * </p>
     * 
     * @return The updated application version ID. Kinesis Data Analytics increments this ID when the application is
     *         updated.
     */

    public Long getApplicationVersionId() {
        return this.applicationVersionId;
    }

    /**
     * <p>
     * The updated application version ID. Kinesis Data Analytics increments this ID when the application is updated.
     * </p>
     * 
     * @param applicationVersionId
     *        The updated application version ID. Kinesis Data Analytics increments this ID when the application is
     *        updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationOutputResult withApplicationVersionId(Long applicationVersionId) {
        setApplicationVersionId(applicationVersionId);
        return this;
    }

    /**
     * <p>
     * Describes the application output configuration. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring Application
     * Output</a>.
     * </p>
     * 
     * @return Describes the application output configuration. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring
     *         Application Output</a>.
     */

    public java.util.List<OutputDescription> getOutputDescriptions() {
        return outputDescriptions;
    }

    /**
     * <p>
     * Describes the application output configuration. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring Application
     * Output</a>.
     * </p>
     * 
     * @param outputDescriptions
     *        Describes the application output configuration. For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring
     *        Application Output</a>.
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
     * Describes the application output configuration. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring Application
     * Output</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputDescriptions(java.util.Collection)} or {@link #withOutputDescriptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param outputDescriptions
     *        Describes the application output configuration. For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring
     *        Application Output</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationOutputResult withOutputDescriptions(OutputDescription... outputDescriptions) {
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
     * Describes the application output configuration. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring Application
     * Output</a>.
     * </p>
     * 
     * @param outputDescriptions
     *        Describes the application output configuration. For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Configuring
     *        Application Output</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationOutputResult withOutputDescriptions(java.util.Collection<OutputDescription> outputDescriptions) {
        setOutputDescriptions(outputDescriptions);
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
        if (getApplicationARN() != null)
            sb.append("ApplicationARN: ").append(getApplicationARN()).append(",");
        if (getApplicationVersionId() != null)
            sb.append("ApplicationVersionId: ").append(getApplicationVersionId()).append(",");
        if (getOutputDescriptions() != null)
            sb.append("OutputDescriptions: ").append(getOutputDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddApplicationOutputResult == false)
            return false;
        AddApplicationOutputResult other = (AddApplicationOutputResult) obj;
        if (other.getApplicationARN() == null ^ this.getApplicationARN() == null)
            return false;
        if (other.getApplicationARN() != null && other.getApplicationARN().equals(this.getApplicationARN()) == false)
            return false;
        if (other.getApplicationVersionId() == null ^ this.getApplicationVersionId() == null)
            return false;
        if (other.getApplicationVersionId() != null && other.getApplicationVersionId().equals(this.getApplicationVersionId()) == false)
            return false;
        if (other.getOutputDescriptions() == null ^ this.getOutputDescriptions() == null)
            return false;
        if (other.getOutputDescriptions() != null && other.getOutputDescriptions().equals(this.getOutputDescriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationARN() == null) ? 0 : getApplicationARN().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersionId() == null) ? 0 : getApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getOutputDescriptions() == null) ? 0 : getOutputDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public AddApplicationOutputResult clone() {
        try {
            return (AddApplicationOutputResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
