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
 * Summary of the data for an <code>AppInstance</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AppInstanceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppInstanceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>AppInstance</code> ARN.
     * </p>
     */
    private String appInstanceArn;
    /**
     * <p>
     * The name of the <code>AppInstance</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The metadata of the <code>AppInstance</code>.
     * </p>
     */
    private String metadata;

    /**
     * <p>
     * The <code>AppInstance</code> ARN.
     * </p>
     * 
     * @param appInstanceArn
     *        The <code>AppInstance</code> ARN.
     */

    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The <code>AppInstance</code> ARN.
     * </p>
     * 
     * @return The <code>AppInstance</code> ARN.
     */

    public String getAppInstanceArn() {
        return this.appInstanceArn;
    }

    /**
     * <p>
     * The <code>AppInstance</code> ARN.
     * </p>
     * 
     * @param appInstanceArn
     *        The <code>AppInstance</code> ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceSummary withAppInstanceArn(String appInstanceArn) {
        setAppInstanceArn(appInstanceArn);
        return this;
    }

    /**
     * <p>
     * The name of the <code>AppInstance</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>AppInstance</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>AppInstance</code>.
     * </p>
     * 
     * @return The name of the <code>AppInstance</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <code>AppInstance</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The metadata of the <code>AppInstance</code>.
     * </p>
     * 
     * @param metadata
     *        The metadata of the <code>AppInstance</code>.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata of the <code>AppInstance</code>.
     * </p>
     * 
     * @return The metadata of the <code>AppInstance</code>.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The metadata of the <code>AppInstance</code>.
     * </p>
     * 
     * @param metadata
     *        The metadata of the <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceSummary withMetadata(String metadata) {
        setMetadata(metadata);
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
            sb.append("Metadata: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppInstanceSummary == false)
            return false;
        AppInstanceSummary other = (AppInstanceSummary) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public AppInstanceSummary clone() {
        try {
            return (AppInstanceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.AppInstanceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
