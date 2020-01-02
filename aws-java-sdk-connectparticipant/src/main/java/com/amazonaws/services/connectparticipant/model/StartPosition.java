/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filtering option for where to start. For example, if you sent 100 messages, start with message 50.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/StartPosition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartPosition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the message or event where to start.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The time in ISO format where to start.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     */
    private String absoluteTime;
    /**
     * <p>
     * The start position of the most recent message where you want to start.
     * </p>
     */
    private Integer mostRecent;

    /**
     * <p>
     * The ID of the message or event where to start.
     * </p>
     * 
     * @param id
     *        The ID of the message or event where to start.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the message or event where to start.
     * </p>
     * 
     * @return The ID of the message or event where to start.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the message or event where to start.
     * </p>
     * 
     * @param id
     *        The ID of the message or event where to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPosition withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The time in ISO format where to start.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     * 
     * @param absoluteTime
     *        The time in ISO format where to start.</p>
     *        <p>
     *        It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     */

    public void setAbsoluteTime(String absoluteTime) {
        this.absoluteTime = absoluteTime;
    }

    /**
     * <p>
     * The time in ISO format where to start.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     * 
     * @return The time in ISO format where to start.</p>
     *         <p>
     *         It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     */

    public String getAbsoluteTime() {
        return this.absoluteTime;
    }

    /**
     * <p>
     * The time in ISO format where to start.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * </p>
     * 
     * @param absoluteTime
     *        The time in ISO format where to start.</p>
     *        <p>
     *        It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPosition withAbsoluteTime(String absoluteTime) {
        setAbsoluteTime(absoluteTime);
        return this;
    }

    /**
     * <p>
     * The start position of the most recent message where you want to start.
     * </p>
     * 
     * @param mostRecent
     *        The start position of the most recent message where you want to start.
     */

    public void setMostRecent(Integer mostRecent) {
        this.mostRecent = mostRecent;
    }

    /**
     * <p>
     * The start position of the most recent message where you want to start.
     * </p>
     * 
     * @return The start position of the most recent message where you want to start.
     */

    public Integer getMostRecent() {
        return this.mostRecent;
    }

    /**
     * <p>
     * The start position of the most recent message where you want to start.
     * </p>
     * 
     * @param mostRecent
     *        The start position of the most recent message where you want to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPosition withMostRecent(Integer mostRecent) {
        setMostRecent(mostRecent);
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
        if (getAbsoluteTime() != null)
            sb.append("AbsoluteTime: ").append(getAbsoluteTime()).append(",");
        if (getMostRecent() != null)
            sb.append("MostRecent: ").append(getMostRecent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartPosition == false)
            return false;
        StartPosition other = (StartPosition) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAbsoluteTime() == null ^ this.getAbsoluteTime() == null)
            return false;
        if (other.getAbsoluteTime() != null && other.getAbsoluteTime().equals(this.getAbsoluteTime()) == false)
            return false;
        if (other.getMostRecent() == null ^ this.getMostRecent() == null)
            return false;
        if (other.getMostRecent() != null && other.getMostRecent().equals(this.getMostRecent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getAbsoluteTime() == null) ? 0 : getAbsoluteTime().hashCode());
        hashCode = prime * hashCode + ((getMostRecent() == null) ? 0 : getMostRecent().hashCode());
        return hashCode;
    }

    @Override
    public StartPosition clone() {
        try {
            return (StartPosition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectparticipant.model.transform.StartPositionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
