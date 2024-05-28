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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetMetadataTransferJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetadataTransferJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     */
    private String metadataTransferJobId;

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     * 
     * @param metadataTransferJobId
     *        The metadata transfer job Id.
     */

    public void setMetadataTransferJobId(String metadataTransferJobId) {
        this.metadataTransferJobId = metadataTransferJobId;
    }

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     * 
     * @return The metadata transfer job Id.
     */

    public String getMetadataTransferJobId() {
        return this.metadataTransferJobId;
    }

    /**
     * <p>
     * The metadata transfer job Id.
     * </p>
     * 
     * @param metadataTransferJobId
     *        The metadata transfer job Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetadataTransferJobRequest withMetadataTransferJobId(String metadataTransferJobId) {
        setMetadataTransferJobId(metadataTransferJobId);
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
        if (getMetadataTransferJobId() != null)
            sb.append("MetadataTransferJobId: ").append(getMetadataTransferJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetadataTransferJobRequest == false)
            return false;
        GetMetadataTransferJobRequest other = (GetMetadataTransferJobRequest) obj;
        if (other.getMetadataTransferJobId() == null ^ this.getMetadataTransferJobId() == null)
            return false;
        if (other.getMetadataTransferJobId() != null && other.getMetadataTransferJobId().equals(this.getMetadataTransferJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadataTransferJobId() == null) ? 0 : getMetadataTransferJobId().hashCode());
        return hashCode;
    }

    @Override
    public GetMetadataTransferJobRequest clone() {
        return (GetMetadataTransferJobRequest) super.clone();
    }

}
