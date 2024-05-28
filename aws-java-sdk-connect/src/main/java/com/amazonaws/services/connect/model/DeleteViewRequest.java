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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DeleteView" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteViewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the view. Both <code>ViewArn</code> and <code>ViewId</code> can be used.
     * </p>
     */
    private String viewId;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteViewRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the view. Both <code>ViewArn</code> and <code>ViewId</code> can be used.
     * </p>
     * 
     * @param viewId
     *        The identifier of the view. Both <code>ViewArn</code> and <code>ViewId</code> can be used.
     */

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    /**
     * <p>
     * The identifier of the view. Both <code>ViewArn</code> and <code>ViewId</code> can be used.
     * </p>
     * 
     * @return The identifier of the view. Both <code>ViewArn</code> and <code>ViewId</code> can be used.
     */

    public String getViewId() {
        return this.viewId;
    }

    /**
     * <p>
     * The identifier of the view. Both <code>ViewArn</code> and <code>ViewId</code> can be used.
     * </p>
     * 
     * @param viewId
     *        The identifier of the view. Both <code>ViewArn</code> and <code>ViewId</code> can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteViewRequest withViewId(String viewId) {
        setViewId(viewId);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getViewId() != null)
            sb.append("ViewId: ").append(getViewId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteViewRequest == false)
            return false;
        DeleteViewRequest other = (DeleteViewRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getViewId() == null ^ this.getViewId() == null)
            return false;
        if (other.getViewId() != null && other.getViewId().equals(this.getViewId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getViewId() == null) ? 0 : getViewId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteViewRequest clone() {
        return (DeleteViewRequest) super.clone();
    }

}
