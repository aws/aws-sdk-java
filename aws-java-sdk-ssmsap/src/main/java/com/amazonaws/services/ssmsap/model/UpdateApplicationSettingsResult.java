/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/UpdateApplicationSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** <p/> */
    private String message;
    /** <p/> */
    private java.util.List<String> operationIds;

    /**
     * <p/>
     * 
     * @param message
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p/>
     * 
     * @param message
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<String> getOperationIds() {
        return operationIds;
    }

    /**
     * <p/>
     * 
     * @param operationIds
     */

    public void setOperationIds(java.util.Collection<String> operationIds) {
        if (operationIds == null) {
            this.operationIds = null;
            return;
        }

        this.operationIds = new java.util.ArrayList<String>(operationIds);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperationIds(java.util.Collection)} or {@link #withOperationIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param operationIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsResult withOperationIds(String... operationIds) {
        if (this.operationIds == null) {
            setOperationIds(new java.util.ArrayList<String>(operationIds.length));
        }
        for (String ele : operationIds) {
            this.operationIds.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param operationIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationSettingsResult withOperationIds(java.util.Collection<String> operationIds) {
        setOperationIds(operationIds);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getOperationIds() != null)
            sb.append("OperationIds: ").append(getOperationIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationSettingsResult == false)
            return false;
        UpdateApplicationSettingsResult other = (UpdateApplicationSettingsResult) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getOperationIds() == null ^ this.getOperationIds() == null)
            return false;
        if (other.getOperationIds() != null && other.getOperationIds().equals(this.getOperationIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getOperationIds() == null) ? 0 : getOperationIds().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationSettingsResult clone() {
        try {
            return (UpdateApplicationSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
