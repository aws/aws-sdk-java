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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteV2LoggingLevelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of resource for which you are configuring logging. Must be <code>THING_Group</code>.
     * </p>
     */
    private String targetType;
    /**
     * <p>
     * The name of the resource for which you are configuring logging.
     * </p>
     */
    private String targetName;

    /**
     * <p>
     * The type of resource for which you are configuring logging. Must be <code>THING_Group</code>.
     * </p>
     * 
     * @param targetType
     *        The type of resource for which you are configuring logging. Must be <code>THING_Group</code>.
     * @see LogTargetType
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The type of resource for which you are configuring logging. Must be <code>THING_Group</code>.
     * </p>
     * 
     * @return The type of resource for which you are configuring logging. Must be <code>THING_Group</code>.
     * @see LogTargetType
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The type of resource for which you are configuring logging. Must be <code>THING_Group</code>.
     * </p>
     * 
     * @param targetType
     *        The type of resource for which you are configuring logging. Must be <code>THING_Group</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogTargetType
     */

    public DeleteV2LoggingLevelRequest withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The type of resource for which you are configuring logging. Must be <code>THING_Group</code>.
     * </p>
     * 
     * @param targetType
     *        The type of resource for which you are configuring logging. Must be <code>THING_Group</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogTargetType
     */

    public DeleteV2LoggingLevelRequest withTargetType(LogTargetType targetType) {
        this.targetType = targetType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the resource for which you are configuring logging.
     * </p>
     * 
     * @param targetName
     *        The name of the resource for which you are configuring logging.
     */

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * <p>
     * The name of the resource for which you are configuring logging.
     * </p>
     * 
     * @return The name of the resource for which you are configuring logging.
     */

    public String getTargetName() {
        return this.targetName;
    }

    /**
     * <p>
     * The name of the resource for which you are configuring logging.
     * </p>
     * 
     * @param targetName
     *        The name of the resource for which you are configuring logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteV2LoggingLevelRequest withTargetName(String targetName) {
        setTargetName(targetName);
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
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType()).append(",");
        if (getTargetName() != null)
            sb.append("TargetName: ").append(getTargetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteV2LoggingLevelRequest == false)
            return false;
        DeleteV2LoggingLevelRequest other = (DeleteV2LoggingLevelRequest) obj;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getTargetName() == null ^ this.getTargetName() == null)
            return false;
        if (other.getTargetName() != null && other.getTargetName().equals(this.getTargetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getTargetName() == null) ? 0 : getTargetName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteV2LoggingLevelRequest clone() {
        return (DeleteV2LoggingLevelRequest) super.clone();
    }

}
