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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about a logger
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/Logger" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Logger implements Serializable, Cloneable, StructuredPojo {

    /** The component that will be subject to logging. */
    private String component;
    /**
     * A descriptive or arbitrary ID for the logger. This value must be unique within the logger definition version. Max
     * length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     */
    private String id;
    /** The level of the logs. */
    private String level;
    /** The amount of file space, in KB, to use if the local file system is used for logging purposes. */
    private Integer space;
    /** The type of log output which will be used. */
    private String type;

    /**
     * The component that will be subject to logging.
     * 
     * @param component
     *        The component that will be subject to logging.
     * @see LoggerComponent
     */

    public void setComponent(String component) {
        this.component = component;
    }

    /**
     * The component that will be subject to logging.
     * 
     * @return The component that will be subject to logging.
     * @see LoggerComponent
     */

    public String getComponent() {
        return this.component;
    }

    /**
     * The component that will be subject to logging.
     * 
     * @param component
     *        The component that will be subject to logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggerComponent
     */

    public Logger withComponent(String component) {
        setComponent(component);
        return this;
    }

    /**
     * The component that will be subject to logging.
     * 
     * @param component
     *        The component that will be subject to logging.
     * @see LoggerComponent
     */

    public void setComponent(LoggerComponent component) {
        withComponent(component);
    }

    /**
     * The component that will be subject to logging.
     * 
     * @param component
     *        The component that will be subject to logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggerComponent
     */

    public Logger withComponent(LoggerComponent component) {
        this.component = component.toString();
        return this;
    }

    /**
     * A descriptive or arbitrary ID for the logger. This value must be unique within the logger definition version. Max
     * length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * 
     * @param id
     *        A descriptive or arbitrary ID for the logger. This value must be unique within the logger definition
     *        version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A descriptive or arbitrary ID for the logger. This value must be unique within the logger definition version. Max
     * length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * 
     * @return A descriptive or arbitrary ID for the logger. This value must be unique within the logger definition
     *         version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     */

    public String getId() {
        return this.id;
    }

    /**
     * A descriptive or arbitrary ID for the logger. This value must be unique within the logger definition version. Max
     * length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * 
     * @param id
     *        A descriptive or arbitrary ID for the logger. This value must be unique within the logger definition
     *        version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Logger withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The level of the logs.
     * 
     * @param level
     *        The level of the logs.
     * @see LoggerLevel
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * The level of the logs.
     * 
     * @return The level of the logs.
     * @see LoggerLevel
     */

    public String getLevel() {
        return this.level;
    }

    /**
     * The level of the logs.
     * 
     * @param level
     *        The level of the logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggerLevel
     */

    public Logger withLevel(String level) {
        setLevel(level);
        return this;
    }

    /**
     * The level of the logs.
     * 
     * @param level
     *        The level of the logs.
     * @see LoggerLevel
     */

    public void setLevel(LoggerLevel level) {
        withLevel(level);
    }

    /**
     * The level of the logs.
     * 
     * @param level
     *        The level of the logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggerLevel
     */

    public Logger withLevel(LoggerLevel level) {
        this.level = level.toString();
        return this;
    }

    /**
     * The amount of file space, in KB, to use if the local file system is used for logging purposes.
     * 
     * @param space
     *        The amount of file space, in KB, to use if the local file system is used for logging purposes.
     */

    public void setSpace(Integer space) {
        this.space = space;
    }

    /**
     * The amount of file space, in KB, to use if the local file system is used for logging purposes.
     * 
     * @return The amount of file space, in KB, to use if the local file system is used for logging purposes.
     */

    public Integer getSpace() {
        return this.space;
    }

    /**
     * The amount of file space, in KB, to use if the local file system is used for logging purposes.
     * 
     * @param space
     *        The amount of file space, in KB, to use if the local file system is used for logging purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Logger withSpace(Integer space) {
        setSpace(space);
        return this;
    }

    /**
     * The type of log output which will be used.
     * 
     * @param type
     *        The type of log output which will be used.
     * @see LoggerType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * The type of log output which will be used.
     * 
     * @return The type of log output which will be used.
     * @see LoggerType
     */

    public String getType() {
        return this.type;
    }

    /**
     * The type of log output which will be used.
     * 
     * @param type
     *        The type of log output which will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggerType
     */

    public Logger withType(String type) {
        setType(type);
        return this;
    }

    /**
     * The type of log output which will be used.
     * 
     * @param type
     *        The type of log output which will be used.
     * @see LoggerType
     */

    public void setType(LoggerType type) {
        withType(type);
    }

    /**
     * The type of log output which will be used.
     * 
     * @param type
     *        The type of log output which will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggerType
     */

    public Logger withType(LoggerType type) {
        this.type = type.toString();
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
        if (getComponent() != null)
            sb.append("Component: ").append(getComponent()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLevel() != null)
            sb.append("Level: ").append(getLevel()).append(",");
        if (getSpace() != null)
            sb.append("Space: ").append(getSpace()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Logger == false)
            return false;
        Logger other = (Logger) obj;
        if (other.getComponent() == null ^ this.getComponent() == null)
            return false;
        if (other.getComponent() != null && other.getComponent().equals(this.getComponent()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        if (other.getSpace() == null ^ this.getSpace() == null)
            return false;
        if (other.getSpace() != null && other.getSpace().equals(this.getSpace()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponent() == null) ? 0 : getComponent().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        hashCode = prime * hashCode + ((getSpace() == null) ? 0 : getSpace().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Logger clone() {
        try {
            return (Logger) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.LoggerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
