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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an asynchronous update.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/Update" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Update implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A UUID that is used to track the update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The current status of the update.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of the update.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A key-value map that contains the parameters associated with the update.
     * </p>
     */
    private java.util.List<UpdateParam> params;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the update was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Any errors associated with a <code>Failed</code> update.
     * </p>
     */
    private java.util.List<ErrorDetail> errors;

    /**
     * <p>
     * A UUID that is used to track the update.
     * </p>
     * 
     * @param id
     *        A UUID that is used to track the update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A UUID that is used to track the update.
     * </p>
     * 
     * @return A UUID that is used to track the update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A UUID that is used to track the update.
     * </p>
     * 
     * @param id
     *        A UUID that is used to track the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The current status of the update.
     * </p>
     * 
     * @param status
     *        The current status of the update.
     * @see UpdateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the update.
     * </p>
     * 
     * @return The current status of the update.
     * @see UpdateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the update.
     * </p>
     * 
     * @param status
     *        The current status of the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateStatus
     */

    public Update withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the update.
     * </p>
     * 
     * @param status
     *        The current status of the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateStatus
     */

    public Update withStatus(UpdateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of the update.
     * </p>
     * 
     * @param type
     *        The type of the update.
     * @see UpdateType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the update.
     * </p>
     * 
     * @return The type of the update.
     * @see UpdateType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the update.
     * </p>
     * 
     * @param type
     *        The type of the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateType
     */

    public Update withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the update.
     * </p>
     * 
     * @param type
     *        The type of the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateType
     */

    public Update withType(UpdateType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A key-value map that contains the parameters associated with the update.
     * </p>
     * 
     * @return A key-value map that contains the parameters associated with the update.
     */

    public java.util.List<UpdateParam> getParams() {
        return params;
    }

    /**
     * <p>
     * A key-value map that contains the parameters associated with the update.
     * </p>
     * 
     * @param params
     *        A key-value map that contains the parameters associated with the update.
     */

    public void setParams(java.util.Collection<UpdateParam> params) {
        if (params == null) {
            this.params = null;
            return;
        }

        this.params = new java.util.ArrayList<UpdateParam>(params);
    }

    /**
     * <p>
     * A key-value map that contains the parameters associated with the update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParams(java.util.Collection)} or {@link #withParams(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param params
     *        A key-value map that contains the parameters associated with the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update withParams(UpdateParam... params) {
        if (this.params == null) {
            setParams(new java.util.ArrayList<UpdateParam>(params.length));
        }
        for (UpdateParam ele : params) {
            this.params.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A key-value map that contains the parameters associated with the update.
     * </p>
     * 
     * @param params
     *        A key-value map that contains the parameters associated with the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update withParams(java.util.Collection<UpdateParam> params) {
        setParams(params);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the update was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the update was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the update was created.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the update was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the update was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the update was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Any errors associated with a <code>Failed</code> update.
     * </p>
     * 
     * @return Any errors associated with a <code>Failed</code> update.
     */

    public java.util.List<ErrorDetail> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Any errors associated with a <code>Failed</code> update.
     * </p>
     * 
     * @param errors
     *        Any errors associated with a <code>Failed</code> update.
     */

    public void setErrors(java.util.Collection<ErrorDetail> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<ErrorDetail>(errors);
    }

    /**
     * <p>
     * Any errors associated with a <code>Failed</code> update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Any errors associated with a <code>Failed</code> update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update withErrors(ErrorDetail... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<ErrorDetail>(errors.length));
        }
        for (ErrorDetail ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any errors associated with a <code>Failed</code> update.
     * </p>
     * 
     * @param errors
     *        Any errors associated with a <code>Failed</code> update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Update withErrors(java.util.Collection<ErrorDetail> errors) {
        setErrors(errors);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getParams() != null)
            sb.append("Params: ").append(getParams()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Update == false)
            return false;
        Update other = (Update) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getParams() == null ^ this.getParams() == null)
            return false;
        if (other.getParams() != null && other.getParams().equals(this.getParams()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getParams() == null) ? 0 : getParams().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public Update clone() {
        try {
            return (Update) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.UpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
