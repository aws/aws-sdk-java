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
package com.amazonaws.services.cloud9.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironmentStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the environment. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connecting</code>: The environment is connecting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>: The environment is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The environment is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error</code>: The environment is in an error state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ready</code>: The environment is ready.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopped</code>: The environment is stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopping</code>: The environment is stopping.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Any informational message about the status of the environment.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The status of the environment. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connecting</code>: The environment is connecting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>: The environment is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The environment is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error</code>: The environment is in an error state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ready</code>: The environment is ready.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopped</code>: The environment is stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopping</code>: The environment is stopping.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the environment. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>connecting</code>: The environment is connecting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>creating</code>: The environment is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The environment is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>error</code>: The environment is in an error state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ready</code>: The environment is ready.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stopped</code>: The environment is stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stopping</code>: The environment is stopping.
     *        </p>
     *        </li>
     * @see EnvironmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the environment. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connecting</code>: The environment is connecting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>: The environment is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The environment is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error</code>: The environment is in an error state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ready</code>: The environment is ready.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopped</code>: The environment is stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopping</code>: The environment is stopping.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the environment. Available values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>connecting</code>: The environment is connecting.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>creating</code>: The environment is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: The environment is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>error</code>: The environment is in an error state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ready</code>: The environment is ready.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>stopped</code>: The environment is stopped.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>stopping</code>: The environment is stopping.
     *         </p>
     *         </li>
     * @see EnvironmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the environment. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connecting</code>: The environment is connecting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>: The environment is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The environment is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error</code>: The environment is in an error state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ready</code>: The environment is ready.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopped</code>: The environment is stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopping</code>: The environment is stopping.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the environment. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>connecting</code>: The environment is connecting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>creating</code>: The environment is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The environment is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>error</code>: The environment is in an error state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ready</code>: The environment is ready.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stopped</code>: The environment is stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stopping</code>: The environment is stopping.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public DescribeEnvironmentStatusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the environment. Available values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>connecting</code>: The environment is connecting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>: The environment is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The environment is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>error</code>: The environment is in an error state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ready</code>: The environment is ready.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopped</code>: The environment is stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopping</code>: The environment is stopping.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the environment. Available values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>connecting</code>: The environment is connecting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>creating</code>: The environment is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The environment is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>error</code>: The environment is in an error state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ready</code>: The environment is ready.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stopped</code>: The environment is stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stopping</code>: The environment is stopping.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public DescribeEnvironmentStatusResult withStatus(EnvironmentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Any informational message about the status of the environment.
     * </p>
     * 
     * @param message
     *        Any informational message about the status of the environment.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Any informational message about the status of the environment.
     * </p>
     * 
     * @return Any informational message about the status of the environment.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Any informational message about the status of the environment.
     * </p>
     * 
     * @param message
     *        Any informational message about the status of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentStatusResult withMessage(String message) {
        setMessage(message);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEnvironmentStatusResult == false)
            return false;
        DescribeEnvironmentStatusResult other = (DescribeEnvironmentStatusResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEnvironmentStatusResult clone() {
        try {
            return (DescribeEnvironmentStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
