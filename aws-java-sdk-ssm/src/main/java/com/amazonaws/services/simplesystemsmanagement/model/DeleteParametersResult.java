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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteParametersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the deleted parameters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> deletedParameters;
    /**
     * <p>
     * The names of parameters that weren't deleted because the parameters are not valid.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> invalidParameters;

    /**
     * <p>
     * The names of the deleted parameters.
     * </p>
     * 
     * @return The names of the deleted parameters.
     */

    public java.util.List<String> getDeletedParameters() {
        if (deletedParameters == null) {
            deletedParameters = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return deletedParameters;
    }

    /**
     * <p>
     * The names of the deleted parameters.
     * </p>
     * 
     * @param deletedParameters
     *        The names of the deleted parameters.
     */

    public void setDeletedParameters(java.util.Collection<String> deletedParameters) {
        if (deletedParameters == null) {
            this.deletedParameters = null;
            return;
        }

        this.deletedParameters = new com.amazonaws.internal.SdkInternalList<String>(deletedParameters);
    }

    /**
     * <p>
     * The names of the deleted parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeletedParameters(java.util.Collection)} or {@link #withDeletedParameters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param deletedParameters
     *        The names of the deleted parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteParametersResult withDeletedParameters(String... deletedParameters) {
        if (this.deletedParameters == null) {
            setDeletedParameters(new com.amazonaws.internal.SdkInternalList<String>(deletedParameters.length));
        }
        for (String ele : deletedParameters) {
            this.deletedParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the deleted parameters.
     * </p>
     * 
     * @param deletedParameters
     *        The names of the deleted parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteParametersResult withDeletedParameters(java.util.Collection<String> deletedParameters) {
        setDeletedParameters(deletedParameters);
        return this;
    }

    /**
     * <p>
     * The names of parameters that weren't deleted because the parameters are not valid.
     * </p>
     * 
     * @return The names of parameters that weren't deleted because the parameters are not valid.
     */

    public java.util.List<String> getInvalidParameters() {
        if (invalidParameters == null) {
            invalidParameters = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return invalidParameters;
    }

    /**
     * <p>
     * The names of parameters that weren't deleted because the parameters are not valid.
     * </p>
     * 
     * @param invalidParameters
     *        The names of parameters that weren't deleted because the parameters are not valid.
     */

    public void setInvalidParameters(java.util.Collection<String> invalidParameters) {
        if (invalidParameters == null) {
            this.invalidParameters = null;
            return;
        }

        this.invalidParameters = new com.amazonaws.internal.SdkInternalList<String>(invalidParameters);
    }

    /**
     * <p>
     * The names of parameters that weren't deleted because the parameters are not valid.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvalidParameters(java.util.Collection)} or {@link #withInvalidParameters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param invalidParameters
     *        The names of parameters that weren't deleted because the parameters are not valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteParametersResult withInvalidParameters(String... invalidParameters) {
        if (this.invalidParameters == null) {
            setInvalidParameters(new com.amazonaws.internal.SdkInternalList<String>(invalidParameters.length));
        }
        for (String ele : invalidParameters) {
            this.invalidParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of parameters that weren't deleted because the parameters are not valid.
     * </p>
     * 
     * @param invalidParameters
     *        The names of parameters that weren't deleted because the parameters are not valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteParametersResult withInvalidParameters(java.util.Collection<String> invalidParameters) {
        setInvalidParameters(invalidParameters);
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
        if (getDeletedParameters() != null)
            sb.append("DeletedParameters: ").append(getDeletedParameters()).append(",");
        if (getInvalidParameters() != null)
            sb.append("InvalidParameters: ").append(getInvalidParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteParametersResult == false)
            return false;
        DeleteParametersResult other = (DeleteParametersResult) obj;
        if (other.getDeletedParameters() == null ^ this.getDeletedParameters() == null)
            return false;
        if (other.getDeletedParameters() != null && other.getDeletedParameters().equals(this.getDeletedParameters()) == false)
            return false;
        if (other.getInvalidParameters() == null ^ this.getInvalidParameters() == null)
            return false;
        if (other.getInvalidParameters() != null && other.getInvalidParameters().equals(this.getInvalidParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeletedParameters() == null) ? 0 : getDeletedParameters().hashCode());
        hashCode = prime * hashCode + ((getInvalidParameters() == null) ? 0 : getInvalidParameters().hashCode());
        return hashCode;
    }

    @Override
    public DeleteParametersResult clone() {
        try {
            return (DeleteParametersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
