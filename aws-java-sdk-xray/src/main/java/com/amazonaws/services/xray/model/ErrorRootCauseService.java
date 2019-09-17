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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of fields identifying the services in a trace summary error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/ErrorRootCauseService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorRootCauseService implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The service name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A collection of associated service names.
     * </p>
     */
    private java.util.List<String> names;
    /**
     * <p>
     * The type associated to the service.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The account ID associated to the service.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The path of root cause entities found on the service.
     * </p>
     */
    private java.util.List<ErrorRootCauseEntity> entityPath;
    /**
     * <p>
     * A Boolean value indicating if the service is inferred from the trace.
     * </p>
     */
    private Boolean inferred;

    /**
     * <p>
     * The service name.
     * </p>
     * 
     * @param name
     *        The service name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The service name.
     * </p>
     * 
     * @return The service name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The service name.
     * </p>
     * 
     * @param name
     *        The service name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorRootCauseService withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A collection of associated service names.
     * </p>
     * 
     * @return A collection of associated service names.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * A collection of associated service names.
     * </p>
     * 
     * @param names
     *        A collection of associated service names.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * A collection of associated service names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        A collection of associated service names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorRootCauseService withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of associated service names.
     * </p>
     * 
     * @param names
     *        A collection of associated service names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorRootCauseService withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * <p>
     * The type associated to the service.
     * </p>
     * 
     * @param type
     *        The type associated to the service.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type associated to the service.
     * </p>
     * 
     * @return The type associated to the service.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type associated to the service.
     * </p>
     * 
     * @param type
     *        The type associated to the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorRootCauseService withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The account ID associated to the service.
     * </p>
     * 
     * @param accountId
     *        The account ID associated to the service.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID associated to the service.
     * </p>
     * 
     * @return The account ID associated to the service.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID associated to the service.
     * </p>
     * 
     * @param accountId
     *        The account ID associated to the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorRootCauseService withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The path of root cause entities found on the service.
     * </p>
     * 
     * @return The path of root cause entities found on the service.
     */

    public java.util.List<ErrorRootCauseEntity> getEntityPath() {
        return entityPath;
    }

    /**
     * <p>
     * The path of root cause entities found on the service.
     * </p>
     * 
     * @param entityPath
     *        The path of root cause entities found on the service.
     */

    public void setEntityPath(java.util.Collection<ErrorRootCauseEntity> entityPath) {
        if (entityPath == null) {
            this.entityPath = null;
            return;
        }

        this.entityPath = new java.util.ArrayList<ErrorRootCauseEntity>(entityPath);
    }

    /**
     * <p>
     * The path of root cause entities found on the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityPath(java.util.Collection)} or {@link #withEntityPath(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityPath
     *        The path of root cause entities found on the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorRootCauseService withEntityPath(ErrorRootCauseEntity... entityPath) {
        if (this.entityPath == null) {
            setEntityPath(new java.util.ArrayList<ErrorRootCauseEntity>(entityPath.length));
        }
        for (ErrorRootCauseEntity ele : entityPath) {
            this.entityPath.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The path of root cause entities found on the service.
     * </p>
     * 
     * @param entityPath
     *        The path of root cause entities found on the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorRootCauseService withEntityPath(java.util.Collection<ErrorRootCauseEntity> entityPath) {
        setEntityPath(entityPath);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating if the service is inferred from the trace.
     * </p>
     * 
     * @param inferred
     *        A Boolean value indicating if the service is inferred from the trace.
     */

    public void setInferred(Boolean inferred) {
        this.inferred = inferred;
    }

    /**
     * <p>
     * A Boolean value indicating if the service is inferred from the trace.
     * </p>
     * 
     * @return A Boolean value indicating if the service is inferred from the trace.
     */

    public Boolean getInferred() {
        return this.inferred;
    }

    /**
     * <p>
     * A Boolean value indicating if the service is inferred from the trace.
     * </p>
     * 
     * @param inferred
     *        A Boolean value indicating if the service is inferred from the trace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorRootCauseService withInferred(Boolean inferred) {
        setInferred(inferred);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating if the service is inferred from the trace.
     * </p>
     * 
     * @return A Boolean value indicating if the service is inferred from the trace.
     */

    public Boolean isInferred() {
        return this.inferred;
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
        if (getNames() != null)
            sb.append("Names: ").append(getNames()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getEntityPath() != null)
            sb.append("EntityPath: ").append(getEntityPath()).append(",");
        if (getInferred() != null)
            sb.append("Inferred: ").append(getInferred());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorRootCauseService == false)
            return false;
        ErrorRootCauseService other = (ErrorRootCauseService) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getEntityPath() == null ^ this.getEntityPath() == null)
            return false;
        if (other.getEntityPath() != null && other.getEntityPath().equals(this.getEntityPath()) == false)
            return false;
        if (other.getInferred() == null ^ this.getInferred() == null)
            return false;
        if (other.getInferred() != null && other.getInferred().equals(this.getInferred()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getEntityPath() == null) ? 0 : getEntityPath().hashCode());
        hashCode = prime * hashCode + ((getInferred() == null) ? 0 : getInferred().hashCode());
        return hashCode;
    }

    @Override
    public ErrorRootCauseService clone() {
        try {
            return (ErrorRootCauseService) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.ErrorRootCauseServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
