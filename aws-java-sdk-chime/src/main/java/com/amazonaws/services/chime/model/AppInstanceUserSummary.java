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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The app instance user summary data .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AppInstanceUserSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppInstanceUserSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the app instance user.
     * </p>
     */
    private String appInstanceUserArn;
    /**
     * <p>
     * The name in an app instance user summary.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The metadata in an app instance user summary.
     * </p>
     */
    private String metadata;

    /**
     * <p>
     * The ARN of the app instance user.
     * </p>
     * 
     * @param appInstanceUserArn
     *        The ARN of the app instance user.
     */

    public void setAppInstanceUserArn(String appInstanceUserArn) {
        this.appInstanceUserArn = appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the app instance user.
     * </p>
     * 
     * @return The ARN of the app instance user.
     */

    public String getAppInstanceUserArn() {
        return this.appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the app instance user.
     * </p>
     * 
     * @param appInstanceUserArn
     *        The ARN of the app instance user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceUserSummary withAppInstanceUserArn(String appInstanceUserArn) {
        setAppInstanceUserArn(appInstanceUserArn);
        return this;
    }

    /**
     * <p>
     * The name in an app instance user summary.
     * </p>
     * 
     * @param name
     *        The name in an app instance user summary.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name in an app instance user summary.
     * </p>
     * 
     * @return The name in an app instance user summary.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name in an app instance user summary.
     * </p>
     * 
     * @param name
     *        The name in an app instance user summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceUserSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The metadata in an app instance user summary.
     * </p>
     * 
     * @param metadata
     *        The metadata in an app instance user summary.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata in an app instance user summary.
     * </p>
     * 
     * @return The metadata in an app instance user summary.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The metadata in an app instance user summary.
     * </p>
     * 
     * @param metadata
     *        The metadata in an app instance user summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceUserSummary withMetadata(String metadata) {
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
        if (getAppInstanceUserArn() != null)
            sb.append("AppInstanceUserArn: ").append(getAppInstanceUserArn()).append(",");
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

        if (obj instanceof AppInstanceUserSummary == false)
            return false;
        AppInstanceUserSummary other = (AppInstanceUserSummary) obj;
        if (other.getAppInstanceUserArn() == null ^ this.getAppInstanceUserArn() == null)
            return false;
        if (other.getAppInstanceUserArn() != null && other.getAppInstanceUserArn().equals(this.getAppInstanceUserArn()) == false)
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

        hashCode = prime * hashCode + ((getAppInstanceUserArn() == null) ? 0 : getAppInstanceUserArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public AppInstanceUserSummary clone() {
        try {
            return (AppInstanceUserSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.AppInstanceUserSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
