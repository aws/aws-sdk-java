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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeactivateEvaluationForm" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeactivateEvaluationFormResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     */
    private String evaluationFormId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     */
    private String evaluationFormArn;
    /**
     * <p>
     * The version of the deactivated evaluation form resource.
     * </p>
     */
    private Integer evaluationFormVersion;

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * 
     * @param evaluationFormId
     *        The unique identifier for the evaluation form.
     */

    public void setEvaluationFormId(String evaluationFormId) {
        this.evaluationFormId = evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * 
     * @return The unique identifier for the evaluation form.
     */

    public String getEvaluationFormId() {
        return this.evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * 
     * @param evaluationFormId
     *        The unique identifier for the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeactivateEvaluationFormResult withEvaluationFormId(String evaluationFormId) {
        setEvaluationFormId(evaluationFormId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     * 
     * @param evaluationFormArn
     *        The Amazon Resource Name (ARN) for the evaluation form resource.
     */

    public void setEvaluationFormArn(String evaluationFormArn) {
        this.evaluationFormArn = evaluationFormArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the evaluation form resource.
     */

    public String getEvaluationFormArn() {
        return this.evaluationFormArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     * 
     * @param evaluationFormArn
     *        The Amazon Resource Name (ARN) for the evaluation form resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeactivateEvaluationFormResult withEvaluationFormArn(String evaluationFormArn) {
        setEvaluationFormArn(evaluationFormArn);
        return this;
    }

    /**
     * <p>
     * The version of the deactivated evaluation form resource.
     * </p>
     * 
     * @param evaluationFormVersion
     *        The version of the deactivated evaluation form resource.
     */

    public void setEvaluationFormVersion(Integer evaluationFormVersion) {
        this.evaluationFormVersion = evaluationFormVersion;
    }

    /**
     * <p>
     * The version of the deactivated evaluation form resource.
     * </p>
     * 
     * @return The version of the deactivated evaluation form resource.
     */

    public Integer getEvaluationFormVersion() {
        return this.evaluationFormVersion;
    }

    /**
     * <p>
     * The version of the deactivated evaluation form resource.
     * </p>
     * 
     * @param evaluationFormVersion
     *        The version of the deactivated evaluation form resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeactivateEvaluationFormResult withEvaluationFormVersion(Integer evaluationFormVersion) {
        setEvaluationFormVersion(evaluationFormVersion);
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
        if (getEvaluationFormId() != null)
            sb.append("EvaluationFormId: ").append(getEvaluationFormId()).append(",");
        if (getEvaluationFormArn() != null)
            sb.append("EvaluationFormArn: ").append(getEvaluationFormArn()).append(",");
        if (getEvaluationFormVersion() != null)
            sb.append("EvaluationFormVersion: ").append(getEvaluationFormVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeactivateEvaluationFormResult == false)
            return false;
        DeactivateEvaluationFormResult other = (DeactivateEvaluationFormResult) obj;
        if (other.getEvaluationFormId() == null ^ this.getEvaluationFormId() == null)
            return false;
        if (other.getEvaluationFormId() != null && other.getEvaluationFormId().equals(this.getEvaluationFormId()) == false)
            return false;
        if (other.getEvaluationFormArn() == null ^ this.getEvaluationFormArn() == null)
            return false;
        if (other.getEvaluationFormArn() != null && other.getEvaluationFormArn().equals(this.getEvaluationFormArn()) == false)
            return false;
        if (other.getEvaluationFormVersion() == null ^ this.getEvaluationFormVersion() == null)
            return false;
        if (other.getEvaluationFormVersion() != null && other.getEvaluationFormVersion().equals(this.getEvaluationFormVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationFormId() == null) ? 0 : getEvaluationFormId().hashCode());
        hashCode = prime * hashCode + ((getEvaluationFormArn() == null) ? 0 : getEvaluationFormArn().hashCode());
        hashCode = prime * hashCode + ((getEvaluationFormVersion() == null) ? 0 : getEvaluationFormVersion().hashCode());
        return hashCode;
    }

    @Override
    public DeactivateEvaluationFormResult clone() {
        try {
            return (DeactivateEvaluationFormResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
