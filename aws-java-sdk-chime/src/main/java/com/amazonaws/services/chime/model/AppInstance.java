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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an <code>AppInstance</code>, an instance of an Amazon Chime SDK messaging application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AppInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppInstance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the messaging instance.
     * </p>
     */
    private String appInstanceArn;
    /**
     * <p>
     * The name of an <code>AppInstance</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The metadata of an <code>AppInstance</code>.
     * </p>
     */
    private String metadata;
    /**
     * <p>
     * The time at which an <code>AppInstance</code> was created. In epoch milliseconds.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time an <code>AppInstance</code> was last updated. In epoch milliseconds.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;

    /**
     * <p>
     * The ARN of the messaging instance.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the messaging instance.
     */

    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the messaging instance.
     * </p>
     * 
     * @return The ARN of the messaging instance.
     */

    public String getAppInstanceArn() {
        return this.appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the messaging instance.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the messaging instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstance withAppInstanceArn(String appInstanceArn) {
        setAppInstanceArn(appInstanceArn);
        return this;
    }

    /**
     * <p>
     * The name of an <code>AppInstance</code>.
     * </p>
     * 
     * @param name
     *        The name of an <code>AppInstance</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an <code>AppInstance</code>.
     * </p>
     * 
     * @return The name of an <code>AppInstance</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of an <code>AppInstance</code>.
     * </p>
     * 
     * @param name
     *        The name of an <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstance withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The metadata of an <code>AppInstance</code>.
     * </p>
     * 
     * @param metadata
     *        The metadata of an <code>AppInstance</code>.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata of an <code>AppInstance</code>.
     * </p>
     * 
     * @return The metadata of an <code>AppInstance</code>.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The metadata of an <code>AppInstance</code>.
     * </p>
     * 
     * @param metadata
     *        The metadata of an <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstance withMetadata(String metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The time at which an <code>AppInstance</code> was created. In epoch milliseconds.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which an <code>AppInstance</code> was created. In epoch milliseconds.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which an <code>AppInstance</code> was created. In epoch milliseconds.
     * </p>
     * 
     * @return The time at which an <code>AppInstance</code> was created. In epoch milliseconds.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which an <code>AppInstance</code> was created. In epoch milliseconds.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which an <code>AppInstance</code> was created. In epoch milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstance withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time an <code>AppInstance</code> was last updated. In epoch milliseconds.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The time an <code>AppInstance</code> was last updated. In epoch milliseconds.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time an <code>AppInstance</code> was last updated. In epoch milliseconds.
     * </p>
     * 
     * @return The time an <code>AppInstance</code> was last updated. In epoch milliseconds.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time an <code>AppInstance</code> was last updated. In epoch milliseconds.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The time an <code>AppInstance</code> was last updated. In epoch milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstance withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
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
        if (getAppInstanceArn() != null)
            sb.append("AppInstanceArn: ").append(getAppInstanceArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append("***Sensitive Data Redacted***").append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppInstance == false)
            return false;
        AppInstance other = (AppInstance) obj;
        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public AppInstance clone() {
        try {
            return (AppInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.AppInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
