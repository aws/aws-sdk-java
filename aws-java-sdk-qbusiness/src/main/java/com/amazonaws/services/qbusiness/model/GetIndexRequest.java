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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIndexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the index.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the Amazon Q Business index you want information on.
     * </p>
     */
    private String indexId;

    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the index.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application connected to the index.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the index.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application connected to the index.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application connected to the index.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application connected to the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business index you want information on.
     * </p>
     * 
     * @param indexId
     *        The identifier of the Amazon Q Business index you want information on.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business index you want information on.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business index you want information on.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business index you want information on.
     * </p>
     * 
     * @param indexId
     *        The identifier of the Amazon Q Business index you want information on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexRequest withIndexId(String indexId) {
        setIndexId(indexId);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIndexRequest == false)
            return false;
        GetIndexRequest other = (GetIndexRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        return hashCode;
    }

    @Override
    public GetIndexRequest clone() {
        return (GetIndexRequest) super.clone();
    }

}
