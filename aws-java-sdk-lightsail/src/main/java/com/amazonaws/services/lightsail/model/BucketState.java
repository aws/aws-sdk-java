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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the state of an Amazon Lightsail bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/BucketState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state code of the bucket.
     * </p>
     * <p>
     * The following codes are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OK</code> - The bucket is in a running state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code> - Creation of the bucket might have timed-out. You might want to delete the bucket and
     * create a new one.
     * </p>
     * </li>
     * </ul>
     */
    private String code;
    /**
     * <p>
     * A message that describes the state of the bucket.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The state code of the bucket.
     * </p>
     * <p>
     * The following codes are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OK</code> - The bucket is in a running state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code> - Creation of the bucket might have timed-out. You might want to delete the bucket and
     * create a new one.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The state code of the bucket.</p>
     *        <p>
     *        The following codes are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OK</code> - The bucket is in a running state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unknown</code> - Creation of the bucket might have timed-out. You might want to delete the bucket
     *        and create a new one.
     *        </p>
     *        </li>
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The state code of the bucket.
     * </p>
     * <p>
     * The following codes are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OK</code> - The bucket is in a running state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code> - Creation of the bucket might have timed-out. You might want to delete the bucket and
     * create a new one.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state code of the bucket.</p>
     *         <p>
     *         The following codes are possible:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>OK</code> - The bucket is in a running state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unknown</code> - Creation of the bucket might have timed-out. You might want to delete the bucket
     *         and create a new one.
     *         </p>
     *         </li>
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The state code of the bucket.
     * </p>
     * <p>
     * The following codes are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OK</code> - The bucket is in a running state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unknown</code> - Creation of the bucket might have timed-out. You might want to delete the bucket and
     * create a new one.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The state code of the bucket.</p>
     *        <p>
     *        The following codes are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OK</code> - The bucket is in a running state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unknown</code> - Creation of the bucket might have timed-out. You might want to delete the bucket
     *        and create a new one.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketState withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A message that describes the state of the bucket.
     * </p>
     * 
     * @param message
     *        A message that describes the state of the bucket.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message that describes the state of the bucket.
     * </p>
     * 
     * @return A message that describes the state of the bucket.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message that describes the state of the bucket.
     * </p>
     * 
     * @param message
     *        A message that describes the state of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketState withMessage(String message) {
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
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

        if (obj instanceof BucketState == false)
            return false;
        BucketState other = (BucketState) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
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

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public BucketState clone() {
        try {
            return (BucketState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.BucketStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
