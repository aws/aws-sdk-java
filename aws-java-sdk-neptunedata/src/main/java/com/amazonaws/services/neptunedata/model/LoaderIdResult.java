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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a list of load IDs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/LoaderIdResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoaderIdResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of load IDs.
     * </p>
     */
    private java.util.List<String> loadIds;

    /**
     * <p>
     * A list of load IDs.
     * </p>
     * 
     * @return A list of load IDs.
     */

    public java.util.List<String> getLoadIds() {
        return loadIds;
    }

    /**
     * <p>
     * A list of load IDs.
     * </p>
     * 
     * @param loadIds
     *        A list of load IDs.
     */

    public void setLoadIds(java.util.Collection<String> loadIds) {
        if (loadIds == null) {
            this.loadIds = null;
            return;
        }

        this.loadIds = new java.util.ArrayList<String>(loadIds);
    }

    /**
     * <p>
     * A list of load IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadIds(java.util.Collection)} or {@link #withLoadIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param loadIds
     *        A list of load IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoaderIdResult withLoadIds(String... loadIds) {
        if (this.loadIds == null) {
            setLoadIds(new java.util.ArrayList<String>(loadIds.length));
        }
        for (String ele : loadIds) {
            this.loadIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of load IDs.
     * </p>
     * 
     * @param loadIds
     *        A list of load IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoaderIdResult withLoadIds(java.util.Collection<String> loadIds) {
        setLoadIds(loadIds);
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
        if (getLoadIds() != null)
            sb.append("LoadIds: ").append(getLoadIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoaderIdResult == false)
            return false;
        LoaderIdResult other = (LoaderIdResult) obj;
        if (other.getLoadIds() == null ^ this.getLoadIds() == null)
            return false;
        if (other.getLoadIds() != null && other.getLoadIds().equals(this.getLoadIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadIds() == null) ? 0 : getLoadIds().hashCode());
        return hashCode;
    }

    @Override
    public LoaderIdResult clone() {
        try {
            return (LoaderIdResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.LoaderIdResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
