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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The specification of an output context that is set when an intent is fulfilled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/OutputContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the context.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The number of seconds that the context should be active after it is first sent in a <code>PostContent</code> or
     * <code>PostText</code> response. You can set the value between 5 and 86,400 seconds (24 hours).
     * </p>
     */
    private Integer timeToLiveInSeconds;
    /**
     * <p>
     * The number of conversation turns that the context should be active. A conversation turn is one
     * <code>PostContent</code> or <code>PostText</code> request and the corresponding response from Amazon Lex.
     * </p>
     */
    private Integer turnsToLive;

    /**
     * <p>
     * The name of the context.
     * </p>
     * 
     * @param name
     *        The name of the context.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the context.
     * </p>
     * 
     * @return The name of the context.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the context.
     * </p>
     * 
     * @param name
     *        The name of the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputContext withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The number of seconds that the context should be active after it is first sent in a <code>PostContent</code> or
     * <code>PostText</code> response. You can set the value between 5 and 86,400 seconds (24 hours).
     * </p>
     * 
     * @param timeToLiveInSeconds
     *        The number of seconds that the context should be active after it is first sent in a
     *        <code>PostContent</code> or <code>PostText</code> response. You can set the value between 5 and 86,400
     *        seconds (24 hours).
     */

    public void setTimeToLiveInSeconds(Integer timeToLiveInSeconds) {
        this.timeToLiveInSeconds = timeToLiveInSeconds;
    }

    /**
     * <p>
     * The number of seconds that the context should be active after it is first sent in a <code>PostContent</code> or
     * <code>PostText</code> response. You can set the value between 5 and 86,400 seconds (24 hours).
     * </p>
     * 
     * @return The number of seconds that the context should be active after it is first sent in a
     *         <code>PostContent</code> or <code>PostText</code> response. You can set the value between 5 and 86,400
     *         seconds (24 hours).
     */

    public Integer getTimeToLiveInSeconds() {
        return this.timeToLiveInSeconds;
    }

    /**
     * <p>
     * The number of seconds that the context should be active after it is first sent in a <code>PostContent</code> or
     * <code>PostText</code> response. You can set the value between 5 and 86,400 seconds (24 hours).
     * </p>
     * 
     * @param timeToLiveInSeconds
     *        The number of seconds that the context should be active after it is first sent in a
     *        <code>PostContent</code> or <code>PostText</code> response. You can set the value between 5 and 86,400
     *        seconds (24 hours).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputContext withTimeToLiveInSeconds(Integer timeToLiveInSeconds) {
        setTimeToLiveInSeconds(timeToLiveInSeconds);
        return this;
    }

    /**
     * <p>
     * The number of conversation turns that the context should be active. A conversation turn is one
     * <code>PostContent</code> or <code>PostText</code> request and the corresponding response from Amazon Lex.
     * </p>
     * 
     * @param turnsToLive
     *        The number of conversation turns that the context should be active. A conversation turn is one
     *        <code>PostContent</code> or <code>PostText</code> request and the corresponding response from Amazon Lex.
     */

    public void setTurnsToLive(Integer turnsToLive) {
        this.turnsToLive = turnsToLive;
    }

    /**
     * <p>
     * The number of conversation turns that the context should be active. A conversation turn is one
     * <code>PostContent</code> or <code>PostText</code> request and the corresponding response from Amazon Lex.
     * </p>
     * 
     * @return The number of conversation turns that the context should be active. A conversation turn is one
     *         <code>PostContent</code> or <code>PostText</code> request and the corresponding response from Amazon Lex.
     */

    public Integer getTurnsToLive() {
        return this.turnsToLive;
    }

    /**
     * <p>
     * The number of conversation turns that the context should be active. A conversation turn is one
     * <code>PostContent</code> or <code>PostText</code> request and the corresponding response from Amazon Lex.
     * </p>
     * 
     * @param turnsToLive
     *        The number of conversation turns that the context should be active. A conversation turn is one
     *        <code>PostContent</code> or <code>PostText</code> request and the corresponding response from Amazon Lex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputContext withTurnsToLive(Integer turnsToLive) {
        setTurnsToLive(turnsToLive);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTimeToLiveInSeconds() != null)
            sb.append("TimeToLiveInSeconds: ").append(getTimeToLiveInSeconds()).append(",");
        if (getTurnsToLive() != null)
            sb.append("TurnsToLive: ").append(getTurnsToLive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputContext == false)
            return false;
        OutputContext other = (OutputContext) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTimeToLiveInSeconds() == null ^ this.getTimeToLiveInSeconds() == null)
            return false;
        if (other.getTimeToLiveInSeconds() != null && other.getTimeToLiveInSeconds().equals(this.getTimeToLiveInSeconds()) == false)
            return false;
        if (other.getTurnsToLive() == null ^ this.getTurnsToLive() == null)
            return false;
        if (other.getTurnsToLive() != null && other.getTurnsToLive().equals(this.getTurnsToLive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTimeToLiveInSeconds() == null) ? 0 : getTimeToLiveInSeconds().hashCode());
        hashCode = prime * hashCode + ((getTurnsToLive() == null) ? 0 : getTurnsToLive().hashCode());
        return hashCode;
    }

    @Override
    public OutputContext clone() {
        try {
            return (OutputContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.OutputContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
