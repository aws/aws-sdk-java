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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteDataProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDataProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the data provider to delete.
     * </p>
     */
    private String dataProviderIdentifier;

    /**
     * <p>
     * The identifier of the data provider to delete.
     * </p>
     * 
     * @param dataProviderIdentifier
     *        The identifier of the data provider to delete.
     */

    public void setDataProviderIdentifier(String dataProviderIdentifier) {
        this.dataProviderIdentifier = dataProviderIdentifier;
    }

    /**
     * <p>
     * The identifier of the data provider to delete.
     * </p>
     * 
     * @return The identifier of the data provider to delete.
     */

    public String getDataProviderIdentifier() {
        return this.dataProviderIdentifier;
    }

    /**
     * <p>
     * The identifier of the data provider to delete.
     * </p>
     * 
     * @param dataProviderIdentifier
     *        The identifier of the data provider to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDataProviderRequest withDataProviderIdentifier(String dataProviderIdentifier) {
        setDataProviderIdentifier(dataProviderIdentifier);
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
        if (getDataProviderIdentifier() != null)
            sb.append("DataProviderIdentifier: ").append(getDataProviderIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDataProviderRequest == false)
            return false;
        DeleteDataProviderRequest other = (DeleteDataProviderRequest) obj;
        if (other.getDataProviderIdentifier() == null ^ this.getDataProviderIdentifier() == null)
            return false;
        if (other.getDataProviderIdentifier() != null && other.getDataProviderIdentifier().equals(this.getDataProviderIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataProviderIdentifier() == null) ? 0 : getDataProviderIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDataProviderRequest clone() {
        return (DeleteDataProviderRequest) super.clone();
    }

}
