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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information for the retriever used for your Amazon Q Business application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/Retriever" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Retriever implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the Amazon Q Business application using the retriever.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the retriever used by your Amazon Q Business application.
     * </p>
     */
    private String retrieverId;
    /**
     * <p>
     * The type of your retriever.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The status of your retriever.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name of your retriever.
     * </p>
     */
    private String displayName;

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

    public Retriever withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the retriever used by your Amazon Q Business application.
     * </p>
     * 
     * @param retrieverId
     *        The identifier of the retriever used by your Amazon Q Business application.
     */

    public void setRetrieverId(String retrieverId) {
        this.retrieverId = retrieverId;
    }

    /**
     * <p>
     * The identifier of the retriever used by your Amazon Q Business application.
     * </p>
     * 
     * @return The identifier of the retriever used by your Amazon Q Business application.
     */

    public String getRetrieverId() {
        return this.retrieverId;
    }

    /**
     * <p>
     * The identifier of the retriever used by your Amazon Q Business application.
     * </p>
     * 
     * @param retrieverId
     *        The identifier of the retriever used by your Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Retriever withRetrieverId(String retrieverId) {
        setRetrieverId(retrieverId);
        return this;
    }

    /**
     * <p>
     * The type of your retriever.
     * </p>
     * 
     * @param type
     *        The type of your retriever.
     * @see RetrieverType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of your retriever.
     * </p>
     * 
     * @return The type of your retriever.
     * @see RetrieverType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of your retriever.
     * </p>
     * 
     * @param type
     *        The type of your retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrieverType
     */

    public Retriever withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of your retriever.
     * </p>
     * 
     * @param type
     *        The type of your retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrieverType
     */

    public Retriever withType(RetrieverType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The status of your retriever.
     * </p>
     * 
     * @param status
     *        The status of your retriever.
     * @see RetrieverStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of your retriever.
     * </p>
     * 
     * @return The status of your retriever.
     * @see RetrieverStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of your retriever.
     * </p>
     * 
     * @param status
     *        The status of your retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrieverStatus
     */

    public Retriever withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of your retriever.
     * </p>
     * 
     * @param status
     *        The status of your retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrieverStatus
     */

    public Retriever withStatus(RetrieverStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name of your retriever.
     * </p>
     * 
     * @param displayName
     *        The name of your retriever.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of your retriever.
     * </p>
     * 
     * @return The name of your retriever.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of your retriever.
     * </p>
     * 
     * @param displayName
     *        The name of your retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Retriever withDisplayName(String displayName) {
        setDisplayName(displayName);
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
            sb.append("RetrieverId: ").append(getRetrieverId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Retriever == false)
            return false;
        Retriever other = (Retriever) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getRetrieverId() == null ^ this.getRetrieverId() == null)
            return false;
        if (other.getRetrieverId() != null && other.getRetrieverId().equals(this.getRetrieverId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getRetrieverId() == null) ? 0 : getRetrieverId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public Retriever clone() {
        try {
            return (Retriever) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.RetrieverMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
