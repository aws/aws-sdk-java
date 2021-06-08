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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/SendProjectSessionAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendProjectSessionActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A message indicating the result of performing the action.
     * </p>
     */
    private String result;
    /**
     * <p>
     * The name of the project that was affected by the action.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A unique identifier for the action that was performed.
     * </p>
     */
    private Integer actionId;

    /**
     * <p>
     * A message indicating the result of performing the action.
     * </p>
     * 
     * @param result
     *        A message indicating the result of performing the action.
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * <p>
     * A message indicating the result of performing the action.
     * </p>
     * 
     * @return A message indicating the result of performing the action.
     */

    public String getResult() {
        return this.result;
    }

    /**
     * <p>
     * A message indicating the result of performing the action.
     * </p>
     * 
     * @param result
     *        A message indicating the result of performing the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendProjectSessionActionResult withResult(String result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * The name of the project that was affected by the action.
     * </p>
     * 
     * @param name
     *        The name of the project that was affected by the action.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the project that was affected by the action.
     * </p>
     * 
     * @return The name of the project that was affected by the action.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the project that was affected by the action.
     * </p>
     * 
     * @param name
     *        The name of the project that was affected by the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendProjectSessionActionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the action that was performed.
     * </p>
     * 
     * @param actionId
     *        A unique identifier for the action that was performed.
     */

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * A unique identifier for the action that was performed.
     * </p>
     * 
     * @return A unique identifier for the action that was performed.
     */

    public Integer getActionId() {
        return this.actionId;
    }

    /**
     * <p>
     * A unique identifier for the action that was performed.
     * </p>
     * 
     * @param actionId
     *        A unique identifier for the action that was performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendProjectSessionActionResult withActionId(Integer actionId) {
        setActionId(actionId);
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
        if (getResult() != null)
            sb.append("Result: ").append(getResult()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getActionId() != null)
            sb.append("ActionId: ").append(getActionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendProjectSessionActionResult == false)
            return false;
        SendProjectSessionActionResult other = (SendProjectSessionActionResult) obj;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        return hashCode;
    }

    @Override
    public SendProjectSessionActionResult clone() {
        try {
            return (SendProjectSessionActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
