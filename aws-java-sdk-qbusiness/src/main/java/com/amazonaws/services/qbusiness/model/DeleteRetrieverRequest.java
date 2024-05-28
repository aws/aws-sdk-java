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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteRetriever" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRetrieverRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business application using the retriever.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the retriever being deleted.
     * </p>
     */
    private String retrieverId;

    /**
     * <p>
     * The identifier of the Amazon Q Business application using the retriever.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application using the retriever.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application using the retriever.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application using the retriever.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application using the retriever.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application using the retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRetrieverRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the retriever being deleted.
     * </p>
     * 
     * @param retrieverId
     *        The identifier of the retriever being deleted.
     */

    public void setRetrieverId(String retrieverId) {
        this.retrieverId = retrieverId;
    }

    /**
     * <p>
     * The identifier of the retriever being deleted.
     * </p>
     * 
     * @return The identifier of the retriever being deleted.
     */

    public String getRetrieverId() {
        return this.retrieverId;
    }

    /**
     * <p>
     * The identifier of the retriever being deleted.
     * </p>
     * 
     * @param retrieverId
     *        The identifier of the retriever being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRetrieverRequest withRetrieverId(String retrieverId) {
        setRetrieverId(retrieverId);
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
        if (getRetrieverId() != null)
            sb.append("RetrieverId: ").append(getRetrieverId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRetrieverRequest == false)
            return false;
        DeleteRetrieverRequest other = (DeleteRetrieverRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getRetrieverId() == null ^ this.getRetrieverId() == null)
            return false;
        if (other.getRetrieverId() != null && other.getRetrieverId().equals(this.getRetrieverId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getRetrieverId() == null) ? 0 : getRetrieverId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRetrieverRequest clone() {
        return (DeleteRetrieverRequest) super.clone();
    }

}
