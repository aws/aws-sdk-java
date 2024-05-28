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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDataLake" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataLakeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The created Security Lake configuration object.
     * </p>
     */
    private java.util.List<DataLakeResource> dataLakes;

    /**
     * <p>
     * The created Security Lake configuration object.
     * </p>
     * 
     * @return The created Security Lake configuration object.
     */

    public java.util.List<DataLakeResource> getDataLakes() {
        return dataLakes;
    }

    /**
     * <p>
     * The created Security Lake configuration object.
     * </p>
     * 
     * @param dataLakes
     *        The created Security Lake configuration object.
     */

    public void setDataLakes(java.util.Collection<DataLakeResource> dataLakes) {
        if (dataLakes == null) {
            this.dataLakes = null;
            return;
        }

        this.dataLakes = new java.util.ArrayList<DataLakeResource>(dataLakes);
    }

    /**
     * <p>
     * The created Security Lake configuration object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataLakes(java.util.Collection)} or {@link #withDataLakes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataLakes
     *        The created Security Lake configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataLakeResult withDataLakes(DataLakeResource... dataLakes) {
        if (this.dataLakes == null) {
            setDataLakes(new java.util.ArrayList<DataLakeResource>(dataLakes.length));
        }
        for (DataLakeResource ele : dataLakes) {
            this.dataLakes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The created Security Lake configuration object.
     * </p>
     * 
     * @param dataLakes
     *        The created Security Lake configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataLakeResult withDataLakes(java.util.Collection<DataLakeResource> dataLakes) {
        setDataLakes(dataLakes);
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
        if (getDataLakes() != null)
            sb.append("DataLakes: ").append(getDataLakes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataLakeResult == false)
            return false;
        CreateDataLakeResult other = (CreateDataLakeResult) obj;
        if (other.getDataLakes() == null ^ this.getDataLakes() == null)
            return false;
        if (other.getDataLakes() != null && other.getDataLakes().equals(this.getDataLakes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataLakes() == null) ? 0 : getDataLakes().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataLakeResult clone() {
        try {
            return (CreateDataLakeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
