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
package com.amazonaws.services.appfabric.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/GetIngestion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIngestionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains information about an ingestion.
     * </p>
     */
    private Ingestion ingestion;

    /**
     * <p>
     * Contains information about an ingestion.
     * </p>
     * 
     * @param ingestion
     *        Contains information about an ingestion.
     */

    public void setIngestion(Ingestion ingestion) {
        this.ingestion = ingestion;
    }

    /**
     * <p>
     * Contains information about an ingestion.
     * </p>
     * 
     * @return Contains information about an ingestion.
     */

    public Ingestion getIngestion() {
        return this.ingestion;
    }

    /**
     * <p>
     * Contains information about an ingestion.
     * </p>
     * 
     * @param ingestion
     *        Contains information about an ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIngestionResult withIngestion(Ingestion ingestion) {
        setIngestion(ingestion);
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
        if (getIngestion() != null)
            sb.append("Ingestion: ").append(getIngestion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIngestionResult == false)
            return false;
        GetIngestionResult other = (GetIngestionResult) obj;
        if (other.getIngestion() == null ^ this.getIngestion() == null)
            return false;
        if (other.getIngestion() != null && other.getIngestion().equals(this.getIngestion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIngestion() == null) ? 0 : getIngestion().hashCode());
        return hashCode;
    }

    @Override
    public GetIngestionResult clone() {
        try {
            return (GetIngestionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
