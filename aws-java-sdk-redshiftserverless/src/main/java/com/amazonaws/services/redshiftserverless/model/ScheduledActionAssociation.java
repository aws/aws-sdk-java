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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains names of objects associated with a scheduled action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ScheduledActionAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledActionAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of associated Amazon Redshift Serverless namespace.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * Name of associated scheduled action.
     * </p>
     */
    private String scheduledActionName;

    /**
     * <p>
     * Name of associated Amazon Redshift Serverless namespace.
     * </p>
     * 
     * @param namespaceName
     *        Name of associated Amazon Redshift Serverless namespace.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * Name of associated Amazon Redshift Serverless namespace.
     * </p>
     * 
     * @return Name of associated Amazon Redshift Serverless namespace.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * Name of associated Amazon Redshift Serverless namespace.
     * </p>
     * 
     * @param namespaceName
     *        Name of associated Amazon Redshift Serverless namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionAssociation withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * Name of associated scheduled action.
     * </p>
     * 
     * @param scheduledActionName
     *        Name of associated scheduled action.
     */

    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    /**
     * <p>
     * Name of associated scheduled action.
     * </p>
     * 
     * @return Name of associated scheduled action.
     */

    public String getScheduledActionName() {
        return this.scheduledActionName;
    }

    /**
     * <p>
     * Name of associated scheduled action.
     * </p>
     * 
     * @param scheduledActionName
     *        Name of associated scheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionAssociation withScheduledActionName(String scheduledActionName) {
        setScheduledActionName(scheduledActionName);
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
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getScheduledActionName() != null)
            sb.append("ScheduledActionName: ").append(getScheduledActionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledActionAssociation == false)
            return false;
        ScheduledActionAssociation other = (ScheduledActionAssociation) obj;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getScheduledActionName() == null ^ this.getScheduledActionName() == null)
            return false;
        if (other.getScheduledActionName() != null && other.getScheduledActionName().equals(this.getScheduledActionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getScheduledActionName() == null) ? 0 : getScheduledActionName().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledActionAssociation clone() {
        try {
            return (ScheduledActionAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.ScheduledActionAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
