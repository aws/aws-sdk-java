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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddApplicationInputResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     */
    private String applicationARN;
    /**
     * <p>
     * Provides the current application version.
     * </p>
     */
    private Long applicationVersionId;
    /**
     * <p>
     * Describes the application input configuration.
     * </p>
     */
    private java.util.List<InputDescription> inputDescriptions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationARN
     *        The Amazon Resource Name (ARN) of the application.
     */

    public void setApplicationARN(String applicationARN) {
        this.applicationARN = applicationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application.
     */

    public String getApplicationARN() {
        return this.applicationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationARN
     *        The Amazon Resource Name (ARN) of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationInputResult withApplicationARN(String applicationARN) {
        setApplicationARN(applicationARN);
        return this;
    }

    /**
     * <p>
     * Provides the current application version.
     * </p>
     * 
     * @param applicationVersionId
     *        Provides the current application version.
     */

    public void setApplicationVersionId(Long applicationVersionId) {
        this.applicationVersionId = applicationVersionId;
    }

    /**
     * <p>
     * Provides the current application version.
     * </p>
     * 
     * @return Provides the current application version.
     */

    public Long getApplicationVersionId() {
        return this.applicationVersionId;
    }

    /**
     * <p>
     * Provides the current application version.
     * </p>
     * 
     * @param applicationVersionId
     *        Provides the current application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationInputResult withApplicationVersionId(Long applicationVersionId) {
        setApplicationVersionId(applicationVersionId);
        return this;
    }

    /**
     * <p>
     * Describes the application input configuration.
     * </p>
     * 
     * @return Describes the application input configuration.
     */

    public java.util.List<InputDescription> getInputDescriptions() {
        return inputDescriptions;
    }

    /**
     * <p>
     * Describes the application input configuration.
     * </p>
     * 
     * @param inputDescriptions
     *        Describes the application input configuration.
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
     * Describes the application input configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDescriptions(java.util.Collection)} or {@link #withInputDescriptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inputDescriptions
     *        Describes the application input configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationInputResult withInputDescriptions(InputDescription... inputDescriptions) {
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
     * Describes the application input configuration.
     * </p>
     * 
     * @param inputDescriptions
     *        Describes the application input configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationInputResult withInputDescriptions(java.util.Collection<InputDescription> inputDescriptions) {
        setInputDescriptions(inputDescriptions);
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
        if (getInputDescriptions() != null)
            sb.append("InputDescriptions: ").append(getInputDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddApplicationInputResult == false)
            return false;
        AddApplicationInputResult other = (AddApplicationInputResult) obj;
        if (other.getApplicationARN() == null ^ this.getApplicationARN() == null)
            return false;
        if (other.getApplicationARN() != null && other.getApplicationARN().equals(this.getApplicationARN()) == false)
            return false;
        if (other.getApplicationVersionId() == null ^ this.getApplicationVersionId() == null)
            return false;
        if (other.getApplicationVersionId() != null && other.getApplicationVersionId().equals(this.getApplicationVersionId()) == false)
            return false;
        if (other.getInputDescriptions() == null ^ this.getInputDescriptions() == null)
            return false;
        if (other.getInputDescriptions() != null && other.getInputDescriptions().equals(this.getInputDescriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationARN() == null) ? 0 : getApplicationARN().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersionId() == null) ? 0 : getApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getInputDescriptions() == null) ? 0 : getInputDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public AddApplicationInputResult clone() {
        try {
            return (AddApplicationInputResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
