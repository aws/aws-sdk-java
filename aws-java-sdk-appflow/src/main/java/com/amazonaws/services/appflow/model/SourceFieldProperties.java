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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties that can be applied to a field when the connector is being used as a source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SourceFieldProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceFieldProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the field can be returned in a search result.
     * </p>
     */
    private Boolean isRetrievable;
    /**
     * <p>
     * Indicates if the field can be queried.
     * </p>
     */
    private Boolean isQueryable;

    /**
     * <p>
     * Indicates whether the field can be returned in a search result.
     * </p>
     * 
     * @param isRetrievable
     *        Indicates whether the field can be returned in a search result.
     */

    public void setIsRetrievable(Boolean isRetrievable) {
        this.isRetrievable = isRetrievable;
    }

    /**
     * <p>
     * Indicates whether the field can be returned in a search result.
     * </p>
     * 
     * @return Indicates whether the field can be returned in a search result.
     */

    public Boolean getIsRetrievable() {
        return this.isRetrievable;
    }

    /**
     * <p>
     * Indicates whether the field can be returned in a search result.
     * </p>
     * 
     * @param isRetrievable
     *        Indicates whether the field can be returned in a search result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceFieldProperties withIsRetrievable(Boolean isRetrievable) {
        setIsRetrievable(isRetrievable);
        return this;
    }

    /**
     * <p>
     * Indicates whether the field can be returned in a search result.
     * </p>
     * 
     * @return Indicates whether the field can be returned in a search result.
     */

    public Boolean isRetrievable() {
        return this.isRetrievable;
    }

    /**
     * <p>
     * Indicates if the field can be queried.
     * </p>
     * 
     * @param isQueryable
     *        Indicates if the field can be queried.
     */

    public void setIsQueryable(Boolean isQueryable) {
        this.isQueryable = isQueryable;
    }

    /**
     * <p>
     * Indicates if the field can be queried.
     * </p>
     * 
     * @return Indicates if the field can be queried.
     */

    public Boolean getIsQueryable() {
        return this.isQueryable;
    }

    /**
     * <p>
     * Indicates if the field can be queried.
     * </p>
     * 
     * @param isQueryable
     *        Indicates if the field can be queried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceFieldProperties withIsQueryable(Boolean isQueryable) {
        setIsQueryable(isQueryable);
        return this;
    }

    /**
     * <p>
     * Indicates if the field can be queried.
     * </p>
     * 
     * @return Indicates if the field can be queried.
     */

    public Boolean isQueryable() {
        return this.isQueryable;
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
        if (getIsRetrievable() != null)
            sb.append("IsRetrievable: ").append(getIsRetrievable()).append(",");
        if (getIsQueryable() != null)
            sb.append("IsQueryable: ").append(getIsQueryable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceFieldProperties == false)
            return false;
        SourceFieldProperties other = (SourceFieldProperties) obj;
        if (other.getIsRetrievable() == null ^ this.getIsRetrievable() == null)
            return false;
        if (other.getIsRetrievable() != null && other.getIsRetrievable().equals(this.getIsRetrievable()) == false)
            return false;
        if (other.getIsQueryable() == null ^ this.getIsQueryable() == null)
            return false;
        if (other.getIsQueryable() != null && other.getIsQueryable().equals(this.getIsQueryable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsRetrievable() == null) ? 0 : getIsRetrievable().hashCode());
        hashCode = prime * hashCode + ((getIsQueryable() == null) ? 0 : getIsQueryable().hashCode());
        return hashCode;
    }

    @Override
    public SourceFieldProperties clone() {
        try {
            return (SourceFieldProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.SourceFieldPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
